/**
 */
package pacmanDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getNew_lives_Left <em>New lives Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getNew_lives_Right <em>New lives Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getNew_score_Left <em>New score Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getNew_score_Right <em>New score Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGame#getScoreChangeStatus <em>Score Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame()
 * @model
 * @generated
 */
public interface DiffGame extends Game {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New lives Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New lives Left</em>' attribute.
	 * @see #setNew_lives_Left(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_New_lives_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_lives_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getNew_lives_Left <em>New lives Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New lives Left</em>' attribute.
	 * @see #getNew_lives_Left()
	 * @generated
	 */
	void setNew_lives_Left(int value);

	/**
	 * Returns the value of the '<em><b>New lives Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New lives Right</em>' attribute.
	 * @see #setNew_lives_Right(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_New_lives_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_lives_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getNew_lives_Right <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New lives Right</em>' attribute.
	 * @see #getNew_lives_Right()
	 * @generated
	 */
	void setNew_lives_Right(int value);

	/**
	 * Returns the value of the '<em><b>Lives Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setLivesChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_LivesChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getLivesChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getLivesChangeStatus()
	 * @generated
	 */
	void setLivesChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New score Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New score Left</em>' attribute.
	 * @see #setNew_score_Left(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_New_score_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_score_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getNew_score_Left <em>New score Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New score Left</em>' attribute.
	 * @see #getNew_score_Left()
	 * @generated
	 */
	void setNew_score_Left(int value);

	/**
	 * Returns the value of the '<em><b>New score Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New score Right</em>' attribute.
	 * @see #setNew_score_Right(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_New_score_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_score_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getNew_score_Right <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New score Right</em>' attribute.
	 * @see #getNew_score_Right()
	 * @generated
	 */
	void setNew_score_Right(int value);

	/**
	 * Returns the value of the '<em><b>Score Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setScoreChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGame_ScoreChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getScoreChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGame#getScoreChangeStatus <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getScoreChangeStatus()
	 * @generated
	 */
	void setScoreChangeStatus(ChangeStatus value);

} // DiffGame
