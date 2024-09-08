/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import refactoringDiffMM.ChangeStatus;
import refactoringDiffMM.DiffEAttribute;
import refactoringDiffMM.DiffEClass;
import refactoringDiffMM.DiffEClass_eattributes;
import refactoringDiffMM.DiffEClass_eoperations;
import refactoringDiffMM.DiffEClass_ereferences;
import refactoringDiffMM.DiffEClass_esupertypes;
import refactoringDiffMM.DiffEClass_interfaces;
import refactoringDiffMM.DiffEClass_nested_classes;
import refactoringDiffMM.DiffEClass_nested_interfaces;
import refactoringDiffMM.DiffEOperation;
import refactoringDiffMM.DiffEPackage;
import refactoringDiffMM.DiffEPackage_eclassifiers;
import refactoringDiffMM.DiffEPackage_interfaces;
import refactoringDiffMM.DiffEReference;
import refactoringDiffMM.DiffInterface;
import refactoringDiffMM.DiffInterface_eoperations;
import refactoringDiffMM.DiffInterface_esupertypes;
import refactoringDiffMM.DiffKind;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.Interface;
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringDiffMM.SemanticConflict;
import refactoringDiffMM.SemanticDiff;
import refactoringDiffMM.SemanticObject;

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
	private EClass interfaceEClass = null;

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
	private EClass diffEClass_interfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_nested_classesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_nested_interfacesEClass = null;

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
	private EClass diffEPackage_interfacesEClass = null;

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
	private EClass diffInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffInterface_eoperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffInterface_esupertypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffKindEEnum = null;

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

		// Create package meta-data objects
		theRefactoringDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theRefactoringDiffMMPackage.initializePackageContents();

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
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_Name() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_Etype() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Name() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Extends() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Implements() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_IsAbstract() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_PackageName() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Eattributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Eoperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Ereferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Esupertypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Interfaces() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Nested_classes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Nested_interfaces() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffeattributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffeoperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Differeferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffesupertypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffinterfaces() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffnested_classes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_Diffnested_interfaces() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEOperation() {
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEOperation_Name() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEOperation_Eparameters() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEOperation_Etype() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEOperation_MethodBody() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEOperation___idKDM() {
		return (EAttribute)eOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_Name() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_Eclassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_Interfaces() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_Diffeclassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_Diffinterfaces() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Name() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Etype() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Extends() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_PackageName() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Eoperations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Esupertypes() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Diffeoperations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Diffesupertypes() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(6);
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
	public EReference getSemanticObject_SemanticObject_DiffEAttribute() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_eattributes() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_eoperations() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_ereferences() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_esupertypes() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_interfaces() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_nested_classes() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEClass_nested_interfaces() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEOperation() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEPackage() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEPackage_eclassifiers() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEPackage_interfaces() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEReference() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffInterface() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffInterface_eoperations() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffInterface_esupertypes() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_EAttribute() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_EClass() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_EOperation() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_EPackage() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_EReference() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Interface() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(23);
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
	public EClass getDiffEAttribute() {
		return diffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_Diff_kind_Left() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_Diff_kind_Right() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_ChangeStatus() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_New_name_Left() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_New_name_Right() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_NameChangeStatus() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_New_etype_Left() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_New_etype_Right() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEAttribute_EtypeChangeStatus() {
		return (EAttribute)diffEAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass() {
		return diffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_Diff_kind_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_Diff_kind_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_name_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_name_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_NameChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_extends_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_extends_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ExtendsChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_implements_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_implements_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ImplementsChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_isAbstract_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_isAbstract_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_IsAbstractChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_packageName_Left() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_New_packageName_Right() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_PackageNameChangeStatus() {
		return (EAttribute)diffEClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_eattributes() {
		return diffEClass_eattributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eattributes_Diff_kind_Left() {
		return (EAttribute)diffEClass_eattributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eattributes_Diff_kind_Right() {
		return (EAttribute)diffEClass_eattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eattributes_ChangeStatus() {
		return (EAttribute)diffEClass_eattributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_eattributes_EType() {
		return (EReference)diffEClass_eattributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_eoperations() {
		return diffEClass_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eoperations_Diff_kind_Left() {
		return (EAttribute)diffEClass_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eoperations_Diff_kind_Right() {
		return (EAttribute)diffEClass_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_eoperations_ChangeStatus() {
		return (EAttribute)diffEClass_eoperationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_eoperations_EType() {
		return (EReference)diffEClass_eoperationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_ereferences() {
		return diffEClass_ereferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ereferences_Diff_kind_Left() {
		return (EAttribute)diffEClass_ereferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ereferences_Diff_kind_Right() {
		return (EAttribute)diffEClass_ereferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_ereferences_ChangeStatus() {
		return (EAttribute)diffEClass_ereferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_ereferences_EType() {
		return (EReference)diffEClass_ereferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_esupertypes() {
		return diffEClass_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_esupertypes_Diff_kind_Left() {
		return (EAttribute)diffEClass_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_esupertypes_Diff_kind_Right() {
		return (EAttribute)diffEClass_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_esupertypes_ChangeStatus() {
		return (EAttribute)diffEClass_esupertypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_esupertypes_EType() {
		return (EReference)diffEClass_esupertypesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_interfaces() {
		return diffEClass_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_interfaces_Diff_kind_Left() {
		return (EAttribute)diffEClass_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_interfaces_Diff_kind_Right() {
		return (EAttribute)diffEClass_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_interfaces_ChangeStatus() {
		return (EAttribute)diffEClass_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_interfaces_EType() {
		return (EReference)diffEClass_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_nested_classes() {
		return diffEClass_nested_classesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_classes_Diff_kind_Left() {
		return (EAttribute)diffEClass_nested_classesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_classes_Diff_kind_Right() {
		return (EAttribute)diffEClass_nested_classesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_classes_ChangeStatus() {
		return (EAttribute)diffEClass_nested_classesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_nested_classes_EType() {
		return (EReference)diffEClass_nested_classesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEClass_nested_interfaces() {
		return diffEClass_nested_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_interfaces_Diff_kind_Left() {
		return (EAttribute)diffEClass_nested_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_interfaces_Diff_kind_Right() {
		return (EAttribute)diffEClass_nested_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEClass_nested_interfaces_ChangeStatus() {
		return (EAttribute)diffEClass_nested_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEClass_nested_interfaces_EType() {
		return (EReference)diffEClass_nested_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEOperation() {
		return diffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_Diff_kind_Left() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_Diff_kind_Right() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_ChangeStatus() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_name_Left() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_name_Right() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_NameChangeStatus() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_eparameters_Left() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_eparameters_Right() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_EparametersChangeStatus() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_etype_Left() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_etype_Right() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_EtypeChangeStatus() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_methodBody_Left() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_New_methodBody_Right() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEOperation_MethodBodyChangeStatus() {
		return (EAttribute)diffEOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEPackage() {
		return diffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_Diff_kind_Left() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_Diff_kind_Right() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_ChangeStatus() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_New_name_Left() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_New_name_Right() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_NameChangeStatus() {
		return (EAttribute)diffEPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEPackage_eclassifiers() {
		return diffEPackage_eclassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_eclassifiers_Diff_kind_Left() {
		return (EAttribute)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_eclassifiers_Diff_kind_Right() {
		return (EAttribute)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_eclassifiers_ChangeStatus() {
		return (EAttribute)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEPackage_eclassifiers_EType() {
		return (EReference)diffEPackage_eclassifiersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEPackage_interfaces() {
		return diffEPackage_interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_interfaces_Diff_kind_Left() {
		return (EAttribute)diffEPackage_interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_interfaces_Diff_kind_Right() {
		return (EAttribute)diffEPackage_interfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEPackage_interfaces_ChangeStatus() {
		return (EAttribute)diffEPackage_interfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEPackage_interfaces_EType() {
		return (EReference)diffEPackage_interfacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEReference() {
		return diffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_Diff_kind_Left() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_Diff_kind_Right() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_ChangeStatus() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_New_name_Left() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_New_name_Right() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_NameChangeStatus() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_New_etype_Left() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_New_etype_Right() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEReference_EtypeChangeStatus() {
		return (EAttribute)diffEReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffInterface() {
		return diffInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_Diff_kind_Left() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_Diff_kind_Right() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_ChangeStatus() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_name_Left() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_name_Right() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_NameChangeStatus() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_extends_Left() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_extends_Right() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_ExtendsChangeStatus() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_packageName_Left() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_New_packageName_Right() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_PackageNameChangeStatus() {
		return (EAttribute)diffInterfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffInterface_eoperations() {
		return diffInterface_eoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_eoperations_Diff_kind_Left() {
		return (EAttribute)diffInterface_eoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_eoperations_Diff_kind_Right() {
		return (EAttribute)diffInterface_eoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_eoperations_ChangeStatus() {
		return (EAttribute)diffInterface_eoperationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffInterface_eoperations_EType() {
		return (EReference)diffInterface_eoperationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffInterface_esupertypes() {
		return diffInterface_esupertypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_esupertypes_Diff_kind_Left() {
		return (EAttribute)diffInterface_esupertypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_esupertypes_Diff_kind_Right() {
		return (EAttribute)diffInterface_esupertypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffInterface_esupertypes_ChangeStatus() {
		return (EAttribute)diffInterface_esupertypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffInterface_esupertypes_EType() {
		return (EReference)diffInterface_esupertypesEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(eClassEClass, ECLASS__EXTENDS);
		createEAttribute(eClassEClass, ECLASS__IMPLEMENTS);
		createEAttribute(eClassEClass, ECLASS__IS_ABSTRACT);
		createEAttribute(eClassEClass, ECLASS__PACKAGE_NAME);
		createEReference(eClassEClass, ECLASS__EATTRIBUTES);
		createEReference(eClassEClass, ECLASS__EOPERATIONS);
		createEReference(eClassEClass, ECLASS__EREFERENCES);
		createEReference(eClassEClass, ECLASS__ESUPERTYPES);
		createEReference(eClassEClass, ECLASS__INTERFACES);
		createEReference(eClassEClass, ECLASS__NESTED_CLASSES);
		createEReference(eClassEClass, ECLASS__NESTED_INTERFACES);
		createEReference(eClassEClass, ECLASS__DIFFEATTRIBUTES);
		createEReference(eClassEClass, ECLASS__DIFFEOPERATIONS);
		createEReference(eClassEClass, ECLASS__DIFFEREFERENCES);
		createEReference(eClassEClass, ECLASS__DIFFESUPERTYPES);
		createEReference(eClassEClass, ECLASS__DIFFINTERFACES);
		createEReference(eClassEClass, ECLASS__DIFFNESTED_CLASSES);
		createEReference(eClassEClass, ECLASS__DIFFNESTED_INTERFACES);

		eOperationEClass = createEClass(EOPERATION);
		createEAttribute(eOperationEClass, EOPERATION__NAME);
		createEAttribute(eOperationEClass, EOPERATION__EPARAMETERS);
		createEAttribute(eOperationEClass, EOPERATION__ETYPE);
		createEAttribute(eOperationEClass, EOPERATION__METHOD_BODY);
		createEAttribute(eOperationEClass, EOPERATION__ID_KDM);

		ePackageEClass = createEClass(EPACKAGE);
		createEAttribute(ePackageEClass, EPACKAGE__NAME);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);
		createEReference(ePackageEClass, EPACKAGE__INTERFACES);
		createEReference(ePackageEClass, EPACKAGE__DIFFECLASSIFIERS);
		createEReference(ePackageEClass, EPACKAGE__DIFFINTERFACES);

		eReferenceEClass = createEClass(EREFERENCE);
		createEAttribute(eReferenceEClass, EREFERENCE__NAME);
		createEAttribute(eReferenceEClass, EREFERENCE__ETYPE);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEAttribute(interfaceEClass, INTERFACE__EXTENDS);
		createEAttribute(interfaceEClass, INTERFACE__PACKAGE_NAME);
		createEReference(interfaceEClass, INTERFACE__EOPERATIONS);
		createEReference(interfaceEClass, INTERFACE__ESUPERTYPES);
		createEReference(interfaceEClass, INTERFACE__DIFFEOPERATIONS);
		createEReference(interfaceEClass, INTERFACE__DIFFESUPERTYPES);

		semanticObjectEClass = createEClass(SEMANTIC_OBJECT);
		createEAttribute(semanticObjectEClass, SEMANTIC_OBJECT__NAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE);

		semanticDiffEClass = createEClass(SEMANTIC_DIFF);
		createEAttribute(semanticDiffEClass, SEMANTIC_DIFF__AUTHOR);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTICDIFFS);

		diffEAttributeEClass = createEClass(DIFF_EATTRIBUTE);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__DIFF_KIND_LEFT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__DIFF_KIND_RIGHT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__CHANGE_STATUS);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_NAME_LEFT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_NAME_RIGHT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NAME_CHANGE_STATUS);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_ETYPE_LEFT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT);
		createEAttribute(diffEAttributeEClass, DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS);

		diffEClassEClass = createEClass(DIFF_ECLASS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__DIFF_KIND_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__DIFF_KIND_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__CHANGE_STATUS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_NAME_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_NAME_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NAME_CHANGE_STATUS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_EXTENDS_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_EXTENDS_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__EXTENDS_CHANGE_STATUS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_IMPLEMENTS_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT);
		createEAttribute(diffEClassEClass, DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS);

		diffEClass_eattributesEClass = createEClass(DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS);
		createEReference(diffEClass_eattributesEClass, DIFF_ECLASS_EATTRIBUTES__ETYPE);

		diffEClass_eoperationsEClass = createEClass(DIFF_ECLASS_EOPERATIONS);
		createEAttribute(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS);
		createEReference(diffEClass_eoperationsEClass, DIFF_ECLASS_EOPERATIONS__ETYPE);

		diffEClass_ereferencesEClass = createEClass(DIFF_ECLASS_EREFERENCES);
		createEAttribute(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__CHANGE_STATUS);
		createEReference(diffEClass_ereferencesEClass, DIFF_ECLASS_EREFERENCES__ETYPE);

		diffEClass_esupertypesEClass = createEClass(DIFF_ECLASS_ESUPERTYPES);
		createEAttribute(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS);
		createEReference(diffEClass_esupertypesEClass, DIFF_ECLASS_ESUPERTYPES__ETYPE);

		diffEClass_interfacesEClass = createEClass(DIFF_ECLASS_INTERFACES);
		createEAttribute(diffEClass_interfacesEClass, DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_interfacesEClass, DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_interfacesEClass, DIFF_ECLASS_INTERFACES__CHANGE_STATUS);
		createEReference(diffEClass_interfacesEClass, DIFF_ECLASS_INTERFACES__ETYPE);

		diffEClass_nested_classesEClass = createEClass(DIFF_ECLASS_NESTED_CLASSES);
		createEAttribute(diffEClass_nested_classesEClass, DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_nested_classesEClass, DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_nested_classesEClass, DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS);
		createEReference(diffEClass_nested_classesEClass, DIFF_ECLASS_NESTED_CLASSES__ETYPE);

		diffEClass_nested_interfacesEClass = createEClass(DIFF_ECLASS_NESTED_INTERFACES);
		createEAttribute(diffEClass_nested_interfacesEClass, DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(diffEClass_nested_interfacesEClass, DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(diffEClass_nested_interfacesEClass, DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS);
		createEReference(diffEClass_nested_interfacesEClass, DIFF_ECLASS_NESTED_INTERFACES__ETYPE);

		diffEOperationEClass = createEClass(DIFF_EOPERATION);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__DIFF_KIND_LEFT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__DIFF_KIND_RIGHT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__CHANGE_STATUS);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_NAME_LEFT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_NAME_RIGHT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NAME_CHANGE_STATUS);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_EPARAMETERS_LEFT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_ETYPE_LEFT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_ETYPE_RIGHT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__ETYPE_CHANGE_STATUS);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_METHOD_BODY_LEFT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT);
		createEAttribute(diffEOperationEClass, DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS);

		diffEPackageEClass = createEClass(DIFF_EPACKAGE);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__DIFF_KIND_LEFT);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__DIFF_KIND_RIGHT);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__CHANGE_STATUS);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__NEW_NAME_LEFT);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__NEW_NAME_RIGHT);
		createEAttribute(diffEPackageEClass, DIFF_EPACKAGE__NAME_CHANGE_STATUS);

		diffEPackage_eclassifiersEClass = createEClass(DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT);
		createEAttribute(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT);
		createEAttribute(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS);
		createEReference(diffEPackage_eclassifiersEClass, DIFF_EPACKAGE_ECLASSIFIERS__ETYPE);

		diffEPackage_interfacesEClass = createEClass(DIFF_EPACKAGE_INTERFACES);
		createEAttribute(diffEPackage_interfacesEClass, DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT);
		createEAttribute(diffEPackage_interfacesEClass, DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT);
		createEAttribute(diffEPackage_interfacesEClass, DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS);
		createEReference(diffEPackage_interfacesEClass, DIFF_EPACKAGE_INTERFACES__ETYPE);

		diffEReferenceEClass = createEClass(DIFF_EREFERENCE);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__DIFF_KIND_LEFT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__DIFF_KIND_RIGHT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__CHANGE_STATUS);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_NAME_LEFT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_NAME_RIGHT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NAME_CHANGE_STATUS);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_ETYPE_LEFT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__NEW_ETYPE_RIGHT);
		createEAttribute(diffEReferenceEClass, DIFF_EREFERENCE__ETYPE_CHANGE_STATUS);

		diffInterfaceEClass = createEClass(DIFF_INTERFACE);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__DIFF_KIND_LEFT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__DIFF_KIND_RIGHT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__CHANGE_STATUS);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_NAME_LEFT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_NAME_RIGHT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NAME_CHANGE_STATUS);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_EXTENDS_LEFT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_EXTENDS_RIGHT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__EXTENDS_CHANGE_STATUS);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT);
		createEAttribute(diffInterfaceEClass, DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS);

		diffInterface_eoperationsEClass = createEClass(DIFF_INTERFACE_EOPERATIONS);
		createEAttribute(diffInterface_eoperationsEClass, DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT);
		createEAttribute(diffInterface_eoperationsEClass, DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT);
		createEAttribute(diffInterface_eoperationsEClass, DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS);
		createEReference(diffInterface_eoperationsEClass, DIFF_INTERFACE_EOPERATIONS__ETYPE);

		diffInterface_esupertypesEClass = createEClass(DIFF_INTERFACE_ESUPERTYPES);
		createEAttribute(diffInterface_esupertypesEClass, DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT);
		createEAttribute(diffInterface_esupertypesEClass, DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT);
		createEAttribute(diffInterface_esupertypesEClass, DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS);
		createEReference(diffInterface_esupertypesEClass, DIFF_INTERFACE_ESUPERTYPES__ETYPE);

		// Create enums
		diffKindEEnum = createEEnum(DIFF_KIND);
		authorEEnum = createEEnum(AUTHOR);
		changeStatusEEnum = createEEnum(CHANGE_STATUS);
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
		semanticDiffEClass.getESuperTypes().add(this.getSemanticObject());
		semanticConflictEClass.getESuperTypes().add(this.getSemanticObject());
		diffEAttributeEClass.getESuperTypes().add(this.getEAttribute());
		diffEClassEClass.getESuperTypes().add(this.getEClass());
		diffEOperationEClass.getESuperTypes().add(this.getEOperation());
		diffEPackageEClass.getESuperTypes().add(this.getEPackage());
		diffEReferenceEClass.getESuperTypes().add(this.getEReference());
		diffInterfaceEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAttributeEClass, refactoringDiffMM.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAttribute_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, refactoringDiffMM.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, refactoringDiffMM.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Eattributes(), this.getEAttribute(), null, "eattributes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Eoperations(), this.getEOperation(), null, "eoperations", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Ereferences(), this.getEReference(), null, "ereferences", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Esupertypes(), this.getEClass(), null, "esupertypes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Nested_classes(), this.getEClass(), null, "nested_classes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Nested_interfaces(), this.getInterface(), null, "nested_interfaces", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEClass_Diffeattributes(), this.getDiffEClass_eattributes(), null, "diffeattributes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffeoperations(), this.getDiffEClass_eoperations(), null, "diffeoperations", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Differeferences(), this.getDiffEClass_ereferences(), null, "differeferences", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffesupertypes(), this.getDiffEClass_esupertypes(), null, "diffesupertypes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffinterfaces(), this.getDiffEClass_interfaces(), null, "diffinterfaces", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffnested_classes(), this.getDiffEClass_nested_classes(), null, "diffnested_classes", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Diffnested_interfaces(), this.getDiffEClass_nested_interfaces(), null, "diffnested_interfaces", null, 0, -1, refactoringDiffMM.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eOperationEClass, EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation_Eparameters(), ecorePackage.getEString(), "eparameters", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation_MethodBody(), ecorePackage.getEString(), "methodBody", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEOperation___idKDM(), ecorePackage.getEString(), "__idKDM", null, 0, 1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePackageEClass, refactoringDiffMM.EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_Eclassifiers(), this.getEClass(), null, "eclassifiers", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEPackage_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEPackage_Diffeclassifiers(), this.getDiffEPackage_eclassifiers(), null, "diffeclassifiers", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_Diffinterfaces(), this.getDiffEPackage_interfaces(), null, "diffinterfaces", null, 0, -1, refactoringDiffMM.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceEClass, refactoringDiffMM.EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, refactoringDiffMM.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_Etype(), ecorePackage.getEString(), "etype", null, 0, 1, refactoringDiffMM.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Eoperations(), this.getEOperation(), null, "eoperations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Esupertypes(), this.getInterface(), null, "esupertypes", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Diffeoperations(), this.getDiffInterface_eoperations(), null, "diffeoperations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Diffesupertypes(), this.getDiffInterface_esupertypes(), null, "diffesupertypes", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticObjectEClass, SemanticObject.class, "SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEAttribute(), this.getDiffEAttribute(), null, "SemanticObject_DiffEAttribute", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass(), this.getDiffEClass(), null, "SemanticObject_DiffEClass", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_eattributes(), this.getDiffEClass_eattributes(), null, "SemanticObject_DiffEClass_eattributes", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_eoperations(), this.getDiffEClass_eoperations(), null, "SemanticObject_DiffEClass_eoperations", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_ereferences(), this.getDiffEClass_ereferences(), null, "SemanticObject_DiffEClass_ereferences", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_esupertypes(), this.getDiffEClass_esupertypes(), null, "SemanticObject_DiffEClass_esupertypes", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_interfaces(), this.getDiffEClass_interfaces(), null, "SemanticObject_DiffEClass_interfaces", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_nested_classes(), this.getDiffEClass_nested_classes(), null, "SemanticObject_DiffEClass_nested_classes", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEClass_nested_interfaces(), this.getDiffEClass_nested_interfaces(), null, "SemanticObject_DiffEClass_nested_interfaces", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEOperation(), this.getDiffEOperation(), null, "SemanticObject_DiffEOperation", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEPackage(), this.getDiffEPackage(), null, "SemanticObject_DiffEPackage", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEPackage_eclassifiers(), this.getDiffEPackage_eclassifiers(), null, "SemanticObject_DiffEPackage_eclassifiers", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEPackage_interfaces(), this.getDiffEPackage_interfaces(), null, "SemanticObject_DiffEPackage_interfaces", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEReference(), this.getDiffEReference(), null, "SemanticObject_DiffEReference", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffInterface(), this.getDiffInterface(), null, "SemanticObject_DiffInterface", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffInterface_eoperations(), this.getDiffInterface_eoperations(), null, "SemanticObject_DiffInterface_eoperations", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffInterface_esupertypes(), this.getDiffInterface_esupertypes(), null, "SemanticObject_DiffInterface_esupertypes", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_EAttribute(), this.getEAttribute(), null, "SemanticObject_EAttribute", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_EClass(), this.getEClass(), null, "SemanticObject_EClass", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_EOperation(), this.getEOperation(), null, "SemanticObject_EOperation", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_EPackage(), this.getEPackage(), null, "SemanticObject_EPackage", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_EReference(), this.getEReference(), null, "SemanticObject_EReference", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Interface(), this.getInterface(), null, "SemanticObject_Interface", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(semanticDiffEClass, SemanticDiff.class, "SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticDiff_Author(), this.getAUTHOR(), "author", "NON", 1, 1, SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticConflict_Semanticdiffs(), this.getSemanticDiff(), null, "semanticdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diffEAttributeEClass, DiffEAttribute.class, "DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEAttribute_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEAttribute_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", "NON", 1, 1, DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClassEClass, DiffEClass.class, "DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_extends_Left(), ecorePackage.getEString(), "new_extends_Left", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_extends_Right(), ecorePackage.getEString(), "new_extends_Right", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_ExtendsChangeStatus(), this.getChangeStatus(), "extendsChangeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_implements_Left(), ecorePackage.getEString(), "new_implements_Left", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_implements_Right(), ecorePackage.getEString(), "new_implements_Right", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_ImplementsChangeStatus(), this.getChangeStatus(), "implementsChangeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_isAbstract_Left(), ecorePackage.getEBoolean(), "new_isAbstract_Left", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_isAbstract_Right(), ecorePackage.getEBoolean(), "new_isAbstract_Right", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_IsAbstractChangeStatus(), this.getChangeStatus(), "isAbstractChangeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_packageName_Left(), ecorePackage.getEString(), "new_packageName_Left", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_New_packageName_Right(), ecorePackage.getEString(), "new_packageName_Right", null, 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_PackageNameChangeStatus(), this.getChangeStatus(), "packageNameChangeStatus", "NON", 1, 1, DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_eattributesEClass, DiffEClass_eattributes.class, "DiffEClass_eattributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_eattributes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_eattributes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_eattributes_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_eattributes_EType(), this.getEAttribute(), null, "eType", null, 1, 1, DiffEClass_eattributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_eoperationsEClass, DiffEClass_eoperations.class, "DiffEClass_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_eoperations_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_eoperations_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_eoperations_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_eoperations_EType(), this.getEOperation(), null, "eType", null, 1, 1, DiffEClass_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_ereferencesEClass, DiffEClass_ereferences.class, "DiffEClass_ereferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_ereferences_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_ereferences_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_ereferences_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_ereferences_EType(), this.getEReference(), null, "eType", null, 1, 1, DiffEClass_ereferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_esupertypesEClass, DiffEClass_esupertypes.class, "DiffEClass_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_esupertypes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_esupertypes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_esupertypes_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_esupertypes_EType(), this.getEClass(), null, "eType", null, 1, 1, DiffEClass_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_interfacesEClass, DiffEClass_interfaces.class, "DiffEClass_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_interfaces_EType(), this.getInterface(), null, "eType", null, 1, 1, DiffEClass_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_nested_classesEClass, DiffEClass_nested_classes.class, "DiffEClass_nested_classes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_nested_classes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_nested_classes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_nested_classes_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_nested_classes_EType(), this.getEClass(), null, "eType", null, 1, 1, DiffEClass_nested_classes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass_nested_interfacesEClass, DiffEClass_nested_interfaces.class, "DiffEClass_nested_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEClass_nested_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_nested_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEClass_nested_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEClass_nested_interfaces_EType(), this.getInterface(), null, "eType", null, 1, 1, DiffEClass_nested_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEOperationEClass, DiffEOperation.class, "DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEOperation_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_eparameters_Left(), ecorePackage.getEString(), "new_eparameters_Left", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_eparameters_Right(), ecorePackage.getEString(), "new_eparameters_Right", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_EparametersChangeStatus(), this.getChangeStatus(), "eparametersChangeStatus", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_methodBody_Left(), ecorePackage.getEString(), "new_methodBody_Left", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_New_methodBody_Right(), ecorePackage.getEString(), "new_methodBody_Right", null, 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEOperation_MethodBodyChangeStatus(), this.getChangeStatus(), "methodBodyChangeStatus", "NON", 1, 1, DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackageEClass, DiffEPackage.class, "DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackage_eclassifiersEClass, DiffEPackage_eclassifiers.class, "DiffEPackage_eclassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_eclassifiers_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_eclassifiers_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_eclassifiers_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEPackage_eclassifiers_EType(), this.getEClass(), null, "eType", null, 1, 1, DiffEPackage_eclassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEPackage_interfacesEClass, DiffEPackage_interfaces.class, "DiffEPackage_interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEPackage_interfaces_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_interfaces_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEPackage_interfaces_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEPackage_interfaces_EType(), this.getInterface(), null, "eType", null, 1, 1, DiffEPackage_interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEReferenceEClass, DiffEReference.class, "DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEReference_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_etype_Left(), ecorePackage.getEString(), "new_etype_Left", null, 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_New_etype_Right(), ecorePackage.getEString(), "new_etype_Right", null, 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEReference_EtypeChangeStatus(), this.getChangeStatus(), "etypeChangeStatus", "NON", 1, 1, DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInterfaceEClass, DiffInterface.class, "DiffInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInterface_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_name_Left(), ecorePackage.getEString(), "new_name_Left", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_name_Right(), ecorePackage.getEString(), "new_name_Right", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_NameChangeStatus(), this.getChangeStatus(), "nameChangeStatus", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_extends_Left(), ecorePackage.getEString(), "new_extends_Left", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_extends_Right(), ecorePackage.getEString(), "new_extends_Right", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_ExtendsChangeStatus(), this.getChangeStatus(), "extendsChangeStatus", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_packageName_Left(), ecorePackage.getEString(), "new_packageName_Left", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_New_packageName_Right(), ecorePackage.getEString(), "new_packageName_Right", null, 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_PackageNameChangeStatus(), this.getChangeStatus(), "packageNameChangeStatus", "NON", 1, 1, DiffInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInterface_eoperationsEClass, DiffInterface_eoperations.class, "DiffInterface_eoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInterface_eoperations_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_eoperations_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_eoperations_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffInterface_eoperations_EType(), this.getEOperation(), null, "eType", null, 1, 1, DiffInterface_eoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffInterface_esupertypesEClass, DiffInterface_esupertypes.class, "DiffInterface_esupertypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffInterface_esupertypes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_esupertypes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffInterface_esupertypes_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffInterface_esupertypes_EType(), this.getInterface(), null, "eType", null, 1, 1, DiffInterface_esupertypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(diffKindEEnum, DiffKind.class, "DiffKind");
		addEEnumLiteral(diffKindEEnum, DiffKind.ADD);
		addEEnumLiteral(diffKindEEnum, DiffKind.DELETE);
		addEEnumLiteral(diffKindEEnum, DiffKind.MODIFY);
		addEEnumLiteral(diffKindEEnum, DiffKind.NON);

		initEEnum(authorEEnum, refactoringDiffMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, refactoringDiffMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, refactoringDiffMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, refactoringDiffMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, refactoringDiffMM.AUTHOR.MIXED);
		addEEnumLiteral(authorEEnum, refactoringDiffMM.AUTHOR.NON);

		initEEnum(changeStatusEEnum, ChangeStatus.class, "ChangeStatus");
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.EQUIVALENT);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.CONTRADICTING);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.NON);

		// Create resource
		createResource(eNS_URI);
	}

} //RefactoringDiffMMPackageImpl
