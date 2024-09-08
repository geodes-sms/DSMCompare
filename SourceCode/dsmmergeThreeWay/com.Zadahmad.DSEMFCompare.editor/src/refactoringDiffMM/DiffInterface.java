/**
 */
package refactoringDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_extends_Left <em>New extends Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_extends_Right <em>New extends Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface()
 * @model
 * @generated
 */
public interface DiffInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see refactoringDiffMM.DiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getChangeStatus <em>Change Status</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_name_Right <em>New name Right</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_extends_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_extends_Left <em>New extends Left</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_extends_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_extends_Right <em>New extends Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New extends Right</em>' attribute.
	 * @see #getNew_extends_Right()
	 * @generated
	 */
	void setNew_extends_Right(String value);

	/**
	 * Returns the value of the '<em><b>Extends Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setExtendsChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_ExtendsChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getExtendsChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_packageName_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Left();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_New_packageName_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName_Right();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New package Name Right</em>' attribute.
	 * @see #getNew_packageName_Right()
	 * @generated
	 */
	void setNew_packageName_Right(String value);

	/**
	 * Returns the value of the '<em><b>Package Name Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #setPackageNameChangeStatus(ChangeStatus)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDiffInterface_PackageNameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getPackageNameChangeStatus();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name Change Status</em>' attribute.
	 * @see refactoringDiffMM.ChangeStatus
	 * @see #getPackageNameChangeStatus()
	 * @generated
	 */
	void setPackageNameChangeStatus(ChangeStatus value);

} // DiffInterface
