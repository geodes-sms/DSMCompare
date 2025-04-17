/**
 */
package pacman2WayRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pacman2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pacman2WayRuleMMFactoryImpl extends EFactoryImpl implements Pacman2WayRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pacman2WayRuleMMFactory init() {
		try {
			Pacman2WayRuleMMFactory thePacman2WayRuleMMFactory = (Pacman2WayRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(Pacman2WayRuleMMPackage.eNS_URI);
			if (thePacman2WayRuleMMFactory != null) {
				return thePacman2WayRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pacman2WayRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayRuleMMFactoryImpl() {
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
			case Pacman2WayRuleMMPackage.PATTERN_GRID_NODE: return createPattern_GridNode();
			case Pacman2WayRuleMMPackage.PATTERN_FOOD: return createPattern_Food();
			case Pacman2WayRuleMMPackage.PATTERN_PACMAN: return createPattern_Pacman();
			case Pacman2WayRuleMMPackage.PATTERN_GHOST: return createPattern_Ghost();
			case Pacman2WayRuleMMPackage.PATTERN_GAME: return createPattern_Game();
			case Pacman2WayRuleMMPackage.PATTERN_FRUIT: return createPattern_Fruit();
			case Pacman2WayRuleMMPackage.PATTERN_ENERGIZER: return createPattern_Energizer();
			case Pacman2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case Pacman2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE: return createPattern_DiffGridNode();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP: return createPattern_DiffGridNode_up();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_DOWN: return createPattern_DiffGridNode_down();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_LEFT: return createPattern_DiffGridNode_left();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_RIGHT: return createPattern_DiffGridNode_right();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_FOOD: return createPattern_DiffFood();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_PACMAN: return createPattern_DiffPacman();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GHOST: return createPattern_DiffGhost();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME: return createPattern_DiffGame();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME_GRIDNODES: return createPattern_DiffGame_gridnodes();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME_ENTITIES: return createPattern_DiffGame_entities();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_POSITIONABLE_ENTITY_ON: return createPattern_DiffPositionableEntity_on();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_FRUIT: return createPattern_DiffFruit();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_ENERGIZER: return createPattern_DiffEnergizer();
			case Pacman2WayRuleMMPackage.PATTERN_LIST_EINT: return createPattern__ListEInt();
			case Pacman2WayRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode createPattern_GridNode() {
		Pattern_GridNodeImpl pattern_GridNode = new Pattern_GridNodeImpl();
		return pattern_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Food createPattern_Food() {
		Pattern_FoodImpl pattern_Food = new Pattern_FoodImpl();
		return pattern_Food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Pacman createPattern_Pacman() {
		Pattern_PacmanImpl pattern_Pacman = new Pattern_PacmanImpl();
		return pattern_Pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Ghost createPattern_Ghost() {
		Pattern_GhostImpl pattern_Ghost = new Pattern_GhostImpl();
		return pattern_Ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Game createPattern_Game() {
		Pattern_GameImpl pattern_Game = new Pattern_GameImpl();
		return pattern_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Fruit createPattern_Fruit() {
		Pattern_FruitImpl pattern_Fruit = new Pattern_FruitImpl();
		return pattern_Fruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Energizer createPattern_Energizer() {
		Pattern_EnergizerImpl pattern_Energizer = new Pattern_EnergizerImpl();
		return pattern_Energizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticDiff createPattern_SemanticDiff() {
		Pattern_SemanticDiffImpl pattern_SemanticDiff = new Pattern_SemanticDiffImpl();
		return pattern_SemanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode createPattern_DiffGridNode() {
		Pattern_DiffGridNodeImpl pattern_DiffGridNode = new Pattern_DiffGridNodeImpl();
		return pattern_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_up createPattern_DiffGridNode_up() {
		Pattern_DiffGridNode_upImpl pattern_DiffGridNode_up = new Pattern_DiffGridNode_upImpl();
		return pattern_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_down createPattern_DiffGridNode_down() {
		Pattern_DiffGridNode_downImpl pattern_DiffGridNode_down = new Pattern_DiffGridNode_downImpl();
		return pattern_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_left createPattern_DiffGridNode_left() {
		Pattern_DiffGridNode_leftImpl pattern_DiffGridNode_left = new Pattern_DiffGridNode_leftImpl();
		return pattern_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_right createPattern_DiffGridNode_right() {
		Pattern_DiffGridNode_rightImpl pattern_DiffGridNode_right = new Pattern_DiffGridNode_rightImpl();
		return pattern_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffFood createPattern_DiffFood() {
		Pattern_DiffFoodImpl pattern_DiffFood = new Pattern_DiffFoodImpl();
		return pattern_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPacman createPattern_DiffPacman() {
		Pattern_DiffPacmanImpl pattern_DiffPacman = new Pattern_DiffPacmanImpl();
		return pattern_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGhost createPattern_DiffGhost() {
		Pattern_DiffGhostImpl pattern_DiffGhost = new Pattern_DiffGhostImpl();
		return pattern_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame createPattern_DiffGame() {
		Pattern_DiffGameImpl pattern_DiffGame = new Pattern_DiffGameImpl();
		return pattern_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame_gridnodes createPattern_DiffGame_gridnodes() {
		Pattern_DiffGame_gridnodesImpl pattern_DiffGame_gridnodes = new Pattern_DiffGame_gridnodesImpl();
		return pattern_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame_entities createPattern_DiffGame_entities() {
		Pattern_DiffGame_entitiesImpl pattern_DiffGame_entities = new Pattern_DiffGame_entitiesImpl();
		return pattern_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPositionableEntity_on createPattern_DiffPositionableEntity_on() {
		Pattern_DiffPositionableEntity_onImpl pattern_DiffPositionableEntity_on = new Pattern_DiffPositionableEntity_onImpl();
		return pattern_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffFruit createPattern_DiffFruit() {
		Pattern_DiffFruitImpl pattern_DiffFruit = new Pattern_DiffFruitImpl();
		return pattern_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEnergizer createPattern_DiffEnergizer() {
		Pattern_DiffEnergizerImpl pattern_DiffEnergizer = new Pattern_DiffEnergizerImpl();
		return pattern_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern__ListEInt createPattern__ListEInt() {
		Pattern__ListEIntImpl pattern__ListEInt = new Pattern__ListEIntImpl();
		return pattern__ListEInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayRuleMMPackage getPacman2WayRuleMMPackage() {
		return (Pacman2WayRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pacman2WayRuleMMPackage getPackage() {
		return Pacman2WayRuleMMPackage.eINSTANCE;
	}

} //Pacman2WayRuleMMFactoryImpl
