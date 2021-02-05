/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Control#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.Control#getDiffinstructions <em>Diffinstructions</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends Instruction {
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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getControl_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffControl_instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffinstructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinstructions</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getControl_Diffinstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffControl_instructions> getDiffinstructions();

} // Control
