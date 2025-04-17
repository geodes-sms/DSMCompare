/**
 */
package petrinetsCRRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinetsCRRuleMM.ChangeStatus;
import petrinetsCRRuleMM.ConflictGranularity;
import petrinetsCRRuleMM.ConflictResolutionStrategy;
import petrinetsCRRuleMM.ConflictResolutionType;
import petrinetsCRRuleMM.DiffKind;
import petrinetsCRRuleMM.Pattern_ConflictResolution;
import petrinetsCRRuleMM.Pattern_DiffPetriNet;
import petrinetsCRRuleMM.Pattern_DiffPetriNet_places;
import petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions;
import petrinetsCRRuleMM.Pattern_DiffPlace;
import petrinetsCRRuleMM.Pattern_DiffPlace_transitions;
import petrinetsCRRuleMM.Pattern_DiffTransition;
import petrinetsCRRuleMM.Pattern_DiffTransition_places;
import petrinetsCRRuleMM.Pattern_NamedElement;
import petrinetsCRRuleMM.Pattern_PetriNet;
import petrinetsCRRuleMM.Pattern_Place;
import petrinetsCRRuleMM.Pattern_SemanticConflict;
import petrinetsCRRuleMM.Pattern_SemanticDiff;
import petrinetsCRRuleMM.Pattern_SemanticObject;
import petrinetsCRRuleMM.Pattern_Transition;
import petrinetsCRRuleMM.PetrinetsCRRuleMMFactory;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;
import petrinetsCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetsCRRuleMMPackageImpl extends EPackageImpl implements PetrinetsCRRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ConflictResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPetriNet_placesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPetriNet_transitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPlace_transitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffTransition_placesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_NamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_TransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictGranularityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictResolutionStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictResolutionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetsCRRuleMMPackageImpl() {
		super(eNS_URI, PetrinetsCRRuleMMFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PetrinetsCRRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetsCRRuleMMPackage init() {
		if (isInited) return (PetrinetsCRRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetsCRRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetrinetsCRRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PetrinetsCRRuleMMPackageImpl thePetrinetsCRRuleMMPackage = registeredPetrinetsCRRuleMMPackage instanceof PetrinetsCRRuleMMPackageImpl ? (PetrinetsCRRuleMMPackageImpl)registeredPetrinetsCRRuleMMPackage : new PetrinetsCRRuleMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePetrinetsCRRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetsCRRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetsCRRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetsCRRuleMMPackage.eNS_URI, thePetrinetsCRRuleMMPackage);
		return thePetrinetsCRRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_ConflictResolution() {
		return pattern_ConflictResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ConflictResolution_ResolutionType() {
		return (EAttribute)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ConflictResolution_ResolutionStrategy() {
		return (EAttribute)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_ConflictResolution_Semanticconflicts() {
		return (EReference)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPetriNet() {
		return pattern_DiffPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_Filter() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_IsMerged() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_ChangeStatus() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_New_id_Left() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_New_id_Right() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_IdChangeStatus() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_New_name_Left() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_New_name_Right() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_NameChangeStatus() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPetriNet_places() {
		return pattern_DiffPetriNet_placesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_ID_Pattern() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_IsForbidden() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_ChangeStatus() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_Filter() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_IsMerged() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_Diff_Group() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffPetriNet_places_EType() {
		return (EReference)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPetriNet_transitions() {
		return pattern_DiffPetriNet_transitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_ID_Pattern() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_IsForbidden() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_ChangeStatus() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_Filter() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_IsMerged() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_Diff_Group() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffPetriNet_transitions_EType() {
		return (EReference)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPlace() {
		return pattern_DiffPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_Filter() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_IsMerged() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_ChangeStatus() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_id_Left() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_id_Right() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_IdChangeStatus() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_name_Left() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_name_Right() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_NameChangeStatus() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_tokens_Left() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_New_tokens_Right() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_TokensChangeStatus() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPlace_transitions() {
		return pattern_DiffPlace_transitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_ID_Pattern() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_IsForbidden() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_ChangeStatus() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_Filter() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_IsMerged() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_Diff_Group() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffPlace_transitions_EType() {
		return (EReference)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffTransition() {
		return pattern_DiffTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_Diff_kind_Left() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_Diff_kind_Right() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_Filter() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_IsMerged() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_ChangeStatus() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_New_id_Left() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_New_id_Right() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_IdChangeStatus() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_New_name_Left() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_New_name_Right() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_NameChangeStatus() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffTransition_places() {
		return pattern_DiffTransition_placesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_ID_Pattern() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_IsForbidden() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_Diff_kind_Left() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_Diff_kind_Right() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_ChangeStatus() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_Filter() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_IsMerged() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_Diff_Group() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffTransition_places_EType() {
		return (EReference)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_NamedElement() {
		return pattern_NamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_ID_Pattern() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_IsForbidden() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_Id() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_Name() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_PetriNet() {
		return pattern_PetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PetriNet_Places() {
		return (EReference)pattern_PetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PetriNet_Transitions() {
		return (EReference)pattern_PetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PetriNet_Diffplaces() {
		return (EReference)pattern_PetriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PetriNet_Difftransitions() {
		return (EReference)pattern_PetriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Place() {
		return pattern_PlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Place_Tokens() {
		return (EAttribute)pattern_PlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Place_Transitions() {
		return (EReference)pattern_PlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Place_Difftransitions() {
		return (EReference)pattern_PlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticConflict() {
		return pattern_SemanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Conflict_kind() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Conflict_Granularity() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticConflict_Semanticdiffs() {
		return (EReference)pattern_SemanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticDiff() {
		return pattern_SemanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_Author() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticObject() {
		return pattern_SemanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_ID_Pattern() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_IsForbidden() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_Name() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet_places() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet_transitions() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPlace() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPlace_transitions() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffTransition() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffTransition_places() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_NamedElement() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Transition() {
		return pattern_TransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Transition_Places() {
		return (EReference)pattern_TransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Transition_Diffplaces() {
		return (EReference)pattern_TransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Priority() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPetriNet() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPetriNet_places() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPetriNet_transitions() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPlace() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPlace_transitions() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffTransition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffTransition_places() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_NamedElement() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAUTHOR() {
		return authorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeStatus() {
		return changeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictGranularity() {
		return conflictGranularityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictResolutionStrategy() {
		return conflictResolutionStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictResolutionType() {
		return conflictResolutionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiffKind() {
		return diffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetsCRRuleMMFactory getPetrinetsCRRuleMMFactory() {
		return (PetrinetsCRRuleMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pattern_ConflictResolutionEClass = createEClass(PATTERN_CONFLICT_RESOLUTION);
		createEAttribute(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE);
		createEAttribute(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY);
		createEReference(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS);

		pattern_DiffPetriNetEClass = createEClass(PATTERN_DIFF_PETRI_NET);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__FILTER);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__IS_MERGED);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__CHANGE_STATUS);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__NEW_ID_LEFT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__NAME_CHANGE_STATUS);

		pattern_DiffPetriNet_placesEClass = createEClass(PATTERN_DIFF_PETRI_NET_PLACES);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__CHANGE_STATUS);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__FILTER);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__IS_MERGED);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__DIFF_GROUP);
		createEReference(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__ETYPE);

		pattern_DiffPetriNet_transitionsEClass = createEClass(PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__ID_PATTERN);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_MERGED);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP);
		createEReference(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__ETYPE);

		pattern_DiffPlaceEClass = createEClass(PATTERN_DIFF_PLACE);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__FILTER);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__IS_MERGED);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__CHANGE_STATUS);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_ID_LEFT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_TOKENS_LEFT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__NEW_TOKENS_RIGHT);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__TOKENS_CHANGE_STATUS);

		pattern_DiffPlace_transitionsEClass = createEClass(PATTERN_DIFF_PLACE_TRANSITIONS);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__ID_PATTERN);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__CHANGE_STATUS);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__FILTER);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__IS_MERGED);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_GROUP);
		createEReference(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__ETYPE);

		pattern_DiffTransitionEClass = createEClass(PATTERN_DIFF_TRANSITION);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__FILTER);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__IS_MERGED);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__CHANGE_STATUS);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__NEW_ID_LEFT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__NAME_CHANGE_STATUS);

		pattern_DiffTransition_placesEClass = createEClass(PATTERN_DIFF_TRANSITION_PLACES);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__FILTER);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP);
		createEReference(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__ETYPE);

		pattern_NamedElementEClass = createEClass(PATTERN_NAMED_ELEMENT);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__IS_FORBIDDEN);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__ID);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__NAME);

		pattern_PetriNetEClass = createEClass(PATTERN_PETRI_NET);
		createEReference(pattern_PetriNetEClass, PATTERN_PETRI_NET__PLACES);
		createEReference(pattern_PetriNetEClass, PATTERN_PETRI_NET__TRANSITIONS);
		createEReference(pattern_PetriNetEClass, PATTERN_PETRI_NET__DIFFPLACES);
		createEReference(pattern_PetriNetEClass, PATTERN_PETRI_NET__DIFFTRANSITIONS);

		pattern_PlaceEClass = createEClass(PATTERN_PLACE);
		createEAttribute(pattern_PlaceEClass, PATTERN_PLACE__TOKENS);
		createEReference(pattern_PlaceEClass, PATTERN_PLACE__TRANSITIONS);
		createEReference(pattern_PlaceEClass, PATTERN_PLACE__DIFFTRANSITIONS);

		pattern_SemanticConflictEClass = createEClass(PATTERN_SEMANTIC_CONFLICT);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY);
		createEReference(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS);

		pattern_SemanticDiffEClass = createEClass(PATTERN_SEMANTIC_DIFF);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__AUTHOR);

		pattern_SemanticObjectEClass = createEClass(PATTERN_SEMANTIC_OBJECT);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__ID_PATTERN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__NAME);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT);

		pattern_TransitionEClass = createEClass(PATTERN_TRANSITION);
		createEReference(pattern_TransitionEClass, PATTERN_TRANSITION__PLACES);
		createEReference(pattern_TransitionEClass, PATTERN_TRANSITION__DIFFPLACES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEAttribute(ruleEClass, RULE__PRIORITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PLACE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT);

		// Create enums
		authorEEnum = createEEnum(AUTHOR);
		changeStatusEEnum = createEEnum(CHANGE_STATUS);
		conflictGranularityEEnum = createEEnum(CONFLICT_GRANULARITY);
		conflictResolutionStrategyEEnum = createEEnum(CONFLICT_RESOLUTION_STRATEGY);
		conflictResolutionTypeEEnum = createEEnum(CONFLICT_RESOLUTION_TYPE);
		diffKindEEnum = createEEnum(DIFF_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_ConflictResolutionEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_DiffPetriNetEClass.getESuperTypes().add(this.getPattern_NamedElement());
		pattern_DiffPlaceEClass.getESuperTypes().add(this.getPattern_NamedElement());
		pattern_DiffTransitionEClass.getESuperTypes().add(this.getPattern_NamedElement());
		pattern_PetriNetEClass.getESuperTypes().add(this.getPattern_NamedElement());
		pattern_PlaceEClass.getESuperTypes().add(this.getPattern_NamedElement());
		pattern_SemanticConflictEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_TransitionEClass.getESuperTypes().add(this.getPattern_NamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_ConflictResolutionEClass, Pattern_ConflictResolution.class, "Pattern_ConflictResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ConflictResolution_ResolutionType(), this.getConflictResolutionType(), "ResolutionType", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ConflictResolution_ResolutionStrategy(), this.getConflictResolutionStrategy(), "ResolutionStrategy", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_ConflictResolution_Semanticconflicts(), this.getPattern_SemanticConflict(), null, "semanticconflicts", null, 0, -1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_DiffPetriNetEClass, Pattern_DiffPetriNet.class, "Pattern_DiffPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPetriNet_placesEClass, Pattern_DiffPetriNet_places.class, "Pattern_DiffPetriNet_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_places_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffPetriNet_places_EType(), this.getPattern_Place(), null, "eType", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPetriNet_transitionsEClass, Pattern_DiffPetriNet_transitions.class, "Pattern_DiffPetriNet_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_transitions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffPetriNet_transitions_EType(), this.getPattern_Transition(), null, "eType", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlaceEClass, Pattern_DiffPlace.class, "Pattern_DiffPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlace_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_tokens_Left(), ecorePackage.getEInt(), "new_tokens_Left", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_New_tokens_Right(), ecorePackage.getEInt(), "new_tokens_Right", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_TokensChangeStatus(), this.getChangeStatus(), "tokensChangeStatus", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlace_transitionsEClass, Pattern_DiffPlace_transitions.class, "Pattern_DiffPlace_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlace_transitions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffPlace_transitions_EType(), this.getPattern_Transition(), null, "eType", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffTransitionEClass, Pattern_DiffTransition.class, "Pattern_DiffTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffTransition_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffTransition_placesEClass, Pattern_DiffTransition_places.class, "Pattern_DiffTransition_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffTransition_places_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffTransition_places_EType(), this.getPattern_Place(), null, "eType", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_NamedElementEClass, Pattern_NamedElement.class, "Pattern_NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_NamedElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_NamedElement_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_NamedElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_NamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PetriNetEClass, Pattern_PetriNet.class, "Pattern_PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_PetriNet_Places(), this.getPattern_Place(), null, "places", null, 0, -1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_PetriNet_Transitions(), this.getPattern_Transition(), null, "transitions", null, 0, -1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_PetriNet_Diffplaces(), this.getPattern_DiffPetriNet_places(), null, "diffplaces", null, 0, -1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_PetriNet_Difftransitions(), this.getPattern_DiffPetriNet_transitions(), null, "difftransitions", null, 0, -1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PlaceEClass, Pattern_Place.class, "Pattern_Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Place_Tokens(), ecorePackage.getEInt(), "tokens", null, 0, 1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Place_Transitions(), this.getPattern_Transition(), null, "transitions", null, 0, -1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Place_Difftransitions(), this.getPattern_DiffPlace_transitions(), null, "difftransitions", null, 0, -1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticConflictEClass, Pattern_SemanticConflict.class, "Pattern_SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticConflict_Conflict_kind(), this.getChangeStatus(), "conflict_kind", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_Conflict_Granularity(), this.getConflictGranularity(), "conflict_Granularity", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_SemanticConflict_Semanticdiffs(), this.getPattern_SemanticDiff(), null, "semanticdiffs", null, 0, -1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_SemanticDiffEClass, Pattern_SemanticDiff.class, "Pattern_SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticDiff_Author(), this.getAUTHOR(), "author", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticObjectEClass, Pattern_SemanticObject.class, "Pattern_SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPetriNet(), this.getPattern_DiffPetriNet(), null, "SemanticObject_DiffPetriNet", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPetriNet_places(), this.getPattern_DiffPetriNet_places(), null, "SemanticObject_DiffPetriNet_places", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPetriNet_transitions(), this.getPattern_DiffPetriNet_transitions(), null, "SemanticObject_DiffPetriNet_transitions", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPlace(), this.getPattern_DiffPlace(), null, "SemanticObject_DiffPlace", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPlace_transitions(), this.getPattern_DiffPlace_transitions(), null, "SemanticObject_DiffPlace_transitions", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffTransition(), this.getPattern_DiffTransition(), null, "SemanticObject_DiffTransition", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffTransition_places(), this.getPattern_DiffTransition_places(), null, "SemanticObject_DiffTransition_places", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_NamedElement(), this.getPattern_NamedElement(), null, "SemanticObject_NamedElement", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_TransitionEClass, Pattern_Transition.class, "Pattern_Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Transition_Places(), this.getPattern_Place(), null, "places", null, 0, -1, Pattern_Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Transition_Diffplaces(), this.getPattern_DiffTransition_places(), null, "diffplaces", null, 0, -1, Pattern_Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_SemanticObject(), this.getPattern_SemanticObject(), null, "rulePattern_Pattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPetriNet(), this.getPattern_DiffPetriNet(), null, "rulePattern_Pattern_DiffPetriNet", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPetriNet_places(), this.getPattern_DiffPetriNet_places(), null, "rulePattern_Pattern_DiffPetriNet_places", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPetriNet_transitions(), this.getPattern_DiffPetriNet_transitions(), null, "rulePattern_Pattern_DiffPetriNet_transitions", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPlace(), this.getPattern_DiffPlace(), null, "rulePattern_Pattern_DiffPlace", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPlace_transitions(), this.getPattern_DiffPlace_transitions(), null, "rulePattern_Pattern_DiffPlace_transitions", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffTransition(), this.getPattern_DiffTransition(), null, "rulePattern_Pattern_DiffTransition", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffTransition_places(), this.getPattern_DiffTransition_places(), null, "rulePattern_Pattern_DiffTransition_places", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_NamedElement(), this.getPattern_NamedElement(), null, "rulePattern_Pattern_NamedElement", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorEEnum, petrinetsCRRuleMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, petrinetsCRRuleMM.AUTHOR.NON);
		addEEnumLiteral(authorEEnum, petrinetsCRRuleMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, petrinetsCRRuleMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, petrinetsCRRuleMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, petrinetsCRRuleMM.AUTHOR.MIXED);

		initEEnum(changeStatusEEnum, ChangeStatus.class, "ChangeStatus");
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.NON);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.EQUIVALENT);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.CONTRADICTING);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_ADD);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_DELETE);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_MODIFY);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_DELETE_CREATE);

		initEEnum(conflictGranularityEEnum, ConflictGranularity.class, "ConflictGranularity");
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.NIL);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.SEMANTIC_SEMANTIC);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.SEMANTIC_FINE);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.FINE_FINE);

		initEEnum(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.class, "ConflictResolutionStrategy");
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.NIL);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_LEFT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_RIGHT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_SEMANTIC_DIFFERENCE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_NONE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_LEFT_THEN_RIGHT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_RIGHT_THEN_LEFT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_AUSER_DEFINED_RESOLUTION_PATTERN);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.CUSTOM_CHANGE_AT_TIME_OF_MERGE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.SUGGEST_ARESOLUTION_NEEDING_APPROVAL);

		initEEnum(conflictResolutionTypeEEnum, ConflictResolutionType.class, "ConflictResolutionType");
		addEEnumLiteral(conflictResolutionTypeEEnum, ConflictResolutionType.PENDING);
		addEEnumLiteral(conflictResolutionTypeEEnum, ConflictResolutionType.RESOLVED);

		initEEnum(diffKindEEnum, DiffKind.class, "DiffKind");
		addEEnumLiteral(diffKindEEnum, DiffKind.NON);
		addEEnumLiteral(diffKindEEnum, DiffKind.ADD);
		addEEnumLiteral(diffKindEEnum, DiffKind.DELETE);
		addEEnumLiteral(diffKindEEnum, DiffKind.MODIFY);

		// Create resource
		createResource(eNS_URI);
	}

} //PetrinetsCRRuleMMPackageImpl
