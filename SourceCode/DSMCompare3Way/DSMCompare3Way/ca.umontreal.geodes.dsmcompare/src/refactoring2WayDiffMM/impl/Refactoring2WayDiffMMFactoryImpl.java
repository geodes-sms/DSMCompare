/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import refactoring2WayDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Refactoring2WayDiffMMFactoryImpl extends EFactoryImpl implements Refactoring2WayDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Refactoring2WayDiffMMFactory init() {
		try {
			Refactoring2WayDiffMMFactory theRefactoring2WayDiffMMFactory = (Refactoring2WayDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(Refactoring2WayDiffMMPackage.eNS_URI);
			if (theRefactoring2WayDiffMMFactory != null) {
				return theRefactoring2WayDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Refactoring2WayDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring2WayDiffMMFactoryImpl() {
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
			case Refactoring2WayDiffMMPackage.EATTRIBUTE: return createEAttribute();
			case Refactoring2WayDiffMMPackage.ECLASS: return createEClass();
			case Refactoring2WayDiffMMPackage.EOPERATION: return createEOperation();
			case Refactoring2WayDiffMMPackage.EPACKAGE: return createEPackage();
			case Refactoring2WayDiffMMPackage.EREFERENCE: return createEReference();
			case Refactoring2WayDiffMMPackage.INTERFACE: return createInterface();
			case Refactoring2WayDiffMMPackage.SEMANTIC_DIFF: return createSemanticDiff();
			case Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE: return createDiffEAttribute();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS: return createDiffEClass();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: return createDiffEClass_eattributes();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS: return createDiffEClass_eoperations();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES: return createDiffEClass_ereferences();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES: return createDiffEClass_esupertypes();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES: return createDiffEClass_interfaces();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES: return createDiffEClass_nested_classes();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES: return createDiffEClass_nested_interfaces();
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION: return createDiffEOperation();
			case Refactoring2WayDiffMMPackage.DIFF_EPACKAGE: return createDiffEPackage();
			case Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: return createDiffEPackage_eclassifiers();
			case Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES: return createDiffEPackage_interfaces();
			case Refactoring2WayDiffMMPackage.DIFF_EREFERENCE: return createDiffEReference();
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE: return createDiffInterface();
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS: return createDiffInterface_eoperations();
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES: return createDiffInterface_esupertypes();
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
			case Refactoring2WayDiffMMPackage.DIFF_KIND:
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
			case Refactoring2WayDiffMMPackage.DIFF_KIND:
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
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public refactoring2WayDiffMM.EClass createEClass() {
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
	public refactoring2WayDiffMM.EPackage createEPackage() {
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
	public SemanticDiff createSemanticDiff() {
		SemanticDiffImpl semanticDiff = new SemanticDiffImpl();
		return semanticDiff;
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
	public Refactoring2WayDiffMMPackage getRefactoring2WayDiffMMPackage() {
		return (Refactoring2WayDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Refactoring2WayDiffMMPackage getPackage() {
		return Refactoring2WayDiffMMPackage.eINSTANCE;
	}

} //Refactoring2WayDiffMMFactoryImpl
