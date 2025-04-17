/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern test Associations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getMulti <em>Multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getDiffsingle <em>Diffsingle</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_testAssociations#getDiffmulti <em>Diffmulti</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations()
 * @model
 * @generated
 */
public interface Pattern_testAssociations extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_testAssociations#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_testAssociations#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_testAssociations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' reference.
	 * @see #setSingle(Pattern_EClass)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_Single()
	 * @model
	 * @generated
	 */
	Pattern_EClass getSingle();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_testAssociations#getSingle <em>Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' reference.
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(Pattern_EClass value);

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_Multi()
	 * @model
	 * @generated
	 */
	EList<Pattern_EClass> getMulti();

	/**
	 * Returns the value of the '<em><b>Diffsingle</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_single}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsingle</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_Diffsingle()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_single> getDiffsingle();

	/**
	 * Returns the value of the '<em><b>Diffmulti</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmulti</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_testAssociations_Diffmulti()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_multi> getDiffmulti();

} // Pattern_testAssociations
