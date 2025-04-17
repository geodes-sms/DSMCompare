/**
 */
package pacmanCRRuleMM;

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
 * @see pacmanCRRuleMM.PacmanCRRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanCRRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pacmanCRRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/pacmanCRRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pacmanCRRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanCRRuleMMPackage eINSTANCE = pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticObject()
	 * @generated
	 */
	int PATTERN_SEMANTIC_OBJECT = 25;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES = 8;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST = 9;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE = 10;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN = 11;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT = 12;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT = 13;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP = 14;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN = 15;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON = 16;

	/**
	 * The feature id for the '<em><b>Semantic Object Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME = 17;

	/**
	 * The feature id for the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE = 18;

	/**
	 * The feature id for the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY = 19;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_ConflictResolutionImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_ConflictResolution()
	 * @generated
	 */
	int PATTERN_CONFLICT_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ENERGIZER = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_FOOD = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_FRUIT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GHOST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PACMAN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON;

	/**
	 * The feature id for the '<em><b>Semantic Object Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_POSITIONABLE_ENTITY = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_PositionableEntity()
	 * @generated
	 */
	int PATTERN_POSITIONABLE_ENTITY = 22;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ID = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__ON = 3;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY__DIFFON = 4;

	/**
	 * The number of structural features of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pattern Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl <em>Pattern Diff Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffEnergizer()
	 * @generated
	 */
	int PATTERN_DIFF_ENERGIZER = 1;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__FILTER = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__IS_MERGED = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Durations Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New durations Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New durations Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Pattern Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pattern Diff Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ENERGIZER_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffFoodImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffFood()
	 * @generated
	 */
	int PATTERN_DIFF_FOOD = 2;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFF_KIND_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__DIFF_KIND_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__FILTER = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__IS_MERGED = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_ID_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_ID_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__ID_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_VALUE_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__NEW_VALUE_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD__VALUE_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FOOD_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl <em>Pattern Diff Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffFruitImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffFruit()
	 * @generated
	 */
	int PATTERN_DIFF_FRUIT = 3;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__FILTER = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__IS_MERGED = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_ID_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_ID_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New location Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New location Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Location Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Pattern Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pattern Diff Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FRUIT_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_GameImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Game()
	 * @generated
	 */
	int PATTERN_GAME = 18;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ID = 2;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__LIVES = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__SCORE = 4;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__GRIDNODES = 5;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__ENTITIES = 6;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFGRIDNODES = 7;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME__DIFFENTITIES = 8;

	/**
	 * The number of structural features of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGameImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame()
	 * @generated
	 */
	int PATTERN_DIFF_GAME = 4;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID_PATTERN = PATTERN_GAME__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__IS_FORBIDDEN = PATTERN_GAME__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID = PATTERN_GAME__ID;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__LIVES = PATTERN_GAME__LIVES;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__SCORE = PATTERN_GAME__SCORE;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__GRIDNODES = PATTERN_GAME__GRIDNODES;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ENTITIES = PATTERN_GAME__ENTITIES;

	/**
	 * The feature id for the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFGRIDNODES = PATTERN_GAME__DIFFGRIDNODES;

	/**
	 * The feature id for the '<em><b>Diffentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFFENTITIES = PATTERN_GAME__DIFFENTITIES;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFF_KIND_LEFT = PATTERN_GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__DIFF_KIND_RIGHT = PATTERN_GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__FILTER = PATTERN_GAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__IS_MERGED = PATTERN_GAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__CHANGE_STATUS = PATTERN_GAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_ID_LEFT = PATTERN_GAME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_ID_RIGHT = PATTERN_GAME_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__ID_CHANGE_STATUS = PATTERN_GAME_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New lives Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_LIVES_LEFT = PATTERN_GAME_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New lives Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_LIVES_RIGHT = PATTERN_GAME_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lives Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS = PATTERN_GAME_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New score Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_SCORE_LEFT = PATTERN_GAME_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New score Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__NEW_SCORE_RIGHT = PATTERN_GAME_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Score Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS = PATTERN_GAME_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_FEATURE_COUNT = PATTERN_GAME_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pattern Diff Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_OPERATION_COUNT = PATTERN_GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGame_entitiesImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame_entities()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_ENTITIES = 5;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Game entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_ENTITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGame_gridnodesImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	int PATTERN_DIFF_GAME_GRIDNODES = 6;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Game gridnodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GAME_GRIDNODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGhostImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGhost()
	 * @generated
	 */
	int PATTERN_DIFF_GHOST = 7;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFF_KIND_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__DIFF_KIND_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__FILTER = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__IS_MERGED = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_ID_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_ID_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__ID_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New strategy Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_STRATEGY_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New strategy Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__NEW_STRATEGY_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strategy Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST__STRATEGY_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GHOST_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_GridNodeImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_GridNode()
	 * @generated
	 */
	int PATTERN_GRID_NODE = 20;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__ID = 2;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__UP = 3;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DOWN = 4;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__LEFT = 5;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__RIGHT = 6;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFUP = 7;

	/**
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFDOWN = 8;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFLEFT = 9;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE__DIFFRIGHT = 10;

	/**
	 * The number of structural features of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Pattern Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GRID_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNodeImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE = 8;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID_PATTERN = PATTERN_GRID_NODE__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__IS_FORBIDDEN = PATTERN_GRID_NODE__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID = PATTERN_GRID_NODE__ID;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__UP = PATTERN_GRID_NODE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DOWN = PATTERN_GRID_NODE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__LEFT = PATTERN_GRID_NODE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__RIGHT = PATTERN_GRID_NODE__RIGHT;

	/**
	 * The feature id for the '<em><b>Diffup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFUP = PATTERN_GRID_NODE__DIFFUP;

	/**
	 * The feature id for the '<em><b>Diffdown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFDOWN = PATTERN_GRID_NODE__DIFFDOWN;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFLEFT = PATTERN_GRID_NODE__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFFRIGHT = PATTERN_GRID_NODE__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFF_KIND_LEFT = PATTERN_GRID_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__DIFF_KIND_RIGHT = PATTERN_GRID_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__FILTER = PATTERN_GRID_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__IS_MERGED = PATTERN_GRID_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__CHANGE_STATUS = PATTERN_GRID_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__NEW_ID_LEFT = PATTERN_GRID_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__NEW_ID_RIGHT = PATTERN_GRID_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE__ID_CHANGE_STATUS = PATTERN_GRID_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_FEATURE_COUNT = PATTERN_GRID_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_OPERATION_COUNT = PATTERN_GRID_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_downImpl <em>Pattern Diff Grid Node down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_downImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_down()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN = 9;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_DOWN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_leftImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_left()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT = 10;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_LEFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_rightImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_right()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT = 11;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_RIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_upImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_up()
	 * @generated
	 */
	int PATTERN_DIFF_GRID_NODE_UP = 12;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Grid Node up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_GRID_NODE_UP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffPacman()
	 * @generated
	 */
	int PATTERN_DIFF_PACMAN = 13;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__FILTER = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__IS_MERGED = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_ID_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_ID_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New initial Position Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New initial Position Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Initial Position Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PACMAN_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON = 14;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Positionable Entity on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_POSITIONABLE_ENTITY_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_EnergizerImpl <em>Pattern Energizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_EnergizerImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Energizer()
	 * @generated
	 */
	int PATTERN_ENERGIZER = 15;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER__DURATIONS = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Energizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ENERGIZER_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_FoodImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Food()
	 * @generated
	 */
	int PATTERN_FOOD = 16;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD__VALUE = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FOOD_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_FruitImpl <em>Pattern Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_FruitImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Fruit()
	 * @generated
	 */
	int PATTERN_FRUIT = 17;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT__LOCATION = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FRUIT_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_GhostImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Ghost()
	 * @generated
	 */
	int PATTERN_GHOST = 19;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST__STRATEGY = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GHOST_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_PacmanImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Pacman()
	 * @generated
	 */
	int PATTERN_PACMAN = 21;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID_PATTERN = PATTERN_POSITIONABLE_ENTITY__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__IS_FORBIDDEN = PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ID = PATTERN_POSITIONABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__ON = PATTERN_POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Diffon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__DIFFON = PATTERN_POSITIONABLE_ENTITY__DIFFON;

	/**
	 * The feature id for the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN__INITIAL_POSITION = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_FEATURE_COUNT = PATTERN_POSITIONABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PACMAN_OPERATION_COUNT = PATTERN_POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 23;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ENERGIZER = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_FOOD = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_FRUIT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GHOST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PACMAN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON;

	/**
	 * The feature id for the '<em><b>Semantic Object Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY;

	/**
	 * The feature id for the '<em><b>Conflict kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern_SemanticDiffImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticDiff()
	 * @generated
	 */
	int PATTERN_SEMANTIC_DIFF = 24;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ENERGIZER = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_FOOD = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_FRUIT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GHOST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PACMAN = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON;

	/**
	 * The feature id for the '<em><b>Semantic Object Game</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_GAME = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_GRID_NODE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE;

	/**
	 * The feature id for the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_POSITIONABLE_ENTITY = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__AUTHOR = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.Pattern__ListEIntImpl <em>Pattern List EInt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.Pattern__ListEIntImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern__ListEInt()
	 * @generated
	 */
	int PATTERN_LIST_EINT = 26;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Pattern List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pattern List EInt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_EINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.impl.RuleImpl
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getRule()
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
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Energizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER = 4;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Food</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_FOOD = 5;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Fruit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT = 6;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Game</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GAME = 7;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Game entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES = 8;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Game gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES = 9;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Ghost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GHOST = 10;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Grid Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE = 11;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Grid Node down</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN = 12;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Grid Node left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Grid Node right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT = 14;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Grid Node up</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP = 15;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Pacman</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN = 16;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Positionable Entity on</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON = 17;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Game</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_GAME = 18;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Grid Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_GRID_NODE = 19;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Positionable Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY = 20;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.AUTHOR
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 28;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 29;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.ConflictGranularity
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictGranularity()
	 * @generated
	 */
	int CONFLICT_GRANULARITY = 30;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.ConflictResolutionStrategy
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictResolutionStrategy()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_STRATEGY = 31;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.ConflictResolutionType
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictResolutionType()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_TYPE = 32;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.DiffKind
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 33;

	/**
	 * The meta object id for the '{@link pacmanCRRuleMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getGhostStrategy()
	 * @generated
	 */
	int GHOST_STRATEGY = 34;


	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Conflict Resolution</em>'.
	 * @see pacmanCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	EClass getPattern_ConflictResolution();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_ConflictResolution#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see pacmanCRRuleMM.Pattern_ConflictResolution#getResolutionType()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Strategy</em>'.
	 * @see pacmanCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticconflicts</em>'.
	 * @see pacmanCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EReference getPattern_ConflictResolution_Semanticconflicts();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffEnergizer <em>Pattern Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Energizer</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer
	 * @generated
	 */
	EClass getPattern_DiffEnergizer();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Left()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Right()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#isFilter()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#isIsMerged()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getChangeStatus()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Left()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Right()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getIdChangeStatus()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Left()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Right()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getValueChangeStatus()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_ValueChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durations Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getDurationsChangeStatus()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EAttribute getPattern_DiffEnergizer_DurationsChangeStatus();

	/**
	 * Returns the meta object for the containment reference '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New durations Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Left()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EReference getPattern_DiffEnergizer_New_durations_Left();

	/**
	 * Returns the meta object for the containment reference '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New durations Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Right()
	 * @see #getPattern_DiffEnergizer()
	 * @generated
	 */
	EReference getPattern_DiffEnergizer_New_durations_Right();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffFood <em>Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Food</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood
	 * @generated
	 */
	EClass getPattern_DiffFood();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getDiff_kind_Left()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getDiff_kind_Right()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#isFilter()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#isIsMerged()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getChangeStatus()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getNew_id_Left()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getNew_id_Right()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getIdChangeStatus()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getNew_value_Left()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getNew_value_Right()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFood#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFood#getValueChangeStatus()
	 * @see #getPattern_DiffFood()
	 * @generated
	 */
	EAttribute getPattern_DiffFood_ValueChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffFruit <em>Pattern Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Fruit</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit
	 * @generated
	 */
	EClass getPattern_DiffFruit();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Left()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Right()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#isFilter()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#isIsMerged()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getChangeStatus()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Left()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Right()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getIdChangeStatus()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Left <em>New value Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Left()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_value_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Right <em>New value Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Right()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_value_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getValueChangeStatus <em>Value Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getValueChangeStatus()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_ValueChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Left <em>New location Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New location Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Left()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_location_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Right <em>New location Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New location Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Right()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_New_location_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffFruit#getLocationChangeStatus <em>Location Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffFruit#getLocationChangeStatus()
	 * @see #getPattern_DiffFruit()
	 * @generated
	 */
	EAttribute getPattern_DiffFruit_LocationChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGame <em>Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame
	 * @generated
	 */
	EClass getPattern_DiffGame();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Left()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Right()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#isFilter()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#isIsMerged()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getChangeStatus()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Left()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Right()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getIdChangeStatus()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Left <em>New lives Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lives Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Left()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_lives_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Right <em>New lives Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New lives Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Right()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_lives_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getLivesChangeStatus()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_LivesChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Left <em>New score Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New score Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Left()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_score_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Right <em>New score Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New score Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Right()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_New_score_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame#getScoreChangeStatus <em>Score Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame#getScoreChangeStatus()
	 * @see #getPattern_DiffGame()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_ScoreChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGame_entities <em>Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game entities</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities
	 * @generated
	 */
	EClass getPattern_DiffGame_entities();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getID_Pattern()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#isIsForbidden()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_kind_Left()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_kind_Right()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getChangeStatus()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#isFilter()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#isIsMerged()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getDiff_Group()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_entities_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGame_entities#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_entities#getEType()
	 * @see #getPattern_DiffGame_entities()
	 * @generated
	 */
	EReference getPattern_DiffGame_entities_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes <em>Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Game gridnodes</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes
	 * @generated
	 */
	EClass getPattern_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getID_Pattern()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isIsForbidden()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_kind_Left()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_kind_Right()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getChangeStatus()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isFilter()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#isIsMerged()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getDiff_Group()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EAttribute getPattern_DiffGame_gridnodes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGame_gridnodes#getEType()
	 * @see #getPattern_DiffGame_gridnodes()
	 * @generated
	 */
	EReference getPattern_DiffGame_gridnodes_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGhost <em>Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Ghost</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost
	 * @generated
	 */
	EClass getPattern_DiffGhost();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Left()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Right()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#isFilter()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#isIsMerged()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getChangeStatus()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Left()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Right()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getIdChangeStatus()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New strategy Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Left()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_New_strategy_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New strategy Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Right()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_New_strategy_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGhost#getStrategyChangeStatus()
	 * @see #getPattern_DiffGhost()
	 * @generated
	 */
	EAttribute getPattern_DiffGhost_StrategyChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGridNode <em>Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode
	 * @generated
	 */
	EClass getPattern_DiffGridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getDiff_kind_Left()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getDiff_kind_Right()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#isFilter()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#isIsMerged()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getChangeStatus()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getNew_id_Left()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getNew_id_Right()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode#getIdChangeStatus()
	 * @see #getPattern_DiffGridNode()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_IdChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down <em>Pattern Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node down</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down
	 * @generated
	 */
	EClass getPattern_DiffGridNode_down();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getID_Pattern()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#isIsForbidden()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_kind_Left()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_kind_Right()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getChangeStatus()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#isFilter()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#isIsMerged()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getDiff_Group()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_down_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGridNode_down#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_down#getEType()
	 * @see #getPattern_DiffGridNode_down()
	 * @generated
	 */
	EReference getPattern_DiffGridNode_down_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left <em>Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left
	 * @generated
	 */
	EClass getPattern_DiffGridNode_left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getID_Pattern()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#isIsForbidden()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_kind_Left()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_kind_Right()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getChangeStatus()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#isFilter()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#isIsMerged()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getDiff_Group()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_left_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGridNode_left#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_left#getEType()
	 * @see #getPattern_DiffGridNode_left()
	 * @generated
	 */
	EReference getPattern_DiffGridNode_left_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right <em>Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right
	 * @generated
	 */
	EClass getPattern_DiffGridNode_right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getID_Pattern()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#isIsForbidden()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_kind_Left()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_kind_Right()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getChangeStatus()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#isFilter()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#isIsMerged()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getDiff_Group()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_right_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGridNode_right#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_right#getEType()
	 * @see #getPattern_DiffGridNode_right()
	 * @generated
	 */
	EReference getPattern_DiffGridNode_right_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up <em>Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Grid Node up</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up
	 * @generated
	 */
	EClass getPattern_DiffGridNode_up();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getID_Pattern()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#isIsForbidden()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_kind_Left()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_kind_Right()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getChangeStatus()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#isFilter()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#isIsMerged()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getDiff_Group()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EAttribute getPattern_DiffGridNode_up_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffGridNode_up#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffGridNode_up#getEType()
	 * @see #getPattern_DiffGridNode_up()
	 * @generated
	 */
	EReference getPattern_DiffGridNode_up_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffPacman <em>Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Pacman</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman
	 * @generated
	 */
	EClass getPattern_DiffPacman();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getDiff_kind_Left()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getDiff_kind_Right()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#isFilter()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#isIsMerged()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getChangeStatus()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getNew_id_Left()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getNew_id_Right()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getIdChangeStatus()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getNew_initialPosition_Left <em>New initial Position Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New initial Position Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getNew_initialPosition_Left()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_New_initialPosition_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getNew_initialPosition_Right <em>New initial Position Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New initial Position Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getNew_initialPosition_Right()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_New_initialPosition_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPacman#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Position Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPacman#getInitialPositionChangeStatus()
	 * @see #getPattern_DiffPacman()
	 * @generated
	 */
	EAttribute getPattern_DiffPacman_InitialPositionChangeStatus();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on <em>Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Positionable Entity on</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on
	 * @generated
	 */
	EClass getPattern_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Left()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Right()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getChangeStatus()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isFilter()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Filter();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsMerged()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_Group()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EAttribute getPattern_DiffPositionableEntity_on_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getEType()
	 * @see #getPattern_DiffPositionableEntity_on()
	 * @generated
	 */
	EReference getPattern_DiffPositionableEntity_on_EType();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Energizer <em>Pattern Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Energizer</em>'.
	 * @see pacmanCRRuleMM.Pattern_Energizer
	 * @generated
	 */
	EClass getPattern_Energizer();

	/**
	 * Returns the meta object for the attribute list '{@link pacmanCRRuleMM.Pattern_Energizer#getDurations <em>Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Durations</em>'.
	 * @see pacmanCRRuleMM.Pattern_Energizer#getDurations()
	 * @see #getPattern_Energizer()
	 * @generated
	 */
	EAttribute getPattern_Energizer_Durations();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Food <em>Pattern Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Food</em>'.
	 * @see pacmanCRRuleMM.Pattern_Food
	 * @generated
	 */
	EClass getPattern_Food();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Food#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pacmanCRRuleMM.Pattern_Food#getValue()
	 * @see #getPattern_Food()
	 * @generated
	 */
	EAttribute getPattern_Food_Value();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Fruit <em>Pattern Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Fruit</em>'.
	 * @see pacmanCRRuleMM.Pattern_Fruit
	 * @generated
	 */
	EClass getPattern_Fruit();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Fruit#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see pacmanCRRuleMM.Pattern_Fruit#getLocation()
	 * @see #getPattern_Fruit()
	 * @generated
	 */
	EAttribute getPattern_Fruit_Location();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Game <em>Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Game</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game
	 * @generated
	 */
	EClass getPattern_Game();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Game#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getID_Pattern()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Game#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#isIsForbidden()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Game#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getId()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_Id();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Game#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lives</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getLives()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_Lives();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Game#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getScore()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EAttribute getPattern_Game_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getGridnodes()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EReference getPattern_Game_Gridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_Game#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getEntities()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EReference getPattern_Game_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_Game#getDiffgridnodes <em>Diffgridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffgridnodes</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getDiffgridnodes()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EReference getPattern_Game_Diffgridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_Game#getDiffentities <em>Diffentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffentities</em>'.
	 * @see pacmanCRRuleMM.Pattern_Game#getDiffentities()
	 * @see #getPattern_Game()
	 * @generated
	 */
	EReference getPattern_Game_Diffentities();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Ghost <em>Pattern Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Ghost</em>'.
	 * @see pacmanCRRuleMM.Pattern_Ghost
	 * @generated
	 */
	EClass getPattern_Ghost();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Ghost#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see pacmanCRRuleMM.Pattern_Ghost#getStrategy()
	 * @see #getPattern_Ghost()
	 * @generated
	 */
	EAttribute getPattern_Ghost_Strategy();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_GridNode <em>Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Grid Node</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode
	 * @generated
	 */
	EClass getPattern_GridNode();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_GridNode#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getID_Pattern()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_GridNode#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#isIsForbidden()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getId()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EAttribute getPattern_GridNode_Id();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_GridNode#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getUp()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Up();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_GridNode#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Down</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getDown()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Down();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getLeft()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getRight()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Right();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_GridNode#getDiffup <em>Diffup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffup</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getDiffup()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Diffup();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_GridNode#getDiffdown <em>Diffdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdown</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getDiffdown()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Diffdown();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_GridNode#getDiffleft <em>Diffleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffleft</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getDiffleft()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Diffleft();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_GridNode#getDiffright <em>Diffright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffright</em>'.
	 * @see pacmanCRRuleMM.Pattern_GridNode#getDiffright()
	 * @see #getPattern_GridNode()
	 * @generated
	 */
	EReference getPattern_GridNode_Diffright();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_Pacman <em>Pattern Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Pacman</em>'.
	 * @see pacmanCRRuleMM.Pattern_Pacman
	 * @generated
	 */
	EClass getPattern_Pacman();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_Pacman#getInitialPosition <em>Initial Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Position</em>'.
	 * @see pacmanCRRuleMM.Pattern_Pacman#getInitialPosition()
	 * @see #getPattern_Pacman()
	 * @generated
	 */
	EAttribute getPattern_Pacman_InitialPosition();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_PositionableEntity <em>Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Positionable Entity</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity
	 * @generated
	 */
	EClass getPattern_PositionableEntity();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity#getID_Pattern()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_PositionableEntity#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity#isIsForbidden()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity#getId()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EAttribute getPattern_PositionableEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity#getOn()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EReference getPattern_PositionableEntity_On();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getDiffon <em>Diffon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffon</em>'.
	 * @see pacmanCRRuleMM.Pattern_PositionableEntity#getDiffon()
	 * @see #getPattern_PositionableEntity()
	 * @generated
	 */
	EReference getPattern_PositionableEntity_Diffon();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict kind</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_kind()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_kind();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict Granularity</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_Granularity();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EReference getPattern_SemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Diff</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	EClass getPattern_SemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticDiff#getAuthor()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Object</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	EClass getPattern_SemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getID_Pattern()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#isIsForbidden()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getName()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEnergizer <em>Semantic Object Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Energizer</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEnergizer()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEnergizer();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFood <em>Semantic Object Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Food</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFood()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffFood();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFruit <em>Semantic Object Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Fruit</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFruit()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffFruit();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame <em>Semantic Object Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Game</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGame();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_entities <em>Semantic Object Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Game entities</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_entities()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGame_entities();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_gridnodes <em>Semantic Object Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Game gridnodes</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_gridnodes()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGhost <em>Semantic Object Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Ghost</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGhost()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGhost();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode <em>Semantic Object Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Grid Node</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_down <em>Semantic Object Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Grid Node down</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_down()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_down();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_left <em>Semantic Object Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Grid Node left</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_left()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_left();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_right <em>Semantic Object Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Grid Node right</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_right()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_right();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_up <em>Semantic Object Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Grid Node up</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_up()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_up();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPacman <em>Semantic Object Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Pacman</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPacman()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPacman();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPositionableEntity_on <em>Semantic Object Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Positionable Entity on</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPositionableEntity_on()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_Game <em>Semantic Object Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Game</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_Game()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_Game();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_GridNode <em>Semantic Object Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Grid Node</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_GridNode()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_GridNode();

	/**
	 * Returns the meta object for the reference list '{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_PositionableEntity <em>Semantic Object Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Positionable Entity</em>'.
	 * @see pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_PositionableEntity()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_PositionableEntity();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Pattern__ListEInt <em>Pattern List EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern List EInt</em>'.
	 * @see pacmanCRRuleMM.Pattern__ListEInt
	 * @generated
	 */
	EClass getPattern__ListEInt();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern__ListEInt#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see pacmanCRRuleMM.Pattern__ListEInt#getID_Pattern()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Pattern__ListEInt#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see pacmanCRRuleMM.Pattern__ListEInt#isIsForbidden()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_IsForbidden();

	/**
	 * Returns the meta object for the attribute list '{@link pacmanCRRuleMM.Pattern__ListEInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pacmanCRRuleMM.Pattern__ListEInt#getValue()
	 * @see #getPattern__ListEInt()
	 * @generated
	 */
	EAttribute getPattern__ListEInt_Value();

	/**
	 * Returns the meta object for class '{@link pacmanCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see pacmanCRRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pacmanCRRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pacmanCRRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see pacmanCRRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link pacmanCRRuleMM.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pacmanCRRuleMM.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Semantic Object</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_SemanticObject();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffEnergizer <em>Rule Pattern Pattern Diff Energizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Energizer</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffEnergizer()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEnergizer();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFood <em>Rule Pattern Pattern Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Food</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFood()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffFood();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFruit <em>Rule Pattern Pattern Diff Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Fruit</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFruit()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffFruit();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame <em>Rule Pattern Pattern Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Game</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGame();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_entities <em>Rule Pattern Pattern Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Game entities</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_entities()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGame_entities();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_gridnodes <em>Rule Pattern Pattern Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Game gridnodes</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_gridnodes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGame_gridnodes();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGhost <em>Rule Pattern Pattern Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Ghost</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGhost()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGhost();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode <em>Rule Pattern Pattern Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Grid Node</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGridNode();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_down <em>Rule Pattern Pattern Diff Grid Node down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Grid Node down</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_down()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGridNode_down();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_left <em>Rule Pattern Pattern Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Grid Node left</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_left()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGridNode_left();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_right <em>Rule Pattern Pattern Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Grid Node right</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_right()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGridNode_right();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_up <em>Rule Pattern Pattern Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Grid Node up</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_up()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffGridNode_up();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPacman <em>Rule Pattern Pattern Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Pacman</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPacman()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPacman();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPositionableEntity_on <em>Rule Pattern Pattern Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Positionable Entity on</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPositionableEntity_on()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPositionableEntity_on();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_Game <em>Rule Pattern Pattern Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Game</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_Game()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_GridNode <em>Rule Pattern Pattern Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Grid Node</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_GridNode()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_GridNode();

	/**
	 * Returns the meta object for the containment reference list '{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_PositionableEntity <em>Rule Pattern Pattern Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Positionable Entity</em>'.
	 * @see pacmanCRRuleMM.Rule#getRulePattern_Pattern_PositionableEntity()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_PositionableEntity();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see pacmanCRRuleMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Granularity</em>'.
	 * @see pacmanCRRuleMM.ConflictGranularity
	 * @generated
	 */
	EEnum getConflictGranularity();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Strategy</em>'.
	 * @see pacmanCRRuleMM.ConflictResolutionStrategy
	 * @generated
	 */
	EEnum getConflictResolutionStrategy();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Type</em>'.
	 * @see pacmanCRRuleMM.ConflictResolutionType
	 * @generated
	 */
	EEnum getConflictResolutionType();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see pacmanCRRuleMM.DiffKind
	 * @generated
	 */
	EEnum getDiffKind();

	/**
	 * Returns the meta object for enum '{@link pacmanCRRuleMM.GhostStrategy <em>Ghost Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ghost Strategy</em>'.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @generated
	 */
	EEnum getGhostStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanCRRuleMMFactory getPacmanCRRuleMMFactory();

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
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_ConflictResolutionImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_ConflictResolution()
		 * @generated
		 */
		EClass PATTERN_CONFLICT_RESOLUTION = eINSTANCE.getPattern_ConflictResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = eINSTANCE.getPattern_ConflictResolution_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Resolution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = eINSTANCE.getPattern_ConflictResolution_ResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = eINSTANCE.getPattern_ConflictResolution_Semanticconflicts();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl <em>Pattern Diff Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffEnergizer()
		 * @generated
		 */
		EClass PATTERN_DIFF_ENERGIZER = eINSTANCE.getPattern_DiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEnergizer_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEnergizer_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__FILTER = eINSTANCE.getPattern_DiffEnergizer_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__IS_MERGED = eINSTANCE.getPattern_DiffEnergizer_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__CHANGE_STATUS = eINSTANCE.getPattern_DiffEnergizer_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT = eINSTANCE.getPattern_DiffEnergizer_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffEnergizer_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffEnergizer_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT = eINSTANCE.getPattern_DiffEnergizer_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT = eINSTANCE.getPattern_DiffEnergizer_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS = eINSTANCE.getPattern_DiffEnergizer_ValueChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Durations Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS = eINSTANCE.getPattern_DiffEnergizer_DurationsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New durations Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT = eINSTANCE.getPattern_DiffEnergizer_New_durations_Left();

		/**
		 * The meta object literal for the '<em><b>New durations Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT = eINSTANCE.getPattern_DiffEnergizer_New_durations_Right();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffFoodImpl <em>Pattern Diff Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffFoodImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffFood()
		 * @generated
		 */
		EClass PATTERN_DIFF_FOOD = eINSTANCE.getPattern_DiffFood();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffFood_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffFood_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__FILTER = eINSTANCE.getPattern_DiffFood_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__IS_MERGED = eINSTANCE.getPattern_DiffFood_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__CHANGE_STATUS = eINSTANCE.getPattern_DiffFood_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__NEW_ID_LEFT = eINSTANCE.getPattern_DiffFood_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffFood_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffFood_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__NEW_VALUE_LEFT = eINSTANCE.getPattern_DiffFood_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__NEW_VALUE_RIGHT = eINSTANCE.getPattern_DiffFood_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FOOD__VALUE_CHANGE_STATUS = eINSTANCE.getPattern_DiffFood_ValueChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl <em>Pattern Diff Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffFruitImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffFruit()
		 * @generated
		 */
		EClass PATTERN_DIFF_FRUIT = eINSTANCE.getPattern_DiffFruit();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffFruit_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffFruit_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__FILTER = eINSTANCE.getPattern_DiffFruit_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__IS_MERGED = eINSTANCE.getPattern_DiffFruit_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__CHANGE_STATUS = eINSTANCE.getPattern_DiffFruit_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_ID_LEFT = eINSTANCE.getPattern_DiffFruit_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffFruit_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffFruit_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New value Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT = eINSTANCE.getPattern_DiffFruit_New_value_Left();

		/**
		 * The meta object literal for the '<em><b>New value Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT = eINSTANCE.getPattern_DiffFruit_New_value_Right();

		/**
		 * The meta object literal for the '<em><b>Value Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS = eINSTANCE.getPattern_DiffFruit_ValueChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New location Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT = eINSTANCE.getPattern_DiffFruit_New_location_Left();

		/**
		 * The meta object literal for the '<em><b>New location Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT = eINSTANCE.getPattern_DiffFruit_New_location_Right();

		/**
		 * The meta object literal for the '<em><b>Location Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS = eINSTANCE.getPattern_DiffFruit_LocationChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl <em>Pattern Diff Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGameImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame()
		 * @generated
		 */
		EClass PATTERN_DIFF_GAME = eINSTANCE.getPattern_DiffGame();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGame_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGame_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__FILTER = eINSTANCE.getPattern_DiffGame_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__IS_MERGED = eINSTANCE.getPattern_DiffGame_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_ID_LEFT = eINSTANCE.getPattern_DiffGame_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffGame_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New lives Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_LIVES_LEFT = eINSTANCE.getPattern_DiffGame_New_lives_Left();

		/**
		 * The meta object literal for the '<em><b>New lives Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_LIVES_RIGHT = eINSTANCE.getPattern_DiffGame_New_lives_Right();

		/**
		 * The meta object literal for the '<em><b>Lives Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_LivesChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New score Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_SCORE_LEFT = eINSTANCE.getPattern_DiffGame_New_score_Left();

		/**
		 * The meta object literal for the '<em><b>New score Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__NEW_SCORE_RIGHT = eINSTANCE.getPattern_DiffGame_New_score_Right();

		/**
		 * The meta object literal for the '<em><b>Score Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_ScoreChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGame_entitiesImpl <em>Pattern Diff Game entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGame_entitiesImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame_entities()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_entities_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGame_entities_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGame_entities_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_entities_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__FILTER = eINSTANCE.getPattern_DiffGame_entities_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__IS_MERGED = eINSTANCE.getPattern_DiffGame_entities_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_ENTITIES__DIFF_GROUP = eINSTANCE.getPattern_DiffGame_entities_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GAME_ENTITIES__ETYPE = eINSTANCE.getPattern_DiffGame_entities_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGame_gridnodesImpl <em>Pattern Diff Game gridnodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGame_gridnodesImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGame_gridnodes()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGame_gridnodes_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGame_gridnodes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGame_gridnodes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__CHANGE_STATUS = eINSTANCE.getPattern_DiffGame_gridnodes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__FILTER = eINSTANCE.getPattern_DiffGame_gridnodes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__IS_MERGED = eINSTANCE.getPattern_DiffGame_gridnodes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GAME_GRIDNODES__DIFF_GROUP = eINSTANCE.getPattern_DiffGame_gridnodes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GAME_GRIDNODES__ETYPE = eINSTANCE.getPattern_DiffGame_gridnodes_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGhostImpl <em>Pattern Diff Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGhostImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGhost()
		 * @generated
		 */
		EClass PATTERN_DIFF_GHOST = eINSTANCE.getPattern_DiffGhost();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGhost_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGhost_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__FILTER = eINSTANCE.getPattern_DiffGhost_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__IS_MERGED = eINSTANCE.getPattern_DiffGhost_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__CHANGE_STATUS = eINSTANCE.getPattern_DiffGhost_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__NEW_ID_LEFT = eINSTANCE.getPattern_DiffGhost_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffGhost_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffGhost_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New strategy Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__NEW_STRATEGY_LEFT = eINSTANCE.getPattern_DiffGhost_New_strategy_Left();

		/**
		 * The meta object literal for the '<em><b>New strategy Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__NEW_STRATEGY_RIGHT = eINSTANCE.getPattern_DiffGhost_New_strategy_Right();

		/**
		 * The meta object literal for the '<em><b>Strategy Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GHOST__STRATEGY_CHANGE_STATUS = eINSTANCE.getPattern_DiffGhost_StrategyChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNodeImpl <em>Pattern Diff Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNodeImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode()
		 * @generated
		 */
		EClass PATTERN_DIFF_GRID_NODE = eINSTANCE.getPattern_DiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGridNode_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGridNode_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__FILTER = eINSTANCE.getPattern_DiffGridNode_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__IS_MERGED = eINSTANCE.getPattern_DiffGridNode_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__NEW_ID_LEFT = eINSTANCE.getPattern_DiffGridNode_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffGridNode_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_IdChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_downImpl <em>Pattern Diff Grid Node down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_downImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_down()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_down_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGridNode_down_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGridNode_down_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_down_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__FILTER = eINSTANCE.getPattern_DiffGridNode_down_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__IS_MERGED = eINSTANCE.getPattern_DiffGridNode_down_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_DOWN__DIFF_GROUP = eINSTANCE.getPattern_DiffGridNode_down_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GRID_NODE_DOWN__ETYPE = eINSTANCE.getPattern_DiffGridNode_down_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_leftImpl <em>Pattern Diff Grid Node left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_leftImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_left()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_left_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGridNode_left_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGridNode_left_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_left_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__FILTER = eINSTANCE.getPattern_DiffGridNode_left_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__IS_MERGED = eINSTANCE.getPattern_DiffGridNode_left_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_LEFT__DIFF_GROUP = eINSTANCE.getPattern_DiffGridNode_left_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GRID_NODE_LEFT__ETYPE = eINSTANCE.getPattern_DiffGridNode_left_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_rightImpl <em>Pattern Diff Grid Node right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_rightImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_right()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_right_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGridNode_right_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGridNode_right_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_right_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__FILTER = eINSTANCE.getPattern_DiffGridNode_right_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__IS_MERGED = eINSTANCE.getPattern_DiffGridNode_right_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_GROUP = eINSTANCE.getPattern_DiffGridNode_right_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GRID_NODE_RIGHT__ETYPE = eINSTANCE.getPattern_DiffGridNode_right_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffGridNode_upImpl <em>Pattern Diff Grid Node up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffGridNode_upImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffGridNode_up()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN = eINSTANCE.getPattern_DiffGridNode_up_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffGridNode_up_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffGridNode_up_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__CHANGE_STATUS = eINSTANCE.getPattern_DiffGridNode_up_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__FILTER = eINSTANCE.getPattern_DiffGridNode_up_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__IS_MERGED = eINSTANCE.getPattern_DiffGridNode_up_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_GRID_NODE_UP__DIFF_GROUP = eINSTANCE.getPattern_DiffGridNode_up_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_GRID_NODE_UP__ETYPE = eINSTANCE.getPattern_DiffGridNode_up_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl <em>Pattern Diff Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffPacman()
		 * @generated
		 */
		EClass PATTERN_DIFF_PACMAN = eINSTANCE.getPattern_DiffPacman();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPacman_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPacman_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__FILTER = eINSTANCE.getPattern_DiffPacman_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__IS_MERGED = eINSTANCE.getPattern_DiffPacman_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__CHANGE_STATUS = eINSTANCE.getPattern_DiffPacman_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__NEW_ID_LEFT = eINSTANCE.getPattern_DiffPacman_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffPacman_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffPacman_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New initial Position Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT = eINSTANCE.getPattern_DiffPacman_New_initialPosition_Left();

		/**
		 * The meta object literal for the '<em><b>New initial Position Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT = eINSTANCE.getPattern_DiffPacman_New_initialPosition_Right();

		/**
		 * The meta object literal for the '<em><b>Initial Position Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS = eINSTANCE.getPattern_DiffPacman_InitialPositionChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_DiffPositionableEntity_onImpl <em>Pattern Diff Positionable Entity on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_DiffPositionableEntity_onImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_DiffPositionableEntity_on()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPositionableEntity_on_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPositionableEntity_on_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPositionableEntity_on_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS = eINSTANCE.getPattern_DiffPositionableEntity_on_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER = eINSTANCE.getPattern_DiffPositionableEntity_on_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_MERGED = eINSTANCE.getPattern_DiffPositionableEntity_on_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_GROUP = eINSTANCE.getPattern_DiffPositionableEntity_on_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ETYPE = eINSTANCE.getPattern_DiffPositionableEntity_on_EType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_EnergizerImpl <em>Pattern Energizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_EnergizerImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Energizer()
		 * @generated
		 */
		EClass PATTERN_ENERGIZER = eINSTANCE.getPattern_Energizer();

		/**
		 * The meta object literal for the '<em><b>Durations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ENERGIZER__DURATIONS = eINSTANCE.getPattern_Energizer_Durations();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_FoodImpl <em>Pattern Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_FoodImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Food()
		 * @generated
		 */
		EClass PATTERN_FOOD = eINSTANCE.getPattern_Food();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FOOD__VALUE = eINSTANCE.getPattern_Food_Value();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_FruitImpl <em>Pattern Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_FruitImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Fruit()
		 * @generated
		 */
		EClass PATTERN_FRUIT = eINSTANCE.getPattern_Fruit();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FRUIT__LOCATION = eINSTANCE.getPattern_Fruit_Location();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_GameImpl <em>Pattern Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_GameImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Game()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__IS_FORBIDDEN = eINSTANCE.getPattern_Game_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__ID = eINSTANCE.getPattern_Game_Id();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__LIVES = eINSTANCE.getPattern_Game_Lives();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GAME__SCORE = eINSTANCE.getPattern_Game_Score();

		/**
		 * The meta object literal for the '<em><b>Gridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GAME__GRIDNODES = eINSTANCE.getPattern_Game_Gridnodes();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GAME__ENTITIES = eINSTANCE.getPattern_Game_Entities();

		/**
		 * The meta object literal for the '<em><b>Diffgridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GAME__DIFFGRIDNODES = eINSTANCE.getPattern_Game_Diffgridnodes();

		/**
		 * The meta object literal for the '<em><b>Diffentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GAME__DIFFENTITIES = eINSTANCE.getPattern_Game_Diffentities();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_GhostImpl <em>Pattern Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_GhostImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Ghost()
		 * @generated
		 */
		EClass PATTERN_GHOST = eINSTANCE.getPattern_Ghost();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GHOST__STRATEGY = eINSTANCE.getPattern_Ghost_Strategy();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl <em>Pattern Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_GridNodeImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_GridNode()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GRID_NODE__IS_FORBIDDEN = eINSTANCE.getPattern_GridNode_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_GRID_NODE__ID = eINSTANCE.getPattern_GridNode_Id();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__UP = eINSTANCE.getPattern_GridNode_Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__DOWN = eINSTANCE.getPattern_GridNode_Down();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__LEFT = eINSTANCE.getPattern_GridNode_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__RIGHT = eINSTANCE.getPattern_GridNode_Right();

		/**
		 * The meta object literal for the '<em><b>Diffup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__DIFFUP = eINSTANCE.getPattern_GridNode_Diffup();

		/**
		 * The meta object literal for the '<em><b>Diffdown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__DIFFDOWN = eINSTANCE.getPattern_GridNode_Diffdown();

		/**
		 * The meta object literal for the '<em><b>Diffleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__DIFFLEFT = eINSTANCE.getPattern_GridNode_Diffleft();

		/**
		 * The meta object literal for the '<em><b>Diffright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_GRID_NODE__DIFFRIGHT = eINSTANCE.getPattern_GridNode_Diffright();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_PacmanImpl <em>Pattern Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_PacmanImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_Pacman()
		 * @generated
		 */
		EClass PATTERN_PACMAN = eINSTANCE.getPattern_Pacman();

		/**
		 * The meta object literal for the '<em><b>Initial Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PACMAN__INITIAL_POSITION = eINSTANCE.getPattern_Pacman_InitialPosition();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl <em>Pattern Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_PositionableEntity()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN = eINSTANCE.getPattern_PositionableEntity_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_POSITIONABLE_ENTITY__ID = eINSTANCE.getPattern_PositionableEntity_Id();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_POSITIONABLE_ENTITY__ON = eINSTANCE.getPattern_PositionableEntity_On();

		/**
		 * The meta object literal for the '<em><b>Diffon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_POSITIONABLE_ENTITY__DIFFON = eINSTANCE.getPattern_PositionableEntity_Diffon();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = eINSTANCE.getPattern_SemanticConflict_Conflict_kind();

		/**
		 * The meta object literal for the '<em><b>Conflict Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = eINSTANCE.getPattern_SemanticConflict_Conflict_Granularity();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getPattern_SemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_SemanticDiffImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticDiff()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_DIFF = eINSTANCE.getPattern_SemanticDiff();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__AUTHOR = eINSTANCE.getPattern_SemanticDiff_Author();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern_SemanticObject()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_OBJECT = eINSTANCE.getPattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__ID_PATTERN = eINSTANCE.getPattern_SemanticObject_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticObject_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__NAME = eINSTANCE.getPattern_SemanticObject_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Energizer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Food</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffFood();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Fruit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffFruit();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Game</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGame();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Game entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Ghost</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGhost();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Pacman</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPacman();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Game</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME = eINSTANCE.getPattern_SemanticObject_SemanticObject_Game();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Grid Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE = eINSTANCE.getPattern_SemanticObject_SemanticObject_GridNode();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Positionable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY = eINSTANCE.getPattern_SemanticObject_SemanticObject_PositionableEntity();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.Pattern__ListEIntImpl <em>Pattern List EInt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.Pattern__ListEIntImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getPattern__ListEInt()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST_EINT__IS_FORBIDDEN = eINSTANCE.getPattern__ListEInt_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST_EINT__VALUE = eINSTANCE.getPattern__ListEInt_Value();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.impl.RuleImpl
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getRule()
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
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = eINSTANCE.getRule_RulePattern_Pattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Energizer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER = eINSTANCE.getRule_RulePattern_Pattern_DiffEnergizer();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Food</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_FOOD = eINSTANCE.getRule_RulePattern_Pattern_DiffFood();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Fruit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT = eINSTANCE.getRule_RulePattern_Pattern_DiffFruit();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Game</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GAME = eINSTANCE.getRule_RulePattern_Pattern_DiffGame();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Game entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES = eINSTANCE.getRule_RulePattern_Pattern_DiffGame_entities();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Game gridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES = eINSTANCE.getRule_RulePattern_Pattern_DiffGame_gridnodes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Ghost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GHOST = eINSTANCE.getRule_RulePattern_Pattern_DiffGhost();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Grid Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE = eINSTANCE.getRule_RulePattern_Pattern_DiffGridNode();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Grid Node down</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN = eINSTANCE.getRule_RulePattern_Pattern_DiffGridNode_down();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Grid Node left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT = eINSTANCE.getRule_RulePattern_Pattern_DiffGridNode_left();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Grid Node right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT = eINSTANCE.getRule_RulePattern_Pattern_DiffGridNode_right();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Grid Node up</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP = eINSTANCE.getRule_RulePattern_Pattern_DiffGridNode_up();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Pacman</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN = eINSTANCE.getRule_RulePattern_Pattern_DiffPacman();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Positionable Entity on</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON = eINSTANCE.getRule_RulePattern_Pattern_DiffPositionableEntity_on();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Game</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_GAME = eINSTANCE.getRule_RulePattern_Pattern_Game();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Grid Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_GRID_NODE = eINSTANCE.getRule_RulePattern_Pattern_GridNode();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Positionable Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY = eINSTANCE.getRule_RulePattern_Pattern_PositionableEntity();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.AUTHOR
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.ChangeStatus
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.ConflictGranularity
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictGranularity()
		 * @generated
		 */
		EEnum CONFLICT_GRANULARITY = eINSTANCE.getConflictGranularity();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.ConflictResolutionStrategy
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictResolutionStrategy()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_STRATEGY = eINSTANCE.getConflictResolutionStrategy();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.ConflictResolutionType
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getConflictResolutionType()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_TYPE = eINSTANCE.getConflictResolutionType();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.DiffKind
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

		/**
		 * The meta object literal for the '{@link pacmanCRRuleMM.GhostStrategy <em>Ghost Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pacmanCRRuleMM.GhostStrategy
		 * @see pacmanCRRuleMM.impl.PacmanCRRuleMMPackageImpl#getGhostStrategy()
		 * @generated
		 */
		EEnum GHOST_STRATEGY = eINSTANCE.getGhostStrategy();

	}

} //PacmanCRRuleMMPackage
