/**
 */
package PacmanGoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Food</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffFood#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffFood#getNew_id <em>New id</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffFood()
 * @model
 * @generated
 */
public interface DiffFood extends Food {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PacmanGoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffFood_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffFood#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(String)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffFood_New_id()
	 * @model
	 * @generated
	 */
	String getNew_id();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffFood#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(String value);

} // DiffFood
