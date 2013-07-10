/**
 */
package fr.obeo.intent.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.Feature#getRefFeatures <em>Ref Features</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.Feature#getStories <em>Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref Features</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Features</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getFeature_RefFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getRefFeatures();

	/**
	 * Returns the value of the '<em><b>Stories</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getFeature_Stories()
	 * @model
	 * @generated
	 */
	EList<Story> getStories();

} // Feature
