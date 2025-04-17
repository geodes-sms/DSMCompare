/**
 */
package refactoringCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Left <em>New etype Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Right <em>New etype Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEReference#getEtypeChangeStatus <em>Etype Change Status</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference()
 * @model
 * @generated
 */
public interface Pattern_DiffEReference extends Pattern_EReference {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Right <em>New name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name Right</em>' attribute.
	 * @see #getNew_name_Right()
	 * @generated
	 */
	void setNew_name_Right(String value);

	/**
	 * Returns the value of the '<em><b>Name Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setNameChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_NameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_New_etype_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_etype_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Left <em>New etype Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_New_etype_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_etype_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Right <em>New etype Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New etype Right</em>' attribute.
	 * @see #getNew_etype_Right()
	 * @generated
	 */
	void setNew_etype_Right(String value);

	/**
	 * Returns the value of the '<em><b>Etype Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setEtypeChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEReference_EtypeChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getEtypeChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEReference#getEtypeChangeStatus <em>Etype Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getEtypeChangeStatus()
	 * @generated
	 */
	void setEtypeChangeStatus(ChangeStatus value);

} // Pattern_DiffEReference
