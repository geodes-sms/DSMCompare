/**
 */
package petrinetsDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinetsDiffMM.ChangeStatus;
import petrinetsDiffMM.ConflictGranularity;
import petrinetsDiffMM.ConflictResolution;
import petrinetsDiffMM.ConflictResolutionStrategy;
import petrinetsDiffMM.ConflictResolutionType;
import petrinetsDiffMM.DiffKind;
import petrinetsDiffMM.DiffPetriNet;
import petrinetsDiffMM.DiffPetriNet_places;
import petrinetsDiffMM.DiffPetriNet_transitions;
import petrinetsDiffMM.DiffPlace;
import petrinetsDiffMM.DiffPlace_transitions;
import petrinetsDiffMM.DiffTransition;
import petrinetsDiffMM.DiffTransition_places;
import petrinetsDiffMM.NamedElement;
import petrinetsDiffMM.PetriNet;
import petrinetsDiffMM.PetrinetsDiffMMFactory;
import petrinetsDiffMM.PetrinetsDiffMMPackage;
import petrinetsDiffMM.Place;
import petrinetsDiffMM.SemanticConflict;
import petrinetsDiffMM.SemanticDiff;
import petrinetsDiffMM.SemanticObject;
import petrinetsDiffMM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetsDiffMMPackageImpl extends EPackageImpl implements PetrinetsDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPetriNet_placesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPetriNet_transitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPlace_transitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffTransition_placesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

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
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetsDiffMMPackageImpl() {
		super(eNS_URI, PetrinetsDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetsDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetsDiffMMPackage init() {
		if (isInited) return (PetrinetsDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetsDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetrinetsDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PetrinetsDiffMMPackageImpl thePetrinetsDiffMMPackage = registeredPetrinetsDiffMMPackage instanceof PetrinetsDiffMMPackageImpl ? (PetrinetsDiffMMPackageImpl)registeredPetrinetsDiffMMPackage : new PetrinetsDiffMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePetrinetsDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetsDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetsDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetsDiffMMPackage.eNS_URI, thePetrinetsDiffMMPackage);
		return thePetrinetsDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictResolution() {
		return conflictResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflictResolution_ResolutionType() {
		return (EAttribute)conflictResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflictResolution_ResolutionStrategy() {
		return (EAttribute)conflictResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictResolution_Semanticconflicts() {
		return (EReference)conflictResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPetriNet() {
		return diffPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_Diff_kind_Left() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_Diff_kind_Right() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_Filter() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_IsMerged() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_ChangeStatus() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_id_Left() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_id_Right() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_IdChangeStatus() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_name_Left() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_name_Right() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_NameChangeStatus() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPetriNet_places() {
		return diffPetriNet_placesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_Diff_kind_Left() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_Diff_kind_Right() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_ChangeStatus() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_Filter() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_IsMerged() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_places_Diff_Group() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPetriNet_places_EType() {
		return (EReference)diffPetriNet_placesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPetriNet_transitions() {
		return diffPetriNet_transitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_Diff_kind_Left() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_Diff_kind_Right() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_ChangeStatus() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_Filter() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_IsMerged() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_transitions_Diff_Group() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPetriNet_transitions_EType() {
		return (EReference)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPlace() {
		return diffPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_Diff_kind_Left() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_Diff_kind_Right() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_Filter() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_IsMerged() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_ChangeStatus() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_id_Left() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_id_Right() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_IdChangeStatus() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_name_Left() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_name_Right() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_NameChangeStatus() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_tokens_Left() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_tokens_Right() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_TokensChangeStatus() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPlace_transitions() {
		return diffPlace_transitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_Diff_kind_Left() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_Diff_kind_Right() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_ChangeStatus() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_Filter() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_IsMerged() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_transitions_Diff_Group() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPlace_transitions_EType() {
		return (EReference)diffPlace_transitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffTransition() {
		return diffTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_Diff_kind_Left() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_Diff_kind_Right() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_Filter() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_IsMerged() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_ChangeStatus() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_id_Left() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_id_Right() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_IdChangeStatus() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_name_Left() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_name_Right() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_NameChangeStatus() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffTransition_places() {
		return diffTransition_placesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_Diff_kind_Left() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_Diff_kind_Right() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_ChangeStatus() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_Filter() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_IsMerged() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_places_Diff_Group() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffTransition_places_EType() {
		return (EReference)diffTransition_placesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Id() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Places() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Transitions() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Diffplaces() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Difftransitions() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Tokens() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Transitions() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Difftransitions() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticConflict() {
		return semanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticConflict_Conflict_kind() {
		return (EAttribute)semanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticConflict_Conflict_Granularity() {
		return (EAttribute)semanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_Semanticdiffs() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticDiff() {
		return semanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticDiff_Author() {
		return (EAttribute)semanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticObject() {
		return semanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticObject_Name() {
		return (EAttribute)semanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPetriNet() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPetriNet_places() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPetriNet_transitions() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPlace() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPlace_transitions() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffTransition() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffTransition_places() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_NamedElement() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Places() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Diffplaces() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
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
	public PetrinetsDiffMMFactory getPetrinetsDiffMMFactory() {
		return (PetrinetsDiffMMFactory)getEFactoryInstance();
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
		conflictResolutionEClass = createEClass(CONFLICT_RESOLUTION);
		createEAttribute(conflictResolutionEClass, CONFLICT_RESOLUTION__RESOLUTION_TYPE);
		createEAttribute(conflictResolutionEClass, CONFLICT_RESOLUTION__RESOLUTION_STRATEGY);
		createEReference(conflictResolutionEClass, CONFLICT_RESOLUTION__SEMANTICCONFLICTS);

		diffPetriNetEClass = createEClass(DIFF_PETRI_NET);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__DIFF_KIND_LEFT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__DIFF_KIND_RIGHT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__FILTER);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__IS_MERGED);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__CHANGE_STATUS);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_ID_LEFT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_ID_RIGHT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__ID_CHANGE_STATUS);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_NAME_LEFT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_NAME_RIGHT);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NAME_CHANGE_STATUS);

		diffPetriNet_placesEClass = createEClass(DIFF_PETRI_NET_PLACES);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__CHANGE_STATUS);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__FILTER);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__IS_MERGED);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__DIFF_GROUP);
		createEReference(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__ETYPE);

		diffPetriNet_transitionsEClass = createEClass(DIFF_PETRI_NET_TRANSITIONS);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__FILTER);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__IS_MERGED);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP);
		createEReference(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__ETYPE);

		diffPlaceEClass = createEClass(DIFF_PLACE);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__DIFF_KIND_LEFT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__DIFF_KIND_RIGHT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__FILTER);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__IS_MERGED);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__CHANGE_STATUS);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_ID_LEFT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_ID_RIGHT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__ID_CHANGE_STATUS);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_NAME_LEFT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_NAME_RIGHT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NAME_CHANGE_STATUS);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_TOKENS_LEFT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_TOKENS_RIGHT);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__TOKENS_CHANGE_STATUS);

		diffPlace_transitionsEClass = createEClass(DIFF_PLACE_TRANSITIONS);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__CHANGE_STATUS);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__FILTER);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__IS_MERGED);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__DIFF_GROUP);
		createEReference(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__ETYPE);

		diffTransitionEClass = createEClass(DIFF_TRANSITION);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__DIFF_KIND_LEFT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__DIFF_KIND_RIGHT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__FILTER);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__IS_MERGED);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__CHANGE_STATUS);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_ID_LEFT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_ID_RIGHT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__ID_CHANGE_STATUS);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_NAME_LEFT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_NAME_RIGHT);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NAME_CHANGE_STATUS);

		diffTransition_placesEClass = createEClass(DIFF_TRANSITION_PLACES);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__CHANGE_STATUS);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__FILTER);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__IS_MERGED);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__DIFF_GROUP);
		createEReference(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__ETYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		petriNetEClass = createEClass(PETRI_NET);
		createEReference(petriNetEClass, PETRI_NET__PLACES);
		createEReference(petriNetEClass, PETRI_NET__TRANSITIONS);
		createEReference(petriNetEClass, PETRI_NET__DIFFPLACES);
		createEReference(petriNetEClass, PETRI_NET__DIFFTRANSITIONS);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKENS);
		createEReference(placeEClass, PLACE__TRANSITIONS);
		createEReference(placeEClass, PLACE__DIFFTRANSITIONS);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEAttribute(semanticConflictEClass, SEMANTIC_CONFLICT__CONFLICT_KIND);
		createEAttribute(semanticConflictEClass, SEMANTIC_CONFLICT__CONFLICT_GRANULARITY);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTICDIFFS);

		semanticDiffEClass = createEClass(SEMANTIC_DIFF);
		createEAttribute(semanticDiffEClass, SEMANTIC_DIFF__AUTHOR);

		semanticObjectEClass = createEClass(SEMANTIC_OBJECT);
		createEAttribute(semanticObjectEClass, SEMANTIC_OBJECT__NAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__PLACES);
		createEReference(transitionEClass, TRANSITION__DIFFPLACES);

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
		conflictResolutionEClass.getESuperTypes().add(this.getSemanticObject());
		diffPetriNetEClass.getESuperTypes().add(this.getPetriNet());
		diffPlaceEClass.getESuperTypes().add(this.getPlace());
		diffTransitionEClass.getESuperTypes().add(this.getTransition());
		petriNetEClass.getESuperTypes().add(this.getNamedElement());
		placeEClass.getESuperTypes().add(this.getNamedElement());
		semanticConflictEClass.getESuperTypes().add(this.getSemanticObject());
		semanticDiffEClass.getESuperTypes().add(this.getSemanticObject());
		transitionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(conflictResolutionEClass, ConflictResolution.class, "ConflictResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConflictResolution_ResolutionType(), this.getConflictResolutionType(), "ResolutionType", null, 1, 1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflictResolution_ResolutionStrategy(), this.getConflictResolutionStrategy(), "ResolutionStrategy", null, 1, 1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictResolution_Semanticconflicts(), this.getSemanticConflict(), null, "semanticconflicts", null, 0, -1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diffPetriNetEClass, DiffPetriNet.class, "DiffPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPetriNet_placesEClass, DiffPetriNet_places.class, "DiffPetriNet_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_places_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_places_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_places_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_places_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_places_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPetriNet_places_EType(), this.getPlace(), null, "eType", null, 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPetriNet_transitionsEClass, DiffPetriNet_transitions.class, "DiffPetriNet_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_transitions_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_transitions_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_transitions_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_transitions_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_transitions_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPetriNet_transitions_EType(), this.getTransition(), null, "eType", null, 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlaceEClass, DiffPlace.class, "DiffPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlace_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_tokens_Left(), ecorePackage.getEInt(), "new_tokens_Left", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_tokens_Right(), ecorePackage.getEInt(), "new_tokens_Right", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_TokensChangeStatus(), this.getChangeStatus(), "tokensChangeStatus", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlace_transitionsEClass, DiffPlace_transitions.class, "DiffPlace_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlace_transitions_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_transitions_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_transitions_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_transitions_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_transitions_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPlace_transitions_EType(), this.getTransition(), null, "eType", null, 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffTransitionEClass, DiffTransition.class, "DiffTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffTransition_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_id_Left(), ecorePackage.getEInt(), "new_id_Left", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_id_Right(), ecorePackage.getEInt(), "new_id_Right", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffTransition_placesEClass, DiffTransition_places.class, "DiffTransition_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffTransition_places_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_places_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_places_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_places_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_places_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffTransition_places_EType(), this.getPlace(), null, "eType", null, 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNet_Places(), this.getPlace(), null, "places", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_Diffplaces(), this.getDiffPetriNet_places(), null, "diffplaces", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_Difftransitions(), this.getDiffPetriNet_transitions(), null, "difftransitions", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Tokens(), ecorePackage.getEInt(), "tokens", "0", 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Difftransitions(), this.getDiffPlace_transitions(), null, "difftransitions", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticConflict_Conflict_kind(), this.getChangeStatus(), "conflict_kind", "NON", 1, 1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemanticConflict_Conflict_Granularity(), this.getConflictGranularity(), "conflict_Granularity", "NIL", 1, 1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_Semanticdiffs(), this.getSemanticDiff(), null, "semanticdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(semanticDiffEClass, SemanticDiff.class, "SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticDiff_Author(), this.getAUTHOR(), "author", "NON", 1, 1, SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticObjectEClass, SemanticObject.class, "SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPetriNet(), this.getDiffPetriNet(), null, "SemanticObject_DiffPetriNet", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPetriNet_places(), this.getDiffPetriNet_places(), null, "SemanticObject_DiffPetriNet_places", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPetriNet_transitions(), this.getDiffPetriNet_transitions(), null, "SemanticObject_DiffPetriNet_transitions", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPlace(), this.getDiffPlace(), null, "SemanticObject_DiffPlace", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPlace_transitions(), this.getDiffPlace_transitions(), null, "SemanticObject_DiffPlace_transitions", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffTransition(), this.getDiffTransition(), null, "SemanticObject_DiffTransition", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffTransition_places(), this.getDiffTransition_places(), null, "SemanticObject_DiffTransition_places", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_NamedElement(), this.getNamedElement(), null, "SemanticObject_NamedElement", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Places(), this.getPlace(), null, "places", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Diffplaces(), this.getDiffTransition_places(), null, "diffplaces", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorEEnum, petrinetsDiffMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, petrinetsDiffMM.AUTHOR.NON);
		addEEnumLiteral(authorEEnum, petrinetsDiffMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, petrinetsDiffMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, petrinetsDiffMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, petrinetsDiffMM.AUTHOR.MIXED);

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

} //PetrinetsDiffMMPackageImpl
