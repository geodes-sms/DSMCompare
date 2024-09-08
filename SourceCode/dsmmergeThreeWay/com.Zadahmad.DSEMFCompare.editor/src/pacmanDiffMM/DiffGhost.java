/**
 */
package pacmanDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGhost#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}</li>
 *   <li>{@link pacmanDiffMM.DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost()
 * @model
 * @generated
 */
public interface DiffGhost extends Ghost {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New strategy Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanDiffMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New strategy Left</em>' attribute.
	 * @see pacmanDiffMM.GhostStrategy
	 * @see #setNew_strategy_Left(GhostStrategy)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_New_strategy_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GhostStrategy getNew_strategy_Left();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getNew_strategy_Left <em>New strategy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New strategy Left</em>' attribute.
	 * @see pacmanDiffMM.GhostStrategy
	 * @see #getNew_strategy_Left()
	 * @generated
	 */
	void setNew_strategy_Left(GhostStrategy value);

	/**
	 * Returns the value of the '<em><b>New strategy Right</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanDiffMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New strategy Right</em>' attribute.
	 * @see pacmanDiffMM.GhostStrategy
	 * @see #setNew_strategy_Right(GhostStrategy)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_New_strategy_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GhostStrategy getNew_strategy_Right();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getNew_strategy_Right <em>New strategy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New strategy Right</em>' attribute.
	 * @see pacmanDiffMM.GhostStrategy
	 * @see #getNew_strategy_Right()
	 * @generated
	 */
	void setNew_strategy_Right(GhostStrategy value);

	/**
	 * Returns the value of the '<em><b>Strategy Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setStrategyChangeStatus(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getDiffGhost_StrategyChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getStrategyChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.DiffGhost#getStrategyChangeStatus <em>Strategy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Change Status</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getStrategyChangeStatus()
	 * @generated
	 */
	void setStrategyChangeStatus(ChangeStatus value);

} // DiffGhost
