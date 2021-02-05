/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Sketch#getHardware <em>Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.Sketch#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.Sketch#getFunctions <em>Functions</em>}</li>
 *   <li>{@link arduinoDiffMM.Sketch#getDiffhardware <em>Diffhardware</em>}</li>
 *   <li>{@link arduinoDiffMM.Sketch#getDiffinstructions <em>Diffinstructions</em>}</li>
 *   <li>{@link arduinoDiffMM.Sketch#getDifffunctions <em>Difffunctions</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends NamedElement, Instruction {
	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' reference.
	 * @see #setHardware(Hardware)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Hardware()
	 * @model required="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Sketch#getHardware <em>Hardware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Diffhardware</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSketch_hardware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffhardware</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffhardware</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Diffhardware()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffSketch_hardware> getDiffhardware();

	/**
	 * Returns the value of the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSketch_instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffinstructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinstructions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Diffinstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffSketch_instructions> getDiffinstructions();

	/**
	 * Returns the value of the '<em><b>Difffunctions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSketch_functions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difffunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difffunctions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSketch_Difffunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffSketch_functions> getDifffunctions();

} // Sketch
