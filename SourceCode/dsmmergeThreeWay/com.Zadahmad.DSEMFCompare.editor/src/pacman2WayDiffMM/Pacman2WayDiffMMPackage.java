/**
 */
package pacman2WayDiffMM;

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
 * @see pacman2WayDiffMM.Pacman2WayDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface Pacman2WayDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacman2WayDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/pacman2WayDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacman2WayDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pacman2WayDiffMMPackage eINSTANCE = pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.GridNodeImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGridNode()
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
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DOWN = 1;

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
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__DIFFDOWN = 6;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.PositionableEntityImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getPositionableEntity()
	 * @generated
	 */
	int POSITIONABLE_ENTITY = 5;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.FoodImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getFood()
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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__VALUE = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.PacmanImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getPacman()
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
	 * The feature id for the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__INITIAL_POSITION = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.GhostImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGhost()
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
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__STRATEGY = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.GameImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ID = 0;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__LIVES = 1;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCORE = 2;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GRIDNODES = 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ENTITIES = 4;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DOMAINSPECIFICDIFFS = 5;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SEMANTICCONFLICTS = 6;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFGRIDNODES = 7;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFENTITIES = 8;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFDOMAINSPECIFICDIFFS = 9;

	/**
	 * The feature id for the '<em><b>Diffsemanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DIFFSEMANTICCONFLICTS = 10;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.FruitImpl <em>Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.FruitImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getFruit()
	 * @generated
	 */
	int FRUIT = 6;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__ON = FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__ID = FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__DIFFON = FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__VALUE = FOOD__VALUE;

	/**
	 * The number of structural features of the '<em>Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT_FEATURE_COUNT = FOOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT_OPERATION_COUNT = FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.EnergizerImpl <em>Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.EnergizerImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getEnergizer()
	 * @generated
	 */
	int ENERGIZER = 7;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER__ON = FOOD__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER__ID = FOOD__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER__DIFFON = FOOD__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER__VALUE = FOOD__VALUE;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER__DURATIONS = FOOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER_FEATURE_COUNT = FOOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIZER_OPERATION_COUNT = FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DomainSpecificDiffImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 8;

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
	 * The feature id for the '<em><b>Domain Specific Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP = 4;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN = 5;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT = 6;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT = 7;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES = 8;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES = 9;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game domainspecificdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS = 10;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS = 11;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON = 12;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.SemanticConflictImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE = 1;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP = 2;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN = 3;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD = 6;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN = 7;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST = 8;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME = 9;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES = 10;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES = 11;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game domainspecificdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS = 12;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Game semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS = 13;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON = 14;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT = 15;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER = 16;

	/**
	 * The feature id for the '<em><b>Semantic Conflict Domain Specific Diff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF = 17;

	/**
	 * The number of structural features of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGridNodeImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode()
	 * @generated
	 */
	int DIFF_GRID_NODE = 10;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__UP = GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DOWN = GRID_NODE__DOWN;

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
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFFDOWN = GRID_NODE__DIFFDOWN;

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
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFF_KIND = GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_FEATURE_COUNT = GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_OPERATION_COUNT = GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGridNode_upImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_up()
	 * @generated
	 */
	int DIFF_GRID_NODE_UP = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGridNode_downImpl <em>Diff Grid Node down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGridNode_downImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_down()
	 * @generated
	 */
	int DIFF_GRID_NODE_DOWN = 12;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGridNode_leftImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_left()
	 * @generated
	 */
	int DIFF_GRID_NODE_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGridNode_rightImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_right()
	 * @generated
	 */
	int DIFF_GRID_NODE_RIGHT = 14;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffFoodImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffFood()
	 * @generated
	 */
	int DIFF_FOOD = 15;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__VALUE = FOOD__VALUE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__DIFF_KIND = FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__NEW_VALUE = FOOD_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffPacmanImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffPacman()
	 * @generated
	 */
	int DIFF_PACMAN = 16;

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
	 * The feature id for the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__INITIAL_POSITION = PACMAN__INITIAL_POSITION;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__DIFF_KIND = PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__NEW_INITIAL_POSITION = PACMAN_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGhostImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGhost()
	 * @generated
	 */
	int DIFF_GHOST = 17;

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
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__STRATEGY = GHOST__STRATEGY;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__DIFF_KIND = GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__NEW_STRATEGY = GHOST_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGameImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame()
	 * @generated
	 */
	int DIFF_GAME = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__ID = GAME__ID;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__LIVES = GAME__LIVES;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__SCORE = GAME__SCORE;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__GRIDNODES = GAME__GRIDNODES;

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
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__SEMANTICCONFLICTS = GAME__SEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFGRIDNODES = GAME__DIFFGRIDNODES;

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
	 * The feature id for the '<em><b>Diffsemanticconflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFFSEMANTICCONFLICTS = GAME__DIFFSEMANTICCONFLICTS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFF_KIND = GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_LIVES = GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_SCORE = GAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_FEATURE_COUNT = GAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_OPERATION_COUNT = GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGame_gridnodesImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_gridnodes()
	 * @generated
	 */
	int DIFF_GAME_GRIDNODES = 19;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGame_entitiesImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_entities()
	 * @generated
	 */
	int DIFF_GAME_ENTITIES = 20;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGame_domainspecificdiffsImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS = 21;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffGame_semanticconflictsImpl <em>Diff Game semanticconflicts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffGame_semanticconflictsImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_semanticconflicts()
	 * @generated
	 */
	int DIFF_GAME_SEMANTICCONFLICTS = 22;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffPositionableEntity_onImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffPositionableEntity_on()
	 * @generated
	 */
	int DIFF_POSITIONABLE_ENTITY_ON = 23;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND = 0;

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
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffFruitImpl <em>Diff Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffFruitImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffFruit()
	 * @generated
	 */
	int DIFF_FRUIT = 24;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__ON = FRUIT__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__ID = FRUIT__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__DIFFON = FRUIT__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__VALUE = FRUIT__VALUE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__DIFF_KIND = FRUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__NEW_VALUE = FRUIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT_FEATURE_COUNT = FRUIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT_OPERATION_COUNT = FRUIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl.DiffEnergizerImpl <em>Diff Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl.DiffEnergizerImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffEnergizer()
	 * @generated
	 */
	int DIFF_ENERGIZER = 25;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__ON = ENERGIZER__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__ID = ENERGIZER__ID;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DIFFON = ENERGIZER__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__VALUE = ENERGIZER__VALUE;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DURATIONS = ENERGIZER__DURATIONS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DIFF_KIND = ENERGIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_VALUE = ENERGIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New durations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_DURATIONS = ENERGIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER_FEATURE_COUNT = ENERGIZER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER_OPERATION_COUNT = ENERGIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.impl._ListEIntImpl <em>List EInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.impl._ListEIntImpl
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#get_ListEInt()
	 * @generated
	 */
	int _LIST_EINT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LIST_EINT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LIST_EINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LIST_EINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGhostStrategy()
	 * @generated
	 */
	int GHOST_STRATEGY = 27;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getClassDiffKind()
	 * @generated
	 */
	int CLASS_DIFF_KIND = 28;

	/**
	 * The meta object id for the '{@link pacman2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacman2WayDiffMM.AscDiffKind
	 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getAscDiffKind()
	 * @generated
	 */
	int ASC_DIFF_KIND = 29;


	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Node</em>'.
	 * @see pacman2WayDiffMM.GridNode
	 * @generated
	 */
	EClass getGridNode();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.GridNode#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see pacman2WayDiffMM.GridNode#getUp()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Up();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.GridNode#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Down</em>'.
	 * @see pacman2WayDiffMM.GridNode#getDown()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Down();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see pacman2WayDiffMM.GridNode#getLeft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see pacman2WayDiffMM.GridNode#getRight()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacman2WayDiffMM.GridNode#getId()
	 * @see #getGridNode()
	 * @generated
	 */
	EAttribute getGridNode_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.GridNode#getDiffup <em>Diffup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffup</em>'.
	 * @see pacman2WayDiffMM.GridNode#getDiffup()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffup();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.GridNode#getDiffdown <em>Diffdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdown</em>'.
	 * @see pacman2WayDiffMM.GridNode#getDiffdown()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffdown();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.GridNode#getDiffleft <em>Diffleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffleft</em>'.
	 * @see pacman2WayDiffMM.GridNode#getDiffleft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffleft();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.GridNode#getDiffright <em>Diffright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffright</em>'.
	 * @see pacman2WayDiffMM.GridNode#getDiffright()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffright();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see pacman2WayDiffMM.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Food#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pacman2WayDiffMM.Food#getValue()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Value();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see pacman2WayDiffMM.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Pacman#getInitialPosition <em>Initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Position</em>'.
	 * @see pacman2WayDiffMM.Pacman#getInitialPosition()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_InitialPosition();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see pacman2WayDiffMM.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Ghost#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see pacman2WayDiffMM.Ghost#getStrategy()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Strategy();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see pacman2WayDiffMM.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Game#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacman2WayDiffMM.Game#getId()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Id();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Game#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see pacman2WayDiffMM.Game#getLives()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Lives();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.Game#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see pacman2WayDiffMM.Game#getScore()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see pacman2WayDiffMM.Game#getGridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see pacman2WayDiffMM.Game#getEntities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see pacman2WayDiffMM.Game#getDomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticconflicts</em>'.
	 * @see pacman2WayDiffMM.Game#getSemanticconflicts()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Semanticconflicts();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getDiffgridnodes <em>Diffgridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffgridnodes</em>'.
	 * @see pacman2WayDiffMM.Game#getDiffgridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffgridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getDiffentities <em>Diffentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffentities</em>'.
	 * @see pacman2WayDiffMM.Game#getDiffentities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffentities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see pacman2WayDiffMM.Game#getDiffdomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.Game#getDiffsemanticconflicts <em>Diffsemanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsemanticconflicts</em>'.
	 * @see pacman2WayDiffMM.Game#getDiffsemanticconflicts()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffsemanticconflicts();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable Entity</em>'.
	 * @see pacman2WayDiffMM.PositionableEntity
	 * @generated
	 */
	EClass getPositionableEntity();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see pacman2WayDiffMM.PositionableEntity#getOn()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_On();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacman2WayDiffMM.PositionableEntity#getId()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EAttribute getPositionableEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pacman2WayDiffMM.PositionableEntity#getDiffon <em>Diffon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffon</em>'.
	 * @see pacman2WayDiffMM.PositionableEntity#getDiffon()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_Diffon();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Fruit <em>Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fruit</em>'.
	 * @see pacman2WayDiffMM.Fruit
	 * @generated
	 */
	EClass getFruit();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.Energizer <em>Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energizer</em>'.
	 * @see pacman2WayDiffMM.Energizer
	 * @generated
	 */
	EClass getEnergizer();

	/**
	 * Returns the meta object for the attribute list '{@link pacman2WayDiffMM.Energizer#getDurations <em>Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Durations</em>'.
	 * @see pacman2WayDiffMM.Energizer#getDurations()
	 * @see #getEnergizer()
	 * @generated
	 */
	EAttribute getEnergizer_Durations();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Grid Node</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_GridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Game <em>Domain Specific Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Game</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Game()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Game();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Positionable Entity</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_up <em>Domain Specific Diff Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node up</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_up()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_down <em>Domain Specific Diff Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node down</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_down()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_left <em>Domain Specific Diff Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node left</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_left()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_right <em>Domain Specific Diff Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node right</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_right()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_gridnodes <em>Domain Specific Diff Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game gridnodes</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_gridnodes()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_entities <em>Domain Specific Diff Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game entities</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_entities()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_domainspecificdiffs <em>Domain Specific Diff Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game domainspecificdiffs</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_domainspecificdiffs()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_semanticconflicts <em>Domain Specific Diff Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game semanticconflicts</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_semanticconflicts()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffPositionableEntity_on <em>Domain Specific Diff Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Positionable Entity on</em>'.
	 * @see pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffPositionableEntity_on()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.SemanticConflict#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getName()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Name();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode <em>Semantic Conflict Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_up <em>Semantic Conflict Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node up</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_up()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_up();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_down <em>Semantic Conflict Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node down</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_down()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_down();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_left <em>Semantic Conflict Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node left</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_left()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_left();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_right <em>Semantic Conflict Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node right</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_right()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_right();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffFood <em>Semantic Conflict Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Food</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffFood()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffFood();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffPacman <em>Semantic Conflict Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Pacman</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffPacman()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffPacman();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGhost <em>Semantic Conflict Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Ghost</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGhost()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGhost();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame <em>Semantic Conflict Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_gridnodes <em>Semantic Conflict Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game gridnodes</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_gridnodes()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_entities <em>Semantic Conflict Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game entities</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_entities()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_entities();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_domainspecificdiffs <em>Semantic Conflict Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game domainspecificdiffs</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_domainspecificdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_semanticconflicts <em>Semantic Conflict Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game semanticconflicts</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffGame_semanticconflicts()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffPositionableEntity_on <em>Semantic Conflict Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Positionable Entity on</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffPositionableEntity_on()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffFruit <em>Semantic Conflict Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Fruit</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffFruit()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffFruit();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffEnergizer <em>Semantic Conflict Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Energizer</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DiffEnergizer()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffEnergizer();

	/**
	 * Returns the meta object for the reference list '{@link pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DomainSpecificDiff <em>Semantic Conflict Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Domain Specific Diff</em>'.
	 * @see pacman2WayDiffMM.SemanticConflict#getSemanticConflict_DomainSpecificDiff()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DomainSpecificDiff();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode
	 * @generated
	 */
	EClass getDiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGridNode#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode#getDiff_kind()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_Diff_kind();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node up</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_up
	 * @generated
	 */
	EClass getDiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGridNode_up#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_up#getDiff_kind()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EAttribute getDiffGridNode_up_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGridNode_up#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_up#getEType()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EReference getDiffGridNode_up_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGridNode_down <em>Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node down</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_down
	 * @generated
	 */
	EClass getDiffGridNode_down();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGridNode_down#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_down#getDiff_kind()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EAttribute getDiffGridNode_down_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGridNode_down#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_down#getEType()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EReference getDiffGridNode_down_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node left</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_left
	 * @generated
	 */
	EClass getDiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGridNode_left#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_left#getDiff_kind()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EAttribute getDiffGridNode_left_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGridNode_left#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_left#getEType()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EReference getDiffGridNode_left_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node right</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_right
	 * @generated
	 */
	EClass getDiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGridNode_right#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_right#getDiff_kind()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EAttribute getDiffGridNode_right_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGridNode_right#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGridNode_right#getEType()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EReference getDiffGridNode_right_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Food</em>'.
	 * @see pacman2WayDiffMM.DiffFood
	 * @generated
	 */
	EClass getDiffFood();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffFood#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffFood#getDiff_kind()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffFood#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see pacman2WayDiffMM.DiffFood#getNew_value()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_New_value();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Pacman</em>'.
	 * @see pacman2WayDiffMM.DiffPacman
	 * @generated
	 */
	EClass getDiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffPacman#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffPacman#getDiff_kind()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffPacman#getNew_initialPosition <em>New initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New initial Position</em>'.
	 * @see pacman2WayDiffMM.DiffPacman#getNew_initialPosition()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_New_initialPosition();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Ghost</em>'.
	 * @see pacman2WayDiffMM.DiffGhost
	 * @generated
	 */
	EClass getDiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGhost#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGhost#getDiff_kind()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGhost#getNew_strategy <em>New strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New strategy</em>'.
	 * @see pacman2WayDiffMM.DiffGhost#getNew_strategy()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_New_strategy();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game</em>'.
	 * @see pacman2WayDiffMM.DiffGame
	 * @generated
	 */
	EClass getDiffGame();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGame#getDiff_kind()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame#getNew_lives <em>New lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lives</em>'.
	 * @see pacman2WayDiffMM.DiffGame#getNew_lives()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_lives();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame#getNew_score <em>New score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New score</em>'.
	 * @see pacman2WayDiffMM.DiffGame#getNew_score()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_score();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game gridnodes</em>'.
	 * @see pacman2WayDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	EClass getDiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame_gridnodes#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGame_gridnodes#getDiff_kind()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getDiffGame_gridnodes_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGame_gridnodes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGame_gridnodes#getEType()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EReference getDiffGame_gridnodes_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game entities</em>'.
	 * @see pacman2WayDiffMM.DiffGame_entities
	 * @generated
	 */
	EClass getDiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame_entities#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGame_entities#getDiff_kind()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EAttribute getDiffGame_entities_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGame_entities#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGame_entities#getEType()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EReference getDiffGame_entities_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game domainspecificdiffs</em>'.
	 * @see pacman2WayDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGame_domainspecificdiffs#getDiff_kind()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffGame_domainspecificdiffs_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGame_domainspecificdiffs#getEType()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffGame_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffGame_semanticconflicts <em>Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game semanticconflicts</em>'.
	 * @see pacman2WayDiffMM.DiffGame_semanticconflicts
	 * @generated
	 */
	EClass getDiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffGame_semanticconflicts#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffGame_semanticconflicts#getDiff_kind()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getDiffGame_semanticconflicts_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffGame_semanticconflicts#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffGame_semanticconflicts#getEType()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EReference getDiffGame_semanticconflicts_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Positionable Entity on</em>'.
	 * @see pacman2WayDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	EClass getDiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffPositionableEntity_on#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffPositionableEntity_on#getDiff_kind()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getDiffPositionableEntity_on_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link pacman2WayDiffMM.DiffPositionableEntity_on#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacman2WayDiffMM.DiffPositionableEntity_on#getEType()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EReference getDiffPositionableEntity_on_EType();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffFruit <em>Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Fruit</em>'.
	 * @see pacman2WayDiffMM.DiffFruit
	 * @generated
	 */
	EClass getDiffFruit();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffFruit#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffFruit#getDiff_kind()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffFruit#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see pacman2WayDiffMM.DiffFruit#getNew_value()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_New_value();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM.DiffEnergizer <em>Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Energizer</em>'.
	 * @see pacman2WayDiffMM.DiffEnergizer
	 * @generated
	 */
	EClass getDiffEnergizer();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffEnergizer#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see pacman2WayDiffMM.DiffEnergizer#getDiff_kind()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacman2WayDiffMM.DiffEnergizer#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see pacman2WayDiffMM.DiffEnergizer#getNew_value()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_New_value();

	/**
	 * Returns the meta object for the containment reference '{@link pacman2WayDiffMM.DiffEnergizer#getNew_durations <em>New durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New durations</em>'.
	 * @see pacman2WayDiffMM.DiffEnergizer#getNew_durations()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EReference getDiffEnergizer_New_durations();

	/**
	 * Returns the meta object for class '{@link pacman2WayDiffMM._ListEInt <em>List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List EInt</em>'.
	 * @see pacman2WayDiffMM._ListEInt
	 * @generated
	 */
	EClass get_ListEInt();

	/**
	 * Returns the meta object for the attribute list '{@link pacman2WayDiffMM._ListEInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pacman2WayDiffMM._ListEInt#getValue()
	 * @see #get_ListEInt()
	 * @generated
	 */
	EAttribute get_ListEInt_Value();

	/**
	 * Returns the meta object for enum '{@link pacman2WayDiffMM.GhostStrategy <em>Ghost Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Strategy</em>'.
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @generated
	 */
	EEnum getGhostStrategy();

	/**
	 * Returns the meta object for enum '{@link pacman2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Diff Kind</em>'.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @generated
	 */
	EEnum getClassDiffKind();

	/**
	 * Returns the meta object for enum '{@link pacman2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Diff Kind</em>'.
	 * @see pacman2WayDiffMM.AscDiffKind
	 * @generated
	 */
	EEnum getAscDiffKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pacman2WayDiffMMFactory getPacman2WayDiffMMFactory();

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
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.GridNodeImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGridNode()
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
		 * The meta object literal for the '<em><b>Down</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DOWN = eINSTANCE.getGridNode_Down();

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
		 * The meta object literal for the '<em><b>Diffdown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__DIFFDOWN = eINSTANCE.getGridNode_Diffdown();

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
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.FoodImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD__VALUE = eINSTANCE.getFood_Value();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.PacmanImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getPacman()
		 * @generated
		 */
		EClass PACMAN = eINSTANCE.getPacman();

		/**
		 * The meta object literal for the '<em><b>Initial Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACMAN__INITIAL_POSITION = eINSTANCE.getPacman_InitialPosition();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.GhostImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGhost()
		 * @generated
		 */
		EClass GHOST = eINSTANCE.getGhost();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GHOST__STRATEGY = eINSTANCE.getGhost_Strategy();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.GameImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__ID = eINSTANCE.getGame_Id();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__LIVES = eINSTANCE.getGame_Lives();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__SCORE = eINSTANCE.getGame_Score();

		/**
		 * The meta object literal for the '<em><b>Gridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GRIDNODES = eINSTANCE.getGame_Gridnodes();

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
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SEMANTICCONFLICTS = eINSTANCE.getGame_Semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>Diffgridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFGRIDNODES = eINSTANCE.getGame_Diffgridnodes();

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
		 * The meta object literal for the '<em><b>Diffsemanticconflicts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__DIFFSEMANTICCONFLICTS = eINSTANCE.getGame_Diffsemanticconflicts();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.PositionableEntityImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getPositionableEntity()
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
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.FruitImpl <em>Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.FruitImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getFruit()
		 * @generated
		 */
		EClass FRUIT = eINSTANCE.getFruit();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.EnergizerImpl <em>Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.EnergizerImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getEnergizer()
		 * @generated
		 */
		EClass ENERGIZER = eINSTANCE.getEnergizer();

		/**
		 * The meta object literal for the '<em><b>Durations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIZER__DURATIONS = eINSTANCE.getEnergizer_Durations();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DomainSpecificDiffImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDomainSpecificDiff()
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
		 * The meta object literal for the '<em><b>Domain Specific Diff Game</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Game();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Grid Node up</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Grid Node down</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Grid Node left</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Grid Node right</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Game gridnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Game entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Game domainspecificdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Game semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Diff Positionable Entity on</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.SemanticConflictImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONFLICT__NAME = eINSTANCE.getSemanticConflict_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Grid Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Grid Node up</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Grid Node down</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Grid Node left</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Grid Node right</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Food</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD = eINSTANCE.getSemanticConflict_SemanticConflict_DiffFood();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Pacman</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN = eINSTANCE.getSemanticConflict_SemanticConflict_DiffPacman();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Ghost</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGhost();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Game</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGame();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Game gridnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Game entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Game domainspecificdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Game semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS = eINSTANCE.getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Positionable Entity on</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getSemanticConflict_SemanticConflict_DiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Fruit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT = eINSTANCE.getSemanticConflict_SemanticConflict_DiffFruit();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Diff Energizer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER = eINSTANCE.getSemanticConflict_SemanticConflict_DiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Semantic Conflict Domain Specific Diff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF = eINSTANCE.getSemanticConflict_SemanticConflict_DomainSpecificDiff();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGridNodeImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode()
		 * @generated
		 */
		EClass DIFF_GRID_NODE = eINSTANCE.getDiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__DIFF_KIND = eINSTANCE.getDiffGridNode_Diff_kind();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGridNode_upImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_up()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_UP = eINSTANCE.getDiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_UP__DIFF_KIND = eINSTANCE.getDiffGridNode_up_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_UP__ETYPE = eINSTANCE.getDiffGridNode_up_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGridNode_downImpl <em>Diff Grid Node down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGridNode_downImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_down()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_DOWN = eINSTANCE.getDiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_DOWN__DIFF_KIND = eINSTANCE.getDiffGridNode_down_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_DOWN__ETYPE = eINSTANCE.getDiffGridNode_down_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGridNode_leftImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_left()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_LEFT = eINSTANCE.getDiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_LEFT__DIFF_KIND = eINSTANCE.getDiffGridNode_left_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_LEFT__ETYPE = eINSTANCE.getDiffGridNode_left_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGridNode_rightImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGridNode_right()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_RIGHT = eINSTANCE.getDiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_RIGHT__DIFF_KIND = eINSTANCE.getDiffGridNode_right_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_RIGHT__ETYPE = eINSTANCE.getDiffGridNode_right_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffFoodImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffFood()
		 * @generated
		 */
		EClass DIFF_FOOD = eINSTANCE.getDiffFood();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__DIFF_KIND = eINSTANCE.getDiffFood_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__NEW_VALUE = eINSTANCE.getDiffFood_New_value();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffPacmanImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffPacman()
		 * @generated
		 */
		EClass DIFF_PACMAN = eINSTANCE.getDiffPacman();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__DIFF_KIND = eINSTANCE.getDiffPacman_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New initial Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__NEW_INITIAL_POSITION = eINSTANCE.getDiffPacman_New_initialPosition();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGhostImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGhost()
		 * @generated
		 */
		EClass DIFF_GHOST = eINSTANCE.getDiffGhost();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__DIFF_KIND = eINSTANCE.getDiffGhost_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__NEW_STRATEGY = eINSTANCE.getDiffGhost_New_strategy();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGameImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame()
		 * @generated
		 */
		EClass DIFF_GAME = eINSTANCE.getDiffGame();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__DIFF_KIND = eINSTANCE.getDiffGame_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_LIVES = eINSTANCE.getDiffGame_New_lives();

		/**
		 * The meta object literal for the '<em><b>New score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_SCORE = eINSTANCE.getDiffGame_New_score();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGame_gridnodesImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_gridnodes()
		 * @generated
		 */
		EClass DIFF_GAME_GRIDNODES = eINSTANCE.getDiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_GRIDNODES__DIFF_KIND = eINSTANCE.getDiffGame_gridnodes_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_GRIDNODES__ETYPE = eINSTANCE.getDiffGame_gridnodes_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGame_entitiesImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_entities()
		 * @generated
		 */
		EClass DIFF_GAME_ENTITIES = eINSTANCE.getDiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_ENTITIES__DIFF_KIND = eINSTANCE.getDiffGame_entities_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_ENTITIES__ETYPE = eINSTANCE.getDiffGame_entities_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGame_domainspecificdiffsImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND = eINSTANCE.getDiffGame_domainspecificdiffs_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffGame_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffGame_semanticconflictsImpl <em>Diff Game semanticconflicts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffGame_semanticconflictsImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffGame_semanticconflicts()
		 * @generated
		 */
		EClass DIFF_GAME_SEMANTICCONFLICTS = eINSTANCE.getDiffGame_semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND = eINSTANCE.getDiffGame_semanticconflicts_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_SEMANTICCONFLICTS__ETYPE = eINSTANCE.getDiffGame_semanticconflicts_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffPositionableEntity_onImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffPositionableEntity_on()
		 * @generated
		 */
		EClass DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getDiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND = eINSTANCE.getDiffPositionableEntity_on_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_POSITIONABLE_ENTITY_ON__ETYPE = eINSTANCE.getDiffPositionableEntity_on_EType();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffFruitImpl <em>Diff Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffFruitImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffFruit()
		 * @generated
		 */
		EClass DIFF_FRUIT = eINSTANCE.getDiffFruit();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__DIFF_KIND = eINSTANCE.getDiffFruit_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__NEW_VALUE = eINSTANCE.getDiffFruit_New_value();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl.DiffEnergizerImpl <em>Diff Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl.DiffEnergizerImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getDiffEnergizer()
		 * @generated
		 */
		EClass DIFF_ENERGIZER = eINSTANCE.getDiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__DIFF_KIND = eINSTANCE.getDiffEnergizer_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__NEW_VALUE = eINSTANCE.getDiffEnergizer_New_value();

		/**
		 * The meta object literal for the '<em><b>New durations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ENERGIZER__NEW_DURATIONS = eINSTANCE.getDiffEnergizer_New_durations();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.impl._ListEIntImpl <em>List EInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.impl._ListEIntImpl
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#get_ListEInt()
		 * @generated
		 */
		EClass _LIST_EINT = eINSTANCE.get_ListEInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _LIST_EINT__VALUE = eINSTANCE.get_ListEInt_Value();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.GhostStrategy
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getGhostStrategy()
		 * @generated
		 */
		EEnum GHOST_STRATEGY = eINSTANCE.getGhostStrategy();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.ClassDiffKind
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getClassDiffKind()
		 * @generated
		 */
		EEnum CLASS_DIFF_KIND = eINSTANCE.getClassDiffKind();

		/**
		 * The meta object literal for the '{@link pacman2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacman2WayDiffMM.AscDiffKind
		 * @see pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl#getAscDiffKind()
		 * @generated
		 */
		EEnum ASC_DIFF_KIND = eINSTANCE.getAscDiffKind();

	}

} //Pacman2WayDiffMMPackage
