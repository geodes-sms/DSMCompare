/**
 */
package oracleDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.DiffD#getOperation <em>Operation</em>}</li>
 *   <li>{@link oracleDiffMM.DiffD#getNew_id <em>New id</em>}</li>
 *   <li>{@link oracleDiffMM.DiffD#getNew_Name <em>New Name</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getDiffD()
 * @model
 * @generated
 */
public interface DiffD extends D {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link oracleDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see oracleDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDiffD_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DiffD#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see oracleDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(int)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDiffD_New_id()
	 * @model
	 * @generated
	 */
	int getNew_id();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DiffD#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(int value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNew_Name(String)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDiffD_New_Name()
	 * @model
	 * @generated
	 */
	String getNew_Name();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DiffD#getNew_Name <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNew_Name()
	 * @generated
	 */
	void setNew_Name(String value);

} // DiffD
