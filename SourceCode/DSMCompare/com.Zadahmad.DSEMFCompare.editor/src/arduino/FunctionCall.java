/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.FunctionCall#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduino.FunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Instruction {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Function)
	 * @see arduino.ArduinoPackage#getFunctionCall_Definition()
	 * @model required="true"
	 * @generated
	 */
	Function getDefinition();

	/**
	 * Sets the value of the '{@link arduino.FunctionCall#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Function value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link arduino.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see arduino.ArduinoPackage#getFunctionCall_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

} // FunctionCall
