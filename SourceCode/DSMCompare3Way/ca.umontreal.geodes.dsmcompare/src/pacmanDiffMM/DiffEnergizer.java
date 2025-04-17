/**
 */
package pacmanDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer()
 * @model
 * @generated
 */
public interface DiffEnergizer extends Energizer {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#isFilter <em>Filter</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_id_Left <em>New id Left</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_id_Right <em>New id Right</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_IdChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New value Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value Left</em>' attribute.
	 * @see #setNew_value_Left(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_value_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_value_Left <em>New value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value Left</em>' attribute.
	 * @see #getNew_value_Left()
	 * @generated
	 */
	void setNew_value_Left(int value);

	/**
	 * Returns the value of the '<em><b>New value Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value Right</em>' attribute.
	 * @see #setNew_value_Right(int)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_value_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_value_Right <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value Right</em>' attribute.
	 * @see #getNew_value_Right()
	 * @generated
	 */
	void setNew_value_Right(int value);

	/**
	 * Returns the value of the '<em><b>Value Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setValueChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_ValueChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getValueChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getValueChangeStatus()
	 * @generated
	 */
	void setValueChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New durations Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New durations Left</em>' containment reference.
	 * @see #setNew_durations_Left(_ListEInt)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_durations_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	_ListEInt getNew_durations_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New durations Left</em>' containment reference.
	 * @see #getNew_durations_Left()
	 * @generated
	 */
	void setNew_durations_Left(_ListEInt value);

	/**
	 * Returns the value of the '<em><b>New durations Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New durations Right</em>' containment reference.
	 * @see #setNew_durations_Right(_ListEInt)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_New_durations_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	_ListEInt getNew_durations_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New durations Right</em>' containment reference.
	 * @see #getNew_durations_Right()
	 * @generated
	 */
	void setNew_durations_Right(_ListEInt value);

	/**
	 * Returns the value of the '<em><b>Durations Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setDurationsChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_DurationsChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDurationsChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durations Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getDurationsChangeStatus()
	 * @generated
	 */
	void setDurationsChangeStatus(ChangeStatus value);

} // DiffEnergizer
