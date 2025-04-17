/**
 */
package dssmmDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Leaf Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Left <em>New Factor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Right <em>New Factor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getFactorIDChangeStatus <em>Factor ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Left <em>New GW Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Right <em>New GW Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getGWChangeStatus <em>GW Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Left <em>New LW Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Right <em>New LW Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getLWChangeStatus <em>LW Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Left <em>New Del Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Right <em>New Del Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getDelChangeStatus <em>Del Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Left <em>New Hide On Line Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Right <em>New Hide On Line Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getHideOnLineChangeStatus <em>Hide On Line Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Left <em>New Hierarchy Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Right <em>New Hierarchy Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getHierarchyChangeStatus <em>Hierarchy Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Left <em>New Master Factor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Right <em>New Master Factor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffLeafFactor#getMasterFactorIDChangeStatus <em>Master Factor ID Change Status</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor()
 * @model
 * @generated
 */
public interface DiffLeafFactor extends LeafFactor {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Factor ID Left</em>' attribute.
	 * @see #setNew_FactorID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_FactorID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_FactorID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Left <em>New Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Factor ID Left</em>' attribute.
	 * @see #getNew_FactorID_Left()
	 * @generated
	 */
	void setNew_FactorID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Factor ID Right</em>' attribute.
	 * @see #setNew_FactorID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_FactorID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_FactorID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Right <em>New Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Factor ID Right</em>' attribute.
	 * @see #getNew_FactorID_Right()
	 * @generated
	 */
	void setNew_FactorID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Factor ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setFactorIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_FactorIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getFactorIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getFactorIDChangeStatus <em>Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getFactorIDChangeStatus()
	 * @generated
	 */
	void setFactorIDChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name Left</em>' attribute.
	 * @see #setNew_Name_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Left <em>New Name Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Right <em>New Name Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr Left</em>' attribute.
	 * @see #setNew_Descr_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Descr_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Left <em>New Descr Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Descr_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Right <em>New Descr Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_DescrChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDescrChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getDescrChangeStatus <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDescrChangeStatus()
	 * @generated
	 */
	void setDescrChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New GW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New GW Left</em>' attribute.
	 * @see #setNew_GW_Left(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_GW_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_GW_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Left <em>New GW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New GW Left</em>' attribute.
	 * @see #getNew_GW_Left()
	 * @generated
	 */
	void setNew_GW_Left(float value);

	/**
	 * Returns the value of the '<em><b>New GW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New GW Right</em>' attribute.
	 * @see #setNew_GW_Right(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_GW_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_GW_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Right <em>New GW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New GW Right</em>' attribute.
	 * @see #getNew_GW_Right()
	 * @generated
	 */
	void setNew_GW_Right(float value);

	/**
	 * Returns the value of the '<em><b>GW Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GW Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setGWChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_GWChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getGWChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getGWChangeStatus <em>GW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GW Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getGWChangeStatus()
	 * @generated
	 */
	void setGWChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New LW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New LW Left</em>' attribute.
	 * @see #setNew_LW_Left(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_LW_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_LW_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Left <em>New LW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New LW Left</em>' attribute.
	 * @see #getNew_LW_Left()
	 * @generated
	 */
	void setNew_LW_Left(float value);

	/**
	 * Returns the value of the '<em><b>New LW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New LW Right</em>' attribute.
	 * @see #setNew_LW_Right(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_LW_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_LW_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Right <em>New LW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New LW Right</em>' attribute.
	 * @see #getNew_LW_Right()
	 * @generated
	 */
	void setNew_LW_Right(float value);

	/**
	 * Returns the value of the '<em><b>LW Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LW Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setLWChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_LWChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getLWChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getLWChangeStatus <em>LW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LW Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getLWChangeStatus()
	 * @generated
	 */
	void setLWChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Del Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Del Left</em>' attribute.
	 * @see #setNew_Del_Left(Boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Del_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getNew_Del_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Left <em>New Del Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Del Left</em>' attribute.
	 * @see #getNew_Del_Left()
	 * @generated
	 */
	void setNew_Del_Left(Boolean value);

	/**
	 * Returns the value of the '<em><b>New Del Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Del Right</em>' attribute.
	 * @see #setNew_Del_Right(Boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Del_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getNew_Del_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Right <em>New Del Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Del Right</em>' attribute.
	 * @see #getNew_Del_Right()
	 * @generated
	 */
	void setNew_Del_Right(Boolean value);

	/**
	 * Returns the value of the '<em><b>Del Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setDelChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_DelChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDelChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getDelChangeStatus <em>Del Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Del Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDelChangeStatus()
	 * @generated
	 */
	void setDelChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Hide On Line Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hide On Line Left</em>' attribute.
	 * @see #setNew_HideOnLine_Left(boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_HideOnLine_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_HideOnLine_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Left <em>New Hide On Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hide On Line Left</em>' attribute.
	 * @see #isNew_HideOnLine_Left()
	 * @generated
	 */
	void setNew_HideOnLine_Left(boolean value);

	/**
	 * Returns the value of the '<em><b>New Hide On Line Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hide On Line Right</em>' attribute.
	 * @see #setNew_HideOnLine_Right(boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_HideOnLine_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_HideOnLine_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Right <em>New Hide On Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hide On Line Right</em>' attribute.
	 * @see #isNew_HideOnLine_Right()
	 * @generated
	 */
	void setNew_HideOnLine_Right(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide On Line Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide On Line Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setHideOnLineChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_HideOnLineChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getHideOnLineChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getHideOnLineChangeStatus <em>Hide On Line Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide On Line Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getHideOnLineChangeStatus()
	 * @generated
	 */
	void setHideOnLineChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Hierarchy Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hierarchy Left</em>' attribute.
	 * @see #setNew_Hierarchy_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Hierarchy_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Hierarchy_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Left <em>New Hierarchy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hierarchy Left</em>' attribute.
	 * @see #getNew_Hierarchy_Left()
	 * @generated
	 */
	void setNew_Hierarchy_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Hierarchy Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hierarchy Right</em>' attribute.
	 * @see #setNew_Hierarchy_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_Hierarchy_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Hierarchy_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Right <em>New Hierarchy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hierarchy Right</em>' attribute.
	 * @see #getNew_Hierarchy_Right()
	 * @generated
	 */
	void setNew_Hierarchy_Right(String value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setHierarchyChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_HierarchyChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getHierarchyChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getHierarchyChangeStatus <em>Hierarchy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getHierarchyChangeStatus()
	 * @generated
	 */
	void setHierarchyChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Master Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Master Factor ID Left</em>' attribute.
	 * @see #setNew_MasterFactorID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_MasterFactorID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MasterFactorID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Left <em>New Master Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Master Factor ID Left</em>' attribute.
	 * @see #getNew_MasterFactorID_Left()
	 * @generated
	 */
	void setNew_MasterFactorID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Master Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Master Factor ID Right</em>' attribute.
	 * @see #setNew_MasterFactorID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_New_MasterFactorID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MasterFactorID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Right <em>New Master Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Master Factor ID Right</em>' attribute.
	 * @see #getNew_MasterFactorID_Right()
	 * @generated
	 */
	void setNew_MasterFactorID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Master Factor ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Factor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setMasterFactorIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffLeafFactor_MasterFactorIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getMasterFactorIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffLeafFactor#getMasterFactorIDChangeStatus <em>Master Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Factor ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getMasterFactorIDChangeStatus()
	 * @generated
	 */
	void setMasterFactorIDChangeStatus(ChangeStatus value);

} // DiffLeafFactor
