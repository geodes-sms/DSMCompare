/**
 */
package dssmmDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffScore#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_SScore_Left <em>New SScore Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_SScore_Right <em>New SScore Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getSScoreChangeStatus <em>SScore Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_DScore_Left <em>New DScore Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_DScore_Right <em>New DScore Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getDScoreChangeStatus <em>DScore Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_Comment_Left <em>New Comment Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_Comment_Right <em>New Comment Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getCommentChangeStatus <em>Comment Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_MethodID_Left <em>New Method ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getNew_MethodID_Right <em>New Method ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffScore#getMethodIDChangeStatus <em>Method ID Change Status</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore()
 * @model
 * @generated
 */
public interface DiffScore extends Score {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Right(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New SScore Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New SScore Left</em>' attribute.
	 * @see #setNew_SScore_Left(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_SScore_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_SScore_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_SScore_Left <em>New SScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New SScore Left</em>' attribute.
	 * @see #getNew_SScore_Left()
	 * @generated
	 */
	void setNew_SScore_Left(float value);

	/**
	 * Returns the value of the '<em><b>New SScore Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New SScore Right</em>' attribute.
	 * @see #setNew_SScore_Right(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_SScore_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_SScore_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_SScore_Right <em>New SScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New SScore Right</em>' attribute.
	 * @see #getNew_SScore_Right()
	 * @generated
	 */
	void setNew_SScore_Right(float value);

	/**
	 * Returns the value of the '<em><b>SScore Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SScore Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setSScoreChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_SScoreChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getSScoreChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getSScoreChangeStatus <em>SScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SScore Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getSScoreChangeStatus()
	 * @generated
	 */
	void setSScoreChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New DScore Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New DScore Left</em>' attribute.
	 * @see #setNew_DScore_Left(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_DScore_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_DScore_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_DScore_Left <em>New DScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New DScore Left</em>' attribute.
	 * @see #getNew_DScore_Left()
	 * @generated
	 */
	void setNew_DScore_Left(float value);

	/**
	 * Returns the value of the '<em><b>New DScore Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New DScore Right</em>' attribute.
	 * @see #setNew_DScore_Right(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_DScore_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_DScore_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_DScore_Right <em>New DScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New DScore Right</em>' attribute.
	 * @see #getNew_DScore_Right()
	 * @generated
	 */
	void setNew_DScore_Right(float value);

	/**
	 * Returns the value of the '<em><b>DScore Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DScore Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setDScoreChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_DScoreChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDScoreChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getDScoreChangeStatus <em>DScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DScore Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDScoreChangeStatus()
	 * @generated
	 */
	void setDScoreChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr Left</em>' attribute.
	 * @see #setNew_Descr_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_Descr_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_Descr_Left <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Descr Left</em>' attribute.
	 * @see #getNew_Descr_Left()
	 * @generated
	 */
	void setNew_Descr_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Descr Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr Right</em>' attribute.
	 * @see #setNew_Descr_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_Descr_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_Descr_Right <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Descr Right</em>' attribute.
	 * @see #getNew_Descr_Right()
	 * @generated
	 */
	void setNew_Descr_Right(String value);

	/**
	 * Returns the value of the '<em><b>Descr Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setDescrChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_DescrChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDescrChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getDescrChangeStatus <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDescrChangeStatus()
	 * @generated
	 */
	void setDescrChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Comment Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Comment Left</em>' attribute.
	 * @see #setNew_Comment_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_Comment_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Comment_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_Comment_Left <em>New Comment Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Comment Left</em>' attribute.
	 * @see #getNew_Comment_Left()
	 * @generated
	 */
	void setNew_Comment_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Comment Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Comment Right</em>' attribute.
	 * @see #setNew_Comment_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_Comment_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Comment_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_Comment_Right <em>New Comment Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Comment Right</em>' attribute.
	 * @see #getNew_Comment_Right()
	 * @generated
	 */
	void setNew_Comment_Right(String value);

	/**
	 * Returns the value of the '<em><b>Comment Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setCommentChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_CommentChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getCommentChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getCommentChangeStatus <em>Comment Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getCommentChangeStatus()
	 * @generated
	 */
	void setCommentChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Method ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Method ID Left</em>' attribute.
	 * @see #setNew_MethodID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_MethodID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MethodID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_MethodID_Left <em>New Method ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Method ID Left</em>' attribute.
	 * @see #getNew_MethodID_Left()
	 * @generated
	 */
	void setNew_MethodID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Method ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Method ID Right</em>' attribute.
	 * @see #setNew_MethodID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_New_MethodID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MethodID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getNew_MethodID_Right <em>New Method ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Method ID Right</em>' attribute.
	 * @see #getNew_MethodID_Right()
	 * @generated
	 */
	void setNew_MethodID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Method ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setMethodIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffScore_MethodIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getMethodIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffScore#getMethodIDChangeStatus <em>Method ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getMethodIDChangeStatus()
	 * @generated
	 */
	void setMethodIDChangeStatus(ChangeStatus value);

} // DiffScore
