/**
 */
package refactoringCRRuleMM;

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
 * @see refactoringCRRuleMM.RefactoringCRRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringCRRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoringCRRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoringCRRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoringCRRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringCRRuleMMPackage eINSTANCE = refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticObject()
	 * @generated
	 */
	int PATTERN_SEMANTIC_OBJECT = 30;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = 8;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = 10;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = 11;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE = 13;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = 14;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = 15;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = 16;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = 18;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = 19;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = 20;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = 21;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = 22;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = 23;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = 24;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = 25;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = 26;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = 27;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = 28;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = 29;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = 30;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_ConflictResolutionImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_ConflictResolution()
	 * @generated
	 */
	int PATTERN_CONFLICT_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_EAttributeImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EAttribute()
	 * @generated
	 */
	int PATTERN_EATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEAttributeImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEAttribute()
	 * @generated
	 */
	int PATTERN_DIFF_EATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = PATTERN_EATTRIBUTE__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__IS_FORBIDDEN = PATTERN_EATTRIBUTE__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NAME = PATTERN_EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ETYPE = PATTERN_EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_LEFT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_RIGHT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__FILTER = PATTERN_EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__IS_MERGED = PATTERN_EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__CHANGE_STATUS = PATTERN_EATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_NAME_LEFT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_NAME_RIGHT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NAME_CHANGE_STATUS = PATTERN_EATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_LEFT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS = PATTERN_EATTRIBUTE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_FEATURE_COUNT = PATTERN_EATTRIBUTE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_OPERATION_COUNT = PATTERN_EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_EClassImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EClass()
	 * @generated
	 */
	int PATTERN_ECLASS = 23;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EXTENDS = 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IMPLEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__IS_ABSTRACT = 5;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__PACKAGE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EATTRIBUTES = 7;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EOPERATIONS = 8;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EREFERENCES = 9;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ESUPERTYPES = 10;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__INTERFACES = 11;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NESTED_CLASSES = 12;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__NESTED_INTERFACES = 13;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEATTRIBUTES = 14;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEOPERATIONS = 15;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEREFERENCES = 16;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFESUPERTYPES = 17;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFINTERFACES = 18;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFNESTED_CLASSES = 19;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFNESTED_INTERFACES = 20;

	/**
	 * The number of structural features of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClassImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ID_PATTERN = PATTERN_ECLASS__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_FORBIDDEN = PATTERN_ECLASS__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NAME = PATTERN_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EXTENDS = PATTERN_ECLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IMPLEMENTS = PATTERN_ECLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_ABSTRACT = PATTERN_ECLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__PACKAGE_NAME = PATTERN_ECLASS__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EATTRIBUTES = PATTERN_ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EOPERATIONS = PATTERN_ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EREFERENCES = PATTERN_ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ESUPERTYPES = PATTERN_ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__INTERFACES = PATTERN_ECLASS__INTERFACES;

	/**
	 * The feature id for the '<em><b>Nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NESTED_CLASSES = PATTERN_ECLASS__NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NESTED_INTERFACES = PATTERN_ECLASS__NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEATTRIBUTES = PATTERN_ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEOPERATIONS = PATTERN_ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEREFERENCES = PATTERN_ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFESUPERTYPES = PATTERN_ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFINTERFACES = PATTERN_ECLASS__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFNESTED_CLASSES = PATTERN_ECLASS__DIFFNESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFNESTED_INTERFACES = PATTERN_ECLASS__DIFFNESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFF_KIND_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFF_KIND_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__FILTER = PATTERN_ECLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_MERGED = PATTERN_ECLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_NAME_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_NAME_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NAME_CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New extends Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_EXTENDS_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New extends Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_EXTENDS_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EXTENDS_CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New implements Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New implements Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Implements Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New is Abstract Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New is Abstract Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Abstract Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT = PATTERN_ECLASS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>New package Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT = PATTERN_ECLASS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Package Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS = PATTERN_ECLASS_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_FEATURE_COUNT = PATTERN_ECLASS_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_OPERATION_COUNT = PATTERN_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_eattributesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES = 5;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES = 6;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_interfacesImpl <em>Pattern Diff EClass interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_interfacesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES = 7;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_classesImpl <em>Pattern Diff EClass nested classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_classesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES = 8;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass nested classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl <em>Pattern Diff EClass nested interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass nested interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_NESTED_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_EOperationImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EOperation()
	 * @generated
	 */
	int PATTERN_EOPERATION = 24;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EPARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ETYPE = 4;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__METHOD_BODY = 5;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_KDM = 6;

	/**
	 * The number of structural features of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEOperationImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEOperation()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION = 10;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_PATTERN = PATTERN_EOPERATION__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__IS_FORBIDDEN = PATTERN_EOPERATION__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NAME = PATTERN_EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EPARAMETERS = PATTERN_EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE = PATTERN_EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__METHOD_BODY = PATTERN_EOPERATION__METHOD_BODY;

	/**
	 * The feature id for the '<em><b>id KDM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_KDM = PATTERN_EOPERATION__ID_KDM;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFF_KIND_LEFT = PATTERN_EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__DIFF_KIND_RIGHT = PATTERN_EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__FILTER = PATTERN_EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__IS_MERGED = PATTERN_EOPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__CHANGE_STATUS = PATTERN_EOPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_NAME_LEFT = PATTERN_EOPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_NAME_RIGHT = PATTERN_EOPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NAME_CHANGE_STATUS = PATTERN_EOPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New eparameters Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_LEFT = PATTERN_EOPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New eparameters Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT = PATTERN_EOPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Eparameters Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS = PATTERN_EOPERATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_ETYPE_LEFT = PATTERN_EOPERATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_ETYPE_RIGHT = PATTERN_EOPERATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE_CHANGE_STATUS = PATTERN_EOPERATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>New method Body Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_LEFT = PATTERN_EOPERATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New method Body Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT = PATTERN_EOPERATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Method Body Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS = PATTERN_EOPERATION_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_FEATURE_COUNT = PATTERN_EOPERATION_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_OPERATION_COUNT = PATTERN_EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_EPackageImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EPackage()
	 * @generated
	 */
	int PATTERN_EPACKAGE = 25;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ECLASSIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__INTERFACES = 4;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__TEST = 5;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFECLASSIFIERS = 6;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFINTERFACES = 7;

	/**
	 * The feature id for the '<em><b>Difftest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFTEST = 8;

	/**
	 * The number of structural features of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackageImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE = 11;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ID_PATTERN = PATTERN_EPACKAGE__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__IS_FORBIDDEN = PATTERN_EPACKAGE__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NAME = PATTERN_EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ECLASSIFIERS = PATTERN_EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__INTERFACES = PATTERN_EPACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__TEST = PATTERN_EPACKAGE__TEST;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFECLASSIFIERS = PATTERN_EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFINTERFACES = PATTERN_EPACKAGE__DIFFINTERFACES;

	/**
	 * The feature id for the '<em><b>Difftest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFTEST = PATTERN_EPACKAGE__DIFFTEST;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFF_KIND_LEFT = PATTERN_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFF_KIND_RIGHT = PATTERN_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__FILTER = PATTERN_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__IS_MERGED = PATTERN_EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__CHANGE_STATUS = PATTERN_EPACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NAME_LEFT = PATTERN_EPACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NAME_RIGHT = PATTERN_EPACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NAME_CHANGE_STATUS = PATTERN_EPACKAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_FEATURE_COUNT = PATTERN_EPACKAGE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_OPERATION_COUNT = PATTERN_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 12;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_interfacesImpl <em>Pattern Diff EPackage interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_interfacesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES = 13;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_testImpl <em>Pattern Diff EPackage test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_testImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_test()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_TEST = 14;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_EReferenceImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EReference()
	 * @generated
	 */
	int PATTERN_EREFERENCE = 26;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEReference()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE = 15;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ID_PATTERN = PATTERN_EREFERENCE__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__IS_FORBIDDEN = PATTERN_EREFERENCE__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NAME = PATTERN_EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ETYPE = PATTERN_EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT = PATTERN_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT = PATTERN_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__FILTER = PATTERN_EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__IS_MERGED = PATTERN_EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__CHANGE_STATUS = PATTERN_EREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT = PATTERN_EREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT = PATTERN_EREFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS = PATTERN_EREFERENCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New etype Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT = PATTERN_EREFERENCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New etype Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT = PATTERN_EREFERENCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Etype Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS = PATTERN_EREFERENCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_FEATURE_COUNT = PATTERN_EREFERENCE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_OPERATION_COUNT = PATTERN_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl <em>Pattern Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_InterfaceImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_Interface()
	 * @generated
	 */
	int PATTERN_INTERFACE = 27;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__EXTENDS = 3;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__EOPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__ESUPERTYPES = 6;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__DIFFEOPERATIONS = 7;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE__DIFFESUPERTYPES = 8;

	/**
	 * The number of structural features of the '<em>Pattern Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterfaceImpl <em>Pattern Diff Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffInterfaceImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__ID_PATTERN = PATTERN_INTERFACE__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__IS_FORBIDDEN = PATTERN_INTERFACE__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NAME = PATTERN_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__EXTENDS = PATTERN_INTERFACE__EXTENDS;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__PACKAGE_NAME = PATTERN_INTERFACE__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__EOPERATIONS = PATTERN_INTERFACE__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__ESUPERTYPES = PATTERN_INTERFACE__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFFEOPERATIONS = PATTERN_INTERFACE__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFFESUPERTYPES = PATTERN_INTERFACE__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFF_KIND_LEFT = PATTERN_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__DIFF_KIND_RIGHT = PATTERN_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__FILTER = PATTERN_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__IS_MERGED = PATTERN_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__CHANGE_STATUS = PATTERN_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_NAME_LEFT = PATTERN_INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_NAME_RIGHT = PATTERN_INTERFACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NAME_CHANGE_STATUS = PATTERN_INTERFACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New extends Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_EXTENDS_LEFT = PATTERN_INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New extends Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_EXTENDS_RIGHT = PATTERN_INTERFACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__EXTENDS_CHANGE_STATUS = PATTERN_INTERFACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New package Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT = PATTERN_INTERFACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New package Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT = PATTERN_INTERFACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Package Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS = PATTERN_INTERFACE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_FEATURE_COUNT = PATTERN_INTERFACE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_OPERATION_COUNT = PATTERN_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterface_eoperationsImpl <em>Pattern Diff Interface eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffInterface_eoperationsImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS = 17;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_EOPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterface_esupertypesImpl <em>Pattern Diff Interface esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DiffInterface_esupertypesImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES = 18;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Interface esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INTERFACE_ESUPERTYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl <em>Pattern test Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_testAssociationsImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_testAssociations()
	 * @generated
	 */
	int PATTERN_TEST_ASSOCIATIONS = 31;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__SINGLE = 3;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__MULTI = 4;

	/**
	 * The feature id for the '<em><b>Diffsingle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE = 5;

	/**
	 * The feature id for the '<em><b>Diffmulti</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS__DIFFMULTI = 6;

	/**
	 * The number of structural features of the '<em>Pattern test Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pattern test Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEST_ASSOCIATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociationsImpl <em>Pattern Difftest Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociationsImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations()
	 * @generated
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS = 19;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__ID_PATTERN = PATTERN_TEST_ASSOCIATIONS__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__IS_FORBIDDEN = PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__NAME = PATTERN_TEST_ASSOCIATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__SINGLE = PATTERN_TEST_ASSOCIATIONS__SINGLE;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__MULTI = PATTERN_TEST_ASSOCIATIONS__MULTI;

	/**
	 * The feature id for the '<em><b>Diffsingle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__DIFFSINGLE = PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE;

	/**
	 * The feature id for the '<em><b>Diffmulti</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__DIFFMULTI = PATTERN_TEST_ASSOCIATIONS__DIFFMULTI;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_LEFT = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_RIGHT = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__FILTER = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__IS_MERGED = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__CHANGE_STATUS = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_LEFT = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_RIGHT = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS__NAME_CHANGE_STATUS = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Pattern Difftest Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_FEATURE_COUNT = PATTERN_TEST_ASSOCIATIONS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Pattern Difftest Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_OPERATION_COUNT = PATTERN_TEST_ASSOCIATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociations_multiImpl <em>Pattern Difftest Associations multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociations_multiImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI = 20;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Difftest Associations multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Difftest Associations multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_MULTI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociations_singleImpl <em>Pattern Difftest Associations single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociations_singleImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations_single()
	 * @generated
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE = 21;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Difftest Associations single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Difftest Associations single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 28;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Conflict kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.Pattern_SemanticDiffImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticDiff()
	 * @generated
	 */
	int PATTERN_SEMANTIC_DIFF = 29;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI;

	/**
	 * The feature id for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE;

	/**
	 * The feature id for the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EATTRIBUTE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_ECLASS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS;

	/**
	 * The feature id for the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EOPERATION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION;

	/**
	 * The feature id for the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EPACKAGE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_EREFERENCE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_INTERFACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__AUTHOR = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.impl.RuleImpl
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 32;

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
	 * The feature id for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS = 5;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS = 7;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES = 8;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass esupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES = 9;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES = 10;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass nested classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES = 11;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EClass nested interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES = 12;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EOperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION = 13;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EPackage eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 15;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EPackage interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES = 16;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EPackage test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST = 17;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE = 19;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Interface eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS = 20;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Interface esupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES = 21;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Difftest Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS = 22;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Difftest Associations multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI = 23;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Difftest Associations single</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE = 24;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern EAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_EATTRIBUTE = 25;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern EClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_ECLASS = 26;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern EOperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_EOPERATION = 27;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern EPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_EPACKAGE = 28;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_EREFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_INTERFACE = 30;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern test Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS = 31;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 32;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.AUTHOR
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 33;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 34;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.ConflictGranularity
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictGranularity()
	 * @generated
	 */
	int CONFLICT_GRANULARITY = 35;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.ConflictResolutionStrategy
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictResolutionStrategy()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_STRATEGY = 36;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.ConflictResolutionType
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictResolutionType()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_TYPE = 37;

	/**
	 * The meta object id for the '{@link refactoringCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringCRRuleMM.DiffKind
	 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 38;


	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Conflict Resolution</em>'.
	 * @see refactoringCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	EClass getPattern_ConflictResolution();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionType()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Strategy</em>'.
	 * @see refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticconflicts</em>'.
	 * @see refactoringCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EReference getPattern_ConflictResolution_Semanticconflicts();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAttribute</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	EClass getPattern_DiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getDiff_kind_Left()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getDiff_kind_Right()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#isFilter()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#isIsMerged()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getChangeStatus()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_name_Left()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_name_Right()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getNameChangeStatus()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_etype_Left()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getNew_etype_Right()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEAttribute#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute#getEtypeChangeStatus()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_EtypeChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	EClass getPattern_DiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#isFilter()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#isIsMerged()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_name_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNameChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Left <em>New extends Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_extends_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Right <em>New extends Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_extends_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_extends_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getExtendsChangeStatus <em>Extends Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getExtendsChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ExtendsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Left <em>New implements Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New implements Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_implements_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Right <em>New implements Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New implements Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_implements_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_implements_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getImplementsChangeStatus <em>Implements Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getImplementsChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ImplementsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Left <em>New is Abstract Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New is Abstract Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_isAbstract_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Right <em>New is Abstract Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New is Abstract Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#isNew_isAbstract_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_isAbstract_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getIsAbstractChangeStatus <em>Is Abstract Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getIsAbstractChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_IsAbstractChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Left <em>New package Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Left()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_packageName_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Right <em>New package Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getNew_packageName_Right()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_New_packageName_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass#getPackageNameChangeStatus <em>Package Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass#getPackageNameChangeStatus()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_PackageNameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes <em>Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eattributes</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isIsForbidden()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getChangeStatus()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isFilter()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#isIsMerged()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getDiff_Group()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes#getEType()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EReference getPattern_DiffEClass_eattributes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations <em>Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations
	 * @generated
	 */
	EClass getPattern_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isIsForbidden()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getChangeStatus()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isFilter()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#isIsMerged()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getDiff_Group()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations#getEType()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EReference getPattern_DiffEClass_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences <em>Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass ereferences</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences
	 * @generated
	 */
	EClass getPattern_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isIsForbidden()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getChangeStatus()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isFilter()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#isIsMerged()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getDiff_Group()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences#getEType()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EReference getPattern_DiffEClass_ereferences_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes <em>Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isIsForbidden()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getChangeStatus()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isFilter()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#isIsMerged()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getDiff_Group()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes#getEType()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EReference getPattern_DiffEClass_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces <em>Pattern Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getChangeStatus()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isFilter()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#isIsMerged()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getDiff_Group()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces#getEType()
	 * @see #getPattern_DiffEClass_interfaces()
	 * @generated
	 */
	EReference getPattern_DiffEClass_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes <em>Pattern Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass nested classes</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes
	 * @generated
	 */
	EClass getPattern_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getID_Pattern()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isIsForbidden()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getChangeStatus()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isFilter()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#isIsMerged()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getDiff_Group()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_classes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes#getEType()
	 * @see #getPattern_DiffEClass_nested_classes()
	 * @generated
	 */
	EReference getPattern_DiffEClass_nested_classes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces <em>Pattern Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass nested interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_kind_Left()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_kind_Right()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getChangeStatus()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isFilter()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#isIsMerged()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getDiff_Group()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_nested_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces#getEType()
	 * @see #getPattern_DiffEClass_nested_interfaces()
	 * @generated
	 */
	EReference getPattern_DiffEClass_nested_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	EClass getPattern_DiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getDiff_kind_Left()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getDiff_kind_Right()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#isFilter()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#isIsMerged()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getChangeStatus()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_name_Left()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_name_Right()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNameChangeStatus()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_eparameters_Left <em>New eparameters Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_eparameters_Left()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_eparameters_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_eparameters_Right <em>New eparameters Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New eparameters Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_eparameters_Right()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_eparameters_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getEparametersChangeStatus <em>Eparameters Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getEparametersChangeStatus()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_EparametersChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_etype_Left()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_etype_Right()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getEtypeChangeStatus()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_EtypeChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_methodBody_Left <em>New method Body Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New method Body Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_methodBody_Left()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_methodBody_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getNew_methodBody_Right <em>New method Body Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New method Body Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getNew_methodBody_Right()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_New_methodBody_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEOperation#getMethodBodyChangeStatus <em>Method Body Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Body Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation#getMethodBodyChangeStatus()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_MethodBodyChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	EClass getPattern_DiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getDiff_kind_Left()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getDiff_kind_Right()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#isFilter()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#isIsMerged()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getChangeStatus()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getNew_name_Left()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getNew_name_Right()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage#getNameChangeStatus()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers <em>Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isIsForbidden()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_kind_Left()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_kind_Right()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getChangeStatus()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#isIsMerged()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getDiff_Group()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers#getEType()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EReference getPattern_DiffEPackage_eclassifiers_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces <em>Pattern Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces
	 * @generated
	 */
	EClass getPattern_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getID_Pattern()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isIsForbidden()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_kind_Left()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_kind_Right()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getChangeStatus()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isFilter()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#isIsMerged()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getDiff_Group()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_interfaces_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces#getEType()
	 * @see #getPattern_DiffEPackage_interfaces()
	 * @generated
	 */
	EReference getPattern_DiffEPackage_interfaces_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test <em>Pattern Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage test</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test
	 * @generated
	 */
	EClass getPattern_DiffEPackage_test();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getID_Pattern()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#isIsForbidden()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_kind_Left()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_kind_Right()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getChangeStatus()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#isFilter()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#isIsMerged()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getDiff_Group()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_test_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test#getEType()
	 * @see #getPattern_DiffEPackage_test()
	 * @generated
	 */
	EReference getPattern_DiffEPackage_test_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	EClass getPattern_DiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Left()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getDiff_kind_Right()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#isFilter()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#isIsMerged()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getChangeStatus()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Left()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getNew_name_Right()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getNameChangeStatus()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Left <em>New etype Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Left()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_New_etype_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Right <em>New etype Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New etype Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getNew_etype_Right()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_New_etype_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffEReference#getEtypeChangeStatus <em>Etype Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference#getEtypeChangeStatus()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_EtypeChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffInterface <em>Pattern Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface
	 * @generated
	 */
	EClass getPattern_DiffInterface();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Left()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getDiff_kind_Right()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#isFilter()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#isIsMerged()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getChangeStatus()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Left()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_name_Right()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNameChangeStatus()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Left <em>New extends Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Left()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_extends_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Right <em>New extends Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New extends Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_extends_Right()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_extends_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getExtendsChangeStatus <em>Extends Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getExtendsChangeStatus()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_ExtendsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Left <em>New package Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Left()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_packageName_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Right <em>New package Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New package Name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getNew_packageName_Right()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_New_packageName_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface#getPackageNameChangeStatus <em>Package Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface#getPackageNameChangeStatus()
	 * @see #getPattern_DiffInterface()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_PackageNameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations <em>Pattern Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations
	 * @generated
	 */
	EClass getPattern_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getID_Pattern()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isIsForbidden()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_kind_Left()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_kind_Right()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getChangeStatus()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isFilter()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#isIsMerged()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getDiff_Group()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_eoperations_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations#getEType()
	 * @see #getPattern_DiffInterface_eoperations()
	 * @generated
	 */
	EReference getPattern_DiffInterface_eoperations_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes <em>Pattern Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Interface esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes
	 * @generated
	 */
	EClass getPattern_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getID_Pattern()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isIsForbidden()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_kind_Left()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_kind_Right()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getChangeStatus()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isFilter()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#isIsMerged()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getDiff_Group()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffInterface_esupertypes_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes#getEType()
	 * @see #getPattern_DiffInterface_esupertypes()
	 * @generated
	 */
	EReference getPattern_DiffInterface_esupertypes_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations <em>Pattern Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Difftest Associations</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations
	 * @generated
	 */
	EClass getPattern_DifftestAssociations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getDiff_kind_Left()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getDiff_kind_Right()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#isFilter()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#isIsMerged()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getChangeStatus()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getNew_name_Left()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getNew_name_Right()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations#getNameChangeStatus()
	 * @see #getPattern_DifftestAssociations()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi <em>Pattern Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Difftest Associations multi</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi
	 * @generated
	 */
	EClass getPattern_DifftestAssociations_multi();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getID_Pattern()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isIsForbidden()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_kind_Left()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_kind_Right()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getChangeStatus()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isFilter()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#isIsMerged()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getDiff_Group()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_multi_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi#getEType()
	 * @see #getPattern_DifftestAssociations_multi()
	 * @generated
	 */
	EReference getPattern_DifftestAssociations_multi_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single <em>Pattern Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Difftest Associations single</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single
	 * @generated
	 */
	EClass getPattern_DifftestAssociations_single();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getID_Pattern()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#isIsForbidden()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_kind_Left()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_kind_Right()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getChangeStatus()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#isFilter()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_Filter();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#isIsMerged()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getDiff_Group()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EAttribute getPattern_DifftestAssociations_single_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single#getEType()
	 * @see #getPattern_DifftestAssociations_single()
	 * @generated
	 */
	EReference getPattern_DifftestAssociations_single_EType();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EAttribute</em>'.
	 * @see refactoringCRRuleMM.Pattern_EAttribute
	 * @generated
	 */
	EClass getPattern_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_EAttribute#getID_Pattern()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EAttribute#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_EAttribute#isIsForbidden()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EAttribute#getName()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EAttribute#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringCRRuleMM.Pattern_EAttribute#getEtype()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EClass</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass
	 * @generated
	 */
	EClass getPattern_EClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getID_Pattern()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#isIsForbidden()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getName()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getExtends()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getImplements()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#isIsAbstract()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EClass#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getPackageName()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getEattributes <em>Eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eattributes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getEattributes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getEoperations()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getEreferences <em>Ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ereferences</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getEreferences()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_EClass#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getEsupertypes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_EClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getInterfaces()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getNested_classes <em>Nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested classes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getNested_classes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Nested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getNested_interfaces <em>Nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getNested_interfaces()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Nested_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffeattributes <em>Diffeattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeattributes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffeattributes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffeattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffeoperations()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffereferences <em>Differeferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Differeferences</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffereferences()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Differeferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffesupertypes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffesupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffinterfaces()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffinterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffnested_classes <em>Diffnested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested classes</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffnested_classes()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffnested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EClass#getDiffnested_interfaces <em>Diffnested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnested interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EClass#getDiffnested_interfaces()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EReference getPattern_EClass_Diffnested_interfaces();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EOperation</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation
	 * @generated
	 */
	EClass getPattern_EOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#getID_Pattern()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#isIsForbidden()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#getName()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#getEparameters <em>Eparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eparameters</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#getEparameters()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Eparameters();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#getEtype()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Etype();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#getMethodBody <em>Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Body</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#getMethodBody()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_MethodBody();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EOperation#get__idKDM <em>id KDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id KDM</em>'.
	 * @see refactoringCRRuleMM.Pattern_EOperation#get__idKDM()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation___idKDM();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EPackage</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage
	 * @generated
	 */
	EClass getPattern_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getID_Pattern()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EPackage#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#isIsForbidden()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getName()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getEclassifiers <em>Eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclassifiers</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getEclassifiers()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Eclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getInterfaces()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getTest()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Test();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeclassifiers</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getDiffeclassifiers()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Diffeclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getDiffinterfaces <em>Diffinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinterfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getDiffinterfaces()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Diffinterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_EPackage#getDifftest <em>Difftest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftest</em>'.
	 * @see refactoringCRRuleMM.Pattern_EPackage#getDifftest()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EReference getPattern_EPackage_Difftest();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EReference</em>'.
	 * @see refactoringCRRuleMM.Pattern_EReference
	 * @generated
	 */
	EClass getPattern_EReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_EReference#getID_Pattern()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EReference#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_EReference#isIsForbidden()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_EReference#getName()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_EReference#getEtype <em>Etype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etype</em>'.
	 * @see refactoringCRRuleMM.Pattern_EReference#getEtype()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_Etype();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_Interface <em>Pattern Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Interface</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface
	 * @generated
	 */
	EClass getPattern_Interface();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_Interface#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getID_Pattern()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_Interface#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#isIsForbidden()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getName()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_Name();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_Interface#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getExtends()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_Extends();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_Interface#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getPackageName()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EAttribute getPattern_Interface_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_Interface#getEoperations <em>Eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getEoperations()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EReference getPattern_Interface_Eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_Interface#getEsupertypes <em>Esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getEsupertypes()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EReference getPattern_Interface_Esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_Interface#getDiffeoperations <em>Diffeoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffeoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getDiffeoperations()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EReference getPattern_Interface_Diffeoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_Interface#getDiffesupertypes <em>Diffesupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffesupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_Interface#getDiffesupertypes()
	 * @see #getPattern_Interface()
	 * @generated
	 */
	EReference getPattern_Interface_Diffesupertypes();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict kind</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticConflict#getConflict_kind()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_kind();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict Granularity</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_Granularity();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EReference getPattern_SemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Diff</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	EClass getPattern_SemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticDiff#getAuthor()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Object</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	EClass getPattern_SemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getID_Pattern()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#isIsForbidden()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getName()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EAttribute</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEAttribute()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eattributes</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eattributes()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eoperations()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass ereferences</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_ereferences()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_esupertypes()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_interfaces()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested classes</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_classes()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EClass nested interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_interfaces()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EOperation</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEOperation()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage eclassifiers</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_eclassifiers()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage interfaces</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_interfaces()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_test <em>Semantic Object Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EPackage test</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_test()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEPackage_test();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff EReference</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEReference()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffEReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffInterface();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface eoperations</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_eoperations()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Interface esupertypes</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_esupertypes()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations <em>Semantic Object Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_multi <em>Semantic Object Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations multi</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_multi()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations_multi();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_single <em>Semantic Object Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Difftest Associations single</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_single()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DifftestAssociations_single();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EAttribute</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EAttribute()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_EAttribute();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EClass <em>Semantic Object EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EClass</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EClass()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_EClass();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EOperation</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EOperation()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_EOperation();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EPackage</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EPackage()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_EPackage();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EReference <em>Semantic Object EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object EReference</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EReference()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_EReference();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_Interface <em>Semantic Object Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Interface</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_Interface()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_Interface();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_testAssociations <em>Semantic Object test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object test Associations</em>'.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_testAssociations()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_testAssociations();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Pattern_testAssociations <em>Pattern test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern test Associations</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations
	 * @generated
	 */
	EClass getPattern_testAssociations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_testAssociations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getID_Pattern()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EAttribute getPattern_testAssociations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_testAssociations#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#isIsForbidden()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EAttribute getPattern_testAssociations_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Pattern_testAssociations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getName()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EAttribute getPattern_testAssociations_Name();

	/**
	 * Returns the meta object for the reference '{@link refactoringCRRuleMM.Pattern_testAssociations#getSingle <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getSingle()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EReference getPattern_testAssociations_Single();

	/**
	 * Returns the meta object for the reference list '{@link refactoringCRRuleMM.Pattern_testAssociations#getMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getMulti()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EReference getPattern_testAssociations_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_testAssociations#getDiffsingle <em>Diffsingle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsingle</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getDiffsingle()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EReference getPattern_testAssociations_Diffsingle();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Pattern_testAssociations#getDiffmulti <em>Diffmulti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmulti</em>'.
	 * @see refactoringCRRuleMM.Pattern_testAssociations#getDiffmulti()
	 * @see #getPattern_testAssociations()
	 * @generated
	 */
	EReference getPattern_testAssociations_Diffmulti();

	/**
	 * Returns the meta object for class '{@link refactoringCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see refactoringCRRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringCRRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link refactoringCRRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see refactoringCRRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link refactoringCRRuleMM.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see refactoringCRRuleMM.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Semantic Object</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_SemanticObject();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEAttribute <em>Rule Pattern Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EAttribute</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass <em>Rule Pattern Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eattributes <em>Rule Pattern Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass eattributes</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eattributes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eoperations <em>Rule Pattern Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass eoperations</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eoperations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_ereferences <em>Rule Pattern Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass ereferences</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_ereferences()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_esupertypes <em>Rule Pattern Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass esupertypes</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_esupertypes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_interfaces <em>Rule Pattern Pattern Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass interfaces</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_classes <em>Rule Pattern Pattern Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass nested classes</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_classes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_nested_classes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_interfaces <em>Rule Pattern Pattern Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EClass nested interfaces</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEOperation <em>Rule Pattern Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EOperation</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEOperation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage <em>Rule Pattern Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EPackage</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_eclassifiers <em>Rule Pattern Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EPackage eclassifiers</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_eclassifiers()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_interfaces <em>Rule Pattern Pattern Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EPackage interfaces</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_interfaces()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEPackage_interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_test <em>Rule Pattern Pattern Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EPackage test</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_test()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEPackage_test();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEReference <em>Rule Pattern Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff EReference</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEReference()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffEReference();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface <em>Rule Pattern Pattern Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Interface</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_eoperations <em>Rule Pattern Pattern Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Interface eoperations</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_eoperations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffInterface_eoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_esupertypes <em>Rule Pattern Pattern Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Interface esupertypes</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_esupertypes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffInterface_esupertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations <em>Rule Pattern Pattern Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Difftest Associations</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DifftestAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_multi <em>Rule Pattern Pattern Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Difftest Associations multi</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_multi()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DifftestAssociations_multi();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_single <em>Rule Pattern Pattern Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Difftest Associations single</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_single()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DifftestAssociations_single();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EAttribute <em>Rule Pattern Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern EAttribute</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_EAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_EAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EClass <em>Rule Pattern Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern EClass</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_EClass()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EOperation <em>Rule Pattern Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern EOperation</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_EOperation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_EOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EPackage <em>Rule Pattern Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern EPackage</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_EPackage()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EReference <em>Rule Pattern Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern EReference</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_EReference()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_EReference();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_Interface <em>Rule Pattern Pattern Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Interface</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_Interface()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_testAssociations <em>Rule Pattern Pattern test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern test Associations</em>'.
	 * @see refactoringCRRuleMM.Rule#getRulePattern_Pattern_testAssociations()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_testAssociations();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see refactoringCRRuleMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see refactoringCRRuleMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Granularity</em>'.
	 * @see refactoringCRRuleMM.ConflictGranularity
	 * @generated
	 */
	EEnum getConflictGranularity();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Strategy</em>'.
	 * @see refactoringCRRuleMM.ConflictResolutionStrategy
	 * @generated
	 */
	EEnum getConflictResolutionStrategy();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Type</em>'.
	 * @see refactoringCRRuleMM.ConflictResolutionType
	 * @generated
	 */
	EEnum getConflictResolutionType();

	/**
	 * Returns the meta object for enum '{@link refactoringCRRuleMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see refactoringCRRuleMM.DiffKind
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
	RefactoringCRRuleMMFactory getRefactoringCRRuleMMFactory();

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
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_ConflictResolutionImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_ConflictResolution()
		 * @generated
		 */
		EClass PATTERN_CONFLICT_RESOLUTION = eINSTANCE.getPattern_ConflictResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = eINSTANCE.getPattern_ConflictResolution_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Resolution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = eINSTANCE.getPattern_ConflictResolution_ResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = eINSTANCE.getPattern_ConflictResolution_Semanticconflicts();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEAttributeImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEAttribute()
		 * @generated
		 */
		EClass PATTERN_DIFF_EATTRIBUTE = eINSTANCE.getPattern_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEAttribute_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEAttribute_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__FILTER = eINSTANCE.getPattern_DiffEAttribute_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__IS_MERGED = eINSTANCE.getPattern_DiffEAttribute_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__CHANGE_STATUS = eINSTANCE.getPattern_DiffEAttribute_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffEAttribute_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffEAttribute_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEAttribute_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_LEFT = eINSTANCE.getPattern_DiffEAttribute_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE_RIGHT = eINSTANCE.getPattern_DiffEAttribute_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EATTRIBUTE__ETYPE_CHANGE_STATUS = eINSTANCE.getPattern_DiffEAttribute_EtypeChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClassImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass()
		 * @generated
		 */
		EClass PATTERN_DIFF_ECLASS = eINSTANCE.getPattern_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__FILTER = eINSTANCE.getPattern_DiffEClass_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__IS_MERGED = eINSTANCE.getPattern_DiffEClass_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffEClass_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffEClass_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New extends Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_EXTENDS_LEFT = eINSTANCE.getPattern_DiffEClass_New_extends_Left();

		/**
		 * The meta object literal for the '<em><b>New extends Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_EXTENDS_RIGHT = eINSTANCE.getPattern_DiffEClass_New_extends_Right();

		/**
		 * The meta object literal for the '<em><b>Extends Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__EXTENDS_CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_ExtendsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New implements Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_LEFT = eINSTANCE.getPattern_DiffEClass_New_implements_Left();

		/**
		 * The meta object literal for the '<em><b>New implements Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_IMPLEMENTS_RIGHT = eINSTANCE.getPattern_DiffEClass_New_implements_Right();

		/**
		 * The meta object literal for the '<em><b>Implements Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__IMPLEMENTS_CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_ImplementsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New is Abstract Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_LEFT = eINSTANCE.getPattern_DiffEClass_New_isAbstract_Left();

		/**
		 * The meta object literal for the '<em><b>New is Abstract Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_IS_ABSTRACT_RIGHT = eINSTANCE.getPattern_DiffEClass_New_isAbstract_Right();

		/**
		 * The meta object literal for the '<em><b>Is Abstract Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__IS_ABSTRACT_CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_IsAbstractChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New package Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_LEFT = eINSTANCE.getPattern_DiffEClass_New_packageName_Left();

		/**
		 * The meta object literal for the '<em><b>New package Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__NEW_PACKAGE_NAME_RIGHT = eINSTANCE.getPattern_DiffEClass_New_packageName_Right();

		/**
		 * The meta object literal for the '<em><b>Package Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS__PACKAGE_NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_PackageNameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_eattributesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_eattributes_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_eattributes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_eattributes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_eattributes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = eINSTANCE.getPattern_DiffEClass_eattributes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_eattributes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EATTRIBUTES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_eattributes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE = eINSTANCE.getPattern_DiffEClass_eattributes_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_eoperations_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_eoperations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_eoperations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_eoperations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = eINSTANCE.getPattern_DiffEClass_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__IS_MERGED = eINSTANCE.getPattern_DiffEClass_eoperations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EOPERATIONS__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_eoperations_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE = eINSTANCE.getPattern_DiffEClass_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_ereferences_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_ereferences_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_ereferences_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_ereferences_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = eINSTANCE.getPattern_DiffEClass_ereferences_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_ereferences_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_ereferences_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE = eINSTANCE.getPattern_DiffEClass_ereferences_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_esupertypes_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_esupertypes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_esupertypes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_esupertypes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER = eINSTANCE.getPattern_DiffEClass_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_esupertypes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_ESUPERTYPES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_esupertypes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_ESUPERTYPES__ETYPE = eINSTANCE.getPattern_DiffEClass_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_interfacesImpl <em>Pattern Diff EClass interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_interfacesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_interfaces()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEClass_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_INTERFACES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_INTERFACES__ETYPE = eINSTANCE.getPattern_DiffEClass_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_classesImpl <em>Pattern Diff EClass nested classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_classesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_nested_classes()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_nested_classes_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_nested_classes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_nested_classes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_nested_classes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__FILTER = eINSTANCE.getPattern_DiffEClass_nested_classes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_nested_classes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_CLASSES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_nested_classes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_NESTED_CLASSES__ETYPE = eINSTANCE.getPattern_DiffEClass_nested_classes_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl <em>Pattern Diff EClass nested interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEClass_nested_interfacesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEClass_nested_interfaces()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEClass_nested_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEClass_nested_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEClass_nested_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEClass_nested_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEClass_nested_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__IS_MERGED = eINSTANCE.getPattern_DiffEClass_nested_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ECLASS_NESTED_INTERFACES__DIFF_GROUP = eINSTANCE.getPattern_DiffEClass_nested_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_ECLASS_NESTED_INTERFACES__ETYPE = eINSTANCE.getPattern_DiffEClass_nested_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEOperationImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEOperation()
		 * @generated
		 */
		EClass PATTERN_DIFF_EOPERATION = eINSTANCE.getPattern_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEOperation_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEOperation_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__FILTER = eINSTANCE.getPattern_DiffEOperation_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__IS_MERGED = eINSTANCE.getPattern_DiffEOperation_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__CHANGE_STATUS = eINSTANCE.getPattern_DiffEOperation_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffEOperation_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffEOperation_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEOperation_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New eparameters Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_LEFT = eINSTANCE.getPattern_DiffEOperation_New_eparameters_Left();

		/**
		 * The meta object literal for the '<em><b>New eparameters Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT = eINSTANCE.getPattern_DiffEOperation_New_eparameters_Right();

		/**
		 * The meta object literal for the '<em><b>Eparameters Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS = eINSTANCE.getPattern_DiffEOperation_EparametersChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_ETYPE_LEFT = eINSTANCE.getPattern_DiffEOperation_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_ETYPE_RIGHT = eINSTANCE.getPattern_DiffEOperation_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__ETYPE_CHANGE_STATUS = eINSTANCE.getPattern_DiffEOperation_EtypeChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New method Body Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_LEFT = eINSTANCE.getPattern_DiffEOperation_New_methodBody_Left();

		/**
		 * The meta object literal for the '<em><b>New method Body Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT = eINSTANCE.getPattern_DiffEOperation_New_methodBody_Right();

		/**
		 * The meta object literal for the '<em><b>Method Body Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS = eINSTANCE.getPattern_DiffEOperation_MethodBodyChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackageImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE = eINSTANCE.getPattern_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEPackage_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEPackage_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__FILTER = eINSTANCE.getPattern_DiffEPackage_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__IS_MERGED = eINSTANCE.getPattern_DiffEPackage_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__CHANGE_STATUS = eINSTANCE.getPattern_DiffEPackage_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffEPackage_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffEPackage_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEPackage_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_eclassifiers_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEPackage_eclassifiers_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEPackage_eclassifiers_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__CHANGE_STATUS = eINSTANCE.getPattern_DiffEPackage_eclassifiers_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = eINSTANCE.getPattern_DiffEPackage_eclassifiers_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__IS_MERGED = eINSTANCE.getPattern_DiffEPackage_eclassifiers_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__DIFF_GROUP = eINSTANCE.getPattern_DiffEPackage_eclassifiers_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = eINSTANCE.getPattern_DiffEPackage_eclassifiers_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_interfacesImpl <em>Pattern Diff EPackage interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_interfacesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_interfaces()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_interfaces_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEPackage_interfaces_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEPackage_interfaces_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__CHANGE_STATUS = eINSTANCE.getPattern_DiffEPackage_interfaces_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__FILTER = eINSTANCE.getPattern_DiffEPackage_interfaces_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__IS_MERGED = eINSTANCE.getPattern_DiffEPackage_interfaces_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_INTERFACES__DIFF_GROUP = eINSTANCE.getPattern_DiffEPackage_interfaces_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_EPACKAGE_INTERFACES__ETYPE = eINSTANCE.getPattern_DiffEPackage_interfaces_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEPackage_testImpl <em>Pattern Diff EPackage test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEPackage_testImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEPackage_test()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_TEST = eINSTANCE.getPattern_DiffEPackage_test();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_test_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__IS_FORBIDDEN = eINSTANCE.getPattern_DiffEPackage_test_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEPackage_test_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEPackage_test_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__CHANGE_STATUS = eINSTANCE.getPattern_DiffEPackage_test_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__FILTER = eINSTANCE.getPattern_DiffEPackage_test_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__IS_MERGED = eINSTANCE.getPattern_DiffEPackage_test_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_TEST__DIFF_GROUP = eINSTANCE.getPattern_DiffEPackage_test_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_EPACKAGE_TEST__ETYPE = eINSTANCE.getPattern_DiffEPackage_test_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffEReference()
		 * @generated
		 */
		EClass PATTERN_DIFF_EREFERENCE = eINSTANCE.getPattern_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffEReference_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffEReference_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__FILTER = eINSTANCE.getPattern_DiffEReference_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__IS_MERGED = eINSTANCE.getPattern_DiffEReference_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__CHANGE_STATUS = eINSTANCE.getPattern_DiffEReference_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffEReference_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffEReference_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffEReference_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New etype Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT = eINSTANCE.getPattern_DiffEReference_New_etype_Left();

		/**
		 * The meta object literal for the '<em><b>New etype Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT = eINSTANCE.getPattern_DiffEReference_New_etype_Right();

		/**
		 * The meta object literal for the '<em><b>Etype Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS = eINSTANCE.getPattern_DiffEReference_EtypeChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterfaceImpl <em>Pattern Diff Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffInterfaceImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface()
		 * @generated
		 */
		EClass PATTERN_DIFF_INTERFACE = eINSTANCE.getPattern_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffInterface_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffInterface_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__FILTER = eINSTANCE.getPattern_DiffInterface_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__IS_MERGED = eINSTANCE.getPattern_DiffInterface_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffInterface_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffInterface_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New extends Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_EXTENDS_LEFT = eINSTANCE.getPattern_DiffInterface_New_extends_Left();

		/**
		 * The meta object literal for the '<em><b>New extends Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_EXTENDS_RIGHT = eINSTANCE.getPattern_DiffInterface_New_extends_Right();

		/**
		 * The meta object literal for the '<em><b>Extends Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__EXTENDS_CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_ExtendsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New package Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT = eINSTANCE.getPattern_DiffInterface_New_packageName_Left();

		/**
		 * The meta object literal for the '<em><b>New package Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT = eINSTANCE.getPattern_DiffInterface_New_packageName_Right();

		/**
		 * The meta object literal for the '<em><b>Package Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_PackageNameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterface_eoperationsImpl <em>Pattern Diff Interface eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffInterface_eoperationsImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface_eoperations()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffInterface_eoperations_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffInterface_eoperations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffInterface_eoperations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_eoperations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__FILTER = eINSTANCE.getPattern_DiffInterface_eoperations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__IS_MERGED = eINSTANCE.getPattern_DiffInterface_eoperations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_EOPERATIONS__DIFF_GROUP = eINSTANCE.getPattern_DiffInterface_eoperations_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_INTERFACE_EOPERATIONS__ETYPE = eINSTANCE.getPattern_DiffInterface_eoperations_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DiffInterface_esupertypesImpl <em>Pattern Diff Interface esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DiffInterface_esupertypesImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DiffInterface_esupertypes()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffInterface_esupertypes_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffInterface_esupertypes_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffInterface_esupertypes_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__CHANGE_STATUS = eINSTANCE.getPattern_DiffInterface_esupertypes_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__FILTER = eINSTANCE.getPattern_DiffInterface_esupertypes_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__IS_MERGED = eINSTANCE.getPattern_DiffInterface_esupertypes_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INTERFACE_ESUPERTYPES__DIFF_GROUP = eINSTANCE.getPattern_DiffInterface_esupertypes_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_INTERFACE_ESUPERTYPES__ETYPE = eINSTANCE.getPattern_DiffInterface_esupertypes_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociationsImpl <em>Pattern Difftest Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociationsImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations()
		 * @generated
		 */
		EClass PATTERN_DIFFTEST_ASSOCIATIONS = eINSTANCE.getPattern_DifftestAssociations();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DifftestAssociations_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DifftestAssociations_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__FILTER = eINSTANCE.getPattern_DifftestAssociations_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__IS_MERGED = eINSTANCE.getPattern_DifftestAssociations_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__CHANGE_STATUS = eINSTANCE.getPattern_DifftestAssociations_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_LEFT = eINSTANCE.getPattern_DifftestAssociations_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__NEW_NAME_RIGHT = eINSTANCE.getPattern_DifftestAssociations_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DifftestAssociations_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociations_multiImpl <em>Pattern Difftest Associations multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociations_multiImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations_multi()
		 * @generated
		 */
		EClass PATTERN_DIFFTEST_ASSOCIATIONS_MULTI = eINSTANCE.getPattern_DifftestAssociations_multi();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ID_PATTERN = eINSTANCE.getPattern_DifftestAssociations_multi_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_FORBIDDEN = eINSTANCE.getPattern_DifftestAssociations_multi_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_LEFT = eINSTANCE.getPattern_DifftestAssociations_multi_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DifftestAssociations_multi_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__CHANGE_STATUS = eINSTANCE.getPattern_DifftestAssociations_multi_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__FILTER = eINSTANCE.getPattern_DifftestAssociations_multi_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__IS_MERGED = eINSTANCE.getPattern_DifftestAssociations_multi_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__DIFF_GROUP = eINSTANCE.getPattern_DifftestAssociations_multi_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFFTEST_ASSOCIATIONS_MULTI__ETYPE = eINSTANCE.getPattern_DifftestAssociations_multi_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_DifftestAssociations_singleImpl <em>Pattern Difftest Associations single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_DifftestAssociations_singleImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_DifftestAssociations_single()
		 * @generated
		 */
		EClass PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE = eINSTANCE.getPattern_DifftestAssociations_single();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ID_PATTERN = eINSTANCE.getPattern_DifftestAssociations_single_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_FORBIDDEN = eINSTANCE.getPattern_DifftestAssociations_single_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DifftestAssociations_single_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DifftestAssociations_single_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__CHANGE_STATUS = eINSTANCE.getPattern_DifftestAssociations_single_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__FILTER = eINSTANCE.getPattern_DifftestAssociations_single_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__IS_MERGED = eINSTANCE.getPattern_DifftestAssociations_single_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__DIFF_GROUP = eINSTANCE.getPattern_DifftestAssociations_single_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE__ETYPE = eINSTANCE.getPattern_DifftestAssociations_single_EType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_EAttributeImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EAttribute()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__IS_FORBIDDEN = eINSTANCE.getPattern_EAttribute_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__NAME = eINSTANCE.getPattern_EAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EATTRIBUTE__ETYPE = eINSTANCE.getPattern_EAttribute_Etype();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_EClassImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EClass()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__IS_FORBIDDEN = eINSTANCE.getPattern_EClass_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__NAME = eINSTANCE.getPattern_EClass_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__EXTENDS = eINSTANCE.getPattern_EClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__IMPLEMENTS = eINSTANCE.getPattern_EClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__IS_ABSTRACT = eINSTANCE.getPattern_EClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ECLASS__PACKAGE_NAME = eINSTANCE.getPattern_EClass_PackageName();

		/**
		 * The meta object literal for the '<em><b>Eattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__EATTRIBUTES = eINSTANCE.getPattern_EClass_Eattributes();

		/**
		 * The meta object literal for the '<em><b>Eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__EOPERATIONS = eINSTANCE.getPattern_EClass_Eoperations();

		/**
		 * The meta object literal for the '<em><b>Ereferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__EREFERENCES = eINSTANCE.getPattern_EClass_Ereferences();

		/**
		 * The meta object literal for the '<em><b>Esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__ESUPERTYPES = eINSTANCE.getPattern_EClass_Esupertypes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__INTERFACES = eINSTANCE.getPattern_EClass_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Nested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__NESTED_CLASSES = eINSTANCE.getPattern_EClass_Nested_classes();

		/**
		 * The meta object literal for the '<em><b>Nested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__NESTED_INTERFACES = eINSTANCE.getPattern_EClass_Nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Diffeattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFEATTRIBUTES = eINSTANCE.getPattern_EClass_Diffeattributes();

		/**
		 * The meta object literal for the '<em><b>Diffeoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFEOPERATIONS = eINSTANCE.getPattern_EClass_Diffeoperations();

		/**
		 * The meta object literal for the '<em><b>Differeferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFEREFERENCES = eINSTANCE.getPattern_EClass_Differeferences();

		/**
		 * The meta object literal for the '<em><b>Diffesupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFESUPERTYPES = eINSTANCE.getPattern_EClass_Diffesupertypes();

		/**
		 * The meta object literal for the '<em><b>Diffinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFINTERFACES = eINSTANCE.getPattern_EClass_Diffinterfaces();

		/**
		 * The meta object literal for the '<em><b>Diffnested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFNESTED_CLASSES = eINSTANCE.getPattern_EClass_Diffnested_classes();

		/**
		 * The meta object literal for the '<em><b>Diffnested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ECLASS__DIFFNESTED_INTERFACES = eINSTANCE.getPattern_EClass_Diffnested_interfaces();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_EOperationImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EOperation()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__IS_FORBIDDEN = eINSTANCE.getPattern_EOperation_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__NAME = eINSTANCE.getPattern_EOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Eparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__EPARAMETERS = eINSTANCE.getPattern_EOperation_Eparameters();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__ETYPE = eINSTANCE.getPattern_EOperation_Etype();

		/**
		 * The meta object literal for the '<em><b>Method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__METHOD_BODY = eINSTANCE.getPattern_EOperation_MethodBody();

		/**
		 * The meta object literal for the '<em><b>id KDM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EOPERATION__ID_KDM = eINSTANCE.getPattern_EOperation___idKDM();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_EPackageImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EPackage()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__IS_FORBIDDEN = eINSTANCE.getPattern_EPackage_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EPACKAGE__NAME = eINSTANCE.getPattern_EPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Eclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__ECLASSIFIERS = eINSTANCE.getPattern_EPackage_Eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__INTERFACES = eINSTANCE.getPattern_EPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__TEST = eINSTANCE.getPattern_EPackage_Test();

		/**
		 * The meta object literal for the '<em><b>Diffeclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__DIFFECLASSIFIERS = eINSTANCE.getPattern_EPackage_Diffeclassifiers();

		/**
		 * The meta object literal for the '<em><b>Diffinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__DIFFINTERFACES = eINSTANCE.getPattern_EPackage_Diffinterfaces();

		/**
		 * The meta object literal for the '<em><b>Difftest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_EPACKAGE__DIFFTEST = eINSTANCE.getPattern_EPackage_Difftest();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_EReferenceImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_EReference()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__IS_FORBIDDEN = eINSTANCE.getPattern_EReference_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__NAME = eINSTANCE.getPattern_EReference_Name();

		/**
		 * The meta object literal for the '<em><b>Etype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_EREFERENCE__ETYPE = eINSTANCE.getPattern_EReference_Etype();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl <em>Pattern Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_InterfaceImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_Interface()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__IS_FORBIDDEN = eINSTANCE.getPattern_Interface_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__NAME = eINSTANCE.getPattern_Interface_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__EXTENDS = eINSTANCE.getPattern_Interface_Extends();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTERFACE__PACKAGE_NAME = eINSTANCE.getPattern_Interface_PackageName();

		/**
		 * The meta object literal for the '<em><b>Eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INTERFACE__EOPERATIONS = eINSTANCE.getPattern_Interface_Eoperations();

		/**
		 * The meta object literal for the '<em><b>Esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INTERFACE__ESUPERTYPES = eINSTANCE.getPattern_Interface_Esupertypes();

		/**
		 * The meta object literal for the '<em><b>Diffeoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INTERFACE__DIFFEOPERATIONS = eINSTANCE.getPattern_Interface_Diffeoperations();

		/**
		 * The meta object literal for the '<em><b>Diffesupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INTERFACE__DIFFESUPERTYPES = eINSTANCE.getPattern_Interface_Diffesupertypes();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = eINSTANCE.getPattern_SemanticConflict_Conflict_kind();

		/**
		 * The meta object literal for the '<em><b>Conflict Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = eINSTANCE.getPattern_SemanticConflict_Conflict_Granularity();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getPattern_SemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_SemanticDiffImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticDiff()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_DIFF = eINSTANCE.getPattern_SemanticDiff();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__AUTHOR = eINSTANCE.getPattern_SemanticDiff_Author();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_SemanticObject()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticObject_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__NAME = eINSTANCE.getPattern_SemanticObject_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EOperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEPackage_test();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff EReference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DifftestAssociations();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI = eINSTANCE.getPattern_SemanticObject_SemanticObject_DifftestAssociations_multi();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DifftestAssociations_single();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EAttribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE = eINSTANCE.getPattern_SemanticObject_SemanticObject_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EClass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS = eINSTANCE.getPattern_SemanticObject_SemanticObject_EClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EOperation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION = eINSTANCE.getPattern_SemanticObject_SemanticObject_EOperation();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EPackage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE = eINSTANCE.getPattern_SemanticObject_SemanticObject_EPackage();

		/**
		 * The meta object literal for the '<em><b>Semantic Object EReference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE = eINSTANCE.getPattern_SemanticObject_SemanticObject_EReference();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE = eINSTANCE.getPattern_SemanticObject_SemanticObject_Interface();

		/**
		 * The meta object literal for the '<em><b>Semantic Object test Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_testAssociations();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl <em>Pattern test Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.Pattern_testAssociationsImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getPattern_testAssociations()
		 * @generated
		 */
		EClass PATTERN_TEST_ASSOCIATIONS = eINSTANCE.getPattern_testAssociations();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEST_ASSOCIATIONS__ID_PATTERN = eINSTANCE.getPattern_testAssociations_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN = eINSTANCE.getPattern_testAssociations_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEST_ASSOCIATIONS__NAME = eINSTANCE.getPattern_testAssociations_Name();

		/**
		 * The meta object literal for the '<em><b>Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEST_ASSOCIATIONS__SINGLE = eINSTANCE.getPattern_testAssociations_Single();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEST_ASSOCIATIONS__MULTI = eINSTANCE.getPattern_testAssociations_Multi();

		/**
		 * The meta object literal for the '<em><b>Diffsingle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE = eINSTANCE.getPattern_testAssociations_Diffsingle();

		/**
		 * The meta object literal for the '<em><b>Diffmulti</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEST_ASSOCIATIONS__DIFFMULTI = eINSTANCE.getPattern_testAssociations_Diffmulti();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.impl.RuleImpl
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getRule()
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
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = eINSTANCE.getRule_RulePattern_Pattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE = eINSTANCE.getRule_RulePattern_Pattern_DiffEAttribute();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass eattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_eattributes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_eoperations();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass ereferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_ereferences();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass esupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass nested classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_nested_classes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EClass nested interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES = eINSTANCE.getRule_RulePattern_Pattern_DiffEClass_nested_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EOperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION = eINSTANCE.getRule_RulePattern_Pattern_DiffEOperation();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE = eINSTANCE.getRule_RulePattern_Pattern_DiffEPackage();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EPackage eclassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = eINSTANCE.getRule_RulePattern_Pattern_DiffEPackage_eclassifiers();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EPackage interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES = eINSTANCE.getRule_RulePattern_Pattern_DiffEPackage_interfaces();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EPackage test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST = eINSTANCE.getRule_RulePattern_Pattern_DiffEPackage_test();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE = eINSTANCE.getRule_RulePattern_Pattern_DiffEReference();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE = eINSTANCE.getRule_RulePattern_Pattern_DiffInterface();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Interface eoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS = eINSTANCE.getRule_RulePattern_Pattern_DiffInterface_eoperations();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Interface esupertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES = eINSTANCE.getRule_RulePattern_Pattern_DiffInterface_esupertypes();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Difftest Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS = eINSTANCE.getRule_RulePattern_Pattern_DifftestAssociations();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Difftest Associations multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI = eINSTANCE.getRule_RulePattern_Pattern_DifftestAssociations_multi();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Difftest Associations single</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE = eINSTANCE.getRule_RulePattern_Pattern_DifftestAssociations_single();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern EAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_EATTRIBUTE = eINSTANCE.getRule_RulePattern_Pattern_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern EClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_ECLASS = eINSTANCE.getRule_RulePattern_Pattern_EClass();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern EOperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_EOPERATION = eINSTANCE.getRule_RulePattern_Pattern_EOperation();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern EPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_EPACKAGE = eINSTANCE.getRule_RulePattern_Pattern_EPackage();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_EREFERENCE = eINSTANCE.getRule_RulePattern_Pattern_EReference();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_INTERFACE = eINSTANCE.getRule_RulePattern_Pattern_Interface();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern test Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS = eINSTANCE.getRule_RulePattern_Pattern_testAssociations();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.AUTHOR
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.ChangeStatus
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.ConflictGranularity
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictGranularity()
		 * @generated
		 */
		EEnum CONFLICT_GRANULARITY = eINSTANCE.getConflictGranularity();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.ConflictResolutionStrategy
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictResolutionStrategy()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_STRATEGY = eINSTANCE.getConflictResolutionStrategy();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.ConflictResolutionType
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getConflictResolutionType()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_TYPE = eINSTANCE.getConflictResolutionType();

		/**
		 * The meta object literal for the '{@link refactoringCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringCRRuleMM.DiffKind
		 * @see refactoringCRRuleMM.impl.RefactoringCRRuleMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //RefactoringCRRuleMMPackage
