/**
 */
package refactoringCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Left <em>New extends Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Right <em>New extends Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface()
 * @model
 * @generated
 */
public interface Pattern_DiffInterface extends Pattern_Interface {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#isFilter <em>Filter</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Right <em>New name Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_NameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New extends Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New extends Left</em>' attribute.
	 * @see #setNew_extends_Left(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_extends_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Left <em>New extends Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New extends Left</em>' attribute.
	 * @see #getNew_extends_Left()
	 * @generated
	 */
	void setNew_extends_Left(String value);

	/**
	 * Returns the value of the '<em><b>New extends Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New extends Right</em>' attribute.
	 * @see #setNew_extends_Right(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_extends_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Right <em>New extends Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New extends Right</em>' attribute.
	 * @see #getNew_extends_Right()
	 * @generated
	 */
	void setNew_extends_Right(String value);

	/**
	 * Returns the value of the '<em><b>Extends Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setExtendsChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_ExtendsChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getExtendsChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getExtendsChangeStatus()
	 * @generated
	 */
	void setExtendsChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New package Name Left</em>' attribute.
	 * @see #setNew_packageName_Left(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_packageName_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New package Name Left</em>' attribute.
	 * @see #getNew_packageName_Left()
	 * @generated
	 */
	void setNew_packageName_Left(String value);

	/**
	 * Returns the value of the '<em><b>New package Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New package Name Right</em>' attribute.
	 * @see #setNew_packageName_Right(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_New_packageName_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New package Name Right</em>' attribute.
	 * @see #getNew_packageName_Right()
	 * @generated
	 */
	void setNew_packageName_Right(String value);

	/**
	 * Returns the value of the '<em><b>Package Name Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setPackageNameChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffInterface_PackageNameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getPackageNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getPackageNameChangeStatus()
	 * @generated
	 */
	void setPackageNameChangeStatus(ChangeStatus value);

} // Pattern_DiffInterface
