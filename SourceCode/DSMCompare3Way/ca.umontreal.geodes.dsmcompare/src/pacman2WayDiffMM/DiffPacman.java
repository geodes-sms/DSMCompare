/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffPacman#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffPacman#getNew_id <em>New id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffPacman#getNew_initialPosition <em>New initial Position</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffPacman()
 * @model
 * @generated
 */
public interface DiffPacman extends Pacman {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffPacman_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffPacman#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(String)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffPacman_New_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffPacman#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(String value);

	/**
	 * Returns the value of the '<em><b>New initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New initial Position</em>' attribute.
	 * @see #setNew_initialPosition(String)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffPacman_New_initialPosition()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_initialPosition();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffPacman#getNew_initialPosition <em>New initial Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New initial Position</em>' attribute.
	 * @see #getNew_initialPosition()
	 * @generated
	 */
	void setNew_initialPosition(String value);

} // DiffPacman
