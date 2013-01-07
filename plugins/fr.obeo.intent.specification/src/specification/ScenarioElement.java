/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link specification.ScenarioElement#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see specification.SpecificationPackage#getScenarioElement()
 * @model
 * @generated
 */
public interface ScenarioElement extends Parameter {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link specification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see specification.SpecificationPackage#getScenarioElement_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ScenarioElement
