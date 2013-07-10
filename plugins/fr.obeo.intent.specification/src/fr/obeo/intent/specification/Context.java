/**
 */
package fr.obeo.intent.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.Context#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.intent.specification.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' reference list.
	 * @see fr.obeo.intent.specification.SpecificationPackage#getContext_Contexts()
	 * @model
	 * @generated
	 */
	EList<Context> getContexts();

} // Context
