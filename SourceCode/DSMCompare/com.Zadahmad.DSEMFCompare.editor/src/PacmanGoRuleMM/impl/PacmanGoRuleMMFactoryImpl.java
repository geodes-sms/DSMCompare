/**
 */
package PacmanGoRuleMM.impl;

import PacmanGoRuleMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanGoRuleMMFactoryImpl extends EFactoryImpl implements PacmanGoRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanGoRuleMMFactory init() {
		try {
			PacmanGoRuleMMFactory thePacmanGoRuleMMFactory = (PacmanGoRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanGoRuleMMPackage.eNS_URI);
			if (thePacmanGoRuleMMFactory != null) {
				return thePacmanGoRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanGoRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoRuleMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PacmanGoRuleMMPackage.PATTERN_GRID_NODE: return createPattern_GridNode();
			case PacmanGoRuleMMPackage.PATTERN_FOOD: return createPattern_Food();
			case PacmanGoRuleMMPackage.PATTERN_PACMAN: return createPattern_Pacman();
			case PacmanGoRuleMMPackage.PATTERN_GHOST: return createPattern_Ghost();
			case PacmanGoRuleMMPackage.PATTERN_SCOREBOARD: return createPattern_Scoreboard();
			case PacmanGoRuleMMPackage.PATTERN_GAME: return createPattern_Game();
			case PacmanGoRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: return createPattern_DomainSpecificDiff();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GRID_NODE: return createPattern_DiffGridNode();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP: return createPattern_DiffGridNode_up();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GRID_NODE_BOTTOM: return createPattern_DiffGridNode_bottom();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GRID_NODE_LEFT: return createPattern_DiffGridNode_left();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GRID_NODE_RIGHT: return createPattern_DiffGridNode_right();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_FOOD: return createPattern_DiffFood();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_PACMAN: return createPattern_DiffPacman();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GHOST: return createPattern_DiffGhost();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_SCOREBOARD: return createPattern_DiffScoreboard();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME: return createPattern_DiffGame();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME_GRIDNODES: return createPattern_DiffGame_gridnodes();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME_SCOREBOARD: return createPattern_DiffGame_scoreboard();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME_ENTITIES: return createPattern_DiffGame_entities();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS: return createPattern_DiffGame_domainspecificdiffs();
			case PacmanGoRuleMMPackage.PATTERN_DIFF_POSITIONABLE_ENTITY_ON: return createPattern_DiffPositionableEntity_on();
			case PacmanGoRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_GridNode createPattern_GridNode() {
		Pattern_GridNodeImpl pattern_GridNode = new Pattern_GridNodeImpl();
		return pattern_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Food createPattern_Food() {
		Pattern_FoodImpl pattern_Food = new Pattern_FoodImpl();
		return pattern_Food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Pacman createPattern_Pacman() {
		Pattern_PacmanImpl pattern_Pacman = new Pattern_PacmanImpl();
		return pattern_Pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Ghost createPattern_Ghost() {
		Pattern_GhostImpl pattern_Ghost = new Pattern_GhostImpl();
		return pattern_Ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Scoreboard createPattern_Scoreboard() {
		Pattern_ScoreboardImpl pattern_Scoreboard = new Pattern_ScoreboardImpl();
		return pattern_Scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_Game createPattern_Game() {
		Pattern_GameImpl pattern_Game = new Pattern_GameImpl();
		return pattern_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff() {
		Pattern_DomainSpecificDiffImpl pattern_DomainSpecificDiff = new Pattern_DomainSpecificDiffImpl();
		return pattern_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGridNode createPattern_DiffGridNode() {
		Pattern_DiffGridNodeImpl pattern_DiffGridNode = new Pattern_DiffGridNodeImpl();
		return pattern_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGridNode_up createPattern_DiffGridNode_up() {
		Pattern_DiffGridNode_upImpl pattern_DiffGridNode_up = new Pattern_DiffGridNode_upImpl();
		return pattern_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGridNode_bottom createPattern_DiffGridNode_bottom() {
		Pattern_DiffGridNode_bottomImpl pattern_DiffGridNode_bottom = new Pattern_DiffGridNode_bottomImpl();
		return pattern_DiffGridNode_bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGridNode_left createPattern_DiffGridNode_left() {
		Pattern_DiffGridNode_leftImpl pattern_DiffGridNode_left = new Pattern_DiffGridNode_leftImpl();
		return pattern_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGridNode_right createPattern_DiffGridNode_right() {
		Pattern_DiffGridNode_rightImpl pattern_DiffGridNode_right = new Pattern_DiffGridNode_rightImpl();
		return pattern_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffFood createPattern_DiffFood() {
		Pattern_DiffFoodImpl pattern_DiffFood = new Pattern_DiffFoodImpl();
		return pattern_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffPacman createPattern_DiffPacman() {
		Pattern_DiffPacmanImpl pattern_DiffPacman = new Pattern_DiffPacmanImpl();
		return pattern_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGhost createPattern_DiffGhost() {
		Pattern_DiffGhostImpl pattern_DiffGhost = new Pattern_DiffGhostImpl();
		return pattern_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffScoreboard createPattern_DiffScoreboard() {
		Pattern_DiffScoreboardImpl pattern_DiffScoreboard = new Pattern_DiffScoreboardImpl();
		return pattern_DiffScoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGame createPattern_DiffGame() {
		Pattern_DiffGameImpl pattern_DiffGame = new Pattern_DiffGameImpl();
		return pattern_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGame_gridnodes createPattern_DiffGame_gridnodes() {
		Pattern_DiffGame_gridnodesImpl pattern_DiffGame_gridnodes = new Pattern_DiffGame_gridnodesImpl();
		return pattern_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGame_scoreboard createPattern_DiffGame_scoreboard() {
		Pattern_DiffGame_scoreboardImpl pattern_DiffGame_scoreboard = new Pattern_DiffGame_scoreboardImpl();
		return pattern_DiffGame_scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGame_entities createPattern_DiffGame_entities() {
		Pattern_DiffGame_entitiesImpl pattern_DiffGame_entities = new Pattern_DiffGame_entitiesImpl();
		return pattern_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffGame_domainspecificdiffs createPattern_DiffGame_domainspecificdiffs() {
		Pattern_DiffGame_domainspecificdiffsImpl pattern_DiffGame_domainspecificdiffs = new Pattern_DiffGame_domainspecificdiffsImpl();
		return pattern_DiffGame_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffPositionableEntity_on createPattern_DiffPositionableEntity_on() {
		Pattern_DiffPositionableEntity_onImpl pattern_DiffPositionableEntity_on = new Pattern_DiffPositionableEntity_onImpl();
		return pattern_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacmanGoRuleMMPackage getPacmanGoRuleMMPackage() {
		return (PacmanGoRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanGoRuleMMPackage getPackage() {
		return PacmanGoRuleMMPackage.eINSTANCE;
	}

} //PacmanGoRuleMMFactoryImpl
