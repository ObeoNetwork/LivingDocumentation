/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see specification.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/specification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificationPackage eINSTANCE = specification.impl.SpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link specification.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.NamedElementImpl
	 * @see specification.impl.SpecificationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NOTES = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERENCES = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link specification.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.SpecificationImpl
	 * @see specification.impl.SpecificationPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Automation Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__AUTOMATION_LAYER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link specification.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.FeatureImpl
	 * @see specification.impl.SpecificationPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STORIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BENEFITS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link specification.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.RoleImpl
	 * @see specification.impl.SpecificationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specification.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.CapabilityImpl
	 * @see specification.impl.SpecificationPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specification.impl.BenefitImpl <em>Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.BenefitImpl
	 * @see specification.impl.SpecificationPackageImpl#getBenefit()
	 * @generated
	 */
	int BENEFIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The number of structural features of the '<em>Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specification.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.StoryImpl
	 * @see specification.impl.SpecificationPackageImpl#getStory()
	 * @generated
	 */
	int STORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__AS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>So That</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SO_THAT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SCENARIOS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IWant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__IWANT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link specification.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ScenarioImpl
	 * @see specification.impl.SpecificationPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Given</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GIVEN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__THEN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link specification.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ContextImpl
	 * @see specification.impl.SpecificationPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The meta object id for the '{@link specification.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ActionImpl
	 * @see specification.impl.SpecificationPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The meta object id for the '{@link specification.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.BehaviourImpl
	 * @see specification.impl.SpecificationPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 9;

	/**
	 * The meta object id for the '{@link specification.impl.AutomationLayerImpl <em>Automation Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.AutomationLayerImpl
	 * @see specification.impl.SpecificationPackageImpl#getAutomationLayer()
	 * @generated
	 */
	int AUTOMATION_LAYER = 10;

	/**
	 * The meta object id for the '{@link specification.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.NoteImpl
	 * @see specification.impl.SpecificationPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 12;

	/**
	 * The meta object id for the '{@link specification.impl.ImplementationNoteImpl <em>Implementation Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ImplementationNoteImpl
	 * @see specification.impl.SpecificationPackageImpl#getImplementationNote()
	 * @generated
	 */
	int IMPLEMENTATION_NOTE = 13;

	/**
	 * The meta object id for the '{@link specification.impl.TestNoteImpl <em>Test Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.TestNoteImpl
	 * @see specification.impl.SpecificationPackageImpl#getTestNote()
	 * @generated
	 */
	int TEST_NOTE = 14;

	/**
	 * The meta object id for the '{@link specification.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ParameterImpl
	 * @see specification.impl.SpecificationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NOTES = NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link specification.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specification.impl.ScenarioElementImpl
	 * @see specification.impl.SpecificationPackageImpl#getScenarioElement()
	 * @generated
	 */
	int SCENARIO_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__NOTES = PARAMETER__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__REFERENCES = PARAMETER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__PARAMETERS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NOTES = SCENARIO_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REFERENCES = SCENARIO_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TYPE = SCENARIO_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARAMETERS = SCENARIO_ELEMENT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NOTES = SCENARIO_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REFERENCES = SCENARIO_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = SCENARIO_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = SCENARIO_ELEMENT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NOTES = SCENARIO_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__REFERENCES = SCENARIO_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__TYPE = SCENARIO_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__PARAMETERS = SCENARIO_ELEMENT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_LAYER__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_LAYER__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_LAYER__BEHAVIOURS = 2;

	/**
	 * The number of structural features of the '<em>Automation Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_LAYER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_NOTE__DESCRIPTION = NOTE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Implementation Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NOTE__DESCRIPTION = NOTE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Test Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link specification.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see specification.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Specification#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see specification.Specification#getFeatures()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Specification#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see specification.Specification#getRoles()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link specification.Specification#getAutomationLayer <em>Automation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automation Layer</em>'.
	 * @see specification.Specification#getAutomationLayer()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_AutomationLayer();

	/**
	 * Returns the meta object for class '{@link specification.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see specification.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Feature#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stories</em>'.
	 * @see specification.Feature#getStories()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Stories();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Feature#getBenefits <em>Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefits</em>'.
	 * @see specification.Feature#getBenefits()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Benefits();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Feature#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see specification.Feature#getCapabilities()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Feature#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see specification.Feature#getFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Features();

	/**
	 * Returns the meta object for class '{@link specification.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see specification.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link specification.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see specification.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link specification.Benefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benefit</em>'.
	 * @see specification.Benefit
	 * @generated
	 */
	EClass getBenefit();

	/**
	 * Returns the meta object for class '{@link specification.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see specification.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the reference '{@link specification.Story#getAs <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>As</em>'.
	 * @see specification.Story#getAs()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_As();

	/**
	 * Returns the meta object for the reference '{@link specification.Story#getSoThat <em>So That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>So That</em>'.
	 * @see specification.Story#getSoThat()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_SoThat();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.Story#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see specification.Story#getScenarios()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link specification.Story#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see specification.Story#getTitle()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Title();

	/**
	 * Returns the meta object for the reference '{@link specification.Story#getIWant <em>IWant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IWant</em>'.
	 * @see specification.Story#getIWant()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_IWant();

	/**
	 * Returns the meta object for class '{@link specification.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see specification.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link specification.Scenario#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see specification.Scenario#getTitle()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Title();

	/**
	 * Returns the meta object for the reference list '{@link specification.Scenario#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Given</em>'.
	 * @see specification.Scenario#getGiven()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Given();

	/**
	 * Returns the meta object for the reference list '{@link specification.Scenario#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>When</em>'.
	 * @see specification.Scenario#getWhen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_When();

	/**
	 * Returns the meta object for the reference list '{@link specification.Scenario#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Then</em>'.
	 * @see specification.Scenario#getThen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Then();

	/**
	 * Returns the meta object for class '{@link specification.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see specification.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link specification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see specification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link specification.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see specification.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for class '{@link specification.AutomationLayer <em>Automation Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Layer</em>'.
	 * @see specification.AutomationLayer
	 * @generated
	 */
	EClass getAutomationLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.AutomationLayer#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see specification.AutomationLayer#getContext()
	 * @see #getAutomationLayer()
	 * @generated
	 */
	EReference getAutomationLayer_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.AutomationLayer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see specification.AutomationLayer#getActions()
	 * @see #getAutomationLayer()
	 * @generated
	 */
	EReference getAutomationLayer_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.AutomationLayer#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see specification.AutomationLayer#getBehaviours()
	 * @see #getAutomationLayer()
	 * @generated
	 */
	EReference getAutomationLayer_Behaviours();

	/**
	 * Returns the meta object for class '{@link specification.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see specification.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link specification.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specification.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link specification.NamedElement#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see specification.NamedElement#getNotes()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Notes();

	/**
	 * Returns the meta object for the reference list '{@link specification.NamedElement#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see specification.NamedElement#getReferences()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_References();

	/**
	 * Returns the meta object for class '{@link specification.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see specification.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link specification.Note#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see specification.Note#getDescription()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Description();

	/**
	 * Returns the meta object for class '{@link specification.ImplementationNote <em>Implementation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Note</em>'.
	 * @see specification.ImplementationNote
	 * @generated
	 */
	EClass getImplementationNote();

	/**
	 * Returns the meta object for class '{@link specification.TestNote <em>Test Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Note</em>'.
	 * @see specification.TestNote
	 * @generated
	 */
	EClass getTestNote();

	/**
	 * Returns the meta object for class '{@link specification.ScenarioElement <em>Scenario Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Element</em>'.
	 * @see specification.ScenarioElement
	 * @generated
	 */
	EClass getScenarioElement();

	/**
	 * Returns the meta object for the reference list '{@link specification.ScenarioElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see specification.ScenarioElement#getParameters()
	 * @see #getScenarioElement()
	 * @generated
	 */
	EReference getScenarioElement_Parameters();

	/**
	 * Returns the meta object for class '{@link specification.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see specification.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link specification.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specification.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecificationFactory getSpecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link specification.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.SpecificationImpl
		 * @see specification.impl.SpecificationPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__FEATURES = eINSTANCE.getSpecification_Features();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ROLES = eINSTANCE.getSpecification_Roles();

		/**
		 * The meta object literal for the '<em><b>Automation Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__AUTOMATION_LAYER = eINSTANCE.getSpecification_AutomationLayer();

		/**
		 * The meta object literal for the '{@link specification.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.FeatureImpl
		 * @see specification.impl.SpecificationPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__STORIES = eINSTANCE.getFeature_Stories();

		/**
		 * The meta object literal for the '<em><b>Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BENEFITS = eINSTANCE.getFeature_Benefits();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CAPABILITIES = eINSTANCE.getFeature_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURES = eINSTANCE.getFeature_Features();

		/**
		 * The meta object literal for the '{@link specification.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.RoleImpl
		 * @see specification.impl.SpecificationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link specification.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.CapabilityImpl
		 * @see specification.impl.SpecificationPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link specification.impl.BenefitImpl <em>Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.BenefitImpl
		 * @see specification.impl.SpecificationPackageImpl#getBenefit()
		 * @generated
		 */
		EClass BENEFIT = eINSTANCE.getBenefit();

		/**
		 * The meta object literal for the '{@link specification.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.StoryImpl
		 * @see specification.impl.SpecificationPackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__AS = eINSTANCE.getStory_As();

		/**
		 * The meta object literal for the '<em><b>So That</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SO_THAT = eINSTANCE.getStory_SoThat();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SCENARIOS = eINSTANCE.getStory_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__TITLE = eINSTANCE.getStory_Title();

		/**
		 * The meta object literal for the '<em><b>IWant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__IWANT = eINSTANCE.getStory_IWant();

		/**
		 * The meta object literal for the '{@link specification.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ScenarioImpl
		 * @see specification.impl.SpecificationPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TITLE = eINSTANCE.getScenario_Title();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GIVEN = eINSTANCE.getScenario_Given();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WHEN = eINSTANCE.getScenario_When();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__THEN = eINSTANCE.getScenario_Then();

		/**
		 * The meta object literal for the '{@link specification.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ContextImpl
		 * @see specification.impl.SpecificationPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link specification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ActionImpl
		 * @see specification.impl.SpecificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link specification.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.BehaviourImpl
		 * @see specification.impl.SpecificationPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '{@link specification.impl.AutomationLayerImpl <em>Automation Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.AutomationLayerImpl
		 * @see specification.impl.SpecificationPackageImpl#getAutomationLayer()
		 * @generated
		 */
		EClass AUTOMATION_LAYER = eINSTANCE.getAutomationLayer();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_LAYER__CONTEXT = eINSTANCE.getAutomationLayer_Context();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_LAYER__ACTIONS = eINSTANCE.getAutomationLayer_Actions();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_LAYER__BEHAVIOURS = eINSTANCE.getAutomationLayer_Behaviours();

		/**
		 * The meta object literal for the '{@link specification.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.NamedElementImpl
		 * @see specification.impl.SpecificationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__NOTES = eINSTANCE.getNamedElement_Notes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__REFERENCES = eINSTANCE.getNamedElement_References();

		/**
		 * The meta object literal for the '{@link specification.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.NoteImpl
		 * @see specification.impl.SpecificationPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DESCRIPTION = eINSTANCE.getNote_Description();

		/**
		 * The meta object literal for the '{@link specification.impl.ImplementationNoteImpl <em>Implementation Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ImplementationNoteImpl
		 * @see specification.impl.SpecificationPackageImpl#getImplementationNote()
		 * @generated
		 */
		EClass IMPLEMENTATION_NOTE = eINSTANCE.getImplementationNote();

		/**
		 * The meta object literal for the '{@link specification.impl.TestNoteImpl <em>Test Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.TestNoteImpl
		 * @see specification.impl.SpecificationPackageImpl#getTestNote()
		 * @generated
		 */
		EClass TEST_NOTE = eINSTANCE.getTestNote();

		/**
		 * The meta object literal for the '{@link specification.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ScenarioElementImpl
		 * @see specification.impl.SpecificationPackageImpl#getScenarioElement()
		 * @generated
		 */
		EClass SCENARIO_ELEMENT = eINSTANCE.getScenarioElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_ELEMENT__PARAMETERS = eINSTANCE.getScenarioElement_Parameters();

		/**
		 * The meta object literal for the '{@link specification.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specification.impl.ParameterImpl
		 * @see specification.impl.SpecificationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

	}

} //SpecificationPackage
