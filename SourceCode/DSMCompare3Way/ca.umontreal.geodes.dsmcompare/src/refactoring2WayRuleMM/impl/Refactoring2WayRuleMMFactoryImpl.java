/**
 */
package refactoring2WayRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import refactoring2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Refactoring2WayRuleMMFactoryImpl extends EFactoryImpl implements Refactoring2WayRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Refactoring2WayRuleMMFactory init() {
		try {
			Refactoring2WayRuleMMFactory theRefactoring2WayRuleMMFactory = (Refactoring2WayRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(Refactoring2WayRuleMMPackage.eNS_URI);
			if (theRefactoring2WayRuleMMFactory != null) {
				return theRefactoring2WayRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Refactoring2WayRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring2WayRuleMMFactoryImpl() {
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
			case Refactoring2WayRuleMMPackage.PATTERN_EATTRIBUTE: return createPattern_EAttribute();
			case Refactoring2WayRuleMMPackage.PATTERN_ECLASS: return createPattern_EClass();
			case Refactoring2WayRuleMMPackage.PATTERN_EOPERATION: return createPattern_EOperation();
			case Refactoring2WayRuleMMPackage.PATTERN_EPACKAGE: return createPattern_EPackage();
			case Refactoring2WayRuleMMPackage.PATTERN_EREFERENCE: return createPattern_EReference();
			case Refactoring2WayRuleMMPackage.PATTERN_INTERFACE: return createPattern_Interface();
			case Refactoring2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case Refactoring2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: return createPattern_DiffEAttribute();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS: return createPattern_DiffEClass();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: return createPattern_DiffEClass_eattributes();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: return createPattern_DiffEClass_eoperations();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: return createPattern_DiffEClass_ereferences();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPERTYPES: return createPattern_DiffEClass_esupertypes();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_INTERFACES: return createPattern_DiffEClass_interfaces();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_NESTED_CLASSES: return createPattern_DiffEClass_nested_classes();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_ECLASS_NESTED_INTERFACES: return createPattern_DiffEClass_nested_interfaces();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EOPERATION: return createPattern_DiffEOperation();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EPACKAGE: return createPattern_DiffEPackage();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: return createPattern_DiffEPackage_eclassifiers();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EPACKAGE_INTERFACES: return createPattern_DiffEPackage_interfaces();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_EREFERENCE: return createPattern_DiffEReference();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_INTERFACE: return createPattern_DiffInterface();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_INTERFACE_EOPERATIONS: return createPattern_DiffInterface_eoperations();
			case Refactoring2WayRuleMMPackage.PATTERN_DIFF_INTERFACE_ESUPERTYPES: return createPattern_DiffInterface_esupertypes();
			case Refactoring2WayRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EAttribute createPattern_EAttribute() {
		Pattern_EAttributeImpl pattern_EAttribute = new Pattern_EAttributeImpl();
		return pattern_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EClass createPattern_EClass() {
		Pattern_EClassImpl pattern_EClass = new Pattern_EClassImpl();
		return pattern_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EOperation createPattern_EOperation() {
		Pattern_EOperationImpl pattern_EOperation = new Pattern_EOperationImpl();
		return pattern_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EPackage createPattern_EPackage() {
		Pattern_EPackageImpl pattern_EPackage = new Pattern_EPackageImpl();
		return pattern_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EReference createPattern_EReference() {
		Pattern_EReferenceImpl pattern_EReference = new Pattern_EReferenceImpl();
		return pattern_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Interface createPattern_Interface() {
		Pattern_InterfaceImpl pattern_Interface = new Pattern_InterfaceImpl();
		return pattern_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticDiff createPattern_SemanticDiff() {
		Pattern_SemanticDiffImpl pattern_SemanticDiff = new Pattern_SemanticDiffImpl();
		return pattern_SemanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEAttribute createPattern_DiffEAttribute() {
		Pattern_DiffEAttributeImpl pattern_DiffEAttribute = new Pattern_DiffEAttributeImpl();
		return pattern_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass createPattern_DiffEClass() {
		Pattern_DiffEClassImpl pattern_DiffEClass = new Pattern_DiffEClassImpl();
		return pattern_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_eattributes createPattern_DiffEClass_eattributes() {
		Pattern_DiffEClass_eattributesImpl pattern_DiffEClass_eattributes = new Pattern_DiffEClass_eattributesImpl();
		return pattern_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_eoperations createPattern_DiffEClass_eoperations() {
		Pattern_DiffEClass_eoperationsImpl pattern_DiffEClass_eoperations = new Pattern_DiffEClass_eoperationsImpl();
		return pattern_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_ereferences createPattern_DiffEClass_ereferences() {
		Pattern_DiffEClass_ereferencesImpl pattern_DiffEClass_ereferences = new Pattern_DiffEClass_ereferencesImpl();
		return pattern_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_esupertypes createPattern_DiffEClass_esupertypes() {
		Pattern_DiffEClass_esupertypesImpl pattern_DiffEClass_esupertypes = new Pattern_DiffEClass_esupertypesImpl();
		return pattern_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_interfaces createPattern_DiffEClass_interfaces() {
		Pattern_DiffEClass_interfacesImpl pattern_DiffEClass_interfaces = new Pattern_DiffEClass_interfacesImpl();
		return pattern_DiffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_nested_classes createPattern_DiffEClass_nested_classes() {
		Pattern_DiffEClass_nested_classesImpl pattern_DiffEClass_nested_classes = new Pattern_DiffEClass_nested_classesImpl();
		return pattern_DiffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEClass_nested_interfaces createPattern_DiffEClass_nested_interfaces() {
		Pattern_DiffEClass_nested_interfacesImpl pattern_DiffEClass_nested_interfaces = new Pattern_DiffEClass_nested_interfacesImpl();
		return pattern_DiffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEOperation createPattern_DiffEOperation() {
		Pattern_DiffEOperationImpl pattern_DiffEOperation = new Pattern_DiffEOperationImpl();
		return pattern_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEPackage createPattern_DiffEPackage() {
		Pattern_DiffEPackageImpl pattern_DiffEPackage = new Pattern_DiffEPackageImpl();
		return pattern_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEPackage_eclassifiers createPattern_DiffEPackage_eclassifiers() {
		Pattern_DiffEPackage_eclassifiersImpl pattern_DiffEPackage_eclassifiers = new Pattern_DiffEPackage_eclassifiersImpl();
		return pattern_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEPackage_interfaces createPattern_DiffEPackage_interfaces() {
		Pattern_DiffEPackage_interfacesImpl pattern_DiffEPackage_interfaces = new Pattern_DiffEPackage_interfacesImpl();
		return pattern_DiffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEReference createPattern_DiffEReference() {
		Pattern_DiffEReferenceImpl pattern_DiffEReference = new Pattern_DiffEReferenceImpl();
		return pattern_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffInterface createPattern_DiffInterface() {
		Pattern_DiffInterfaceImpl pattern_DiffInterface = new Pattern_DiffInterfaceImpl();
		return pattern_DiffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffInterface_eoperations createPattern_DiffInterface_eoperations() {
		Pattern_DiffInterface_eoperationsImpl pattern_DiffInterface_eoperations = new Pattern_DiffInterface_eoperationsImpl();
		return pattern_DiffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffInterface_esupertypes createPattern_DiffInterface_esupertypes() {
		Pattern_DiffInterface_esupertypesImpl pattern_DiffInterface_esupertypes = new Pattern_DiffInterface_esupertypesImpl();
		return pattern_DiffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring2WayRuleMMPackage getRefactoring2WayRuleMMPackage() {
		return (Refactoring2WayRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Refactoring2WayRuleMMPackage getPackage() {
		return Refactoring2WayRuleMMPackage.eINSTANCE;
	}

} //Refactoring2WayRuleMMFactoryImpl
