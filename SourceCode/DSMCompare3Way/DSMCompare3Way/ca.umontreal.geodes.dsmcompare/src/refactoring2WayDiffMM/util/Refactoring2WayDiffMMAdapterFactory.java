/**
 */
package refactoring2WayDiffMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import refactoring2WayDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage
 * @generated
 */
public class Refactoring2WayDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Refactoring2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring2WayDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Refactoring2WayDiffMMPackage.eINSTANCE;
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
	protected Refactoring2WayDiffMMSwitch<Adapter> modelSwitch =
		new Refactoring2WayDiffMMSwitch<Adapter>() {
			@Override
			public Adapter caseEAttribute(EAttribute object) {
				return createEAttributeAdapter();
			}
			@Override
			public Adapter caseEClass(EClass object) {
				return createEClassAdapter();
			}
			@Override
			public Adapter caseEOperation(EOperation object) {
				return createEOperationAdapter();
			}
			@Override
			public Adapter caseEPackage(EPackage object) {
				return createEPackageAdapter();
			}
			@Override
			public Adapter caseEReference(EReference object) {
				return createEReferenceAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseSemanticObject(SemanticObject object) {
				return createSemanticObjectAdapter();
			}
			@Override
			public Adapter caseSemanticDiff(SemanticDiff object) {
				return createSemanticDiffAdapter();
			}
			@Override
			public Adapter caseSemanticConflict(SemanticConflict object) {
				return createSemanticConflictAdapter();
			}
			@Override
			public Adapter caseDiffEAttribute(DiffEAttribute object) {
				return createDiffEAttributeAdapter();
			}
			@Override
			public Adapter caseDiffEClass(DiffEClass object) {
				return createDiffEClassAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eattributes(DiffEClass_eattributes object) {
				return createDiffEClass_eattributesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eoperations(DiffEClass_eoperations object) {
				return createDiffEClass_eoperationsAdapter();
			}
			@Override
			public Adapter caseDiffEClass_ereferences(DiffEClass_ereferences object) {
				return createDiffEClass_ereferencesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_esupertypes(DiffEClass_esupertypes object) {
				return createDiffEClass_esupertypesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_interfaces(DiffEClass_interfaces object) {
				return createDiffEClass_interfacesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_nested_classes(DiffEClass_nested_classes object) {
				return createDiffEClass_nested_classesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_nested_interfaces(DiffEClass_nested_interfaces object) {
				return createDiffEClass_nested_interfacesAdapter();
			}
			@Override
			public Adapter caseDiffEOperation(DiffEOperation object) {
				return createDiffEOperationAdapter();
			}
			@Override
			public Adapter caseDiffEPackage(DiffEPackage object) {
				return createDiffEPackageAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_eclassifiers(DiffEPackage_eclassifiers object) {
				return createDiffEPackage_eclassifiersAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_interfaces(DiffEPackage_interfaces object) {
				return createDiffEPackage_interfacesAdapter();
			}
			@Override
			public Adapter caseDiffEReference(DiffEReference object) {
				return createDiffEReferenceAdapter();
			}
			@Override
			public Adapter caseDiffInterface(DiffInterface object) {
				return createDiffInterfaceAdapter();
			}
			@Override
			public Adapter caseDiffInterface_eoperations(DiffInterface_eoperations object) {
				return createDiffInterface_eoperationsAdapter();
			}
			@Override
			public Adapter caseDiffInterface_esupertypes(DiffInterface_esupertypes object) {
				return createDiffInterface_esupertypesAdapter();
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
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.EAttribute
	 * @generated
	 */
	public Adapter createEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.EClass
	 * @generated
	 */
	public Adapter createEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.EOperation
	 * @generated
	 */
	public Adapter createEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.EPackage
	 * @generated
	 */
	public Adapter createEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.EReference
	 * @generated
	 */
	public Adapter createEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.SemanticObject
	 * @generated
	 */
	public Adapter createSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.SemanticDiff
	 * @generated
	 */
	public Adapter createSemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.SemanticConflict
	 * @generated
	 */
	public Adapter createSemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEAttribute
	 * @generated
	 */
	public Adapter createDiffEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass
	 * @generated
	 */
	public Adapter createDiffEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_eattributes <em>Diff EClass eattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_eattributes
	 * @generated
	 */
	public Adapter createDiffEClass_eattributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_eoperations <em>Diff EClass eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_eoperations
	 * @generated
	 */
	public Adapter createDiffEClass_eoperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_ereferences <em>Diff EClass ereferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_ereferences
	 * @generated
	 */
	public Adapter createDiffEClass_ereferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_esupertypes <em>Diff EClass esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_esupertypes
	 * @generated
	 */
	public Adapter createDiffEClass_esupertypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_interfaces <em>Diff EClass interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_interfaces
	 * @generated
	 */
	public Adapter createDiffEClass_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_nested_classes <em>Diff EClass nested classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_classes
	 * @generated
	 */
	public Adapter createDiffEClass_nested_classesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEClass_nested_interfaces <em>Diff EClass nested interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEClass_nested_interfaces
	 * @generated
	 */
	public Adapter createDiffEClass_nested_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEOperation
	 * @generated
	 */
	public Adapter createDiffEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEPackage
	 * @generated
	 */
	public Adapter createDiffEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEPackage_eclassifiers <em>Diff EPackage eclassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEPackage_eclassifiers
	 * @generated
	 */
	public Adapter createDiffEPackage_eclassifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEPackage_interfaces <em>Diff EPackage interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEPackage_interfaces
	 * @generated
	 */
	public Adapter createDiffEPackage_interfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffEReference
	 * @generated
	 */
	public Adapter createDiffEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffInterface <em>Diff Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffInterface
	 * @generated
	 */
	public Adapter createDiffInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffInterface_eoperations <em>Diff Interface eoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffInterface_eoperations
	 * @generated
	 */
	public Adapter createDiffInterface_eoperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link refactoring2WayDiffMM.DiffInterface_esupertypes <em>Diff Interface esupertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see refactoring2WayDiffMM.DiffInterface_esupertypes
	 * @generated
	 */
	public Adapter createDiffInterface_esupertypesAdapter() {
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

} //Refactoring2WayDiffMMAdapterFactory
