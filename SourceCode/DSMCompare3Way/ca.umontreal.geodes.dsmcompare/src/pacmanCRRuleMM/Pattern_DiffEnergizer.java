/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer()
 * @model
 * @generated
 */
public interface Pattern_DiffEnergizer extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isFilter <em>Filter</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Left <em>New id Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_id_Right <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Right</em>' attribute.
	 * @see #getNew_id_Right()
	 * @generated
	 */
	void setNew_id_Right(String value);

	/**
	 * Returns the value of the '<em><b>Id Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setIdChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_IdChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_value_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Left <em>New value Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_value_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_value_Right <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value Right</em>' attribute.
	 * @see #getNew_value_Right()
	 * @generated
	 */
	void setNew_value_Right(int value);

	/**
	 * Returns the value of the '<em><b>Value Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setValueChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_ValueChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getValueChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getValueChangeStatus <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getValueChangeStatus()
	 * @generated
	 */
	void setValueChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Durations Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setDurationsChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_DurationsChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDurationsChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getDurationsChangeStatus <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durations Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getDurationsChangeStatus()
	 * @generated
	 */
	void setDurationsChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New durations Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New durations Left</em>' containment reference.
	 * @see #setNew_durations_Left(Pattern__ListEInt)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_durations_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern__ListEInt getNew_durations_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Left <em>New durations Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New durations Left</em>' containment reference.
	 * @see #getNew_durations_Left()
	 * @generated
	 */
	void setNew_durations_Left(Pattern__ListEInt value);

	/**
	 * Returns the value of the '<em><b>New durations Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New durations Right</em>' containment reference.
	 * @see #setNew_durations_Right(Pattern__ListEInt)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffEnergizer_New_durations_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern__ListEInt getNew_durations_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffEnergizer#getNew_durations_Right <em>New durations Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New durations Right</em>' containment reference.
	 * @see #getNew_durations_Right()
	 * @generated
	 */
	void setNew_durations_Right(Pattern__ListEInt value);

} // Pattern_DiffEnergizer
