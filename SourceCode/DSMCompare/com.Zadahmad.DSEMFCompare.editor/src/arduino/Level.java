/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Level#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends ModuleInstruction {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Value)
	 * @see arduino.ArduinoPackage#getLevel_Level()
	 * @model required="true"
	 * @generated
	 */
	Value getLevel();

	/**
	 * Sets the value of the '{@link arduino.Level#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Value value);

} // Level
