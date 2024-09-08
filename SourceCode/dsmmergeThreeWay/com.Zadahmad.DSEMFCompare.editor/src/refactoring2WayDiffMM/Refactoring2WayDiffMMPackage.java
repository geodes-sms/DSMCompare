/**
 */
package refactoring2WayDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface Refactoring2WayDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoring2WayDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoring2WayDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoring2WayDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Refactoring2WayDiffMMPackage eINSTANCE = refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.EAttributeImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.EClassImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__IMPLEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__IS_ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EREFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPERTYPES = 8;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NESTED_CLASSES = 10;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NESTED_INTERFACES = 11;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEATTRIBUTES = 12;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEOPERATIONS = 13;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFEREFERENCES = 14;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFESUPERTYPES = 15;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFINTERFACES = 16;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFNESTED_CLASSES = 17;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DIFFNESTED_INTERFACES = 18;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.EOperationImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = 2;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__METHOD_BODY = 3;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ID_KDM = 4;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.EPackageImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFECLASSIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFINTERFACES = 4;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.EReferenceImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.InterfaceImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PACKAGE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EOPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ESUPERTYPES = 4;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DIFFEOPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DIFFESUPERTYPES = 6;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.SemanticObjectImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticObject()
	 * @generated
	 */
	int SEMANTIC_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = 8;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION = 10;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = 12;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = 13;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = 16;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = 17;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = 19;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = 20;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = 23;

	/**
	 * The number of structural features of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.SemanticDiffImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticDiff()
	 * @generated
	 */
	int SEMANTIC_DIFF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The number of structural features of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.SemanticConflictImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTICDIFFS = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEAttributeImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEAttribute()
	 * @generated
	 */
	int DIFF_EATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NAME = EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ETYPE = EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFF_KIND = EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_NAME = EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ETYPE = EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_FEATURE_COUNT = EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_OPERATION_COUNT = EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClassImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass()
	 * @generated
	 */
	int DIFF_ECLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EXTENDS = ECLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__IMPLEMENTS = ECLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__IS_ABSTRACT = ECLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__PACKAGE_NAME = ECLASS__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EATTRIBUTES = ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EOPERATIONS = ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EREFERENCES = ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__ESUPERTYPES = ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__INTERFACES = ECLASS__INTERFACES;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NESTED_CLASSES = ECLASS__NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NESTED_INTERFACES = ECLASS__NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEATTRIBUTES = ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEOPERATIONS = ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFEREFERENCES = ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFESUPERTYPES = ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFINTERFACES = ECLASS__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFNESTED_CLASSES = ECLASS__DIFFNESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFFNESTED_INTERFACES = ECLASS__DIFFNESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFF_KIND = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_NAME = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_EXTENDS = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IMPLEMENTS = ECLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IS_ABSTRACT = ECLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_PACKAGE_NAME = ECLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_eattributes()
	 * @generated
	 */
	int DIFF_ECLASS_EATTRIBUTES = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_eoperationsImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_eoperations()
	 * @generated
	 */
	int DIFF_ECLASS_EOPERATIONS = 12;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_ereferencesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_ereferences()
	 * @generated
	 */
	int DIFF_ECLASS_EREFERENCES = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_esupertypesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_esupertypes()
	 * @generated
	 */
	int DIFF_ECLASS_ESUPERTYPES = 14;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_interfacesImpl <em>Diff EClass interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_interfacesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_interfaces()
	 * @generated
	 */
	int DIFF_ECLASS_INTERFACES = 15;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_nested_classesImpl <em>Diff EClass nested classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_nested_classesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_nested_classes()
	 * @generated
	 */
	int DIFF_ECLASS_NESTED_CLASSES = 16;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEClass_nested_interfacesImpl <em>Diff EClass nested interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEClass_nested_interfacesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_nested_interfaces()
	 * @generated
	 */
	int DIFF_ECLASS_NESTED_INTERFACES = 17;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEOperationImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEOperation()
	 * @generated
	 */
	int DIFF_EOPERATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NAME = EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EPARAMETERS = EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ETYPE = EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__METHOD_BODY = EOPERATION__METHOD_BODY;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ID_KDM = EOPERATION__ID_KDM;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFF_KIND = EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_NAME = EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_EPARAMETERS = EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_ETYPE = EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_METHOD_BODY = EOPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_FEATURE_COUNT = EOPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_OPERATION_COUNT = EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEPackageImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage()
	 * @generated
	 */
	int DIFF_EPACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NAME = EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__ECLASSIFIERS = EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__INTERFACES = EPACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFECLASSIFIERS = EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFINTERFACES = EPACKAGE__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFF_KIND = EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NAME = EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_FEATURE_COUNT = EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_OPERATION_COUNT = EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEPackage_eclassifiersImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage_eclassifiers()
	 * @generated
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS = 20;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEPackage_interfacesImpl <em>Diff EPackage interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEPackage_interfacesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage_interfaces()
	 * @generated
	 */
	int DIFF_EPACKAGE_INTERFACES = 21;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffEReferenceImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEReference()
	 * @generated
	 */
	int DIFF_EREFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NAME = EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ETYPE = EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFF_KIND = EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_NAME = EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_ETYPE = EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_FEATURE_COUNT = EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_OPERATION_COUNT = EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffInterfaceImpl <em>Diff Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffInterfaceImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface()
	 * @generated
	 */
	int DIFF_INTERFACE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__EXTENDS = INTERFACE__EXTENDS;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__PACKAGE_NAME = INTERFACE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__EOPERATIONS = INTERFACE__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__ESUPERTYPES = INTERFACE__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__DIFFEOPERATIONS = INTERFACE__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__DIFFESUPERTYPES = INTERFACE__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__DIFF_KIND = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_NAME = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_EXTENDS = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_PACKAGE_NAME = INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl <em>Diff Interface eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface_eoperations()
	 * @generated
	 */
	int DIFF_INTERFACE_EOPERATIONS = 24;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.impl.DiffInterface_esupertypesImpl <em>Diff Interface esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.impl.DiffInterface_esupertypesImpl
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface_esupertypes()
	 * @generated
	 */
	int DIFF_INTERFACE_ESUPERTYPES = 25;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoring2WayDiffMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 26;


	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see refactoring2WayDiffMM.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.EAttribute#getName()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EAttribute#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring2WayDiffMM.EAttribute#getEtype()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Etype();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see refactoring2WayDiffMM.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.EClass#getName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoring2WayDiffMM.EClass#getExtends()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see refactoring2WayDiffMM.EClass#getImplements()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see refactoring2WayDiffMM.EClass#isIsAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EClass#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoring2WayDiffMM.EClass#getPackageName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getEattributes <em>Eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getEattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoring2WayDiffMM.EClass#getEoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getEreferences <em>Ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferences</em>'.
	 * @see refactoring2WayDiffMM.EClass#getEreferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.EClass#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getEsupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.EClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see refactoring2WayDiffMM.EClass#getInterfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getNested_classes <em>Nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested classes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getNested_classes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Nested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getNested_interfaces <em>Nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested interfaces</em>'.
	 * @see refactoring2WayDiffMM.EClass#getNested_interfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Nested_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffeattributes <em>Diffeattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeattributes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffeattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffeoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffereferences <em>Differeferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Differeferences</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffereferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Differeferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffesupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffesupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffinterfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffinterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffnested_classes <em>Diffnested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested classes</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffnested_classes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffnested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EClass#getDiffnested_interfaces <em>Diffnested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested interfaces</em>'.
	 * @see refactoring2WayDiffMM.EClass#getDiffnested_interfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffnested_interfaces();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see refactoring2WayDiffMM.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.EOperation#getName()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EOperation#getEparameters <em>Eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters</em>'.
	 * @see refactoring2WayDiffMM.EOperation#getEparameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EOperation#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring2WayDiffMM.EOperation#getEtype()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Etype();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EOperation#getMethodBody <em>Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Body</em>'.
	 * @see refactoring2WayDiffMM.EOperation#getMethodBody()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_MethodBody();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EOperation#get__idKDM <em>id KDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id KDM</em>'.
	 * @see refactoring2WayDiffMM.EOperation#get__idKDM()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation___idKDM();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see refactoring2WayDiffMM.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.EPackage#getName()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EPackage#getEclassifiers <em>Eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclassifiers</em>'.
	 * @see refactoring2WayDiffMM.EPackage#getEclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Eclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see refactoring2WayDiffMM.EPackage#getInterfaces()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeclassifiers</em>'.
	 * @see refactoring2WayDiffMM.EPackage#getDiffeclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffeclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.EPackage#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoring2WayDiffMM.EPackage#getDiffinterfaces()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffinterfaces();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see refactoring2WayDiffMM.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.EReference#getName()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.EReference#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoring2WayDiffMM.EReference#getEtype()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Etype();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see refactoring2WayDiffMM.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.Interface#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoring2WayDiffMM.Interface#getExtends()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.Interface#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoring2WayDiffMM.Interface#getPackageName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.Interface#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoring2WayDiffMM.Interface#getEoperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.Interface#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoring2WayDiffMM.Interface#getEsupertypes()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.Interface#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoring2WayDiffMM.Interface#getDiffeoperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.Interface#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoring2WayDiffMM.Interface#getDiffesupertypes()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Diffesupertypes();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EAttribute</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEAttribute()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eattributes</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eattributes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eoperations</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eoperations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass ereferences</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_ereferences()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass esupertypes</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_esupertypes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass interfaces</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested classes</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_classes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested interfaces</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EOperation</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEOperation()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage eclassifiers</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_eclassifiers()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage interfaces</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EReference</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEReference()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface eoperations</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_eoperations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface esupertypes</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_esupertypes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EAttribute</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_EAttribute()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EClass <em>Semantic Object EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EClass</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_EClass()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EOperation</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_EOperation()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EPackage</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_EPackage()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EReference <em>Semantic Object EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EReference</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_EReference()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_Interface <em>Semantic Object Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Interface</em>'.
	 * @see refactoring2WayDiffMM.SemanticObject#getSemanticObject_Interface()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Interface();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see refactoring2WayDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see refactoring2WayDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoring2WayDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticdiffs</em>'.
	 * @see refactoring2WayDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAttribute</em>'.
	 * @see refactoring2WayDiffMM.DiffEAttribute
	 * @generated
	 */
	EClass getDiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEAttribute#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEAttribute#getDiff_kind()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEAttribute#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffEAttribute#getNew_name()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEAttribute#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoring2WayDiffMM.DiffEAttribute#getNew_etype()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_etype();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass
	 * @generated
	 */
	EClass getDiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#getDiff_kind()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#getNew_name()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#getNew_extends <em>New extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#getNew_extends()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#getNew_implements <em>New implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New implements</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#getNew_implements()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_implements();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#isNew_isAbstract <em>New is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New is Abstract</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#isNew_isAbstract()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_isAbstract();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass#getNew_packageName <em>New package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass#getNew_packageName()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_packageName();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_eattributes <em>Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eattributes</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eattributes
	 * @generated
	 */
	EClass getDiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_eattributes#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eattributes#getDiff_kind()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_eattributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eattributes#getEType()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EReference getDiffEClass_eattributes_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_eoperations <em>Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eoperations</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eoperations
	 * @generated
	 */
	EClass getDiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_eoperations#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eoperations#getDiff_kind()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_eoperations#getEType()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EReference getDiffEClass_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_ereferences <em>Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass ereferences</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_ereferences
	 * @generated
	 */
	EClass getDiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_ereferences#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_ereferences#getDiff_kind()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_ereferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_ereferences#getEType()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EReference getDiffEClass_ereferences_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_esupertypes <em>Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass esupertypes</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_esupertypes
	 * @generated
	 */
	EClass getDiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_esupertypes#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_esupertypes#getDiff_kind()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_esupertypes#getEType()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EReference getDiffEClass_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_interfaces <em>Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass interfaces</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_interfaces
	 * @generated
	 */
	EClass getDiffEClass_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_interfaces#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_interfaces#getDiff_kind()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_interfaces#getEType()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EReference getDiffEClass_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_nested_classes <em>Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass nested classes</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_classes
	 * @generated
	 */
	EClass getDiffEClass_nested_classes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_nested_classes#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_classes#getDiff_kind()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_nested_classes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_classes#getEType()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EReference getDiffEClass_nested_classes_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEClass_nested_interfaces <em>Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass nested interfaces</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_interfaces
	 * @generated
	 */
	EClass getDiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEClass_nested_interfaces#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_interfaces#getDiff_kind()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEClass_nested_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_interfaces#getEType()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EReference getDiffEClass_nested_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation
	 * @generated
	 */
	EClass getDiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEOperation#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation#getDiff_kind()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEOperation#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation#getNew_name()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEOperation#getNew_eparameters <em>New eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation#getNew_eparameters()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEOperation#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation#getNew_etype()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_etype();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEOperation#getNew_methodBody <em>New method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New method Body</em>'.
	 * @see refactoring2WayDiffMM.DiffEOperation#getNew_methodBody()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_methodBody();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage
	 * @generated
	 */
	EClass getDiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEPackage#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage#getDiff_kind()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEPackage#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage#getNew_name()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_name();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEPackage_eclassifiers <em>Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eclassifiers</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getDiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEPackage_eclassifiers#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_eclassifiers#getDiff_kind()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEPackage_eclassifiers#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_eclassifiers#getEType()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EReference getDiffEPackage_eclassifiers_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEPackage_interfaces <em>Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage interfaces</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_interfaces
	 * @generated
	 */
	EClass getDiffEPackage_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEPackage_interfaces#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_interfaces#getDiff_kind()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffEPackage_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffEPackage_interfaces#getEType()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EReference getDiffEPackage_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference</em>'.
	 * @see refactoring2WayDiffMM.DiffEReference
	 * @generated
	 */
	EClass getDiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEReference#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffEReference#getDiff_kind()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEReference#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffEReference#getNew_name()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffEReference#getNew_etype <em>New etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype</em>'.
	 * @see refactoring2WayDiffMM.DiffEReference#getNew_etype()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_etype();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffInterface <em>Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface
	 * @generated
	 */
	EClass getDiffInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface#getDiff_kind()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface#getNew_name()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_name();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface#getNew_extends <em>New extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface#getNew_extends()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface#getNew_packageName <em>New package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface#getNew_packageName()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_packageName();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffInterface_eoperations <em>Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface eoperations</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_eoperations
	 * @generated
	 */
	EClass getDiffInterface_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface_eoperations#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_eoperations#getDiff_kind()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffInterface_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_eoperations#getEType()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EReference getDiffInterface_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoring2WayDiffMM.DiffInterface_esupertypes <em>Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface esupertypes</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_esupertypes
	 * @generated
	 */
	EClass getDiffInterface_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoring2WayDiffMM.DiffInterface_esupertypes#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_esupertypes#getDiff_kind()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link refactoring2WayDiffMM.DiffInterface_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoring2WayDiffMM.DiffInterface_esupertypes#getEType()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EReference getDiffInterface_esupertypes_EType();

	/**
	 * Returns the meta object for enum '{@link refactoring2WayDiffMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @generated
	 */
	EEnum getDiffKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Refactoring2WayDiffMMFactory getRefactoring2WayDiffMMFactory();

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
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.EAttributeImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__NAME = eINSTANCE.getEAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__ETYPE = eINSTANCE.getEAttribute_Etype();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.EClassImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__NAME = eINSTANCE.getEClass_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__EXTENDS = eINSTANCE.getEClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__IMPLEMENTS = eINSTANCE.getEClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__IS_ABSTRACT = eINSTANCE.getEClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__PACKAGE_NAME = eINSTANCE.getEClass_PackageName();

		/**
		 * The meta object literal for the '<em><b>Eattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EATTRIBUTES = eINSTANCE.getEClass_Eattributes();

		/**
		 * The meta object literal for the '<em><b>Eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EOPERATIONS = eINSTANCE.getEClass_Eoperations();

		/**
		 * The meta object literal for the '<em><b>Ereferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EREFERENCES = eINSTANCE.getEClass_Ereferences();

		/**
		 * The meta object literal for the '<em><b>Esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPERTYPES = eINSTANCE.getEClass_Esupertypes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__INTERFACES = eINSTANCE.getEClass_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Nested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__NESTED_CLASSES = eINSTANCE.getEClass_Nested_classes();

		/**
		 * The meta object literal for the '<em><b>Nested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__NESTED_INTERFACES = eINSTANCE.getEClass_Nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diffeattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEATTRIBUTES = eINSTANCE.getEClass_Diffeattributes();

		/**
		 * The meta object literal for the '<em><b>Diffeoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEOPERATIONS = eINSTANCE.getEClass_Diffeoperations();

		/**
		 * The meta object literal for the '<em><b>Differeferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFEREFERENCES = eINSTANCE.getEClass_Differeferences();

		/**
		 * The meta object literal for the '<em><b>Diffesupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFESUPERTYPES = eINSTANCE.getEClass_Diffesupertypes();

		/**
		 * The meta object literal for the '<em><b>Diffinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFINTERFACES = eINSTANCE.getEClass_Diffinterfaces();

		/**
		 * The meta object literal for the '<em><b>Diffnested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFNESTED_CLASSES = eINSTANCE.getEClass_Diffnested_classes();

		/**
		 * The meta object literal for the '<em><b>Diffnested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__DIFFNESTED_INTERFACES = eINSTANCE.getEClass_Diffnested_interfaces();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.EOperationImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEOperation()
		 * @generated
		 */
		EClass EOPERATION = eINSTANCE.getEOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__NAME = eINSTANCE.getEOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Eparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__EPARAMETERS = eINSTANCE.getEOperation_Eparameters();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__ETYPE = eINSTANCE.getEOperation_Etype();

		/**
		 * The meta object literal for the '<em><b>Method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__METHOD_BODY = eINSTANCE.getEOperation_MethodBody();

		/**
		 * The meta object literal for the '<em><b>id KDM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOPERATION__ID_KDM = eINSTANCE.getEOperation___idKDM();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.EPackageImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NAME = eINSTANCE.getEPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Eclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE.getEPackage_Eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__INTERFACES = eINSTANCE.getEPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Diffeclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DIFFECLASSIFIERS = eINSTANCE.getEPackage_Diffeclassifiers();

		/**
		 * The meta object literal for the '<em><b>Diffinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DIFFINTERFACES = eINSTANCE.getEPackage_Diffinterfaces();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.EReferenceImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__NAME = eINSTANCE.getEReference_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__ETYPE = eINSTANCE.getEReference_Etype();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.InterfaceImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__EXTENDS = eINSTANCE.getInterface_Extends();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__PACKAGE_NAME = eINSTANCE.getInterface_PackageName();

		/**
		 * The meta object literal for the '<em><b>Eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__EOPERATIONS = eINSTANCE.getInterface_Eoperations();

		/**
		 * The meta object literal for the '<em><b>Esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__ESUPERTYPES = eINSTANCE.getInterface_Esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diffeoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__DIFFEOPERATIONS = eINSTANCE.getInterface_Diffeoperations();

		/**
		 * The meta object literal for the '<em><b>Diffesupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__DIFFESUPERTYPES = eINSTANCE.getInterface_Diffesupertypes();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.SemanticObjectImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticObject()
		 * @generated
		 */
		EClass SEMANTIC_OBJECT = eINSTANCE.getSemanticObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_OBJECT__NAME = eINSTANCE.getSemanticObject_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = eINSTANCE.getSemanticObject_SemanticObject_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getSemanticObject_SemanticObject_DiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION = eINSTANCE.getSemanticObject_SemanticObject_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE = eINSTANCE.getSemanticObject_SemanticObject_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getSemanticObject_SemanticObject_DiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = eINSTANCE.getSemanticObject_SemanticObject_DiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EReference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = eINSTANCE.getSemanticObject_SemanticObject_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = eINSTANCE.getSemanticObject_SemanticObject_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getSemanticObject_SemanticObject_DiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getSemanticObject_SemanticObject_DiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EAttribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = eINSTANCE.getSemanticObject_SemanticObject_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = eINSTANCE.getSemanticObject_SemanticObject_EClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EOperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = eINSTANCE.getSemanticObject_SemanticObject_EOperation();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EPackage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = eINSTANCE.getSemanticObject_SemanticObject_EPackage();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EReference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = eINSTANCE.getSemanticObject_SemanticObject_EReference();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = eINSTANCE.getSemanticObject_SemanticObject_Interface();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.SemanticDiffImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticDiff()
		 * @generated
		 */
		EClass SEMANTIC_DIFF = eINSTANCE.getSemanticDiff();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.SemanticConflictImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getSemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEAttributeImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEAttribute()
		 * @generated
		 */
		EClass DIFF_EATTRIBUTE = eINSTANCE.getDiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__DIFF_KIND = eINSTANCE.getDiffEAttribute_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_NAME = eINSTANCE.getDiffEAttribute_New_name();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_ETYPE = eINSTANCE.getDiffEAttribute_New_etype();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClassImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass()
		 * @generated
		 */
		EClass DIFF_ECLASS = eINSTANCE.getDiffEClass();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__DIFF_KIND = eINSTANCE.getDiffEClass_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_NAME = eINSTANCE.getDiffEClass_New_name();

		/**
		 * The meta object literal for the '<em><b>New extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_EXTENDS = eINSTANCE.getDiffEClass_New_extends();

		/**
		 * The meta object literal for the '<em><b>New implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IMPLEMENTS = eINSTANCE.getDiffEClass_New_implements();

		/**
		 * The meta object literal for the '<em><b>New is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IS_ABSTRACT = eINSTANCE.getDiffEClass_New_isAbstract();

		/**
		 * The meta object literal for the '<em><b>New package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_PACKAGE_NAME = eINSTANCE.getDiffEClass_New_packageName();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_eattributes()
		 * @generated
		 */
		EClass DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getDiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__DIFF_KIND = eINSTANCE.getDiffEClass_eattributes_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EATTRIBUTES__ETYPE = eINSTANCE.getDiffEClass_eattributes_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_eoperationsImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_eoperations()
		 * @generated
		 */
		EClass DIFF_ECLASS_EOPERATIONS = eINSTANCE.getDiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__DIFF_KIND = eINSTANCE.getDiffEClass_eoperations_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EOPERATIONS__ETYPE = eINSTANCE.getDiffEClass_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_ereferencesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_ereferences()
		 * @generated
		 */
		EClass DIFF_ECLASS_EREFERENCES = eINSTANCE.getDiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__DIFF_KIND = eINSTANCE.getDiffEClass_ereferences_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EREFERENCES__ETYPE = eINSTANCE.getDiffEClass_ereferences_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_esupertypesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_esupertypes()
		 * @generated
		 */
		EClass DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getDiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__DIFF_KIND = eINSTANCE.getDiffEClass_esupertypes_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_ESUPERTYPES__ETYPE = eINSTANCE.getDiffEClass_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_interfacesImpl <em>Diff EClass interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_interfacesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_interfaces()
		 * @generated
		 */
		EClass DIFF_ECLASS_INTERFACES = eINSTANCE.getDiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__DIFF_KIND = eINSTANCE.getDiffEClass_interfaces_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_INTERFACES__ETYPE = eINSTANCE.getDiffEClass_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_nested_classesImpl <em>Diff EClass nested classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_nested_classesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_nested_classes()
		 * @generated
		 */
		EClass DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getDiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND = eINSTANCE.getDiffEClass_nested_classes_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_NESTED_CLASSES__ETYPE = eINSTANCE.getDiffEClass_nested_classes_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEClass_nested_interfacesImpl <em>Diff EClass nested interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEClass_nested_interfacesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEClass_nested_interfaces()
		 * @generated
		 */
		EClass DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getDiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND = eINSTANCE.getDiffEClass_nested_interfaces_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_NESTED_INTERFACES__ETYPE = eINSTANCE.getDiffEClass_nested_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEOperationImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEOperation()
		 * @generated
		 */
		EClass DIFF_EOPERATION = eINSTANCE.getDiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__DIFF_KIND = eINSTANCE.getDiffEOperation_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_NAME = eINSTANCE.getDiffEOperation_New_name();

		/**
		 * The meta object literal for the '<em><b>New eparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_EPARAMETERS = eINSTANCE.getDiffEOperation_New_eparameters();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_ETYPE = eINSTANCE.getDiffEOperation_New_etype();

		/**
		 * The meta object literal for the '<em><b>New method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_METHOD_BODY = eINSTANCE.getDiffEOperation_New_methodBody();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEPackageImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage()
		 * @generated
		 */
		EClass DIFF_EPACKAGE = eINSTANCE.getDiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__DIFF_KIND = eINSTANCE.getDiffEPackage_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__NEW_NAME = eINSTANCE.getDiffEPackage_New_name();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEPackage_eclassifiersImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage_eclassifiers()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getDiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND = eINSTANCE.getDiffEPackage_eclassifiers_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = eINSTANCE.getDiffEPackage_eclassifiers_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEPackage_interfacesImpl <em>Diff EPackage interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEPackage_interfacesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEPackage_interfaces()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_INTERFACES = eINSTANCE.getDiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__DIFF_KIND = eINSTANCE.getDiffEPackage_interfaces_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_INTERFACES__ETYPE = eINSTANCE.getDiffEPackage_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffEReferenceImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffEReference()
		 * @generated
		 */
		EClass DIFF_EREFERENCE = eINSTANCE.getDiffEReference();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__DIFF_KIND = eINSTANCE.getDiffEReference_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_NAME = eINSTANCE.getDiffEReference_New_name();

		/**
		 * The meta object literal for the '<em><b>New etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_ETYPE = eINSTANCE.getDiffEReference_New_etype();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffInterfaceImpl <em>Diff Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffInterfaceImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface()
		 * @generated
		 */
		EClass DIFF_INTERFACE = eINSTANCE.getDiffInterface();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__DIFF_KIND = eINSTANCE.getDiffInterface_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_NAME = eINSTANCE.getDiffInterface_New_name();

		/**
		 * The meta object literal for the '<em><b>New extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_EXTENDS = eINSTANCE.getDiffInterface_New_extends();

		/**
		 * The meta object literal for the '<em><b>New package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_PACKAGE_NAME = eINSTANCE.getDiffInterface_New_packageName();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl <em>Diff Interface eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface_eoperations()
		 * @generated
		 */
		EClass DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getDiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__DIFF_KIND = eINSTANCE.getDiffInterface_eoperations_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INTERFACE_EOPERATIONS__ETYPE = eINSTANCE.getDiffInterface_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.impl.DiffInterface_esupertypesImpl <em>Diff Interface esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.impl.DiffInterface_esupertypesImpl
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffInterface_esupertypes()
		 * @generated
		 */
		EClass DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getDiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND = eINSTANCE.getDiffInterface_esupertypes_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INTERFACE_ESUPERTYPES__ETYPE = eINSTANCE.getDiffInterface_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoring2WayDiffMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoring2WayDiffMM.DiffKind
		 * @see refactoring2WayDiffMM.impl.Refactoring2WayDiffMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //Refactoring2WayDiffMMPackage
