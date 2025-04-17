/**
 */
package refactoring2WayRuleMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface Refactoring2WayRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoring2WayRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoring2WayRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoring2WayRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Refactoring2WayRuleMMPackage eINSTANCE = refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_EAttributeImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EAttribute()
	 * @generated
	 */
	int PATTERN_EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__NAME = Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ETYPE = Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ID_PATTERN = Refactoring2WayDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__FILTER = Refactoring2WayDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_EClassImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EClass()
	 * @generated
	 */
	int PATTERN_ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NAME = Refactoring2WayDiffMMPackage.ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EXTENDS = Refactoring2WayDiffMMPackage.ECLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IMPLEMENTS = Refactoring2WayDiffMMPackage.ECLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IS_ABSTRACT = Refactoring2WayDiffMMPackage.ECLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__PACKAGE_NAME = Refactoring2WayDiffMMPackage.ECLASS__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EATTRIBUTES = Refactoring2WayDiffMMPackage.ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EOPERATIONS = Refactoring2WayDiffMMPackage.ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EREFERENCES = Refactoring2WayDiffMMPackage.ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ESUPERTYPES = Refactoring2WayDiffMMPackage.ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INTERFACES = Refactoring2WayDiffMMPackage.ECLASS__INTERFACES;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NESTED_CLASSES = Refactoring2WayDiffMMPackage.ECLASS__NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NESTED_INTERFACES = Refactoring2WayDiffMMPackage.ECLASS__NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEATTRIBUTES = Refactoring2WayDiffMMPackage.ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEOPERATIONS = Refactoring2WayDiffMMPackage.ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEREFERENCES = Refactoring2WayDiffMMPackage.ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFESUPERTYPES = Refactoring2WayDiffMMPackage.ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFINTERFACES = Refactoring2WayDiffMMPackage.ECLASS__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFNESTED_CLASSES = Refactoring2WayDiffMMPackage.ECLASS__DIFFNESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFNESTED_INTERFACES = Refactoring2WayDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ID_PATTERN = Refactoring2WayDiffMMPackage.ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__FILTER = Refactoring2WayDiffMMPackage.ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_FEATURE_COUNT = Refactoring2WayDiffMMPackage.ECLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_OPERATION_COUNT = Refactoring2WayDiffMMPackage.ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_EOperationImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EOperation()
	 * @generated
	 */
	int PATTERN_EOPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__NAME = Refactoring2WayDiffMMPackage.EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EPARAMETERS = Refactoring2WayDiffMMPackage.EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ETYPE = Refactoring2WayDiffMMPackage.EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__METHOD_BODY = Refactoring2WayDiffMMPackage.EOPERATION__METHOD_BODY;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_KDM = Refactoring2WayDiffMMPackage.EOPERATION__ID_KDM;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_PATTERN = Refactoring2WayDiffMMPackage.EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__FILTER = Refactoring2WayDiffMMPackage.EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_FEATURE_COUNT = Refactoring2WayDiffMMPackage.EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_OPERATION_COUNT = Refactoring2WayDiffMMPackage.EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_EPackageImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EPackage()
	 * @generated
	 */
	int PATTERN_EPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NAME = Refactoring2WayDiffMMPackage.EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ECLASSIFIERS = Refactoring2WayDiffMMPackage.EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__INTERFACES = Refactoring2WayDiffMMPackage.EPACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFECLASSIFIERS = Refactoring2WayDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFINTERFACES = Refactoring2WayDiffMMPackage.EPACKAGE__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ID_PATTERN = Refactoring2WayDiffMMPackage.EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__FILTER = Refactoring2WayDiffMMPackage.EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_EReferenceImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EReference()
	 * @generated
	 */
	int PATTERN_EREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__NAME = Refactoring2WayDiffMMPackage.EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ETYPE = Refactoring2WayDiffMMPackage.EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ID_PATTERN = Refactoring2WayDiffMMPackage.EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__FILTER = Refactoring2WayDiffMMPackage.EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_InterfaceImpl <em>Pattern Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_InterfaceImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_Interface()
	 * @generated
	 */
	int PATTERN_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__NAME = Refactoring2WayDiffMMPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__EXTENDS = Refactoring2WayDiffMMPackage.INTERFACE__EXTENDS;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__PACKAGE_NAME = Refactoring2WayDiffMMPackage.INTERFACE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__EOPERATIONS = Refactoring2WayDiffMMPackage.INTERFACE__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__ESUPERTYPES = Refactoring2WayDiffMMPackage.INTERFACE__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__DIFFEOPERATIONS = Refactoring2WayDiffMMPackage.INTERFACE__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__DIFFESUPERTYPES = Refactoring2WayDiffMMPackage.INTERFACE__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__ID_PATTERN = Refactoring2WayDiffMMPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__FILTER = Refactoring2WayDiffMMPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_SemanticObjectImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticObject()
	 * @generated
	 */
	int PATTERN_SEMANTIC_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__NAME = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__ID_PATTERN = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__FILTER = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_SemanticDiffImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticDiff()
	 * @generated
	 */
	int PATTERN_SEMANTIC_DIFF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__NAME = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__ID_PATTERN = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__FILTER = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_FEATURE_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_OPERATION_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EATTRIBUTE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_ECLASS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EOPERATION = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EPACKAGE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EREFERENCE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_INTERFACE = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__FILTER = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = Refactoring2WayDiffMMPackage.SEMANTIC_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEAttributeImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEAttribute()
	 * @generated
	 */
	int PATTERN_DIFF_EATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NAME = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ETYPE = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__FILTER = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClassImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NAME = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EXTENDS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IMPLEMENTS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_ABSTRACT = Refactoring2WayDiffMMPackage.DIFF_ECLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__PACKAGE_NAME = Refactoring2WayDiffMMPackage.DIFF_ECLASS__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EATTRIBUTES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EOPERATIONS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EREFERENCES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ESUPERTYPES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INTERFACES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__INTERFACES;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NESTED_CLASSES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NESTED_INTERFACES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEATTRIBUTES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEOPERATIONS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEREFERENCES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFESUPERTYPES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFINTERFACES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFNESTED_CLASSES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFNESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFNESTED_INTERFACES = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFFNESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_EXTENDS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS;

	/**
	 * The feature id for the '<em><b>New implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>New is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>New package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME = Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_eattributesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS = 12;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_EREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES = 14;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_interfacesImpl <em>Pattern Diff EClass interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_interfacesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES = 15;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_classesImpl <em>Pattern Diff EClass nested classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_classesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES = 16;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl <em>Pattern Diff EClass nested interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES = 17;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEOperationImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEOperation()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NAME = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EPARAMETERS = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__METHOD_BODY = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__METHOD_BODY;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_KDM = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__ID_KDM;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_ETYPE = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>New method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY = Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__FILTER = Refactoring2WayDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackageImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NAME = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ECLASSIFIERS = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__INTERFACES = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFECLASSIFIERS = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFINTERFACES = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__FILTER = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 20;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackage_interfacesImpl <em>Pattern Diff EPackage interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackage_interfacesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES = 21;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EPACKAGE_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffEReferenceImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEReference()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NAME = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ETYPE = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_ETYPE = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__FILTER = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterfaceImpl <em>Pattern Diff Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterfaceImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NAME = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__EXTENDS = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__EXTENDS;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__PACKAGE_NAME = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__EOPERATIONS = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__ESUPERTYPES = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFFEOPERATIONS = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFFESUPERTYPES = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_NAME = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_EXTENDS = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS;

	/**
	 * The feature id for the '<em><b>New package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME = Refactoring2WayDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__FILTER = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterface_eoperationsImpl <em>Pattern Diff Interface eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterface_eoperationsImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS = 24;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__ETYPE = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterface_esupertypesImpl <em>Pattern Diff Interface esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterface_esupertypesImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES = 25;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__ETYPE = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__ID_PATTERN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES_OPERATION_COUNT = Refactoring2WayDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayRuleMM.impl.RuleImpl
	 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS = 4;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass esupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES = 8;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES = 10;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EClass nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES = 11;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EOperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EPACKAGE = 13;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EPackage eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 14;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EPackage interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES = 15;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_EREFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Interface eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS = 18;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Interface esupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES = 19;

	/**
	 * The feature id for the '<em><b>Rule Pattern EAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_EATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Rule Pattern EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_ECLASS = 21;

	/**
	 * The feature id for the '<em><b>Rule Pattern EOperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_EOPERATION = 22;

	/**
	 * The feature id for the '<em><b>Rule Pattern EPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_EPACKAGE = 23;

	/**
	 * The feature id for the '<em><b>Rule Pattern EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_EREFERENCE = 24;

	/**
	 * The feature id for the '<em><b>Rule Pattern Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_INTERFACE = 25;

	/**
	 * The feature id for the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_SEMANTIC_OBJECT = 26;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EAttribute</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EAttribute
	 * @generated
	 */
	EClass getPattern_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EAttribute#getID_Pattern()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EAttribute#isFilter()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EAttribute#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EAttribute#isIsForbidden()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EClass</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EClass
	 * @generated
	 */
	EClass getPattern_EClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EClass#getID_Pattern()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EClass#isFilter()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EClass#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EClass#isIsForbidden()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EOperation</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EOperation
	 * @generated
	 */
	EClass getPattern_EOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EOperation#getID_Pattern()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EOperation#isFilter()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EOperation#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EOperation#isIsForbidden()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EPackage</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EPackage
	 * @generated
	 */
	EClass getPattern_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EPackage#getID_Pattern()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EPackage#isFilter()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EPackage#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EPackage#isIsForbidden()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EReference</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EReference
	 * @generated
	 */
	EClass getPattern_EReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EReference#getID_Pattern()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EReference#isFilter()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_EReference#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_EReference#isIsForbidden()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_Interface <em>Pattern Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Interface</em>'.
	 * @see refactoring2WayRuleMM.Pattern_Interface
	 * @generated
	 */
	EClass getPattern_Interface();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_Interface#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_Interface#getID_Pattern()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_Interface#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_Interface#isFilter()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_Interface#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_Interface#isIsForbidden()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Object</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	EClass getPattern_SemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticObject#getID_Pattern()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticObject#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticObject#isFilter()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticObject#isIsForbidden()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Diff</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	EClass getPattern_SemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticDiff#getID_Pattern()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticDiff#isFilter()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticDiff#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticDiff#isIsForbidden()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticConflict#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticConflict#getID_Pattern()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticConflict#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticConflict#isFilter()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_SemanticConflict#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_SemanticConflict#isIsForbidden()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAttribute</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	EClass getPattern_DiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEAttribute#getID_Pattern()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEAttribute#isFilter()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEAttribute#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEAttribute#isIsForbidden()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	EClass getPattern_DiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass#getID_Pattern()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass#isFilter()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass#isIsForbidden()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eattributes <em>Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eattributes</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eattributes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#isFilter()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eattributes#isIsForbidden()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eoperations <em>Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eoperations</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eoperations
	 * @generated
	 */
	EClass getPattern_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#isFilter()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_eoperations#isIsForbidden()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_ereferences <em>Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass ereferences</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_ereferences
	 * @generated
	 */
	EClass getPattern_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#isFilter()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_ereferences#isIsForbidden()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes <em>Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass esupertypes</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#isFilter()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_esupertypes#isIsForbidden()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_interfaces <em>Pattern Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass interfaces</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#isFilter()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes <em>Pattern Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass nested classes</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes
	 * @generated
	 */
	EClass getPattern_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isFilter()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces <em>Pattern Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass nested interfaces</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#isFilter()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEClass_nested_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	EClass getPattern_DiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEOperation#getID_Pattern()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEOperation#isFilter()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEOperation#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEOperation#isIsForbidden()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	EClass getPattern_DiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage#getID_Pattern()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage#isFilter()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage#isIsForbidden()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers <em>Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_eclassifiers#isIsForbidden()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces <em>Pattern Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage interfaces</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#isFilter()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEPackage_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	EClass getPattern_DiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEReference#getID_Pattern()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEReference#isFilter()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffEReference#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffEReference#isIsForbidden()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffInterface <em>Pattern Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface
	 * @generated
	 */
	EClass getPattern_DiffInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface#getID_Pattern()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface#isFilter()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface#isIsForbidden()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffInterface_eoperations <em>Pattern Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface eoperations</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_eoperations
	 * @generated
	 */
	EClass getPattern_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#getID_Pattern()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#isFilter()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_eoperations#isIsForbidden()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes <em>Pattern Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface esupertypes</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes
	 * @generated
	 */
	EClass getPattern_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#getID_Pattern()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#isFilter()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoring2WayRuleMM.Pattern_DiffInterface_esupertypes#isIsForbidden()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_IsForbidden();

	/**
	 * Returns the meta object for class '{@link refactoring2WayRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see refactoring2WayRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link refactoring2WayRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see refactoring2WayRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayRuleMM.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see refactoring2WayRuleMM.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEAttribute <em>Rule Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EAttribute</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass <em>Rule Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eattributes <em>Rule Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass eattributes</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eattributes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eoperations <em>Rule Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass eoperations</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eoperations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_ereferences <em>Rule Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass ereferences</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_ereferences()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_esupertypes <em>Rule Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass esupertypes</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_esupertypes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_interfaces <em>Rule Pattern Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass interfaces</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_classes <em>Rule Pattern Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass nested classes</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_classes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_interfaces <em>Rule Pattern Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EClass nested interfaces</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEOperation <em>Rule Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EOperation</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEOperation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage <em>Rule Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EPackage</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_eclassifiers <em>Rule Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EPackage eclassifiers</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_eclassifiers()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_interfaces <em>Rule Pattern Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EPackage interfaces</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEReference <em>Rule Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff EReference</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffEReference()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffEReference();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface <em>Rule Pattern Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Interface</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_eoperations <em>Rule Pattern Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Interface eoperations</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_eoperations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_esupertypes <em>Rule Pattern Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Interface esupertypes</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_esupertypes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_EAttribute <em>Rule Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern EAttribute</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_EAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_EAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_EClass <em>Rule Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern EClass</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_EClass()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_EOperation <em>Rule Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern EOperation</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_EOperation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_EOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_EPackage <em>Rule Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern EPackage</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_EPackage()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_EReference <em>Rule Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern EReference</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_EReference()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_EReference();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_Interface <em>Rule Pattern Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Interface</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_Interface()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Semantic Object</em>'.
	 * @see refactoring2WayRuleMM.Rule#getRulePattern_SemanticObject()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_SemanticObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Refactoring2WayRuleMMFactory getRefactoring2WayRuleMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_EAttributeImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EAttribute()
		 * @generated
		 */
		EClass PATTERN_EATTRIBUTE = eINSTANCE.getPattern_EAttribute();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__ID_PATTERN = eINSTANCE.getPattern_EAttribute_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__FILTER = eINSTANCE.getPattern_EAttribute_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__IS_FORBIDDEN = eINSTANCE.getPattern_EAttribute_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_EClassImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EClass()
		 * @generated
		 */
		EClass PATTERN_ECLASS = eINSTANCE.getPattern_EClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__ID_PATTERN = eINSTANCE.getPattern_EClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__FILTER = eINSTANCE.getPattern_EClass_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__IS_FORBIDDEN = eINSTANCE.getPattern_EClass_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_EOperationImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EOperation()
		 * @generated
		 */
		EClass PATTERN_EOPERATION = eINSTANCE.getPattern_EOperation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__ID_PATTERN = eINSTANCE.getPattern_EOperation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__FILTER = eINSTANCE.getPattern_EOperation_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__IS_FORBIDDEN = eINSTANCE.getPattern_EOperation_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_EPackageImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EPackage()
		 * @generated
		 */
		EClass PATTERN_EPACKAGE = eINSTANCE.getPattern_EPackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_EPackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__FILTER = eINSTANCE.getPattern_EPackage_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__IS_FORBIDDEN = eINSTANCE.getPattern_EPackage_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_EReferenceImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_EReference()
		 * @generated
		 */
		EClass PATTERN_EREFERENCE = eINSTANCE.getPattern_EReference();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__ID_PATTERN = eINSTANCE.getPattern_EReference_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__FILTER = eINSTANCE.getPattern_EReference_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__IS_FORBIDDEN = eINSTANCE.getPattern_EReference_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_InterfaceImpl <em>Pattern Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_InterfaceImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_Interface()
		 * @generated
		 */
		EClass PATTERN_INTERFACE = eINSTANCE.getPattern_Interface();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__ID_PATTERN = eINSTANCE.getPattern_Interface_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__FILTER = eINSTANCE.getPattern_Interface_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__IS_FORBIDDEN = eINSTANCE.getPattern_Interface_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_SemanticObjectImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticObject()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_OBJECT = eINSTANCE.getPattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__ID_PATTERN = eINSTANCE.getPattern_SemanticObject_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__FILTER = eINSTANCE.getPattern_SemanticObject_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticObject_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_SemanticDiffImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticDiff()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_DIFF = eINSTANCE.getPattern_SemanticDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_SemanticDiff_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__FILTER = eINSTANCE.getPattern_SemanticDiff_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticDiff_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = eINSTANCE.getPattern_SemanticConflict_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__FILTER = eINSTANCE.getPattern_SemanticConflict_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticConflict_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEAttributeImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEAttribute()
		 * @generated
		 */
		EClass PATTERN_DIFF_EATTRIBUTE = eINSTANCE.getPattern_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = eINSTANCE.getPattern_DiffEAttribute_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__FILTER = eINSTANCE.getPattern_DiffEAttribute_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEAttribute_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClassImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS = eINSTANCE.getPattern_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__FILTER = eINSTANCE.getPattern_DiffEClass_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_eattributesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getPattern_DiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eattributes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = eINSTANCE.getPattern_DiffEClass_eattributes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_eattributes_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getPattern_DiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_eoperations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = eINSTANCE.getPattern_DiffEClass_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_eoperations_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_EREFERENCES = eINSTANCE.getPattern_DiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_ereferences_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = eINSTANCE.getPattern_DiffEClass_ereferences_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_ereferences_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getPattern_DiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_esupertypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER = eINSTANCE.getPattern_DiffEClass_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_esupertypes_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_interfacesImpl <em>Pattern Diff EClass interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_interfacesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_interfaces()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_INTERFACES = eINSTANCE.getPattern_DiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_interfaces_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEClass_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_classesImpl <em>Pattern Diff EClass nested classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_classesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_nested_classes()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getPattern_DiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_nested_classes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER = eINSTANCE.getPattern_DiffEClass_nested_classes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_nested_classes_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl <em>Pattern Diff EClass nested interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEClass_nested_interfaces()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getPattern_DiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ID_PATTERN = eINSTANCE.getPattern_DiffEClass_nested_interfaces_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEClass_nested_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_nested_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEOperationImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEOperation()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION = eINSTANCE.getPattern_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__ID_PATTERN = eINSTANCE.getPattern_DiffEOperation_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__FILTER = eINSTANCE.getPattern_DiffEOperation_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEOperation_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackageImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE = eINSTANCE.getPattern_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__FILTER = eINSTANCE.getPattern_DiffEPackage_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getPattern_DiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_eclassifiers_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = eINSTANCE.getPattern_DiffEPackage_eclassifiers_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_eclassifiers_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEPackage_interfacesImpl <em>Pattern Diff EPackage interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEPackage_interfacesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEPackage_interfaces()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_INTERFACES = eINSTANCE.getPattern_DiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_interfaces_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEPackage_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffEReferenceImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffEReference()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE = eINSTANCE.getPattern_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__ID_PATTERN = eINSTANCE.getPattern_DiffEReference_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__FILTER = eINSTANCE.getPattern_DiffEReference_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEReference_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterfaceImpl <em>Pattern Diff Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterfaceImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface()
		 * @generated
		 */
		EClass PATTERN_DIFF_INTERFACE = eINSTANCE.getPattern_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__ID_PATTERN = eINSTANCE.getPattern_DiffInterface_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__FILTER = eINSTANCE.getPattern_DiffInterface_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffInterface_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterface_eoperationsImpl <em>Pattern Diff Interface eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterface_eoperationsImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface_eoperations()
		 * @generated
		 */
		EClass PATTERN_DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getPattern_DiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__ID_PATTERN = eINSTANCE.getPattern_DiffInterface_eoperations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER = eINSTANCE.getPattern_DiffInterface_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffInterface_eoperations_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.Pattern_DiffInterface_esupertypesImpl <em>Pattern Diff Interface esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.Pattern_DiffInterface_esupertypesImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getPattern_DiffInterface_esupertypes()
		 * @generated
		 */
		EClass PATTERN_DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getPattern_DiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__ID_PATTERN = eINSTANCE.getPattern_DiffInterface_esupertypes_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER = eINSTANCE.getPattern_DiffInterface_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffInterface_esupertypes_IsForbidden();

		/**
		 * The meta object literal for the '{@link refactoring2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayRuleMM.impl.RuleImpl
		 * @see refactoring2WayRuleMM.impl.Refactoring2WayRuleMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONSTRAINTS = eINSTANCE.getRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EATTRIBUTE = eINSTANCE.getRule_RulePattern_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS = eINSTANCE.getRule_RulePattern_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass eattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getRule_RulePattern_DiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getRule_RulePattern_DiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass ereferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES = eINSTANCE.getRule_RulePattern_DiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass esupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getRule_RulePattern_DiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES = eINSTANCE.getRule_RulePattern_DiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass nested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getRule_RulePattern_DiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EClass nested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getRule_RulePattern_DiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EOperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EOPERATION = eINSTANCE.getRule_RulePattern_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EPACKAGE = eINSTANCE.getRule_RulePattern_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EPackage eclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getRule_RulePattern_DiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EPackage interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES = eINSTANCE.getRule_RulePattern_DiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_EREFERENCE = eINSTANCE.getRule_RulePattern_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_INTERFACE = eINSTANCE.getRule_RulePattern_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Interface eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getRule_RulePattern_DiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Interface esupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getRule_RulePattern_DiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern EAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_EATTRIBUTE = eINSTANCE.getRule_RulePattern_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern EClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_ECLASS = eINSTANCE.getRule_RulePattern_EClass();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern EOperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_EOPERATION = eINSTANCE.getRule_RulePattern_EOperation();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern EPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_EPACKAGE = eINSTANCE.getRule_RulePattern_EPackage();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_EREFERENCE = eINSTANCE.getRule_RulePattern_EReference();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_INTERFACE = eINSTANCE.getRule_RulePattern_Interface();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_SEMANTIC_OBJECT = eINSTANCE.getRule_RulePattern_SemanticObject();

	}

} //Refactoring2WayRuleMMPackage
