/**
 */
package petrinetsCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNameChangeStatus <em>Name Change Status</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet()
 * @model
 * @generated
 */
public interface Pattern_DiffPetriNet extends Pattern_NamedElement {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsCRRuleMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsCRRuleMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsCRRuleMM.DiffKind
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
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isFilter <em>Filter</em>}' attribute.
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
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Left</em>' attribute.
	 * @see #setNew_id_Left(int)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_New_id_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_id_Left();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Left <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Left</em>' attribute.
	 * @see #getNew_id_Left()
	 * @generated
	 */
	void setNew_id_Left(int value);

	/**
	 * Returns the value of the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id Right</em>' attribute.
	 * @see #setNew_id_Right(int)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_New_id_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_id_Right();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Right <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id Right</em>' attribute.
	 * @see #getNew_id_Right()
	 * @generated
	 */
	void setNew_id_Right(int value);

	/**
	 * Returns the value of the '<em><b>Id Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #setIdChangeStatus(ChangeStatus)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_IdChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getIdChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getIdChangeStatus <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #getIdChangeStatus()
	 * @generated
	 */
	void setIdChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name Left</em>' attribute.
	 * @see #setNew_name_Left(String)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_New_name_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Left();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Left <em>New name Left</em>}' attribute.
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
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_New_name_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name_Right();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Right <em>New name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name Right</em>' attribute.
	 * @see #getNew_name_Right()
	 * @generated
	 */
	void setNew_name_Right(String value);

	/**
	 * Returns the value of the '<em><b>Name Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #setNameChangeStatus(ChangeStatus)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_DiffPetriNet_NameChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getNameChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNameChangeStatus <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Change Status</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #getNameChangeStatus()
	 * @generated
	 */
	void setNameChangeStatus(ChangeStatus value);

} // Pattern_DiffPetriNet
