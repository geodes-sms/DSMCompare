/**
 */
package petrinets2WayRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;

import petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl;

import petrinets2WayRuleMM.Pattern_DiffPetriNet;
import petrinets2WayRuleMM.Pattern_DiffPetriNet_places;
import petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions;
import petrinets2WayRuleMM.Pattern_DiffPlace;
import petrinets2WayRuleMM.Pattern_DiffPlace_transitions;
import petrinets2WayRuleMM.Pattern_DiffTransition;
import petrinets2WayRuleMM.Pattern_DiffTransition_places;
import petrinets2WayRuleMM.Pattern_NamedElement;
import petrinets2WayRuleMM.Pattern_PetriNet;
import petrinets2WayRuleMM.Pattern_Place;
import petrinets2WayRuleMM.Pattern_SemanticConflict;
import petrinets2WayRuleMM.Pattern_SemanticDiff;
import petrinets2WayRuleMM.Pattern_SemanticObject;
import petrinets2WayRuleMM.Pattern_Transition;
import petrinets2WayRuleMM.Petrinets2WayRuleMMFactory;
import petrinets2WayRuleMM.Petrinets2WayRuleMMPackage;
import petrinets2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinets2WayRuleMMPackageImpl extends EPackageImpl implements Petrinets2WayRuleMMPackage {
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
	private EClass pattern_TransitionEClass = null;

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
	private EClass pattern_SemanticDiffEClass = null;

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
	private EClass ruleEClass = null;

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
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinets2WayRuleMMPackageImpl() {
		super(eNS_URI, Petrinets2WayRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinets2WayRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinets2WayRuleMMPackage init() {
		if (isInited) return (Petrinets2WayRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(Petrinets2WayRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetrinets2WayRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Petrinets2WayRuleMMPackageImpl thePetrinets2WayRuleMMPackage = registeredPetrinets2WayRuleMMPackage instanceof Petrinets2WayRuleMMPackageImpl ? (Petrinets2WayRuleMMPackageImpl)registeredPetrinets2WayRuleMMPackage : new Petrinets2WayRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Petrinets2WayDiffMMPackage.eNS_URI);
		Petrinets2WayDiffMMPackageImpl thePetrinets2WayDiffMMPackage = (Petrinets2WayDiffMMPackageImpl)(registeredPackage instanceof Petrinets2WayDiffMMPackageImpl ? registeredPackage : Petrinets2WayDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinets2WayRuleMMPackage.createPackageContents();
		thePetrinets2WayDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinets2WayRuleMMPackage.initializePackageContents();
		thePetrinets2WayDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinets2WayRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinets2WayRuleMMPackage.eNS_URI, thePetrinets2WayRuleMMPackage);
		return thePetrinets2WayRuleMMPackage;
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
	public EAttribute getPattern_NamedElement_Filter() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_NamedElement_IsForbidden() {
		return (EAttribute)pattern_NamedElementEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_PetriNet_ID_Pattern() {
		return (EAttribute)pattern_PetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PetriNet_Filter() {
		return (EAttribute)pattern_PetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PetriNet_IsForbidden() {
		return (EAttribute)pattern_PetriNetEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Place_ID_Pattern() {
		return (EAttribute)pattern_PlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Place_Filter() {
		return (EAttribute)pattern_PlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Place_IsForbidden() {
		return (EAttribute)pattern_PlaceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Transition_ID_Pattern() {
		return (EAttribute)pattern_TransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Transition_Filter() {
		return (EAttribute)pattern_TransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Transition_IsForbidden() {
		return (EAttribute)pattern_TransitionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticObject_Filter() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_IsForbidden() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticDiff_ID_Pattern() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_Filter() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_IsForbidden() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticConflict_ID_Pattern() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Filter() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_IsForbidden() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPetriNet_ID_Pattern() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_Filter() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_IsForbidden() {
		return (EAttribute)pattern_DiffPetriNetEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPetriNet_places_Filter() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_places_IsForbidden() {
		return (EAttribute)pattern_DiffPetriNet_placesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPetriNet_transitions_Filter() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPetriNet_transitions_IsForbidden() {
		return (EAttribute)pattern_DiffPetriNet_transitionsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPlace_ID_Pattern() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_Filter() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_IsForbidden() {
		return (EAttribute)pattern_DiffPlaceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPlace_transitions_Filter() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPlace_transitions_IsForbidden() {
		return (EAttribute)pattern_DiffPlace_transitionsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffTransition_ID_Pattern() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_Filter() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_IsForbidden() {
		return (EAttribute)pattern_DiffTransitionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffTransition_places_Filter() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffTransition_places_IsForbidden() {
		return (EAttribute)pattern_DiffTransition_placesEClass.getEStructuralFeatures().get(2);
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
	public EReference getRule_RulePattern_DiffPetriNet() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPetriNet_places() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPetriNet_transitions() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPlace() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPlace_transitions() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffTransition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffTransition_places() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_NamedElement() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinets2WayRuleMMFactory getPetrinets2WayRuleMMFactory() {
		return (Petrinets2WayRuleMMFactory)getEFactoryInstance();
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
		pattern_NamedElementEClass = createEClass(PATTERN_NAMED_ELEMENT);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__FILTER);
		createEAttribute(pattern_NamedElementEClass, PATTERN_NAMED_ELEMENT__IS_FORBIDDEN);

		pattern_PetriNetEClass = createEClass(PATTERN_PETRI_NET);
		createEAttribute(pattern_PetriNetEClass, PATTERN_PETRI_NET__ID_PATTERN);
		createEAttribute(pattern_PetriNetEClass, PATTERN_PETRI_NET__FILTER);
		createEAttribute(pattern_PetriNetEClass, PATTERN_PETRI_NET__IS_FORBIDDEN);

		pattern_PlaceEClass = createEClass(PATTERN_PLACE);
		createEAttribute(pattern_PlaceEClass, PATTERN_PLACE__ID_PATTERN);
		createEAttribute(pattern_PlaceEClass, PATTERN_PLACE__FILTER);
		createEAttribute(pattern_PlaceEClass, PATTERN_PLACE__IS_FORBIDDEN);

		pattern_TransitionEClass = createEClass(PATTERN_TRANSITION);
		createEAttribute(pattern_TransitionEClass, PATTERN_TRANSITION__ID_PATTERN);
		createEAttribute(pattern_TransitionEClass, PATTERN_TRANSITION__FILTER);
		createEAttribute(pattern_TransitionEClass, PATTERN_TRANSITION__IS_FORBIDDEN);

		pattern_SemanticObjectEClass = createEClass(PATTERN_SEMANTIC_OBJECT);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__ID_PATTERN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__FILTER);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN);

		pattern_SemanticDiffEClass = createEClass(PATTERN_SEMANTIC_DIFF);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__FILTER);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN);

		pattern_SemanticConflictEClass = createEClass(PATTERN_SEMANTIC_CONFLICT);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__ID_PATTERN);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__FILTER);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN);

		pattern_DiffPetriNetEClass = createEClass(PATTERN_DIFF_PETRI_NET);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__ID_PATTERN);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__FILTER);
		createEAttribute(pattern_DiffPetriNetEClass, PATTERN_DIFF_PETRI_NET__IS_FORBIDDEN);

		pattern_DiffPetriNet_placesEClass = createEClass(PATTERN_DIFF_PETRI_NET_PLACES);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__FILTER);
		createEAttribute(pattern_DiffPetriNet_placesEClass, PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN);

		pattern_DiffPetriNet_transitionsEClass = createEClass(PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__ID_PATTERN);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER);
		createEAttribute(pattern_DiffPetriNet_transitionsEClass, PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN);

		pattern_DiffPlaceEClass = createEClass(PATTERN_DIFF_PLACE);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__ID_PATTERN);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__FILTER);
		createEAttribute(pattern_DiffPlaceEClass, PATTERN_DIFF_PLACE__IS_FORBIDDEN);

		pattern_DiffPlace_transitionsEClass = createEClass(PATTERN_DIFF_PLACE_TRANSITIONS);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__ID_PATTERN);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__FILTER);
		createEAttribute(pattern_DiffPlace_transitionsEClass, PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN);

		pattern_DiffTransitionEClass = createEClass(PATTERN_DIFF_TRANSITION);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__ID_PATTERN);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__FILTER);
		createEAttribute(pattern_DiffTransitionEClass, PATTERN_DIFF_TRANSITION__IS_FORBIDDEN);

		pattern_DiffTransition_placesEClass = createEClass(PATTERN_DIFF_TRANSITION_PLACES);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__FILTER);
		createEAttribute(pattern_DiffTransition_placesEClass, PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEAttribute(ruleEClass, RULE__PRIORITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PETRI_NET);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PLACE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_TRANSITION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_NAMED_ELEMENT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_SEMANTIC_OBJECT);
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

		// Obtain other dependent packages
		Petrinets2WayDiffMMPackage thePetrinets2WayDiffMMPackage = (Petrinets2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Petrinets2WayDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_NamedElementEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getNamedElement());
		pattern_PetriNetEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getPetriNet());
		pattern_PlaceEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getPlace());
		pattern_TransitionEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getTransition());
		pattern_SemanticObjectEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getSemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getSemanticDiff());
		pattern_SemanticConflictEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getSemanticConflict());
		pattern_DiffPetriNetEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffPetriNet());
		pattern_DiffPetriNet_placesEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffPetriNet_places());
		pattern_DiffPetriNet_transitionsEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffPetriNet_transitions());
		pattern_DiffPlaceEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffPlace());
		pattern_DiffPlace_transitionsEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffPlace_transitions());
		pattern_DiffTransitionEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffTransition());
		pattern_DiffTransition_placesEClass.getESuperTypes().add(thePetrinets2WayDiffMMPackage.getDiffTransition_places());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_NamedElementEClass, Pattern_NamedElement.class, "Pattern_NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_NamedElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_NamedElement_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_NamedElement_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PetriNetEClass, Pattern_PetriNet.class, "Pattern_PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_PetriNet_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PetriNet_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PetriNet_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PlaceEClass, Pattern_Place.class, "Pattern_Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Place_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Place_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Place_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_TransitionEClass, Pattern_Transition.class, "Pattern_Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Transition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Transition_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Transition_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticObjectEClass, Pattern_SemanticObject.class, "Pattern_SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticDiffEClass, Pattern_SemanticDiff.class, "Pattern_SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticConflictEClass, Pattern_SemanticConflict.class, "Pattern_SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticConflict_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPetriNetEClass, Pattern_DiffPetriNet.class, "Pattern_DiffPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPetriNet_placesEClass, Pattern_DiffPetriNet_places.class, "Pattern_DiffPetriNet_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_places_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_places_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPetriNet_transitionsEClass, Pattern_DiffPetriNet_transitions.class, "Pattern_DiffPetriNet_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPetriNet_transitions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPetriNet_transitions_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlaceEClass, Pattern_DiffPlace.class, "Pattern_DiffPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlace_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPlace_transitionsEClass, Pattern_DiffPlace_transitions.class, "Pattern_DiffPlace_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPlace_transitions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPlace_transitions_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffTransitionEClass, Pattern_DiffTransition.class, "Pattern_DiffTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffTransition_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffTransition_placesEClass, Pattern_DiffTransition_places.class, "Pattern_DiffTransition_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffTransition_places_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffTransition_places_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPetriNet(), thePetrinets2WayDiffMMPackage.getDiffPetriNet(), null, "rulePattern_DiffPetriNet", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPetriNet_places(), thePetrinets2WayDiffMMPackage.getDiffPetriNet_places(), null, "rulePattern_DiffPetriNet_places", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPetriNet_transitions(), thePetrinets2WayDiffMMPackage.getDiffPetriNet_transitions(), null, "rulePattern_DiffPetriNet_transitions", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPlace(), thePetrinets2WayDiffMMPackage.getDiffPlace(), null, "rulePattern_DiffPlace", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPlace_transitions(), thePetrinets2WayDiffMMPackage.getDiffPlace_transitions(), null, "rulePattern_DiffPlace_transitions", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffTransition(), thePetrinets2WayDiffMMPackage.getDiffTransition(), null, "rulePattern_DiffTransition", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffTransition_places(), thePetrinets2WayDiffMMPackage.getDiffTransition_places(), null, "rulePattern_DiffTransition_places", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_NamedElement(), thePetrinets2WayDiffMMPackage.getNamedElement(), null, "rulePattern_NamedElement", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_SemanticObject(), thePetrinets2WayDiffMMPackage.getSemanticObject(), null, "rulePattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Petrinets2WayRuleMMPackageImpl
