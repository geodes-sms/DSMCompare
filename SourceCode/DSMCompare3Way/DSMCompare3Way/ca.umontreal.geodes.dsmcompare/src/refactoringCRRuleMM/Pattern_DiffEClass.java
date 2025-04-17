/**
 */
package refactoringCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Left <em>New extends Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Right <em>New extends Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getExtendsChangeStatus <em>Extends Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Left <em>New implements Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Right <em>New implements Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getImplementsChangeStatus <em>Implements Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Left <em>New is Abstract Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Right <em>New is Abstract Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getIsAbstractChangeStatus <em>Is Abstract Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Left <em>New package Name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Right <em>New package Name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_DiffEClass#getPackageNameChangeStatus <em>Package Name Change Status</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass()
 * @model
 * @generated
 */
public interface Pattern_DiffEClass extends Pattern_EClass {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#isIsMerged <em>Is Merged</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Right <em>New name Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_NameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNameChangeStatus <em>Name Change Status</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_extends_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Left <em>New extends Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_extends_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Right <em>New extends Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_ExtendsChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getExtendsChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getExtendsChangeStatus <em>Extends Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getExtendsChangeStatus()
	 * @generated
	 */
	void setExtendsChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New implements Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New implements Left</em>' attribute.
	 * @see #setNew_implements_Left(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_implements_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_implements_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Left <em>New implements Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New implements Left</em>' attribute.
	 * @see #getNew_implements_Left()
	 * @generated
	 */
	void setNew_implements_Left(String value);

	/**
	 * Returns the value of the '<em><b>New implements Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New implements Right</em>' attribute.
	 * @see #setNew_implements_Right(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_implements_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_implements_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Right <em>New implements Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New implements Right</em>' attribute.
	 * @see #getNew_implements_Right()
	 * @generated
	 */
	void setNew_implements_Right(String value);

	/**
	 * Returns the value of the '<em><b>Implements Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setImplementsChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_ImplementsChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getImplementsChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getImplementsChangeStatus <em>Implements Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getImplementsChangeStatus()
	 * @generated
	 */
	void setImplementsChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New is Abstract Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New is Abstract Left</em>' attribute.
	 * @see #setNew_isAbstract_Left(boolean)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_isAbstract_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_isAbstract_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Left <em>New is Abstract Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New is Abstract Left</em>' attribute.
	 * @see #isNew_isAbstract_Left()
	 * @generated
	 */
	void setNew_isAbstract_Left(boolean value);

	/**
	 * Returns the value of the '<em><b>New is Abstract Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New is Abstract Right</em>' attribute.
	 * @see #setNew_isAbstract_Right(boolean)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_isAbstract_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_isAbstract_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Right <em>New is Abstract Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New is Abstract Right</em>' attribute.
	 * @see #isNew_isAbstract_Right()
	 * @generated
	 */
	void setNew_isAbstract_Right(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #setIsAbstractChangeStatus(ChangeStatus)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_IsAbstractChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIsAbstractChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getIsAbstractChangeStatus <em>Is Abstract Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getIsAbstractChangeStatus()
	 * @generated
	 */
	void setIsAbstractChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New package Name Left</em>' attribute.
	 * @see #setNew_packageName_Left(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_packageName_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Left();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Left <em>New package Name Left</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_New_packageName_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Right();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Right <em>New package Name Right</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_DiffEClass_PackageNameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getPackageNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_DiffEClass#getPackageNameChangeStatus <em>Package Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name Change Status</em>' attribute.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see #getPackageNameChangeStatus()
	 * @generated
	 */
	void setPackageNameChangeStatus(ChangeStatus value);

} // Pattern_DiffEClass
