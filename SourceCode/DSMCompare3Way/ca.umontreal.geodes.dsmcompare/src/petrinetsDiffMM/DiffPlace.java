/**
 */
package petrinetsDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Left <em>New tokens Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Right <em>New tokens Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPlace#getTokensChangeStatus <em>Tokens Change Status</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace()
 * @model
 * @generated
 */
public interface DiffPlace extends Place {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
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
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#isFilter <em>Filter</em>}' attribute.
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
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * The literals are from the enumeration {@link petrinetsDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Left</em>' attribute.
	 * @see #setNew_id_Left(int)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_id_Left();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_id_Left <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Left</em>' attribute.
	 * @see #getNew_id_Left()
	 * @generated
	 */
	void setNew_id_Left(int value);

	/**
	 * Returns the value of the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Right</em>' attribute.
	 * @see #setNew_id_Right(int)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_id_Right();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_id_Right <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Right</em>' attribute.
	 * @see #getNew_id_Right()
	 * @generated
	 */
	void setNew_id_Right(int value);

	/**
	 * Returns the value of the '<em><b>Id Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #setIdChangeStatus(ChangeStatus)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_IdChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name Left</em>' attribute.
	 * @see #setNew_name_Left(String)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_name_Left <em>New name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name Left</em>' attribute.
	 * @see #getNew_name_Left()
	 * @generated
	 */
	void setNew_name_Left(String value);

	/**
	 * Returns the value of the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name Right</em>' attribute.
	 * @see #setNew_name_Right(String)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_name_Right <em>New name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name Right</em>' attribute.
	 * @see #getNew_name_Right()
	 * @generated
	 */
	void setNew_name_Right(String value);

	/**
	 * Returns the value of the '<em><b>Name Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #setNameChangeStatus(ChangeStatus)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New tokens Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New tokens Left</em>' attribute.
	 * @see #setNew_tokens_Left(int)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_tokens_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_tokens_Left();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Left <em>New tokens Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New tokens Left</em>' attribute.
	 * @see #getNew_tokens_Left()
	 * @generated
	 */
	void setNew_tokens_Left(int value);

	/**
	 * Returns the value of the '<em><b>New tokens Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New tokens Right</em>' attribute.
	 * @see #setNew_tokens_Right(int)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_New_tokens_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_tokens_Right();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Right <em>New tokens Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New tokens Right</em>' attribute.
	 * @see #getNew_tokens_Right()
	 * @generated
	 */
	void setNew_tokens_Right(int value);

	/**
	 * Returns the value of the '<em><b>Tokens Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #setTokensChangeStatus(ChangeStatus)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPlace_TokensChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getTokensChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPlace#getTokensChangeStatus <em>Tokens Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #getTokensChangeStatus()
	 * @generated
	 */
	void setTokensChangeStatus(ChangeStatus value);

} // DiffPlace
