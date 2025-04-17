/**
 */
package petrinets2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.DiffPetriNet#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.DiffPetriNet#getNew_id <em>New id</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.DiffPetriNet#getNew_name <em>New name</em>}</li>
 * </ul>
 *
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet()
 * @model
 * @generated
 */
public interface DiffPetriNet extends PetriNet {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinets2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see petrinets2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.DiffPetriNet#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see petrinets2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(int)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_New_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_id();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.DiffPetriNet#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(int value);

	/**
	 * Returns the value of the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name</em>' attribute.
	 * @see #setNew_name(String)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_New_name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.DiffPetriNet#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

} // DiffPetriNet
