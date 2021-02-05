/**
 */
package ecoreRuleMM;

import ecoreDiffMM.DiffEEnumLiteral_eEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EEnum Literal eEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEEnumLiteral_eEnum()
 * @model
 * @generated
 */
public interface Pattern_DiffEEnumLiteral_eEnum extends DiffEEnumLiteral_eEnum {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEEnumLiteral_eEnum_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEEnumLiteral_eEnum_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_DiffEEnumLiteral_eEnum
