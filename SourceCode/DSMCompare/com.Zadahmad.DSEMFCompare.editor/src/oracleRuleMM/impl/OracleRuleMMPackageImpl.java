/**
 */
package oracleRuleMM.impl;

import oracleDiffMM.OracleDiffMMPackage;

import oracleDiffMM.impl.OracleDiffMMPackageImpl;

import oracleRuleMM.OracleRuleMMFactory;
import oracleRuleMM.OracleRuleMMPackage;
import oracleRuleMM.Pattern_A;
import oracleRuleMM.Pattern_B;
import oracleRuleMM.Pattern_C;
import oracleRuleMM.Pattern_D;
import oracleRuleMM.Pattern_DiffA;
import oracleRuleMM.Pattern_DiffA_ab;
import oracleRuleMM.Pattern_DiffB;
import oracleRuleMM.Pattern_DiffB_bd;
import oracleRuleMM.Pattern_DiffC;
import oracleRuleMM.Pattern_DiffD;
import oracleRuleMM.Pattern_DiffD_dd;
import oracleRuleMM.Pattern_DiffROOT;
import oracleRuleMM.Pattern_DiffROOT_a;
import oracleRuleMM.Pattern_DiffROOT_b;
import oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs;
import oracleRuleMM.Pattern_DomainSpecificDiff;
import oracleRuleMM.Pattern_ROOT;
import oracleRuleMM.Rule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleRuleMMPackageImpl extends EPackageImpl implements OracleRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_AEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_BEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_CEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ROOTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DomainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffA_abEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffB_bdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffD_ddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffROOTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffROOT_bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffROOT_aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffROOT_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

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
	 * @see oracleRuleMM.OracleRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OracleRuleMMPackageImpl() {
		super(eNS_URI, OracleRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OracleRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OracleRuleMMPackage init() {
		if (isInited) return (OracleRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(OracleRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOracleRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OracleRuleMMPackageImpl theOracleRuleMMPackage = registeredOracleRuleMMPackage instanceof OracleRuleMMPackageImpl ? (OracleRuleMMPackageImpl)registeredOracleRuleMMPackage : new OracleRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OracleDiffMMPackage.eNS_URI);
		OracleDiffMMPackageImpl theOracleDiffMMPackage = (OracleDiffMMPackageImpl)(registeredPackage instanceof OracleDiffMMPackageImpl ? registeredPackage : OracleDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		theOracleRuleMMPackage.createPackageContents();
		theOracleDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theOracleRuleMMPackage.initializePackageContents();
		theOracleDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOracleRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OracleRuleMMPackage.eNS_URI, theOracleRuleMMPackage);
		return theOracleRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_A() {
		return pattern_AEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_A_ID_Pattern() {
		return (EAttribute)pattern_AEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_A_Filter() {
		return (EAttribute)pattern_AEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_B() {
		return pattern_BEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_B_ID_Pattern() {
		return (EAttribute)pattern_BEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_B_Filter() {
		return (EAttribute)pattern_BEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_C() {
		return pattern_CEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_C_ID_Pattern() {
		return (EAttribute)pattern_CEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_C_Filter() {
		return (EAttribute)pattern_CEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_D() {
		return pattern_DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_D_ID_Pattern() {
		return (EAttribute)pattern_DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_D_Filter() {
		return (EAttribute)pattern_DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_ROOT() {
		return pattern_ROOTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ROOT_ID_Pattern() {
		return (EAttribute)pattern_ROOTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ROOT_Filter() {
		return (EAttribute)pattern_ROOTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DomainSpecificDiff() {
		return pattern_DomainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_ID_Pattern() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_Filter() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffA() {
		return pattern_DiffAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffA_ID_Pattern() {
		return (EAttribute)pattern_DiffAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffA_Filter() {
		return (EAttribute)pattern_DiffAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffA_ab() {
		return pattern_DiffA_abEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffA_ab_ID_Pattern() {
		return (EAttribute)pattern_DiffA_abEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffA_ab_Filter() {
		return (EAttribute)pattern_DiffA_abEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffB() {
		return pattern_DiffBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffB_ID_Pattern() {
		return (EAttribute)pattern_DiffBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffB_Filter() {
		return (EAttribute)pattern_DiffBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffB_bd() {
		return pattern_DiffB_bdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffB_bd_ID_Pattern() {
		return (EAttribute)pattern_DiffB_bdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffB_bd_Filter() {
		return (EAttribute)pattern_DiffB_bdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffC() {
		return pattern_DiffCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffC_ID_Pattern() {
		return (EAttribute)pattern_DiffCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffC_Filter() {
		return (EAttribute)pattern_DiffCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffD() {
		return pattern_DiffDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffD_ID_Pattern() {
		return (EAttribute)pattern_DiffDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffD_Filter() {
		return (EAttribute)pattern_DiffDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffD_dd() {
		return pattern_DiffD_ddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffD_dd_ID_Pattern() {
		return (EAttribute)pattern_DiffD_ddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffD_dd_Filter() {
		return (EAttribute)pattern_DiffD_ddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffROOT() {
		return pattern_DiffROOTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_ID_Pattern() {
		return (EAttribute)pattern_DiffROOTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_Filter() {
		return (EAttribute)pattern_DiffROOTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffROOT_b() {
		return pattern_DiffROOT_bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_b_ID_Pattern() {
		return (EAttribute)pattern_DiffROOT_bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_b_Filter() {
		return (EAttribute)pattern_DiffROOT_bEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffROOT_a() {
		return pattern_DiffROOT_aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_a_ID_Pattern() {
		return (EAttribute)pattern_DiffROOT_aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_a_Filter() {
		return (EAttribute)pattern_DiffROOT_aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffROOT_domainspecificdiffs() {
		return pattern_DiffROOT_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_domainspecificdiffs_ID_Pattern() {
		return (EAttribute)pattern_DiffROOT_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffROOT_domainspecificdiffs_Filter() {
		return (EAttribute)pattern_DiffROOT_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Pattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleRuleMMFactory getOracleRuleMMFactory() {
		return (OracleRuleMMFactory)getEFactoryInstance();
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
		pattern_AEClass = createEClass(PATTERN_A);
		createEAttribute(pattern_AEClass, PATTERN_A__ID_PATTERN);
		createEAttribute(pattern_AEClass, PATTERN_A__FILTER);

		pattern_BEClass = createEClass(PATTERN_B);
		createEAttribute(pattern_BEClass, PATTERN_B__ID_PATTERN);
		createEAttribute(pattern_BEClass, PATTERN_B__FILTER);

		pattern_CEClass = createEClass(PATTERN_C);
		createEAttribute(pattern_CEClass, PATTERN_C__ID_PATTERN);
		createEAttribute(pattern_CEClass, PATTERN_C__FILTER);

		pattern_DEClass = createEClass(PATTERN_D);
		createEAttribute(pattern_DEClass, PATTERN_D__ID_PATTERN);
		createEAttribute(pattern_DEClass, PATTERN_D__FILTER);

		pattern_ROOTEClass = createEClass(PATTERN_ROOT);
		createEAttribute(pattern_ROOTEClass, PATTERN_ROOT__ID_PATTERN);
		createEAttribute(pattern_ROOTEClass, PATTERN_ROOT__FILTER);

		pattern_DomainSpecificDiffEClass = createEClass(PATTERN_DOMAIN_SPECIFIC_DIFF);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER);

		pattern_DiffAEClass = createEClass(PATTERN_DIFF_A);
		createEAttribute(pattern_DiffAEClass, PATTERN_DIFF_A__ID_PATTERN);
		createEAttribute(pattern_DiffAEClass, PATTERN_DIFF_A__FILTER);

		pattern_DiffA_abEClass = createEClass(PATTERN_DIFF_AAB);
		createEAttribute(pattern_DiffA_abEClass, PATTERN_DIFF_AAB__ID_PATTERN);
		createEAttribute(pattern_DiffA_abEClass, PATTERN_DIFF_AAB__FILTER);

		pattern_DiffBEClass = createEClass(PATTERN_DIFF_B);
		createEAttribute(pattern_DiffBEClass, PATTERN_DIFF_B__ID_PATTERN);
		createEAttribute(pattern_DiffBEClass, PATTERN_DIFF_B__FILTER);

		pattern_DiffB_bdEClass = createEClass(PATTERN_DIFF_BBD);
		createEAttribute(pattern_DiffB_bdEClass, PATTERN_DIFF_BBD__ID_PATTERN);
		createEAttribute(pattern_DiffB_bdEClass, PATTERN_DIFF_BBD__FILTER);

		pattern_DiffCEClass = createEClass(PATTERN_DIFF_C);
		createEAttribute(pattern_DiffCEClass, PATTERN_DIFF_C__ID_PATTERN);
		createEAttribute(pattern_DiffCEClass, PATTERN_DIFF_C__FILTER);

		pattern_DiffDEClass = createEClass(PATTERN_DIFF_D);
		createEAttribute(pattern_DiffDEClass, PATTERN_DIFF_D__ID_PATTERN);
		createEAttribute(pattern_DiffDEClass, PATTERN_DIFF_D__FILTER);

		pattern_DiffD_ddEClass = createEClass(PATTERN_DIFF_DDD);
		createEAttribute(pattern_DiffD_ddEClass, PATTERN_DIFF_DDD__ID_PATTERN);
		createEAttribute(pattern_DiffD_ddEClass, PATTERN_DIFF_DDD__FILTER);

		pattern_DiffROOTEClass = createEClass(PATTERN_DIFF_ROOT);
		createEAttribute(pattern_DiffROOTEClass, PATTERN_DIFF_ROOT__ID_PATTERN);
		createEAttribute(pattern_DiffROOTEClass, PATTERN_DIFF_ROOT__FILTER);

		pattern_DiffROOT_bEClass = createEClass(PATTERN_DIFF_ROOT_B);
		createEAttribute(pattern_DiffROOT_bEClass, PATTERN_DIFF_ROOT_B__ID_PATTERN);
		createEAttribute(pattern_DiffROOT_bEClass, PATTERN_DIFF_ROOT_B__FILTER);

		pattern_DiffROOT_aEClass = createEClass(PATTERN_DIFF_ROOT_A);
		createEAttribute(pattern_DiffROOT_aEClass, PATTERN_DIFF_ROOT_A__ID_PATTERN);
		createEAttribute(pattern_DiffROOT_aEClass, PATTERN_DIFF_ROOT_A__FILTER);

		pattern_DiffROOT_domainspecificdiffsEClass = createEClass(PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS);
		createEAttribute(pattern_DiffROOT_domainspecificdiffsEClass, PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__ID_PATTERN);
		createEAttribute(pattern_DiffROOT_domainspecificdiffsEClass, PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS__FILTER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__PATTERN);
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

		// Obtain other dependent packages
		OracleDiffMMPackage theOracleDiffMMPackage = (OracleDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(OracleDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_AEClass.getESuperTypes().add(theOracleDiffMMPackage.getA());
		pattern_BEClass.getESuperTypes().add(theOracleDiffMMPackage.getB());
		pattern_CEClass.getESuperTypes().add(theOracleDiffMMPackage.getC());
		pattern_DEClass.getESuperTypes().add(theOracleDiffMMPackage.getD());
		pattern_ROOTEClass.getESuperTypes().add(theOracleDiffMMPackage.getROOT());
		pattern_DomainSpecificDiffEClass.getESuperTypes().add(theOracleDiffMMPackage.getDomainSpecificDiff());
		pattern_DiffAEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffA());
		pattern_DiffA_abEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffA_ab());
		pattern_DiffBEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffB());
		pattern_DiffB_bdEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffB_bd());
		pattern_DiffCEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffC());
		pattern_DiffDEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffD());
		pattern_DiffD_ddEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffD_dd());
		pattern_DiffROOTEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffROOT());
		pattern_DiffROOT_bEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffROOT_b());
		pattern_DiffROOT_aEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffROOT_a());
		pattern_DiffROOT_domainspecificdiffsEClass.getESuperTypes().add(theOracleDiffMMPackage.getDiffROOT_domainspecificdiffs());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_AEClass, Pattern_A.class, "Pattern_A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_A_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_A_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_BEClass, Pattern_B.class, "Pattern_B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_B_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_B_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_CEClass, Pattern_C.class, "Pattern_C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_C_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_C_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DEClass, Pattern_D.class, "Pattern_D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_D_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_D_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ROOTEClass, Pattern_ROOT.class, "Pattern_ROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ROOT_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ROOT_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DomainSpecificDiffEClass, Pattern_DomainSpecificDiff.class, "Pattern_DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DomainSpecificDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DomainSpecificDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffAEClass, Pattern_DiffA.class, "Pattern_DiffA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffA_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffA_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffA_abEClass, Pattern_DiffA_ab.class, "Pattern_DiffA_ab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffA_ab_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffA_ab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffA_ab_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffA_ab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffBEClass, Pattern_DiffB.class, "Pattern_DiffB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffB_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffB_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffB_bdEClass, Pattern_DiffB_bd.class, "Pattern_DiffB_bd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffB_bd_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffB_bd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffB_bd_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffB_bd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffCEClass, Pattern_DiffC.class, "Pattern_DiffC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffC_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffC_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDEClass, Pattern_DiffD.class, "Pattern_DiffD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffD_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffD_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffD_ddEClass, Pattern_DiffD_dd.class, "Pattern_DiffD_dd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffD_dd_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffD_dd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffD_dd_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffD_dd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffROOTEClass, Pattern_DiffROOT.class, "Pattern_DiffROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffROOT_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffROOT_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffROOT_bEClass, Pattern_DiffROOT_b.class, "Pattern_DiffROOT_b", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffROOT_b_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffROOT_b.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffROOT_b_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffROOT_b.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffROOT_aEClass, Pattern_DiffROOT_a.class, "Pattern_DiffROOT_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffROOT_a_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffROOT_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffROOT_a_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffROOT_a.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffROOT_domainspecificdiffsEClass, Pattern_DiffROOT_domainspecificdiffs.class, "Pattern_DiffROOT_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffROOT_domainspecificdiffs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffROOT_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffROOT_domainspecificdiffs_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffROOT_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pattern(), this.getPattern_ROOT(), null, "pattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OracleRuleMMPackageImpl
