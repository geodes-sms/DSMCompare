/**
 */
package petrinets2WayRuleMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import petrinets2WayDiffMM.DiffPetriNet;
import petrinets2WayDiffMM.DiffPetriNet_places;
import petrinets2WayDiffMM.DiffPetriNet_transitions;
import petrinets2WayDiffMM.DiffPlace;
import petrinets2WayDiffMM.DiffPlace_transitions;
import petrinets2WayDiffMM.DiffTransition;
import petrinets2WayDiffMM.DiffTransition_places;
import petrinets2WayDiffMM.NamedElement;
import petrinets2WayDiffMM.PetriNet;
import petrinets2WayDiffMM.Place;
import petrinets2WayDiffMM.SemanticConflict;
import petrinets2WayDiffMM.SemanticDiff;
import petrinets2WayDiffMM.SemanticObject;
import petrinets2WayDiffMM.Transition;

import petrinets2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage
 * @generated
 */
public class Petrinets2WayRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Petrinets2WayRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Petrinets2WayRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Petrinets2WayRuleMMPackage.PATTERN_NAMED_ELEMENT: {
				Pattern_NamedElement pattern_NamedElement = (Pattern_NamedElement)theEObject;
				T result = casePattern_NamedElement(pattern_NamedElement);
				if (result == null) result = caseNamedElement(pattern_NamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_PETRI_NET: {
				Pattern_PetriNet pattern_PetriNet = (Pattern_PetriNet)theEObject;
				T result = casePattern_PetriNet(pattern_PetriNet);
				if (result == null) result = casePetriNet(pattern_PetriNet);
				if (result == null) result = caseNamedElement(pattern_PetriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_PLACE: {
				Pattern_Place pattern_Place = (Pattern_Place)theEObject;
				T result = casePattern_Place(pattern_Place);
				if (result == null) result = casePlace(pattern_Place);
				if (result == null) result = caseNamedElement(pattern_Place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_TRANSITION: {
				Pattern_Transition pattern_Transition = (Pattern_Transition)theEObject;
				T result = casePattern_Transition(pattern_Transition);
				if (result == null) result = caseTransition(pattern_Transition);
				if (result == null) result = caseNamedElement(pattern_Transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_SEMANTIC_OBJECT: {
				Pattern_SemanticObject pattern_SemanticObject = (Pattern_SemanticObject)theEObject;
				T result = casePattern_SemanticObject(pattern_SemanticObject);
				if (result == null) result = caseSemanticObject(pattern_SemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: {
				Pattern_SemanticDiff pattern_SemanticDiff = (Pattern_SemanticDiff)theEObject;
				T result = casePattern_SemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticObject(pattern_SemanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: {
				Pattern_SemanticConflict pattern_SemanticConflict = (Pattern_SemanticConflict)theEObject;
				T result = casePattern_SemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticObject(pattern_SemanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET: {
				Pattern_DiffPetriNet pattern_DiffPetriNet = (Pattern_DiffPetriNet)theEObject;
				T result = casePattern_DiffPetriNet(pattern_DiffPetriNet);
				if (result == null) result = caseDiffPetriNet(pattern_DiffPetriNet);
				if (result == null) result = casePetriNet(pattern_DiffPetriNet);
				if (result == null) result = caseNamedElement(pattern_DiffPetriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES: {
				Pattern_DiffPetriNet_places pattern_DiffPetriNet_places = (Pattern_DiffPetriNet_places)theEObject;
				T result = casePattern_DiffPetriNet_places(pattern_DiffPetriNet_places);
				if (result == null) result = caseDiffPetriNet_places(pattern_DiffPetriNet_places);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_TRANSITIONS: {
				Pattern_DiffPetriNet_transitions pattern_DiffPetriNet_transitions = (Pattern_DiffPetriNet_transitions)theEObject;
				T result = casePattern_DiffPetriNet_transitions(pattern_DiffPetriNet_transitions);
				if (result == null) result = caseDiffPetriNet_transitions(pattern_DiffPetriNet_transitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PLACE: {
				Pattern_DiffPlace pattern_DiffPlace = (Pattern_DiffPlace)theEObject;
				T result = casePattern_DiffPlace(pattern_DiffPlace);
				if (result == null) result = caseDiffPlace(pattern_DiffPlace);
				if (result == null) result = casePlace(pattern_DiffPlace);
				if (result == null) result = caseNamedElement(pattern_DiffPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PLACE_TRANSITIONS: {
				Pattern_DiffPlace_transitions pattern_DiffPlace_transitions = (Pattern_DiffPlace_transitions)theEObject;
				T result = casePattern_DiffPlace_transitions(pattern_DiffPlace_transitions);
				if (result == null) result = caseDiffPlace_transitions(pattern_DiffPlace_transitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_TRANSITION: {
				Pattern_DiffTransition pattern_DiffTransition = (Pattern_DiffTransition)theEObject;
				T result = casePattern_DiffTransition(pattern_DiffTransition);
				if (result == null) result = caseDiffTransition(pattern_DiffTransition);
				if (result == null) result = caseTransition(pattern_DiffTransition);
				if (result == null) result = caseNamedElement(pattern_DiffTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES: {
				Pattern_DiffTransition_places pattern_DiffTransition_places = (Pattern_DiffTransition_places)theEObject;
				T result = casePattern_DiffTransition_places(pattern_DiffTransition_places);
				if (result == null) result = caseDiffTransition_places(pattern_DiffTransition_places);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_NamedElement(Pattern_NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_PetriNet(Pattern_PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Place(Pattern_Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Transition(Pattern_Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticObject(Pattern_SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticDiff(Pattern_SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticConflict(Pattern_SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPetriNet(Pattern_DiffPetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net places</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net places</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPetriNet_places(Pattern_DiffPetriNet_places object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Petri Net transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPetriNet_transitions(Pattern_DiffPetriNet_transitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPlace(Pattern_DiffPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Place transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Place transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPlace_transitions(Pattern_DiffPlace_transitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffTransition(Pattern_DiffTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Transition places</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Transition places</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffTransition_places(Pattern_DiffTransition_places object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNet(PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticObject(SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticDiff(SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticConflict(SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPetriNet(DiffPetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Petri Net places</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Petri Net places</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPetriNet_places(DiffPetriNet_places object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Petri Net transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Petri Net transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPetriNet_transitions(DiffPetriNet_transitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPlace(DiffPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Place transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Place transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPlace_transitions(DiffPlace_transitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffTransition(DiffTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Transition places</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Transition places</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffTransition_places(DiffTransition_places object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Petrinets2WayRuleMMSwitch
