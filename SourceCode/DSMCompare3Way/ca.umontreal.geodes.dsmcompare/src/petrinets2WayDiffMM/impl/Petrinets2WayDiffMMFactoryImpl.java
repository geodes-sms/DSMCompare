/**
 */
package petrinets2WayDiffMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinets2WayDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinets2WayDiffMMFactoryImpl extends EFactoryImpl implements Petrinets2WayDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinets2WayDiffMMFactory init() {
		try {
			Petrinets2WayDiffMMFactory thePetrinets2WayDiffMMFactory = (Petrinets2WayDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(Petrinets2WayDiffMMPackage.eNS_URI);
			if (thePetrinets2WayDiffMMFactory != null) {
				return thePetrinets2WayDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinets2WayDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayDiffMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Petrinets2WayDiffMMPackage.PETRI_NET: return createPetriNet();
			case Petrinets2WayDiffMMPackage.PLACE: return createPlace();
			case Petrinets2WayDiffMMPackage.TRANSITION: return createTransition();
			case Petrinets2WayDiffMMPackage.SEMANTIC_DIFF: return createSemanticDiff();
			case Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET: return createDiffPetriNet();
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES: return createDiffPetriNet_places();
			case Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS: return createDiffPetriNet_transitions();
			case Petrinets2WayDiffMMPackage.DIFF_PLACE: return createDiffPlace();
			case Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS: return createDiffPlace_transitions();
			case Petrinets2WayDiffMMPackage.DIFF_TRANSITION: return createDiffTransition();
			case Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES: return createDiffTransition_places();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Petrinets2WayDiffMMPackage.DIFF_KIND:
				return createDiffKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Petrinets2WayDiffMMPackage.DIFF_KIND:
				return convertDiffKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticDiff createSemanticDiff() {
		SemanticDiffImpl semanticDiff = new SemanticDiffImpl();
		return semanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticConflict createSemanticConflict() {
		SemanticConflictImpl semanticConflict = new SemanticConflictImpl();
		return semanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPetriNet createDiffPetriNet() {
		DiffPetriNetImpl diffPetriNet = new DiffPetriNetImpl();
		return diffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPetriNet_places createDiffPetriNet_places() {
		DiffPetriNet_placesImpl diffPetriNet_places = new DiffPetriNet_placesImpl();
		return diffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPetriNet_transitions createDiffPetriNet_transitions() {
		DiffPetriNet_transitionsImpl diffPetriNet_transitions = new DiffPetriNet_transitionsImpl();
		return diffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPlace createDiffPlace() {
		DiffPlaceImpl diffPlace = new DiffPlaceImpl();
		return diffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPlace_transitions createDiffPlace_transitions() {
		DiffPlace_transitionsImpl diffPlace_transitions = new DiffPlace_transitionsImpl();
		return diffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffTransition createDiffTransition() {
		DiffTransitionImpl diffTransition = new DiffTransitionImpl();
		return diffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffTransition_places createDiffTransition_places() {
		DiffTransition_placesImpl diffTransition_places = new DiffTransition_placesImpl();
		return diffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind createDiffKindFromString(EDataType eDataType, String initialValue) {
		DiffKind result = DiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayDiffMMPackage getPetrinets2WayDiffMMPackage() {
		return (Petrinets2WayDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinets2WayDiffMMPackage getPackage() {
		return Petrinets2WayDiffMMPackage.eINSTANCE;
	}

} //Petrinets2WayDiffMMFactoryImpl
