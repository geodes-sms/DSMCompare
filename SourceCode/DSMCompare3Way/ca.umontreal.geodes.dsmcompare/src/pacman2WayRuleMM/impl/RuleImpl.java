/**
 */
package pacman2WayRuleMM.impl;

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

import pacman2WayDiffMM.DiffEnergizer;
import pacman2WayDiffMM.DiffFood;
import pacman2WayDiffMM.DiffFruit;
import pacman2WayDiffMM.DiffGame;
import pacman2WayDiffMM.DiffGame_entities;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.DiffGhost;
import pacman2WayDiffMM.DiffGridNode;
import pacman2WayDiffMM.DiffGridNode_down;
import pacman2WayDiffMM.DiffGridNode_left;
import pacman2WayDiffMM.DiffGridNode_right;
import pacman2WayDiffMM.DiffGridNode_up;
import pacman2WayDiffMM.DiffPacman;
import pacman2WayDiffMM.DiffPositionableEntity_on;
import pacman2WayDiffMM.Game;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.PositionableEntity;
import pacman2WayDiffMM.SemanticObject;
import pacman2WayDiffMM._ListEInt;

import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacman2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEnergizer <em>Rule Pattern Diff Energizer</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffFood <em>Rule Pattern Diff Food</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffFruit <em>Rule Pattern Diff Fruit</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGame <em>Rule Pattern Diff Game</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGame_entities <em>Rule Pattern Diff Game entities</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGame_gridnodes <em>Rule Pattern Diff Game gridnodes</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGhost <em>Rule Pattern Diff Ghost</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGridNode <em>Rule Pattern Diff Grid Node</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGridNode_down <em>Rule Pattern Diff Grid Node down</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGridNode_left <em>Rule Pattern Diff Grid Node left</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGridNode_right <em>Rule Pattern Diff Grid Node right</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffGridNode_up <em>Rule Pattern Diff Grid Node up</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPacman <em>Rule Pattern Diff Pacman</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPositionableEntity_on <em>Rule Pattern Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_Game <em>Rule Pattern Game</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_GridNode <em>Rule Pattern Grid Node</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_PositionableEntity <em>Rule Pattern Positionable Entity</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.RuleImpl#getRulePattern__ListEInt <em>Rule Pattern List EInt</em>}</li>
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
	 * The cached value of the '{@link #getRulePattern_DiffEnergizer() <em>Rule Pattern Diff Energizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEnergizer()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEnergizer> rulePattern_DiffEnergizer;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffFood() <em>Rule Pattern Diff Food</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffFood()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFood> rulePattern_DiffFood;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffFruit() <em>Rule Pattern Diff Fruit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffFruit()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFruit> rulePattern_DiffFruit;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGame() <em>Rule Pattern Diff Game</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGame()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame> rulePattern_DiffGame;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGame_entities() <em>Rule Pattern Diff Game entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_entities> rulePattern_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGame_gridnodes() <em>Rule Pattern Diff Game gridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> rulePattern_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGhost() <em>Rule Pattern Diff Ghost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGhost()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGhost> rulePattern_DiffGhost;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGridNode() <em>Rule Pattern Diff Grid Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode> rulePattern_DiffGridNode;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGridNode_down() <em>Rule Pattern Diff Grid Node down</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_down> rulePattern_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGridNode_left() <em>Rule Pattern Diff Grid Node left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_left> rulePattern_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGridNode_right() <em>Rule Pattern Diff Grid Node right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_right> rulePattern_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffGridNode_up() <em>Rule Pattern Diff Grid Node up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_up> rulePattern_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPacman() <em>Rule Pattern Diff Pacman</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPacman()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPacman> rulePattern_DiffPacman;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPositionableEntity_on() <em>Rule Pattern Diff Positionable Entity on</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPositionableEntity_on> rulePattern_DiffPositionableEntity_on;

	/**
	 * The cached value of the '{@link #getRulePattern_Game() <em>Rule Pattern Game</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Game()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> rulePattern_Game;

	/**
	 * The cached value of the '{@link #getRulePattern_GridNode() <em>Rule Pattern Grid Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_GridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<GridNode> rulePattern_GridNode;

	/**
	 * The cached value of the '{@link #getRulePattern_PositionableEntity() <em>Rule Pattern Positionable Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_PositionableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionableEntity> rulePattern_PositionableEntity;

	/**
	 * The cached value of the '{@link #getRulePattern_SemanticObject() <em>Rule Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticObject> rulePattern_SemanticObject;

	/**
	 * The cached value of the '{@link #getRulePattern__ListEInt() <em>Rule Pattern List EInt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern__ListEInt()
	 * @generated
	 * @ordered
	 */
	protected EList<_ListEInt> rulePattern__ListEInt;

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
		return Pacman2WayRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, Pacman2WayRuleMMPackage.RULE__CONSTRAINTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEnergizer> getRulePattern_DiffEnergizer() {
		if (rulePattern_DiffEnergizer == null) {
			rulePattern_DiffEnergizer = new EObjectContainmentEList<DiffEnergizer>(DiffEnergizer.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER);
		}
		return rulePattern_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFood> getRulePattern_DiffFood() {
		if (rulePattern_DiffFood == null) {
			rulePattern_DiffFood = new EObjectContainmentEList<DiffFood>(DiffFood.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD);
		}
		return rulePattern_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFruit> getRulePattern_DiffFruit() {
		if (rulePattern_DiffFruit == null) {
			rulePattern_DiffFruit = new EObjectContainmentEList<DiffFruit>(DiffFruit.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT);
		}
		return rulePattern_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame> getRulePattern_DiffGame() {
		if (rulePattern_DiffGame == null) {
			rulePattern_DiffGame = new EObjectContainmentEList<DiffGame>(DiffGame.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME);
		}
		return rulePattern_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_entities> getRulePattern_DiffGame_entities() {
		if (rulePattern_DiffGame_entities == null) {
			rulePattern_DiffGame_entities = new EObjectContainmentEList<DiffGame_entities>(DiffGame_entities.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES);
		}
		return rulePattern_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getRulePattern_DiffGame_gridnodes() {
		if (rulePattern_DiffGame_gridnodes == null) {
			rulePattern_DiffGame_gridnodes = new EObjectContainmentEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES);
		}
		return rulePattern_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGhost> getRulePattern_DiffGhost() {
		if (rulePattern_DiffGhost == null) {
			rulePattern_DiffGhost = new EObjectContainmentEList<DiffGhost>(DiffGhost.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST);
		}
		return rulePattern_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode> getRulePattern_DiffGridNode() {
		if (rulePattern_DiffGridNode == null) {
			rulePattern_DiffGridNode = new EObjectContainmentEList<DiffGridNode>(DiffGridNode.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE);
		}
		return rulePattern_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_down> getRulePattern_DiffGridNode_down() {
		if (rulePattern_DiffGridNode_down == null) {
			rulePattern_DiffGridNode_down = new EObjectContainmentEList<DiffGridNode_down>(DiffGridNode_down.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN);
		}
		return rulePattern_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_left> getRulePattern_DiffGridNode_left() {
		if (rulePattern_DiffGridNode_left == null) {
			rulePattern_DiffGridNode_left = new EObjectContainmentEList<DiffGridNode_left>(DiffGridNode_left.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT);
		}
		return rulePattern_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_right> getRulePattern_DiffGridNode_right() {
		if (rulePattern_DiffGridNode_right == null) {
			rulePattern_DiffGridNode_right = new EObjectContainmentEList<DiffGridNode_right>(DiffGridNode_right.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT);
		}
		return rulePattern_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_up> getRulePattern_DiffGridNode_up() {
		if (rulePattern_DiffGridNode_up == null) {
			rulePattern_DiffGridNode_up = new EObjectContainmentEList<DiffGridNode_up>(DiffGridNode_up.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP);
		}
		return rulePattern_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPacman> getRulePattern_DiffPacman() {
		if (rulePattern_DiffPacman == null) {
			rulePattern_DiffPacman = new EObjectContainmentEList<DiffPacman>(DiffPacman.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN);
		}
		return rulePattern_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPositionableEntity_on> getRulePattern_DiffPositionableEntity_on() {
		if (rulePattern_DiffPositionableEntity_on == null) {
			rulePattern_DiffPositionableEntity_on = new EObjectContainmentEList<DiffPositionableEntity_on>(DiffPositionableEntity_on.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return rulePattern_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getRulePattern_Game() {
		if (rulePattern_Game == null) {
			rulePattern_Game = new EObjectContainmentEList<Game>(Game.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME);
		}
		return rulePattern_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridNode> getRulePattern_GridNode() {
		if (rulePattern_GridNode == null) {
			rulePattern_GridNode = new EObjectContainmentEList<GridNode>(GridNode.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE);
		}
		return rulePattern_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionableEntity> getRulePattern_PositionableEntity() {
		if (rulePattern_PositionableEntity == null) {
			rulePattern_PositionableEntity = new EObjectContainmentEList<PositionableEntity>(PositionableEntity.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY);
		}
		return rulePattern_PositionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticObject> getRulePattern_SemanticObject() {
		if (rulePattern_SemanticObject == null) {
			rulePattern_SemanticObject = new EObjectContainmentEList<SemanticObject>(SemanticObject.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<_ListEInt> getRulePattern__ListEInt() {
		if (rulePattern__ListEInt == null) {
			rulePattern__ListEInt = new EObjectContainmentEList<_ListEInt>(_ListEInt.class, this, Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT);
		}
		return rulePattern__ListEInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER:
				return ((InternalEList<?>)getRulePattern_DiffEnergizer()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD:
				return ((InternalEList<?>)getRulePattern_DiffFood()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT:
				return ((InternalEList<?>)getRulePattern_DiffFruit()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME:
				return ((InternalEList<?>)getRulePattern_DiffGame()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES:
				return ((InternalEList<?>)getRulePattern_DiffGame_entities()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES:
				return ((InternalEList<?>)getRulePattern_DiffGame_gridnodes()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST:
				return ((InternalEList<?>)getRulePattern_DiffGhost()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE:
				return ((InternalEList<?>)getRulePattern_DiffGridNode()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN:
				return ((InternalEList<?>)getRulePattern_DiffGridNode_down()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT:
				return ((InternalEList<?>)getRulePattern_DiffGridNode_left()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT:
				return ((InternalEList<?>)getRulePattern_DiffGridNode_right()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP:
				return ((InternalEList<?>)getRulePattern_DiffGridNode_up()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN:
				return ((InternalEList<?>)getRulePattern_DiffPacman()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return ((InternalEList<?>)getRulePattern_DiffPositionableEntity_on()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME:
				return ((InternalEList<?>)getRulePattern_Game()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE:
				return ((InternalEList<?>)getRulePattern_GridNode()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY:
				return ((InternalEList<?>)getRulePattern_PositionableEntity()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_SemanticObject()).basicRemove(otherEnd, msgs);
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT:
				return ((InternalEList<?>)getRulePattern__ListEInt()).basicRemove(otherEnd, msgs);
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
			case Pacman2WayRuleMMPackage.RULE__NAME:
				return getName();
			case Pacman2WayRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case Pacman2WayRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER:
				return getRulePattern_DiffEnergizer();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD:
				return getRulePattern_DiffFood();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT:
				return getRulePattern_DiffFruit();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME:
				return getRulePattern_DiffGame();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES:
				return getRulePattern_DiffGame_entities();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES:
				return getRulePattern_DiffGame_gridnodes();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST:
				return getRulePattern_DiffGhost();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE:
				return getRulePattern_DiffGridNode();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN:
				return getRulePattern_DiffGridNode_down();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT:
				return getRulePattern_DiffGridNode_left();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT:
				return getRulePattern_DiffGridNode_right();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP:
				return getRulePattern_DiffGridNode_up();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN:
				return getRulePattern_DiffPacman();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return getRulePattern_DiffPositionableEntity_on();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME:
				return getRulePattern_Game();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE:
				return getRulePattern_GridNode();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY:
				return getRulePattern_PositionableEntity();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_SemanticObject();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT:
				return getRulePattern__ListEInt();
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
			case Pacman2WayRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER:
				getRulePattern_DiffEnergizer().clear();
				getRulePattern_DiffEnergizer().addAll((Collection<? extends DiffEnergizer>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD:
				getRulePattern_DiffFood().clear();
				getRulePattern_DiffFood().addAll((Collection<? extends DiffFood>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT:
				getRulePattern_DiffFruit().clear();
				getRulePattern_DiffFruit().addAll((Collection<? extends DiffFruit>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME:
				getRulePattern_DiffGame().clear();
				getRulePattern_DiffGame().addAll((Collection<? extends DiffGame>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES:
				getRulePattern_DiffGame_entities().clear();
				getRulePattern_DiffGame_entities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES:
				getRulePattern_DiffGame_gridnodes().clear();
				getRulePattern_DiffGame_gridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST:
				getRulePattern_DiffGhost().clear();
				getRulePattern_DiffGhost().addAll((Collection<? extends DiffGhost>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE:
				getRulePattern_DiffGridNode().clear();
				getRulePattern_DiffGridNode().addAll((Collection<? extends DiffGridNode>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN:
				getRulePattern_DiffGridNode_down().clear();
				getRulePattern_DiffGridNode_down().addAll((Collection<? extends DiffGridNode_down>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT:
				getRulePattern_DiffGridNode_left().clear();
				getRulePattern_DiffGridNode_left().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT:
				getRulePattern_DiffGridNode_right().clear();
				getRulePattern_DiffGridNode_right().addAll((Collection<? extends DiffGridNode_right>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP:
				getRulePattern_DiffGridNode_up().clear();
				getRulePattern_DiffGridNode_up().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN:
				getRulePattern_DiffPacman().clear();
				getRulePattern_DiffPacman().addAll((Collection<? extends DiffPacman>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				getRulePattern_DiffPositionableEntity_on().clear();
				getRulePattern_DiffPositionableEntity_on().addAll((Collection<? extends DiffPositionableEntity_on>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME:
				getRulePattern_Game().clear();
				getRulePattern_Game().addAll((Collection<? extends Game>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE:
				getRulePattern_GridNode().clear();
				getRulePattern_GridNode().addAll((Collection<? extends GridNode>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY:
				getRulePattern_PositionableEntity().clear();
				getRulePattern_PositionableEntity().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				getRulePattern_SemanticObject().addAll((Collection<? extends SemanticObject>)newValue);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT:
				getRulePattern__ListEInt().clear();
				getRulePattern__ListEInt().addAll((Collection<? extends _ListEInt>)newValue);
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
			case Pacman2WayRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Pacman2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER:
				getRulePattern_DiffEnergizer().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD:
				getRulePattern_DiffFood().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT:
				getRulePattern_DiffFruit().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME:
				getRulePattern_DiffGame().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES:
				getRulePattern_DiffGame_entities().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES:
				getRulePattern_DiffGame_gridnodes().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST:
				getRulePattern_DiffGhost().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE:
				getRulePattern_DiffGridNode().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN:
				getRulePattern_DiffGridNode_down().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT:
				getRulePattern_DiffGridNode_left().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT:
				getRulePattern_DiffGridNode_right().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP:
				getRulePattern_DiffGridNode_up().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN:
				getRulePattern_DiffPacman().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				getRulePattern_DiffPositionableEntity_on().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME:
				getRulePattern_Game().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE:
				getRulePattern_GridNode().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY:
				getRulePattern_PositionableEntity().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				return;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT:
				getRulePattern__ListEInt().clear();
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
			case Pacman2WayRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Pacman2WayRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ENERGIZER:
				return rulePattern_DiffEnergizer != null && !rulePattern_DiffEnergizer.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FOOD:
				return rulePattern_DiffFood != null && !rulePattern_DiffFood.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FRUIT:
				return rulePattern_DiffFruit != null && !rulePattern_DiffFruit.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME:
				return rulePattern_DiffGame != null && !rulePattern_DiffGame.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_ENTITIES:
				return rulePattern_DiffGame_entities != null && !rulePattern_DiffGame_entities.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES:
				return rulePattern_DiffGame_gridnodes != null && !rulePattern_DiffGame_gridnodes.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GHOST:
				return rulePattern_DiffGhost != null && !rulePattern_DiffGhost.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE:
				return rulePattern_DiffGridNode != null && !rulePattern_DiffGridNode.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN:
				return rulePattern_DiffGridNode_down != null && !rulePattern_DiffGridNode_down.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT:
				return rulePattern_DiffGridNode_left != null && !rulePattern_DiffGridNode_left.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT:
				return rulePattern_DiffGridNode_right != null && !rulePattern_DiffGridNode_right.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_GRID_NODE_UP:
				return rulePattern_DiffGridNode_up != null && !rulePattern_DiffGridNode_up.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PACMAN:
				return rulePattern_DiffPacman != null && !rulePattern_DiffPacman.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON:
				return rulePattern_DiffPositionableEntity_on != null && !rulePattern_DiffPositionableEntity_on.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GAME:
				return rulePattern_Game != null && !rulePattern_Game.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_GRID_NODE:
				return rulePattern_GridNode != null && !rulePattern_GridNode.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_POSITIONABLE_ENTITY:
				return rulePattern_PositionableEntity != null && !rulePattern_PositionableEntity.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_SemanticObject != null && !rulePattern_SemanticObject.isEmpty();
			case Pacman2WayRuleMMPackage.RULE__RULE_PATTERN_LIST_EINT:
				return rulePattern__ListEInt != null && !rulePattern__ListEInt.isEmpty();
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
