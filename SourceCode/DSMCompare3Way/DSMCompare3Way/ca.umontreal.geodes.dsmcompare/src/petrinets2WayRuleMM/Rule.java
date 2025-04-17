/**
 */
package petrinets2WayRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinets2WayDiffMM.DiffPetriNet;
import petrinets2WayDiffMM.DiffPetriNet_places;
import petrinets2WayDiffMM.DiffPetriNet_transitions;
import petrinets2WayDiffMM.DiffPlace;
import petrinets2WayDiffMM.DiffPlace_transitions;
import petrinets2WayDiffMM.DiffTransition;
import petrinets2WayDiffMM.DiffTransition_places;
import petrinets2WayDiffMM.NamedElement;
import petrinets2WayDiffMM.SemanticObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet <em>Rule Pattern Diff Petri Net</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_places <em>Rule Pattern Diff Petri Net places</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_transitions <em>Rule Pattern Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace <em>Rule Pattern Diff Place</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace_transitions <em>Rule Pattern Diff Place transitions</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition <em>Rule Pattern Diff Transition</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition_places <em>Rule Pattern Diff Transition places</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_NamedElement <em>Rule Pattern Named Element</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 * </ul>
 *
 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule()
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
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinets2WayRuleMM.Rule#getName <em>Name</em>}' attribute.
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
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_Constraints()
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
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link petrinets2WayRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Petri Net</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPetriNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Petri Net</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffPetriNet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet> getRulePattern_DiffPetriNet();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Petri Net places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Petri Net places</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffPetriNet_places()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet_places> getRulePattern_DiffPetriNet_places();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Petri Net transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Petri Net transitions</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffPetriNet_transitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet_transitions> getRulePattern_DiffPetriNet_transitions();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Place</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Place</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffPlace()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPlace> getRulePattern_DiffPlace();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Place transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Place transitions</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffPlace_transitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffPlace_transitions> getRulePattern_DiffPlace_transitions();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Transition</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Transition</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffTransition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffTransition> getRulePattern_DiffTransition();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Transition places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Transition places</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_DiffTransition_places()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffTransition_places> getRulePattern_DiffTransition_places();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Named Element</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Named Element</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_NamedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getRulePattern_NamedElement();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Semantic Object</em>' containment reference list.
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getRule_RulePattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SemanticObject> getRulePattern_SemanticObject();

} // Rule
