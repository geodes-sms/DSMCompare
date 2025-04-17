/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffEnergizer <em>Rule Pattern Pattern Diff Energizer</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFood <em>Rule Pattern Pattern Diff Food</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffFruit <em>Rule Pattern Pattern Diff Fruit</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame <em>Rule Pattern Pattern Diff Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_entities <em>Rule Pattern Pattern Diff Game entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGame_gridnodes <em>Rule Pattern Pattern Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGhost <em>Rule Pattern Pattern Diff Ghost</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode <em>Rule Pattern Pattern Diff Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_down <em>Rule Pattern Pattern Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_left <em>Rule Pattern Pattern Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_right <em>Rule Pattern Pattern Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffGridNode_up <em>Rule Pattern Pattern Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPacman <em>Rule Pattern Pattern Diff Pacman</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_DiffPositionableEntity_on <em>Rule Pattern Pattern Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_Game <em>Rule Pattern Pattern Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_GridNode <em>Rule Pattern Pattern Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Rule#getRulePattern_Pattern_PositionableEntity <em>Rule Pattern Pattern Positionable Entity</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule()
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Rule#getName <em>Name</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_Constraints()
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Semantic Object</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Energizer</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffEnergizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Energizer</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEnergizer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEnergizer> getRulePattern_Pattern_DiffEnergizer();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Food</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffFood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Food</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffFood()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffFood> getRulePattern_Pattern_DiffFood();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Fruit</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffFruit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Fruit</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffFruit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffFruit> getRulePattern_Pattern_DiffFruit();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Game</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Game</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGame()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame> getRulePattern_Pattern_DiffGame();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Game entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Game entities</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGame_entities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame_entities> getRulePattern_Pattern_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Game gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Game gridnodes</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGame_gridnodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame_gridnodes> getRulePattern_Pattern_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Ghost</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGhost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Ghost</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGhost()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGhost> getRulePattern_Pattern_DiffGhost();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Grid Node</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Grid Node</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGridNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode> getRulePattern_Pattern_DiffGridNode();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Grid Node down</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Grid Node down</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGridNode_down()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_down> getRulePattern_Pattern_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Grid Node left</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Grid Node left</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGridNode_left()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_left> getRulePattern_Pattern_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Grid Node right</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Grid Node right</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGridNode_right()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_right> getRulePattern_Pattern_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Grid Node up</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Grid Node up</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffGridNode_up()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_up> getRulePattern_Pattern_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Pacman</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffPacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Pacman</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPacman()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPacman> getRulePattern_Pattern_DiffPacman();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Positionable Entity on</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Positionable Entity on</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPositionableEntity_on()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPositionableEntity_on> getRulePattern_Pattern_DiffPositionableEntity_on();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Game</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Game</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_Game()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_Game> getRulePattern_Pattern_Game();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Grid Node</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Grid Node</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_GridNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_GridNode> getRulePattern_Pattern_GridNode();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Positionable Entity</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Positionable Entity</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getRule_RulePattern_Pattern_PositionableEntity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_PositionableEntity> getRulePattern_Pattern_PositionableEntity();

} // Rule
