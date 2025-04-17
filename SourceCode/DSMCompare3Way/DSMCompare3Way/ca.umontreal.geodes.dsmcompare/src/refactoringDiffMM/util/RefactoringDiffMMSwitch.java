/**
 */
package refactoringDiffMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import refactoringDiffMM.*;

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
 * @see refactoringDiffMM.RefactoringDiffMMPackage
 * @generated
 */
public class RefactoringDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = RefactoringDiffMMPackage.eINSTANCE;
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
			case RefactoringDiffMMPackage.CONFLICT_RESOLUTION: {
				ConflictResolution conflictResolution = (ConflictResolution)theEObject;
				T result = caseConflictResolution(conflictResolution);
				if (result == null) result = caseSemanticObject(conflictResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EATTRIBUTE: {
				DiffEAttribute diffEAttribute = (DiffEAttribute)theEObject;
				T result = caseDiffEAttribute(diffEAttribute);
				if (result == null) result = caseEAttribute(diffEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS: {
				DiffEClass diffEClass = (DiffEClass)theEObject;
				T result = caseDiffEClass(diffEClass);
				if (result == null) result = caseEClass(diffEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: {
				DiffEClass_eattributes diffEClass_eattributes = (DiffEClass_eattributes)theEObject;
				T result = caseDiffEClass_eattributes(diffEClass_eattributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_EOPERATIONS: {
				DiffEClass_eoperations diffEClass_eoperations = (DiffEClass_eoperations)theEObject;
				T result = caseDiffEClass_eoperations(diffEClass_eoperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_EREFERENCES: {
				DiffEClass_ereferences diffEClass_ereferences = (DiffEClass_ereferences)theEObject;
				T result = caseDiffEClass_ereferences(diffEClass_ereferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_ESUPERTYPES: {
				DiffEClass_esupertypes diffEClass_esupertypes = (DiffEClass_esupertypes)theEObject;
				T result = caseDiffEClass_esupertypes(diffEClass_esupertypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_INTERFACES: {
				DiffEClass_interfaces diffEClass_interfaces = (DiffEClass_interfaces)theEObject;
				T result = caseDiffEClass_interfaces(diffEClass_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_NESTED_CLASSES: {
				DiffEClass_nested_classes diffEClass_nested_classes = (DiffEClass_nested_classes)theEObject;
				T result = caseDiffEClass_nested_classes(diffEClass_nested_classes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_ECLASS_NESTED_INTERFACES: {
				DiffEClass_nested_interfaces diffEClass_nested_interfaces = (DiffEClass_nested_interfaces)theEObject;
				T result = caseDiffEClass_nested_interfaces(diffEClass_nested_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EOPERATION: {
				DiffEOperation diffEOperation = (DiffEOperation)theEObject;
				T result = caseDiffEOperation(diffEOperation);
				if (result == null) result = caseEOperation(diffEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EPACKAGE: {
				DiffEPackage diffEPackage = (DiffEPackage)theEObject;
				T result = caseDiffEPackage(diffEPackage);
				if (result == null) result = caseEPackage(diffEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: {
				DiffEPackage_eclassifiers diffEPackage_eclassifiers = (DiffEPackage_eclassifiers)theEObject;
				T result = caseDiffEPackage_eclassifiers(diffEPackage_eclassifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_INTERFACES: {
				DiffEPackage_interfaces diffEPackage_interfaces = (DiffEPackage_interfaces)theEObject;
				T result = caseDiffEPackage_interfaces(diffEPackage_interfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EPACKAGE_TEST: {
				DiffEPackage_test diffEPackage_test = (DiffEPackage_test)theEObject;
				T result = caseDiffEPackage_test(diffEPackage_test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_EREFERENCE: {
				DiffEReference diffEReference = (DiffEReference)theEObject;
				T result = caseDiffEReference(diffEReference);
				if (result == null) result = caseEReference(diffEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_INTERFACE: {
				DiffInterface diffInterface = (DiffInterface)theEObject;
				T result = caseDiffInterface(diffInterface);
				if (result == null) result = caseInterface(diffInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_INTERFACE_EOPERATIONS: {
				DiffInterface_eoperations diffInterface_eoperations = (DiffInterface_eoperations)theEObject;
				T result = caseDiffInterface_eoperations(diffInterface_eoperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFF_INTERFACE_ESUPERTYPES: {
				DiffInterface_esupertypes diffInterface_esupertypes = (DiffInterface_esupertypes)theEObject;
				T result = caseDiffInterface_esupertypes(diffInterface_esupertypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS: {
				DifftestAssociations difftestAssociations = (DifftestAssociations)theEObject;
				T result = caseDifftestAssociations(difftestAssociations);
				if (result == null) result = casetestAssociations(difftestAssociations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS_MULTI: {
				DifftestAssociations_multi difftestAssociations_multi = (DifftestAssociations_multi)theEObject;
				T result = caseDifftestAssociations_multi(difftestAssociations_multi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.DIFFTEST_ASSOCIATIONS_SINGLE: {
				DifftestAssociations_single difftestAssociations_single = (DifftestAssociations_single)theEObject;
				T result = caseDifftestAssociations_single(difftestAssociations_single);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.EATTRIBUTE: {
				EAttribute eAttribute = (EAttribute)theEObject;
				T result = caseEAttribute(eAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.ECLASS: {
				EClass eClass = (EClass)theEObject;
				T result = caseEClass(eClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.EOPERATION: {
				EOperation eOperation = (EOperation)theEObject;
				T result = caseEOperation(eOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.EPACKAGE: {
				refactoringDiffMM.EPackage ePackage = (refactoringDiffMM.EPackage)theEObject;
				T result = caseEPackage(ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.EREFERENCE: {
				EReference eReference = (EReference)theEObject;
				T result = caseEReference(eReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT: {
				SemanticConflict semanticConflict = (SemanticConflict)theEObject;
				T result = caseSemanticConflict(semanticConflict);
				if (result == null) result = caseSemanticObject(semanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.SEMANTIC_DIFF: {
				SemanticDiff semanticDiff = (SemanticDiff)theEObject;
				T result = caseSemanticDiff(semanticDiff);
				if (result == null) result = caseSemanticObject(semanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT: {
				SemanticObject semanticObject = (SemanticObject)theEObject;
				T result = caseSemanticObject(semanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS: {
				testAssociations testAssociations = (testAssociations)theEObject;
				T result = casetestAssociations(testAssociations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictResolution(ConflictResolution object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_interfaces(DiffEClass_interfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass nested classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass nested classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_nested_classes(DiffEClass_nested_classes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass nested interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass nested interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_nested_interfaces(DiffEClass_nested_interfaces object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_interfaces(DiffEPackage_interfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_test(DiffEPackage_test object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInterface(DiffInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Interface eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Interface eoperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInterface_eoperations(DiffInterface_eoperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Interface esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Interface esupertypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffInterface_esupertypes(DiffInterface_esupertypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difftest Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difftest Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifftestAssociations(DifftestAssociations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difftest Associations multi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difftest Associations multi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifftestAssociations_multi(DifftestAssociations_multi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difftest Associations single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difftest Associations single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifftestAssociations_single(DifftestAssociations_single object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticConflict(SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticDiff(SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticObject(SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>test Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>test Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetestAssociations(testAssociations object) {
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

} //RefactoringDiffMMSwitch
