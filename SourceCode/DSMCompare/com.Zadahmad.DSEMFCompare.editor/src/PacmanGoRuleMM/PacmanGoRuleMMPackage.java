/**
 */
package PacmanGoRuleMM;

import PacmanGoDiffMM.PacmanGoDiffMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see PacmanGoRuleMM.PacmanGoRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanGoRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PacmanGoRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/PacmanGoRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PacmanGoRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanGoRuleMMPackage eINSTANCE = PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_GridNodeImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_GridNode()
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
	int PATTERN_GRID_NODE__UP = PacmanGoDiffMMPackage.GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__BOTTOM = PacmanGoDiffMMPackage.GRID_NODE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__LEFT = PacmanGoDiffMMPackage.GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__RIGHT = PacmanGoDiffMMPackage.GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID = PacmanGoDiffMMPackage.GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFUP = PacmanGoDiffMMPackage.GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffbottom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFBOTTOM = PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFLEFT = PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFRIGHT = PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID_PATTERN = PacmanGoDiffMMPackage.GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__FILTER = PacmanGoDiffMMPackage.GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_FEATURE_COUNT = PacmanGoDiffMMPackage.GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_OPERATION_COUNT = PacmanGoDiffMMPackage.GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_FoodImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Food()
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
	int PATTERN_FOOD__ON = PacmanGoDiffMMPackage.FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID = PacmanGoDiffMMPackage.FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__DIFFON = PacmanGoDiffMMPackage.FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID_PATTERN = PacmanGoDiffMMPackage.FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__FILTER = PacmanGoDiffMMPackage.FOOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_FEATURE_COUNT = PacmanGoDiffMMPackage.FOOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_OPERATION_COUNT = PacmanGoDiffMMPackage.FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_PacmanImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Pacman()
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
	int PATTERN_PACMAN__ON = PacmanGoDiffMMPackage.PACMAN__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID = PacmanGoDiffMMPackage.PACMAN__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__DIFFON = PacmanGoDiffMMPackage.PACMAN__DIFFON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID_PATTERN = PacmanGoDiffMMPackage.PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__FILTER = PacmanGoDiffMMPackage.PACMAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_FEATURE_COUNT = PacmanGoDiffMMPackage.PACMAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_OPERATION_COUNT = PacmanGoDiffMMPackage.PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_GhostImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Ghost()
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
	int PATTERN_GHOST__ON = PacmanGoDiffMMPackage.GHOST__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID = PacmanGoDiffMMPackage.GHOST__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__DIFFON = PacmanGoDiffMMPackage.GHOST__DIFFON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID_PATTERN = PacmanGoDiffMMPackage.GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__FILTER = PacmanGoDiffMMPackage.GHOST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_FEATURE_COUNT = PacmanGoDiffMMPackage.GHOST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_OPERATION_COUNT = PacmanGoDiffMMPackage.GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_ScoreboardImpl <em>Pattern Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_ScoreboardImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Scoreboard()
	 * @generated
	 */
	int PATTERN_SCOREBOARD = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD__VALUE = PacmanGoDiffMMPackage.SCOREBOARD__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD__ID = PacmanGoDiffMMPackage.SCOREBOARD__ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD__ID_PATTERN = PacmanGoDiffMMPackage.SCOREBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD__FILTER = PacmanGoDiffMMPackage.SCOREBOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD_FEATURE_COUNT = PacmanGoDiffMMPackage.SCOREBOARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCOREBOARD_OPERATION_COUNT = PacmanGoDiffMMPackage.SCOREBOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_GameImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Game()
	 * @generated
	 */
	int PATTERN_GAME = 5;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__GRIDNODES = PacmanGoDiffMMPackage.GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__SCOREBOARD = PacmanGoDiffMMPackage.GAME__SCOREBOARD;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ENTITIES = PacmanGoDiffMMPackage.GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DOMAINSPECIFICDIFFS = PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFGRIDNODES = PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffscoreboard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFSCOREBOARD = PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFENTITIES = PacmanGoDiffMMPackage.GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFDOMAINSPECIFICDIFFS = PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ID_PATTERN = PacmanGoDiffMMPackage.GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__FILTER = PacmanGoDiffMMPackage.GAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_FEATURE_COUNT = PacmanGoDiffMMPackage.GAME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_OPERATION_COUNT = PacmanGoDiffMMPackage.GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_PositionableEntityImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_PositionableEntity()
	 * @generated
	 */
	int PATTERN_POSITIONABLE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ON = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__DIFFON = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID_PATTERN = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__FILTER = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT = PacmanGoDiffMMPackage.POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DomainSpecificDiff()
	 * @generated
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Scoreboard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNodeImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE = 8;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__UP = PacmanGoDiffMMPackage.DIFF_GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__BOTTOM = PacmanGoDiffMMPackage.DIFF_GRID_NODE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__LEFT = PacmanGoDiffMMPackage.DIFF_GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__RIGHT = PacmanGoDiffMMPackage.DIFF_GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID = PacmanGoDiffMMPackage.DIFF_GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFUP = PacmanGoDiffMMPackage.DIFF_GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffbottom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFBOTTOM = PacmanGoDiffMMPackage.DIFF_GRID_NODE__DIFFBOTTOM;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFLEFT = PacmanGoDiffMMPackage.DIFF_GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFRIGHT = PacmanGoDiffMMPackage.DIFF_GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__OPERATION = PacmanGoDiffMMPackage.DIFF_GRID_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__NEW_ID = PacmanGoDiffMMPackage.DIFF_GRID_NODE__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__FILTER = PacmanGoDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_upImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_up()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_UP = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__OPERATION = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ETYPE = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__FILTER = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_bottomImpl <em>Pattern Diff Grid Node bottom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_bottomImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_bottom()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM = 10;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM__OPERATION = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM__ETYPE = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM__FILTER = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node bottom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node bottom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_BOTTOM_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_leftImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_left()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__OPERATION = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ETYPE = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__FILTER = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_rightImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_right()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__OPERATION = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ETYPE = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__FILTER = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffFoodImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffFood()
	 * @generated
	 */
	int PATTERN_DIFF_FOOD = 13;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ON = PacmanGoDiffMMPackage.DIFF_FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID = PacmanGoDiffMMPackage.DIFF_FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFFON = PacmanGoDiffMMPackage.DIFF_FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__OPERATION = PacmanGoDiffMMPackage.DIFF_FOOD__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_ID = PacmanGoDiffMMPackage.DIFF_FOOD__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__FILTER = PacmanGoDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_FOOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffPacmanImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffPacman()
	 * @generated
	 */
	int PATTERN_DIFF_PACMAN = 14;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ON = PacmanGoDiffMMPackage.DIFF_PACMAN__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID = PacmanGoDiffMMPackage.DIFF_PACMAN__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFFON = PacmanGoDiffMMPackage.DIFF_PACMAN__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__OPERATION = PacmanGoDiffMMPackage.DIFF_PACMAN__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_ID = PacmanGoDiffMMPackage.DIFF_PACMAN__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__FILTER = PacmanGoDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_PACMAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGhostImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGhost()
	 * @generated
	 */
	int PATTERN_DIFF_GHOST = 15;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ON = PacmanGoDiffMMPackage.DIFF_GHOST__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID = PacmanGoDiffMMPackage.DIFF_GHOST__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFFON = PacmanGoDiffMMPackage.DIFF_GHOST__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__OPERATION = PacmanGoDiffMMPackage.DIFF_GHOST__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_ID = PacmanGoDiffMMPackage.DIFF_GHOST__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__FILTER = PacmanGoDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GHOST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffScoreboardImpl <em>Pattern Diff Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffScoreboardImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffScoreboard()
	 * @generated
	 */
	int PATTERN_DIFF_SCOREBOARD = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__VALUE = PacmanGoDiffMMPackage.DIFF_SCOREBOARD__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__ID = PacmanGoDiffMMPackage.DIFF_SCOREBOARD__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__OPERATION = PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__NEW_VALUE = PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__NEW_ID = PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_SCOREBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD__FILTER = PacmanGoDiffMMPackage.DIFF_SCOREBOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_SCOREBOARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SCOREBOARD_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_SCOREBOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGameImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame()
	 * @generated
	 */
	int PATTERN_DIFF_GAME = 17;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__GRIDNODES = PacmanGoDiffMMPackage.DIFF_GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__SCOREBOARD = PacmanGoDiffMMPackage.DIFF_GAME__SCOREBOARD;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ENTITIES = PacmanGoDiffMMPackage.DIFF_GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DOMAINSPECIFICDIFFS = PacmanGoDiffMMPackage.DIFF_GAME__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFGRIDNODES = PacmanGoDiffMMPackage.DIFF_GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffscoreboard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFSCOREBOARD = PacmanGoDiffMMPackage.DIFF_GAME__DIFFSCOREBOARD;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFENTITIES = PacmanGoDiffMMPackage.DIFF_GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFDOMAINSPECIFICDIFFS = PacmanGoDiffMMPackage.DIFF_GAME__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__OPERATION = PacmanGoDiffMMPackage.DIFF_GAME__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__FILTER = PacmanGoDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_gridnodesImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_GRIDNODES = 18;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__OPERATION = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ETYPE = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__FILTER = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_scoreboardImpl <em>Pattern Diff Game scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_scoreboardImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_scoreboard()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD = 19;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD__OPERATION = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD__ETYPE = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD__FILTER = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Game scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_SCOREBOARD_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_entitiesImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_entities()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_ENTITIES = 20;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__OPERATION = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ETYPE = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__FILTER = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl <em>Pattern Diff Game domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS = 21;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__OPERATION = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__FILTER = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__OPERATION = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ETYPE = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT = PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoRuleMM.impl.RuleImpl
	 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 23;

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
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Grid Node</em>'.
	 * @see PacmanGoRuleMM.Pattern_GridNode
	 * @generated
	 */
	EClass getPattern_GridNode();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_GridNode#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_GridNode#getID_Pattern()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_GridNode#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_GridNode#isFilter()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Food</em>'.
	 * @see PacmanGoRuleMM.Pattern_Food
	 * @generated
	 */
	EClass getPattern_Food();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Food#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_Food#getID_Pattern()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Food#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_Food#isFilter()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Pacman</em>'.
	 * @see PacmanGoRuleMM.Pattern_Pacman
	 * @generated
	 */
	EClass getPattern_Pacman();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Pacman#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_Pacman#getID_Pattern()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Pacman#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_Pacman#isFilter()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Ghost</em>'.
	 * @see PacmanGoRuleMM.Pattern_Ghost
	 * @generated
	 */
	EClass getPattern_Ghost();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Ghost#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_Ghost#getID_Pattern()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Ghost#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_Ghost#isFilter()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_Scoreboard <em>Pattern Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Scoreboard</em>'.
	 * @see PacmanGoRuleMM.Pattern_Scoreboard
	 * @generated
	 */
	EClass getPattern_Scoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Scoreboard#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_Scoreboard#getID_Pattern()
	 * @see #getPattern_Scoreboard()
	 * @generated
	 */
	EAttribute getPattern_Scoreboard_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Scoreboard#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_Scoreboard#isFilter()
	 * @see #getPattern_Scoreboard()
	 * @generated
	 */
	EAttribute getPattern_Scoreboard_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Game</em>'.
	 * @see PacmanGoRuleMM.Pattern_Game
	 * @generated
	 */
	EClass getPattern_Game();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Game#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_Game#getID_Pattern()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_Game#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_Game#isFilter()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Positionable Entity</em>'.
	 * @see PacmanGoRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	EClass getPattern_PositionableEntity();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_PositionableEntity#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_PositionableEntity#getID_Pattern()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_PositionableEntity#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_PositionableEntity#isFilter()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see PacmanGoRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DomainSpecificDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DomainSpecificDiff#isFilter()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	EClass getPattern_DiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode#getID_Pattern()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode#isFilter()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node up</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	EClass getPattern_DiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_up#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_up#getID_Pattern()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_up#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_up#isFilter()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_bottom <em>Pattern Diff Grid Node bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node bottom</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_bottom
	 * @generated
	 */
	EClass getPattern_DiffGridNode_bottom();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_bottom#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_bottom#getID_Pattern()
	 * @see #getPattern_DiffGridNode_bottom()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_bottom_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_bottom#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_bottom#isFilter()
	 * @see #getPattern_DiffGridNode_bottom()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_bottom_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node left</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	EClass getPattern_DiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_left#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_left#getID_Pattern()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_left#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_left#isFilter()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node right</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	EClass getPattern_DiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_right#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_right#getID_Pattern()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGridNode_right#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGridNode_right#isFilter()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Food</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffFood
	 * @generated
	 */
	EClass getPattern_DiffFood();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffFood#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffFood#getID_Pattern()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffFood#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffFood#isFilter()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Pacman</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	EClass getPattern_DiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffPacman#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPacman#getID_Pattern()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffPacman#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPacman#isFilter()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Ghost</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	EClass getPattern_DiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGhost#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGhost#getID_Pattern()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGhost#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGhost#isFilter()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffScoreboard <em>Pattern Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Scoreboard</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffScoreboard
	 * @generated
	 */
	EClass getPattern_DiffScoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffScoreboard#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffScoreboard#getID_Pattern()
	 * @see #getPattern_DiffScoreboard()
	 * @generated
	 */
	EAttribute getPattern_DiffScoreboard_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffScoreboard#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffScoreboard#isFilter()
	 * @see #getPattern_DiffScoreboard()
	 * @generated
	 */
	EAttribute getPattern_DiffScoreboard_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame
	 * @generated
	 */
	EClass getPattern_DiffGame();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame#getID_Pattern()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame#isFilter()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game gridnodes</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	EClass getPattern_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_gridnodes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_gridnodes#isFilter()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGame_scoreboard <em>Pattern Diff Game scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game scoreboard</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_scoreboard
	 * @generated
	 */
	EClass getPattern_DiffGame_scoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_scoreboard#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_scoreboard#getID_Pattern()
	 * @see #getPattern_DiffGame_scoreboard()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_scoreboard_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_scoreboard#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_scoreboard#isFilter()
	 * @see #getPattern_DiffGame_scoreboard()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_scoreboard_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game entities</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	EClass getPattern_DiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_entities#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_entities#getID_Pattern()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_entities#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_entities#isFilter()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs <em>Pattern Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game domainspecificdiffs</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs#isFilter()
	 * @see #getPattern_DiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_domainspecificdiffs_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Positionable Entity on</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	EClass getPattern_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Pattern_DiffPositionableEntity_on#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see PacmanGoRuleMM.Pattern_DiffPositionableEntity_on#isFilter()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Filter();

	/**
	 * Returns the meta object for class '{@link PacmanGoRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see PacmanGoRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PacmanGoRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link PacmanGoRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see PacmanGoRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link PacmanGoRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see PacmanGoRuleMM.Rule#getPattern()
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
	PacmanGoRuleMMFactory getPacmanGoRuleMMFactory();

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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_GridNodeImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_GridNode()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_FoodImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Food()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_PacmanImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Pacman()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_GhostImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Ghost()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_ScoreboardImpl <em>Pattern Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_ScoreboardImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Scoreboard()
		 * @generated
		 */
		EClass PATTERN_SCOREBOARD = eINSTANCE.getPattern_Scoreboard();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SCOREBOARD__ID_PATTERN = eINSTANCE.getPattern_Scoreboard_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SCOREBOARD__FILTER = eINSTANCE.getPattern_Scoreboard_Filter();

		/**
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_GameImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_Game()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_PositionableEntityImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_PositionableEntity()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DomainSpecificDiff()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNodeImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_upImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_up()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_bottomImpl <em>Pattern Diff Grid Node bottom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_bottomImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_bottom()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE_BOTTOM = eINSTANCE.getPattern_DiffGridNode_bottom();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_BOTTOM__ID_PATTERN = eINSTANCE.getPattern_DiffGridNode_bottom_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_BOTTOM__FILTER = eINSTANCE.getPattern_DiffGridNode_bottom_Filter();

		/**
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_leftImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_left()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGridNode_rightImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGridNode_right()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffFoodImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffFood()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffPacmanImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffPacman()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGhostImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGhost()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffScoreboardImpl <em>Pattern Diff Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffScoreboardImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffScoreboard()
		 * @generated
		 */
		EClass PATTERN_DIFF_SCOREBOARD = eINSTANCE.getPattern_DiffScoreboard();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SCOREBOARD__ID_PATTERN = eINSTANCE.getPattern_DiffScoreboard_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SCOREBOARD__FILTER = eINSTANCE.getPattern_DiffScoreboard_Filter();

		/**
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGameImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_gridnodesImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_scoreboardImpl <em>Pattern Diff Game scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_scoreboardImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_scoreboard()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME_SCOREBOARD = eINSTANCE.getPattern_DiffGame_scoreboard();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_SCOREBOARD__ID_PATTERN = eINSTANCE.getPattern_DiffGame_scoreboard_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_SCOREBOARD__FILTER = eINSTANCE.getPattern_DiffGame_scoreboard_Filter();

		/**
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_entitiesImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_entities()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl <em>Pattern Diff Game domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffGame_domainspecificdiffsImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffGame_domainspecificdiffs()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
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
		 * The meta object literal for the '{@link PacmanGoRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoRuleMM.impl.RuleImpl
		 * @see PacmanGoRuleMM.impl.PacmanGoRuleMMPackageImpl#getRule()
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

} //PacmanGoRuleMMPackage
