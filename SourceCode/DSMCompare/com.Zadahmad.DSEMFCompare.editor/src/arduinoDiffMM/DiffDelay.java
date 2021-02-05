/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffDelay#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffDelay#getNew_unit <em>New unit</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffDelay#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffDelay()
 * @model
 * @generated
 */
public interface DiffDelay extends Delay {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffDelay_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffDelay#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New unit</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New unit</em>' attribute.
	 * @see arduinoDiffMM.Time
	 * @see #setNew_unit(Time)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffDelay_New_unit()
	 * @model
	 * @generated
	 */
	Time getNew_unit();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffDelay#getNew_unit <em>New unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New unit</em>' attribute.
	 * @see arduinoDiffMM.Time
	 * @see #getNew_unit()
	 * @generated
	 */
	void setNew_unit(Time value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(int)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffDelay_New_value()
	 * @model
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffDelay#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

} // DiffDelay
