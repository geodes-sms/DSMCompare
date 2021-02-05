/**
 */
package ecoreRuleMM.util;

import ecoreDiffMM.DiffEAnnotation;
import ecoreDiffMM.DiffEAnnotation_contents;
import ecoreDiffMM.DiffEAnnotation_details;
import ecoreDiffMM.DiffEAnnotation_eModelElement;
import ecoreDiffMM.DiffEAnnotation_references;
import ecoreDiffMM.DiffEAttribute;
import ecoreDiffMM.DiffEAttribute_eAttributeType;
import ecoreDiffMM.DiffEClass;
import ecoreDiffMM.DiffEClass_eAllAttributes;
import ecoreDiffMM.DiffEClass_eAllContainments;
import ecoreDiffMM.DiffEClass_eAllGenericSuperTypes;
import ecoreDiffMM.DiffEClass_eAllOperations;
import ecoreDiffMM.DiffEClass_eAllReferences;
import ecoreDiffMM.DiffEClass_eAllStructuralFeatures;
import ecoreDiffMM.DiffEClass_eAllSuperTypes;
import ecoreDiffMM.DiffEClass_eAttributes;
import ecoreDiffMM.DiffEClass_eGenericSuperTypes;
import ecoreDiffMM.DiffEClass_eIDAttribute;
import ecoreDiffMM.DiffEClass_eOperations;
import ecoreDiffMM.DiffEClass_eReferences;
import ecoreDiffMM.DiffEClass_eStructuralFeatures;
import ecoreDiffMM.DiffEClass_eSuperTypes;
import ecoreDiffMM.DiffEClassifier_ePackage;
import ecoreDiffMM.DiffEClassifier_eTypeParameters;
import ecoreDiffMM.DiffEDataType;
import ecoreDiffMM.DiffEEnum;
import ecoreDiffMM.DiffEEnumLiteral;
import ecoreDiffMM.DiffEEnumLiteral_eEnum;
import ecoreDiffMM.DiffEEnum_eLiterals;
import ecoreDiffMM.DiffEFactory;
import ecoreDiffMM.DiffEFactory_ePackage;
import ecoreDiffMM.DiffEGenericType;
import ecoreDiffMM.DiffEGenericType_eClassifier;
import ecoreDiffMM.DiffEGenericType_eLowerBound;
import ecoreDiffMM.DiffEGenericType_eRawType;
import ecoreDiffMM.DiffEGenericType_eTypeArguments;
import ecoreDiffMM.DiffEGenericType_eTypeParameter;
import ecoreDiffMM.DiffEGenericType_eUpperBound;
import ecoreDiffMM.DiffEModelElement_eAnnotations;
import ecoreDiffMM.DiffEObject;
import ecoreDiffMM.DiffEOperation;
import ecoreDiffMM.DiffEOperation_eContainingClass;
import ecoreDiffMM.DiffEOperation_eExceptions;
import ecoreDiffMM.DiffEOperation_eGenericExceptions;
import ecoreDiffMM.DiffEOperation_eParameters;
import ecoreDiffMM.DiffEOperation_eTypeParameters;
import ecoreDiffMM.DiffEPackage;
import ecoreDiffMM.DiffEPackage_domainspecificdiffs;
import ecoreDiffMM.DiffEPackage_eClassifiers;
import ecoreDiffMM.DiffEPackage_eFactoryInstance;
import ecoreDiffMM.DiffEPackage_eSubpackages;
import ecoreDiffMM.DiffEPackage_eSuperPackage;
import ecoreDiffMM.DiffEParameter;
import ecoreDiffMM.DiffEParameter_eOperation;
import ecoreDiffMM.DiffEReference;
import ecoreDiffMM.DiffEReference_eKeys;
import ecoreDiffMM.DiffEReference_eOpposite;
import ecoreDiffMM.DiffEReference_eReferenceType;
import ecoreDiffMM.DiffEStructuralFeature_eContainingClass;
import ecoreDiffMM.DiffETypeParameter;
import ecoreDiffMM.DiffETypeParameter_eBounds;
import ecoreDiffMM.DiffETypedElement_eGenericType;
import ecoreDiffMM.DiffETypedElement_eType;
import ecoreDiffMM.DomainSpecificDiff;
import ecoreDiffMM.EAnnotation;
import ecoreDiffMM.EAttribute;
import ecoreDiffMM.EClass;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EDataType;
import ecoreDiffMM.EEnum;
import ecoreDiffMM.EEnumLiteral;
import ecoreDiffMM.EFactory;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.EModelElement;
import ecoreDiffMM.ENamedElement;
import ecoreDiffMM.EOperation;
import ecoreDiffMM.EPackage;
import ecoreDiffMM.EParameter;
import ecoreDiffMM.EReference;
import ecoreDiffMM.EStructuralFeature;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.ETypedElement;

