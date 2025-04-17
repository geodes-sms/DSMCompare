/**
 */
package petrinetsDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Petri Net transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_Group <em>Diff Group</em>}</li>
 *   <li>{@link petrinetsDiffMM.DiffPetriNet_transitions#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions()
 * @model
 * @generated
 */
public interface DiffPetriNet_transitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see petrinetsDiffMM.DiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#isFilter <em>Filter</em>}' attribute.
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
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Group</em>' attribute.
	 * @see #setDiff_Group(String)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_Diff_Group()
	 * @model required="true"
	 * @generated
	 */
	String getDiff_Group();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_Group <em>Diff Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Group</em>' attribute.
	 * @see #getDiff_Group()
	 * @generated
	 */
	void setDiff_Group(String value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Transition)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getDiffPetriNet_transitions_EType()
	 * @model required="true"
	 * @generated
	 */
	Transition getEType();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.DiffPetriNet_transitions#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Transition value);

} // DiffPetriNet_transitions
