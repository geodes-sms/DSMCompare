/**
 */
package arduinoRuleMM;

import arduinoDiffMM.DiffSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.Pattern_DiffSensor#getID_Pattern <em>ID Pattern</em>}</li>
 * </ul>
 *
 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffSensor()
 * @model
 * @generated
 */
public interface Pattern_DiffSensor extends DiffSensor {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffSensor_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffSensor#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

} // Pattern_DiffSensor
