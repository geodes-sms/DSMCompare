/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Pacman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_Pacman#getInitialPosition <em>Initial Position</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Pacman()
 * @model
 * @generated
 */
public interface Pattern_Pacman extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Initial Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Position</em>' attribute.
	 * @see #setInitialPosition(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Pacman_InitialPosition()
	 * @model
	 * @generated
	 */
	String getInitialPosition();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Pacman#getInitialPosition <em>Initial Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Position</em>' attribute.
	 * @see #getInitialPosition()
	 * @generated
	 */
	void setInitialPosition(String value);

} // Pattern_Pacman
