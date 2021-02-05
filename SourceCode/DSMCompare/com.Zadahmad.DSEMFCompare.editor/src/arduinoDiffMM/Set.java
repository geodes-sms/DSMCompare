/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Set#getVariable <em>Variable</em>}</li>
 *   <li>{@link arduinoDiffMM.Set#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoDiffMM.Set#getDiffvariable <em>Diffvariable</em>}</li>
 *   <li>{@link arduinoDiffMM.Set#getDiffvalue <em>Diffvalue</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Instruction {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSet_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Set#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSet_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Set#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Diffvariable</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSet_variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffvariable</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSet_Diffvariable()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffSet_variable> getDiffvariable();

	/**
	 * Returns the value of the '<em><b>Diffvalue</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSet_value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffvalue</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSet_Diffvalue()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffSet_value> getDiffvalue();

} // Set
