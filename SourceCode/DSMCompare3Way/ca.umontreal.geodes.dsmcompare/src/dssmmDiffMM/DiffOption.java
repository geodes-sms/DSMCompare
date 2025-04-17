/**
 */
package dssmmDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffOption#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_OptionID_Left <em>New Option ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_OptionID_Right <em>New Option ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getOptionIDChangeStatus <em>Option ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Sort_Left <em>New Sort Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Sort_Right <em>New Sort Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getSortChangeStatus <em>Sort Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Cost_Left <em>New Cost Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Cost_Right <em>New Cost Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getCostChangeStatus <em>Cost Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Left <em>New Num Other Costs Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Right <em>New Num Other Costs Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNumOtherCostsChangeStatus <em>Num Other Costs Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Description_Left <em>New Description Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getNew_Description_Right <em>New Description Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffOption#getDescriptionChangeStatus <em>Description Change Status</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption()
 * @model
 * @generated
 */
public interface DiffOption extends Option {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Option ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Option ID Left</em>' attribute.
	 * @see #setNew_OptionID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_OptionID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_OptionID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_OptionID_Left <em>New Option ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Option ID Left</em>' attribute.
	 * @see #getNew_OptionID_Left()
	 * @generated
	 */
	void setNew_OptionID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Option ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Option ID Right</em>' attribute.
	 * @see #setNew_OptionID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_OptionID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_OptionID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_OptionID_Right <em>New Option ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Option ID Right</em>' attribute.
	 * @see #getNew_OptionID_Right()
	 * @generated
	 */
	void setNew_OptionID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Option ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setOptionIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_OptionIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getOptionIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getOptionIDChangeStatus <em>Option ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getOptionIDChangeStatus()
	 * @generated
	 */
	void setOptionIDChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name Left</em>' attribute.
	 * @see #setNew_Name_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Name_Left <em>New Name Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Name_Right <em>New Name Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Sort Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Sort Left</em>' attribute.
	 * @see #setNew_Sort_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Sort_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_Sort_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Sort_Left <em>New Sort Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Sort Left</em>' attribute.
	 * @see #getNew_Sort_Left()
	 * @generated
	 */
	void setNew_Sort_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Sort Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Sort Right</em>' attribute.
	 * @see #setNew_Sort_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Sort_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_Sort_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Sort_Right <em>New Sort Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Sort Right</em>' attribute.
	 * @see #getNew_Sort_Right()
	 * @generated
	 */
	void setNew_Sort_Right(int value);

	/**
	 * Returns the value of the '<em><b>Sort Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setSortChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_SortChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getSortChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getSortChangeStatus <em>Sort Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getSortChangeStatus()
	 * @generated
	 */
	void setSortChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Cost Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Cost Left</em>' attribute.
	 * @see #setNew_Cost_Left(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Cost_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_Cost_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Cost_Left <em>New Cost Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Cost Left</em>' attribute.
	 * @see #getNew_Cost_Left()
	 * @generated
	 */
	void setNew_Cost_Left(float value);

	/**
	 * Returns the value of the '<em><b>New Cost Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Cost Right</em>' attribute.
	 * @see #setNew_Cost_Right(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Cost_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_Cost_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Cost_Right <em>New Cost Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Cost Right</em>' attribute.
	 * @see #getNew_Cost_Right()
	 * @generated
	 */
	void setNew_Cost_Right(float value);

	/**
	 * Returns the value of the '<em><b>Cost Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setCostChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_CostChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getCostChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getCostChangeStatus <em>Cost Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getCostChangeStatus()
	 * @generated
	 */
	void setCostChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Num Other Costs Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Other Costs Left</em>' attribute.
	 * @see #setNew_NumOtherCosts_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_NumOtherCosts_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_NumOtherCosts_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Left <em>New Num Other Costs Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Other Costs Left</em>' attribute.
	 * @see #getNew_NumOtherCosts_Left()
	 * @generated
	 */
	void setNew_NumOtherCosts_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Num Other Costs Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Other Costs Right</em>' attribute.
	 * @see #setNew_NumOtherCosts_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_NumOtherCosts_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_NumOtherCosts_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Right <em>New Num Other Costs Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Other Costs Right</em>' attribute.
	 * @see #getNew_NumOtherCosts_Right()
	 * @generated
	 */
	void setNew_NumOtherCosts_Right(int value);

	/**
	 * Returns the value of the '<em><b>Num Other Costs Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Other Costs Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setNumOtherCostsChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_NumOtherCostsChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNumOtherCostsChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNumOtherCostsChangeStatus <em>Num Other Costs Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Other Costs Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNumOtherCostsChangeStatus()
	 * @generated
	 */
	void setNumOtherCostsChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Description Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Description Left</em>' attribute.
	 * @see #setNew_Description_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Description_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Description_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Description_Left <em>New Description Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_New_Description_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Description_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getNew_Description_Right <em>New Description Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffOption_DescriptionChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDescriptionChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffOption#getDescriptionChangeStatus <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 */
	void setDescriptionChangeStatus(ChangeStatus value);

} // DiffOption
