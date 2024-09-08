/**
 */
package pacman2WayRuleMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pacman2WayDiffMM.DiffEnergizer;
import pacman2WayDiffMM.DiffFood;
import pacman2WayDiffMM.DiffFruit;
import pacman2WayDiffMM.DiffGame;
import pacman2WayDiffMM.DiffGame_domainspecificdiffs;
import pacman2WayDiffMM.DiffGame_entities;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.DiffGame_semanticconflicts;
import pacman2WayDiffMM.DiffGhost;
import pacman2WayDiffMM.DiffGridNode;
import pacman2WayDiffMM.DiffGridNode_down;
import pacman2WayDiffMM.DiffGridNode_left;
import pacman2WayDiffMM.DiffGridNode_right;
import pacman2WayDiffMM.DiffGridNode_up;
import pacman2WayDiffMM.DiffPacman;
import pacman2WayDiffMM.DiffPositionableEntity_on;
import pacman2WayDiffMM.DomainSpecificDiff;
import pacman2WayDiffMM.Energizer;
import pacman2WayDiffMM.Food;
import pacman2WayDiffMM.Fruit;
import pacman2WayDiffMM.Game;
import pacman2WayDiffMM.Ghost;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman;
import pacman2WayDiffMM.PositionableEntity;
import pacman2WayDiffMM.SemanticConflict;
import pacman2WayDiffMM._ListEInt;

import pacman2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage
 * @generated
 */
public class Pacman2WayRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pacman2WayRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Pacman2WayRuleMMPackage.eINSTANCE;
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
	protected Pacman2WayRuleMMSwitch<Adapter> modelSwitch =
		new Pacman2WayRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_GridNode(Pattern_GridNode object) {
				return createPattern_GridNodeAdapter();
			}
			@Override
			public Adapter casePattern_Food(Pattern_Food object) {
				return createPattern_FoodAdapter();
			}
			@Override
			public Adapter casePattern_Pacman(Pattern_Pacman object) {
				return createPattern_PacmanAdapter();
			}
			@Override
			public Adapter casePattern_Ghost(Pattern_Ghost object) {
				return createPattern_GhostAdapter();
			}
			@Override
			public Adapter casePattern_Game(Pattern_Game object) {
				return createPattern_GameAdapter();
			}
			@Override
			public Adapter casePattern_PositionableEntity(Pattern_PositionableEntity object) {
				return createPattern_PositionableEntityAdapter();
			}
			@Override
			public Adapter casePattern_Fruit(Pattern_Fruit object) {
				return createPattern_FruitAdapter();
			}
			@Override
			public Adapter casePattern_Energizer(Pattern_Energizer object) {
				return createPattern_EnergizerAdapter();
			}
			@Override
			public Adapter casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
				return createPattern_DomainSpecificDiffAdapter();
			}
			@Override
			public Adapter casePattern_SemanticConflict(Pattern_SemanticConflict object) {
				return createPattern_SemanticConflictAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode(Pattern_DiffGridNode object) {
				return createPattern_DiffGridNodeAdapter();
			}
			@Override
			public Adapter casePattern_DiffGridNode_up(Pattern_DiffGridNode_up object) {
				return createPattern_DiffGridNode_upAdapter();
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
			public Adapter casePattern_DiffFood(Pattern_DiffFood object) {
				return createPattern_DiffFoodAdapter();
			}
			@Override
			public Adapter casePattern_DiffPacman(Pattern_DiffPacman object) {
				return createPattern_DiffPacmanAdapter();
			}
			@Override
			public Adapter casePattern_DiffGhost(Pattern_DiffGhost object) {
				return createPattern_DiffGhostAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame(Pattern_DiffGame object) {
				return createPattern_DiffGameAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_gridnodes(Pattern_DiffGame_gridnodes object) {
				return createPattern_DiffGame_gridnodesAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_entities(Pattern_DiffGame_entities object) {
				return createPattern_DiffGame_entitiesAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_domainspecificdiffs(Pattern_DiffGame_domainspecificdiffs object) {
				return createPattern_DiffGame_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter casePattern_DiffGame_semanticconflicts(Pattern_DiffGame_semanticconflicts object) {
				return createPattern_DiffGame_semanticconflictsAdapter();
			}
			@Override
			public Adapter casePattern_DiffPositionableEntity_on(Pattern_DiffPositionableEntity_on object) {
				return createPattern_DiffPositionableEntity_onAdapter();
			}
			@Override
			public Adapter casePattern_DiffFruit(Pattern_DiffFruit object) {
				return createPattern_DiffFruitAdapter();
			}
			@Override
			public Adapter casePattern_DiffEnergizer(Pattern_DiffEnergizer object) {
				return createPattern_DiffEnergizerAdapter();
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
			public Adapter caseGridNode(GridNode object) {
				return createGridNodeAdapter();
			}
			@Override
			public Adapter casePositionableEntity(PositionableEntity object) {
				return createPositionableEntityAdapter();
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
			public Adapter caseFruit(Fruit object) {
				return createFruitAdapter();
			}
			@Override
			public Adapter caseEnergizer(Energizer object) {
				return createEnergizerAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
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
			public Adapter caseDiffGame_domainspecificdiffs(DiffGame_domainspecificdiffs object) {
				return createDiffGame_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter caseDiffGame_semanticconflicts(DiffGame_semanticconflicts object) {
				return createDiffGame_semanticconflictsAdapter();
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
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_GridNode
	 * @generated
	 */
	public Adapter createPattern_GridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Food
	 * @generated
	 */
	public Adapter createPattern_FoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Pacman
	 * @generated
	 */
	public Adapter createPattern_PacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Ghost
	 * @generated
	 */
	public Adapter createPattern_GhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Game
	 * @generated
	 */
	public Adapter createPattern_GameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	public Adapter createPattern_PositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Fruit <em>Pattern Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Fruit
	 * @generated
	 */
	public Adapter createPattern_FruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_Energizer <em>Pattern Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_Energizer
	 * @generated
	 */
	public Adapter createPattern_EnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	public Adapter createPattern_DomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	public Adapter createPattern_SemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	public Adapter createPattern_DiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_down <em>Pattern Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_down
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_downAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffFood
	 * @generated
	 */
	public Adapter createPattern_DiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	public Adapter createPattern_DiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	public Adapter createPattern_DiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGame
	 * @generated
	 */
	public Adapter createPattern_DiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createPattern_DiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	public Adapter createPattern_DiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs <em>Pattern Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs
	 * @generated
	 */
	public Adapter createPattern_DiffGame_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts <em>Pattern Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts
	 * @generated
	 */
	public Adapter createPattern_DiffGame_semanticconflictsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createPattern_DiffPositionableEntity_onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffFruit <em>Pattern Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffFruit
	 * @generated
	 */
	public Adapter createPattern_DiffFruitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern_DiffEnergizer <em>Pattern Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern_DiffEnergizer
	 * @generated
	 */
	public Adapter createPattern_DiffEnergizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Pattern__ListEInt <em>Pattern List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Pattern__ListEInt
	 * @generated
	 */
	public Adapter createPattern__ListEIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
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
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffGame_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman2WayDiffMM.DiffGame_semanticconflicts <em>Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman2WayDiffMM.DiffGame_semanticconflicts
	 * @generated
	 */
	public Adapter createDiffGame_semanticconflictsAdapter() {
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

} //Pacman2WayRuleMMAdapterFactory
