/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Sensor#getStatus <em>Status</em>}</li>
 *   <li>{@link arduinoDiffMM.Sensor#getDiffstatus <em>Diffstatus</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends ModuleInstruction, BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Status}.
	 * It is bidirectional and its opposite is '{@link arduinoDiffMM.Status#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSensor_Status()
	 * @see arduinoDiffMM.Status#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<Status> getStatus();

	/**
	 * Returns the value of the '<em><b>Diffstatus</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffSensor_status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffstatus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffstatus</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getSensor_Diffstatus()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffSensor_status> getDiffstatus();

} // Sensor
