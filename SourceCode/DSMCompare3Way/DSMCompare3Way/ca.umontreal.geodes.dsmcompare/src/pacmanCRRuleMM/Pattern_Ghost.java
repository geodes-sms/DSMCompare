/**
 */
package pacmanCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_Ghost#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Ghost()
 * @model
 * @generated
 */
public interface Pattern_Ghost extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.GhostStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #setStrategy(GhostStrategy)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Ghost_Strategy()
	 * @model required="true"
	 * @generated
	 */
	GhostStrategy getStrategy();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Ghost#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see pacmanCRRuleMM.GhostStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GhostStrategy value);

} // Pattern_Ghost
