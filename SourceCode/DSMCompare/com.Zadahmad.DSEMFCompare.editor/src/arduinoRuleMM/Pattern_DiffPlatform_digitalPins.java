/**
 */
package arduinoRuleMM;

import arduinoDiffMM.DiffPlatform_digitalPins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Platform digital Pins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffPlatform_digitalPins()
 * @model
 * @generated
 */
public interface Pattern_DiffPlatform_digitalPins extends DiffPlatform_digitalPins {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffPlatform_digitalPins_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffPlatform_digitalPins_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_DiffPlatform_digitalPins
