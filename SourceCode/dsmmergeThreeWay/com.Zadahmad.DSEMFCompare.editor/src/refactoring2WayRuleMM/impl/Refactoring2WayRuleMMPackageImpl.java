/**
 */
package refactoring2WayRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

import refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl;

import refactoring2WayRuleMM.Pattern_DiffEAttribute;
import refactoring2WayRuleMM.Pattern_DiffEClass;
import refactoring2WayRuleMM.Pattern_DiffEClass_eattributes;
import refactoring2WayRuleMM.Pattern_DiffEClass_eoperations;
import refactoring2WayRuleMM.Pattern_DiffEClass_ereferences;
import refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes;
import refactoring2WayRuleMM.Pattern_DiffEClass_interfaces;
import refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes;
import refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces;
import refactoring2WayRuleMM.Pattern_DiffEOperation;
import refactoring2WayRuleMM.Pattern_DiffEPackage;
import refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers;
import refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces;
import refactoring2WayRuleMM.Pattern_DiffEReference;
import refactoring2WayRuleMM.Pattern_DiffInterface;
import refactoring2WayRuleMM.Pattern_DiffInterface_eoperations;
import refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes;
import refactoring2WayRuleMM.Pattern_EAttribute;
import refactoring2WayRuleMM.Pattern_EClass;
import refactoring2WayRuleMM.Pattern_EOperation;
import refactoring2WayRuleMM.Pattern_EPackage;
import refactoring2WayRuleMM.Pattern_EReference;
import refactoring2WayRuleMM.Pattern_Interface;
import refactoring2WayRuleMM.Pattern_SemanticConflict;
import refactoring2WayRuleMM.Pattern_SemanticDiff;
import refactoring2WayRuleMM.Pattern_SemanticObject;
import refactoring2WayRuleMM.Refactoring2WayRuleMMFactory;
import refactoring2WayRuleMM.Refactoring2WayRuleMMPackage;
import refactoring2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Refactoring2WayRuleMMPackageImpl extends EPackageImpl implements Refactoring2WayRuleMMPackage {
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Refactoring2WayRuleMMPackageImpl() {
		super(eNS_URI, Refactoring2WayRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Refactoring2WayRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Refactoring2WayRuleMMPackage init() {
		if (isInited) return (Refactoring2WayRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(Refactoring2WayRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefactoring2WayRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Refactoring2WayRuleMMPackageImpl theRefactoring2WayRuleMMPackage = registeredRefactoring2WayRuleMMPackage instanceof Refactoring2WayRuleMMPackageImpl ? (Refactoring2WayRuleMMPackageImpl)registeredRefactoring2WayRuleMMPackage : new Refactoring2WayRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Refactoring2WayDiffMMPackage.eNS_URI);
		Refactoring2WayDiffMMPackageImpl theRefactoring2WayDiffMMPackage = (Refactoring2WayDiffMMPackageImpl)(registeredPackage instanceof Refactoring2WayDiffMMPackageImpl ? registeredPackage : Refactoring2WayDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		theRefactoring2WayRuleMMPackage.createPackageContents();
		theRefactoring2WayDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoring2WayRuleMMPackage.initializePackageContents();
		theRefactoring2WayDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefactoring2WayRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Refactoring2WayRuleMMPackage.eNS_URI, theRefactoring2WayRuleMMPackage);
		return theRefactoring2WayRuleMMPackage;
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
	public EAttribute getPattern_EAttribute_Filter() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EAttribute_IsForbidden() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_EClass_Filter() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EClass_IsForbidden() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_EOperation_Filter() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EOperation_IsForbidden() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_EPackage_Filter() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EPackage_IsForbidden() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_EReference_Filter() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_EReference_IsForbidden() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Interface_Filter() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Interface_IsForbidden() {
		return (EAttribute)pattern_InterfaceEClass.getEStructuralFeatures().get(2);
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
	public EClass getPattern_DiffEAttribute() {
		return pattern_DiffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_ID_Pattern() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_Filter() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEAttribute_IsForbidden() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_ID_Pattern() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_Filter() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_IsForbidden() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_eattributes_Filter() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eattributes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_eattributesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_eoperations_Filter() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_eoperations_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_eoperationsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_ereferences_Filter() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_ereferences_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_ereferencesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_esupertypes_Filter() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_esupertypes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_esupertypesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_interfaces_Filter() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_interfacesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_nested_classes_Filter() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_classes_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_nested_classesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEClass_nested_interfaces_Filter() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEClass_nested_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEClass_nested_interfacesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEOperation_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_Filter() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEOperation_IsForbidden() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEPackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_Filter() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_IsForbidden() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEPackage_eclassifiers_Filter() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_eclassifiers_IsForbidden() {
		return (EAttribute)pattern_DiffEPackage_eclassifiersEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEPackage_interfaces_Filter() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEPackage_interfaces_IsForbidden() {
		return (EAttribute)pattern_DiffEPackage_interfacesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEReference_ID_Pattern() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_Filter() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEReference_IsForbidden() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffInterface_ID_Pattern() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_Filter() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_IsForbidden() {
		return (EAttribute)pattern_DiffInterfaceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffInterface_eoperations_Filter() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_eoperations_IsForbidden() {
		return (EAttribute)pattern_DiffInterface_eoperationsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffInterface_esupertypes_Filter() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffInterface_esupertypes_IsForbidden() {
		return (EAttribute)pattern_DiffInterface_esupertypesEClass.getEStructuralFeatures().get(2);
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
	public EReference getRule_RulePattern_DiffEAttribute() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_eattributes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_eoperations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_ereferences() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_esupertypes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_nested_classes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEClass_nested_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEOperation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEPackage() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEPackage_eclassifiers() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEPackage_interfaces() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffEReference() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffInterface() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffInterface_eoperations() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffInterface_esupertypes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_EAttribute() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_EClass() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_EOperation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_EPackage() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_EReference() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Interface() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring2WayRuleMMFactory getRefactoring2WayRuleMMFactory() {
		return (Refactoring2WayRuleMMFactory)getEFactoryInstance();
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
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__IS_FORBIDDEN);

		pattern_EClassEClass = createEClass(PATTERN_ECLASS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__ID_PATTERN);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__FILTER);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__IS_FORBIDDEN);

		pattern_EOperationEClass = createEClass(PATTERN_EOPERATION);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__FILTER);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__IS_FORBIDDEN);

		pattern_EPackageEClass = createEClass(PATTERN_EPACKAGE);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__FILTER);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__IS_FORBIDDEN);

		pattern_EReferenceEClass = createEClass(PATTERN_EREFERENCE);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__FILTER);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__IS_FORBIDDEN);

		pattern_InterfaceEClass = createEClass(PATTERN_INTERFACE);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__ID_PATTERN);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__FILTER);
		createEAttribute(pattern_InterfaceEClass, PATTERN_INTERFACE__IS_FORBIDDEN);

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

		pattern_DiffEAttributeEClass = createEClass(PATTERN_DIFF_EATTRIBUTE);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__FILTER);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__IS_FORBIDDEN);

		pattern_DiffEClassEClass = createEClass(PATTERN_DIFF_ECLASS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__ID_PATTERN);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__FILTER);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__IS_FORBIDDEN);

		pattern_DiffEClass_eattributesEClass = createEClass(PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER);
		createEAttribute(pattern_DiffEClass_eattributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN);

		pattern_DiffEClass_eoperationsEClass = createEClass(PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER);
		createEAttribute(pattern_DiffEClass_eoperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN);

		pattern_DiffEClass_ereferencesEClass = createEClass(PATTERN_DIFF_ECLASS_EREFERENCES);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__FILTER);
		createEAttribute(pattern_DiffEClass_ereferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN);

		pattern_DiffEClass_esupertypesEClass = createEClass(PATTERN_DIFF_ECLASS_ESUPERTYPES);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER);
		createEAttribute(pattern_DiffEClass_esupertypesEClass, PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN);

		pattern_DiffEClass_interfacesEClass = createEClass(PATTERN_DIFF_ECLASS_INTERFACES);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEClass_interfacesEClass, PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN);

		pattern_DiffEClass_nested_classesEClass = createEClass(PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER);
		createEAttribute(pattern_DiffEClass_nested_classesEClass, PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN);

		pattern_DiffEClass_nested_interfacesEClass = createEClass(PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEClass_nested_interfacesEClass, PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN);

		pattern_DiffEOperationEClass = createEClass(PATTERN_DIFF_EOPERATION);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__FILTER);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__IS_FORBIDDEN);

		pattern_DiffEPackageEClass = createEClass(PATTERN_DIFF_EPACKAGE);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__FILTER);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__IS_FORBIDDEN);

		pattern_DiffEPackage_eclassifiersEClass = createEClass(PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER);
		createEAttribute(pattern_DiffEPackage_eclassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN);

		pattern_DiffEPackage_interfacesEClass = createEClass(PATTERN_DIFF_EPACKAGE_INTERFACES);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER);
		createEAttribute(pattern_DiffEPackage_interfacesEClass, PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN);

		pattern_DiffEReferenceEClass = createEClass(PATTERN_DIFF_EREFERENCE);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__FILTER);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__IS_FORBIDDEN);

		pattern_DiffInterfaceEClass = createEClass(PATTERN_DIFF_INTERFACE);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__ID_PATTERN);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__FILTER);
		createEAttribute(pattern_DiffInterfaceEClass, PATTERN_DIFF_INTERFACE__IS_FORBIDDEN);

		pattern_DiffInterface_eoperationsEClass = createEClass(PATTERN_DIFF_INTERFACE_EOPERATIONS);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER);
		createEAttribute(pattern_DiffInterface_eoperationsEClass, PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN);

		pattern_DiffInterface_esupertypesEClass = createEClass(PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__ID_PATTERN);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER);
		createEAttribute(pattern_DiffInterface_esupertypesEClass, PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EATTRIBUTE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EOPERATION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EPACKAGE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_EREFERENCE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_INTERFACE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_EATTRIBUTE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_ECLASS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_EOPERATION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_EPACKAGE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_EREFERENCE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_INTERFACE);
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
		Refactoring2WayDiffMMPackage theRefactoring2WayDiffMMPackage = (Refactoring2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Refactoring2WayDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_EAttributeEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getEAttribute());
		pattern_EClassEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getEClass());
		pattern_EOperationEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getEOperation());
		pattern_EPackageEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getEPackage());
		pattern_EReferenceEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getEReference());
		pattern_InterfaceEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getInterface());
		pattern_SemanticObjectEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getSemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getSemanticDiff());
		pattern_SemanticConflictEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getSemanticConflict());
		pattern_DiffEAttributeEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEAttribute());
		pattern_DiffEClassEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass());
		pattern_DiffEClass_eattributesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_eattributes());
		pattern_DiffEClass_eoperationsEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_eoperations());
		pattern_DiffEClass_ereferencesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_ereferences());
		pattern_DiffEClass_esupertypesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_esupertypes());
		pattern_DiffEClass_interfacesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_interfaces());
		pattern_DiffEClass_nested_classesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_nested_classes());
		pattern_DiffEClass_nested_interfacesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEClass_nested_interfaces());
		pattern_DiffEOperationEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEOperation());
		pattern_DiffEPackageEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEPackage());
		pattern_DiffEPackage_eclassifiersEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEPackage_eclassifiers());
		pattern_DiffEPackage_interfacesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEPackage_interfaces());
		pattern_DiffEReferenceEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffEReference());
		pattern_DiffInterfaceEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffInterface());
		pattern_DiffInterface_eoperationsEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffInterface_eoperations());
		pattern_DiffInterface_esupertypesEClass.getESuperTypes().add(theRefactoring2WayDiffMMPackage.getDiffInterface_esupertypes());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_EAttributeEClass, Pattern_EAttribute.class, "Pattern_EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EClassEClass, Pattern_EClass.class, "Pattern_EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EOperationEClass, Pattern_EOperation.class, "Pattern_EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EPackageEClass, Pattern_EPackage.class, "Pattern_EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EReferenceEClass, Pattern_EReference.class, "Pattern_EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_InterfaceEClass, Pattern_Interface.class, "Pattern_Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Interface_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Interface_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(pattern_DiffEAttributeEClass, Pattern_DiffEAttribute.class, "Pattern_DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassEClass, Pattern_DiffEClass.class, "Pattern_DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eattributesEClass, Pattern_DiffEClass_eattributes.class, "Pattern_DiffEClass_eattributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eattributes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eattributes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eoperationsEClass, Pattern_DiffEClass_eoperations.class, "Pattern_DiffEClass_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eoperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eoperations_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_ereferencesEClass, Pattern_DiffEClass_ereferences.class, "Pattern_DiffEClass_ereferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ereferences_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_ereferences_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_esupertypesEClass, Pattern_DiffEClass_esupertypes.class, "Pattern_DiffEClass_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_esupertypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_esupertypes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_interfacesEClass, Pattern_DiffEClass_interfaces.class, "Pattern_DiffEClass_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_nested_classesEClass, Pattern_DiffEClass_nested_classes.class, "Pattern_DiffEClass_nested_classes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_nested_classes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_classes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_nested_interfacesEClass, Pattern_DiffEClass_nested_interfaces.class, "Pattern_DiffEClass_nested_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_nested_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperationEClass, Pattern_DiffEOperation.class, "Pattern_DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackageEClass, Pattern_DiffEPackage.class, "Pattern_DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eclassifiersEClass, Pattern_DiffEPackage_eclassifiers.class, "Pattern_DiffEPackage_eclassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eclassifiers_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_interfacesEClass, Pattern_DiffEPackage_interfaces.class, "Pattern_DiffEPackage_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_interfaces_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_interfaces_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReferenceEClass, Pattern_DiffEReference.class, "Pattern_DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterfaceEClass, Pattern_DiffInterface.class, "Pattern_DiffInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterface_eoperationsEClass, Pattern_DiffInterface_eoperations.class, "Pattern_DiffInterface_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_eoperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_eoperations_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffInterface_esupertypesEClass, Pattern_DiffInterface_esupertypes.class, "Pattern_DiffInterface_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffInterface_esupertypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffInterface_esupertypes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEAttribute(), theRefactoring2WayDiffMMPackage.getDiffEAttribute(), null, "rulePattern_DiffEAttribute", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass(), theRefactoring2WayDiffMMPackage.getDiffEClass(), null, "rulePattern_DiffEClass", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_eattributes(), theRefactoring2WayDiffMMPackage.getDiffEClass_eattributes(), null, "rulePattern_DiffEClass_eattributes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_eoperations(), theRefactoring2WayDiffMMPackage.getDiffEClass_eoperations(), null, "rulePattern_DiffEClass_eoperations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_ereferences(), theRefactoring2WayDiffMMPackage.getDiffEClass_ereferences(), null, "rulePattern_DiffEClass_ereferences", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_esupertypes(), theRefactoring2WayDiffMMPackage.getDiffEClass_esupertypes(), null, "rulePattern_DiffEClass_esupertypes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_interfaces(), theRefactoring2WayDiffMMPackage.getDiffEClass_interfaces(), null, "rulePattern_DiffEClass_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_nested_classes(), theRefactoring2WayDiffMMPackage.getDiffEClass_nested_classes(), null, "rulePattern_DiffEClass_nested_classes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEClass_nested_interfaces(), theRefactoring2WayDiffMMPackage.getDiffEClass_nested_interfaces(), null, "rulePattern_DiffEClass_nested_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEOperation(), theRefactoring2WayDiffMMPackage.getDiffEOperation(), null, "rulePattern_DiffEOperation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEPackage(), theRefactoring2WayDiffMMPackage.getDiffEPackage(), null, "rulePattern_DiffEPackage", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEPackage_eclassifiers(), theRefactoring2WayDiffMMPackage.getDiffEPackage_eclassifiers(), null, "rulePattern_DiffEPackage_eclassifiers", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEPackage_interfaces(), theRefactoring2WayDiffMMPackage.getDiffEPackage_interfaces(), null, "rulePattern_DiffEPackage_interfaces", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEReference(), theRefactoring2WayDiffMMPackage.getDiffEReference(), null, "rulePattern_DiffEReference", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffInterface(), theRefactoring2WayDiffMMPackage.getDiffInterface(), null, "rulePattern_DiffInterface", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffInterface_eoperations(), theRefactoring2WayDiffMMPackage.getDiffInterface_eoperations(), null, "rulePattern_DiffInterface_eoperations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffInterface_esupertypes(), theRefactoring2WayDiffMMPackage.getDiffInterface_esupertypes(), null, "rulePattern_DiffInterface_esupertypes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_EAttribute(), theRefactoring2WayDiffMMPackage.getEAttribute(), null, "rulePattern_EAttribute", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_EClass(), theRefactoring2WayDiffMMPackage.getEClass(), null, "rulePattern_EClass", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_EOperation(), theRefactoring2WayDiffMMPackage.getEOperation(), null, "rulePattern_EOperation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_EPackage(), theRefactoring2WayDiffMMPackage.getEPackage(), null, "rulePattern_EPackage", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_EReference(), theRefactoring2WayDiffMMPackage.getEReference(), null, "rulePattern_EReference", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Interface(), theRefactoring2WayDiffMMPackage.getInterface(), null, "rulePattern_Interface", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_SemanticObject(), theRefactoring2WayDiffMMPackage.getSemanticObject(), null, "rulePattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Refactoring2WayRuleMMPackageImpl
