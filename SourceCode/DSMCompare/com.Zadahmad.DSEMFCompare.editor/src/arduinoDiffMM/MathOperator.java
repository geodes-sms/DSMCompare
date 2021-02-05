/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.MathOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link arduinoDiffMM.MathOperator#getRight <em>Right</em>}</li>
 *   <li>{@link arduinoDiffMM.MathOperator#getOperator <em>Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.MathOperator#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link arduinoDiffMM.MathOperator#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator()
 * @model abstract="true"
 * @generated
 */
public interface MathOperator extends Value, Instruction {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Value)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator_Left()
	 * @model required="true"
	 * @generated
	 */
	Value getLeft();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.MathOperator#getLeft <em>Left</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Value)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator_Right()
	 * @model
	 * @generated
	 */
	Value getRight();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.MathOperator#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Value value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see arduinoDiffMM.OperatorKind
	 * @see #setOperator(OperatorKind)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator_Operator()
	 * @model
	 * @generated
	 */
	OperatorKind getOperator();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.MathOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see arduinoDiffMM.OperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorKind value);

	/**
	 * Returns the value of the '<em><b>Diffleft</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffMathOperator_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffleft</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator_Diffleft()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffMathOperator_left> getDiffleft();

	/**
	 * Returns the value of the '<em><b>Diffright</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffMathOperator_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffright</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getMathOperator_Diffright()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffMathOperator_right> getDiffright();

} // MathOperator
