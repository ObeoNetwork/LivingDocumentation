/*****************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *****************************************************************************/
package fr.obeo.intent.specification.parser;

import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;

import fr.obeo.intent.specification.Action;
import fr.obeo.intent.specification.AutomationLayer;
import fr.obeo.intent.specification.Behaviour;
import fr.obeo.intent.specification.Benefit;
import fr.obeo.intent.specification.Capability;
import fr.obeo.intent.specification.Context;
import fr.obeo.intent.specification.Feature;
import fr.obeo.intent.specification.NamedElement;
import fr.obeo.intent.specification.Parameter;
import fr.obeo.intent.specification.Role;
import fr.obeo.intent.specification.Scenario;
import fr.obeo.intent.specification.ScenarioElement;
import fr.obeo.intent.specification.Specification;
import fr.obeo.intent.specification.SpecificationFactory;
import fr.obeo.intent.specification.Story;
import fr.obeo.intent.specification.TestGenerationNote;
import fr.obeo.intent.specification.TestType;
import fr.obeo.intent.specification.Value;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.mylyn.docs.intent.collab.common.query.ModelingUnitQuery;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ExternalContentReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitFactory;
import org.eclipse.mylyn.docs.intent.external.parser.contribution.ExternalParserCompletionProposal;
import org.eclipse.mylyn.docs.intent.external.parser.contribution.IExternalParser;

