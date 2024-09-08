/**
 */
package pacmanDiffMM;

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
 * @see pacmanDiffMM.PacmanDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacmanDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/pacmanDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacmanDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanDiffMMPackage eINSTANCE = pacmanDiffMM.impl.PacmanDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.GridNodeImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGridNode()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.PositionableEntityImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getPositionableEntity()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.FoodImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getFood()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.PacmanImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getPacman()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.GhostImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGhost()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.GameImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGame()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.FruitImpl <em>Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.FruitImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getFruit()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.EnergizerImpl <em>Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.EnergizerImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getEnergizer()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DomainSpecificDiffImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDomainSpecificDiff()
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
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP = 5;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN = 6;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT = 7;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT = 8;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES = 9;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES = 10;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game domainspecificdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS = 11;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Game semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS = 12;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON = 13;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.SemanticConflictImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getSemanticConflict()
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
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGridNodeImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFF_KIND_LEFT = GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__DIFF_KIND_RIGHT = GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE__CHANGE_STATUS = GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_FEATURE_COUNT = GRID_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_OPERATION_COUNT = GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGridNode_upImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_up()
	 * @generated
	 */
	int DIFF_GRID_NODE_UP = 11;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_UP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGridNode_downImpl <em>Diff Grid Node down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGridNode_downImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_down()
	 * @generated
	 */
	int DIFF_GRID_NODE_DOWN = 12;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_DOWN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGridNode_leftImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_left()
	 * @generated
	 */
	int DIFF_GRID_NODE_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_LEFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGridNode_rightImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_right()
	 * @generated
	 */
	int DIFF_GRID_NODE_RIGHT = 14;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GRID_NODE_RIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffFoodImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffFood()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__DIFF_KIND_LEFT = FOOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__DIFF_KIND_RIGHT = FOOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__CHANGE_STATUS = FOOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__NEW_VALUE_LEFT = FOOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__NEW_VALUE_RIGHT = FOOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD__VALUE_CHANGE_STATUS = FOOD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD_FEATURE_COUNT = FOOD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FOOD_OPERATION_COUNT = FOOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffPacmanImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffPacman()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__DIFF_KIND_LEFT = PACMAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__DIFF_KIND_RIGHT = PACMAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__CHANGE_STATUS = PACMAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New initial Position Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT = PACMAN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New initial Position Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT = PACMAN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initial Position Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS = PACMAN_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN_FEATURE_COUNT = PACMAN_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PACMAN_OPERATION_COUNT = PACMAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGhostImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGhost()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__DIFF_KIND_LEFT = GHOST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__DIFF_KIND_RIGHT = GHOST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__CHANGE_STATUS = GHOST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New strategy Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__NEW_STRATEGY_LEFT = GHOST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New strategy Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__NEW_STRATEGY_RIGHT = GHOST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strategy Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST__STRATEGY_CHANGE_STATUS = GHOST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST_FEATURE_COUNT = GHOST_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GHOST_OPERATION_COUNT = GHOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGameImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFF_KIND_LEFT = GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__DIFF_KIND_RIGHT = GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__CHANGE_STATUS = GAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New lives Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_LIVES_LEFT = GAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New lives Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_LIVES_RIGHT = GAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lives Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__LIVES_CHANGE_STATUS = GAME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New score Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_SCORE_LEFT = GAME_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New score Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__NEW_SCORE_RIGHT = GAME_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Score Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME__SCORE_CHANGE_STATUS = GAME_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_FEATURE_COUNT = GAME_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_OPERATION_COUNT = GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGame_gridnodesImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_gridnodes()
	 * @generated
	 */
	int DIFF_GAME_GRIDNODES = 19;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_GRIDNODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGame_entitiesImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_entities()
	 * @generated
	 */
	int DIFF_GAME_ENTITIES = 20;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_ENTITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGame_domainspecificdiffsImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS = 21;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Game domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_DOMAINSPECIFICDIFFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffGame_semanticconflictsImpl <em>Diff Game semanticconflicts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffGame_semanticconflictsImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_semanticconflicts()
	 * @generated
	 */
	int DIFF_GAME_SEMANTICCONFLICTS = 22;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Game semanticconflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_GAME_SEMANTICCONFLICTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffPositionableEntity_onImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffPositionableEntity_on()
	 * @generated
	 */
	int DIFF_POSITIONABLE_ENTITY_ON = 23;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffFruitImpl <em>Diff Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffFruitImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffFruit()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__DIFF_KIND_LEFT = FRUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__DIFF_KIND_RIGHT = FRUIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__CHANGE_STATUS = FRUIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__NEW_VALUE_LEFT = FRUIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__NEW_VALUE_RIGHT = FRUIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT__VALUE_CHANGE_STATUS = FRUIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT_FEATURE_COUNT = FRUIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FRUIT_OPERATION_COUNT = FRUIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl.DiffEnergizerImpl <em>Diff Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl.DiffEnergizerImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffEnergizer()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DIFF_KIND_LEFT = ENERGIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DIFF_KIND_RIGHT = ENERGIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__CHANGE_STATUS = ENERGIZER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_VALUE_LEFT = ENERGIZER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_VALUE_RIGHT = ENERGIZER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__VALUE_CHANGE_STATUS = ENERGIZER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New durations Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_DURATIONS_LEFT = ENERGIZER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New durations Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__NEW_DURATIONS_RIGHT = ENERGIZER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Durations Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS = ENERGIZER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER_FEATURE_COUNT = ENERGIZER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENERGIZER_OPERATION_COUNT = ENERGIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.impl._ListEIntImpl <em>List EInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.impl._ListEIntImpl
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#get_ListEInt()
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
	 * The meta object id for the '{@link pacmanDiffMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.GhostStrategy
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGhostStrategy()
	 * @generated
	 */
	int GHOST_STRATEGY = 27;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getClassDiffKind()
	 * @generated
	 */
	int CLASS_DIFF_KIND = 28;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.AscDiffKind
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getAscDiffKind()
	 * @generated
	 */
	int ASC_DIFF_KIND = 29;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.AUTHOR
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 30;

	/**
	 * The meta object id for the '{@link pacmanDiffMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanDiffMM.ChangeStatus
	 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 31;


	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Node</em>'.
	 * @see pacmanDiffMM.GridNode
	 * @generated
	 */
	EClass getGridNode();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.GridNode#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see pacmanDiffMM.GridNode#getUp()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Up();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.GridNode#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Down</em>'.
	 * @see pacmanDiffMM.GridNode#getDown()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Down();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see pacmanDiffMM.GridNode#getLeft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see pacmanDiffMM.GridNode#getRight()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanDiffMM.GridNode#getId()
	 * @see #getGridNode()
	 * @generated
	 */
	EAttribute getGridNode_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.GridNode#getDiffup <em>Diffup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffup</em>'.
	 * @see pacmanDiffMM.GridNode#getDiffup()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffup();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.GridNode#getDiffdown <em>Diffdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdown</em>'.
	 * @see pacmanDiffMM.GridNode#getDiffdown()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffdown();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.GridNode#getDiffleft <em>Diffleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffleft</em>'.
	 * @see pacmanDiffMM.GridNode#getDiffleft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffleft();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.GridNode#getDiffright <em>Diffright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffright</em>'.
	 * @see pacmanDiffMM.GridNode#getDiffright()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Diffright();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see pacmanDiffMM.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Food#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pacmanDiffMM.Food#getValue()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Value();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see pacmanDiffMM.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Pacman#getInitialPosition <em>Initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Position</em>'.
	 * @see pacmanDiffMM.Pacman#getInitialPosition()
	 * @see #getPacman()
	 * @generated
	 */
	EAttribute getPacman_InitialPosition();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see pacmanDiffMM.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Ghost#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see pacmanDiffMM.Ghost#getStrategy()
	 * @see #getGhost()
	 * @generated
	 */
	EAttribute getGhost_Strategy();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see pacmanDiffMM.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Game#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanDiffMM.Game#getId()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Id();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Game#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see pacmanDiffMM.Game#getLives()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Lives();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.Game#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see pacmanDiffMM.Game#getScore()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see pacmanDiffMM.Game#getGridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see pacmanDiffMM.Game#getEntities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see pacmanDiffMM.Game#getDomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticconflicts</em>'.
	 * @see pacmanDiffMM.Game#getSemanticconflicts()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Semanticconflicts();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getDiffgridnodes <em>Diffgridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffgridnodes</em>'.
	 * @see pacmanDiffMM.Game#getDiffgridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffgridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getDiffentities <em>Diffentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffentities</em>'.
	 * @see pacmanDiffMM.Game#getDiffentities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffentities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see pacmanDiffMM.Game#getDiffdomainspecificdiffs()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.Game#getDiffsemanticconflicts <em>Diffsemanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsemanticconflicts</em>'.
	 * @see pacmanDiffMM.Game#getDiffsemanticconflicts()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Diffsemanticconflicts();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable Entity</em>'.
	 * @see pacmanDiffMM.PositionableEntity
	 * @generated
	 */
	EClass getPositionableEntity();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see pacmanDiffMM.PositionableEntity#getOn()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_On();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanDiffMM.PositionableEntity#getId()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EAttribute getPositionableEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanDiffMM.PositionableEntity#getDiffon <em>Diffon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffon</em>'.
	 * @see pacmanDiffMM.PositionableEntity#getDiffon()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_Diffon();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Fruit <em>Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fruit</em>'.
	 * @see pacmanDiffMM.Fruit
	 * @generated
	 */
	EClass getFruit();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.Energizer <em>Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energizer</em>'.
	 * @see pacmanDiffMM.Energizer
	 * @generated
	 */
	EClass getEnergizer();

	/**
	 * Returns the meta object for the attribute list '{@link pacmanDiffMM.Energizer#getDurations <em>Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Durations</em>'.
	 * @see pacmanDiffMM.Energizer#getDurations()
	 * @see #getEnergizer()
	 * @generated
	 */
	EAttribute getEnergizer_Durations();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DomainSpecificDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getAuthor()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Author();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Grid Node</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_GridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Game <em>Domain Specific Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Game</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Game()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Game();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Positionable Entity</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_up <em>Domain Specific Diff Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node up</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_up()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_down <em>Domain Specific Diff Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node down</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_down()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_left <em>Domain Specific Diff Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node left</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_left()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_right <em>Domain Specific Diff Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Grid Node right</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_right()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_gridnodes <em>Domain Specific Diff Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game gridnodes</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_gridnodes()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_entities <em>Domain Specific Diff Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game entities</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_entities()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_domainspecificdiffs <em>Domain Specific Diff Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game domainspecificdiffs</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_domainspecificdiffs()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_semanticconflicts <em>Domain Specific Diff Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Game semanticconflicts</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_semanticconflicts()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffPositionableEntity_on <em>Domain Specific Diff Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Diff Positionable Entity on</em>'.
	 * @see pacmanDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffPositionableEntity_on()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see pacmanDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.SemanticConflict#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getName()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Name();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode <em>Semantic Conflict Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_up <em>Semantic Conflict Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node up</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_up()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_up();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_down <em>Semantic Conflict Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node down</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_down()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_down();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_left <em>Semantic Conflict Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node left</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_left()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_left();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_right <em>Semantic Conflict Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Grid Node right</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_right()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGridNode_right();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFood <em>Semantic Conflict Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Food</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFood()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffFood();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPacman <em>Semantic Conflict Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Pacman</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPacman()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffPacman();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGhost <em>Semantic Conflict Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Ghost</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGhost()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGhost();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame <em>Semantic Conflict Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_gridnodes <em>Semantic Conflict Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game gridnodes</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_gridnodes()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_entities <em>Semantic Conflict Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game entities</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_entities()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_entities();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_domainspecificdiffs <em>Semantic Conflict Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game domainspecificdiffs</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_domainspecificdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_semanticconflicts <em>Semantic Conflict Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Game semanticconflicts</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_semanticconflicts()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPositionableEntity_on <em>Semantic Conflict Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Positionable Entity on</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPositionableEntity_on()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFruit <em>Semantic Conflict Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Fruit</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFruit()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffFruit();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffEnergizer <em>Semantic Conflict Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Diff Energizer</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffEnergizer()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DiffEnergizer();

	/**
	 * Returns the meta object for the reference list '{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DomainSpecificDiff <em>Semantic Conflict Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Conflict Domain Specific Diff</em>'.
	 * @see pacmanDiffMM.SemanticConflict#getSemanticConflict_DomainSpecificDiff()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_SemanticConflict_DomainSpecificDiff();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node</em>'.
	 * @see pacmanDiffMM.DiffGridNode
	 * @generated
	 */
	EClass getDiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGridNode#getDiff_kind_Left()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGridNode#getDiff_kind_Right()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGridNode#getChangeStatus()
	 * @see #getDiffGridNode()
	 * @generated
	 */
	EAttribute getDiffGridNode_ChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node up</em>'.
	 * @see pacmanDiffMM.DiffGridNode_up
	 * @generated
	 */
	EClass getDiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_up#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGridNode_up#getDiff_kind_Left()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EAttribute getDiffGridNode_up_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_up#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGridNode_up#getDiff_kind_Right()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EAttribute getDiffGridNode_up_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_up#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGridNode_up#getChangeStatus()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EAttribute getDiffGridNode_up_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGridNode_up#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGridNode_up#getEType()
	 * @see #getDiffGridNode_up()
	 * @generated
	 */
	EReference getDiffGridNode_up_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGridNode_down <em>Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node down</em>'.
	 * @see pacmanDiffMM.DiffGridNode_down
	 * @generated
	 */
	EClass getDiffGridNode_down();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_down#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGridNode_down#getDiff_kind_Left()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EAttribute getDiffGridNode_down_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_down#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGridNode_down#getDiff_kind_Right()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EAttribute getDiffGridNode_down_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_down#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGridNode_down#getChangeStatus()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EAttribute getDiffGridNode_down_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGridNode_down#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGridNode_down#getEType()
	 * @see #getDiffGridNode_down()
	 * @generated
	 */
	EReference getDiffGridNode_down_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node left</em>'.
	 * @see pacmanDiffMM.DiffGridNode_left
	 * @generated
	 */
	EClass getDiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_left#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGridNode_left#getDiff_kind_Left()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EAttribute getDiffGridNode_left_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_left#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGridNode_left#getDiff_kind_Right()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EAttribute getDiffGridNode_left_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_left#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGridNode_left#getChangeStatus()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EAttribute getDiffGridNode_left_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGridNode_left#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGridNode_left#getEType()
	 * @see #getDiffGridNode_left()
	 * @generated
	 */
	EReference getDiffGridNode_left_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Grid Node right</em>'.
	 * @see pacmanDiffMM.DiffGridNode_right
	 * @generated
	 */
	EClass getDiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGridNode_right#getDiff_kind_Left()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EAttribute getDiffGridNode_right_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGridNode_right#getDiff_kind_Right()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EAttribute getDiffGridNode_right_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGridNode_right#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGridNode_right#getChangeStatus()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EAttribute getDiffGridNode_right_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGridNode_right#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGridNode_right#getEType()
	 * @see #getDiffGridNode_right()
	 * @generated
	 */
	EReference getDiffGridNode_right_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Food</em>'.
	 * @see pacmanDiffMM.DiffFood
	 * @generated
	 */
	EClass getDiffFood();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffFood#getDiff_kind_Left()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffFood#getDiff_kind_Right()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffFood#getChangeStatus()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanDiffMM.DiffFood#getNew_value_Left()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanDiffMM.DiffFood#getNew_value_Right()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFood#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanDiffMM.DiffFood#getValueChangeStatus()
	 * @see #getDiffFood()
	 * @generated
	 */
	EAttribute getDiffFood_ValueChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Pacman</em>'.
	 * @see pacmanDiffMM.DiffPacman
	 * @generated
	 */
	EClass getDiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffPacman#getDiff_kind_Left()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffPacman#getDiff_kind_Right()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffPacman#getChangeStatus()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Left <em>New initial Position Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New initial Position Left</em>'.
	 * @see pacmanDiffMM.DiffPacman#getNew_initialPosition_Left()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_New_initialPosition_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Right <em>New initial Position Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New initial Position Right</em>'.
	 * @see pacmanDiffMM.DiffPacman#getNew_initialPosition_Right()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_New_initialPosition_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPacman#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Position Change Status</em>'.
	 * @see pacmanDiffMM.DiffPacman#getInitialPositionChangeStatus()
	 * @see #getDiffPacman()
	 * @generated
	 */
	EAttribute getDiffPacman_InitialPositionChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Ghost</em>'.
	 * @see pacmanDiffMM.DiffGhost
	 * @generated
	 */
	EClass getDiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGhost#getDiff_kind_Left()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGhost#getDiff_kind_Right()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGhost#getChangeStatus()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New strategy Left</em>'.
	 * @see pacmanDiffMM.DiffGhost#getNew_strategy_Left()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_New_strategy_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New strategy Right</em>'.
	 * @see pacmanDiffMM.DiffGhost#getNew_strategy_Right()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_New_strategy_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Change Status</em>'.
	 * @see pacmanDiffMM.DiffGhost#getStrategyChangeStatus()
	 * @see #getDiffGhost()
	 * @generated
	 */
	EAttribute getDiffGhost_StrategyChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game</em>'.
	 * @see pacmanDiffMM.DiffGame
	 * @generated
	 */
	EClass getDiffGame();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGame#getDiff_kind_Left()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGame#getDiff_kind_Right()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame#getChangeStatus()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getNew_lives_Left <em>New lives Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lives Left</em>'.
	 * @see pacmanDiffMM.DiffGame#getNew_lives_Left()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_lives_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getNew_lives_Right <em>New lives Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lives Right</em>'.
	 * @see pacmanDiffMM.DiffGame#getNew_lives_Right()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_lives_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame#getLivesChangeStatus()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_LivesChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getNew_score_Left <em>New score Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New score Left</em>'.
	 * @see pacmanDiffMM.DiffGame#getNew_score_Left()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_score_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getNew_score_Right <em>New score Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New score Right</em>'.
	 * @see pacmanDiffMM.DiffGame#getNew_score_Right()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_New_score_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame#getScoreChangeStatus <em>Score Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame#getScoreChangeStatus()
	 * @see #getDiffGame()
	 * @generated
	 */
	EAttribute getDiffGame_ScoreChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game gridnodes</em>'.
	 * @see pacmanDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	EClass getDiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_gridnodes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGame_gridnodes#getDiff_kind_Left()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getDiffGame_gridnodes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_gridnodes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGame_gridnodes#getDiff_kind_Right()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getDiffGame_gridnodes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_gridnodes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame_gridnodes#getChangeStatus()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getDiffGame_gridnodes_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGame_gridnodes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGame_gridnodes#getEType()
	 * @see #getDiffGame_gridnodes()
	 * @generated
	 */
	EReference getDiffGame_gridnodes_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game entities</em>'.
	 * @see pacmanDiffMM.DiffGame_entities
	 * @generated
	 */
	EClass getDiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_entities#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGame_entities#getDiff_kind_Left()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EAttribute getDiffGame_entities_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_entities#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGame_entities#getDiff_kind_Right()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EAttribute getDiffGame_entities_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_entities#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame_entities#getChangeStatus()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EAttribute getDiffGame_entities_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGame_entities#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGame_entities#getEType()
	 * @see #getDiffGame_entities()
	 * @generated
	 */
	EReference getDiffGame_entities_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game domainspecificdiffs</em>'.
	 * @see pacmanDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffGame_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_domainspecificdiffs#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGame_domainspecificdiffs#getDiff_kind_Left()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffGame_domainspecificdiffs_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_domainspecificdiffs#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGame_domainspecificdiffs#getDiff_kind_Right()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffGame_domainspecificdiffs_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_domainspecificdiffs#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame_domainspecificdiffs#getChangeStatus()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffGame_domainspecificdiffs_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGame_domainspecificdiffs#getEType()
	 * @see #getDiffGame_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffGame_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffGame_semanticconflicts <em>Diff Game semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Game semanticconflicts</em>'.
	 * @see pacmanDiffMM.DiffGame_semanticconflicts
	 * @generated
	 */
	EClass getDiffGame_semanticconflicts();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_semanticconflicts#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffGame_semanticconflicts#getDiff_kind_Left()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getDiffGame_semanticconflicts_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_semanticconflicts#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffGame_semanticconflicts#getDiff_kind_Right()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getDiffGame_semanticconflicts_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffGame_semanticconflicts#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffGame_semanticconflicts#getChangeStatus()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EAttribute getDiffGame_semanticconflicts_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffGame_semanticconflicts#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffGame_semanticconflicts#getEType()
	 * @see #getDiffGame_semanticconflicts()
	 * @generated
	 */
	EReference getDiffGame_semanticconflicts_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Positionable Entity on</em>'.
	 * @see pacmanDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	EClass getDiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPositionableEntity_on#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffPositionableEntity_on#getDiff_kind_Left()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getDiffPositionableEntity_on_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPositionableEntity_on#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffPositionableEntity_on#getDiff_kind_Right()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getDiffPositionableEntity_on_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffPositionableEntity_on#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffPositionableEntity_on#getChangeStatus()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getDiffPositionableEntity_on_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link pacmanDiffMM.DiffPositionableEntity_on#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanDiffMM.DiffPositionableEntity_on#getEType()
	 * @see #getDiffPositionableEntity_on()
	 * @generated
	 */
	EReference getDiffPositionableEntity_on_EType();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffFruit <em>Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Fruit</em>'.
	 * @see pacmanDiffMM.DiffFruit
	 * @generated
	 */
	EClass getDiffFruit();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffFruit#getDiff_kind_Left()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffFruit#getDiff_kind_Right()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffFruit#getChangeStatus()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanDiffMM.DiffFruit#getNew_value_Left()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanDiffMM.DiffFruit#getNew_value_Right()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffFruit#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanDiffMM.DiffFruit#getValueChangeStatus()
	 * @see #getDiffFruit()
	 * @generated
	 */
	EAttribute getDiffFruit_ValueChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM.DiffEnergizer <em>Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Energizer</em>'.
	 * @see pacmanDiffMM.DiffEnergizer
	 * @generated
	 */
	EClass getDiffEnergizer();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getDiff_kind_Left()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getDiff_kind_Right()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getChangeStatus()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getNew_value_Left()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getNew_value_Right()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getValueChangeStatus()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_ValueChangeStatus();

	/**
	 * Returns the meta object for the containment reference '{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New durations Left</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getNew_durations_Left()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EReference getDiffEnergizer_New_durations_Left();

	/**
	 * Returns the meta object for the containment reference '{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New durations Right</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getNew_durations_Right()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EReference getDiffEnergizer_New_durations_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanDiffMM.DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durations Change Status</em>'.
	 * @see pacmanDiffMM.DiffEnergizer#getDurationsChangeStatus()
	 * @see #getDiffEnergizer()
	 * @generated
	 */
	EAttribute getDiffEnergizer_DurationsChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanDiffMM._ListEInt <em>List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List EInt</em>'.
	 * @see pacmanDiffMM._ListEInt
	 * @generated
	 */
	EClass get_ListEInt();

	/**
	 * Returns the meta object for the attribute list '{@link pacmanDiffMM._ListEInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pacmanDiffMM._ListEInt#getValue()
	 * @see #get_ListEInt()
	 * @generated
	 */
	EAttribute get_ListEInt_Value();

	/**
	 * Returns the meta object for enum '{@link pacmanDiffMM.GhostStrategy <em>Ghost Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Strategy</em>'.
	 * @see pacmanDiffMM.GhostStrategy
	 * @generated
	 */
	EEnum getGhostStrategy();

	/**
	 * Returns the meta object for enum '{@link pacmanDiffMM.ClassDiffKind <em>Class Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Diff Kind</em>'.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @generated
	 */
	EEnum getClassDiffKind();

	/**
	 * Returns the meta object for enum '{@link pacmanDiffMM.AscDiffKind <em>Asc Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Diff Kind</em>'.
	 * @see pacmanDiffMM.AscDiffKind
	 * @generated
	 */
	EEnum getAscDiffKind();

	/**
	 * Returns the meta object for enum '{@link pacmanDiffMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see pacmanDiffMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link pacmanDiffMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see pacmanDiffMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanDiffMMFactory getPacmanDiffMMFactory();

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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.GridNodeImpl <em>Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.GridNodeImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGridNode()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.FoodImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getFood()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.PacmanImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getPacman()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.GhostImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGhost()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.GameImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGame()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.PositionableEntityImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getPositionableEntity()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.FruitImpl <em>Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.FruitImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getFruit()
		 * @generated
		 */
		EClass FRUIT = eINSTANCE.getFruit();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.EnergizerImpl <em>Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.EnergizerImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getEnergizer()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DomainSpecificDiffImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDomainSpecificDiff()
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
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_DIFF__AUTHOR = eINSTANCE.getDomainSpecificDiff_Author();

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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.SemanticConflictImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getSemanticConflict()
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
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGridNodeImpl <em>Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGridNodeImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode()
		 * @generated
		 */
		EClass DIFF_GRID_NODE = eINSTANCE.getDiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__DIFF_KIND_LEFT = eINSTANCE.getDiffGridNode_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__DIFF_KIND_RIGHT = eINSTANCE.getDiffGridNode_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE__CHANGE_STATUS = eINSTANCE.getDiffGridNode_ChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGridNode_upImpl <em>Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGridNode_upImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_up()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_UP = eINSTANCE.getDiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_UP__DIFF_KIND_LEFT = eINSTANCE.getDiffGridNode_up_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT = eINSTANCE.getDiffGridNode_up_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_UP__CHANGE_STATUS = eINSTANCE.getDiffGridNode_up_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_UP__ETYPE = eINSTANCE.getDiffGridNode_up_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGridNode_downImpl <em>Diff Grid Node down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGridNode_downImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_down()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_DOWN = eINSTANCE.getDiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT = eINSTANCE.getDiffGridNode_down_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT = eINSTANCE.getDiffGridNode_down_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_DOWN__CHANGE_STATUS = eINSTANCE.getDiffGridNode_down_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_DOWN__ETYPE = eINSTANCE.getDiffGridNode_down_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGridNode_leftImpl <em>Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGridNode_leftImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_left()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_LEFT = eINSTANCE.getDiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT = eINSTANCE.getDiffGridNode_left_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT = eINSTANCE.getDiffGridNode_left_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_LEFT__CHANGE_STATUS = eINSTANCE.getDiffGridNode_left_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_LEFT__ETYPE = eINSTANCE.getDiffGridNode_left_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGridNode_rightImpl <em>Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGridNode_rightImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGridNode_right()
		 * @generated
		 */
		EClass DIFF_GRID_NODE_RIGHT = eINSTANCE.getDiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT = eINSTANCE.getDiffGridNode_right_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT = eINSTANCE.getDiffGridNode_right_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GRID_NODE_RIGHT__CHANGE_STATUS = eINSTANCE.getDiffGridNode_right_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GRID_NODE_RIGHT__ETYPE = eINSTANCE.getDiffGridNode_right_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffFoodImpl <em>Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffFoodImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffFood()
		 * @generated
		 */
		EClass DIFF_FOOD = eINSTANCE.getDiffFood();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__DIFF_KIND_LEFT = eINSTANCE.getDiffFood_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__DIFF_KIND_RIGHT = eINSTANCE.getDiffFood_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__CHANGE_STATUS = eINSTANCE.getDiffFood_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__NEW_VALUE_LEFT = eINSTANCE.getDiffFood_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__NEW_VALUE_RIGHT = eINSTANCE.getDiffFood_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FOOD__VALUE_CHANGE_STATUS = eINSTANCE.getDiffFood_ValueChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffPacmanImpl <em>Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffPacmanImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffPacman()
		 * @generated
		 */
		EClass DIFF_PACMAN = eINSTANCE.getDiffPacman();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__DIFF_KIND_LEFT = eINSTANCE.getDiffPacman_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__DIFF_KIND_RIGHT = eINSTANCE.getDiffPacman_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__CHANGE_STATUS = eINSTANCE.getDiffPacman_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New initial Position Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT = eINSTANCE.getDiffPacman_New_initialPosition_Left();

		/**
		 * The meta object literal for the '<em><b>New initial Position Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT = eINSTANCE.getDiffPacman_New_initialPosition_Right();

		/**
		 * The meta object literal for the '<em><b>Initial Position Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS = eINSTANCE.getDiffPacman_InitialPositionChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGhostImpl <em>Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGhostImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGhost()
		 * @generated
		 */
		EClass DIFF_GHOST = eINSTANCE.getDiffGhost();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__DIFF_KIND_LEFT = eINSTANCE.getDiffGhost_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__DIFF_KIND_RIGHT = eINSTANCE.getDiffGhost_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__CHANGE_STATUS = eINSTANCE.getDiffGhost_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New strategy Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__NEW_STRATEGY_LEFT = eINSTANCE.getDiffGhost_New_strategy_Left();

		/**
		 * The meta object literal for the '<em><b>New strategy Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__NEW_STRATEGY_RIGHT = eINSTANCE.getDiffGhost_New_strategy_Right();

		/**
		 * The meta object literal for the '<em><b>Strategy Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GHOST__STRATEGY_CHANGE_STATUS = eINSTANCE.getDiffGhost_StrategyChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGameImpl <em>Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGameImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame()
		 * @generated
		 */
		EClass DIFF_GAME = eINSTANCE.getDiffGame();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__DIFF_KIND_LEFT = eINSTANCE.getDiffGame_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__DIFF_KIND_RIGHT = eINSTANCE.getDiffGame_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__CHANGE_STATUS = eINSTANCE.getDiffGame_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New lives Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_LIVES_LEFT = eINSTANCE.getDiffGame_New_lives_Left();

		/**
		 * The meta object literal for the '<em><b>New lives Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_LIVES_RIGHT = eINSTANCE.getDiffGame_New_lives_Right();

		/**
		 * The meta object literal for the '<em><b>Lives Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__LIVES_CHANGE_STATUS = eINSTANCE.getDiffGame_LivesChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New score Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_SCORE_LEFT = eINSTANCE.getDiffGame_New_score_Left();

		/**
		 * The meta object literal for the '<em><b>New score Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__NEW_SCORE_RIGHT = eINSTANCE.getDiffGame_New_score_Right();

		/**
		 * The meta object literal for the '<em><b>Score Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME__SCORE_CHANGE_STATUS = eINSTANCE.getDiffGame_ScoreChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGame_gridnodesImpl <em>Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGame_gridnodesImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_gridnodes()
		 * @generated
		 */
		EClass DIFF_GAME_GRIDNODES = eINSTANCE.getDiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT = eINSTANCE.getDiffGame_gridnodes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT = eINSTANCE.getDiffGame_gridnodes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_GRIDNODES__CHANGE_STATUS = eINSTANCE.getDiffGame_gridnodes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_GRIDNODES__ETYPE = eINSTANCE.getDiffGame_gridnodes_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGame_entitiesImpl <em>Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGame_entitiesImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_entities()
		 * @generated
		 */
		EClass DIFF_GAME_ENTITIES = eINSTANCE.getDiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_ENTITIES__DIFF_KIND_LEFT = eINSTANCE.getDiffGame_entities_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT = eINSTANCE.getDiffGame_entities_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_ENTITIES__CHANGE_STATUS = eINSTANCE.getDiffGame_entities_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_ENTITIES__ETYPE = eINSTANCE.getDiffGame_entities_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGame_domainspecificdiffsImpl <em>Diff Game domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGame_domainspecificdiffsImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_GAME_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffGame_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND_LEFT = eINSTANCE.getDiffGame_domainspecificdiffs_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND_RIGHT = eINSTANCE.getDiffGame_domainspecificdiffs_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_DOMAINSPECIFICDIFFS__CHANGE_STATUS = eINSTANCE.getDiffGame_domainspecificdiffs_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffGame_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffGame_semanticconflictsImpl <em>Diff Game semanticconflicts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffGame_semanticconflictsImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffGame_semanticconflicts()
		 * @generated
		 */
		EClass DIFF_GAME_SEMANTICCONFLICTS = eINSTANCE.getDiffGame_semanticconflicts();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND_LEFT = eINSTANCE.getDiffGame_semanticconflicts_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND_RIGHT = eINSTANCE.getDiffGame_semanticconflicts_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_GAME_SEMANTICCONFLICTS__CHANGE_STATUS = eINSTANCE.getDiffGame_semanticconflicts_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_GAME_SEMANTICCONFLICTS__ETYPE = eINSTANCE.getDiffGame_semanticconflicts_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffPositionableEntity_onImpl <em>Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffPositionableEntity_onImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffPositionableEntity_on()
		 * @generated
		 */
		EClass DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getDiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT = eINSTANCE.getDiffPositionableEntity_on_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT = eINSTANCE.getDiffPositionableEntity_on_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS = eINSTANCE.getDiffPositionableEntity_on_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_POSITIONABLE_ENTITY_ON__ETYPE = eINSTANCE.getDiffPositionableEntity_on_EType();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffFruitImpl <em>Diff Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffFruitImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffFruit()
		 * @generated
		 */
		EClass DIFF_FRUIT = eINSTANCE.getDiffFruit();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__DIFF_KIND_LEFT = eINSTANCE.getDiffFruit_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__DIFF_KIND_RIGHT = eINSTANCE.getDiffFruit_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__CHANGE_STATUS = eINSTANCE.getDiffFruit_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__NEW_VALUE_LEFT = eINSTANCE.getDiffFruit_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__NEW_VALUE_RIGHT = eINSTANCE.getDiffFruit_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FRUIT__VALUE_CHANGE_STATUS = eINSTANCE.getDiffFruit_ValueChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl.DiffEnergizerImpl <em>Diff Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl.DiffEnergizerImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getDiffEnergizer()
		 * @generated
		 */
		EClass DIFF_ENERGIZER = eINSTANCE.getDiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__DIFF_KIND_LEFT = eINSTANCE.getDiffEnergizer_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__DIFF_KIND_RIGHT = eINSTANCE.getDiffEnergizer_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__CHANGE_STATUS = eINSTANCE.getDiffEnergizer_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__NEW_VALUE_LEFT = eINSTANCE.getDiffEnergizer_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__NEW_VALUE_RIGHT = eINSTANCE.getDiffEnergizer_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__VALUE_CHANGE_STATUS = eINSTANCE.getDiffEnergizer_ValueChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New durations Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ENERGIZER__NEW_DURATIONS_LEFT = eINSTANCE.getDiffEnergizer_New_durations_Left();

		/**
		 * The meta object literal for the '<em><b>New durations Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ENERGIZER__NEW_DURATIONS_RIGHT = eINSTANCE.getDiffEnergizer_New_durations_Right();

		/**
		 * The meta object literal for the '<em><b>Durations Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS = eINSTANCE.getDiffEnergizer_DurationsChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.impl._ListEIntImpl <em>List EInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.impl._ListEIntImpl
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#get_ListEInt()
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
		 * The meta object literal for the '{@link pacmanDiffMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.GhostStrategy
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getGhostStrategy()
		 * @generated
		 */
		EEnum GHOST_STRATEGY = eINSTANCE.getGhostStrategy();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.ClassDiffKind
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getClassDiffKind()
		 * @generated
		 */
		EEnum CLASS_DIFF_KIND = eINSTANCE.getClassDiffKind();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.AscDiffKind
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getAscDiffKind()
		 * @generated
		 */
		EEnum ASC_DIFF_KIND = eINSTANCE.getAscDiffKind();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.AUTHOR
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link pacmanDiffMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanDiffMM.ChangeStatus
		 * @see pacmanDiffMM.impl.PacmanDiffMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

	}

} //PacmanDiffMMPackage
