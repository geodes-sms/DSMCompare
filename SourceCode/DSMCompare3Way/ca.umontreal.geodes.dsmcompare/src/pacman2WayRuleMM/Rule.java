/**
 */
package pacman2WayRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffEnergizer <em>Rule Pattern Diff Energizer</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffFood <em>Rule Pattern Diff Food</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffFruit <em>Rule Pattern Diff Fruit</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGame <em>Rule Pattern Diff Game</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGame_entities <em>Rule Pattern Diff Game entities</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGame_gridnodes <em>Rule Pattern Diff Game gridnodes</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGhost <em>Rule Pattern Diff Ghost</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGridNode <em>Rule Pattern Diff Grid Node</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGridNode_down <em>Rule Pattern Diff Grid Node down</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGridNode_left <em>Rule Pattern Diff Grid Node left</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGridNode_right <em>Rule Pattern Diff Grid Node right</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffGridNode_up <em>Rule Pattern Diff Grid Node up</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffPacman <em>Rule Pattern Diff Pacman</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_DiffPositionableEntity_on <em>Rule Pattern Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_Game <em>Rule Pattern Game</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_GridNode <em>Rule Pattern Grid Node</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_PositionableEntity <em>Rule Pattern Positionable Entity</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getRulePattern__ListEInt <em>Rule Pattern List EInt</em>}</li>
 * </ul>
 *
 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacman2WayRuleMM.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link pacman2WayRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Energizer</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffEnergizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Energizer</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffEnergizer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEnergizer> getRulePattern_DiffEnergizer();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Food</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffFood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Food</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffFood()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffFood> getRulePattern_DiffFood();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Fruit</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffFruit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Fruit</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffFruit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffFruit> getRulePattern_DiffFruit();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Game</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Game</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGame()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGame> getRulePattern_DiffGame();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Game entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Game entities</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGame_entities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGame_entities> getRulePattern_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Game gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Game gridnodes</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGame_gridnodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGame_gridnodes> getRulePattern_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Ghost</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGhost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Ghost</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGhost()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGhost> getRulePattern_DiffGhost();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Grid Node</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Grid Node</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGridNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGridNode> getRulePattern_DiffGridNode();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Grid Node down</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Grid Node down</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGridNode_down()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_down> getRulePattern_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Grid Node left</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Grid Node left</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGridNode_left()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_left> getRulePattern_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Grid Node right</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Grid Node right</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGridNode_right()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_right> getRulePattern_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Grid Node up</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Grid Node up</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffGridNode_up()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_up> getRulePattern_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Pacman</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffPacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Pacman</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffPacman()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPacman> getRulePattern_DiffPacman();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Positionable Entity on</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Positionable Entity on</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_DiffPositionableEntity_on()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPositionableEntity_on> getRulePattern_DiffPositionableEntity_on();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Game</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Game</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_Game()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Game> getRulePattern_Game();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Grid Node</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Grid Node</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_GridNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GridNode> getRulePattern_GridNode();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Positionable Entity</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Positionable Entity</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_PositionableEntity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PositionableEntity> getRulePattern_PositionableEntity();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Semantic Object</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SemanticObject> getRulePattern_SemanticObject();

	/**
	 * Returns the value of the '<em><b>Rule Pattern List EInt</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM._ListEInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern List EInt</em>' containment reference list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_RulePattern__ListEInt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<_ListEInt> getRulePattern__ListEInt();

} // Rule
