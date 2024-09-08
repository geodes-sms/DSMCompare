/**
 */
package pacman2WayRuleMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pacman2WayDiffMM.Pacman2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pacman2WayRuleMM.Pacman2WayRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface Pacman2WayRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacman2WayRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/pacman2WayRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacman2WayRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pacman2WayRuleMMPackage eINSTANCE = pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_GridNodeImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_GridNode()
	 * @generated
	 */
	int PATTERN_GRID_NODE = 0;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__UP = Pacman2WayDiffMMPackage.GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DOWN = Pacman2WayDiffMMPackage.GRID_NODE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__LEFT = Pacman2WayDiffMMPackage.GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__RIGHT = Pacman2WayDiffMMPackage.GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID = Pacman2WayDiffMMPackage.GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFUP = Pacman2WayDiffMMPackage.GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFDOWN = Pacman2WayDiffMMPackage.GRID_NODE__DIFFDOWN;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFLEFT = Pacman2WayDiffMMPackage.GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFRIGHT = Pacman2WayDiffMMPackage.GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID_PATTERN = Pacman2WayDiffMMPackage.GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__FILTER = Pacman2WayDiffMMPackage.GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__IS_FORBIDDEN = Pacman2WayDiffMMPackage.GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_FEATURE_COUNT = Pacman2WayDiffMMPackage.GRID_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_OPERATION_COUNT = Pacman2WayDiffMMPackage.GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_FoodImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Food()
	 * @generated
	 */
	int PATTERN_FOOD = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ON = Pacman2WayDiffMMPackage.FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID = Pacman2WayDiffMMPackage.FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__DIFFON = Pacman2WayDiffMMPackage.FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__VALUE = Pacman2WayDiffMMPackage.FOOD__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID_PATTERN = Pacman2WayDiffMMPackage.FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__FILTER = Pacman2WayDiffMMPackage.FOOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__IS_FORBIDDEN = Pacman2WayDiffMMPackage.FOOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_FEATURE_COUNT = Pacman2WayDiffMMPackage.FOOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_OPERATION_COUNT = Pacman2WayDiffMMPackage.FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_PacmanImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Pacman()
	 * @generated
	 */
	int PATTERN_PACMAN = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ON = Pacman2WayDiffMMPackage.PACMAN__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID = Pacman2WayDiffMMPackage.PACMAN__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__DIFFON = Pacman2WayDiffMMPackage.PACMAN__DIFFON;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__INITIAL_POSITION = Pacman2WayDiffMMPackage.PACMAN__INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID_PATTERN = Pacman2WayDiffMMPackage.PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__FILTER = Pacman2WayDiffMMPackage.PACMAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__IS_FORBIDDEN = Pacman2WayDiffMMPackage.PACMAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_FEATURE_COUNT = Pacman2WayDiffMMPackage.PACMAN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_OPERATION_COUNT = Pacman2WayDiffMMPackage.PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_GhostImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Ghost()
	 * @generated
	 */
	int PATTERN_GHOST = 3;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ON = Pacman2WayDiffMMPackage.GHOST__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID = Pacman2WayDiffMMPackage.GHOST__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__DIFFON = Pacman2WayDiffMMPackage.GHOST__DIFFON;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__STRATEGY = Pacman2WayDiffMMPackage.GHOST__STRATEGY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID_PATTERN = Pacman2WayDiffMMPackage.GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__FILTER = Pacman2WayDiffMMPackage.GHOST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__IS_FORBIDDEN = Pacman2WayDiffMMPackage.GHOST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_FEATURE_COUNT = Pacman2WayDiffMMPackage.GHOST_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_OPERATION_COUNT = Pacman2WayDiffMMPackage.GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_GameImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Game()
	 * @generated
	 */
	int PATTERN_GAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ID = Pacman2WayDiffMMPackage.GAME__ID;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__LIVES = Pacman2WayDiffMMPackage.GAME__LIVES;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__SCORE = Pacman2WayDiffMMPackage.GAME__SCORE;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__GRIDNODES = Pacman2WayDiffMMPackage.GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ENTITIES = Pacman2WayDiffMMPackage.GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.GAME__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__SEMANTICCONFLICTS = Pacman2WayDiffMMPackage.GAME__SEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFGRIDNODES = Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFENTITIES = Pacman2WayDiffMMPackage.GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFDOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffsemanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFSEMANTICCONFLICTS = Pacman2WayDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ID_PATTERN = Pacman2WayDiffMMPackage.GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__FILTER = Pacman2WayDiffMMPackage.GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__IS_FORBIDDEN = Pacman2WayDiffMMPackage.GAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_FEATURE_COUNT = Pacman2WayDiffMMPackage.GAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_OPERATION_COUNT = Pacman2WayDiffMMPackage.GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_PositionableEntityImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_PositionableEntity()
	 * @generated
	 */
	int PATTERN_POSITIONABLE_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ON = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__DIFFON = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID_PATTERN = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__FILTER = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT = Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_FruitImpl <em>Pattern Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_FruitImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Fruit()
	 * @generated
	 */
	int PATTERN_FRUIT = 6;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ON = Pacman2WayDiffMMPackage.FRUIT__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ID = Pacman2WayDiffMMPackage.FRUIT__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__DIFFON = Pacman2WayDiffMMPackage.FRUIT__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__VALUE = Pacman2WayDiffMMPackage.FRUIT__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ID_PATTERN = Pacman2WayDiffMMPackage.FRUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__FILTER = Pacman2WayDiffMMPackage.FRUIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__IS_FORBIDDEN = Pacman2WayDiffMMPackage.FRUIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT_FEATURE_COUNT = Pacman2WayDiffMMPackage.FRUIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT_OPERATION_COUNT = Pacman2WayDiffMMPackage.FRUIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_EnergizerImpl <em>Pattern Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_EnergizerImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Energizer()
	 * @generated
	 */
	int PATTERN_ENERGIZER = 7;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ON = Pacman2WayDiffMMPackage.ENERGIZER__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ID = Pacman2WayDiffMMPackage.ENERGIZER__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__DIFFON = Pacman2WayDiffMMPackage.ENERGIZER__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__VALUE = Pacman2WayDiffMMPackage.ENERGIZER__VALUE;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__DURATIONS = Pacman2WayDiffMMPackage.ENERGIZER__DURATIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ID_PATTERN = Pacman2WayDiffMMPackage.ENERGIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__FILTER = Pacman2WayDiffMMPackage.ENERGIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__IS_FORBIDDEN = Pacman2WayDiffMMPackage.ENERGIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER_FEATURE_COUNT = Pacman2WayDiffMMPackage.ENERGIZER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER_OPERATION_COUNT = Pacman2WayDiffMMPackage.ENERGIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DomainSpecificDiff()
	 * @generated
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game domainspecificdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = Pacman2WayDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game domainspecificdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Domain Specific Diff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__FILTER = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNodeImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE = 10;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__UP = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DOWN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__LEFT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__RIGHT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFUP = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFDOWN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFFDOWN;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFLEFT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFRIGHT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__FILTER = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_up()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_UP = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ETYPE = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__FILTER = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_downImpl <em>Pattern Diff Grid Node down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_downImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_down()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN = 12;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__ETYPE = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__FILTER = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_leftImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_left()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ETYPE = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__FILTER = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_rightImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_right()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT = 14;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ETYPE = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__FILTER = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffFoodImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffFood()
	 * @generated
	 */
	int PATTERN_DIFF_FOOD = 15;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ON = Pacman2WayDiffMMPackage.DIFF_FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID = Pacman2WayDiffMMPackage.DIFF_FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFFON = Pacman2WayDiffMMPackage.DIFF_FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__VALUE = Pacman2WayDiffMMPackage.DIFF_FOOD__VALUE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_FOOD__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_VALUE = Pacman2WayDiffMMPackage.DIFF_FOOD__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__FILTER = Pacman2WayDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffPacmanImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffPacman()
	 * @generated
	 */
	int PATTERN_DIFF_PACMAN = 16;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ON = Pacman2WayDiffMMPackage.DIFF_PACMAN__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID = Pacman2WayDiffMMPackage.DIFF_PACMAN__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFFON = Pacman2WayDiffMMPackage.DIFF_PACMAN__DIFFON;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__INITIAL_POSITION = Pacman2WayDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_PACMAN__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION = Pacman2WayDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__FILTER = Pacman2WayDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGhostImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGhost()
	 * @generated
	 */
	int PATTERN_DIFF_GHOST = 17;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ON = Pacman2WayDiffMMPackage.DIFF_GHOST__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID = Pacman2WayDiffMMPackage.DIFF_GHOST__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFFON = Pacman2WayDiffMMPackage.DIFF_GHOST__DIFFON;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__STRATEGY = Pacman2WayDiffMMPackage.DIFF_GHOST__STRATEGY;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_STRATEGY = Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__FILTER = Pacman2WayDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGameImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame()
	 * @generated
	 */
	int PATTERN_DIFF_GAME = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID = Pacman2WayDiffMMPackage.DIFF_GAME__ID;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__LIVES = Pacman2WayDiffMMPackage.DIFF_GAME__LIVES;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__SCORE = Pacman2WayDiffMMPackage.DIFF_GAME__SCORE;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__GRIDNODES = Pacman2WayDiffMMPackage.DIFF_GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ENTITIES = Pacman2WayDiffMMPackage.DIFF_GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.DIFF_GAME__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__SEMANTICCONFLICTS = Pacman2WayDiffMMPackage.DIFF_GAME__SEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFGRIDNODES = Pacman2WayDiffMMPackage.DIFF_GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFENTITIES = Pacman2WayDiffMMPackage.DIFF_GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFDOMAINSPECIFICDIFFS = Pacman2WayDiffMMPackage.DIFF_GAME__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffsemanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFSEMANTICCONFLICTS = Pacman2WayDiffMMPackage.DIFF_GAME__DIFFSEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GAME__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_LIVES = Pacman2WayDiffMMPackage.DIFF_GAME__NEW_LIVES;

	/**
	 * The feature id for the '<em><b>New score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_SCORE = Pacman2WayDiffMMPackage.DIFF_GAME__NEW_SCORE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__FILTER = Pacman2WayDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_gridnodesImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_GRIDNODES = 19;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ETYPE = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__FILTER = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_entitiesImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_entities()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_ENTITIES = 20;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ETYPE = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__FILTER = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl <em>Pattern Diff Game domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS = 21;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__FILTER = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_semanticconflictsImpl <em>Pattern Diff Game semanticconflicts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_semanticconflictsImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_semanticconflicts()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS = 22;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS__ETYPE = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS__FILTER = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SEMANTICCONFLICTS_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON = 23;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ETYPE = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffFruitImpl <em>Pattern Diff Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffFruitImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffFruit()
	 * @generated
	 */
	int PATTERN_DIFF_FRUIT = 24;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ON = Pacman2WayDiffMMPackage.DIFF_FRUIT__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ID = Pacman2WayDiffMMPackage.DIFF_FRUIT__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__DIFFON = Pacman2WayDiffMMPackage.DIFF_FRUIT__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__VALUE = Pacman2WayDiffMMPackage.DIFF_FRUIT__VALUE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_FRUIT__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_VALUE = Pacman2WayDiffMMPackage.DIFF_FRUIT__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_FRUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__FILTER = Pacman2WayDiffMMPackage.DIFF_FRUIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_FRUIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_FRUIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_FRUIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern_DiffEnergizerImpl <em>Pattern Diff Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern_DiffEnergizerImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffEnergizer()
	 * @generated
	 */
	int PATTERN_DIFF_ENERGIZER = 25;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ON = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ID = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DIFFON = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__VALUE = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__VALUE;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DURATIONS = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DURATIONS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DIFF_KIND = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_VALUE = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New durations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_DURATIONS = Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ID_PATTERN = Pacman2WayDiffMMPackage.DIFF_ENERGIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__FILTER = Pacman2WayDiffMMPackage.DIFF_ENERGIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__IS_FORBIDDEN = Pacman2WayDiffMMPackage.DIFF_ENERGIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER_FEATURE_COUNT = Pacman2WayDiffMMPackage.DIFF_ENERGIZER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER_OPERATION_COUNT = Pacman2WayDiffMMPackage.DIFF_ENERGIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.Pattern__ListEIntImpl <em>Pattern List EInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.Pattern__ListEIntImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern__ListEInt()
	 * @generated
	 */
	int PATTERN_LIST_EINT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__VALUE = Pacman2WayDiffMMPackage._LIST_EINT__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__ID_PATTERN = Pacman2WayDiffMMPackage._LIST_EINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__FILTER = Pacman2WayDiffMMPackage._LIST_EINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__IS_FORBIDDEN = Pacman2WayDiffMMPackage._LIST_EINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT_FEATURE_COUNT = Pacman2WayDiffMMPackage._LIST_EINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT_OPERATION_COUNT = Pacman2WayDiffMMPackage._LIST_EINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayRuleMM.impl.RuleImpl
	 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Grid Node</em>'.
	 * @see pacman2WayRuleMM.Pattern_GridNode
	 * @generated
	 */
	EClass getPattern_GridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_GridNode#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_GridNode#getID_Pattern()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_GridNode#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_GridNode#isFilter()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_GridNode#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_GridNode#isIsForbidden()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Food</em>'.
	 * @see pacman2WayRuleMM.Pattern_Food
	 * @generated
	 */
	EClass getPattern_Food();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Food#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Food#getID_Pattern()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Food#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Food#isFilter()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Food#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Food#isIsForbidden()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Pacman</em>'.
	 * @see pacman2WayRuleMM.Pattern_Pacman
	 * @generated
	 */
	EClass getPattern_Pacman();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Pacman#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Pacman#getID_Pattern()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Pacman#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Pacman#isFilter()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Pacman#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Pacman#isIsForbidden()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Ghost</em>'.
	 * @see pacman2WayRuleMM.Pattern_Ghost
	 * @generated
	 */
	EClass getPattern_Ghost();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Ghost#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Ghost#getID_Pattern()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Ghost#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Ghost#isFilter()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Ghost#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Ghost#isIsForbidden()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Game</em>'.
	 * @see pacman2WayRuleMM.Pattern_Game
	 * @generated
	 */
	EClass getPattern_Game();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Game#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Game#getID_Pattern()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Game#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Game#isFilter()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Game#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Game#isIsForbidden()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Positionable Entity</em>'.
	 * @see pacman2WayRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	EClass getPattern_PositionableEntity();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_PositionableEntity#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_PositionableEntity#getID_Pattern()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_PositionableEntity#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_PositionableEntity#isFilter()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_PositionableEntity#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_PositionableEntity#isIsForbidden()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Fruit <em>Pattern Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Fruit</em>'.
	 * @see pacman2WayRuleMM.Pattern_Fruit
	 * @generated
	 */
	EClass getPattern_Fruit();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Fruit#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Fruit#getID_Pattern()
	 * @see #getPattern_Fruit()
	 * @generated
	 */
	EAttribute getPattern_Fruit_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Fruit#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Fruit#isFilter()
	 * @see #getPattern_Fruit()
	 * @generated
	 */
	EAttribute getPattern_Fruit_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Fruit#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Fruit#isIsForbidden()
	 * @see #getPattern_Fruit()
	 * @generated
	 */
	EAttribute getPattern_Fruit_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_Energizer <em>Pattern Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Energizer</em>'.
	 * @see pacman2WayRuleMM.Pattern_Energizer
	 * @generated
	 */
	EClass getPattern_Energizer();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Energizer#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_Energizer#getID_Pattern()
	 * @see #getPattern_Energizer()
	 * @generated
	 */
	EAttribute getPattern_Energizer_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Energizer#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_Energizer#isFilter()
	 * @see #getPattern_Energizer()
	 * @generated
	 */
	EAttribute getPattern_Energizer_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_Energizer#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_Energizer#isIsForbidden()
	 * @see #getPattern_Energizer()
	 * @generated
	 */
	EAttribute getPattern_Energizer_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see pacman2WayRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DomainSpecificDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DomainSpecificDiff#isFilter()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DomainSpecificDiff#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DomainSpecificDiff#isIsForbidden()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see pacman2WayRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_SemanticConflict#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_SemanticConflict#getID_Pattern()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_SemanticConflict#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_SemanticConflict#isFilter()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_SemanticConflict#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_SemanticConflict#isIsForbidden()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	EClass getPattern_DiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode#getID_Pattern()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode#isFilter()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode#isIsForbidden()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node up</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	EClass getPattern_DiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_up#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_up#getID_Pattern()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_up#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_up#isFilter()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_up#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_up#isIsForbidden()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_down <em>Pattern Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node down</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_down
	 * @generated
	 */
	EClass getPattern_DiffGridNode_down();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_down#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_down#getID_Pattern()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_down#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_down#isFilter()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_down#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_down#isIsForbidden()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node left</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	EClass getPattern_DiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_left#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_left#getID_Pattern()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_left#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_left#isFilter()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_left#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_left#isIsForbidden()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node right</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	EClass getPattern_DiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_right#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_right#getID_Pattern()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_right#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_right#isFilter()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGridNode_right#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGridNode_right#isIsForbidden()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Food</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFood
	 * @generated
	 */
	EClass getPattern_DiffFood();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFood#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFood#getID_Pattern()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFood#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFood#isFilter()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFood#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFood#isIsForbidden()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Pacman</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	EClass getPattern_DiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPacman#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPacman#getID_Pattern()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPacman#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPacman#isFilter()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPacman#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPacman#isIsForbidden()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Ghost</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	EClass getPattern_DiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGhost#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGhost#getID_Pattern()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGhost#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGhost#isFilter()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGhost#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGhost#isIsForbidden()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame
	 * @generated
	 */
	EClass getPattern_DiffGame();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame#getID_Pattern()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame#isFilter()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame#isIsForbidden()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game gridnodes</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	EClass getPattern_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_gridnodes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_gridnodes#isFilter()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_gridnodes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_gridnodes#isIsForbidden()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game entities</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	EClass getPattern_DiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_entities#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_entities#getID_Pattern()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_entities#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_entities#isFilter()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_entities#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_entities#isIsForbidden()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs <em>Pattern Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game domainspecificdiffs</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#isFilter()
	 * @see #getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_domainspecificdiffs_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_domainspecificdiffs#isIsForbidden()
	 * @see #getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_domainspecificdiffs_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts <em>Pattern Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game semanticconflicts</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts
	 * @generated
	 */
	EClass getPattern_DiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#getID_Pattern()
	 * @see #getPattern_DiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_semanticconflicts_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#isFilter()
	 * @see #getPattern_DiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_semanticconflicts_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffGame_semanticconflicts#isIsForbidden()
	 * @see #getPattern_DiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_semanticconflicts_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Positionable Entity on</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	EClass getPattern_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#isFilter()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffFruit <em>Pattern Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Fruit</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFruit
	 * @generated
	 */
	EClass getPattern_DiffFruit();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFruit#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFruit#getID_Pattern()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFruit#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFruit#isFilter()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffFruit#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffFruit#isIsForbidden()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern_DiffEnergizer <em>Pattern Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Energizer</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffEnergizer
	 * @generated
	 */
	EClass getPattern_DiffEnergizer();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffEnergizer#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffEnergizer#getID_Pattern()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffEnergizer#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffEnergizer#isFilter()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern_DiffEnergizer#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern_DiffEnergizer#isIsForbidden()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Pattern__ListEInt <em>Pattern List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern List EInt</em>'.
	 * @see pacman2WayRuleMM.Pattern__ListEInt
	 * @generated
	 */
	EClass getPattern__ListEInt();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern__ListEInt#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacman2WayRuleMM.Pattern__ListEInt#getID_Pattern()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern__ListEInt#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacman2WayRuleMM.Pattern__ListEInt#isFilter()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Pattern__ListEInt#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacman2WayRuleMM.Pattern__ListEInt#isIsForbidden()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_IsForbidden();

	/**
	 * Returns the meta object for class '{@link pacman2WayRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see pacman2WayRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacman2WayRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pacman2WayRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see pacman2WayRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link pacman2WayRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see pacman2WayRuleMM.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pacman2WayRuleMMFactory getPacman2WayRuleMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_GridNodeImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_GridNode()
		 * @generated
		 */
		EClass PATTERN_GRID_NODE = eINSTANCE.getPattern_GridNode();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GRID_NODE__ID_PATTERN = eINSTANCE.getPattern_GridNode_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GRID_NODE__FILTER = eINSTANCE.getPattern_GridNode_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GRID_NODE__IS_FORBIDDEN = eINSTANCE.getPattern_GridNode_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_FoodImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Food()
		 * @generated
		 */
		EClass PATTERN_FOOD = eINSTANCE.getPattern_Food();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FOOD__ID_PATTERN = eINSTANCE.getPattern_Food_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FOOD__FILTER = eINSTANCE.getPattern_Food_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FOOD__IS_FORBIDDEN = eINSTANCE.getPattern_Food_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_PacmanImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Pacman()
		 * @generated
		 */
		EClass PATTERN_PACMAN = eINSTANCE.getPattern_Pacman();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PACMAN__ID_PATTERN = eINSTANCE.getPattern_Pacman_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PACMAN__FILTER = eINSTANCE.getPattern_Pacman_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PACMAN__IS_FORBIDDEN = eINSTANCE.getPattern_Pacman_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_GhostImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Ghost()
		 * @generated
		 */
		EClass PATTERN_GHOST = eINSTANCE.getPattern_Ghost();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GHOST__ID_PATTERN = eINSTANCE.getPattern_Ghost_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GHOST__FILTER = eINSTANCE.getPattern_Ghost_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GHOST__IS_FORBIDDEN = eINSTANCE.getPattern_Ghost_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_GameImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Game()
		 * @generated
		 */
		EClass PATTERN_GAME = eINSTANCE.getPattern_Game();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__ID_PATTERN = eINSTANCE.getPattern_Game_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__FILTER = eINSTANCE.getPattern_Game_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__IS_FORBIDDEN = eINSTANCE.getPattern_Game_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_PositionableEntityImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_PositionableEntity()
		 * @generated
		 */
		EClass PATTERN_POSITIONABLE_ENTITY = eINSTANCE.getPattern_PositionableEntity();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_POSITIONABLE_ENTITY__ID_PATTERN = eINSTANCE.getPattern_PositionableEntity_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_POSITIONABLE_ENTITY__FILTER = eINSTANCE.getPattern_PositionableEntity_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN = eINSTANCE.getPattern_PositionableEntity_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_FruitImpl <em>Pattern Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_FruitImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Fruit()
		 * @generated
		 */
		EClass PATTERN_FRUIT = eINSTANCE.getPattern_Fruit();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FRUIT__ID_PATTERN = eINSTANCE.getPattern_Fruit_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FRUIT__FILTER = eINSTANCE.getPattern_Fruit_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FRUIT__IS_FORBIDDEN = eINSTANCE.getPattern_Fruit_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_EnergizerImpl <em>Pattern Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_EnergizerImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_Energizer()
		 * @generated
		 */
		EClass PATTERN_ENERGIZER = eINSTANCE.getPattern_Energizer();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENERGIZER__ID_PATTERN = eINSTANCE.getPattern_Energizer_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENERGIZER__FILTER = eINSTANCE.getPattern_Energizer_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENERGIZER__IS_FORBIDDEN = eINSTANCE.getPattern_Energizer_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DomainSpecificDiff()
		 * @generated
		 */
		EClass PATTERN_DOMAIN_SPECIFIC_DIFF = eINSTANCE.getPattern_DomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_DomainSpecificDiff_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = eINSTANCE.getPattern_DomainSpecificDiff_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__IS_FORBIDDEN = eINSTANCE.getPattern_DomainSpecificDiff_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = eINSTANCE.getPattern_SemanticConflict_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__FILTER = eINSTANCE.getPattern_SemanticConflict_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticConflict_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNodeImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE = eINSTANCE.getPattern_DiffGridNode();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__FILTER = eINSTANCE.getPattern_DiffGridNode_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_up()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE_UP = eINSTANCE.getPattern_DiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_up_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__FILTER = eINSTANCE.getPattern_DiffGridNode_up_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_up_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_downImpl <em>Pattern Diff Grid Node down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_downImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_down()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE_DOWN = eINSTANCE.getPattern_DiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_down_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__FILTER = eINSTANCE.getPattern_DiffGridNode_down_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_down_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_leftImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_left()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE_LEFT = eINSTANCE.getPattern_DiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_left_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__FILTER = eINSTANCE.getPattern_DiffGridNode_left_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_left_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGridNode_rightImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGridNode_right()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE_RIGHT = eINSTANCE.getPattern_DiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_right_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__FILTER = eINSTANCE.getPattern_DiffGridNode_right_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_right_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffFoodImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffFood()
		 * @generated
		 */
		EClass PATTERN_DIFF_FOOD = eINSTANCE.getPattern_DiffFood();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__ID_PATTERN = eINSTANCE.getPattern_DiffFood_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__FILTER = eINSTANCE.getPattern_DiffFood_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__IS_FORBIDDEN = eINSTANCE.getPattern_DiffFood_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffPacmanImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffPacman()
		 * @generated
		 */
		EClass PATTERN_DIFF_PACMAN = eINSTANCE.getPattern_DiffPacman();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__ID_PATTERN = eINSTANCE.getPattern_DiffPacman_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__FILTER = eINSTANCE.getPattern_DiffPacman_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPacman_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGhostImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGhost()
		 * @generated
		 */
		EClass PATTERN_DIFF_GHOST = eINSTANCE.getPattern_DiffGhost();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__ID_PATTERN = eINSTANCE.getPattern_DiffGhost_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__FILTER = eINSTANCE.getPattern_DiffGhost_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGhost_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGameImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME = eINSTANCE.getPattern_DiffGame();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__ID_PATTERN = eINSTANCE.getPattern_DiffGame_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__FILTER = eINSTANCE.getPattern_DiffGame_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_gridnodesImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME_GRIDNODES = eINSTANCE.getPattern_DiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN = eINSTANCE.getPattern_DiffGame_gridnodes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__FILTER = eINSTANCE.getPattern_DiffGame_gridnodes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_gridnodes_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_entitiesImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_entities()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME_ENTITIES = eINSTANCE.getPattern_DiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN = eINSTANCE.getPattern_DiffGame_entities_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__FILTER = eINSTANCE.getPattern_DiffGame_entities_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_entities_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl <em>Pattern Diff Game domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_domainspecificdiffs()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getPattern_DiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ID_PATTERN = eINSTANCE.getPattern_DiffGame_domainspecificdiffs_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__FILTER = eINSTANCE.getPattern_DiffGame_domainspecificdiffs_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_domainspecificdiffs_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffGame_semanticconflictsImpl <em>Pattern Diff Game semanticconflicts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffGame_semanticconflictsImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffGame_semanticconflicts()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME_SEMANTICCONFLICTS = eINSTANCE.getPattern_DiffGame_semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_SEMANTICCONFLICTS__ID_PATTERN = eINSTANCE.getPattern_DiffGame_semanticconflicts_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_SEMANTICCONFLICTS__FILTER = eINSTANCE.getPattern_DiffGame_semanticconflicts_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_SEMANTICCONFLICTS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_semanticconflicts_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
		 * @generated
		 */
		EClass PATTERN_DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getPattern_DiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN = eINSTANCE.getPattern_DiffPositionableEntity_on_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER = eINSTANCE.getPattern_DiffPositionableEntity_on_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPositionableEntity_on_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffFruitImpl <em>Pattern Diff Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffFruitImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffFruit()
		 * @generated
		 */
		EClass PATTERN_DIFF_FRUIT = eINSTANCE.getPattern_DiffFruit();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__ID_PATTERN = eINSTANCE.getPattern_DiffFruit_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__FILTER = eINSTANCE.getPattern_DiffFruit_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__IS_FORBIDDEN = eINSTANCE.getPattern_DiffFruit_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern_DiffEnergizerImpl <em>Pattern Diff Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern_DiffEnergizerImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern_DiffEnergizer()
		 * @generated
		 */
		EClass PATTERN_DIFF_ENERGIZER = eINSTANCE.getPattern_DiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__ID_PATTERN = eINSTANCE.getPattern_DiffEnergizer_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__FILTER = eINSTANCE.getPattern_DiffEnergizer_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEnergizer_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.Pattern__ListEIntImpl <em>Pattern List EInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.Pattern__ListEIntImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getPattern__ListEInt()
		 * @generated
		 */
		EClass PATTERN_LIST_EINT = eINSTANCE.getPattern__ListEInt();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST_EINT__ID_PATTERN = eINSTANCE.getPattern__ListEInt_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST_EINT__FILTER = eINSTANCE.getPattern__ListEInt_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST_EINT__IS_FORBIDDEN = eINSTANCE.getPattern__ListEInt_IsForbidden();

		/**
		 * The meta object literal for the '{@link pacman2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayRuleMM.impl.RuleImpl
		 * @see pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONSTRAINTS = eINSTANCE.getRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

	}

} //Pacman2WayRuleMMPackage
