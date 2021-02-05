/**
 */
package oracleDiffMM.util;

import oracleDiffMM.*;

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
 * @see oracleDiffMM.OracleDiffMMPackage
 * @generated
 */
public class OracleDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OracleDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = OracleDiffMMPackage.eINSTANCE;
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
			case OracleDiffMMPackage.A: {
				A a = (A)theEObject;
				T result = caseA(a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.B: {
				B b = (B)theEObject;
				T result = caseB(b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.C: {
				C c = (C)theEObject;
				T result = caseC(c);
				if (result == null) result = caseB(c);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.D: {
				D d = (D)theEObject;
				T result = caseD(d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.ROOT: {
				ROOT root = (ROOT)theEObject;
				T result = caseROOT(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF: {
				DomainSpecificDiff domainSpecificDiff = (DomainSpecificDiff)theEObject;
				T result = caseDomainSpecificDiff(domainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_A: {
				DiffA diffA = (DiffA)theEObject;
				T result = caseDiffA(diffA);
				if (result == null) result = caseA(diffA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_AAB: {
				DiffA_ab diffA_ab = (DiffA_ab)theEObject;
				T result = caseDiffA_ab(diffA_ab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_B: {
				DiffB diffB = (DiffB)theEObject;
				T result = caseDiffB(diffB);
				if (result == null) result = caseB(diffB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_BBD: {
				DiffB_bd diffB_bd = (DiffB_bd)theEObject;
				T result = caseDiffB_bd(diffB_bd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_C: {
				DiffC diffC = (DiffC)theEObject;
				T result = caseDiffC(diffC);
				if (result == null) result = caseC(diffC);
				if (result == null) result = caseB(diffC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_D: {
				DiffD diffD = (DiffD)theEObject;
				T result = caseDiffD(diffD);
				if (result == null) result = caseD(diffD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_DDD: {
				DiffD_dd diffD_dd = (DiffD_dd)theEObject;
				T result = caseDiffD_dd(diffD_dd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_ROOT: {
				DiffROOT diffROOT = (DiffROOT)theEObject;
				T result = caseDiffROOT(diffROOT);
				if (result == null) result = caseROOT(diffROOT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_ROOT_B: {
				DiffROOT_b diffROOT_b = (DiffROOT_b)theEObject;
				T result = caseDiffROOT_b(diffROOT_b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_ROOT_A: {
				DiffROOT_a diffROOT_a = (DiffROOT_a)theEObject;
				T result = caseDiffROOT_a(diffROOT_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OracleDiffMMPackage.DIFF_ROOT_DOMAINSPECIFICDIFFS: {
				DiffROOT_domainspecificdiffs diffROOT_domainspecificdiffs = (DiffROOT_domainspecificdiffs)theEObject;
				T result = caseDiffROOT_domainspecificdiffs(diffROOT_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //OracleDiffMMSwitch
