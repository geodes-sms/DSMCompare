/**
 */
package oracleDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff ROOT a</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.DiffROOT_a#getOperation <em>Operation</em>}</li>
 *   <li>{@link oracleDiffMM.DiffROOT_a#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getDiffROOT_a()
 * @model
 * @generated
 */
public interface DiffROOT_a extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link oracleDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see oracleDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDiffROOT_a_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DiffROOT_a#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see oracleDiffMM.AscOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AscOp value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(A)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDiffROOT_a_EType()
	 * @model required="true"
	 * @generated
	 */
	A getEType();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DiffROOT_a#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(A value);

} // DiffROOT_a
