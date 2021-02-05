/**
 */
package oracleDiffMM.impl;

import oracleDiffMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OracleDiffMMFactoryImpl extends EFactoryImpl implements OracleDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OracleDiffMMFactory init() {
		try {
			OracleDiffMMFactory theOracleDiffMMFactory = (OracleDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(OracleDiffMMPackage.eNS_URI);
			if (theOracleDiffMMFactory != null) {
				return theOracleDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OracleDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleDiffMMFactoryImpl() {
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
			case OracleDiffMMPackage.A: return createA();
			case OracleDiffMMPackage.B: return createB();
			case OracleDiffMMPackage.C: return createC();
			case OracleDiffMMPackage.D: return createD();
			case OracleDiffMMPackage.ROOT: return createROOT();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case OracleDiffMMPackage.DIFF_A: return createDiffA();
			case OracleDiffMMPackage.DIFF_AAB: return createDiffA_ab();
			case OracleDiffMMPackage.DIFF_B: return createDiffB();
			case OracleDiffMMPackage.DIFF_BBD: return createDiffB_bd();
			case OracleDiffMMPackage.DIFF_C: return createDiffC();
			case OracleDiffMMPackage.DIFF_D: return createDiffD();
			case OracleDiffMMPackage.DIFF_DDD: return createDiffD_dd();
			case OracleDiffMMPackage.DIFF_ROOT: return createDiffROOT();
			case OracleDiffMMPackage.DIFF_ROOT_B: return createDiffROOT_b();
			case OracleDiffMMPackage.DIFF_ROOT_A: return createDiffROOT_a();
			case OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS: return createDiffROOT_domainspecificdiffs();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OracleDiffMMPackage.CLASS_OP:
				return createClassOpFromString(eDataType, initialValue);
			case OracleDiffMMPackage.ASC_OP:
				return createAscOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OracleDiffMMPackage.CLASS_OP:
				return convertClassOpToString(eDataType, instanceValue);
			case OracleDiffMMPackage.ASC_OP:
				return convertAscOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A createA() {
		AImpl a = new AImpl();
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C createC() {
		CImpl c = new CImpl();
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public D createD() {
		DImpl d = new DImpl();
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROOT createROOT() {
		ROOTImpl root = new ROOTImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffA createDiffA() {
		DiffAImpl diffA = new DiffAImpl();
		return diffA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffA_ab createDiffA_ab() {
		DiffA_abImpl diffA_ab = new DiffA_abImpl();
		return diffA_ab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffB createDiffB() {
		DiffBImpl diffB = new DiffBImpl();
		return diffB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffB_bd createDiffB_bd() {
		DiffB_bdImpl diffB_bd = new DiffB_bdImpl();
		return diffB_bd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffC createDiffC() {
		DiffCImpl diffC = new DiffCImpl();
		return diffC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffD createDiffD() {
		DiffDImpl diffD = new DiffDImpl();
		return diffD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffD_dd createDiffD_dd() {
		DiffD_ddImpl diffD_dd = new DiffD_ddImpl();
		return diffD_dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffROOT createDiffROOT() {
		DiffROOTImpl diffROOT = new DiffROOTImpl();
		return diffROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffROOT_b createDiffROOT_b() {
		DiffROOT_bImpl diffROOT_b = new DiffROOT_bImpl();
		return diffROOT_b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffROOT_a createDiffROOT_a() {
		DiffROOT_aImpl diffROOT_a = new DiffROOT_aImpl();
		return diffROOT_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffROOT_domainspecificdiffs createDiffROOT_domainspecificdiffs() {
		DiffROOT_domainspecificdiffsImpl diffROOT_domainspecificdiffs = new DiffROOT_domainspecificdiffsImpl();
		return diffROOT_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp createClassOpFromString(EDataType eDataType, String initialValue) {
		ClassOp result = ClassOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscOp createAscOpFromString(EDataType eDataType, String initialValue) {
		AscOp result = AscOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OracleDiffMMPackage getOracleDiffMMPackage() {
		return (OracleDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OracleDiffMMPackage getPackage() {
		return OracleDiffMMPackage.eINSTANCE;
	}

} //OracleDiffMMFactoryImpl
