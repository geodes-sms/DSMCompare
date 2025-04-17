/**
 */
package pacmanCRRuleMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pacmanCRRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage
 * @generated
 */
public class PacmanCRRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanCRRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanCRRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PacmanCRRuleMMPackage.eINSTANCE;
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
	protected PacmanCRRuleMMSwitch<Adapter> modelSwitch =
		new PacmanCRRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_ConflictResolution(Pattern_ConflictResolution object) {
				return createPattern_ConflictResolutionAdapter();
			}
			@Override
			public Adapter casePattern_DiffEnergizer(Pattern_DiffEnergizer object) {
				return createPattern_DiffEnergizerAdapter();
			}
			@Override
			public Adapter casePattern_DiffFood(Pattern_DiffFood object) {
				return createPattern_DiffFoodAdapter();
			}
			@Override
			public Adapter casePattern_DiffFruit(Pattern_DiffFruit object) {
				return createPattern_DiffFruitAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame(Pattern_DiffGame object) {
				return createPattern_DiffGameAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_entities(Pattern_DiffGame_entities object) {
				return createPattern_DiffGame_entitiesAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_gridnodes(Pattern_DiffGame_gridnodes object) {
				return createPattern_DiffGame_gridnodesAdapter();
			}
			@Override
			public Adapter casePattern_DiffGhost(Pattern_DiffGhost object) {
				return createPattern_DiffGhostAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode(Pattern_DiffGridNode object) {
				return createPattern_DiffGridNodeAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode_down(Pattern_DiffGridNode_down object) {
				return createPattern_DiffGridNode_downAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode_left(Pattern_DiffGridNode_left object) {
				return createPattern_DiffGridNode_leftAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode_right(Pattern_DiffGridNode_right object) {
				return createPattern_DiffGridNode_rightAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode_up(Pattern_DiffGridNode_up object) {
				return createPattern_DiffGridNode_upAdapter();
			}
			@Override
			public Adapter casePattern_DiffPacman(Pattern_DiffPacman object) {
				return createPattern_DiffPacmanAdapter();
			}
			@Override
			public Adapter casePattern_DiffPositionableEntity_on(Pattern_DiffPositionableEntity_on object) {
				return createPattern_DiffPositionableEntity_onAdapter();
			}
			@Override
			public Adapter casePattern_Energizer(Pattern_Energizer object) {
				return createPattern_EnergizerAdapter();
			}
			@Override
			public Adapter casePattern_Food(Pattern_Food object) {
				return createPattern_FoodAdapter();
			}
			@Override
			public Adapter casePattern_Fruit(Pattern_Fruit object) {
				return createPattern_FruitAdapter();
			}
			@Override
			public Adapter casePattern_Game(Pattern_Game object) {
				return createPattern_GameAdapter();
			}
			@Override
			public Adapter casePattern_Ghost(Pattern_Ghost object) {
				return createPattern_GhostAdapter();
			}
			@Override
			public Adapter casePattern_GridNode(Pattern_GridNode object) {
				return createPattern_GridNodeAdapter();
			}
			@Override
			public Adapter casePattern_Pacman(Pattern_Pacman object) {
				return createPattern_PacmanAdapter();
			}
			@Override
			public Adapter casePattern_PositionableEntity(Pattern_PositionableEntity object) {
				return createPattern_PositionableEntityAdapter();
			}
			@Override
			public Adapter casePattern_SemanticConflict(Pattern_SemanticConflict object) {
				return createPattern_SemanticConflictAdapter();
			}
			@Override
			public Adapter casePattern_SemanticDiff(Pattern_SemanticDiff object) {
				return createPattern_SemanticDiffAdapter();
			}
			@Override
			public Adapter casePattern_SemanticObject(Pattern_SemanticObject object) {
				return createPattern_SemanticObjectAdapter();
			}
			@Override
			public Adapter casePattern__ListEInt(Pattern__ListEInt object) {
				return createPattern__ListEIntAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	public Adapter createPattern_ConflictResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffEnergizer <em>Pattern Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer
	 * @generated
	 */
	public Adapter createPattern_DiffEnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffFood
	 * @generated
	 */
	public Adapter createPattern_DiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffFruit <em>Pattern Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit
	 * @generated
	 */
	public Adapter createPattern_DiffFruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGame
	 * @generated
	 */
	public Adapter createPattern_DiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	public Adapter createPattern_DiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createPattern_DiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	public Adapter createPattern_DiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	public Adapter createPattern_DiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down <em>Pattern Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_downAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	public Adapter createPattern_DiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createPattern_DiffPositionableEntity_onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Energizer <em>Pattern Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Energizer
	 * @generated
	 */
	public Adapter createPattern_EnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Food
	 * @generated
	 */
	public Adapter createPattern_FoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Fruit <em>Pattern Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Fruit
	 * @generated
	 */
	public Adapter createPattern_FruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Game
	 * @generated
	 */
	public Adapter createPattern_GameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Ghost
	 * @generated
	 */
	public Adapter createPattern_GhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_GridNode
	 * @generated
	 */
	public Adapter createPattern_GridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_Pacman
	 * @generated
	 */
	public Adapter createPattern_PacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	public Adapter createPattern_PositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	public Adapter createPattern_SemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	public Adapter createPattern_SemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	public Adapter createPattern_SemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Pattern__ListEInt <em>Pattern List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Pattern__ListEInt
	 * @generated
	 */
	public Adapter createPattern__ListEIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacmanCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacmanCRRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
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

} //PacmanCRRuleMMAdapterFactory
