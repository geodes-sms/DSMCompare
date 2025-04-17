/**
 */
package petrinetsCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_Place#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_Place#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Place()
 * @model
 * @generated
 */
public interface Pattern_Place extends Pattern_NamedElement {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Place_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Place_Transitions()
	 * @model
	 * @generated
	 */
	EList<Pattern_Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Difftransitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difftransitions</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Place_Difftransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffPlace_transitions> getDifftransitions();

} // Pattern_Place
