/**
 */
package ecorem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.ETypedElement#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getETypedElement()
 * @model abstract="true"
 * @generated
 */
public interface ETypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>EType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' attribute.
	 * @see #setEType(String)
	 * @see ecorem.EcoremPackage#getETypedElement_EType()
	 * @model
	 * @generated
	 */
	String getEType();

	/**
	 * Sets the value of the '{@link ecorem.ETypedElement#getEType <em>EType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' attribute.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(String value);

} // ETypedElement
