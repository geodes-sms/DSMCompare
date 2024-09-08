/**
 */
package pacmanDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Grid Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGridNode#getChangeStatus <em>Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode()
 * @model
 * @generated
 */
public interface DiffGridNode extends GridNode {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Right(ClassDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGridNode_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGridNode#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

} // DiffGridNode
