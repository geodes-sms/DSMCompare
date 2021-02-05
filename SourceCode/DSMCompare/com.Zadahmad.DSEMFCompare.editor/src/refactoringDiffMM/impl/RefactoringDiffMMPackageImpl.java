/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import refactoringDiffMM.AscOp;
import refactoringDiffMM.ClassOp;
import refactoringDiffMM.DiffEAttribute;
import refactoringDiffMM.DiffEClass;
import refactoringDiffMM.DiffEClass_eattributes;
import refactoringDiffMM.DiffEClass_eoperations;
import refactoringDiffMM.DiffEClass_ereferences;
import refactoringDiffMM.DiffEClass_esupertypes;
import refactoringDiffMM.DiffEOperation;
import refactoringDiffMM.DiffEPackage;
import refactoringDiffMM.DiffEPackage_domainspecificdiffs;
import refactoringDiffMM.DiffEPackage_eclassifiers;
import refactoringDiffMM.DiffEReference;
import refactoringDiffMM.DomainSpecificDiff;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringRuleMM.RefactoringRuleMMPackage;
import refactoringRuleMM.impl.RefactoringRuleMMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringDiffMMPackageImpl extends EPackageImpl implements RefactoringDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eattributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eoperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_ereferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_esupertypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_eclassifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascOpEEnum = null;

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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringDiffMMPackageImpl() {
		super(eNS_URI, RefactoringDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringDiffMMPackage init() {
		if (isInited) return (RefactoringDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoringDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefactoringDiffMMPackageImpl theRefactoringDiffMMPackage = registeredRefactoringDiffMMPackage instanceof RefactoringDiffMMPackageImpl ? (RefactoringDiffMMPackageImpl)registeredRefactoringDiffMMPackage : new RefactoringDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RefactoringRuleMMPackage.eNS_URI);
		RefactoringRuleMMPackageImpl theRefactoringRuleMMPackage = (RefactoringRuleMMPackageImpl)(registeredPackage instanceof RefactoringRuleMMPackageImpl ? registeredPackage : RefactoringRuleMMPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoringDiffMMPackage.createPackageContents();
		theRefactoringRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringDiffMMPackage.initializePackageContents();
		theRefactoringRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringDiffMMPackage.eNS_URI, theRefactoringDiffMMPackage);
		return theRefactoringDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEAttribute_Name() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEAttribute_Etype() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClass_Name() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Eattributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Eoperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Ereferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Esupertypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Diffeattributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Diffeoperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Differeferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Diffesupertypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEOperation() {
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEOperation_Eparameters() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEOperation_Name() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEOperation_Etype() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Eclassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEPackage_Name() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Domainspecificdiffs() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Diffeclassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Diffdomainspecificdiffs() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEReference_Name() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEReference_Etype() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainSpecificDiff() {
		return domainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecificDiff_Name() {
		return (EAttribute)domainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EAttribute() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EClass() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EOperation() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EReference() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAttribute() {
		return diffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_Operation() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_name() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_etype() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass() {
		return diffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_Operation() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_name() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eattributes() {
		return diffEClass_eattributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eattributes_Operation() {
		return (EAttribute)diffEClass_eattributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eattributes_EType() {
		return (EReference)diffEClass_eattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eoperations() {
		return diffEClass_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eoperations_Operation() {
		return (EAttribute)diffEClass_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eoperations_EType() {
		return (EReference)diffEClass_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_ereferences() {
		return diffEClass_ereferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_ereferences_Operation() {
		return (EAttribute)diffEClass_ereferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_ereferences_EType() {
		return (EReference)diffEClass_ereferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_esupertypes() {
		return diffEClass_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_esupertypes_Operation() {
		return (EAttribute)diffEClass_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_esupertypes_EType() {
		return (EReference)diffEClass_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation() {
		return diffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_Operation() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_eparameters() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_name() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_etype() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage() {
		return diffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_Operation() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_New_name() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_eclassifiers() {
		return diffEPackage_eclassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_eclassifiers_Operation() {
		return (EAttribute)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_eclassifiers_EType() {
		return (EReference)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_domainspecificdiffs() {
		return diffEPackage_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_domainspecificdiffs_Operation() {
		return (EAttribute)diffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_domainspecificdiffs_EType() {
		return (EReference)diffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEReference() {
		return diffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_Operation() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_name() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_etype() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClassOp() {
		return classOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAscOp() {
		return ascOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringDiffMMFactory getRefactoringDiffMMFactory() {
		return (RefactoringDiffMMFactory)getEFactoryInstance();
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
		eAttributeEClass = createEClass(EATTRIBUTE);
		createEAttribute(eAttributeEClass, EATTRIBUTE__NAME);
		createEAttribute(eAttributeEClass, EATTRIBUTE__ETYPE);

		eClassEClass = createEClass(ECLASS);
		createEAttribute(eClassEClass, ECLASS__NAME);
		createEReference(eClassEClass, ECLASS__EATTRIBUTES);
		createEReference(eClassEClass, ECLASS__EOPERATIONS);
		createEReference(eClassEClass, ECLASS__EREFERENCES);
		createEReference(eClassEClass, ECLASS__ESUPERTYPES);
		createEReference(eClassEClass, ECLASS__DIFFEATTRIBUTES);
		createEReference(eClassEClass, ECLASS__DIFFEOPERATIONS);
		createEReference(eClassEClass, ECLASS__DIFFEREFERENCES);
		createEReference(eClassEClass, ECLASS__DIFFESUPERTYPES);

		eOperationEClass = createEClass(EOPERATION);
		createEAttribute(eOperationEClass, EOPERATION__EPARAMETERS);
		createEAttribute(eOperationEClass, EOPERATION__NAME);
		createEAttribute(eOperationEClass, EOPERATION__ETYPE);

		ePackageEClass = createEClass(EPACKAGE);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);
		createEAttribute(ePackageEClass, EPACKAGE__NAME);
		createEReference(ePackageEClass, EPACKAGE__DOMAINSPECIFICDIFFS);
		createEReference(ePackageEClass, EPACKAGE__DIFFECLASSIFIERS);
		createEReference(ePackageEClass, EPACKAGE__DIFFDOMAINSPECIFICDIFFS);

		eReferenceEClass = createEClass(EREFERENCE);
		createEAttribute(eReferenceEClass, EREFERENCE__NAME);
		createEAttribute(eReferenceEClass, EREFERENCE__ETYPE);

		domainSpecificDiffEClass = createEClass(DOMAIN_SPECIFIC_DIFF);
		createEAttribute(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__NAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE);

		diffEAttributeEClass = createEClass(DIFF_EATTRIBUTE);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__OPERATION);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_NAME);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_ETYPE);

		diffEClassEClass = createEClass(DIFF_ECLASS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__OPERATION);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_NAME);

		diffEClass_eattributesEClass = createEClass(DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__OPERATION);
		createEReference(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__ETYPE);

		diffEClass_eoperationsEClass = createEClass(DIFF_ECLASS_EOPERATIONS);
		createEAttribute(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__OPERATION);
		createEReference(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__ETYPE);

		diffEClass_ereferencesEClass = createEClass(DIFF_ECLASS_EREFERENCES);
		createEAttribute(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__OPERATION);
		createEReference(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__ETYPE);

		diffEClass_esupertypesEClass = createEClass(DIFF_ECLASS_ESUPERTYPES);
		createEAttribute(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__OPERATION);
		createEReference(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__ETYPE);

		diffEOperationEClass = createEClass(DIFF_EOPERATION);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__OPERATION);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_EPARAMETERS);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_NAME);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_ETYPE);

		diffEPackageEClass = createEClass(DIFF_EPACKAGE);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__OPERATION);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__NEW_NAME);

		diffEPackage_eclassifiersEClass = createEClass(DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__OPERATION);
		createEReference(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__ETYPE);

		diffEPackage_domainspecificdiffsEClass = createEClass(DIFF_EPACKAGE_DOMAINSPECIFICDIFFS);
		createEAttribute(diffEPackage_domainspecificdiffsEClass, DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION);
		createEReference(diffEPackage_domainspecificdiffsEClass, DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE);

		diffEReferenceEClass = createEClass(DIFF_EREFERENCE);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__OPERATION);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_NAME);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_ETYPE);

		// Create enums
		classOpEEnum = createEEnum(CLASS_OP);
		ascOpEEnum = createEEnum(ASC_OP);
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
		diffEAttributeEClass.getESuperTypes().add(this.getEAttribute());
		diffEClassEClass.getESuperTypes().add(this.getEClass());
		diffEOperationEClass.getESuperTypes().add(this.getEOperation());
		diffEPackageEClass.getESuperTypes().add(this.getEPackage());
		diffEReferenceEClass.getESuperTypes().add(this.getEReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAttributeEClass, refactoringDiffMM.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAttribute_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, refactoringDiffMM.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, refactoringDiffMM.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Eattributes(), this.getEAttribute(), null, "eattributes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Eoperations(), this.getEOperation(), null, "eoperations", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Ereferences(), this.getEReference(), null, "ereferences", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Esupertypes(), this.getEClass(), null, "esupertypes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffeattributes(), this.getDiffEClass_eattributes(), null, "diffeattributes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffeoperations(), this.getDiffEClass_eoperations(), null, "diffeoperations", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Differeferences(), this.getDiffEClass_ereferences(), null, "differeferences", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffesupertypes(), this.getDiffEClass_esupertypes(), null, "diffesupertypes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eOperationEClass, EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEOperation_Eparameters(), ecorePackage.getEString(), "eparameters", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePackageEClass, refactoringDiffMM.EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPackage_Eclassifiers(), this.getEClass(), null, "eclassifiers", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_Domainspecificdiffs(), this.getDomainSpecificDiff(), null, "domainspecificdiffs", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_Diffeclassifiers(), this.getDiffEPackage_eclassifiers(), null, "diffeclassifiers", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_Diffdomainspecificdiffs(), this.getDiffEPackage_domainspecificdiffs(), null, "diffdomainspecificdiffs", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceEClass, refactoringDiffMM.EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, refactoringDiffMM.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificDiffEClass, DomainSpecificDiff.class, "DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificDiff_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_EAttribute(), this.getEAttribute(), null, "DomainSpecificDiff_EAttribute", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_EClass(), this.getEClass(), null, "DomainSpecificDiff_EClass", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_EOperation(), this.getEOperation(), null, "DomainSpecificDiff_EOperation", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_EReference(), this.getEReference(), null, "DomainSpecificDiff_EReference", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEAttributeEClass, DiffEAttribute.class, "DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEAttribute_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_etype(), ecorePackage.getEString(), "new_etype", null, 0, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClassEClass, DiffEClass.class, "DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_eattributesEClass, DiffEClass_eattributes.class, "DiffEClass_eattributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_eattributes_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_eattributes_EType(), this.getEAttribute(), null, "eType", null, 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_eoperationsEClass, DiffEClass_eoperations.class, "DiffEClass_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_eoperations_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_eoperations_EType(), this.getEOperation(), null, "eType", null, 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_ereferencesEClass, DiffEClass_ereferences.class, "DiffEClass_ereferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_ereferences_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_ereferences_EType(), this.getEReference(), null, "eType", null, 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_esupertypesEClass, DiffEClass_esupertypes.class, "DiffEClass_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_esupertypes_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_esupertypes_EType(), this.getEClass(), null, "eType", null, 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEOperationEClass, DiffEOperation.class, "DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEOperation_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_eparameters(), ecorePackage.getEString(), "new_eparameters", null, 0, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_etype(), ecorePackage.getEString(), "new_etype", null, 0, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackageEClass, DiffEPackage.class, "DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackage_eclassifiersEClass, DiffEPackage_eclassifiers.class, "DiffEPackage_eclassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_eclassifiers_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEPackage_eclassifiers_EType(), this.getEClass(), null, "eType", null, 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackage_domainspecificdiffsEClass, DiffEPackage_domainspecificdiffs.class, "DiffEPackage_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_domainspecificdiffs_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEPackage_domainspecificdiffs_EType(), this.getDomainSpecificDiff(), null, "eType", null, 1, 1, DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEReferenceEClass, DiffEReference.class, "DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEReference_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_name(), ecorePackage.getEString(), "new_name", null, 0, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_etype(), ecorePackage.getEString(), "new_etype", null, 0, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classOpEEnum, ClassOp.class, "ClassOp");
		addEEnumLiteral(classOpEEnum, ClassOp.ADD);
		addEEnumLiteral(classOpEEnum, ClassOp.DELETE);
		addEEnumLiteral(classOpEEnum, ClassOp.MODIFY);

		initEEnum(ascOpEEnum, AscOp.class, "AscOp");
		addEEnumLiteral(ascOpEEnum, AscOp.ADD);
		addEEnumLiteral(ascOpEEnum, AscOp.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringDiffMMPackageImpl
