/**
 */
package arduinoDiffMM;

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
 *   <li>{@link arduinoDiffMM.FunctionCall#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.FunctionCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link arduinoDiffMM.FunctionCall#getDiffdefinition <em>Diffdefinition</em>}</li>
 *   <li>{@link arduinoDiffMM.FunctionCall#getDiffparameters <em>Diffparameters</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Instruction {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Function)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunctionCall_Definition()
	 * @model required="true"
	 * @generated
	 */
	Function getDefinition();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.FunctionCall#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Function value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunctionCall_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffFunctionCall_definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffdefinition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdefinition</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunctionCall_Diffdefinition()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffFunctionCall_definition> getDiffdefinition();

	/**
	 * Returns the value of the '<em><b>Diffparameters</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffFunctionCall_parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffparameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffparameters</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunctionCall_Diffparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffFunctionCall_parameters> getDiffparameters();

} // FunctionCall
