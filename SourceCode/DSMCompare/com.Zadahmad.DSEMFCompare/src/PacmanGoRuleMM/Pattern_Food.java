/**
 */
package PacmanGoRuleMM;

import PacmanGoDiffMM.Food;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Food</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoRuleMM.Pattern_Food#getID_Pattern <em>ID Pattern</em>}</li>
 * </ul>
 *
 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage#getPattern_Food()
 * @model
 * @generated
 */
public interface Pattern_Food extends Food {
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
	 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage#getPattern_Food_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link PacmanGoRuleMM.Pattern_Food#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

} // Pattern_Food
