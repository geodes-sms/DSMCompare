/**
 */
package pacman;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Ghost#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getGhost()
 * @model
 * @generated
 */
public interface Ghost extends PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link pacman.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see pacman.GhostStrategy
	 * @see #setStrategy(GhostStrategy)
	 * @see pacman.PacmanPackage#getGhost_Strategy()
	 * @model required="true"
	 * @generated
	 */
	GhostStrategy getStrategy();

	/**
	 * Sets the value of the '{@link pacman.Ghost#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see pacman.GhostStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GhostStrategy value);

} // Ghost
