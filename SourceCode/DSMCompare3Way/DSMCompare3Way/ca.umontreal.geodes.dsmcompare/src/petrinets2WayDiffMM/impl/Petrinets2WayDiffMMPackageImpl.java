/**
 */
package petrinets2WayDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinets2WayDiffMM.DiffKind;
import petrinets2WayDiffMM.DiffPetriNet;
import petrinets2WayDiffMM.DiffPetriNet_places;
import petrinets2WayDiffMM.DiffPetriNet_transitions;
import petrinets2WayDiffMM.DiffPlace;
import petrinets2WayDiffMM.DiffPlace_transitions;
import petrinets2WayDiffMM.DiffTransition;
import petrinets2WayDiffMM.DiffTransition_places;
import petrinets2WayDiffMM.NamedElement;
import petrinets2WayDiffMM.PetriNet;
import petrinets2WayDiffMM.Petrinets2WayDiffMMFactory;
import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;
import petrinets2WayDiffMM.Place;
import petrinets2WayDiffMM.SemanticConflict;
import petrinets2WayDiffMM.SemanticDiff;
import petrinets2WayDiffMM.SemanticObject;
import petrinets2WayDiffMM.Transition;
import petrinets2WayRuleMM.Petrinets2WayRuleMMPackage;
import petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinets2WayDiffMMPackageImpl extends EPackageImpl implements Petrinets2WayDiffMMPackage {
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
	private EClass transitionEClass = null;

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
	private EClass semanticDiffEClass = null;

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
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinets2WayDiffMMPackageImpl() {
		super(eNS_URI, Petrinets2WayDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinets2WayDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinets2WayDiffMMPackage init() {
		if (isInited) return (Petrinets2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Petrinets2WayDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPetrinets2WayDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Petrinets2WayDiffMMPackageImpl thePetrinets2WayDiffMMPackage = registeredPetrinets2WayDiffMMPackage instanceof Petrinets2WayDiffMMPackageImpl ? (Petrinets2WayDiffMMPackageImpl)registeredPetrinets2WayDiffMMPackage : new Petrinets2WayDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Petrinets2WayRuleMMPackage.eNS_URI);
		Petrinets2WayRuleMMPackageImpl thePetrinets2WayRuleMMPackage = (Petrinets2WayRuleMMPackageImpl)(registeredPackage instanceof Petrinets2WayRuleMMPackageImpl ? registeredPackage : Petrinets2WayRuleMMPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinets2WayDiffMMPackage.createPackageContents();
		thePetrinets2WayRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinets2WayDiffMMPackage.initializePackageContents();
		thePetrinets2WayRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinets2WayDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinets2WayDiffMMPackage.eNS_URI, thePetrinets2WayDiffMMPackage);
		return thePetrinets2WayDiffMMPackage;
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
	public EClass getSemanticDiff() {
		return semanticDiffEClass;
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
	public EReference getSemanticConflict_Semanticdiffs() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDiffPetriNet_Diff_kind() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_id() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPetriNet_New_name() {
		return (EAttribute)diffPetriNetEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDiffPetriNet_places_Diff_kind() {
		return (EAttribute)diffPetriNet_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPetriNet_places_EType() {
		return (EReference)diffPetriNet_placesEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffPetriNet_transitions_Diff_kind() {
		return (EAttribute)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPetriNet_transitions_EType() {
		return (EReference)diffPetriNet_transitionsEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffPlace_Diff_kind() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_id() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_name() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPlace_New_tokens() {
		return (EAttribute)diffPlaceEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDiffPlace_transitions_Diff_kind() {
		return (EAttribute)diffPlace_transitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPlace_transitions_EType() {
		return (EReference)diffPlace_transitionsEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffTransition_Diff_kind() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_id() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffTransition_New_name() {
		return (EAttribute)diffTransitionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDiffTransition_places_Diff_kind() {
		return (EAttribute)diffTransition_placesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffTransition_places_EType() {
		return (EReference)diffTransition_placesEClass.getEStructuralFeatures().get(1);
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
	public Petrinets2WayDiffMMFactory getPetrinets2WayDiffMMFactory() {
		return (Petrinets2WayDiffMMFactory)getEFactoryInstance();
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

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__PLACES);
		createEReference(transitionEClass, TRANSITION__DIFFPLACES);

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

		semanticDiffEClass = createEClass(SEMANTIC_DIFF);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTICDIFFS);

		diffPetriNetEClass = createEClass(DIFF_PETRI_NET);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__DIFF_KIND);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_ID);
		createEAttribute(diffPetriNetEClass, DIFF_PETRI_NET__NEW_NAME);

		diffPetriNet_placesEClass = createEClass(DIFF_PETRI_NET_PLACES);
		createEAttribute(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__DIFF_KIND);
		createEReference(diffPetriNet_placesEClass, DIFF_PETRI_NET_PLACES__ETYPE);

		diffPetriNet_transitionsEClass = createEClass(DIFF_PETRI_NET_TRANSITIONS);
		createEAttribute(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND);
		createEReference(diffPetriNet_transitionsEClass, DIFF_PETRI_NET_TRANSITIONS__ETYPE);

		diffPlaceEClass = createEClass(DIFF_PLACE);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__DIFF_KIND);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_ID);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_NAME);
		createEAttribute(diffPlaceEClass, DIFF_PLACE__NEW_TOKENS);

		diffPlace_transitionsEClass = createEClass(DIFF_PLACE_TRANSITIONS);
		createEAttribute(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__DIFF_KIND);
		createEReference(diffPlace_transitionsEClass, DIFF_PLACE_TRANSITIONS__ETYPE);

		diffTransitionEClass = createEClass(DIFF_TRANSITION);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__DIFF_KIND);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_ID);
		createEAttribute(diffTransitionEClass, DIFF_TRANSITION__NEW_NAME);

		diffTransition_placesEClass = createEClass(DIFF_TRANSITION_PLACES);
		createEAttribute(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__DIFF_KIND);
		createEReference(diffTransition_placesEClass, DIFF_TRANSITION_PLACES__ETYPE);

		// Create enums
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
		petriNetEClass.getESuperTypes().add(this.getNamedElement());
		placeEClass.getESuperTypes().add(this.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		semanticDiffEClass.getESuperTypes().add(this.getSemanticObject());
		semanticConflictEClass.getESuperTypes().add(this.getSemanticObject());
		diffPetriNetEClass.getESuperTypes().add(this.getPetriNet());
		diffPlaceEClass.getESuperTypes().add(this.getPlace());
		diffTransitionEClass.getESuperTypes().add(this.getTransition());

		// Initialize classes, features, and operations; add parameters
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

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Places(), this.getPlace(), null, "places", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Diffplaces(), this.getDiffTransition_places(), null, "diffplaces", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(semanticDiffEClass, SemanticDiff.class, "SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticConflict_Semanticdiffs(), this.getSemanticDiff(), null, "semanticdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diffPetriNetEClass, DiffPetriNet.class, "DiffPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_id(), ecorePackage.getEInt(), "new_id", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPetriNet_New_name(), ecorePackage.getEString(), "new_name", null, 1, 1, DiffPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPetriNet_placesEClass, DiffPetriNet_places.class, "DiffPetriNet_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_places_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPetriNet_places_EType(), this.getPlace(), null, "eType", null, 1, 1, DiffPetriNet_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPetriNet_transitionsEClass, DiffPetriNet_transitions.class, "DiffPetriNet_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPetriNet_transitions_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPetriNet_transitions_EType(), this.getTransition(), null, "eType", null, 1, 1, DiffPetriNet_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlaceEClass, DiffPlace.class, "DiffPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlace_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_id(), ecorePackage.getEInt(), "new_id", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_name(), ecorePackage.getEString(), "new_name", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPlace_New_tokens(), ecorePackage.getEInt(), "new_tokens", null, 1, 1, DiffPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPlace_transitionsEClass, DiffPlace_transitions.class, "DiffPlace_transitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPlace_transitions_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPlace_transitions_EType(), this.getTransition(), null, "eType", null, 1, 1, DiffPlace_transitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffTransitionEClass, DiffTransition.class, "DiffTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffTransition_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_id(), ecorePackage.getEInt(), "new_id", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffTransition_New_name(), ecorePackage.getEString(), "new_name", null, 1, 1, DiffTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffTransition_placesEClass, DiffTransition_places.class, "DiffTransition_places", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffTransition_places_Diff_kind(), this.getDiffKind(), "diff_kind", "NON", 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffTransition_places_EType(), this.getPlace(), null, "eType", null, 1, 1, DiffTransition_places.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(diffKindEEnum, DiffKind.class, "DiffKind");
		addEEnumLiteral(diffKindEEnum, DiffKind.NON);
		addEEnumLiteral(diffKindEEnum, DiffKind.ADD);
		addEEnumLiteral(diffKindEEnum, DiffKind.DELETE);
		addEEnumLiteral(diffKindEEnum, DiffKind.MODIFY);

		// Create resource
		createResource(eNS_URI);
	}

} //Petrinets2WayDiffMMPackageImpl
