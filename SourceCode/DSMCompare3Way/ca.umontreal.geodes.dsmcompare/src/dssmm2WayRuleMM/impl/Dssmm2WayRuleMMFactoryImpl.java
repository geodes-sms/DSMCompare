/**
 */
package dssmm2WayRuleMM.impl;

import dssmm2WayRuleMM.*;

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
public class Dssmm2WayRuleMMFactoryImpl extends EFactoryImpl implements Dssmm2WayRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dssmm2WayRuleMMFactory init() {
		try {
			Dssmm2WayRuleMMFactory theDssmm2WayRuleMMFactory = (Dssmm2WayRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(Dssmm2WayRuleMMPackage.eNS_URI);
			if (theDssmm2WayRuleMMFactory != null) {
				return theDssmm2WayRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dssmm2WayRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayRuleMMFactoryImpl() {
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
			case Dssmm2WayRuleMMPackage.PATTERN_DECISION_SUPPORT: return createPattern_DecisionSupport();
			case Dssmm2WayRuleMMPackage.PATTERN_MODEL: return createPattern_Model();
			case Dssmm2WayRuleMMPackage.PATTERN_LEAF_FACTOR: return createPattern_LeafFactor();
			case Dssmm2WayRuleMMPackage.PATTERN_COMPOSITE_FACTOR: return createPattern_CompositeFactor();
			case Dssmm2WayRuleMMPackage.PATTERN_OPTION: return createPattern_Option();
			case Dssmm2WayRuleMMPackage.PATTERN_VENDOR: return createPattern_Vendor();
			case Dssmm2WayRuleMMPackage.PATTERN_SCORE: return createPattern_Score();
			case Dssmm2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case Dssmm2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT: return createPattern_DiffDecisionSupport();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_MODEL: return createPattern_DiffDecisionSupport_model();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_OPTIONS: return createPattern_DiffDecisionSupport_options();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_VENDORS: return createPattern_DiffDecisionSupport_vendors();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_MODEL: return createPattern_DiffModel();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_MODEL_ROOT_FACTOR: return createPattern_DiffModel_rootFactor();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_FACTOR_SCORES: return createPattern_DiffFactor_scores();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_LEAF_FACTOR: return createPattern_DiffLeafFactor();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_COMPOSITE_FACTOR: return createPattern_DiffCompositeFactor();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS: return createPattern_DiffCompositeFactor_subFactors();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_OPTION: return createPattern_DiffOption();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_OPTION_VENDOR: return createPattern_DiffOption_vendor();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_VENDOR: return createPattern_DiffVendor();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_SCORE: return createPattern_DiffScore();
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_SCORE_SCORE_OPTION: return createPattern_DiffScore_score_option();
			case Dssmm2WayRuleMMPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DecisionSupport createPattern_DecisionSupport() {
		Pattern_DecisionSupportImpl pattern_DecisionSupport = new Pattern_DecisionSupportImpl();
		return pattern_DecisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Model createPattern_Model() {
		Pattern_ModelImpl pattern_Model = new Pattern_ModelImpl();
		return pattern_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_LeafFactor createPattern_LeafFactor() {
		Pattern_LeafFactorImpl pattern_LeafFactor = new Pattern_LeafFactorImpl();
		return pattern_LeafFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_CompositeFactor createPattern_CompositeFactor() {
		Pattern_CompositeFactorImpl pattern_CompositeFactor = new Pattern_CompositeFactorImpl();
		return pattern_CompositeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Option createPattern_Option() {
		Pattern_OptionImpl pattern_Option = new Pattern_OptionImpl();
		return pattern_Option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Vendor createPattern_Vendor() {
		Pattern_VendorImpl pattern_Vendor = new Pattern_VendorImpl();
		return pattern_Vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Score createPattern_Score() {
		Pattern_ScoreImpl pattern_Score = new Pattern_ScoreImpl();
		return pattern_Score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticDiff createPattern_SemanticDiff() {
		Pattern_SemanticDiffImpl pattern_SemanticDiff = new Pattern_SemanticDiffImpl();
		return pattern_SemanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffDecisionSupport createPattern_DiffDecisionSupport() {
		Pattern_DiffDecisionSupportImpl pattern_DiffDecisionSupport = new Pattern_DiffDecisionSupportImpl();
		return pattern_DiffDecisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffDecisionSupport_model createPattern_DiffDecisionSupport_model() {
		Pattern_DiffDecisionSupport_modelImpl pattern_DiffDecisionSupport_model = new Pattern_DiffDecisionSupport_modelImpl();
		return pattern_DiffDecisionSupport_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffDecisionSupport_options createPattern_DiffDecisionSupport_options() {
		Pattern_DiffDecisionSupport_optionsImpl pattern_DiffDecisionSupport_options = new Pattern_DiffDecisionSupport_optionsImpl();
		return pattern_DiffDecisionSupport_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffDecisionSupport_vendors createPattern_DiffDecisionSupport_vendors() {
		Pattern_DiffDecisionSupport_vendorsImpl pattern_DiffDecisionSupport_vendors = new Pattern_DiffDecisionSupport_vendorsImpl();
		return pattern_DiffDecisionSupport_vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffModel createPattern_DiffModel() {
		Pattern_DiffModelImpl pattern_DiffModel = new Pattern_DiffModelImpl();
		return pattern_DiffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffModel_rootFactor createPattern_DiffModel_rootFactor() {
		Pattern_DiffModel_rootFactorImpl pattern_DiffModel_rootFactor = new Pattern_DiffModel_rootFactorImpl();
		return pattern_DiffModel_rootFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffFactor_scores createPattern_DiffFactor_scores() {
		Pattern_DiffFactor_scoresImpl pattern_DiffFactor_scores = new Pattern_DiffFactor_scoresImpl();
		return pattern_DiffFactor_scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffLeafFactor createPattern_DiffLeafFactor() {
		Pattern_DiffLeafFactorImpl pattern_DiffLeafFactor = new Pattern_DiffLeafFactorImpl();
		return pattern_DiffLeafFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffCompositeFactor createPattern_DiffCompositeFactor() {
		Pattern_DiffCompositeFactorImpl pattern_DiffCompositeFactor = new Pattern_DiffCompositeFactorImpl();
		return pattern_DiffCompositeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffCompositeFactor_subFactors createPattern_DiffCompositeFactor_subFactors() {
		Pattern_DiffCompositeFactor_subFactorsImpl pattern_DiffCompositeFactor_subFactors = new Pattern_DiffCompositeFactor_subFactorsImpl();
		return pattern_DiffCompositeFactor_subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffOption createPattern_DiffOption() {
		Pattern_DiffOptionImpl pattern_DiffOption = new Pattern_DiffOptionImpl();
		return pattern_DiffOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffOption_vendor createPattern_DiffOption_vendor() {
		Pattern_DiffOption_vendorImpl pattern_DiffOption_vendor = new Pattern_DiffOption_vendorImpl();
		return pattern_DiffOption_vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffVendor createPattern_DiffVendor() {
		Pattern_DiffVendorImpl pattern_DiffVendor = new Pattern_DiffVendorImpl();
		return pattern_DiffVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffScore createPattern_DiffScore() {
		Pattern_DiffScoreImpl pattern_DiffScore = new Pattern_DiffScoreImpl();
		return pattern_DiffScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffScore_score_option createPattern_DiffScore_score_option() {
		Pattern_DiffScore_score_optionImpl pattern_DiffScore_score_option = new Pattern_DiffScore_score_optionImpl();
		return pattern_DiffScore_score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayRuleMMPackage getDssmm2WayRuleMMPackage() {
		return (Dssmm2WayRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dssmm2WayRuleMMPackage getPackage() {
		return Dssmm2WayRuleMMPackage.eINSTANCE;
	}

} //Dssmm2WayRuleMMFactoryImpl
