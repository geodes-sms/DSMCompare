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

import refactoringDiffMM.DiffEAttribute;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * This is the item provider adapter for a {@link refactoringDiffMM.DiffEAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffEAttributeItemProvider extends EAttributeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEAttributeItemProvider(AdapterFactory adapterFactory) {
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
			addNew_etype_LeftPropertyDescriptor(object);
			addNew_etype_RightPropertyDescriptor(object);
			addEtypeChangeStatusPropertyDescriptor(object);
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
				 getString("_UI_DiffEAttribute_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_diff_kind_Left_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffEAttribute_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_diff_kind_Right_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__DIFF_KIND_RIGHT,
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
				 getString("_UI_DiffEAttribute_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_filter_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__FILTER,
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
				 getString("_UI_DiffEAttribute_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_isMerged_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__IS_MERGED,
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
				 getString("_UI_DiffEAttribute_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_changeStatus_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__CHANGE_STATUS,
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
				 getString("_UI_DiffEAttribute_new_name_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_new_name_Left_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__NEW_NAME_LEFT,
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
				 getString("_UI_DiffEAttribute_new_name_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_new_name_Right_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__NEW_NAME_RIGHT,
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
				 getString("_UI_DiffEAttribute_nameChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_nameChangeStatus_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__NAME_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New etype Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_etype_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEAttribute_new_etype_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_new_etype_Left_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__NEW_ETYPE_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New etype Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_etype_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEAttribute_new_etype_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_new_etype_Right_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Etype Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtypeChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEAttribute_etypeChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEAttribute_etypeChangeStatus_feature", "_UI_DiffEAttribute_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffEAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffEAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffEAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffEAttribute_type") :
			getString("_UI_DiffEAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(DiffEAttribute.class)) {
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__DIFF_KIND_LEFT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__DIFF_KIND_RIGHT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__FILTER:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__IS_MERGED:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_NAME_LEFT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_NAME_RIGHT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NAME_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_ETYPE_LEFT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT:
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS:
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
