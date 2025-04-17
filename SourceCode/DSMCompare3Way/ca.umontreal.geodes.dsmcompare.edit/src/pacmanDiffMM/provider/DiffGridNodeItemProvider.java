/**
 */
package pacmanDiffMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pacmanDiffMM.DiffGridNode;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * This is the item provider adapter for a {@link pacmanDiffMM.DiffGridNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffGridNodeItemProvider extends GridNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNodeItemProvider(AdapterFactory adapterFactory) {
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
			addNew_id_LeftPropertyDescriptor(object);
			addNew_id_RightPropertyDescriptor(object);
			addIdChangeStatusPropertyDescriptor(object);
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
				 getString("_UI_DiffGridNode_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_diff_kind_Left_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffGridNode_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_diff_kind_Right_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__DIFF_KIND_RIGHT,
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
				 getString("_UI_DiffGridNode_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_filter_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__FILTER,
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
				 getString("_UI_DiffGridNode_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_isMerged_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__IS_MERGED,
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
				 getString("_UI_DiffGridNode_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_changeStatus_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New id Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_id_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffGridNode_new_id_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_new_id_Left_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__NEW_ID_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New id Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_id_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffGridNode_new_id_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_new_id_Right_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__NEW_ID_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffGridNode_idChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffGridNode_idChangeStatus_feature", "_UI_DiffGridNode_type"),
				 PacmanDiffMMPackage.Literals.DIFF_GRID_NODE__ID_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffGridNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffGridNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffGridNode)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffGridNode_type") :
			getString("_UI_DiffGridNode_type") + " " + label;
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

		switch (notification.getFeatureID(DiffGridNode.class)) {
			case PacmanDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND_LEFT:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND_RIGHT:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__FILTER:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__IS_MERGED:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__NEW_ID_LEFT:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__NEW_ID_RIGHT:
			case PacmanDiffMMPackage.DIFF_GRID_NODE__ID_CHANGE_STATUS:
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
