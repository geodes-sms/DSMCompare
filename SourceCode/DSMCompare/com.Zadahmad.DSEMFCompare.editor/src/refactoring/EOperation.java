/**
 */
package refactoring;

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
 *   <li>{@link refactoring.EOperation#getEparameters <em>Eparameters</em>}</li>
 *   <li>{@link refactoring.EOperation#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.EOperation#getEtype <em>Etype</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#getEOperation()
 * @model
 * @generated
 */
public interface EOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eparameters</em>' attribute.
	 * @see #setEparameters(String)
	 * @see refactoring.RefactoringPackage#getEOperation_Eparameters()
	 * @model
	 * @generated
	 */
	String getEparameters();

	/**
	 * Sets the value of the '{@link refactoring.EOperation#getEparameters <em>Eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eparameters</em>' attribute.
	 * @see #getEparameters()
	 * @generated
	 */
	void setEparameters(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#getEOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring.EOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype</em>' attribute.
	 * @see #setEtype(String)
	 * @see refactoring.RefactoringPackage#getEOperation_Etype()
	 * @model
	 * @generated
	 */
	String getEtype();

	/**
	 * Sets the value of the '{@link refactoring.EOperation#getEtype <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype</em>' attribute.
	 * @see #getEtype()
	 * @generated
	 */
	void setEtype(String value);

} // EOperation