import ecoreRuleMM.*;

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
 * @see ecoreRuleMM.EcoreRuleMMPackage
 * @generated
 */
public class EcoreRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcoreRuleMMPackage.eINSTANCE;
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
	protected EcoreRuleMMSwitch<Adapter> modelSwitch =
		new EcoreRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_EAttribute(Pattern_EAttribute object) {
				return createPattern_EAttributeAdapter();
			}
			@Override
			public Adapter casePattern_EAnnotation(Pattern_EAnnotation object) {
				return createPattern_EAnnotationAdapter();
			}
			@Override
			public Adapter casePattern_EClass(Pattern_EClass object) {
				return createPattern_EClassAdapter();
			}
			@Override
			public Adapter casePattern_EClassifier(Pattern_EClassifier object) {
				return createPattern_EClassifierAdapter();
			}
			@Override
			public Adapter casePattern_EDataType(Pattern_EDataType object) {
				return createPattern_EDataTypeAdapter();
			}
			@Override
			public Adapter casePattern_EEnum(Pattern_EEnum object) {
				return createPattern_EEnumAdapter();
			}
			@Override
			public Adapter casePattern_EEnumLiteral(Pattern_EEnumLiteral object) {
				return createPattern_EEnumLiteralAdapter();
			}
			@Override
			public Adapter casePattern_EFactory(Pattern_EFactory object) {
				return createPattern_EFactoryAdapter();
			}
			@Override
			public Adapter casePattern_EModelElement(Pattern_EModelElement object) {
				return createPattern_EModelElementAdapter();
			}
			@Override
			public Adapter casePattern_ENamedElement(Pattern_ENamedElement object) {
				return createPattern_ENamedElementAdapter();
			}
			@Override
			public Adapter casePattern_EObject(Pattern_EObject object) {
				return createPattern_EObjectAdapter();
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
			public Adapter casePattern_EParameter(Pattern_EParameter object) {
				return createPattern_EParameterAdapter();
			}
			@Override
			public Adapter casePattern_EReference(Pattern_EReference object) {
				return createPattern_EReferenceAdapter();
			}
			@Override
			public Adapter casePattern_EStructuralFeature(Pattern_EStructuralFeature object) {
				return createPattern_EStructuralFeatureAdapter();
			}
			@Override
			public Adapter casePattern_ETypedElement(Pattern_ETypedElement object) {
				return createPattern_ETypedElementAdapter();
			}
			@Override
			public Adapter casePattern_EStringToStringMapEntry(Map.Entry<String, String> object) {
				return createPattern_EStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter casePattern_EGenericType(Pattern_EGenericType object) {
				return createPattern_EGenericTypeAdapter();
			}
			@Override
			public Adapter casePattern_ETypeParameter(Pattern_ETypeParameter object) {
				return createPattern_ETypeParameterAdapter();
			}
			@Override
			public Adapter casePattern_DomainSpecificDiff(Pattern_DomainSpecificDiff object) {
				return createPattern_DomainSpecificDiffAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAttribute(Pattern_DiffEAttribute object) {
				return createPattern_DiffEAttributeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAttribute_eAttributeType(Pattern_DiffEAttribute_eAttributeType object) {
				return createPattern_DiffEAttribute_eAttributeTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAnnotation(Pattern_DiffEAnnotation object) {
				return createPattern_DiffEAnnotationAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAnnotation_details(Pattern_DiffEAnnotation_details object) {
				return createPattern_DiffEAnnotation_detailsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAnnotation_eModelElement(Pattern_DiffEAnnotation_eModelElement object) {
				return createPattern_DiffEAnnotation_eModelElementAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAnnotation_contents(Pattern_DiffEAnnotation_contents object) {
				return createPattern_DiffEAnnotation_contentsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEAnnotation_references(Pattern_DiffEAnnotation_references object) {
				return createPattern_DiffEAnnotation_referencesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass(Pattern_DiffEClass object) {
				return createPattern_DiffEClassAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eSuperTypes(Pattern_DiffEClass_eSuperTypes object) {
				return createPattern_DiffEClass_eSuperTypesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eOperations(Pattern_DiffEClass_eOperations object) {
				return createPattern_DiffEClass_eOperationsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllAttributes(Pattern_DiffEClass_eAllAttributes object) {
				return createPattern_DiffEClass_eAllAttributesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllReferences(Pattern_DiffEClass_eAllReferences object) {
				return createPattern_DiffEClass_eAllReferencesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eReferences(Pattern_DiffEClass_eReferences object) {
				return createPattern_DiffEClass_eReferencesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAttributes(Pattern_DiffEClass_eAttributes object) {
				return createPattern_DiffEClass_eAttributesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllContainments(Pattern_DiffEClass_eAllContainments object) {
				return createPattern_DiffEClass_eAllContainmentsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllOperations(Pattern_DiffEClass_eAllOperations object) {
				return createPattern_DiffEClass_eAllOperationsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllStructuralFeatures(Pattern_DiffEClass_eAllStructuralFeatures object) {
				return createPattern_DiffEClass_eAllStructuralFeaturesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllSuperTypes(Pattern_DiffEClass_eAllSuperTypes object) {
				return createPattern_DiffEClass_eAllSuperTypesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eIDAttribute(Pattern_DiffEClass_eIDAttribute object) {
				return createPattern_DiffEClass_eIDAttributeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eStructuralFeatures(Pattern_DiffEClass_eStructuralFeatures object) {
				return createPattern_DiffEClass_eStructuralFeaturesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eGenericSuperTypes(Pattern_DiffEClass_eGenericSuperTypes object) {
				return createPattern_DiffEClass_eGenericSuperTypesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClass_eAllGenericSuperTypes(Pattern_DiffEClass_eAllGenericSuperTypes object) {
				return createPattern_DiffEClass_eAllGenericSuperTypesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClassifier_ePackage(Pattern_DiffEClassifier_ePackage object) {
				return createPattern_DiffEClassifier_ePackageAdapter();
			}
			@Override
			public Adapter casePattern_DiffEClassifier_eTypeParameters(Pattern_DiffEClassifier_eTypeParameters object) {
				return createPattern_DiffEClassifier_eTypeParametersAdapter();
			}
			@Override
			public Adapter casePattern_DiffEDataType(Pattern_DiffEDataType object) {
				return createPattern_DiffEDataTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEEnum(Pattern_DiffEEnum object) {
				return createPattern_DiffEEnumAdapter();
			}
			@Override
			public Adapter casePattern_DiffEEnum_eLiterals(Pattern_DiffEEnum_eLiterals object) {
				return createPattern_DiffEEnum_eLiteralsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEEnumLiteral(Pattern_DiffEEnumLiteral object) {
				return createPattern_DiffEEnumLiteralAdapter();
			}
			@Override
			public Adapter casePattern_DiffEEnumLiteral_eEnum(Pattern_DiffEEnumLiteral_eEnum object) {
				return createPattern_DiffEEnumLiteral_eEnumAdapter();
			}
			@Override
			public Adapter casePattern_DiffEFactory(Pattern_DiffEFactory object) {
				return createPattern_DiffEFactoryAdapter();
			}
			@Override
			public Adapter casePattern_DiffEFactory_ePackage(Pattern_DiffEFactory_ePackage object) {
				return createPattern_DiffEFactory_ePackageAdapter();
			}
			@Override
			public Adapter casePattern_DiffEModelElement_eAnnotations(Pattern_DiffEModelElement_eAnnotations object) {
				return createPattern_DiffEModelElement_eAnnotationsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEObject(Pattern_DiffEObject object) {
				return createPattern_DiffEObjectAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation(Pattern_DiffEOperation object) {
				return createPattern_DiffEOperationAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation_eContainingClass(Pattern_DiffEOperation_eContainingClass object) {
				return createPattern_DiffEOperation_eContainingClassAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation_eTypeParameters(Pattern_DiffEOperation_eTypeParameters object) {
				return createPattern_DiffEOperation_eTypeParametersAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation_eParameters(Pattern_DiffEOperation_eParameters object) {
				return createPattern_DiffEOperation_eParametersAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation_eExceptions(Pattern_DiffEOperation_eExceptions object) {
				return createPattern_DiffEOperation_eExceptionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEOperation_eGenericExceptions(Pattern_DiffEOperation_eGenericExceptions object) {
				return createPattern_DiffEOperation_eGenericExceptionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage(Pattern_DiffEPackage object) {
				return createPattern_DiffEPackageAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_eFactoryInstance(Pattern_DiffEPackage_eFactoryInstance object) {
				return createPattern_DiffEPackage_eFactoryInstanceAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_eClassifiers(Pattern_DiffEPackage_eClassifiers object) {
				return createPattern_DiffEPackage_eClassifiersAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_eSubpackages(Pattern_DiffEPackage_eSubpackages object) {
				return createPattern_DiffEPackage_eSubpackagesAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_eSuperPackage(Pattern_DiffEPackage_eSuperPackage object) {
				return createPattern_DiffEPackage_eSuperPackageAdapter();
			}
			@Override
			public Adapter casePattern_DiffEPackage_domainspecificdiffs(Pattern_DiffEPackage_domainspecificdiffs object) {
				return createPattern_DiffEPackage_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEParameter(Pattern_DiffEParameter object) {
				return createPattern_DiffEParameterAdapter();
			}
			@Override
			public Adapter casePattern_DiffEParameter_eOperation(Pattern_DiffEParameter_eOperation object) {
				return createPattern_DiffEParameter_eOperationAdapter();
			}
			@Override
			public Adapter casePattern_DiffEReference(Pattern_DiffEReference object) {
				return createPattern_DiffEReferenceAdapter();
			}
			@Override
			public Adapter casePattern_DiffEReference_eOpposite(Pattern_DiffEReference_eOpposite object) {
				return createPattern_DiffEReference_eOppositeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEReference_eReferenceType(Pattern_DiffEReference_eReferenceType object) {
				return createPattern_DiffEReference_eReferenceTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEReference_eKeys(Pattern_DiffEReference_eKeys object) {
				return createPattern_DiffEReference_eKeysAdapter();
			}
			@Override
			public Adapter casePattern_DiffEStructuralFeature_eContainingClass(Pattern_DiffEStructuralFeature_eContainingClass object) {
				return createPattern_DiffEStructuralFeature_eContainingClassAdapter();
			}
			@Override
			public Adapter casePattern_DiffETypedElement_eType(Pattern_DiffETypedElement_eType object) {
				return createPattern_DiffETypedElement_eTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffETypedElement_eGenericType(Pattern_DiffETypedElement_eGenericType object) {
				return createPattern_DiffETypedElement_eGenericTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEStringToStringMapEntry(Map.Entry<String, String> object) {
				return createPattern_DiffEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType(Pattern_DiffEGenericType object) {
				return createPattern_DiffEGenericTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eUpperBound(Pattern_DiffEGenericType_eUpperBound object) {
				return createPattern_DiffEGenericType_eUpperBoundAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eTypeArguments(Pattern_DiffEGenericType_eTypeArguments object) {
				return createPattern_DiffEGenericType_eTypeArgumentsAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eRawType(Pattern_DiffEGenericType_eRawType object) {
				return createPattern_DiffEGenericType_eRawTypeAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eLowerBound(Pattern_DiffEGenericType_eLowerBound object) {
				return createPattern_DiffEGenericType_eLowerBoundAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eTypeParameter(Pattern_DiffEGenericType_eTypeParameter object) {
				return createPattern_DiffEGenericType_eTypeParameterAdapter();
			}
			@Override
			public Adapter casePattern_DiffEGenericType_eClassifier(Pattern_DiffEGenericType_eClassifier object) {
				return createPattern_DiffEGenericType_eClassifierAdapter();
			}
			@Override
			public Adapter casePattern_DiffETypeParameter(Pattern_DiffETypeParameter object) {
				return createPattern_DiffETypeParameterAdapter();
			}
			@Override
			public Adapter casePattern_DiffETypeParameter_eBounds(Pattern_DiffETypeParameter_eBounds object) {
				return createPattern_DiffETypeParameter_eBoundsAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
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
			public Adapter caseETypedElement(ETypedElement object) {
				return createETypedElementAdapter();
			}
			@Override
			public Adapter caseEStructuralFeature(EStructuralFeature object) {
				return createEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseEAttribute(EAttribute object) {
				return createEAttributeAdapter();
			}
			@Override
			public Adapter caseEAnnotation(EAnnotation object) {
				return createEAnnotationAdapter();
			}
			@Override
			public Adapter caseEClassifier(EClassifier object) {
				return createEClassifierAdapter();
			}
			@Override
			public Adapter caseEClass(EClass object) {
				return createEClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EAttribute <em>Pattern EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EAttribute
	 * @generated
	 */
	public Adapter createPattern_EAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EAnnotation <em>Pattern EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EAnnotation
	 * @generated
	 */
	public Adapter createPattern_EAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EClass <em>Pattern EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EClass
	 * @generated
	 */
	public Adapter createPattern_EClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EClassifier <em>Pattern EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EClassifier
	 * @generated
	 */
	public Adapter createPattern_EClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EDataType <em>Pattern EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EDataType
	 * @generated
	 */
	public Adapter createPattern_EDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EEnum <em>Pattern EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EEnum
	 * @generated
	 */
	public Adapter createPattern_EEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EEnumLiteral <em>Pattern EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EEnumLiteral
	 * @generated
	 */
	public Adapter createPattern_EEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EFactory <em>Pattern EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EFactory
	 * @generated
	 */
	public Adapter createPattern_EFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EModelElement <em>Pattern EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EModelElement
	 * @generated
	 */
	public Adapter createPattern_EModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_ENamedElement <em>Pattern ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_ENamedElement
	 * @generated
	 */
	public Adapter createPattern_ENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EObject <em>Pattern EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EObject
	 * @generated
	 */
	public Adapter createPattern_EObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EOperation <em>Pattern EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EOperation
	 * @generated
	 */
	public Adapter createPattern_EOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EPackage <em>Pattern EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EPackage
	 * @generated
	 */
	public Adapter createPattern_EPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EParameter <em>Pattern EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EParameter
	 * @generated
	 */
	public Adapter createPattern_EParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EReference <em>Pattern EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EReference
	 * @generated
	 */
	public Adapter createPattern_EReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EStructuralFeature <em>Pattern EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EStructuralFeature
	 * @generated
	 */
	public Adapter createPattern_EStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_ETypedElement <em>Pattern ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_ETypedElement
	 * @generated
	 */
	public Adapter createPattern_ETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Pattern EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPattern_EStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_EGenericType <em>Pattern EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_EGenericType
	 * @generated
	 */
	public Adapter createPattern_EGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_ETypeParameter <em>Pattern EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_ETypeParameter
	 * @generated
	 */
	public Adapter createPattern_ETypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	public Adapter createPattern_DomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAttribute <em>Pattern Diff EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute
	 * @generated
	 */
	public Adapter createPattern_DiffEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType <em>Pattern Diff EAttribute eAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType
	 * @generated
	 */
	public Adapter createPattern_DiffEAttribute_eAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAnnotation <em>Pattern Diff EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation
	 * @generated
	 */
	public Adapter createPattern_DiffEAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_details <em>Pattern Diff EAnnotation details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_details
	 * @generated
	 */
	public Adapter createPattern_DiffEAnnotation_detailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement <em>Pattern Diff EAnnotation eModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement
	 * @generated
	 */
	public Adapter createPattern_DiffEAnnotation_eModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_contents <em>Pattern Diff EAnnotation contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_contents
	 * @generated
	 */
	public Adapter createPattern_DiffEAnnotation_contentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEAnnotation_references <em>Pattern Diff EAnnotation references</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEAnnotation_references
	 * @generated
	 */
	public Adapter createPattern_DiffEAnnotation_referencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass <em>Pattern Diff EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass
	 * @generated
	 */
	public Adapter createPattern_DiffEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eSuperTypes <em>Pattern Diff EClass eSuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eSuperTypes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eOperations <em>Pattern Diff EClass eOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eOperations
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllAttributes <em>Pattern Diff EClass eAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllAttributes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllReferences <em>Pattern Diff EClass eAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllReferences
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eReferences <em>Pattern Diff EClass eReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eReferences
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAttributes <em>Pattern Diff EClass eAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAttributes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllContainments <em>Pattern Diff EClass eAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllContainments
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllContainmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllOperations <em>Pattern Diff EClass eAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllOperations
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures <em>Pattern Diff EClass eAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllStructuralFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes <em>Pattern Diff EClass eAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eIDAttribute <em>Pattern Diff EClass eID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eIDAttribute
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eIDAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures <em>Pattern Diff EClass eStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eStructuralFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes <em>Pattern Diff EClass eGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eGenericSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes <em>Pattern Diff EClass eAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes
	 * @generated
	 */
	public Adapter createPattern_DiffEClass_eAllGenericSuperTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClassifier_ePackage <em>Pattern Diff EClassifier ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_ePackage
	 * @generated
	 */
	public Adapter createPattern_DiffEClassifier_ePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters <em>Pattern Diff EClassifier eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters
	 * @generated
	 */
	public Adapter createPattern_DiffEClassifier_eTypeParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEDataType <em>Pattern Diff EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEDataType
	 * @generated
	 */
	public Adapter createPattern_DiffEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEEnum <em>Pattern Diff EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEEnum
	 * @generated
	 */
	public Adapter createPattern_DiffEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEEnum_eLiterals <em>Pattern Diff EEnum eLiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEEnum_eLiterals
	 * @generated
	 */
	public Adapter createPattern_DiffEEnum_eLiteralsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral <em>Pattern Diff EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral
	 * @generated
	 */
	public Adapter createPattern_DiffEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum <em>Pattern Diff EEnum Literal eEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum
	 * @generated
	 */
	public Adapter createPattern_DiffEEnumLiteral_eEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEFactory <em>Pattern Diff EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEFactory
	 * @generated
	 */
	public Adapter createPattern_DiffEFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEFactory_ePackage <em>Pattern Diff EFactory ePackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEFactory_ePackage
	 * @generated
	 */
	public Adapter createPattern_DiffEFactory_ePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations <em>Pattern Diff EModel Element eAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations
	 * @generated
	 */
	public Adapter createPattern_DiffEModelElement_eAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEObject <em>Pattern Diff EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEObject
	 * @generated
	 */
	public Adapter createPattern_DiffEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation <em>Pattern Diff EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation
	 * @generated
	 */
	public Adapter createPattern_DiffEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation_eContainingClass <em>Pattern Diff EOperation eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eContainingClass
	 * @generated
	 */
	public Adapter createPattern_DiffEOperation_eContainingClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters <em>Pattern Diff EOperation eType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters
	 * @generated
	 */
	public Adapter createPattern_DiffEOperation_eTypeParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation_eParameters <em>Pattern Diff EOperation eParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eParameters
	 * @generated
	 */
	public Adapter createPattern_DiffEOperation_eParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation_eExceptions <em>Pattern Diff EOperation eExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eExceptions
	 * @generated
	 */
	public Adapter createPattern_DiffEOperation_eExceptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions <em>Pattern Diff EOperation eGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions
	 * @generated
	 */
	public Adapter createPattern_DiffEOperation_eGenericExceptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage <em>Pattern Diff EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage
	 * @generated
	 */
	public Adapter createPattern_DiffEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance <em>Pattern Diff EPackage eFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_eFactoryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage_eClassifiers <em>Pattern Diff EPackage eClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eClassifiers
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_eClassifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage_eSubpackages <em>Pattern Diff EPackage eSubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSubpackages
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_eSubpackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage <em>Pattern Diff EPackage eSuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_eSuperPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs <em>Pattern Diff EPackage domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs
	 * @generated
	 */
	public Adapter createPattern_DiffEPackage_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEParameter <em>Pattern Diff EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEParameter
	 * @generated
	 */
	public Adapter createPattern_DiffEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEParameter_eOperation <em>Pattern Diff EParameter eOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEParameter_eOperation
	 * @generated
	 */
	public Adapter createPattern_DiffEParameter_eOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEReference <em>Pattern Diff EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEReference
	 * @generated
	 */
	public Adapter createPattern_DiffEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEReference_eOpposite <em>Pattern Diff EReference eOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eOpposite
	 * @generated
	 */
	public Adapter createPattern_DiffEReference_eOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEReference_eReferenceType <em>Pattern Diff EReference eReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eReferenceType
	 * @generated
	 */
	public Adapter createPattern_DiffEReference_eReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEReference_eKeys <em>Pattern Diff EReference eKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEReference_eKeys
	 * @generated
	 */
	public Adapter createPattern_DiffEReference_eKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass <em>Pattern Diff EStructural Feature eContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass
	 * @generated
	 */
	public Adapter createPattern_DiffEStructuralFeature_eContainingClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffETypedElement_eType <em>Pattern Diff ETyped Element eType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eType
	 * @generated
	 */
	public Adapter createPattern_DiffETypedElement_eTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffETypedElement_eGenericType <em>Pattern Diff ETyped Element eGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffETypedElement_eGenericType
	 * @generated
	 */
	public Adapter createPattern_DiffETypedElement_eGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Pattern Diff EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPattern_DiffEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType <em>Pattern Diff EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound <em>Pattern Diff EGeneric Type eUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eUpperBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments <em>Pattern Diff EGeneric Type eType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eTypeArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eRawType <em>Pattern Diff EGeneric Type eRaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eRawType
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eRawTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound <em>Pattern Diff EGeneric Type eLower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eLowerBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter <em>Pattern Diff EGeneric Type eType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffEGenericType_eClassifier <em>Pattern Diff EGeneric Type eClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffEGenericType_eClassifier
	 * @generated
	 */
	public Adapter createPattern_DiffEGenericType_eClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffETypeParameter <em>Pattern Diff EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter
	 * @generated
	 */
	public Adapter createPattern_DiffETypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Pattern_DiffETypeParameter_eBounds <em>Pattern Diff EType Parameter eBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Pattern_DiffETypeParameter_eBounds
	 * @generated
	 */
	public Adapter createPattern_DiffETypeParameter_eBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
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

} //EcoreRuleMMAdapterFactory
