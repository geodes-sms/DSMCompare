/**
 */
package pacmanDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Grid Node right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGridNode_right#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGridNode_right#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_right()
 * @model
 * @generated
 */
public interface DiffGridNode_right extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.AscDiffKind
	 * @see #setDiff_kind_Left(AscDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_right_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.AscDiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.AscDiffKind
	 * @see #setDiff_kind_Right(AscDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_right_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode_right#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.AscDiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_right_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode_right#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(GridNode)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_right_EType()
	 * @model required="true"
	 * @generated
	 */
	GridNode getEType();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode_right#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(GridNode value);

} // DiffGridNode_right
