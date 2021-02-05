/**
 */
package ecoreDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EPackage domainspecificdiffs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_domainspecificdiffs()
 * @model
 * @generated
 */
public interface DiffEPackage_domainspecificdiffs extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_domainspecificdiffs_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getOperation <em>Operation</em>}' attribute.
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
	 * @see #setEType(DomainSpecificDiff)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_domainspecificdiffs_EType()
	 * @model required="true"
	 * @generated
	 */
	DomainSpecificDiff getEType();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(DomainSpecificDiff value);

} // DiffEPackage_domainspecificdiffs
