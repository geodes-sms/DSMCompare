/**
 */
package refactoringDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Left <em>New etype Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Right <em>New etype Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffEAttribute#getEtypeChangeStatus <em>Etype Change Status</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute()
 * @model
 * @generated
 */
public interface DiffEAttribute extends EAttribute {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#isFilter <em>Filter</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name Left</em>' attribute.
	 * @see #setNew_name_Left(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getNew_name_Right <em>New name Right</em>}' attribute.
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
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setNameChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New etype Left</em>' attribute.
	 * @see #setNew_etype_Left(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_New_etype_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_etype_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Left <em>New etype Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New etype Left</em>' attribute.
	 * @see #getNew_etype_Left()
	 * @generated
	 */
	void setNew_etype_Left(String value);

	/**
	 * Returns the value of the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New etype Right</em>' attribute.
	 * @see #setNew_etype_Right(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_New_etype_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_etype_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Right <em>New etype Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New etype Right</em>' attribute.
	 * @see #getNew_etype_Right()
	 * @generated
	 */
	void setNew_etype_Right(String value);

	/**
	 * Returns the value of the '<em><b>Etype Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setEtypeChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffEAttribute_EtypeChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getEtypeChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffEAttribute#getEtypeChangeStatus <em>Etype Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #getEtypeChangeStatus()
	 * @generated
	 */
	void setEtypeChangeStatus(ChangeStatus value);

} // DiffEAttribute
