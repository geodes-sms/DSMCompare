/**
 */
package dssmmDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Vendor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffVendor#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Left <em>New Vendor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Right <em>New Vendor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getVendorIDChangeStatus <em>Vendor ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_Description_Left <em>New Description Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getNew_Description_Right <em>New Description Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffVendor#getDescriptionChangeStatus <em>Description Change Status</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor()
 * @model
 * @generated
 */
public interface DiffVendor extends Vendor {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Vendor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Vendor ID Left</em>' attribute.
	 * @see #setNew_VendorID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_VendorID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_VendorID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Left <em>New Vendor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Vendor ID Left</em>' attribute.
	 * @see #getNew_VendorID_Left()
	 * @generated
	 */
	void setNew_VendorID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Vendor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Vendor ID Right</em>' attribute.
	 * @see #setNew_VendorID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_VendorID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_VendorID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Right <em>New Vendor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Vendor ID Right</em>' attribute.
	 * @see #getNew_VendorID_Right()
	 * @generated
	 */
	void setNew_VendorID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Vendor ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setVendorIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_VendorIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getVendorIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getVendorIDChangeStatus <em>Vendor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getVendorIDChangeStatus()
	 * @generated
	 */
	void setVendorIDChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name Left</em>' attribute.
	 * @see #setNew_Name_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_Name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_Name_Left <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name Left</em>' attribute.
	 * @see #getNew_Name_Left()
	 * @generated
	 */
	void setNew_Name_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name Right</em>' attribute.
	 * @see #setNew_Name_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_Name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_Name_Right <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name Right</em>' attribute.
	 * @see #getNew_Name_Right()
	 * @generated
	 */
	void setNew_Name_Right(String value);

	/**
	 * Returns the value of the '<em><b>Name Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setNameChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Description Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Description Left</em>' attribute.
	 * @see #setNew_Description_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_Description_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Description_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_Description_Left <em>New Description Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Description Left</em>' attribute.
	 * @see #getNew_Description_Left()
	 * @generated
	 */
	void setNew_Description_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Description Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Description Right</em>' attribute.
	 * @see #setNew_Description_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_New_Description_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Description_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getNew_Description_Right <em>New Description Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Description Right</em>' attribute.
	 * @see #getNew_Description_Right()
	 * @generated
	 */
	void setNew_Description_Right(String value);

	/**
	 * Returns the value of the '<em><b>Description Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setDescriptionChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffVendor_DescriptionChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDescriptionChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffVendor#getDescriptionChangeStatus <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 */
	void setDescriptionChangeStatus(ChangeStatus value);

} // DiffVendor
