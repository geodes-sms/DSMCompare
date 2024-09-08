/**
 */
package dssmm2WayRuleMM.util;

import dssmm2WayDiffMM.CompositeFactor;
import dssmm2WayDiffMM.DecisionSupport;
import dssmm2WayDiffMM.DiffCompositeFactor;
import dssmm2WayDiffMM.DiffCompositeFactor_subFactors;
import dssmm2WayDiffMM.DiffDecisionSupport;
import dssmm2WayDiffMM.DiffDecisionSupport_model;
import dssmm2WayDiffMM.DiffDecisionSupport_options;
import dssmm2WayDiffMM.DiffDecisionSupport_vendors;
import dssmm2WayDiffMM.DiffFactor_scores;
import dssmm2WayDiffMM.DiffLeafFactor;
import dssmm2WayDiffMM.DiffModel;
import dssmm2WayDiffMM.DiffModel_rootFactor;
import dssmm2WayDiffMM.DiffOption;
import dssmm2WayDiffMM.DiffOption_vendor;
import dssmm2WayDiffMM.DiffScore;
import dssmm2WayDiffMM.DiffScore_score_option;
import dssmm2WayDiffMM.DiffVendor;
import dssmm2WayDiffMM.Factor;
import dssmm2WayDiffMM.LeafFactor;
import dssmm2WayDiffMM.Model;
import dssmm2WayDiffMM.Option;
import dssmm2WayDiffMM.Score;
import dssmm2WayDiffMM.SemanticConflict;
import dssmm2WayDiffMM.SemanticDiff;
import dssmm2WayDiffMM.SemanticObject;
import dssmm2WayDiffMM.Vendor;

import dssmm2WayRuleMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage
 * @generated
 */
