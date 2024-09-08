/**
 */
package dssmm2WayRuleMM;

import dssmm2WayDiffMM.Factor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayRuleMM.Pattern_Factor#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Pattern_Factor#isFilter <em>Filter</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Pattern_Factor#isIsForbidden <em>Is Forbidden</em>}</li>
 * </ul>
 *
 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getPattern_Factor()
 * @model abstract="true"
 * @generated
 */
public interface Pattern_Factor extends Factor {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getPattern_Factor_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link dssmm2WayRuleMM.Pattern_Factor#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getPattern_Factor_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link dssmm2WayRuleMM.Pattern_Factor#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getPattern_Factor_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link dssmm2WayRuleMM.Pattern_Factor#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

} // Pattern_Factor
