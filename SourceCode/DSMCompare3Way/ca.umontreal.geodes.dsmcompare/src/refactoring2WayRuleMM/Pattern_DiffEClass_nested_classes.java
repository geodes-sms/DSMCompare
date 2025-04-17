/**
 */
package refactoring2WayRuleMM;

import refactoring2WayDiffMM.DiffEClass_nested_classes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EClass nested classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden <em>Is Forbidden</em>}</li>
 * </ul>
 *
 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getPattern_DiffEClass_nested_classes()
 * @model
 * @generated
 */
public interface Pattern_DiffEClass_nested_classes extends DiffEClass_nested_classes {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getPattern_DiffEClass_nested_classes_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getPattern_DiffEClass_nested_classes_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isFilter <em>Filter</em>}' attribute.
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getPattern_DiffEClass_nested_classes_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

} // Pattern_DiffEClass_nested_classes
