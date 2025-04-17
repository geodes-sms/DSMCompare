/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.EOperation#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EOperation#getEparameters <em>Eparameters</em>}</li>
 *   <li>{@link refactoringDiffMM.EOperation#getEtype <em>Etype</em>}</li>
 *   <li>{@link refactoringDiffMM.EOperation#getMethodBody <em>Method Body</em>}</li>
 *   <li>{@link refactoringDiffMM.EOperation#get__idKDM <em>id KDM</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation()
 * @model
 * @generated
 */
public interface EOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EOperation#getName <em>Name</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation_Eparameters()
	 * @model
	 * @generated
	 */
	String getEparameters();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EOperation#getEparameters <em>Eparameters</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation_Etype()
	 * @model
	 * @generated
	 */
	String getEtype();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EOperation#getEtype <em>Etype</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation_MethodBody()
	 * @model
	 * @generated
	 */
	String getMethodBody();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EOperation#getMethodBody <em>Method Body</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEOperation___idKDM()
	 * @model
	 * @generated
	 */
	String get__idKDM();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EOperation#get__idKDM <em>id KDM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id KDM</em>' attribute.
	 * @see #get__idKDM()
	 * @generated
	 */
	void set__idKDM(String value);

} // EOperation
