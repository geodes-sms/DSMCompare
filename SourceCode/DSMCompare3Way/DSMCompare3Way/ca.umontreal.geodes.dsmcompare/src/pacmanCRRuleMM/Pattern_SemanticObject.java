/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEnergizer <em>Semantic Object Diff Energizer</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFood <em>Semantic Object Diff Food</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffFruit <em>Semantic Object Diff Fruit</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame <em>Semantic Object Diff Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_entities <em>Semantic Object Diff Game entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGame_gridnodes <em>Semantic Object Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGhost <em>Semantic Object Diff Ghost</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode <em>Semantic Object Diff Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_down <em>Semantic Object Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_left <em>Semantic Object Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_right <em>Semantic Object Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffGridNode_up <em>Semantic Object Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPacman <em>Semantic Object Diff Pacman</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPositionableEntity_on <em>Semantic Object Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_Game <em>Semantic Object Game</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_GridNode <em>Semantic Object Grid Node</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticObject#getSemanticObject_PositionableEntity <em>Semantic Object Positionable Entity</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface Pattern_SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffEnergizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Energizer</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEnergizer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEnergizer> getSemanticObject_DiffEnergizer();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffFood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Food</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffFood()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffFood> getSemanticObject_DiffFood();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffFruit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Fruit</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffFruit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffFruit> getSemanticObject_DiffFruit();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGame()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame> getSemanticObject_DiffGame();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game entities</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGame_entities()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame_entities> getSemanticObject_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game gridnodes</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGame_gridnodes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGame_gridnodes> getSemanticObject_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGhost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Ghost</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGhost()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGhost> getSemanticObject_DiffGhost();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGridNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode> getSemanticObject_DiffGridNode();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node down</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGridNode_down()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_down> getSemanticObject_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node left</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGridNode_left()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_left> getSemanticObject_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node right</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGridNode_right()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_right> getSemanticObject_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node up</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffGridNode_up()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_up> getSemanticObject_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffPacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Pacman</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPacman()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPacman> getSemanticObject_DiffPacman();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Positionable Entity on</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPositionableEntity_on()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPositionableEntity_on> getSemanticObject_DiffPositionableEntity_on();

	/**
	 * Returns the value of the '<em><b>Semantic Object Game</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Game</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_Game()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_Game> getSemanticObject_Game();

	/**
	 * Returns the value of the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Grid Node</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_GridNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_GridNode> getSemanticObject_GridNode();

	/**
	 * Returns the value of the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Positionable Entity</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_PositionableEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_PositionableEntity> getSemanticObject_PositionableEntity();

} // Pattern_SemanticObject
