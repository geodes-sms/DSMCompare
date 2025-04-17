/**
 */
package refactoringCRRuleMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import refactoringCRRuleMM.*;

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
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage
 * @generated
 */
public class RefactoringCRRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringCRRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringCRRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringCRRuleMMPackage.eINSTANCE;
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
			case RefactoringCRRuleMMPackage.PATTERN_CONFLICT_RESOLUTION: {
				Pattern_ConflictResolution pattern_ConflictResolution = (Pattern_ConflictResolution)theEObject;
				T result = casePattern_ConflictResolution(pattern_ConflictResolution);
				if (result == null) result = casePattern_SemanticObject(pattern_ConflictResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: {
				Pattern_DiffEAttribute pattern_DiffEAttribute = (Pattern_DiffEAttribute)theEObject;
				T result = casePattern_DiffEAttribute(pattern_DiffEAttribute);
				if (result == null) result = casePattern_EAttribute(pattern_DiffEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS: {
				Pattern_DiffEClass pattern_DiffEClass = (Pattern_DiffEClass)theEObject;
				T result = casePattern_DiffEClass(pattern_DiffEClass);
				if (result == null) result = casePattern_EClass(pattern_DiffEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: {
				Pattern_DiffEClass_eattributes pattern_DiffEClass_eattributes = (Pattern_DiffEClass_eattributes)theEObject;
				T result = casePattern_DiffEClass_eattributes(pattern_DiffEClass_eattributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: {
				Pattern_DiffEClass_eoperations pattern_DiffEClass_eoperations = (Pattern_DiffEClass_eoperations)theEObject;
				T result = casePattern_DiffEClass_eoperations(pattern_DiffEClass_eoperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: {
				Pattern_DiffEClass_ereferences pattern_DiffEClass_ereferences = (Pattern_DiffEClass_ereferences)theEObject;
				T result = casePattern_DiffEClass_ereferences(pattern_DiffEClass_ereferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPERTYPES: {
				Pattern_DiffEClass_esupertypes pattern_DiffEClass_esupertypes = (Pattern_DiffEClass_esupertypes)theEObject;
				T result = casePattern_DiffEClass_esupertypes(pattern_DiffEClass_esupertypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_INTERFACES: {
				Pattern_DiffEClass_interfaces pattern_DiffEClass_interfaces = (Pattern_DiffEClass_interfaces)theEObject;
				T result = casePattern_DiffEClass_interfaces(pattern_DiffEClass_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_NESTED_CLASSES: {
				Pattern_DiffEClass_nested_classes pattern_DiffEClass_nested_classes = (Pattern_DiffEClass_nested_classes)theEObject;
				T result = casePattern_DiffEClass_nested_classes(pattern_DiffEClass_nested_classes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_NESTED_INTERFACES: {
				Pattern_DiffEClass_nested_interfaces pattern_DiffEClass_nested_interfaces = (Pattern_DiffEClass_nested_interfaces)theEObject;
				T result = casePattern_DiffEClass_nested_interfaces(pattern_DiffEClass_nested_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EOPERATION: {
				Pattern_DiffEOperation pattern_DiffEOperation = (Pattern_DiffEOperation)theEObject;
				T result = casePattern_DiffEOperation(pattern_DiffEOperation);
				if (result == null) result = casePattern_EOperation(pattern_DiffEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EPACKAGE: {
				Pattern_DiffEPackage pattern_DiffEPackage = (Pattern_DiffEPackage)theEObject;
				T result = casePattern_DiffEPackage(pattern_DiffEPackage);
				if (result == null) result = casePattern_EPackage(pattern_DiffEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: {
				Pattern_DiffEPackage_eclassifiers pattern_DiffEPackage_eclassifiers = (Pattern_DiffEPackage_eclassifiers)theEObject;
				T result = casePattern_DiffEPackage_eclassifiers(pattern_DiffEPackage_eclassifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EPACKAGE_INTERFACES: {
				Pattern_DiffEPackage_interfaces pattern_DiffEPackage_interfaces = (Pattern_DiffEPackage_interfaces)theEObject;
				T result = casePattern_DiffEPackage_interfaces(pattern_DiffEPackage_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EPACKAGE_TEST: {
				Pattern_DiffEPackage_test pattern_DiffEPackage_test = (Pattern_DiffEPackage_test)theEObject;
				T result = casePattern_DiffEPackage_test(pattern_DiffEPackage_test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE: {
				Pattern_DiffEReference pattern_DiffEReference = (Pattern_DiffEReference)theEObject;
				T result = casePattern_DiffEReference(pattern_DiffEReference);
				if (result == null) result = casePattern_EReference(pattern_DiffEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_INTERFACE: {
				Pattern_DiffInterface pattern_DiffInterface = (Pattern_DiffInterface)theEObject;
				T result = casePattern_DiffInterface(pattern_DiffInterface);
				if (result == null) result = casePattern_Interface(pattern_DiffInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_INTERFACE_EOPERATIONS: {
				Pattern_DiffInterface_eoperations pattern_DiffInterface_eoperations = (Pattern_DiffInterface_eoperations)theEObject;
				T result = casePattern_DiffInterface_eoperations(pattern_DiffInterface_eoperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_INTERFACE_ESUPERTYPES: {
				Pattern_DiffInterface_esupertypes pattern_DiffInterface_esupertypes = (Pattern_DiffInterface_esupertypes)theEObject;
				T result = casePattern_DiffInterface_esupertypes(pattern_DiffInterface_esupertypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFFTEST_ASSOCIATIONS: {
				Pattern_DifftestAssociations pattern_DifftestAssociations = (Pattern_DifftestAssociations)theEObject;
				T result = casePattern_DifftestAssociations(pattern_DifftestAssociations);
				if (result == null) result = casePattern_testAssociations(pattern_DifftestAssociations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFFTEST_ASSOCIATIONS_MULTI: {
				Pattern_DifftestAssociations_multi pattern_DifftestAssociations_multi = (Pattern_DifftestAssociations_multi)theEObject;
				T result = casePattern_DifftestAssociations_multi(pattern_DifftestAssociations_multi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE: {
				Pattern_DifftestAssociations_single pattern_DifftestAssociations_single = (Pattern_DifftestAssociations_single)theEObject;
				T result = casePattern_DifftestAssociations_single(pattern_DifftestAssociations_single);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_EATTRIBUTE: {
				Pattern_EAttribute pattern_EAttribute = (Pattern_EAttribute)theEObject;
				T result = casePattern_EAttribute(pattern_EAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS: {
				Pattern_EClass pattern_EClass = (Pattern_EClass)theEObject;
				T result = casePattern_EClass(pattern_EClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_EOPERATION: {
				Pattern_EOperation pattern_EOperation = (Pattern_EOperation)theEObject;
				T result = casePattern_EOperation(pattern_EOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE: {
				Pattern_EPackage pattern_EPackage = (Pattern_EPackage)theEObject;
				T result = casePattern_EPackage(pattern_EPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_EREFERENCE: {
				Pattern_EReference pattern_EReference = (Pattern_EReference)theEObject;
				T result = casePattern_EReference(pattern_EReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE: {
				Pattern_Interface pattern_Interface = (Pattern_Interface)theEObject;
				T result = casePattern_Interface(pattern_Interface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: {
				Pattern_SemanticConflict pattern_SemanticConflict = (Pattern_SemanticConflict)theEObject;
				T result = casePattern_SemanticConflict(pattern_SemanticConflict);
				if (result == null) result = casePattern_SemanticObject(pattern_SemanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_DIFF: {
				Pattern_SemanticDiff pattern_SemanticDiff = (Pattern_SemanticDiff)theEObject;
				T result = casePattern_SemanticDiff(pattern_SemanticDiff);
				if (result == null) result = casePattern_SemanticObject(pattern_SemanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT: {
				Pattern_SemanticObject pattern_SemanticObject = (Pattern_SemanticObject)theEObject;
				T result = casePattern_SemanticObject(pattern_SemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS: {
				Pattern_testAssociations pattern_testAssociations = (Pattern_testAssociations)theEObject;
				T result = casePattern_testAssociations(pattern_testAssociations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringCRRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Conflict Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Conflict Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ConflictResolution(Pattern_ConflictResolution object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_interfaces(Pattern_DiffEClass_interfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass nested classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass nested classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_nested_classes(Pattern_DiffEClass_nested_classes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass nested interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass nested interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_nested_interfaces(Pattern_DiffEClass_nested_interfaces object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_interfaces(Pattern_DiffEPackage_interfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_test(Pattern_DiffEPackage_test object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInterface(Pattern_DiffInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Interface eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Interface eoperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInterface_eoperations(Pattern_DiffInterface_eoperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Interface esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Interface esupertypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffInterface_esupertypes(Pattern_DiffInterface_esupertypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Difftest Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Difftest Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DifftestAssociations(Pattern_DifftestAssociations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Difftest Associations multi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Difftest Associations multi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DifftestAssociations_multi(Pattern_DifftestAssociations_multi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Difftest Associations single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Difftest Associations single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DifftestAssociations_single(Pattern_DifftestAssociations_single object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Interface(Pattern_Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticConflict(Pattern_SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticDiff(Pattern_SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticObject(Pattern_SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern test Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern test Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_testAssociations(Pattern_testAssociations object) {
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

} //RefactoringCRRuleMMSwitch
