/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreDiffMMFactoryImpl extends EFactoryImpl implements EcoreDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreDiffMMFactory init() {
		try {
			EcoreDiffMMFactory theEcoreDiffMMFactory = (EcoreDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(EcoreDiffMMPackage.eNS_URI);
			if (theEcoreDiffMMFactory != null) {
				return theEcoreDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreDiffMMFactoryImpl() {
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
			case EcoreDiffMMPackage.EATTRIBUTE: return createEAttribute();
			case EcoreDiffMMPackage.EANNOTATION: return createEAnnotation();
			case EcoreDiffMMPackage.ECLASS: return createEClass();
			case EcoreDiffMMPackage.EDATA_TYPE: return createEDataType();
			case EcoreDiffMMPackage.EENUM: return createEEnum();
			case EcoreDiffMMPackage.EENUM_LITERAL: return createEEnumLiteral();
			case EcoreDiffMMPackage.EFACTORY: return createEFactory();
			case EcoreDiffMMPackage.EOBJECT: return createEObject();
			case EcoreDiffMMPackage.EOPERATION: return createEOperation();
			case EcoreDiffMMPackage.EPACKAGE: return createEPackage();
			case EcoreDiffMMPackage.EPARAMETER: return createEParameter();
			case EcoreDiffMMPackage.EREFERENCE: return createEReference();
			case EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			case EcoreDiffMMPackage.EGENERIC_TYPE: return createEGenericType();
			case EcoreDiffMMPackage.ETYPE_PARAMETER: return createETypeParameter();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE: return createDiffEAttribute();
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE: return createDiffEAttribute_eAttributeType();
			case EcoreDiffMMPackage.DIFF_EANNOTATION: return createDiffEAnnotation();
			case EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS: return createDiffEAnnotation_details();
			case EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT: return createDiffEAnnotation_eModelElement();
			case EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS: return createDiffEAnnotation_contents();
			case EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES: return createDiffEAnnotation_references();
			case EcoreDiffMMPackage.DIFF_ECLASS: return createDiffEClass();
			case EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES: return createDiffEClass_eSuperTypes();
			case EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS: return createDiffEClass_eOperations();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES: return createDiffEClass_eAllAttributes();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES: return createDiffEClass_eAllReferences();
			case EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES: return createDiffEClass_eReferences();
			case EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES: return createDiffEClass_eAttributes();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS: return createDiffEClass_eAllContainments();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS: return createDiffEClass_eAllOperations();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES: return createDiffEClass_eAllStructuralFeatures();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES: return createDiffEClass_eAllSuperTypes();
			case EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE: return createDiffEClass_eIDAttribute();
			case EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES: return createDiffEClass_eStructuralFeatures();
			case EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES: return createDiffEClass_eGenericSuperTypes();
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES: return createDiffEClass_eAllGenericSuperTypes();
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE: return createDiffEClassifier_ePackage();
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS: return createDiffEClassifier_eTypeParameters();
			case EcoreDiffMMPackage.DIFF_EDATA_TYPE: return createDiffEDataType();
			case EcoreDiffMMPackage.DIFF_EENUM: return createDiffEEnum();
			case EcoreDiffMMPackage.DIFF_EENUM_ELITERALS: return createDiffEEnum_eLiterals();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL: return createDiffEEnumLiteral();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM: return createDiffEEnumLiteral_eEnum();
			case EcoreDiffMMPackage.DIFF_EFACTORY: return createDiffEFactory();
			case EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE: return createDiffEFactory_ePackage();
			case EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS: return createDiffEModelElement_eAnnotations();
			case EcoreDiffMMPackage.DIFF_EOBJECT: return createDiffEObject();
			case EcoreDiffMMPackage.DIFF_EOPERATION: return createDiffEOperation();
			case EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS: return createDiffEOperation_eContainingClass();
			case EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS: return createDiffEOperation_eTypeParameters();
			case EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS: return createDiffEOperation_eParameters();
			case EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS: return createDiffEOperation_eExceptions();
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS: return createDiffEOperation_eGenericExceptions();
			case EcoreDiffMMPackage.DIFF_EPACKAGE: return createDiffEPackage();
			case EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE: return createDiffEPackage_eFactoryInstance();
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS: return createDiffEPackage_eClassifiers();
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES: return createDiffEPackage_eSubpackages();
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE: return createDiffEPackage_eSuperPackage();
			case EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS: return createDiffEPackage_domainspecificdiffs();
			case EcoreDiffMMPackage.DIFF_EPARAMETER: return createDiffEParameter();
			case EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION: return createDiffEParameter_eOperation();
			case EcoreDiffMMPackage.DIFF_EREFERENCE: return createDiffEReference();
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE: return createDiffEReference_eOpposite();
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE: return createDiffEReference_eReferenceType();
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS: return createDiffEReference_eKeys();
			case EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS: return createDiffEStructuralFeature_eContainingClass();
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE: return createDiffETypedElement_eType();
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE: return createDiffETypedElement_eGenericType();
			case EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createDiffEStringToStringMapEntry();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE: return createDiffEGenericType();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND: return createDiffEGenericType_eUpperBound();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS: return createDiffEGenericType_eTypeArguments();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE: return createDiffEGenericType_eRawType();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND: return createDiffEGenericType_eLowerBound();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER: return createDiffEGenericType_eTypeParameter();
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER: return createDiffEGenericType_eClassifier();
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER: return createDiffETypeParameter();
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS: return createDiffETypeParameter_eBounds();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcoreDiffMMPackage.CLASS_OP:
				return createClassOpFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ASC_OP:
				return createAscOpFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBIG_DECIMAL:
				return createEBigDecimalFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBIG_INTEGER:
				return createEBigIntegerFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBOOLEAN:
				return createEBooleanFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBYTE:
				return createEByteFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBYTE_ARRAY:
				return createEByteArrayFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EBYTE_OBJECT:
				return createEByteObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ECHAR:
				return createECharFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ECHARACTER_OBJECT:
				return createECharacterObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EDATE:
				return createEDateFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EDOUBLE:
				return createEDoubleFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EFLOAT:
				return createEFloatFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EFLOAT_OBJECT:
				return createEFloatObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EINT:
				return createEIntFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EJAVA_CLASS:
				return createEJavaClassFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.EJAVA_OBJECT:
				return createEJavaObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ELONG:
				return createELongFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ELONG_OBJECT:
				return createELongObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ESHORT:
				return createEShortFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ESHORT_OBJECT:
				return createEShortObjectFromString(eDataType, initialValue);
			case EcoreDiffMMPackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcoreDiffMMPackage.CLASS_OP:
				return convertClassOpToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ASC_OP:
				return convertAscOpToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBIG_DECIMAL:
				return convertEBigDecimalToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBIG_INTEGER:
				return convertEBigIntegerToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBOOLEAN:
				return convertEBooleanToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBYTE:
				return convertEByteToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBYTE_ARRAY:
				return convertEByteArrayToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EBYTE_OBJECT:
				return convertEByteObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ECHAR:
				return convertECharToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ECHARACTER_OBJECT:
				return convertECharacterObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EDATE:
				return convertEDateToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EDOUBLE:
				return convertEDoubleToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EFLOAT:
				return convertEFloatToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EFLOAT_OBJECT:
				return convertEFloatObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EINT:
				return convertEIntToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EJAVA_CLASS:
				return convertEJavaClassToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.EJAVA_OBJECT:
				return convertEJavaObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ELONG:
				return convertELongToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ELONG_OBJECT:
				return convertELongObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ESHORT:
				return convertEShortToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ESHORT_OBJECT:
				return convertEShortObjectToString(eDataType, instanceValue);
			case EcoreDiffMMPackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAnnotation createEAnnotation() {
		EAnnotationImpl eAnnotation = new EAnnotationImpl();
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EDataType createEDataType() {
		EDataTypeImpl eDataType = new EDataTypeImpl();
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum createEEnum() {
		EEnumImpl eEnum = new EEnumImpl();
		return eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnumLiteral createEEnumLiteral() {
		EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
		return eEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFactory createEFactory() {
		ecoreDiffMM.impl.EFactoryImpl eFactory = new ecoreDiffMM.impl.EFactoryImpl();
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EObject createEObject() {
		EObjectImpl eObject = new EObjectImpl();
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = new EGenericTypeImpl();
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETypeParameter createETypeParameter() {
		ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAttribute createDiffEAttribute() {
		DiffEAttributeImpl diffEAttribute = new DiffEAttributeImpl();
		return diffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAttribute_eAttributeType createDiffEAttribute_eAttributeType() {
		DiffEAttribute_eAttributeTypeImpl diffEAttribute_eAttributeType = new DiffEAttribute_eAttributeTypeImpl();
		return diffEAttribute_eAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAnnotation createDiffEAnnotation() {
		DiffEAnnotationImpl diffEAnnotation = new DiffEAnnotationImpl();
		return diffEAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAnnotation_details createDiffEAnnotation_details() {
		DiffEAnnotation_detailsImpl diffEAnnotation_details = new DiffEAnnotation_detailsImpl();
		return diffEAnnotation_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAnnotation_eModelElement createDiffEAnnotation_eModelElement() {
		DiffEAnnotation_eModelElementImpl diffEAnnotation_eModelElement = new DiffEAnnotation_eModelElementImpl();
		return diffEAnnotation_eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAnnotation_contents createDiffEAnnotation_contents() {
		DiffEAnnotation_contentsImpl diffEAnnotation_contents = new DiffEAnnotation_contentsImpl();
		return diffEAnnotation_contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEAnnotation_references createDiffEAnnotation_references() {
		DiffEAnnotation_referencesImpl diffEAnnotation_references = new DiffEAnnotation_referencesImpl();
		return diffEAnnotation_references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass createDiffEClass() {
		DiffEClassImpl diffEClass = new DiffEClassImpl();
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eSuperTypes createDiffEClass_eSuperTypes() {
		DiffEClass_eSuperTypesImpl diffEClass_eSuperTypes = new DiffEClass_eSuperTypesImpl();
		return diffEClass_eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eOperations createDiffEClass_eOperations() {
		DiffEClass_eOperationsImpl diffEClass_eOperations = new DiffEClass_eOperationsImpl();
		return diffEClass_eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllAttributes createDiffEClass_eAllAttributes() {
		DiffEClass_eAllAttributesImpl diffEClass_eAllAttributes = new DiffEClass_eAllAttributesImpl();
		return diffEClass_eAllAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllReferences createDiffEClass_eAllReferences() {
		DiffEClass_eAllReferencesImpl diffEClass_eAllReferences = new DiffEClass_eAllReferencesImpl();
		return diffEClass_eAllReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eReferences createDiffEClass_eReferences() {
		DiffEClass_eReferencesImpl diffEClass_eReferences = new DiffEClass_eReferencesImpl();
		return diffEClass_eReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAttributes createDiffEClass_eAttributes() {
		DiffEClass_eAttributesImpl diffEClass_eAttributes = new DiffEClass_eAttributesImpl();
		return diffEClass_eAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllContainments createDiffEClass_eAllContainments() {
		DiffEClass_eAllContainmentsImpl diffEClass_eAllContainments = new DiffEClass_eAllContainmentsImpl();
		return diffEClass_eAllContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllOperations createDiffEClass_eAllOperations() {
		DiffEClass_eAllOperationsImpl diffEClass_eAllOperations = new DiffEClass_eAllOperationsImpl();
		return diffEClass_eAllOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllStructuralFeatures createDiffEClass_eAllStructuralFeatures() {
		DiffEClass_eAllStructuralFeaturesImpl diffEClass_eAllStructuralFeatures = new DiffEClass_eAllStructuralFeaturesImpl();
		return diffEClass_eAllStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllSuperTypes createDiffEClass_eAllSuperTypes() {
		DiffEClass_eAllSuperTypesImpl diffEClass_eAllSuperTypes = new DiffEClass_eAllSuperTypesImpl();
		return diffEClass_eAllSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eIDAttribute createDiffEClass_eIDAttribute() {
		DiffEClass_eIDAttributeImpl diffEClass_eIDAttribute = new DiffEClass_eIDAttributeImpl();
		return diffEClass_eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eStructuralFeatures createDiffEClass_eStructuralFeatures() {
		DiffEClass_eStructuralFeaturesImpl diffEClass_eStructuralFeatures = new DiffEClass_eStructuralFeaturesImpl();
		return diffEClass_eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eGenericSuperTypes createDiffEClass_eGenericSuperTypes() {
		DiffEClass_eGenericSuperTypesImpl diffEClass_eGenericSuperTypes = new DiffEClass_eGenericSuperTypesImpl();
		return diffEClass_eGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClass_eAllGenericSuperTypes createDiffEClass_eAllGenericSuperTypes() {
		DiffEClass_eAllGenericSuperTypesImpl diffEClass_eAllGenericSuperTypes = new DiffEClass_eAllGenericSuperTypesImpl();
		return diffEClass_eAllGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClassifier_ePackage createDiffEClassifier_ePackage() {
		DiffEClassifier_ePackageImpl diffEClassifier_ePackage = new DiffEClassifier_ePackageImpl();
		return diffEClassifier_ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEClassifier_eTypeParameters createDiffEClassifier_eTypeParameters() {
		DiffEClassifier_eTypeParametersImpl diffEClassifier_eTypeParameters = new DiffEClassifier_eTypeParametersImpl();
		return diffEClassifier_eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEDataType createDiffEDataType() {
		DiffEDataTypeImpl diffEDataType = new DiffEDataTypeImpl();
		return diffEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEEnum createDiffEEnum() {
		DiffEEnumImpl diffEEnum = new DiffEEnumImpl();
		return diffEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEEnum_eLiterals createDiffEEnum_eLiterals() {
		DiffEEnum_eLiteralsImpl diffEEnum_eLiterals = new DiffEEnum_eLiteralsImpl();
		return diffEEnum_eLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEEnumLiteral createDiffEEnumLiteral() {
		DiffEEnumLiteralImpl diffEEnumLiteral = new DiffEEnumLiteralImpl();
		return diffEEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEEnumLiteral_eEnum createDiffEEnumLiteral_eEnum() {
		DiffEEnumLiteral_eEnumImpl diffEEnumLiteral_eEnum = new DiffEEnumLiteral_eEnumImpl();
		return diffEEnumLiteral_eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEFactory createDiffEFactory() {
		DiffEFactoryImpl diffEFactory = new DiffEFactoryImpl();
		return diffEFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEFactory_ePackage createDiffEFactory_ePackage() {
		DiffEFactory_ePackageImpl diffEFactory_ePackage = new DiffEFactory_ePackageImpl();
		return diffEFactory_ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEModelElement_eAnnotations createDiffEModelElement_eAnnotations() {
		DiffEModelElement_eAnnotationsImpl diffEModelElement_eAnnotations = new DiffEModelElement_eAnnotationsImpl();
		return diffEModelElement_eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEObject createDiffEObject() {
		DiffEObjectImpl diffEObject = new DiffEObjectImpl();
		return diffEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation createDiffEOperation() {
		DiffEOperationImpl diffEOperation = new DiffEOperationImpl();
		return diffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation_eContainingClass createDiffEOperation_eContainingClass() {
		DiffEOperation_eContainingClassImpl diffEOperation_eContainingClass = new DiffEOperation_eContainingClassImpl();
		return diffEOperation_eContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation_eTypeParameters createDiffEOperation_eTypeParameters() {
		DiffEOperation_eTypeParametersImpl diffEOperation_eTypeParameters = new DiffEOperation_eTypeParametersImpl();
		return diffEOperation_eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation_eParameters createDiffEOperation_eParameters() {
		DiffEOperation_eParametersImpl diffEOperation_eParameters = new DiffEOperation_eParametersImpl();
		return diffEOperation_eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation_eExceptions createDiffEOperation_eExceptions() {
		DiffEOperation_eExceptionsImpl diffEOperation_eExceptions = new DiffEOperation_eExceptionsImpl();
		return diffEOperation_eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEOperation_eGenericExceptions createDiffEOperation_eGenericExceptions() {
		DiffEOperation_eGenericExceptionsImpl diffEOperation_eGenericExceptions = new DiffEOperation_eGenericExceptionsImpl();
		return diffEOperation_eGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage createDiffEPackage() {
		DiffEPackageImpl diffEPackage = new DiffEPackageImpl();
		return diffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_eFactoryInstance createDiffEPackage_eFactoryInstance() {
		DiffEPackage_eFactoryInstanceImpl diffEPackage_eFactoryInstance = new DiffEPackage_eFactoryInstanceImpl();
		return diffEPackage_eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_eClassifiers createDiffEPackage_eClassifiers() {
		DiffEPackage_eClassifiersImpl diffEPackage_eClassifiers = new DiffEPackage_eClassifiersImpl();
		return diffEPackage_eClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_eSubpackages createDiffEPackage_eSubpackages() {
		DiffEPackage_eSubpackagesImpl diffEPackage_eSubpackages = new DiffEPackage_eSubpackagesImpl();
		return diffEPackage_eSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_eSuperPackage createDiffEPackage_eSuperPackage() {
		DiffEPackage_eSuperPackageImpl diffEPackage_eSuperPackage = new DiffEPackage_eSuperPackageImpl();
		return diffEPackage_eSuperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEPackage_domainspecificdiffs createDiffEPackage_domainspecificdiffs() {
		DiffEPackage_domainspecificdiffsImpl diffEPackage_domainspecificdiffs = new DiffEPackage_domainspecificdiffsImpl();
		return diffEPackage_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEParameter createDiffEParameter() {
		DiffEParameterImpl diffEParameter = new DiffEParameterImpl();
		return diffEParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEParameter_eOperation createDiffEParameter_eOperation() {
		DiffEParameter_eOperationImpl diffEParameter_eOperation = new DiffEParameter_eOperationImpl();
		return diffEParameter_eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEReference createDiffEReference() {
		DiffEReferenceImpl diffEReference = new DiffEReferenceImpl();
		return diffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEReference_eOpposite createDiffEReference_eOpposite() {
		DiffEReference_eOppositeImpl diffEReference_eOpposite = new DiffEReference_eOppositeImpl();
		return diffEReference_eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEReference_eReferenceType createDiffEReference_eReferenceType() {
		DiffEReference_eReferenceTypeImpl diffEReference_eReferenceType = new DiffEReference_eReferenceTypeImpl();
		return diffEReference_eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEReference_eKeys createDiffEReference_eKeys() {
		DiffEReference_eKeysImpl diffEReference_eKeys = new DiffEReference_eKeysImpl();
		return diffEReference_eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEStructuralFeature_eContainingClass createDiffEStructuralFeature_eContainingClass() {
		DiffEStructuralFeature_eContainingClassImpl diffEStructuralFeature_eContainingClass = new DiffEStructuralFeature_eContainingClassImpl();
		return diffEStructuralFeature_eContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffETypedElement_eType createDiffETypedElement_eType() {
		DiffETypedElement_eTypeImpl diffETypedElement_eType = new DiffETypedElement_eTypeImpl();
		return diffETypedElement_eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffETypedElement_eGenericType createDiffETypedElement_eGenericType() {
		DiffETypedElement_eGenericTypeImpl diffETypedElement_eGenericType = new DiffETypedElement_eGenericTypeImpl();
		return diffETypedElement_eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createDiffEStringToStringMapEntry() {
		DiffEStringToStringMapEntryImpl diffEStringToStringMapEntry = new DiffEStringToStringMapEntryImpl();
		return diffEStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType createDiffEGenericType() {
		DiffEGenericTypeImpl diffEGenericType = new DiffEGenericTypeImpl();
		return diffEGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eUpperBound createDiffEGenericType_eUpperBound() {
		DiffEGenericType_eUpperBoundImpl diffEGenericType_eUpperBound = new DiffEGenericType_eUpperBoundImpl();
		return diffEGenericType_eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eTypeArguments createDiffEGenericType_eTypeArguments() {
		DiffEGenericType_eTypeArgumentsImpl diffEGenericType_eTypeArguments = new DiffEGenericType_eTypeArgumentsImpl();
		return diffEGenericType_eTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eRawType createDiffEGenericType_eRawType() {
		DiffEGenericType_eRawTypeImpl diffEGenericType_eRawType = new DiffEGenericType_eRawTypeImpl();
		return diffEGenericType_eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eLowerBound createDiffEGenericType_eLowerBound() {
		DiffEGenericType_eLowerBoundImpl diffEGenericType_eLowerBound = new DiffEGenericType_eLowerBoundImpl();
		return diffEGenericType_eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eTypeParameter createDiffEGenericType_eTypeParameter() {
		DiffEGenericType_eTypeParameterImpl diffEGenericType_eTypeParameter = new DiffEGenericType_eTypeParameterImpl();
		return diffEGenericType_eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffEGenericType_eClassifier createDiffEGenericType_eClassifier() {
		DiffEGenericType_eClassifierImpl diffEGenericType_eClassifier = new DiffEGenericType_eClassifierImpl();
		return diffEGenericType_eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffETypeParameter createDiffETypeParameter() {
		DiffETypeParameterImpl diffETypeParameter = new DiffETypeParameterImpl();
		return diffETypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffETypeParameter_eBounds createDiffETypeParameter_eBounds() {
		DiffETypeParameter_eBoundsImpl diffETypeParameter_eBounds = new DiffETypeParameter_eBoundsImpl();
		return diffETypeParameter_eBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp createClassOpFromString(EDataType eDataType, String initialValue) {
		ClassOp result = ClassOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscOp createAscOpFromString(EDataType eDataType, String initialValue) {
		AscOp result = AscOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEBigIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createEBooleanFromString(EcoreDiffMMPackage.eINSTANCE.getEBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEBooleanToString(EcoreDiffMMPackage.eINSTANCE.getEBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createEByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteArrayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteObjectFromString(EDataType eDataType, String initialValue) {
		return createEByteFromString(EcoreDiffMMPackage.eINSTANCE.getEByte(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEByteToString(EcoreDiffMMPackage.eINSTANCE.getEByte(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharacterObjectFromString(EDataType eDataType, String initialValue) {
		return createECharFromString(EcoreDiffMMPackage.eINSTANCE.getEChar(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertECharToString(EcoreDiffMMPackage.eINSTANCE.getEChar(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createEDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createEDoubleFromString(EcoreDiffMMPackage.eINSTANCE.getEDouble(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEDoubleToString(EcoreDiffMMPackage.eINSTANCE.getEDouble(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createEFloatFromString(EcoreDiffMMPackage.eINSTANCE.getEFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEFloatToString(EcoreDiffMMPackage.eINSTANCE.getEFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createEIntFromString(EcoreDiffMMPackage.eINSTANCE.getEInt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEIntToString(EcoreDiffMMPackage.eINSTANCE.getEInt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createEJavaClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEJavaObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongObjectFromString(EDataType eDataType, String initialValue) {
		return createELongFromString(EcoreDiffMMPackage.eINSTANCE.getELong(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertELongToString(EcoreDiffMMPackage.eINSTANCE.getELong(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortObjectFromString(EDataType eDataType, String initialValue) {
		return createEShortFromString(EcoreDiffMMPackage.eINSTANCE.getEShort(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEShortToString(EcoreDiffMMPackage.eINSTANCE.getEShort(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreDiffMMPackage getEcoreDiffMMPackage() {
		return (EcoreDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreDiffMMPackage getPackage() {
		return EcoreDiffMMPackage.eINSTANCE;
	}

} //EcoreDiffMMFactoryImpl
