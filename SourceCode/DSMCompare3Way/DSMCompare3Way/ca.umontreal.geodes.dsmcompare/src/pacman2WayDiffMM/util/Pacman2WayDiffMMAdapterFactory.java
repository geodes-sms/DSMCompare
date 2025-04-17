/**
 */
package pacman2WayDiffMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pacman2WayDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage
 * @generated
 */
public class Pacman2WayDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pacman2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Pacman2WayDiffMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pacman2WayDiffMMSwitch<Adapter> modelSwitch =
		new Pacman2WayDiffMMSwitch<Adapter>() {
			@Override
			public Adapter caseGridNode(GridNode object) {
				return createGridNodeAdapter();
			}
			@Override
			public Adapter caseFood(Food object) {
				return createFoodAdapter();
			}
			@Override
			public Adapter casePacman(Pacman object) {
				return createPacmanAdapter();
			}
			@Override
			public Adapter caseGhost(Ghost object) {
				return createGhostAdapter();
			}
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter casePositionableEntity(PositionableEntity object) {
				return createPositionableEntityAdapter();
			}
			@Override
			public Adapter caseFruit(Fruit object) {
				return createFruitAdapter();
			}
			@Override
			public Adapter caseEnergizer(Energizer object) {
				return createEnergizerAdapter();
			}
			@Override
			public Adapter caseSemanticObject(SemanticObject object) {
				return createSemanticObjectAdapter();
			}
			@Override
			public Adapter caseSemanticDiff(SemanticDiff object) {
				return createSemanticDiffAdapter();
			}
			@Override
			public Adapter caseSemanticConflict(SemanticConflict object) {
				return createSemanticConflictAdapter();
			}
			@Override
			public Adapter caseDiffGridNode(DiffGridNode object) {
				return createDiffGridNodeAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_up(DiffGridNode_up object) {
				return createDiffGridNode_upAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_down(DiffGridNode_down object) {
				return createDiffGridNode_downAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_left(DiffGridNode_left object) {
				return createDiffGridNode_leftAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_right(DiffGridNode_right object) {
				return createDiffGridNode_rightAdapter();
			}
			@Override
			public Adapter caseDiffFood(DiffFood object) {
				return createDiffFoodAdapter();
			}
			@Override
			public Adapter caseDiffPacman(DiffPacman object) {
				return createDiffPacmanAdapter();
			}
			@Override
			public Adapter caseDiffGhost(DiffGhost object) {
				return createDiffGhostAdapter();
			}
			@Override
			public Adapter caseDiffGame(DiffGame object) {
				return createDiffGameAdapter();
			}
			@Override
			public Adapter caseDiffGame_gridnodes(DiffGame_gridnodes object) {
				return createDiffGame_gridnodesAdapter();
			}
			@Override
			public Adapter caseDiffGame_entities(DiffGame_entities object) {
				return createDiffGame_entitiesAdapter();
			}
			@Override
			public Adapter caseDiffPositionableEntity_on(DiffPositionableEntity_on object) {
				return createDiffPositionableEntity_onAdapter();
			}
			@Override
			public Adapter caseDiffFruit(DiffFruit object) {
				return createDiffFruitAdapter();
			}
			@Override
			public Adapter caseDiffEnergizer(DiffEnergizer object) {
				return createDiffEnergizerAdapter();
			}
			@Override
			public Adapter case_ListEInt(_ListEInt object) {
				return create_ListEIntAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.GridNode
	 * @generated
	 */
	public Adapter createGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Food
	 * @generated
	 */
	public Adapter createFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Pacman
	 * @generated
	 */
	public Adapter createPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Ghost
	 * @generated
	 */
	public Adapter createGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.PositionableEntity
	 * @generated
	 */
	public Adapter createPositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Fruit <em>Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Fruit
	 * @generated
	 */
	public Adapter createFruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.Energizer <em>Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.Energizer
	 * @generated
	 */
	public Adapter createEnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.SemanticObject
	 * @generated
	 */
	public Adapter createSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.SemanticDiff
	 * @generated
	 */
	public Adapter createSemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.SemanticConflict
	 * @generated
	 */
	public Adapter createSemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGridNode
	 * @generated
	 */
	public Adapter createDiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGridNode_up
	 * @generated
	 */
	public Adapter createDiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGridNode_down <em>Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGridNode_down
	 * @generated
	 */
	public Adapter createDiffGridNode_downAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGridNode_left
	 * @generated
	 */
	public Adapter createDiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGridNode_right
	 * @generated
	 */
	public Adapter createDiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffFood
	 * @generated
	 */
	public Adapter createDiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffPacman
	 * @generated
	 */
	public Adapter createDiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGhost
	 * @generated
	 */
	public Adapter createDiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGame
	 * @generated
	 */
	public Adapter createDiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createDiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGame_entities
	 * @generated
	 */
	public Adapter createDiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createDiffPositionableEntity_onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffFruit <em>Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffFruit
	 * @generated
	 */
	public Adapter createDiffFruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffEnergizer <em>Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffEnergizer
	 * @generated
	 */
	public Adapter createDiffEnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM._ListEInt <em>List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM._ListEInt
	 * @generated
	 */
	public Adapter create_ListEIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Pacman2WayDiffMMAdapterFactory