public class Dssmm2WayRuleMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dssmm2WayRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayRuleMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dssmm2WayRuleMMPackage.eINSTANCE;
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
	protected Dssmm2WayRuleMMSwitch<Adapter> modelSwitch =
		new Dssmm2WayRuleMMSwitch<Adapter>() {
			@Override
			public Adapter casePattern_DecisionSupport(Pattern_DecisionSupport object) {
				return createPattern_DecisionSupportAdapter();
			}
			@Override
			public Adapter casePattern_Model(Pattern_Model object) {
				return createPattern_ModelAdapter();
			}
			@Override
			public Adapter casePattern_Factor(Pattern_Factor object) {
				return createPattern_FactorAdapter();
			}
			@Override
			public Adapter casePattern_LeafFactor(Pattern_LeafFactor object) {
				return createPattern_LeafFactorAdapter();
			}
			@Override
			public Adapter casePattern_CompositeFactor(Pattern_CompositeFactor object) {
				return createPattern_CompositeFactorAdapter();
			}
			@Override
			public Adapter casePattern_Option(Pattern_Option object) {
				return createPattern_OptionAdapter();
			}
			@Override
			public Adapter casePattern_Vendor(Pattern_Vendor object) {
				return createPattern_VendorAdapter();
			}
			@Override
			public Adapter casePattern_Score(Pattern_Score object) {
				return createPattern_ScoreAdapter();
			}
			@Override
			public Adapter casePattern_SemanticObject(Pattern_SemanticObject object) {
				return createPattern_SemanticObjectAdapter();
			}
			@Override
			public Adapter casePattern_SemanticDiff(Pattern_SemanticDiff object) {
				return createPattern_SemanticDiffAdapter();
			}
			@Override
			public Adapter casePattern_SemanticConflict(Pattern_SemanticConflict object) {
				return createPattern_SemanticConflictAdapter();
			}
			@Override
			public Adapter casePattern_DiffDecisionSupport(Pattern_DiffDecisionSupport object) {
				return createPattern_DiffDecisionSupportAdapter();
			}
			@Override
			public Adapter casePattern_DiffDecisionSupport_model(Pattern_DiffDecisionSupport_model object) {
				return createPattern_DiffDecisionSupport_modelAdapter();
			}
			@Override
			public Adapter casePattern_DiffDecisionSupport_options(Pattern_DiffDecisionSupport_options object) {
				return createPattern_DiffDecisionSupport_optionsAdapter();
			}
			@Override
			public Adapter casePattern_DiffDecisionSupport_vendors(Pattern_DiffDecisionSupport_vendors object) {
				return createPattern_DiffDecisionSupport_vendorsAdapter();
			}
			@Override
			public Adapter casePattern_DiffModel(Pattern_DiffModel object) {
				return createPattern_DiffModelAdapter();
			}
			@Override
			public Adapter casePattern_DiffModel_rootFactor(Pattern_DiffModel_rootFactor object) {
				return createPattern_DiffModel_rootFactorAdapter();
			}
			@Override
			public Adapter casePattern_DiffFactor_scores(Pattern_DiffFactor_scores object) {
				return createPattern_DiffFactor_scoresAdapter();
			}
			@Override
			public Adapter casePattern_DiffLeafFactor(Pattern_DiffLeafFactor object) {
				return createPattern_DiffLeafFactorAdapter();
			}
			@Override
			public Adapter casePattern_DiffCompositeFactor(Pattern_DiffCompositeFactor object) {
				return createPattern_DiffCompositeFactorAdapter();
			}
			@Override
			public Adapter casePattern_DiffCompositeFactor_subFactors(Pattern_DiffCompositeFactor_subFactors object) {
				return createPattern_DiffCompositeFactor_subFactorsAdapter();
			}
			@Override
			public Adapter casePattern_DiffOption(Pattern_DiffOption object) {
				return createPattern_DiffOptionAdapter();
			}
			@Override
			public Adapter casePattern_DiffOption_vendor(Pattern_DiffOption_vendor object) {
				return createPattern_DiffOption_vendorAdapter();
			}
			@Override
			public Adapter casePattern_DiffVendor(Pattern_DiffVendor object) {
				return createPattern_DiffVendorAdapter();
			}
			@Override
			public Adapter casePattern_DiffScore(Pattern_DiffScore object) {
				return createPattern_DiffScoreAdapter();
			}
			@Override
			public Adapter casePattern_DiffScore_score_option(Pattern_DiffScore_score_option object) {
				return createPattern_DiffScore_score_optionAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseDecisionSupport(DecisionSupport object) {
				return createDecisionSupportAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseFactor(Factor object) {
				return createFactorAdapter();
			}
			@Override
			public Adapter caseLeafFactor(LeafFactor object) {
				return createLeafFactorAdapter();
			}
			@Override
			public Adapter caseCompositeFactor(CompositeFactor object) {
				return createCompositeFactorAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseVendor(Vendor object) {
				return createVendorAdapter();
			}
			@Override
			public Adapter caseScore(Score object) {
				return createScoreAdapter();
			}
			@Override
			public Adapter caseSemanticObject(SemanticObject object) {
				return createSemanticObjectAdapter();
			}
			@Override
			public Adapter caseSemanticDiff(SemanticDiff object) {
				return createSemanticDiffAdapter();
			}
			@Override
			public Adapter caseSemanticConflict(SemanticConflict object) {
				return createSemanticConflictAdapter();
			}
			@Override
			public Adapter caseDiffDecisionSupport(DiffDecisionSupport object) {
				return createDiffDecisionSupportAdapter();
			}
			@Override
			public Adapter caseDiffDecisionSupport_model(DiffDecisionSupport_model object) {
				return createDiffDecisionSupport_modelAdapter();
			}
			@Override
			public Adapter caseDiffDecisionSupport_options(DiffDecisionSupport_options object) {
				return createDiffDecisionSupport_optionsAdapter();
			}
			@Override
			public Adapter caseDiffDecisionSupport_vendors(DiffDecisionSupport_vendors object) {
				return createDiffDecisionSupport_vendorsAdapter();
			}
			@Override
			public Adapter caseDiffModel(DiffModel object) {
				return createDiffModelAdapter();
			}
			@Override
			public Adapter caseDiffModel_rootFactor(DiffModel_rootFactor object) {
				return createDiffModel_rootFactorAdapter();
			}
			@Override
			public Adapter caseDiffFactor_scores(DiffFactor_scores object) {
				return createDiffFactor_scoresAdapter();
			}
			@Override
			public Adapter caseDiffLeafFactor(DiffLeafFactor object) {
				return createDiffLeafFactorAdapter();
			}
			@Override
			public Adapter caseDiffCompositeFactor(DiffCompositeFactor object) {
				return createDiffCompositeFactorAdapter();
			}
			@Override
			public Adapter caseDiffCompositeFactor_subFactors(DiffCompositeFactor_subFactors object) {
				return createDiffCompositeFactor_subFactorsAdapter();
			}
			@Override
			public Adapter caseDiffOption(DiffOption object) {
				return createDiffOptionAdapter();
			}
			@Override
			public Adapter caseDiffOption_vendor(DiffOption_vendor object) {
				return createDiffOption_vendorAdapter();
			}
			@Override
			public Adapter caseDiffVendor(DiffVendor object) {
				return createDiffVendorAdapter();
			}
			@Override
			public Adapter caseDiffScore(DiffScore object) {
				return createDiffScoreAdapter();
			}
			@Override
			public Adapter caseDiffScore_score_option(DiffScore_score_option object) {
				return createDiffScore_score_optionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DecisionSupport <em>Pattern Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DecisionSupport
	 * @generated
	 */
	public Adapter createPattern_DecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_Model <em>Pattern Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_Model
	 * @generated
	 */
	public Adapter createPattern_ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_Factor <em>Pattern Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_Factor
	 * @generated
	 */
	public Adapter createPattern_FactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_LeafFactor <em>Pattern Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_LeafFactor
	 * @generated
	 */
	public Adapter createPattern_LeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_CompositeFactor <em>Pattern Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_CompositeFactor
	 * @generated
	 */
	public Adapter createPattern_CompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_Option <em>Pattern Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_Option
	 * @generated
	 */
	public Adapter createPattern_OptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_Vendor <em>Pattern Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_Vendor
	 * @generated
	 */
	public Adapter createPattern_VendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_Score <em>Pattern Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_Score
	 * @generated
	 */
	public Adapter createPattern_ScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	public Adapter createPattern_SemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	public Adapter createPattern_SemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	public Adapter createPattern_SemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffDecisionSupport <em>Pattern Diff Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffDecisionSupport
	 * @generated
	 */
	public Adapter createPattern_DiffDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffDecisionSupport_model <em>Pattern Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffDecisionSupport_model
	 * @generated
	 */
	public Adapter createPattern_DiffDecisionSupport_modelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffDecisionSupport_options <em>Pattern Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffDecisionSupport_options
	 * @generated
	 */
	public Adapter createPattern_DiffDecisionSupport_optionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffDecisionSupport_vendors <em>Pattern Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffDecisionSupport_vendors
	 * @generated
	 */
	public Adapter createPattern_DiffDecisionSupport_vendorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffModel <em>Pattern Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffModel
	 * @generated
	 */
	public Adapter createPattern_DiffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffModel_rootFactor <em>Pattern Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffModel_rootFactor
	 * @generated
	 */
	public Adapter createPattern_DiffModel_rootFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffFactor_scores <em>Pattern Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffFactor_scores
	 * @generated
	 */
	public Adapter createPattern_DiffFactor_scoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffLeafFactor <em>Pattern Diff Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffLeafFactor
	 * @generated
	 */
	public Adapter createPattern_DiffLeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffCompositeFactor <em>Pattern Diff Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffCompositeFactor
	 * @generated
	 */
	public Adapter createPattern_DiffCompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffCompositeFactor_subFactors <em>Pattern Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffCompositeFactor_subFactors
	 * @generated
	 */
	public Adapter createPattern_DiffCompositeFactor_subFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffOption <em>Pattern Diff Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffOption
	 * @generated
	 */
	public Adapter createPattern_DiffOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffOption_vendor <em>Pattern Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffOption_vendor
	 * @generated
	 */
	public Adapter createPattern_DiffOption_vendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffVendor <em>Pattern Diff Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffVendor
	 * @generated
	 */
	public Adapter createPattern_DiffVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffScore <em>Pattern Diff Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffScore
	 * @generated
	 */
	public Adapter createPattern_DiffScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Pattern_DiffScore_score_option <em>Pattern Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Pattern_DiffScore_score_option
	 * @generated
	 */
	public Adapter createPattern_DiffScore_score_optionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayRuleMM.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DecisionSupport <em>Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DecisionSupport
	 * @generated
	 */
	public Adapter createDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.LeafFactor <em>Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.LeafFactor
	 * @generated
	 */
	public Adapter createLeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.CompositeFactor <em>Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.CompositeFactor
	 * @generated
	 */
	public Adapter createCompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.Vendor
	 * @generated
	 */
	public Adapter createVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.Score
	 * @generated
	 */
	public Adapter createScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.SemanticObject
	 * @generated
	 */
	public Adapter createSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.SemanticDiff
	 * @generated
	 */
	public Adapter createSemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.SemanticConflict
	 * @generated
	 */
	public Adapter createSemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffDecisionSupport <em>Diff Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport
	 * @generated
	 */
	public Adapter createDiffDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffDecisionSupport_model <em>Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_model
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_modelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffDecisionSupport_options <em>Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_options
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_optionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffDecisionSupport_vendors <em>Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_vendors
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_vendorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffModel
	 * @generated
	 */
	public Adapter createDiffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffModel_rootFactor <em>Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffModel_rootFactor
	 * @generated
	 */
	public Adapter createDiffModel_rootFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffFactor_scores <em>Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffFactor_scores
	 * @generated
	 */
	public Adapter createDiffFactor_scoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffLeafFactor <em>Diff Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffLeafFactor
	 * @generated
	 */
	public Adapter createDiffLeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffCompositeFactor <em>Diff Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor
	 * @generated
	 */
	public Adapter createDiffCompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffCompositeFactor_subFactors <em>Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor_subFactors
	 * @generated
	 */
	public Adapter createDiffCompositeFactor_subFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffOption <em>Diff Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffOption
	 * @generated
	 */
	public Adapter createDiffOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffOption_vendor <em>Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffOption_vendor
	 * @generated
	 */
	public Adapter createDiffOption_vendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffVendor <em>Diff Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffVendor
	 * @generated
	 */
	public Adapter createDiffVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffScore <em>Diff Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffScore
	 * @generated
	 */
	public Adapter createDiffScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmm2WayDiffMM.DiffScore_score_option <em>Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmm2WayDiffMM.DiffScore_score_option
	 * @generated
	 */
	public Adapter createDiffScore_score_optionAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dssmm2WayRuleMMAdapterFactory
