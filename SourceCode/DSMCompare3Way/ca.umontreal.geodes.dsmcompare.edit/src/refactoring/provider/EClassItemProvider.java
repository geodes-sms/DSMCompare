/**
 */
package refactoring.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import refactoring.EClass;
import refactoring.RefactoringFactory;
import refactoring.RefactoringPackage;

/**
 * This is the item provider adapter for a {@link refactoring.EClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassItemProvider 
	extends ItemProviderAdapter
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
	public EClassItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addImplementsPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
			addEsupertypesPropertyDescriptor(object);
			addInterfacesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_name_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_extends_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__EXTENDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_implements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_implements_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__IMPLEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_isAbstract_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_packageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_packageName_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Esupertypes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEsupertypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_esupertypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_esupertypes_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__ESUPERTYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EClass_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EClass_interfaces_feature", "_UI_EClass_type"),
				 RefactoringPackage.Literals.ECLASS__INTERFACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(RefactoringPackage.Literals.ECLASS__EATTRIBUTES);
			childrenFeatures.add(RefactoringPackage.Literals.ECLASS__EOPERATIONS);
			childrenFeatures.add(RefactoringPackage.Literals.ECLASS__EREFERENCES);
			childrenFeatures.add(RefactoringPackage.Literals.ECLASS__NESTED_CLASSES);
			childrenFeatures.add(RefactoringPackage.Literals.ECLASS__NESTED_INTERFACES);
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
	 * This returns EClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EClass_type") :
			getString("_UI_EClass_type") + " " + label;
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

		switch (notification.getFeatureID(EClass.class)) {
			case RefactoringPackage.ECLASS__NAME:
			case RefactoringPackage.ECLASS__EXTENDS:
			case RefactoringPackage.ECLASS__IMPLEMENTS:
			case RefactoringPackage.ECLASS__IS_ABSTRACT:
			case RefactoringPackage.ECLASS__PACKAGE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RefactoringPackage.ECLASS__EATTRIBUTES:
			case RefactoringPackage.ECLASS__EOPERATIONS:
			case RefactoringPackage.ECLASS__EREFERENCES:
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
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
				(RefactoringPackage.Literals.ECLASS__EATTRIBUTES,
				 RefactoringFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(RefactoringPackage.Literals.ECLASS__EOPERATIONS,
				 RefactoringFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(RefactoringPackage.Literals.ECLASS__EREFERENCES,
				 RefactoringFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(RefactoringPackage.Literals.ECLASS__NESTED_CLASSES,
				 RefactoringFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(RefactoringPackage.Literals.ECLASS__NESTED_INTERFACES,
				 RefactoringFactory.eINSTANCE.createInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RefactoringEditPlugin.INSTANCE;
	}

}
