/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.Ghost#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGhost()
 * @model
 * @generated
 */
public interface Ghost extends PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @see #setStrategy(GhostStrategy)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGhost_Strategy()
	 * @model required="true"
	 * @generated
	 */
	GhostStrategy getStrategy();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.Ghost#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see pacman2WayDiffMM.GhostStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GhostStrategy value);

} // Ghost
