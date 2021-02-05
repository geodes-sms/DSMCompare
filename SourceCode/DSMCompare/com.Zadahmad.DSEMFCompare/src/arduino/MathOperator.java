/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.MathOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link arduino.MathOperator#getRight <em>Right</em>}</li>
 *   <li>{@link arduino.MathOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getMathOperator()
 * @model abstract="true"
 * @generated
 */
public interface MathOperator extends Value, Instruction {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Value)
	 * @see arduino.ArduinoPackage#getMathOperator_Left()
	 * @model required="true"
	 * @generated
	 */
	Value getLeft();

	/**
	 * Sets the value of the '{@link arduino.MathOperator#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Value value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Value)
	 * @see arduino.ArduinoPackage#getMathOperator_Right()
	 * @model
	 * @generated
	 */
	Value getRight();

	/**
	 * Sets the value of the '{@link arduino.MathOperator#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Value value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see arduino.OperatorKind
	 * @see #setOperator(OperatorKind)
	 * @see arduino.ArduinoPackage#getMathOperator_Operator()
	 * @model
	 * @generated
	 */
	OperatorKind getOperator();

	/**
	 * Sets the value of the '{@link arduino.MathOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see arduino.OperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorKind value);

} // MathOperator
