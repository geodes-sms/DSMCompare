/**
 */
package refactoringDiffMM;

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
 * @see refactoringDiffMM.RefactoringDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoringDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoringDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoringDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringDiffMMPackage eINSTANCE = refactoringDiffMM.impl.RefactoringDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.SemanticObjectImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticObject()
	 * @generated
	 */
	int SEMANTIC_OBJECT = 30;

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
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = 14;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = 17;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = 18;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = 19;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = 20;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = 21;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = 23;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = 24;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = 25;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = 27;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = 28;

	/**
	 * The number of structural features of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.ConflictResolutionImpl <em>Conflict Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.ConflictResolutionImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolution()
	 * @generated
	 */
	int CONFLICT_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EATTRIBUTE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_ECLASS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EOPERATION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EPACKAGE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EREFERENCE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_INTERFACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__RESOLUTION_TYPE = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTICCONFLICTS = SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EAttributeImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 22;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEAttributeImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEAttribute()
	 * @generated
	 */
	int DIFF_EATTRIBUTE = 1;

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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFF_KIND_LEFT = EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__DIFF_KIND_RIGHT = EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__FILTER = EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__IS_MERGED = EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__CHANGE_STATUS = EATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_NAME_LEFT = EATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_NAME_RIGHT = EATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NAME_CHANGE_STATUS = EATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ETYPE_LEFT = EATTRIBUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT = EATTRIBUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS = EATTRIBUTE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_FEATURE_COUNT = EATTRIBUTE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EATTRIBUTE_OPERATION_COUNT = EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EClassImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 23;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClassImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass()
	 * @generated
	 */
	int DIFF_ECLASS = 2;

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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFF_KIND_LEFT = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__DIFF_KIND_RIGHT = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__FILTER = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__IS_MERGED = ECLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__CHANGE_STATUS = ECLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_NAME_LEFT = ECLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_NAME_RIGHT = ECLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NAME_CHANGE_STATUS = ECLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New extends Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_EXTENDS_LEFT = ECLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New extends Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_EXTENDS_RIGHT = ECLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__EXTENDS_CHANGE_STATUS = ECLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New implements Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IMPLEMENTS_LEFT = ECLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New implements Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT = ECLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Implements Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS = ECLASS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New is Abstract Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT = ECLASS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New is Abstract Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT = ECLASS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Abstract Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS = ECLASS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT = ECLASS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>New package Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT = ECLASS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Package Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS = ECLASS_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_eattributesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eattributes()
	 * @generated
	 */
	int DIFF_ECLASS_EATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_eoperationsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eoperations()
	 * @generated
	 */
	int DIFF_ECLASS_EOPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_ereferencesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_ereferences()
	 * @generated
	 */
	int DIFF_ECLASS_EREFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_esupertypesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_esupertypes()
	 * @generated
	 */
	int DIFF_ECLASS_ESUPERTYPES = 6;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_interfacesImpl <em>Diff EClass interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_interfacesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_interfaces()
	 * @generated
	 */
	int DIFF_ECLASS_INTERFACES = 7;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_nested_classesImpl <em>Diff EClass nested classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_nested_classesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_nested_classes()
	 * @generated
	 */
	int DIFF_ECLASS_NESTED_CLASSES = 8;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEClass_nested_interfacesImpl <em>Diff EClass nested interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEClass_nested_interfacesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_nested_interfaces()
	 * @generated
	 */
	int DIFF_ECLASS_NESTED_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ECLASS_NESTED_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EOperationImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 24;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEOperationImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEOperation()
	 * @generated
	 */
	int DIFF_EOPERATION = 10;

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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFF_KIND_LEFT = EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__DIFF_KIND_RIGHT = EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__FILTER = EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__IS_MERGED = EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__CHANGE_STATUS = EOPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_NAME_LEFT = EOPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_NAME_RIGHT = EOPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NAME_CHANGE_STATUS = EOPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New eparameters Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_EPARAMETERS_LEFT = EOPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New eparameters Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT = EOPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Eparameters Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS = EOPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_ETYPE_LEFT = EOPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_ETYPE_RIGHT = EOPERATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__ETYPE_CHANGE_STATUS = EOPERATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New method Body Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_METHOD_BODY_LEFT = EOPERATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New method Body Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT = EOPERATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Method Body Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS = EOPERATION_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_FEATURE_COUNT = EOPERATION_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EOPERATION_OPERATION_COUNT = EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EPackageImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 25;

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
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__TEST = 3;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFECLASSIFIERS = 4;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFINTERFACES = 5;

	/**
	 * The feature id for the '<em><b>Difftest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__DIFFTEST = 6;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackageImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage()
	 * @generated
	 */
	int DIFF_EPACKAGE = 11;

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
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__TEST = EPACKAGE__TEST;

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
	 * The feature id for the '<em><b>Difftest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFFTEST = EPACKAGE__DIFFTEST;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFF_KIND_LEFT = EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__DIFF_KIND_RIGHT = EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__FILTER = EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__IS_MERGED = EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__CHANGE_STATUS = EPACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NAME_LEFT = EPACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NEW_NAME_RIGHT = EPACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE__NAME_CHANGE_STATUS = EPACKAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_FEATURE_COUNT = EPACKAGE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_OPERATION_COUNT = EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_eclassifiers()
	 * @generated
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS = 12;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackage_interfacesImpl <em>Diff EPackage interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackage_interfacesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_interfaces()
	 * @generated
	 */
	int DIFF_EPACKAGE_INTERFACES = 13;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEPackage_testImpl <em>Diff EPackage test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEPackage_testImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_test()
	 * @generated
	 */
	int DIFF_EPACKAGE_TEST = 14;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff EPackage test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff EPackage test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EPACKAGE_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.EReferenceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 26;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffEReferenceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEReference()
	 * @generated
	 */
	int DIFF_EREFERENCE = 15;

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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFF_KIND_LEFT = EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__DIFF_KIND_RIGHT = EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__FILTER = EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__IS_MERGED = EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__CHANGE_STATUS = EREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_NAME_LEFT = EREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_NAME_RIGHT = EREFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NAME_CHANGE_STATUS = EREFERENCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_ETYPE_LEFT = EREFERENCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__NEW_ETYPE_RIGHT = EREFERENCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE__ETYPE_CHANGE_STATUS = EREFERENCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_FEATURE_COUNT = EREFERENCE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_EREFERENCE_OPERATION_COUNT = EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.InterfaceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 27;

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
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffInterfaceImpl <em>Diff Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffInterfaceImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface()
	 * @generated
	 */
	int DIFF_INTERFACE = 16;

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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__DIFF_KIND_LEFT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__DIFF_KIND_RIGHT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__FILTER = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__IS_MERGED = INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__CHANGE_STATUS = INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_NAME_LEFT = INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_NAME_RIGHT = INTERFACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NAME_CHANGE_STATUS = INTERFACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New extends Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_EXTENDS_LEFT = INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New extends Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_EXTENDS_RIGHT = INTERFACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__EXTENDS_CHANGE_STATUS = INTERFACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT = INTERFACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New package Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT = INTERFACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Package Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS = INTERFACE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffInterface_eoperationsImpl <em>Diff Interface eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffInterface_eoperationsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface_eoperations()
	 * @generated
	 */
	int DIFF_INTERFACE_EOPERATIONS = 17;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DiffInterface_esupertypesImpl <em>Diff Interface esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DiffInterface_esupertypesImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface_esupertypes()
	 * @generated
	 */
	int DIFF_INTERFACE_ESUPERTYPES = 18;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INTERFACE_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.testAssociationsImpl <em>test Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.testAssociationsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#gettestAssociations()
	 * @generated
	 */
	int TEST_ASSOCIATIONS = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS__SINGLE = 1;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS__MULTI = 2;

	/**
	 * The feature id for the '<em><b>Diffsingle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS__DIFFSINGLE = 3;

	/**
	 * The feature id for the '<em><b>Diffmulti</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS__DIFFMULTI = 4;

	/**
	 * The number of structural features of the '<em>test Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>test Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DifftestAssociationsImpl <em>Difftest Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DifftestAssociationsImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations()
	 * @generated
	 */
	int DIFFTEST_ASSOCIATIONS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__NAME = TEST_ASSOCIATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__SINGLE = TEST_ASSOCIATIONS__SINGLE;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__MULTI = TEST_ASSOCIATIONS__MULTI;

	/**
	 * The feature id for the '<em><b>Diffsingle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__DIFFSINGLE = TEST_ASSOCIATIONS__DIFFSINGLE;

	/**
	 * The feature id for the '<em><b>Diffmulti</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__DIFFMULTI = TEST_ASSOCIATIONS__DIFFMULTI;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__DIFF_KIND_LEFT = TEST_ASSOCIATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__DIFF_KIND_RIGHT = TEST_ASSOCIATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__FILTER = TEST_ASSOCIATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__IS_MERGED = TEST_ASSOCIATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__CHANGE_STATUS = TEST_ASSOCIATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__NEW_NAME_LEFT = TEST_ASSOCIATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__NEW_NAME_RIGHT = TEST_ASSOCIATIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS__NAME_CHANGE_STATUS = TEST_ASSOCIATIONS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Difftest Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_FEATURE_COUNT = TEST_ASSOCIATIONS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Difftest Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_OPERATION_COUNT = TEST_ASSOCIATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DifftestAssociations_multiImpl <em>Difftest Associations multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DifftestAssociations_multiImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations_multi()
	 * @generated
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI = 20;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Difftest Associations multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Difftest Associations multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_MULTI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.DifftestAssociations_singleImpl <em>Difftest Associations single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.DifftestAssociations_singleImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations_single()
	 * @generated
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE = 21;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Difftest Associations single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Difftest Associations single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFTEST_ASSOCIATIONS_SINGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.SemanticConflictImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 28;

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
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

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
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

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
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Conflict kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__CONFLICT_KIND = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTICDIFFS = SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.impl.SemanticDiffImpl
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticDiff()
	 * @generated
	 */
	int SEMANTIC_DIFF = 29;

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
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

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
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

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
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__AUTHOR = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.AUTHOR
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 32;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.ChangeStatus
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 33;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.ConflictGranularity
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictGranularity()
	 * @generated
	 */
	int CONFLICT_GRANULARITY = 34;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.ConflictResolutionStrategy
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolutionStrategy()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_STRATEGY = 35;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.ConflictResolutionType
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolutionType()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_TYPE = 36;

	/**
	 * The meta object id for the '{@link refactoringDiffMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringDiffMM.DiffKind
	 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 37;


	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.ConflictResolution <em>Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Resolution</em>'.
	 * @see refactoringDiffMM.ConflictResolution
	 * @generated
	 */
	EClass getConflictResolution();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.ConflictResolution#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see refactoringDiffMM.ConflictResolution#getResolutionType()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EAttribute getConflictResolution_ResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Strategy</em>'.
	 * @see refactoringDiffMM.ConflictResolution#getResolutionStrategy()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EAttribute getConflictResolution_ResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticconflicts</em>'.
	 * @see refactoringDiffMM.ConflictResolution#getSemanticconflicts()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EReference getConflictResolution_Semanticconflicts();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EAttribute</em>'.
	 * @see refactoringDiffMM.DiffEAttribute
	 * @generated
	 */
	EClass getDiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getDiff_kind_Left()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getDiff_kind_Right()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#isFilter()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#isIsMerged()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getChangeStatus()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_name_Left()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_name_Right()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNameChangeStatus()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_etype_Left()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getNew_etype_Right()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEAttribute#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringDiffMM.DiffEAttribute#getEtypeChangeStatus()
	 * @see #getDiffEAttribute()
	 * @generated
	 */
	EAttribute getDiffEAttribute_EtypeChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass</em>'.
	 * @see refactoringDiffMM.DiffEClass
	 * @generated
	 */
	EClass getDiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#getDiff_kind_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#getDiff_kind_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass#isFilter()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass#isIsMerged()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_name_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_name_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNameChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_extends_Left <em>New extends Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_extends_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_extends_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_extends_Right <em>New extends Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_extends_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_extends_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getExtendsChangeStatus <em>Extends Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getExtendsChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_ExtendsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_implements_Left <em>New implements Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New implements Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_implements_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_implements_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_implements_Right <em>New implements Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New implements Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_implements_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_implements_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getImplementsChangeStatus <em>Implements Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getImplementsChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_ImplementsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#isNew_isAbstract_Left <em>New is Abstract Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New is Abstract Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#isNew_isAbstract_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_isAbstract_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#isNew_isAbstract_Right <em>New is Abstract Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New is Abstract Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#isNew_isAbstract_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_isAbstract_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getIsAbstractChangeStatus <em>Is Abstract Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getIsAbstractChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_IsAbstractChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_packageName_Left <em>New package Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Left</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_packageName_Left()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_packageName_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getNew_packageName_Right <em>New package Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Right</em>'.
	 * @see refactoringDiffMM.DiffEClass#getNew_packageName_Right()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_New_packageName_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass#getPackageNameChangeStatus <em>Package Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass#getPackageNameChangeStatus()
	 * @see #getDiffEClass()
	 * @generated
	 */
	EAttribute getDiffEClass_PackageNameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_eattributes <em>Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eattributes</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes
	 * @generated
	 */
	EClass getDiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getDiff_kind_Left()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getDiff_kind_Right()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getChangeStatus()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#isFilter()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#isIsMerged()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eattributes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getDiff_Group()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getDiffEClass_eattributes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_eattributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_eattributes#getEType()
	 * @see #getDiffEClass_eattributes()
	 * @generated
	 */
	EReference getDiffEClass_eattributes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_eoperations <em>Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass eoperations</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations
	 * @generated
	 */
	EClass getDiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getDiff_kind_Left()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getDiff_kind_Right()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getChangeStatus()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#isFilter()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#isIsMerged()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_eoperations#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getDiff_Group()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getDiffEClass_eoperations_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_eoperations#getEType()
	 * @see #getDiffEClass_eoperations()
	 * @generated
	 */
	EReference getDiffEClass_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_ereferences <em>Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass ereferences</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences
	 * @generated
	 */
	EClass getDiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Left()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getDiff_kind_Right()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getChangeStatus()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#isFilter()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#isIsMerged()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_ereferences#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getDiff_Group()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getDiffEClass_ereferences_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_ereferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_ereferences#getEType()
	 * @see #getDiffEClass_ereferences()
	 * @generated
	 */
	EReference getDiffEClass_ereferences_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_esupertypes <em>Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass esupertypes</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes
	 * @generated
	 */
	EClass getDiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getDiff_kind_Left()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getDiff_kind_Right()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getChangeStatus()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#isFilter()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#isIsMerged()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_esupertypes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getDiff_Group()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getDiffEClass_esupertypes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_esupertypes#getEType()
	 * @see #getDiffEClass_esupertypes()
	 * @generated
	 */
	EReference getDiffEClass_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_interfaces <em>Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass interfaces</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces
	 * @generated
	 */
	EClass getDiffEClass_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#getDiff_kind_Left()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#getDiff_kind_Right()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#getChangeStatus()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#isFilter()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#isIsMerged()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#getDiff_Group()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_interfaces#getEType()
	 * @see #getDiffEClass_interfaces()
	 * @generated
	 */
	EReference getDiffEClass_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_nested_classes <em>Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass nested classes</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes
	 * @generated
	 */
	EClass getDiffEClass_nested_classes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#getDiff_kind_Left()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#getDiff_kind_Right()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#getChangeStatus()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#isFilter()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#isIsMerged()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_classes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#getDiff_Group()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_classes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_nested_classes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_classes#getEType()
	 * @see #getDiffEClass_nested_classes()
	 * @generated
	 */
	EReference getDiffEClass_nested_classes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEClass_nested_interfaces <em>Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EClass nested interfaces</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces
	 * @generated
	 */
	EClass getDiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_kind_Left()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_kind_Right()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#getChangeStatus()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#isFilter()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#isIsMerged()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#getDiff_Group()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getDiffEClass_nested_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEClass_nested_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEClass_nested_interfaces#getEType()
	 * @see #getDiffEClass_nested_interfaces()
	 * @generated
	 */
	EReference getDiffEClass_nested_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EOperation</em>'.
	 * @see refactoringDiffMM.DiffEOperation
	 * @generated
	 */
	EClass getDiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getDiff_kind_Left()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getDiff_kind_Right()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEOperation#isFilter()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEOperation#isIsMerged()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getChangeStatus()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_name_Left()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_name_Right()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNameChangeStatus()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_eparameters_Left <em>New eparameters Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters Left</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_eparameters_Left()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_eparameters_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_eparameters_Right <em>New eparameters Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters Right</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_eparameters_Right()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_eparameters_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getEparametersChangeStatus <em>Eparameters Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters Change Status</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getEparametersChangeStatus()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_EparametersChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_etype_Left()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_etype_Right()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getEtypeChangeStatus()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_EtypeChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_methodBody_Left <em>New method Body Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New method Body Left</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_methodBody_Left()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_methodBody_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getNew_methodBody_Right <em>New method Body Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New method Body Right</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getNew_methodBody_Right()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_New_methodBody_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEOperation#getMethodBodyChangeStatus <em>Method Body Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Body Change Status</em>'.
	 * @see refactoringDiffMM.DiffEOperation#getMethodBodyChangeStatus()
	 * @see #getDiffEOperation()
	 * @generated
	 */
	EAttribute getDiffEOperation_MethodBodyChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage</em>'.
	 * @see refactoringDiffMM.DiffEPackage
	 * @generated
	 */
	EClass getDiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getDiff_kind_Left()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getDiff_kind_Right()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEPackage#isFilter()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEPackage#isIsMerged()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getChangeStatus()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getNew_name_Left()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getNew_name_Right()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEPackage#getNameChangeStatus()
	 * @see #getDiffEPackage()
	 * @generated
	 */
	EAttribute getDiffEPackage_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage_eclassifiers <em>Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage eclassifiers</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getDiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_kind_Left()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_kind_Right()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getChangeStatus()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#isFilter()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#isIsMerged()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getDiff_Group()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getDiffEPackage_eclassifiers_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEPackage_eclassifiers#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEPackage_eclassifiers#getEType()
	 * @see #getDiffEPackage_eclassifiers()
	 * @generated
	 */
	EReference getDiffEPackage_eclassifiers_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage_interfaces <em>Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage interfaces</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces
	 * @generated
	 */
	EClass getDiffEPackage_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#getDiff_kind_Left()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#getDiff_kind_Right()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#getChangeStatus()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#isFilter()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#isIsMerged()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#getDiff_Group()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getDiffEPackage_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEPackage_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEPackage_interfaces#getEType()
	 * @see #getDiffEPackage_interfaces()
	 * @generated
	 */
	EReference getDiffEPackage_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEPackage_test <em>Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EPackage test</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test
	 * @generated
	 */
	EClass getDiffEPackage_test();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#getDiff_kind_Left()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#getDiff_kind_Right()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#getChangeStatus()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#isFilter()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#isIsMerged()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEPackage_test#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#getDiff_Group()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EAttribute getDiffEPackage_test_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffEPackage_test#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffEPackage_test#getEType()
	 * @see #getDiffEPackage_test()
	 * @generated
	 */
	EReference getDiffEPackage_test_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff EReference</em>'.
	 * @see refactoringDiffMM.DiffEReference
	 * @generated
	 */
	EClass getDiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffEReference#getDiff_kind_Left()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffEReference#getDiff_kind_Right()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffEReference#isFilter()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffEReference#isIsMerged()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffEReference#getChangeStatus()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_name_Left()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_name_Right()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNameChangeStatus()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_etype_Left()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringDiffMM.DiffEReference#getNew_etype_Right()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffEReference#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringDiffMM.DiffEReference#getEtypeChangeStatus()
	 * @see #getDiffEReference()
	 * @generated
	 */
	EAttribute getDiffEReference_EtypeChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffInterface <em>Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface</em>'.
	 * @see refactoringDiffMM.DiffInterface
	 * @generated
	 */
	EClass getDiffInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffInterface#getDiff_kind_Left()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffInterface#getDiff_kind_Right()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffInterface#isFilter()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffInterface#isIsMerged()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface#getChangeStatus()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_name_Left()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_name_Right()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNameChangeStatus()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_extends_Left <em>New extends Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Left</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_extends_Left()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_extends_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_extends_Right <em>New extends Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Right</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_extends_Right()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_extends_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface#getExtendsChangeStatus()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_ExtendsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Left</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_packageName_Left()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_packageName_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Right</em>'.
	 * @see refactoringDiffMM.DiffInterface#getNew_packageName_Right()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_New_packageName_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface#getPackageNameChangeStatus()
	 * @see #getDiffInterface()
	 * @generated
	 */
	EAttribute getDiffInterface_PackageNameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffInterface_eoperations <em>Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface eoperations</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations
	 * @generated
	 */
	EClass getDiffInterface_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#getDiff_kind_Left()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#getDiff_kind_Right()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#getChangeStatus()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#isFilter()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#isIsMerged()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_eoperations#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#getDiff_Group()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getDiffInterface_eoperations_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffInterface_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffInterface_eoperations#getEType()
	 * @see #getDiffInterface_eoperations()
	 * @generated
	 */
	EReference getDiffInterface_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DiffInterface_esupertypes <em>Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Interface esupertypes</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes
	 * @generated
	 */
	EClass getDiffInterface_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#getDiff_kind_Left()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#getDiff_kind_Right()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#getChangeStatus()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#isFilter()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#isIsMerged()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DiffInterface_esupertypes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#getDiff_Group()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getDiffInterface_esupertypes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DiffInterface_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DiffInterface_esupertypes#getEType()
	 * @see #getDiffInterface_esupertypes()
	 * @generated
	 */
	EReference getDiffInterface_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DifftestAssociations <em>Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difftest Associations</em>'.
	 * @see refactoringDiffMM.DifftestAssociations
	 * @generated
	 */
	EClass getDifftestAssociations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getDiff_kind_Left()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getDiff_kind_Right()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#isFilter()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#isIsMerged()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getChangeStatus()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getNew_name_Left()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getNew_name_Right()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringDiffMM.DifftestAssociations#getNameChangeStatus()
	 * @see #getDifftestAssociations()
	 * @generated
	 */
	EAttribute getDifftestAssociations_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DifftestAssociations_multi <em>Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difftest Associations multi</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi
	 * @generated
	 */
	EClass getDifftestAssociations_multi();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#getDiff_kind_Left()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#getDiff_kind_Right()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#getChangeStatus()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#isFilter()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#isIsMerged()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_multi#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#getDiff_Group()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getDifftestAssociations_multi_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DifftestAssociations_multi#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_multi#getEType()
	 * @see #getDifftestAssociations_multi()
	 * @generated
	 */
	EReference getDifftestAssociations_multi_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.DifftestAssociations_single <em>Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difftest Associations single</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single
	 * @generated
	 */
	EClass getDifftestAssociations_single();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#getDiff_kind_Left()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#getDiff_kind_Right()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#getChangeStatus()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#isFilter()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#isIsMerged()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.DifftestAssociations_single#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#getDiff_Group()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EAttribute getDifftestAssociations_single_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.DifftestAssociations_single#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringDiffMM.DifftestAssociations_single#getEType()
	 * @see #getDifftestAssociations_single()
	 * @generated
	 */
	EReference getDifftestAssociations_single_EType();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see refactoringDiffMM.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EAttribute#getName()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EAttribute#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EAttribute#getEtype()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see refactoringDiffMM.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EClass#getName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoringDiffMM.EClass#getExtends()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see refactoringDiffMM.EClass#getImplements()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see refactoringDiffMM.EClass#isIsAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EClass#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoringDiffMM.EClass#getPackageName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEattributes <em>Eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributes</em>'.
	 * @see refactoringDiffMM.EClass#getEattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoringDiffMM.EClass#getEoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getEreferences <em>Ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferences</em>'.
	 * @see refactoringDiffMM.EClass#getEreferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.EClass#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoringDiffMM.EClass#getEsupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.EClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see refactoringDiffMM.EClass#getInterfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getNested_classes <em>Nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested classes</em>'.
	 * @see refactoringDiffMM.EClass#getNested_classes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Nested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getNested_interfaces <em>Nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested interfaces</em>'.
	 * @see refactoringDiffMM.EClass#getNested_interfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Nested_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffeattributes <em>Diffeattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeattributes</em>'.
	 * @see refactoringDiffMM.EClass#getDiffeattributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoringDiffMM.EClass#getDiffeoperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffereferences <em>Differeferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Differeferences</em>'.
	 * @see refactoringDiffMM.EClass#getDiffereferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Differeferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoringDiffMM.EClass#getDiffesupertypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffesupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoringDiffMM.EClass#getDiffinterfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffinterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffnested_classes <em>Diffnested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested classes</em>'.
	 * @see refactoringDiffMM.EClass#getDiffnested_classes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffnested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EClass#getDiffnested_interfaces <em>Diffnested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested interfaces</em>'.
	 * @see refactoringDiffMM.EClass#getDiffnested_interfaces()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Diffnested_interfaces();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see refactoringDiffMM.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EOperation#getName()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getEparameters <em>Eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters</em>'.
	 * @see refactoringDiffMM.EOperation#getEparameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EOperation#getEtype()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_Etype();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#getMethodBody <em>Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Body</em>'.
	 * @see refactoringDiffMM.EOperation#getMethodBody()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation_MethodBody();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EOperation#get__idKDM <em>id KDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id KDM</em>'.
	 * @see refactoringDiffMM.EOperation#get__idKDM()
	 * @see #getEOperation()
	 * @generated
	 */
	EAttribute getEOperation___idKDM();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see refactoringDiffMM.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EPackage#getName()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getEclassifiers <em>Eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclassifiers</em>'.
	 * @see refactoringDiffMM.EPackage#getEclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Eclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see refactoringDiffMM.EPackage#getInterfaces()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see refactoringDiffMM.EPackage#getTest()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Test();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeclassifiers</em>'.
	 * @see refactoringDiffMM.EPackage#getDiffeclassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffeclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoringDiffMM.EPackage#getDiffinterfaces()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Diffinterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.EPackage#getDifftest <em>Difftest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftest</em>'.
	 * @see refactoringDiffMM.EPackage#getDifftest()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_Difftest();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see refactoringDiffMM.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.EReference#getName()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.EReference#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringDiffMM.EReference#getEtype()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see refactoringDiffMM.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.Interface#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoringDiffMM.Interface#getExtends()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.Interface#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoringDiffMM.Interface#getPackageName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.Interface#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoringDiffMM.Interface#getEoperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.Interface#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoringDiffMM.Interface#getEsupertypes()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.Interface#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoringDiffMM.Interface#getDiffeoperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.Interface#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoringDiffMM.Interface#getDiffesupertypes()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Diffesupertypes();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see refactoringDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.SemanticConflict#getConflict_kind <em>Conflict kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict kind</em>'.
	 * @see refactoringDiffMM.SemanticConflict#getConflict_kind()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Conflict_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict Granularity</em>'.
	 * @see refactoringDiffMM.SemanticConflict#getConflict_Granularity()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Conflict_Granularity();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see refactoringDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see refactoringDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see refactoringDiffMM.SemanticDiff#getAuthor()
	 * @see #getSemanticDiff()
	 * @generated
	 */
	EAttribute getSemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see refactoringDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EAttribute</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEAttribute()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eattributes</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_eattributes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eoperations</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_eoperations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass ereferences</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_ereferences()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass esupertypes</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_esupertypes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass interfaces</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested classes</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_classes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested interfaces</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EOperation</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEOperation()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage eclassifiers</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_eclassifiers()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage interfaces</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_interfaces()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_test <em>Semantic Object Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage test</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEPackage_test()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEPackage_test();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EReference</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffEReference()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffEReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface eoperations</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface_eoperations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface esupertypes</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DiffInterface_esupertypes()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations <em>Semantic Object Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DifftestAssociations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations_multi <em>Semantic Object Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations multi</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations_multi()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DifftestAssociations_multi();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations_single <em>Semantic Object Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations single</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_DifftestAssociations_single()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DifftestAssociations_single();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EAttribute</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_EAttribute()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_EClass <em>Semantic Object EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EClass</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_EClass()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EOperation</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_EOperation()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EPackage</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_EPackage()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_EReference <em>Semantic Object EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EReference</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_EReference()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_EReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_Interface <em>Semantic Object Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Interface</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_Interface()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Interface();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.SemanticObject#getSemanticObject_testAssociations <em>Semantic Object test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object test Associations</em>'.
	 * @see refactoringDiffMM.SemanticObject#getSemanticObject_testAssociations()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_testAssociations();

	/**
	 * Returns the meta object for class '{@link refactoringDiffMM.testAssociations <em>test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test Associations</em>'.
	 * @see refactoringDiffMM.testAssociations
	 * @generated
	 */
	EClass gettestAssociations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringDiffMM.testAssociations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringDiffMM.testAssociations#getName()
	 * @see #gettestAssociations()
	 * @generated
	 */
	EAttribute gettestAssociations_Name();

	/**
	 * Returns the meta object for the reference '{@link refactoringDiffMM.testAssociations#getSingle <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single</em>'.
	 * @see refactoringDiffMM.testAssociations#getSingle()
	 * @see #gettestAssociations()
	 * @generated
	 */
	EReference gettestAssociations_Single();

	/**
	 * Returns the meta object for the reference list '{@link refactoringDiffMM.testAssociations#getMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi</em>'.
	 * @see refactoringDiffMM.testAssociations#getMulti()
	 * @see #gettestAssociations()
	 * @generated
	 */
	EReference gettestAssociations_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.testAssociations#getDiffsingle <em>Diffsingle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsingle</em>'.
	 * @see refactoringDiffMM.testAssociations#getDiffsingle()
	 * @see #gettestAssociations()
	 * @generated
	 */
	EReference gettestAssociations_Diffsingle();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringDiffMM.testAssociations#getDiffmulti <em>Diffmulti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmulti</em>'.
	 * @see refactoringDiffMM.testAssociations#getDiffmulti()
	 * @see #gettestAssociations()
	 * @generated
	 */
	EReference gettestAssociations_Diffmulti();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see refactoringDiffMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see refactoringDiffMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.ConflictGranularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Granularity</em>'.
	 * @see refactoringDiffMM.ConflictGranularity
	 * @generated
	 */
	EEnum getConflictGranularity();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Strategy</em>'.
	 * @see refactoringDiffMM.ConflictResolutionStrategy
	 * @generated
	 */
	EEnum getConflictResolutionStrategy();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Type</em>'.
	 * @see refactoringDiffMM.ConflictResolutionType
	 * @generated
	 */
	EEnum getConflictResolutionType();

	/**
	 * Returns the meta object for enum '{@link refactoringDiffMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see refactoringDiffMM.DiffKind
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
	RefactoringDiffMMFactory getRefactoringDiffMMFactory();

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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.ConflictResolutionImpl <em>Conflict Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.ConflictResolutionImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolution()
		 * @generated
		 */
		EClass CONFLICT_RESOLUTION = eINSTANCE.getConflictResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT_RESOLUTION__RESOLUTION_TYPE = eINSTANCE.getConflictResolution_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Resolution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = eINSTANCE.getConflictResolution_ResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT_RESOLUTION__SEMANTICCONFLICTS = eINSTANCE.getConflictResolution_Semanticconflicts();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEAttributeImpl <em>Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEAttributeImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEAttribute()
		 * @generated
		 */
		EClass DIFF_EATTRIBUTE = eINSTANCE.getDiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__DIFF_KIND_LEFT = eINSTANCE.getDiffEAttribute_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__DIFF_KIND_RIGHT = eINSTANCE.getDiffEAttribute_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__FILTER = eINSTANCE.getDiffEAttribute_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__IS_MERGED = eINSTANCE.getDiffEAttribute_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__CHANGE_STATUS = eINSTANCE.getDiffEAttribute_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_NAME_LEFT = eINSTANCE.getDiffEAttribute_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_NAME_RIGHT = eINSTANCE.getDiffEAttribute_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NAME_CHANGE_STATUS = eINSTANCE.getDiffEAttribute_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_ETYPE_LEFT = eINSTANCE.getDiffEAttribute_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT = eINSTANCE.getDiffEAttribute_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS = eINSTANCE.getDiffEAttribute_EtypeChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClassImpl <em>Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClassImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass()
		 * @generated
		 */
		EClass DIFF_ECLASS = eINSTANCE.getDiffEClass();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__FILTER = eINSTANCE.getDiffEClass_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__IS_MERGED = eINSTANCE.getDiffEClass_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__CHANGE_STATUS = eINSTANCE.getDiffEClass_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_NAME_LEFT = eINSTANCE.getDiffEClass_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_NAME_RIGHT = eINSTANCE.getDiffEClass_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NAME_CHANGE_STATUS = eINSTANCE.getDiffEClass_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New extends Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_EXTENDS_LEFT = eINSTANCE.getDiffEClass_New_extends_Left();

		/**
		 * The meta object literal for the '<em><b>New extends Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_EXTENDS_RIGHT = eINSTANCE.getDiffEClass_New_extends_Right();

		/**
		 * The meta object literal for the '<em><b>Extends Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__EXTENDS_CHANGE_STATUS = eINSTANCE.getDiffEClass_ExtendsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New implements Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IMPLEMENTS_LEFT = eINSTANCE.getDiffEClass_New_implements_Left();

		/**
		 * The meta object literal for the '<em><b>New implements Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT = eINSTANCE.getDiffEClass_New_implements_Right();

		/**
		 * The meta object literal for the '<em><b>Implements Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS = eINSTANCE.getDiffEClass_ImplementsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New is Abstract Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT = eINSTANCE.getDiffEClass_New_isAbstract_Left();

		/**
		 * The meta object literal for the '<em><b>New is Abstract Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT = eINSTANCE.getDiffEClass_New_isAbstract_Right();

		/**
		 * The meta object literal for the '<em><b>Is Abstract Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS = eINSTANCE.getDiffEClass_IsAbstractChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New package Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT = eINSTANCE.getDiffEClass_New_packageName_Left();

		/**
		 * The meta object literal for the '<em><b>New package Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT = eINSTANCE.getDiffEClass_New_packageName_Right();

		/**
		 * The meta object literal for the '<em><b>Package Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS = eINSTANCE.getDiffEClass_PackageNameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_eattributesImpl <em>Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_eattributesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eattributes()
		 * @generated
		 */
		EClass DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getDiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_eattributes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_eattributes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS = eINSTANCE.getDiffEClass_eattributes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__FILTER = eINSTANCE.getDiffEClass_eattributes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__IS_MERGED = eINSTANCE.getDiffEClass_eattributes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EATTRIBUTES__DIFF_GROUP = eINSTANCE.getDiffEClass_eattributes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EATTRIBUTES__ETYPE = eINSTANCE.getDiffEClass_eattributes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_eoperationsImpl <em>Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_eoperationsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_eoperations()
		 * @generated
		 */
		EClass DIFF_ECLASS_EOPERATIONS = eINSTANCE.getDiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_eoperations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_eoperations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS = eINSTANCE.getDiffEClass_eoperations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__FILTER = eINSTANCE.getDiffEClass_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__IS_MERGED = eINSTANCE.getDiffEClass_eoperations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EOPERATIONS__DIFF_GROUP = eINSTANCE.getDiffEClass_eoperations_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EOPERATIONS__ETYPE = eINSTANCE.getDiffEClass_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_ereferencesImpl <em>Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_ereferencesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_ereferences()
		 * @generated
		 */
		EClass DIFF_ECLASS_EREFERENCES = eINSTANCE.getDiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_ereferences_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_ereferences_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__CHANGE_STATUS = eINSTANCE.getDiffEClass_ereferences_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__FILTER = eINSTANCE.getDiffEClass_ereferences_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__IS_MERGED = eINSTANCE.getDiffEClass_ereferences_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_EREFERENCES__DIFF_GROUP = eINSTANCE.getDiffEClass_ereferences_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_EREFERENCES__ETYPE = eINSTANCE.getDiffEClass_ereferences_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_esupertypesImpl <em>Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_esupertypesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_esupertypes()
		 * @generated
		 */
		EClass DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getDiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_esupertypes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_esupertypes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS = eINSTANCE.getDiffEClass_esupertypes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__FILTER = eINSTANCE.getDiffEClass_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__IS_MERGED = eINSTANCE.getDiffEClass_esupertypes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_ESUPERTYPES__DIFF_GROUP = eINSTANCE.getDiffEClass_esupertypes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_ESUPERTYPES__ETYPE = eINSTANCE.getDiffEClass_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_interfacesImpl <em>Diff EClass interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_interfacesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_interfaces()
		 * @generated
		 */
		EClass DIFF_ECLASS_INTERFACES = eINSTANCE.getDiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__CHANGE_STATUS = eINSTANCE.getDiffEClass_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__FILTER = eINSTANCE.getDiffEClass_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__IS_MERGED = eINSTANCE.getDiffEClass_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_INTERFACES__DIFF_GROUP = eINSTANCE.getDiffEClass_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_INTERFACES__ETYPE = eINSTANCE.getDiffEClass_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_nested_classesImpl <em>Diff EClass nested classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_nested_classesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_nested_classes()
		 * @generated
		 */
		EClass DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getDiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_nested_classes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_nested_classes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS = eINSTANCE.getDiffEClass_nested_classes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__FILTER = eINSTANCE.getDiffEClass_nested_classes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__IS_MERGED = eINSTANCE.getDiffEClass_nested_classes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_CLASSES__DIFF_GROUP = eINSTANCE.getDiffEClass_nested_classes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_NESTED_CLASSES__ETYPE = eINSTANCE.getDiffEClass_nested_classes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEClass_nested_interfacesImpl <em>Diff EClass nested interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEClass_nested_interfacesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEClass_nested_interfaces()
		 * @generated
		 */
		EClass DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getDiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getDiffEClass_nested_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEClass_nested_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS = eINSTANCE.getDiffEClass_nested_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__FILTER = eINSTANCE.getDiffEClass_nested_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__IS_MERGED = eINSTANCE.getDiffEClass_nested_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ECLASS_NESTED_INTERFACES__DIFF_GROUP = eINSTANCE.getDiffEClass_nested_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ECLASS_NESTED_INTERFACES__ETYPE = eINSTANCE.getDiffEClass_nested_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEOperationImpl <em>Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEOperationImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEOperation()
		 * @generated
		 */
		EClass DIFF_EOPERATION = eINSTANCE.getDiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__DIFF_KIND_LEFT = eINSTANCE.getDiffEOperation_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__DIFF_KIND_RIGHT = eINSTANCE.getDiffEOperation_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__FILTER = eINSTANCE.getDiffEOperation_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__IS_MERGED = eINSTANCE.getDiffEOperation_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__CHANGE_STATUS = eINSTANCE.getDiffEOperation_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_NAME_LEFT = eINSTANCE.getDiffEOperation_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_NAME_RIGHT = eINSTANCE.getDiffEOperation_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NAME_CHANGE_STATUS = eINSTANCE.getDiffEOperation_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New eparameters Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_EPARAMETERS_LEFT = eINSTANCE.getDiffEOperation_New_eparameters_Left();

		/**
		 * The meta object literal for the '<em><b>New eparameters Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT = eINSTANCE.getDiffEOperation_New_eparameters_Right();

		/**
		 * The meta object literal for the '<em><b>Eparameters Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS = eINSTANCE.getDiffEOperation_EparametersChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_ETYPE_LEFT = eINSTANCE.getDiffEOperation_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_ETYPE_RIGHT = eINSTANCE.getDiffEOperation_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__ETYPE_CHANGE_STATUS = eINSTANCE.getDiffEOperation_EtypeChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New method Body Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_METHOD_BODY_LEFT = eINSTANCE.getDiffEOperation_New_methodBody_Left();

		/**
		 * The meta object literal for the '<em><b>New method Body Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT = eINSTANCE.getDiffEOperation_New_methodBody_Right();

		/**
		 * The meta object literal for the '<em><b>Method Body Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS = eINSTANCE.getDiffEOperation_MethodBodyChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackageImpl <em>Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackageImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage()
		 * @generated
		 */
		EClass DIFF_EPACKAGE = eINSTANCE.getDiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__DIFF_KIND_LEFT = eINSTANCE.getDiffEPackage_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__DIFF_KIND_RIGHT = eINSTANCE.getDiffEPackage_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__FILTER = eINSTANCE.getDiffEPackage_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__IS_MERGED = eINSTANCE.getDiffEPackage_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__CHANGE_STATUS = eINSTANCE.getDiffEPackage_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__NEW_NAME_LEFT = eINSTANCE.getDiffEPackage_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__NEW_NAME_RIGHT = eINSTANCE.getDiffEPackage_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE__NAME_CHANGE_STATUS = eINSTANCE.getDiffEPackage_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl <em>Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackage_eclassifiersImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_eclassifiers()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getDiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT = eINSTANCE.getDiffEPackage_eclassifiers_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT = eINSTANCE.getDiffEPackage_eclassifiers_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS = eINSTANCE.getDiffEPackage_eclassifiers_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__FILTER = eINSTANCE.getDiffEPackage_eclassifiers_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__IS_MERGED = eINSTANCE.getDiffEPackage_eclassifiers_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_ECLASSIFIERS__DIFF_GROUP = eINSTANCE.getDiffEPackage_eclassifiers_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = eINSTANCE.getDiffEPackage_eclassifiers_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackage_interfacesImpl <em>Diff EPackage interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackage_interfacesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_interfaces()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_INTERFACES = eINSTANCE.getDiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getDiffEPackage_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getDiffEPackage_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS = eINSTANCE.getDiffEPackage_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__FILTER = eINSTANCE.getDiffEPackage_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__IS_MERGED = eINSTANCE.getDiffEPackage_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_INTERFACES__DIFF_GROUP = eINSTANCE.getDiffEPackage_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_INTERFACES__ETYPE = eINSTANCE.getDiffEPackage_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEPackage_testImpl <em>Diff EPackage test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEPackage_testImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEPackage_test()
		 * @generated
		 */
		EClass DIFF_EPACKAGE_TEST = eINSTANCE.getDiffEPackage_test();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__DIFF_KIND_LEFT = eINSTANCE.getDiffEPackage_test_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__DIFF_KIND_RIGHT = eINSTANCE.getDiffEPackage_test_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__CHANGE_STATUS = eINSTANCE.getDiffEPackage_test_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__FILTER = eINSTANCE.getDiffEPackage_test_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__IS_MERGED = eINSTANCE.getDiffEPackage_test_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EPACKAGE_TEST__DIFF_GROUP = eINSTANCE.getDiffEPackage_test_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_EPACKAGE_TEST__ETYPE = eINSTANCE.getDiffEPackage_test_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffEReferenceImpl <em>Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffEReferenceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffEReference()
		 * @generated
		 */
		EClass DIFF_EREFERENCE = eINSTANCE.getDiffEReference();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__DIFF_KIND_LEFT = eINSTANCE.getDiffEReference_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__DIFF_KIND_RIGHT = eINSTANCE.getDiffEReference_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__FILTER = eINSTANCE.getDiffEReference_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__IS_MERGED = eINSTANCE.getDiffEReference_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__CHANGE_STATUS = eINSTANCE.getDiffEReference_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_NAME_LEFT = eINSTANCE.getDiffEReference_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_NAME_RIGHT = eINSTANCE.getDiffEReference_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NAME_CHANGE_STATUS = eINSTANCE.getDiffEReference_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_ETYPE_LEFT = eINSTANCE.getDiffEReference_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__NEW_ETYPE_RIGHT = eINSTANCE.getDiffEReference_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_EREFERENCE__ETYPE_CHANGE_STATUS = eINSTANCE.getDiffEReference_EtypeChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffInterfaceImpl <em>Diff Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffInterfaceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface()
		 * @generated
		 */
		EClass DIFF_INTERFACE = eINSTANCE.getDiffInterface();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__DIFF_KIND_LEFT = eINSTANCE.getDiffInterface_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__DIFF_KIND_RIGHT = eINSTANCE.getDiffInterface_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__FILTER = eINSTANCE.getDiffInterface_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__IS_MERGED = eINSTANCE.getDiffInterface_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__CHANGE_STATUS = eINSTANCE.getDiffInterface_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_NAME_LEFT = eINSTANCE.getDiffInterface_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_NAME_RIGHT = eINSTANCE.getDiffInterface_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NAME_CHANGE_STATUS = eINSTANCE.getDiffInterface_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New extends Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_EXTENDS_LEFT = eINSTANCE.getDiffInterface_New_extends_Left();

		/**
		 * The meta object literal for the '<em><b>New extends Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_EXTENDS_RIGHT = eINSTANCE.getDiffInterface_New_extends_Right();

		/**
		 * The meta object literal for the '<em><b>Extends Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__EXTENDS_CHANGE_STATUS = eINSTANCE.getDiffInterface_ExtendsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New package Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT = eINSTANCE.getDiffInterface_New_packageName_Left();

		/**
		 * The meta object literal for the '<em><b>New package Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT = eINSTANCE.getDiffInterface_New_packageName_Right();

		/**
		 * The meta object literal for the '<em><b>Package Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS = eINSTANCE.getDiffInterface_PackageNameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffInterface_eoperationsImpl <em>Diff Interface eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffInterface_eoperationsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface_eoperations()
		 * @generated
		 */
		EClass DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getDiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT = eINSTANCE.getDiffInterface_eoperations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT = eINSTANCE.getDiffInterface_eoperations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS = eINSTANCE.getDiffInterface_eoperations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__FILTER = eINSTANCE.getDiffInterface_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__IS_MERGED = eINSTANCE.getDiffInterface_eoperations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_EOPERATIONS__DIFF_GROUP = eINSTANCE.getDiffInterface_eoperations_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INTERFACE_EOPERATIONS__ETYPE = eINSTANCE.getDiffInterface_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DiffInterface_esupertypesImpl <em>Diff Interface esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DiffInterface_esupertypesImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffInterface_esupertypes()
		 * @generated
		 */
		EClass DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getDiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT = eINSTANCE.getDiffInterface_esupertypes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT = eINSTANCE.getDiffInterface_esupertypes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS = eINSTANCE.getDiffInterface_esupertypes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__FILTER = eINSTANCE.getDiffInterface_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__IS_MERGED = eINSTANCE.getDiffInterface_esupertypes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INTERFACE_ESUPERTYPES__DIFF_GROUP = eINSTANCE.getDiffInterface_esupertypes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INTERFACE_ESUPERTYPES__ETYPE = eINSTANCE.getDiffInterface_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DifftestAssociationsImpl <em>Difftest Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DifftestAssociationsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations()
		 * @generated
		 */
		EClass DIFFTEST_ASSOCIATIONS = eINSTANCE.getDifftestAssociations();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__DIFF_KIND_LEFT = eINSTANCE.getDifftestAssociations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__DIFF_KIND_RIGHT = eINSTANCE.getDifftestAssociations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__FILTER = eINSTANCE.getDifftestAssociations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__IS_MERGED = eINSTANCE.getDifftestAssociations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__CHANGE_STATUS = eINSTANCE.getDifftestAssociations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__NEW_NAME_LEFT = eINSTANCE.getDifftestAssociations_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__NEW_NAME_RIGHT = eINSTANCE.getDifftestAssociations_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS__NAME_CHANGE_STATUS = eINSTANCE.getDifftestAssociations_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DifftestAssociations_multiImpl <em>Difftest Associations multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DifftestAssociations_multiImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations_multi()
		 * @generated
		 */
		EClass DIFFTEST_ASSOCIATIONS_MULTI = eINSTANCE.getDifftestAssociations_multi();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_LEFT = eINSTANCE.getDifftestAssociations_multi_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_RIGHT = eINSTANCE.getDifftestAssociations_multi_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__CHANGE_STATUS = eINSTANCE.getDifftestAssociations_multi_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__FILTER = eINSTANCE.getDifftestAssociations_multi_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__IS_MERGED = eINSTANCE.getDifftestAssociations_multi_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_MULTI__DIFF_GROUP = eINSTANCE.getDifftestAssociations_multi_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFTEST_ASSOCIATIONS_MULTI__ETYPE = eINSTANCE.getDifftestAssociations_multi_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.DifftestAssociations_singleImpl <em>Difftest Associations single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.DifftestAssociations_singleImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDifftestAssociations_single()
		 * @generated
		 */
		EClass DIFFTEST_ASSOCIATIONS_SINGLE = eINSTANCE.getDifftestAssociations_single();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_LEFT = eINSTANCE.getDifftestAssociations_single_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_RIGHT = eINSTANCE.getDifftestAssociations_single_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__CHANGE_STATUS = eINSTANCE.getDifftestAssociations_single_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__FILTER = eINSTANCE.getDifftestAssociations_single_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__IS_MERGED = eINSTANCE.getDifftestAssociations_single_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_GROUP = eINSTANCE.getDifftestAssociations_single_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFTEST_ASSOCIATIONS_SINGLE__ETYPE = eINSTANCE.getDifftestAssociations_single_EType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EAttributeImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEAttribute()
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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EClassImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEClass()
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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EOperationImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEOperation()
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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EPackageImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEPackage()
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
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__TEST = eINSTANCE.getEPackage_Test();

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
		 * The meta object literal for the '<em><b>Difftest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__DIFFTEST = eINSTANCE.getEPackage_Difftest();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.EReferenceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getEReference()
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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.InterfaceImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getInterface()
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
		 * The meta object literal for the '{@link refactoringDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.SemanticConflictImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONFLICT__CONFLICT_KIND = eINSTANCE.getSemanticConflict_Conflict_kind();

		/**
		 * The meta object literal for the '<em><b>Conflict Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = eINSTANCE.getSemanticConflict_Conflict_Granularity();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getSemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.SemanticDiffImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticDiff()
		 * @generated
		 */
		EClass SEMANTIC_DIFF = eINSTANCE.getSemanticDiff();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_DIFF__AUTHOR = eINSTANCE.getSemanticDiff_Author();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.SemanticObjectImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getSemanticObject()
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
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = eINSTANCE.getSemanticObject_SemanticObject_DiffEPackage_test();

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
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = eINSTANCE.getSemanticObject_SemanticObject_DifftestAssociations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = eINSTANCE.getSemanticObject_SemanticObject_DifftestAssociations_multi();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = eINSTANCE.getSemanticObject_SemanticObject_DifftestAssociations_single();

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
		 * The meta object literal for the '<em><b>Semantic Object test Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = eINSTANCE.getSemanticObject_SemanticObject_testAssociations();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.impl.testAssociationsImpl <em>test Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.impl.testAssociationsImpl
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#gettestAssociations()
		 * @generated
		 */
		EClass TEST_ASSOCIATIONS = eINSTANCE.gettestAssociations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ASSOCIATIONS__NAME = eINSTANCE.gettestAssociations_Name();

		/**
		 * The meta object literal for the '<em><b>Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATIONS__SINGLE = eINSTANCE.gettestAssociations_Single();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATIONS__MULTI = eINSTANCE.gettestAssociations_Multi();

		/**
		 * The meta object literal for the '<em><b>Diffsingle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATIONS__DIFFSINGLE = eINSTANCE.gettestAssociations_Diffsingle();

		/**
		 * The meta object literal for the '<em><b>Diffmulti</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATIONS__DIFFMULTI = eINSTANCE.gettestAssociations_Diffmulti();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.AUTHOR
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.ChangeStatus
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.ConflictGranularity
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictGranularity()
		 * @generated
		 */
		EEnum CONFLICT_GRANULARITY = eINSTANCE.getConflictGranularity();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.ConflictResolutionStrategy
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolutionStrategy()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_STRATEGY = eINSTANCE.getConflictResolutionStrategy();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.ConflictResolutionType
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getConflictResolutionType()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_TYPE = eINSTANCE.getConflictResolutionType();

		/**
		 * The meta object literal for the '{@link refactoringDiffMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringDiffMM.DiffKind
		 * @see refactoringDiffMM.impl.RefactoringDiffMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //RefactoringDiffMMPackage
