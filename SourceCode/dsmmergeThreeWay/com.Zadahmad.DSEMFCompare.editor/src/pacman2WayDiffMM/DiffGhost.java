/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffGhost#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffGhost#getNew_strategy <em>New strategy</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGhost()
 * @model
 * @generated
 */
public interface DiffGhost extends Ghost {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGhost_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGhost#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New strategy</em>' attribute.
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @see #setNew_strategy(GhostStrategy)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGhost_New_strategy()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GhostStrategy getNew_strategy();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGhost#getNew_strategy <em>New strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New strategy</em>' attribute.
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @see #getNew_strategy()
	 * @generated
	 */
	void setNew_strategy(GhostStrategy value);

} // DiffGhost
