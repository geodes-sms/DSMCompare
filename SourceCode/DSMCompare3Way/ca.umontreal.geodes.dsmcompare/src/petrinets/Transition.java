/**
 */
package petrinets;

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
 *   <li>{@link petrinets.Transition#getPlaces <em>Places</em>}</li>
 * </ul>
 *
 * @see petrinets.PetrinetsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link petrinets.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see petrinets.PetrinetsPackage#getTransition_Places()
	 * @model
	 * @generated
	 */
	EList<Place> getPlaces();

} // Transition
