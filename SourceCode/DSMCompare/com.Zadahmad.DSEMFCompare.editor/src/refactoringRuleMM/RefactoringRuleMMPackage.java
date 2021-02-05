/**
 */
package refactoringRuleMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import refactoringDiffMM.RefactoringDiffMMPackage;

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
 * @see refactoringRuleMM.RefactoringRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoringRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/refactoringRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactoringRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringRuleMMPackage eINSTANCE = refactoringRuleMM.impl.RefactoringRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_EAttributeImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EAttribute()
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
	int PATTERN_EATTRIBUTE__NAME = RefactoringDiffMMPackage.EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ETYPE = RefactoringDiffMMPackage.EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__ID_PATTERN = RefactoringDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE__FILTER = RefactoringDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_FEATURE_COUNT = RefactoringDiffMMPackage.EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EATTRIBUTE_OPERATION_COUNT = RefactoringDiffMMPackage.EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_EClassImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EClass()
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
	int PATTERN_ECLASS__NAME = RefactoringDiffMMPackage.ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EATTRIBUTES = RefactoringDiffMMPackage.ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EOPERATIONS = RefactoringDiffMMPackage.ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__EREFERENCES = RefactoringDiffMMPackage.ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ESUPERTYPES = RefactoringDiffMMPackage.ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEATTRIBUTES = RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEOPERATIONS = RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFEREFERENCES = RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__DIFFESUPERTYPES = RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__ID_PATTERN = RefactoringDiffMMPackage.ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS__FILTER = RefactoringDiffMMPackage.ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_FEATURE_COUNT = RefactoringDiffMMPackage.ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ECLASS_OPERATION_COUNT = RefactoringDiffMMPackage.ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_EOperationImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EOperation()
	 * @generated
	 */
	int PATTERN_EOPERATION = 2;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__EPARAMETERS = RefactoringDiffMMPackage.EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__NAME = RefactoringDiffMMPackage.EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ETYPE = RefactoringDiffMMPackage.EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__ID_PATTERN = RefactoringDiffMMPackage.EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION__FILTER = RefactoringDiffMMPackage.EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_FEATURE_COUNT = RefactoringDiffMMPackage.EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EOPERATION_OPERATION_COUNT = RefactoringDiffMMPackage.EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_EPackageImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EPackage()
	 * @generated
	 */
	int PATTERN_EPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ECLASSIFIERS = RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__NAME = RefactoringDiffMMPackage.EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DOMAINSPECIFICDIFFS = RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFECLASSIFIERS = RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__DIFFDOMAINSPECIFICDIFFS = RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__ID_PATTERN = RefactoringDiffMMPackage.EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE__FILTER = RefactoringDiffMMPackage.EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_FEATURE_COUNT = RefactoringDiffMMPackage.EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EPACKAGE_OPERATION_COUNT = RefactoringDiffMMPackage.EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_EReferenceImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EReference()
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
	int PATTERN_EREFERENCE__NAME = RefactoringDiffMMPackage.EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ETYPE = RefactoringDiffMMPackage.EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__ID_PATTERN = RefactoringDiffMMPackage.EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE__FILTER = RefactoringDiffMMPackage.EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_FEATURE_COUNT = RefactoringDiffMMPackage.EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_EREFERENCE_OPERATION_COUNT = RefactoringDiffMMPackage.EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DomainSpecificDiff()
	 * @generated
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEAttributeImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEAttribute()
	 * @generated
	 */
	int PATTERN_DIFF_EATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NAME = RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ETYPE = RefactoringDiffMMPackage.DIFF_EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__OPERATION = RefactoringDiffMMPackage.DIFF_EATTRIBUTE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_NAME = RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__NEW_ETYPE = RefactoringDiffMMPackage.DIFF_EATTRIBUTE__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE__FILTER = RefactoringDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EATTRIBUTE_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEClassImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NAME = RefactoringDiffMMPackage.DIFF_ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EATTRIBUTES = RefactoringDiffMMPackage.DIFF_ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Eoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EOPERATIONS = RefactoringDiffMMPackage.DIFF_ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>Ereferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__EREFERENCES = RefactoringDiffMMPackage.DIFF_ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>Esupertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ESUPERTYPES = RefactoringDiffMMPackage.DIFF_ECLASS__ESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEATTRIBUTES = RefactoringDiffMMPackage.DIFF_ECLASS__DIFFEATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEOPERATIONS = RefactoringDiffMMPackage.DIFF_ECLASS__DIFFEOPERATIONS;

	/**
	 * The feature id for the '<em><b>Differeferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFEREFERENCES = RefactoringDiffMMPackage.DIFF_ECLASS__DIFFEREFERENCES;

	/**
	 * The feature id for the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__DIFFESUPERTYPES = RefactoringDiffMMPackage.DIFF_ECLASS__DIFFESUPERTYPES;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__OPERATION = RefactoringDiffMMPackage.DIFF_ECLASS__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__NEW_NAME = RefactoringDiffMMPackage.DIFF_ECLASS__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__ID_PATTERN = RefactoringDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS__FILTER = RefactoringDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEClass_eattributesImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__OPERATION = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ETYPE = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eattributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__OPERATION = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ETYPE = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass eoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES = 10;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__OPERATION = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES__FILTER = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass ereferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_EREFERENCES_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES = 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__OPERATION = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ETYPE = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__ID_PATTERN = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES__FILTER = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EClass esupertypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEOperationImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEOperation()
	 * @generated
	 */
	int PATTERN_DIFF_EOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__EPARAMETERS = RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NAME = RefactoringDiffMMPackage.DIFF_EOPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ETYPE = RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__OPERATION = RefactoringDiffMMPackage.DIFF_EOPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>New eparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_EPARAMETERS = RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_NAME = RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__NEW_ETYPE = RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION__FILTER = RefactoringDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EOPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EOPERATION_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EOPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEPackageImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE = 13;

	/**
	 * The feature id for the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ECLASSIFIERS = RefactoringDiffMMPackage.DIFF_EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NAME = RefactoringDiffMMPackage.DIFF_EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DOMAINSPECIFICDIFFS = RefactoringDiffMMPackage.DIFF_EPACKAGE__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFECLASSIFIERS = RefactoringDiffMMPackage.DIFF_EPACKAGE__DIFFECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__DIFFDOMAINSPECIFICDIFFS = RefactoringDiffMMPackage.DIFF_EPACKAGE__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__OPERATION = RefactoringDiffMMPackage.DIFF_EPACKAGE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__NEW_NAME = RefactoringDiffMMPackage.DIFF_EPACKAGE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE__FILTER = RefactoringDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS = 14;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__OPERATION = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ETYPE = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage eclassifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl <em>Pattern Diff EPackage domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = 15;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EPackage domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.Pattern_DiffEReferenceImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEReference()
	 * @generated
	 */
	int PATTERN_DIFF_EREFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NAME = RefactoringDiffMMPackage.DIFF_EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ETYPE = RefactoringDiffMMPackage.DIFF_EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__OPERATION = RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_NAME = RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__NEW_ETYPE = RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__ID_PATTERN = RefactoringDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE__FILTER = RefactoringDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_FEATURE_COUNT = RefactoringDiffMMPackage.DIFF_EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_EREFERENCE_OPERATION_COUNT = RefactoringDiffMMPackage.DIFF_EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link refactoringRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see refactoringRuleMM.impl.RuleImpl
	 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 17;

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
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EAttribute</em>'.
	 * @see refactoringRuleMM.Pattern_EAttribute
	 * @generated
	 */
	EClass getPattern_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_EAttribute#getID_Pattern()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_EAttribute#isFilter()
	 * @see #getPattern_EAttribute()
	 * @generated
	 */
	EAttribute getPattern_EAttribute_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EClass</em>'.
	 * @see refactoringRuleMM.Pattern_EClass
	 * @generated
	 */
	EClass getPattern_EClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_EClass#getID_Pattern()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_EClass#isFilter()
	 * @see #getPattern_EClass()
	 * @generated
	 */
	EAttribute getPattern_EClass_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EOperation</em>'.
	 * @see refactoringRuleMM.Pattern_EOperation
	 * @generated
	 */
	EClass getPattern_EOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_EOperation#getID_Pattern()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_EOperation#isFilter()
	 * @see #getPattern_EOperation()
	 * @generated
	 */
	EAttribute getPattern_EOperation_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EPackage</em>'.
	 * @see refactoringRuleMM.Pattern_EPackage
	 * @generated
	 */
	EClass getPattern_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_EPackage#getID_Pattern()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_EPackage#isFilter()
	 * @see #getPattern_EPackage()
	 * @generated
	 */
	EAttribute getPattern_EPackage_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern EReference</em>'.
	 * @see refactoringRuleMM.Pattern_EReference
	 * @generated
	 */
	EClass getPattern_EReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_EReference#getID_Pattern()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_EReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_EReference#isFilter()
	 * @see #getPattern_EReference()
	 * @generated
	 */
	EAttribute getPattern_EReference_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see refactoringRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DomainSpecificDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DomainSpecificDiff#isFilter()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EAttribute</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	EClass getPattern_DiffEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEAttribute#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEAttribute#getID_Pattern()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEAttribute#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEAttribute#isFilter()
	 * @see #getPattern_DiffEAttribute()
	 * @generated
	 */
	EAttribute getPattern_DiffEAttribute_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	EClass getPattern_DiffEClass();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass#getID_Pattern()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass#isFilter()
	 * @see #getPattern_DiffEClass()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEClass_eattributes <em>Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eattributes</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eattributes
	 * @generated
	 */
	EClass getPattern_DiffEClass_eattributes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eattributes#getID_Pattern()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_eattributes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eattributes#isFilter()
	 * @see #getPattern_DiffEClass_eattributes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eattributes_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEClass_eoperations <em>Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass eoperations</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eoperations
	 * @generated
	 */
	EClass getPattern_DiffEClass_eoperations();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eoperations#getID_Pattern()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_eoperations#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_eoperations#isFilter()
	 * @see #getPattern_DiffEClass_eoperations()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_eoperations_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEClass_ereferences <em>Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass ereferences</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_ereferences
	 * @generated
	 */
	EClass getPattern_DiffEClass_ereferences();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_ereferences#getID_Pattern()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_ereferences#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_ereferences#isFilter()
	 * @see #getPattern_DiffEClass_ereferences()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_ereferences_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEClass_esupertypes <em>Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EClass esupertypes</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_esupertypes
	 * @generated
	 */
	EClass getPattern_DiffEClass_esupertypes();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_esupertypes#getID_Pattern()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEClass_esupertypes#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEClass_esupertypes#isFilter()
	 * @see #getPattern_DiffEClass_esupertypes()
	 * @generated
	 */
	EAttribute getPattern_DiffEClass_esupertypes_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EOperation</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	EClass getPattern_DiffEOperation();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEOperation#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEOperation#getID_Pattern()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEOperation#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEOperation#isFilter()
	 * @see #getPattern_DiffEOperation()
	 * @generated
	 */
	EAttribute getPattern_DiffEOperation_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	EClass getPattern_DiffEPackage();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage#getID_Pattern()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage#isFilter()
	 * @see #getPattern_DiffEPackage()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEPackage_eclassifiers <em>Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_eclassifiers
	 * @generated
	 */
	EClass getPattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_eclassifiers#getID_Pattern()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_eclassifiers#isFilter()
	 * @see #getPattern_DiffEPackage_eclassifiers()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_eclassifiers_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs <em>Pattern Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffEPackage_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEPackage_domainspecificdiffs#isFilter()
	 * @see #getPattern_DiffEPackage_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffEPackage_domainspecificdiffs_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff EReference</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	EClass getPattern_DiffEReference();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEReference#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEReference#getID_Pattern()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Pattern_DiffEReference#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see refactoringRuleMM.Pattern_DiffEReference#isFilter()
	 * @see #getPattern_DiffEReference()
	 * @generated
	 */
	EAttribute getPattern_DiffEReference_Filter();

	/**
	 * Returns the meta object for class '{@link refactoringRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see refactoringRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link refactoringRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see refactoringRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link refactoringRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see refactoringRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link refactoringRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see refactoringRuleMM.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringRuleMMFactory getRefactoringRuleMMFactory();

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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_EAttributeImpl <em>Pattern EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_EAttributeImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EAttribute()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_EClassImpl <em>Pattern EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_EClassImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EClass()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_EOperationImpl <em>Pattern EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_EOperationImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EOperation()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_EPackageImpl <em>Pattern EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_EPackageImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EPackage()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_EReferenceImpl <em>Pattern EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_EReferenceImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_EReference()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DomainSpecificDiff()
		 * @generated
		 */
		EClass PATTERN_DOMAIN_SPECIFIC_DIFF = eINSTANCE.getPattern_DomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_DomainSpecificDiff_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = eINSTANCE.getPattern_DomainSpecificDiff_Filter();

		/**
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEAttributeImpl <em>Pattern Diff EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEAttributeImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEAttribute()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEClassImpl <em>Pattern Diff EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEClassImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_eattributesImpl <em>Pattern Diff EClass eattributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEClass_eattributesImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_eattributes()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_eoperationsImpl <em>Pattern Diff EClass eoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEClass_eoperationsImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_eoperations()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_ereferencesImpl <em>Pattern Diff EClass ereferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEClass_ereferencesImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_ereferences()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEClass_esupertypesImpl <em>Pattern Diff EClass esupertypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEClass_esupertypesImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEClass_esupertypes()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEOperationImpl <em>Pattern Diff EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEOperationImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEOperation()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackageImpl <em>Pattern Diff EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEPackageImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl <em>Pattern Diff EPackage eclassifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEPackage_eclassifiersImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage_eclassifiers()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl <em>Pattern Diff EPackage domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEPackage_domainspecificdiffsImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEPackage_domainspecificdiffs()
		 * @generated
		 */
		EClass PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER = eINSTANCE.getPattern_DiffEPackage_domainspecificdiffs_Filter();

		/**
		 * The meta object literal for the '{@link refactoringRuleMM.impl.Pattern_DiffEReferenceImpl <em>Pattern Diff EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.Pattern_DiffEReferenceImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getPattern_DiffEReference()
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
		 * The meta object literal for the '{@link refactoringRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see refactoringRuleMM.impl.RuleImpl
		 * @see refactoringRuleMM.impl.RefactoringRuleMMPackageImpl#getRule()
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
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

	}

} //RefactoringRuleMMPackage
