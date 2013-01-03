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
 * A representation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specification.Story#getAs <em>As</em>}</li>
 *   <li>{@link specification.Story#getSoThat <em>So That</em>}</li>
 *   <li>{@link specification.Story#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link specification.Story#getTitle <em>Title</em>}</li>
 *   <li>{@link specification.Story#getIWant <em>IWant</em>}</li>
 * </ul>
 * </p>
 *
 * @see specification.SpecificationPackage#getStory()
 * @model
 * @generated
 */
public interface Story extends NamedElement {
	/**
	 * Returns the value of the '<em><b>As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' reference.
	 * @see #setAs(Role)
	 * @see specification.SpecificationPackage#getStory_As()
	 * @model required="true"
	 * @generated
	 */
	Role getAs();

	/**
	 * Sets the value of the '{@link specification.Story#getAs <em>As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' reference.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(Role value);

	/**
	 * Returns the value of the '<em><b>So That</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So That</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So That</em>' reference.
	 * @see #setSoThat(Benefit)
	 * @see specification.SpecificationPackage#getStory_SoThat()
	 * @model required="true"
	 * @generated
	 */
	Benefit getSoThat();

	/**
	 * Sets the value of the '{@link specification.Story#getSoThat <em>So That</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So That</em>' reference.
	 * @see #getSoThat()
	 * @generated
	 */
	void setSoThat(Benefit value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see specification.SpecificationPackage#getStory_Scenarios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

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
	 * @see specification.SpecificationPackage#getStory_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link specification.Story#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>IWant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IWant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IWant</em>' reference.
	 * @see #setIWant(Capability)
	 * @see specification.SpecificationPackage#getStory_IWant()
	 * @model required="true"
	 * @generated
	 */
	Capability getIWant();

	/**
	 * Sets the value of the '{@link specification.Story#getIWant <em>IWant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IWant</em>' reference.
	 * @see #getIWant()
	 * @generated
	 */
	void setIWant(Capability value);

} // Story
