/**
 */
package oracleRuleMM;

import oracleDiffMM.OracleDiffMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see oracleRuleMM.OracleRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface OracleRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oracleRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/oracleRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oracleRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OracleRuleMMPackage eINSTANCE = oracleRuleMM.impl.OracleRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_AImpl <em>Pattern A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_AImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_A()
	 * @generated
	 */
	int PATTERN_A = 0;

	/**
	 * The feature id for the '<em><b>Ab</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__AB = OracleDiffMMPackage.A__AB;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__ID = OracleDiffMMPackage.A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__NAME = OracleDiffMMPackage.A__NAME;

	/**
	 * The feature id for the '<em><b>Diffab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__DIFFAB = OracleDiffMMPackage.A__DIFFAB;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__ID_PATTERN = OracleDiffMMPackage.A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A__FILTER = OracleDiffMMPackage.A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A_FEATURE_COUNT = OracleDiffMMPackage.A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_A_OPERATION_COUNT = OracleDiffMMPackage.A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_BImpl <em>Pattern B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_BImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_B()
	 * @generated
	 */
	int PATTERN_B = 1;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__BD = OracleDiffMMPackage.B__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__ID = OracleDiffMMPackage.B__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__NAME = OracleDiffMMPackage.B__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__DIFFBD = OracleDiffMMPackage.B__DIFFBD;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__ID_PATTERN = OracleDiffMMPackage.B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B__FILTER = OracleDiffMMPackage.B_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B_FEATURE_COUNT = OracleDiffMMPackage.B_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_B_OPERATION_COUNT = OracleDiffMMPackage.B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_CImpl <em>Pattern C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_CImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_C()
	 * @generated
	 */
	int PATTERN_C = 2;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__BD = OracleDiffMMPackage.C__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__ID = OracleDiffMMPackage.C__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__NAME = OracleDiffMMPackage.C__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__DIFFBD = OracleDiffMMPackage.C__DIFFBD;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__X = OracleDiffMMPackage.C__X;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__ID_PATTERN = OracleDiffMMPackage.C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C__FILTER = OracleDiffMMPackage.C_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C_FEATURE_COUNT = OracleDiffMMPackage.C_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_C_OPERATION_COUNT = OracleDiffMMPackage.C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DImpl <em>Pattern D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_D()
	 * @generated
	 */
	int PATTERN_D = 3;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__DD = OracleDiffMMPackage.D__DD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__ID = OracleDiffMMPackage.D__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__NAME = OracleDiffMMPackage.D__NAME;

	/**
	 * The feature id for the '<em><b>Diffdd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__DIFFDD = OracleDiffMMPackage.D__DIFFDD;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__ID_PATTERN = OracleDiffMMPackage.D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D__FILTER = OracleDiffMMPackage.D_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D_FEATURE_COUNT = OracleDiffMMPackage.D_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_D_OPERATION_COUNT = OracleDiffMMPackage.D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_ROOTImpl <em>Pattern ROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_ROOTImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_ROOT()
	 * @generated
	 */
	int PATTERN_ROOT = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__B = OracleDiffMMPackage.ROOT__B;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__A = OracleDiffMMPackage.ROOT__A;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__DOMAINSPECIFICDIFFS = OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__DIFFB = OracleDiffMMPackage.ROOT__DIFFB;

	/**
	 * The feature id for the '<em><b>Diffa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__DIFFA = OracleDiffMMPackage.ROOT__DIFFA;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__DIFFDOMAINSPECIFICDIFFS = OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__ID_PATTERN = OracleDiffMMPackage.ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__FILTER = OracleDiffMMPackage.ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT_FEATURE_COUNT = OracleDiffMMPackage.ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT_OPERATION_COUNT = OracleDiffMMPackage.ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DomainSpecificDiff()
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
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff D</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffAImpl <em>Pattern Diff A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffAImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffA()
	 * @generated
	 */
	int PATTERN_DIFF_A = 6;

	/**
	 * The feature id for the '<em><b>Ab</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__AB = OracleDiffMMPackage.DIFF_A__AB;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__ID = OracleDiffMMPackage.DIFF_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__NAME = OracleDiffMMPackage.DIFF_A__NAME;

	/**
	 * The feature id for the '<em><b>Diffab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__DIFFAB = OracleDiffMMPackage.DIFF_A__DIFFAB;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__OPERATION = OracleDiffMMPackage.DIFF_A__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__NEW_ID = OracleDiffMMPackage.DIFF_A__NEW_ID;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__NEW_NAME = OracleDiffMMPackage.DIFF_A__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__ID_PATTERN = OracleDiffMMPackage.DIFF_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A__FILTER = OracleDiffMMPackage.DIFF_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A_FEATURE_COUNT = OracleDiffMMPackage.DIFF_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_A_OPERATION_COUNT = OracleDiffMMPackage.DIFF_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffA_abImpl <em>Pattern Diff Aab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffA_abImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffA_ab()
	 * @generated
	 */
	int PATTERN_DIFF_AAB = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB__OPERATION = OracleDiffMMPackage.DIFF_AAB__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB__ETYPE = OracleDiffMMPackage.DIFF_AAB__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB__ID_PATTERN = OracleDiffMMPackage.DIFF_AAB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB__FILTER = OracleDiffMMPackage.DIFF_AAB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Aab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB_FEATURE_COUNT = OracleDiffMMPackage.DIFF_AAB_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Aab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_AAB_OPERATION_COUNT = OracleDiffMMPackage.DIFF_AAB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffBImpl <em>Pattern Diff B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffBImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffB()
	 * @generated
	 */
	int PATTERN_DIFF_B = 8;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__BD = OracleDiffMMPackage.DIFF_B__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__ID = OracleDiffMMPackage.DIFF_B__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__NAME = OracleDiffMMPackage.DIFF_B__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__DIFFBD = OracleDiffMMPackage.DIFF_B__DIFFBD;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__OPERATION = OracleDiffMMPackage.DIFF_B__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__NEW_ID = OracleDiffMMPackage.DIFF_B__NEW_ID;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__NEW_NAME = OracleDiffMMPackage.DIFF_B__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__ID_PATTERN = OracleDiffMMPackage.DIFF_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B__FILTER = OracleDiffMMPackage.DIFF_B_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B_FEATURE_COUNT = OracleDiffMMPackage.DIFF_B_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_B_OPERATION_COUNT = OracleDiffMMPackage.DIFF_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffB_bdImpl <em>Pattern Diff Bbd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffB_bdImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffB_bd()
	 * @generated
	 */
	int PATTERN_DIFF_BBD = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD__OPERATION = OracleDiffMMPackage.DIFF_BBD__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD__ETYPE = OracleDiffMMPackage.DIFF_BBD__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD__ID_PATTERN = OracleDiffMMPackage.DIFF_BBD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD__FILTER = OracleDiffMMPackage.DIFF_BBD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Bbd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD_FEATURE_COUNT = OracleDiffMMPackage.DIFF_BBD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Bbd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BBD_OPERATION_COUNT = OracleDiffMMPackage.DIFF_BBD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffCImpl <em>Pattern Diff C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffCImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffC()
	 * @generated
	 */
	int PATTERN_DIFF_C = 10;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__BD = OracleDiffMMPackage.DIFF_C__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__ID = OracleDiffMMPackage.DIFF_C__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__NAME = OracleDiffMMPackage.DIFF_C__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__DIFFBD = OracleDiffMMPackage.DIFF_C__DIFFBD;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__X = OracleDiffMMPackage.DIFF_C__X;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__OPERATION = OracleDiffMMPackage.DIFF_C__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__NEW_ID = OracleDiffMMPackage.DIFF_C__NEW_ID;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__NEW_NAME = OracleDiffMMPackage.DIFF_C__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__NEW_X = OracleDiffMMPackage.DIFF_C__NEW_X;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__ID_PATTERN = OracleDiffMMPackage.DIFF_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C__FILTER = OracleDiffMMPackage.DIFF_C_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C_FEATURE_COUNT = OracleDiffMMPackage.DIFF_C_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_C_OPERATION_COUNT = OracleDiffMMPackage.DIFF_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffDImpl <em>Pattern Diff D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffDImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffD()
	 * @generated
	 */
	int PATTERN_DIFF_D = 11;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__DD = OracleDiffMMPackage.DIFF_D__DD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__ID = OracleDiffMMPackage.DIFF_D__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__NAME = OracleDiffMMPackage.DIFF_D__NAME;

	/**
	 * The feature id for the '<em><b>Diffdd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__DIFFDD = OracleDiffMMPackage.DIFF_D__DIFFDD;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__OPERATION = OracleDiffMMPackage.DIFF_D__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__NEW_ID = OracleDiffMMPackage.DIFF_D__NEW_ID;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__NEW_NAME = OracleDiffMMPackage.DIFF_D__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__ID_PATTERN = OracleDiffMMPackage.DIFF_D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D__FILTER = OracleDiffMMPackage.DIFF_D_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D_FEATURE_COUNT = OracleDiffMMPackage.DIFF_D_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_D_OPERATION_COUNT = OracleDiffMMPackage.DIFF_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffD_ddImpl <em>Pattern Diff Ddd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffD_ddImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffD_dd()
	 * @generated
	 */
	int PATTERN_DIFF_DDD = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD__OPERATION = OracleDiffMMPackage.DIFF_DDD__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD__ETYPE = OracleDiffMMPackage.DIFF_DDD__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD__ID_PATTERN = OracleDiffMMPackage.DIFF_DDD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD__FILTER = OracleDiffMMPackage.DIFF_DDD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff Ddd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD_FEATURE_COUNT = OracleDiffMMPackage.DIFF_DDD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff Ddd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DDD_OPERATION_COUNT = OracleDiffMMPackage.DIFF_DDD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffROOTImpl <em>Pattern Diff ROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffROOTImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT()
	 * @generated
	 */
	int PATTERN_DIFF_ROOT = 13;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__B = OracleDiffMMPackage.DIFF_ROOT__B;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__A = OracleDiffMMPackage.DIFF_ROOT__A;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__DOMAINSPECIFICDIFFS = OracleDiffMMPackage.DIFF_ROOT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__DIFFB = OracleDiffMMPackage.DIFF_ROOT__DIFFB;

	/**
	 * The feature id for the '<em><b>Diffa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__DIFFA = OracleDiffMMPackage.DIFF_ROOT__DIFFA;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__DIFFDOMAINSPECIFICDIFFS = OracleDiffMMPackage.DIFF_ROOT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__OPERATION = OracleDiffMMPackage.DIFF_ROOT__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__ID_PATTERN = OracleDiffMMPackage.DIFF_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT__FILTER = OracleDiffMMPackage.DIFF_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_FEATURE_COUNT = OracleDiffMMPackage.DIFF_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_OPERATION_COUNT = OracleDiffMMPackage.DIFF_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_bImpl <em>Pattern Diff ROOT b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffROOT_bImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_b()
	 * @generated
	 */
	int PATTERN_DIFF_ROOT_B = 14;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B__OPERATION = OracleDiffMMPackage.DIFF_ROOT_B__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B__ETYPE = OracleDiffMMPackage.DIFF_ROOT_B__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B__ID_PATTERN = OracleDiffMMPackage.DIFF_ROOT_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B__FILTER = OracleDiffMMPackage.DIFF_ROOT_B_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ROOT b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B_FEATURE_COUNT = OracleDiffMMPackage.DIFF_ROOT_B_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ROOT b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_B_OPERATION_COUNT = OracleDiffMMPackage.DIFF_ROOT_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_aImpl <em>Pattern Diff ROOT a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffROOT_aImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_a()
	 * @generated
	 */
	int PATTERN_DIFF_ROOT_A = 15;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A__OPERATION = OracleDiffMMPackage.DIFF_ROOT_A__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A__ETYPE = OracleDiffMMPackage.DIFF_ROOT_A__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A__ID_PATTERN = OracleDiffMMPackage.DIFF_ROOT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A__FILTER = OracleDiffMMPackage.DIFF_ROOT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ROOT a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A_FEATURE_COUNT = OracleDiffMMPackage.DIFF_ROOT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ROOT a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_A_OPERATION_COUNT = OracleDiffMMPackage.DIFF_ROOT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_domainspecificdiffsImpl <em>Pattern Diff ROOT domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.Pattern_DiffROOT_domainspecificdiffsImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS = 16;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__OPERATION = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__ETYPE = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__ID_PATTERN = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__FILTER = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Diff ROOT domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS_FEATURE_COUNT = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Diff ROOT domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS_OPERATION_COUNT = OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleRuleMM.impl.RuleImpl
	 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getRule()
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
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_A <em>Pattern A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern A</em>'.
	 * @see oracleRuleMM.Pattern_A
	 * @generated
	 */
	EClass getPattern_A();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_A#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_A#getID_Pattern()
	 * @see #getPattern_A()
	 * @generated
	 */
	EAttribute getPattern_A_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_A#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_A#isFilter()
	 * @see #getPattern_A()
	 * @generated
	 */
	EAttribute getPattern_A_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_B <em>Pattern B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern B</em>'.
	 * @see oracleRuleMM.Pattern_B
	 * @generated
	 */
	EClass getPattern_B();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_B#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_B#getID_Pattern()
	 * @see #getPattern_B()
	 * @generated
	 */
	EAttribute getPattern_B_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_B#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_B#isFilter()
	 * @see #getPattern_B()
	 * @generated
	 */
	EAttribute getPattern_B_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_C <em>Pattern C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern C</em>'.
	 * @see oracleRuleMM.Pattern_C
	 * @generated
	 */
	EClass getPattern_C();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_C#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_C#getID_Pattern()
	 * @see #getPattern_C()
	 * @generated
	 */
	EAttribute getPattern_C_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_C#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_C#isFilter()
	 * @see #getPattern_C()
	 * @generated
	 */
	EAttribute getPattern_C_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_D <em>Pattern D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern D</em>'.
	 * @see oracleRuleMM.Pattern_D
	 * @generated
	 */
	EClass getPattern_D();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_D#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_D#getID_Pattern()
	 * @see #getPattern_D()
	 * @generated
	 */
	EAttribute getPattern_D_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_D#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_D#isFilter()
	 * @see #getPattern_D()
	 * @generated
	 */
	EAttribute getPattern_D_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_ROOT <em>Pattern ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern ROOT</em>'.
	 * @see oracleRuleMM.Pattern_ROOT
	 * @generated
	 */
	EClass getPattern_ROOT();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_ROOT#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_ROOT#getID_Pattern()
	 * @see #getPattern_ROOT()
	 * @generated
	 */
	EAttribute getPattern_ROOT_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_ROOT#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_ROOT#isFilter()
	 * @see #getPattern_ROOT()
	 * @generated
	 */
	EAttribute getPattern_ROOT_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see oracleRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DomainSpecificDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DomainSpecificDiff#isFilter()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffA <em>Pattern Diff A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff A</em>'.
	 * @see oracleRuleMM.Pattern_DiffA
	 * @generated
	 */
	EClass getPattern_DiffA();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffA#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffA#getID_Pattern()
	 * @see #getPattern_DiffA()
	 * @generated
	 */
	EAttribute getPattern_DiffA_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffA#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffA#isFilter()
	 * @see #getPattern_DiffA()
	 * @generated
	 */
	EAttribute getPattern_DiffA_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffA_ab <em>Pattern Diff Aab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Aab</em>'.
	 * @see oracleRuleMM.Pattern_DiffA_ab
	 * @generated
	 */
	EClass getPattern_DiffA_ab();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffA_ab#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffA_ab#getID_Pattern()
	 * @see #getPattern_DiffA_ab()
	 * @generated
	 */
	EAttribute getPattern_DiffA_ab_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffA_ab#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffA_ab#isFilter()
	 * @see #getPattern_DiffA_ab()
	 * @generated
	 */
	EAttribute getPattern_DiffA_ab_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffB <em>Pattern Diff B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff B</em>'.
	 * @see oracleRuleMM.Pattern_DiffB
	 * @generated
	 */
	EClass getPattern_DiffB();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffB#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffB#getID_Pattern()
	 * @see #getPattern_DiffB()
	 * @generated
	 */
	EAttribute getPattern_DiffB_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffB#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffB#isFilter()
	 * @see #getPattern_DiffB()
	 * @generated
	 */
	EAttribute getPattern_DiffB_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffB_bd <em>Pattern Diff Bbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Bbd</em>'.
	 * @see oracleRuleMM.Pattern_DiffB_bd
	 * @generated
	 */
	EClass getPattern_DiffB_bd();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffB_bd#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffB_bd#getID_Pattern()
	 * @see #getPattern_DiffB_bd()
	 * @generated
	 */
	EAttribute getPattern_DiffB_bd_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffB_bd#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffB_bd#isFilter()
	 * @see #getPattern_DiffB_bd()
	 * @generated
	 */
	EAttribute getPattern_DiffB_bd_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffC <em>Pattern Diff C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff C</em>'.
	 * @see oracleRuleMM.Pattern_DiffC
	 * @generated
	 */
	EClass getPattern_DiffC();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffC#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffC#getID_Pattern()
	 * @see #getPattern_DiffC()
	 * @generated
	 */
	EAttribute getPattern_DiffC_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffC#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffC#isFilter()
	 * @see #getPattern_DiffC()
	 * @generated
	 */
	EAttribute getPattern_DiffC_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffD <em>Pattern Diff D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff D</em>'.
	 * @see oracleRuleMM.Pattern_DiffD
	 * @generated
	 */
	EClass getPattern_DiffD();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffD#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffD#getID_Pattern()
	 * @see #getPattern_DiffD()
	 * @generated
	 */
	EAttribute getPattern_DiffD_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffD#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffD#isFilter()
	 * @see #getPattern_DiffD()
	 * @generated
	 */
	EAttribute getPattern_DiffD_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffD_dd <em>Pattern Diff Ddd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Ddd</em>'.
	 * @see oracleRuleMM.Pattern_DiffD_dd
	 * @generated
	 */
	EClass getPattern_DiffD_dd();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffD_dd#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffD_dd#getID_Pattern()
	 * @see #getPattern_DiffD_dd()
	 * @generated
	 */
	EAttribute getPattern_DiffD_dd_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffD_dd#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffD_dd#isFilter()
	 * @see #getPattern_DiffD_dd()
	 * @generated
	 */
	EAttribute getPattern_DiffD_dd_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffROOT <em>Pattern Diff ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ROOT</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT
	 * @generated
	 */
	EClass getPattern_DiffROOT();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT#getID_Pattern()
	 * @see #getPattern_DiffROOT()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT#isFilter()
	 * @see #getPattern_DiffROOT()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffROOT_b <em>Pattern Diff ROOT b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ROOT b</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_b
	 * @generated
	 */
	EClass getPattern_DiffROOT_b();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_b#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_b#getID_Pattern()
	 * @see #getPattern_DiffROOT_b()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_b_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_b#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_b#isFilter()
	 * @see #getPattern_DiffROOT_b()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_b_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffROOT_a <em>Pattern Diff ROOT a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ROOT a</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_a
	 * @generated
	 */
	EClass getPattern_DiffROOT_a();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_a#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_a#getID_Pattern()
	 * @see #getPattern_DiffROOT_a()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_a_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_a#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_a#isFilter()
	 * @see #getPattern_DiffROOT_a()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_a_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs <em>Pattern Diff ROOT domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff ROOT domainspecificdiffs</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffROOT_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffROOT_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs#isFilter()
	 * @see #getPattern_DiffROOT_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffROOT_domainspecificdiffs_Filter();

	/**
	 * Returns the meta object for class '{@link oracleRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see oracleRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link oracleRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oracleRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link oracleRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see oracleRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link oracleRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see oracleRuleMM.Rule#getPattern()
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
	OracleRuleMMFactory getOracleRuleMMFactory();

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
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_AImpl <em>Pattern A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_AImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_A()
		 * @generated
		 */
		EClass PATTERN_A = eINSTANCE.getPattern_A();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_A__ID_PATTERN = eINSTANCE.getPattern_A_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_A__FILTER = eINSTANCE.getPattern_A_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_BImpl <em>Pattern B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_BImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_B()
		 * @generated
		 */
		EClass PATTERN_B = eINSTANCE.getPattern_B();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_B__ID_PATTERN = eINSTANCE.getPattern_B_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_B__FILTER = eINSTANCE.getPattern_B_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_CImpl <em>Pattern C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_CImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_C()
		 * @generated
		 */
		EClass PATTERN_C = eINSTANCE.getPattern_C();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_C__ID_PATTERN = eINSTANCE.getPattern_C_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_C__FILTER = eINSTANCE.getPattern_C_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DImpl <em>Pattern D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_D()
		 * @generated
		 */
		EClass PATTERN_D = eINSTANCE.getPattern_D();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_D__ID_PATTERN = eINSTANCE.getPattern_D_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_D__FILTER = eINSTANCE.getPattern_D_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_ROOTImpl <em>Pattern ROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_ROOTImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_ROOT()
		 * @generated
		 */
		EClass PATTERN_ROOT = eINSTANCE.getPattern_ROOT();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ROOT__ID_PATTERN = eINSTANCE.getPattern_ROOT_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ROOT__FILTER = eINSTANCE.getPattern_ROOT_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DomainSpecificDiff()
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
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffAImpl <em>Pattern Diff A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffAImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffA()
		 * @generated
		 */
		EClass PATTERN_DIFF_A = eINSTANCE.getPattern_DiffA();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_A__ID_PATTERN = eINSTANCE.getPattern_DiffA_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_A__FILTER = eINSTANCE.getPattern_DiffA_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffA_abImpl <em>Pattern Diff Aab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffA_abImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffA_ab()
		 * @generated
		 */
		EClass PATTERN_DIFF_AAB = eINSTANCE.getPattern_DiffA_ab();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_AAB__ID_PATTERN = eINSTANCE.getPattern_DiffA_ab_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_AAB__FILTER = eINSTANCE.getPattern_DiffA_ab_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffBImpl <em>Pattern Diff B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffBImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffB()
		 * @generated
		 */
		EClass PATTERN_DIFF_B = eINSTANCE.getPattern_DiffB();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_B__ID_PATTERN = eINSTANCE.getPattern_DiffB_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_B__FILTER = eINSTANCE.getPattern_DiffB_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffB_bdImpl <em>Pattern Diff Bbd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffB_bdImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffB_bd()
		 * @generated
		 */
		EClass PATTERN_DIFF_BBD = eINSTANCE.getPattern_DiffB_bd();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_BBD__ID_PATTERN = eINSTANCE.getPattern_DiffB_bd_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_BBD__FILTER = eINSTANCE.getPattern_DiffB_bd_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffCImpl <em>Pattern Diff C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffCImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffC()
		 * @generated
		 */
		EClass PATTERN_DIFF_C = eINSTANCE.getPattern_DiffC();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_C__ID_PATTERN = eINSTANCE.getPattern_DiffC_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_C__FILTER = eINSTANCE.getPattern_DiffC_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffDImpl <em>Pattern Diff D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffDImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffD()
		 * @generated
		 */
		EClass PATTERN_DIFF_D = eINSTANCE.getPattern_DiffD();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_D__ID_PATTERN = eINSTANCE.getPattern_DiffD_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_D__FILTER = eINSTANCE.getPattern_DiffD_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffD_ddImpl <em>Pattern Diff Ddd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffD_ddImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffD_dd()
		 * @generated
		 */
		EClass PATTERN_DIFF_DDD = eINSTANCE.getPattern_DiffD_dd();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_DDD__ID_PATTERN = eINSTANCE.getPattern_DiffD_dd_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_DDD__FILTER = eINSTANCE.getPattern_DiffD_dd_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffROOTImpl <em>Pattern Diff ROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffROOTImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT()
		 * @generated
		 */
		EClass PATTERN_DIFF_ROOT = eINSTANCE.getPattern_DiffROOT();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT__ID_PATTERN = eINSTANCE.getPattern_DiffROOT_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT__FILTER = eINSTANCE.getPattern_DiffROOT_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_bImpl <em>Pattern Diff ROOT b</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffROOT_bImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_b()
		 * @generated
		 */
		EClass PATTERN_DIFF_ROOT_B = eINSTANCE.getPattern_DiffROOT_b();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_B__ID_PATTERN = eINSTANCE.getPattern_DiffROOT_b_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_B__FILTER = eINSTANCE.getPattern_DiffROOT_b_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_aImpl <em>Pattern Diff ROOT a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffROOT_aImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_a()
		 * @generated
		 */
		EClass PATTERN_DIFF_ROOT_A = eINSTANCE.getPattern_DiffROOT_a();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_A__ID_PATTERN = eINSTANCE.getPattern_DiffROOT_a_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_A__FILTER = eINSTANCE.getPattern_DiffROOT_a_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.Pattern_DiffROOT_domainspecificdiffsImpl <em>Pattern Diff ROOT domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.Pattern_DiffROOT_domainspecificdiffsImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getPattern_DiffROOT_domainspecificdiffs()
		 * @generated
		 */
		EClass PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS = eINSTANCE.getPattern_DiffROOT_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__ID_PATTERN = eINSTANCE.getPattern_DiffROOT_domainspecificdiffs_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__FILTER = eINSTANCE.getPattern_DiffROOT_domainspecificdiffs_Filter();

		/**
		 * The meta object literal for the '{@link oracleRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleRuleMM.impl.RuleImpl
		 * @see oracleRuleMM.impl.OracleRuleMMPackageImpl#getRule()
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

} //OracleRuleMMPackage
