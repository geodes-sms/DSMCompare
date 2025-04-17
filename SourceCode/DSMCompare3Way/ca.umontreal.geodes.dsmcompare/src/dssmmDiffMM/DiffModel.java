/**
 */
package dssmmDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffModel#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_ModelID_Left <em>New Model ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_ModelID_Right <em>New Model ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getModelIDChangeStatus <em>Model ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Goal_Left <em>New Goal Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Goal_Right <em>New Goal Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getGoalChangeStatus <em>Goal Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Left <em>New Num Facts Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Right <em>New Num Facts Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffModel#getNumFactsChangeStatus <em>Num Facts Change Status</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel()
 * @model
 * @generated
 */
public interface DiffModel extends Model {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see #setDiff_kind_Left(ClassDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Model ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Model ID Left</em>' attribute.
	 * @see #setNew_ModelID_Left(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_ModelID_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_ModelID_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_ModelID_Left <em>New Model ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Model ID Left</em>' attribute.
	 * @see #getNew_ModelID_Left()
	 * @generated
	 */
	void setNew_ModelID_Left(int value);

	/**
	 * Returns the value of the '<em><b>New Model ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Model ID Right</em>' attribute.
	 * @see #setNew_ModelID_Right(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_ModelID_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_ModelID_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_ModelID_Right <em>New Model ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Model ID Right</em>' attribute.
	 * @see #getNew_ModelID_Right()
	 * @generated
	 */
	void setNew_ModelID_Right(int value);

	/**
	 * Returns the value of the '<em><b>Model ID Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setModelIDChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_ModelIDChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getModelIDChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getModelIDChangeStatus <em>Model ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model ID Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getModelIDChangeStatus()
	 * @generated
	 */
	void setModelIDChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name Left</em>' attribute.
	 * @see #setNew_Name_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Name_Left <em>New Name Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Name_Right <em>New Name Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_NameChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Goal Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Goal Left</em>' attribute.
	 * @see #setNew_Goal_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Goal_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Goal_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Goal_Left <em>New Goal Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Goal Left</em>' attribute.
	 * @see #getNew_Goal_Left()
	 * @generated
	 */
	void setNew_Goal_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Goal Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Goal Right</em>' attribute.
	 * @see #setNew_Goal_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Goal_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Goal_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Goal_Right <em>New Goal Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Goal Right</em>' attribute.
	 * @see #getNew_Goal_Right()
	 * @generated
	 */
	void setNew_Goal_Right(String value);

	/**
	 * Returns the value of the '<em><b>Goal Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setGoalChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_GoalChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getGoalChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getGoalChangeStatus <em>Goal Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getGoalChangeStatus()
	 * @generated
	 */
	void setGoalChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr Left</em>' attribute.
	 * @see #setNew_Descr_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Descr_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Descr_Left <em>New Descr Left</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_Descr_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_Descr_Right <em>New Descr Right</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_DescrChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getDescrChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getDescrChangeStatus <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getDescrChangeStatus()
	 * @generated
	 */
	void setDescrChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New Num Facts Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Facts Left</em>' attribute.
	 * @see #setNew_NumFacts_Left(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_NumFacts_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_NumFacts_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Left <em>New Num Facts Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Facts Left</em>' attribute.
	 * @see #getNew_NumFacts_Left()
	 * @generated
	 */
	void setNew_NumFacts_Left(String value);

	/**
	 * Returns the value of the '<em><b>New Num Facts Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Facts Right</em>' attribute.
	 * @see #setNew_NumFacts_Right(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_New_NumFacts_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_NumFacts_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Right <em>New Num Facts Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Facts Right</em>' attribute.
	 * @see #getNew_NumFacts_Right()
	 * @generated
	 */
	void setNew_NumFacts_Right(String value);

	/**
	 * Returns the value of the '<em><b>Num Facts Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Facts Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setNumFactsChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffModel_NumFactsChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNumFactsChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffModel#getNumFactsChangeStatus <em>Num Facts Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Facts Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getNumFactsChangeStatus()
	 * @generated
	 */
	void setNumFactsChangeStatus(ChangeStatus value);

} // DiffModel
