/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost()
 * @model
 * @generated
 */
public interface Pattern_DiffGhost extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#isFilter <em>Filter</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Left <em>New id Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_id_Right <em>New id Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_IdChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New strategy Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New strategy Left</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #setNew_strategy_Left(GhostStrategy)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_New_strategy_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GhostStrategy getNew_strategy_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New strategy Left</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #getNew_strategy_Left()
	 * @generated
	 */
	void setNew_strategy_Left(GhostStrategy value);

	/**
	 * Returns the value of the '<em><b>New strategy Right</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New strategy Right</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #setNew_strategy_Right(GhostStrategy)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_New_strategy_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GhostStrategy getNew_strategy_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New strategy Right</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #getNew_strategy_Right()
	 * @generated
	 */
	void setNew_strategy_Right(GhostStrategy value);

	/**
	 * Returns the value of the '<em><b>Strategy Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setStrategyChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGhost_StrategyChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getStrategyChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getStrategyChangeStatus()
	 * @generated
	 */
	void setStrategyChangeStatus(ChangeStatus value);

} // Pattern_DiffGhost
