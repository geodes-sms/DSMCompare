/**
 */
package arduinoDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Platform digital Pins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffPlatform_digitalPins#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffPlatform_digitalPins#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffPlatform_digitalPins()
 * @model
 * @generated
 */
public interface DiffPlatform_digitalPins extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffPlatform_digitalPins_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffPlatform_digitalPins#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.AscOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AscOp value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(DigitalPin)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffPlatform_digitalPins_EType()
	 * @model required="true"
	 * @generated
	 */
	DigitalPin getEType();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffPlatform_digitalPins#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(DigitalPin value);

} // DiffPlatform_digitalPins
