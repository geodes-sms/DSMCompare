/**
 */
package petrinetsDiffMM;

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
 *   <li>{@link petrinetsDiffMM.Transition#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsDiffMM.Transition#getDiffplaces <em>Diffplaces</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getTransition_Places()
	 * @model
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Diffplaces</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplaces</em>' containment reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getTransition_Diffplaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffTransition_places> getDiffplaces();

} // Transition
