/**
 */
package PacmanGoDiffMM.provider;


import PacmanGoDiffMM.Game;
import PacmanGoDiffMM.PacmanGoDiffMMFactory;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link PacmanGoDiffMM.Game} object.
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__GRIDNODES);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__SCOREBOARD);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__DOMAINSPECIFICDIFFS);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__DIFFGRIDNODES);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__DIFFSCOREBOARD);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__DIFFENTITIES);
			childrenFeatures.add(PacmanGoDiffMMPackage.Literals.GAME__DIFFDOMAINSPECIFICDIFFS);
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
		return getString("_UI_Game_type");
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
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
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
				(PacmanGoDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanGoDiffMMFactory.eINSTANCE.createGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__SCOREBOARD,
				 PacmanGoDiffMMFactory.eINSTANCE.createScoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__SCOREBOARD,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffScoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createFood()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createPacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createGhost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffFood()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffPacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGhost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DOMAINSPECIFICDIFFS,
				 PacmanGoDiffMMFactory.eINSTANCE.createDomainSpecificDiff()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFGRIDNODES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGame_gridnodes()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFSCOREBOARD,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGame_scoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFENTITIES,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGame_entities()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFDOMAINSPECIFICDIFFS,
				 PacmanGoDiffMMFactory.eINSTANCE.createDiffGame_domainspecificdiffs()));
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
