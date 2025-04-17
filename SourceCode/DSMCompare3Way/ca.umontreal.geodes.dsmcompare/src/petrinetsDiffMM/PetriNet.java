/**
 */
package petrinetsDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsDiffMM.PetriNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinetsDiffMM.PetriNet#getDiffplaces <em>Diffplaces</em>}</li>
 *   <li>{@link petrinetsDiffMM.PetriNet#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsDiffMM.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getPetriNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsDiffMM.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getPetriNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Diffplaces</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplaces</em>' containment reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getPetriNet_Diffplaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPetriNet_places> getDiffplaces();

	/**
	 * Returns the value of the '<em><b>Difftransitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difftransitions</em>' containment reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getPetriNet_Difftransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPetriNet_transitions> getDifftransitions();

} // PetriNet
