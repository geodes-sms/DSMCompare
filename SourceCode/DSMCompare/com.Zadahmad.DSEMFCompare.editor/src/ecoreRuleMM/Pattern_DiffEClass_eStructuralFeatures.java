/**
 */
package ecoreRuleMM;

import ecoreDiffMM.DiffEClass_eStructuralFeatures;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EClass eStructural Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEClass_eStructuralFeatures()
 * @model
 * @generated
 */
public interface Pattern_DiffEClass_eStructuralFeatures extends DiffEClass_eStructuralFeatures {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEClass_eStructuralFeatures_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see ecoreRuleMM.EcoreRuleMMPackage#getPattern_DiffEClass_eStructuralFeatures_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_DiffEClass_eStructuralFeatures
