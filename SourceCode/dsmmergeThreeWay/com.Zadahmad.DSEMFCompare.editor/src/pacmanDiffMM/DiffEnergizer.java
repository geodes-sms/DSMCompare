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
 *   <li>{@link pacmanDiffMM.DiffEnergizer#getChangeStatus <em>Change Status</em>}</li>
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
	 * The literals are from the enumeration {@link pacmanDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffEnergizer_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
