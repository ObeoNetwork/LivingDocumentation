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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

import com.google.common.base.CaseFormat;

import fr.obeo.intent.specification.Feature;
import fr.obeo.intent.specification.NamedElement;
import fr.obeo.intent.specification.Scenario;
import fr.obeo.intent.specification.Specification;
import fr.obeo.intent.specification.Story;
import fr.obeo.intent.specification.TestGenerationNote;
import fr.obeo.intent.specification.TestType;

/**
 * Provides some utilities on specification models.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public final class SpecificationUtils {

	/**
	 * Utilities classes do not provide default constructor.
	 */
	private SpecificationUtils() {
		// Nothing to do
	}

	/**
	 * Get the uri of the test file associated to a named element.
	 * 
	 * @param namedElement
	 *            Named element
	 * @return URI of the corresponding test file
	 */
	public static URI getTestURI(final NamedElement namedElement,
			final TestType type, Specification specification) {
		URI uri = URI.createURI("org.obeonetwork.dsl.uml2.design.tests/"
				+ getPackagePath(namedElement, type, specification), true);

		return uri;
	}

	private static String getPackagePath(NamedElement namedElement,
			TestType type, Specification specification) {
		String path = "src/" + getBasePackage(specification) + type.getName();
		if (namedElement instanceof Story) {
			path += "/stories/" + getCamelCaseName(namedElement)
					+ Character.toUpperCase(type.getName().charAt(0))
					+ type.getName().substring(1) + "Tests";
		} else if (namedElement instanceof Scenario) {
			path += "/stories/"
					+ ((Story) namedElement.eContainer()).getName()
							.replaceAll(" ", "").toLowerCase() + "/"
					+ getCamelCaseName(namedElement);
		} else if (namedElement instanceof Feature) {
			path += "/features/" + getCamelCaseName(namedElement)
					+ Character.toUpperCase(type.getName().charAt(0))
					+ type.getName().substring(1) + "Tests";
		}
		path += ".java";
		return path;
	}

	private static String getBasePackage(Specification specification) {
		return specification.getAutomationLayer().getBasePackage()
				.replace(".", "/")
				+ "/";
	}

	private static String getCamelCaseName(NamedElement namedElement) {
		String name = namedElement.getName().replaceAll(" ", "_");
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
	}

	public static Set<TestType> getTestTypes(NamedElement namedElement) {
		Set<TestType> types = new HashSet<TestType>();
		if (namedElement instanceof Feature) {
			for (Story story : ((Feature) namedElement).getStories()) {
				for (Scenario scenario : story.getScenarios()) {
					if (scenario.getNotes() != null
							&& scenario.getNotes().size() > 0) {
						types.add(((TestGenerationNote) scenario.getNotes()
								.get(0)).getType());
					}
				}
			}
		} else if (namedElement instanceof Story) {
			for (Scenario scenario : ((Story) namedElement).getScenarios()) {
				if (scenario.getNotes() != null
						&& scenario.getNotes().size() > 0) {
					types.add(((TestGenerationNote) scenario.getNotes().get(0))
							.getType());
				}
			}

		} else if (namedElement instanceof Scenario) {
			if (namedElement.getNotes() != null
					&& namedElement.getNotes().size() > 0) {
				types.add(((TestGenerationNote) namedElement.getNotes().get(0))
						.getType());
			}
		}
		return types;
	}
}
