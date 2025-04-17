/**
 */
package pacmanDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pacmanDiffMM.DiffEnergizer;
import pacmanDiffMM.DiffFood;
import pacmanDiffMM.DiffFruit;
import pacmanDiffMM.DiffGame;
import pacmanDiffMM.DiffGame_entities;
import pacmanDiffMM.DiffGame_gridnodes;
import pacmanDiffMM.DiffGhost;
import pacmanDiffMM.DiffGridNode;
import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.DiffGridNode_left;
import pacmanDiffMM.DiffGridNode_right;
import pacmanDiffMM.DiffGridNode_up;
import pacmanDiffMM.DiffPacman;
import pacmanDiffMM.DiffPositionableEntity_on;
import pacmanDiffMM.Game;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.PositionableEntity;
import pacmanDiffMM.SemanticObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEnergizer <em>Semantic Object Diff Energizer</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffFood <em>Semantic Object Diff Food</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffFruit <em>Semantic Object Diff Fruit</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGame <em>Semantic Object Diff Game</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGame_entities <em>Semantic Object Diff Game entities</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGame_gridnodes <em>Semantic Object Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGhost <em>Semantic Object Diff Ghost</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGridNode <em>Semantic Object Diff Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGridNode_down <em>Semantic Object Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGridNode_left <em>Semantic Object Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGridNode_right <em>Semantic Object Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffGridNode_up <em>Semantic Object Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPacman <em>Semantic Object Diff Pacman</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPositionableEntity_on <em>Semantic Object Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_Game <em>Semantic Object Game</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_GridNode <em>Semantic Object Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticObjectImpl#getSemanticObject_PositionableEntity <em>Semantic Object Positionable Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticObjectImpl extends MinimalEObjectImpl.Container implements SemanticObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEnergizer() <em>Semantic Object Diff Energizer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEnergizer()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEnergizer> semanticObject_DiffEnergizer;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffFood() <em>Semantic Object Diff Food</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffFood()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFood> semanticObject_DiffFood;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffFruit() <em>Semantic Object Diff Fruit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFruit> semanticObject_DiffFruit;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame() <em>Semantic Object Diff Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame> semanticObject_DiffGame;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame_entities() <em>Semantic Object Diff Game entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_entities> semanticObject_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame_gridnodes() <em>Semantic Object Diff Game gridnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> semanticObject_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGhost() <em>Semantic Object Diff Ghost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGhost()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGhost> semanticObject_DiffGhost;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode() <em>Semantic Object Diff Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode> semanticObject_DiffGridNode;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_down() <em>Semantic Object Diff Grid Node down</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_down> semanticObject_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_left() <em>Semantic Object Diff Grid Node left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_left> semanticObject_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_right() <em>Semantic Object Diff Grid Node right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_right> semanticObject_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_up() <em>Semantic Object Diff Grid Node up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_up> semanticObject_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPacman() <em>Semantic Object Diff Pacman</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPacman()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPacman> semanticObject_DiffPacman;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPositionableEntity_on() <em>Semantic Object Diff Positionable Entity on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPositionableEntity_on> semanticObject_DiffPositionableEntity_on;

	/**
	 * The cached value of the '{@link #getSemanticObject_Game() <em>Semantic Object Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Game()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> semanticObject_Game;

	/**
	 * The cached value of the '{@link #getSemanticObject_GridNode() <em>Semantic Object Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_GridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<GridNode> semanticObject_GridNode;

	/**
	 * The cached value of the '{@link #getSemanticObject_PositionableEntity() <em>Semantic Object Positionable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_PositionableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionableEntity> semanticObject_PositionableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.SEMANTIC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEnergizer> getSemanticObject_DiffEnergizer() {
		if (semanticObject_DiffEnergizer == null) {
			semanticObject_DiffEnergizer = new EObjectResolvingEList<DiffEnergizer>(DiffEnergizer.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER);
		}
		return semanticObject_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFood> getSemanticObject_DiffFood() {
		if (semanticObject_DiffFood == null) {
			semanticObject_DiffFood = new EObjectResolvingEList<DiffFood>(DiffFood.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD);
		}
		return semanticObject_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFruit> getSemanticObject_DiffFruit() {
		if (semanticObject_DiffFruit == null) {
			semanticObject_DiffFruit = new EObjectResolvingEList<DiffFruit>(DiffFruit.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT);
		}
		return semanticObject_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame> getSemanticObject_DiffGame() {
		if (semanticObject_DiffGame == null) {
			semanticObject_DiffGame = new EObjectResolvingEList<DiffGame>(DiffGame.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME);
		}
		return semanticObject_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_entities> getSemanticObject_DiffGame_entities() {
		if (semanticObject_DiffGame_entities == null) {
			semanticObject_DiffGame_entities = new EObjectResolvingEList<DiffGame_entities>(DiffGame_entities.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES);
		}
		return semanticObject_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getSemanticObject_DiffGame_gridnodes() {
		if (semanticObject_DiffGame_gridnodes == null) {
			semanticObject_DiffGame_gridnodes = new EObjectResolvingEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES);
		}
		return semanticObject_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGhost> getSemanticObject_DiffGhost() {
		if (semanticObject_DiffGhost == null) {
			semanticObject_DiffGhost = new EObjectResolvingEList<DiffGhost>(DiffGhost.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST);
		}
		return semanticObject_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode> getSemanticObject_DiffGridNode() {
		if (semanticObject_DiffGridNode == null) {
			semanticObject_DiffGridNode = new EObjectResolvingEList<DiffGridNode>(DiffGridNode.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE);
		}
		return semanticObject_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_down> getSemanticObject_DiffGridNode_down() {
		if (semanticObject_DiffGridNode_down == null) {
			semanticObject_DiffGridNode_down = new EObjectResolvingEList<DiffGridNode_down>(DiffGridNode_down.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN);
		}
		return semanticObject_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_left> getSemanticObject_DiffGridNode_left() {
		if (semanticObject_DiffGridNode_left == null) {
			semanticObject_DiffGridNode_left = new EObjectResolvingEList<DiffGridNode_left>(DiffGridNode_left.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT);
		}
		return semanticObject_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_right> getSemanticObject_DiffGridNode_right() {
		if (semanticObject_DiffGridNode_right == null) {
			semanticObject_DiffGridNode_right = new EObjectResolvingEList<DiffGridNode_right>(DiffGridNode_right.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT);
		}
		return semanticObject_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_up> getSemanticObject_DiffGridNode_up() {
		if (semanticObject_DiffGridNode_up == null) {
			semanticObject_DiffGridNode_up = new EObjectResolvingEList<DiffGridNode_up>(DiffGridNode_up.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP);
		}
		return semanticObject_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPacman> getSemanticObject_DiffPacman() {
		if (semanticObject_DiffPacman == null) {
			semanticObject_DiffPacman = new EObjectResolvingEList<DiffPacman>(DiffPacman.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN);
		}
		return semanticObject_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPositionableEntity_on> getSemanticObject_DiffPositionableEntity_on() {
		if (semanticObject_DiffPositionableEntity_on == null) {
			semanticObject_DiffPositionableEntity_on = new EObjectResolvingEList<DiffPositionableEntity_on>(DiffPositionableEntity_on.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return semanticObject_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getSemanticObject_Game() {
		if (semanticObject_Game == null) {
			semanticObject_Game = new EObjectResolvingEList<Game>(Game.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME);
		}
		return semanticObject_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridNode> getSemanticObject_GridNode() {
		if (semanticObject_GridNode == null) {
			semanticObject_GridNode = new EObjectResolvingEList<GridNode>(GridNode.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE);
		}
		return semanticObject_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionableEntity> getSemanticObject_PositionableEntity() {
		if (semanticObject_PositionableEntity == null) {
			semanticObject_PositionableEntity = new EObjectResolvingEList<PositionableEntity>(PositionableEntity.class, this, PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY);
		}
		return semanticObject_PositionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return getName();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				return getSemanticObject_DiffEnergizer();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				return getSemanticObject_DiffFood();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				return getSemanticObject_DiffFruit();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				return getSemanticObject_DiffGame();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				return getSemanticObject_DiffGame_entities();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				return getSemanticObject_DiffGame_gridnodes();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				return getSemanticObject_DiffGhost();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				return getSemanticObject_DiffGridNode();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				return getSemanticObject_DiffGridNode_down();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				return getSemanticObject_DiffGridNode_left();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				return getSemanticObject_DiffGridNode_right();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				return getSemanticObject_DiffGridNode_up();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				return getSemanticObject_DiffPacman();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				return getSemanticObject_DiffPositionableEntity_on();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				return getSemanticObject_Game();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				return getSemanticObject_GridNode();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
				return getSemanticObject_PositionableEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				getSemanticObject_DiffEnergizer().clear();
				getSemanticObject_DiffEnergizer().addAll((Collection<? extends DiffEnergizer>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				getSemanticObject_DiffFood().clear();
				getSemanticObject_DiffFood().addAll((Collection<? extends DiffFood>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				getSemanticObject_DiffFruit().clear();
				getSemanticObject_DiffFruit().addAll((Collection<? extends DiffFruit>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				getSemanticObject_DiffGame().clear();
				getSemanticObject_DiffGame().addAll((Collection<? extends DiffGame>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				getSemanticObject_DiffGame_entities().clear();
				getSemanticObject_DiffGame_entities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				getSemanticObject_DiffGame_gridnodes().clear();
				getSemanticObject_DiffGame_gridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				getSemanticObject_DiffGhost().clear();
				getSemanticObject_DiffGhost().addAll((Collection<? extends DiffGhost>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				getSemanticObject_DiffGridNode().clear();
				getSemanticObject_DiffGridNode().addAll((Collection<? extends DiffGridNode>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				getSemanticObject_DiffGridNode_down().clear();
				getSemanticObject_DiffGridNode_down().addAll((Collection<? extends DiffGridNode_down>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				getSemanticObject_DiffGridNode_left().clear();
				getSemanticObject_DiffGridNode_left().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				getSemanticObject_DiffGridNode_right().clear();
				getSemanticObject_DiffGridNode_right().addAll((Collection<? extends DiffGridNode_right>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				getSemanticObject_DiffGridNode_up().clear();
				getSemanticObject_DiffGridNode_up().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				getSemanticObject_DiffPacman().clear();
				getSemanticObject_DiffPacman().addAll((Collection<? extends DiffPacman>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticObject_DiffPositionableEntity_on().clear();
				getSemanticObject_DiffPositionableEntity_on().addAll((Collection<? extends DiffPositionableEntity_on>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				getSemanticObject_Game().clear();
				getSemanticObject_Game().addAll((Collection<? extends Game>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				getSemanticObject_GridNode().clear();
				getSemanticObject_GridNode().addAll((Collection<? extends GridNode>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
				getSemanticObject_PositionableEntity().clear();
				getSemanticObject_PositionableEntity().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				getSemanticObject_DiffEnergizer().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				getSemanticObject_DiffFood().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				getSemanticObject_DiffFruit().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				getSemanticObject_DiffGame().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				getSemanticObject_DiffGame_entities().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				getSemanticObject_DiffGame_gridnodes().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				getSemanticObject_DiffGhost().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				getSemanticObject_DiffGridNode().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				getSemanticObject_DiffGridNode_down().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				getSemanticObject_DiffGridNode_left().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				getSemanticObject_DiffGridNode_right().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				getSemanticObject_DiffGridNode_up().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				getSemanticObject_DiffPacman().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticObject_DiffPositionableEntity_on().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				getSemanticObject_Game().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				getSemanticObject_GridNode().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
				getSemanticObject_PositionableEntity().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				return semanticObject_DiffEnergizer != null && !semanticObject_DiffEnergizer.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				return semanticObject_DiffFood != null && !semanticObject_DiffFood.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				return semanticObject_DiffFruit != null && !semanticObject_DiffFruit.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				return semanticObject_DiffGame != null && !semanticObject_DiffGame.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				return semanticObject_DiffGame_entities != null && !semanticObject_DiffGame_entities.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				return semanticObject_DiffGame_gridnodes != null && !semanticObject_DiffGame_gridnodes.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				return semanticObject_DiffGhost != null && !semanticObject_DiffGhost.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				return semanticObject_DiffGridNode != null && !semanticObject_DiffGridNode.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				return semanticObject_DiffGridNode_down != null && !semanticObject_DiffGridNode_down.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				return semanticObject_DiffGridNode_left != null && !semanticObject_DiffGridNode_left.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				return semanticObject_DiffGridNode_right != null && !semanticObject_DiffGridNode_right.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				return semanticObject_DiffGridNode_up != null && !semanticObject_DiffGridNode_up.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				return semanticObject_DiffPacman != null && !semanticObject_DiffPacman.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				return semanticObject_DiffPositionableEntity_on != null && !semanticObject_DiffPositionableEntity_on.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				return semanticObject_Game != null && !semanticObject_Game.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				return semanticObject_GridNode != null && !semanticObject_GridNode.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
				return semanticObject_PositionableEntity != null && !semanticObject_PositionableEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SemanticObjectImpl
