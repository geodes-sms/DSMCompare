/**
 */
package petrinetsCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_PetriNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_PetriNet#getDiffplaces <em>Diffplaces</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_PetriNet#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_PetriNet()
 * @model
 * @generated
 */
public interface Pattern_PetriNet extends Pattern_NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_PetriNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_PetriNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Diffplaces</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffplaces</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_PetriNet_Diffplaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_places> getDiffplaces();

	/**
	 * Returns the value of the '<em><b>Difftransitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difftransitions</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_PetriNet_Difftransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_transitions> getDifftransitions();

} // Pattern_PetriNet
