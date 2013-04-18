/**
 */
package fr.obeo.intent.specification.impl;

import fr.obeo.intent.specification.AutomationLayer;
import fr.obeo.intent.specification.Feature;
import fr.obeo.intent.specification.Role;
import fr.obeo.intent.specification.Specification;
import fr.obeo.intent.specification.SpecificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.impl.SpecificationImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.impl.SpecificationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.impl.SpecificationImpl#getAutomationLayer <em>Automation Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends NamedElementImpl implements Specification {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getAutomationLayer() <em>Automation Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationLayer()
	 * @generated
	 * @ordered
	 */
	protected AutomationLayer automationLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, SpecificationPackage.SPECIFICATION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, SpecificationPackage.SPECIFICATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationLayer getAutomationLayer() {
		return automationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomationLayer(AutomationLayer newAutomationLayer, NotificationChain msgs) {
		AutomationLayer oldAutomationLayer = automationLayer;
		automationLayer = newAutomationLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER, oldAutomationLayer, newAutomationLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomationLayer(AutomationLayer newAutomationLayer) {
		if (newAutomationLayer != automationLayer) {
			NotificationChain msgs = null;
			if (automationLayer != null)
				msgs = ((InternalEObject)automationLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER, null, msgs);
			if (newAutomationLayer != null)
				msgs = ((InternalEObject)newAutomationLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER, null, msgs);
			msgs = basicSetAutomationLayer(newAutomationLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER, newAutomationLayer, newAutomationLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.SPECIFICATION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.SPECIFICATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
				return basicSetAutomationLayer(null, msgs);
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
			case SpecificationPackage.SPECIFICATION__FEATURES:
				return getFeatures();
			case SpecificationPackage.SPECIFICATION__ROLES:
				return getRoles();
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
				return getAutomationLayer();
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
			case SpecificationPackage.SPECIFICATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SpecificationPackage.SPECIFICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
				setAutomationLayer((AutomationLayer)newValue);
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
			case SpecificationPackage.SPECIFICATION__FEATURES:
				getFeatures().clear();
				return;
			case SpecificationPackage.SPECIFICATION__ROLES:
				getRoles().clear();
				return;
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
				setAutomationLayer((AutomationLayer)null);
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
			case SpecificationPackage.SPECIFICATION__FEATURES:
				return features != null && !features.isEmpty();
			case SpecificationPackage.SPECIFICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
				return automationLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
