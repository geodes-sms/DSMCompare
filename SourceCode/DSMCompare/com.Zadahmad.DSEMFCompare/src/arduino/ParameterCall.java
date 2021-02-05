/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.ParameterCall#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getParameterCall()
 * @model
 * @generated
 */
public interface ParameterCall extends Instruction {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ParameterDefinition)
	 * @see arduino.ArduinoPackage#getParameterCall_Definition()
	 * @model
	 * @generated
	 */
	ParameterDefinition getDefinition();

	/**
	 * Sets the value of the '{@link arduino.ParameterCall#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ParameterDefinition value);

} // ParameterCall
