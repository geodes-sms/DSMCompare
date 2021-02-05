/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.EcoreDiffMMFactory;
import ecoreDiffMM.EcoreDiffMMPackage;

import ecoreDiffMM.util.EcoreDiffMMValidator;

import ecoreRuleMM.EcoreRuleMMPackage;
import ecoreRuleMM.impl.EcoreRuleMMPackageImpl;
import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreDiffMMPackageImpl extends EPackageImpl implements EcoreDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ecoreDiffMM.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAttribute_eAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAnnotation_detailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAnnotation_eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAnnotation_contentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEAnnotation_referencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllContainmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllStructuralFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eIDAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eStructuralFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eGenericSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass_eAllGenericSuperTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClassifier_ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClassifier_eTypeParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEEnum_eLiteralsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEEnumLiteral_eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEFactory_ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEModelElement_eAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperation_eContainingClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperation_eTypeParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperation_eParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperation_eExceptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEOperation_eGenericExceptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_eFactoryInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_eClassifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_eSubpackagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_eSuperPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEPackage_domainspecificdiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEParameter_eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEReference_eOppositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEReference_eReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEReference_eKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEStructuralFeature_eContainingClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffETypedElement_eTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffETypedElement_eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eUpperBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eTypeArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eRawTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eLowerBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEGenericType_eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffETypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffETypeParameter_eBoundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharacterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDiagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEnumeratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTreeIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInvocationTargetExceptionEDataType = null;

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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreDiffMMPackageImpl() {
		super(eNS_URI, EcoreDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcoreDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EcoreDiffMMPackage init() {
		if (isInited) return (EcoreDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEcoreDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcoreDiffMMPackageImpl theEcoreDiffMMPackage = registeredEcoreDiffMMPackage instanceof EcoreDiffMMPackageImpl ? (EcoreDiffMMPackageImpl)registeredEcoreDiffMMPackage : new EcoreDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcoreRuleMMPackage.eNS_URI);
		EcoreRuleMMPackageImpl theEcoreRuleMMPackage = (EcoreRuleMMPackageImpl)(registeredPackage instanceof EcoreRuleMMPackageImpl ? registeredPackage : EcoreRuleMMPackage.eINSTANCE);

		// Load packages
		theEcoreDiffMMPackage.loadPackage();

		// Create package meta-data objects
		theEcoreRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreRuleMMPackage.initializePackageContents();

		// Fix loaded packages
		theEcoreDiffMMPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEcoreDiffMMPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EcoreDiffMMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEcoreDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreDiffMMPackage.eNS_URI, theEcoreDiffMMPackage);
		return theEcoreDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAttribute() {
		if (eAttributeEClass == null) {
			eAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(0);
		}
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEAttribute_ID() {
        return (EAttribute)getEAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAttribute_EAttributeType() {
        return (EReference)getEAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAttribute_DiffeAttributeType() {
        return (EReference)getEAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAnnotation() {
		if (eAnnotationEClass == null) {
			eAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(1);
		}
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEAnnotation_Source() {
        return (EAttribute)getEAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_Details() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_EModelElement() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_Contents() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_References() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_Diffdetails() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_DiffeModelElement() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_Diffcontents() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAnnotation_Diffreferences() {
        return (EReference)getEAnnotation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		if (eClassEClass == null) {
			eClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(2);
		}
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClass_Abstract() {
        return (EAttribute)getEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClass_Interface() {
        return (EAttribute)getEClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_ESuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllContainments() {
        return (EReference)getEClass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EIDAttribute() {
        return (EReference)getEClass().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_EAllGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeReferences() {
        return (EReference)getEClass().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAttributes() {
        return (EReference)getEClass().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllContainments() {
        return (EReference)getEClass().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllOperations() {
        return (EReference)getEClass().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeIDAttribute() {
        return (EReference)getEClass().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeStructuralFeatures() {
        return (EReference)getEClass().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_DiffeAllGenericSuperTypes() {
        return (EReference)getEClass().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__IsSuperTypeOf__EClass() {
        return getEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetFeatureCount() {
        return getEClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetEStructuralFeature__int() {
        return getEClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetFeatureID__EStructuralFeature() {
        return getEClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetEStructuralFeature__String() {
        return getEClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetOperationCount() {
        return getEClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetEOperation__int() {
        return getEClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetOperationID__EOperation() {
        return getEClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetOverride__EOperation() {
        return getEClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClass__GetFeatureType__EStructuralFeature() {
        return getEClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClassifier() {
		if (eClassifierEClass == null) {
			eClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(3);
		}
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassifier_InstanceClassName() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassifier_InstanceClass() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassifier_DefaultValue() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClassifier_InstanceTypeName() {
        return (EAttribute)getEClassifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClassifier_EPackage() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClassifier_ETypeParameters() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClassifier_DiffePackage() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClassifier_DiffeTypeParameters() {
        return (EReference)getEClassifier().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClassifier__IsInstance__Object() {
        return getEClassifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEClassifier__GetClassifierID() {
        return getEClassifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDataType() {
		if (eDataTypeEClass == null) {
			eDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(4);
		}
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDataType_Serializable() {
        return (EAttribute)getEDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEnum() {
		if (eEnumEClass == null) {
			eEnumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(5);
		}
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnum_ELiterals() {
        return (EReference)getEEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnum_DiffeLiterals() {
        return (EReference)getEEnum().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEEnum__GetEEnumLiteral__String() {
        return getEEnum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEEnum__GetEEnumLiteral__int() {
        return getEEnum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEEnum__GetEEnumLiteralByLiteral__String() {
        return getEEnum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEnumLiteral() {
		if (eEnumLiteralEClass == null) {
			eEnumLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(6);
		}
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEnumLiteral_Value() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEnumLiteral_Instance() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEnumLiteral_Literal() {
        return (EAttribute)getEEnumLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnumLiteral_EEnum() {
        return (EReference)getEEnumLiteral().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnumLiteral_DiffeEnum() {
        return (EReference)getEEnumLiteral().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEFactory() {
		if (eFactoryEClass == null) {
			eFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(7);
		}
		return eFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEFactory_EPackage() {
        return (EReference)getEFactory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEFactory_DiffePackage() {
        return (EReference)getEFactory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEFactory__Create__EClass() {
        return getEFactory().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEFactory__CreateFromString__EDataType_String() {
        return getEFactory().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEFactory__ConvertToString__EDataType_Object() {
        return getEFactory().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEModelElement() {
		if (eModelElementEClass == null) {
			eModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(8);
		}
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEModelElement_EAnnotations() {
        return (EReference)getEModelElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEModelElement_DiffeAnnotations() {
        return (EReference)getEModelElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEModelElement__GetEAnnotation__String() {
        return getEModelElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getENamedElement() {
		if (eNamedElementEClass == null) {
			eNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(9);
		}
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENamedElement_Name() {
        return (EAttribute)getENamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEObject() {
		if (eObjectEClass == null) {
			eObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(10);
		}
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EClass() {
        return getEObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EIsProxy() {
        return getEObject().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EResource() {
        return getEObject().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EContainer() {
        return getEObject().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EContainingFeature() {
        return getEObject().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EContainmentFeature() {
        return getEObject().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EContents() {
        return getEObject().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EAllContents() {
        return getEObject().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__ECrossReferences() {
        return getEObject().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EGet__EStructuralFeature() {
        return getEObject().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EGet__EStructuralFeature_boolean() {
        return getEObject().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__ESet__EStructuralFeature_Object() {
        return getEObject().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EIsSet__EStructuralFeature() {
        return getEObject().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EUnset__EStructuralFeature() {
        return getEObject().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObject__EInvoke__EOperation_EList() {
        return getEObject().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEOperation() {
		if (eOperationEClass == null) {
			eOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(11);
		}
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_EContainingClass() {
        return (EReference)getEOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_ETypeParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_EParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_EExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_EGenericExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_DiffeContainingClass() {
        return (EReference)getEOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_DiffeTypeParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_DiffeParameters() {
        return (EReference)getEOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_DiffeExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOperation_DiffeGenericExceptions() {
        return (EReference)getEOperation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEOperation__GetOperationID() {
        return getEOperation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEOperation__IsOverrideOf__EOperation() {
        return getEOperation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEPackage() {
		if (ePackageEClass == null) {
			ePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(12);
		}
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEPackage_NsURI() {
        return (EAttribute)getEPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEPackage_NsPrefix() {
        return (EAttribute)getEPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_EFactoryInstance() {
        return (EReference)getEPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_EClassifiers() {
        return (EReference)getEPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_ESubpackages() {
        return (EReference)getEPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_ESuperPackage() {
        return (EReference)getEPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Domainspecificdiffs() {
        return (EReference)getEPackage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_DiffeFactoryInstance() {
        return (EReference)getEPackage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_DiffeClassifiers() {
        return (EReference)getEPackage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_DiffeSubpackages() {
        return (EReference)getEPackage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_DiffeSuperPackage() {
        return (EReference)getEPackage().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEPackage_Diffdomainspecificdiffs() {
        return (EReference)getEPackage().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackage__GetEClassifier__String() {
        return getEPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEParameter() {
		if (eParameterEClass == null) {
			eParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(13);
		}
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEParameter_EOperation() {
        return (EReference)getEParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEParameter_DiffeOperation() {
        return (EReference)getEParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEReference() {
		if (eReferenceEClass == null) {
			eReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(14);
		}
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEReference_Containment() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEReference_Container() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEReference_ResolveProxies() {
        return (EAttribute)getEReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_EOpposite() {
        return (EReference)getEReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_EReferenceType() {
        return (EReference)getEReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_EKeys() {
        return (EReference)getEReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_DiffeOpposite() {
        return (EReference)getEReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_DiffeReferenceType() {
        return (EReference)getEReference().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEReference_DiffeKeys() {
        return (EReference)getEReference().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEStructuralFeature() {
		if (eStructuralFeatureEClass == null) {
			eStructuralFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(15);
		}
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_Changeable() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_Volatile() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_Transient() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_DefaultValueLiteral() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_DefaultValue() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_Unsettable() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStructuralFeature_Derived() {
        return (EAttribute)getEStructuralFeature().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEStructuralFeature_EContainingClass() {
        return (EReference)getEStructuralFeature().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEStructuralFeature_DiffeContainingClass() {
        return (EReference)getEStructuralFeature().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEStructuralFeature__GetFeatureID() {
        return getEStructuralFeature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEStructuralFeature__GetContainerClass() {
        return getEStructuralFeature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETypedElement() {
		if (eTypedElementEClass == null) {
			eTypedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(16);
		}
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_Ordered() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_Unique() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_LowerBound() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_UpperBound() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_Many() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETypedElement_Required() {
        return (EAttribute)getETypedElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypedElement_EType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypedElement_EGenericType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypedElement_DiffeType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypedElement_DiffeGenericType() {
        return (EReference)getETypedElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEStringToStringMapEntry() {
		if (eStringToStringMapEntryEClass == null) {
			eStringToStringMapEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(48);
		}
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStringToStringMapEntry_Key() {
        return (EAttribute)getEStringToStringMapEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEStringToStringMapEntry_Value() {
        return (EAttribute)getEStringToStringMapEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEGenericType() {
		if (eGenericTypeEClass == null) {
			eGenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(50);
		}
		return eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_EUpperBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_ETypeArguments() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_ERawType() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_ELowerBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_ETypeParameter() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_EClassifier() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeUpperBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeTypeArguments() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeRawType() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeLowerBound() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeTypeParameter() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGenericType_DiffeClassifier() {
        return (EReference)getEGenericType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEGenericType__IsInstance__Object() {
        return getEGenericType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETypeParameter() {
		if (eTypeParameterEClass == null) {
			eTypeParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(51);
		}
		return eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypeParameter_EBounds() {
        return (EReference)getETypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETypeParameter_DiffeBounds() {
        return (EReference)getETypeParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainSpecificDiff() {
		if (domainSpecificDiffEClass == null) {
			domainSpecificDiffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(55);
		}
		return domainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecificDiff_Name() {
        return (EAttribute)getDomainSpecificDiff().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EAttribute() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EAnnotation() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EClass() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EClassifier() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EDataType() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EEnum() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EEnumLiteral() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EFactory() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EModelElement() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ENamedElement() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EObject() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EOperation() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EParameter() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EReference() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EStructuralFeature() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ETypedElement() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_EGenericType() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecificDiff_DomainSpecificDiff_ETypeParameter() {
        return (EReference)getDomainSpecificDiff().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAttribute() {
		if (diffEAttributeEClass == null) {
			diffEAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(56);
		}
		return diffEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_Operation() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_name() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_ordered() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_unique() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_lowerBound() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_upperBound() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_many() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_required() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_changeable() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_volatile() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_transient() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_defaultValueLiteral() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_defaultValue() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_unsettable() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_derived() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_New_iD() {
        return (EAttribute)getDiffEAttribute().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAttribute_eAttributeType() {
		if (diffEAttribute_eAttributeTypeEClass == null) {
			diffEAttribute_eAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(57);
		}
		return diffEAttribute_eAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAttribute_eAttributeType_Operation() {
        return (EAttribute)getDiffEAttribute_eAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEAttribute_eAttributeType_EType() {
        return (EReference)getDiffEAttribute_eAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAnnotation() {
		if (diffEAnnotationEClass == null) {
			diffEAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(58);
		}
		return diffEAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_Operation() {
        return (EAttribute)getDiffEAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_New_source() {
        return (EAttribute)getDiffEAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAnnotation_details() {
		if (diffEAnnotation_detailsEClass == null) {
			diffEAnnotation_detailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(59);
		}
		return diffEAnnotation_detailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_details_Operation() {
        return (EAttribute)getDiffEAnnotation_details().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEAnnotation_details_EType() {
        return (EReference)getDiffEAnnotation_details().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAnnotation_eModelElement() {
		if (diffEAnnotation_eModelElementEClass == null) {
			diffEAnnotation_eModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(60);
		}
		return diffEAnnotation_eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_eModelElement_Operation() {
        return (EAttribute)getDiffEAnnotation_eModelElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEAnnotation_eModelElement_EType() {
        return (EReference)getDiffEAnnotation_eModelElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAnnotation_contents() {
		if (diffEAnnotation_contentsEClass == null) {
			diffEAnnotation_contentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(61);
		}
		return diffEAnnotation_contentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_contents_Operation() {
        return (EAttribute)getDiffEAnnotation_contents().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEAnnotation_contents_EType() {
        return (EReference)getDiffEAnnotation_contents().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEAnnotation_references() {
		if (diffEAnnotation_referencesEClass == null) {
			diffEAnnotation_referencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(62);
		}
		return diffEAnnotation_referencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEAnnotation_references_Operation() {
        return (EAttribute)getDiffEAnnotation_references().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEAnnotation_references_EType() {
        return (EReference)getDiffEAnnotation_references().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass() {
		if (diffEClassEClass == null) {
			diffEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(63);
		}
		return diffEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_Operation() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_name() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_instanceClassName() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_instanceClass() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_defaultValue() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_instanceTypeName() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_abstract() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_New_interface() {
        return (EAttribute)getDiffEClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eSuperTypes() {
		if (diffEClass_eSuperTypesEClass == null) {
			diffEClass_eSuperTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(64);
		}
		return diffEClass_eSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eSuperTypes_Operation() {
        return (EAttribute)getDiffEClass_eSuperTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eSuperTypes_EType() {
        return (EReference)getDiffEClass_eSuperTypes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eOperations() {
		if (diffEClass_eOperationsEClass == null) {
			diffEClass_eOperationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(65);
		}
		return diffEClass_eOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eOperations_Operation() {
        return (EAttribute)getDiffEClass_eOperations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eOperations_EType() {
        return (EReference)getDiffEClass_eOperations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllAttributes() {
		if (diffEClass_eAllAttributesEClass == null) {
			diffEClass_eAllAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(66);
		}
		return diffEClass_eAllAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllAttributes_Operation() {
        return (EAttribute)getDiffEClass_eAllAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllAttributes_EType() {
        return (EReference)getDiffEClass_eAllAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllReferences() {
		if (diffEClass_eAllReferencesEClass == null) {
			diffEClass_eAllReferencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(67);
		}
		return diffEClass_eAllReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllReferences_Operation() {
        return (EAttribute)getDiffEClass_eAllReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllReferences_EType() {
        return (EReference)getDiffEClass_eAllReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eReferences() {
		if (diffEClass_eReferencesEClass == null) {
			diffEClass_eReferencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(68);
		}
		return diffEClass_eReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eReferences_Operation() {
        return (EAttribute)getDiffEClass_eReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eReferences_EType() {
        return (EReference)getDiffEClass_eReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAttributes() {
		if (diffEClass_eAttributesEClass == null) {
			diffEClass_eAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(69);
		}
		return diffEClass_eAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAttributes_Operation() {
        return (EAttribute)getDiffEClass_eAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAttributes_EType() {
        return (EReference)getDiffEClass_eAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllContainments() {
		if (diffEClass_eAllContainmentsEClass == null) {
			diffEClass_eAllContainmentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(70);
		}
		return diffEClass_eAllContainmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllContainments_Operation() {
        return (EAttribute)getDiffEClass_eAllContainments().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllContainments_EType() {
        return (EReference)getDiffEClass_eAllContainments().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllOperations() {
		if (diffEClass_eAllOperationsEClass == null) {
			diffEClass_eAllOperationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(71);
		}
		return diffEClass_eAllOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllOperations_Operation() {
        return (EAttribute)getDiffEClass_eAllOperations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllOperations_EType() {
        return (EReference)getDiffEClass_eAllOperations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllStructuralFeatures() {
		if (diffEClass_eAllStructuralFeaturesEClass == null) {
			diffEClass_eAllStructuralFeaturesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(72);
		}
		return diffEClass_eAllStructuralFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllStructuralFeatures_Operation() {
        return (EAttribute)getDiffEClass_eAllStructuralFeatures().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllStructuralFeatures_EType() {
        return (EReference)getDiffEClass_eAllStructuralFeatures().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllSuperTypes() {
		if (diffEClass_eAllSuperTypesEClass == null) {
			diffEClass_eAllSuperTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(73);
		}
		return diffEClass_eAllSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllSuperTypes_Operation() {
        return (EAttribute)getDiffEClass_eAllSuperTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllSuperTypes_EType() {
        return (EReference)getDiffEClass_eAllSuperTypes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eIDAttribute() {
		if (diffEClass_eIDAttributeEClass == null) {
			diffEClass_eIDAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(74);
		}
		return diffEClass_eIDAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eIDAttribute_Operation() {
        return (EAttribute)getDiffEClass_eIDAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eIDAttribute_EType() {
        return (EReference)getDiffEClass_eIDAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eStructuralFeatures() {
		if (diffEClass_eStructuralFeaturesEClass == null) {
			diffEClass_eStructuralFeaturesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(75);
		}
		return diffEClass_eStructuralFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eStructuralFeatures_Operation() {
        return (EAttribute)getDiffEClass_eStructuralFeatures().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eStructuralFeatures_EType() {
        return (EReference)getDiffEClass_eStructuralFeatures().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eGenericSuperTypes() {
		if (diffEClass_eGenericSuperTypesEClass == null) {
			diffEClass_eGenericSuperTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(76);
		}
		return diffEClass_eGenericSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eGenericSuperTypes_Operation() {
        return (EAttribute)getDiffEClass_eGenericSuperTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eGenericSuperTypes_EType() {
        return (EReference)getDiffEClass_eGenericSuperTypes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClass_eAllGenericSuperTypes() {
		if (diffEClass_eAllGenericSuperTypesEClass == null) {
			diffEClass_eAllGenericSuperTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(77);
		}
		return diffEClass_eAllGenericSuperTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClass_eAllGenericSuperTypes_Operation() {
        return (EAttribute)getDiffEClass_eAllGenericSuperTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClass_eAllGenericSuperTypes_EType() {
        return (EReference)getDiffEClass_eAllGenericSuperTypes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClassifier_ePackage() {
		if (diffEClassifier_ePackageEClass == null) {
			diffEClassifier_ePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(78);
		}
		return diffEClassifier_ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClassifier_ePackage_Operation() {
        return (EAttribute)getDiffEClassifier_ePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClassifier_ePackage_EType() {
        return (EReference)getDiffEClassifier_ePackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEClassifier_eTypeParameters() {
		if (diffEClassifier_eTypeParametersEClass == null) {
			diffEClassifier_eTypeParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(79);
		}
		return diffEClassifier_eTypeParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEClassifier_eTypeParameters_Operation() {
        return (EAttribute)getDiffEClassifier_eTypeParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEClassifier_eTypeParameters_EType() {
        return (EReference)getDiffEClassifier_eTypeParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEDataType() {
		if (diffEDataTypeEClass == null) {
			diffEDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(80);
		}
		return diffEDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_Operation() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_name() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_instanceClassName() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_instanceClass() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_defaultValue() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_instanceTypeName() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEDataType_New_serializable() {
        return (EAttribute)getDiffEDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEEnum() {
		if (diffEEnumEClass == null) {
			diffEEnumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(81);
		}
		return diffEEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_Operation() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_name() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_instanceClassName() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_instanceClass() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_defaultValue() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_instanceTypeName() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_New_serializable() {
        return (EAttribute)getDiffEEnum().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEEnum_eLiterals() {
		if (diffEEnum_eLiteralsEClass == null) {
			diffEEnum_eLiteralsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(82);
		}
		return diffEEnum_eLiteralsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnum_eLiterals_Operation() {
        return (EAttribute)getDiffEEnum_eLiterals().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEEnum_eLiterals_EType() {
        return (EReference)getDiffEEnum_eLiterals().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEEnumLiteral() {
		if (diffEEnumLiteralEClass == null) {
			diffEEnumLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(83);
		}
		return diffEEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_Operation() {
        return (EAttribute)getDiffEEnumLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_New_name() {
        return (EAttribute)getDiffEEnumLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_New_value() {
        return (EAttribute)getDiffEEnumLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_New_instance() {
        return (EAttribute)getDiffEEnumLiteral().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_New_literal() {
        return (EAttribute)getDiffEEnumLiteral().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEEnumLiteral_eEnum() {
		if (diffEEnumLiteral_eEnumEClass == null) {
			diffEEnumLiteral_eEnumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(84);
		}
		return diffEEnumLiteral_eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEEnumLiteral_eEnum_Operation() {
        return (EAttribute)getDiffEEnumLiteral_eEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEEnumLiteral_eEnum_EType() {
        return (EReference)getDiffEEnumLiteral_eEnum().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEFactory() {
		if (diffEFactoryEClass == null) {
			diffEFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(85);
		}
		return diffEFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEFactory_Operation() {
        return (EAttribute)getDiffEFactory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEFactory_ePackage() {
		if (diffEFactory_ePackageEClass == null) {
			diffEFactory_ePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(86);
		}
		return diffEFactory_ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEFactory_ePackage_Operation() {
        return (EAttribute)getDiffEFactory_ePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEFactory_ePackage_EType() {
        return (EReference)getDiffEFactory_ePackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEModelElement_eAnnotations() {
		if (diffEModelElement_eAnnotationsEClass == null) {
			diffEModelElement_eAnnotationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(87);
		}
		return diffEModelElement_eAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEModelElement_eAnnotations_Operation() {
        return (EAttribute)getDiffEModelElement_eAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEModelElement_eAnnotations_EType() {
        return (EReference)getDiffEModelElement_eAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEObject() {
		if (diffEObjectEClass == null) {
			diffEObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(88);
		}
		return diffEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEObject_Operation() {
        return (EAttribute)getDiffEObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation() {
		if (diffEOperationEClass == null) {
			diffEOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(89);
		}
		return diffEOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_Operation() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_name() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_ordered() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_unique() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_lowerBound() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_upperBound() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_many() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_New_required() {
        return (EAttribute)getDiffEOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation_eContainingClass() {
		if (diffEOperation_eContainingClassEClass == null) {
			diffEOperation_eContainingClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(90);
		}
		return diffEOperation_eContainingClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_eContainingClass_Operation() {
        return (EAttribute)getDiffEOperation_eContainingClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEOperation_eContainingClass_EType() {
        return (EReference)getDiffEOperation_eContainingClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation_eTypeParameters() {
		if (diffEOperation_eTypeParametersEClass == null) {
			diffEOperation_eTypeParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(91);
		}
		return diffEOperation_eTypeParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_eTypeParameters_Operation() {
        return (EAttribute)getDiffEOperation_eTypeParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEOperation_eTypeParameters_EType() {
        return (EReference)getDiffEOperation_eTypeParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation_eParameters() {
		if (diffEOperation_eParametersEClass == null) {
			diffEOperation_eParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(92);
		}
		return diffEOperation_eParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_eParameters_Operation() {
        return (EAttribute)getDiffEOperation_eParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEOperation_eParameters_EType() {
        return (EReference)getDiffEOperation_eParameters().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation_eExceptions() {
		if (diffEOperation_eExceptionsEClass == null) {
			diffEOperation_eExceptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(93);
		}
		return diffEOperation_eExceptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_eExceptions_Operation() {
        return (EAttribute)getDiffEOperation_eExceptions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEOperation_eExceptions_EType() {
        return (EReference)getDiffEOperation_eExceptions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEOperation_eGenericExceptions() {
		if (diffEOperation_eGenericExceptionsEClass == null) {
			diffEOperation_eGenericExceptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(94);
		}
		return diffEOperation_eGenericExceptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEOperation_eGenericExceptions_Operation() {
        return (EAttribute)getDiffEOperation_eGenericExceptions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEOperation_eGenericExceptions_EType() {
        return (EReference)getDiffEOperation_eGenericExceptions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage() {
		if (diffEPackageEClass == null) {
			diffEPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(95);
		}
		return diffEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_Operation() {
        return (EAttribute)getDiffEPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_New_name() {
        return (EAttribute)getDiffEPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_New_nsURI() {
        return (EAttribute)getDiffEPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_New_nsPrefix() {
        return (EAttribute)getDiffEPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_eFactoryInstance() {
		if (diffEPackage_eFactoryInstanceEClass == null) {
			diffEPackage_eFactoryInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(96);
		}
		return diffEPackage_eFactoryInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_eFactoryInstance_Operation() {
        return (EAttribute)getDiffEPackage_eFactoryInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_eFactoryInstance_EType() {
        return (EReference)getDiffEPackage_eFactoryInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_eClassifiers() {
		if (diffEPackage_eClassifiersEClass == null) {
			diffEPackage_eClassifiersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(97);
		}
		return diffEPackage_eClassifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_eClassifiers_Operation() {
        return (EAttribute)getDiffEPackage_eClassifiers().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_eClassifiers_EType() {
        return (EReference)getDiffEPackage_eClassifiers().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_eSubpackages() {
		if (diffEPackage_eSubpackagesEClass == null) {
			diffEPackage_eSubpackagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(98);
		}
		return diffEPackage_eSubpackagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_eSubpackages_Operation() {
        return (EAttribute)getDiffEPackage_eSubpackages().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_eSubpackages_EType() {
        return (EReference)getDiffEPackage_eSubpackages().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_eSuperPackage() {
		if (diffEPackage_eSuperPackageEClass == null) {
			diffEPackage_eSuperPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(99);
		}
		return diffEPackage_eSuperPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_eSuperPackage_Operation() {
        return (EAttribute)getDiffEPackage_eSuperPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_eSuperPackage_EType() {
        return (EReference)getDiffEPackage_eSuperPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEPackage_domainspecificdiffs() {
		if (diffEPackage_domainspecificdiffsEClass == null) {
			diffEPackage_domainspecificdiffsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(100);
		}
		return diffEPackage_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEPackage_domainspecificdiffs_Operation() {
        return (EAttribute)getDiffEPackage_domainspecificdiffs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEPackage_domainspecificdiffs_EType() {
        return (EReference)getDiffEPackage_domainspecificdiffs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEParameter() {
		if (diffEParameterEClass == null) {
			diffEParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(101);
		}
		return diffEParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_Operation() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_name() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_ordered() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_unique() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_lowerBound() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_upperBound() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_many() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_New_required() {
        return (EAttribute)getDiffEParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEParameter_eOperation() {
		if (diffEParameter_eOperationEClass == null) {
			diffEParameter_eOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(102);
		}
		return diffEParameter_eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEParameter_eOperation_Operation() {
        return (EAttribute)getDiffEParameter_eOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEParameter_eOperation_EType() {
        return (EReference)getDiffEParameter_eOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEReference() {
		if (diffEReferenceEClass == null) {
			diffEReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(103);
		}
		return diffEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_Operation() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_name() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_ordered() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_unique() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_lowerBound() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_upperBound() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_many() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_required() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_changeable() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_volatile() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_transient() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_defaultValueLiteral() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_defaultValue() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_unsettable() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_derived() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_containment() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_container() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_New_resolveProxies() {
        return (EAttribute)getDiffEReference().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEReference_eOpposite() {
		if (diffEReference_eOppositeEClass == null) {
			diffEReference_eOppositeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(104);
		}
		return diffEReference_eOppositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_eOpposite_Operation() {
        return (EAttribute)getDiffEReference_eOpposite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEReference_eOpposite_EType() {
        return (EReference)getDiffEReference_eOpposite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEReference_eReferenceType() {
		if (diffEReference_eReferenceTypeEClass == null) {
			diffEReference_eReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(105);
		}
		return diffEReference_eReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_eReferenceType_Operation() {
        return (EAttribute)getDiffEReference_eReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEReference_eReferenceType_EType() {
        return (EReference)getDiffEReference_eReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEReference_eKeys() {
		if (diffEReference_eKeysEClass == null) {
			diffEReference_eKeysEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(106);
		}
		return diffEReference_eKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEReference_eKeys_Operation() {
        return (EAttribute)getDiffEReference_eKeys().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEReference_eKeys_EType() {
        return (EReference)getDiffEReference_eKeys().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEStructuralFeature_eContainingClass() {
		if (diffEStructuralFeature_eContainingClassEClass == null) {
			diffEStructuralFeature_eContainingClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(107);
		}
		return diffEStructuralFeature_eContainingClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEStructuralFeature_eContainingClass_Operation() {
        return (EAttribute)getDiffEStructuralFeature_eContainingClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEStructuralFeature_eContainingClass_EType() {
        return (EReference)getDiffEStructuralFeature_eContainingClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffETypedElement_eType() {
		if (diffETypedElement_eTypeEClass == null) {
			diffETypedElement_eTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(108);
		}
		return diffETypedElement_eTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffETypedElement_eType_Operation() {
        return (EAttribute)getDiffETypedElement_eType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffETypedElement_eType_EType() {
        return (EReference)getDiffETypedElement_eType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffETypedElement_eGenericType() {
		if (diffETypedElement_eGenericTypeEClass == null) {
			diffETypedElement_eGenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(109);
		}
		return diffETypedElement_eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffETypedElement_eGenericType_Operation() {
        return (EAttribute)getDiffETypedElement_eGenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffETypedElement_eGenericType_EType() {
        return (EReference)getDiffETypedElement_eGenericType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEStringToStringMapEntry() {
		if (diffEStringToStringMapEntryEClass == null) {
			diffEStringToStringMapEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(110);
		}
		return diffEStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEStringToStringMapEntry_Operation() {
        return (EAttribute)getDiffEStringToStringMapEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEStringToStringMapEntry_New_key() {
        return (EAttribute)getDiffEStringToStringMapEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEStringToStringMapEntry_New_value() {
        return (EAttribute)getDiffEStringToStringMapEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType() {
		if (diffEGenericTypeEClass == null) {
			diffEGenericTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(111);
		}
		return diffEGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_Operation() {
        return (EAttribute)getDiffEGenericType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eUpperBound() {
		if (diffEGenericType_eUpperBoundEClass == null) {
			diffEGenericType_eUpperBoundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(112);
		}
		return diffEGenericType_eUpperBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eUpperBound_Operation() {
        return (EAttribute)getDiffEGenericType_eUpperBound().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eUpperBound_EType() {
        return (EReference)getDiffEGenericType_eUpperBound().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eTypeArguments() {
		if (diffEGenericType_eTypeArgumentsEClass == null) {
			diffEGenericType_eTypeArgumentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(113);
		}
		return diffEGenericType_eTypeArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eTypeArguments_Operation() {
        return (EAttribute)getDiffEGenericType_eTypeArguments().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eTypeArguments_EType() {
        return (EReference)getDiffEGenericType_eTypeArguments().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eRawType() {
		if (diffEGenericType_eRawTypeEClass == null) {
			diffEGenericType_eRawTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(114);
		}
		return diffEGenericType_eRawTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eRawType_Operation() {
        return (EAttribute)getDiffEGenericType_eRawType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eRawType_EType() {
        return (EReference)getDiffEGenericType_eRawType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eLowerBound() {
		if (diffEGenericType_eLowerBoundEClass == null) {
			diffEGenericType_eLowerBoundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(115);
		}
		return diffEGenericType_eLowerBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eLowerBound_Operation() {
        return (EAttribute)getDiffEGenericType_eLowerBound().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eLowerBound_EType() {
        return (EReference)getDiffEGenericType_eLowerBound().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eTypeParameter() {
		if (diffEGenericType_eTypeParameterEClass == null) {
			diffEGenericType_eTypeParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(116);
		}
		return diffEGenericType_eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eTypeParameter_Operation() {
        return (EAttribute)getDiffEGenericType_eTypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eTypeParameter_EType() {
        return (EReference)getDiffEGenericType_eTypeParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffEGenericType_eClassifier() {
		if (diffEGenericType_eClassifierEClass == null) {
			diffEGenericType_eClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(117);
		}
		return diffEGenericType_eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffEGenericType_eClassifier_Operation() {
        return (EAttribute)getDiffEGenericType_eClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffEGenericType_eClassifier_EType() {
        return (EReference)getDiffEGenericType_eClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffETypeParameter() {
		if (diffETypeParameterEClass == null) {
			diffETypeParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(118);
		}
		return diffETypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffETypeParameter_Operation() {
        return (EAttribute)getDiffETypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffETypeParameter_New_name() {
        return (EAttribute)getDiffETypeParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffETypeParameter_eBounds() {
		if (diffETypeParameter_eBoundsEClass == null) {
			diffETypeParameter_eBoundsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(119);
		}
		return diffETypeParameter_eBoundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffETypeParameter_eBounds_Operation() {
        return (EAttribute)getDiffETypeParameter_eBounds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffETypeParameter_eBounds_EType() {
        return (EReference)getDiffETypeParameter_eBounds().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClassOp() {
		if (classOpEEnum == null) {
			classOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(53);
		}
		return classOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAscOp() {
		if (ascOpEEnum == null) {
			ascOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(54);
		}
		return ascOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEBigDecimal() {
		if (eBigDecimalEDataType == null) {
			eBigDecimalEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(17);
		}
		return eBigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEBigInteger() {
		if (eBigIntegerEDataType == null) {
			eBigIntegerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(18);
		}
		return eBigIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEBoolean() {
		if (eBooleanEDataType == null) {
			eBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(19);
		}
		return eBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEBooleanObject() {
		if (eBooleanObjectEDataType == null) {
			eBooleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(20);
		}
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEByte() {
		if (eByteEDataType == null) {
			eByteEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(21);
		}
		return eByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEByteArray() {
		if (eByteArrayEDataType == null) {
			eByteArrayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(22);
		}
		return eByteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEByteObject() {
		if (eByteObjectEDataType == null) {
			eByteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(23);
		}
		return eByteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEChar() {
		if (eCharEDataType == null) {
			eCharEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(24);
		}
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getECharacterObject() {
		if (eCharacterObjectEDataType == null) {
			eCharacterObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(25);
		}
		return eCharacterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEDate() {
		if (eDateEDataType == null) {
			eDateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(26);
		}
		return eDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEDiagnosticChain() {
		if (eDiagnosticChainEDataType == null) {
			eDiagnosticChainEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(27);
		}
		return eDiagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEDouble() {
		if (eDoubleEDataType == null) {
			eDoubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(28);
		}
		return eDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEDoubleObject() {
		if (eDoubleObjectEDataType == null) {
			eDoubleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(29);
		}
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEEList() {
		if (eeListEDataType == null) {
			eeListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(30);
		}
		return eeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEEnumerator() {
		if (eEnumeratorEDataType == null) {
			eEnumeratorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(31);
		}
		return eEnumeratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEFeatureMap() {
		if (eFeatureMapEDataType == null) {
			eFeatureMapEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(32);
		}
		return eFeatureMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEFeatureMapEntry() {
		if (eFeatureMapEntryEDataType == null) {
			eFeatureMapEntryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(33);
		}
		return eFeatureMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEFloat() {
		if (eFloatEDataType == null) {
			eFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(34);
		}
		return eFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEFloatObject() {
		if (eFloatObjectEDataType == null) {
			eFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(35);
		}
		return eFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEInt() {
		if (eIntEDataType == null) {
			eIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(36);
		}
		return eIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEIntegerObject() {
		if (eIntegerObjectEDataType == null) {
			eIntegerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(37);
		}
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEJavaClass() {
		if (eJavaClassEDataType == null) {
			eJavaClassEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(38);
		}
		return eJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEJavaObject() {
		if (eJavaObjectEDataType == null) {
			eJavaObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(39);
		}
		return eJavaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getELong() {
		if (eLongEDataType == null) {
			eLongEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(40);
		}
		return eLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getELongObject() {
		if (eLongObjectEDataType == null) {
			eLongObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(41);
		}
		return eLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEMap() {
		if (eMapEDataType == null) {
			eMapEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(42);
		}
		return eMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEResource() {
		if (eResourceEDataType == null) {
			eResourceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(43);
		}
		return eResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEResourceSet() {
		if (eResourceSetEDataType == null) {
			eResourceSetEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(44);
		}
		return eResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEShort() {
		if (eShortEDataType == null) {
			eShortEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(45);
		}
		return eShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEShortObject() {
		if (eShortObjectEDataType == null) {
			eShortObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(46);
		}
		return eShortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEString() {
		if (eStringEDataType == null) {
			eStringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(47);
		}
		return eStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETreeIterator() {
		if (eTreeIteratorEDataType == null) {
			eTreeIteratorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(49);
		}
		return eTreeIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEInvocationTargetException() {
		if (eInvocationTargetExceptionEDataType == null) {
			eInvocationTargetExceptionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcoreDiffMMPackage.eNS_URI).getEClassifiers().get(52);
		}
		return eInvocationTargetExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreDiffMMFactory getEcoreDiffMMFactory() {
		return (EcoreDiffMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("ecoreDiffMM." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //EcoreDiffMMPackageImpl
