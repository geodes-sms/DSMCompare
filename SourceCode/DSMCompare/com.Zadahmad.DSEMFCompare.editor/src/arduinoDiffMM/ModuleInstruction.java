/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.ModuleInstruction#getModule <em>Module</em>}</li>
 *   <li>{@link arduinoDiffMM.ModuleInstruction#getDiffmodule <em>Diffmodule</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getModuleInstruction()
 * @model abstract="true"
 * @generated
 */
public interface ModuleInstruction extends Instruction, Parameter {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(arduinoDiffMM.Module)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getModuleInstruction_Module()
	 * @model required="true"
	 * @generated
	 */
	arduinoDiffMM.Module getModule();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.ModuleInstruction#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(arduinoDiffMM.Module value);

	/**
	 * Returns the value of the '<em><b>Diffmodule</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffModuleInstruction_module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmodule</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getModuleInstruction_Diffmodule()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffModuleInstruction_module> getDiffmodule();

} // ModuleInstruction
