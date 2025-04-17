/**
 */
package pacmanCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
import pacmanCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEnergizer <em>Rule Pattern Pattern Diff Energizer</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffFood <em>Rule Pattern Pattern Diff Food</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffFruit <em>Rule Pattern Pattern Diff Fruit</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGame <em>Rule Pattern Pattern Diff Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGame_entities <em>Rule Pattern Pattern Diff Game entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGame_gridnodes <em>Rule Pattern Pattern Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGhost <em>Rule Pattern Pattern Diff Ghost</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGridNode <em>Rule Pattern Pattern Diff Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGridNode_down <em>Rule Pattern Pattern Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGridNode_left <em>Rule Pattern Pattern Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGridNode_right <em>Rule Pattern Pattern Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffGridNode_up <em>Rule Pattern Pattern Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPacman <em>Rule Pattern Pattern Diff Pacman</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPositionableEntity_on <em>Rule Pattern Pattern Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_Game <em>Rule Pattern Pattern Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_GridNode <em>Rule Pattern Pattern Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_PositionableEntity <em>Rule Pattern Pattern Positionable Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_SemanticObject() <em>Rule Pattern Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_SemanticObject> rulePattern_Pattern_SemanticObject;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEnergizer() <em>Rule Pattern Pattern Diff Energizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEnergizer()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEnergizer> rulePattern_Pattern_DiffEnergizer;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffFood() <em>Rule Pattern Pattern Diff Food</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffFood()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffFood> rulePattern_Pattern_DiffFood;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffFruit() <em>Rule Pattern Pattern Diff Fruit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffFruit> rulePattern_Pattern_DiffFruit;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGame() <em>Rule Pattern Pattern Diff Game</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGame()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame> rulePattern_Pattern_DiffGame;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGame_entities() <em>Rule Pattern Pattern Diff Game entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_entities> rulePattern_Pattern_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGame_gridnodes() <em>Rule Pattern Pattern Diff Game gridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_gridnodes> rulePattern_Pattern_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGhost() <em>Rule Pattern Pattern Diff Ghost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGhost()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGhost> rulePattern_Pattern_DiffGhost;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGridNode() <em>Rule Pattern Pattern Diff Grid Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode> rulePattern_Pattern_DiffGridNode;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGridNode_down() <em>Rule Pattern Pattern Diff Grid Node down</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_down> rulePattern_Pattern_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGridNode_left() <em>Rule Pattern Pattern Diff Grid Node left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_left> rulePattern_Pattern_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGridNode_right() <em>Rule Pattern Pattern Diff Grid Node right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_right> rulePattern_Pattern_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffGridNode_up() <em>Rule Pattern Pattern Diff Grid Node up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_up> rulePattern_Pattern_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPacman() <em>Rule Pattern Pattern Diff Pacman</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPacman()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPacman> rulePattern_Pattern_DiffPacman;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPositionableEntity_on() <em>Rule Pattern Pattern Diff Positionable Entity on</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPositionableEntity_on> rulePattern_Pattern_DiffPositionableEntity_on;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_Game() <em>Rule Pattern Pattern Game</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_Game()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Game> rulePattern_Pattern_Game;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_GridNode() <em>Rule Pattern Pattern Grid Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_GridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_GridNode> rulePattern_Pattern_GridNode;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_PositionableEntity() <em>Rule Pattern Pattern Positionable Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_PositionableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_PositionableEntity> rulePattern_Pattern_PositionableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, PacmanCRRuleMMPackage.RULE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject() {
		if (rulePattern_Pattern_SemanticObject == null) {
			rulePattern_Pattern_SemanticObject = new EObjectContainmentEList<Pattern_SemanticObject>(Pattern_SemanticObject.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_Pattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEnergizer> getRulePattern_Pattern_DiffEnergizer() {
		if (rulePattern_Pattern_DiffEnergizer == null) {
			rulePattern_Pattern_DiffEnergizer = new EObjectContainmentEList<Pattern_DiffEnergizer>(Pattern_DiffEnergizer.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER);
		}
		return rulePattern_Pattern_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffFood> getRulePattern_Pattern_DiffFood() {
		if (rulePattern_Pattern_DiffFood == null) {
			rulePattern_Pattern_DiffFood = new EObjectContainmentEList<Pattern_DiffFood>(Pattern_DiffFood.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD);
		}
		return rulePattern_Pattern_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffFruit> getRulePattern_Pattern_DiffFruit() {
		if (rulePattern_Pattern_DiffFruit == null) {
			rulePattern_Pattern_DiffFruit = new EObjectContainmentEList<Pattern_DiffFruit>(Pattern_DiffFruit.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT);
		}
		return rulePattern_Pattern_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame> getRulePattern_Pattern_DiffGame() {
		if (rulePattern_Pattern_DiffGame == null) {
			rulePattern_Pattern_DiffGame = new EObjectContainmentEList<Pattern_DiffGame>(Pattern_DiffGame.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME);
		}
		return rulePattern_Pattern_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_entities> getRulePattern_Pattern_DiffGame_entities() {
		if (rulePattern_Pattern_DiffGame_entities == null) {
			rulePattern_Pattern_DiffGame_entities = new EObjectContainmentEList<Pattern_DiffGame_entities>(Pattern_DiffGame_entities.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES);
		}
		return rulePattern_Pattern_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_gridnodes> getRulePattern_Pattern_DiffGame_gridnodes() {
		if (rulePattern_Pattern_DiffGame_gridnodes == null) {
			rulePattern_Pattern_DiffGame_gridnodes = new EObjectContainmentEList<Pattern_DiffGame_gridnodes>(Pattern_DiffGame_gridnodes.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES);
		}
		return rulePattern_Pattern_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGhost> getRulePattern_Pattern_DiffGhost() {
		if (rulePattern_Pattern_DiffGhost == null) {
			rulePattern_Pattern_DiffGhost = new EObjectContainmentEList<Pattern_DiffGhost>(Pattern_DiffGhost.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST);
		}
		return rulePattern_Pattern_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode> getRulePattern_Pattern_DiffGridNode() {
		if (rulePattern_Pattern_DiffGridNode == null) {
			rulePattern_Pattern_DiffGridNode = new EObjectContainmentEList<Pattern_DiffGridNode>(Pattern_DiffGridNode.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE);
		}
		return rulePattern_Pattern_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_down> getRulePattern_Pattern_DiffGridNode_down() {
		if (rulePattern_Pattern_DiffGridNode_down == null) {
			rulePattern_Pattern_DiffGridNode_down = new EObjectContainmentEList<Pattern_DiffGridNode_down>(Pattern_DiffGridNode_down.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN);
		}
		return rulePattern_Pattern_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_left> getRulePattern_Pattern_DiffGridNode_left() {
		if (rulePattern_Pattern_DiffGridNode_left == null) {
			rulePattern_Pattern_DiffGridNode_left = new EObjectContainmentEList<Pattern_DiffGridNode_left>(Pattern_DiffGridNode_left.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT);
		}
		return rulePattern_Pattern_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_right> getRulePattern_Pattern_DiffGridNode_right() {
		if (rulePattern_Pattern_DiffGridNode_right == null) {
			rulePattern_Pattern_DiffGridNode_right = new EObjectContainmentEList<Pattern_DiffGridNode_right>(Pattern_DiffGridNode_right.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT);
		}
		return rulePattern_Pattern_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_up> getRulePattern_Pattern_DiffGridNode_up() {
		if (rulePattern_Pattern_DiffGridNode_up == null) {
			rulePattern_Pattern_DiffGridNode_up = new EObjectContainmentEList<Pattern_DiffGridNode_up>(Pattern_DiffGridNode_up.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP);
		}
		return rulePattern_Pattern_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPacman> getRulePattern_Pattern_DiffPacman() {
		if (rulePattern_Pattern_DiffPacman == null) {
			rulePattern_Pattern_DiffPacman = new EObjectContainmentEList<Pattern_DiffPacman>(Pattern_DiffPacman.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN);
		}
		return rulePattern_Pattern_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPositionableEntity_on> getRulePattern_Pattern_DiffPositionableEntity_on() {
		if (rulePattern_Pattern_DiffPositionableEntity_on == null) {
			rulePattern_Pattern_DiffPositionableEntity_on = new EObjectContainmentEList<Pattern_DiffPositionableEntity_on>(Pattern_DiffPositionableEntity_on.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return rulePattern_Pattern_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Game> getRulePattern_Pattern_Game() {
		if (rulePattern_Pattern_Game == null) {
			rulePattern_Pattern_Game = new EObjectContainmentEList<Pattern_Game>(Pattern_Game.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME);
		}
		return rulePattern_Pattern_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_GridNode> getRulePattern_Pattern_GridNode() {
		if (rulePattern_Pattern_GridNode == null) {
			rulePattern_Pattern_GridNode = new EObjectContainmentEList<Pattern_GridNode>(Pattern_GridNode.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE);
		}
		return rulePattern_Pattern_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_PositionableEntity> getRulePattern_Pattern_PositionableEntity() {
		if (rulePattern_Pattern_PositionableEntity == null) {
			rulePattern_Pattern_PositionableEntity = new EObjectContainmentEList<Pattern_PositionableEntity>(Pattern_PositionableEntity.class, this, PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY);
		}
		return rulePattern_Pattern_PositionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_Pattern_SemanticObject()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEnergizer()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffFood()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffFruit()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGame()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGame_entities()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGame_gridnodes()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGhost()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGridNode()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGridNode_down()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGridNode_left()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGridNode_right()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffGridNode_up()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPacman()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPositionableEntity_on()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME:
				return ((InternalEList<?>)getRulePattern_Pattern_Game()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE:
				return ((InternalEList<?>)getRulePattern_Pattern_GridNode()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY:
				return ((InternalEList<?>)getRulePattern_Pattern_PositionableEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.RULE__NAME:
				return getName();
			case PacmanCRRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case PacmanCRRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_Pattern_SemanticObject();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER:
				return getRulePattern_Pattern_DiffEnergizer();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD:
				return getRulePattern_Pattern_DiffFood();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT:
				return getRulePattern_Pattern_DiffFruit();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME:
				return getRulePattern_Pattern_DiffGame();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES:
				return getRulePattern_Pattern_DiffGame_entities();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES:
				return getRulePattern_Pattern_DiffGame_gridnodes();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST:
				return getRulePattern_Pattern_DiffGhost();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE:
				return getRulePattern_Pattern_DiffGridNode();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN:
				return getRulePattern_Pattern_DiffGridNode_down();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT:
				return getRulePattern_Pattern_DiffGridNode_left();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT:
				return getRulePattern_Pattern_DiffGridNode_right();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP:
				return getRulePattern_Pattern_DiffGridNode_up();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN:
				return getRulePattern_Pattern_DiffPacman();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return getRulePattern_Pattern_DiffPositionableEntity_on();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME:
				return getRulePattern_Pattern_Game();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE:
				return getRulePattern_Pattern_GridNode();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY:
				return getRulePattern_Pattern_PositionableEntity();
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
			case PacmanCRRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				getRulePattern_Pattern_SemanticObject().addAll((Collection<? extends Pattern_SemanticObject>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER:
				getRulePattern_Pattern_DiffEnergizer().clear();
				getRulePattern_Pattern_DiffEnergizer().addAll((Collection<? extends Pattern_DiffEnergizer>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD:
				getRulePattern_Pattern_DiffFood().clear();
				getRulePattern_Pattern_DiffFood().addAll((Collection<? extends Pattern_DiffFood>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT:
				getRulePattern_Pattern_DiffFruit().clear();
				getRulePattern_Pattern_DiffFruit().addAll((Collection<? extends Pattern_DiffFruit>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME:
				getRulePattern_Pattern_DiffGame().clear();
				getRulePattern_Pattern_DiffGame().addAll((Collection<? extends Pattern_DiffGame>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES:
				getRulePattern_Pattern_DiffGame_entities().clear();
				getRulePattern_Pattern_DiffGame_entities().addAll((Collection<? extends Pattern_DiffGame_entities>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES:
				getRulePattern_Pattern_DiffGame_gridnodes().clear();
				getRulePattern_Pattern_DiffGame_gridnodes().addAll((Collection<? extends Pattern_DiffGame_gridnodes>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST:
				getRulePattern_Pattern_DiffGhost().clear();
				getRulePattern_Pattern_DiffGhost().addAll((Collection<? extends Pattern_DiffGhost>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE:
				getRulePattern_Pattern_DiffGridNode().clear();
				getRulePattern_Pattern_DiffGridNode().addAll((Collection<? extends Pattern_DiffGridNode>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN:
				getRulePattern_Pattern_DiffGridNode_down().clear();
				getRulePattern_Pattern_DiffGridNode_down().addAll((Collection<? extends Pattern_DiffGridNode_down>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT:
				getRulePattern_Pattern_DiffGridNode_left().clear();
				getRulePattern_Pattern_DiffGridNode_left().addAll((Collection<? extends Pattern_DiffGridNode_left>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT:
				getRulePattern_Pattern_DiffGridNode_right().clear();
				getRulePattern_Pattern_DiffGridNode_right().addAll((Collection<? extends Pattern_DiffGridNode_right>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP:
				getRulePattern_Pattern_DiffGridNode_up().clear();
				getRulePattern_Pattern_DiffGridNode_up().addAll((Collection<? extends Pattern_DiffGridNode_up>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN:
				getRulePattern_Pattern_DiffPacman().clear();
				getRulePattern_Pattern_DiffPacman().addAll((Collection<? extends Pattern_DiffPacman>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				getRulePattern_Pattern_DiffPositionableEntity_on().clear();
				getRulePattern_Pattern_DiffPositionableEntity_on().addAll((Collection<? extends Pattern_DiffPositionableEntity_on>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME:
				getRulePattern_Pattern_Game().clear();
				getRulePattern_Pattern_Game().addAll((Collection<? extends Pattern_Game>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE:
				getRulePattern_Pattern_GridNode().clear();
				getRulePattern_Pattern_GridNode().addAll((Collection<? extends Pattern_GridNode>)newValue);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY:
				getRulePattern_Pattern_PositionableEntity().clear();
				getRulePattern_Pattern_PositionableEntity().addAll((Collection<? extends Pattern_PositionableEntity>)newValue);
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
			case PacmanCRRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER:
				getRulePattern_Pattern_DiffEnergizer().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD:
				getRulePattern_Pattern_DiffFood().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT:
				getRulePattern_Pattern_DiffFruit().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME:
				getRulePattern_Pattern_DiffGame().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES:
				getRulePattern_Pattern_DiffGame_entities().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES:
				getRulePattern_Pattern_DiffGame_gridnodes().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST:
				getRulePattern_Pattern_DiffGhost().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE:
				getRulePattern_Pattern_DiffGridNode().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN:
				getRulePattern_Pattern_DiffGridNode_down().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT:
				getRulePattern_Pattern_DiffGridNode_left().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT:
				getRulePattern_Pattern_DiffGridNode_right().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP:
				getRulePattern_Pattern_DiffGridNode_up().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN:
				getRulePattern_Pattern_DiffPacman().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				getRulePattern_Pattern_DiffPositionableEntity_on().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME:
				getRulePattern_Pattern_Game().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE:
				getRulePattern_Pattern_GridNode().clear();
				return;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY:
				getRulePattern_Pattern_PositionableEntity().clear();
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
			case PacmanCRRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanCRRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case PacmanCRRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_Pattern_SemanticObject != null && !rulePattern_Pattern_SemanticObject.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER:
				return rulePattern_Pattern_DiffEnergizer != null && !rulePattern_Pattern_DiffEnergizer.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FOOD:
				return rulePattern_Pattern_DiffFood != null && !rulePattern_Pattern_DiffFood.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT:
				return rulePattern_Pattern_DiffFruit != null && !rulePattern_Pattern_DiffFruit.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME:
				return rulePattern_Pattern_DiffGame != null && !rulePattern_Pattern_DiffGame.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES:
				return rulePattern_Pattern_DiffGame_entities != null && !rulePattern_Pattern_DiffGame_entities.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES:
				return rulePattern_Pattern_DiffGame_gridnodes != null && !rulePattern_Pattern_DiffGame_gridnodes.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GHOST:
				return rulePattern_Pattern_DiffGhost != null && !rulePattern_Pattern_DiffGhost.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE:
				return rulePattern_Pattern_DiffGridNode != null && !rulePattern_Pattern_DiffGridNode.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN:
				return rulePattern_Pattern_DiffGridNode_down != null && !rulePattern_Pattern_DiffGridNode_down.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT:
				return rulePattern_Pattern_DiffGridNode_left != null && !rulePattern_Pattern_DiffGridNode_left.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT:
				return rulePattern_Pattern_DiffGridNode_right != null && !rulePattern_Pattern_DiffGridNode_right.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP:
				return rulePattern_Pattern_DiffGridNode_up != null && !rulePattern_Pattern_DiffGridNode_up.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN:
				return rulePattern_Pattern_DiffPacman != null && !rulePattern_Pattern_DiffPacman.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return rulePattern_Pattern_DiffPositionableEntity_on != null && !rulePattern_Pattern_DiffPositionableEntity_on.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GAME:
				return rulePattern_Pattern_Game != null && !rulePattern_Pattern_Game.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_GRID_NODE:
				return rulePattern_Pattern_GridNode != null && !rulePattern_Pattern_GridNode.isEmpty();
			case PacmanCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY:
				return rulePattern_Pattern_PositionableEntity != null && !rulePattern_Pattern_PositionableEntity.isEmpty();
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
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
