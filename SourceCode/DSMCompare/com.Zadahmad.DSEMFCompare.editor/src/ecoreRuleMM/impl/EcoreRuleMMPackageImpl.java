/**
 */
package ecoreRuleMM.impl;

import ecoreDiffMM.EcoreDiffMMPackage;

import ecoreDiffMM.impl.EcoreDiffMMPackageImpl;

import ecoreRuleMM.EcoreRuleMMFactory;
import ecoreRuleMM.EcoreRuleMMPackage;
import ecoreRuleMM.Pattern_DiffEAnnotation;
import ecoreRuleMM.Pattern_DiffEAnnotation_contents;
import ecoreRuleMM.Pattern_DiffEAnnotation_details;
import ecoreRuleMM.Pattern_DiffEAnnotation_eModelElement;
import ecoreRuleMM.Pattern_DiffEAnnotation_references;
import ecoreRuleMM.Pattern_DiffEAttribute;
import ecoreRuleMM.Pattern_DiffEAttribute_eAttributeType;
import ecoreRuleMM.Pattern_DiffEClass;
import ecoreRuleMM.Pattern_DiffEClass_eAllAttributes;
import ecoreRuleMM.Pattern_DiffEClass_eAllContainments;
import ecoreRuleMM.Pattern_DiffEClass_eAllGenericSuperTypes;
import ecoreRuleMM.Pattern_DiffEClass_eAllOperations;
import ecoreRuleMM.Pattern_DiffEClass_eAllReferences;
import ecoreRuleMM.Pattern_DiffEClass_eAllStructuralFeatures;
import ecoreRuleMM.Pattern_DiffEClass_eAllSuperTypes;
import ecoreRuleMM.Pattern_DiffEClass_eAttributes;
import ecoreRuleMM.Pattern_DiffEClass_eGenericSuperTypes;
import ecoreRuleMM.Pattern_DiffEClass_eIDAttribute;
import ecoreRuleMM.Pattern_DiffEClass_eOperations;
import ecoreRuleMM.Pattern_DiffEClass_eReferences;
import ecoreRuleMM.Pattern_DiffEClass_eStructuralFeatures;
import ecoreRuleMM.Pattern_DiffEClass_eSuperTypes;
import ecoreRuleMM.Pattern_DiffEClassifier_ePackage;
import ecoreRuleMM.Pattern_DiffEClassifier_eTypeParameters;
import ecoreRuleMM.Pattern_DiffEDataType;
import ecoreRuleMM.Pattern_DiffEEnum;
import ecoreRuleMM.Pattern_DiffEEnumLiteral;
import ecoreRuleMM.Pattern_DiffEEnumLiteral_eEnum;
import ecoreRuleMM.Pattern_DiffEEnum_eLiterals;
import ecoreRuleMM.Pattern_DiffEFactory;
import ecoreRuleMM.Pattern_DiffEFactory_ePackage;
import ecoreRuleMM.Pattern_DiffEGenericType;
import ecoreRuleMM.Pattern_DiffEGenericType_eClassifier;
import ecoreRuleMM.Pattern_DiffEGenericType_eLowerBound;
import ecoreRuleMM.Pattern_DiffEGenericType_eRawType;
import ecoreRuleMM.Pattern_DiffEGenericType_eTypeArguments;
import ecoreRuleMM.Pattern_DiffEGenericType_eTypeParameter;
import ecoreRuleMM.Pattern_DiffEGenericType_eUpperBound;
import ecoreRuleMM.Pattern_DiffEModelElement_eAnnotations;
import ecoreRuleMM.Pattern_DiffEObject;
import ecoreRuleMM.Pattern_DiffEOperation;
import ecoreRuleMM.Pattern_DiffEOperation_eContainingClass;
import ecoreRuleMM.Pattern_DiffEOperation_eExceptions;
import ecoreRuleMM.Pattern_DiffEOperation_eGenericExceptions;
import ecoreRuleMM.Pattern_DiffEOperation_eParameters;
import ecoreRuleMM.Pattern_DiffEOperation_eTypeParameters;
import ecoreRuleMM.Pattern_DiffEPackage;
import ecoreRuleMM.Pattern_DiffEPackage_domainspecificdiffs;
import ecoreRuleMM.Pattern_DiffEPackage_eClassifiers;
import ecoreRuleMM.Pattern_DiffEPackage_eFactoryInstance;
import ecoreRuleMM.Pattern_DiffEPackage_eSubpackages;
import ecoreRuleMM.Pattern_DiffEPackage_eSuperPackage;
import ecoreRuleMM.Pattern_DiffEParameter;
import ecoreRuleMM.Pattern_DiffEParameter_eOperation;
import ecoreRuleMM.Pattern_DiffEReference;
import ecoreRuleMM.Pattern_DiffEReference_eKeys;
import ecoreRuleMM.Pattern_DiffEReference_eOpposite;
import ecoreRuleMM.Pattern_DiffEReference_eReferenceType;
import ecoreRuleMM.Pattern_DiffEStructuralFeature_eContainingClass;
import ecoreRuleMM.Pattern_DiffETypeParameter;
import ecoreRuleMM.Pattern_DiffETypeParameter_eBounds;
import ecoreRuleMM.Pattern_DiffETypedElement_eGenericType;
import ecoreRuleMM.Pattern_DiffETypedElement_eType;
import ecoreRuleMM.Pattern_DomainSpecificDiff;
import ecoreRuleMM.Pattern_EAnnotation;
import ecoreRuleMM.Pattern_EAttribute;
import ecoreRuleMM.Pattern_EClass;
import ecoreRuleMM.Pattern_EClassifier;
import ecoreRuleMM.Pattern_EDataType;
import ecoreRuleMM.Pattern_EEnum;
import ecoreRuleMM.Pattern_EEnumLiteral;
import ecoreRuleMM.Pattern_EFactory;
import ecoreRuleMM.Pattern_EGenericType;
import ecoreRuleMM.Pattern_EModelElement;
import ecoreRuleMM.Pattern_ENamedElement;
import ecoreRuleMM.Pattern_EObject;
import ecoreRuleMM.Pattern_EOperation;
import ecoreRuleMM.Pattern_EPackage;
import ecoreRuleMM.Pattern_EParameter;
import ecoreRuleMM.Pattern_EReference;
import ecoreRuleMM.Pattern_EStructuralFeature;
import ecoreRuleMM.Pattern_ETypeParameter;
import ecoreRuleMM.Pattern_ETypedElement;
import ecoreRuleMM.Rule;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreRuleMMPackageImpl extends EPackageImpl implements EcoreRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ENamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ETypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ETypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DomainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAttribute_eAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAnnotation_detailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAnnotation_eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAnnotation_contentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEAnnotation_referencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllContainmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllStructuralFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eIDAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eStructuralFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eGenericSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClass_eAllGenericSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClassifier_ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEClassifier_eTypeParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEEnum_eLiteralsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEEnumLiteral_eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEFactory_ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEModelElement_eAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperation_eContainingClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperation_eTypeParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperation_eParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperation_eExceptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEOperation_eGenericExceptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_eFactoryInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_eClassifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_eSubpackagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_eSuperPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEPackage_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEParameter_eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEReference_eOppositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEReference_eReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEReference_eKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEStructuralFeature_eContainingClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffETypedElement_eTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffETypedElement_eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eUpperBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eTypeArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eRawTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eLowerBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEGenericType_eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffETypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffETypeParameter_eBoundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecoreRuleMM.EcoreRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreRuleMMPackageImpl() {
		super(eNS_URI, EcoreRuleMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EcoreRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreRuleMMPackage init() {
		if (isInited) return (EcoreRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEcoreRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcoreRuleMMPackageImpl theEcoreRuleMMPackage = registeredEcoreRuleMMPackage instanceof EcoreRuleMMPackageImpl ? (EcoreRuleMMPackageImpl)registeredEcoreRuleMMPackage : new EcoreRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI);
		EcoreDiffMMPackageImpl theEcoreDiffMMPackage = (EcoreDiffMMPackageImpl)(registeredPackage instanceof EcoreDiffMMPackageImpl ? registeredPackage : EcoreDiffMMPackage.eINSTANCE);

		// Load packages
		theEcoreDiffMMPackage.loadPackage();

		// Create package meta-data objects
		theEcoreRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreRuleMMPackage.initializePackageContents();

		// Fix loaded packages
		theEcoreDiffMMPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreRuleMMPackage.eNS_URI, theEcoreRuleMMPackage);
		return theEcoreRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EAttribute() {
		return pattern_EAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAttribute_ID_Pattern() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAttribute_Filter() {
		return (EAttribute)pattern_EAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EAnnotation() {
		return pattern_EAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAnnotation_ID_Pattern() {
		return (EAttribute)pattern_EAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EAnnotation_Filter() {
		return (EAttribute)pattern_EAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EClass() {
		return pattern_EClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClass_ID_Pattern() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClass_Filter() {
		return (EAttribute)pattern_EClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EClassifier() {
		return pattern_EClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClassifier_ID_Pattern() {
		return (EAttribute)pattern_EClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EClassifier_Filter() {
		return (EAttribute)pattern_EClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EDataType() {
		return pattern_EDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EDataType_ID_Pattern() {
		return (EAttribute)pattern_EDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EDataType_Filter() {
		return (EAttribute)pattern_EDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EEnum() {
		return pattern_EEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EEnum_ID_Pattern() {
		return (EAttribute)pattern_EEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EEnum_Filter() {
		return (EAttribute)pattern_EEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EEnumLiteral() {
		return pattern_EEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EEnumLiteral_ID_Pattern() {
		return (EAttribute)pattern_EEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EEnumLiteral_Filter() {
		return (EAttribute)pattern_EEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EFactory() {
		return pattern_EFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EFactory_ID_Pattern() {
		return (EAttribute)pattern_EFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EFactory_Filter() {
		return (EAttribute)pattern_EFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EModelElement() {
		return pattern_EModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EModelElement_ID_Pattern() {
		return (EAttribute)pattern_EModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EModelElement_Filter() {
		return (EAttribute)pattern_EModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_ENamedElement() {
		return pattern_ENamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ENamedElement_ID_Pattern() {
		return (EAttribute)pattern_ENamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ENamedElement_Filter() {
		return (EAttribute)pattern_ENamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EObject() {
		return pattern_EObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EObject_ID_Pattern() {
		return (EAttribute)pattern_EObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EObject_Filter() {
		return (EAttribute)pattern_EObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EOperation() {
		return pattern_EOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EOperation_ID_Pattern() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EOperation_Filter() {
		return (EAttribute)pattern_EOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EPackage() {
		return pattern_EPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EPackage_ID_Pattern() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EPackage_Filter() {
		return (EAttribute)pattern_EPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EParameter() {
		return pattern_EParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EParameter_ID_Pattern() {
		return (EAttribute)pattern_EParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EParameter_Filter() {
		return (EAttribute)pattern_EParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EReference() {
		return pattern_EReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EReference_ID_Pattern() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EReference_Filter() {
		return (EAttribute)pattern_EReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EStructuralFeature() {
		return pattern_EStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EStructuralFeature_ID_Pattern() {
		return (EAttribute)pattern_EStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EStructuralFeature_Filter() {
		return (EAttribute)pattern_EStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_ETypedElement() {
		return pattern_ETypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ETypedElement_ID_Pattern() {
		return (EAttribute)pattern_ETypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ETypedElement_Filter() {
		return (EAttribute)pattern_ETypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EStringToStringMapEntry() {
		return pattern_EStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EStringToStringMapEntry_ID_Pattern() {
		return (EAttribute)pattern_EStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EStringToStringMapEntry_Filter() {
		return (EAttribute)pattern_EStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_EGenericType() {
		return pattern_EGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EGenericType_ID_Pattern() {
		return (EAttribute)pattern_EGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_EGenericType_Filter() {
		return (EAttribute)pattern_EGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_ETypeParameter() {
		return pattern_ETypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ETypeParameter_ID_Pattern() {
		return (EAttribute)pattern_ETypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ETypeParameter_Filter() {
		return (EAttribute)pattern_ETypeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DomainSpecificDiff() {
		return pattern_DomainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_ID_Pattern() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_Filter() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAttribute() {
		return pattern_DiffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_ID_Pattern() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_Filter() {
		return (EAttribute)pattern_DiffEAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAttribute_eAttributeType() {
		return pattern_DiffEAttribute_eAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_eAttributeType_ID_Pattern() {
		return (EAttribute)pattern_DiffEAttribute_eAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAttribute_eAttributeType_Filter() {
		return (EAttribute)pattern_DiffEAttribute_eAttributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAnnotation() {
		return pattern_DiffEAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_ID_Pattern() {
		return (EAttribute)pattern_DiffEAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_Filter() {
		return (EAttribute)pattern_DiffEAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAnnotation_details() {
		return pattern_DiffEAnnotation_detailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_details_ID_Pattern() {
		return (EAttribute)pattern_DiffEAnnotation_detailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_details_Filter() {
		return (EAttribute)pattern_DiffEAnnotation_detailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAnnotation_eModelElement() {
		return pattern_DiffEAnnotation_eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_eModelElement_ID_Pattern() {
		return (EAttribute)pattern_DiffEAnnotation_eModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_eModelElement_Filter() {
		return (EAttribute)pattern_DiffEAnnotation_eModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAnnotation_contents() {
		return pattern_DiffEAnnotation_contentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_contents_ID_Pattern() {
		return (EAttribute)pattern_DiffEAnnotation_contentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_contents_Filter() {
		return (EAttribute)pattern_DiffEAnnotation_contentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEAnnotation_references() {
		return pattern_DiffEAnnotation_referencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_references_ID_Pattern() {
		return (EAttribute)pattern_DiffEAnnotation_referencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEAnnotation_references_Filter() {
		return (EAttribute)pattern_DiffEAnnotation_referencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass() {
		return pattern_DiffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_ID_Pattern() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_Filter() {
		return (EAttribute)pattern_DiffEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eSuperTypes() {
		return pattern_DiffEClass_eSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eSuperTypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eSuperTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eSuperTypes_Filter() {
		return (EAttribute)pattern_DiffEClass_eSuperTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eOperations() {
		return pattern_DiffEClass_eOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eOperations_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eOperations_Filter() {
		return (EAttribute)pattern_DiffEClass_eOperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllAttributes() {
		return pattern_DiffEClass_eAllAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllAttributes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllAttributes_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllReferences() {
		return pattern_DiffEClass_eAllReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllReferences_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllReferences_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllReferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eReferences() {
		return pattern_DiffEClass_eReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eReferences_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eReferences_Filter() {
		return (EAttribute)pattern_DiffEClass_eReferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAttributes() {
		return pattern_DiffEClass_eAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAttributes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAttributes_Filter() {
		return (EAttribute)pattern_DiffEClass_eAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllContainments() {
		return pattern_DiffEClass_eAllContainmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllContainments_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllContainmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllContainments_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllContainmentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllOperations() {
		return pattern_DiffEClass_eAllOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllOperations_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllOperations_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllOperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllStructuralFeatures() {
		return pattern_DiffEClass_eAllStructuralFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllStructuralFeatures_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllStructuralFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllStructuralFeatures_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllStructuralFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllSuperTypes() {
		return pattern_DiffEClass_eAllSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllSuperTypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllSuperTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllSuperTypes_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllSuperTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eIDAttribute() {
		return pattern_DiffEClass_eIDAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eIDAttribute_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eIDAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eIDAttribute_Filter() {
		return (EAttribute)pattern_DiffEClass_eIDAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eStructuralFeatures() {
		return pattern_DiffEClass_eStructuralFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eStructuralFeatures_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eStructuralFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eStructuralFeatures_Filter() {
		return (EAttribute)pattern_DiffEClass_eStructuralFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eGenericSuperTypes() {
		return pattern_DiffEClass_eGenericSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eGenericSuperTypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eGenericSuperTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eGenericSuperTypes_Filter() {
		return (EAttribute)pattern_DiffEClass_eGenericSuperTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClass_eAllGenericSuperTypes() {
		return pattern_DiffEClass_eAllGenericSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllGenericSuperTypes_ID_Pattern() {
		return (EAttribute)pattern_DiffEClass_eAllGenericSuperTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClass_eAllGenericSuperTypes_Filter() {
		return (EAttribute)pattern_DiffEClass_eAllGenericSuperTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClassifier_ePackage() {
		return pattern_DiffEClassifier_ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClassifier_ePackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEClassifier_ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClassifier_ePackage_Filter() {
		return (EAttribute)pattern_DiffEClassifier_ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEClassifier_eTypeParameters() {
		return pattern_DiffEClassifier_eTypeParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClassifier_eTypeParameters_ID_Pattern() {
		return (EAttribute)pattern_DiffEClassifier_eTypeParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEClassifier_eTypeParameters_Filter() {
		return (EAttribute)pattern_DiffEClassifier_eTypeParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEDataType() {
		return pattern_DiffEDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEDataType_ID_Pattern() {
		return (EAttribute)pattern_DiffEDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEDataType_Filter() {
		return (EAttribute)pattern_DiffEDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEEnum() {
		return pattern_DiffEEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnum_ID_Pattern() {
		return (EAttribute)pattern_DiffEEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnum_Filter() {
		return (EAttribute)pattern_DiffEEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEEnum_eLiterals() {
		return pattern_DiffEEnum_eLiteralsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnum_eLiterals_ID_Pattern() {
		return (EAttribute)pattern_DiffEEnum_eLiteralsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnum_eLiterals_Filter() {
		return (EAttribute)pattern_DiffEEnum_eLiteralsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEEnumLiteral() {
		return pattern_DiffEEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnumLiteral_ID_Pattern() {
		return (EAttribute)pattern_DiffEEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnumLiteral_Filter() {
		return (EAttribute)pattern_DiffEEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEEnumLiteral_eEnum() {
		return pattern_DiffEEnumLiteral_eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnumLiteral_eEnum_ID_Pattern() {
		return (EAttribute)pattern_DiffEEnumLiteral_eEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEEnumLiteral_eEnum_Filter() {
		return (EAttribute)pattern_DiffEEnumLiteral_eEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEFactory() {
		return pattern_DiffEFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEFactory_ID_Pattern() {
		return (EAttribute)pattern_DiffEFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEFactory_Filter() {
		return (EAttribute)pattern_DiffEFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEFactory_ePackage() {
		return pattern_DiffEFactory_ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEFactory_ePackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEFactory_ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEFactory_ePackage_Filter() {
		return (EAttribute)pattern_DiffEFactory_ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEModelElement_eAnnotations() {
		return pattern_DiffEModelElement_eAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEModelElement_eAnnotations_ID_Pattern() {
		return (EAttribute)pattern_DiffEModelElement_eAnnotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEModelElement_eAnnotations_Filter() {
		return (EAttribute)pattern_DiffEModelElement_eAnnotationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEObject() {
		return pattern_DiffEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEObject_ID_Pattern() {
		return (EAttribute)pattern_DiffEObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEObject_Filter() {
		return (EAttribute)pattern_DiffEObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation() {
		return pattern_DiffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_Filter() {
		return (EAttribute)pattern_DiffEOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation_eContainingClass() {
		return pattern_DiffEOperation_eContainingClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eContainingClass_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperation_eContainingClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eContainingClass_Filter() {
		return (EAttribute)pattern_DiffEOperation_eContainingClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation_eTypeParameters() {
		return pattern_DiffEOperation_eTypeParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eTypeParameters_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperation_eTypeParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eTypeParameters_Filter() {
		return (EAttribute)pattern_DiffEOperation_eTypeParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation_eParameters() {
		return pattern_DiffEOperation_eParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eParameters_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperation_eParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eParameters_Filter() {
		return (EAttribute)pattern_DiffEOperation_eParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation_eExceptions() {
		return pattern_DiffEOperation_eExceptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eExceptions_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperation_eExceptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eExceptions_Filter() {
		return (EAttribute)pattern_DiffEOperation_eExceptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEOperation_eGenericExceptions() {
		return pattern_DiffEOperation_eGenericExceptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eGenericExceptions_ID_Pattern() {
		return (EAttribute)pattern_DiffEOperation_eGenericExceptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEOperation_eGenericExceptions_Filter() {
		return (EAttribute)pattern_DiffEOperation_eGenericExceptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage() {
		return pattern_DiffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_Filter() {
		return (EAttribute)pattern_DiffEPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_eFactoryInstance() {
		return pattern_DiffEPackage_eFactoryInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eFactoryInstance_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eFactoryInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eFactoryInstance_Filter() {
		return (EAttribute)pattern_DiffEPackage_eFactoryInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_eClassifiers() {
		return pattern_DiffEPackage_eClassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eClassifiers_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eClassifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eClassifiers_Filter() {
		return (EAttribute)pattern_DiffEPackage_eClassifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_eSubpackages() {
		return pattern_DiffEPackage_eSubpackagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eSubpackages_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eSubpackagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eSubpackages_Filter() {
		return (EAttribute)pattern_DiffEPackage_eSubpackagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_eSuperPackage() {
		return pattern_DiffEPackage_eSuperPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eSuperPackage_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_eSuperPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_eSuperPackage_Filter() {
		return (EAttribute)pattern_DiffEPackage_eSuperPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEPackage_domainspecificdiffs() {
		return pattern_DiffEPackage_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern() {
		return (EAttribute)pattern_DiffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEPackage_domainspecificdiffs_Filter() {
		return (EAttribute)pattern_DiffEPackage_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEParameter() {
		return pattern_DiffEParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEParameter_ID_Pattern() {
		return (EAttribute)pattern_DiffEParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEParameter_Filter() {
		return (EAttribute)pattern_DiffEParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEParameter_eOperation() {
		return pattern_DiffEParameter_eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEParameter_eOperation_ID_Pattern() {
		return (EAttribute)pattern_DiffEParameter_eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEParameter_eOperation_Filter() {
		return (EAttribute)pattern_DiffEParameter_eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEReference() {
		return pattern_DiffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_ID_Pattern() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_Filter() {
		return (EAttribute)pattern_DiffEReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEReference_eOpposite() {
		return pattern_DiffEReference_eOppositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eOpposite_ID_Pattern() {
		return (EAttribute)pattern_DiffEReference_eOppositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eOpposite_Filter() {
		return (EAttribute)pattern_DiffEReference_eOppositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEReference_eReferenceType() {
		return pattern_DiffEReference_eReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eReferenceType_ID_Pattern() {
		return (EAttribute)pattern_DiffEReference_eReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eReferenceType_Filter() {
		return (EAttribute)pattern_DiffEReference_eReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEReference_eKeys() {
		return pattern_DiffEReference_eKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eKeys_ID_Pattern() {
		return (EAttribute)pattern_DiffEReference_eKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEReference_eKeys_Filter() {
		return (EAttribute)pattern_DiffEReference_eKeysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEStructuralFeature_eContainingClass() {
		return pattern_DiffEStructuralFeature_eContainingClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEStructuralFeature_eContainingClass_ID_Pattern() {
		return (EAttribute)pattern_DiffEStructuralFeature_eContainingClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEStructuralFeature_eContainingClass_Filter() {
		return (EAttribute)pattern_DiffEStructuralFeature_eContainingClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffETypedElement_eType() {
		return pattern_DiffETypedElement_eTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypedElement_eType_ID_Pattern() {
		return (EAttribute)pattern_DiffETypedElement_eTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypedElement_eType_Filter() {
		return (EAttribute)pattern_DiffETypedElement_eTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffETypedElement_eGenericType() {
		return pattern_DiffETypedElement_eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypedElement_eGenericType_ID_Pattern() {
		return (EAttribute)pattern_DiffETypedElement_eGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypedElement_eGenericType_Filter() {
		return (EAttribute)pattern_DiffETypedElement_eGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEStringToStringMapEntry() {
		return pattern_DiffEStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEStringToStringMapEntry_ID_Pattern() {
		return (EAttribute)pattern_DiffEStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEStringToStringMapEntry_Filter() {
		return (EAttribute)pattern_DiffEStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType() {
		return pattern_DiffEGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_Filter() {
		return (EAttribute)pattern_DiffEGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eUpperBound() {
		return pattern_DiffEGenericType_eUpperBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eUpperBound_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eUpperBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eUpperBound_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eUpperBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eTypeArguments() {
		return pattern_DiffEGenericType_eTypeArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eTypeArguments_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eTypeArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eTypeArguments_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eTypeArgumentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eRawType() {
		return pattern_DiffEGenericType_eRawTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eRawType_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eRawTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eRawType_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eRawTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eLowerBound() {
		return pattern_DiffEGenericType_eLowerBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eLowerBound_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eLowerBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eLowerBound_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eLowerBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eTypeParameter() {
		return pattern_DiffEGenericType_eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eTypeParameter_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eTypeParameter_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eTypeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffEGenericType_eClassifier() {
		return pattern_DiffEGenericType_eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eClassifier_ID_Pattern() {
		return (EAttribute)pattern_DiffEGenericType_eClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffEGenericType_eClassifier_Filter() {
		return (EAttribute)pattern_DiffEGenericType_eClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffETypeParameter() {
		return pattern_DiffETypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypeParameter_ID_Pattern() {
		return (EAttribute)pattern_DiffETypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypeParameter_Filter() {
		return (EAttribute)pattern_DiffETypeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffETypeParameter_eBounds() {
		return pattern_DiffETypeParameter_eBoundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypeParameter_eBounds_ID_Pattern() {
		return (EAttribute)pattern_DiffETypeParameter_eBoundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffETypeParameter_eBounds_Filter() {
		return (EAttribute)pattern_DiffETypeParameter_eBoundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Pattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreRuleMMFactory getEcoreRuleMMFactory() {
		return (EcoreRuleMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pattern_EAttributeEClass = createEClass(PATTERN_EATTRIBUTE);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_EAttributeEClass, PATTERN_EATTRIBUTE__FILTER);

		pattern_EAnnotationEClass = createEClass(PATTERN_EANNOTATION);
		createEAttribute(pattern_EAnnotationEClass, PATTERN_EANNOTATION__ID_PATTERN);
		createEAttribute(pattern_EAnnotationEClass, PATTERN_EANNOTATION__FILTER);

		pattern_EClassEClass = createEClass(PATTERN_ECLASS);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__ID_PATTERN);
		createEAttribute(pattern_EClassEClass, PATTERN_ECLASS__FILTER);

		pattern_EClassifierEClass = createEClass(PATTERN_ECLASSIFIER);
		createEAttribute(pattern_EClassifierEClass, PATTERN_ECLASSIFIER__ID_PATTERN);
		createEAttribute(pattern_EClassifierEClass, PATTERN_ECLASSIFIER__FILTER);

		pattern_EDataTypeEClass = createEClass(PATTERN_EDATA_TYPE);
		createEAttribute(pattern_EDataTypeEClass, PATTERN_EDATA_TYPE__ID_PATTERN);
		createEAttribute(pattern_EDataTypeEClass, PATTERN_EDATA_TYPE__FILTER);

		pattern_EEnumEClass = createEClass(PATTERN_EENUM);
		createEAttribute(pattern_EEnumEClass, PATTERN_EENUM__ID_PATTERN);
		createEAttribute(pattern_EEnumEClass, PATTERN_EENUM__FILTER);

		pattern_EEnumLiteralEClass = createEClass(PATTERN_EENUM_LITERAL);
		createEAttribute(pattern_EEnumLiteralEClass, PATTERN_EENUM_LITERAL__ID_PATTERN);
		createEAttribute(pattern_EEnumLiteralEClass, PATTERN_EENUM_LITERAL__FILTER);

		pattern_EFactoryEClass = createEClass(PATTERN_EFACTORY);
		createEAttribute(pattern_EFactoryEClass, PATTERN_EFACTORY__ID_PATTERN);
		createEAttribute(pattern_EFactoryEClass, PATTERN_EFACTORY__FILTER);

		pattern_EModelElementEClass = createEClass(PATTERN_EMODEL_ELEMENT);
		createEAttribute(pattern_EModelElementEClass, PATTERN_EMODEL_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_EModelElementEClass, PATTERN_EMODEL_ELEMENT__FILTER);

		pattern_ENamedElementEClass = createEClass(PATTERN_ENAMED_ELEMENT);
		createEAttribute(pattern_ENamedElementEClass, PATTERN_ENAMED_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_ENamedElementEClass, PATTERN_ENAMED_ELEMENT__FILTER);

		pattern_EObjectEClass = createEClass(PATTERN_EOBJECT);
		createEAttribute(pattern_EObjectEClass, PATTERN_EOBJECT__ID_PATTERN);
		createEAttribute(pattern_EObjectEClass, PATTERN_EOBJECT__FILTER);

		pattern_EOperationEClass = createEClass(PATTERN_EOPERATION);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_EOperationEClass, PATTERN_EOPERATION__FILTER);

		pattern_EPackageEClass = createEClass(PATTERN_EPACKAGE);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_EPackageEClass, PATTERN_EPACKAGE__FILTER);

		pattern_EParameterEClass = createEClass(PATTERN_EPARAMETER);
		createEAttribute(pattern_EParameterEClass, PATTERN_EPARAMETER__ID_PATTERN);
		createEAttribute(pattern_EParameterEClass, PATTERN_EPARAMETER__FILTER);

		pattern_EReferenceEClass = createEClass(PATTERN_EREFERENCE);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_EReferenceEClass, PATTERN_EREFERENCE__FILTER);

		pattern_EStructuralFeatureEClass = createEClass(PATTERN_ESTRUCTURAL_FEATURE);
		createEAttribute(pattern_EStructuralFeatureEClass, PATTERN_ESTRUCTURAL_FEATURE__ID_PATTERN);
		createEAttribute(pattern_EStructuralFeatureEClass, PATTERN_ESTRUCTURAL_FEATURE__FILTER);

		pattern_ETypedElementEClass = createEClass(PATTERN_ETYPED_ELEMENT);
		createEAttribute(pattern_ETypedElementEClass, PATTERN_ETYPED_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_ETypedElementEClass, PATTERN_ETYPED_ELEMENT__FILTER);

		pattern_EStringToStringMapEntryEClass = createEClass(PATTERN_ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(pattern_EStringToStringMapEntryEClass, PATTERN_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN);
		createEAttribute(pattern_EStringToStringMapEntryEClass, PATTERN_ESTRING_TO_STRING_MAP_ENTRY__FILTER);

		pattern_EGenericTypeEClass = createEClass(PATTERN_EGENERIC_TYPE);
		createEAttribute(pattern_EGenericTypeEClass, PATTERN_EGENERIC_TYPE__ID_PATTERN);
		createEAttribute(pattern_EGenericTypeEClass, PATTERN_EGENERIC_TYPE__FILTER);

		pattern_ETypeParameterEClass = createEClass(PATTERN_ETYPE_PARAMETER);
		createEAttribute(pattern_ETypeParameterEClass, PATTERN_ETYPE_PARAMETER__ID_PATTERN);
		createEAttribute(pattern_ETypeParameterEClass, PATTERN_ETYPE_PARAMETER__FILTER);

		pattern_DomainSpecificDiffEClass = createEClass(PATTERN_DOMAIN_SPECIFIC_DIFF);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER);

		pattern_DiffEAttributeEClass = createEClass(PATTERN_DIFF_EATTRIBUTE);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_DiffEAttributeEClass, PATTERN_DIFF_EATTRIBUTE__FILTER);

		pattern_DiffEAttribute_eAttributeTypeEClass = createEClass(PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE);
		createEAttribute(pattern_DiffEAttribute_eAttributeTypeEClass, PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffEAttribute_eAttributeTypeEClass, PATTERN_DIFF_EATTRIBUTE_EATTRIBUTE_TYPE__FILTER);

		pattern_DiffEAnnotationEClass = createEClass(PATTERN_DIFF_EANNOTATION);
		createEAttribute(pattern_DiffEAnnotationEClass, PATTERN_DIFF_EANNOTATION__ID_PATTERN);
		createEAttribute(pattern_DiffEAnnotationEClass, PATTERN_DIFF_EANNOTATION__FILTER);

		pattern_DiffEAnnotation_detailsEClass = createEClass(PATTERN_DIFF_EANNOTATION_DETAILS);
		createEAttribute(pattern_DiffEAnnotation_detailsEClass, PATTERN_DIFF_EANNOTATION_DETAILS__ID_PATTERN);
		createEAttribute(pattern_DiffEAnnotation_detailsEClass, PATTERN_DIFF_EANNOTATION_DETAILS__FILTER);

		pattern_DiffEAnnotation_eModelElementEClass = createEClass(PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT);
		createEAttribute(pattern_DiffEAnnotation_eModelElementEClass, PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__ID_PATTERN);
		createEAttribute(pattern_DiffEAnnotation_eModelElementEClass, PATTERN_DIFF_EANNOTATION_EMODEL_ELEMENT__FILTER);

		pattern_DiffEAnnotation_contentsEClass = createEClass(PATTERN_DIFF_EANNOTATION_CONTENTS);
		createEAttribute(pattern_DiffEAnnotation_contentsEClass, PATTERN_DIFF_EANNOTATION_CONTENTS__ID_PATTERN);
		createEAttribute(pattern_DiffEAnnotation_contentsEClass, PATTERN_DIFF_EANNOTATION_CONTENTS__FILTER);

		pattern_DiffEAnnotation_referencesEClass = createEClass(PATTERN_DIFF_EANNOTATION_REFERENCES);
		createEAttribute(pattern_DiffEAnnotation_referencesEClass, PATTERN_DIFF_EANNOTATION_REFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEAnnotation_referencesEClass, PATTERN_DIFF_EANNOTATION_REFERENCES__FILTER);

		pattern_DiffEClassEClass = createEClass(PATTERN_DIFF_ECLASS);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__ID_PATTERN);
		createEAttribute(pattern_DiffEClassEClass, PATTERN_DIFF_ECLASS__FILTER);

		pattern_DiffEClass_eSuperTypesEClass = createEClass(PATTERN_DIFF_ECLASS_ESUPER_TYPES);
		createEAttribute(pattern_DiffEClass_eSuperTypesEClass, PATTERN_DIFF_ECLASS_ESUPER_TYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eSuperTypesEClass, PATTERN_DIFF_ECLASS_ESUPER_TYPES__FILTER);

		pattern_DiffEClass_eOperationsEClass = createEClass(PATTERN_DIFF_ECLASS_EOPERATIONS);
		createEAttribute(pattern_DiffEClass_eOperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eOperationsEClass, PATTERN_DIFF_ECLASS_EOPERATIONS__FILTER);

		pattern_DiffEClass_eAllAttributesEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES);
		createEAttribute(pattern_DiffEClass_eAllAttributesEClass, PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllAttributesEClass, PATTERN_DIFF_ECLASS_EALL_ATTRIBUTES__FILTER);

		pattern_DiffEClass_eAllReferencesEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_REFERENCES);
		createEAttribute(pattern_DiffEClass_eAllReferencesEClass, PATTERN_DIFF_ECLASS_EALL_REFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllReferencesEClass, PATTERN_DIFF_ECLASS_EALL_REFERENCES__FILTER);

		pattern_DiffEClass_eReferencesEClass = createEClass(PATTERN_DIFF_ECLASS_EREFERENCES);
		createEAttribute(pattern_DiffEClass_eReferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eReferencesEClass, PATTERN_DIFF_ECLASS_EREFERENCES__FILTER);

		pattern_DiffEClass_eAttributesEClass = createEClass(PATTERN_DIFF_ECLASS_EATTRIBUTES);
		createEAttribute(pattern_DiffEClass_eAttributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAttributesEClass, PATTERN_DIFF_ECLASS_EATTRIBUTES__FILTER);

		pattern_DiffEClass_eAllContainmentsEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS);
		createEAttribute(pattern_DiffEClass_eAllContainmentsEClass, PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllContainmentsEClass, PATTERN_DIFF_ECLASS_EALL_CONTAINMENTS__FILTER);

		pattern_DiffEClass_eAllOperationsEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_OPERATIONS);
		createEAttribute(pattern_DiffEClass_eAllOperationsEClass, PATTERN_DIFF_ECLASS_EALL_OPERATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllOperationsEClass, PATTERN_DIFF_ECLASS_EALL_OPERATIONS__FILTER);

		pattern_DiffEClass_eAllStructuralFeaturesEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES);
		createEAttribute(pattern_DiffEClass_eAllStructuralFeaturesEClass, PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllStructuralFeaturesEClass, PATTERN_DIFF_ECLASS_EALL_STRUCTURAL_FEATURES__FILTER);

		pattern_DiffEClass_eAllSuperTypesEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES);
		createEAttribute(pattern_DiffEClass_eAllSuperTypesEClass, PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllSuperTypesEClass, PATTERN_DIFF_ECLASS_EALL_SUPER_TYPES__FILTER);

		pattern_DiffEClass_eIDAttributeEClass = createEClass(PATTERN_DIFF_ECLASS_EID_ATTRIBUTE);
		createEAttribute(pattern_DiffEClass_eIDAttributeEClass, PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eIDAttributeEClass, PATTERN_DIFF_ECLASS_EID_ATTRIBUTE__FILTER);

		pattern_DiffEClass_eStructuralFeaturesEClass = createEClass(PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES);
		createEAttribute(pattern_DiffEClass_eStructuralFeaturesEClass, PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eStructuralFeaturesEClass, PATTERN_DIFF_ECLASS_ESTRUCTURAL_FEATURES__FILTER);

		pattern_DiffEClass_eGenericSuperTypesEClass = createEClass(PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES);
		createEAttribute(pattern_DiffEClass_eGenericSuperTypesEClass, PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eGenericSuperTypesEClass, PATTERN_DIFF_ECLASS_EGENERIC_SUPER_TYPES__FILTER);

		pattern_DiffEClass_eAllGenericSuperTypesEClass = createEClass(PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES);
		createEAttribute(pattern_DiffEClass_eAllGenericSuperTypesEClass, PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__ID_PATTERN);
		createEAttribute(pattern_DiffEClass_eAllGenericSuperTypesEClass, PATTERN_DIFF_ECLASS_EALL_GENERIC_SUPER_TYPES__FILTER);

		pattern_DiffEClassifier_ePackageEClass = createEClass(PATTERN_DIFF_ECLASSIFIER_EPACKAGE);
		createEAttribute(pattern_DiffEClassifier_ePackageEClass, PATTERN_DIFF_ECLASSIFIER_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEClassifier_ePackageEClass, PATTERN_DIFF_ECLASSIFIER_EPACKAGE__FILTER);

		pattern_DiffEClassifier_eTypeParametersEClass = createEClass(PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS);
		createEAttribute(pattern_DiffEClassifier_eTypeParametersEClass, PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__ID_PATTERN);
		createEAttribute(pattern_DiffEClassifier_eTypeParametersEClass, PATTERN_DIFF_ECLASSIFIER_ETYPE_PARAMETERS__FILTER);

		pattern_DiffEDataTypeEClass = createEClass(PATTERN_DIFF_EDATA_TYPE);
		createEAttribute(pattern_DiffEDataTypeEClass, PATTERN_DIFF_EDATA_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffEDataTypeEClass, PATTERN_DIFF_EDATA_TYPE__FILTER);

		pattern_DiffEEnumEClass = createEClass(PATTERN_DIFF_EENUM);
		createEAttribute(pattern_DiffEEnumEClass, PATTERN_DIFF_EENUM__ID_PATTERN);
		createEAttribute(pattern_DiffEEnumEClass, PATTERN_DIFF_EENUM__FILTER);

		pattern_DiffEEnum_eLiteralsEClass = createEClass(PATTERN_DIFF_EENUM_ELITERALS);
		createEAttribute(pattern_DiffEEnum_eLiteralsEClass, PATTERN_DIFF_EENUM_ELITERALS__ID_PATTERN);
		createEAttribute(pattern_DiffEEnum_eLiteralsEClass, PATTERN_DIFF_EENUM_ELITERALS__FILTER);

		pattern_DiffEEnumLiteralEClass = createEClass(PATTERN_DIFF_EENUM_LITERAL);
		createEAttribute(pattern_DiffEEnumLiteralEClass, PATTERN_DIFF_EENUM_LITERAL__ID_PATTERN);
		createEAttribute(pattern_DiffEEnumLiteralEClass, PATTERN_DIFF_EENUM_LITERAL__FILTER);

		pattern_DiffEEnumLiteral_eEnumEClass = createEClass(PATTERN_DIFF_EENUM_LITERAL_EENUM);
		createEAttribute(pattern_DiffEEnumLiteral_eEnumEClass, PATTERN_DIFF_EENUM_LITERAL_EENUM__ID_PATTERN);
		createEAttribute(pattern_DiffEEnumLiteral_eEnumEClass, PATTERN_DIFF_EENUM_LITERAL_EENUM__FILTER);

		pattern_DiffEFactoryEClass = createEClass(PATTERN_DIFF_EFACTORY);
		createEAttribute(pattern_DiffEFactoryEClass, PATTERN_DIFF_EFACTORY__ID_PATTERN);
		createEAttribute(pattern_DiffEFactoryEClass, PATTERN_DIFF_EFACTORY__FILTER);

		pattern_DiffEFactory_ePackageEClass = createEClass(PATTERN_DIFF_EFACTORY_EPACKAGE);
		createEAttribute(pattern_DiffEFactory_ePackageEClass, PATTERN_DIFF_EFACTORY_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEFactory_ePackageEClass, PATTERN_DIFF_EFACTORY_EPACKAGE__FILTER);

		pattern_DiffEModelElement_eAnnotationsEClass = createEClass(PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS);
		createEAttribute(pattern_DiffEModelElement_eAnnotationsEClass, PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEModelElement_eAnnotationsEClass, PATTERN_DIFF_EMODEL_ELEMENT_EANNOTATIONS__FILTER);

		pattern_DiffEObjectEClass = createEClass(PATTERN_DIFF_EOBJECT);
		createEAttribute(pattern_DiffEObjectEClass, PATTERN_DIFF_EOBJECT__ID_PATTERN);
		createEAttribute(pattern_DiffEObjectEClass, PATTERN_DIFF_EOBJECT__FILTER);

		pattern_DiffEOperationEClass = createEClass(PATTERN_DIFF_EOPERATION);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_DiffEOperationEClass, PATTERN_DIFF_EOPERATION__FILTER);

		pattern_DiffEOperation_eContainingClassEClass = createEClass(PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS);
		createEAttribute(pattern_DiffEOperation_eContainingClassEClass, PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__ID_PATTERN);
		createEAttribute(pattern_DiffEOperation_eContainingClassEClass, PATTERN_DIFF_EOPERATION_ECONTAINING_CLASS__FILTER);

		pattern_DiffEOperation_eTypeParametersEClass = createEClass(PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS);
		createEAttribute(pattern_DiffEOperation_eTypeParametersEClass, PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__ID_PATTERN);
		createEAttribute(pattern_DiffEOperation_eTypeParametersEClass, PATTERN_DIFF_EOPERATION_ETYPE_PARAMETERS__FILTER);

		pattern_DiffEOperation_eParametersEClass = createEClass(PATTERN_DIFF_EOPERATION_EPARAMETERS);
		createEAttribute(pattern_DiffEOperation_eParametersEClass, PATTERN_DIFF_EOPERATION_EPARAMETERS__ID_PATTERN);
		createEAttribute(pattern_DiffEOperation_eParametersEClass, PATTERN_DIFF_EOPERATION_EPARAMETERS__FILTER);

		pattern_DiffEOperation_eExceptionsEClass = createEClass(PATTERN_DIFF_EOPERATION_EEXCEPTIONS);
		createEAttribute(pattern_DiffEOperation_eExceptionsEClass, PATTERN_DIFF_EOPERATION_EEXCEPTIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEOperation_eExceptionsEClass, PATTERN_DIFF_EOPERATION_EEXCEPTIONS__FILTER);

		pattern_DiffEOperation_eGenericExceptionsEClass = createEClass(PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS);
		createEAttribute(pattern_DiffEOperation_eGenericExceptionsEClass, PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ID_PATTERN);
		createEAttribute(pattern_DiffEOperation_eGenericExceptionsEClass, PATTERN_DIFF_EOPERATION_EGENERIC_EXCEPTIONS__FILTER);

		pattern_DiffEPackageEClass = createEClass(PATTERN_DIFF_EPACKAGE);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEPackageEClass, PATTERN_DIFF_EPACKAGE__FILTER);

		pattern_DiffEPackage_eFactoryInstanceEClass = createEClass(PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE);
		createEAttribute(pattern_DiffEPackage_eFactoryInstanceEClass, PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eFactoryInstanceEClass, PATTERN_DIFF_EPACKAGE_EFACTORY_INSTANCE__FILTER);

		pattern_DiffEPackage_eClassifiersEClass = createEClass(PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		createEAttribute(pattern_DiffEPackage_eClassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eClassifiersEClass, PATTERN_DIFF_EPACKAGE_ECLASSIFIERS__FILTER);

		pattern_DiffEPackage_eSubpackagesEClass = createEClass(PATTERN_DIFF_EPACKAGE_ESUBPACKAGES);
		createEAttribute(pattern_DiffEPackage_eSubpackagesEClass, PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eSubpackagesEClass, PATTERN_DIFF_EPACKAGE_ESUBPACKAGES__FILTER);

		pattern_DiffEPackage_eSuperPackageEClass = createEClass(PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE);
		createEAttribute(pattern_DiffEPackage_eSuperPackageEClass, PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_eSuperPackageEClass, PATTERN_DIFF_EPACKAGE_ESUPER_PACKAGE__FILTER);

		pattern_DiffEPackage_domainspecificdiffsEClass = createEClass(PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS);
		createEAttribute(pattern_DiffEPackage_domainspecificdiffsEClass, PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__ID_PATTERN);
		createEAttribute(pattern_DiffEPackage_domainspecificdiffsEClass, PATTERN_DIFF_EPACKAGE_DOMAINSPECIFICDIFFS__FILTER);

		pattern_DiffEParameterEClass = createEClass(PATTERN_DIFF_EPARAMETER);
		createEAttribute(pattern_DiffEParameterEClass, PATTERN_DIFF_EPARAMETER__ID_PATTERN);
		createEAttribute(pattern_DiffEParameterEClass, PATTERN_DIFF_EPARAMETER__FILTER);

		pattern_DiffEParameter_eOperationEClass = createEClass(PATTERN_DIFF_EPARAMETER_EOPERATION);
		createEAttribute(pattern_DiffEParameter_eOperationEClass, PATTERN_DIFF_EPARAMETER_EOPERATION__ID_PATTERN);
		createEAttribute(pattern_DiffEParameter_eOperationEClass, PATTERN_DIFF_EPARAMETER_EOPERATION__FILTER);

		pattern_DiffEReferenceEClass = createEClass(PATTERN_DIFF_EREFERENCE);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__ID_PATTERN);
		createEAttribute(pattern_DiffEReferenceEClass, PATTERN_DIFF_EREFERENCE__FILTER);

		pattern_DiffEReference_eOppositeEClass = createEClass(PATTERN_DIFF_EREFERENCE_EOPPOSITE);
		createEAttribute(pattern_DiffEReference_eOppositeEClass, PATTERN_DIFF_EREFERENCE_EOPPOSITE__ID_PATTERN);
		createEAttribute(pattern_DiffEReference_eOppositeEClass, PATTERN_DIFF_EREFERENCE_EOPPOSITE__FILTER);

		pattern_DiffEReference_eReferenceTypeEClass = createEClass(PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE);
		createEAttribute(pattern_DiffEReference_eReferenceTypeEClass, PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffEReference_eReferenceTypeEClass, PATTERN_DIFF_EREFERENCE_EREFERENCE_TYPE__FILTER);

		pattern_DiffEReference_eKeysEClass = createEClass(PATTERN_DIFF_EREFERENCE_EKEYS);
		createEAttribute(pattern_DiffEReference_eKeysEClass, PATTERN_DIFF_EREFERENCE_EKEYS__ID_PATTERN);
		createEAttribute(pattern_DiffEReference_eKeysEClass, PATTERN_DIFF_EREFERENCE_EKEYS__FILTER);

		pattern_DiffEStructuralFeature_eContainingClassEClass = createEClass(PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS);
		createEAttribute(pattern_DiffEStructuralFeature_eContainingClassEClass, PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__ID_PATTERN);
		createEAttribute(pattern_DiffEStructuralFeature_eContainingClassEClass, PATTERN_DIFF_ESTRUCTURAL_FEATURE_ECONTAINING_CLASS__FILTER);

		pattern_DiffETypedElement_eTypeEClass = createEClass(PATTERN_DIFF_ETYPED_ELEMENT_ETYPE);
		createEAttribute(pattern_DiffETypedElement_eTypeEClass, PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__ID_PATTERN);
		createEAttribute(pattern_DiffETypedElement_eTypeEClass, PATTERN_DIFF_ETYPED_ELEMENT_ETYPE__FILTER);

		pattern_DiffETypedElement_eGenericTypeEClass = createEClass(PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE);
		createEAttribute(pattern_DiffETypedElement_eGenericTypeEClass, PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffETypedElement_eGenericTypeEClass, PATTERN_DIFF_ETYPED_ELEMENT_EGENERIC_TYPE__FILTER);

		pattern_DiffEStringToStringMapEntryEClass = createEClass(PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(pattern_DiffEStringToStringMapEntryEClass, PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__ID_PATTERN);
		createEAttribute(pattern_DiffEStringToStringMapEntryEClass, PATTERN_DIFF_ESTRING_TO_STRING_MAP_ENTRY__FILTER);

		pattern_DiffEGenericTypeEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE);
		createEAttribute(pattern_DiffEGenericTypeEClass, PATTERN_DIFF_EGENERIC_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericTypeEClass, PATTERN_DIFF_EGENERIC_TYPE__FILTER);

		pattern_DiffEGenericType_eUpperBoundEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND);
		createEAttribute(pattern_DiffEGenericType_eUpperBoundEClass, PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eUpperBoundEClass, PATTERN_DIFF_EGENERIC_TYPE_EUPPER_BOUND__FILTER);

		pattern_DiffEGenericType_eTypeArgumentsEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS);
		createEAttribute(pattern_DiffEGenericType_eTypeArgumentsEClass, PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eTypeArgumentsEClass, PATTERN_DIFF_EGENERIC_TYPE_ETYPE_ARGUMENTS__FILTER);

		pattern_DiffEGenericType_eRawTypeEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE);
		createEAttribute(pattern_DiffEGenericType_eRawTypeEClass, PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eRawTypeEClass, PATTERN_DIFF_EGENERIC_TYPE_ERAW_TYPE__FILTER);

		pattern_DiffEGenericType_eLowerBoundEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND);
		createEAttribute(pattern_DiffEGenericType_eLowerBoundEClass, PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eLowerBoundEClass, PATTERN_DIFF_EGENERIC_TYPE_ELOWER_BOUND__FILTER);

		pattern_DiffEGenericType_eTypeParameterEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER);
		createEAttribute(pattern_DiffEGenericType_eTypeParameterEClass, PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eTypeParameterEClass, PATTERN_DIFF_EGENERIC_TYPE_ETYPE_PARAMETER__FILTER);

		pattern_DiffEGenericType_eClassifierEClass = createEClass(PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER);
		createEAttribute(pattern_DiffEGenericType_eClassifierEClass, PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__ID_PATTERN);
		createEAttribute(pattern_DiffEGenericType_eClassifierEClass, PATTERN_DIFF_EGENERIC_TYPE_ECLASSIFIER__FILTER);

		pattern_DiffETypeParameterEClass = createEClass(PATTERN_DIFF_ETYPE_PARAMETER);
		createEAttribute(pattern_DiffETypeParameterEClass, PATTERN_DIFF_ETYPE_PARAMETER__ID_PATTERN);
		createEAttribute(pattern_DiffETypeParameterEClass, PATTERN_DIFF_ETYPE_PARAMETER__FILTER);

		pattern_DiffETypeParameter_eBoundsEClass = createEClass(PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS);
		createEAttribute(pattern_DiffETypeParameter_eBoundsEClass, PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__ID_PATTERN);
		createEAttribute(pattern_DiffETypeParameter_eBoundsEClass, PATTERN_DIFF_ETYPE_PARAMETER_EBOUNDS__FILTER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__PATTERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcoreDiffMMPackage theEcoreDiffMMPackage = (EcoreDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_EAttributeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEAttribute());
		pattern_EAnnotationEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEAnnotation());
		pattern_EClassEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEClass());
		pattern_EClassifierEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEClassifier());
		pattern_EDataTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEDataType());
		pattern_EEnumEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEEnum());
		pattern_EEnumLiteralEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEEnumLiteral());
		pattern_EFactoryEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEFactory());
		pattern_EModelElementEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEModelElement());
		pattern_ENamedElementEClass.getESuperTypes().add(theEcoreDiffMMPackage.getENamedElement());
		pattern_EObjectEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEObject());
		pattern_EOperationEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEOperation());
		pattern_EPackageEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEPackage());
		pattern_EParameterEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEParameter());
		pattern_EReferenceEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEReference());
		pattern_EStructuralFeatureEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEStructuralFeature());
		pattern_ETypedElementEClass.getESuperTypes().add(theEcoreDiffMMPackage.getETypedElement());
		pattern_EStringToStringMapEntryEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEStringToStringMapEntry());
		pattern_EGenericTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getEGenericType());
		pattern_ETypeParameterEClass.getESuperTypes().add(theEcoreDiffMMPackage.getETypeParameter());
		pattern_DomainSpecificDiffEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDomainSpecificDiff());
		pattern_DiffEAttributeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAttribute());
		pattern_DiffEAttribute_eAttributeTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAttribute_eAttributeType());
		pattern_DiffEAnnotationEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAnnotation());
		pattern_DiffEAnnotation_detailsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAnnotation_details());
		pattern_DiffEAnnotation_eModelElementEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAnnotation_eModelElement());
		pattern_DiffEAnnotation_contentsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAnnotation_contents());
		pattern_DiffEAnnotation_referencesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEAnnotation_references());
		pattern_DiffEClassEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass());
		pattern_DiffEClass_eSuperTypesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eSuperTypes());
		pattern_DiffEClass_eOperationsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eOperations());
		pattern_DiffEClass_eAllAttributesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllAttributes());
		pattern_DiffEClass_eAllReferencesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllReferences());
		pattern_DiffEClass_eReferencesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eReferences());
		pattern_DiffEClass_eAttributesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAttributes());
		pattern_DiffEClass_eAllContainmentsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllContainments());
		pattern_DiffEClass_eAllOperationsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllOperations());
		pattern_DiffEClass_eAllStructuralFeaturesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllStructuralFeatures());
		pattern_DiffEClass_eAllSuperTypesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllSuperTypes());
		pattern_DiffEClass_eIDAttributeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eIDAttribute());
		pattern_DiffEClass_eStructuralFeaturesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eStructuralFeatures());
		pattern_DiffEClass_eGenericSuperTypesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eGenericSuperTypes());
		pattern_DiffEClass_eAllGenericSuperTypesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClass_eAllGenericSuperTypes());
		pattern_DiffEClassifier_ePackageEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClassifier_ePackage());
		pattern_DiffEClassifier_eTypeParametersEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEClassifier_eTypeParameters());
		pattern_DiffEDataTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEDataType());
		pattern_DiffEEnumEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEEnum());
		pattern_DiffEEnum_eLiteralsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEEnum_eLiterals());
		pattern_DiffEEnumLiteralEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEEnumLiteral());
		pattern_DiffEEnumLiteral_eEnumEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEEnumLiteral_eEnum());
		pattern_DiffEFactoryEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEFactory());
		pattern_DiffEFactory_ePackageEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEFactory_ePackage());
		pattern_DiffEModelElement_eAnnotationsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEModelElement_eAnnotations());
		pattern_DiffEObjectEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEObject());
		pattern_DiffEOperationEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation());
		pattern_DiffEOperation_eContainingClassEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation_eContainingClass());
		pattern_DiffEOperation_eTypeParametersEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation_eTypeParameters());
		pattern_DiffEOperation_eParametersEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation_eParameters());
		pattern_DiffEOperation_eExceptionsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation_eExceptions());
		pattern_DiffEOperation_eGenericExceptionsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEOperation_eGenericExceptions());
		pattern_DiffEPackageEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage());
		pattern_DiffEPackage_eFactoryInstanceEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage_eFactoryInstance());
		pattern_DiffEPackage_eClassifiersEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage_eClassifiers());
		pattern_DiffEPackage_eSubpackagesEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage_eSubpackages());
		pattern_DiffEPackage_eSuperPackageEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage_eSuperPackage());
		pattern_DiffEPackage_domainspecificdiffsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEPackage_domainspecificdiffs());
		pattern_DiffEParameterEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEParameter());
		pattern_DiffEParameter_eOperationEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEParameter_eOperation());
		pattern_DiffEReferenceEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEReference());
		pattern_DiffEReference_eOppositeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEReference_eOpposite());
		pattern_DiffEReference_eReferenceTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEReference_eReferenceType());
		pattern_DiffEReference_eKeysEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEReference_eKeys());
		pattern_DiffEStructuralFeature_eContainingClassEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEStructuralFeature_eContainingClass());
		pattern_DiffETypedElement_eTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffETypedElement_eType());
		pattern_DiffETypedElement_eGenericTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffETypedElement_eGenericType());
		pattern_DiffEStringToStringMapEntryEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEStringToStringMapEntry());
		pattern_DiffEGenericTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType());
		pattern_DiffEGenericType_eUpperBoundEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eUpperBound());
		pattern_DiffEGenericType_eTypeArgumentsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eTypeArguments());
		pattern_DiffEGenericType_eRawTypeEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eRawType());
		pattern_DiffEGenericType_eLowerBoundEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eLowerBound());
		pattern_DiffEGenericType_eTypeParameterEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eTypeParameter());
		pattern_DiffEGenericType_eClassifierEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffEGenericType_eClassifier());
		pattern_DiffETypeParameterEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffETypeParameter());
		pattern_DiffETypeParameter_eBoundsEClass.getESuperTypes().add(theEcoreDiffMMPackage.getDiffETypeParameter_eBounds());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_EAttributeEClass, Pattern_EAttribute.class, "Pattern_EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EAnnotationEClass, Pattern_EAnnotation.class, "Pattern_EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EAnnotation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EAnnotation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EClassEClass, Pattern_EClass.class, "Pattern_EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EClassifierEClass, Pattern_EClassifier.class, "Pattern_EClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EClassifier_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EClassifier_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EDataTypeEClass, Pattern_EDataType.class, "Pattern_EDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EDataType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EDataType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EEnumEClass, Pattern_EEnum.class, "Pattern_EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EEnum_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EEnum_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EEnumLiteralEClass, Pattern_EEnumLiteral.class, "Pattern_EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EEnumLiteral_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EEnumLiteral_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EFactoryEClass, Pattern_EFactory.class, "Pattern_EFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EFactory_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EFactory_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EModelElementEClass, Pattern_EModelElement.class, "Pattern_EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EModelElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EModelElement_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ENamedElementEClass, Pattern_ENamedElement.class, "Pattern_ENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ENamedElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ENamedElement_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_ENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EObjectEClass, Pattern_EObject.class, "Pattern_EObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EObject_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EOperationEClass, Pattern_EOperation.class, "Pattern_EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EPackageEClass, Pattern_EPackage.class, "Pattern_EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EParameterEClass, Pattern_EParameter.class, "Pattern_EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EParameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EParameter_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EReferenceEClass, Pattern_EReference.class, "Pattern_EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EStructuralFeatureEClass, Pattern_EStructuralFeature.class, "Pattern_EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EStructuralFeature_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EStructuralFeature_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ETypedElementEClass, Pattern_ETypedElement.class, "Pattern_ETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ETypedElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ETypedElement_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EStringToStringMapEntryEClass, Map.Entry.class, "Pattern_EStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EStringToStringMapEntry_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EStringToStringMapEntry_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EGenericTypeEClass, Pattern_EGenericType.class, "Pattern_EGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_EGenericType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_EGenericType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ETypeParameterEClass, Pattern_ETypeParameter.class, "Pattern_ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ETypeParameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_ETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ETypeParameter_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_ETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DomainSpecificDiffEClass, Pattern_DomainSpecificDiff.class, "Pattern_DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DomainSpecificDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DomainSpecificDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAttributeEClass, Pattern_DiffEAttribute.class, "Pattern_DiffEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAttribute_eAttributeTypeEClass, Pattern_DiffEAttribute_eAttributeType.class, "Pattern_DiffEAttribute_eAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAttribute_eAttributeType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAttribute_eAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAttribute_eAttributeType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAttribute_eAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAnnotationEClass, Pattern_DiffEAnnotation.class, "Pattern_DiffEAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAnnotation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAnnotation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAnnotation_detailsEClass, Pattern_DiffEAnnotation_details.class, "Pattern_DiffEAnnotation_details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAnnotation_details_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAnnotation_details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAnnotation_details_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAnnotation_details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAnnotation_eModelElementEClass, Pattern_DiffEAnnotation_eModelElement.class, "Pattern_DiffEAnnotation_eModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAnnotation_eModelElement_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAnnotation_eModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAnnotation_eModelElement_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAnnotation_eModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAnnotation_contentsEClass, Pattern_DiffEAnnotation_contents.class, "Pattern_DiffEAnnotation_contents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAnnotation_contents_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAnnotation_contents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAnnotation_contents_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAnnotation_contents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEAnnotation_referencesEClass, Pattern_DiffEAnnotation_references.class, "Pattern_DiffEAnnotation_references", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEAnnotation_references_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEAnnotation_references.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEAnnotation_references_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEAnnotation_references.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassEClass, Pattern_DiffEClass.class, "Pattern_DiffEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eSuperTypesEClass, Pattern_DiffEClass_eSuperTypes.class, "Pattern_DiffEClass_eSuperTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eSuperTypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eSuperTypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eOperationsEClass, Pattern_DiffEClass_eOperations.class, "Pattern_DiffEClass_eOperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eOperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eOperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllAttributesEClass, Pattern_DiffEClass_eAllAttributes.class, "Pattern_DiffEClass_eAllAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllAttributes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllAttributes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllReferencesEClass, Pattern_DiffEClass_eAllReferences.class, "Pattern_DiffEClass_eAllReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllReferences_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllReferences_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eReferencesEClass, Pattern_DiffEClass_eReferences.class, "Pattern_DiffEClass_eReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eReferences_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eReferences_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAttributesEClass, Pattern_DiffEClass_eAttributes.class, "Pattern_DiffEClass_eAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAttributes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAttributes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllContainmentsEClass, Pattern_DiffEClass_eAllContainments.class, "Pattern_DiffEClass_eAllContainments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllContainments_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllContainments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllContainments_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllContainments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllOperationsEClass, Pattern_DiffEClass_eAllOperations.class, "Pattern_DiffEClass_eAllOperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllOperations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllOperations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllStructuralFeaturesEClass, Pattern_DiffEClass_eAllStructuralFeatures.class, "Pattern_DiffEClass_eAllStructuralFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllStructuralFeatures_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllStructuralFeatures_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllSuperTypesEClass, Pattern_DiffEClass_eAllSuperTypes.class, "Pattern_DiffEClass_eAllSuperTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllSuperTypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllSuperTypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eIDAttributeEClass, Pattern_DiffEClass_eIDAttribute.class, "Pattern_DiffEClass_eIDAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eIDAttribute_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eIDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eIDAttribute_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eIDAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eStructuralFeaturesEClass, Pattern_DiffEClass_eStructuralFeatures.class, "Pattern_DiffEClass_eStructuralFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eStructuralFeatures_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eStructuralFeatures_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eStructuralFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eGenericSuperTypesEClass, Pattern_DiffEClass_eGenericSuperTypes.class, "Pattern_DiffEClass_eGenericSuperTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eGenericSuperTypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eGenericSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eGenericSuperTypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eGenericSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClass_eAllGenericSuperTypesEClass, Pattern_DiffEClass_eAllGenericSuperTypes.class, "Pattern_DiffEClass_eAllGenericSuperTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClass_eAllGenericSuperTypes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClass_eAllGenericSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClass_eAllGenericSuperTypes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClass_eAllGenericSuperTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassifier_ePackageEClass, Pattern_DiffEClassifier_ePackage.class, "Pattern_DiffEClassifier_ePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClassifier_ePackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClassifier_ePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClassifier_ePackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClassifier_ePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEClassifier_eTypeParametersEClass, Pattern_DiffEClassifier_eTypeParameters.class, "Pattern_DiffEClassifier_eTypeParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEClassifier_eTypeParameters_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEClassifier_eTypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEClassifier_eTypeParameters_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEClassifier_eTypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEDataTypeEClass, Pattern_DiffEDataType.class, "Pattern_DiffEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEDataType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEDataType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEEnumEClass, Pattern_DiffEEnum.class, "Pattern_DiffEEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEEnum_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEEnum_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEEnum_eLiteralsEClass, Pattern_DiffEEnum_eLiterals.class, "Pattern_DiffEEnum_eLiterals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEEnum_eLiterals_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEEnum_eLiterals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEEnum_eLiterals_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEEnum_eLiterals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEEnumLiteralEClass, Pattern_DiffEEnumLiteral.class, "Pattern_DiffEEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEEnumLiteral_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEEnumLiteral_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEEnumLiteral_eEnumEClass, Pattern_DiffEEnumLiteral_eEnum.class, "Pattern_DiffEEnumLiteral_eEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEEnumLiteral_eEnum_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEEnumLiteral_eEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEEnumLiteral_eEnum_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEEnumLiteral_eEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEFactoryEClass, Pattern_DiffEFactory.class, "Pattern_DiffEFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEFactory_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEFactory_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEFactory_ePackageEClass, Pattern_DiffEFactory_ePackage.class, "Pattern_DiffEFactory_ePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEFactory_ePackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEFactory_ePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEFactory_ePackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEFactory_ePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEModelElement_eAnnotationsEClass, Pattern_DiffEModelElement_eAnnotations.class, "Pattern_DiffEModelElement_eAnnotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEModelElement_eAnnotations_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEModelElement_eAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEModelElement_eAnnotations_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEModelElement_eAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEObjectEClass, Pattern_DiffEObject.class, "Pattern_DiffEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEObject_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperationEClass, Pattern_DiffEOperation.class, "Pattern_DiffEOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperation_eContainingClassEClass, Pattern_DiffEOperation_eContainingClass.class, "Pattern_DiffEOperation_eContainingClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_eContainingClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation_eContainingClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_eContainingClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation_eContainingClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperation_eTypeParametersEClass, Pattern_DiffEOperation_eTypeParameters.class, "Pattern_DiffEOperation_eTypeParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_eTypeParameters_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation_eTypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_eTypeParameters_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation_eTypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperation_eParametersEClass, Pattern_DiffEOperation_eParameters.class, "Pattern_DiffEOperation_eParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_eParameters_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation_eParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_eParameters_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation_eParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperation_eExceptionsEClass, Pattern_DiffEOperation_eExceptions.class, "Pattern_DiffEOperation_eExceptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_eExceptions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation_eExceptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_eExceptions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation_eExceptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEOperation_eGenericExceptionsEClass, Pattern_DiffEOperation_eGenericExceptions.class, "Pattern_DiffEOperation_eGenericExceptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEOperation_eGenericExceptions_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEOperation_eGenericExceptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEOperation_eGenericExceptions_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEOperation_eGenericExceptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackageEClass, Pattern_DiffEPackage.class, "Pattern_DiffEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eFactoryInstanceEClass, Pattern_DiffEPackage_eFactoryInstance.class, "Pattern_DiffEPackage_eFactoryInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eFactoryInstance_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eFactoryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eFactoryInstance_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eFactoryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eClassifiersEClass, Pattern_DiffEPackage_eClassifiers.class, "Pattern_DiffEPackage_eClassifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eClassifiers_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eClassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eClassifiers_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eClassifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eSubpackagesEClass, Pattern_DiffEPackage_eSubpackages.class, "Pattern_DiffEPackage_eSubpackages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eSubpackages_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eSubpackages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eSubpackages_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eSubpackages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_eSuperPackageEClass, Pattern_DiffEPackage_eSuperPackage.class, "Pattern_DiffEPackage_eSuperPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_eSuperPackage_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_eSuperPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_eSuperPackage_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_eSuperPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEPackage_domainspecificdiffsEClass, Pattern_DiffEPackage_domainspecificdiffs.class, "Pattern_DiffEPackage_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEPackage_domainspecificdiffs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEPackage_domainspecificdiffs_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEPackage_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEParameterEClass, Pattern_DiffEParameter.class, "Pattern_DiffEParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEParameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEParameter_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEParameter_eOperationEClass, Pattern_DiffEParameter_eOperation.class, "Pattern_DiffEParameter_eOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEParameter_eOperation_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEParameter_eOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEParameter_eOperation_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEParameter_eOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReferenceEClass, Pattern_DiffEReference.class, "Pattern_DiffEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReference_eOppositeEClass, Pattern_DiffEReference_eOpposite.class, "Pattern_DiffEReference_eOpposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_eOpposite_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference_eOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_eOpposite_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference_eOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReference_eReferenceTypeEClass, Pattern_DiffEReference_eReferenceType.class, "Pattern_DiffEReference_eReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_eReferenceType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference_eReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_eReferenceType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference_eReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEReference_eKeysEClass, Pattern_DiffEReference_eKeys.class, "Pattern_DiffEReference_eKeys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEReference_eKeys_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEReference_eKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEReference_eKeys_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEReference_eKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEStructuralFeature_eContainingClassEClass, Pattern_DiffEStructuralFeature_eContainingClass.class, "Pattern_DiffEStructuralFeature_eContainingClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEStructuralFeature_eContainingClass_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEStructuralFeature_eContainingClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEStructuralFeature_eContainingClass_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEStructuralFeature_eContainingClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffETypedElement_eTypeEClass, Pattern_DiffETypedElement_eType.class, "Pattern_DiffETypedElement_eType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffETypedElement_eType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffETypedElement_eType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffETypedElement_eType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffETypedElement_eType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffETypedElement_eGenericTypeEClass, Pattern_DiffETypedElement_eGenericType.class, "Pattern_DiffETypedElement_eGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffETypedElement_eGenericType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffETypedElement_eGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffETypedElement_eGenericType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffETypedElement_eGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEStringToStringMapEntryEClass, Map.Entry.class, "Pattern_DiffEStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEStringToStringMapEntry_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEStringToStringMapEntry_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericTypeEClass, Pattern_DiffEGenericType.class, "Pattern_DiffEGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eUpperBoundEClass, Pattern_DiffEGenericType_eUpperBound.class, "Pattern_DiffEGenericType_eUpperBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eUpperBound_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eUpperBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eUpperBound_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eUpperBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eTypeArgumentsEClass, Pattern_DiffEGenericType_eTypeArguments.class, "Pattern_DiffEGenericType_eTypeArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eTypeArguments_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eTypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eTypeArguments_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eTypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eRawTypeEClass, Pattern_DiffEGenericType_eRawType.class, "Pattern_DiffEGenericType_eRawType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eRawType_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eRawType_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eLowerBoundEClass, Pattern_DiffEGenericType_eLowerBound.class, "Pattern_DiffEGenericType_eLowerBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eLowerBound_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eLowerBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eLowerBound_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eLowerBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eTypeParameterEClass, Pattern_DiffEGenericType_eTypeParameter.class, "Pattern_DiffEGenericType_eTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eTypeParameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eTypeParameter_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEGenericType_eClassifierEClass, Pattern_DiffEGenericType_eClassifier.class, "Pattern_DiffEGenericType_eClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEGenericType_eClassifier_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEGenericType_eClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEGenericType_eClassifier_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEGenericType_eClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffETypeParameterEClass, Pattern_DiffETypeParameter.class, "Pattern_DiffETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffETypeParameter_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffETypeParameter_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffETypeParameter_eBoundsEClass, Pattern_DiffETypeParameter_eBounds.class, "Pattern_DiffETypeParameter_eBounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffETypeParameter_eBounds_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffETypeParameter_eBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffETypeParameter_eBounds_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffETypeParameter_eBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pattern(), this.getPattern_EPackage(), null, "pattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreRuleMMPackageImpl
