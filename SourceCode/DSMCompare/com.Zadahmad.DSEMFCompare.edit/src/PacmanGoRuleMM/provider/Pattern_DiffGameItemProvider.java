/**
 */
package PacmanGoRuleMM.provider;


import PacmanGoDiffMM.ClassOp;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;

import PacmanGoDiffMM.provider.DiffGameItemProvider;

import PacmanGoRuleMM.PacmanGoRuleMMFactory;
import PacmanGoRuleMM.PacmanGoRuleMMPackage;
import PacmanGoRuleMM.Pattern_DiffGame;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link PacmanGoRuleMM.Pattern_DiffGame} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Pattern_DiffGameItemProvider extends DiffGameItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGameItemProvider(AdapterFactory adapterFactory) {
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

			addID_PatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addID_PatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_DiffGame_ID_Pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_DiffGame_ID_Pattern_feature", "_UI_Pattern_DiffGame_type"),
				 PacmanGoRuleMMPackage.Literals.PATTERN_DIFF_GAME__ID_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Pattern_DiffGame.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pattern_DiffGame"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ClassOp labelValue = ((Pattern_DiffGame)object).getOperation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Pattern_DiffGame_type") :
			getString("_UI_Pattern_DiffGame_type") + " " + label;
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

		switch (notification.getFeatureID(Pattern_DiffGame.class)) {
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME__ID_PATTERN:
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

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_GridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__GRIDNODES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGridNode()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__SCOREBOARD,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_Scoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__SCOREBOARD,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffScoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_Food()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_Pacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_Ghost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffFood()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffPacman()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__ENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGhost()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DOMAINSPECIFICDIFFS,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DomainSpecificDiff()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFGRIDNODES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGame_gridnodes()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFSCOREBOARD,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGame_scoreboard()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFENTITIES,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGame_entities()));

		newChildDescriptors.add
			(createChildParameter
				(PacmanGoDiffMMPackage.Literals.GAME__DIFFDOMAINSPECIFICDIFFS,
				 PacmanGoRuleMMFactory.eINSTANCE.createPattern_DiffGame_domainspecificdiffs()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PacManGoRuleMMEditPlugin.INSTANCE;
	}

}
