/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Positionable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_PositionableEntity#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_PositionableEntity#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_PositionableEntity#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_PositionableEntity#getOn <em>On</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_PositionableEntity#getDiffon <em>Diffon</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity()
 * @model abstract="true"
 * @generated
 */
public interface Pattern_PositionableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_PositionableEntity#isIsForbidden <em>Is Forbidden</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see #setOn(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity_On()
	 * @model required="true"
	 * @generated
	 */
	Pattern_GridNode getOn();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_PositionableEntity#getOn <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Pattern_GridNode value);

	/**
	 * Returns the value of the '<em><b>Diffon</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffon</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_PositionableEntity_Diffon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffPositionableEntity_on> getDiffon();

} // Pattern_PositionableEntity
