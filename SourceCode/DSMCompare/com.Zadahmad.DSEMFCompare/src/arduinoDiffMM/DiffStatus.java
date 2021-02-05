/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffStatus#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffStatus#getNew_value <em>New value</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffStatus#isNew_status <em>New status</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffStatus()
 * @model
 * @generated
 */
public interface DiffStatus extends Status {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffStatus_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffStatus#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffStatus_New_value()
	 * @model
	 * @generated
	 */
	String getNew_value();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffStatus#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(String value);

	/**
	 * Returns the value of the '<em><b>New status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New status</em>' attribute.
	 * @see #setNew_status(boolean)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffStatus_New_status()
	 * @model
	 * @generated
	 */
	boolean isNew_status();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffStatus#isNew_status <em>New status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New status</em>' attribute.
	 * @see #isNew_status()
	 * @generated
	 */
	void setNew_status(boolean value);

} // DiffStatus
