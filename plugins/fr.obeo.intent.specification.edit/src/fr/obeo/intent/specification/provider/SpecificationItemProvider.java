/**
 */
package fr.obeo.intent.specification.provider;


import fr.obeo.intent.specification.Specification;
import fr.obeo.intent.specification.SpecificationFactory;
import fr.obeo.intent.specification.SpecificationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.intent.specification.Specification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__FEATURES);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__ROLES);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__AUTOMATION_LAYER);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__STORIES);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__BENEFITS);
			childrenFeatures.add(SpecificationPackage.Literals.SPECIFICATION__CAPABILITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Specification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Specification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Specification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Specification_type") :
			getString("_UI_Specification_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Specification.class)) {
			case SpecificationPackage.SPECIFICATION__FEATURES:
			case SpecificationPackage.SPECIFICATION__ROLES:
			case SpecificationPackage.SPECIFICATION__AUTOMATION_LAYER:
			case SpecificationPackage.SPECIFICATION__STORIES:
			case SpecificationPackage.SPECIFICATION__BENEFITS:
			case SpecificationPackage.SPECIFICATION__CAPABILITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__FEATURES,
				 SpecificationFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__ROLES,
				 SpecificationFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__AUTOMATION_LAYER,
				 SpecificationFactory.eINSTANCE.createAutomationLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__STORIES,
				 SpecificationFactory.eINSTANCE.createStory()));

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__BENEFITS,
				 SpecificationFactory.eINSTANCE.createBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(SpecificationPackage.Literals.SPECIFICATION__CAPABILITIES,
				 SpecificationFactory.eINSTANCE.createCapability()));
	}

}
