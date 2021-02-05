/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Connector#getPin <em>Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.Connector#getModule <em>Module</em>}</li>
 *   <li>{@link arduinoDiffMM.Connector#getDiffpin <em>Diffpin</em>}</li>
 *   <li>{@link arduinoDiffMM.Connector#getDiffmodule <em>Diffmodule</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(Pin)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getConnector_Pin()
	 * @model
	 * @generated
	 */
	Pin getPin();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Connector#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(arduinoDiffMM.Module)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getConnector_Module()
	 * @model
	 * @generated
	 */
	arduinoDiffMM.Module getModule();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Connector#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(arduinoDiffMM.Module value);

	/**
	 * Returns the value of the '<em><b>Diffpin</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffConnector_pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffpin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffpin</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getConnector_Diffpin()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffConnector_pin> getDiffpin();

	/**
	 * Returns the value of the '<em><b>Diffmodule</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffConnector_module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffmodule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmodule</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getConnector_Diffmodule()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffConnector_module> getDiffmodule();

} // Connector
