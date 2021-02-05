/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Function#getName <em>Name</em>}</li>
 *   <li>{@link arduinoDiffMM.Function#getParamDefs <em>Param Defs</em>}</li>
 *   <li>{@link arduinoDiffMM.Function#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.Function#getDiffparamDefs <em>Diffparam Defs</em>}</li>
 *   <li>{@link arduinoDiffMM.Function#getDiffinstructions <em>Diffinstructions</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Param Defs</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Defs</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction_ParamDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDefinition> getParamDefs();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Diffparam Defs</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffFunction_paramDefs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffparam Defs</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction_DiffparamDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffFunction_paramDefs> getDiffparamDefs();

	/**
	 * Returns the value of the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffFunction_instructions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinstructions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getFunction_Diffinstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffFunction_instructions> getDiffinstructions();

} // Function
