/**
 */
package dssmm2WayRuleMM.impl;

import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl;

import dssmm2WayRuleMM.Dssmm2WayRuleMMFactory;
import dssmm2WayRuleMM.Dssmm2WayRuleMMPackage;
import dssmm2WayRuleMM.Pattern_CompositeFactor;
import dssmm2WayRuleMM.Pattern_DecisionSupport;
import dssmm2WayRuleMM.Pattern_DiffCompositeFactor;
import dssmm2WayRuleMM.Pattern_DiffCompositeFactor_subFactors;
import dssmm2WayRuleMM.Pattern_DiffDecisionSupport;
import dssmm2WayRuleMM.Pattern_DiffDecisionSupport_model;
import dssmm2WayRuleMM.Pattern_DiffDecisionSupport_options;
import dssmm2WayRuleMM.Pattern_DiffDecisionSupport_vendors;
import dssmm2WayRuleMM.Pattern_DiffFactor_scores;
import dssmm2WayRuleMM.Pattern_DiffLeafFactor;
import dssmm2WayRuleMM.Pattern_DiffModel;
import dssmm2WayRuleMM.Pattern_DiffModel_rootFactor;
import dssmm2WayRuleMM.Pattern_DiffOption;
import dssmm2WayRuleMM.Pattern_DiffOption_vendor;
import dssmm2WayRuleMM.Pattern_DiffScore;
import dssmm2WayRuleMM.Pattern_DiffScore_score_option;
import dssmm2WayRuleMM.Pattern_DiffVendor;
import dssmm2WayRuleMM.Pattern_Factor;
import dssmm2WayRuleMM.Pattern_LeafFactor;
import dssmm2WayRuleMM.Pattern_Model;
import dssmm2WayRuleMM.Pattern_Option;
import dssmm2WayRuleMM.Pattern_Score;
import dssmm2WayRuleMM.Pattern_SemanticConflict;
import dssmm2WayRuleMM.Pattern_SemanticDiff;
import dssmm2WayRuleMM.Pattern_SemanticObject;
import dssmm2WayRuleMM.Pattern_Vendor;
import dssmm2WayRuleMM.Rule;

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
public class Dssmm2WayRuleMMPackageImpl extends EPackageImpl implements Dssmm2WayRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DecisionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_FactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_LeafFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_CompositeFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_OptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_VendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDecisionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDecisionSupport_modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDecisionSupport_optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffDecisionSupport_vendorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffModel_rootFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFactor_scoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffLeafFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffCompositeFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffCompositeFactor_subFactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffOption_vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffVendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffScore_score_optionEClass = null;

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
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dssmm2WayRuleMMPackageImpl() {
		super(eNS_URI, Dssmm2WayRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Dssmm2WayRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dssmm2WayRuleMMPackage init() {
		if (isInited) return (Dssmm2WayRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(Dssmm2WayRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDssmm2WayRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Dssmm2WayRuleMMPackageImpl theDssmm2WayRuleMMPackage = registeredDssmm2WayRuleMMPackage instanceof Dssmm2WayRuleMMPackageImpl ? (Dssmm2WayRuleMMPackageImpl)registeredDssmm2WayRuleMMPackage : new Dssmm2WayRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Dssmm2WayDiffMMPackage.eNS_URI);
		Dssmm2WayDiffMMPackageImpl theDssmm2WayDiffMMPackage = (Dssmm2WayDiffMMPackageImpl)(registeredPackage instanceof Dssmm2WayDiffMMPackageImpl ? registeredPackage : Dssmm2WayDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		theDssmm2WayRuleMMPackage.createPackageContents();
		theDssmm2WayDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		theDssmm2WayRuleMMPackage.initializePackageContents();
		theDssmm2WayDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDssmm2WayRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dssmm2WayRuleMMPackage.eNS_URI, theDssmm2WayRuleMMPackage);
		return theDssmm2WayRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DecisionSupport() {
		return pattern_DecisionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DecisionSupport_ID_Pattern() {
		return (EAttribute)pattern_DecisionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DecisionSupport_Filter() {
		return (EAttribute)pattern_DecisionSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DecisionSupport_IsForbidden() {
		return (EAttribute)pattern_DecisionSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Model() {
		return pattern_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Model_ID_Pattern() {
		return (EAttribute)pattern_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Model_Filter() {
		return (EAttribute)pattern_ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Model_IsForbidden() {
		return (EAttribute)pattern_ModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Factor() {
		return pattern_FactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Factor_ID_Pattern() {
		return (EAttribute)pattern_FactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Factor_Filter() {
		return (EAttribute)pattern_FactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Factor_IsForbidden() {
		return (EAttribute)pattern_FactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_LeafFactor() {
		return pattern_LeafFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_LeafFactor_ID_Pattern() {
		return (EAttribute)pattern_LeafFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_LeafFactor_Filter() {
		return (EAttribute)pattern_LeafFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_LeafFactor_IsForbidden() {
		return (EAttribute)pattern_LeafFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_CompositeFactor() {
		return pattern_CompositeFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_CompositeFactor_ID_Pattern() {
		return (EAttribute)pattern_CompositeFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_CompositeFactor_Filter() {
		return (EAttribute)pattern_CompositeFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_CompositeFactor_IsForbidden() {
		return (EAttribute)pattern_CompositeFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Option() {
		return pattern_OptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Option_ID_Pattern() {
		return (EAttribute)pattern_OptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Option_Filter() {
		return (EAttribute)pattern_OptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Option_IsForbidden() {
		return (EAttribute)pattern_OptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Vendor() {
		return pattern_VendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Vendor_ID_Pattern() {
		return (EAttribute)pattern_VendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Vendor_Filter() {
		return (EAttribute)pattern_VendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Vendor_IsForbidden() {
		return (EAttribute)pattern_VendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Score() {
		return pattern_ScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Score_ID_Pattern() {
		return (EAttribute)pattern_ScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Score_Filter() {
		return (EAttribute)pattern_ScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Score_IsForbidden() {
		return (EAttribute)pattern_ScoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticObject() {
		return pattern_SemanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_ID_Pattern() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_Filter() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_IsForbidden() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticDiff() {
		return pattern_SemanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_ID_Pattern() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_Filter() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_IsForbidden() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticConflict() {
		return pattern_SemanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_ID_Pattern() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Filter() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_IsForbidden() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDecisionSupport() {
		return pattern_DiffDecisionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_ID_Pattern() {
		return (EAttribute)pattern_DiffDecisionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_Filter() {
		return (EAttribute)pattern_DiffDecisionSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_IsForbidden() {
		return (EAttribute)pattern_DiffDecisionSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDecisionSupport_model() {
		return pattern_DiffDecisionSupport_modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_model_ID_Pattern() {
		return (EAttribute)pattern_DiffDecisionSupport_modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_model_Filter() {
		return (EAttribute)pattern_DiffDecisionSupport_modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_model_IsForbidden() {
		return (EAttribute)pattern_DiffDecisionSupport_modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDecisionSupport_options() {
		return pattern_DiffDecisionSupport_optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_options_ID_Pattern() {
		return (EAttribute)pattern_DiffDecisionSupport_optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_options_Filter() {
		return (EAttribute)pattern_DiffDecisionSupport_optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_options_IsForbidden() {
		return (EAttribute)pattern_DiffDecisionSupport_optionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffDecisionSupport_vendors() {
		return pattern_DiffDecisionSupport_vendorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_vendors_ID_Pattern() {
		return (EAttribute)pattern_DiffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_vendors_Filter() {
		return (EAttribute)pattern_DiffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffDecisionSupport_vendors_IsForbidden() {
		return (EAttribute)pattern_DiffDecisionSupport_vendorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffModel() {
		return pattern_DiffModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_ID_Pattern() {
		return (EAttribute)pattern_DiffModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_Filter() {
		return (EAttribute)pattern_DiffModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_IsForbidden() {
		return (EAttribute)pattern_DiffModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffModel_rootFactor() {
		return pattern_DiffModel_rootFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_rootFactor_ID_Pattern() {
		return (EAttribute)pattern_DiffModel_rootFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_rootFactor_Filter() {
		return (EAttribute)pattern_DiffModel_rootFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffModel_rootFactor_IsForbidden() {
		return (EAttribute)pattern_DiffModel_rootFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFactor_scores() {
		return pattern_DiffFactor_scoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFactor_scores_ID_Pattern() {
		return (EAttribute)pattern_DiffFactor_scoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFactor_scores_Filter() {
		return (EAttribute)pattern_DiffFactor_scoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFactor_scores_IsForbidden() {
		return (EAttribute)pattern_DiffFactor_scoresEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffLeafFactor() {
		return pattern_DiffLeafFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffLeafFactor_ID_Pattern() {
		return (EAttribute)pattern_DiffLeafFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffLeafFactor_Filter() {
		return (EAttribute)pattern_DiffLeafFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffLeafFactor_IsForbidden() {
		return (EAttribute)pattern_DiffLeafFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffCompositeFactor() {
		return pattern_DiffCompositeFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_ID_Pattern() {
		return (EAttribute)pattern_DiffCompositeFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_Filter() {
		return (EAttribute)pattern_DiffCompositeFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_IsForbidden() {
		return (EAttribute)pattern_DiffCompositeFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffCompositeFactor_subFactors() {
		return pattern_DiffCompositeFactor_subFactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_subFactors_ID_Pattern() {
		return (EAttribute)pattern_DiffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_subFactors_Filter() {
		return (EAttribute)pattern_DiffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffCompositeFactor_subFactors_IsForbidden() {
		return (EAttribute)pattern_DiffCompositeFactor_subFactorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffOption() {
		return pattern_DiffOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_ID_Pattern() {
		return (EAttribute)pattern_DiffOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_Filter() {
		return (EAttribute)pattern_DiffOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_IsForbidden() {
		return (EAttribute)pattern_DiffOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffOption_vendor() {
		return pattern_DiffOption_vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_vendor_ID_Pattern() {
		return (EAttribute)pattern_DiffOption_vendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_vendor_Filter() {
		return (EAttribute)pattern_DiffOption_vendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffOption_vendor_IsForbidden() {
		return (EAttribute)pattern_DiffOption_vendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffVendor() {
		return pattern_DiffVendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffVendor_ID_Pattern() {
		return (EAttribute)pattern_DiffVendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffVendor_Filter() {
		return (EAttribute)pattern_DiffVendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffVendor_IsForbidden() {
		return (EAttribute)pattern_DiffVendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffScore() {
		return pattern_DiffScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_ID_Pattern() {
		return (EAttribute)pattern_DiffScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_Filter() {
		return (EAttribute)pattern_DiffScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_IsForbidden() {
		return (EAttribute)pattern_DiffScoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffScore_score_option() {
		return pattern_DiffScore_score_optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_score_option_ID_Pattern() {
		return (EAttribute)pattern_DiffScore_score_optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_score_option_Filter() {
		return (EAttribute)pattern_DiffScore_score_optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffScore_score_option_IsForbidden() {
		return (EAttribute)pattern_DiffScore_score_optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DecisionSupport() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffCompositeFactor_subFactors() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffDecisionSupport_model() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffDecisionSupport_options() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffDecisionSupport_vendors() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffFactor_scores() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffModel_rootFactor() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffOption_vendor() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffScore_score_option() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Factor() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Model() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Option() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Score() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Vendor() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayRuleMMFactory getDssmm2WayRuleMMFactory() {
		return (Dssmm2WayRuleMMFactory)getEFactoryInstance();
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
		pattern_DecisionSupportEClass = createEClass(PATTERN_DECISION_SUPPORT);
		createEAttribute(pattern_DecisionSupportEClass, PATTERN_DECISION_SUPPORT__ID_PATTERN);
		createEAttribute(pattern_DecisionSupportEClass, PATTERN_DECISION_SUPPORT__FILTER);
		createEAttribute(pattern_DecisionSupportEClass, PATTERN_DECISION_SUPPORT__IS_FORBIDDEN);

		pattern_ModelEClass = createEClass(PATTERN_MODEL);
		createEAttribute(pattern_ModelEClass, PATTERN_MODEL__ID_PATTERN);
		createEAttribute(pattern_ModelEClass, PATTERN_MODEL__FILTER);
		createEAttribute(pattern_ModelEClass, PATTERN_MODEL__IS_FORBIDDEN);

		pattern_FactorEClass = createEClass(PATTERN_FACTOR);
		createEAttribute(pattern_FactorEClass, PATTERN_FACTOR__ID_PATTERN);
		createEAttribute(pattern_FactorEClass, PATTERN_FACTOR__FILTER);
		createEAttribute(pattern_FactorEClass, PATTERN_FACTOR__IS_FORBIDDEN);

		pattern_LeafFactorEClass = createEClass(PATTERN_LEAF_FACTOR);
		createEAttribute(pattern_LeafFactorEClass, PATTERN_LEAF_FACTOR__ID_PATTERN);
		createEAttribute(pattern_LeafFactorEClass, PATTERN_LEAF_FACTOR__FILTER);
		createEAttribute(pattern_LeafFactorEClass, PATTERN_LEAF_FACTOR__IS_FORBIDDEN);

		pattern_CompositeFactorEClass = createEClass(PATTERN_COMPOSITE_FACTOR);
		createEAttribute(pattern_CompositeFactorEClass, PATTERN_COMPOSITE_FACTOR__ID_PATTERN);
		createEAttribute(pattern_CompositeFactorEClass, PATTERN_COMPOSITE_FACTOR__FILTER);
		createEAttribute(pattern_CompositeFactorEClass, PATTERN_COMPOSITE_FACTOR__IS_FORBIDDEN);

		pattern_OptionEClass = createEClass(PATTERN_OPTION);
		createEAttribute(pattern_OptionEClass, PATTERN_OPTION__ID_PATTERN);
		createEAttribute(pattern_OptionEClass, PATTERN_OPTION__FILTER);
		createEAttribute(pattern_OptionEClass, PATTERN_OPTION__IS_FORBIDDEN);

		pattern_VendorEClass = createEClass(PATTERN_VENDOR);
		createEAttribute(pattern_VendorEClass, PATTERN_VENDOR__ID_PATTERN);
		createEAttribute(pattern_VendorEClass, PATTERN_VENDOR__FILTER);
		createEAttribute(pattern_VendorEClass, PATTERN_VENDOR__IS_FORBIDDEN);

		pattern_ScoreEClass = createEClass(PATTERN_SCORE);
		createEAttribute(pattern_ScoreEClass, PATTERN_SCORE__ID_PATTERN);
		createEAttribute(pattern_ScoreEClass, PATTERN_SCORE__FILTER);
		createEAttribute(pattern_ScoreEClass, PATTERN_SCORE__IS_FORBIDDEN);

		pattern_SemanticObjectEClass = createEClass(PATTERN_SEMANTIC_OBJECT);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__ID_PATTERN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__FILTER);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN);

		pattern_SemanticDiffEClass = createEClass(PATTERN_SEMANTIC_DIFF);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__FILTER);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN);

		pattern_SemanticConflictEClass = createEClass(PATTERN_SEMANTIC_CONFLICT);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__ID_PATTERN);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__FILTER);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN);

		pattern_DiffDecisionSupportEClass = createEClass(PATTERN_DIFF_DECISION_SUPPORT);
		createEAttribute(pattern_DiffDecisionSupportEClass, PATTERN_DIFF_DECISION_SUPPORT__ID_PATTERN);
		createEAttribute(pattern_DiffDecisionSupportEClass, PATTERN_DIFF_DECISION_SUPPORT__FILTER);
		createEAttribute(pattern_DiffDecisionSupportEClass, PATTERN_DIFF_DECISION_SUPPORT__IS_FORBIDDEN);

		pattern_DiffDecisionSupport_modelEClass = createEClass(PATTERN_DIFF_DECISION_SUPPORT_MODEL);
		createEAttribute(pattern_DiffDecisionSupport_modelEClass, PATTERN_DIFF_DECISION_SUPPORT_MODEL__ID_PATTERN);
		createEAttribute(pattern_DiffDecisionSupport_modelEClass, PATTERN_DIFF_DECISION_SUPPORT_MODEL__FILTER);
		createEAttribute(pattern_DiffDecisionSupport_modelEClass, PATTERN_DIFF_DECISION_SUPPORT_MODEL__IS_FORBIDDEN);

		pattern_DiffDecisionSupport_optionsEClass = createEClass(PATTERN_DIFF_DECISION_SUPPORT_OPTIONS);
		createEAttribute(pattern_DiffDecisionSupport_optionsEClass, PATTERN_DIFF_DECISION_SUPPORT_OPTIONS__ID_PATTERN);
		createEAttribute(pattern_DiffDecisionSupport_optionsEClass, PATTERN_DIFF_DECISION_SUPPORT_OPTIONS__FILTER);
		createEAttribute(pattern_DiffDecisionSupport_optionsEClass, PATTERN_DIFF_DECISION_SUPPORT_OPTIONS__IS_FORBIDDEN);

		pattern_DiffDecisionSupport_vendorsEClass = createEClass(PATTERN_DIFF_DECISION_SUPPORT_VENDORS);
		createEAttribute(pattern_DiffDecisionSupport_vendorsEClass, PATTERN_DIFF_DECISION_SUPPORT_VENDORS__ID_PATTERN);
		createEAttribute(pattern_DiffDecisionSupport_vendorsEClass, PATTERN_DIFF_DECISION_SUPPORT_VENDORS__FILTER);
		createEAttribute(pattern_DiffDecisionSupport_vendorsEClass, PATTERN_DIFF_DECISION_SUPPORT_VENDORS__IS_FORBIDDEN);

		pattern_DiffModelEClass = createEClass(PATTERN_DIFF_MODEL);
		createEAttribute(pattern_DiffModelEClass, PATTERN_DIFF_MODEL__ID_PATTERN);
		createEAttribute(pattern_DiffModelEClass, PATTERN_DIFF_MODEL__FILTER);
		createEAttribute(pattern_DiffModelEClass, PATTERN_DIFF_MODEL__IS_FORBIDDEN);

		pattern_DiffModel_rootFactorEClass = createEClass(PATTERN_DIFF_MODEL_ROOT_FACTOR);
		createEAttribute(pattern_DiffModel_rootFactorEClass, PATTERN_DIFF_MODEL_ROOT_FACTOR__ID_PATTERN);
		createEAttribute(pattern_DiffModel_rootFactorEClass, PATTERN_DIFF_MODEL_ROOT_FACTOR__FILTER);
		createEAttribute(pattern_DiffModel_rootFactorEClass, PATTERN_DIFF_MODEL_ROOT_FACTOR__IS_FORBIDDEN);

		pattern_DiffFactor_scoresEClass = createEClass(PATTERN_DIFF_FACTOR_SCORES);
		createEAttribute(pattern_DiffFactor_scoresEClass, PATTERN_DIFF_FACTOR_SCORES__ID_PATTERN);
		createEAttribute(pattern_DiffFactor_scoresEClass, PATTERN_DIFF_FACTOR_SCORES__FILTER);
		createEAttribute(pattern_DiffFactor_scoresEClass, PATTERN_DIFF_FACTOR_SCORES__IS_FORBIDDEN);

		pattern_DiffLeafFactorEClass = createEClass(PATTERN_DIFF_LEAF_FACTOR);
		createEAttribute(pattern_DiffLeafFactorEClass, PATTERN_DIFF_LEAF_FACTOR__ID_PATTERN);
		createEAttribute(pattern_DiffLeafFactorEClass, PATTERN_DIFF_LEAF_FACTOR__FILTER);
		createEAttribute(pattern_DiffLeafFactorEClass, PATTERN_DIFF_LEAF_FACTOR__IS_FORBIDDEN);

		pattern_DiffCompositeFactorEClass = createEClass(PATTERN_DIFF_COMPOSITE_FACTOR);
		createEAttribute(pattern_DiffCompositeFactorEClass, PATTERN_DIFF_COMPOSITE_FACTOR__ID_PATTERN);
		createEAttribute(pattern_DiffCompositeFactorEClass, PATTERN_DIFF_COMPOSITE_FACTOR__FILTER);
		createEAttribute(pattern_DiffCompositeFactorEClass, PATTERN_DIFF_COMPOSITE_FACTOR__IS_FORBIDDEN);

		pattern_DiffCompositeFactor_subFactorsEClass = createEClass(PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		createEAttribute(pattern_DiffCompositeFactor_subFactorsEClass, PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ID_PATTERN);
		createEAttribute(pattern_DiffCompositeFactor_subFactorsEClass, PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS__FILTER);
		createEAttribute(pattern_DiffCompositeFactor_subFactorsEClass, PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS__IS_FORBIDDEN);

		pattern_DiffOptionEClass = createEClass(PATTERN_DIFF_OPTION);
		createEAttribute(pattern_DiffOptionEClass, PATTERN_DIFF_OPTION__ID_PATTERN);
		createEAttribute(pattern_DiffOptionEClass, PATTERN_DIFF_OPTION__FILTER);
		createEAttribute(pattern_DiffOptionEClass, PATTERN_DIFF_OPTION__IS_FORBIDDEN);

		pattern_DiffOption_vendorEClass = createEClass(PATTERN_DIFF_OPTION_VENDOR);
		createEAttribute(pattern_DiffOption_vendorEClass, PATTERN_DIFF_OPTION_VENDOR__ID_PATTERN);
		createEAttribute(pattern_DiffOption_vendorEClass, PATTERN_DIFF_OPTION_VENDOR__FILTER);
		createEAttribute(pattern_DiffOption_vendorEClass, PATTERN_DIFF_OPTION_VENDOR__IS_FORBIDDEN);

		pattern_DiffVendorEClass = createEClass(PATTERN_DIFF_VENDOR);
		createEAttribute(pattern_DiffVendorEClass, PATTERN_DIFF_VENDOR__ID_PATTERN);
		createEAttribute(pattern_DiffVendorEClass, PATTERN_DIFF_VENDOR__FILTER);
		createEAttribute(pattern_DiffVendorEClass, PATTERN_DIFF_VENDOR__IS_FORBIDDEN);

		pattern_DiffScoreEClass = createEClass(PATTERN_DIFF_SCORE);
		createEAttribute(pattern_DiffScoreEClass, PATTERN_DIFF_SCORE__ID_PATTERN);
		createEAttribute(pattern_DiffScoreEClass, PATTERN_DIFF_SCORE__FILTER);
		createEAttribute(pattern_DiffScoreEClass, PATTERN_DIFF_SCORE__IS_FORBIDDEN);

		pattern_DiffScore_score_optionEClass = createEClass(PATTERN_DIFF_SCORE_SCORE_OPTION);
		createEAttribute(pattern_DiffScore_score_optionEClass, PATTERN_DIFF_SCORE_SCORE_OPTION__ID_PATTERN);
		createEAttribute(pattern_DiffScore_score_optionEClass, PATTERN_DIFF_SCORE_SCORE_OPTION__FILTER);
		createEAttribute(pattern_DiffScore_score_optionEClass, PATTERN_DIFF_SCORE_SCORE_OPTION__IS_FORBIDDEN);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DECISION_SUPPORT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_FACTOR_SCORES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_OPTION_VENDOR);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_FACTOR);
		createEReference(ruleEClass, RULE__RULE_PATTERN_MODEL);
		createEReference(ruleEClass, RULE__RULE_PATTERN_OPTION);
		createEReference(ruleEClass, RULE__RULE_PATTERN_SCORE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_VENDOR);
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
		Dssmm2WayDiffMMPackage theDssmm2WayDiffMMPackage = (Dssmm2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Dssmm2WayDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_DecisionSupportEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDecisionSupport());
		pattern_ModelEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getModel());
		pattern_FactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getFactor());
		pattern_LeafFactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getLeafFactor());
		pattern_CompositeFactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getCompositeFactor());
		pattern_OptionEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getOption());
		pattern_VendorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getVendor());
		pattern_ScoreEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getScore());
		pattern_SemanticObjectEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getSemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getSemanticDiff());
		pattern_SemanticConflictEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getSemanticConflict());
		pattern_DiffDecisionSupportEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffDecisionSupport());
		pattern_DiffDecisionSupport_modelEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffDecisionSupport_model());
		pattern_DiffDecisionSupport_optionsEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffDecisionSupport_options());
		pattern_DiffDecisionSupport_vendorsEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffDecisionSupport_vendors());
		pattern_DiffModelEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffModel());
		pattern_DiffModel_rootFactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffModel_rootFactor());
		pattern_DiffFactor_scoresEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffFactor_scores());
		pattern_DiffLeafFactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffLeafFactor());
		pattern_DiffCompositeFactorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffCompositeFactor());
		pattern_DiffCompositeFactor_subFactorsEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffCompositeFactor_subFactors());
		pattern_DiffOptionEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffOption());
		pattern_DiffOption_vendorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffOption_vendor());
		pattern_DiffVendorEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffVendor());
		pattern_DiffScoreEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffScore());
		pattern_DiffScore_score_optionEClass.getESuperTypes().add(theDssmm2WayDiffMMPackage.getDiffScore_score_option());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_DecisionSupportEClass, Pattern_DecisionSupport.class, "Pattern_DecisionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DecisionSupport_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DecisionSupport_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DecisionSupport_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ModelEClass, Pattern_Model.class, "Pattern_Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Model_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Model_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Model_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FactorEClass, Pattern_Factor.class, "Pattern_Factor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Factor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Factor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Factor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_LeafFactorEClass, Pattern_LeafFactor.class, "Pattern_LeafFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_LeafFactor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_LeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_LeafFactor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_LeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_LeafFactor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_LeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_CompositeFactorEClass, Pattern_CompositeFactor.class, "Pattern_CompositeFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_CompositeFactor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_CompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_CompositeFactor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_CompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_CompositeFactor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_CompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_OptionEClass, Pattern_Option.class, "Pattern_Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Option_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Option_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Option_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_VendorEClass, Pattern_Vendor.class, "Pattern_Vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Vendor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Vendor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Vendor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ScoreEClass, Pattern_Score.class, "Pattern_Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Score_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Score_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Score_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticObjectEClass, Pattern_SemanticObject.class, "Pattern_SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticDiffEClass, Pattern_SemanticDiff.class, "Pattern_SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticConflictEClass, Pattern_SemanticConflict.class, "Pattern_SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticConflict_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDecisionSupportEClass, Pattern_DiffDecisionSupport.class, "Pattern_DiffDecisionSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDecisionSupport_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffDecisionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDecisionSupport_modelEClass, Pattern_DiffDecisionSupport_model.class, "Pattern_DiffDecisionSupport_model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDecisionSupport_model_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_model_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_model_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffDecisionSupport_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDecisionSupport_optionsEClass, Pattern_DiffDecisionSupport_options.class, "Pattern_DiffDecisionSupport_options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDecisionSupport_options_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_options_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_options_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffDecisionSupport_options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffDecisionSupport_vendorsEClass, Pattern_DiffDecisionSupport_vendors.class, "Pattern_DiffDecisionSupport_vendors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffDecisionSupport_vendors_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_vendors_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffDecisionSupport_vendors_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffDecisionSupport_vendors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffModelEClass, Pattern_DiffModel.class, "Pattern_DiffModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffModel_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffModel_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffModel_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffModel_rootFactorEClass, Pattern_DiffModel_rootFactor.class, "Pattern_DiffModel_rootFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffModel_rootFactor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffModel_rootFactor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffModel_rootFactor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffModel_rootFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFactor_scoresEClass, Pattern_DiffFactor_scores.class, "Pattern_DiffFactor_scores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFactor_scores_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFactor_scores_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFactor_scores_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffFactor_scores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffLeafFactorEClass, Pattern_DiffLeafFactor.class, "Pattern_DiffLeafFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffLeafFactor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffLeafFactor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffLeafFactor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffLeafFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffCompositeFactorEClass, Pattern_DiffCompositeFactor.class, "Pattern_DiffCompositeFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffCompositeFactor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffCompositeFactor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffCompositeFactor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffCompositeFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffCompositeFactor_subFactorsEClass, Pattern_DiffCompositeFactor_subFactors.class, "Pattern_DiffCompositeFactor_subFactors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffCompositeFactor_subFactors_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffCompositeFactor_subFactors_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffCompositeFactor_subFactors_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffCompositeFactor_subFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffOptionEClass, Pattern_DiffOption.class, "Pattern_DiffOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffOption_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffOption_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffOption_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffOption_vendorEClass, Pattern_DiffOption_vendor.class, "Pattern_DiffOption_vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffOption_vendor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffOption_vendor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffOption_vendor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffOption_vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffVendorEClass, Pattern_DiffVendor.class, "Pattern_DiffVendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffVendor_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffVendor_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffVendor_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffVendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffScoreEClass, Pattern_DiffScore.class, "Pattern_DiffScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffScore_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffScore_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffScore_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffScore_score_optionEClass, Pattern_DiffScore_score_option.class, "Pattern_DiffScore_score_option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffScore_score_option_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffScore_score_option_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffScore_score_option_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffScore_score_option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DecisionSupport(), theDssmm2WayDiffMMPackage.getDecisionSupport(), null, "rulePattern_DecisionSupport", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffCompositeFactor_subFactors(), theDssmm2WayDiffMMPackage.getDiffCompositeFactor_subFactors(), null, "rulePattern_DiffCompositeFactor_subFactors", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffDecisionSupport_model(), theDssmm2WayDiffMMPackage.getDiffDecisionSupport_model(), null, "rulePattern_DiffDecisionSupport_model", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffDecisionSupport_options(), theDssmm2WayDiffMMPackage.getDiffDecisionSupport_options(), null, "rulePattern_DiffDecisionSupport_options", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffDecisionSupport_vendors(), theDssmm2WayDiffMMPackage.getDiffDecisionSupport_vendors(), null, "rulePattern_DiffDecisionSupport_vendors", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffFactor_scores(), theDssmm2WayDiffMMPackage.getDiffFactor_scores(), null, "rulePattern_DiffFactor_scores", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffModel_rootFactor(), theDssmm2WayDiffMMPackage.getDiffModel_rootFactor(), null, "rulePattern_DiffModel_rootFactor", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffOption_vendor(), theDssmm2WayDiffMMPackage.getDiffOption_vendor(), null, "rulePattern_DiffOption_vendor", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffScore_score_option(), theDssmm2WayDiffMMPackage.getDiffScore_score_option(), null, "rulePattern_DiffScore_score_option", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Factor(), theDssmm2WayDiffMMPackage.getFactor(), null, "rulePattern_Factor", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Model(), theDssmm2WayDiffMMPackage.getModel(), null, "rulePattern_Model", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Option(), theDssmm2WayDiffMMPackage.getOption(), null, "rulePattern_Option", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Score(), theDssmm2WayDiffMMPackage.getScore(), null, "rulePattern_Score", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_SemanticObject(), theDssmm2WayDiffMMPackage.getSemanticObject(), null, "rulePattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Vendor(), theDssmm2WayDiffMMPackage.getVendor(), null, "rulePattern_Vendor", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Dssmm2WayRuleMMPackageImpl
