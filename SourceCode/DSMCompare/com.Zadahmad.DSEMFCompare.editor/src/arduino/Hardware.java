/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Hardware#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link arduino.Hardware#getModules <em>Modules</em>}</li>
 *   <li>{@link arduino.Hardware#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' reference list.
	 * The list contents are of type {@link arduino.Platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' reference list.
	 * @see arduino.ArduinoPackage#getHardware_Platforms()
	 * @model required="true"
	 * @generated
	 */
	EList<Platform> getPlatforms();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link arduino.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see arduino.ArduinoPackage#getHardware_Modules()
	 * @model
	 * @generated
	 */
	EList<arduino.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getHardware_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // Hardware
