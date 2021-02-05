/**
 */
package ecoreDiffMM.util;

import ecoreDiffMM.*;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ecoreDiffMM.EcoreDiffMMPackage
 * @generated
 */
public class EcoreDiffMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoreDiffMMValidator INSTANCE = new EcoreDiffMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ecoreDiffMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreDiffMMValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EcoreDiffMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EcoreDiffMMPackage.EATTRIBUTE:
				return validateEAttribute((EAttribute)value, diagnostics, context);
			case EcoreDiffMMPackage.EANNOTATION:
				return validateEAnnotation((EAnnotation)value, diagnostics, context);
			case EcoreDiffMMPackage.ECLASS:
				return validateEClass((EClass)value, diagnostics, context);
			case EcoreDiffMMPackage.ECLASSIFIER:
				return validateEClassifier((EClassifier)value, diagnostics, context);
			case EcoreDiffMMPackage.EDATA_TYPE:
				return validateEDataType((EDataType)value, diagnostics, context);
			case EcoreDiffMMPackage.EENUM:
				return validateEEnum((EEnum)value, diagnostics, context);
			case EcoreDiffMMPackage.EENUM_LITERAL:
				return validateEEnumLiteral((EEnumLiteral)value, diagnostics, context);
			case EcoreDiffMMPackage.EFACTORY:
				return validateEFactory((EFactory)value, diagnostics, context);
			case EcoreDiffMMPackage.EMODEL_ELEMENT:
				return validateEModelElement((EModelElement)value, diagnostics, context);
			case EcoreDiffMMPackage.ENAMED_ELEMENT:
				return validateENamedElement((ENamedElement)value, diagnostics, context);
			case EcoreDiffMMPackage.EOBJECT:
				return validateEObject((EObject)value, diagnostics, context);
			case EcoreDiffMMPackage.EOPERATION:
				return validateEOperation((EOperation)value, diagnostics, context);
			case EcoreDiffMMPackage.EPACKAGE:
				return validateEPackage((ecoreDiffMM.EPackage)value, diagnostics, context);
			case EcoreDiffMMPackage.EPARAMETER:
				return validateEParameter((EParameter)value, diagnostics, context);
			case EcoreDiffMMPackage.EREFERENCE:
				return validateEReference((EReference)value, diagnostics, context);
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE:
				return validateEStructuralFeature((EStructuralFeature)value, diagnostics, context);
			case EcoreDiffMMPackage.ETYPED_ELEMENT:
				return validateETypedElement((ETypedElement)value, diagnostics, context);
			case EcoreDiffMMPackage.ESTRING_TO_STRING_MAP_ENTRY:
				return validateEStringToStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EcoreDiffMMPackage.EGENERIC_TYPE:
				return validateEGenericType((EGenericType)value, diagnostics, context);
			case EcoreDiffMMPackage.ETYPE_PARAMETER:
				return validateETypeParameter((ETypeParameter)value, diagnostics, context);
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF:
				return validateDomainSpecificDiff((DomainSpecificDiff)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE:
				return validateDiffEAttribute((DiffEAttribute)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EATTRIBUTE_EATTRIBUTE_TYPE:
				return validateDiffEAttribute_eAttributeType((DiffEAttribute_eAttributeType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EANNOTATION:
				return validateDiffEAnnotation((DiffEAnnotation)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EANNOTATION_DETAILS:
				return validateDiffEAnnotation_details((DiffEAnnotation_details)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EANNOTATION_EMODEL_ELEMENT:
				return validateDiffEAnnotation_eModelElement((DiffEAnnotation_eModelElement)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EANNOTATION_CONTENTS:
				return validateDiffEAnnotation_contents((DiffEAnnotation_contents)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EANNOTATION_REFERENCES:
				return validateDiffEAnnotation_references((DiffEAnnotation_references)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS:
				return validateDiffEClass((DiffEClass)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_ESUPER_TYPES:
				return validateDiffEClass_eSuperTypes((DiffEClass_eSuperTypes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EOPERATIONS:
				return validateDiffEClass_eOperations((DiffEClass_eOperations)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_ATTRIBUTES:
				return validateDiffEClass_eAllAttributes((DiffEClass_eAllAttributes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_REFERENCES:
				return validateDiffEClass_eAllReferences((DiffEClass_eAllReferences)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EREFERENCES:
				return validateDiffEClass_eReferences((DiffEClass_eReferences)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EATTRIBUTES:
				return validateDiffEClass_eAttributes((DiffEClass_eAttributes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_CONTAINMENTS:
				return validateDiffEClass_eAllContainments((DiffEClass_eAllContainments)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_OPERATIONS:
				return validateDiffEClass_eAllOperations((DiffEClass_eAllOperations)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_STRUCTURAL_FEATURES:
				return validateDiffEClass_eAllStructuralFeatures((DiffEClass_eAllStructuralFeatures)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_SUPER_TYPES:
				return validateDiffEClass_eAllSuperTypes((DiffEClass_eAllSuperTypes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EID_ATTRIBUTE:
				return validateDiffEClass_eIDAttribute((DiffEClass_eIDAttribute)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_ESTRUCTURAL_FEATURES:
				return validateDiffEClass_eStructuralFeatures((DiffEClass_eStructuralFeatures)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EGENERIC_SUPER_TYPES:
				return validateDiffEClass_eGenericSuperTypes((DiffEClass_eGenericSuperTypes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES:
				return validateDiffEClass_eAllGenericSuperTypes((DiffEClass_eAllGenericSuperTypes)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_EPACKAGE:
				return validateDiffEClassifier_ePackage((DiffEClassifier_ePackage)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ECLASSIFIER_ETYPE_PARAMETERS:
				return validateDiffEClassifier_eTypeParameters((DiffEClassifier_eTypeParameters)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EDATA_TYPE:
				return validateDiffEDataType((DiffEDataType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EENUM:
				return validateDiffEEnum((DiffEEnum)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EENUM_ELITERALS:
				return validateDiffEEnum_eLiterals((DiffEEnum_eLiterals)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL:
				return validateDiffEEnumLiteral((DiffEEnumLiteral)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL_EENUM:
				return validateDiffEEnumLiteral_eEnum((DiffEEnumLiteral_eEnum)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EFACTORY:
				return validateDiffEFactory((DiffEFactory)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EFACTORY_EPACKAGE:
				return validateDiffEFactory_ePackage((DiffEFactory_ePackage)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EMODEL_ELEMENT_EANNOTATIONS:
				return validateDiffEModelElement_eAnnotations((DiffEModelElement_eAnnotations)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOBJECT:
				return validateDiffEObject((DiffEObject)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION:
				return validateDiffEOperation((DiffEOperation)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION_ECONTAINING_CLASS:
				return validateDiffEOperation_eContainingClass((DiffEOperation_eContainingClass)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION_ETYPE_PARAMETERS:
				return validateDiffEOperation_eTypeParameters((DiffEOperation_eTypeParameters)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION_EPARAMETERS:
				return validateDiffEOperation_eParameters((DiffEOperation_eParameters)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION_EEXCEPTIONS:
				return validateDiffEOperation_eExceptions((DiffEOperation_eExceptions)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS:
				return validateDiffEOperation_eGenericExceptions((DiffEOperation_eGenericExceptions)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE:
				return validateDiffEPackage((DiffEPackage)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE_EFACTORY_INSTANCE:
				return validateDiffEPackage_eFactoryInstance((DiffEPackage_eFactoryInstance)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ECLASSIFIERS:
				return validateDiffEPackage_eClassifiers((DiffEPackage_eClassifiers)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUBPACKAGES:
				return validateDiffEPackage_eSubpackages((DiffEPackage_eSubpackages)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE_ESUPER_PACKAGE:
				return validateDiffEPackage_eSuperPackage((DiffEPackage_eSuperPackage)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPACKAGE_DOMAINSPECIFICDIFFS:
				return validateDiffEPackage_domainspecificdiffs((DiffEPackage_domainspecificdiffs)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPARAMETER:
				return validateDiffEParameter((DiffEParameter)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EPARAMETER_EOPERATION:
				return validateDiffEParameter_eOperation((DiffEParameter_eOperation)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EREFERENCE:
				return validateDiffEReference((DiffEReference)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EOPPOSITE:
				return validateDiffEReference_eOpposite((DiffEReference_eOpposite)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EREFERENCE_TYPE:
				return validateDiffEReference_eReferenceType((DiffEReference_eReferenceType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EREFERENCE_EKEYS:
				return validateDiffEReference_eKeys((DiffEReference_eKeys)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS:
				return validateDiffEStructuralFeature_eContainingClass((DiffEStructuralFeature_eContainingClass)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_ETYPE:
				return validateDiffETypedElement_eType((DiffETypedElement_eType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ETYPED_ELEMENT_EGENERIC_TYPE:
				return validateDiffETypedElement_eGenericType((DiffETypedElement_eGenericType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ESTRING_TO_STRING_MAP_ENTRY:
				return validateDiffEStringToStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE:
				return validateDiffEGenericType((DiffEGenericType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_EUPPER_BOUND:
				return validateDiffEGenericType_eUpperBound((DiffEGenericType_eUpperBound)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS:
				return validateDiffEGenericType_eTypeArguments((DiffEGenericType_eTypeArguments)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ERAW_TYPE:
				return validateDiffEGenericType_eRawType((DiffEGenericType_eRawType)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ELOWER_BOUND:
				return validateDiffEGenericType_eLowerBound((DiffEGenericType_eLowerBound)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ETYPE_PARAMETER:
				return validateDiffEGenericType_eTypeParameter((DiffEGenericType_eTypeParameter)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_EGENERIC_TYPE_ECLASSIFIER:
				return validateDiffEGenericType_eClassifier((DiffEGenericType_eClassifier)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER:
				return validateDiffETypeParameter((DiffETypeParameter)value, diagnostics, context);
			case EcoreDiffMMPackage.DIFF_ETYPE_PARAMETER_EBOUNDS:
				return validateDiffETypeParameter_eBounds((DiffETypeParameter_eBounds)value, diagnostics, context);
			case EcoreDiffMMPackage.CLASS_OP:
				return validateClassOp((ClassOp)value, diagnostics, context);
			case EcoreDiffMMPackage.ASC_OP:
				return validateAscOp((AscOp)value, diagnostics, context);
			case EcoreDiffMMPackage.EBIG_DECIMAL:
				return validateEBigDecimal((BigDecimal)value, diagnostics, context);
			case EcoreDiffMMPackage.EBIG_INTEGER:
				return validateEBigInteger((BigInteger)value, diagnostics, context);
			case EcoreDiffMMPackage.EBOOLEAN:
				return validateEBoolean((Boolean)value, diagnostics, context);
			case EcoreDiffMMPackage.EBOOLEAN_OBJECT:
				return validateEBooleanObject((Boolean)value, diagnostics, context);
			case EcoreDiffMMPackage.EBYTE:
				return validateEByte((Byte)value, diagnostics, context);
			case EcoreDiffMMPackage.EBYTE_ARRAY:
				return validateEByteArray((byte[])value, diagnostics, context);
			case EcoreDiffMMPackage.EBYTE_OBJECT:
				return validateEByteObject((Byte)value, diagnostics, context);
			case EcoreDiffMMPackage.ECHAR:
				return validateEChar((Character)value, diagnostics, context);
			case EcoreDiffMMPackage.ECHARACTER_OBJECT:
				return validateECharacterObject((Character)value, diagnostics, context);
			case EcoreDiffMMPackage.EDATE:
				return validateEDate((Date)value, diagnostics, context);
			case EcoreDiffMMPackage.EDIAGNOSTIC_CHAIN:
				return validateEDiagnosticChain((DiagnosticChain)value, diagnostics, context);
			case EcoreDiffMMPackage.EDOUBLE:
				return validateEDouble((Double)value, diagnostics, context);
			case EcoreDiffMMPackage.EDOUBLE_OBJECT:
				return validateEDoubleObject((Double)value, diagnostics, context);
			case EcoreDiffMMPackage.EE_LIST:
				return validateEEList((EList<?>)value, diagnostics, context);
			case EcoreDiffMMPackage.EENUMERATOR:
				return validateEEnumerator((Enumerator)value, diagnostics, context);
			case EcoreDiffMMPackage.EFEATURE_MAP:
				return validateEFeatureMap((FeatureMap)value, diagnostics, context);
			case EcoreDiffMMPackage.EFEATURE_MAP_ENTRY:
				return validateEFeatureMapEntry((FeatureMap.Entry)value, diagnostics, context);
			case EcoreDiffMMPackage.EFLOAT:
				return validateEFloat((Float)value, diagnostics, context);
			case EcoreDiffMMPackage.EFLOAT_OBJECT:
				return validateEFloatObject((Float)value, diagnostics, context);
			case EcoreDiffMMPackage.EINT:
				return validateEInt((Integer)value, diagnostics, context);
			case EcoreDiffMMPackage.EINTEGER_OBJECT:
				return validateEIntegerObject((Integer)value, diagnostics, context);
			case EcoreDiffMMPackage.EJAVA_CLASS:
				return validateEJavaClass((Class<?>)value, diagnostics, context);
			case EcoreDiffMMPackage.EJAVA_OBJECT:
				return validateEJavaObject(value, diagnostics, context);
			case EcoreDiffMMPackage.ELONG:
				return validateELong((Long)value, diagnostics, context);
			case EcoreDiffMMPackage.ELONG_OBJECT:
				return validateELongObject((Long)value, diagnostics, context);
			case EcoreDiffMMPackage.EMAP:
				return validateEMap((Map<?, ?>)value, diagnostics, context);
			case EcoreDiffMMPackage.ERESOURCE:
				return validateEResource((Resource)value, diagnostics, context);
			case EcoreDiffMMPackage.ERESOURCE_SET:
				return validateEResourceSet((ResourceSet)value, diagnostics, context);
			case EcoreDiffMMPackage.ESHORT:
				return validateEShort((Short)value, diagnostics, context);
			case EcoreDiffMMPackage.ESHORT_OBJECT:
				return validateEShortObject((Short)value, diagnostics, context);
			case EcoreDiffMMPackage.ESTRING:
				return validateEString((String)value, diagnostics, context);
			case EcoreDiffMMPackage.ETREE_ITERATOR:
				return validateETreeIterator((TreeIterator<?>)value, diagnostics, context);
			case EcoreDiffMMPackage.EINVOCATION_TARGET_EXCEPTION:
				return validateEInvocationTargetException((InvocationTargetException)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAttribute(EAttribute eAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAttribute_ConsistentTransient(eAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentTransient constraint of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAttribute_ConsistentTransient(EAttribute eAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentTransient", getObjectLabel(eAttribute, context) },
						 new Object[] { eAttribute },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAnnotation(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAnnotation_WellFormed(eAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAnnotation_WellFormedSourceURI(eAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormed constraint of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAnnotation_WellFormed(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormed", getObjectLabel(eAnnotation, context) },
						 new Object[] { eAnnotation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedSourceURI constraint of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAnnotation_WellFormedSourceURI(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedSourceURI", getObjectLabel(eAnnotation, context) },
						 new Object[] { eAnnotation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_InterfaceIsAbstract(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_AtMostOneID(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueFeatureNames(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueOperationSignatures(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_NoCircularSuperTypes(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_WellFormedMapEntryClass(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_ConsistentSuperTypes(eClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_DisjointFeatureAndOperationSignatures(eClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InterfaceIsAbstract constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_InterfaceIsAbstract(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "InterfaceIsAbstract", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AtMostOneID constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_AtMostOneID(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtMostOneID", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueFeatureNames constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_UniqueFeatureNames(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueFeatureNames", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueOperationSignatures constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_UniqueOperationSignatures(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueOperationSignatures", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoCircularSuperTypes constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_NoCircularSuperTypes(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoCircularSuperTypes", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedMapEntryClass constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_WellFormedMapEntryClass(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedMapEntryClass", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentSuperTypes constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_ConsistentSuperTypes(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentSuperTypes", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DisjointFeatureAndOperationSignatures constraint of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClass_DisjointFeatureAndOperationSignatures(EClass eClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DisjointFeatureAndOperationSignatures", getObjectLabel(eClass, context) },
						 new Object[] { eClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eClassifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedInstanceTypeName constraint of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier_WellFormedInstanceTypeName(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedInstanceTypeName", getObjectLabel(eClassifier, context) },
						 new Object[] { eClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEClassifier_UniqueTypeParameterNames(EClassifier eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(eClassifier, context) },
						 new Object[] { eClassifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataType(EDataType eDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eEnum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorNames(eEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorLiterals(eEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueEnumeratorNames constraint of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum_UniqueEnumeratorNames(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorNames", getObjectLabel(eEnum, context) },
						 new Object[] { eEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueEnumeratorLiterals constraint of '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnum_UniqueEnumeratorLiterals(EEnum eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueEnumeratorLiterals", getObjectLabel(eEnum, context) },
						 new Object[] { eEnum },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnumLiteral(EEnumLiteral eEnumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eEnumLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eEnumLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFactory(EFactory eFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEModelElement(EModelElement eModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eModelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENamedElement(ENamedElement eNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedName constraint of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENamedElement_WellFormedName(ENamedElement eNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedName", getObjectLabel(eNamedElement, context) },
						 new Object[] { eNamedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEObject(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueParameterNames(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueTypeParameterNames(eOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_NoRepeatingVoid(eOperation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueParameterNames constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_UniqueParameterNames(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueParameterNames", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueTypeParameterNames constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_UniqueTypeParameterNames(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueTypeParameterNames", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoRepeatingVoid constraint of '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOperation_NoRepeatingVoid(EOperation eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoRepeatingVoid", getObjectLabel(eOperation, context) },
						 new Object[] { eOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ePackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsURI(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsPrefix(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueSubpackageNames(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueClassifierNames(ePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueNsURIs(ePackage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WellFormedNsURI constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_WellFormedNsURI(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsURI", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WellFormedNsPrefix constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_WellFormedNsPrefix(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WellFormedNsPrefix", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueSubpackageNames constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueSubpackageNames(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueSubpackageNames", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueClassifierNames constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueClassifierNames(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueClassifierNames", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueNsURIs constraint of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEPackage_UniqueNsURIs(ecoreDiffMM.EPackage ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "UniqueNsURIs", getObjectLabel(ePackage, context) },
						 new Object[] { ePackage },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEParameter(EParameter eParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentOpposite(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_SingleContainer(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentKeys(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentUnique(eReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentContainer(eReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentOpposite constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentOpposite(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentOpposite", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SingleContainer constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_SingleContainer(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleContainer", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentKeys constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentKeys(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentKeys", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentUnique constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentUnique(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentUnique", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentContainer constraint of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEReference_ConsistentContainer(EReference eReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentContainer", getObjectLabel(eReference, context) },
						 new Object[] { eReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStructuralFeature(EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eStructuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eStructuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(eStructuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidDefaultValueLiteral constraint of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStructuralFeature_ValidDefaultValueLiteral(EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidDefaultValueLiteral", getObjectLabel(eStructuralFeature, context) },
						 new Object[] { eStructuralFeature },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eTypedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(eTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(eTypedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidLowerBound constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidLowerBound(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidLowerBound", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidUpperBound constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidUpperBound(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidUpperBound", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentBounds constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ConsistentBounds(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentBounds", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidType constraint of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypedElement_ValidType(ETypedElement eTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidType", getObjectLabel(eTypedElement, context) },
						 new Object[] { eTypedElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStringToStringMapEntry(Map.Entry<?, ?> eStringToStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((org.eclipse.emf.ecore.EObject)eStringToStringMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eGenericType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentType(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentBounds(eGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentArguments(eGenericType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConsistentType constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentType(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentType", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentBounds constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentBounds(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentBounds", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ConsistentArguments constraint of '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGenericType_ConsistentArguments(EGenericType eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ConsistentArguments", getObjectLabel(eGenericType, context) },
						 new Object[] { eGenericType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETypeParameter(ETypeParameter eTypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eTypeParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eTypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(eTypeParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainSpecificDiff(DomainSpecificDiff domainSpecificDiff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainSpecificDiff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAttribute(DiffEAttribute diffEAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(diffEAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAttribute_ConsistentTransient(diffEAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAttribute_eAttributeType(DiffEAttribute_eAttributeType diffEAttribute_eAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEAttribute_eAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAnnotation(DiffEAnnotation diffEAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAnnotation_WellFormed(diffEAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAnnotation_WellFormedSourceURI(diffEAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAnnotation_details(DiffEAnnotation_details diffEAnnotation_details, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEAnnotation_details, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAnnotation_eModelElement(DiffEAnnotation_eModelElement diffEAnnotation_eModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEAnnotation_eModelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAnnotation_contents(DiffEAnnotation_contents diffEAnnotation_contents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEAnnotation_contents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEAnnotation_references(DiffEAnnotation_references diffEAnnotation_references, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEAnnotation_references, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass(DiffEClass diffEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_InterfaceIsAbstract(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_AtMostOneID(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueFeatureNames(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_UniqueOperationSignatures(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_NoCircularSuperTypes(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_WellFormedMapEntryClass(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_ConsistentSuperTypes(diffEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClass_DisjointFeatureAndOperationSignatures(diffEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eSuperTypes(DiffEClass_eSuperTypes diffEClass_eSuperTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eSuperTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eOperations(DiffEClass_eOperations diffEClass_eOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eOperations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllAttributes(DiffEClass_eAllAttributes diffEClass_eAllAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllAttributes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllReferences(DiffEClass_eAllReferences diffEClass_eAllReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eReferences(DiffEClass_eReferences diffEClass_eReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAttributes(DiffEClass_eAttributes diffEClass_eAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAttributes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllContainments(DiffEClass_eAllContainments diffEClass_eAllContainments, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllContainments, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllOperations(DiffEClass_eAllOperations diffEClass_eAllOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllOperations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllStructuralFeatures(DiffEClass_eAllStructuralFeatures diffEClass_eAllStructuralFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllStructuralFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllSuperTypes(DiffEClass_eAllSuperTypes diffEClass_eAllSuperTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllSuperTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eIDAttribute(DiffEClass_eIDAttribute diffEClass_eIDAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eIDAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eStructuralFeatures(DiffEClass_eStructuralFeatures diffEClass_eStructuralFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eStructuralFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eGenericSuperTypes(DiffEClass_eGenericSuperTypes diffEClass_eGenericSuperTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eGenericSuperTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClass_eAllGenericSuperTypes(DiffEClass_eAllGenericSuperTypes diffEClass_eAllGenericSuperTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClass_eAllGenericSuperTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClassifier_ePackage(DiffEClassifier_ePackage diffEClassifier_ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClassifier_ePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEClassifier_eTypeParameters(DiffEClassifier_eTypeParameters diffEClassifier_eTypeParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEClassifier_eTypeParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEDataType(DiffEDataType diffEDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(diffEDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(diffEDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEEnum(DiffEEnum diffEEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEEnum, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_WellFormedInstanceTypeName(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEClassifier_UniqueTypeParameterNames(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorNames(diffEEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateEEnum_UniqueEnumeratorLiterals(diffEEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEEnum_eLiterals(DiffEEnum_eLiterals diffEEnum_eLiterals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEEnum_eLiterals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEEnumLiteral(DiffEEnumLiteral diffEEnumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEEnumLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEEnumLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEEnumLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEEnumLiteral_eEnum(DiffEEnumLiteral_eEnum diffEEnumLiteral_eEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEEnumLiteral_eEnum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEFactory(DiffEFactory diffEFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEFactory_ePackage(DiffEFactory_ePackage diffEFactory_ePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEFactory_ePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEModelElement_eAnnotations(DiffEModelElement_eAnnotations diffEModelElement_eAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEModelElement_eAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEObject(DiffEObject diffEObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation(DiffEOperation diffEOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueParameterNames(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_UniqueTypeParameterNames(diffEOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEOperation_NoRepeatingVoid(diffEOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation_eContainingClass(DiffEOperation_eContainingClass diffEOperation_eContainingClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEOperation_eContainingClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation_eTypeParameters(DiffEOperation_eTypeParameters diffEOperation_eTypeParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEOperation_eTypeParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation_eParameters(DiffEOperation_eParameters diffEOperation_eParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEOperation_eParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation_eExceptions(DiffEOperation_eExceptions diffEOperation_eExceptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEOperation_eExceptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEOperation_eGenericExceptions(DiffEOperation_eGenericExceptions diffEOperation_eGenericExceptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEOperation_eGenericExceptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage(DiffEPackage diffEPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsURI(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_WellFormedNsPrefix(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueSubpackageNames(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueClassifierNames(diffEPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateEPackage_UniqueNsURIs(diffEPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage_eFactoryInstance(DiffEPackage_eFactoryInstance diffEPackage_eFactoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEPackage_eFactoryInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage_eClassifiers(DiffEPackage_eClassifiers diffEPackage_eClassifiers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEPackage_eClassifiers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage_eSubpackages(DiffEPackage_eSubpackages diffEPackage_eSubpackages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEPackage_eSubpackages, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage_eSuperPackage(DiffEPackage_eSuperPackage diffEPackage_eSuperPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEPackage_eSuperPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEPackage_domainspecificdiffs(DiffEPackage_domainspecificdiffs diffEPackage_domainspecificdiffs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEPackage_domainspecificdiffs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEParameter(DiffEParameter diffEParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(diffEParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(diffEParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEParameter_eOperation(DiffEParameter_eOperation diffEParameter_eOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEParameter_eOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEReference(DiffEReference diffEReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidLowerBound(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidUpperBound(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ConsistentBounds(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateETypedElement_ValidType(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEStructuralFeature_ValidDefaultValueLiteral(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentOpposite(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_SingleContainer(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentKeys(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentUnique(diffEReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEReference_ConsistentContainer(diffEReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEReference_eOpposite(DiffEReference_eOpposite diffEReference_eOpposite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEReference_eOpposite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEReference_eReferenceType(DiffEReference_eReferenceType diffEReference_eReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEReference_eReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEReference_eKeys(DiffEReference_eKeys diffEReference_eKeys, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEReference_eKeys, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEStructuralFeature_eContainingClass(DiffEStructuralFeature_eContainingClass diffEStructuralFeature_eContainingClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEStructuralFeature_eContainingClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffETypedElement_eType(DiffETypedElement_eType diffETypedElement_eType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffETypedElement_eType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffETypedElement_eGenericType(DiffETypedElement_eGenericType diffETypedElement_eGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffETypedElement_eGenericType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEStringToStringMapEntry(Map.Entry<?, ?> diffEStringToStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((org.eclipse.emf.ecore.EObject)diffEStringToStringMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType(DiffEGenericType diffEGenericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffEGenericType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentType(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentBounds(diffEGenericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEGenericType_ConsistentArguments(diffEGenericType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eUpperBound(DiffEGenericType_eUpperBound diffEGenericType_eUpperBound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eUpperBound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eTypeArguments(DiffEGenericType_eTypeArguments diffEGenericType_eTypeArguments, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eTypeArguments, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eRawType(DiffEGenericType_eRawType diffEGenericType_eRawType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eRawType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eLowerBound(DiffEGenericType_eLowerBound diffEGenericType_eLowerBound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eLowerBound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eTypeParameter(DiffEGenericType_eTypeParameter diffEGenericType_eTypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eTypeParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffEGenericType_eClassifier(DiffEGenericType_eClassifier diffEGenericType_eClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffEGenericType_eClassifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffETypeParameter(DiffETypeParameter diffETypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diffETypeParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diffETypeParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateENamedElement_WellFormedName(diffETypeParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffETypeParameter_eBounds(DiffETypeParameter_eBounds diffETypeParameter_eBounds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffETypeParameter_eBounds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOp(ClassOp classOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAscOp(AscOp ascOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBigDecimal(BigDecimal eBigDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBigInteger(BigInteger eBigInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBoolean(boolean eBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBooleanObject(Boolean eBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByte(byte eByte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteArray(byte[] eByteArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEByteObject(Byte eByteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEChar(char eChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECharacterObject(Character eCharacterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDate(Date eDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDiagnosticChain(DiagnosticChain eDiagnosticChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDouble(double eDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDoubleObject(Double eDoubleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEList(EList<?> eeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnumerator(Enumerator eEnumerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMap(FeatureMap eFeatureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry(FeatureMap.Entry eFeatureMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFloat(float eFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFloatObject(Float eFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInt(int eInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIntegerObject(Integer eIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJavaClass(Class<?> eJavaClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEJavaObject(Object eJavaObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELong(long eLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELongObject(Long eLongObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMap(Map<?, ?> eMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResource(Resource eResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEResourceSet(ResourceSet eResourceSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEShort(short eShort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEShortObject(Short eShortObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEString(String eString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETreeIterator(TreeIterator<?> eTreeIterator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInvocationTargetException(InvocationTargetException eInvocationTargetException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcoreDiffMMValidator
