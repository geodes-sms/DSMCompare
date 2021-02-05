/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Status#isStatus <em>Status</em>}</li>
 *   <li>{@link arduinoDiffMM.Status#getSensor <em>Sensor</em>}</li>
 *   <li>{@link arduinoDiffMM.Status#getDiffsensor <em>Diffsensor</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends ModuleInstruction, Value {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getStatus_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Status#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduinoDiffMM.Sensor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getStatus_Sensor()
	 * @see arduinoDiffMM.Sensor#getStatus
	 * @model opposite="status"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Status#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Diffsensor</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffStatus_sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffsensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsensor</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getStatus_Diffsensor()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffStatus_sensor> getDiffsensor();

} // Status
