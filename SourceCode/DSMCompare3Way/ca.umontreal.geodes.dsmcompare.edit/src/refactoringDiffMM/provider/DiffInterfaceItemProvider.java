/**
 */
package refactoringDiffMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import refactoringDiffMM.DiffInterface;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * This is the item provider adapter for a {@link refactoringDiffMM.DiffInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffInterfaceItemProvider extends InterfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addDiff_kind_LeftPropertyDescriptor(object);
			addDiff_kind_RightPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addIsMergedPropertyDescriptor(object);
			addChangeStatusPropertyDescriptor(object);
			addNew_name_LeftPropertyDescriptor(object);
			addNew_name_RightPropertyDescriptor(object);
			addNameChangeStatusPropertyDescriptor(object);
			addNew_extends_LeftPropertyDescriptor(object);
			addNew_extends_RightPropertyDescriptor(object);
			addExtendsChangeStatusPropertyDescriptor(object);
			addNew_packageName_LeftPropertyDescriptor(object);
			addNew_packageName_RightPropertyDescriptor(object);
			addPackageNameChangeStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Diff kind Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiff_kind_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_diff_kind_Left_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__DIFF_KIND_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diff kind Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiff_kind_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_diff_kind_Right_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__DIFF_KIND_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_filter_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Merged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMergedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_isMerged_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__IS_MERGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_changeStatus_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New name Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_name_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_name_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_name_Left_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_NAME_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New name Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_name_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_name_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_name_Right_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_NAME_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_nameChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_nameChangeStatus_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NAME_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New extends Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_extends_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_extends_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_extends_Left_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_EXTENDS_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New extends Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_extends_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_extends_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_extends_Right_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_EXTENDS_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_extendsChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_extendsChangeStatus_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New package Name Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_packageName_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_packageName_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_packageName_Left_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New package Name Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_packageName_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_new_packageName_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_new_packageName_Right_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Name Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNameChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffInterface_packageNameChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffInterface_packageNameChangeStatus_feature", "_UI_DiffInterface_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffInterface_type") :
			getString("_UI_DiffInterface_type") + " " + label;
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

		switch (notification.getFeatureID(DiffInterface.class)) {
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__FILTER:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__IS_MERGED:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT:
			case RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
