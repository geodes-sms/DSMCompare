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

import pacmanDiffMM.DiffPacman;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * This is the item provider adapter for a {@link pacmanDiffMM.DiffPacman} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffPacmanItemProvider extends PacmanItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPacmanItemProvider(AdapterFactory adapterFactory) {
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
			addNew_initialPosition_LeftPropertyDescriptor(object);
			addNew_initialPosition_RightPropertyDescriptor(object);
			addInitialPositionChangeStatusPropertyDescriptor(object);
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
				 getString("_UI_DiffPacman_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_diff_kind_Left_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffPacman_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_diff_kind_Right_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__DIFF_KIND_RIGHT,
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
				 getString("_UI_DiffPacman_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_filter_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__FILTER,
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
				 getString("_UI_DiffPacman_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_isMerged_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__IS_MERGED,
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
				 getString("_UI_DiffPacman_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_changeStatus_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__CHANGE_STATUS,
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
				 getString("_UI_DiffPacman_new_id_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_new_id_Left_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__NEW_ID_LEFT,
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
				 getString("_UI_DiffPacman_new_id_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_new_id_Right_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__NEW_ID_RIGHT,
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
				 getString("_UI_DiffPacman_idChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_idChangeStatus_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__ID_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New initial Position Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_initialPosition_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffPacman_new_initialPosition_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_new_initialPosition_Left_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New initial Position Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_initialPosition_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffPacman_new_initialPosition_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_new_initialPosition_Right_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Position Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialPositionChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffPacman_initialPositionChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffPacman_initialPositionChangeStatus_feature", "_UI_DiffPacman_type"),
				 PacmanDiffMMPackage.Literals.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiffPacman.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffPacman"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffPacman)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffPacman_type") :
			getString("_UI_DiffPacman_type") + " " + label;
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

		switch (notification.getFeatureID(DiffPacman.class)) {
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT:
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT:
			case PacmanDiffMMPackage.DIFF_PACMAN__FILTER:
			case PacmanDiffMMPackage.DIFF_PACMAN__IS_MERGED:
			case PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_ID_LEFT:
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_ID_RIGHT:
			case PacmanDiffMMPackage.DIFF_PACMAN__ID_CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
			case PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
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
