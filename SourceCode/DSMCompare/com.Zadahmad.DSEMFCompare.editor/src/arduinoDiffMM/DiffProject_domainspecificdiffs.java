/**
 */
package arduinoDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Project domainspecificdiffs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffProject_domainspecificdiffs()
 * @model
 * @generated
 */
public interface DiffProject_domainspecificdiffs extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffProject_domainspecificdiffs_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getOperation <em>Operation</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(DomainSpecificDiff)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffProject_domainspecificdiffs_EType()
	 * @model required="true"
	 * @generated
	 */
	DomainSpecificDiff getEType();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(DomainSpecificDiff value);

} // DiffProject_domainspecificdiffs
