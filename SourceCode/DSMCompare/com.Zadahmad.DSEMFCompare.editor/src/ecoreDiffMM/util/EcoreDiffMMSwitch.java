/**
 */
package ecoreDiffMM.util;

import ecoreDiffMM.*;

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
 * @see ecoreDiffMM.EcoreDiffMMPackage
 * @generated
 */
public class EcoreDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = EcoreDiffMMPackage.eINSTANCE;
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
			case EcoreDiffMMPackage.EATTRIBUTE: {
				EAttribute eAttribute = (EAttribute)theEObject;
				T result = caseEAttribute(eAttribute);
				if (result == null) result = caseEStructuralFeature(eAttribute);
				if (result == null) result = caseETypedElement(eAttribute);
				if (result == null) result = caseENamedElement(eAttribute);
				if (result == null) result = caseEModelElement(eAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EANNOTATION: {
				EAnnotation eAnnotation = (EAnnotation)theEObject;
				T result = caseEAnnotation(eAnnotation);
				if (result == null) result = caseEModelElement(eAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ECLASS: {
				EClass eClass = (EClass)theEObject;
				T result = caseEClass(eClass);
				if (result == null) result = caseEClassifier(eClass);
				if (result == null) result = caseENamedElement(eClass);
				if (result == null) result = caseEModelElement(eClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ECLASSIFIER: {
				EClassifier eClassifier = (EClassifier)theEObject;
				T result = caseEClassifier(eClassifier);
				if (result == null) result = caseENamedElement(eClassifier);
				if (result == null) result = caseEModelElement(eClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EDATA_TYPE: {
				EDataType eDataType = (EDataType)theEObject;
				T result = caseEDataType(eDataType);
				if (result == null) result = caseEClassifier(eDataType);
				if (result == null) result = caseENamedElement(eDataType);
				if (result == null) result = caseEModelElement(eDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EENUM: {
				EEnum eEnum = (EEnum)theEObject;
				T result = caseEEnum(eEnum);
				if (result == null) result = caseEDataType(eEnum);
				if (result == null) result = caseEClassifier(eEnum);
				if (result == null) result = caseENamedElement(eEnum);
				if (result == null) result = caseEModelElement(eEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EENUM_LITERAL: {
				EEnumLiteral eEnumLiteral = (EEnumLiteral)theEObject;
				T result = caseEEnumLiteral(eEnumLiteral);
				if (result == null) result = caseENamedElement(eEnumLiteral);
				if (result == null) result = caseEModelElement(eEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EFACTORY: {
				EFactory eFactory = (EFactory)theEObject;
				T result = caseEFactory(eFactory);
				if (result == null) result = caseEModelElement(eFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EMODEL_ELEMENT: {
				EModelElement eModelElement = (EModelElement)theEObject;
				T result = caseEModelElement(eModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ENAMED_ELEMENT: {
				ENamedElement eNamedElement = (ENamedElement)theEObject;
				T result = caseENamedElement(eNamedElement);
				if (result == null) result = caseEModelElement(eNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EOBJECT: {
				ecoreDiffMM.EObject eObject = (ecoreDiffMM.EObject)theEObject;
				T result = caseEObject(eObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EOPERATION: {
				EOperation eOperation = (EOperation)theEObject;
				T result = caseEOperation(eOperation);
				if (result == null) result = caseETypedElement(eOperation);
				if (result == null) result = caseENamedElement(eOperation);
				if (result == null) result = caseEModelElement(eOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EPACKAGE: {
				ecoreDiffMM.EPackage ePackage = (ecoreDiffMM.EPackage)theEObject;
				T result = caseEPackage(ePackage);
				if (result == null) result = caseENamedElement(ePackage);
				if (result == null) result = caseEModelElement(ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EPARAMETER: {
				EParameter eParameter = (EParameter)theEObject;
				T result = caseEParameter(eParameter);
				if (result == null) result = caseETypedElement(eParameter);
				if (result == null) result = caseENamedElement(eParameter);
				if (result == null) result = caseEModelElement(eParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EREFERENCE: {
				EReference eReference = (EReference)theEObject;
				T result = caseEReference(eReference);
				if (result == null) result = caseEStructuralFeature(eReference);
				if (result == null) result = caseETypedElement(eReference);
				if (result == null) result = caseENamedElement(eReference);
				if (result == null) result = caseEModelElement(eReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE: {
				EStructuralFeature eStructuralFeature = (EStructuralFeature)theEObject;
				T result = caseEStructuralFeature(eStructuralFeature);
				if (result == null) result = caseETypedElement(eStructuralFeature);
				if (result == null) result = caseENamedElement(eStructuralFeature);
				if (result == null) result = caseEModelElement(eStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ETYPED_ELEMENT: {
				ETypedElement eTypedElement = (ETypedElement)theEObject;
				T result = caseETypedElement(eTypedElement);
				if (result == null) result = caseENamedElement(eTypedElement);
				if (result == null) result = caseEModelElement(eTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> eStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseEStringToStringMapEntry(eStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.EGENERIC_TYPE: {
				EGenericType eGenericType = (EGenericType)theEObject;
				T result = caseEGenericType(eGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.ETYPE_PARAMETER: {
				ETypeParameter eTypeParameter = (ETypeParameter)theEObject;
				T result = caseETypeParameter(eTypeParameter);
				if (result == null) result = caseENamedElement(eTypeParameter);
				if (result == null) result = caseEModelElement(eTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF: {
				DomainSpecificDiff domainSpecificDiff = (DomainSpecificDiff)theEObject;
				T result = caseDomainSpecificDiff(domainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE: {
				DiffEAttribute diffEAttribute = (DiffEAttribute)theEObject;
				T result = caseDiffEAttribute(diffEAttribute);
				if (result == null) result = caseEAttribute(diffEAttribute);
				if (result == null) result = caseEStructuralFeature(diffEAttribute);
				if (result == null) result = caseETypedElement(diffEAttribute);
				if (result == null) result = caseENamedElement(diffEAttribute);
				if (result == null) result = caseEModelElement(diffEAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE: {
				DiffEAttribute_eAttributeType diffEAttribute_eAttributeType = (DiffEAttribute_eAttributeType)theEObject;
				T result = caseDiffEAttribute_eAttributeType(diffEAttribute_eAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EANNOTATION: {
				DiffEAnnotation diffEAnnotation = (DiffEAnnotation)theEObject;
				T result = caseDiffEAnnotation(diffEAnnotation);
				if (result == null) result = caseEAnnotation(diffEAnnotation);
				if (result == null) result = caseEModelElement(diffEAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS: {
				DiffEAnnotation_details diffEAnnotation_details = (DiffEAnnotation_details)theEObject;
				T result = caseDiffEAnnotation_details(diffEAnnotation_details);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT: {
				DiffEAnnotation_eModelElement diffEAnnotation_eModelElement = (DiffEAnnotation_eModelElement)theEObject;
				T result = caseDiffEAnnotation_eModelElement(diffEAnnotation_eModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS: {
				DiffEAnnotation_contents diffEAnnotation_contents = (DiffEAnnotation_contents)theEObject;
				T result = caseDiffEAnnotation_contents(diffEAnnotation_contents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES: {
				DiffEAnnotation_references diffEAnnotation_references = (DiffEAnnotation_references)theEObject;
				T result = caseDiffEAnnotation_references(diffEAnnotation_references);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS: {
				DiffEClass diffEClass = (DiffEClass)theEObject;
				T result = caseDiffEClass(diffEClass);
				if (result == null) result = caseEClass(diffEClass);
				if (result == null) result = caseEClassifier(diffEClass);
				if (result == null) result = caseENamedElement(diffEClass);
				if (result == null) result = caseEModelElement(diffEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES: {
				DiffEClass_eSuperTypes diffEClass_eSuperTypes = (DiffEClass_eSuperTypes)theEObject;
				T result = caseDiffEClass_eSuperTypes(diffEClass_eSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS: {
				DiffEClass_eOperations diffEClass_eOperations = (DiffEClass_eOperations)theEObject;
				T result = caseDiffEClass_eOperations(diffEClass_eOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES: {
				DiffEClass_eAllAttributes diffEClass_eAllAttributes = (DiffEClass_eAllAttributes)theEObject;
				T result = caseDiffEClass_eAllAttributes(diffEClass_eAllAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES: {
				DiffEClass_eAllReferences diffEClass_eAllReferences = (DiffEClass_eAllReferences)theEObject;
				T result = caseDiffEClass_eAllReferences(diffEClass_eAllReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES: {
				DiffEClass_eReferences diffEClass_eReferences = (DiffEClass_eReferences)theEObject;
				T result = caseDiffEClass_eReferences(diffEClass_eReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: {
				DiffEClass_eAttributes diffEClass_eAttributes = (DiffEClass_eAttributes)theEObject;
				T result = caseDiffEClass_eAttributes(diffEClass_eAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS: {
				DiffEClass_eAllContainments diffEClass_eAllContainments = (DiffEClass_eAllContainments)theEObject;
				T result = caseDiffEClass_eAllContainments(diffEClass_eAllContainments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS: {
				DiffEClass_eAllOperations diffEClass_eAllOperations = (DiffEClass_eAllOperations)theEObject;
				T result = caseDiffEClass_eAllOperations(diffEClass_eAllOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES: {
				DiffEClass_eAllStructuralFeatures diffEClass_eAllStructuralFeatures = (DiffEClass_eAllStructuralFeatures)theEObject;
				T result = caseDiffEClass_eAllStructuralFeatures(diffEClass_eAllStructuralFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES: {
				DiffEClass_eAllSuperTypes diffEClass_eAllSuperTypes = (DiffEClass_eAllSuperTypes)theEObject;
				T result = caseDiffEClass_eAllSuperTypes(diffEClass_eAllSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE: {
				DiffEClass_eIDAttribute diffEClass_eIDAttribute = (DiffEClass_eIDAttribute)theEObject;
				T result = caseDiffEClass_eIDAttribute(diffEClass_eIDAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES: {
				DiffEClass_eStructuralFeatures diffEClass_eStructuralFeatures = (DiffEClass_eStructuralFeatures)theEObject;
				T result = caseDiffEClass_eStructuralFeatures(diffEClass_eStructuralFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES: {
				DiffEClass_eGenericSuperTypes diffEClass_eGenericSuperTypes = (DiffEClass_eGenericSuperTypes)theEObject;
				T result = caseDiffEClass_eGenericSuperTypes(diffEClass_eGenericSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES: {
				DiffEClass_eAllGenericSuperTypes diffEClass_eAllGenericSuperTypes = (DiffEClass_eAllGenericSuperTypes)theEObject;
				T result = caseDiffEClass_eAllGenericSuperTypes(diffEClass_eAllGenericSuperTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE: {
				DiffEClassifier_ePackage diffEClassifier_ePackage = (DiffEClassifier_ePackage)theEObject;
				T result = caseDiffEClassifier_ePackage(diffEClassifier_ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS: {
				DiffEClassifier_eTypeParameters diffEClassifier_eTypeParameters = (DiffEClassifier_eTypeParameters)theEObject;
				T result = caseDiffEClassifier_eTypeParameters(diffEClassifier_eTypeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EDATA_TYPE: {
				DiffEDataType diffEDataType = (DiffEDataType)theEObject;
				T result = caseDiffEDataType(diffEDataType);
				if (result == null) result = caseEDataType(diffEDataType);
				if (result == null) result = caseEClassifier(diffEDataType);
				if (result == null) result = caseENamedElement(diffEDataType);
				if (result == null) result = caseEModelElement(diffEDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EENUM: {
				DiffEEnum diffEEnum = (DiffEEnum)theEObject;
				T result = caseDiffEEnum(diffEEnum);
				if (result == null) result = caseEEnum(diffEEnum);
				if (result == null) result = caseEDataType(diffEEnum);
				if (result == null) result = caseEClassifier(diffEEnum);
				if (result == null) result = caseENamedElement(diffEEnum);
				if (result == null) result = caseEModelElement(diffEEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EENUM_ELITERALS: {
				DiffEEnum_eLiterals diffEEnum_eLiterals = (DiffEEnum_eLiterals)theEObject;
				T result = caseDiffEEnum_eLiterals(diffEEnum_eLiterals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL: {
				DiffEEnumLiteral diffEEnumLiteral = (DiffEEnumLiteral)theEObject;
				T result = caseDiffEEnumLiteral(diffEEnumLiteral);
				if (result == null) result = caseEEnumLiteral(diffEEnumLiteral);
				if (result == null) result = caseENamedElement(diffEEnumLiteral);
				if (result == null) result = caseEModelElement(diffEEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM: {
				DiffEEnumLiteral_eEnum diffEEnumLiteral_eEnum = (DiffEEnumLiteral_eEnum)theEObject;
				T result = caseDiffEEnumLiteral_eEnum(diffEEnumLiteral_eEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EFACTORY: {
				DiffEFactory diffEFactory = (DiffEFactory)theEObject;
				T result = caseDiffEFactory(diffEFactory);
				if (result == null) result = caseEFactory(diffEFactory);
				if (result == null) result = caseEModelElement(diffEFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE: {
				DiffEFactory_ePackage diffEFactory_ePackage = (DiffEFactory_ePackage)theEObject;
				T result = caseDiffEFactory_ePackage(diffEFactory_ePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS: {
				DiffEModelElement_eAnnotations diffEModelElement_eAnnotations = (DiffEModelElement_eAnnotations)theEObject;
				T result = caseDiffEModelElement_eAnnotations(diffEModelElement_eAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOBJECT: {
				DiffEObject diffEObject = (DiffEObject)theEObject;
				T result = caseDiffEObject(diffEObject);
				if (result == null) result = caseEObject(diffEObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION: {
				DiffEOperation diffEOperation = (DiffEOperation)theEObject;
				T result = caseDiffEOperation(diffEOperation);
				if (result == null) result = caseEOperation(diffEOperation);
				if (result == null) result = caseETypedElement(diffEOperation);
				if (result == null) result = caseENamedElement(diffEOperation);
				if (result == null) result = caseEModelElement(diffEOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS: {
				DiffEOperation_eContainingClass diffEOperation_eContainingClass = (DiffEOperation_eContainingClass)theEObject;
				T result = caseDiffEOperation_eContainingClass(diffEOperation_eContainingClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS: {
				DiffEOperation_eTypeParameters diffEOperation_eTypeParameters = (DiffEOperation_eTypeParameters)theEObject;
				T result = caseDiffEOperation_eTypeParameters(diffEOperation_eTypeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS: {
				DiffEOperation_eParameters diffEOperation_eParameters = (DiffEOperation_eParameters)theEObject;
				T result = caseDiffEOperation_eParameters(diffEOperation_eParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS: {
				DiffEOperation_eExceptions diffEOperation_eExceptions = (DiffEOperation_eExceptions)theEObject;
				T result = caseDiffEOperation_eExceptions(diffEOperation_eExceptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS: {
				DiffEOperation_eGenericExceptions diffEOperation_eGenericExceptions = (DiffEOperation_eGenericExceptions)theEObject;
				T result = caseDiffEOperation_eGenericExceptions(diffEOperation_eGenericExceptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE: {
				DiffEPackage diffEPackage = (DiffEPackage)theEObject;
				T result = caseDiffEPackage(diffEPackage);
				if (result == null) result = caseEPackage(diffEPackage);
				if (result == null) result = caseENamedElement(diffEPackage);
				if (result == null) result = caseEModelElement(diffEPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE: {
				DiffEPackage_eFactoryInstance diffEPackage_eFactoryInstance = (DiffEPackage_eFactoryInstance)theEObject;
				T result = caseDiffEPackage_eFactoryInstance(diffEPackage_eFactoryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: {
				DiffEPackage_eClassifiers diffEPackage_eClassifiers = (DiffEPackage_eClassifiers)theEObject;
				T result = caseDiffEPackage_eClassifiers(diffEPackage_eClassifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES: {
				DiffEPackage_eSubpackages diffEPackage_eSubpackages = (DiffEPackage_eSubpackages)theEObject;
				T result = caseDiffEPackage_eSubpackages(diffEPackage_eSubpackages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE: {
				DiffEPackage_eSuperPackage diffEPackage_eSuperPackage = (DiffEPackage_eSuperPackage)theEObject;
				T result = caseDiffEPackage_eSuperPackage(diffEPackage_eSuperPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: {
				DiffEPackage_domainspecificdiffs diffEPackage_domainspecificdiffs = (DiffEPackage_domainspecificdiffs)theEObject;
				T result = caseDiffEPackage_domainspecificdiffs(diffEPackage_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPARAMETER: {
				DiffEParameter diffEParameter = (DiffEParameter)theEObject;
				T result = caseDiffEParameter(diffEParameter);
				if (result == null) result = caseEParameter(diffEParameter);
				if (result == null) result = caseETypedElement(diffEParameter);
				if (result == null) result = caseENamedElement(diffEParameter);
				if (result == null) result = caseEModelElement(diffEParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION: {
				DiffEParameter_eOperation diffEParameter_eOperation = (DiffEParameter_eOperation)theEObject;
				T result = caseDiffEParameter_eOperation(diffEParameter_eOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EREFERENCE: {
				DiffEReference diffEReference = (DiffEReference)theEObject;
				T result = caseDiffEReference(diffEReference);
				if (result == null) result = caseEReference(diffEReference);
				if (result == null) result = caseEStructuralFeature(diffEReference);
				if (result == null) result = caseETypedElement(diffEReference);
				if (result == null) result = caseENamedElement(diffEReference);
				if (result == null) result = caseEModelElement(diffEReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE: {
				DiffEReference_eOpposite diffEReference_eOpposite = (DiffEReference_eOpposite)theEObject;
				T result = caseDiffEReference_eOpposite(diffEReference_eOpposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE: {
				DiffEReference_eReferenceType diffEReference_eReferenceType = (DiffEReference_eReferenceType)theEObject;
				T result = caseDiffEReference_eReferenceType(diffEReference_eReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS: {
				DiffEReference_eKeys diffEReference_eKeys = (DiffEReference_eKeys)theEObject;
				T result = caseDiffEReference_eKeys(diffEReference_eKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS: {
				DiffEStructuralFeature_eContainingClass diffEStructuralFeature_eContainingClass = (DiffEStructuralFeature_eContainingClass)theEObject;
				T result = caseDiffEStructuralFeature_eContainingClass(diffEStructuralFeature_eContainingClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE: {
				DiffETypedElement_eType diffETypedElement_eType = (DiffETypedElement_eType)theEObject;
				T result = caseDiffETypedElement_eType(diffETypedElement_eType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE: {
				DiffETypedElement_eGenericType diffETypedElement_eGenericType = (DiffETypedElement_eGenericType)theEObject;
				T result = caseDiffETypedElement_eGenericType(diffETypedElement_eGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> diffEStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseDiffEStringToStringMapEntry(diffEStringToStringMapEntry);
				if (result == null) result = caseEStringToStringMapEntry((Map.Entry<String, String>)diffEStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE: {
				DiffEGenericType diffEGenericType = (DiffEGenericType)theEObject;
				T result = caseDiffEGenericType(diffEGenericType);
				if (result == null) result = caseEGenericType(diffEGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND: {
				DiffEGenericType_eUpperBound diffEGenericType_eUpperBound = (DiffEGenericType_eUpperBound)theEObject;
				T result = caseDiffEGenericType_eUpperBound(diffEGenericType_eUpperBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS: {
				DiffEGenericType_eTypeArguments diffEGenericType_eTypeArguments = (DiffEGenericType_eTypeArguments)theEObject;
				T result = caseDiffEGenericType_eTypeArguments(diffEGenericType_eTypeArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE: {
				DiffEGenericType_eRawType diffEGenericType_eRawType = (DiffEGenericType_eRawType)theEObject;
				T result = caseDiffEGenericType_eRawType(diffEGenericType_eRawType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND: {
				DiffEGenericType_eLowerBound diffEGenericType_eLowerBound = (DiffEGenericType_eLowerBound)theEObject;
				T result = caseDiffEGenericType_eLowerBound(diffEGenericType_eLowerBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER: {
				DiffEGenericType_eTypeParameter diffEGenericType_eTypeParameter = (DiffEGenericType_eTypeParameter)theEObject;
				T result = caseDiffEGenericType_eTypeParameter(diffEGenericType_eTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER: {
				DiffEGenericType_eClassifier diffEGenericType_eClassifier = (DiffEGenericType_eClassifier)theEObject;
				T result = caseDiffEGenericType_eClassifier(diffEGenericType_eClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER: {
				DiffETypeParameter diffETypeParameter = (DiffETypeParameter)theEObject;
				T result = caseDiffETypeParameter(diffETypeParameter);
				if (result == null) result = caseETypeParameter(diffETypeParameter);
				if (result == null) result = caseENamedElement(diffETypeParameter);
				if (result == null) result = caseEModelElement(diffETypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS: {
				DiffETypeParameter_eBounds diffETypeParameter_eBounds = (DiffETypeParameter_eBounds)theEObject;
				T result = caseDiffETypeParameter_eBounds(diffETypeParameter_eBounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //EcoreDiffMMSwitch
