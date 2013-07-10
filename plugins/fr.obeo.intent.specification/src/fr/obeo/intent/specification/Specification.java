/**
 */
package fr.obeo.intent.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.Specification#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Specification#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Specification#getAutomationLayer <em>Automation Layer</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Specification#getStories <em>Stories</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Specification#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Specification#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_Features()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_Roles()
	 * @model containment="true" keys="name" required="true"
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
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_AutomationLayer()
	 * @model containment="true"
	 * @generated
	 */
	AutomationLayer getAutomationLayer();

	/**
	 * Sets the value of the '{@link fr.obeo.intent.specification.Specification#getAutomationLayer <em>Automation Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automation Layer</em>' containment reference.
	 * @see #getAutomationLayer()
	 * @generated
	 */
	void setAutomationLayer(AutomationLayer value);

	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_Stories()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Story> getStories();

	/**
	 * Returns the value of the '<em><b>Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Benefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefits</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_Benefits()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Benefit> getBenefits();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getSpecification_Capabilities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Capability> getCapabilities();

} // Specification
