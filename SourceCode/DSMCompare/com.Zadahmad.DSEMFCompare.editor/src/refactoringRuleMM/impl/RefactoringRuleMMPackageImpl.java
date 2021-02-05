/**
 */
package refactoringRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import refactoringDiffMM.RefactoringDiffMMPackage;

import refactoringDiffMM.impl.RefactoringDiffMMPackageImpl;

import refactoringRuleMM.Pattern_DiffEAttribute;
import refactoringRuleMM.Pattern_DiffEClass;
import refactoringRuleMM.Pattern_DiffEClass_eattributes;
import refactoringRuleMM.Pattern_DiffEClass_eoperations;
import refactoringRuleMM.Pattern_DiffEClass_ereferences;
import refactoringRuleMM.Pattern_DiffEClass_esupertypes;
import refactoringRuleMM.Pattern_DiffEOperation;
import refactoringRuleMM.Pattern_DiffEPackage;
import refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs;
import refactoringRuleMM.Pattern_DiffEPackage_eclassifiers;
import refactoringRuleMM.Pattern_DiffEReference;
import refactoringRuleMM.Pattern_DomainSpecificDiff;
import refactoringRuleMM.Pattern_EAttribute;
import refactoringRuleMM.Pattern_EClass;
import refactoringRuleMM.Pattern_EOperation;
import refactoringRuleMM.Pattern_EPackage;
import refactoringRuleMM.Pattern_EReference;
import refactoringRuleMM.RefactoringRuleMMFactory;
import refactoringRuleMM.RefactoringRuleMMPackage;
import refactoringRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringRuleMMPackageImpl extends EPackageImpl implements RefactoringRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DomainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eattributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eoperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_ereferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_esupertypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_eclassifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEReferenceEClass = null;

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
	 * @see refactoringRuleMM.RefactoringRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringRuleMMPackageImpl() {
		super(eNS_URI, RefactoringRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringRuleMMPackage init() {
		if (isInited) return (RefactoringRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoringRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefactoringRuleMMPackageImpl theRefactoringRuleMMPackage = registeredRefactoringRuleMMPackage instanceof RefactoringRuleMMPackageImpl ? (RefactoringRuleMMPackageImpl)registeredRefactoringRuleMMPackage : new RefactoringRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RefactoringDiffMMPackage.eNS_URI);
		RefactoringDiffMMPackageImpl theRefactoringDiffMMPackage = (RefactoringDiffMMPackageImpl)(registeredPackage instanceof RefactoringDiffMMPackageImpl ? registeredPackage : RefactoringDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoringRuleMMPackage.createPackageContents();
		theRefactoringDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringRuleMMPackage.initializePackageContents();
		theRefactoringDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringRuleMMPackage.eNS_URI, theRefactoringRuleMMPackage);
		return theRefactoringRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EAttribute() {
		return pattern_EAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAttribute_ID_Pattern() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAttribute_Filter() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EClass() {
		return pattern_EClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClass_ID_Pattern() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClass_Filter() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EOperation() {
		return pattern_EOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EOperation_ID_Pattern() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EOperation_Filter() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EPackage() {
		return pattern_EPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EPackage_ID_Pattern() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EPackage_Filter() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EReference() {
		return pattern_EReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EReference_ID_Pattern() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EReference_Filter() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DomainSpecificDiff() {
		return pattern_DomainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_ID_Pattern() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_Filter() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAttribute() {
		return pattern_DiffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_ID_Pattern() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_Filter() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass() {
		return pattern_DiffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_ID_Pattern() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_Filter() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eattributes() {
		return pattern_DiffEClass_eattributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eattributes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eattributes_Filter() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eoperations() {
		return pattern_DiffEClass_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eoperations_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eoperations_Filter() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_ereferences() {
		return pattern_DiffEClass_ereferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_ereferences_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_ereferences_Filter() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_esupertypes() {
		return pattern_DiffEClass_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_esupertypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_esupertypes_Filter() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation() {
		return pattern_DiffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_Filter() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage() {
		return pattern_DiffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_Filter() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_eclassifiers() {
		return pattern_DiffEPackage_eclassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eclassifiers_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eclassifiers_Filter() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_domainspecificdiffs() {
		return pattern_DiffEPackage_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_domainspecificdiffs_Filter() {
		return (EAttribute)pattern_DiffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEReference() {
		return pattern_DiffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_ID_Pattern() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_Filter() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Pattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringRuleMMFactory getRefactoringRuleMMFactory() {
		return (RefactoringRuleMMFactory)getEFactoryInstance();
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
		pattern_EAttributeEClass = createEClass(PATTERN_EATTRIBUTE);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__FILTER);

		pattern_EClassEClass = createEClass(PATTERN_ECLASS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__ID_PATTERN);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__FILTER);

		pattern_EOperationEClass = createEClass(PATTERN_EOPERATION);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__FILTER);

		pattern_EPackageEClass = createEClass(PATTERN_EPACKAGE);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__FILTER);

		pattern_EReferenceEClass = createEClass(PATTERN_EREFERENCE);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__FILTER);

		pattern_DomainSpecificDiffEClass = createEClass(PATTERN_DOMAIN_SPECIFIC_DIFF);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER);

		pattern_DiffEAttributeEClass = createEClass(PATTERN_DIFF_EATTRIBUTE);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__FILTER);

		pattern_DiffEClassEClass = createEClass(PATTERN_DIFF_ECLASS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__ID_PATTERN);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__FILTER);

		pattern_DiffEClass_eattributesEClass = createEClass(PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER);

		pattern_DiffEClass_eoperationsEClass = createEClass(PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER);

		pattern_DiffEClass_ereferencesEClass = createEClass(PATTERN_DIFF_ECLASS_EREFERENCES);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__FILTER);

		pattern_DiffEClass_esupertypesEClass = createEClass(PATTERN_DIFF_ECLASS_ESUPERTYPES);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER);

		pattern_DiffEOperationEClass = createEClass(PATTERN_DIFF_EOPERATION);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__FILTER);

		pattern_DiffEPackageEClass = createEClass(PATTERN_DIFF_EPACKAGE);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__FILTER);

		pattern_DiffEPackage_eclassifiersEClass = createEClass(PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER);

		pattern_DiffEPackage_domainspecificdiffsEClass = createEClass(PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS);
		createEAttribute(pattern_DiffEPackage_domainspecificdiffsEClass, PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_domainspecificdiffsEClass, PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER);

		pattern_DiffEReferenceEClass = createEClass(PATTERN_DIFF_EREFERENCE);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__FILTER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__PATTERN);
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
		RefactoringDiffMMPackage theRefactoringDiffMMPackage = (RefactoringDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_EAttributeEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getEAttribute());
		pattern_EClassEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getEClass());
		pattern_EOperationEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getEOperation());
		pattern_EPackageEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getEPackage());
		pattern_EReferenceEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getEReference());
		pattern_DomainSpecificDiffEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDomainSpecificDiff());
		pattern_DiffEAttributeEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEAttribute());
		pattern_DiffEClassEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEClass());
		pattern_DiffEClass_eattributesEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEClass_eattributes());
		pattern_DiffEClass_eoperationsEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEClass_eoperations());
		pattern_DiffEClass_ereferencesEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEClass_ereferences());
		pattern_DiffEClass_esupertypesEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEClass_esupertypes());
		pattern_DiffEOperationEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEOperation());
		pattern_DiffEPackageEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEPackage());
		pattern_DiffEPackage_eclassifiersEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEPackage_eclassifiers());
		pattern_DiffEPackage_domainspecificdiffsEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEPackage_domainspecificdiffs());
		pattern_DiffEReferenceEClass.getESuperTypes().add(theRefactoringDiffMMPackage.getDiffEReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_EAttributeEClass, Pattern_EAttribute.class, "Pattern_EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EClassEClass, Pattern_EClass.class, "Pattern_EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EOperationEClass, Pattern_EOperation.class, "Pattern_EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EPackageEClass, Pattern_EPackage.class, "Pattern_EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EReferenceEClass, Pattern_EReference.class, "Pattern_EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DomainSpecificDiffEClass, Pattern_DomainSpecificDiff.class, "Pattern_DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DomainSpecificDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DomainSpecificDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAttributeEClass, Pattern_DiffEAttribute.class, "Pattern_DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassEClass, Pattern_DiffEClass.class, "Pattern_DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eattributesEClass, Pattern_DiffEClass_eattributes.class, "Pattern_DiffEClass_eattributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eattributes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eoperationsEClass, Pattern_DiffEClass_eoperations.class, "Pattern_DiffEClass_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eoperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_ereferencesEClass, Pattern_DiffEClass_ereferences.class, "Pattern_DiffEClass_ereferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ereferences_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_esupertypesEClass, Pattern_DiffEClass_esupertypes.class, "Pattern_DiffEClass_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_esupertypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperationEClass, Pattern_DiffEOperation.class, "Pattern_DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackageEClass, Pattern_DiffEPackage.class, "Pattern_DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eclassifiersEClass, Pattern_DiffEPackage_eclassifiers.class, "Pattern_DiffEPackage_eclassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_domainspecificdiffsEClass, Pattern_DiffEPackage_domainspecificdiffs.class, "Pattern_DiffEPackage_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_domainspecificdiffs_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReferenceEClass, Pattern_DiffEReference.class, "Pattern_DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pattern(), this.getPattern_EPackage(), null, "pattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringRuleMMPackageImpl
