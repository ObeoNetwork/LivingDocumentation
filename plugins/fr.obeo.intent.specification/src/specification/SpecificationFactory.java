/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see specification.SpecificationPackage
 * @generated
 */
public interface SpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificationFactory eINSTANCE = specification.impl.SpecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Benefit</em>'.
	 * @generated
	 */
	Benefit createBenefit();

	/**
	 * Returns a new object of class '<em>Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story</em>'.
	 * @generated
	 */
	Story createStory();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour</em>'.
	 * @generated
	 */
	Behaviour createBehaviour();

	/**
	 * Returns a new object of class '<em>Automation Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Layer</em>'.
	 * @generated
	 */
	AutomationLayer createAutomationLayer();

	/**
	 * Returns a new object of class '<em>Implementation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Note</em>'.
	 * @generated
	 */
	ImplementationNote createImplementationNote();

	/**
	 * Returns a new object of class '<em>Test Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Note</em>'.
	 * @generated
	 */
	TestNote createTestNote();

	/**
	 * Returns a new object of class '<em>Scenario Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Element</em>'.
	 * @generated
	 */
	ScenarioElement createScenarioElement();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecificationPackage getSpecificationPackage();

} //SpecificationFactory
