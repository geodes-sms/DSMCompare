/**
 */
package oracleRuleMM.impl;

import oracleRuleMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OracleRuleMMFactoryImpl extends EFactoryImpl implements OracleRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OracleRuleMMFactory init() {
		try {
			OracleRuleMMFactory theOracleRuleMMFactory = (OracleRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(OracleRuleMMPackage.eNS_URI);
			if (theOracleRuleMMFactory != null) {
				return theOracleRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OracleRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleRuleMMFactoryImpl() {
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
			case OracleRuleMMPackage.PATTERN_A: return createPattern_A();
			case OracleRuleMMPackage.PATTERN_B: return createPattern_B();
			case OracleRuleMMPackage.PATTERN_C: return createPattern_C();
			case OracleRuleMMPackage.PATTERN_D: return createPattern_D();
			case OracleRuleMMPackage.PATTERN_ROOT: return createPattern_ROOT();
			case OracleRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: return createPattern_DomainSpecificDiff();
			case OracleRuleMMPackage.PATTERN_DIFF_A: return createPattern_DiffA();
			case OracleRuleMMPackage.PATTERN_DIFF_AAB: return createPattern_DiffA_ab();
			case OracleRuleMMPackage.PATTERN_DIFF_B: return createPattern_DiffB();
			case OracleRuleMMPackage.PATTERN_DIFF_BBD: return createPattern_DiffB_bd();
			case OracleRuleMMPackage.PATTERN_DIFF_C: return createPattern_DiffC();
			case OracleRuleMMPackage.PATTERN_DIFF_D: return createPattern_DiffD();
			case OracleRuleMMPackage.PATTERN_DIFF_DDD: return createPattern_DiffD_dd();
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT: return createPattern_DiffROOT();
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_B: return createPattern_DiffROOT_b();
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_A: return createPattern_DiffROOT_a();
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS: return createPattern_DiffROOT_domainspecificdiffs();
			case OracleRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_A createPattern_A() {
		Pattern_AImpl pattern_A = new Pattern_AImpl();
		return pattern_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_B createPattern_B() {
		Pattern_BImpl pattern_B = new Pattern_BImpl();
		return pattern_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_C createPattern_C() {
		Pattern_CImpl pattern_C = new Pattern_CImpl();
		return pattern_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_D createPattern_D() {
		Pattern_DImpl pattern_D = new Pattern_DImpl();
		return pattern_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_ROOT createPattern_ROOT() {
		Pattern_ROOTImpl pattern_ROOT = new Pattern_ROOTImpl();
		return pattern_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff() {
		Pattern_DomainSpecificDiffImpl pattern_DomainSpecificDiff = new Pattern_DomainSpecificDiffImpl();
		return pattern_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffA createPattern_DiffA() {
		Pattern_DiffAImpl pattern_DiffA = new Pattern_DiffAImpl();
		return pattern_DiffA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffA_ab createPattern_DiffA_ab() {
		Pattern_DiffA_abImpl pattern_DiffA_ab = new Pattern_DiffA_abImpl();
		return pattern_DiffA_ab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffB createPattern_DiffB() {
		Pattern_DiffBImpl pattern_DiffB = new Pattern_DiffBImpl();
		return pattern_DiffB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffB_bd createPattern_DiffB_bd() {
		Pattern_DiffB_bdImpl pattern_DiffB_bd = new Pattern_DiffB_bdImpl();
		return pattern_DiffB_bd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffC createPattern_DiffC() {
		Pattern_DiffCImpl pattern_DiffC = new Pattern_DiffCImpl();
		return pattern_DiffC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffD createPattern_DiffD() {
		Pattern_DiffDImpl pattern_DiffD = new Pattern_DiffDImpl();
		return pattern_DiffD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffD_dd createPattern_DiffD_dd() {
		Pattern_DiffD_ddImpl pattern_DiffD_dd = new Pattern_DiffD_ddImpl();
		return pattern_DiffD_dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffROOT createPattern_DiffROOT() {
		Pattern_DiffROOTImpl pattern_DiffROOT = new Pattern_DiffROOTImpl();
		return pattern_DiffROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffROOT_b createPattern_DiffROOT_b() {
		Pattern_DiffROOT_bImpl pattern_DiffROOT_b = new Pattern_DiffROOT_bImpl();
		return pattern_DiffROOT_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffROOT_a createPattern_DiffROOT_a() {
		Pattern_DiffROOT_aImpl pattern_DiffROOT_a = new Pattern_DiffROOT_aImpl();
		return pattern_DiffROOT_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffROOT_domainspecificdiffs createPattern_DiffROOT_domainspecificdiffs() {
		Pattern_DiffROOT_domainspecificdiffsImpl pattern_DiffROOT_domainspecificdiffs = new Pattern_DiffROOT_domainspecificdiffsImpl();
		return pattern_DiffROOT_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleRuleMMPackage getOracleRuleMMPackage() {
		return (OracleRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OracleRuleMMPackage getPackage() {
		return OracleRuleMMPackage.eINSTANCE;
	}

} //OracleRuleMMFactoryImpl
