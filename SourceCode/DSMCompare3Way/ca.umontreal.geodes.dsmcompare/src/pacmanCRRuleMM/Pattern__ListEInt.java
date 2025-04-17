/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern List EInt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern__ListEInt#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern__ListEInt#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern__ListEInt#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern__ListEInt()
 * @model
 * @generated
 */
public interface Pattern__ListEInt extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern__ListEInt_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern__ListEInt#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern__ListEInt_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern__ListEInt#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern__ListEInt_Value()
	 * @model
	 * @generated
	 */
	EList<Integer> getValue();

} // Pattern__ListEInt
