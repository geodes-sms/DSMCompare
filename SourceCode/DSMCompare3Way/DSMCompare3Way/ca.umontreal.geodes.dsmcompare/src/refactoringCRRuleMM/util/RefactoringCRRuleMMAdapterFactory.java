/**
 */
package refactoringCRRuleMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import refactoringCRRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage
 * @generated
 */
public class RefactoringCRRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefactoringCRRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringCRRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RefactoringCRRuleMMPackage.eINSTANCE;
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
	protected RefactoringCRRuleMMSwitch<Adapter> modelSwitch =
		new RefactoringCRRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_ConflictResolution(Pattern_ConflictResolution object) {
				return createPattern_ConflictResolutionAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAttribute(Pattern_DiffEAttribute object) {
				return createPattern_DiffEAttributeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass(Pattern_DiffEClass object) {
				return createPattern_DiffEClassAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eattributes(Pattern_DiffEClass_eattributes object) {
				return createPattern_DiffEClass_eattributesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eoperations(Pattern_DiffEClass_eoperations object) {
				return createPattern_DiffEClass_eoperationsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_ereferences(Pattern_DiffEClass_ereferences object) {
				return createPattern_DiffEClass_ereferencesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_esupertypes(Pattern_DiffEClass_esupertypes object) {
				return createPattern_DiffEClass_esupertypesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_interfaces(Pattern_DiffEClass_interfaces object) {
				return createPattern_DiffEClass_interfacesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_nested_classes(Pattern_DiffEClass_nested_classes object) {
				return createPattern_DiffEClass_nested_classesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_nested_interfaces(Pattern_DiffEClass_nested_interfaces object) {
				return createPattern_DiffEClass_nested_interfacesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation(Pattern_DiffEOperation object) {
				return createPattern_DiffEOperationAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage(Pattern_DiffEPackage object) {
				return createPattern_DiffEPackageAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_eclassifiers(Pattern_DiffEPackage_eclassifiers object) {
				return createPattern_DiffEPackage_eclassifiersAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_interfaces(Pattern_DiffEPackage_interfaces object) {
				return createPattern_DiffEPackage_interfacesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_test(Pattern_DiffEPackage_test object) {
				return createPattern_DiffEPackage_testAdapter();
			}
			@Override
			public Adapter casePattern_DiffEReference(Pattern_DiffEReference object) {
				return createPattern_DiffEReferenceAdapter();
			}
			@Override
			public Adapter casePattern_DiffInterface(Pattern_DiffInterface object) {
				return createPattern_DiffInterfaceAdapter();
			}
			@Override
			public Adapter casePattern_DiffInterface_eoperations(Pattern_DiffInterface_eoperations object) {
				return createPattern_DiffInterface_eoperationsAdapter();
			}
			@Override
			public Adapter casePattern_DiffInterface_esupertypes(Pattern_DiffInterface_esupertypes object) {
				return createPattern_DiffInterface_esupertypesAdapter();
			}
			@Override
			public Adapter casePattern_DifftestAssociations(Pattern_DifftestAssociations object) {
				return createPattern_DifftestAssociationsAdapter();
			}
			@Override
			public Adapter casePattern_DifftestAssociations_multi(Pattern_DifftestAssociations_multi object) {
				return createPattern_DifftestAssociations_multiAdapter();
			}
			@Override
			public Adapter casePattern_DifftestAssociations_single(Pattern_DifftestAssociations_single object) {
				return createPattern_DifftestAssociations_singleAdapter();
			}
			@Override
			public Adapter casePattern_EAttribute(Pattern_EAttribute object) {
				return createPattern_EAttributeAdapter();
			}
			@Override
			public Adapter casePattern_EClass(Pattern_EClass object) {
				return createPattern_EClassAdapter();
			}
			@Override
			public Adapter casePattern_EOperation(Pattern_EOperation object) {
				return createPattern_EOperationAdapter();
			}
			@Override
			public Adapter casePattern_EPackage(Pattern_EPackage object) {
				return createPattern_EPackageAdapter();
			}
			@Override
			public Adapter casePattern_EReference(Pattern_EReference object) {
				return createPattern_EReferenceAdapter();
			}
			@Override
			public Adapter casePattern_Interface(Pattern_Interface object) {
				return createPattern_InterfaceAdapter();
			}
			@Override
			public Adapter casePattern_SemanticConflict(Pattern_SemanticConflict object) {
				return createPattern_SemanticConflictAdapter();
			}
			@Override
			public Adapter casePattern_SemanticDiff(Pattern_SemanticDiff object) {
				return createPattern_SemanticDiffAdapter();
			}
			@Override
			public Adapter casePattern_SemanticObject(Pattern_SemanticObject object) {
				return createPattern_SemanticObjectAdapter();
			}
			@Override
			public Adapter casePattern_testAssociations(Pattern_testAssociations object) {
				return createPattern_testAssociationsAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	public Adapter createPattern_ConflictResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	public Adapter createPattern_DiffEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	public Adapter createPattern_DiffEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes <em>Pattern Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eattributes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eattributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations <em>Pattern Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_eoperations
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eoperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences <em>Pattern Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_ereferences
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_ereferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes <em>Pattern Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_esupertypes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_esupertypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces <em>Pattern Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_interfaces
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes <em>Pattern Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_classes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_nested_classesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces <em>Pattern Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_nested_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	public Adapter createPattern_DiffEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	public Adapter createPattern_DiffEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers <em>Pattern Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_eclassifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces <em>Pattern Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_interfaces
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEPackage_test <em>Pattern Diff EPackage test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEPackage_test
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_testAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	public Adapter createPattern_DiffEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffInterface <em>Pattern Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface
	 * @generated
	 */
	public Adapter createPattern_DiffInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations <em>Pattern Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_eoperations
	 * @generated
	 */
	public Adapter createPattern_DiffInterface_eoperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes <em>Pattern Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DiffInterface_esupertypes
	 * @generated
	 */
	public Adapter createPattern_DiffInterface_esupertypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations <em>Pattern Difftest Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations
	 * @generated
	 */
	public Adapter createPattern_DifftestAssociationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi <em>Pattern Difftest Associations multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_multi
	 * @generated
	 */
	public Adapter createPattern_DifftestAssociations_multiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_DifftestAssociations_single <em>Pattern Difftest Associations single</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_DifftestAssociations_single
	 * @generated
	 */
	public Adapter createPattern_DifftestAssociations_singleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_EAttribute
	 * @generated
	 */
	public Adapter createPattern_EAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_EClass
	 * @generated
	 */
	public Adapter createPattern_EClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_EOperation
	 * @generated
	 */
	public Adapter createPattern_EOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_EPackage
	 * @generated
	 */
	public Adapter createPattern_EPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_EReference
	 * @generated
	 */
	public Adapter createPattern_EReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_Interface <em>Pattern Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_Interface
	 * @generated
	 */
	public Adapter createPattern_InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	public Adapter createPattern_SemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	public Adapter createPattern_SemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	public Adapter createPattern_SemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Pattern_testAssociations <em>Pattern test Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Pattern_testAssociations
	 * @generated
	 */
	public Adapter createPattern_testAssociationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoringCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoringCRRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
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

} //RefactoringCRRuleMMAdapterFactory
