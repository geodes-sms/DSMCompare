/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Platform#getDigitalPins <em>Digital Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.Platform#getAnalogPins <em>Analog Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.Platform#getImage <em>Image</em>}</li>
 *   <li>{@link arduinoDiffMM.Platform#getDiffdigitalPins <em>Diffdigital Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.Platform#getDiffanalogPins <em>Diffanalog Pins</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Digital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Pins</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform_DigitalPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalPin> getDigitalPins();

	/**
	 * Returns the value of the '<em><b>Analog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.AnalogPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Pins</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform_AnalogPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalogPin> getAnalogPins();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Platform#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Diffdigital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffPlatform_digitalPins}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffdigital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdigital Pins</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform_DiffdigitalPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPlatform_digitalPins> getDiffdigitalPins();

	/**
	 * Returns the value of the '<em><b>Diffanalog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffPlatform_analogPins}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffanalog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffanalog Pins</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getPlatform_DiffanalogPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPlatform_analogPins> getDiffanalogPins();

} // Platform
