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
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specification.Feature#getStories <em>Stories</em>}</li>
 *   <li>{@link specification.Feature#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link specification.Feature#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link specification.Feature#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see specification.SpecificationPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see specification.SpecificationPackage#getFeature_Stories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Story> getStories();

	/**
	 * Returns the value of the '<em><b>Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Benefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefits</em>' containment reference list.
	 * @see specification.SpecificationPackage#getFeature_Benefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Benefit> getBenefits();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see specification.SpecificationPackage#getFeature_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

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
	 * @see specification.SpecificationPackage#getFeature_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Feature
