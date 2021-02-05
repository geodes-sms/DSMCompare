/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game domainspecificdiffs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_domainspecificdiffs()
 * @model
 * @generated
 */
public interface DiffGame_domainspecificdiffs extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PacmanGoDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_domainspecificdiffs_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.AscOp
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
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_domainspecificdiffs_EType()
	 * @model required="true"
	 * @generated
	 */
	DomainSpecificDiff getEType();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(DomainSpecificDiff value);

} // DiffGame_domainspecificdiffs
