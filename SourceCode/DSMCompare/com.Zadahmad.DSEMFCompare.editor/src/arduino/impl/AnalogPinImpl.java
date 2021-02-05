/**
 */
package arduino.impl;

import arduino.AnalogPin;
import arduino.ArduinoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnalogPinImpl extends PinImpl implements AnalogPin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ANALOG_PIN;
	}

} //AnalogPinImpl
