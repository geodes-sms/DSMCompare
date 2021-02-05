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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oracleRuleMM.OracleRuleMMPackage
 * @generated
 */
public class OracleRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OracleRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = OracleRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OracleRuleMMPackage.PATTERN_A: {
				Pattern_A pattern_A = (Pattern_A)theEObject;
				T result = casePattern_A(pattern_A);
				if (result == null) result = caseA(pattern_A);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_B: {
				Pattern_B pattern_B = (Pattern_B)theEObject;
				T result = casePattern_B(pattern_B);
				if (result == null) result = caseB(pattern_B);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_C: {
				Pattern_C pattern_C = (Pattern_C)theEObject;
				T result = casePattern_C(pattern_C);
				if (result == null) result = caseC(pattern_C);
				if (result == null) result = caseB(pattern_C);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_D: {
				Pattern_D pattern_D = (Pattern_D)theEObject;
				T result = casePattern_D(pattern_D);
				if (result == null) result = caseD(pattern_D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_ROOT: {
				Pattern_ROOT pattern_ROOT = (Pattern_ROOT)theEObject;
				T result = casePattern_ROOT(pattern_ROOT);
				if (result == null) result = caseROOT(pattern_ROOT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: {
				Pattern_DomainSpecificDiff pattern_DomainSpecificDiff = (Pattern_DomainSpecificDiff)theEObject;
				T result = casePattern_DomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = caseDomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_A: {
				Pattern_DiffA pattern_DiffA = (Pattern_DiffA)theEObject;
				T result = casePattern_DiffA(pattern_DiffA);
				if (result == null) result = caseDiffA(pattern_DiffA);
				if (result == null) result = caseA(pattern_DiffA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_AAB: {
				Pattern_DiffA_ab pattern_DiffA_ab = (Pattern_DiffA_ab)theEObject;
				T result = casePattern_DiffA_ab(pattern_DiffA_ab);
				if (result == null) result = caseDiffA_ab(pattern_DiffA_ab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_B: {
				Pattern_DiffB pattern_DiffB = (Pattern_DiffB)theEObject;
				T result = casePattern_DiffB(pattern_DiffB);
				if (result == null) result = caseDiffB(pattern_DiffB);
				if (result == null) result = caseB(pattern_DiffB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_BBD: {
				Pattern_DiffB_bd pattern_DiffB_bd = (Pattern_DiffB_bd)theEObject;
				T result = casePattern_DiffB_bd(pattern_DiffB_bd);
				if (result == null) result = caseDiffB_bd(pattern_DiffB_bd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_C: {
				Pattern_DiffC pattern_DiffC = (Pattern_DiffC)theEObject;
				T result = casePattern_DiffC(pattern_DiffC);
				if (result == null) result = caseDiffC(pattern_DiffC);
				if (result == null) result = caseC(pattern_DiffC);
				if (result == null) result = caseB(pattern_DiffC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_D: {
				Pattern_DiffD pattern_DiffD = (Pattern_DiffD)theEObject;
				T result = casePattern_DiffD(pattern_DiffD);
				if (result == null) result = caseDiffD(pattern_DiffD);
				if (result == null) result = caseD(pattern_DiffD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_DDD: {
				Pattern_DiffD_dd pattern_DiffD_dd = (Pattern_DiffD_dd)theEObject;
				T result = casePattern_DiffD_dd(pattern_DiffD_dd);
				if (result == null) result = caseDiffD_dd(pattern_DiffD_dd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT: {
				Pattern_DiffROOT pattern_DiffROOT = (Pattern_DiffROOT)theEObject;
				T result = casePattern_DiffROOT(pattern_DiffROOT);
				if (result == null) result = caseDiffROOT(pattern_DiffROOT);
				if (result == null) result = caseROOT(pattern_DiffROOT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_B: {
				Pattern_DiffROOT_b pattern_DiffROOT_b = (Pattern_DiffROOT_b)theEObject;
				T result = casePattern_DiffROOT_b(pattern_DiffROOT_b);
				if (result == null) result = caseDiffROOT_b(pattern_DiffROOT_b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_A: {
				Pattern_DiffROOT_a pattern_DiffROOT_a = (Pattern_DiffROOT_a)theEObject;
				T result = casePattern_DiffROOT_a(pattern_DiffROOT_a);
				if (result == null) result = caseDiffROOT_a(pattern_DiffROOT_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.PATTERN_DIFF_ROOT_DOMAINSPECIFICDIFFS: {
				Pattern_DiffROOT_domainspecificdiffs pattern_DiffROOT_domainspecificdiffs = (Pattern_DiffROOT_domainspecificdiffs)theEObject;
				T result = casePattern_DiffROOT_domainspecificdiffs(pattern_DiffROOT_domainspecificdiffs);
				if (result == null) result = caseDiffROOT_domainspecificdiffs(pattern_DiffROOT_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_A(Pattern_A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_B(Pattern_B object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_C(Pattern_C object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_D(Pattern_D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern ROOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ROOT(Pattern_ROOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Domain Specific Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffA(Pattern_DiffA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Aab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Aab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffA_ab(Pattern_DiffA_ab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffB(Pattern_DiffB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Bbd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Bbd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffB_bd(Pattern_DiffB_bd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffC(Pattern_DiffC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffD(Pattern_DiffD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Ddd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Ddd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffD_dd(Pattern_DiffD_dd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ROOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffROOT(Pattern_DiffROOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ROOT b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ROOT b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffROOT_b(Pattern_DiffROOT_b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ROOT a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ROOT a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffROOT_a(Pattern_DiffROOT_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ROOT domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ROOT domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffROOT_domainspecificdiffs(Pattern_DiffROOT_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA(A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB(B object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC(C object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD(D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROOT(ROOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificDiff(DomainSpecificDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffA(DiffA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Aab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Aab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffA_ab(DiffA_ab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffB(DiffB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Bbd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Bbd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffB_bd(DiffB_bd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffC(DiffC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffD(DiffD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Ddd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Ddd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffD_dd(DiffD_dd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ROOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffROOT(DiffROOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ROOT b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ROOT b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffROOT_b(DiffROOT_b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ROOT a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ROOT a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffROOT_a(DiffROOT_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ROOT domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ROOT domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffROOT_domainspecificdiffs(DiffROOT_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OracleRuleMMSwitch
