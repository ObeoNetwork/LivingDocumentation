/**
 */
package fr.obeo.intent.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.Scenario#getGiven <em>Given</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Scenario#getWhen <em>When</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Scenario#getThen <em>Then</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Scenario#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getScenario_Given()
	 * @model required="true"
	 * @generated
	 */
	EList<Context> getGiven();

	/**
	 * Returns the value of the '<em><b>When</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getScenario_When()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getWhen();

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getScenario_Then()
	 * @model required="true"
	 * @generated
	 */
	EList<Behaviour> getThen();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getScenario_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Scenario
