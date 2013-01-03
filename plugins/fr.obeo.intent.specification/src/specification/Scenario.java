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
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specification.Scenario#getTitle <em>Title</em>}</li>
 *   <li>{@link specification.Scenario#getGiven <em>Given</em>}</li>
 *   <li>{@link specification.Scenario#getWhen <em>When</em>}</li>
 *   <li>{@link specification.Scenario#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see specification.SpecificationPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see specification.SpecificationPackage#getScenario_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link specification.Scenario#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Given</b></em>' reference list.
	 * The list contents are of type {@link specification.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' reference list.
	 * @see specification.SpecificationPackage#getScenario_Given()
	 * @model required="true"
	 * @generated
	 */
	EList<Context> getGiven();

	/**
	 * Returns the value of the '<em><b>When</b></em>' reference list.
	 * The list contents are of type {@link specification.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference list.
	 * @see specification.SpecificationPackage#getScenario_When()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getWhen();

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference list.
	 * The list contents are of type {@link specification.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference list.
	 * @see specification.SpecificationPackage#getScenario_Then()
	 * @model required="true"
	 * @generated
	 */
	EList<Behaviour> getThen();

} // Scenario
