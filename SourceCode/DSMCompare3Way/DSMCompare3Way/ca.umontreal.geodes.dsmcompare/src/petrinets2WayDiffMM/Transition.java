/**
 */
package petrinets2WayDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.Transition#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.Transition#getDiffplaces <em>Diffplaces</em>}</li>
 * </ul>
 *
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getTransition_Places()
	 * @model
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Diffplaces</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplaces</em>' containment reference list.
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getTransition_Diffplaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffTransition_places> getDiffplaces();

} // Transition
