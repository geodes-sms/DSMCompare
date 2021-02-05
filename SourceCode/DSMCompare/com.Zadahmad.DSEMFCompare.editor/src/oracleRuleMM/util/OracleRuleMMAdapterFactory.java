/**
 */
package oracleRuleMM.util;

import oracleDiffMM.A;
import oracleDiffMM.B;
import oracleDiffMM.C;
import oracleDiffMM.D;
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
import oracleDiffMM.ROOT;

import oracleRuleMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oracleRuleMM.OracleRuleMMPackage
 * @generated
 */
public class OracleRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OracleRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OracleRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OracleRuleMMSwitch<Adapter> modelSwitch =
		new OracleRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_A(Pattern_A object) {
				return createPattern_AAdapter();
			}
			@Override
			public Adapter casePattern_B(Pattern_B object) {
				return createPattern_BAdapter();
			}
			@Override
			public Adapter casePattern_C(Pattern_C object) {
				return createPattern_CAdapter();
			}
			@Override
			public Adapter casePattern_D(Pattern_D object) {
				return createPattern_DAdapter();
			}
			@Override
			public Adapter casePattern_ROOT(Pattern_ROOT object) {
				return createPattern_ROOTAdapter();
			}
			@Override
			public Adapter casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
				return createPattern_DomainSpecificDiffAdapter();
			}
			@Override
			public Adapter casePattern_DiffA(Pattern_DiffA object) {
				return createPattern_DiffAAdapter();
			}
			@Override
			public Adapter casePattern_DiffA_ab(Pattern_DiffA_ab object) {
				return createPattern_DiffA_abAdapter();
			}
			@Override
			public Adapter casePattern_DiffB(Pattern_DiffB object) {
				return createPattern_DiffBAdapter();
			}
			@Override
			public Adapter casePattern_DiffB_bd(Pattern_DiffB_bd object) {
				return createPattern_DiffB_bdAdapter();
			}
			@Override
			public Adapter casePattern_DiffC(Pattern_DiffC object) {
				return createPattern_DiffCAdapter();
			}
			@Override
			public Adapter casePattern_DiffD(Pattern_DiffD object) {
				return createPattern_DiffDAdapter();
			}
			@Override
			public Adapter casePattern_DiffD_dd(Pattern_DiffD_dd object) {
				return createPattern_DiffD_ddAdapter();
			}
			@Override
			public Adapter casePattern_DiffROOT(Pattern_DiffROOT object) {
				return createPattern_DiffROOTAdapter();
			}
			@Override
			public Adapter casePattern_DiffROOT_b(Pattern_DiffROOT_b object) {
				return createPattern_DiffROOT_bAdapter();
			}
			@Override
			public Adapter casePattern_DiffROOT_a(Pattern_DiffROOT_a object) {
				return createPattern_DiffROOT_aAdapter();
			}
			@Override
			public Adapter casePattern_DiffROOT_domainspecificdiffs(Pattern_DiffROOT_domainspecificdiffs object) {
				return createPattern_DiffROOT_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseA(A object) {
				return createAAdapter();
			}
			@Override
			public Adapter caseB(B object) {
				return createBAdapter();
			}
			@Override
			public Adapter caseC(C object) {
				return createCAdapter();
			}
			@Override
			public Adapter caseD(D object) {
				return createDAdapter();
			}
			@Override
			public Adapter caseROOT(ROOT object) {
				return createROOTAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
			}
			@Override
			public Adapter caseDiffA(DiffA object) {
				return createDiffAAdapter();
			}
			@Override
			public Adapter caseDiffA_ab(DiffA_ab object) {
				return createDiffA_abAdapter();
			}
			@Override
			public Adapter caseDiffB(DiffB object) {
				return createDiffBAdapter();
			}
			@Override
			public Adapter caseDiffB_bd(DiffB_bd object) {
				return createDiffB_bdAdapter();
			}
			@Override
			public Adapter caseDiffC(DiffC object) {
				return createDiffCAdapter();
			}
			@Override
			public Adapter caseDiffD(DiffD object) {
				return createDiffDAdapter();
			}
			@Override
			public Adapter caseDiffD_dd(DiffD_dd object) {
				return createDiffD_ddAdapter();
			}
			@Override
			public Adapter caseDiffROOT(DiffROOT object) {
				return createDiffROOTAdapter();
			}
			@Override
			public Adapter caseDiffROOT_b(DiffROOT_b object) {
				return createDiffROOT_bAdapter();
			}
			@Override
			public Adapter caseDiffROOT_a(DiffROOT_a object) {
				return createDiffROOT_aAdapter();
			}
			@Override
			public Adapter caseDiffROOT_domainspecificdiffs(DiffROOT_domainspecificdiffs object) {
				return createDiffROOT_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_A <em>Pattern A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_A
	 * @generated
	 */
	public Adapter createPattern_AAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_B <em>Pattern B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_B
	 * @generated
	 */
	public Adapter createPattern_BAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_C <em>Pattern C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_C
	 * @generated
	 */
	public Adapter createPattern_CAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_D <em>Pattern D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_D
	 * @generated
	 */
	public Adapter createPattern_DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_ROOT <em>Pattern ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_ROOT
	 * @generated
	 */
	public Adapter createPattern_ROOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	public Adapter createPattern_DomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffA <em>Pattern Diff A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffA
	 * @generated
	 */
	public Adapter createPattern_DiffAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffA_ab <em>Pattern Diff Aab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffA_ab
	 * @generated
	 */
	public Adapter createPattern_DiffA_abAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffB <em>Pattern Diff B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffB
	 * @generated
	 */
	public Adapter createPattern_DiffBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffB_bd <em>Pattern Diff Bbd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffB_bd
	 * @generated
	 */
	public Adapter createPattern_DiffB_bdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffC <em>Pattern Diff C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffC
	 * @generated
	 */
	public Adapter createPattern_DiffCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffD <em>Pattern Diff D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffD
	 * @generated
	 */
	public Adapter createPattern_DiffDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffD_dd <em>Pattern Diff Ddd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffD_dd
	 * @generated
	 */
	public Adapter createPattern_DiffD_ddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffROOT <em>Pattern Diff ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffROOT
	 * @generated
	 */
	public Adapter createPattern_DiffROOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffROOT_b <em>Pattern Diff ROOT b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffROOT_b
	 * @generated
	 */
	public Adapter createPattern_DiffROOT_bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffROOT_a <em>Pattern Diff ROOT a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffROOT_a
	 * @generated
	 */
	public Adapter createPattern_DiffROOT_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs <em>Pattern Diff ROOT domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Pattern_DiffROOT_domainspecificdiffs
	 * @generated
	 */
	public Adapter createPattern_DiffROOT_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.A
	 * @generated
	 */
	public Adapter createAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.B
	 * @generated
	 */
	public Adapter createBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.C
	 * @generated
	 */
	public Adapter createCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.D
	 * @generated
	 */
	public Adapter createDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.ROOT <em>ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.ROOT
	 * @generated
	 */
	public Adapter createROOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffA <em>Diff A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffA
	 * @generated
	 */
	public Adapter createDiffAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffA_ab <em>Diff Aab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffA_ab
	 * @generated
	 */
	public Adapter createDiffA_abAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffB <em>Diff B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffB
	 * @generated
	 */
	public Adapter createDiffBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffB_bd <em>Diff Bbd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffB_bd
	 * @generated
	 */
	public Adapter createDiffB_bdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffC <em>Diff C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffC
	 * @generated
	 */
	public Adapter createDiffCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffD <em>Diff D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffD
	 * @generated
	 */
	public Adapter createDiffDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffD_dd <em>Diff Ddd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffD_dd
	 * @generated
	 */
	public Adapter createDiffD_ddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffROOT <em>Diff ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffROOT
	 * @generated
	 */
	public Adapter createDiffROOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffROOT_b <em>Diff ROOT b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffROOT_b
	 * @generated
	 */
	public Adapter createDiffROOT_bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffROOT_a <em>Diff ROOT a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffROOT_a
	 * @generated
	 */
	public Adapter createDiffROOT_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oracleDiffMM.DiffROOT_domainspecificdiffs <em>Diff ROOT domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oracleDiffMM.DiffROOT_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffROOT_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OracleRuleMMAdapterFactory
