/**
 */
package refactoringDiffMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import refactoringDiffMM.DiffEPackage_interfaces;
import refactoringDiffMM.DiffKind;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * This is the item provider adapter for a {@link refactoringDiffMM.DiffEPackage_interfaces} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffEPackage_interfacesItemProvider 
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
	public DiffEPackage_interfacesItemProvider(AdapterFactory adapterFactory) {
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
			addChangeStatusPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addIsMergedPropertyDescriptor(object);
			addDiff_GroupPropertyDescriptor(object);
			addETypePropertyDescriptor(object);
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
				 getString("_UI_DiffEPackage_interfaces_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_diff_kind_Left_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffEPackage_interfaces_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_diff_kind_Right_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DiffEPackage_interfaces_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_changeStatus_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS,
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
				 getString("_UI_DiffEPackage_interfaces_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_filter_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__FILTER,
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
				 getString("_UI_DiffEPackage_interfaces_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_isMerged_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__IS_MERGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diff Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiff_GroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEPackage_interfaces_diff_Group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_diff_Group_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__DIFF_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EType feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addETypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEPackage_interfaces_eType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEPackage_interfaces_eType_feature", "_UI_DiffEPackage_interfaces_type"),
				 RefactoringDiffMMPackage.Literals.DIFF_EPACKAGE_INTERFACES__ETYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DiffEPackage_interfaces.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffEPackage_interfaces"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DiffKind labelValue = ((DiffEPackage_interfaces)object).getDiff_kind_Left();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffEPackage_interfaces_type") :
			getString("_UI_DiffEPackage_interfaces_type") + " " + label;
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

		switch (notification.getFeatureID(DiffEPackage_interfaces.class)) {
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT:
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT:
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS:
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__FILTER:
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__IS_MERGED:
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES__DIFF_GROUP:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RefactoringDiffMMEditPlugin.INSTANCE;
	}

}
