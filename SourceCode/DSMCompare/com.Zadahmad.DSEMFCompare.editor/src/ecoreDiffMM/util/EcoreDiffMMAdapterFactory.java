/**
 */
package ecoreDiffMM.util;

import ecoreDiffMM.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecoreDiffMM.EcoreDiffMMPackage
 * @generated
 */
public class EcoreDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcoreDiffMMPackage.eINSTANCE;
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
	protected EcoreDiffMMSwitch<Adapter> modelSwitch =
		new EcoreDiffMMSwitch<Adapter>() {
			@Override
			public Adapter caseEAttribute(EAttribute object) {
				return createEAttributeAdapter();
			}
			@Override
			public Adapter caseEAnnotation(EAnnotation object) {
				return createEAnnotationAdapter();
			}
			@Override
			public Adapter caseEClass(EClass object) {
				return createEClassAdapter();
			}
			@Override
			public Adapter caseEClassifier(EClassifier object) {
				return createEClassifierAdapter();
			}
			@Override
			public Adapter caseEDataType(EDataType object) {
				return createEDataTypeAdapter();
			}
			@Override
			public Adapter caseEEnum(EEnum object) {
				return createEEnumAdapter();
			}
			@Override
			public Adapter caseEEnumLiteral(EEnumLiteral object) {
				return createEEnumLiteralAdapter();
			}
			@Override
			public Adapter caseEFactory(EFactory object) {
				return createEFactoryAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseEObject(ecoreDiffMM.EObject object) {
				return createEObjectAdapter();
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
			public Adapter caseEParameter(EParameter object) {
				return createEParameterAdapter();
			}
			@Override
			public Adapter caseEReference(EReference object) {
				return createEReferenceAdapter();
			}
			@Override
			public Adapter caseEStructuralFeature(EStructuralFeature object) {
				return createEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseETypedElement(ETypedElement object) {
				return createETypedElementAdapter();
			}
			@Override
			public Adapter caseEStringToStringMapEntry(Map.Entry<String, String> object) {
				return createEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseEGenericType(EGenericType object) {
				return createEGenericTypeAdapter();
			}
			@Override
			public Adapter caseETypeParameter(ETypeParameter object) {
				return createETypeParameterAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
			}
			@Override
			public Adapter caseDiffEAttribute(DiffEAttribute object) {
				return createDiffEAttributeAdapter();
			}
			@Override
			public Adapter caseDiffEAttribute_eAttributeType(DiffEAttribute_eAttributeType object) {
				return createDiffEAttribute_eAttributeTypeAdapter();
			}
			@Override
			public Adapter caseDiffEAnnotation(DiffEAnnotation object) {
				return createDiffEAnnotationAdapter();
			}
			@Override
			public Adapter caseDiffEAnnotation_details(DiffEAnnotation_details object) {
				return createDiffEAnnotation_detailsAdapter();
			}
			@Override
			public Adapter caseDiffEAnnotation_eModelElement(DiffEAnnotation_eModelElement object) {
				return createDiffEAnnotation_eModelElementAdapter();
			}
			@Override
			public Adapter caseDiffEAnnotation_contents(DiffEAnnotation_contents object) {
				return createDiffEAnnotation_contentsAdapter();
			}
			@Override
			public Adapter caseDiffEAnnotation_references(DiffEAnnotation_references object) {
				return createDiffEAnnotation_referencesAdapter();
			}
			@Override
			public Adapter caseDiffEClass(DiffEClass object) {
				return createDiffEClassAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eSuperTypes(DiffEClass_eSuperTypes object) {
				return createDiffEClass_eSuperTypesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eOperations(DiffEClass_eOperations object) {
				return createDiffEClass_eOperationsAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllAttributes(DiffEClass_eAllAttributes object) {
				return createDiffEClass_eAllAttributesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllReferences(DiffEClass_eAllReferences object) {
				return createDiffEClass_eAllReferencesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eReferences(DiffEClass_eReferences object) {
				return createDiffEClass_eReferencesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAttributes(DiffEClass_eAttributes object) {
				return createDiffEClass_eAttributesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllContainments(DiffEClass_eAllContainments object) {
				return createDiffEClass_eAllContainmentsAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllOperations(DiffEClass_eAllOperations object) {
				return createDiffEClass_eAllOperationsAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllStructuralFeatures(DiffEClass_eAllStructuralFeatures object) {
				return createDiffEClass_eAllStructuralFeaturesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllSuperTypes(DiffEClass_eAllSuperTypes object) {
				return createDiffEClass_eAllSuperTypesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eIDAttribute(DiffEClass_eIDAttribute object) {
				return createDiffEClass_eIDAttributeAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eStructuralFeatures(DiffEClass_eStructuralFeatures object) {
				return createDiffEClass_eStructuralFeaturesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eGenericSuperTypes(DiffEClass_eGenericSuperTypes object) {
				return createDiffEClass_eGenericSuperTypesAdapter();
			}
			@Override
			public Adapter caseDiffEClass_eAllGenericSuperTypes(DiffEClass_eAllGenericSuperTypes object) {
				return createDiffEClass_eAllGenericSuperTypesAdapter();
			}
			@Override
			public Adapter caseDiffEClassifier_ePackage(DiffEClassifier_ePackage object) {
				return createDiffEClassifier_ePackageAdapter();
			}
			@Override
			public Adapter caseDiffEClassifier_eTypeParameters(DiffEClassifier_eTypeParameters object) {
				return createDiffEClassifier_eTypeParametersAdapter();
			}
			@Override
			public Adapter caseDiffEDataType(DiffEDataType object) {
				return createDiffEDataTypeAdapter();
			}
			@Override
			public Adapter caseDiffEEnum(DiffEEnum object) {
				return createDiffEEnumAdapter();
			}
			@Override
			public Adapter caseDiffEEnum_eLiterals(DiffEEnum_eLiterals object) {
				return createDiffEEnum_eLiteralsAdapter();
			}
			@Override
			public Adapter caseDiffEEnumLiteral(DiffEEnumLiteral object) {
				return createDiffEEnumLiteralAdapter();
			}
			@Override
			public Adapter caseDiffEEnumLiteral_eEnum(DiffEEnumLiteral_eEnum object) {
				return createDiffEEnumLiteral_eEnumAdapter();
			}
			@Override
			public Adapter caseDiffEFactory(DiffEFactory object) {
				return createDiffEFactoryAdapter();
			}
			@Override
			public Adapter caseDiffEFactory_ePackage(DiffEFactory_ePackage object) {
				return createDiffEFactory_ePackageAdapter();
			}
			@Override
			public Adapter caseDiffEModelElement_eAnnotations(DiffEModelElement_eAnnotations object) {
				return createDiffEModelElement_eAnnotationsAdapter();
			}
			@Override
			public Adapter caseDiffEObject(DiffEObject object) {
				return createDiffEObjectAdapter();
			}
			@Override
			public Adapter caseDiffEOperation(DiffEOperation object) {
				return createDiffEOperationAdapter();
			}
			@Override
			public Adapter caseDiffEOperation_eContainingClass(DiffEOperation_eContainingClass object) {
				return createDiffEOperation_eContainingClassAdapter();
			}
			@Override
			public Adapter caseDiffEOperation_eTypeParameters(DiffEOperation_eTypeParameters object) {
				return createDiffEOperation_eTypeParametersAdapter();
			}
			@Override
			public Adapter caseDiffEOperation_eParameters(DiffEOperation_eParameters object) {
				return createDiffEOperation_eParametersAdapter();
			}
			@Override
			public Adapter caseDiffEOperation_eExceptions(DiffEOperation_eExceptions object) {
				return createDiffEOperation_eExceptionsAdapter();
			}
			@Override
			public Adapter caseDiffEOperation_eGenericExceptions(DiffEOperation_eGenericExceptions object) {
				return createDiffEOperation_eGenericExceptionsAdapter();
			}
			@Override
			public Adapter caseDiffEPackage(DiffEPackage object) {
				return createDiffEPackageAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_eFactoryInstance(DiffEPackage_eFactoryInstance object) {
				return createDiffEPackage_eFactoryInstanceAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_eClassifiers(DiffEPackage_eClassifiers object) {
				return createDiffEPackage_eClassifiersAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_eSubpackages(DiffEPackage_eSubpackages object) {
				return createDiffEPackage_eSubpackagesAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_eSuperPackage(DiffEPackage_eSuperPackage object) {
				return createDiffEPackage_eSuperPackageAdapter();
			}
			@Override
			public Adapter caseDiffEPackage_domainspecificdiffs(DiffEPackage_domainspecificdiffs object) {
				return createDiffEPackage_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter caseDiffEParameter(DiffEParameter object) {
				return createDiffEParameterAdapter();
			}
			@Override
			public Adapter caseDiffEParameter_eOperation(DiffEParameter_eOperation object) {
				return createDiffEParameter_eOperationAdapter();
			}
			@Override
			public Adapter caseDiffEReference(DiffEReference object) {
				return createDiffEReferenceAdapter();
			}
			@Override
			public Adapter caseDiffEReference_eOpposite(DiffEReference_eOpposite object) {
				return createDiffEReference_eOppositeAdapter();
			}
			@Override
			public Adapter caseDiffEReference_eReferenceType(DiffEReference_eReferenceType object) {
				return createDiffEReference_eReferenceTypeAdapter();
			}
			@Override
			public Adapter caseDiffEReference_eKeys(DiffEReference_eKeys object) {
				return createDiffEReference_eKeysAdapter();
			}
			@Override
			public Adapter caseDiffEStructuralFeature_eContainingClass(DiffEStructuralFeature_eContainingClass object) {
				return createDiffEStructuralFeature_eContainingClassAdapter();
			}
			@Override
			public Adapter caseDiffETypedElement_eType(DiffETypedElement_eType object) {
				return createDiffETypedElement_eTypeAdapter();
			}
			@Override
			public Adapter caseDiffETypedElement_eGenericType(DiffETypedElement_eGenericType object) {
				return createDiffETypedElement_eGenericTypeAdapter();
			}
			@Override
			public Adapter caseDiffEStringToStringMapEntry(Map.Entry<String, String> object) {
				return createDiffEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType(DiffEGenericType object) {
				return createDiffEGenericTypeAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eUpperBound(DiffEGenericType_eUpperBound object) {
				return createDiffEGenericType_eUpperBoundAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eTypeArguments(DiffEGenericType_eTypeArguments object) {
				return createDiffEGenericType_eTypeArgumentsAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eRawType(DiffEGenericType_eRawType object) {
				return createDiffEGenericType_eRawTypeAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eLowerBound(DiffEGenericType_eLowerBound object) {
				return createDiffEGenericType_eLowerBoundAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eTypeParameter(DiffEGenericType_eTypeParameter object) {
				return createDiffEGenericType_eTypeParameterAdapter();
			}
			@Override
			public Adapter caseDiffEGenericType_eClassifier(DiffEGenericType_eClassifier object) {
				return createDiffEGenericType_eClassifierAdapter();
			}
			@Override
			public Adapter caseDiffETypeParameter(DiffETypeParameter object) {
				return createDiffETypeParameterAdapter();
			}
			@Override
			public Adapter caseDiffETypeParameter_eBounds(DiffETypeParameter_eBounds object) {
				return createDiffETypeParameter_eBoundsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEcore_EObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EAttribute
	 * @generated
	 */
	public Adapter createEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EAnnotation
	 * @generated
	 */
	public Adapter createEAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EClass
	 * @generated
	 */
	public Adapter createEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EClassifier
	 * @generated
	 */
	public Adapter createEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EDataType
	 * @generated
	 */
	public Adapter createEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EEnum
	 * @generated
	 */
	public Adapter createEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EEnumLiteral
	 * @generated
	 */
	public Adapter createEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EFactory
	 * @generated
	 */
	public Adapter createEFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EObject
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EOperation
	 * @generated
	 */
	public Adapter createEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EPackage
	 * @generated
	 */
	public Adapter createEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EReference
	 * @generated
	 */
	public Adapter createEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EStructuralFeature
	 * @generated
	 */
	public Adapter createEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.ETypedElement
	 * @generated
	 */
	public Adapter createETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.EGenericType
	 * @generated
	 */
	public Adapter createEGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.ETypeParameter
	 * @generated
	 */
	public Adapter createETypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAttribute <em>Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAttribute
	 * @generated
	 */
	public Adapter createDiffEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAttribute_eAttributeType <em>Diff EAttribute eAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAttribute_eAttributeType
	 * @generated
	 */
	public Adapter createDiffEAttribute_eAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAnnotation <em>Diff EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAnnotation
	 * @generated
	 */
	public Adapter createDiffEAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAnnotation_details <em>Diff EAnnotation details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAnnotation_details
	 * @generated
	 */
	public Adapter createDiffEAnnotation_detailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAnnotation_eModelElement <em>Diff EAnnotation eModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAnnotation_eModelElement
	 * @generated
	 */
	public Adapter createDiffEAnnotation_eModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAnnotation_contents <em>Diff EAnnotation contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAnnotation_contents
	 * @generated
	 */
	public Adapter createDiffEAnnotation_contentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEAnnotation_references <em>Diff EAnnotation references</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEAnnotation_references
	 * @generated
	 */
	public Adapter createDiffEAnnotation_referencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass <em>Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass
	 * @generated
	 */
	public Adapter createDiffEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eSuperTypes <em>Diff EClass eSuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eSuperTypes
	 * @generated
	 */
	public Adapter createDiffEClass_eSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eOperations <em>Diff EClass eOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eOperations
	 * @generated
	 */
	public Adapter createDiffEClass_eOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllAttributes <em>Diff EClass eAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllAttributes
	 * @generated
	 */
	public Adapter createDiffEClass_eAllAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllReferences <em>Diff EClass eAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllReferences
	 * @generated
	 */
	public Adapter createDiffEClass_eAllReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eReferences <em>Diff EClass eReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eReferences
	 * @generated
	 */
	public Adapter createDiffEClass_eReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAttributes <em>Diff EClass eAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAttributes
	 * @generated
	 */
	public Adapter createDiffEClass_eAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllContainments <em>Diff EClass eAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllContainments
	 * @generated
	 */
	public Adapter createDiffEClass_eAllContainmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllOperations <em>Diff EClass eAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllOperations
	 * @generated
	 */
	public Adapter createDiffEClass_eAllOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllStructuralFeatures <em>Diff EClass eAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllStructuralFeatures
	 * @generated
	 */
	public Adapter createDiffEClass_eAllStructuralFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllSuperTypes <em>Diff EClass eAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllSuperTypes
	 * @generated
	 */
	public Adapter createDiffEClass_eAllSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eIDAttribute <em>Diff EClass eID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eIDAttribute
	 * @generated
	 */
	public Adapter createDiffEClass_eIDAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eStructuralFeatures <em>Diff EClass eStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eStructuralFeatures
	 * @generated
	 */
	public Adapter createDiffEClass_eStructuralFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eGenericSuperTypes <em>Diff EClass eGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eGenericSuperTypes
	 * @generated
	 */
	public Adapter createDiffEClass_eGenericSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClass_eAllGenericSuperTypes <em>Diff EClass eAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClass_eAllGenericSuperTypes
	 * @generated
	 */
	public Adapter createDiffEClass_eAllGenericSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClassifier_ePackage <em>Diff EClassifier ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClassifier_ePackage
	 * @generated
	 */
	public Adapter createDiffEClassifier_ePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEClassifier_eTypeParameters <em>Diff EClassifier eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEClassifier_eTypeParameters
	 * @generated
	 */
	public Adapter createDiffEClassifier_eTypeParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEDataType <em>Diff EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEDataType
	 * @generated
	 */
	public Adapter createDiffEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEEnum <em>Diff EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEEnum
	 * @generated
	 */
	public Adapter createDiffEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEEnum_eLiterals <em>Diff EEnum eLiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEEnum_eLiterals
	 * @generated
	 */
	public Adapter createDiffEEnum_eLiteralsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEEnumLiteral <em>Diff EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEEnumLiteral
	 * @generated
	 */
	public Adapter createDiffEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEEnumLiteral_eEnum <em>Diff EEnum Literal eEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEEnumLiteral_eEnum
	 * @generated
	 */
	public Adapter createDiffEEnumLiteral_eEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEFactory <em>Diff EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEFactory
	 * @generated
	 */
	public Adapter createDiffEFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEFactory_ePackage <em>Diff EFactory ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEFactory_ePackage
	 * @generated
	 */
	public Adapter createDiffEFactory_ePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEModelElement_eAnnotations <em>Diff EModel Element eAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEModelElement_eAnnotations
	 * @generated
	 */
	public Adapter createDiffEModelElement_eAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEObject <em>Diff EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEObject
	 * @generated
	 */
	public Adapter createDiffEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation <em>Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation
	 * @generated
	 */
	public Adapter createDiffEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation_eContainingClass <em>Diff EOperation eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation_eContainingClass
	 * @generated
	 */
	public Adapter createDiffEOperation_eContainingClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation_eTypeParameters <em>Diff EOperation eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation_eTypeParameters
	 * @generated
	 */
	public Adapter createDiffEOperation_eTypeParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation_eParameters <em>Diff EOperation eParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation_eParameters
	 * @generated
	 */
	public Adapter createDiffEOperation_eParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation_eExceptions <em>Diff EOperation eExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation_eExceptions
	 * @generated
	 */
	public Adapter createDiffEOperation_eExceptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEOperation_eGenericExceptions <em>Diff EOperation eGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEOperation_eGenericExceptions
	 * @generated
	 */
	public Adapter createDiffEOperation_eGenericExceptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage <em>Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage
	 * @generated
	 */
	public Adapter createDiffEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage_eFactoryInstance <em>Diff EPackage eFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage_eFactoryInstance
	 * @generated
	 */
	public Adapter createDiffEPackage_eFactoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage_eClassifiers <em>Diff EPackage eClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage_eClassifiers
	 * @generated
	 */
	public Adapter createDiffEPackage_eClassifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage_eSubpackages <em>Diff EPackage eSubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage_eSubpackages
	 * @generated
	 */
	public Adapter createDiffEPackage_eSubpackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage_eSuperPackage <em>Diff EPackage eSuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage_eSuperPackage
	 * @generated
	 */
	public Adapter createDiffEPackage_eSuperPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEPackage_domainspecificdiffs <em>Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffEPackage_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEParameter <em>Diff EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEParameter
	 * @generated
	 */
	public Adapter createDiffEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEParameter_eOperation <em>Diff EParameter eOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEParameter_eOperation
	 * @generated
	 */
	public Adapter createDiffEParameter_eOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEReference <em>Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEReference
	 * @generated
	 */
	public Adapter createDiffEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEReference_eOpposite <em>Diff EReference eOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEReference_eOpposite
	 * @generated
	 */
	public Adapter createDiffEReference_eOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEReference_eReferenceType <em>Diff EReference eReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEReference_eReferenceType
	 * @generated
	 */
	public Adapter createDiffEReference_eReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEReference_eKeys <em>Diff EReference eKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEReference_eKeys
	 * @generated
	 */
	public Adapter createDiffEReference_eKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEStructuralFeature_eContainingClass <em>Diff EStructural Feature eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEStructuralFeature_eContainingClass
	 * @generated
	 */
	public Adapter createDiffEStructuralFeature_eContainingClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffETypedElement_eType <em>Diff ETyped Element eType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffETypedElement_eType
	 * @generated
	 */
	public Adapter createDiffETypedElement_eTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffETypedElement_eGenericType <em>Diff ETyped Element eGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffETypedElement_eGenericType
	 * @generated
	 */
	public Adapter createDiffETypedElement_eGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Diff EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createDiffEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType <em>Diff EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType
	 * @generated
	 */
	public Adapter createDiffEGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eUpperBound <em>Diff EGeneric Type eUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eUpperBound
	 * @generated
	 */
	public Adapter createDiffEGenericType_eUpperBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eTypeArguments <em>Diff EGeneric Type eType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeArguments
	 * @generated
	 */
	public Adapter createDiffEGenericType_eTypeArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eRawType <em>Diff EGeneric Type eRaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eRawType
	 * @generated
	 */
	public Adapter createDiffEGenericType_eRawTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eLowerBound <em>Diff EGeneric Type eLower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eLowerBound
	 * @generated
	 */
	public Adapter createDiffEGenericType_eLowerBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eTypeParameter <em>Diff EGeneric Type eType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eTypeParameter
	 * @generated
	 */
	public Adapter createDiffEGenericType_eTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffEGenericType_eClassifier <em>Diff EGeneric Type eClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffEGenericType_eClassifier
	 * @generated
	 */
	public Adapter createDiffEGenericType_eClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffETypeParameter <em>Diff EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffETypeParameter
	 * @generated
	 */
	public Adapter createDiffETypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreDiffMM.DiffETypeParameter_eBounds <em>Diff EType Parameter eBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreDiffMM.DiffETypeParameter_eBounds
	 * @generated
	 */
	public Adapter createDiffETypeParameter_eBoundsAdapter() {
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
	public Adapter createEcore_EObjectAdapter() {
		return null;
	}

} //EcoreDiffMMAdapterFactory
