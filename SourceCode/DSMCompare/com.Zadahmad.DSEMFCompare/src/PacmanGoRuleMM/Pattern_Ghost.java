/**
 */
package PacmanGoRuleMM;

import PacmanGoDiffMM.Ghost;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoRuleMM.Pattern_Ghost#getID_Pattern <em>ID Pattern</em>}</li>
 * </ul>
 *
 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage#getPattern_Ghost()
 * @model
 * @generated
 */
public interface Pattern_Ghost extends Ghost {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage#getPattern_Ghost_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link PacmanGoRuleMM.Pattern_Ghost#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

} // Pattern_Ghost
