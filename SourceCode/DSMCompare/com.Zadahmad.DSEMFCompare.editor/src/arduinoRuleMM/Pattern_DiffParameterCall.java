/**
 */
package arduinoRuleMM;

import arduinoDiffMM.DiffParameterCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.Pattern_DiffParameterCall#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link arduinoRuleMM.Pattern_DiffParameterCall#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffParameterCall()
 * @model
 * @generated
 */
public interface Pattern_DiffParameterCall extends DiffParameterCall {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffParameterCall_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffParameterCall#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffParameterCall_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffParameterCall#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

} // Pattern_DiffParameterCall
