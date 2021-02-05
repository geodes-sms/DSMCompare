/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Instruction#getPrevious <em>Previous</em>}</li>
 *   <li>{@link arduinoDiffMM.Instruction#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoDiffMM.Instruction#getDiffprevious <em>Diffprevious</em>}</li>
 *   <li>{@link arduinoDiffMM.Instruction#getDiffnext <em>Diffnext</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Instruction)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getInstruction_Previous()
	 * @model
	 * @generated
	 */
	Instruction getPrevious();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Instruction#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Instruction value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instruction)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getInstruction_Next()
	 * @model
	 * @generated
	 */
	Instruction getNext();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Instruction#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instruction value);

	/**
	 * Returns the value of the '<em><b>Diffprevious</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffInstruction_previous}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffprevious</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getInstruction_Diffprevious()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffInstruction_previous> getDiffprevious();

	/**
	 * Returns the value of the '<em><b>Diffnext</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffInstruction_next}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffnext</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getInstruction_Diffnext()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffInstruction_next> getDiffnext();

} // Instruction
