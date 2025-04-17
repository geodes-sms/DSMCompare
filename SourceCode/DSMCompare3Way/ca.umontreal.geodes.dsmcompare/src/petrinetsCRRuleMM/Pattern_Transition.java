/**
 */
package petrinetsCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_Transition#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_Transition#getDiffplaces <em>Diffplaces</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Transition()
 * @model
 * @generated
 */
public interface Pattern_Transition extends Pattern_NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Transition_Places()
	 * @model
	 * @generated
	 */
	EList<Pattern_Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Diffplaces</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplaces</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_Transition_Diffplaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffTransition_places> getDiffplaces();

} // Pattern_Transition
