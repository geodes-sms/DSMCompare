/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EClass esupertypes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DiffEClass_esupertypes#getOperation <em>Operation</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEClass_esupertypes#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_esupertypes()
 * @model
 * @generated
 */
public interface DiffEClass_esupertypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see refactoringDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_esupertypes_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_esupertypes#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see refactoringDiffMM.AscOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AscOp value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EClass)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_esupertypes_EType()
	 * @model required="true"
	 * @generated
	 */
	EClass getEType();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_esupertypes#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClass value);

} // DiffEClass_esupertypes
