/**
 */
package arduinoDiffMM;

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
 *   <li>{@link arduinoDiffMM.Hardware#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link arduinoDiffMM.Hardware#getModules <em>Modules</em>}</li>
 *   <li>{@link arduinoDiffMM.Hardware#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link arduinoDiffMM.Hardware#getDiffplatforms <em>Diffplatforms</em>}</li>
 *   <li>{@link arduinoDiffMM.Hardware#getDiffmodules <em>Diffmodules</em>}</li>
 *   <li>{@link arduinoDiffMM.Hardware#getDiffconnectors <em>Diffconnectors</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Platform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Platforms()
	 * @model required="true"
	 * @generated
	 */
	EList<Platform> getPlatforms();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link arduinoDiffMM.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Modules()
	 * @model
	 * @generated
	 */
	EList<arduinoDiffMM.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Diffplatforms</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffHardware_platforms}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffplatforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplatforms</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Diffplatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffHardware_platforms> getDiffplatforms();

	/**
	 * Returns the value of the '<em><b>Diffmodules</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffHardware_modules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffmodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmodules</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Diffmodules()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffHardware_modules> getDiffmodules();

	/**
	 * Returns the value of the '<em><b>Diffconnectors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffHardware_connectors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffconnectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffconnectors</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getHardware_Diffconnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffHardware_connectors> getDiffconnectors();

} // Hardware
