/**
 */
package petrinets2WayRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinets2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinets2WayRuleMMFactoryImpl extends EFactoryImpl implements Petrinets2WayRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinets2WayRuleMMFactory init() {
		try {
			Petrinets2WayRuleMMFactory thePetrinets2WayRuleMMFactory = (Petrinets2WayRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(Petrinets2WayRuleMMPackage.eNS_URI);
			if (thePetrinets2WayRuleMMFactory != null) {
				return thePetrinets2WayRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinets2WayRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayRuleMMFactoryImpl() {
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
			case Petrinets2WayRuleMMPackage.PATTERN_PETRI_NET: return createPattern_PetriNet();
			case Petrinets2WayRuleMMPackage.PATTERN_PLACE: return createPattern_Place();
			case Petrinets2WayRuleMMPackage.PATTERN_TRANSITION: return createPattern_Transition();
			case Petrinets2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case Petrinets2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET: return createPattern_DiffPetriNet();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES: return createPattern_DiffPetriNet_places();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_TRANSITIONS: return createPattern_DiffPetriNet_transitions();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PLACE: return createPattern_DiffPlace();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PLACE_TRANSITIONS: return createPattern_DiffPlace_transitions();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_TRANSITION: return createPattern_DiffTransition();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES: return createPattern_DiffTransition_places();
			case Petrinets2WayRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Pattern_Transition createPattern_Transition() {
		Pattern_TransitionImpl pattern_Transition = new Pattern_TransitionImpl();
		return pattern_Transition;
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
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
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
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayRuleMMPackage getPetrinets2WayRuleMMPackage() {
		return (Petrinets2WayRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinets2WayRuleMMPackage getPackage() {
		return Petrinets2WayRuleMMPackage.eINSTANCE;
	}

} //Petrinets2WayRuleMMFactoryImpl
