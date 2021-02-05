/**
 */
package oracleDiffMM.impl;

import oracleDiffMM.AscOp;
import oracleDiffMM.ClassOp;
import oracleDiffMM.DiffA;
import oracleDiffMM.DiffA_ab;
import oracleDiffMM.DiffB;
import oracleDiffMM.DiffB_bd;
import oracleDiffMM.DiffC;
import oracleDiffMM.DiffD;
import oracleDiffMM.DiffD_dd;
import oracleDiffMM.DiffROOT;
import oracleDiffMM.DiffROOT_a;
import oracleDiffMM.DiffROOT_b;
import oracleDiffMM.DiffROOT_domainspecificdiffs;
import oracleDiffMM.DomainSpecificDiff;
import oracleDiffMM.OracleDiffMMFactory;
import oracleDiffMM.OracleDiffMMPackage;

import oracleRuleMM.OracleRuleMMPackage;
import oracleRuleMM.impl.OracleRuleMMPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleDiffMMPackageImpl extends EPackageImpl implements OracleDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffA_abEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffB_bdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffD_ddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffROOTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffROOT_bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffROOT_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffROOT_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascOpEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see oracleDiffMM.OracleDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OracleDiffMMPackageImpl() {
		super(eNS_URI, OracleDiffMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OracleDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OracleDiffMMPackage init() {
		if (isInited) return (OracleDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(OracleDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOracleDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OracleDiffMMPackageImpl theOracleDiffMMPackage = registeredOracleDiffMMPackage instanceof OracleDiffMMPackageImpl ? (OracleDiffMMPackageImpl)registeredOracleDiffMMPackage : new OracleDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OracleRuleMMPackage.eNS_URI);
		OracleRuleMMPackageImpl theOracleRuleMMPackage = (OracleRuleMMPackageImpl)(registeredPackage instanceof OracleRuleMMPackageImpl ? registeredPackage : OracleRuleMMPackage.eINSTANCE);

		// Create package meta-data objects
		theOracleDiffMMPackage.createPackageContents();
		theOracleRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theOracleDiffMMPackage.initializePackageContents();
		theOracleRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOracleDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OracleDiffMMPackage.eNS_URI, theOracleDiffMMPackage);
		return theOracleDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getA_Ab() {
		return (EReference)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getA_Id() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getA_Name() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getA_Diffab() {
		return (EReference)aEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getB_Bd() {
		return (EReference)bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getB_Id() {
		return (EAttribute)bEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getB_Name() {
		return (EAttribute)bEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getB_Diffbd() {
		return (EReference)bEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getC() {
		return cEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getC_X() {
		return (EAttribute)cEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getD() {
		return dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getD_Dd() {
		return (EReference)dEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getD_Id() {
		return (EAttribute)dEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getD_Name() {
		return (EAttribute)dEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getD_Diffdd() {
		return (EReference)dEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getROOT() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_B() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_A() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_Domainspecificdiffs() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_Diffb() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_Diffa() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROOT_Diffdomainspecificdiffs() {
		return (EReference)rootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainSpecificDiff() {
		return domainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecificDiff_Name() {
		return (EAttribute)domainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_A() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_B() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_C() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_D() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffA() {
		return diffAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffA_Operation() {
		return (EAttribute)diffAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffA_New_id() {
		return (EAttribute)diffAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffA_New_Name() {
		return (EAttribute)diffAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffA_ab() {
		return diffA_abEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffA_ab_Operation() {
		return (EAttribute)diffA_abEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffA_ab_EType() {
		return (EReference)diffA_abEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffB() {
		return diffBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffB_Operation() {
		return (EAttribute)diffBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffB_New_id() {
		return (EAttribute)diffBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffB_New_Name() {
		return (EAttribute)diffBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffB_bd() {
		return diffB_bdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffB_bd_Operation() {
		return (EAttribute)diffB_bdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffB_bd_EType() {
		return (EReference)diffB_bdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffC() {
		return diffCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffC_Operation() {
		return (EAttribute)diffCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffC_New_id() {
		return (EAttribute)diffCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffC_New_Name() {
		return (EAttribute)diffCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffC_New_x() {
		return (EAttribute)diffCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffD() {
		return diffDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffD_Operation() {
		return (EAttribute)diffDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffD_New_id() {
		return (EAttribute)diffDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffD_New_Name() {
		return (EAttribute)diffDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffD_dd() {
		return diffD_ddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffD_dd_Operation() {
		return (EAttribute)diffD_ddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffD_dd_EType() {
		return (EReference)diffD_ddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffROOT() {
		return diffROOTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffROOT_Operation() {
		return (EAttribute)diffROOTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffROOT_b() {
		return diffROOT_bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffROOT_b_Operation() {
		return (EAttribute)diffROOT_bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffROOT_b_EType() {
		return (EReference)diffROOT_bEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffROOT_a() {
		return diffROOT_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffROOT_a_Operation() {
		return (EAttribute)diffROOT_aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffROOT_a_EType() {
		return (EReference)diffROOT_aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffROOT_domainspecificdiffs() {
		return diffROOT_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffROOT_domainspecificdiffs_Operation() {
		return (EAttribute)diffROOT_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffROOT_domainspecificdiffs_EType() {
		return (EReference)diffROOT_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClassOp() {
		return classOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAscOp() {
		return ascOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleDiffMMFactory getOracleDiffMMFactory() {
		return (OracleDiffMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aEClass = createEClass(A);
		createEReference(aEClass, A__AB);
		createEAttribute(aEClass, A__ID);
		createEAttribute(aEClass, A__NAME);
		createEReference(aEClass, A__DIFFAB);

		bEClass = createEClass(B);
		createEReference(bEClass, B__BD);
		createEAttribute(bEClass, B__ID);
		createEAttribute(bEClass, B__NAME);
		createEReference(bEClass, B__DIFFBD);

		cEClass = createEClass(C);
		createEAttribute(cEClass, C__X);

		dEClass = createEClass(D);
		createEReference(dEClass, D__DD);
		createEAttribute(dEClass, D__ID);
		createEAttribute(dEClass, D__NAME);
		createEReference(dEClass, D__DIFFDD);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__B);
		createEReference(rootEClass, ROOT__A);
		createEReference(rootEClass, ROOT__DOMAINSPECIFICDIFFS);
		createEReference(rootEClass, ROOT__DIFFB);
		createEReference(rootEClass, ROOT__DIFFA);
		createEReference(rootEClass, ROOT__DIFFDOMAINSPECIFICDIFFS);

		domainSpecificDiffEClass = createEClass(DOMAIN_SPECIFIC_DIFF);
		createEAttribute(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__NAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D);

		diffAEClass = createEClass(DIFF_A);
		createEAttribute(diffAEClass, DIFF_A__OPERATION);
		createEAttribute(diffAEClass, DIFF_A__NEW_ID);
		createEAttribute(diffAEClass, DIFF_A__NEW_NAME);

		diffA_abEClass = createEClass(DIFF_AAB);
		createEAttribute(diffA_abEClass, DIFF_AAB__OPERATION);
		createEReference(diffA_abEClass, DIFF_AAB__ETYPE);

		diffBEClass = createEClass(DIFF_B);
		createEAttribute(diffBEClass, DIFF_B__OPERATION);
		createEAttribute(diffBEClass, DIFF_B__NEW_ID);
		createEAttribute(diffBEClass, DIFF_B__NEW_NAME);

		diffB_bdEClass = createEClass(DIFF_BBD);
		createEAttribute(diffB_bdEClass, DIFF_BBD__OPERATION);
		createEReference(diffB_bdEClass, DIFF_BBD__ETYPE);

		diffCEClass = createEClass(DIFF_C);
		createEAttribute(diffCEClass, DIFF_C__OPERATION);
		createEAttribute(diffCEClass, DIFF_C__NEW_ID);
		createEAttribute(diffCEClass, DIFF_C__NEW_NAME);
		createEAttribute(diffCEClass, DIFF_C__NEW_X);

		diffDEClass = createEClass(DIFF_D);
		createEAttribute(diffDEClass, DIFF_D__OPERATION);
		createEAttribute(diffDEClass, DIFF_D__NEW_ID);
		createEAttribute(diffDEClass, DIFF_D__NEW_NAME);

		diffD_ddEClass = createEClass(DIFF_DDD);
		createEAttribute(diffD_ddEClass, DIFF_DDD__OPERATION);
		createEReference(diffD_ddEClass, DIFF_DDD__ETYPE);

		diffROOTEClass = createEClass(DIFF_ROOT);
		createEAttribute(diffROOTEClass, DIFF_ROOT__OPERATION);

		diffROOT_bEClass = createEClass(DIFF_ROOT_B);
		createEAttribute(diffROOT_bEClass, DIFF_ROOT_B__OPERATION);
		createEReference(diffROOT_bEClass, DIFF_ROOT_B__ETYPE);

		diffROOT_aEClass = createEClass(DIFF_ROOT_A);
		createEAttribute(diffROOT_aEClass, DIFF_ROOT_A__OPERATION);
		createEReference(diffROOT_aEClass, DIFF_ROOT_A__ETYPE);

		diffROOT_domainspecificdiffsEClass = createEClass(DIFF_ROOT_DOMAINSPECIFICDIFFS);
		createEAttribute(diffROOT_domainspecificdiffsEClass, DIFF_ROOT_DOMAINSPECIFICDIFFS__OPERATION);
		createEReference(diffROOT_domainspecificdiffsEClass, DIFF_ROOT_DOMAINSPECIFICDIFFS__ETYPE);

		// Create enums
		classOpEEnum = createEEnum(CLASS_OP);
		ascOpEEnum = createEEnum(ASC_OP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cEClass.getESuperTypes().add(this.getB());
		diffAEClass.getESuperTypes().add(this.getA());
		diffBEClass.getESuperTypes().add(this.getB());
		diffCEClass.getESuperTypes().add(this.getC());
		diffDEClass.getESuperTypes().add(this.getD());
		diffROOTEClass.getESuperTypes().add(this.getROOT());

		// Initialize classes, features, and operations; add parameters
		initEClass(aEClass, oracleDiffMM.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA_Ab(), this.getB(), null, "ab", null, 0, -1, oracleDiffMM.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Id(), ecorePackage.getEInt(), "id", null, 0, 1, oracleDiffMM.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Name(), ecorePackage.getEString(), "Name", null, 0, 1, oracleDiffMM.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_Diffab(), this.getDiffA_ab(), null, "diffab", null, 0, -1, oracleDiffMM.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bEClass, oracleDiffMM.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getB_Bd(), this.getD(), null, "bd", null, 0, -1, oracleDiffMM.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getB_Id(), ecorePackage.getEInt(), "id", null, 0, 1, oracleDiffMM.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getB_Name(), ecorePackage.getEString(), "Name", null, 0, 1, oracleDiffMM.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getB_Diffbd(), this.getDiffB_bd(), null, "diffbd", null, 0, -1, oracleDiffMM.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEClass, oracleDiffMM.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_X(), ecorePackage.getEInt(), "x", null, 0, 1, oracleDiffMM.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dEClass, oracleDiffMM.D.class, "D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getD_Dd(), this.getD(), null, "dd", null, 0, -1, oracleDiffMM.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD_Id(), ecorePackage.getEInt(), "id", null, 0, 1, oracleDiffMM.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD_Name(), ecorePackage.getEString(), "Name", null, 0, 1, oracleDiffMM.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getD_Diffdd(), this.getDiffD_dd(), null, "diffdd", null, 0, -1, oracleDiffMM.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, oracleDiffMM.ROOT.class, "ROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROOT_B(), this.getB(), null, "b", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_A(), this.getA(), null, "a", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Domainspecificdiffs(), this.getDomainSpecificDiff(), null, "domainspecificdiffs", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Diffb(), this.getDiffROOT_b(), null, "diffb", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Diffa(), this.getDiffROOT_a(), null, "diffa", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Diffdomainspecificdiffs(), this.getDiffROOT_domainspecificdiffs(), null, "diffdomainspecificdiffs", null, 0, -1, oracleDiffMM.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificDiffEClass, DomainSpecificDiff.class, "DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificDiff_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_A(), this.getA(), null, "DomainSpecificDiff_A", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_B(), this.getB(), null, "DomainSpecificDiff_B", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_C(), this.getC(), null, "DomainSpecificDiff_C", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_D(), this.getD(), null, "DomainSpecificDiff_D", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffAEClass, DiffA.class, "DiffA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffA_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffA_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffA_New_Name(), ecorePackage.getEString(), "new_Name", null, 0, 1, DiffA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffA_abEClass, DiffA_ab.class, "DiffA_ab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffA_ab_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffA_ab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffA_ab_EType(), this.getB(), null, "eType", null, 1, 1, DiffA_ab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffBEClass, DiffB.class, "DiffB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffB_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffB_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffB_New_Name(), ecorePackage.getEString(), "new_Name", null, 0, 1, DiffB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffB_bdEClass, DiffB_bd.class, "DiffB_bd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffB_bd_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffB_bd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffB_bd_EType(), this.getD(), null, "eType", null, 1, 1, DiffB_bd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffCEClass, DiffC.class, "DiffC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffC_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffC_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffC_New_Name(), ecorePackage.getEString(), "new_Name", null, 0, 1, DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffC_New_x(), ecorePackage.getEInt(), "new_x", null, 0, 1, DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffDEClass, DiffD.class, "DiffD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffD_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffD_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffD_New_Name(), ecorePackage.getEString(), "new_Name", null, 0, 1, DiffD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffD_ddEClass, DiffD_dd.class, "DiffD_dd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffD_dd_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffD_dd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffD_dd_EType(), this.getD(), null, "eType", null, 1, 1, DiffD_dd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffROOTEClass, DiffROOT.class, "DiffROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffROOT_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffROOT_bEClass, DiffROOT_b.class, "DiffROOT_b", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffROOT_b_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffROOT_b.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffROOT_b_EType(), this.getB(), null, "eType", null, 1, 1, DiffROOT_b.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffROOT_aEClass, DiffROOT_a.class, "DiffROOT_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffROOT_a_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffROOT_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffROOT_a_EType(), this.getA(), null, "eType", null, 1, 1, DiffROOT_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffROOT_domainspecificdiffsEClass, DiffROOT_domainspecificdiffs.class, "DiffROOT_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffROOT_domainspecificdiffs_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffROOT_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffROOT_domainspecificdiffs_EType(), this.getDomainSpecificDiff(), null, "eType", null, 1, 1, DiffROOT_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classOpEEnum, ClassOp.class, "ClassOp");
		addEEnumLiteral(classOpEEnum, ClassOp.ADD);
		addEEnumLiteral(classOpEEnum, ClassOp.DELETE);
		addEEnumLiteral(classOpEEnum, ClassOp.MODIFY);

		initEEnum(ascOpEEnum, AscOp.class, "AscOp");
		addEEnumLiteral(ascOpEEnum, AscOp.ADD);
		addEEnumLiteral(ascOpEEnum, AscOp.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //OracleDiffMMPackageImpl
