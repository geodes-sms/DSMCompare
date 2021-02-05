/**
 */
package arduinoRuleMM;

import arduinoDiffMM.DiffConnector_module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Connector module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.Pattern_DiffConnector_module#getID_Pattern <em>ID Pattern</em>}</li>
 * </ul>
 *
 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffConnector_module()
 * @model
 * @generated
 */
public interface Pattern_DiffConnector_module extends DiffConnector_module {
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
	 * @see arduinoRuleMM.ArduinoRuleMMPackage#getPattern_DiffConnector_module_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link arduinoRuleMM.Pattern_DiffConnector_module#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

} // Pattern_DiffConnector_module
