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
import ecoreDiffMM.EParameter;
import ecoreDiffMM.EReference;
import ecoreDiffMM.EStructuralFeature;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.ETypedElement;

import ecoreRuleMM.*;

import java.util.Map;

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
 * @see ecoreRuleMM.EcoreRuleMMPackage
 * @generated
 */
public class EcoreRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = EcoreRuleMMPackage.eINSTANCE;
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
			case EcoreRuleMMPackage.PATTERN_EATTRIBUTE: {
				Pattern_EAttribute pattern_EAttribute = (Pattern_EAttribute)theEObject;
				T result = casePattern_EAttribute(pattern_EAttribute);
				if (result == null) result = caseEAttribute(pattern_EAttribute);
				if (result == null) result = caseEStructuralFeature(pattern_EAttribute);
				if (result == null) result = caseETypedElement(pattern_EAttribute);
				if (result == null) result = caseENamedElement(pattern_EAttribute);
				if (result == null) result = caseEModelElement(pattern_EAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EANNOTATION: {
				Pattern_EAnnotation pattern_EAnnotation = (Pattern_EAnnotation)theEObject;
				T result = casePattern_EAnnotation(pattern_EAnnotation);
				if (result == null) result = caseEAnnotation(pattern_EAnnotation);
				if (result == null) result = caseEModelElement(pattern_EAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ECLASS: {
				Pattern_EClass pattern_EClass = (Pattern_EClass)theEObject;
				T result = casePattern_EClass(pattern_EClass);
				if (result == null) result = caseEClass(pattern_EClass);
				if (result == null) result = caseEClassifier(pattern_EClass);
				if (result == null) result = caseENamedElement(pattern_EClass);
				if (result == null) result = caseEModelElement(pattern_EClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ECLASSIFIER: {
				Pattern_EClassifier pattern_EClassifier = (Pattern_EClassifier)theEObject;
				T result = casePattern_EClassifier(pattern_EClassifier);
				if (result == null) result = caseEClassifier(pattern_EClassifier);
				if (result == null) result = caseENamedElement(pattern_EClassifier);
				if (result == null) result = caseEModelElement(pattern_EClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EDATA_TYPE: {
				Pattern_EDataType pattern_EDataType = (Pattern_EDataType)theEObject;
				T result = casePattern_EDataType(pattern_EDataType);
				if (result == null) result = caseEDataType(pattern_EDataType);
				if (result == null) result = caseEClassifier(pattern_EDataType);
				if (result == null) result = caseENamedElement(pattern_EDataType);
				if (result == null) result = caseEModelElement(pattern_EDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EENUM: {
				Pattern_EEnum pattern_EEnum = (Pattern_EEnum)theEObject;
				T result = casePattern_EEnum(pattern_EEnum);
				if (result == null) result = caseEEnum(pattern_EEnum);
				if (result == null) result = caseEDataType(pattern_EEnum);
				if (result == null) result = caseEClassifier(pattern_EEnum);
				if (result == null) result = caseENamedElement(pattern_EEnum);
				if (result == null) result = caseEModelElement(pattern_EEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EENUM_LITERAL: {
				Pattern_EEnumLiteral pattern_EEnumLiteral = (Pattern_EEnumLiteral)theEObject;
				T result = casePattern_EEnumLiteral(pattern_EEnumLiteral);
				if (result == null) result = caseEEnumLiteral(pattern_EEnumLiteral);
				if (result == null) result = caseENamedElement(pattern_EEnumLiteral);
				if (result == null) result = caseEModelElement(pattern_EEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EFACTORY: {
				Pattern_EFactory pattern_EFactory = (Pattern_EFactory)theEObject;
				T result = casePattern_EFactory(pattern_EFactory);
				if (result == null) result = caseEFactory(pattern_EFactory);
				if (result == null) result = caseEModelElement(pattern_EFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EMODEL_ELEMENT: {
				Pattern_EModelElement pattern_EModelElement = (Pattern_EModelElement)theEObject;
				T result = casePattern_EModelElement(pattern_EModelElement);
				if (result == null) result = caseEModelElement(pattern_EModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ENAMED_ELEMENT: {
				Pattern_ENamedElement pattern_ENamedElement = (Pattern_ENamedElement)theEObject;
				T result = casePattern_ENamedElement(pattern_ENamedElement);
				if (result == null) result = caseENamedElement(pattern_ENamedElement);
				if (result == null) result = caseEModelElement(pattern_ENamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EOBJECT: {
				Pattern_EObject pattern_EObject = (Pattern_EObject)theEObject;
				T result = casePattern_EObject(pattern_EObject);
				if (result == null) result = caseEObject(pattern_EObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EOPERATION: {
				Pattern_EOperation pattern_EOperation = (Pattern_EOperation)theEObject;
				T result = casePattern_EOperation(pattern_EOperation);
				if (result == null) result = caseEOperation(pattern_EOperation);
				if (result == null) result = caseETypedElement(pattern_EOperation);
				if (result == null) result = caseENamedElement(pattern_EOperation);
				if (result == null) result = caseEModelElement(pattern_EOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EPACKAGE: {
				Pattern_EPackage pattern_EPackage = (Pattern_EPackage)theEObject;
				T result = casePattern_EPackage(pattern_EPackage);
				if (result == null) result = caseEPackage(pattern_EPackage);
				if (result == null) result = caseENamedElement(pattern_EPackage);
				if (result == null) result = caseEModelElement(pattern_EPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EPARAMETER: {
				Pattern_EParameter pattern_EParameter = (Pattern_EParameter)theEObject;
				T result = casePattern_EParameter(pattern_EParameter);
				if (result == null) result = caseEParameter(pattern_EParameter);
				if (result == null) result = caseETypedElement(pattern_EParameter);
				if (result == null) result = caseENamedElement(pattern_EParameter);
				if (result == null) result = caseEModelElement(pattern_EParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EREFERENCE: {
				Pattern_EReference pattern_EReference = (Pattern_EReference)theEObject;
				T result = casePattern_EReference(pattern_EReference);
				if (result == null) result = caseEReference(pattern_EReference);
				if (result == null) result = caseEStructuralFeature(pattern_EReference);
				if (result == null) result = caseETypedElement(pattern_EReference);
				if (result == null) result = caseENamedElement(pattern_EReference);
				if (result == null) result = caseEModelElement(pattern_EReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ESTRUCTURAL_FEATURE: {
				Pattern_EStructuralFeature pattern_EStructuralFeature = (Pattern_EStructuralFeature)theEObject;
				T result = casePattern_EStructuralFeature(pattern_EStructuralFeature);
				if (result == null) result = caseEStructuralFeature(pattern_EStructuralFeature);
				if (result == null) result = caseETypedElement(pattern_EStructuralFeature);
				if (result == null) result = caseENamedElement(pattern_EStructuralFeature);
				if (result == null) result = caseEModelElement(pattern_EStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ETYPED_ELEMENT: {
				Pattern_ETypedElement pattern_ETypedElement = (Pattern_ETypedElement)theEObject;
				T result = casePattern_ETypedElement(pattern_ETypedElement);
				if (result == null) result = caseETypedElement(pattern_ETypedElement);
				if (result == null) result = caseENamedElement(pattern_ETypedElement);
				if (result == null) result = caseEModelElement(pattern_ETypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> pattern_EStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = casePattern_EStringToStringMapEntry(pattern_EStringToStringMapEntry);
				if (result == null) result = caseEStringToStringMapEntry((Map.Entry<String, String>)pattern_EStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_EGENERIC_TYPE: {
				Pattern_EGenericType pattern_EGenericType = (Pattern_EGenericType)theEObject;
				T result = casePattern_EGenericType(pattern_EGenericType);
				if (result == null) result = caseEGenericType(pattern_EGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_ETYPE_PARAMETER: {
				Pattern_ETypeParameter pattern_ETypeParameter = (Pattern_ETypeParameter)theEObject;
				T result = casePattern_ETypeParameter(pattern_ETypeParameter);
				if (result == null) result = caseETypeParameter(pattern_ETypeParameter);
				if (result == null) result = caseENamedElement(pattern_ETypeParameter);
				if (result == null) result = caseEModelElement(pattern_ETypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: {
				Pattern_DomainSpecificDiff pattern_DomainSpecificDiff = (Pattern_DomainSpecificDiff)theEObject;
				T result = casePattern_DomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = caseDomainSpecificDiff(pattern_DomainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: {
				Pattern_DiffEAttribute pattern_DiffEAttribute = (Pattern_DiffEAttribute)theEObject;
				T result = casePattern_DiffEAttribute(pattern_DiffEAttribute);
				if (result == null) result = caseDiffEAttribute(pattern_DiffEAttribute);
				if (result == null) result = caseEAttribute(pattern_DiffEAttribute);
				if (result == null) result = caseEStructuralFeature(pattern_DiffEAttribute);
				if (result == null) result = caseETypedElement(pattern_DiffEAttribute);
				if (result == null) result = caseENamedElement(pattern_DiffEAttribute);
				if (result == null) result = caseEModelElement(pattern_DiffEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE: {
				Pattern_DiffEAttribute_eAttributeType pattern_DiffEAttribute_eAttributeType = (Pattern_DiffEAttribute_eAttributeType)theEObject;
				T result = casePattern_DiffEAttribute_eAttributeType(pattern_DiffEAttribute_eAttributeType);
				if (result == null) result = caseDiffEAttribute_eAttributeType(pattern_DiffEAttribute_eAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION: {
				Pattern_DiffEAnnotation pattern_DiffEAnnotation = (Pattern_DiffEAnnotation)theEObject;
				T result = casePattern_DiffEAnnotation(pattern_DiffEAnnotation);
				if (result == null) result = caseDiffEAnnotation(pattern_DiffEAnnotation);
				if (result == null) result = caseEAnnotation(pattern_DiffEAnnotation);
				if (result == null) result = caseEModelElement(pattern_DiffEAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_DETAILS: {
				Pattern_DiffEAnnotation_details pattern_DiffEAnnotation_details = (Pattern_DiffEAnnotation_details)theEObject;
				T result = casePattern_DiffEAnnotation_details(pattern_DiffEAnnotation_details);
				if (result == null) result = caseDiffEAnnotation_details(pattern_DiffEAnnotation_details);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT: {
				Pattern_DiffEAnnotation_eModelElement pattern_DiffEAnnotation_eModelElement = (Pattern_DiffEAnnotation_eModelElement)theEObject;
				T result = casePattern_DiffEAnnotation_eModelElement(pattern_DiffEAnnotation_eModelElement);
				if (result == null) result = caseDiffEAnnotation_eModelElement(pattern_DiffEAnnotation_eModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_CONTENTS: {
				Pattern_DiffEAnnotation_contents pattern_DiffEAnnotation_contents = (Pattern_DiffEAnnotation_contents)theEObject;
				T result = casePattern_DiffEAnnotation_contents(pattern_DiffEAnnotation_contents);
				if (result == null) result = caseDiffEAnnotation_contents(pattern_DiffEAnnotation_contents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_REFERENCES: {
				Pattern_DiffEAnnotation_references pattern_DiffEAnnotation_references = (Pattern_DiffEAnnotation_references)theEObject;
				T result = casePattern_DiffEAnnotation_references(pattern_DiffEAnnotation_references);
				if (result == null) result = caseDiffEAnnotation_references(pattern_DiffEAnnotation_references);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS: {
				Pattern_DiffEClass pattern_DiffEClass = (Pattern_DiffEClass)theEObject;
				T result = casePattern_DiffEClass(pattern_DiffEClass);
				if (result == null) result = caseDiffEClass(pattern_DiffEClass);
				if (result == null) result = caseEClass(pattern_DiffEClass);
				if (result == null) result = caseEClassifier(pattern_DiffEClass);
				if (result == null) result = caseENamedElement(pattern_DiffEClass);
				if (result == null) result = caseEModelElement(pattern_DiffEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPER_TYPES: {
				Pattern_DiffEClass_eSuperTypes pattern_DiffEClass_eSuperTypes = (Pattern_DiffEClass_eSuperTypes)theEObject;
				T result = casePattern_DiffEClass_eSuperTypes(pattern_DiffEClass_eSuperTypes);
				if (result == null) result = caseDiffEClass_eSuperTypes(pattern_DiffEClass_eSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: {
				Pattern_DiffEClass_eOperations pattern_DiffEClass_eOperations = (Pattern_DiffEClass_eOperations)theEObject;
				T result = casePattern_DiffEClass_eOperations(pattern_DiffEClass_eOperations);
				if (result == null) result = caseDiffEClass_eOperations(pattern_DiffEClass_eOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES: {
				Pattern_DiffEClass_eAllAttributes pattern_DiffEClass_eAllAttributes = (Pattern_DiffEClass_eAllAttributes)theEObject;
				T result = casePattern_DiffEClass_eAllAttributes(pattern_DiffEClass_eAllAttributes);
				if (result == null) result = caseDiffEClass_eAllAttributes(pattern_DiffEClass_eAllAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_REFERENCES: {
				Pattern_DiffEClass_eAllReferences pattern_DiffEClass_eAllReferences = (Pattern_DiffEClass_eAllReferences)theEObject;
				T result = casePattern_DiffEClass_eAllReferences(pattern_DiffEClass_eAllReferences);
				if (result == null) result = caseDiffEClass_eAllReferences(pattern_DiffEClass_eAllReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: {
				Pattern_DiffEClass_eReferences pattern_DiffEClass_eReferences = (Pattern_DiffEClass_eReferences)theEObject;
				T result = casePattern_DiffEClass_eReferences(pattern_DiffEClass_eReferences);
				if (result == null) result = caseDiffEClass_eReferences(pattern_DiffEClass_eReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: {
				Pattern_DiffEClass_eAttributes pattern_DiffEClass_eAttributes = (Pattern_DiffEClass_eAttributes)theEObject;
				T result = casePattern_DiffEClass_eAttributes(pattern_DiffEClass_eAttributes);
				if (result == null) result = caseDiffEClass_eAttributes(pattern_DiffEClass_eAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS: {
				Pattern_DiffEClass_eAllContainments pattern_DiffEClass_eAllContainments = (Pattern_DiffEClass_eAllContainments)theEObject;
				T result = casePattern_DiffEClass_eAllContainments(pattern_DiffEClass_eAllContainments);
				if (result == null) result = caseDiffEClass_eAllContainments(pattern_DiffEClass_eAllContainments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_OPERATIONS: {
				Pattern_DiffEClass_eAllOperations pattern_DiffEClass_eAllOperations = (Pattern_DiffEClass_eAllOperations)theEObject;
				T result = casePattern_DiffEClass_eAllOperations(pattern_DiffEClass_eAllOperations);
				if (result == null) result = caseDiffEClass_eAllOperations(pattern_DiffEClass_eAllOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES: {
				Pattern_DiffEClass_eAllStructuralFeatures pattern_DiffEClass_eAllStructuralFeatures = (Pattern_DiffEClass_eAllStructuralFeatures)theEObject;
				T result = casePattern_DiffEClass_eAllStructuralFeatures(pattern_DiffEClass_eAllStructuralFeatures);
				if (result == null) result = caseDiffEClass_eAllStructuralFeatures(pattern_DiffEClass_eAllStructuralFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES: {
				Pattern_DiffEClass_eAllSuperTypes pattern_DiffEClass_eAllSuperTypes = (Pattern_DiffEClass_eAllSuperTypes)theEObject;
				T result = casePattern_DiffEClass_eAllSuperTypes(pattern_DiffEClass_eAllSuperTypes);
				if (result == null) result = caseDiffEClass_eAllSuperTypes(pattern_DiffEClass_eAllSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EID_ATTRIBUTE: {
				Pattern_DiffEClass_eIDAttribute pattern_DiffEClass_eIDAttribute = (Pattern_DiffEClass_eIDAttribute)theEObject;
				T result = casePattern_DiffEClass_eIDAttribute(pattern_DiffEClass_eIDAttribute);
				if (result == null) result = caseDiffEClass_eIDAttribute(pattern_DiffEClass_eIDAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES: {
				Pattern_DiffEClass_eStructuralFeatures pattern_DiffEClass_eStructuralFeatures = (Pattern_DiffEClass_eStructuralFeatures)theEObject;
				T result = casePattern_DiffEClass_eStructuralFeatures(pattern_DiffEClass_eStructuralFeatures);
				if (result == null) result = caseDiffEClass_eStructuralFeatures(pattern_DiffEClass_eStructuralFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES: {
				Pattern_DiffEClass_eGenericSuperTypes pattern_DiffEClass_eGenericSuperTypes = (Pattern_DiffEClass_eGenericSuperTypes)theEObject;
				T result = casePattern_DiffEClass_eGenericSuperTypes(pattern_DiffEClass_eGenericSuperTypes);
				if (result == null) result = caseDiffEClass_eGenericSuperTypes(pattern_DiffEClass_eGenericSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES: {
				Pattern_DiffEClass_eAllGenericSuperTypes pattern_DiffEClass_eAllGenericSuperTypes = (Pattern_DiffEClass_eAllGenericSuperTypes)theEObject;
				T result = casePattern_DiffEClass_eAllGenericSuperTypes(pattern_DiffEClass_eAllGenericSuperTypes);
				if (result == null) result = caseDiffEClass_eAllGenericSuperTypes(pattern_DiffEClass_eAllGenericSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASSIFIER_EPACKAGE: {
				Pattern_DiffEClassifier_ePackage pattern_DiffEClassifier_ePackage = (Pattern_DiffEClassifier_ePackage)theEObject;
				T result = casePattern_DiffEClassifier_ePackage(pattern_DiffEClassifier_ePackage);
				if (result == null) result = caseDiffEClassifier_ePackage(pattern_DiffEClassifier_ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS: {
				Pattern_DiffEClassifier_eTypeParameters pattern_DiffEClassifier_eTypeParameters = (Pattern_DiffEClassifier_eTypeParameters)theEObject;
				T result = casePattern_DiffEClassifier_eTypeParameters(pattern_DiffEClassifier_eTypeParameters);
				if (result == null) result = caseDiffEClassifier_eTypeParameters(pattern_DiffEClassifier_eTypeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EDATA_TYPE: {
				Pattern_DiffEDataType pattern_DiffEDataType = (Pattern_DiffEDataType)theEObject;
				T result = casePattern_DiffEDataType(pattern_DiffEDataType);
				if (result == null) result = caseDiffEDataType(pattern_DiffEDataType);
				if (result == null) result = caseEDataType(pattern_DiffEDataType);
				if (result == null) result = caseEClassifier(pattern_DiffEDataType);
				if (result == null) result = caseENamedElement(pattern_DiffEDataType);
				if (result == null) result = caseEModelElement(pattern_DiffEDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM: {
				Pattern_DiffEEnum pattern_DiffEEnum = (Pattern_DiffEEnum)theEObject;
				T result = casePattern_DiffEEnum(pattern_DiffEEnum);
				if (result == null) result = caseDiffEEnum(pattern_DiffEEnum);
				if (result == null) result = caseEEnum(pattern_DiffEEnum);
				if (result == null) result = caseEDataType(pattern_DiffEEnum);
				if (result == null) result = caseEClassifier(pattern_DiffEEnum);
				if (result == null) result = caseENamedElement(pattern_DiffEEnum);
				if (result == null) result = caseEModelElement(pattern_DiffEEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_ELITERALS: {
				Pattern_DiffEEnum_eLiterals pattern_DiffEEnum_eLiterals = (Pattern_DiffEEnum_eLiterals)theEObject;
				T result = casePattern_DiffEEnum_eLiterals(pattern_DiffEEnum_eLiterals);
				if (result == null) result = caseDiffEEnum_eLiterals(pattern_DiffEEnum_eLiterals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_LITERAL: {
				Pattern_DiffEEnumLiteral pattern_DiffEEnumLiteral = (Pattern_DiffEEnumLiteral)theEObject;
				T result = casePattern_DiffEEnumLiteral(pattern_DiffEEnumLiteral);
				if (result == null) result = caseDiffEEnumLiteral(pattern_DiffEEnumLiteral);
				if (result == null) result = caseEEnumLiteral(pattern_DiffEEnumLiteral);
				if (result == null) result = caseENamedElement(pattern_DiffEEnumLiteral);
				if (result == null) result = caseEModelElement(pattern_DiffEEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_LITERAL_EENUM: {
				Pattern_DiffEEnumLiteral_eEnum pattern_DiffEEnumLiteral_eEnum = (Pattern_DiffEEnumLiteral_eEnum)theEObject;
				T result = casePattern_DiffEEnumLiteral_eEnum(pattern_DiffEEnumLiteral_eEnum);
				if (result == null) result = caseDiffEEnumLiteral_eEnum(pattern_DiffEEnumLiteral_eEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EFACTORY: {
				Pattern_DiffEFactory pattern_DiffEFactory = (Pattern_DiffEFactory)theEObject;
				T result = casePattern_DiffEFactory(pattern_DiffEFactory);
				if (result == null) result = caseDiffEFactory(pattern_DiffEFactory);
				if (result == null) result = caseEFactory(pattern_DiffEFactory);
				if (result == null) result = caseEModelElement(pattern_DiffEFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EFACTORY_EPACKAGE: {
				Pattern_DiffEFactory_ePackage pattern_DiffEFactory_ePackage = (Pattern_DiffEFactory_ePackage)theEObject;
				T result = casePattern_DiffEFactory_ePackage(pattern_DiffEFactory_ePackage);
				if (result == null) result = caseDiffEFactory_ePackage(pattern_DiffEFactory_ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS: {
				Pattern_DiffEModelElement_eAnnotations pattern_DiffEModelElement_eAnnotations = (Pattern_DiffEModelElement_eAnnotations)theEObject;
				T result = casePattern_DiffEModelElement_eAnnotations(pattern_DiffEModelElement_eAnnotations);
				if (result == null) result = caseDiffEModelElement_eAnnotations(pattern_DiffEModelElement_eAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT: {
				Pattern_DiffEObject pattern_DiffEObject = (Pattern_DiffEObject)theEObject;
				T result = casePattern_DiffEObject(pattern_DiffEObject);
				if (result == null) result = caseDiffEObject(pattern_DiffEObject);
				if (result == null) result = caseEObject(pattern_DiffEObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION: {
				Pattern_DiffEOperation pattern_DiffEOperation = (Pattern_DiffEOperation)theEObject;
				T result = casePattern_DiffEOperation(pattern_DiffEOperation);
				if (result == null) result = caseDiffEOperation(pattern_DiffEOperation);
				if (result == null) result = caseEOperation(pattern_DiffEOperation);
				if (result == null) result = caseETypedElement(pattern_DiffEOperation);
				if (result == null) result = caseENamedElement(pattern_DiffEOperation);
				if (result == null) result = caseEModelElement(pattern_DiffEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS: {
				Pattern_DiffEOperation_eContainingClass pattern_DiffEOperation_eContainingClass = (Pattern_DiffEOperation_eContainingClass)theEObject;
				T result = casePattern_DiffEOperation_eContainingClass(pattern_DiffEOperation_eContainingClass);
				if (result == null) result = caseDiffEOperation_eContainingClass(pattern_DiffEOperation_eContainingClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS: {
				Pattern_DiffEOperation_eTypeParameters pattern_DiffEOperation_eTypeParameters = (Pattern_DiffEOperation_eTypeParameters)theEObject;
				T result = casePattern_DiffEOperation_eTypeParameters(pattern_DiffEOperation_eTypeParameters);
				if (result == null) result = caseDiffEOperation_eTypeParameters(pattern_DiffEOperation_eTypeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EPARAMETERS: {
				Pattern_DiffEOperation_eParameters pattern_DiffEOperation_eParameters = (Pattern_DiffEOperation_eParameters)theEObject;
				T result = casePattern_DiffEOperation_eParameters(pattern_DiffEOperation_eParameters);
				if (result == null) result = caseDiffEOperation_eParameters(pattern_DiffEOperation_eParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EEXCEPTIONS: {
				Pattern_DiffEOperation_eExceptions pattern_DiffEOperation_eExceptions = (Pattern_DiffEOperation_eExceptions)theEObject;
				T result = casePattern_DiffEOperation_eExceptions(pattern_DiffEOperation_eExceptions);
				if (result == null) result = caseDiffEOperation_eExceptions(pattern_DiffEOperation_eExceptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS: {
				Pattern_DiffEOperation_eGenericExceptions pattern_DiffEOperation_eGenericExceptions = (Pattern_DiffEOperation_eGenericExceptions)theEObject;
				T result = casePattern_DiffEOperation_eGenericExceptions(pattern_DiffEOperation_eGenericExceptions);
				if (result == null) result = caseDiffEOperation_eGenericExceptions(pattern_DiffEOperation_eGenericExceptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE: {
				Pattern_DiffEPackage pattern_DiffEPackage = (Pattern_DiffEPackage)theEObject;
				T result = casePattern_DiffEPackage(pattern_DiffEPackage);
				if (result == null) result = caseDiffEPackage(pattern_DiffEPackage);
				if (result == null) result = caseEPackage(pattern_DiffEPackage);
				if (result == null) result = caseENamedElement(pattern_DiffEPackage);
				if (result == null) result = caseEModelElement(pattern_DiffEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE: {
				Pattern_DiffEPackage_eFactoryInstance pattern_DiffEPackage_eFactoryInstance = (Pattern_DiffEPackage_eFactoryInstance)theEObject;
				T result = casePattern_DiffEPackage_eFactoryInstance(pattern_DiffEPackage_eFactoryInstance);
				if (result == null) result = caseDiffEPackage_eFactoryInstance(pattern_DiffEPackage_eFactoryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: {
				Pattern_DiffEPackage_eClassifiers pattern_DiffEPackage_eClassifiers = (Pattern_DiffEPackage_eClassifiers)theEObject;
				T result = casePattern_DiffEPackage_eClassifiers(pattern_DiffEPackage_eClassifiers);
				if (result == null) result = caseDiffEPackage_eClassifiers(pattern_DiffEPackage_eClassifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ESUBPACKAGES: {
				Pattern_DiffEPackage_eSubpackages pattern_DiffEPackage_eSubpackages = (Pattern_DiffEPackage_eSubpackages)theEObject;
				T result = casePattern_DiffEPackage_eSubpackages(pattern_DiffEPackage_eSubpackages);
				if (result == null) result = caseDiffEPackage_eSubpackages(pattern_DiffEPackage_eSubpackages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE: {
				Pattern_DiffEPackage_eSuperPackage pattern_DiffEPackage_eSuperPackage = (Pattern_DiffEPackage_eSuperPackage)theEObject;
				T result = casePattern_DiffEPackage_eSuperPackage(pattern_DiffEPackage_eSuperPackage);
				if (result == null) result = caseDiffEPackage_eSuperPackage(pattern_DiffEPackage_eSuperPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: {
				Pattern_DiffEPackage_domainspecificdiffs pattern_DiffEPackage_domainspecificdiffs = (Pattern_DiffEPackage_domainspecificdiffs)theEObject;
				T result = casePattern_DiffEPackage_domainspecificdiffs(pattern_DiffEPackage_domainspecificdiffs);
				if (result == null) result = caseDiffEPackage_domainspecificdiffs(pattern_DiffEPackage_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPARAMETER: {
				Pattern_DiffEParameter pattern_DiffEParameter = (Pattern_DiffEParameter)theEObject;
				T result = casePattern_DiffEParameter(pattern_DiffEParameter);
				if (result == null) result = caseDiffEParameter(pattern_DiffEParameter);
				if (result == null) result = caseEParameter(pattern_DiffEParameter);
				if (result == null) result = caseETypedElement(pattern_DiffEParameter);
				if (result == null) result = caseENamedElement(pattern_DiffEParameter);
				if (result == null) result = caseEModelElement(pattern_DiffEParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EPARAMETER_EOPERATION: {
				Pattern_DiffEParameter_eOperation pattern_DiffEParameter_eOperation = (Pattern_DiffEParameter_eOperation)theEObject;
				T result = casePattern_DiffEParameter_eOperation(pattern_DiffEParameter_eOperation);
				if (result == null) result = caseDiffEParameter_eOperation(pattern_DiffEParameter_eOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE: {
				Pattern_DiffEReference pattern_DiffEReference = (Pattern_DiffEReference)theEObject;
				T result = casePattern_DiffEReference(pattern_DiffEReference);
				if (result == null) result = caseDiffEReference(pattern_DiffEReference);
				if (result == null) result = caseEReference(pattern_DiffEReference);
				if (result == null) result = caseEStructuralFeature(pattern_DiffEReference);
				if (result == null) result = caseETypedElement(pattern_DiffEReference);
				if (result == null) result = caseENamedElement(pattern_DiffEReference);
				if (result == null) result = caseEModelElement(pattern_DiffEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EOPPOSITE: {
				Pattern_DiffEReference_eOpposite pattern_DiffEReference_eOpposite = (Pattern_DiffEReference_eOpposite)theEObject;
				T result = casePattern_DiffEReference_eOpposite(pattern_DiffEReference_eOpposite);
				if (result == null) result = caseDiffEReference_eOpposite(pattern_DiffEReference_eOpposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE: {
				Pattern_DiffEReference_eReferenceType pattern_DiffEReference_eReferenceType = (Pattern_DiffEReference_eReferenceType)theEObject;
				T result = casePattern_DiffEReference_eReferenceType(pattern_DiffEReference_eReferenceType);
				if (result == null) result = caseDiffEReference_eReferenceType(pattern_DiffEReference_eReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EKEYS: {
				Pattern_DiffEReference_eKeys pattern_DiffEReference_eKeys = (Pattern_DiffEReference_eKeys)theEObject;
				T result = casePattern_DiffEReference_eKeys(pattern_DiffEReference_eKeys);
				if (result == null) result = caseDiffEReference_eKeys(pattern_DiffEReference_eKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS: {
				Pattern_DiffEStructuralFeature_eContainingClass pattern_DiffEStructuralFeature_eContainingClass = (Pattern_DiffEStructuralFeature_eContainingClass)theEObject;
				T result = casePattern_DiffEStructuralFeature_eContainingClass(pattern_DiffEStructuralFeature_eContainingClass);
				if (result == null) result = caseDiffEStructuralFeature_eContainingClass(pattern_DiffEStructuralFeature_eContainingClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPED_ELEMENT_ETYPE: {
				Pattern_DiffETypedElement_eType pattern_DiffETypedElement_eType = (Pattern_DiffETypedElement_eType)theEObject;
				T result = casePattern_DiffETypedElement_eType(pattern_DiffETypedElement_eType);
				if (result == null) result = caseDiffETypedElement_eType(pattern_DiffETypedElement_eType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE: {
				Pattern_DiffETypedElement_eGenericType pattern_DiffETypedElement_eGenericType = (Pattern_DiffETypedElement_eGenericType)theEObject;
				T result = casePattern_DiffETypedElement_eGenericType(pattern_DiffETypedElement_eGenericType);
				if (result == null) result = caseDiffETypedElement_eGenericType(pattern_DiffETypedElement_eGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> pattern_DiffEStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = casePattern_DiffEStringToStringMapEntry(pattern_DiffEStringToStringMapEntry);
				if (result == null) result = caseDiffEStringToStringMapEntry((Map.Entry<String, String>)pattern_DiffEStringToStringMapEntry);
				if (result == null) result = caseEStringToStringMapEntry((Map.Entry<String, String>)pattern_DiffEStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE: {
				Pattern_DiffEGenericType pattern_DiffEGenericType = (Pattern_DiffEGenericType)theEObject;
				T result = casePattern_DiffEGenericType(pattern_DiffEGenericType);
				if (result == null) result = caseDiffEGenericType(pattern_DiffEGenericType);
				if (result == null) result = caseEGenericType(pattern_DiffEGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND: {
				Pattern_DiffEGenericType_eUpperBound pattern_DiffEGenericType_eUpperBound = (Pattern_DiffEGenericType_eUpperBound)theEObject;
				T result = casePattern_DiffEGenericType_eUpperBound(pattern_DiffEGenericType_eUpperBound);
				if (result == null) result = caseDiffEGenericType_eUpperBound(pattern_DiffEGenericType_eUpperBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS: {
				Pattern_DiffEGenericType_eTypeArguments pattern_DiffEGenericType_eTypeArguments = (Pattern_DiffEGenericType_eTypeArguments)theEObject;
				T result = casePattern_DiffEGenericType_eTypeArguments(pattern_DiffEGenericType_eTypeArguments);
				if (result == null) result = caseDiffEGenericType_eTypeArguments(pattern_DiffEGenericType_eTypeArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE: {
				Pattern_DiffEGenericType_eRawType pattern_DiffEGenericType_eRawType = (Pattern_DiffEGenericType_eRawType)theEObject;
				T result = casePattern_DiffEGenericType_eRawType(pattern_DiffEGenericType_eRawType);
				if (result == null) result = caseDiffEGenericType_eRawType(pattern_DiffEGenericType_eRawType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND: {
				Pattern_DiffEGenericType_eLowerBound pattern_DiffEGenericType_eLowerBound = (Pattern_DiffEGenericType_eLowerBound)theEObject;
				T result = casePattern_DiffEGenericType_eLowerBound(pattern_DiffEGenericType_eLowerBound);
				if (result == null) result = caseDiffEGenericType_eLowerBound(pattern_DiffEGenericType_eLowerBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER: {
				Pattern_DiffEGenericType_eTypeParameter pattern_DiffEGenericType_eTypeParameter = (Pattern_DiffEGenericType_eTypeParameter)theEObject;
				T result = casePattern_DiffEGenericType_eTypeParameter(pattern_DiffEGenericType_eTypeParameter);
				if (result == null) result = caseDiffEGenericType_eTypeParameter(pattern_DiffEGenericType_eTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER: {
				Pattern_DiffEGenericType_eClassifier pattern_DiffEGenericType_eClassifier = (Pattern_DiffEGenericType_eClassifier)theEObject;
				T result = casePattern_DiffEGenericType_eClassifier(pattern_DiffEGenericType_eClassifier);
				if (result == null) result = caseDiffEGenericType_eClassifier(pattern_DiffEGenericType_eClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPE_PARAMETER: {
				Pattern_DiffETypeParameter pattern_DiffETypeParameter = (Pattern_DiffETypeParameter)theEObject;
				T result = casePattern_DiffETypeParameter(pattern_DiffETypeParameter);
				if (result == null) result = caseDiffETypeParameter(pattern_DiffETypeParameter);
				if (result == null) result = caseETypeParameter(pattern_DiffETypeParameter);
				if (result == null) result = caseENamedElement(pattern_DiffETypeParameter);
				if (result == null) result = caseEModelElement(pattern_DiffETypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS: {
				Pattern_DiffETypeParameter_eBounds pattern_DiffETypeParameter_eBounds = (Pattern_DiffETypeParameter_eBounds)theEObject;
				T result = casePattern_DiffETypeParameter_eBounds(pattern_DiffETypeParameter_eBounds);
				if (result == null) result = caseDiffETypeParameter_eBounds(pattern_DiffETypeParameter_eBounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreRuleMMPackage.RULE: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EAnnotation(Pattern_EAnnotation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EClassifier(Pattern_EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EDataType(Pattern_EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EEnum(Pattern_EEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EEnumLiteral(Pattern_EEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EFactory(Pattern_EFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EModelElement(Pattern_EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ENamedElement(Pattern_ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EObject(Pattern_EObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EParameter(Pattern_EParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EStructuralFeature(Pattern_EStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ETypedElement(Pattern_ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_EGenericType(Pattern_EGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_ETypeParameter(Pattern_ETypeParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAttribute eAttribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAttribute eAttribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAttribute_eAttributeType(Pattern_DiffEAttribute_eAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAnnotation(Pattern_DiffEAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAnnotation_details(Pattern_DiffEAnnotation_details object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation eModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation eModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAnnotation_eModelElement(Pattern_DiffEAnnotation_eModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAnnotation_contents(Pattern_DiffEAnnotation_contents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation references</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EAnnotation references</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEAnnotation_references(Pattern_DiffEAnnotation_references object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eSuper Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eSuper Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eSuperTypes(Pattern_DiffEClass_eSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eOperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eOperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eOperations(Pattern_DiffEClass_eOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllAttributes(Pattern_DiffEClass_eAllAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllReferences(Pattern_DiffEClass_eAllReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eReferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eReferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eReferences(Pattern_DiffEClass_eReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAttributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAttributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAttributes(Pattern_DiffEClass_eAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Containments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Containments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllContainments(Pattern_DiffEClass_eAllContainments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllOperations(Pattern_DiffEClass_eAllOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Structural Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Structural Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllStructuralFeatures(Pattern_DiffEClass_eAllStructuralFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllSuperTypes(Pattern_DiffEClass_eAllSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eID Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eID Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eIDAttribute(Pattern_DiffEClass_eIDAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eStructural Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eStructural Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eStructuralFeatures(Pattern_DiffEClass_eStructuralFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eGeneric Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eGeneric Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eGenericSuperTypes(Pattern_DiffEClass_eGenericSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Generic Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClass eAll Generic Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClass_eAllGenericSuperTypes(Pattern_DiffEClass_eAllGenericSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClassifier ePackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClassifier ePackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClassifier_ePackage(Pattern_DiffEClassifier_ePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EClassifier eType Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EClassifier eType Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEClassifier_eTypeParameters(Pattern_DiffEClassifier_eTypeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEDataType(Pattern_DiffEDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEEnum(Pattern_DiffEEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EEnum eLiterals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EEnum eLiterals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEEnum_eLiterals(Pattern_DiffEEnum_eLiterals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEEnumLiteral(Pattern_DiffEEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EEnum Literal eEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EEnum Literal eEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEEnumLiteral_eEnum(Pattern_DiffEEnumLiteral_eEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEFactory(Pattern_DiffEFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EFactory ePackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EFactory ePackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEFactory_ePackage(Pattern_DiffEFactory_ePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EModel Element eAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EModel Element eAnnotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEModelElement_eAnnotations(Pattern_DiffEModelElement_eAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEObject(Pattern_DiffEObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eContaining Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eContaining Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation_eContainingClass(Pattern_DiffEOperation_eContainingClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eType Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eType Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation_eTypeParameters(Pattern_DiffEOperation_eTypeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eParameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eParameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation_eParameters(Pattern_DiffEOperation_eParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eExceptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eExceptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation_eExceptions(Pattern_DiffEOperation_eExceptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eGeneric Exceptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EOperation eGeneric Exceptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEOperation_eGenericExceptions(Pattern_DiffEOperation_eGenericExceptions object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eFactory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eFactory Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_eFactoryInstance(Pattern_DiffEPackage_eFactoryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eClassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eClassifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_eClassifiers(Pattern_DiffEPackage_eClassifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eSubpackages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eSubpackages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_eSubpackages(Pattern_DiffEPackage_eSubpackages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eSuper Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EPackage eSuper Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEPackage_eSuperPackage(Pattern_DiffEPackage_eSuperPackage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEParameter(Pattern_DiffEParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EParameter eOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EParameter eOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEParameter_eOperation(Pattern_DiffEParameter_eOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EReference eOpposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EReference eOpposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEReference_eOpposite(Pattern_DiffEReference_eOpposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EReference eReference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EReference eReference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEReference_eReferenceType(Pattern_DiffEReference_eReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EReference eKeys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EReference eKeys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEReference_eKeys(Pattern_DiffEReference_eKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EStructural Feature eContaining Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EStructural Feature eContaining Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEStructuralFeature_eContainingClass(Pattern_DiffEStructuralFeature_eContainingClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ETyped Element eType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ETyped Element eType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffETypedElement_eType(Pattern_DiffETypedElement_eType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff ETyped Element eGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff ETyped Element eGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffETypedElement_eGenericType(Pattern_DiffETypedElement_eGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType(Pattern_DiffEGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eUpper Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eUpper Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eUpperBound(Pattern_DiffEGenericType_eUpperBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eType Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eType Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eTypeArguments(Pattern_DiffEGenericType_eTypeArguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eRaw Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eRaw Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eRawType(Pattern_DiffEGenericType_eRawType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eLower Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eLower Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eLowerBound(Pattern_DiffEGenericType_eLowerBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eTypeParameter(Pattern_DiffEGenericType_eTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EGeneric Type eClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEGenericType_eClassifier(Pattern_DiffEGenericType_eClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffETypeParameter(Pattern_DiffETypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff EType Parameter eBounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff EType Parameter eBounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffETypeParameter_eBounds(Pattern_DiffETypeParameter_eBounds object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeature(EStructuralFeature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAnnotation(EAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataType(EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnum(EEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumLiteral(EEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFactory(EFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObject(ecoreDiffMM.EObject object) {
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
	public T caseEPackage(ecoreDiffMM.EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParameter(EParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGenericType(EGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypeParameter(ETypeParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAttribute eAttribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAttribute eAttribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAttribute_eAttributeType(DiffEAttribute_eAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAnnotation(DiffEAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAnnotation details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAnnotation details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAnnotation_details(DiffEAnnotation_details object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAnnotation eModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAnnotation eModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAnnotation_eModelElement(DiffEAnnotation_eModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAnnotation contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAnnotation contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAnnotation_contents(DiffEAnnotation_contents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EAnnotation references</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EAnnotation references</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEAnnotation_references(DiffEAnnotation_references object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eSuper Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eSuper Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eSuperTypes(DiffEClass_eSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eOperations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eOperations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eOperations(DiffEClass_eOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllAttributes(DiffEClass_eAllAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllReferences(DiffEClass_eAllReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eReferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eReferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eReferences(DiffEClass_eReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAttributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAttributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAttributes(DiffEClass_eAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Containments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Containments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllContainments(DiffEClass_eAllContainments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllOperations(DiffEClass_eAllOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Structural Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Structural Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllStructuralFeatures(DiffEClass_eAllStructuralFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllSuperTypes(DiffEClass_eAllSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eID Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eID Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eIDAttribute(DiffEClass_eIDAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eStructural Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eStructural Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eStructuralFeatures(DiffEClass_eStructuralFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eGeneric Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eGeneric Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eGenericSuperTypes(DiffEClass_eGenericSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClass eAll Generic Super Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClass eAll Generic Super Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClass_eAllGenericSuperTypes(DiffEClass_eAllGenericSuperTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClassifier ePackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClassifier ePackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClassifier_ePackage(DiffEClassifier_ePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EClassifier eType Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EClassifier eType Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEClassifier_eTypeParameters(DiffEClassifier_eTypeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEDataType(DiffEDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEEnum(DiffEEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EEnum eLiterals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EEnum eLiterals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEEnum_eLiterals(DiffEEnum_eLiterals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEEnumLiteral(DiffEEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EEnum Literal eEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EEnum Literal eEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEEnumLiteral_eEnum(DiffEEnumLiteral_eEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EFactory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEFactory(DiffEFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EFactory ePackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EFactory ePackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEFactory_ePackage(DiffEFactory_ePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EModel Element eAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EModel Element eAnnotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEModelElement_eAnnotations(DiffEModelElement_eAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEObject(DiffEObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation eContaining Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation eContaining Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation_eContainingClass(DiffEOperation_eContainingClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation eType Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation eType Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation_eTypeParameters(DiffEOperation_eTypeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation eParameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation eParameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation_eParameters(DiffEOperation_eParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation eExceptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation eExceptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation_eExceptions(DiffEOperation_eExceptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EOperation eGeneric Exceptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EOperation eGeneric Exceptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEOperation_eGenericExceptions(DiffEOperation_eGenericExceptions object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage eFactory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage eFactory Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_eFactoryInstance(DiffEPackage_eFactoryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage eClassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage eClassifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_eClassifiers(DiffEPackage_eClassifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage eSubpackages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage eSubpackages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_eSubpackages(DiffEPackage_eSubpackages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EPackage eSuper Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EPackage eSuper Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEPackage_eSuperPackage(DiffEPackage_eSuperPackage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEParameter(DiffEParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EParameter eOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EParameter eOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEParameter_eOperation(DiffEParameter_eOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff EReference eOpposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EReference eOpposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEReference_eOpposite(DiffEReference_eOpposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EReference eReference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EReference eReference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEReference_eReferenceType(DiffEReference_eReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EReference eKeys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EReference eKeys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEReference_eKeys(DiffEReference_eKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EStructural Feature eContaining Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EStructural Feature eContaining Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEStructuralFeature_eContainingClass(DiffEStructuralFeature_eContainingClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ETyped Element eType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ETyped Element eType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffETypedElement_eType(DiffETypedElement_eType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff ETyped Element eGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff ETyped Element eGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffETypedElement_eGenericType(DiffETypedElement_eGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType(DiffEGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eUpper Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eUpper Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eUpperBound(DiffEGenericType_eUpperBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eType Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eType Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eTypeArguments(DiffEGenericType_eTypeArguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eRaw Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eRaw Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eRawType(DiffEGenericType_eRawType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eLower Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eLower Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eLowerBound(DiffEGenericType_eLowerBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eTypeParameter(DiffEGenericType_eTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EGeneric Type eClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EGeneric Type eClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEGenericType_eClassifier(DiffEGenericType_eClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EType Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffETypeParameter(DiffETypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff EType Parameter eBounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff EType Parameter eBounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffETypeParameter_eBounds(DiffETypeParameter_eBounds object) {
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

} //EcoreRuleMMSwitch
