/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getTest <em>Test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EPackage#getDifftest <em>Difftest</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage()
 * @model
 * @generated
 */
public interface Pattern_EPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EPackage#isIsForbidden <em>Is Forbidden</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclassifiers</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Eclassifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EClass> getEclassifiers();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_testAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Test()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_testAssociations> getTest();

	/**
	 * Returns the value of the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeclassifiers</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Diffeclassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_eclassifiers> getDiffeclassifiers();

	/**
	 * Returns the value of the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinterfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Diffinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_interfaces> getDiffinterfaces();

	/**
	 * Returns the value of the '<em><b>Difftest</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difftest</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EPackage_Difftest()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_test> getDifftest();

} // Pattern_EPackage
