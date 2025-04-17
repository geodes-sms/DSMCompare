/**
 */
package pacmanDiffMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pacmanDiffMM.DiffEnergizer;
import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * This is the item provider adapter for a {@link pacmanDiffMM.DiffEnergizer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffEnergizerItemProvider extends EnergizerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEnergizerItemProvider(AdapterFactory adapterFactory) {
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
			addNew_value_LeftPropertyDescriptor(object);
			addNew_value_RightPropertyDescriptor(object);
			addValueChangeStatusPropertyDescriptor(object);
			addDurationsChangeStatusPropertyDescriptor(object);
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
				 getString("_UI_DiffEnergizer_diff_kind_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_diff_kind_Left_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__DIFF_KIND_LEFT,
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
				 getString("_UI_DiffEnergizer_diff_kind_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_diff_kind_Right_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__DIFF_KIND_RIGHT,
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
				 getString("_UI_DiffEnergizer_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_filter_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__FILTER,
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
				 getString("_UI_DiffEnergizer_isMerged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_isMerged_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__IS_MERGED,
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
				 getString("_UI_DiffEnergizer_changeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_changeStatus_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__CHANGE_STATUS,
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
				 getString("_UI_DiffEnergizer_new_id_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_new_id_Left_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_ID_LEFT,
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
				 getString("_UI_DiffEnergizer_new_id_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_new_id_Right_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_ID_RIGHT,
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
				 getString("_UI_DiffEnergizer_idChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_idChangeStatus_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__ID_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New value Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_value_LeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEnergizer_new_value_Left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_new_value_Left_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_VALUE_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New value Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_value_RightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEnergizer_new_value_Right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_new_value_Right_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_VALUE_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEnergizer_valueChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_valueChangeStatus_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__VALUE_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Durations Change Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationsChangeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiffEnergizer_durationsChangeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiffEnergizer_durationsChangeStatus_feature", "_UI_DiffEnergizer_type"),
				 PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_LEFT);
			childrenFeatures.add(PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT);
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
	 * This returns DiffEnergizer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiffEnergizer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiffEnergizer)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DiffEnergizer_type") :
			getString("_UI_DiffEnergizer_type") + " " + label;
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

		switch (notification.getFeatureID(DiffEnergizer.class)) {
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__FILTER:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__IS_MERGED:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_ID_LEFT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_ID_RIGHT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__ID_CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
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
				(PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_LEFT,
				 PacmanDiffMMFactory.eINSTANCE.create_ListEInt()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT,
				 PacmanDiffMMFactory.eINSTANCE.create_ListEInt()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_LEFT ||
			childFeature == PacmanDiffMMPackage.Literals.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
