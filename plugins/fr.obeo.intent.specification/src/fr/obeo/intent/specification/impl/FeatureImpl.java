/**
 */
package fr.obeo.intent.specification.impl;

import fr.obeo.intent.specification.Benefit;
import fr.obeo.intent.specification.Capability;
import fr.obeo.intent.specification.Feature;
import fr.obeo.intent.specification.SpecificationPackage;
import fr.obeo.intent.specification.Story;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.impl.FeatureImpl#getRefFeatures <em>Ref Features</em>}</li>
 *   <li>{@link fr.obeo.intent.specification.impl.FeatureImpl#getStories <em>Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getRefFeatures() <em>Ref Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> refFeatures;

	/**
	 * The cached value of the '{@link #getStories() <em>Stories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStories()
	 * @generated
	 * @ordered
	 */
	protected EList<Story> stories;

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
	public EList<Feature> getRefFeatures() {
		if (refFeatures == null) {
			refFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, SpecificationPackage.FEATURE__REF_FEATURES);
		}
		return refFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Story> getStories() {
		if (stories == null) {
			stories = new EObjectResolvingEList<Story>(Story.class, this, SpecificationPackage.FEATURE__STORIES);
		}
		return stories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.FEATURE__REF_FEATURES:
				return getRefFeatures();
			case SpecificationPackage.FEATURE__STORIES:
				return getStories();
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
			case SpecificationPackage.FEATURE__REF_FEATURES:
				getRefFeatures().clear();
				getRefFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SpecificationPackage.FEATURE__STORIES:
				getStories().clear();
				getStories().addAll((Collection<? extends Story>)newValue);
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
			case SpecificationPackage.FEATURE__REF_FEATURES:
				getRefFeatures().clear();
				return;
			case SpecificationPackage.FEATURE__STORIES:
				getStories().clear();
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
			case SpecificationPackage.FEATURE__REF_FEATURES:
				return refFeatures != null && !refFeatures.isEmpty();
			case SpecificationPackage.FEATURE__STORIES:
				return stories != null && !stories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
