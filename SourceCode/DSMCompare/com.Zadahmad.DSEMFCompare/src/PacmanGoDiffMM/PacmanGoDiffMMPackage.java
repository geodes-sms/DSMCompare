/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see PacmanGoDiffMM.PacmanGoDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanGoDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PacmanGoDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/PacmanGoDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PacmanGoDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanGoDiffMMPackage eINSTANCE = PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.GridNodeImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGridNode()
	 * @generated
	 */
	int GRID_NODE = 0;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__UP = 0;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__ID = 4;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DIFFUP = 5;

	/**
	 * The feature id for the '<em><b>Diffbottom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DIFFBOTTOM = 6;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DIFFLEFT = 7;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DIFFRIGHT = 8;

	/**
	 * The number of structural features of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.PositionableEntityImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getPositionableEntity()
	 * @generated
	 */
	int POSITIONABLE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY__ON = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY__DIFFON = 2;

	/**
	 * The number of structural features of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.FoodImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__ON = POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__ID = POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__DIFFON = POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.PacmanImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getPacman()
	 * @generated
	 */
	int PACMAN = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__ON = POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__ID = POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__DIFFON = POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The number of structural features of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.GhostImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGhost()
	 * @generated
	 */
	int GHOST = 3;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__ON = POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__ID = POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__DIFFON = POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.ScoreboardImpl <em>Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.ScoreboardImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getScoreboard()
	 * @generated
	 */
	int SCOREBOARD = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD__ID = 1;

	/**
	 * The number of structural features of the '<em>Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.GameImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 5;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GRIDNODES = 0;

	/**
	 * The feature id for the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCOREBOARD = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DOMAINSPECIFICDIFFS = 3;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFGRIDNODES = 4;

	/**
	 * The feature id for the '<em><b>Diffscoreboard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFSCOREBOARD = 5;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFENTITIES = 6;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFDOMAINSPECIFICDIFFS = 7;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DomainSpecificDiffImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE = 1;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST = 4;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Scoreboard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD = 5;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = 6;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGridNodeImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode()
	 * @generated
	 */
	int DIFF_GRID_NODE = 8;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__UP = GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__BOTTOM = GRID_NODE__BOTTOM;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__LEFT = GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__RIGHT = GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__ID = GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFFUP = GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffbottom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFFBOTTOM = GRID_NODE__DIFFBOTTOM;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFFLEFT = GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFFRIGHT = GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__OPERATION = GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__NEW_ID = GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_FEATURE_COUNT = GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_OPERATION_COUNT = GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGridNode_upImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_up()
	 * @generated
	 */
	int DIFF_GRID_NODE_UP = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGridNode_bottomImpl <em>Diff Grid Node bottom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGridNode_bottomImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_bottom()
	 * @generated
	 */
	int DIFF_GRID_NODE_BOTTOM = 10;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_BOTTOM__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_BOTTOM__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node bottom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_BOTTOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node bottom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_BOTTOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGridNode_leftImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_left()
	 * @generated
	 */
	int DIFF_GRID_NODE_LEFT = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGridNode_rightImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_right()
	 * @generated
	 */
	int DIFF_GRID_NODE_RIGHT = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffFoodImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffFood()
	 * @generated
	 */
	int DIFF_FOOD = 13;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__ON = FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__ID = FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__DIFFON = FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__OPERATION = FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__NEW_ID = FOOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD_FEATURE_COUNT = FOOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD_OPERATION_COUNT = FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffPacmanImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffPacman()
	 * @generated
	 */
	int DIFF_PACMAN = 14;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__ON = PACMAN__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__ID = PACMAN__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__DIFFON = PACMAN__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__OPERATION = PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__NEW_ID = PACMAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN_FEATURE_COUNT = PACMAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN_OPERATION_COUNT = PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGhostImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGhost()
	 * @generated
	 */
	int DIFF_GHOST = 15;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__ON = GHOST__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__ID = GHOST__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__DIFFON = GHOST__DIFFON;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__OPERATION = GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__NEW_ID = GHOST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST_FEATURE_COUNT = GHOST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST_OPERATION_COUNT = GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffScoreboardImpl <em>Diff Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffScoreboardImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffScoreboard()
	 * @generated
	 */
	int DIFF_SCOREBOARD = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD__VALUE = SCOREBOARD__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD__ID = SCOREBOARD__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD__OPERATION = SCOREBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD__NEW_VALUE = SCOREBOARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD__NEW_ID = SCOREBOARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD_FEATURE_COUNT = SCOREBOARD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCOREBOARD_OPERATION_COUNT = SCOREBOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGameImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame()
	 * @generated
	 */
	int DIFF_GAME = 17;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__GRIDNODES = GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__SCOREBOARD = GAME__SCOREBOARD;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__ENTITIES = GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DOMAINSPECIFICDIFFS = GAME__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFGRIDNODES = GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffscoreboard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFSCOREBOARD = GAME__DIFFSCOREBOARD;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFENTITIES = GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFDOMAINSPECIFICDIFFS = GAME__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__OPERATION = GAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_FEATURE_COUNT = GAME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_OPERATION_COUNT = GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGame_gridnodesImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_gridnodes()
	 * @generated
	 */
	int DIFF_GAME_GRIDNODES = 18;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGame_scoreboardImpl <em>Diff Game scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGame_scoreboardImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_scoreboard()
	 * @generated
	 */
	int DIFF_GAME_SCOREBOARD = 19;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SCOREBOARD__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SCOREBOARD__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Game scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SCOREBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Game scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SCOREBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGame_entitiesImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_entities()
	 * @generated
	 */
	int DIFF_GAME_ENTITIES = 20;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffGame_domainspecificdiffsImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS = 21;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.impl.DiffPositionableEntity_onImpl
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffPositionableEntity_on()
	 * @generated
	 */
	int DIFF_POSITIONABLE_ENTITY_ON = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.ClassOp <em>Class Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.ClassOp
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getClassOp()
	 * @generated
	 */
	int CLASS_OP = 23;

	/**
	 * The meta object id for the '{@link PacmanGoDiffMM.AscOp <em>Asc Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGoDiffMM.AscOp
	 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getAscOp()
	 * @generated
	 */
	int ASC_OP = 24;


	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Node</em>'.
	 * @see PacmanGoDiffMM.GridNode
	 * @generated
	 */
	EClass getGridNode();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.GridNode#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see PacmanGoDiffMM.GridNode#getUp()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Up();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.GridNode#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see PacmanGoDiffMM.GridNode#getBottom()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Bottom();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see PacmanGoDiffMM.GridNode#getLeft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see PacmanGoDiffMM.GridNode#getRight()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Right();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGoDiffMM.GridNode#getId()
	 * @see #getGridNode()
	 * @generated
	 */
	EAttribute getGridNode_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.GridNode#getDiffup <em>Diffup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffup</em>'.
	 * @see PacmanGoDiffMM.GridNode#getDiffup()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffup();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.GridNode#getDiffbottom <em>Diffbottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffbottom</em>'.
	 * @see PacmanGoDiffMM.GridNode#getDiffbottom()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffbottom();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.GridNode#getDiffleft <em>Diffleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffleft</em>'.
	 * @see PacmanGoDiffMM.GridNode#getDiffleft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffleft();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.GridNode#getDiffright <em>Diffright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffright</em>'.
	 * @see PacmanGoDiffMM.GridNode#getDiffright()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffright();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see PacmanGoDiffMM.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see PacmanGoDiffMM.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see PacmanGoDiffMM.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.Scoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoreboard</em>'.
	 * @see PacmanGoDiffMM.Scoreboard
	 * @generated
	 */
	EClass getScoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.Scoreboard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PacmanGoDiffMM.Scoreboard#getValue()
	 * @see #getScoreboard()
	 * @generated
	 */
	EAttribute getScoreboard_Value();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.Scoreboard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGoDiffMM.Scoreboard#getId()
	 * @see #getScoreboard()
	 * @generated
	 */
	EAttribute getScoreboard_Id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see PacmanGoDiffMM.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see PacmanGoDiffMM.Game#getGridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gridnodes();

	/**
	 * Returns the meta object for the containment reference '{@link PacmanGoDiffMM.Game#getScoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoreboard</em>'.
	 * @see PacmanGoDiffMM.Game#getScoreboard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Scoreboard();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see PacmanGoDiffMM.Game#getEntities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see PacmanGoDiffMM.Game#getDomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getDiffgridnodes <em>Diffgridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffgridnodes</em>'.
	 * @see PacmanGoDiffMM.Game#getDiffgridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffgridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getDiffscoreboard <em>Diffscoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffscoreboard</em>'.
	 * @see PacmanGoDiffMM.Game#getDiffscoreboard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffscoreboard();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getDiffentities <em>Diffentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffentities</em>'.
	 * @see PacmanGoDiffMM.Game#getDiffentities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffentities();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.Game#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see PacmanGoDiffMM.Game#getDiffdomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable Entity</em>'.
	 * @see PacmanGoDiffMM.PositionableEntity
	 * @generated
	 */
	EClass getPositionableEntity();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see PacmanGoDiffMM.PositionableEntity#getOn()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_On();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGoDiffMM.PositionableEntity#getId()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EAttribute getPositionableEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGoDiffMM.PositionableEntity#getDiffon <em>Diffon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffon</em>'.
	 * @see PacmanGoDiffMM.PositionableEntity#getDiffon()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_Diffon();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Grid Node</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_GridNode();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Food <em>Domain Specific Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Food</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Food()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Food();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pacman <em>Domain Specific Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Pacman</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pacman()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Pacman();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Ghost <em>Domain Specific Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Ghost</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Ghost()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Ghost();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Scoreboard <em>Domain Specific Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Scoreboard</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Scoreboard()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Scoreboard();

	/**
	 * Returns the meta object for the reference list '{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Positionable Entity</em>'.
	 * @see PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode
	 * @generated
	 */
	EClass getDiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode#getOperation()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_Operation();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode#getNew_id()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_New_id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node up</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_up
	 * @generated
	 */
	EClass getDiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode_up#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_up#getOperation()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EAttribute getDiffGridNode_up_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGridNode_up#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_up#getEType()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EReference getDiffGridNode_up_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGridNode_bottom <em>Diff Grid Node bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node bottom</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_bottom
	 * @generated
	 */
	EClass getDiffGridNode_bottom();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode_bottom#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_bottom#getOperation()
	 * @see #getDiffGridNode_bottom()
	 * @generated
	 */
	EAttribute getDiffGridNode_bottom_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGridNode_bottom#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_bottom#getEType()
	 * @see #getDiffGridNode_bottom()
	 * @generated
	 */
	EReference getDiffGridNode_bottom_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node left</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_left
	 * @generated
	 */
	EClass getDiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode_left#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_left#getOperation()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EAttribute getDiffGridNode_left_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGridNode_left#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_left#getEType()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EReference getDiffGridNode_left_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node right</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_right
	 * @generated
	 */
	EClass getDiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGridNode_right#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_right#getOperation()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EAttribute getDiffGridNode_right_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGridNode_right#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGridNode_right#getEType()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EReference getDiffGridNode_right_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Food</em>'.
	 * @see PacmanGoDiffMM.DiffFood
	 * @generated
	 */
	EClass getDiffFood();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffFood#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffFood#getOperation()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_Operation();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffFood#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see PacmanGoDiffMM.DiffFood#getNew_id()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_New_id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Pacman</em>'.
	 * @see PacmanGoDiffMM.DiffPacman
	 * @generated
	 */
	EClass getDiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffPacman#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffPacman#getOperation()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_Operation();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffPacman#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see PacmanGoDiffMM.DiffPacman#getNew_id()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_New_id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Ghost</em>'.
	 * @see PacmanGoDiffMM.DiffGhost
	 * @generated
	 */
	EClass getDiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGhost#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGhost#getOperation()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_Operation();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGhost#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see PacmanGoDiffMM.DiffGhost#getNew_id()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_New_id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffScoreboard <em>Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Scoreboard</em>'.
	 * @see PacmanGoDiffMM.DiffScoreboard
	 * @generated
	 */
	EClass getDiffScoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffScoreboard#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffScoreboard#getOperation()
	 * @see #getDiffScoreboard()
	 * @generated
	 */
	EAttribute getDiffScoreboard_Operation();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffScoreboard#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see PacmanGoDiffMM.DiffScoreboard#getNew_value()
	 * @see #getDiffScoreboard()
	 * @generated
	 */
	EAttribute getDiffScoreboard_New_value();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffScoreboard#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see PacmanGoDiffMM.DiffScoreboard#getNew_id()
	 * @see #getDiffScoreboard()
	 * @generated
	 */
	EAttribute getDiffScoreboard_New_id();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game</em>'.
	 * @see PacmanGoDiffMM.DiffGame
	 * @generated
	 */
	EClass getDiffGame();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGame#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGame#getOperation()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_Operation();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game gridnodes</em>'.
	 * @see PacmanGoDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	EClass getDiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGame_gridnodes#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGame_gridnodes#getOperation()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getDiffGame_gridnodes_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGame_gridnodes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGame_gridnodes#getEType()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EReference getDiffGame_gridnodes_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGame_scoreboard <em>Diff Game scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game scoreboard</em>'.
	 * @see PacmanGoDiffMM.DiffGame_scoreboard
	 * @generated
	 */
	EClass getDiffGame_scoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGame_scoreboard#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGame_scoreboard#getOperation()
	 * @see #getDiffGame_scoreboard()
	 * @generated
	 */
	EAttribute getDiffGame_scoreboard_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGame_scoreboard#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGame_scoreboard#getEType()
	 * @see #getDiffGame_scoreboard()
	 * @generated
	 */
	EReference getDiffGame_scoreboard_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game entities</em>'.
	 * @see PacmanGoDiffMM.DiffGame_entities
	 * @generated
	 */
	EClass getDiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGame_entities#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGame_entities#getOperation()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EAttribute getDiffGame_entities_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGame_entities#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGame_entities#getEType()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EReference getDiffGame_entities_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game domainspecificdiffs</em>'.
	 * @see PacmanGoDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffGame_domainspecificdiffs#getOperation()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffGame_domainspecificdiffs_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffGame_domainspecificdiffs#getEType()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffGame_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link PacmanGoDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Positionable Entity on</em>'.
	 * @see PacmanGoDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	EClass getDiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGoDiffMM.DiffPositionableEntity_on#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see PacmanGoDiffMM.DiffPositionableEntity_on#getOperation()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getDiffPositionableEntity_on_Operation();

	/**
	 * Returns the meta object for the reference '{@link PacmanGoDiffMM.DiffPositionableEntity_on#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see PacmanGoDiffMM.DiffPositionableEntity_on#getEType()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EReference getDiffPositionableEntity_on_EType();

	/**
	 * Returns the meta object for enum '{@link PacmanGoDiffMM.ClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Op</em>'.
	 * @see PacmanGoDiffMM.ClassOp
	 * @generated
	 */
	EEnum getClassOp();

	/**
	 * Returns the meta object for enum '{@link PacmanGoDiffMM.AscOp <em>Asc Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Op</em>'.
	 * @see PacmanGoDiffMM.AscOp
	 * @generated
	 */
	EEnum getAscOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanGoDiffMMFactory getPacmanGoDiffMMFactory();

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
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.GridNodeImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGridNode()
		 * @generated
		 */
		EClass GRID_NODE = eINSTANCE.getGridNode();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__UP = eINSTANCE.getGridNode_Up();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__BOTTOM = eINSTANCE.getGridNode_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__LEFT = eINSTANCE.getGridNode_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__RIGHT = eINSTANCE.getGridNode_Right();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_NODE__ID = eINSTANCE.getGridNode_Id();

		/**
		 * The meta object literal for the '<em><b>Diffup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DIFFUP = eINSTANCE.getGridNode_Diffup();

		/**
		 * The meta object literal for the '<em><b>Diffbottom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DIFFBOTTOM = eINSTANCE.getGridNode_Diffbottom();

		/**
		 * The meta object literal for the '<em><b>Diffleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DIFFLEFT = eINSTANCE.getGridNode_Diffleft();

		/**
		 * The meta object literal for the '<em><b>Diffright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DIFFRIGHT = eINSTANCE.getGridNode_Diffright();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.FoodImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.PacmanImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getPacman()
		 * @generated
		 */
		EClass PACMAN = eINSTANCE.getPacman();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.GhostImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGhost()
		 * @generated
		 */
		EClass GHOST = eINSTANCE.getGhost();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.ScoreboardImpl <em>Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.ScoreboardImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getScoreboard()
		 * @generated
		 */
		EClass SCOREBOARD = eINSTANCE.getScoreboard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOREBOARD__VALUE = eINSTANCE.getScoreboard_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOREBOARD__ID = eINSTANCE.getScoreboard_Id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.GameImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Gridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GRIDNODES = eINSTANCE.getGame_Gridnodes();

		/**
		 * The meta object literal for the '<em><b>Scoreboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SCOREBOARD = eINSTANCE.getGame_Scoreboard();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ENTITIES = eINSTANCE.getGame_Entities();

		/**
		 * The meta object literal for the '<em><b>Domainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DOMAINSPECIFICDIFFS = eINSTANCE.getGame_Domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diffgridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFGRIDNODES = eINSTANCE.getGame_Diffgridnodes();

		/**
		 * The meta object literal for the '<em><b>Diffscoreboard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFSCOREBOARD = eINSTANCE.getGame_Diffscoreboard();

		/**
		 * The meta object literal for the '<em><b>Diffentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFENTITIES = eINSTANCE.getGame_Diffentities();

		/**
		 * The meta object literal for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFDOMAINSPECIFICDIFFS = eINSTANCE.getGame_Diffdomainspecificdiffs();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.PositionableEntityImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getPositionableEntity()
		 * @generated
		 */
		EClass POSITIONABLE_ENTITY = eINSTANCE.getPositionableEntity();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONABLE_ENTITY__ON = eINSTANCE.getPositionableEntity_On();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE_ENTITY__ID = eINSTANCE.getPositionableEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Diffon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONABLE_ENTITY__DIFFON = eINSTANCE.getPositionableEntity_Diffon();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DomainSpecificDiffImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDomainSpecificDiff()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_DIFF = eINSTANCE.getDomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_DIFF__NAME = eINSTANCE.getDomainSpecificDiff_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_GridNode();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Food</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Food();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Pacman</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Pacman();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Ghost</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Ghost();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Scoreboard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Scoreboard();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGridNodeImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode()
		 * @generated
		 */
		EClass DIFF_GRID_NODE = eINSTANCE.getDiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__OPERATION = eINSTANCE.getDiffGridNode_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__NEW_ID = eINSTANCE.getDiffGridNode_New_id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGridNode_upImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_up()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_UP = eINSTANCE.getDiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_UP__OPERATION = eINSTANCE.getDiffGridNode_up_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_UP__ETYPE = eINSTANCE.getDiffGridNode_up_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGridNode_bottomImpl <em>Diff Grid Node bottom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGridNode_bottomImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_bottom()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_BOTTOM = eINSTANCE.getDiffGridNode_bottom();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_BOTTOM__OPERATION = eINSTANCE.getDiffGridNode_bottom_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_BOTTOM__ETYPE = eINSTANCE.getDiffGridNode_bottom_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGridNode_leftImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_left()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_LEFT = eINSTANCE.getDiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_LEFT__OPERATION = eINSTANCE.getDiffGridNode_left_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_LEFT__ETYPE = eINSTANCE.getDiffGridNode_left_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGridNode_rightImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGridNode_right()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_RIGHT = eINSTANCE.getDiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_RIGHT__OPERATION = eINSTANCE.getDiffGridNode_right_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_RIGHT__ETYPE = eINSTANCE.getDiffGridNode_right_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffFoodImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffFood()
		 * @generated
		 */
		EClass DIFF_FOOD = eINSTANCE.getDiffFood();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__OPERATION = eINSTANCE.getDiffFood_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__NEW_ID = eINSTANCE.getDiffFood_New_id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffPacmanImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffPacman()
		 * @generated
		 */
		EClass DIFF_PACMAN = eINSTANCE.getDiffPacman();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__OPERATION = eINSTANCE.getDiffPacman_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__NEW_ID = eINSTANCE.getDiffPacman_New_id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGhostImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGhost()
		 * @generated
		 */
		EClass DIFF_GHOST = eINSTANCE.getDiffGhost();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__OPERATION = eINSTANCE.getDiffGhost_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__NEW_ID = eINSTANCE.getDiffGhost_New_id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffScoreboardImpl <em>Diff Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffScoreboardImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffScoreboard()
		 * @generated
		 */
		EClass DIFF_SCOREBOARD = eINSTANCE.getDiffScoreboard();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCOREBOARD__OPERATION = eINSTANCE.getDiffScoreboard_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCOREBOARD__NEW_VALUE = eINSTANCE.getDiffScoreboard_New_value();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCOREBOARD__NEW_ID = eINSTANCE.getDiffScoreboard_New_id();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGameImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame()
		 * @generated
		 */
		EClass DIFF_GAME = eINSTANCE.getDiffGame();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__OPERATION = eINSTANCE.getDiffGame_Operation();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGame_gridnodesImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_gridnodes()
		 * @generated
		 */
		EClass DIFF_GAME_GRIDNODES = eINSTANCE.getDiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_GRIDNODES__OPERATION = eINSTANCE.getDiffGame_gridnodes_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_GRIDNODES__ETYPE = eINSTANCE.getDiffGame_gridnodes_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGame_scoreboardImpl <em>Diff Game scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGame_scoreboardImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_scoreboard()
		 * @generated
		 */
		EClass DIFF_GAME_SCOREBOARD = eINSTANCE.getDiffGame_scoreboard();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_SCOREBOARD__OPERATION = eINSTANCE.getDiffGame_scoreboard_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_SCOREBOARD__ETYPE = eINSTANCE.getDiffGame_scoreboard_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGame_entitiesImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_entities()
		 * @generated
		 */
		EClass DIFF_GAME_ENTITIES = eINSTANCE.getDiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_ENTITIES__OPERATION = eINSTANCE.getDiffGame_entities_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_ENTITIES__ETYPE = eINSTANCE.getDiffGame_entities_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffGame_domainspecificdiffsImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_DOMAINSPECIFICDIFFS__OPERATION = eINSTANCE.getDiffGame_domainspecificdiffs_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffGame_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.impl.DiffPositionableEntity_onImpl
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getDiffPositionableEntity_on()
		 * @generated
		 */
		EClass DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getDiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_POSITIONABLE_ENTITY_ON__OPERATION = eINSTANCE.getDiffPositionableEntity_on_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_POSITIONABLE_ENTITY_ON__ETYPE = eINSTANCE.getDiffPositionableEntity_on_EType();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.ClassOp <em>Class Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.ClassOp
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getClassOp()
		 * @generated
		 */
		EEnum CLASS_OP = eINSTANCE.getClassOp();

		/**
		 * The meta object literal for the '{@link PacmanGoDiffMM.AscOp <em>Asc Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGoDiffMM.AscOp
		 * @see PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl#getAscOp()
		 * @generated
		 */
		EEnum ASC_OP = eINSTANCE.getAscOp();

	}

} //PacmanGoDiffMMPackage
