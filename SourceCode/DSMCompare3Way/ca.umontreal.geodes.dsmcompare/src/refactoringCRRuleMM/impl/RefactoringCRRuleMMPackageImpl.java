/**
 */
package refactoringCRRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import refactoringCRRuleMM.ChangeStatus;
import refactoringCRRuleMM.ConflictGranularity;
import refactoringCRRuleMM.ConflictResolutionStrategy;
import refactoringCRRuleMM.ConflictResolutionType;
import refactoringCRRuleMM.DiffKind;
import refactoringCRRuleMM.Pattern_ConflictResolution;
import refactoringCRRuleMM.Pattern_DiffEAttribute;
import refactoringCRRuleMM.Pattern_DiffEClass;
import refactoringCRRuleMM.Pattern_DiffEClass_eattributes;
import refactoringCRRuleMM.Pattern_DiffEClass_eoperations;
import refactoringCRRuleMM.Pattern_DiffEClass_ereferences;
import refactoringCRRuleMM.Pattern_DiffEClass_esupertypes;
import refactoringCRRuleMM.Pattern_DiffEClass_interfaces;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_classes;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces;
import refactoringCRRuleMM.Pattern_DiffEOperation;
import refactoringCRRuleMM.Pattern_DiffEPackage;
import refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers;
import refactoringCRRuleMM.Pattern_DiffEPackage_interfaces;
import refactoringCRRuleMM.Pattern_DiffEPackage_test;
import refactoringCRRuleMM.Pattern_DiffEReference;
import refactoringCRRuleMM.Pattern_DiffInterface;
import refactoringCRRuleMM.Pattern_DiffInterface_eoperations;
import refactoringCRRuleMM.Pattern_DiffInterface_esupertypes;
import refactoringCRRuleMM.Pattern_DifftestAssociations;
import refactoringCRRuleMM.Pattern_DifftestAssociations_multi;
import refactoringCRRuleMM.Pattern_DifftestAssociations_single;
import refactoringCRRuleMM.Pattern_EAttribute;
import refactoringCRRuleMM.Pattern_EClass;
import refactoringCRRuleMM.Pattern_EOperation;
import refactoringCRRuleMM.Pattern_EPackage;
import refactoringCRRuleMM.Pattern_EReference;
import refactoringCRRuleMM.Pattern_Interface;
import refactoringCRRuleMM.Pattern_SemanticConflict;
import refactoringCRRuleMM.Pattern_SemanticDiff;
import refactoringCRRuleMM.Pattern_SemanticObject;
import refactoringCRRuleMM.Pattern_testAssociations;
import refactoringCRRuleMM.RefactoringCRRuleMMFactory;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;
import refactoringCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringCRRuleMMPackageImpl extends EPackageImpl implements RefactoringCRRuleMMPackage {
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
	private EClass pattern_DiffEClass_interfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_nested_classesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_nested_interfacesEClass = null;

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
	private EClass pattern_DiffEPackage_interfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_testEClass = null;

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
	private EClass pattern_DiffInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffInterface_eoperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffInterface_esupertypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DifftestAssociationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DifftestAssociations_multiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DifftestAssociations_singleEClass = null;

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
	private EClass pattern_InterfaceEClass = null;

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
	private EClass pattern_testAssociationsEClass = null;

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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefactoringCRRuleMMPackageImpl() {
		super(eNS_URI, RefactoringCRRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefactoringCRRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefactoringCRRuleMMPackage init() {
		if (isInited) return (RefactoringCRRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringCRRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoringCRRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefactoringCRRuleMMPackageImpl theRefactoringCRRuleMMPackage = registeredRefactoringCRRuleMMPackage instanceof RefactoringCRRuleMMPackageImpl ? (RefactoringCRRuleMMPackageImpl)registeredRefactoringCRRuleMMPackage : new RefactoringCRRuleMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRefactoringCRRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringCRRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoringCRRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefactoringCRRuleMMPackage.eNS_URI, theRefactoringCRRuleMMPackage);
		return theRefactoringCRRuleMMPackage;
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
	public EClass getPattern_DiffEAttribute() {
		return pattern_DiffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_Filter() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_IsMerged() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_ChangeStatus() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_New_name_Left() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_New_name_Right() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_NameChangeStatus() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_New_etype_Left() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_New_etype_Right() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_EtypeChangeStatus() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass() {
		return pattern_DiffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_Filter() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_IsMerged() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_name_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_name_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_NameChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_extends_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_extends_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ExtendsChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_implements_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_implements_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ImplementsChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_isAbstract_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_isAbstract_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_IsAbstractChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_packageName_Left() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_New_packageName_Right() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_PackageNameChangeStatus() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_eattributes() {
		return pattern_DiffEClass_eattributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_Filter() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_IsMerged() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_eattributes_EType() {
		return (EReference)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_eoperations() {
		return pattern_DiffEClass_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_Filter() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_IsMerged() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_eoperations_EType() {
		return (EReference)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_ereferences() {
		return pattern_DiffEClass_ereferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_Filter() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_IsMerged() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_ereferences_EType() {
		return (EReference)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_esupertypes() {
		return pattern_DiffEClass_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_Filter() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_IsMerged() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_esupertypes_EType() {
		return (EReference)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_interfaces() {
		return pattern_DiffEClass_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_Filter() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_IsMerged() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_interfaces_EType() {
		return (EReference)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_nested_classes() {
		return pattern_DiffEClass_nested_classesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_Filter() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_IsMerged() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_nested_classes_EType() {
		return (EReference)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEClass_nested_interfaces() {
		return pattern_DiffEClass_nested_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_ChangeStatus() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_Filter() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_IsMerged() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_Diff_Group() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEClass_nested_interfaces_EType() {
		return (EReference)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEOperation() {
		return pattern_DiffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_Filter() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_IsMerged() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_ChangeStatus() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_name_Left() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_name_Right() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_NameChangeStatus() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_eparameters_Left() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_eparameters_Right() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_EparametersChangeStatus() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_etype_Left() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_etype_Right() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_EtypeChangeStatus() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_methodBody_Left() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_New_methodBody_Right() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_MethodBodyChangeStatus() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEPackage() {
		return pattern_DiffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_Filter() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_IsMerged() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_ChangeStatus() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_New_name_Left() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_New_name_Right() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_NameChangeStatus() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEPackage_eclassifiers() {
		return pattern_DiffEPackage_eclassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_IsForbidden() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_ChangeStatus() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_Filter() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_IsMerged() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_Diff_Group() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEPackage_eclassifiers_EType() {
		return (EReference)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEPackage_interfaces() {
		return pattern_DiffEPackage_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_ChangeStatus() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_Filter() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_IsMerged() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_Diff_Group() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEPackage_interfaces_EType() {
		return (EReference)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEPackage_test() {
		return pattern_DiffEPackage_testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_IsForbidden() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_ChangeStatus() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_Filter() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_IsMerged() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_test_Diff_Group() {
		return (EAttribute)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEPackage_test_EType() {
		return (EReference)pattern_DiffEPackage_testEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEReference() {
		return pattern_DiffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_Filter() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_IsMerged() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_ChangeStatus() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_New_name_Left() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_New_name_Right() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_NameChangeStatus() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_New_etype_Left() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_New_etype_Right() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_EtypeChangeStatus() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInterface() {
		return pattern_DiffInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_Diff_kind_Left() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_Diff_kind_Right() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_Filter() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_IsMerged() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_ChangeStatus() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_name_Left() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_name_Right() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_NameChangeStatus() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_extends_Left() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_extends_Right() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_ExtendsChangeStatus() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_packageName_Left() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_New_packageName_Right() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_PackageNameChangeStatus() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInterface_eoperations() {
		return pattern_DiffInterface_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_ID_Pattern() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_IsForbidden() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_Diff_kind_Left() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_Diff_kind_Right() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_ChangeStatus() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_Filter() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_IsMerged() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_Diff_Group() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffInterface_eoperations_EType() {
		return (EReference)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffInterface_esupertypes() {
		return pattern_DiffInterface_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_ID_Pattern() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_IsForbidden() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_Diff_kind_Left() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_Diff_kind_Right() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_ChangeStatus() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_Filter() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_IsMerged() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_Diff_Group() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffInterface_esupertypes_EType() {
		return (EReference)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DifftestAssociations() {
		return pattern_DifftestAssociationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_Diff_kind_Left() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_Diff_kind_Right() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_Filter() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_IsMerged() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_ChangeStatus() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_New_name_Left() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_New_name_Right() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_NameChangeStatus() {
		return (EAttribute)pattern_DifftestAssociationsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DifftestAssociations_multi() {
		return pattern_DifftestAssociations_multiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_ID_Pattern() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_IsForbidden() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_Diff_kind_Left() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_Diff_kind_Right() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_ChangeStatus() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_Filter() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_IsMerged() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_multi_Diff_Group() {
		return (EAttribute)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DifftestAssociations_multi_EType() {
		return (EReference)pattern_DifftestAssociations_multiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DifftestAssociations_single() {
		return pattern_DifftestAssociations_singleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_ID_Pattern() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_IsForbidden() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_Diff_kind_Left() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_Diff_kind_Right() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_ChangeStatus() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_Filter() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_IsMerged() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DifftestAssociations_single_Diff_Group() {
		return (EAttribute)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DifftestAssociations_single_EType() {
		return (EReference)pattern_DifftestAssociations_singleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_EAttribute() {
		return pattern_EAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EAttribute_ID_Pattern() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EAttribute_IsForbidden() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EAttribute_Name() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EAttribute_Etype() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_EClass() {
		return pattern_EClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_ID_Pattern() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_IsForbidden() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_Name() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_Extends() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_Implements() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_IsAbstract() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_PackageName() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Eattributes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Eoperations() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Ereferences() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Esupertypes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Interfaces() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Nested_classes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Nested_interfaces() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffeattributes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffeoperations() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Differeferences() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffesupertypes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffinterfaces() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffnested_classes() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EClass_Diffnested_interfaces() {
		return (EReference)pattern_EClassEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_EOperation() {
		return pattern_EOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_ID_Pattern() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_IsForbidden() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_Name() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_Eparameters() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_Etype() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_MethodBody() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation___idKDM() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_EPackage() {
		return pattern_EPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EPackage_ID_Pattern() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EPackage_IsForbidden() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EPackage_Name() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Eclassifiers() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Interfaces() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Test() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Diffeclassifiers() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Diffinterfaces() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_EPackage_Difftest() {
		return (EReference)pattern_EPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_EReference() {
		return pattern_EReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EReference_ID_Pattern() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EReference_IsForbidden() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EReference_Name() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EReference_Etype() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Interface() {
		return pattern_InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_ID_Pattern() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_IsForbidden() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_Name() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_Extends() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_PackageName() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Interface_Eoperations() {
		return (EReference)pattern_InterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Interface_Esupertypes() {
		return (EReference)pattern_InterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Interface_Diffeoperations() {
		return (EReference)pattern_InterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Interface_Diffesupertypes() {
		return (EReference)pattern_InterfaceEClass.getEStructuralFeatures().get(8);
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
	public EReference getPattern_SemanticObject_SemanticObject_DiffEAttribute() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_eattributes() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_eoperations() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_ereferences() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_esupertypes() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_interfaces() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_nested_classes() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEClass_nested_interfaces() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEOperation() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEPackage() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_eclassifiers() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_interfaces() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_test() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEReference() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffInterface() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffInterface_eoperations() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffInterface_esupertypes() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations_multi() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations_single() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_EAttribute() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_EClass() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_EOperation() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_EPackage() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_EReference() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_Interface() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_testAssociations() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_testAssociations() {
		return pattern_testAssociationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_testAssociations_ID_Pattern() {
		return (EAttribute)pattern_testAssociationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_testAssociations_IsForbidden() {
		return (EAttribute)pattern_testAssociationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_testAssociations_Name() {
		return (EAttribute)pattern_testAssociationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_testAssociations_Single() {
		return (EReference)pattern_testAssociationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_testAssociations_Multi() {
		return (EReference)pattern_testAssociationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_testAssociations_Diffsingle() {
		return (EReference)pattern_testAssociationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_testAssociations_Diffmulti() {
		return (EReference)pattern_testAssociationsEClass.getEStructuralFeatures().get(6);
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
	public EReference getRule_RulePattern_Pattern_DiffEAttribute() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_eattributes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_eoperations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_ereferences() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_esupertypes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_nested_classes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEClass_nested_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEOperation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEPackage() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEPackage_eclassifiers() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEPackage_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEPackage_test() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEReference() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffInterface() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffInterface_eoperations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffInterface_esupertypes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DifftestAssociations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DifftestAssociations_multi() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DifftestAssociations_single() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_EAttribute() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_EClass() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_EOperation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_EPackage() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_EReference() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_Interface() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_testAssociations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(31);
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
	public RefactoringCRRuleMMFactory getRefactoringCRRuleMMFactory() {
		return (RefactoringCRRuleMMFactory)getEFactoryInstance();
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

		pattern_DiffEAttributeEClass = createEClass(PATTERN_DIFF_EATTRIBUTE);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__FILTER);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__IS_MERGED);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__CHANGE_STATUS);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_LEFT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS);

		pattern_DiffEClassEClass = createEClass(PATTERN_DIFF_ECLASS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__FILTER);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__IS_MERGED);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_EXTENDS_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_EXTENDS_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__EXTENDS_CHANGE_STATUS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS);

		pattern_DiffEClass_eattributesEClass = createEClass(PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE);

		pattern_DiffEClass_eoperationsEClass = createEClass(PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__IS_MERGED);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_GROUP);
		createEReference(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE);

		pattern_DiffEClass_ereferencesEClass = createEClass(PATTERN_DIFF_ECLASS_EREFERENCES);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__FILTER);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE);

		pattern_DiffEClass_esupertypesEClass = createEClass(PATTERN_DIFF_ECLASS_ESUPERTYPES);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__ETYPE);

		pattern_DiffEClass_interfacesEClass = createEClass(PATTERN_DIFF_ECLASS_INTERFACES);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__ETYPE);

		pattern_DiffEClass_nested_classesEClass = createEClass(PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__ETYPE);

		pattern_DiffEClass_nested_interfacesEClass = createEClass(PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_MERGED);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_GROUP);
		createEReference(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ETYPE);

		pattern_DiffEOperationEClass = createEClass(PATTERN_DIFF_EOPERATION);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__FILTER);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__IS_MERGED);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__CHANGE_STATUS);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_LEFT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_ETYPE_LEFT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_ETYPE_RIGHT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__ETYPE_CHANGE_STATUS);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_LEFT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS);

		pattern_DiffEPackageEClass = createEClass(PATTERN_DIFF_EPACKAGE);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__FILTER);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__IS_MERGED);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__CHANGE_STATUS);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__NAME_CHANGE_STATUS);

		pattern_DiffEPackage_eclassifiersEClass = createEClass(PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_MERGED);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_GROUP);
		createEReference(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE);

		pattern_DiffEPackage_interfacesEClass = createEClass(PATTERN_DIFF_EPACKAGE_INTERFACES);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__IS_MERGED);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_GROUP);
		createEReference(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__ETYPE);

		pattern_DiffEPackage_testEClass = createEClass(PATTERN_DIFF_EPACKAGE_TEST);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__IS_FORBIDDEN);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__CHANGE_STATUS);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__FILTER);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__IS_MERGED);
		createEAttribute(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__DIFF_GROUP);
		createEReference(pattern_DiffEPackage_testEClass, PATTERN_DIFF_EPACKAGE_TEST__ETYPE);

		pattern_DiffEReferenceEClass = createEClass(PATTERN_DIFF_EREFERENCE);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__FILTER);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__IS_MERGED);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__CHANGE_STATUS);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS);

		pattern_DiffInterfaceEClass = createEClass(PATTERN_DIFF_INTERFACE);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__FILTER);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__IS_MERGED);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__CHANGE_STATUS);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_NAME_LEFT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_NAME_RIGHT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NAME_CHANGE_STATUS);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_EXTENDS_LEFT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_EXTENDS_RIGHT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__EXTENDS_CHANGE_STATUS);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS);

		pattern_DiffInterface_eoperationsEClass = createEClass(PATTERN_DIFF_INTERFACE_EOPERATIONS);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_MERGED);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_GROUP);
		createEReference(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__ETYPE);

		pattern_DiffInterface_esupertypesEClass = createEClass(PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__ID_PATTERN);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_MERGED);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_GROUP);
		createEReference(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__ETYPE);

		pattern_DifftestAssociationsEClass = createEClass(PATTERN_DIFFTEST_ASSOCIATIONS);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_LEFT);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__FILTER);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__IS_MERGED);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__CHANGE_STATUS);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_LEFT);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_RIGHT);
		createEAttribute(pattern_DifftestAssociationsEClass, PATTERN_DIFFTEST_ASSOCIATIONS__NAME_CHANGE_STATUS);

		pattern_DifftestAssociations_multiEClass = createEClass(PATTERN_DIFFTEST_ASSOCIATIONS_MULTI);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ID_PATTERN);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_FORBIDDEN);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_LEFT);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__CHANGE_STATUS);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__FILTER);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_MERGED);
		createEAttribute(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_GROUP);
		createEReference(pattern_DifftestAssociations_multiEClass, PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ETYPE);

		pattern_DifftestAssociations_singleEClass = createEClass(PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ID_PATTERN);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_FORBIDDEN);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__CHANGE_STATUS);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__FILTER);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_MERGED);
		createEAttribute(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_GROUP);
		createEReference(pattern_DifftestAssociations_singleEClass, PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ETYPE);

		pattern_EAttributeEClass = createEClass(PATTERN_EATTRIBUTE);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__IS_FORBIDDEN);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__NAME);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__ETYPE);

		pattern_EClassEClass = createEClass(PATTERN_ECLASS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__ID_PATTERN);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__IS_FORBIDDEN);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__NAME);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__EXTENDS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__IMPLEMENTS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__IS_ABSTRACT);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__PACKAGE_NAME);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__EATTRIBUTES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__EOPERATIONS);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__EREFERENCES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__ESUPERTYPES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__INTERFACES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__NESTED_CLASSES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__NESTED_INTERFACES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFEATTRIBUTES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFEOPERATIONS);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFEREFERENCES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFESUPERTYPES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFINTERFACES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFNESTED_CLASSES);
		createEReference(pattern_EClassEClass, PATTERN_ECLASS__DIFFNESTED_INTERFACES);

		pattern_EOperationEClass = createEClass(PATTERN_EOPERATION);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__IS_FORBIDDEN);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__NAME);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__EPARAMETERS);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ETYPE);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__METHOD_BODY);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ID_KDM);

		pattern_EPackageEClass = createEClass(PATTERN_EPACKAGE);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__IS_FORBIDDEN);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__NAME);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__ECLASSIFIERS);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__INTERFACES);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__TEST);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__DIFFECLASSIFIERS);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__DIFFINTERFACES);
		createEReference(pattern_EPackageEClass, PATTERN_EPACKAGE__DIFFTEST);

		pattern_EReferenceEClass = createEClass(PATTERN_EREFERENCE);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__IS_FORBIDDEN);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__NAME);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__ETYPE);

		pattern_InterfaceEClass = createEClass(PATTERN_INTERFACE);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__ID_PATTERN);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__IS_FORBIDDEN);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__NAME);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__EXTENDS);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__PACKAGE_NAME);
		createEReference(pattern_InterfaceEClass, PATTERN_INTERFACE__EOPERATIONS);
		createEReference(pattern_InterfaceEClass, PATTERN_INTERFACE__ESUPERTYPES);
		createEReference(pattern_InterfaceEClass, PATTERN_INTERFACE__DIFFEOPERATIONS);
		createEReference(pattern_InterfaceEClass, PATTERN_INTERFACE__DIFFESUPERTYPES);

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
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS);

		pattern_testAssociationsEClass = createEClass(PATTERN_TEST_ASSOCIATIONS);
		createEAttribute(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__ID_PATTERN);
		createEAttribute(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN);
		createEAttribute(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__NAME);
		createEReference(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__SINGLE);
		createEReference(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__MULTI);
		createEReference(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE);
		createEReference(pattern_testAssociationsEClass, PATTERN_TEST_ASSOCIATIONS__DIFFMULTI);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEAttribute(ruleEClass, RULE__PRIORITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_EATTRIBUTE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_ECLASS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_EOPERATION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_EPACKAGE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_EREFERENCE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_INTERFACE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS);

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
		pattern_DiffEAttributeEClass.getESuperTypes().add(this.getPattern_EAttribute());
		pattern_DiffEClassEClass.getESuperTypes().add(this.getPattern_EClass());
		pattern_DiffEOperationEClass.getESuperTypes().add(this.getPattern_EOperation());
		pattern_DiffEPackageEClass.getESuperTypes().add(this.getPattern_EPackage());
		pattern_DiffEReferenceEClass.getESuperTypes().add(this.getPattern_EReference());
		pattern_DiffInterfaceEClass.getESuperTypes().add(this.getPattern_Interface());
		pattern_DifftestAssociationsEClass.getESuperTypes().add(this.getPattern_testAssociations());
		pattern_SemanticConflictEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(this.getPattern_SemanticObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_ConflictResolutionEClass, Pattern_ConflictResolution.class, "Pattern_ConflictResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ConflictResolution_ResolutionType(), this.getConflictResolutionType(), "ResolutionType", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ConflictResolution_ResolutionStrategy(), this.getConflictResolutionStrategy(), "ResolutionStrategy", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_ConflictResolution_Semanticconflicts(), this.getPattern_SemanticConflict(), null, "semanticconflicts", null, 0, -1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_DiffEAttributeEClass, Pattern_DiffEAttribute.class, "Pattern_DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAttribute_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassEClass, Pattern_DiffEClass.class, "Pattern_DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_extends_Left(), ecorePackage.getEString(), "new_extends_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_extends_Right(), ecorePackage.getEString(), "new_extends_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ExtendsChangeStatus(), this.getChangeStatus(), "extendsChangeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_implements_Left(), ecorePackage.getEString(), "new_implements_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_implements_Right(), ecorePackage.getEString(), "new_implements_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ImplementsChangeStatus(), this.getChangeStatus(), "implementsChangeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_isAbstract_Left(), ecorePackage.getEBoolean(), "new_isAbstract_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_isAbstract_Right(), ecorePackage.getEBoolean(), "new_isAbstract_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_IsAbstractChangeStatus(), this.getChangeStatus(), "isAbstractChangeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_packageName_Left(), ecorePackage.getEString(), "new_packageName_Left", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_New_packageName_Right(), ecorePackage.getEString(), "new_packageName_Right", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_PackageNameChangeStatus(), this.getChangeStatus(), "packageNameChangeStatus", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eattributesEClass, Pattern_DiffEClass_eattributes.class, "Pattern_DiffEClass_eattributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eattributes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_eattributes_EType(), this.getPattern_EAttribute(), null, "eType", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eoperationsEClass, Pattern_DiffEClass_eoperations.class, "Pattern_DiffEClass_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eoperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_eoperations_EType(), this.getPattern_EOperation(), null, "eType", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_ereferencesEClass, Pattern_DiffEClass_ereferences.class, "Pattern_DiffEClass_ereferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ereferences_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_ereferences_EType(), this.getPattern_EReference(), null, "eType", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_esupertypesEClass, Pattern_DiffEClass_esupertypes.class, "Pattern_DiffEClass_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_esupertypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_esupertypes_EType(), this.getPattern_EClass(), null, "eType", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_interfacesEClass, Pattern_DiffEClass_interfaces.class, "Pattern_DiffEClass_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_interfaces_EType(), this.getPattern_Interface(), null, "eType", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_nested_classesEClass, Pattern_DiffEClass_nested_classes.class, "Pattern_DiffEClass_nested_classes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_nested_classes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_nested_classes_EType(), this.getPattern_EClass(), null, "eType", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_nested_interfacesEClass, Pattern_DiffEClass_nested_interfaces.class, "Pattern_DiffEClass_nested_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEClass_nested_interfaces_EType(), this.getPattern_Interface(), null, "eType", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperationEClass, Pattern_DiffEOperation.class, "Pattern_DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_eparameters_Left(), ecorePackage.getEString(), "new_eparameters_Left", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_eparameters_Right(), ecorePackage.getEString(), "new_eparameters_Right", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_EparametersChangeStatus(), this.getChangeStatus(), "eparametersChangeStatus", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_methodBody_Left(), ecorePackage.getEString(), "new_methodBody_Left", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_New_methodBody_Right(), ecorePackage.getEString(), "new_methodBody_Right", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_MethodBodyChangeStatus(), this.getChangeStatus(), "methodBodyChangeStatus", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackageEClass, Pattern_DiffEPackage.class, "Pattern_DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eclassifiersEClass, Pattern_DiffEPackage_eclassifiers.class, "Pattern_DiffEPackage_eclassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEPackage_eclassifiers_EType(), this.getPattern_EClass(), null, "eType", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_interfacesEClass, Pattern_DiffEPackage_interfaces.class, "Pattern_DiffEPackage_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEPackage_interfaces_EType(), this.getPattern_Interface(), null, "eType", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_testEClass, Pattern_DiffEPackage_test.class, "Pattern_DiffEPackage_test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_test_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_test_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEPackage_test_EType(), this.getPattern_testAssociations(), null, "eType", null, 1, 1, Pattern_DiffEPackage_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReferenceEClass, Pattern_DiffEReference.class, "Pattern_DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterfaceEClass, Pattern_DiffInterface.class, "Pattern_DiffInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_extends_Left(), ecorePackage.getEString(), "new_extends_Left", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_extends_Right(), ecorePackage.getEString(), "new_extends_Right", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_ExtendsChangeStatus(), this.getChangeStatus(), "extendsChangeStatus", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_packageName_Left(), ecorePackage.getEString(), "new_packageName_Left", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_New_packageName_Right(), ecorePackage.getEString(), "new_packageName_Right", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_PackageNameChangeStatus(), this.getChangeStatus(), "packageNameChangeStatus", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterface_eoperationsEClass, Pattern_DiffInterface_eoperations.class, "Pattern_DiffInterface_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_eoperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffInterface_eoperations_EType(), this.getPattern_EOperation(), null, "eType", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterface_esupertypesEClass, Pattern_DiffInterface_esupertypes.class, "Pattern_DiffInterface_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_esupertypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffInterface_esupertypes_EType(), this.getPattern_Interface(), null, "eType", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DifftestAssociationsEClass, Pattern_DifftestAssociations.class, "Pattern_DifftestAssociations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DifftestAssociations_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", null, 1, 1, Pattern_DifftestAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DifftestAssociations_multiEClass, Pattern_DifftestAssociations_multi.class, "Pattern_DifftestAssociations_multi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DifftestAssociations_multi_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_multi_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DifftestAssociations_multi_EType(), this.getPattern_EClass(), null, "eType", null, 1, 1, Pattern_DifftestAssociations_multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DifftestAssociations_singleEClass, Pattern_DifftestAssociations_single.class, "Pattern_DifftestAssociations_single", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DifftestAssociations_single_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DifftestAssociations_single_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DifftestAssociations_single_EType(), this.getPattern_EClass(), null, "eType", null, 1, 1, Pattern_DifftestAssociations_single.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EAttributeEClass, Pattern_EAttribute.class, "Pattern_EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EClassEClass, Pattern_EClass.class, "Pattern_EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Eattributes(), this.getPattern_EAttribute(), null, "eattributes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Eoperations(), this.getPattern_EOperation(), null, "eoperations", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Ereferences(), this.getPattern_EReference(), null, "ereferences", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Esupertypes(), this.getPattern_EClass(), null, "esupertypes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Interfaces(), this.getPattern_Interface(), null, "interfaces", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Nested_classes(), this.getPattern_EClass(), null, "nested_classes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Nested_interfaces(), this.getPattern_Interface(), null, "nested_interfaces", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EClass_Diffeattributes(), this.getPattern_DiffEClass_eattributes(), null, "diffeattributes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Diffeoperations(), this.getPattern_DiffEClass_eoperations(), null, "diffeoperations", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Differeferences(), this.getPattern_DiffEClass_ereferences(), null, "differeferences", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Diffesupertypes(), this.getPattern_DiffEClass_esupertypes(), null, "diffesupertypes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Diffinterfaces(), this.getPattern_DiffEClass_interfaces(), null, "diffinterfaces", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Diffnested_classes(), this.getPattern_DiffEClass_nested_classes(), null, "diffnested_classes", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EClass_Diffnested_interfaces(), this.getPattern_DiffEClass_nested_interfaces(), null, "diffnested_interfaces", null, 0, -1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EOperationEClass, Pattern_EOperation.class, "Pattern_EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Eparameters(), ecorePackage.getEString(), "eparameters", null, 0, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_MethodBody(), ecorePackage.getEString(), "methodBody", null, 0, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation___idKDM(), ecorePackage.getEString(), "__idKDM", null, 0, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EPackageEClass, Pattern_EPackage.class, "Pattern_EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EPackage_Eclassifiers(), this.getPattern_EClass(), null, "eclassifiers", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EPackage_Interfaces(), this.getPattern_Interface(), null, "interfaces", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_EPackage_Test(), this.getPattern_testAssociations(), null, "test", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EPackage_Diffeclassifiers(), this.getPattern_DiffEPackage_eclassifiers(), null, "diffeclassifiers", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EPackage_Diffinterfaces(), this.getPattern_DiffEPackage_interfaces(), null, "diffinterfaces", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_EPackage_Difftest(), this.getPattern_DiffEPackage_test(), null, "difftest", null, 0, -1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EReferenceEClass, Pattern_EReference.class, "Pattern_EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_InterfaceEClass, Pattern_Interface.class, "Pattern_Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Interface_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Interface_Eoperations(), this.getPattern_EOperation(), null, "eoperations", null, 0, -1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_Interface_Esupertypes(), this.getPattern_Interface(), null, "esupertypes", null, 0, -1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_Interface_Diffeoperations(), this.getPattern_DiffInterface_eoperations(), null, "diffeoperations", null, 0, -1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Interface_Diffesupertypes(), this.getPattern_DiffInterface_esupertypes(), null, "diffesupertypes", null, 0, -1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEAttribute(), this.getPattern_DiffEAttribute(), null, "SemanticObject_DiffEAttribute", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass(), this.getPattern_DiffEClass(), null, "SemanticObject_DiffEClass", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_eattributes(), this.getPattern_DiffEClass_eattributes(), null, "SemanticObject_DiffEClass_eattributes", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_eoperations(), this.getPattern_DiffEClass_eoperations(), null, "SemanticObject_DiffEClass_eoperations", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_ereferences(), this.getPattern_DiffEClass_ereferences(), null, "SemanticObject_DiffEClass_ereferences", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_esupertypes(), this.getPattern_DiffEClass_esupertypes(), null, "SemanticObject_DiffEClass_esupertypes", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_interfaces(), this.getPattern_DiffEClass_interfaces(), null, "SemanticObject_DiffEClass_interfaces", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_nested_classes(), this.getPattern_DiffEClass_nested_classes(), null, "SemanticObject_DiffEClass_nested_classes", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEClass_nested_interfaces(), this.getPattern_DiffEClass_nested_interfaces(), null, "SemanticObject_DiffEClass_nested_interfaces", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEOperation(), this.getPattern_DiffEOperation(), null, "SemanticObject_DiffEOperation", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEPackage(), this.getPattern_DiffEPackage(), null, "SemanticObject_DiffEPackage", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEPackage_eclassifiers(), this.getPattern_DiffEPackage_eclassifiers(), null, "SemanticObject_DiffEPackage_eclassifiers", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEPackage_interfaces(), this.getPattern_DiffEPackage_interfaces(), null, "SemanticObject_DiffEPackage_interfaces", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEPackage_test(), this.getPattern_DiffEPackage_test(), null, "SemanticObject_DiffEPackage_test", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEReference(), this.getPattern_DiffEReference(), null, "SemanticObject_DiffEReference", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffInterface(), this.getPattern_DiffInterface(), null, "SemanticObject_DiffInterface", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffInterface_eoperations(), this.getPattern_DiffInterface_eoperations(), null, "SemanticObject_DiffInterface_eoperations", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffInterface_esupertypes(), this.getPattern_DiffInterface_esupertypes(), null, "SemanticObject_DiffInterface_esupertypes", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DifftestAssociations(), this.getPattern_DifftestAssociations(), null, "SemanticObject_DifftestAssociations", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DifftestAssociations_multi(), this.getPattern_DifftestAssociations_multi(), null, "SemanticObject_DifftestAssociations_multi", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DifftestAssociations_single(), this.getPattern_DifftestAssociations_single(), null, "SemanticObject_DifftestAssociations_single", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_EAttribute(), this.getPattern_EAttribute(), null, "SemanticObject_EAttribute", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_EClass(), this.getPattern_EClass(), null, "SemanticObject_EClass", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_EOperation(), this.getPattern_EOperation(), null, "SemanticObject_EOperation", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_EPackage(), this.getPattern_EPackage(), null, "SemanticObject_EPackage", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_EReference(), this.getPattern_EReference(), null, "SemanticObject_EReference", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_Interface(), this.getPattern_Interface(), null, "SemanticObject_Interface", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_testAssociations(), this.getPattern_testAssociations(), null, "SemanticObject_testAssociations", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_testAssociationsEClass, Pattern_testAssociations.class, "Pattern_testAssociations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_testAssociations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_testAssociations_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_testAssociations_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_testAssociations_Single(), this.getPattern_EClass(), null, "single", null, 0, 1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_testAssociations_Multi(), this.getPattern_EClass(), null, "multi", null, 0, -1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_testAssociations_Diffsingle(), this.getPattern_DifftestAssociations_single(), null, "diffsingle", null, 0, -1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_testAssociations_Diffmulti(), this.getPattern_DifftestAssociations_multi(), null, "diffmulti", null, 0, -1, Pattern_testAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_SemanticObject(), this.getPattern_SemanticObject(), null, "rulePattern_Pattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEAttribute(), this.getPattern_DiffEAttribute(), null, "rulePattern_Pattern_DiffEAttribute", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass(), this.getPattern_DiffEClass(), null, "rulePattern_Pattern_DiffEClass", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_eattributes(), this.getPattern_DiffEClass_eattributes(), null, "rulePattern_Pattern_DiffEClass_eattributes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_eoperations(), this.getPattern_DiffEClass_eoperations(), null, "rulePattern_Pattern_DiffEClass_eoperations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_ereferences(), this.getPattern_DiffEClass_ereferences(), null, "rulePattern_Pattern_DiffEClass_ereferences", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_esupertypes(), this.getPattern_DiffEClass_esupertypes(), null, "rulePattern_Pattern_DiffEClass_esupertypes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_interfaces(), this.getPattern_DiffEClass_interfaces(), null, "rulePattern_Pattern_DiffEClass_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_nested_classes(), this.getPattern_DiffEClass_nested_classes(), null, "rulePattern_Pattern_DiffEClass_nested_classes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEClass_nested_interfaces(), this.getPattern_DiffEClass_nested_interfaces(), null, "rulePattern_Pattern_DiffEClass_nested_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEOperation(), this.getPattern_DiffEOperation(), null, "rulePattern_Pattern_DiffEOperation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEPackage(), this.getPattern_DiffEPackage(), null, "rulePattern_Pattern_DiffEPackage", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEPackage_eclassifiers(), this.getPattern_DiffEPackage_eclassifiers(), null, "rulePattern_Pattern_DiffEPackage_eclassifiers", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEPackage_interfaces(), this.getPattern_DiffEPackage_interfaces(), null, "rulePattern_Pattern_DiffEPackage_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEPackage_test(), this.getPattern_DiffEPackage_test(), null, "rulePattern_Pattern_DiffEPackage_test", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEReference(), this.getPattern_DiffEReference(), null, "rulePattern_Pattern_DiffEReference", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffInterface(), this.getPattern_DiffInterface(), null, "rulePattern_Pattern_DiffInterface", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffInterface_eoperations(), this.getPattern_DiffInterface_eoperations(), null, "rulePattern_Pattern_DiffInterface_eoperations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffInterface_esupertypes(), this.getPattern_DiffInterface_esupertypes(), null, "rulePattern_Pattern_DiffInterface_esupertypes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DifftestAssociations(), this.getPattern_DifftestAssociations(), null, "rulePattern_Pattern_DifftestAssociations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DifftestAssociations_multi(), this.getPattern_DifftestAssociations_multi(), null, "rulePattern_Pattern_DifftestAssociations_multi", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DifftestAssociations_single(), this.getPattern_DifftestAssociations_single(), null, "rulePattern_Pattern_DifftestAssociations_single", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_EAttribute(), this.getPattern_EAttribute(), null, "rulePattern_Pattern_EAttribute", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_EClass(), this.getPattern_EClass(), null, "rulePattern_Pattern_EClass", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_EOperation(), this.getPattern_EOperation(), null, "rulePattern_Pattern_EOperation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_EPackage(), this.getPattern_EPackage(), null, "rulePattern_Pattern_EPackage", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_EReference(), this.getPattern_EReference(), null, "rulePattern_Pattern_EReference", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_Interface(), this.getPattern_Interface(), null, "rulePattern_Pattern_Interface", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_testAssociations(), this.getPattern_testAssociations(), null, "rulePattern_Pattern_testAssociations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorEEnum, refactoringCRRuleMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, refactoringCRRuleMM.AUTHOR.NON);
		addEEnumLiteral(authorEEnum, refactoringCRRuleMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, refactoringCRRuleMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, refactoringCRRuleMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, refactoringCRRuleMM.AUTHOR.MIXED);

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

} //RefactoringCRRuleMMPackageImpl
