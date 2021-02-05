/**
 */
package refactoringRuleMM;

import refactoringDiffMM.DiffEPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringRuleMM.Pattern_DiffEPackage#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_DiffEPackage()
 * @model
 * @generated
 */
public interface Pattern_DiffEPackage extends DiffEPackage {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_DiffEPackage_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringRuleMM.Pattern_DiffEPackage#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringRuleMM.RefactoringRuleMMPackage#getPattern_DiffEPackage_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_DiffEPackage
