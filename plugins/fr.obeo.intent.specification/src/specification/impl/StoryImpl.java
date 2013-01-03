/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import specification.Benefit;
import specification.Capability;
import specification.Role;
import specification.Scenario;
import specification.SpecificationPackage;
import specification.Story;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link specification.impl.StoryImpl#getAs <em>As</em>}</li>
 *   <li>{@link specification.impl.StoryImpl#getSoThat <em>So That</em>}</li>
 *   <li>{@link specification.impl.StoryImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link specification.impl.StoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link specification.impl.StoryImpl#getIWant <em>IWant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryImpl extends NamedElementImpl implements Story {
	/**
	 * The cached value of the '{@link #getAs() <em>As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected Role as;

	/**
	 * The cached value of the '{@link #getSoThat() <em>So That</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoThat()
	 * @generated
	 * @ordered
	 */
	protected Benefit soThat;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

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
	 * The cached value of the '{@link #getIWant() <em>IWant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIWant()
	 * @generated
	 * @ordered
	 */
	protected Capability iWant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getAs() {
		if (as != null && as.eIsProxy()) {
			InternalEObject oldAs = (InternalEObject)as;
			as = (Role)eResolveProxy(oldAs);
			if (as != oldAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.STORY__AS, oldAs, as));
			}
		}
		return as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetAs() {
		return as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAs(Role newAs) {
		Role oldAs = as;
		as = newAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.STORY__AS, oldAs, as));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Benefit getSoThat() {
		if (soThat != null && soThat.eIsProxy()) {
			InternalEObject oldSoThat = (InternalEObject)soThat;
			soThat = (Benefit)eResolveProxy(oldSoThat);
			if (soThat != oldSoThat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.STORY__SO_THAT, oldSoThat, soThat));
			}
		}
		return soThat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Benefit basicGetSoThat() {
		return soThat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoThat(Benefit newSoThat) {
		Benefit oldSoThat = soThat;
		soThat = newSoThat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.STORY__SO_THAT, oldSoThat, soThat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, SpecificationPackage.STORY__SCENARIOS);
		}
		return scenarios;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.STORY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIWant() {
		if (iWant != null && iWant.eIsProxy()) {
			InternalEObject oldIWant = (InternalEObject)iWant;
			iWant = (Capability)eResolveProxy(oldIWant);
			if (iWant != oldIWant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.STORY__IWANT, oldIWant, iWant));
			}
		}
		return iWant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIWant() {
		return iWant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIWant(Capability newIWant) {
		Capability oldIWant = iWant;
		iWant = newIWant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.STORY__IWANT, oldIWant, iWant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.STORY__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.STORY__AS:
				if (resolve) return getAs();
				return basicGetAs();
			case SpecificationPackage.STORY__SO_THAT:
				if (resolve) return getSoThat();
				return basicGetSoThat();
			case SpecificationPackage.STORY__SCENARIOS:
				return getScenarios();
			case SpecificationPackage.STORY__TITLE:
				return getTitle();
			case SpecificationPackage.STORY__IWANT:
				if (resolve) return getIWant();
				return basicGetIWant();
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
			case SpecificationPackage.STORY__AS:
				setAs((Role)newValue);
				return;
			case SpecificationPackage.STORY__SO_THAT:
				setSoThat((Benefit)newValue);
				return;
			case SpecificationPackage.STORY__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case SpecificationPackage.STORY__TITLE:
				setTitle((String)newValue);
				return;
			case SpecificationPackage.STORY__IWANT:
				setIWant((Capability)newValue);
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
			case SpecificationPackage.STORY__AS:
				setAs((Role)null);
				return;
			case SpecificationPackage.STORY__SO_THAT:
				setSoThat((Benefit)null);
				return;
			case SpecificationPackage.STORY__SCENARIOS:
				getScenarios().clear();
				return;
			case SpecificationPackage.STORY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SpecificationPackage.STORY__IWANT:
				setIWant((Capability)null);
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
			case SpecificationPackage.STORY__AS:
				return as != null;
			case SpecificationPackage.STORY__SO_THAT:
				return soThat != null;
			case SpecificationPackage.STORY__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case SpecificationPackage.STORY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SpecificationPackage.STORY__IWANT:
				return iWant != null;
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

} //StoryImpl
