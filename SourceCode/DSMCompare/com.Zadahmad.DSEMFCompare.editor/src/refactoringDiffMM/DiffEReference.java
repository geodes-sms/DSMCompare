/**
 */
package refactoringDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DiffEReference#getOperation <em>Operation</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEReference#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEReference#getNew_etype <em>New etype</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEReference()
 * @model
 * @generated
 */
public interface DiffEReference extends EReference {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see refactoringDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEReference_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEReference#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see refactoringDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name</em>' attribute.
	 * @see #setNew_name(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEReference_New_name()
	 * @model
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEReference#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New etype</em>' attribute.
	 * @see #setNew_etype(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEReference_New_etype()
	 * @model
	 * @generated
	 */
	String getNew_etype();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEReference#getNew_etype <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New etype</em>' attribute.
	 * @see #getNew_etype()
	 * @generated
	 */
	void setNew_etype(String value);

} // DiffEReference
