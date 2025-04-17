/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Grid Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getUp <em>Up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getDown <em>Down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getLeft <em>Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getRight <em>Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getDiffdown <em>Diffdown</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_GridNode#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode()
 * @model
 * @generated
 */
public interface Pattern_GridNode extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' reference.
	 * @see #setUp(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Up()
	 * @model
	 * @generated
	 */
	Pattern_GridNode getUp();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getUp <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' reference.
	 * @see #getUp()
	 * @generated
	 */
	void setUp(Pattern_GridNode value);

	/**
	 * Returns the value of the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' reference.
	 * @see #setDown(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Down()
	 * @model
	 * @generated
	 */
	Pattern_GridNode getDown();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getDown <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down</em>' reference.
	 * @see #getDown()
	 * @generated
	 */
	void setDown(Pattern_GridNode value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Left()
	 * @model
	 * @generated
	 */
	Pattern_GridNode getLeft();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Pattern_GridNode value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Right()
	 * @model
	 * @generated
	 */
	Pattern_GridNode getRight();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_GridNode#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Pattern_GridNode value);

	/**
	 * Returns the value of the '<em><b>Diffup</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffup</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Diffup()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_up> getDiffup();

	/**
	 * Returns the value of the '<em><b>Diffdown</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdown</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Diffdown()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_down> getDiffdown();

	/**
	 * Returns the value of the '<em><b>Diffleft</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffleft</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Diffleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_left> getDiffleft();

	/**
	 * Returns the value of the '<em><b>Diffright</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffright</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_GridNode_Diffright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGridNode_right> getDiffright();

} // Pattern_GridNode