/**
 * This parser is able to parse the specification syntax and create the
 * corresponding specification model.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public class SpecificationParser implements IExternalParser {
	private static final String VARIABLE = "$";

	private static final String AROBASE = "@";

	/**
	 * Comma.
	 */
	private static final String COMMA = ",";

	/**
	 * Closed bracket.
	 */
	private static final String CLOSE_BRACKET = "]";

	/**
	 * Opened bracket.
	 */
	private static final String OPEN_BRACKET = "[";

	/**
	 * Colon.
	 */
	private static final String COLON = ":";

	/**
	 * Specification factory.
	 */
	private SpecificationFactory specificationFactory = SpecificationFactory.eINSTANCE;

	/**
	 * Specification.
	 */
	private Specification specification;

	/**
	 * Automation layer.
	 */
	private AutomationLayer automationLayer;

	/**
	 * List of parsed elements.
	 */
	private List<ParsedElement> parsedElements = Lists.newArrayList();

	/**
	 * Resource set.
	 */
	private ResourceSet resourceSet;

	/**
	 * Specification resource.
	 */
	private Resource resource;

	/**
	 * Specification parser keywords.
	 */
	private enum SpecificationKeyword {
		FEATURE("Feature"), STORY("Story"), AS("As"), I_WANT("I want"), SO_THAT(
				"So that"), SCENARIO("Scenario"), GIVEN("Given"), WHEN("When"), THEN(
				"Then");

		/**
		 * Value.
		 */
		protected String value;

		/**
		 * Default constructor.
		 * 
		 * @param value
		 *            Value
		 */
		private SpecificationKeyword(String value) {
			this.value = value;
		}
	}

	/**
	 * Default constructor.
	 */
	public SpecificationParser() {
		resourceSet = new ResourceSetImpl();
		init();
	}

	@Override
	public void parse(IntentSection intentSection, String descriptionUnitToParse) {
		// Only parse sections with a title
		if (intentSection.getTitle() != null) {
			// Get valid elements
			StringBuffer validElements = new StringBuffer();
			for (String element : Splitter.onPattern("\r?\n").trimResults()
					.omitEmptyStrings().split(descriptionUnitToParse)) {
				if (isValidElement(element)) {
					validElements.append(element + "\n");
				}
			}

			// Parse features
			parseFeatures(intentSection, validElements);

			// Parse stories
			parseStories(intentSection, validElements);

			// Parse scenarios
			parseScenarios(intentSection, validElements);
		}
	}

	/**
	 * Parse the stories.
	 * 
	 * @param intentSection
	 *            Intent Section
	 * @param validElements
	 *            Valid elements
	 */
	private void parseStories(final IntentSection intentSection,
			final StringBuffer validElements) {
		// Get valid stories
		StringBuffer validStories = new StringBuffer();
		for (String element : Splitter.onPattern("\r?\n").trimResults()
				.omitEmptyStrings().split(validElements)) {
			if (isStory(element)) {
				validStories.append(element + "\n");
			}
		}

		// "Story:"
		final String storyPattern = SpecificationKeyword.STORY.value + COLON;
		for (String description : Splitter.onPattern(storyPattern)
				.trimResults().omitEmptyStrings().split(validStories)) {
			Map<String, String> result = Splitter.onPattern("\r?\n")
					.trimResults().omitEmptyStrings()
					.withKeyValueSeparator(COLON)
					.split(storyPattern + description);
			String storyDescription = result
					.get(SpecificationKeyword.STORY.value);

			final String storyName = storyDescription.substring(0,
					storyDescription.indexOf(OPEN_BRACKET)).trim();

			NamedElement namedElement = getNamedElement(storyName, Story.class);
			Story story = null;
			if (namedElement == null) {
				story = specificationFactory.createStory();
				story.setName(storyName);
				specification.getStories().add((Story) story);
				parsedElements.add(new ParsedElement(intentSection, story));
			} else if (namedElement instanceof Story) {
				story = (Story) namedElement;
			} else {
				throw new UnsupportedOperationException();
			}

			String features = storyDescription.substring(
					storyDescription.indexOf(OPEN_BRACKET) + 1,
					storyDescription.indexOf(CLOSE_BRACKET));
			for (String featureName : Splitter.on(COMMA).trimResults()
					.omitEmptyStrings().split(features)) {
				namedElement = getNamedElement(featureName, Feature.class);
				Feature feature = null;
				if (namedElement == null) {
					feature = specificationFactory.createFeature();
					feature.setName(featureName);
					specification.getFeatures().add(feature);
					parsedElements
							.add(new ParsedElement(intentSection, feature));
				} else if (namedElement instanceof Feature) {
					feature = (Feature) namedElement;
				} else {
					throw new UnsupportedOperationException();
				}
				feature.getStories().add((Story) story);
			}

			if (result.containsKey(SpecificationKeyword.AS.value)) {
				String roleName = result.get(SpecificationKeyword.AS.value)
						.trim();
				namedElement = getNamedElement(roleName, Role.class);
				Role role = null;
				if (namedElement == null) {
					role = specificationFactory.createRole();
					role.setName(roleName);
					specification.getRoles().add(role);
				} else if (namedElement instanceof Role) {
					role = (Role) namedElement;
				} else {
					throw new UnsupportedOperationException();
				}
				story.setAs(role);

				String capabilityName = result.get(
						SpecificationKeyword.I_WANT.value).trim();
				namedElement = getNamedElement(capabilityName, Capability.class);
				Capability capability = null;
				if (namedElement == null) {
					capability = specificationFactory.createCapability();
					capability.setName(capabilityName);
					specification.getCapabilities().add(capability);
				} else if (namedElement instanceof Capability) {
					capability = (Capability) namedElement;
				} else {
					throw new UnsupportedOperationException();
				}
				story.setIWant(capability);

				String benefitName = result.get(
						SpecificationKeyword.SO_THAT.value).trim();
				namedElement = getNamedElement(benefitName, Benefit.class);
				Benefit benefit = null;
				if (namedElement == null) {
					benefit = specificationFactory.createBenefit();
					benefit.setName(benefitName);
					specification.getBenefits().add(benefit);
				} else if (namedElement instanceof Benefit) {
					benefit = (Benefit) namedElement;
				} else {
					throw new UnsupportedOperationException();
				}
				story.setSoThat(benefit);
			}
		}
	}

	private void parseScenarios(IntentSection intentSection,
			StringBuffer validElements) {
		// Get valid scenarios
		StringBuffer validScenarios = new StringBuffer();
		for (String element : Splitter.onPattern("\r?\n").trimResults()
				.omitEmptyStrings().split(validElements)) {
			if (isScenario(element)) {
				validScenarios.append(element + "\n");
			}
		}

		// "Scenario:"
		final String scenarioPattern = SpecificationKeyword.SCENARIO.value
				+ COLON;
		for (String description : Splitter.onPattern(scenarioPattern)
				.trimResults().omitEmptyStrings().split(validScenarios)) {
			Iterable<String> results = Splitter.onPattern("\r?\n")
					.trimResults().omitEmptyStrings()
					.split(scenarioPattern + description);
			Scenario scenario = null;
			for (String result : results) {
				if (result.startsWith(SpecificationKeyword.SCENARIO.value)) {
					String scenarioDescription = Splitter
							.on(SpecificationKeyword.SCENARIO.value + COLON)
							.trimResults().omitEmptyStrings().split(result)
							.iterator().next();
					// Scenario: Name [Parent Story]
					final String scenarioName = scenarioDescription.substring(
							0, scenarioDescription.indexOf(OPEN_BRACKET))
							.trim();

					NamedElement namedElement = getNamedElement(scenarioName,
							Scenario.class);
					if (namedElement == null) {
						scenario = specificationFactory.createScenario();
						scenario.setName(scenarioName);
						parsedElements.add(new ParsedElement(intentSection,
								scenario));
					} else if (namedElement instanceof Scenario) {
						scenario = (Scenario) namedElement;
					} else {
						throw new UnsupportedOperationException();
					}

					// Scenario: Name [Parent Story] @ui
					TestGenerationNote testNote = specificationFactory
							.createTestGenerationNote();
					scenario.getNotes().add(testNote);
					if (scenarioDescription.contains(AROBASE)) {
						final String scenarioTestType = scenarioDescription
								.substring(scenarioDescription.indexOf(AROBASE));
						if (scenarioTestType.contains(TestType.UI.getName()
								.toLowerCase())) {
							testNote.setType(TestType.UI);
						} else if (scenarioTestType.contains(TestType.UNIT
								.getName().toLowerCase())) {
							testNote.setType(TestType.UNIT);
						} else if (scenarioTestType.contains(TestType.PLUGIN
								.getName().toLowerCase())) {
							testNote.setType(TestType.PLUGIN);
						}
					}

					String stories = scenarioDescription.substring(
							scenarioDescription.indexOf(OPEN_BRACKET) + 1,
							scenarioDescription.indexOf(CLOSE_BRACKET));
					for (String storyName : Splitter.on(COMMA).trimResults()
							.omitEmptyStrings().split(stories)) {
						namedElement = getNamedElement(storyName, Story.class);
						Story story = null;
						if (namedElement == null) {
							story = specificationFactory.createStory();
							story.setName(storyName);
							specification.getStories().add(story);
							parsedElements.add(new ParsedElement(intentSection,
									story));
						} else if (namedElement instanceof Story) {
							story = (Story) namedElement;
						} else {
							throw new UnsupportedOperationException();
						}
						story.getScenarios().add(scenario);
					}
				} else if (result.startsWith(SpecificationKeyword.GIVEN.value)) {
					String contextName = null;
					if (result.contains(VARIABLE)) {
						contextName = Splitter
								.on(SpecificationKeyword.GIVEN.value + COLON)
								.trimResults()
								.omitEmptyStrings()
								.split(result.substring(0,
										result.indexOf(VARIABLE))).iterator()
								.next();
					} else {
						// Given: MyContext [ParentContext]
						if (result.contains(OPEN_BRACKET)) {
							contextName = Splitter
									.on(SpecificationKeyword.GIVEN.value
											+ COLON)
									.trimResults()
									.omitEmptyStrings()
									.split(result.substring(0,
											result.indexOf(OPEN_BRACKET)))
									.iterator().next();
						} else {
							// Given: MyContext
							contextName = Splitter
									.on(SpecificationKeyword.GIVEN.value
											+ COLON).trimResults()
									.omitEmptyStrings().split(result)
									.iterator().next();
						}
					}

					Context parentContext = null;
					// Given: MyContext [ParentContext]
					if (result.contains(OPEN_BRACKET)
							&& result.contains(CLOSE_BRACKET)) {
						String parentContextName = result.substring(
								result.indexOf(OPEN_BRACKET) + 1,
								result.indexOf(CLOSE_BRACKET));
						NamedElement namedElement = getNamedElement(
								parentContextName, Context.class);
						if (namedElement == null) {
							parentContext = specificationFactory
									.createContext();
							parentContext.setName(parentContextName);
							automationLayer.getContext().add(parentContext);
						} else if (namedElement instanceof Context) {
							parentContext = (Context) namedElement;
						}
					}

					NamedElement namedElement = getNamedElement(contextName,
							Context.class);
					Context context = null;
					if (namedElement == null) {
						context = specificationFactory.createContext();
						context.setName(contextName);
						if (parentContext != null) {
							context.getContexts().add(parentContext);
						}
						automationLayer.getContext().add(context);

					} else if (namedElement instanceof Context) {
						context = (Context) namedElement;
					} else {
						throw new UnsupportedOperationException();
					}

					parseParameters(result, context, scenario);
					scenario.getGiven().add(context);
				} else if (result.startsWith(SpecificationKeyword.WHEN.value)) {
					String actionName = null;
					if (result.contains(VARIABLE)) {
						actionName = Splitter
								.on(SpecificationKeyword.WHEN.value + COLON)
								.trimResults()
								.omitEmptyStrings()
								.split(result.substring(0,
										result.indexOf(VARIABLE))).iterator()
								.next();
					} else {
						actionName = Splitter
								.on(SpecificationKeyword.WHEN.value + COLON)
								.trimResults().omitEmptyStrings().split(result)
								.iterator().next();
					}
					NamedElement namedElement = getNamedElement(actionName,
							Action.class);
					Action action = null;
					if (namedElement == null) {
						action = specificationFactory.createAction();
						action.setName(actionName);
						automationLayer.getActions().add(action);
					} else if (namedElement instanceof Action) {
						action = (Action) namedElement;
					} else {
						throw new UnsupportedOperationException();
					}
					parseParameters(result, action, scenario);

					scenario.getWhen().add(action);
				} else if (result.startsWith(SpecificationKeyword.THEN.value)) {

					String behaviourName = null;
					if (result.contains(VARIABLE)) {
						behaviourName = Splitter
								.on(SpecificationKeyword.THEN.value + COLON)
								.trimResults()
								.omitEmptyStrings()
								.split(result.substring(0,
										result.indexOf(VARIABLE))).iterator()
								.next();
					} else {
						behaviourName = Splitter
								.on(SpecificationKeyword.THEN.value + COLON)
								.trimResults().omitEmptyStrings().split(result)
								.iterator().next();
					}
					NamedElement namedElement = getNamedElement(behaviourName,
							Behaviour.class);
					Behaviour behaviour = null;
					if (namedElement == null) {
						behaviour = specificationFactory.createBehaviour();
						behaviour.setName(behaviourName);
						automationLayer.getBehaviours().add(behaviour);
					} else if (namedElement instanceof Behaviour) {
						behaviour = (Behaviour) namedElement;
					} else {
						throw new UnsupportedOperationException();
					}
					parseParameters(result, behaviour, scenario);
					scenario.getThen().add(behaviour);
				}
			}
		}
	}

	/**
	 * Parse the parameters.
	 * 
	 * @param description
	 *            Description to parse
	 * @param element
	 *            Parent scenario element
	 * @param scenario
	 */
	private void parseParameters(String description, ScenarioElement element,
			Scenario scenario) {
		// Given: Action $Variable1 $Variable2
		if (description.contains(VARIABLE)) {
			Iterable<String> params = Splitter.on(VARIABLE).omitEmptyStrings()
					.split(description);
			// Ignore the first value as it is the action name
			Iterator<String> iter = params.iterator();
			iter.next();

			int count = 0;
			for (Iterator<String> iterator = iter; iterator.hasNext();) {
				String param = (String) iterator.next();
				String parameterName = element.getName() + count;
				Parameter parameter = getParameter(parameterName, element);
				if (parameter == null) {
					parameter = specificationFactory.createParameter();
					parameter.setName(parameterName);
					element.getParameters().add(parameter);
				}
				Value value = specificationFactory.createValue();
				value.setValue(param.substring(param.indexOf("'") + 1,
						param.lastIndexOf("'")).replaceAll("\\\\", ""));
				value.setParameter(parameter);
				scenario.getValues().add(value);
				count++;
			}
		}
	}
	private Parameter getParameter(final String parameterName,
			final ScenarioElement element) {
		UnmodifiableIterator<Parameter> it = Iterators.filter(element
				.getParameters().iterator(), new Predicate<Parameter>() {
			public boolean apply(Parameter parameter) {
				if (parameter != null && parameter instanceof Parameter) {
					return parameterName.equals(((NamedElement) parameter)
							.getName());
				}
				return false;
			}
		});
		if (it.hasNext()) {
			return (Parameter) it.next();
		}
		return null;
	}

	/**
	 * Text to parse : "Feature: MyFeature1
	 * [ReferencedFeature1,ReferencedFeature2] Feature: MyFeature2
	 * [ReferencedFeature2,ReferencedFeature3]"
	 * 
	 * @param intentSection
	 * @param validElements
	 * @return
	 */
	private void parseFeatures(IntentSection intentSection,
			StringBuffer validElements) {
		// Get valid features
		StringBuffer validFeatures = new StringBuffer();
		for (String element : Splitter.onPattern("\r?\n").trimResults()
				.omitEmptyStrings().split(validElements)) {
			if (isFeature(element)) {
				validFeatures.append(element + "\n");
			}
		}

		// "Feature:"
		final String featurePattern = SpecificationKeyword.FEATURE.value
				+ COLON;

		for (String description : Splitter.onPattern(featurePattern)
				.trimResults().omitEmptyStrings().split(validFeatures)) {
			Map<String, String> result = Splitter.onPattern("\r?\n")
					.trimResults().omitEmptyStrings()
					.withKeyValueSeparator(COLON)
					.split(featurePattern + description);
			String featureDescription = result
					.get(SpecificationKeyword.FEATURE.value);
			String featureName;
			if (featureDescription.contains(OPEN_BRACKET)) {
				featureName = featureDescription.substring(0,
						featureDescription.indexOf(OPEN_BRACKET)).trim();
			} else {
				featureName = featureDescription;
			}
			NamedElement namedElement = getNamedElement(featureName,
					Feature.class);
			Feature feature = null;
			if (namedElement == null) {
				feature = specificationFactory.createFeature();
				feature.setName(featureName);
				specification.getFeatures().add((Feature) feature);
				parsedElements.add(new ParsedElement(intentSection, feature));
			} else if (namedElement instanceof Feature) {
				feature = (Feature) namedElement;
			} else {
				throw new UnsupportedOperationException();
			}

			if (featureDescription.contains(OPEN_BRACKET)) {
				String features = featureDescription.substring(
						featureDescription.indexOf(OPEN_BRACKET) + 1,
						featureDescription.indexOf(CLOSE_BRACKET));
				for (String refFeatureName : Splitter.on(COMMA).trimResults()
						.omitEmptyStrings().split(features)) {
					namedElement = getNamedElement(refFeatureName,
							Feature.class);
					Feature refFeature = null;
					if (namedElement == null) {
						refFeature = specificationFactory.createFeature();
						refFeature.setName(refFeatureName);
						specification.getFeatures().add(refFeature);
						parsedElements.add(new ParsedElement(intentSection,
								refFeature));
					} else if (namedElement instanceof Feature) {
						refFeature = (Feature) namedElement;
					} else {
						throw new UnsupportedOperationException();
					}
					refFeature.getRefFeatures().add((Feature) feature);
				}
			}
		}
	}

	/**
	 * Check if an element is a feature.
	 * 
	 * @param element
	 *            Element
	 * @return True if the element is a feature
	 */
	private boolean isFeature(String element) {
		return element.startsWith(SpecificationKeyword.FEATURE.value);
	}

	/**
	 * Check if an element is a story.
	 * 
	 * @param element
	 *            Element
	 * @return True if the element is a story
	 */
	private boolean isStory(String element) {
		return element.startsWith(SpecificationKeyword.STORY.value)
				|| element.startsWith(SpecificationKeyword.AS.value)
				|| element.startsWith(SpecificationKeyword.I_WANT.value)
				|| element.startsWith(SpecificationKeyword.SO_THAT.value);
	}

	/**
	 * Check if an element is a scenario.
	 * 
	 * @param element
	 *            Element
	 * @return True if the element is a scenario
	 */
	private boolean isScenario(String element) {
		return element.startsWith(SpecificationKeyword.SCENARIO.value)
				|| element.startsWith(SpecificationKeyword.GIVEN.value)
				|| element.startsWith(SpecificationKeyword.WHEN.value)
				|| element.startsWith(SpecificationKeyword.THEN.value);
	}

	/**
	 * Check if an element is a specification element (feature, story,
	 * scenario...).
	 * 
	 * @param element
	 *            Element
	 * @return True if the element is a specification element
	 */
	private boolean isValidElement(String element) {
		for (SpecificationKeyword keyword : SpecificationKeyword.class
				.getEnumConstants()) {
			if (element.startsWith(keyword.value + COLON)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Get a named element defined in the specification.
	 * 
	 * @param elementName
	 *            Name of the element to search
	 * @param type
	 *            Type of the element
	 * @return Named element or null if does not exist in the current
	 *         specification
	 */
	@SuppressWarnings("rawtypes")
	private NamedElement getNamedElement(final String elementName,
			final Class type) {
		UnmodifiableIterator<EObject> it = Iterators.filter(
				specification.eAllContents(), new Predicate<EObject>() {
					public boolean apply(EObject eObject) {
						if (eObject != null
								&& eObject instanceof NamedElement
								&& type.getSimpleName().equals(
										eObject.eClass().getName())) {
							return elementName.equals(((NamedElement) eObject)
									.getName());
						}
						return false;
					}
				});
		if (it.hasNext()) {
			return (NamedElement) it.next();
		}
		return null;
	}

	@Override
	public void init() {
		parsedElements.clear();
		specification = specificationFactory.createSpecification();
		specification.setName("UML Designer");
		automationLayer = specificationFactory.createAutomationLayer();
		automationLayer.setBasePackage("org.obeonetwork.dsl.uml2.design.tests");
		specification.setAutomationLayer(automationLayer);
	}
	@Override
	public void parsePostOperations(RepositoryAdapter repositoryAdapter) {
		for (ParsedElement parsedElement : parsedElements) {
			// Create a reference in the section if not exists
			ModelingUnitQuery query = new ModelingUnitQuery(repositoryAdapter);
			Collection<ExternalContentReference> externalContentReferences = query
					.getAllExternalContentReferences();

			NamedElement namedElement = parsedElement.getNamedElement();
			Set<TestType> testTypes = SpecificationUtils
					.getTestTypes(namedElement);
			for (TestType testType : testTypes) {
				if (!TestType.MANUAL.equals(testType)) {
					URI uri = SpecificationUtils.getTestURI(
							parsedElement.getNamedElement(), testType,
							specification);
					if (!referenceExists(externalContentReferences, uri)) {
						createReference(parsedElement.getIntentSection(), uri);
					}
				}
			}
		}

		// Serialize intent.specification
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("specification", new XMLResourceFactoryImpl());
		URI uri = URI.createURI(repositoryAdapter.getRepository()
				.getRepositoryURI() + "/intent.specification");
		try {
			if (resource != null) {
				resource.delete(null);
			}
		} catch (IOException e) {
			SpecificationParserActivator.log(Status.ERROR, "The resource "
					+ uri.devicePath() + "cannot be deleted", e);
		}
		resource = resourceSet.createResource(uri);
		resource.getContents().add(specification);
		try {
			resource.save(null);
		} catch (IOException e) {
			SpecificationParserActivator.log(Status.ERROR, "The resource "
					+ uri.devicePath() + "cannot be saved", e);
		}
	}

	/**
	 * Create a reference.
	 * 
	 * @param intentSection
	 *            Intent section
	 * @param uri
	 *            URI of the file to reference
	 */
	private void createReference(IntentSection intentSection, URI uri) {
		ModelingUnit modelingUnit = ModelingUnitFactory.eINSTANCE
				.createModelingUnit();
		ExternalContentReference referenceInstruction = ModelingUnitFactory.eINSTANCE
				.createExternalContentReference();
		referenceInstruction.setUri(uri);
		referenceInstruction.setMarkedAsMerged(true);

		modelingUnit.getInstructions().add(referenceInstruction);

		intentSection.getIntentContent().add(
				intentSection.getIntentContent().size(), modelingUnit);
	}

	/**
	 * Check if a reference exists in the given reference list.
	 * 
	 * @param externalContentReferences
	 *            Existing references
	 * @param uri
	 *            URI to check
	 * @return True if reference exists in the given list otherwise false
	 */
	private boolean referenceExists(
			final Collection<ExternalContentReference> externalContentReferences,
			final URI uri) {
		if (externalContentReferences.size() == 0) {
			return false;
		}
		for (ExternalContentReference externalContentReference : externalContentReferences) {
			if (uri.equals(externalContentReference.getUri())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ExternalParserCompletionProposal> getCompletionVariablesProposals(
			final Iterable<String> currentSentences) {
		// Get last written sentence
		Iterator<String> iterator = currentSentences.iterator();
		String currentSentence = null;
		while (iterator.hasNext()) {
			currentSentence = (String) iterator.next();
		}

		List<ExternalParserCompletionProposal> variables = Lists.newArrayList();
		if ((currentSentence.contains(SpecificationKeyword.FEATURE.value) || currentSentence
				.contains(SpecificationKeyword.STORY.value))
				&& currentSentence.contains(OPEN_BRACKET)) {
			// Feature: Name[Features] or Story: Name [Features]
			variables.addAll(getAllFeatures());
		} else if ((currentSentence
				.contains(SpecificationKeyword.SCENARIO.value))
				&& currentSentence.contains(CLOSE_BRACKET)) {
			// Scenario: Name[Stories]@
			variables.addAll(getAllTestTypes());
		} else if ((currentSentence
				.contains(SpecificationKeyword.SCENARIO.value))
				&& currentSentence.contains(OPEN_BRACKET)) {
			// Scenario: Name[Stories]
			variables.addAll(getAllStories());
		} else if (currentSentence.contains(SpecificationKeyword.AS.value)) {
			// As:
			variables.addAll(getAllRoles());
		} else if (currentSentence.contains(SpecificationKeyword.I_WANT.value)) {
			// I want:
			variables.addAll(getAllCapabilities());
		} else if (currentSentence.contains(SpecificationKeyword.SO_THAT.value)) {
			// So that:
			variables.addAll(getAllBenefits());
		} else if (currentSentence.contains(SpecificationKeyword.GIVEN.value)) {
			// Given:
			variables.addAll(getAllContexts());
		} else if (currentSentence.contains(SpecificationKeyword.WHEN.value)) {
			// When:
			variables.addAll(getAllActions());
		} else if (currentSentence.contains(SpecificationKeyword.THEN.value)) {
			// Then:
			variables.addAll(getAllBehaviours());
		}
		// Sorting proposals by alphabetical order
		Collections.sort(variables,
				new Comparator<ExternalParserCompletionProposal>() {

					@Override
					public int compare(
							final ExternalParserCompletionProposal o1,
							final ExternalParserCompletionProposal o2) {
						return CommonPlugin.INSTANCE.getComparator().compare(
								o1.getName(), o2.getName());
					}
				});
		return variables;
	}
	/**
	 * Get all the possible test types.
	 * 
	 * @return List of test types
	 */
	private List<ExternalParserCompletionProposal> getAllTestTypes() {
		List<ExternalParserCompletionProposal> types = Lists.newArrayList();
		types.add(new ExternalParserCompletionProposal(AROBASE
				+ TestType.UI.getName().toLowerCase(),
				"Define type of generated test", null,
				SpecificationParserActivator.getDefault().getImage(
						"icon/specification/TestGenerationNote.gif")));
		types.add(new ExternalParserCompletionProposal(AROBASE
				+ TestType.UNIT.getName().toLowerCase(),
				"Define type of generated test", null,
				SpecificationParserActivator.getDefault().getImage(
						"icon/specification/TestGenerationNote.gif")));
		types.add(new ExternalParserCompletionProposal(AROBASE
				+ TestType.PLUGIN.getName().toLowerCase(),
				"Define type of generated test", null,
				SpecificationParserActivator.getDefault().getImage(
						"icon/specification/TestGenerationNote.gif")));
		types.add(new ExternalParserCompletionProposal(AROBASE
				+ TestType.MANUAL.getName().toLowerCase(),
				"Define type of generated test", null,
				SpecificationParserActivator.getDefault().getImage(
						"icon/specification/TestGenerationNote.gif")));
		return types;
	}

	/**
	 * Get all roles defined in the specification.
	 * 
	 * @return All roles defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllRoles() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Role role : spec.getRoles()) {
			results.add(new ExternalParserCompletionProposal(role.getName(),
					Role.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Role.gif")));
		}

		return results;
	}

	/**
	 * Get all benefits defined in the specification.
	 * 
	 * @return All benefits defined in the specification or en empty list
	 */
	private List<ExternalParserCompletionProposal> getAllBenefits() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Benefit benefit : spec.getBenefits()) {
			results.add(new ExternalParserCompletionProposal(benefit.getName(),
					Benefit.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Benefit.gif")));
		}

		return results;
	}

	/**
	 * Get all capabilities defined in the specification.
	 * 
	 * @return All capabilities defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllCapabilities() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Capability capability : spec.getCapabilities()) {
			results.add(new ExternalParserCompletionProposal(capability
					.getName(), Capability.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Capability.gif")));
		}

		return results;
	}

	/**
	 * Get all contexts defined in the specification.
	 * 
	 * @return All contexts defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllContexts() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Context context : spec.getAutomationLayer().getContext()) {
			results.add(new ExternalParserCompletionProposal(context.getName(),
					Context.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Context.gif")));
		}

		return results;
	}

	/**
	 * Get all behaviours defined in the specification.
	 * 
	 * @return All behaviours defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllBehaviours() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Behaviour behaviour : spec.getAutomationLayer().getBehaviours()) {
			results.add(new ExternalParserCompletionProposal(behaviour
					.getName(), Behaviour.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Behaviour.gif")));
		}

		return results;
	}

	/**
	 * Get all actions defined in the specification.
	 * 
	 * @return All actions defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllActions() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Action action : spec.getAutomationLayer().getActions()) {
			results.add(new ExternalParserCompletionProposal(action.getName(),
					Action.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Action.gif")));
		}

		return results;
	}

	/**
	 * Get all features defined in the specification.
	 * 
	 * @return All features defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllFeatures() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Feature feature : spec.getFeatures()) {
			results.add(new ExternalParserCompletionProposal(feature.getName(),
					Feature.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Feature.gif")));
		}

		return results;
	}

	/**
	 * Get all stories defined in the specification.
	 * 
	 * @return All stories defined in the specification or an empty list
	 */
	private List<ExternalParserCompletionProposal> getAllStories() {
		Specification spec = (Specification) resource.getContents().get(0);
		List<ExternalParserCompletionProposal> results = Lists.newArrayList();
		for (Story story : spec.getStories()) {
			results.add(new ExternalParserCompletionProposal(story.getName(),
					Story.class.getSimpleName(), null,
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Story.gif")));
		}

		return results;
	}

	@Override
	public List<ExternalParserCompletionProposal> getCompletionTemplatesProposals(
			Iterable<String> currentSentences) {
		List<ExternalParserCompletionProposal> templates = Lists.newArrayList();
		Iterator<String> iterator = currentSentences.iterator();
		String currentSentence = null;
		while (iterator.hasNext()) {
			currentSentence = (String) iterator.next();
		}

		if (currentSentence
				.endsWith(SpecificationKeyword.FEATURE.value + COLON)) {
			// Feature:
			templates.add(new ExternalParserCompletionProposal("Feature",
					"Declare a new feature", " ${Name} [${ParentFeature}]",
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Feature.gif")));
		} else if (currentSentence.endsWith(SpecificationKeyword.STORY.value
				+ COLON)) {
			// Story:
			templates
					.add(new ExternalParserCompletionProposal(
							"Story",
							"Declare a new story",
							" ${Name} [${ReferencingFeature}]\n\tAs: ${Role}\n\tI want: ${Capability}\n\tSo that: ${Benefit}",
							SpecificationParserActivator.getDefault().getImage(
									"icon/specification/Story.gif")));
		} else {
			// Add all the possible templates
			templates.add(new ExternalParserCompletionProposal("Feature",
					"Declare a new feature",
					"Feature: ${Name} [${ParentFeature}]",
					SpecificationParserActivator.getDefault().getImage(
							"icon/specification/Feature.gif")));
			templates
					.add(new ExternalParserCompletionProposal(
							"Story",
							"Declare a new story",
							"Story: ${Name} [${ReferencingFeature}]\n\tAs: ${Role}\n\tI want: ${Capability}\n\tSo that: ${Benefit}",
							SpecificationParserActivator.getDefault().getImage(
									"icon/specification/Story.gif")));
			templates
					.add(new ExternalParserCompletionProposal(
							"Scenario",
							"Declare a new scenario",
							"Scenario: ${Name} [${ParentStory}]\n\tGiven: ${Context}\n\tWhen: ${Action}\n\tThen: ${Behaviour}",
							SpecificationParserActivator.getDefault().getImage(
									"icon/specification/Scenario.gif")));
		}
		return templates;
	}
}
