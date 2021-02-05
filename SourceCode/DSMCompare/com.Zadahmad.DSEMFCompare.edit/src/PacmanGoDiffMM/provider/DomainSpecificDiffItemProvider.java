/**
 */
package PacmanGoDiffMM.provider;


import PacmanGoDiffMM.DomainSpecificDiff;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;

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

/**
 * This is the item provider adapter for a {@link PacmanGoDiffMM.DomainSpecificDiff} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainSpecificDiffItemProvider 
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
	public DomainSpecificDiffItemProvider(AdapterFactory adapterFactory) {
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
			addDomainSpecificDiff_GridNodePropertyDescriptor(object);
			addDomainSpecificDiff_FoodPropertyDescriptor(object);
			addDomainSpecificDiff_PacmanPropertyDescriptor(object);
			addDomainSpecificDiff_GhostPropertyDescriptor(object);
			addDomainSpecificDiff_ScoreboardPropertyDescriptor(object);
			addDomainSpecificDiff_PositionableEntityPropertyDescriptor(object);
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
				 getString("_UI_DomainSpecificDiff_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_name_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Grid Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_GridNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_GridNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_GridNode_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Food feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_FoodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Food_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Food_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Pacman feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_PacmanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Pacman_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Pacman_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Ghost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_GhostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Ghost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Ghost_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Scoreboard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_ScoreboardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_Scoreboard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_Scoreboard_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Specific Diff Positionable Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainSpecificDiff_PositionableEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainSpecificDiff_DomainSpecificDiff_PositionableEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainSpecificDiff_DomainSpecificDiff_PositionableEntity_feature", "_UI_DomainSpecificDiff_type"),
				 PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DomainSpecificDiff.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainSpecificDiff"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainSpecificDiff)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainSpecificDiff_type") :
			getString("_UI_DomainSpecificDiff_type") + " " + label;
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

		switch (notification.getFeatureID(DomainSpecificDiff.class)) {
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
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
		return PacManGoDiffMMEditPlugin.INSTANCE;
	}

}
