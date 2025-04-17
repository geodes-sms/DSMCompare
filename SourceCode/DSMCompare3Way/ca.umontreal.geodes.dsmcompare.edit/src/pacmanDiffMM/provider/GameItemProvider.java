/**
 */
package pacmanDiffMM.provider;


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

import pacmanDiffMM.Game;
import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * This is the item provider adapter for a {@link pacmanDiffMM.Game} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameItemProvider 
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
	public GameItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addLivesPropertyDescriptor(object);
			addScorePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Game_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Game_id_feature", "_UI_Game_type"),
				 PacmanDiffMMPackage.Literals.GAME__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Game_lives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Game_lives_feature", "_UI_Game_type"),
				 PacmanDiffMMPackage.Literals.GAME__LIVES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Score feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Game_score_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Game_score_feature", "_UI_Game_type"),
				 PacmanDiffMMPackage.Literals.GAME__SCORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(PacmanDiffMMPackage.Literals.GAME__GRIDNODES);
			childrenFeatures.add(PacmanDiffMMPackage.Literals.GAME__ENTITIES);
			childrenFeatures.add(PacmanDiffMMPackage.Literals.GAME__DIFFGRIDNODES);
			childrenFeatures.add(PacmanDiffMMPackage.Literals.GAME__DIFFENTITIES);
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
	 * This returns Game.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Game"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Game)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Game_type") :
			getString("_UI_Game_type") + " " + label;
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

		switch (notification.getFeatureID(Game.class)) {
			case PacmanDiffMMPackage.GAME__ID:
			case PacmanDiffMMPackage.GAME__LIVES:
			case PacmanDiffMMPackage.GAME__SCORE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PacmanDiffMMPackage.GAME__GRIDNODES:
			case PacmanDiffMMPackage.GAME__ENTITIES:
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
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
				(PacmanDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanDiffMMFactory.eINSTANCE.createGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createFood()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createEnergizer()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffEnergizer()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffFood()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createFruit()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffFruit()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createGhost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffGhost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createPacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffPacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__DIFFGRIDNODES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffGame_gridnodes()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanDiffMMPackage.Literals.GAME__DIFFENTITIES,
				 PacmanDiffMMFactory.eINSTANCE.createDiffGame_entities()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PacmanDiffMMEditPlugin.INSTANCE;
	}

}
