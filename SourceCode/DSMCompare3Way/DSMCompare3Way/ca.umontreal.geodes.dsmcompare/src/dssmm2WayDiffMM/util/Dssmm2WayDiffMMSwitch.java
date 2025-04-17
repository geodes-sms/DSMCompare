/**
 */
package dssmm2WayDiffMM.util;

import dssmm2WayDiffMM.*;

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
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage
 * @generated
 */
public class Dssmm2WayDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dssmm2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Dssmm2WayDiffMMPackage.eINSTANCE;
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
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT: {
				DecisionSupport decisionSupport = (DecisionSupport)theEObject;
				T result = caseDecisionSupport(decisionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.FACTOR: {
				Factor factor = (Factor)theEObject;
				T result = caseFactor(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.LEAF_FACTOR: {
				LeafFactor leafFactor = (LeafFactor)theEObject;
				T result = caseLeafFactor(leafFactor);
				if (result == null) result = caseFactor(leafFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR: {
				CompositeFactor compositeFactor = (CompositeFactor)theEObject;
				T result = caseCompositeFactor(compositeFactor);
				if (result == null) result = caseFactor(compositeFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.VENDOR: {
				Vendor vendor = (Vendor)theEObject;
				T result = caseVendor(vendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.SCORE: {
				Score score = (Score)theEObject;
				T result = caseScore(score);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.SEMANTIC_OBJECT: {
				SemanticObject semanticObject = (SemanticObject)theEObject;
				T result = caseSemanticObject(semanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.SEMANTIC_DIFF: {
				SemanticDiff semanticDiff = (SemanticDiff)theEObject;
				T result = caseSemanticDiff(semanticDiff);
				if (result == null) result = caseSemanticObject(semanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.SEMANTIC_CONFLICT: {
				SemanticConflict semanticConflict = (SemanticConflict)theEObject;
				T result = caseSemanticConflict(semanticConflict);
				if (result == null) result = caseSemanticObject(semanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT: {
				DiffDecisionSupport diffDecisionSupport = (DiffDecisionSupport)theEObject;
				T result = caseDiffDecisionSupport(diffDecisionSupport);
				if (result == null) result = caseDecisionSupport(diffDecisionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_MODEL: {
				DiffDecisionSupport_model diffDecisionSupport_model = (DiffDecisionSupport_model)theEObject;
				T result = caseDiffDecisionSupport_model(diffDecisionSupport_model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_OPTIONS: {
				DiffDecisionSupport_options diffDecisionSupport_options = (DiffDecisionSupport_options)theEObject;
				T result = caseDiffDecisionSupport_options(diffDecisionSupport_options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT_VENDORS: {
				DiffDecisionSupport_vendors diffDecisionSupport_vendors = (DiffDecisionSupport_vendors)theEObject;
				T result = caseDiffDecisionSupport_vendors(diffDecisionSupport_vendors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_MODEL: {
				DiffModel diffModel = (DiffModel)theEObject;
				T result = caseDiffModel(diffModel);
				if (result == null) result = caseModel(diffModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_MODEL_ROOT_FACTOR: {
				DiffModel_rootFactor diffModel_rootFactor = (DiffModel_rootFactor)theEObject;
				T result = caseDiffModel_rootFactor(diffModel_rootFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_FACTOR_SCORES: {
				DiffFactor_scores diffFactor_scores = (DiffFactor_scores)theEObject;
				T result = caseDiffFactor_scores(diffFactor_scores);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR: {
				DiffLeafFactor diffLeafFactor = (DiffLeafFactor)theEObject;
				T result = caseDiffLeafFactor(diffLeafFactor);
				if (result == null) result = caseLeafFactor(diffLeafFactor);
				if (result == null) result = caseFactor(diffLeafFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR: {
				DiffCompositeFactor diffCompositeFactor = (DiffCompositeFactor)theEObject;
				T result = caseDiffCompositeFactor(diffCompositeFactor);
				if (result == null) result = caseCompositeFactor(diffCompositeFactor);
				if (result == null) result = caseFactor(diffCompositeFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS: {
				DiffCompositeFactor_subFactors diffCompositeFactor_subFactors = (DiffCompositeFactor_subFactors)theEObject;
				T result = caseDiffCompositeFactor_subFactors(diffCompositeFactor_subFactors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_OPTION: {
				DiffOption diffOption = (DiffOption)theEObject;
				T result = caseDiffOption(diffOption);
				if (result == null) result = caseOption(diffOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_OPTION_VENDOR: {
				DiffOption_vendor diffOption_vendor = (DiffOption_vendor)theEObject;
				T result = caseDiffOption_vendor(diffOption_vendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR: {
				DiffVendor diffVendor = (DiffVendor)theEObject;
				T result = caseDiffVendor(diffVendor);
				if (result == null) result = caseVendor(diffVendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_SCORE: {
				DiffScore diffScore = (DiffScore)theEObject;
				T result = caseDiffScore(diffScore);
				if (result == null) result = caseScore(diffScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayDiffMMPackage.DIFF_SCORE_SCORE_OPTION: {
				DiffScore_score_option diffScore_score_option = (DiffScore_score_option)theEObject;
				T result = caseDiffScore_score_option(diffScore_score_option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupport(DecisionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactor(Factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafFactor(LeafFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeFactor(CompositeFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendor(Vendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScore(Score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticObject(SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticDiff(SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticConflict(SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Decision Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDecisionSupport(DiffDecisionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Decision Support model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Decision Support model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDecisionSupport_model(DiffDecisionSupport_model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Decision Support options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Decision Support options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDecisionSupport_options(DiffDecisionSupport_options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Decision Support vendors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Decision Support vendors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffDecisionSupport_vendors(DiffDecisionSupport_vendors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffModel(DiffModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Model root Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Model root Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffModel_rootFactor(DiffModel_rootFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Factor scores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Factor scores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFactor_scores(DiffFactor_scores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Leaf Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffLeafFactor(DiffLeafFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Composite Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffCompositeFactor(DiffCompositeFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Composite Factor sub Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Composite Factor sub Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffCompositeFactor_subFactors(DiffCompositeFactor_subFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffOption(DiffOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Option vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Option vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffOption_vendor(DiffOption_vendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffVendor(DiffVendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffScore(DiffScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Score score option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Score score option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffScore_score_option(DiffScore_score_option object) {
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

} //Dssmm2WayDiffMMSwitch
