/**
 */
package refactoringRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import refactoringRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringRuleMMFactoryImpl extends EFactoryImpl implements RefactoringRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringRuleMMFactory init() {
		try {
			RefactoringRuleMMFactory theRefactoringRuleMMFactory = (RefactoringRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(RefactoringRuleMMPackage.eNS_URI);
			if (theRefactoringRuleMMFactory != null) {
				return theRefactoringRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringRuleMMFactoryImpl() {
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
			case RefactoringRuleMMPackage.PATTERN_EATTRIBUTE: return createPattern_EAttribute();
			case RefactoringRuleMMPackage.PATTERN_ECLASS: return createPattern_EClass();
			case RefactoringRuleMMPackage.PATTERN_EOPERATION: return createPattern_EOperation();
			case RefactoringRuleMMPackage.PATTERN_EPACKAGE: return createPattern_EPackage();
			case RefactoringRuleMMPackage.PATTERN_EREFERENCE: return createPattern_EReference();
			case RefactoringRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: return createPattern_DomainSpecificDiff();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: return createPattern_DiffEAttribute();
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS: return createPattern_DiffEClass();
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: return createPattern_DiffEClass_eattributes();
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: return createPattern_DiffEClass_eoperations();
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: return createPattern_DiffEClass_ereferences();
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPERTYPES: return createPattern_DiffEClass_esupertypes();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EOPERATION: return createPattern_DiffEOperation();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE: return createPattern_DiffEPackage();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: return createPattern_DiffEPackage_eclassifiers();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: return createPattern_DiffEPackage_domainspecificdiffs();
			case RefactoringRuleMMPackage.PATTERN_DIFF_EREFERENCE: return createPattern_DiffEReference();
			case RefactoringRuleMMPackage.RULE: return createRule();
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
	public Pattern_EAttribute createPattern_EAttribute() {
		Pattern_EAttributeImpl pattern_EAttribute = new Pattern_EAttributeImpl();
		return pattern_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EClass createPattern_EClass() {
		Pattern_EClassImpl pattern_EClass = new Pattern_EClassImpl();
		return pattern_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EOperation createPattern_EOperation() {
		Pattern_EOperationImpl pattern_EOperation = new Pattern_EOperationImpl();
		return pattern_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EPackage createPattern_EPackage() {
		Pattern_EPackageImpl pattern_EPackage = new Pattern_EPackageImpl();
		return pattern_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EReference createPattern_EReference() {
		Pattern_EReferenceImpl pattern_EReference = new Pattern_EReferenceImpl();
		return pattern_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff() {
		Pattern_DomainSpecificDiffImpl pattern_DomainSpecificDiff = new Pattern_DomainSpecificDiffImpl();
		return pattern_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAttribute createPattern_DiffEAttribute() {
		Pattern_DiffEAttributeImpl pattern_DiffEAttribute = new Pattern_DiffEAttributeImpl();
		return pattern_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass createPattern_DiffEClass() {
		Pattern_DiffEClassImpl pattern_DiffEClass = new Pattern_DiffEClassImpl();
		return pattern_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eattributes createPattern_DiffEClass_eattributes() {
		Pattern_DiffEClass_eattributesImpl pattern_DiffEClass_eattributes = new Pattern_DiffEClass_eattributesImpl();
		return pattern_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eoperations createPattern_DiffEClass_eoperations() {
		Pattern_DiffEClass_eoperationsImpl pattern_DiffEClass_eoperations = new Pattern_DiffEClass_eoperationsImpl();
		return pattern_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_ereferences createPattern_DiffEClass_ereferences() {
		Pattern_DiffEClass_ereferencesImpl pattern_DiffEClass_ereferences = new Pattern_DiffEClass_ereferencesImpl();
		return pattern_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_esupertypes createPattern_DiffEClass_esupertypes() {
		Pattern_DiffEClass_esupertypesImpl pattern_DiffEClass_esupertypes = new Pattern_DiffEClass_esupertypesImpl();
		return pattern_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation createPattern_DiffEOperation() {
		Pattern_DiffEOperationImpl pattern_DiffEOperation = new Pattern_DiffEOperationImpl();
		return pattern_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage createPattern_DiffEPackage() {
		Pattern_DiffEPackageImpl pattern_DiffEPackage = new Pattern_DiffEPackageImpl();
		return pattern_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_eclassifiers createPattern_DiffEPackage_eclassifiers() {
		Pattern_DiffEPackage_eclassifiersImpl pattern_DiffEPackage_eclassifiers = new Pattern_DiffEPackage_eclassifiersImpl();
		return pattern_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_domainspecificdiffs createPattern_DiffEPackage_domainspecificdiffs() {
		Pattern_DiffEPackage_domainspecificdiffsImpl pattern_DiffEPackage_domainspecificdiffs = new Pattern_DiffEPackage_domainspecificdiffsImpl();
		return pattern_DiffEPackage_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEReference createPattern_DiffEReference() {
		Pattern_DiffEReferenceImpl pattern_DiffEReference = new Pattern_DiffEReferenceImpl();
		return pattern_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringRuleMMPackage getRefactoringRuleMMPackage() {
		return (RefactoringRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringRuleMMPackage getPackage() {
		return RefactoringRuleMMPackage.eINSTANCE;
	}

} //RefactoringRuleMMFactoryImpl
