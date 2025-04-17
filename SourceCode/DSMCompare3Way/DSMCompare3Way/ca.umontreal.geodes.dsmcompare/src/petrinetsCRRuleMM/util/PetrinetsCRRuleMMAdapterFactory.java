/**
 */
package petrinetsCRRuleMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import petrinetsCRRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage
 * @generated
 */
public class PetrinetsCRRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetrinetsCRRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetsCRRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PetrinetsCRRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetsCRRuleMMSwitch<Adapter> modelSwitch =
		new PetrinetsCRRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_ConflictResolution(Pattern_ConflictResolution object) {
				return createPattern_ConflictResolutionAdapter();
			}
			@Override
			public Adapter casePattern_DiffPetriNet(Pattern_DiffPetriNet object) {
				return createPattern_DiffPetriNetAdapter();
			}
			@Override
			public Adapter casePattern_DiffPetriNet_places(Pattern_DiffPetriNet_places object) {
				return createPattern_DiffPetriNet_placesAdapter();
			}
			@Override
			public Adapter casePattern_DiffPetriNet_transitions(Pattern_DiffPetriNet_transitions object) {
				return createPattern_DiffPetriNet_transitionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffPlace(Pattern_DiffPlace object) {
				return createPattern_DiffPlaceAdapter();
			}
			@Override
			public Adapter casePattern_DiffPlace_transitions(Pattern_DiffPlace_transitions object) {
				return createPattern_DiffPlace_transitionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffTransition(Pattern_DiffTransition object) {
				return createPattern_DiffTransitionAdapter();
			}
			@Override
			public Adapter casePattern_DiffTransition_places(Pattern_DiffTransition_places object) {
				return createPattern_DiffTransition_placesAdapter();
			}
			@Override
			public Adapter casePattern_NamedElement(Pattern_NamedElement object) {
				return createPattern_NamedElementAdapter();
			}
			@Override
			public Adapter casePattern_PetriNet(Pattern_PetriNet object) {
				return createPattern_PetriNetAdapter();
			}
			@Override
			public Adapter casePattern_Place(Pattern_Place object) {
				return createPattern_PlaceAdapter();
			}
			@Override
			public Adapter casePattern_SemanticConflict(Pattern_SemanticConflict object) {
				return createPattern_SemanticConflictAdapter();
			}
			@Override
			public Adapter casePattern_SemanticDiff(Pattern_SemanticDiff object) {
				return createPattern_SemanticDiffAdapter();
			}
			@Override
			public Adapter casePattern_SemanticObject(Pattern_SemanticObject object) {
				return createPattern_SemanticObjectAdapter();
			}
			@Override
			public Adapter casePattern_Transition(Pattern_Transition object) {
				return createPattern_TransitionAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	public Adapter createPattern_ConflictResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet <em>Pattern Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet
	 * @generated
	 */
	public Adapter createPattern_DiffPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places <em>Pattern Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places
	 * @generated
	 */
	public Adapter createPattern_DiffPetriNet_placesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions <em>Pattern Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions
	 * @generated
	 */
	public Adapter createPattern_DiffPetriNet_transitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffPlace <em>Pattern Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace
	 * @generated
	 */
	public Adapter createPattern_DiffPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions <em>Pattern Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions
	 * @generated
	 */
	public Adapter createPattern_DiffPlace_transitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffTransition <em>Pattern Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition
	 * @generated
	 */
	public Adapter createPattern_DiffTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places <em>Pattern Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places
	 * @generated
	 */
	public Adapter createPattern_DiffTransition_placesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_NamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement
	 * @generated
	 */
	public Adapter createPattern_NamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_PetriNet <em>Pattern Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet
	 * @generated
	 */
	public Adapter createPattern_PetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_Place <em>Pattern Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_Place
	 * @generated
	 */
	public Adapter createPattern_PlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	public Adapter createPattern_SemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	public Adapter createPattern_SemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	public Adapter createPattern_SemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Pattern_Transition <em>Pattern Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Pattern_Transition
	 * @generated
	 */
	public Adapter createPattern_TransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetsCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetsCRRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PetrinetsCRRuleMMAdapterFactory
