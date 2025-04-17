/**
 */
package pacmanCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffEnergizer;
import pacmanCRRuleMM.Pattern_DiffFood;
import pacmanCRRuleMM.Pattern_DiffFruit;
import pacmanCRRuleMM.Pattern_DiffGame;
import pacmanCRRuleMM.Pattern_DiffGame_entities;
import pacmanCRRuleMM.Pattern_DiffGame_gridnodes;
import pacmanCRRuleMM.Pattern_DiffGhost;
import pacmanCRRuleMM.Pattern_DiffGridNode;
import pacmanCRRuleMM.Pattern_DiffGridNode_down;
import pacmanCRRuleMM.Pattern_DiffGridNode_left;
import pacmanCRRuleMM.Pattern_DiffGridNode_right;
import pacmanCRRuleMM.Pattern_DiffGridNode_up;
import pacmanCRRuleMM.Pattern_DiffPacman;
import pacmanCRRuleMM.Pattern_DiffPositionableEntity_on;
import pacmanCRRuleMM.Pattern_Game;
import pacmanCRRuleMM.Pattern_GridNode;
import pacmanCRRuleMM.Pattern_PositionableEntity;
import pacmanCRRuleMM.Pattern_SemanticObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEnergizer <em>Semantic Object Diff Energizer</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffFood <em>Semantic Object Diff Food</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffFruit <em>Semantic Object Diff Fruit</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGame <em>Semantic Object Diff Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGame_entities <em>Semantic Object Diff Game entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGame_gridnodes <em>Semantic Object Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGhost <em>Semantic Object Diff Ghost</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGridNode <em>Semantic Object Diff Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGridNode_down <em>Semantic Object Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGridNode_left <em>Semantic Object Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGridNode_right <em>Semantic Object Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffGridNode_up <em>Semantic Object Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPacman <em>Semantic Object Diff Pacman</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPositionableEntity_on <em>Semantic Object Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_Game <em>Semantic Object Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_GridNode <em>Semantic Object Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_PositionableEntity <em>Semantic Object Positionable Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Pattern_SemanticObjectImpl extends MinimalEObjectImpl.Container implements Pattern_SemanticObject {
	/**
	 * The default value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected int iD_Pattern = ID_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

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
	protected EList<Pattern_DiffEnergizer> semanticObject_DiffEnergizer;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffFood() <em>Semantic Object Diff Food</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffFood()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffFood> semanticObject_DiffFood;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffFruit() <em>Semantic Object Diff Fruit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffFruit> semanticObject_DiffFruit;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame() <em>Semantic Object Diff Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame> semanticObject_DiffGame;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame_entities() <em>Semantic Object Diff Game entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_entities> semanticObject_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGame_gridnodes() <em>Semantic Object Diff Game gridnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_gridnodes> semanticObject_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGhost() <em>Semantic Object Diff Ghost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGhost()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGhost> semanticObject_DiffGhost;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode() <em>Semantic Object Diff Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode> semanticObject_DiffGridNode;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_down() <em>Semantic Object Diff Grid Node down</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_down> semanticObject_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_left() <em>Semantic Object Diff Grid Node left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_left> semanticObject_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_right() <em>Semantic Object Diff Grid Node right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_right> semanticObject_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffGridNode_up() <em>Semantic Object Diff Grid Node up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_up> semanticObject_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPacman() <em>Semantic Object Diff Pacman</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPacman()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPacman> semanticObject_DiffPacman;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPositionableEntity_on() <em>Semantic Object Diff Positionable Entity on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPositionableEntity_on> semanticObject_DiffPositionableEntity_on;

	/**
	 * The cached value of the '{@link #getSemanticObject_Game() <em>Semantic Object Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Game()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Game> semanticObject_Game;

	/**
	 * The cached value of the '{@link #getSemanticObject_GridNode() <em>Semantic Object Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_GridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_GridNode> semanticObject_GridNode;

	/**
	 * The cached value of the '{@link #getSemanticObject_PositionableEntity() <em>Semantic Object Positionable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_PositionableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_PositionableEntity> semanticObject_PositionableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_SEMANTIC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEnergizer> getSemanticObject_DiffEnergizer() {
		if (semanticObject_DiffEnergizer == null) {
			semanticObject_DiffEnergizer = new EObjectResolvingEList<Pattern_DiffEnergizer>(Pattern_DiffEnergizer.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER);
		}
		return semanticObject_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffFood> getSemanticObject_DiffFood() {
		if (semanticObject_DiffFood == null) {
			semanticObject_DiffFood = new EObjectResolvingEList<Pattern_DiffFood>(Pattern_DiffFood.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD);
		}
		return semanticObject_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffFruit> getSemanticObject_DiffFruit() {
		if (semanticObject_DiffFruit == null) {
			semanticObject_DiffFruit = new EObjectResolvingEList<Pattern_DiffFruit>(Pattern_DiffFruit.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT);
		}
		return semanticObject_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame> getSemanticObject_DiffGame() {
		if (semanticObject_DiffGame == null) {
			semanticObject_DiffGame = new EObjectResolvingEList<Pattern_DiffGame>(Pattern_DiffGame.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME);
		}
		return semanticObject_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_entities> getSemanticObject_DiffGame_entities() {
		if (semanticObject_DiffGame_entities == null) {
			semanticObject_DiffGame_entities = new EObjectResolvingEList<Pattern_DiffGame_entities>(Pattern_DiffGame_entities.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES);
		}
		return semanticObject_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_gridnodes> getSemanticObject_DiffGame_gridnodes() {
		if (semanticObject_DiffGame_gridnodes == null) {
			semanticObject_DiffGame_gridnodes = new EObjectResolvingEList<Pattern_DiffGame_gridnodes>(Pattern_DiffGame_gridnodes.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES);
		}
		return semanticObject_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGhost> getSemanticObject_DiffGhost() {
		if (semanticObject_DiffGhost == null) {
			semanticObject_DiffGhost = new EObjectResolvingEList<Pattern_DiffGhost>(Pattern_DiffGhost.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST);
		}
		return semanticObject_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode> getSemanticObject_DiffGridNode() {
		if (semanticObject_DiffGridNode == null) {
			semanticObject_DiffGridNode = new EObjectResolvingEList<Pattern_DiffGridNode>(Pattern_DiffGridNode.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE);
		}
		return semanticObject_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_down> getSemanticObject_DiffGridNode_down() {
		if (semanticObject_DiffGridNode_down == null) {
			semanticObject_DiffGridNode_down = new EObjectResolvingEList<Pattern_DiffGridNode_down>(Pattern_DiffGridNode_down.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN);
		}
		return semanticObject_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_left> getSemanticObject_DiffGridNode_left() {
		if (semanticObject_DiffGridNode_left == null) {
			semanticObject_DiffGridNode_left = new EObjectResolvingEList<Pattern_DiffGridNode_left>(Pattern_DiffGridNode_left.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT);
		}
		return semanticObject_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_right> getSemanticObject_DiffGridNode_right() {
		if (semanticObject_DiffGridNode_right == null) {
			semanticObject_DiffGridNode_right = new EObjectResolvingEList<Pattern_DiffGridNode_right>(Pattern_DiffGridNode_right.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT);
		}
		return semanticObject_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_up> getSemanticObject_DiffGridNode_up() {
		if (semanticObject_DiffGridNode_up == null) {
			semanticObject_DiffGridNode_up = new EObjectResolvingEList<Pattern_DiffGridNode_up>(Pattern_DiffGridNode_up.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP);
		}
		return semanticObject_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPacman> getSemanticObject_DiffPacman() {
		if (semanticObject_DiffPacman == null) {
			semanticObject_DiffPacman = new EObjectResolvingEList<Pattern_DiffPacman>(Pattern_DiffPacman.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN);
		}
		return semanticObject_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPositionableEntity_on> getSemanticObject_DiffPositionableEntity_on() {
		if (semanticObject_DiffPositionableEntity_on == null) {
			semanticObject_DiffPositionableEntity_on = new EObjectResolvingEList<Pattern_DiffPositionableEntity_on>(Pattern_DiffPositionableEntity_on.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return semanticObject_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Game> getSemanticObject_Game() {
		if (semanticObject_Game == null) {
			semanticObject_Game = new EObjectResolvingEList<Pattern_Game>(Pattern_Game.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME);
		}
		return semanticObject_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_GridNode> getSemanticObject_GridNode() {
		if (semanticObject_GridNode == null) {
			semanticObject_GridNode = new EObjectResolvingEList<Pattern_GridNode>(Pattern_GridNode.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE);
		}
		return semanticObject_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_PositionableEntity> getSemanticObject_PositionableEntity() {
		if (semanticObject_PositionableEntity == null) {
			semanticObject_PositionableEntity = new EObjectResolvingEList<Pattern_PositionableEntity>(Pattern_PositionableEntity.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY);
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return getID_Pattern();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isIsForbidden();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return getName();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				return getSemanticObject_DiffEnergizer();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				return getSemanticObject_DiffFood();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				return getSemanticObject_DiffFruit();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				return getSemanticObject_DiffGame();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				return getSemanticObject_DiffGame_entities();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				return getSemanticObject_DiffGame_gridnodes();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				return getSemanticObject_DiffGhost();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				return getSemanticObject_DiffGridNode();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				return getSemanticObject_DiffGridNode_down();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				return getSemanticObject_DiffGridNode_left();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				return getSemanticObject_DiffGridNode_right();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				return getSemanticObject_DiffGridNode_up();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				return getSemanticObject_DiffPacman();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				return getSemanticObject_DiffPositionableEntity_on();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				return getSemanticObject_Game();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				return getSemanticObject_GridNode();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				getSemanticObject_DiffEnergizer().clear();
				getSemanticObject_DiffEnergizer().addAll((Collection<? extends Pattern_DiffEnergizer>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				getSemanticObject_DiffFood().clear();
				getSemanticObject_DiffFood().addAll((Collection<? extends Pattern_DiffFood>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				getSemanticObject_DiffFruit().clear();
				getSemanticObject_DiffFruit().addAll((Collection<? extends Pattern_DiffFruit>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				getSemanticObject_DiffGame().clear();
				getSemanticObject_DiffGame().addAll((Collection<? extends Pattern_DiffGame>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				getSemanticObject_DiffGame_entities().clear();
				getSemanticObject_DiffGame_entities().addAll((Collection<? extends Pattern_DiffGame_entities>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				getSemanticObject_DiffGame_gridnodes().clear();
				getSemanticObject_DiffGame_gridnodes().addAll((Collection<? extends Pattern_DiffGame_gridnodes>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				getSemanticObject_DiffGhost().clear();
				getSemanticObject_DiffGhost().addAll((Collection<? extends Pattern_DiffGhost>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				getSemanticObject_DiffGridNode().clear();
				getSemanticObject_DiffGridNode().addAll((Collection<? extends Pattern_DiffGridNode>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				getSemanticObject_DiffGridNode_down().clear();
				getSemanticObject_DiffGridNode_down().addAll((Collection<? extends Pattern_DiffGridNode_down>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				getSemanticObject_DiffGridNode_left().clear();
				getSemanticObject_DiffGridNode_left().addAll((Collection<? extends Pattern_DiffGridNode_left>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				getSemanticObject_DiffGridNode_right().clear();
				getSemanticObject_DiffGridNode_right().addAll((Collection<? extends Pattern_DiffGridNode_right>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				getSemanticObject_DiffGridNode_up().clear();
				getSemanticObject_DiffGridNode_up().addAll((Collection<? extends Pattern_DiffGridNode_up>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				getSemanticObject_DiffPacman().clear();
				getSemanticObject_DiffPacman().addAll((Collection<? extends Pattern_DiffPacman>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticObject_DiffPositionableEntity_on().clear();
				getSemanticObject_DiffPositionableEntity_on().addAll((Collection<? extends Pattern_DiffPositionableEntity_on>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				getSemanticObject_Game().clear();
				getSemanticObject_Game().addAll((Collection<? extends Pattern_Game>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				getSemanticObject_GridNode().clear();
				getSemanticObject_GridNode().addAll((Collection<? extends Pattern_GridNode>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
				getSemanticObject_PositionableEntity().clear();
				getSemanticObject_PositionableEntity().addAll((Collection<? extends Pattern_PositionableEntity>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				getSemanticObject_DiffEnergizer().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				getSemanticObject_DiffFood().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				getSemanticObject_DiffFruit().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				getSemanticObject_DiffGame().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				getSemanticObject_DiffGame_entities().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				getSemanticObject_DiffGame_gridnodes().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				getSemanticObject_DiffGhost().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				getSemanticObject_DiffGridNode().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				getSemanticObject_DiffGridNode_down().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				getSemanticObject_DiffGridNode_left().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				getSemanticObject_DiffGridNode_right().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				getSemanticObject_DiffGridNode_up().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				getSemanticObject_DiffPacman().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticObject_DiffPositionableEntity_on().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				getSemanticObject_Game().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				getSemanticObject_GridNode().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER:
				return semanticObject_DiffEnergizer != null && !semanticObject_DiffEnergizer.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD:
				return semanticObject_DiffFood != null && !semanticObject_DiffFood.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT:
				return semanticObject_DiffFruit != null && !semanticObject_DiffFruit.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME:
				return semanticObject_DiffGame != null && !semanticObject_DiffGame.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES:
				return semanticObject_DiffGame_entities != null && !semanticObject_DiffGame_entities.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES:
				return semanticObject_DiffGame_gridnodes != null && !semanticObject_DiffGame_gridnodes.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST:
				return semanticObject_DiffGhost != null && !semanticObject_DiffGhost.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE:
				return semanticObject_DiffGridNode != null && !semanticObject_DiffGridNode.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN:
				return semanticObject_DiffGridNode_down != null && !semanticObject_DiffGridNode_down.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT:
				return semanticObject_DiffGridNode_left != null && !semanticObject_DiffGridNode_left.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT:
				return semanticObject_DiffGridNode_right != null && !semanticObject_DiffGridNode_right.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP:
				return semanticObject_DiffGridNode_up != null && !semanticObject_DiffGridNode_up.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN:
				return semanticObject_DiffPacman != null && !semanticObject_DiffPacman.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON:
				return semanticObject_DiffPositionableEntity_on != null && !semanticObject_DiffPositionableEntity_on.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME:
				return semanticObject_Game != null && !semanticObject_Game.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE:
				return semanticObject_GridNode != null && !semanticObject_GridNode.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Pattern_SemanticObjectImpl
