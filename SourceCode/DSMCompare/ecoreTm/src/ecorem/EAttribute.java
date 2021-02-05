/**
 */
package ecorem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.EAttribute#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends ENamedElement, ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecorem.EClass#getEAttributes <em>EAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see ecorem.EcoremPackage#getEAttribute_EContainingClass()
	 * @see ecorem.EClass#getEAttributes
	 * @model opposite="eAttributes" transient="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

} // EAttribute
