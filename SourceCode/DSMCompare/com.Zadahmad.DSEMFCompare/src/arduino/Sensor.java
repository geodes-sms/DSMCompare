/**
 */
package arduino;

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
 *   <li>{@link arduino.Sensor#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends ModuleInstruction, BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference list.
	 * The list contents are of type {@link arduino.Status}.
	 * It is bidirectional and its opposite is '{@link arduino.Status#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference list.
	 * @see arduino.ArduinoPackage#getSensor_Status()
	 * @see arduino.Status#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<Status> getStatus();

} // Sensor
