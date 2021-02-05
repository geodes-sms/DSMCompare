/**
 */
package refactoringRuleMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import refactoringDiffMM.DiffEAttribute;
import refactoringDiffMM.DiffEClass;
import refactoringDiffMM.DiffEClass_eattributes;
import refactoringDiffMM.DiffEClass_eoperations;
import refactoringDiffMM.DiffEClass_ereferences;
import refactoringDiffMM.DiffEClass_esupertypes;
import refactoringDiffMM.DiffEOperation;
import refactoringDiffMM.DiffEPackage;
import refactoringDiffMM.DiffEPackage_domainspecificdiffs;
import refactoringDiffMM.DiffEPackage_eclassifiers;
import refactoringDiffMM.DiffEReference;
import refactoringDiffMM.DomainSpecificDiff;
import refactoringDiffMM.EAttribute;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.EReference;

import refactoringRuleMM.*;

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
 * @see refactoringRuleMM.RefactoringRuleMMPackage
 * @generated
 */
public class RefactoringRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringRuleMMPackage.eINSTANCE;
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
			case RefactoringRuleMMPackage.PATTERN_EATTRIBUTE: {
				Pattern_EAttribute pattern_EAttribute = (Pattern_EAttribute)theEObject;
				T result = casePattern_EAttribute(pattern_EAttribute);
				if (result == null) result = caseEAttribute(pattern_EAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_ECLASS: {
				Pattern_EClass pattern_EClass = (Pattern_EClass)theEObject;
				T result = casePattern_EClass(pattern_EClass);
				if (result == null) result = caseEClass(pattern_EClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_EOPERATION: {
				Pattern_EOperation pattern_EOperation = (Pattern_EOperation)theEObject;
				T result = casePattern_EOperation(pattern_EOperation);
				if (result == null) result = caseEOperation(pattern_EOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_EPACKAGE: {
				Pattern_EPackage pattern_EPackage = (Pattern_EPackage)theEObject;
				T result = casePattern_EPackage(pattern_EPackage);
				if (result == null) result = caseEPackage(pattern_EPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_EREFERENCE: {
				Pattern_EReference pattern_EReference = (Pattern_EReference)theEObject;
				T result = casePattern_EReference(pattern_EReference);
				if (result == null) result = caseEReference(pattern_EReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: {
				Pattern_DomainSpecificDiff pattern_DomainSpecificDiff = (Pattern_DomainSpecificDiff)theEObject;
				T result = casePattern_DomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = caseDomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: {
				Pattern_DiffEAttribute pattern_DiffEAttribute = (Pattern_DiffEAttribute)theEObject;
				T result = casePattern_DiffEAttribute(pattern_DiffEAttribute);
				if (result == null) result = caseDiffEAttribute(pattern_DiffEAttribute);
				if (result == null) result = caseEAttribute(pattern_DiffEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS: {
				Pattern_DiffEClass pattern_DiffEClass = (Pattern_DiffEClass)theEObject;
				T result = casePattern_DiffEClass(pattern_DiffEClass);
				if (result == null) result = caseDiffEClass(pattern_DiffEClass);
				if (result == null) result = caseEClass(pattern_DiffEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: {
				Pattern_DiffEClass_eattributes pattern_DiffEClass_eattributes = (Pattern_DiffEClass_eattributes)theEObject;
				T result = casePattern_DiffEClass_eattributes(pattern_DiffEClass_eattributes);
				if (result == null) result = caseDiffEClass_eattributes(pattern_DiffEClass_eattributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: {
				Pattern_DiffEClass_eoperations pattern_DiffEClass_eoperations = (Pattern_DiffEClass_eoperations)theEObject;
				T result = casePattern_DiffEClass_eoperations(pattern_DiffEClass_eoperations);
				if (result == null) result = caseDiffEClass_eoperations(pattern_DiffEClass_eoperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: {
				Pattern_DiffEClass_ereferences pattern_DiffEClass_ereferences = (Pattern_DiffEClass_ereferences)theEObject;
				T result = casePattern_DiffEClass_ereferences(pattern_DiffEClass_ereferences);
				if (result == null) result = caseDiffEClass_ereferences(pattern_DiffEClass_ereferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPERTYPES: {
				Pattern_DiffEClass_esupertypes pattern_DiffEClass_esupertypes = (Pattern_DiffEClass_esupertypes)theEObject;
				T result = casePattern_DiffEClass_esupertypes(pattern_DiffEClass_esupertypes);
				if (result == null) result = caseDiffEClass_esupertypes(pattern_DiffEClass_esupertypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EOPERATION: {
				Pattern_DiffEOperation pattern_DiffEOperation = (Pattern_DiffEOperation)theEObject;
				T result = casePattern_DiffEOperation(pattern_DiffEOperation);
				if (result == null) result = caseDiffEOperation(pattern_DiffEOperation);
				if (result == null) result = caseEOperation(pattern_DiffEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE: {
				Pattern_DiffEPackage pattern_DiffEPackage = (Pattern_DiffEPackage)theEObject;
				T result = casePattern_DiffEPackage(pattern_DiffEPackage);
				if (result == null) result = caseDiffEPackage(pattern_DiffEPackage);
				if (result == null) result = caseEPackage(pattern_DiffEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: {
				Pattern_DiffEPackage_eclassifiers pattern_DiffEPackage_eclassifiers = (Pattern_DiffEPackage_eclassifiers)theEObject;
				T result = casePattern_DiffEPackage_eclassifiers(pattern_DiffEPackage_eclassifiers);
				if (result == null) result = caseDiffEPackage_eclassifiers(pattern_DiffEPackage_eclassifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: {
				Pattern_DiffEPackage_domainspecificdiffs pattern_DiffEPackage_domainspecificdiffs = (Pattern_DiffEPackage_domainspecificdiffs)theEObject;
				T result = casePattern_DiffEPackage_domainspecificdiffs(pattern_DiffEPackage_domainspecificdiffs);
				if (result == null) result = caseDiffEPackage_domainspecificdiffs(pattern_DiffEPackage_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.PATTERN_DIFF_EREFERENCE: {
				Pattern_DiffEReference pattern_DiffEReference = (Pattern_DiffEReference)theEObject;
				T result = casePattern_DiffEReference(pattern_DiffEReference);
				if (result == null) result = caseDiffEReference(pattern_DiffEReference);
				if (result == null) result = caseEReference(pattern_DiffEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EAttribute(Pattern_EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EClass(Pattern_EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EOperation(Pattern_EOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EPackage(Pattern_EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EReference(Pattern_EReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAttribute(Pattern_DiffEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass(Pattern_DiffEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eattributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eattributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eattributes(Pattern_DiffEClass_eattributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eoperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eoperations(Pattern_DiffEClass_eoperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass ereferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass ereferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_ereferences(Pattern_DiffEClass_ereferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass esupertypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_esupertypes(Pattern_DiffEClass_esupertypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation(Pattern_DiffEOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage(Pattern_DiffEPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_eclassifiers(Pattern_DiffEPackage_eclassifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_domainspecificdiffs(Pattern_DiffEPackage_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEReference(Pattern_DiffEReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttribute(EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOperation(EOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(refactoringDiffMM.EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReference(EReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAttribute(DiffEAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass(DiffEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eattributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eattributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eattributes(DiffEClass_eattributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eoperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eoperations(DiffEClass_eoperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass ereferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass ereferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_ereferences(DiffEClass_ereferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass esupertypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_esupertypes(DiffEClass_esupertypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation(DiffEOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage(DiffEPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage eclassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage eclassifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_eclassifiers(DiffEPackage_eclassifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_domainspecificdiffs(DiffEPackage_domainspecificdiffs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEReference(DiffEReference object) {
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

} //RefactoringRuleMMSwitch
