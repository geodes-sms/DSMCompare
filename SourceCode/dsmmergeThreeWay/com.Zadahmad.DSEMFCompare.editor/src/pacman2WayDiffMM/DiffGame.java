/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffGame#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffGame#getNew_lives <em>New lives</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffGame#getNew_score <em>New score</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame()
 * @model
 * @generated
 */
public interface DiffGame extends Game {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGame#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New lives</em>' attribute.
	 * @see #setNew_lives(int)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_New_lives()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_lives();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGame#getNew_lives <em>New lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New lives</em>' attribute.
	 * @see #getNew_lives()
	 * @generated
	 */
	void setNew_lives(int value);

	/**
	 * Returns the value of the '<em><b>New score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New score</em>' attribute.
	 * @see #setNew_score(int)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_New_score()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_score();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGame#getNew_score <em>New score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New score</em>' attribute.
	 * @see #getNew_score()
	 * @generated
	 */
	void setNew_score(int value);

} // DiffGame
