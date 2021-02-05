/**
 */
package PacmanGo;

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
 * @see PacmanGo.PacmanGoFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanGoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PacmanGo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsmcompare/PacmanGo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PacmanGo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanGoPackage eINSTANCE = PacmanGo.impl.PacmanGoPackageImpl.init();

	/**
	 * The meta object id for the '{@link PacmanGo.impl.GridNodeImpl <em>Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.GridNodeImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getGridNode()
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
	 * The number of structural features of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGo.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.PositionableEntityImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getPositionableEntity()
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
	 * The number of structural features of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PacmanGo.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.FoodImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getFood()
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
	 * The meta object id for the '{@link PacmanGo.impl.PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.PacmanImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getPacman()
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
	 * The meta object id for the '{@link PacmanGo.impl.GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.GhostImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getGhost()
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
	 * The meta object id for the '{@link PacmanGo.impl.ScoreboardImpl <em>Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.ScoreboardImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getScoreboard()
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
	 * The meta object id for the '{@link PacmanGo.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanGo.impl.GameImpl
	 * @see PacmanGo.impl.PacmanGoPackageImpl#getGame()
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
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PacmanGo.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Node</em>'.
	 * @see PacmanGo.GridNode
	 * @generated
	 */
	EClass getGridNode();

	/**
	 * Returns the meta object for the reference '{@link PacmanGo.GridNode#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see PacmanGo.GridNode#getUp()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Up();

	/**
	 * Returns the meta object for the reference '{@link PacmanGo.GridNode#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see PacmanGo.GridNode#getBottom()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Bottom();

	/**
	 * Returns the meta object for the reference '{@link PacmanGo.GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see PacmanGo.GridNode#getLeft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link PacmanGo.GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see PacmanGo.GridNode#getRight()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Right();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGo.GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGo.GridNode#getId()
	 * @see #getGridNode()
	 * @generated
	 */
	EAttribute getGridNode_Id();

	/**
	 * Returns the meta object for class '{@link PacmanGo.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see PacmanGo.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for class '{@link PacmanGo.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see PacmanGo.Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for class '{@link PacmanGo.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see PacmanGo.Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for class '{@link PacmanGo.Scoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoreboard</em>'.
	 * @see PacmanGo.Scoreboard
	 * @generated
	 */
	EClass getScoreboard();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGo.Scoreboard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PacmanGo.Scoreboard#getValue()
	 * @see #getScoreboard()
	 * @generated
	 */
	EAttribute getScoreboard_Value();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGo.Scoreboard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGo.Scoreboard#getId()
	 * @see #getScoreboard()
	 * @generated
	 */
	EAttribute getScoreboard_Id();

	/**
	 * Returns the meta object for class '{@link PacmanGo.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see PacmanGo.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGo.Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see PacmanGo.Game#getGridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gridnodes();

	/**
	 * Returns the meta object for the containment reference '{@link PacmanGo.Game#getScoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoreboard</em>'.
	 * @see PacmanGo.Game#getScoreboard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Scoreboard();

	/**
	 * Returns the meta object for the containment reference list '{@link PacmanGo.Game#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see PacmanGo.Game#getEntities()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entities();

	/**
	 * Returns the meta object for class '{@link PacmanGo.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable Entity</em>'.
	 * @see PacmanGo.PositionableEntity
	 * @generated
	 */
	EClass getPositionableEntity();

	/**
	 * Returns the meta object for the reference '{@link PacmanGo.PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see PacmanGo.PositionableEntity#getOn()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_On();

	/**
	 * Returns the meta object for the attribute '{@link PacmanGo.PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PacmanGo.PositionableEntity#getId()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EAttribute getPositionableEntity_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanGoFactory getPacmanGoFactory();

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
		 * The meta object literal for the '{@link PacmanGo.impl.GridNodeImpl <em>Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.GridNodeImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getGridNode()
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
		 * The meta object literal for the '{@link PacmanGo.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.FoodImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link PacmanGo.impl.PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.PacmanImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getPacman()
		 * @generated
		 */
		EClass PACMAN = eINSTANCE.getPacman();

		/**
		 * The meta object literal for the '{@link PacmanGo.impl.GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.GhostImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getGhost()
		 * @generated
		 */
		EClass GHOST = eINSTANCE.getGhost();

		/**
		 * The meta object literal for the '{@link PacmanGo.impl.ScoreboardImpl <em>Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.ScoreboardImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getScoreboard()
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
		 * The meta object literal for the '{@link PacmanGo.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.GameImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getGame()
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
		 * The meta object literal for the '{@link PacmanGo.impl.PositionableEntityImpl <em>Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanGo.impl.PositionableEntityImpl
		 * @see PacmanGo.impl.PacmanGoPackageImpl#getPositionableEntity()
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

	}

} //PacmanGoPackage
