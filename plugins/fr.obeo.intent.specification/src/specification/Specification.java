/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specification.Specification#getFeatures <em>Features</em>}</li>
 *   <li>{@link specification.Specification#getRoles <em>Roles</em>}</li>
 *   <li>{@link specification.Specification#getAutomationLayer <em>Automation Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @see specification.SpecificationPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see specification.SpecificationPackage#getSpecification_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see specification.SpecificationPackage#getSpecification_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Automation Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automation Layer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automation Layer</em>' containment reference.
	 * @see #setAutomationLayer(AutomationLayer)
	 * @see specification.SpecificationPackage#getSpecification_AutomationLayer()
	 * @model containment="true"
	 * @generated
	 */
	AutomationLayer getAutomationLayer();

	/**
	 * Sets the value of the '{@link specification.Specification#getAutomationLayer <em>Automation Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automation Layer</em>' containment reference.
	 * @see #getAutomationLayer()
	 * @generated
	 */
	void setAutomationLayer(AutomationLayer value);

} // Specification
