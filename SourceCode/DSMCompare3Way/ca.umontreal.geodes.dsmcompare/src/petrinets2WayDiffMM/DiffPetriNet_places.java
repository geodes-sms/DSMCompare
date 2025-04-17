/**
 */
package petrinets2WayDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Petri Net places</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.DiffPetriNet_places#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.DiffPetriNet_places#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_places()
 * @model
 * @generated
 */
public interface DiffPetriNet_places extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinets2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see petrinets2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_places_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.DiffPetriNet_places#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see petrinets2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Place)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getDiffPetriNet_places_EType()
	 * @model required="true"
	 * @generated
	 */
	Place getEType();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.DiffPetriNet_places#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Place value);

} // DiffPetriNet_places
