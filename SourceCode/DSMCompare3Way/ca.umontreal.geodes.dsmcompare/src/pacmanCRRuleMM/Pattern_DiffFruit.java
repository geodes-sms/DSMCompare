/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Fruit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Left <em>New location Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Right <em>New location Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffFruit#getLocationChangeStatus <em>Location Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit()
 * @model
 * @generated
 */
public interface Pattern_DiffFruit extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#isFilter <em>Filter</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Left <em>New id Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_id_Right <em>New id Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_IdChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getIdChangeStatus <em>Id Change Status</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_value_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Left <em>New value Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_value_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_value_Right <em>New value Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_ValueChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getValueChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getValueChangeStatus <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getValueChangeStatus()
	 * @generated
	 */
	void setValueChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New location Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New location Left</em>' attribute.
	 * @see #setNew_location_Left(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_location_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_location_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Left <em>New location Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New location Left</em>' attribute.
	 * @see #getNew_location_Left()
	 * @generated
	 */
	void setNew_location_Left(String value);

	/**
	 * Returns the value of the '<em><b>New location Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New location Right</em>' attribute.
	 * @see #setNew_location_Right(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_New_location_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_location_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getNew_location_Right <em>New location Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New location Right</em>' attribute.
	 * @see #getNew_location_Right()
	 * @generated
	 */
	void setNew_location_Right(String value);

	/**
	 * Returns the value of the '<em><b>Location Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setLocationChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffFruit_LocationChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getLocationChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffFruit#getLocationChangeStatus <em>Location Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getLocationChangeStatus()
	 * @generated
	 */
	void setLocationChangeStatus(ChangeStatus value);

} // Pattern_DiffFruit
