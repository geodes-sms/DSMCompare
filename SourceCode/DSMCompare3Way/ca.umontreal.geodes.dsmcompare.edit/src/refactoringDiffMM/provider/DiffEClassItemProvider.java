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

import refactoringDiffMM.DiffEClass;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * This is the item provider adapter for a {@link refactoringDiffMM.DiffEClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffEClassItemProvider extends EClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClassItemProvider(AdapterFactory adapterFactory) {
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
			addNew_implements_LeftPropertyDescriptor(object);
			addNew_implements_RightPropertyDescriptor(object);
			addImplementsChangeStatusPropertyDescriptor(object);
			addNew_isAbstract_LeftPropertyDescriptor(object);
			addNew_isAbstract_RightPropertyDescriptor(object);
			addIsAbstractChangeStatusPropertyDescriptor(object);
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
				 getString("_UI_DiffEClass_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_diff_kind_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffEClass_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_diff_kind_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__DIFF_KIND_RIGHT,
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
				 getString("_UI_DiffEClass_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_filter_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__FILTER,
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
				 getString("_UI_DiffEClass_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_isMerged_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__IS_MERGED,
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
				 getString("_UI_DiffEClass_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_changeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__CHANGE_STATUS,
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
				 getString("_UI_DiffEClass_new_name_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_name_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_NAME_LEFT,
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
				 getString("_UI_DiffEClass_new_name_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_name_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_NAME_RIGHT,
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
				 getString("_UI_DiffEClass_nameChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_nameChangeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NAME_CHANGE_STATUS,
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
				 getString("_UI_DiffEClass_new_extends_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_extends_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_EXTENDS_LEFT,
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
				 getString("_UI_DiffEClass_new_extends_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_extends_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_EXTENDS_RIGHT,
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
				 getString("_UI_DiffEClass_extendsChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_extendsChangeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__EXTENDS_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New implements Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_implements_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_new_implements_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_implements_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_IMPLEMENTS_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New implements Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_implements_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_new_implements_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_implements_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_implementsChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_implementsChangeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New is Abstract Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_isAbstract_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_new_isAbstract_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_isAbstract_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New is Abstract Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_isAbstract_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_new_isAbstract_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_isAbstract_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEClass_isAbstractChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_isAbstractChangeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS,
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
				 getString("_UI_DiffEClass_new_packageName_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_packageName_Left_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT,
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
				 getString("_UI_DiffEClass_new_packageName_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_new_packageName_Right_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT,
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
				 getString("_UI_DiffEClass_packageNameChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEClass_packageNameChangeStatus_feature", "_UI_DiffEClass_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffEClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffEClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffEClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffEClass_type") :
			getString("_UI_DiffEClass_type") + " " + label;
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

		switch (notification.getFeatureID(DiffEClass.class)) {
			case RefactoringDiffMMPackage.DIFF_ECLASS__DIFF_KIND_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__DIFF_KIND_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__FILTER:
			case RefactoringDiffMMPackage.DIFF_ECLASS__IS_MERGED:
			case RefactoringDiffMMPackage.DIFF_ECLASS__CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_NAME_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_NAME_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NAME_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__EXTENDS_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT:
			case RefactoringDiffMMPackage.DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS:
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
