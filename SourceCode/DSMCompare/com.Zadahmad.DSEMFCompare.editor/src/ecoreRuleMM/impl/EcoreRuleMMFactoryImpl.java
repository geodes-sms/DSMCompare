/**
 */
package ecoreRuleMM.impl;

import ecoreRuleMM.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreRuleMMFactoryImpl extends EFactoryImpl implements EcoreRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreRuleMMFactory init() {
		try {
			EcoreRuleMMFactory theEcoreRuleMMFactory = (EcoreRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(EcoreRuleMMPackage.eNS_URI);
			if (theEcoreRuleMMFactory != null) {
				return theEcoreRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreRuleMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcoreRuleMMPackage.PATTERN_EATTRIBUTE: return createPattern_EAttribute();
			case EcoreRuleMMPackage.PATTERN_EANNOTATION: return createPattern_EAnnotation();
			case EcoreRuleMMPackage.PATTERN_ECLASS: return createPattern_EClass();
			case EcoreRuleMMPackage.PATTERN_EDATA_TYPE: return createPattern_EDataType();
			case EcoreRuleMMPackage.PATTERN_EENUM: return createPattern_EEnum();
			case EcoreRuleMMPackage.PATTERN_EENUM_LITERAL: return createPattern_EEnumLiteral();
			case EcoreRuleMMPackage.PATTERN_EFACTORY: return createPattern_EFactory();
			case EcoreRuleMMPackage.PATTERN_EOBJECT: return createPattern_EObject();
			case EcoreRuleMMPackage.PATTERN_EOPERATION: return createPattern_EOperation();
			case EcoreRuleMMPackage.PATTERN_EPACKAGE: return createPattern_EPackage();
			case EcoreRuleMMPackage.PATTERN_EPARAMETER: return createPattern_EParameter();
			case EcoreRuleMMPackage.PATTERN_EREFERENCE: return createPattern_EReference();
			case EcoreRuleMMPackage.PATTERN_ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createPattern_EStringToStringMapEntry();
			case EcoreRuleMMPackage.PATTERN_EGENERIC_TYPE: return createPattern_EGenericType();
			case EcoreRuleMMPackage.PATTERN_ETYPE_PARAMETER: return createPattern_ETypeParameter();
			case EcoreRuleMMPackage.PATTERN_DOMAIN_SPECIFIC_DIFF: return createPattern_DomainSpecificDiff();
			case EcoreRuleMMPackage.PATTERN_DIFF_EATTRIBUTE: return createPattern_DiffEAttribute();
			case EcoreRuleMMPackage.PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE: return createPattern_DiffEAttribute_eAttributeType();
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION: return createPattern_DiffEAnnotation();
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_DETAILS: return createPattern_DiffEAnnotation_details();
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT: return createPattern_DiffEAnnotation_eModelElement();
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_CONTENTS: return createPattern_DiffEAnnotation_contents();
			case EcoreRuleMMPackage.PATTERN_DIFF_EANNOTATION_REFERENCES: return createPattern_DiffEAnnotation_references();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS: return createPattern_DiffEClass();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_ESUPER_TYPES: return createPattern_DiffEClass_eSuperTypes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EOPERATIONS: return createPattern_DiffEClass_eOperations();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES: return createPattern_DiffEClass_eAllAttributes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_REFERENCES: return createPattern_DiffEClass_eAllReferences();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES: return createPattern_DiffEClass_eReferences();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EATTRIBUTES: return createPattern_DiffEClass_eAttributes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS: return createPattern_DiffEClass_eAllContainments();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_OPERATIONS: return createPattern_DiffEClass_eAllOperations();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES: return createPattern_DiffEClass_eAllStructuralFeatures();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES: return createPattern_DiffEClass_eAllSuperTypes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EID_ATTRIBUTE: return createPattern_DiffEClass_eIDAttribute();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES: return createPattern_DiffEClass_eStructuralFeatures();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES: return createPattern_DiffEClass_eGenericSuperTypes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES: return createPattern_DiffEClass_eAllGenericSuperTypes();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASSIFIER_EPACKAGE: return createPattern_DiffEClassifier_ePackage();
			case EcoreRuleMMPackage.PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS: return createPattern_DiffEClassifier_eTypeParameters();
			case EcoreRuleMMPackage.PATTERN_DIFF_EDATA_TYPE: return createPattern_DiffEDataType();
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM: return createPattern_DiffEEnum();
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_ELITERALS: return createPattern_DiffEEnum_eLiterals();
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_LITERAL: return createPattern_DiffEEnumLiteral();
			case EcoreRuleMMPackage.PATTERN_DIFF_EENUM_LITERAL_EENUM: return createPattern_DiffEEnumLiteral_eEnum();
			case EcoreRuleMMPackage.PATTERN_DIFF_EFACTORY: return createPattern_DiffEFactory();
			case EcoreRuleMMPackage.PATTERN_DIFF_EFACTORY_EPACKAGE: return createPattern_DiffEFactory_ePackage();
			case EcoreRuleMMPackage.PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS: return createPattern_DiffEModelElement_eAnnotations();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT: return createPattern_DiffEObject();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION: return createPattern_DiffEOperation();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS: return createPattern_DiffEOperation_eContainingClass();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS: return createPattern_DiffEOperation_eTypeParameters();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EPARAMETERS: return createPattern_DiffEOperation_eParameters();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EEXCEPTIONS: return createPattern_DiffEOperation_eExceptions();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS: return createPattern_DiffEOperation_eGenericExceptions();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE: return createPattern_DiffEPackage();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE: return createPattern_DiffEPackage_eFactoryInstance();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ECLASSIFIERS: return createPattern_DiffEPackage_eClassifiers();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ESUBPACKAGES: return createPattern_DiffEPackage_eSubpackages();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE: return createPattern_DiffEPackage_eSuperPackage();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: return createPattern_DiffEPackage_domainspecificdiffs();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPARAMETER: return createPattern_DiffEParameter();
			case EcoreRuleMMPackage.PATTERN_DIFF_EPARAMETER_EOPERATION: return createPattern_DiffEParameter_eOperation();
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE: return createPattern_DiffEReference();
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EOPPOSITE: return createPattern_DiffEReference_eOpposite();
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE: return createPattern_DiffEReference_eReferenceType();
			case EcoreRuleMMPackage.PATTERN_DIFF_EREFERENCE_EKEYS: return createPattern_DiffEReference_eKeys();
			case EcoreRuleMMPackage.PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS: return createPattern_DiffEStructuralFeature_eContainingClass();
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPED_ELEMENT_ETYPE: return createPattern_DiffETypedElement_eType();
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE: return createPattern_DiffETypedElement_eGenericType();
			case EcoreRuleMMPackage.PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createPattern_DiffEStringToStringMapEntry();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE: return createPattern_DiffEGenericType();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND: return createPattern_DiffEGenericType_eUpperBound();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS: return createPattern_DiffEGenericType_eTypeArguments();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE: return createPattern_DiffEGenericType_eRawType();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND: return createPattern_DiffEGenericType_eLowerBound();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER: return createPattern_DiffEGenericType_eTypeParameter();
			case EcoreRuleMMPackage.PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER: return createPattern_DiffEGenericType_eClassifier();
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPE_PARAMETER: return createPattern_DiffETypeParameter();
			case EcoreRuleMMPackage.PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS: return createPattern_DiffETypeParameter_eBounds();
			case EcoreRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EAttribute createPattern_EAttribute() {
		Pattern_EAttributeImpl pattern_EAttribute = new Pattern_EAttributeImpl();
		return pattern_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EAnnotation createPattern_EAnnotation() {
		Pattern_EAnnotationImpl pattern_EAnnotation = new Pattern_EAnnotationImpl();
		return pattern_EAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EClass createPattern_EClass() {
		Pattern_EClassImpl pattern_EClass = new Pattern_EClassImpl();
		return pattern_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EDataType createPattern_EDataType() {
		Pattern_EDataTypeImpl pattern_EDataType = new Pattern_EDataTypeImpl();
		return pattern_EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EEnum createPattern_EEnum() {
		Pattern_EEnumImpl pattern_EEnum = new Pattern_EEnumImpl();
		return pattern_EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EEnumLiteral createPattern_EEnumLiteral() {
		Pattern_EEnumLiteralImpl pattern_EEnumLiteral = new Pattern_EEnumLiteralImpl();
		return pattern_EEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EFactory createPattern_EFactory() {
		Pattern_EFactoryImpl pattern_EFactory = new Pattern_EFactoryImpl();
		return pattern_EFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EObject createPattern_EObject() {
		Pattern_EObjectImpl pattern_EObject = new Pattern_EObjectImpl();
		return pattern_EObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EOperation createPattern_EOperation() {
		Pattern_EOperationImpl pattern_EOperation = new Pattern_EOperationImpl();
		return pattern_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EPackage createPattern_EPackage() {
		Pattern_EPackageImpl pattern_EPackage = new Pattern_EPackageImpl();
		return pattern_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EParameter createPattern_EParameter() {
		Pattern_EParameterImpl pattern_EParameter = new Pattern_EParameterImpl();
		return pattern_EParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EReference createPattern_EReference() {
		Pattern_EReferenceImpl pattern_EReference = new Pattern_EReferenceImpl();
		return pattern_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createPattern_EStringToStringMapEntry() {
		Pattern_EStringToStringMapEntryImpl pattern_EStringToStringMapEntry = new Pattern_EStringToStringMapEntryImpl();
		return pattern_EStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_EGenericType createPattern_EGenericType() {
		Pattern_EGenericTypeImpl pattern_EGenericType = new Pattern_EGenericTypeImpl();
		return pattern_EGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_ETypeParameter createPattern_ETypeParameter() {
		Pattern_ETypeParameterImpl pattern_ETypeParameter = new Pattern_ETypeParameterImpl();
		return pattern_ETypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff() {
		Pattern_DomainSpecificDiffImpl pattern_DomainSpecificDiff = new Pattern_DomainSpecificDiffImpl();
		return pattern_DomainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAttribute createPattern_DiffEAttribute() {
		Pattern_DiffEAttributeImpl pattern_DiffEAttribute = new Pattern_DiffEAttributeImpl();
		return pattern_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAttribute_eAttributeType createPattern_DiffEAttribute_eAttributeType() {
		Pattern_DiffEAttribute_eAttributeTypeImpl pattern_DiffEAttribute_eAttributeType = new Pattern_DiffEAttribute_eAttributeTypeImpl();
		return pattern_DiffEAttribute_eAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAnnotation createPattern_DiffEAnnotation() {
		Pattern_DiffEAnnotationImpl pattern_DiffEAnnotation = new Pattern_DiffEAnnotationImpl();
		return pattern_DiffEAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAnnotation_details createPattern_DiffEAnnotation_details() {
		Pattern_DiffEAnnotation_detailsImpl pattern_DiffEAnnotation_details = new Pattern_DiffEAnnotation_detailsImpl();
		return pattern_DiffEAnnotation_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAnnotation_eModelElement createPattern_DiffEAnnotation_eModelElement() {
		Pattern_DiffEAnnotation_eModelElementImpl pattern_DiffEAnnotation_eModelElement = new Pattern_DiffEAnnotation_eModelElementImpl();
		return pattern_DiffEAnnotation_eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAnnotation_contents createPattern_DiffEAnnotation_contents() {
		Pattern_DiffEAnnotation_contentsImpl pattern_DiffEAnnotation_contents = new Pattern_DiffEAnnotation_contentsImpl();
		return pattern_DiffEAnnotation_contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEAnnotation_references createPattern_DiffEAnnotation_references() {
		Pattern_DiffEAnnotation_referencesImpl pattern_DiffEAnnotation_references = new Pattern_DiffEAnnotation_referencesImpl();
		return pattern_DiffEAnnotation_references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass createPattern_DiffEClass() {
		Pattern_DiffEClassImpl pattern_DiffEClass = new Pattern_DiffEClassImpl();
		return pattern_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eSuperTypes createPattern_DiffEClass_eSuperTypes() {
		Pattern_DiffEClass_eSuperTypesImpl pattern_DiffEClass_eSuperTypes = new Pattern_DiffEClass_eSuperTypesImpl();
		return pattern_DiffEClass_eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eOperations createPattern_DiffEClass_eOperations() {
		Pattern_DiffEClass_eOperationsImpl pattern_DiffEClass_eOperations = new Pattern_DiffEClass_eOperationsImpl();
		return pattern_DiffEClass_eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllAttributes createPattern_DiffEClass_eAllAttributes() {
		Pattern_DiffEClass_eAllAttributesImpl pattern_DiffEClass_eAllAttributes = new Pattern_DiffEClass_eAllAttributesImpl();
		return pattern_DiffEClass_eAllAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllReferences createPattern_DiffEClass_eAllReferences() {
		Pattern_DiffEClass_eAllReferencesImpl pattern_DiffEClass_eAllReferences = new Pattern_DiffEClass_eAllReferencesImpl();
		return pattern_DiffEClass_eAllReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eReferences createPattern_DiffEClass_eReferences() {
		Pattern_DiffEClass_eReferencesImpl pattern_DiffEClass_eReferences = new Pattern_DiffEClass_eReferencesImpl();
		return pattern_DiffEClass_eReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAttributes createPattern_DiffEClass_eAttributes() {
		Pattern_DiffEClass_eAttributesImpl pattern_DiffEClass_eAttributes = new Pattern_DiffEClass_eAttributesImpl();
		return pattern_DiffEClass_eAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllContainments createPattern_DiffEClass_eAllContainments() {
		Pattern_DiffEClass_eAllContainmentsImpl pattern_DiffEClass_eAllContainments = new Pattern_DiffEClass_eAllContainmentsImpl();
		return pattern_DiffEClass_eAllContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllOperations createPattern_DiffEClass_eAllOperations() {
		Pattern_DiffEClass_eAllOperationsImpl pattern_DiffEClass_eAllOperations = new Pattern_DiffEClass_eAllOperationsImpl();
		return pattern_DiffEClass_eAllOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllStructuralFeatures createPattern_DiffEClass_eAllStructuralFeatures() {
		Pattern_DiffEClass_eAllStructuralFeaturesImpl pattern_DiffEClass_eAllStructuralFeatures = new Pattern_DiffEClass_eAllStructuralFeaturesImpl();
		return pattern_DiffEClass_eAllStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllSuperTypes createPattern_DiffEClass_eAllSuperTypes() {
		Pattern_DiffEClass_eAllSuperTypesImpl pattern_DiffEClass_eAllSuperTypes = new Pattern_DiffEClass_eAllSuperTypesImpl();
		return pattern_DiffEClass_eAllSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eIDAttribute createPattern_DiffEClass_eIDAttribute() {
		Pattern_DiffEClass_eIDAttributeImpl pattern_DiffEClass_eIDAttribute = new Pattern_DiffEClass_eIDAttributeImpl();
		return pattern_DiffEClass_eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eStructuralFeatures createPattern_DiffEClass_eStructuralFeatures() {
		Pattern_DiffEClass_eStructuralFeaturesImpl pattern_DiffEClass_eStructuralFeatures = new Pattern_DiffEClass_eStructuralFeaturesImpl();
		return pattern_DiffEClass_eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eGenericSuperTypes createPattern_DiffEClass_eGenericSuperTypes() {
		Pattern_DiffEClass_eGenericSuperTypesImpl pattern_DiffEClass_eGenericSuperTypes = new Pattern_DiffEClass_eGenericSuperTypesImpl();
		return pattern_DiffEClass_eGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClass_eAllGenericSuperTypes createPattern_DiffEClass_eAllGenericSuperTypes() {
		Pattern_DiffEClass_eAllGenericSuperTypesImpl pattern_DiffEClass_eAllGenericSuperTypes = new Pattern_DiffEClass_eAllGenericSuperTypesImpl();
		return pattern_DiffEClass_eAllGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClassifier_ePackage createPattern_DiffEClassifier_ePackage() {
		Pattern_DiffEClassifier_ePackageImpl pattern_DiffEClassifier_ePackage = new Pattern_DiffEClassifier_ePackageImpl();
		return pattern_DiffEClassifier_ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEClassifier_eTypeParameters createPattern_DiffEClassifier_eTypeParameters() {
		Pattern_DiffEClassifier_eTypeParametersImpl pattern_DiffEClassifier_eTypeParameters = new Pattern_DiffEClassifier_eTypeParametersImpl();
		return pattern_DiffEClassifier_eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEDataType createPattern_DiffEDataType() {
		Pattern_DiffEDataTypeImpl pattern_DiffEDataType = new Pattern_DiffEDataTypeImpl();
		return pattern_DiffEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEEnum createPattern_DiffEEnum() {
		Pattern_DiffEEnumImpl pattern_DiffEEnum = new Pattern_DiffEEnumImpl();
		return pattern_DiffEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEEnum_eLiterals createPattern_DiffEEnum_eLiterals() {
		Pattern_DiffEEnum_eLiteralsImpl pattern_DiffEEnum_eLiterals = new Pattern_DiffEEnum_eLiteralsImpl();
		return pattern_DiffEEnum_eLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEEnumLiteral createPattern_DiffEEnumLiteral() {
		Pattern_DiffEEnumLiteralImpl pattern_DiffEEnumLiteral = new Pattern_DiffEEnumLiteralImpl();
		return pattern_DiffEEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEEnumLiteral_eEnum createPattern_DiffEEnumLiteral_eEnum() {
		Pattern_DiffEEnumLiteral_eEnumImpl pattern_DiffEEnumLiteral_eEnum = new Pattern_DiffEEnumLiteral_eEnumImpl();
		return pattern_DiffEEnumLiteral_eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEFactory createPattern_DiffEFactory() {
		Pattern_DiffEFactoryImpl pattern_DiffEFactory = new Pattern_DiffEFactoryImpl();
		return pattern_DiffEFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEFactory_ePackage createPattern_DiffEFactory_ePackage() {
		Pattern_DiffEFactory_ePackageImpl pattern_DiffEFactory_ePackage = new Pattern_DiffEFactory_ePackageImpl();
		return pattern_DiffEFactory_ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEModelElement_eAnnotations createPattern_DiffEModelElement_eAnnotations() {
		Pattern_DiffEModelElement_eAnnotationsImpl pattern_DiffEModelElement_eAnnotations = new Pattern_DiffEModelElement_eAnnotationsImpl();
		return pattern_DiffEModelElement_eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEObject createPattern_DiffEObject() {
		Pattern_DiffEObjectImpl pattern_DiffEObject = new Pattern_DiffEObjectImpl();
		return pattern_DiffEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation createPattern_DiffEOperation() {
		Pattern_DiffEOperationImpl pattern_DiffEOperation = new Pattern_DiffEOperationImpl();
		return pattern_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation_eContainingClass createPattern_DiffEOperation_eContainingClass() {
		Pattern_DiffEOperation_eContainingClassImpl pattern_DiffEOperation_eContainingClass = new Pattern_DiffEOperation_eContainingClassImpl();
		return pattern_DiffEOperation_eContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation_eTypeParameters createPattern_DiffEOperation_eTypeParameters() {
		Pattern_DiffEOperation_eTypeParametersImpl pattern_DiffEOperation_eTypeParameters = new Pattern_DiffEOperation_eTypeParametersImpl();
		return pattern_DiffEOperation_eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation_eParameters createPattern_DiffEOperation_eParameters() {
		Pattern_DiffEOperation_eParametersImpl pattern_DiffEOperation_eParameters = new Pattern_DiffEOperation_eParametersImpl();
		return pattern_DiffEOperation_eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation_eExceptions createPattern_DiffEOperation_eExceptions() {
		Pattern_DiffEOperation_eExceptionsImpl pattern_DiffEOperation_eExceptions = new Pattern_DiffEOperation_eExceptionsImpl();
		return pattern_DiffEOperation_eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEOperation_eGenericExceptions createPattern_DiffEOperation_eGenericExceptions() {
		Pattern_DiffEOperation_eGenericExceptionsImpl pattern_DiffEOperation_eGenericExceptions = new Pattern_DiffEOperation_eGenericExceptionsImpl();
		return pattern_DiffEOperation_eGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage createPattern_DiffEPackage() {
		Pattern_DiffEPackageImpl pattern_DiffEPackage = new Pattern_DiffEPackageImpl();
		return pattern_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_eFactoryInstance createPattern_DiffEPackage_eFactoryInstance() {
		Pattern_DiffEPackage_eFactoryInstanceImpl pattern_DiffEPackage_eFactoryInstance = new Pattern_DiffEPackage_eFactoryInstanceImpl();
		return pattern_DiffEPackage_eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_eClassifiers createPattern_DiffEPackage_eClassifiers() {
		Pattern_DiffEPackage_eClassifiersImpl pattern_DiffEPackage_eClassifiers = new Pattern_DiffEPackage_eClassifiersImpl();
		return pattern_DiffEPackage_eClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_eSubpackages createPattern_DiffEPackage_eSubpackages() {
		Pattern_DiffEPackage_eSubpackagesImpl pattern_DiffEPackage_eSubpackages = new Pattern_DiffEPackage_eSubpackagesImpl();
		return pattern_DiffEPackage_eSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_eSuperPackage createPattern_DiffEPackage_eSuperPackage() {
		Pattern_DiffEPackage_eSuperPackageImpl pattern_DiffEPackage_eSuperPackage = new Pattern_DiffEPackage_eSuperPackageImpl();
		return pattern_DiffEPackage_eSuperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEPackage_domainspecificdiffs createPattern_DiffEPackage_domainspecificdiffs() {
		Pattern_DiffEPackage_domainspecificdiffsImpl pattern_DiffEPackage_domainspecificdiffs = new Pattern_DiffEPackage_domainspecificdiffsImpl();
		return pattern_DiffEPackage_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEParameter createPattern_DiffEParameter() {
		Pattern_DiffEParameterImpl pattern_DiffEParameter = new Pattern_DiffEParameterImpl();
		return pattern_DiffEParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEParameter_eOperation createPattern_DiffEParameter_eOperation() {
		Pattern_DiffEParameter_eOperationImpl pattern_DiffEParameter_eOperation = new Pattern_DiffEParameter_eOperationImpl();
		return pattern_DiffEParameter_eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEReference createPattern_DiffEReference() {
		Pattern_DiffEReferenceImpl pattern_DiffEReference = new Pattern_DiffEReferenceImpl();
		return pattern_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEReference_eOpposite createPattern_DiffEReference_eOpposite() {
		Pattern_DiffEReference_eOppositeImpl pattern_DiffEReference_eOpposite = new Pattern_DiffEReference_eOppositeImpl();
		return pattern_DiffEReference_eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEReference_eReferenceType createPattern_DiffEReference_eReferenceType() {
		Pattern_DiffEReference_eReferenceTypeImpl pattern_DiffEReference_eReferenceType = new Pattern_DiffEReference_eReferenceTypeImpl();
		return pattern_DiffEReference_eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEReference_eKeys createPattern_DiffEReference_eKeys() {
		Pattern_DiffEReference_eKeysImpl pattern_DiffEReference_eKeys = new Pattern_DiffEReference_eKeysImpl();
		return pattern_DiffEReference_eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEStructuralFeature_eContainingClass createPattern_DiffEStructuralFeature_eContainingClass() {
		Pattern_DiffEStructuralFeature_eContainingClassImpl pattern_DiffEStructuralFeature_eContainingClass = new Pattern_DiffEStructuralFeature_eContainingClassImpl();
		return pattern_DiffEStructuralFeature_eContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffETypedElement_eType createPattern_DiffETypedElement_eType() {
		Pattern_DiffETypedElement_eTypeImpl pattern_DiffETypedElement_eType = new Pattern_DiffETypedElement_eTypeImpl();
		return pattern_DiffETypedElement_eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffETypedElement_eGenericType createPattern_DiffETypedElement_eGenericType() {
		Pattern_DiffETypedElement_eGenericTypeImpl pattern_DiffETypedElement_eGenericType = new Pattern_DiffETypedElement_eGenericTypeImpl();
		return pattern_DiffETypedElement_eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createPattern_DiffEStringToStringMapEntry() {
		Pattern_DiffEStringToStringMapEntryImpl pattern_DiffEStringToStringMapEntry = new Pattern_DiffEStringToStringMapEntryImpl();
		return pattern_DiffEStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType createPattern_DiffEGenericType() {
		Pattern_DiffEGenericTypeImpl pattern_DiffEGenericType = new Pattern_DiffEGenericTypeImpl();
		return pattern_DiffEGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eUpperBound createPattern_DiffEGenericType_eUpperBound() {
		Pattern_DiffEGenericType_eUpperBoundImpl pattern_DiffEGenericType_eUpperBound = new Pattern_DiffEGenericType_eUpperBoundImpl();
		return pattern_DiffEGenericType_eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eTypeArguments createPattern_DiffEGenericType_eTypeArguments() {
		Pattern_DiffEGenericType_eTypeArgumentsImpl pattern_DiffEGenericType_eTypeArguments = new Pattern_DiffEGenericType_eTypeArgumentsImpl();
		return pattern_DiffEGenericType_eTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eRawType createPattern_DiffEGenericType_eRawType() {
		Pattern_DiffEGenericType_eRawTypeImpl pattern_DiffEGenericType_eRawType = new Pattern_DiffEGenericType_eRawTypeImpl();
		return pattern_DiffEGenericType_eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eLowerBound createPattern_DiffEGenericType_eLowerBound() {
		Pattern_DiffEGenericType_eLowerBoundImpl pattern_DiffEGenericType_eLowerBound = new Pattern_DiffEGenericType_eLowerBoundImpl();
		return pattern_DiffEGenericType_eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eTypeParameter createPattern_DiffEGenericType_eTypeParameter() {
		Pattern_DiffEGenericType_eTypeParameterImpl pattern_DiffEGenericType_eTypeParameter = new Pattern_DiffEGenericType_eTypeParameterImpl();
		return pattern_DiffEGenericType_eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffEGenericType_eClassifier createPattern_DiffEGenericType_eClassifier() {
		Pattern_DiffEGenericType_eClassifierImpl pattern_DiffEGenericType_eClassifier = new Pattern_DiffEGenericType_eClassifierImpl();
		return pattern_DiffEGenericType_eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffETypeParameter createPattern_DiffETypeParameter() {
		Pattern_DiffETypeParameterImpl pattern_DiffETypeParameter = new Pattern_DiffETypeParameterImpl();
		return pattern_DiffETypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern_DiffETypeParameter_eBounds createPattern_DiffETypeParameter_eBounds() {
		Pattern_DiffETypeParameter_eBoundsImpl pattern_DiffETypeParameter_eBounds = new Pattern_DiffETypeParameter_eBoundsImpl();
		return pattern_DiffETypeParameter_eBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreRuleMMPackage getEcoreRuleMMPackage() {
		return (EcoreRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreRuleMMPackage getPackage() {
		return EcoreRuleMMPackage.eINSTANCE;
	}

} //EcoreRuleMMFactoryImpl
