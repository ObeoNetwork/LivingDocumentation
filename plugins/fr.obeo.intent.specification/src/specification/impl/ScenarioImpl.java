/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import specification.Action;
import specification.Behaviour;
import specification.Context;
import specification.Scenario;
import specification.SpecificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link specification.impl.ScenarioImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link specification.impl.ScenarioImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link specification.impl.ScenarioImpl#getWhen <em>When</em>}</li>
 *   <li>{@link specification.impl.ScenarioImpl#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> given;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> when;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> then;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.SCENARIO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getGiven() {
		if (given == null) {
			given = new EObjectResolvingEList<Context>(Context.class, this, SpecificationPackage.SCENARIO__GIVEN);
		}
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getWhen() {
		if (when == null) {
			when = new EObjectResolvingEList<Action>(Action.class, this, SpecificationPackage.SCENARIO__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getThen() {
		if (then == null) {
			then = new EObjectResolvingEList<Behaviour>(Behaviour.class, this, SpecificationPackage.SCENARIO__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.SCENARIO__TITLE:
				return getTitle();
			case SpecificationPackage.SCENARIO__GIVEN:
				return getGiven();
			case SpecificationPackage.SCENARIO__WHEN:
				return getWhen();
			case SpecificationPackage.SCENARIO__THEN:
				return getThen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecificationPackage.SCENARIO__TITLE:
				setTitle((String)newValue);
				return;
			case SpecificationPackage.SCENARIO__GIVEN:
				getGiven().clear();
				getGiven().addAll((Collection<? extends Context>)newValue);
				return;
			case SpecificationPackage.SCENARIO__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends Action>)newValue);
				return;
			case SpecificationPackage.SCENARIO__THEN:
				getThen().clear();
				getThen().addAll((Collection<? extends Behaviour>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpecificationPackage.SCENARIO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SpecificationPackage.SCENARIO__GIVEN:
				getGiven().clear();
				return;
			case SpecificationPackage.SCENARIO__WHEN:
				getWhen().clear();
				return;
			case SpecificationPackage.SCENARIO__THEN:
				getThen().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpecificationPackage.SCENARIO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SpecificationPackage.SCENARIO__GIVEN:
				return given != null && !given.isEmpty();
			case SpecificationPackage.SCENARIO__WHEN:
				return when != null && !when.isEmpty();
			case SpecificationPackage.SCENARIO__THEN:
				return then != null && !then.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
