/**
 */
package petrinetsCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet <em>Rule Pattern Pattern Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_places <em>Rule Pattern Pattern Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_transitions <em>Rule Pattern Pattern Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace <em>Rule Pattern Pattern Diff Place</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace_transitions <em>Rule Pattern Pattern Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition <em>Rule Pattern Pattern Diff Transition</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition_places <em>Rule Pattern Pattern Diff Transition places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_NamedElement <em>Rule Pattern Pattern Named Element</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Semantic Object</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Petri Net</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Petri Net</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPetriNet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet> getRulePattern_Pattern_DiffPetriNet();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Petri Net places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Petri Net places</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPetriNet_places()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_places> getRulePattern_Pattern_DiffPetriNet_places();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Petri Net transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Petri Net transitions</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPetriNet_transitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_transitions> getRulePattern_Pattern_DiffPetriNet_transitions();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Place</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Place</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPlace()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPlace> getRulePattern_Pattern_DiffPlace();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Place transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Place transitions</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffPlace_transitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPlace_transitions> getRulePattern_Pattern_DiffPlace_transitions();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Transition</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Transition</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffTransition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffTransition> getRulePattern_Pattern_DiffTransition();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Transition places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Transition places</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_DiffTransition_places()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffTransition_places> getRulePattern_Pattern_DiffTransition_places();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Named Element</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Named Element</em>' containment reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getRule_RulePattern_Pattern_NamedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_NamedElement> getRulePattern_Pattern_NamedElement();

} // Rule
