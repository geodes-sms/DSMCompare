/**
 */
package pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Pacman#getInitialPosition <em>Initial Position</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getPacman()
 * @model
 * @generated
 */
public interface Pacman extends PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Position</em>' attribute.
	 * @see #setInitialPosition(String)
	 * @see pacman.PacmanPackage#getPacman_InitialPosition()
	 * @model
	 * @generated
	 */
	String getInitialPosition();

	/**
	 * Sets the value of the '{@link pacman.Pacman#getInitialPosition <em>Initial Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Position</em>' attribute.
	 * @see #getInitialPosition()
	 * @generated
	 */
	void setInitialPosition(String value);

} // Pacman
