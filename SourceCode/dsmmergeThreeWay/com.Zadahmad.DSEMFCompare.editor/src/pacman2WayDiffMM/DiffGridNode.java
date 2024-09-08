/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Grid Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffGridNode#getDiff_kind <em>Diff kind</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGridNode()
 * @model
 * @generated
 */
public interface DiffGridNode extends GridNode {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGridNode_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGridNode#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

} // DiffGridNode
