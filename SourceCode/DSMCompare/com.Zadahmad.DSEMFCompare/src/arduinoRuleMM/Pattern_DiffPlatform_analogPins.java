/**
 */
package arduinoRuleMM;

import arduinoDiffMM.DiffPlatform_analogPins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Platform analog Pins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.Pattern_DiffPlatform_analogPins#getID_Pattern <em>ID Pattern</em>}</li>
 * </ul>
 *
 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffPlatform_analogPins()
 * @model
 * @generated
 */
public interface Pattern_DiffPlatform_analogPins extends DiffPlatform_analogPins {
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
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffPlatform_analogPins_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffPlatform_analogPins#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

} // Pattern_DiffPlatform_analogPins
