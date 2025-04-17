/**
 */
package petrinets2WayDiffMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import petrinets2WayDiffMM.*;

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
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage
 * @generated
 */
public class Petrinets2WayDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Petrinets2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Petrinets2WayDiffMMPackage.eINSTANCE;
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
			case Petrinets2WayDiffMMPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.PETRI_NET: {
				PetriNet petriNet = (PetriNet)theEObject;
				T result = casePetriNet(petriNet);
				if (result == null) result = caseNamedElement(petriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT: {
				SemanticObject semanticObject = (SemanticObject)theEObject;
				T result = caseSemanticObject(semanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.SEMANTIC_DIFF: {
				SemanticDiff semanticDiff = (SemanticDiff)theEObject;
				T result = caseSemanticDiff(semanticDiff);
				if (result == null) result = caseSemanticObject(semanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT: {
				SemanticConflict semanticConflict = (SemanticConflict)theEObject;
				T result = caseSemanticConflict(semanticConflict);
				if (result == null) result = caseSemanticObject(semanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET: {
				DiffPetriNet diffPetriNet = (DiffPetriNet)theEObject;
				T result = caseDiffPetriNet(diffPetriNet);
				if (result == null) result = casePetriNet(diffPetriNet);
				if (result == null) result = caseNamedElement(diffPetriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES: {
				DiffPetriNet_places diffPetriNet_places = (DiffPetriNet_places)theEObject;
				T result = caseDiffPetriNet_places(diffPetriNet_places);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS: {
				DiffPetriNet_transitions diffPetriNet_transitions = (DiffPetriNet_transitions)theEObject;
				T result = caseDiffPetriNet_transitions(diffPetriNet_transitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_PLACE: {
				DiffPlace diffPlace = (DiffPlace)theEObject;
				T result = caseDiffPlace(diffPlace);
				if (result == null) result = casePlace(diffPlace);
				if (result == null) result = caseNamedElement(diffPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS: {
				DiffPlace_transitions diffPlace_transitions = (DiffPlace_transitions)theEObject;
				T result = caseDiffPlace_transitions(diffPlace_transitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_TRANSITION: {
				DiffTransition diffTransition = (DiffTransition)theEObject;
				T result = caseDiffTransition(diffTransition);
				if (result == null) result = caseTransition(diffTransition);
				if (result == null) result = caseNamedElement(diffTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES: {
				DiffTransition_places diffTransition_places = (DiffTransition_places)theEObject;
				T result = caseDiffTransition_places(diffTransition_places);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //Petrinets2WayDiffMMSwitch
