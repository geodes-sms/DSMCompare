/**
 */
package petrinetsCRRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetsCRRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetsCRRuleMMFactoryImpl extends EFactoryImpl implements PetrinetsCRRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetsCRRuleMMFactory init() {
		try {
			PetrinetsCRRuleMMFactory thePetrinetsCRRuleMMFactory = (PetrinetsCRRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetsCRRuleMMPackage.eNS_URI);
			if (thePetrinetsCRRuleMMFactory != null) {
				return thePetrinetsCRRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetsCRRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetsCRRuleMMFactoryImpl() {
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
			case PetrinetsCRRuleMMPackage.PATTERN_CONFLICT_RESOLUTION: return createPattern_ConflictResolution();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_PETRI_NET: return createPattern_DiffPetriNet();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES: return createPattern_DiffPetriNet_places();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_PETRI_NET_TRANSITIONS: return createPattern_DiffPetriNet_transitions();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_PLACE: return createPattern_DiffPlace();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_PLACE_TRANSITIONS: return createPattern_DiffPlace_transitions();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION: return createPattern_DiffTransition();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES: return createPattern_DiffTransition_places();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET: return createPattern_PetriNet();
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE: return createPattern_Place();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION: return createPattern_Transition();
			case PetrinetsCRRuleMMPackage.RULE: return createRule();
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
			case PetrinetsCRRuleMMPackage.AUTHOR:
				return createAUTHORFromString(eDataType, initialValue);
			case PetrinetsCRRuleMMPackage.CHANGE_STATUS:
				return createChangeStatusFromString(eDataType, initialValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_GRANULARITY:
				return createConflictGranularityFromString(eDataType, initialValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return createConflictResolutionStrategyFromString(eDataType, initialValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_RESOLUTION_TYPE:
				return createConflictResolutionTypeFromString(eDataType, initialValue);
			case PetrinetsCRRuleMMPackage.DIFF_KIND:
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
			case PetrinetsCRRuleMMPackage.AUTHOR:
				return convertAUTHORToString(eDataType, instanceValue);
			case PetrinetsCRRuleMMPackage.CHANGE_STATUS:
				return convertChangeStatusToString(eDataType, instanceValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_GRANULARITY:
				return convertConflictGranularityToString(eDataType, instanceValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return convertConflictResolutionStrategyToString(eDataType, instanceValue);
			case PetrinetsCRRuleMMPackage.CONFLICT_RESOLUTION_TYPE:
				return convertConflictResolutionTypeToString(eDataType, instanceValue);
			case PetrinetsCRRuleMMPackage.DIFF_KIND:
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
	public Pattern_ConflictResolution createPattern_ConflictResolution() {
		Pattern_ConflictResolutionImpl pattern_ConflictResolution = new Pattern_ConflictResolutionImpl();
		return pattern_ConflictResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPetriNet createPattern_DiffPetriNet() {
		Pattern_DiffPetriNetImpl pattern_DiffPetriNet = new Pattern_DiffPetriNetImpl();
		return pattern_DiffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPetriNet_places createPattern_DiffPetriNet_places() {
		Pattern_DiffPetriNet_placesImpl pattern_DiffPetriNet_places = new Pattern_DiffPetriNet_placesImpl();
		return pattern_DiffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPetriNet_transitions createPattern_DiffPetriNet_transitions() {
		Pattern_DiffPetriNet_transitionsImpl pattern_DiffPetriNet_transitions = new Pattern_DiffPetriNet_transitionsImpl();
		return pattern_DiffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPlace createPattern_DiffPlace() {
		Pattern_DiffPlaceImpl pattern_DiffPlace = new Pattern_DiffPlaceImpl();
		return pattern_DiffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPlace_transitions createPattern_DiffPlace_transitions() {
		Pattern_DiffPlace_transitionsImpl pattern_DiffPlace_transitions = new Pattern_DiffPlace_transitionsImpl();
		return pattern_DiffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffTransition createPattern_DiffTransition() {
		Pattern_DiffTransitionImpl pattern_DiffTransition = new Pattern_DiffTransitionImpl();
		return pattern_DiffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffTransition_places createPattern_DiffTransition_places() {
		Pattern_DiffTransition_placesImpl pattern_DiffTransition_places = new Pattern_DiffTransition_placesImpl();
		return pattern_DiffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_PetriNet createPattern_PetriNet() {
		Pattern_PetriNetImpl pattern_PetriNet = new Pattern_PetriNetImpl();
		return pattern_PetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Place createPattern_Place() {
		Pattern_PlaceImpl pattern_Place = new Pattern_PlaceImpl();
		return pattern_Place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticDiff createPattern_SemanticDiff() {
		Pattern_SemanticDiffImpl pattern_SemanticDiff = new Pattern_SemanticDiffImpl();
		return pattern_SemanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Transition createPattern_Transition() {
		Pattern_TransitionImpl pattern_Transition = new Pattern_TransitionImpl();
		return pattern_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
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
	public PetrinetsCRRuleMMPackage getPetrinetsCRRuleMMPackage() {
		return (PetrinetsCRRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetsCRRuleMMPackage getPackage() {
		return PetrinetsCRRuleMMPackage.eINSTANCE;
	}

} //PetrinetsCRRuleMMFactoryImpl
