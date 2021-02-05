/**
 */
package oracleDiffMM;

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
 * @see oracleDiffMM.OracleDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface OracleDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oracleDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/oracleDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oracleDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OracleDiffMMPackage eINSTANCE = oracleDiffMM.impl.OracleDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.AImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The feature id for the '<em><b>Ab</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__AB = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__NAME = 2;

	/**
	 * The feature id for the '<em><b>Diffab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__DIFFAB = 3;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.BImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getB()
	 * @generated
	 */
	int B = 1;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__BD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__NAME = 2;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__DIFFBD = 3;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.CImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getC()
	 * @generated
	 */
	int C = 2;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__BD = B__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__ID = B__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__NAME = B__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__DIFFBD = B__DIFFBD;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__X = B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DImpl <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getD()
	 * @generated
	 */
	int D = 3;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__DD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__NAME = 2;

	/**
	 * The feature id for the '<em><b>Diffdd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D__DIFFDD = 3;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.ROOTImpl <em>ROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.ROOTImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getROOT()
	 * @generated
	 */
	int ROOT = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__B = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__A = 1;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DOMAINSPECIFICDIFFS = 2;

	/**
	 * The feature id for the '<em><b>Diffb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DIFFB = 3;

	/**
	 * The feature id for the '<em><b>Diffa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DIFFA = 4;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DIFFDOMAINSPECIFICDIFFS = 5;

	/**
	 * The number of structural features of the '<em>ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DomainSpecificDiffImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A = 1;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff D</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D = 4;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffAImpl <em>Diff A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffAImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffA()
	 * @generated
	 */
	int DIFF_A = 6;

	/**
	 * The feature id for the '<em><b>Ab</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__AB = A__AB;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__ID = A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__NAME = A__NAME;

	/**
	 * The feature id for the '<em><b>Diffab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__DIFFAB = A__DIFFAB;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__OPERATION = A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__NEW_ID = A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A__NEW_NAME = A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A_FEATURE_COUNT = A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_A_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffA_abImpl <em>Diff Aab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffA_abImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffA_ab()
	 * @generated
	 */
	int DIFF_AAB = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_AAB__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_AAB__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Aab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_AAB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Aab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_AAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffBImpl <em>Diff B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffBImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffB()
	 * @generated
	 */
	int DIFF_B = 8;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__BD = B__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__ID = B__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__NAME = B__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__DIFFBD = B__DIFFBD;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__OPERATION = B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__NEW_ID = B_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B__NEW_NAME = B_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B_FEATURE_COUNT = B_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_B_OPERATION_COUNT = B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffB_bdImpl <em>Diff Bbd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffB_bdImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffB_bd()
	 * @generated
	 */
	int DIFF_BBD = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BBD__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BBD__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Bbd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BBD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Bbd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BBD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffCImpl <em>Diff C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffCImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffC()
	 * @generated
	 */
	int DIFF_C = 10;

	/**
	 * The feature id for the '<em><b>Bd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__BD = C__BD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__ID = C__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__NAME = C__NAME;

	/**
	 * The feature id for the '<em><b>Diffbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__DIFFBD = C__DIFFBD;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__X = C__X;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__OPERATION = C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__NEW_ID = C_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__NEW_NAME = C_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C__NEW_X = C_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C_FEATURE_COUNT = C_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diff C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_C_OPERATION_COUNT = C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffDImpl <em>Diff D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffDImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffD()
	 * @generated
	 */
	int DIFF_D = 11;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__DD = D__DD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__ID = D__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__NAME = D__NAME;

	/**
	 * The feature id for the '<em><b>Diffdd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__DIFFDD = D__DIFFDD;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__OPERATION = D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__NEW_ID = D_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D__NEW_NAME = D_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D_FEATURE_COUNT = D_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_D_OPERATION_COUNT = D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffD_ddImpl <em>Diff Ddd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffD_ddImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffD_dd()
	 * @generated
	 */
	int DIFF_DDD = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DDD__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DDD__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Ddd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DDD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Ddd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DDD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffROOTImpl <em>Diff ROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffROOTImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT()
	 * @generated
	 */
	int DIFF_ROOT = 13;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__B = ROOT__B;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__A = ROOT__A;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__DOMAINSPECIFICDIFFS = ROOT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__DIFFB = ROOT__DIFFB;

	/**
	 * The feature id for the '<em><b>Diffa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__DIFFA = ROOT__DIFFA;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__DIFFDOMAINSPECIFICDIFFS = ROOT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT__OPERATION = ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_OPERATION_COUNT = ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffROOT_bImpl <em>Diff ROOT b</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffROOT_bImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_b()
	 * @generated
	 */
	int DIFF_ROOT_B = 14;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_B__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_B__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff ROOT b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_B_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff ROOT b</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffROOT_aImpl <em>Diff ROOT a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffROOT_aImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_a()
	 * @generated
	 */
	int DIFF_ROOT_A = 15;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_A__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_A__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff ROOT a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_A_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff ROOT a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.impl.DiffROOT_domainspecificdiffsImpl <em>Diff ROOT domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.impl.DiffROOT_domainspecificdiffsImpl
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_ROOT_DOMAINSPECIFICDIFFS = 16;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_DOMAINSPECIFICDIFFS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_DOMAINSPECIFICDIFFS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff ROOT domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_DOMAINSPECIFICDIFFS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff ROOT domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ROOT_DOMAINSPECIFICDIFFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oracleDiffMM.ClassOp <em>Class Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.ClassOp
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getClassOp()
	 * @generated
	 */
	int CLASS_OP = 17;

	/**
	 * The meta object id for the '{@link oracleDiffMM.AscOp <em>Asc Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracleDiffMM.AscOp
	 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getAscOp()
	 * @generated
	 */
	int ASC_OP = 18;


	/**
	 * Returns the meta object for class '{@link oracleDiffMM.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see oracleDiffMM.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.A#getAb <em>Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ab</em>'.
	 * @see oracleDiffMM.A#getAb()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_Ab();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.A#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oracleDiffMM.A#getId()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.A#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oracleDiffMM.A#getName()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.A#getDiffab <em>Diffab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffab</em>'.
	 * @see oracleDiffMM.A#getDiffab()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_Diffab();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see oracleDiffMM.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.B#getBd <em>Bd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bd</em>'.
	 * @see oracleDiffMM.B#getBd()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_Bd();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.B#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oracleDiffMM.B#getId()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.B#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oracleDiffMM.B#getName()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.B#getDiffbd <em>Diffbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffbd</em>'.
	 * @see oracleDiffMM.B#getDiffbd()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_Diffbd();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see oracleDiffMM.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.C#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see oracleDiffMM.C#getX()
	 * @see #getC()
	 * @generated
	 */
	EAttribute getC_X();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D</em>'.
	 * @see oracleDiffMM.D
	 * @generated
	 */
	EClass getD();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.D#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dd</em>'.
	 * @see oracleDiffMM.D#getDd()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_Dd();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.D#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see oracleDiffMM.D#getId()
	 * @see #getD()
	 * @generated
	 */
	EAttribute getD_Id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.D#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oracleDiffMM.D#getName()
	 * @see #getD()
	 * @generated
	 */
	EAttribute getD_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.D#getDiffdd <em>Diffdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdd</em>'.
	 * @see oracleDiffMM.D#getDiffdd()
	 * @see #getD()
	 * @generated
	 */
	EReference getD_Diffdd();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.ROOT <em>ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROOT</em>'.
	 * @see oracleDiffMM.ROOT
	 * @generated
	 */
	EClass getROOT();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see oracleDiffMM.ROOT#getB()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_B();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see oracleDiffMM.ROOT#getA()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_A();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see oracleDiffMM.ROOT#getDomainspecificdiffs()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getDiffb <em>Diffb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffb</em>'.
	 * @see oracleDiffMM.ROOT#getDiffb()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Diffb();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getDiffa <em>Diffa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffa</em>'.
	 * @see oracleDiffMM.ROOT#getDiffa()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Diffa();

	/**
	 * Returns the meta object for the containment reference list '{@link oracleDiffMM.ROOT#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see oracleDiffMM.ROOT#getDiffdomainspecificdiffs()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_A <em>Domain Specific Diff A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff A</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_A()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_A();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_B <em>Domain Specific Diff B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff B</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_B()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_B();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_C <em>Domain Specific Diff C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff C</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_C()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_C();

	/**
	 * Returns the meta object for the reference list '{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_D <em>Domain Specific Diff D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff D</em>'.
	 * @see oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_D()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_D();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffA <em>Diff A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff A</em>'.
	 * @see oracleDiffMM.DiffA
	 * @generated
	 */
	EClass getDiffA();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffA#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffA#getOperation()
	 * @see #getDiffA()
	 * @generated
	 */
	EAttribute getDiffA_Operation();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffA#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see oracleDiffMM.DiffA#getNew_id()
	 * @see #getDiffA()
	 * @generated
	 */
	EAttribute getDiffA_New_id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffA#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see oracleDiffMM.DiffA#getNew_Name()
	 * @see #getDiffA()
	 * @generated
	 */
	EAttribute getDiffA_New_Name();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffA_ab <em>Diff Aab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Aab</em>'.
	 * @see oracleDiffMM.DiffA_ab
	 * @generated
	 */
	EClass getDiffA_ab();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffA_ab#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffA_ab#getOperation()
	 * @see #getDiffA_ab()
	 * @generated
	 */
	EAttribute getDiffA_ab_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffA_ab#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffA_ab#getEType()
	 * @see #getDiffA_ab()
	 * @generated
	 */
	EReference getDiffA_ab_EType();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffB <em>Diff B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff B</em>'.
	 * @see oracleDiffMM.DiffB
	 * @generated
	 */
	EClass getDiffB();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffB#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffB#getOperation()
	 * @see #getDiffB()
	 * @generated
	 */
	EAttribute getDiffB_Operation();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffB#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see oracleDiffMM.DiffB#getNew_id()
	 * @see #getDiffB()
	 * @generated
	 */
	EAttribute getDiffB_New_id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffB#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see oracleDiffMM.DiffB#getNew_Name()
	 * @see #getDiffB()
	 * @generated
	 */
	EAttribute getDiffB_New_Name();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffB_bd <em>Diff Bbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Bbd</em>'.
	 * @see oracleDiffMM.DiffB_bd
	 * @generated
	 */
	EClass getDiffB_bd();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffB_bd#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffB_bd#getOperation()
	 * @see #getDiffB_bd()
	 * @generated
	 */
	EAttribute getDiffB_bd_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffB_bd#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffB_bd#getEType()
	 * @see #getDiffB_bd()
	 * @generated
	 */
	EReference getDiffB_bd_EType();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffC <em>Diff C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff C</em>'.
	 * @see oracleDiffMM.DiffC
	 * @generated
	 */
	EClass getDiffC();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffC#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffC#getOperation()
	 * @see #getDiffC()
	 * @generated
	 */
	EAttribute getDiffC_Operation();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffC#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see oracleDiffMM.DiffC#getNew_id()
	 * @see #getDiffC()
	 * @generated
	 */
	EAttribute getDiffC_New_id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffC#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see oracleDiffMM.DiffC#getNew_Name()
	 * @see #getDiffC()
	 * @generated
	 */
	EAttribute getDiffC_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffC#getNew_x <em>New x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New x</em>'.
	 * @see oracleDiffMM.DiffC#getNew_x()
	 * @see #getDiffC()
	 * @generated
	 */
	EAttribute getDiffC_New_x();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffD <em>Diff D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff D</em>'.
	 * @see oracleDiffMM.DiffD
	 * @generated
	 */
	EClass getDiffD();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffD#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffD#getOperation()
	 * @see #getDiffD()
	 * @generated
	 */
	EAttribute getDiffD_Operation();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffD#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see oracleDiffMM.DiffD#getNew_id()
	 * @see #getDiffD()
	 * @generated
	 */
	EAttribute getDiffD_New_id();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffD#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see oracleDiffMM.DiffD#getNew_Name()
	 * @see #getDiffD()
	 * @generated
	 */
	EAttribute getDiffD_New_Name();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffD_dd <em>Diff Ddd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Ddd</em>'.
	 * @see oracleDiffMM.DiffD_dd
	 * @generated
	 */
	EClass getDiffD_dd();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffD_dd#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffD_dd#getOperation()
	 * @see #getDiffD_dd()
	 * @generated
	 */
	EAttribute getDiffD_dd_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffD_dd#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffD_dd#getEType()
	 * @see #getDiffD_dd()
	 * @generated
	 */
	EReference getDiffD_dd_EType();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffROOT <em>Diff ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ROOT</em>'.
	 * @see oracleDiffMM.DiffROOT
	 * @generated
	 */
	EClass getDiffROOT();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffROOT#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffROOT#getOperation()
	 * @see #getDiffROOT()
	 * @generated
	 */
	EAttribute getDiffROOT_Operation();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffROOT_b <em>Diff ROOT b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ROOT b</em>'.
	 * @see oracleDiffMM.DiffROOT_b
	 * @generated
	 */
	EClass getDiffROOT_b();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffROOT_b#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffROOT_b#getOperation()
	 * @see #getDiffROOT_b()
	 * @generated
	 */
	EAttribute getDiffROOT_b_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffROOT_b#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffROOT_b#getEType()
	 * @see #getDiffROOT_b()
	 * @generated
	 */
	EReference getDiffROOT_b_EType();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffROOT_a <em>Diff ROOT a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ROOT a</em>'.
	 * @see oracleDiffMM.DiffROOT_a
	 * @generated
	 */
	EClass getDiffROOT_a();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffROOT_a#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffROOT_a#getOperation()
	 * @see #getDiffROOT_a()
	 * @generated
	 */
	EAttribute getDiffROOT_a_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffROOT_a#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffROOT_a#getEType()
	 * @see #getDiffROOT_a()
	 * @generated
	 */
	EReference getDiffROOT_a_EType();

	/**
	 * Returns the meta object for class '{@link oracleDiffMM.DiffROOT_domainspecificdiffs <em>Diff ROOT domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff ROOT domainspecificdiffs</em>'.
	 * @see oracleDiffMM.DiffROOT_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffROOT_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link oracleDiffMM.DiffROOT_domainspecificdiffs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see oracleDiffMM.DiffROOT_domainspecificdiffs#getOperation()
	 * @see #getDiffROOT_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffROOT_domainspecificdiffs_Operation();

	/**
	 * Returns the meta object for the reference '{@link oracleDiffMM.DiffROOT_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see oracleDiffMM.DiffROOT_domainspecificdiffs#getEType()
	 * @see #getDiffROOT_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffROOT_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for enum '{@link oracleDiffMM.ClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Op</em>'.
	 * @see oracleDiffMM.ClassOp
	 * @generated
	 */
	EEnum getClassOp();

	/**
	 * Returns the meta object for enum '{@link oracleDiffMM.AscOp <em>Asc Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Op</em>'.
	 * @see oracleDiffMM.AscOp
	 * @generated
	 */
	EEnum getAscOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OracleDiffMMFactory getOracleDiffMMFactory();

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
		 * The meta object literal for the '{@link oracleDiffMM.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.AImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Ab</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__AB = eINSTANCE.getA_Ab();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__ID = eINSTANCE.getA_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__NAME = eINSTANCE.getA_Name();

		/**
		 * The meta object literal for the '<em><b>Diffab</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__DIFFAB = eINSTANCE.getA_Diffab();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.BImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Bd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B__BD = eINSTANCE.getB_Bd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__ID = eINSTANCE.getB_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__NAME = eINSTANCE.getB_Name();

		/**
		 * The meta object literal for the '<em><b>Diffbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B__DIFFBD = eINSTANCE.getB_Diffbd();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.CImpl <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.CImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C__X = eINSTANCE.getC_X();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DImpl <em>D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getD()
		 * @generated
		 */
		EClass D = eINSTANCE.getD();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__DD = eINSTANCE.getD_Dd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute D__ID = eINSTANCE.getD_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute D__NAME = eINSTANCE.getD_Name();

		/**
		 * The meta object literal for the '<em><b>Diffdd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference D__DIFFDD = eINSTANCE.getD_Diffdd();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.ROOTImpl <em>ROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.ROOTImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getROOT()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getROOT();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__B = eINSTANCE.getROOT_B();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__A = eINSTANCE.getROOT_A();

		/**
		 * The meta object literal for the '<em><b>Domainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DOMAINSPECIFICDIFFS = eINSTANCE.getROOT_Domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diffb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DIFFB = eINSTANCE.getROOT_Diffb();

		/**
		 * The meta object literal for the '<em><b>Diffa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DIFFA = eINSTANCE.getROOT_Diffa();

		/**
		 * The meta object literal for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DIFFDOMAINSPECIFICDIFFS = eINSTANCE.getROOT_Diffdomainspecificdiffs();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DomainSpecificDiffImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDomainSpecificDiff()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_DIFF = eINSTANCE.getDomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_DIFF__NAME = eINSTANCE.getDomainSpecificDiff_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_A();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_B();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_C();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff D</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_D();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffAImpl <em>Diff A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffAImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffA()
		 * @generated
		 */
		EClass DIFF_A = eINSTANCE.getDiffA();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_A__OPERATION = eINSTANCE.getDiffA_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_A__NEW_ID = eINSTANCE.getDiffA_New_id();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_A__NEW_NAME = eINSTANCE.getDiffA_New_Name();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffA_abImpl <em>Diff Aab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffA_abImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffA_ab()
		 * @generated
		 */
		EClass DIFF_AAB = eINSTANCE.getDiffA_ab();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_AAB__OPERATION = eINSTANCE.getDiffA_ab_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_AAB__ETYPE = eINSTANCE.getDiffA_ab_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffBImpl <em>Diff B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffBImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffB()
		 * @generated
		 */
		EClass DIFF_B = eINSTANCE.getDiffB();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_B__OPERATION = eINSTANCE.getDiffB_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_B__NEW_ID = eINSTANCE.getDiffB_New_id();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_B__NEW_NAME = eINSTANCE.getDiffB_New_Name();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffB_bdImpl <em>Diff Bbd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffB_bdImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffB_bd()
		 * @generated
		 */
		EClass DIFF_BBD = eINSTANCE.getDiffB_bd();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_BBD__OPERATION = eINSTANCE.getDiffB_bd_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_BBD__ETYPE = eINSTANCE.getDiffB_bd_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffCImpl <em>Diff C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffCImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffC()
		 * @generated
		 */
		EClass DIFF_C = eINSTANCE.getDiffC();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_C__OPERATION = eINSTANCE.getDiffC_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_C__NEW_ID = eINSTANCE.getDiffC_New_id();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_C__NEW_NAME = eINSTANCE.getDiffC_New_Name();

		/**
		 * The meta object literal for the '<em><b>New x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_C__NEW_X = eINSTANCE.getDiffC_New_x();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffDImpl <em>Diff D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffDImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffD()
		 * @generated
		 */
		EClass DIFF_D = eINSTANCE.getDiffD();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_D__OPERATION = eINSTANCE.getDiffD_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_D__NEW_ID = eINSTANCE.getDiffD_New_id();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_D__NEW_NAME = eINSTANCE.getDiffD_New_Name();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffD_ddImpl <em>Diff Ddd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffD_ddImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffD_dd()
		 * @generated
		 */
		EClass DIFF_DDD = eINSTANCE.getDiffD_dd();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DDD__OPERATION = eINSTANCE.getDiffD_dd_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DDD__ETYPE = eINSTANCE.getDiffD_dd_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffROOTImpl <em>Diff ROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffROOTImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT()
		 * @generated
		 */
		EClass DIFF_ROOT = eINSTANCE.getDiffROOT();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ROOT__OPERATION = eINSTANCE.getDiffROOT_Operation();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffROOT_bImpl <em>Diff ROOT b</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffROOT_bImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_b()
		 * @generated
		 */
		EClass DIFF_ROOT_B = eINSTANCE.getDiffROOT_b();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ROOT_B__OPERATION = eINSTANCE.getDiffROOT_b_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ROOT_B__ETYPE = eINSTANCE.getDiffROOT_b_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffROOT_aImpl <em>Diff ROOT a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffROOT_aImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_a()
		 * @generated
		 */
		EClass DIFF_ROOT_A = eINSTANCE.getDiffROOT_a();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ROOT_A__OPERATION = eINSTANCE.getDiffROOT_a_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ROOT_A__ETYPE = eINSTANCE.getDiffROOT_a_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.impl.DiffROOT_domainspecificdiffsImpl <em>Diff ROOT domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.impl.DiffROOT_domainspecificdiffsImpl
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getDiffROOT_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_ROOT_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffROOT_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ROOT_DOMAINSPECIFICDIFFS__OPERATION = eINSTANCE.getDiffROOT_domainspecificdiffs_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_ROOT_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffROOT_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.ClassOp <em>Class Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.ClassOp
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getClassOp()
		 * @generated
		 */
		EEnum CLASS_OP = eINSTANCE.getClassOp();

		/**
		 * The meta object literal for the '{@link oracleDiffMM.AscOp <em>Asc Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracleDiffMM.AscOp
		 * @see oracleDiffMM.impl.OracleDiffMMPackageImpl#getAscOp()
		 * @generated
		 */
		EEnum ASC_OP = eINSTANCE.getAscOp();

	}

} //OracleDiffMMPackage
