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
import pacmanDiffMM.DiffGame_domainspecificdiffs;
import pacmanDiffMM.DiffGame_entities;
import pacmanDiffMM.DiffGame_gridnodes;
import pacmanDiffMM.DiffGame_semanticconflicts;
import pacmanDiffMM.DiffGhost;
import pacmanDiffMM.DiffGridNode;
import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.DiffGridNode_left;
import pacmanDiffMM.DiffGridNode_right;
import pacmanDiffMM.DiffGridNode_up;
import pacmanDiffMM.DiffPacman;
import pacmanDiffMM.DiffPositionableEntity_on;
import pacmanDiffMM.DomainSpecificDiff;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.SemanticConflict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGridNode <em>Semantic Conflict Diff Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGridNode_up <em>Semantic Conflict Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGridNode_down <em>Semantic Conflict Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGridNode_left <em>Semantic Conflict Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGridNode_right <em>Semantic Conflict Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffFood <em>Semantic Conflict Diff Food</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffPacman <em>Semantic Conflict Diff Pacman</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGhost <em>Semantic Conflict Diff Ghost</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGame <em>Semantic Conflict Diff Game</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGame_gridnodes <em>Semantic Conflict Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGame_entities <em>Semantic Conflict Diff Game entities</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGame_domainspecificdiffs <em>Semantic Conflict Diff Game domainspecificdiffs</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffGame_semanticconflicts <em>Semantic Conflict Diff Game semanticconflicts</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffPositionableEntity_on <em>Semantic Conflict Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffFruit <em>Semantic Conflict Diff Fruit</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DiffEnergizer <em>Semantic Conflict Diff Energizer</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.SemanticConflictImpl#getSemanticConflict_DomainSpecificDiff <em>Semantic Conflict Domain Specific Diff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticConflictImpl extends MinimalEObjectImpl.Container implements SemanticConflict {
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
	 * The cached value of the '{@link #getSemanticConflict_DiffGridNode() <em>Semantic Conflict Diff Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode> semanticConflict_DiffGridNode;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGridNode_up() <em>Semantic Conflict Diff Grid Node up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_up> semanticConflict_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGridNode_down() <em>Semantic Conflict Diff Grid Node down</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_down> semanticConflict_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGridNode_left() <em>Semantic Conflict Diff Grid Node left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_left> semanticConflict_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGridNode_right() <em>Semantic Conflict Diff Grid Node right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_right> semanticConflict_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffFood() <em>Semantic Conflict Diff Food</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffFood()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFood> semanticConflict_DiffFood;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffPacman() <em>Semantic Conflict Diff Pacman</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffPacman()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPacman> semanticConflict_DiffPacman;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGhost() <em>Semantic Conflict Diff Ghost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGhost()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGhost> semanticConflict_DiffGhost;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGame() <em>Semantic Conflict Diff Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGame()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame> semanticConflict_DiffGame;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGame_gridnodes() <em>Semantic Conflict Diff Game gridnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> semanticConflict_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGame_entities() <em>Semantic Conflict Diff Game entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_entities> semanticConflict_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGame_domainspecificdiffs() <em>Semantic Conflict Diff Game domainspecificdiffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGame_domainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_domainspecificdiffs> semanticConflict_DiffGame_domainspecificdiffs;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffGame_semanticconflicts() <em>Semantic Conflict Diff Game semanticconflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffGame_semanticconflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_semanticconflicts> semanticConflict_DiffGame_semanticconflicts;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffPositionableEntity_on() <em>Semantic Conflict Diff Positionable Entity on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPositionableEntity_on> semanticConflict_DiffPositionableEntity_on;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffFruit() <em>Semantic Conflict Diff Fruit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFruit> semanticConflict_DiffFruit;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DiffEnergizer() <em>Semantic Conflict Diff Energizer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DiffEnergizer()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEnergizer> semanticConflict_DiffEnergizer;

	/**
	 * The cached value of the '{@link #getSemanticConflict_DomainSpecificDiff() <em>Semantic Conflict Domain Specific Diff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticConflict_DomainSpecificDiff()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSpecificDiff> semanticConflict_DomainSpecificDiff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.SEMANTIC_CONFLICT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.SEMANTIC_CONFLICT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode> getSemanticConflict_DiffGridNode() {
		if (semanticConflict_DiffGridNode == null) {
			semanticConflict_DiffGridNode = new EObjectResolvingEList<DiffGridNode>(DiffGridNode.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE);
		}
		return semanticConflict_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_up> getSemanticConflict_DiffGridNode_up() {
		if (semanticConflict_DiffGridNode_up == null) {
			semanticConflict_DiffGridNode_up = new EObjectResolvingEList<DiffGridNode_up>(DiffGridNode_up.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP);
		}
		return semanticConflict_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_down> getSemanticConflict_DiffGridNode_down() {
		if (semanticConflict_DiffGridNode_down == null) {
			semanticConflict_DiffGridNode_down = new EObjectResolvingEList<DiffGridNode_down>(DiffGridNode_down.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN);
		}
		return semanticConflict_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_left> getSemanticConflict_DiffGridNode_left() {
		if (semanticConflict_DiffGridNode_left == null) {
			semanticConflict_DiffGridNode_left = new EObjectResolvingEList<DiffGridNode_left>(DiffGridNode_left.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT);
		}
		return semanticConflict_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_right> getSemanticConflict_DiffGridNode_right() {
		if (semanticConflict_DiffGridNode_right == null) {
			semanticConflict_DiffGridNode_right = new EObjectResolvingEList<DiffGridNode_right>(DiffGridNode_right.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT);
		}
		return semanticConflict_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFood> getSemanticConflict_DiffFood() {
		if (semanticConflict_DiffFood == null) {
			semanticConflict_DiffFood = new EObjectResolvingEList<DiffFood>(DiffFood.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD);
		}
		return semanticConflict_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPacman> getSemanticConflict_DiffPacman() {
		if (semanticConflict_DiffPacman == null) {
			semanticConflict_DiffPacman = new EObjectResolvingEList<DiffPacman>(DiffPacman.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN);
		}
		return semanticConflict_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGhost> getSemanticConflict_DiffGhost() {
		if (semanticConflict_DiffGhost == null) {
			semanticConflict_DiffGhost = new EObjectResolvingEList<DiffGhost>(DiffGhost.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST);
		}
		return semanticConflict_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame> getSemanticConflict_DiffGame() {
		if (semanticConflict_DiffGame == null) {
			semanticConflict_DiffGame = new EObjectResolvingEList<DiffGame>(DiffGame.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME);
		}
		return semanticConflict_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getSemanticConflict_DiffGame_gridnodes() {
		if (semanticConflict_DiffGame_gridnodes == null) {
			semanticConflict_DiffGame_gridnodes = new EObjectResolvingEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES);
		}
		return semanticConflict_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_entities> getSemanticConflict_DiffGame_entities() {
		if (semanticConflict_DiffGame_entities == null) {
			semanticConflict_DiffGame_entities = new EObjectResolvingEList<DiffGame_entities>(DiffGame_entities.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES);
		}
		return semanticConflict_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_domainspecificdiffs> getSemanticConflict_DiffGame_domainspecificdiffs() {
		if (semanticConflict_DiffGame_domainspecificdiffs == null) {
			semanticConflict_DiffGame_domainspecificdiffs = new EObjectResolvingEList<DiffGame_domainspecificdiffs>(DiffGame_domainspecificdiffs.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS);
		}
		return semanticConflict_DiffGame_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_semanticconflicts> getSemanticConflict_DiffGame_semanticconflicts() {
		if (semanticConflict_DiffGame_semanticconflicts == null) {
			semanticConflict_DiffGame_semanticconflicts = new EObjectResolvingEList<DiffGame_semanticconflicts>(DiffGame_semanticconflicts.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS);
		}
		return semanticConflict_DiffGame_semanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPositionableEntity_on> getSemanticConflict_DiffPositionableEntity_on() {
		if (semanticConflict_DiffPositionableEntity_on == null) {
			semanticConflict_DiffPositionableEntity_on = new EObjectResolvingEList<DiffPositionableEntity_on>(DiffPositionableEntity_on.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return semanticConflict_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFruit> getSemanticConflict_DiffFruit() {
		if (semanticConflict_DiffFruit == null) {
			semanticConflict_DiffFruit = new EObjectResolvingEList<DiffFruit>(DiffFruit.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT);
		}
		return semanticConflict_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEnergizer> getSemanticConflict_DiffEnergizer() {
		if (semanticConflict_DiffEnergizer == null) {
			semanticConflict_DiffEnergizer = new EObjectResolvingEList<DiffEnergizer>(DiffEnergizer.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER);
		}
		return semanticConflict_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSpecificDiff> getSemanticConflict_DomainSpecificDiff() {
		if (semanticConflict_DomainSpecificDiff == null) {
			semanticConflict_DomainSpecificDiff = new EObjectResolvingEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF);
		}
		return semanticConflict_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__NAME:
				return getName();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE:
				return getSemanticConflict_DiffGridNode();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP:
				return getSemanticConflict_DiffGridNode_up();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN:
				return getSemanticConflict_DiffGridNode_down();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT:
				return getSemanticConflict_DiffGridNode_left();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT:
				return getSemanticConflict_DiffGridNode_right();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD:
				return getSemanticConflict_DiffFood();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN:
				return getSemanticConflict_DiffPacman();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST:
				return getSemanticConflict_DiffGhost();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME:
				return getSemanticConflict_DiffGame();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES:
				return getSemanticConflict_DiffGame_gridnodes();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES:
				return getSemanticConflict_DiffGame_entities();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS:
				return getSemanticConflict_DiffGame_domainspecificdiffs();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS:
				return getSemanticConflict_DiffGame_semanticconflicts();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON:
				return getSemanticConflict_DiffPositionableEntity_on();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT:
				return getSemanticConflict_DiffFruit();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER:
				return getSemanticConflict_DiffEnergizer();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF:
				return getSemanticConflict_DomainSpecificDiff();
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
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__NAME:
				setName((String)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE:
				getSemanticConflict_DiffGridNode().clear();
				getSemanticConflict_DiffGridNode().addAll((Collection<? extends DiffGridNode>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP:
				getSemanticConflict_DiffGridNode_up().clear();
				getSemanticConflict_DiffGridNode_up().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN:
				getSemanticConflict_DiffGridNode_down().clear();
				getSemanticConflict_DiffGridNode_down().addAll((Collection<? extends DiffGridNode_down>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT:
				getSemanticConflict_DiffGridNode_left().clear();
				getSemanticConflict_DiffGridNode_left().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT:
				getSemanticConflict_DiffGridNode_right().clear();
				getSemanticConflict_DiffGridNode_right().addAll((Collection<? extends DiffGridNode_right>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD:
				getSemanticConflict_DiffFood().clear();
				getSemanticConflict_DiffFood().addAll((Collection<? extends DiffFood>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN:
				getSemanticConflict_DiffPacman().clear();
				getSemanticConflict_DiffPacman().addAll((Collection<? extends DiffPacman>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST:
				getSemanticConflict_DiffGhost().clear();
				getSemanticConflict_DiffGhost().addAll((Collection<? extends DiffGhost>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME:
				getSemanticConflict_DiffGame().clear();
				getSemanticConflict_DiffGame().addAll((Collection<? extends DiffGame>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES:
				getSemanticConflict_DiffGame_gridnodes().clear();
				getSemanticConflict_DiffGame_gridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES:
				getSemanticConflict_DiffGame_entities().clear();
				getSemanticConflict_DiffGame_entities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS:
				getSemanticConflict_DiffGame_domainspecificdiffs().clear();
				getSemanticConflict_DiffGame_domainspecificdiffs().addAll((Collection<? extends DiffGame_domainspecificdiffs>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS:
				getSemanticConflict_DiffGame_semanticconflicts().clear();
				getSemanticConflict_DiffGame_semanticconflicts().addAll((Collection<? extends DiffGame_semanticconflicts>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticConflict_DiffPositionableEntity_on().clear();
				getSemanticConflict_DiffPositionableEntity_on().addAll((Collection<? extends DiffPositionableEntity_on>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT:
				getSemanticConflict_DiffFruit().clear();
				getSemanticConflict_DiffFruit().addAll((Collection<? extends DiffFruit>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER:
				getSemanticConflict_DiffEnergizer().clear();
				getSemanticConflict_DiffEnergizer().addAll((Collection<? extends DiffEnergizer>)newValue);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF:
				getSemanticConflict_DomainSpecificDiff().clear();
				getSemanticConflict_DomainSpecificDiff().addAll((Collection<? extends DomainSpecificDiff>)newValue);
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
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE:
				getSemanticConflict_DiffGridNode().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP:
				getSemanticConflict_DiffGridNode_up().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN:
				getSemanticConflict_DiffGridNode_down().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT:
				getSemanticConflict_DiffGridNode_left().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT:
				getSemanticConflict_DiffGridNode_right().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD:
				getSemanticConflict_DiffFood().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN:
				getSemanticConflict_DiffPacman().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST:
				getSemanticConflict_DiffGhost().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME:
				getSemanticConflict_DiffGame().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES:
				getSemanticConflict_DiffGame_gridnodes().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES:
				getSemanticConflict_DiffGame_entities().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS:
				getSemanticConflict_DiffGame_domainspecificdiffs().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS:
				getSemanticConflict_DiffGame_semanticconflicts().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON:
				getSemanticConflict_DiffPositionableEntity_on().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT:
				getSemanticConflict_DiffFruit().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER:
				getSemanticConflict_DiffEnergizer().clear();
				return;
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF:
				getSemanticConflict_DomainSpecificDiff().clear();
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
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE:
				return semanticConflict_DiffGridNode != null && !semanticConflict_DiffGridNode.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP:
				return semanticConflict_DiffGridNode_up != null && !semanticConflict_DiffGridNode_up.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN:
				return semanticConflict_DiffGridNode_down != null && !semanticConflict_DiffGridNode_down.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT:
				return semanticConflict_DiffGridNode_left != null && !semanticConflict_DiffGridNode_left.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT:
				return semanticConflict_DiffGridNode_right != null && !semanticConflict_DiffGridNode_right.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD:
				return semanticConflict_DiffFood != null && !semanticConflict_DiffFood.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN:
				return semanticConflict_DiffPacman != null && !semanticConflict_DiffPacman.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST:
				return semanticConflict_DiffGhost != null && !semanticConflict_DiffGhost.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME:
				return semanticConflict_DiffGame != null && !semanticConflict_DiffGame.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES:
				return semanticConflict_DiffGame_gridnodes != null && !semanticConflict_DiffGame_gridnodes.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES:
				return semanticConflict_DiffGame_entities != null && !semanticConflict_DiffGame_entities.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS:
				return semanticConflict_DiffGame_domainspecificdiffs != null && !semanticConflict_DiffGame_domainspecificdiffs.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS:
				return semanticConflict_DiffGame_semanticconflicts != null && !semanticConflict_DiffGame_semanticconflicts.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON:
				return semanticConflict_DiffPositionableEntity_on != null && !semanticConflict_DiffPositionableEntity_on.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT:
				return semanticConflict_DiffFruit != null && !semanticConflict_DiffFruit.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER:
				return semanticConflict_DiffEnergizer != null && !semanticConflict_DiffEnergizer.isEmpty();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF:
				return semanticConflict_DomainSpecificDiff != null && !semanticConflict_DomainSpecificDiff.isEmpty();
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

} //SemanticConflictImpl
