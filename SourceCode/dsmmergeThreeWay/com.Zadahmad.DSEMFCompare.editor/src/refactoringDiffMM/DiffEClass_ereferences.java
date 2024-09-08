/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EClass ereferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEClass_ereferences#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEClass_ereferences#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_ereferences()
 * @model
 * @generated
 */
public interface DiffEClass_ereferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_ereferences_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_ereferences_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_ereferences_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_ereferences#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EReference)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEClass_ereferences_EType()
	 * @model required="true"
	 * @generated
	 */
	EReference getEType();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEClass_ereferences#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EReference value);

} // DiffEClass_ereferences
