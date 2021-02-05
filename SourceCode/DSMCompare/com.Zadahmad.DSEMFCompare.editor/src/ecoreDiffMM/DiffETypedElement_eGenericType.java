/**
 */
package ecoreDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff ETyped Element eGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffETypedElement_eGenericType#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffETypedElement_eGenericType#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffETypedElement_eGenericType()
 * @model
 * @generated
 */
public interface DiffETypedElement_eGenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffETypedElement_eGenericType_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffETypedElement_eGenericType#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.AscOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AscOp value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EGenericType)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffETypedElement_eGenericType_EType()
	 * @model required="true"
	 * @generated
	 */
	EGenericType getEType();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffETypedElement_eGenericType#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EGenericType value);

} // DiffETypedElement_eGenericType
