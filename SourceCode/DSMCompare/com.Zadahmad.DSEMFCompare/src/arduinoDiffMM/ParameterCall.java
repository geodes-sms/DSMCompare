/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.ParameterCall#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.ParameterCall#getDiffdefinition <em>Diffdefinition</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameterCall()
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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameterCall_Definition()
	 * @model
	 * @generated
	 */
	ParameterDefinition getDefinition();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.ParameterCall#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffParameterCall_definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffdefinition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdefinition</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameterCall_Diffdefinition()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffParameterCall_definition> getDiffdefinition();

} // ParameterCall
