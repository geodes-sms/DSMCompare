/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#getEparameters <em>Eparameters</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#getEtype <em>Etype</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#getMethodBody <em>Method Body</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EOperation#get__idKDM <em>id KDM</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation()
 * @model
 * @generated
 */
public interface Pattern_EOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#isIsForbidden <em>Is Forbidden</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eparameters</em>' attribute.
	 * @see #setEparameters(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_Eparameters()
	 * @model
	 * @generated
	 */
	String getEparameters();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#getEparameters <em>Eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eparameters</em>' attribute.
	 * @see #getEparameters()
	 * @generated
	 */
	void setEparameters(String value);

	/**
	 * Returns the value of the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype</em>' attribute.
	 * @see #setEtype(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_Etype()
	 * @model
	 * @generated
	 */
	String getEtype();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#getEtype <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype</em>' attribute.
	 * @see #getEtype()
	 * @generated
	 */
	void setEtype(String value);

	/**
	 * Returns the value of the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Body</em>' attribute.
	 * @see #setMethodBody(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation_MethodBody()
	 * @model
	 * @generated
	 */
	String getMethodBody();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#getMethodBody <em>Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Body</em>' attribute.
	 * @see #getMethodBody()
	 * @generated
	 */
	void setMethodBody(String value);

	/**
	 * Returns the value of the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>id KDM</em>' attribute.
	 * @see #set__idKDM(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EOperation___idKDM()
	 * @model
	 * @generated
	 */
	String get__idKDM();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EOperation#get__idKDM <em>id KDM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id KDM</em>' attribute.
	 * @see #get__idKDM()
	 * @generated
	 */
	void set__idKDM(String value);

} // Pattern_EOperation
