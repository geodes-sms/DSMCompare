/**
 */
package dssmmDiffMM.util;

import dssmmDiffMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dssmmDiffMM.DssmmDiffMMPackage
 * @generated
 */
public class DssmmDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DssmmDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DssmmDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DssmmDiffMMPackage.eINSTANCE;
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
	protected DssmmDiffMMSwitch<Adapter> modelSwitch =
		new DssmmDiffMMSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DecisionSupport <em>Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DecisionSupport
	 * @generated
	 */
	public Adapter createDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.LeafFactor <em>Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.LeafFactor
	 * @generated
	 */
	public Adapter createLeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.CompositeFactor <em>Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.CompositeFactor
	 * @generated
	 */
	public Adapter createCompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.Vendor
	 * @generated
	 */
	public Adapter createVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.Score
	 * @generated
	 */
	public Adapter createScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.SemanticObject
	 * @generated
	 */
	public Adapter createSemanticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.SemanticDiff
	 * @generated
	 */
	public Adapter createSemanticDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.SemanticConflict
	 * @generated
	 */
	public Adapter createSemanticConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffDecisionSupport <em>Diff Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffDecisionSupport
	 * @generated
	 */
	public Adapter createDiffDecisionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffDecisionSupport_model <em>Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffDecisionSupport_model
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_modelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffDecisionSupport_options <em>Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffDecisionSupport_options
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_optionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffDecisionSupport_vendors <em>Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors
	 * @generated
	 */
	public Adapter createDiffDecisionSupport_vendorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffModel
	 * @generated
	 */
	public Adapter createDiffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffModel_rootFactor <em>Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffModel_rootFactor
	 * @generated
	 */
	public Adapter createDiffModel_rootFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffFactor_scores <em>Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffFactor_scores
	 * @generated
	 */
	public Adapter createDiffFactor_scoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffLeafFactor <em>Diff Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffLeafFactor
	 * @generated
	 */
	public Adapter createDiffLeafFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffCompositeFactor <em>Diff Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffCompositeFactor
	 * @generated
	 */
	public Adapter createDiffCompositeFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffCompositeFactor_subFactors <em>Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors
	 * @generated
	 */
	public Adapter createDiffCompositeFactor_subFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffOption <em>Diff Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffOption
	 * @generated
	 */
	public Adapter createDiffOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffOption_vendor <em>Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffOption_vendor
	 * @generated
	 */
	public Adapter createDiffOption_vendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffVendor <em>Diff Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffVendor
	 * @generated
	 */
	public Adapter createDiffVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffScore <em>Diff Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffScore
	 * @generated
	 */
	public Adapter createDiffScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dssmmDiffMM.DiffScore_score_option <em>Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dssmmDiffMM.DiffScore_score_option
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

} //DssmmDiffMMAdapterFactory
