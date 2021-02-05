/**
 */
package PacmanGoRuleMM.util;

import PacmanGoDiffMM.DiffFood;
import PacmanGoDiffMM.DiffGame;
import PacmanGoDiffMM.DiffGame_domainspecificdiffs;
import PacmanGoDiffMM.DiffGame_entities;
import PacmanGoDiffMM.DiffGame_gridnodes;
import PacmanGoDiffMM.DiffGame_scoreboard;
import PacmanGoDiffMM.DiffGhost;
import PacmanGoDiffMM.DiffGridNode;
import PacmanGoDiffMM.DiffGridNode_bottom;
import PacmanGoDiffMM.DiffGridNode_left;
import PacmanGoDiffMM.DiffGridNode_right;
import PacmanGoDiffMM.DiffGridNode_up;
import PacmanGoDiffMM.DiffPacman;
import PacmanGoDiffMM.DiffPositionableEntity_on;
import PacmanGoDiffMM.DiffScoreboard;
import PacmanGoDiffMM.DomainSpecificDiff;
import PacmanGoDiffMM.Food;
import PacmanGoDiffMM.Game;
import PacmanGoDiffMM.Ghost;
import PacmanGoDiffMM.GridNode;
import PacmanGoDiffMM.Pacman;
import PacmanGoDiffMM.PositionableEntity;
import PacmanGoDiffMM.Scoreboard;

import PacmanGoRuleMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage
 * @generated
 */
public class PacmanGoRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanGoRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PacmanGoRuleMMPackage.eINSTANCE;
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
	protected PacmanGoRuleMMSwitch<Adapter> modelSwitch =
		new PacmanGoRuleMMSwitch<Adapter>() {
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
			public Adapter casePattern_Scoreboard(Pattern_Scoreboard object) {
				return createPattern_ScoreboardAdapter();
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
			public Adapter casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
				return createPattern_DomainSpecificDiffAdapter();
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
			public Adapter casePattern_DiffGridNode_bottom(Pattern_DiffGridNode_bottom object) {
				return createPattern_DiffGridNode_bottomAdapter();
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
			public Adapter casePattern_DiffScoreboard(Pattern_DiffScoreboard object) {
				return createPattern_DiffScoreboardAdapter();
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
			public Adapter casePattern_DiffGame_scoreboard(Pattern_DiffGame_scoreboard object) {
				return createPattern_DiffGame_scoreboardAdapter();
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
			public Adapter casePattern_DiffPositionableEntity_on(Pattern_DiffPositionableEntity_on object) {
				return createPattern_DiffPositionableEntity_onAdapter();
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
			public Adapter caseScoreboard(Scoreboard object) {
				return createScoreboardAdapter();
			}
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
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
			public Adapter caseDiffGridNode_bottom(DiffGridNode_bottom object) {
				return createDiffGridNode_bottomAdapter();
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
			public Adapter caseDiffScoreboard(DiffScoreboard object) {
				return createDiffScoreboardAdapter();
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
			public Adapter caseDiffGame_scoreboard(DiffGame_scoreboard object) {
				return createDiffGame_scoreboardAdapter();
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
			public Adapter caseDiffPositionableEntity_on(DiffPositionableEntity_on object) {
				return createDiffPositionableEntity_onAdapter();
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
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_GridNode
	 * @generated
	 */
	public Adapter createPattern_GridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_Food
	 * @generated
	 */
	public Adapter createPattern_FoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_Pacman
	 * @generated
	 */
	public Adapter createPattern_PacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_Ghost
	 * @generated
	 */
	public Adapter createPattern_GhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_Scoreboard <em>Pattern Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_Scoreboard
	 * @generated
	 */
	public Adapter createPattern_ScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_Game
	 * @generated
	 */
	public Adapter createPattern_GameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	public Adapter createPattern_PositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	public Adapter createPattern_DomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	public Adapter createPattern_DiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_bottom <em>Pattern Diff Grid Node bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_bottom
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_bottomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	public Adapter createPattern_DiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffFood
	 * @generated
	 */
	public Adapter createPattern_DiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	public Adapter createPattern_DiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	public Adapter createPattern_DiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffScoreboard <em>Pattern Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffScoreboard
	 * @generated
	 */
	public Adapter createPattern_DiffScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGame
	 * @generated
	 */
	public Adapter createPattern_DiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createPattern_DiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGame_scoreboard <em>Pattern Diff Game scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_scoreboard
	 * @generated
	 */
	public Adapter createPattern_DiffGame_scoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	public Adapter createPattern_DiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs <em>Pattern Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs
	 * @generated
	 */
	public Adapter createPattern_DiffGame_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createPattern_DiffPositionableEntity_onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.GridNode
	 * @generated
	 */
	public Adapter createGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.PositionableEntity
	 * @generated
	 */
	public Adapter createPositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Food
	 * @generated
	 */
	public Adapter createFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Pacman
	 * @generated
	 */
	public Adapter createPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Ghost
	 * @generated
	 */
	public Adapter createGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Scoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Scoreboard
	 * @generated
	 */
	public Adapter createScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode
	 * @generated
	 */
	public Adapter createDiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_up
	 * @generated
	 */
	public Adapter createDiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_bottom <em>Diff Grid Node bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_bottom
	 * @generated
	 */
	public Adapter createDiffGridNode_bottomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_left
	 * @generated
	 */
	public Adapter createDiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_right
	 * @generated
	 */
	public Adapter createDiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffFood
	 * @generated
	 */
	public Adapter createDiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffPacman
	 * @generated
	 */
	public Adapter createDiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGhost
	 * @generated
	 */
	public Adapter createDiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffScoreboard <em>Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffScoreboard
	 * @generated
	 */
	public Adapter createDiffScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame
	 * @generated
	 */
	public Adapter createDiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createDiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_scoreboard <em>Diff Game scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_scoreboard
	 * @generated
	 */
	public Adapter createDiffGame_scoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_entities
	 * @generated
	 */
	public Adapter createDiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffGame_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createDiffPositionableEntity_onAdapter() {
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

} //PacmanGoRuleMMAdapterFactory
