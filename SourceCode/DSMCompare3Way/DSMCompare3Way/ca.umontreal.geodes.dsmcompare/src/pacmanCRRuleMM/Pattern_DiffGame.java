/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Left <em>New lives Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Right <em>New lives Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Left <em>New score Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Right <em>New score Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffGame#getScoreChangeStatus <em>Score Change Status</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame()
 * @model
 * @generated
 */
public interface Pattern_DiffGame extends Pattern_Game {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#isFilter <em>Filter</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Left <em>New id Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_id_Right <em>New id Right</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_IdChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New lives Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New lives Left</em>' attribute.
	 * @see #setNew_lives_Left(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_lives_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_lives_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Left <em>New lives Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_lives_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_lives_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_lives_Right <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New lives Right</em>' attribute.
	 * @see #getNew_lives_Right()
	 * @generated
	 */
	void setNew_lives_Right(int value);

	/**
	 * Returns the value of the '<em><b>Lives Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setLivesChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_LivesChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getLivesChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getLivesChangeStatus <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_score_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_score_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Left <em>New score Left</em>}' attribute.
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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_New_score_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_score_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getNew_score_Right <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New score Right</em>' attribute.
	 * @see #getNew_score_Right()
	 * @generated
	 */
	void setNew_score_Right(int value);

	/**
	 * Returns the value of the '<em><b>Score Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setScoreChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffGame_ScoreChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getScoreChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffGame#getScoreChangeStatus <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getScoreChangeStatus()
	 * @generated
	 */
	void setScoreChangeStatus(ChangeStatus value);

} // Pattern_DiffGame
