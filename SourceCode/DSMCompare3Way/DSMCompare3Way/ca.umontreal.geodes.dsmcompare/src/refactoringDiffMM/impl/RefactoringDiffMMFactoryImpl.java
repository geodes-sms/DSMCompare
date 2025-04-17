/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import refactoringDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringDiffMMFactoryImpl extends EFactoryImpl implements RefactoringDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringDiffMMFactory init() {
		try {
			RefactoringDiffMMFactory theRefactoringDiffMMFactory = (RefactoringDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(RefactoringDiffMMPackage.eNS_URI);
			if (theRefactoringDiffMMFactory != null) {
				return theRefactoringDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringDiffMMFactoryImpl() {
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
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION: return createConflictResolution();
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE: return createDiffEAttribute();
			case RefactoringDiffMMPackage.DIFF_ECLASS: return createDiffEClass();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: return createDiffEClass_eattributes();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS: return createDiffEClass_eoperations();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES: return createDiffEClass_ereferences();
			case RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES: return createDiffEClass_esupertypes();
			case RefactoringDiffMMPackage.DIFF_ECLASS_INTERFACES: return createDiffEClass_interfaces();
			case RefactoringDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES: return createDiffEClass_nested_classes();
			case RefactoringDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES: return createDiffEClass_nested_interfaces();
			case RefactoringDiffMMPackage.DIFF_EOPERATION: return createDiffEOperation();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE: return createDiffEPackage();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: return createDiffEPackage_eclassifiers();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES: return createDiffEPackage_interfaces();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_TEST: return createDiffEPackage_test();
			case RefactoringDiffMMPackage.DIFF_EREFERENCE: return createDiffEReference();
			case RefactoringDiffMMPackage.DIFF_INTERFACE: return createDiffInterface();
			case RefactoringDiffMMPackage.DIFF_INTERFACE_EOPERATIONS: return createDiffInterface_eoperations();
			case RefactoringDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES: return createDiffInterface_esupertypes();
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS: return createDifftestAssociations();
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS_MULTI: return createDifftestAssociations_multi();
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS_SINGLE: return createDifftestAssociations_single();
			case RefactoringDiffMMPackage.EATTRIBUTE: return createEAttribute();
			case RefactoringDiffMMPackage.ECLASS: return createEClass();
			case RefactoringDiffMMPackage.EOPERATION: return createEOperation();
			case RefactoringDiffMMPackage.EPACKAGE: return createEPackage();
			case RefactoringDiffMMPackage.EREFERENCE: return createEReference();
			case RefactoringDiffMMPackage.INTERFACE: return createInterface();
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case RefactoringDiffMMPackage.SEMANTIC_DIFF: return createSemanticDiff();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS: return createtestAssociations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RefactoringDiffMMPackage.AUTHOR:
				return createAUTHORFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.CHANGE_STATUS:
				return createChangeStatusFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.CONFLICT_GRANULARITY:
				return createConflictGranularityFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return createConflictResolutionStrategyFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION_TYPE:
				return createConflictResolutionTypeFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.DIFF_KIND:
				return createDiffKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RefactoringDiffMMPackage.AUTHOR:
				return convertAUTHORToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.CHANGE_STATUS:
				return convertChangeStatusToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.CONFLICT_GRANULARITY:
				return convertConflictGranularityToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return convertConflictResolutionStrategyToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION_TYPE:
				return convertConflictResolutionTypeToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.DIFF_KIND:
				return convertDiffKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolution createConflictResolution() {
		ConflictResolutionImpl conflictResolution = new ConflictResolutionImpl();
		return conflictResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEAttribute createDiffEAttribute() {
		DiffEAttributeImpl diffEAttribute = new DiffEAttributeImpl();
		return diffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass createDiffEClass() {
		DiffEClassImpl diffEClass = new DiffEClassImpl();
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_eattributes createDiffEClass_eattributes() {
		DiffEClass_eattributesImpl diffEClass_eattributes = new DiffEClass_eattributesImpl();
		return diffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_eoperations createDiffEClass_eoperations() {
		DiffEClass_eoperationsImpl diffEClass_eoperations = new DiffEClass_eoperationsImpl();
		return diffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_ereferences createDiffEClass_ereferences() {
		DiffEClass_ereferencesImpl diffEClass_ereferences = new DiffEClass_ereferencesImpl();
		return diffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_esupertypes createDiffEClass_esupertypes() {
		DiffEClass_esupertypesImpl diffEClass_esupertypes = new DiffEClass_esupertypesImpl();
		return diffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_interfaces createDiffEClass_interfaces() {
		DiffEClass_interfacesImpl diffEClass_interfaces = new DiffEClass_interfacesImpl();
		return diffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_nested_classes createDiffEClass_nested_classes() {
		DiffEClass_nested_classesImpl diffEClass_nested_classes = new DiffEClass_nested_classesImpl();
		return diffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEClass_nested_interfaces createDiffEClass_nested_interfaces() {
		DiffEClass_nested_interfacesImpl diffEClass_nested_interfaces = new DiffEClass_nested_interfacesImpl();
		return diffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEOperation createDiffEOperation() {
		DiffEOperationImpl diffEOperation = new DiffEOperationImpl();
		return diffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEPackage createDiffEPackage() {
		DiffEPackageImpl diffEPackage = new DiffEPackageImpl();
		return diffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEPackage_eclassifiers createDiffEPackage_eclassifiers() {
		DiffEPackage_eclassifiersImpl diffEPackage_eclassifiers = new DiffEPackage_eclassifiersImpl();
		return diffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEPackage_interfaces createDiffEPackage_interfaces() {
		DiffEPackage_interfacesImpl diffEPackage_interfaces = new DiffEPackage_interfacesImpl();
		return diffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEPackage_test createDiffEPackage_test() {
		DiffEPackage_testImpl diffEPackage_test = new DiffEPackage_testImpl();
		return diffEPackage_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEReference createDiffEReference() {
		DiffEReferenceImpl diffEReference = new DiffEReferenceImpl();
		return diffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffInterface createDiffInterface() {
		DiffInterfaceImpl diffInterface = new DiffInterfaceImpl();
		return diffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffInterface_eoperations createDiffInterface_eoperations() {
		DiffInterface_eoperationsImpl diffInterface_eoperations = new DiffInterface_eoperationsImpl();
		return diffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffInterface_esupertypes createDiffInterface_esupertypes() {
		DiffInterface_esupertypesImpl diffInterface_esupertypes = new DiffInterface_esupertypesImpl();
		return diffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifftestAssociations createDifftestAssociations() {
		DifftestAssociationsImpl difftestAssociations = new DifftestAssociationsImpl();
		return difftestAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifftestAssociations_multi createDifftestAssociations_multi() {
		DifftestAssociations_multiImpl difftestAssociations_multi = new DifftestAssociations_multiImpl();
		return difftestAssociations_multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifftestAssociations_single createDifftestAssociations_single() {
		DifftestAssociations_singleImpl difftestAssociations_single = new DifftestAssociations_singleImpl();
		return difftestAssociations_single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public refactoringDiffMM.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public refactoringDiffMM.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticConflict createSemanticConflict() {
		SemanticConflictImpl semanticConflict = new SemanticConflictImpl();
		return semanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticDiff createSemanticDiff() {
		SemanticDiffImpl semanticDiff = new SemanticDiffImpl();
		return semanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testAssociations createtestAssociations() {
		testAssociationsImpl testAssociations = new testAssociationsImpl();
		return testAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHOR createAUTHORFromString(EDataType eDataType, String initialValue) {
		AUTHOR result = AUTHOR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAUTHORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus createChangeStatusFromString(EDataType eDataType, String initialValue) {
		ChangeStatus result = ChangeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictGranularity createConflictGranularityFromString(EDataType eDataType, String initialValue) {
		ConflictGranularity result = ConflictGranularity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictGranularityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionStrategy createConflictResolutionStrategyFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionStrategy result = ConflictResolutionStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionType createConflictResolutionTypeFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionType result = ConflictResolutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind createDiffKindFromString(EDataType eDataType, String initialValue) {
		DiffKind result = DiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringDiffMMPackage getRefactoringDiffMMPackage() {
		return (RefactoringDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringDiffMMPackage getPackage() {
		return RefactoringDiffMMPackage.eINSTANCE;
	}

} //RefactoringDiffMMFactoryImpl
