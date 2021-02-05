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
			case RefactoringDiffMMPackage.EATTRIBUTE: return createEAttribute();
			case RefactoringDiffMMPackage.ECLASS: return createEClass();
			case RefactoringDiffMMPackage.EOPERATION: return createEOperation();
			case RefactoringDiffMMPackage.EPACKAGE: return createEPackage();
			case RefactoringDiffMMPackage.EREFERENCE: return createEReference();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE: return createDiffEAttribute();
			case RefactoringDiffMMPackage.DIFF_ECLASS: return createDiffEClass();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: return createDiffEClass_eattributes();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS: return createDiffEClass_eoperations();
			case RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES: return createDiffEClass_ereferences();
			case RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES: return createDiffEClass_esupertypes();
			case RefactoringDiffMMPackage.DIFF_EOPERATION: return createDiffEOperation();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE: return createDiffEPackage();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: return createDiffEPackage_eclassifiers();
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: return createDiffEPackage_domainspecificdiffs();
			case RefactoringDiffMMPackage.DIFF_EREFERENCE: return createDiffEReference();
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
			case RefactoringDiffMMPackage.CLASS_OP:
				return createClassOpFromString(eDataType, initialValue);
			case RefactoringDiffMMPackage.ASC_OP:
				return createAscOpFromString(eDataType, initialValue);
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
			case RefactoringDiffMMPackage.CLASS_OP:
				return convertClassOpToString(eDataType, instanceValue);
			case RefactoringDiffMMPackage.ASC_OP:
				return convertAscOpToString(eDataType, instanceValue);
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
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public refactoringDiffMM.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public refactoringDiffMM.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAttribute createDiffEAttribute() {
		DiffEAttributeImpl diffEAttribute = new DiffEAttributeImpl();
		return diffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass createDiffEClass() {
		DiffEClassImpl diffEClass = new DiffEClassImpl();
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eattributes createDiffEClass_eattributes() {
		DiffEClass_eattributesImpl diffEClass_eattributes = new DiffEClass_eattributesImpl();
		return diffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eoperations createDiffEClass_eoperations() {
		DiffEClass_eoperationsImpl diffEClass_eoperations = new DiffEClass_eoperationsImpl();
		return diffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_ereferences createDiffEClass_ereferences() {
		DiffEClass_ereferencesImpl diffEClass_ereferences = new DiffEClass_ereferencesImpl();
		return diffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_esupertypes createDiffEClass_esupertypes() {
		DiffEClass_esupertypesImpl diffEClass_esupertypes = new DiffEClass_esupertypesImpl();
		return diffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation createDiffEOperation() {
		DiffEOperationImpl diffEOperation = new DiffEOperationImpl();
		return diffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage createDiffEPackage() {
		DiffEPackageImpl diffEPackage = new DiffEPackageImpl();
		return diffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_eclassifiers createDiffEPackage_eclassifiers() {
		DiffEPackage_eclassifiersImpl diffEPackage_eclassifiers = new DiffEPackage_eclassifiersImpl();
		return diffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_domainspecificdiffs createDiffEPackage_domainspecificdiffs() {
		DiffEPackage_domainspecificdiffsImpl diffEPackage_domainspecificdiffs = new DiffEPackage_domainspecificdiffsImpl();
		return diffEPackage_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEReference createDiffEReference() {
		DiffEReferenceImpl diffEReference = new DiffEReferenceImpl();
		return diffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp createClassOpFromString(EDataType eDataType, String initialValue) {
		ClassOp result = ClassOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscOp createAscOpFromString(EDataType eDataType, String initialValue) {
		AscOp result = AscOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
