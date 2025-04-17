/**
 */
package pacmanDiffMM.provider;


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

import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.SemanticObject;

/**
 * This is the item provider adapter for a {@link pacmanDiffMM.SemanticObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticObjectItemProvider 
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
	public SemanticObjectItemProvider(AdapterFactory adapterFactory) {
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
			addSemanticObject_DiffEnergizerPropertyDescriptor(object);
			addSemanticObject_DiffFoodPropertyDescriptor(object);
			addSemanticObject_DiffFruitPropertyDescriptor(object);
			addSemanticObject_DiffGamePropertyDescriptor(object);
			addSemanticObject_DiffGame_entitiesPropertyDescriptor(object);
			addSemanticObject_DiffGame_gridnodesPropertyDescriptor(object);
			addSemanticObject_DiffGhostPropertyDescriptor(object);
			addSemanticObject_DiffGridNodePropertyDescriptor(object);
			addSemanticObject_DiffGridNode_downPropertyDescriptor(object);
			addSemanticObject_DiffGridNode_leftPropertyDescriptor(object);
			addSemanticObject_DiffGridNode_rightPropertyDescriptor(object);
			addSemanticObject_DiffGridNode_upPropertyDescriptor(object);
			addSemanticObject_DiffPacmanPropertyDescriptor(object);
			addSemanticObject_DiffPositionableEntity_onPropertyDescriptor(object);
			addSemanticObject_GamePropertyDescriptor(object);
			addSemanticObject_GridNodePropertyDescriptor(object);
			addSemanticObject_PositionableEntityPropertyDescriptor(object);
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
				 getString("_UI_SemanticObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_name_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Energizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffEnergizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffEnergizer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffEnergizer_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Food feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffFoodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffFood_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffFood_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Fruit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffFruitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffFruit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffFruit_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Game feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGame_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGame_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Game entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGame_entitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGame_entities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGame_entities_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Game gridnodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGame_gridnodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGame_gridnodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGame_gridnodes_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Ghost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGhostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGhost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGhost_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Grid Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGridNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGridNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGridNode_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Grid Node down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGridNode_downPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGridNode_down_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGridNode_down_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Grid Node left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGridNode_leftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGridNode_left_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGridNode_left_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Grid Node right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGridNode_rightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGridNode_right_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGridNode_right_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Grid Node up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffGridNode_upPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffGridNode_up_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffGridNode_up_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Pacman feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffPacmanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffPacman_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffPacman_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Diff Positionable Entity on feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_DiffPositionableEntity_onPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_DiffPositionableEntity_on_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_DiffPositionableEntity_on_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Game feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_GamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_Game_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_Game_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Grid Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_GridNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_GridNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_GridNode_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Object Positionable Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticObject_PositionableEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemanticObject_SemanticObject_PositionableEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemanticObject_SemanticObject_PositionableEntity_feature", "_UI_SemanticObject_type"),
				 PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SemanticObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SemanticObject_type") :
			getString("_UI_SemanticObject_type") + " " + label;
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

		switch (notification.getFeatureID(SemanticObject.class)) {
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME:
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
		return PacmanDiffMMEditPlugin.INSTANCE;
	}

}
