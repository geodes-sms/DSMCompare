/**
 */
package ecorem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.EReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecorem.EReference#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getEReference()
 * @model
 * @generated
 */
public interface EReference extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EReference Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecorem.EClass#getEReferences <em>EReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Type</em>' container reference.
	 * @see #setEReferenceType(EClass)
	 * @see ecorem.EcoremPackage#getEReference_EReferenceType()
	 * @see ecorem.EClass#getEReferences
	 * @model opposite="eReferences" required="true" volatile="true" derived="true"
	 * @generated
	 */
	EClass getEReferenceType();

	/**
	 * Sets the value of the '{@link ecorem.EReference#getEReferenceType <em>EReference Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference Type</em>' container reference.
	 * @see #getEReferenceType()
	 * @generated
	 */
	void setEReferenceType(EClass value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #isSetEType()
	 * @see #unsetEType()
	 * @see #setEType(EClass)
	 * @see ecorem.EcoremPackage#getEReference_EType()
	 * @model unsettable="true" volatile="true"
	 * @generated
	 */
	EClass getEType();

	/**
	 * Sets the value of the '{@link ecorem.EReference#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #isSetEType()
	 * @see #unsetEType()
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClass value);

	/**
	 * Unsets the value of the '{@link ecorem.EReference#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEType()
	 * @see #getEType()
	 * @see #setEType(EClass)
	 * @generated
	 */
	void unsetEType();

	/**
	 * Returns whether the value of the '{@link ecorem.EReference#getEType <em>EType</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EType</em>' reference is set.
	 * @see #unsetEType()
	 * @see #getEType()
	 * @see #setEType(EClass)
	 * @generated
	 */
	boolean isSetEType();

} // EReference
