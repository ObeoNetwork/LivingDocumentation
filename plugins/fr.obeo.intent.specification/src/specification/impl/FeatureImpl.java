/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import specification.Benefit;
import specification.Capability;
import specification.Feature;
import specification.SpecificationPackage;
import specification.Story;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link specification.impl.FeatureImpl#getStories <em>Stories</em>}</li>
 *   <li>{@link specification.impl.FeatureImpl#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link specification.impl.FeatureImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link specification.impl.FeatureImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getStories() <em>Stories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStories()
	 * @generated
	 * @ordered
	 */
	protected EList<Story> stories;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<Benefit> benefits;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Story> getStories() {
		if (stories == null) {
			stories = new EObjectContainmentEList<Story>(Story.class, this, SpecificationPackage.FEATURE__STORIES);
		}
		return stories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Benefit> getBenefits() {
		if (benefits == null) {
			benefits = new EObjectContainmentEList<Benefit>(Benefit.class, this, SpecificationPackage.FEATURE__BENEFITS);
		}
		return benefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, SpecificationPackage.FEATURE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, SpecificationPackage.FEATURE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.FEATURE__STORIES:
				return ((InternalEList<?>)getStories()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.FEATURE__BENEFITS:
				return ((InternalEList<?>)getBenefits()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.FEATURE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.FEATURE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case SpecificationPackage.FEATURE__STORIES:
				return getStories();
			case SpecificationPackage.FEATURE__BENEFITS:
				return getBenefits();
			case SpecificationPackage.FEATURE__CAPABILITIES:
				return getCapabilities();
			case SpecificationPackage.FEATURE__FEATURES:
				return getFeatures();
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
			case SpecificationPackage.FEATURE__STORIES:
				getStories().clear();
				getStories().addAll((Collection<? extends Story>)newValue);
				return;
			case SpecificationPackage.FEATURE__BENEFITS:
				getBenefits().clear();
				getBenefits().addAll((Collection<? extends Benefit>)newValue);
				return;
			case SpecificationPackage.FEATURE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case SpecificationPackage.FEATURE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case SpecificationPackage.FEATURE__STORIES:
				getStories().clear();
				return;
			case SpecificationPackage.FEATURE__BENEFITS:
				getBenefits().clear();
				return;
			case SpecificationPackage.FEATURE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case SpecificationPackage.FEATURE__FEATURES:
				getFeatures().clear();
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
			case SpecificationPackage.FEATURE__STORIES:
				return stories != null && !stories.isEmpty();
			case SpecificationPackage.FEATURE__BENEFITS:
				return benefits != null && !benefits.isEmpty();
			case SpecificationPackage.FEATURE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case SpecificationPackage.FEATURE__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
