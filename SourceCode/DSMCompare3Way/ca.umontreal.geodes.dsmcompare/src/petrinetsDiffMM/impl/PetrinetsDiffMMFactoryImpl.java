/**
 */
package petrinetsDiffMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetsDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetsDiffMMFactoryImpl extends EFactoryImpl implements PetrinetsDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetsDiffMMFactory init() {
		try {
			PetrinetsDiffMMFactory thePetrinetsDiffMMFactory = (PetrinetsDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetsDiffMMPackage.eNS_URI);
			if (thePetrinetsDiffMMFactory != null) {
				return thePetrinetsDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetsDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetsDiffMMFactoryImpl() {
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
			case PetrinetsDiffMMPackage.CONFLICT_RESOLUTION: return createConflictResolution();
			case PetrinetsDiffMMPackage.DIFF_PETRI_NET: return createDiffPetriNet();
			case PetrinetsDiffMMPackage.DIFF_PETRI_NET_PLACES: return createDiffPetriNet_places();
			case PetrinetsDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS: return createDiffPetriNet_transitions();
			case PetrinetsDiffMMPackage.DIFF_PLACE: return createDiffPlace();
			case PetrinetsDiffMMPackage.DIFF_PLACE_TRANSITIONS: return createDiffPlace_transitions();
			case PetrinetsDiffMMPackage.DIFF_TRANSITION: return createDiffTransition();
			case PetrinetsDiffMMPackage.DIFF_TRANSITION_PLACES: return createDiffTransition_places();
			case PetrinetsDiffMMPackage.PETRI_NET: return createPetriNet();
			case PetrinetsDiffMMPackage.PLACE: return createPlace();
			case PetrinetsDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case PetrinetsDiffMMPackage.SEMANTIC_DIFF: return createSemanticDiff();
			case PetrinetsDiffMMPackage.TRANSITION: return createTransition();
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
			case PetrinetsDiffMMPackage.AUTHOR:
				return createAUTHORFromString(eDataType, initialValue);
			case PetrinetsDiffMMPackage.CHANGE_STATUS:
				return createChangeStatusFromString(eDataType, initialValue);
			case PetrinetsDiffMMPackage.CONFLICT_GRANULARITY:
				return createConflictGranularityFromString(eDataType, initialValue);
			case PetrinetsDiffMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return createConflictResolutionStrategyFromString(eDataType, initialValue);
			case PetrinetsDiffMMPackage.CONFLICT_RESOLUTION_TYPE:
				return createConflictResolutionTypeFromString(eDataType, initialValue);
			case PetrinetsDiffMMPackage.DIFF_KIND:
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
			case PetrinetsDiffMMPackage.AUTHOR:
				return convertAUTHORToString(eDataType, instanceValue);
			case PetrinetsDiffMMPackage.CHANGE_STATUS:
				return convertChangeStatusToString(eDataType, instanceValue);
			case PetrinetsDiffMMPackage.CONFLICT_GRANULARITY:
				return convertConflictGranularityToString(eDataType, instanceValue);
			case PetrinetsDiffMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return convertConflictResolutionStrategyToString(eDataType, instanceValue);
			case PetrinetsDiffMMPackage.CONFLICT_RESOLUTION_TYPE:
				return convertConflictResolutionTypeToString(eDataType, instanceValue);
			case PetrinetsDiffMMPackage.DIFF_KIND:
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
	public ConflictResolution createConflictResolution() {
		ConflictResolutionImpl conflictResolution = new ConflictResolutionImpl();
		return conflictResolution;
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
	public SemanticConflict createSemanticConflict() {
		SemanticConflictImpl semanticConflict = new SemanticConflictImpl();
		return semanticConflict;
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
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHOR createAUTHORFromString(EDataType eDataType, String initialValue) {
		AUTHOR result = AUTHOR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAUTHORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus createChangeStatusFromString(EDataType eDataType, String initialValue) {
		ChangeStatus result = ChangeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictGranularity createConflictGranularityFromString(EDataType eDataType, String initialValue) {
		ConflictGranularity result = ConflictGranularity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictGranularityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionStrategy createConflictResolutionStrategyFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionStrategy result = ConflictResolutionStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionType createConflictResolutionTypeFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionType result = ConflictResolutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public PetrinetsDiffMMPackage getPetrinetsDiffMMPackage() {
		return (PetrinetsDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetsDiffMMPackage getPackage() {
		return PetrinetsDiffMMPackage.eINSTANCE;
	}

} //PetrinetsDiffMMFactoryImpl
