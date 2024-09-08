/**
 */
package pacman;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Energizer#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getEnergizer()
 * @model
 * @generated
 */
public interface Energizer extends Food {
	/**
	 * Returns the value of the '<em><b>Durations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations</em>' attribute list.
	 * @see pacman.PacmanPackage#getEnergizer_Durations()
	 * @model
	 * @generated
	 */
	EList<Integer> getDurations();

} // Energizer
