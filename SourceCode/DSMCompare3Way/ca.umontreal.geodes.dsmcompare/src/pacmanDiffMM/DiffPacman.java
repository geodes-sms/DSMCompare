/**
 */
package pacmanDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffPacman#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Left <em>New initial Position Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Right <em>New initial Position Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffPacman#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman()
 * @model
 * @generated
 */
public interface DiffPacman extends Pacman {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanDiffMM.DiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Merged</em>' attribute.
	 * @see #setIsMerged(boolean)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Left</em>' attribute.
	 * @see #setNew_id_Left(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getNew_id_Left <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Left</em>' attribute.
	 * @see #getNew_id_Left()
	 * @generated
	 */
	void setNew_id_Left(String value);

	/**
	 * Returns the value of the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Right</em>' attribute.
	 * @see #setNew_id_Right(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getNew_id_Right <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Right</em>' attribute.
	 * @see #getNew_id_Right()
	 * @generated
	 */
	void setNew_id_Right(String value);

	/**
	 * Returns the value of the '<em><b>Id Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setIdChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_IdChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New initial Position Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New initial Position Left</em>' attribute.
	 * @see #setNew_initialPosition_Left(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_New_initialPosition_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_initialPosition_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Left <em>New initial Position Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New initial Position Left</em>' attribute.
	 * @see #getNew_initialPosition_Left()
	 * @generated
	 */
	void setNew_initialPosition_Left(String value);

	/**
	 * Returns the value of the '<em><b>New initial Position Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New initial Position Right</em>' attribute.
	 * @see #setNew_initialPosition_Right(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_New_initialPosition_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_initialPosition_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getNew_initialPosition_Right <em>New initial Position Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New initial Position Right</em>' attribute.
	 * @see #getNew_initialPosition_Right()
	 * @generated
	 */
	void setNew_initialPosition_Right(String value);

	/**
	 * Returns the value of the '<em><b>Initial Position Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Position Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setInitialPositionChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffPacman_InitialPositionChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getInitialPositionChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffPacman#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Position Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getInitialPositionChangeStatus()
	 * @generated
	 */
	void setInitialPositionChangeStatus(ChangeStatus value);

} // DiffPacman
