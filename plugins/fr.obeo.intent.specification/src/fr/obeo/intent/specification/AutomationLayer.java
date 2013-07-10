/**
 */
package fr.obeo.intent.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.AutomationLayer#getContext <em>Context</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.AutomationLayer#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.AutomationLayer#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.AutomationLayer#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getAutomationLayer()
 * @model
 * @generated
 */
public interface AutomationLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getAutomationLayer_Context()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getAutomationLayer_Actions()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getAutomationLayer_Behaviours()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see fr.obeo.intent.specification.SpecificationPackage#getAutomationLayer_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link fr.obeo.intent.specification.AutomationLayer#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

} // AutomationLayer
