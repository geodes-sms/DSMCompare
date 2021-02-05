/**
 */
package ecorem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.EOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecorem.EOperation#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getEOperation()
 * @model
 * @generated
 */
public interface EOperation extends ENamedElement, ETypedElement {
	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' attribute.
	 * @see #setEParameters(String)
	 * @see ecorem.EcoremPackage#getEOperation_EParameters()
	 * @model
	 * @generated
	 */
	String getEParameters();

	/**
	 * Sets the value of the '{@link ecorem.EOperation#getEParameters <em>EParameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EParameters</em>' attribute.
	 * @see #getEParameters()
	 * @generated
	 */
	void setEParameters(String value);

	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecorem.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see ecorem.EcoremPackage#getEOperation_EContainingClass()
	 * @see ecorem.EClass#getEOperations
	 * @model opposite="eOperations" transient="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

} // EOperation
