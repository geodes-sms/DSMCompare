/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffConstant#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffConstant#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffConstant()
 * @model
 * @generated
 */
public interface DiffConstant extends Constant {
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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffConstant_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffConstant#getOperation <em>Operation</em>}' attribute.
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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffConstant_New_value()
	 * @model
	 * @generated
	 */
	String getNew_value();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffConstant#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(String value);

} // DiffConstant
