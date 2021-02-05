/**
 */
package refactoringRuleMM;

import refactoringDiffMM.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringRuleMM.Pattern_EReference#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_EReference()
 * @model
 * @generated
 */
public interface Pattern_EReference extends EReference {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_EReference_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_EReference_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringRuleMM.Pattern_EReference#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_EReference
