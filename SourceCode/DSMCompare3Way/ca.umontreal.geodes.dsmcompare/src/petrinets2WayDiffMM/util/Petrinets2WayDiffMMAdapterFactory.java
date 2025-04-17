/**
 */
package petrinets2WayDiffMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import petrinets2WayDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage
 * @generated
 */
public class Petrinets2WayDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Petrinets2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Petrinets2WayDiffMMPackage.eINSTANCE;
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
	protected Petrinets2WayDiffMMSwitch<Adapter> modelSwitch =
		new Petrinets2WayDiffMMSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePetriNet(PetriNet object) {
				return createPetriNetAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseSemanticObject(SemanticObject object) {
				return createSemanticObjectAdapter();
			}
			@Override
			public Adapter caseSemanticDiff(SemanticDiff object) {
				return createSemanticDiffAdapter();
			}
			@Override
			public Adapter caseSemanticConflict(SemanticConflict object) {
				return createSemanticConflictAdapter();
			}
			@Override
			public Adapter caseDiffPetriNet(DiffPetriNet object) {
				return createDiffPetriNetAdapter();
			}
			@Override
			public Adapter caseDiffPetriNet_places(DiffPetriNet_places object) {
				return createDiffPetriNet_placesAdapter();
			}
			@Override
			public Adapter caseDiffPetriNet_transitions(DiffPetriNet_transitions object) {
				return createDiffPetriNet_transitionsAdapter();
			}
			@Override
			public Adapter caseDiffPlace(DiffPlace object) {
				return createDiffPlaceAdapter();
			}
			@Override
			public Adapter caseDiffPlace_transitions(DiffPlace_transitions object) {
				return createDiffPlace_transitionsAdapter();
			}
			@Override
			public Adapter caseDiffTransition(DiffTransition object) {
				return createDiffTransitionAdapter();
			}
			@Override
			public Adapter caseDiffTransition_places(DiffTransition_places object) {
				return createDiffTransition_placesAdapter();
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
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.PetriNet
	 * @generated
	 */
	public Adapter createPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.SemanticObject
	 * @generated
	 */
	public Adapter createSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.SemanticDiff
	 * @generated
	 */
	public Adapter createSemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.SemanticConflict
	 * @generated
	 */
	public Adapter createSemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffPetriNet <em>Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffPetriNet
	 * @generated
	 */
	public Adapter createDiffPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffPetriNet_places <em>Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffPetriNet_places
	 * @generated
	 */
	public Adapter createDiffPetriNet_placesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffPetriNet_transitions <em>Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffPetriNet_transitions
	 * @generated
	 */
	public Adapter createDiffPetriNet_transitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffPlace <em>Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffPlace
	 * @generated
	 */
	public Adapter createDiffPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffPlace_transitions <em>Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffPlace_transitions
	 * @generated
	 */
	public Adapter createDiffPlace_transitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffTransition <em>Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffTransition
	 * @generated
	 */
	public Adapter createDiffTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinets2WayDiffMM.DiffTransition_places <em>Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinets2WayDiffMM.DiffTransition_places
	 * @generated
	 */
	public Adapter createDiffTransition_placesAdapter() {
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

} //Petrinets2WayDiffMMAdapterFactory
