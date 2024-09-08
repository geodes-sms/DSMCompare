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
 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage
 * @generated
 */
public class Dssmm2WayRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dssmm2WayRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dssmm2WayRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Dssmm2WayRuleMMPackage.eINSTANCE;
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
			case Dssmm2WayRuleMMPackage.PATTERN_DECISION_SUPPORT: {
				Pattern_DecisionSupport pattern_DecisionSupport = (Pattern_DecisionSupport)theEObject;
				T result = casePattern_DecisionSupport(pattern_DecisionSupport);
				if (result == null) result = caseDecisionSupport(pattern_DecisionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_MODEL: {
				Pattern_Model pattern_Model = (Pattern_Model)theEObject;
				T result = casePattern_Model(pattern_Model);
				if (result == null) result = caseModel(pattern_Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_FACTOR: {
				Pattern_Factor pattern_Factor = (Pattern_Factor)theEObject;
				T result = casePattern_Factor(pattern_Factor);
				if (result == null) result = caseFactor(pattern_Factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_LEAF_FACTOR: {
				Pattern_LeafFactor pattern_LeafFactor = (Pattern_LeafFactor)theEObject;
				T result = casePattern_LeafFactor(pattern_LeafFactor);
				if (result == null) result = caseLeafFactor(pattern_LeafFactor);
				if (result == null) result = caseFactor(pattern_LeafFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_COMPOSITE_FACTOR: {
				Pattern_CompositeFactor pattern_CompositeFactor = (Pattern_CompositeFactor)theEObject;
				T result = casePattern_CompositeFactor(pattern_CompositeFactor);
				if (result == null) result = caseCompositeFactor(pattern_CompositeFactor);
				if (result == null) result = caseFactor(pattern_CompositeFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_OPTION: {
				Pattern_Option pattern_Option = (Pattern_Option)theEObject;
				T result = casePattern_Option(pattern_Option);
				if (result == null) result = caseOption(pattern_Option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_VENDOR: {
				Pattern_Vendor pattern_Vendor = (Pattern_Vendor)theEObject;
				T result = casePattern_Vendor(pattern_Vendor);
				if (result == null) result = caseVendor(pattern_Vendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_SCORE: {
				Pattern_Score pattern_Score = (Pattern_Score)theEObject;
				T result = casePattern_Score(pattern_Score);
				if (result == null) result = caseScore(pattern_Score);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_SEMANTIC_OBJECT: {
				Pattern_SemanticObject pattern_SemanticObject = (Pattern_SemanticObject)theEObject;
				T result = casePattern_SemanticObject(pattern_SemanticObject);
				if (result == null) result = caseSemanticObject(pattern_SemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: {
				Pattern_SemanticDiff pattern_SemanticDiff = (Pattern_SemanticDiff)theEObject;
				T result = casePattern_SemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticObject(pattern_SemanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: {
				Pattern_SemanticConflict pattern_SemanticConflict = (Pattern_SemanticConflict)theEObject;
				T result = casePattern_SemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticObject(pattern_SemanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT: {
				Pattern_DiffDecisionSupport pattern_DiffDecisionSupport = (Pattern_DiffDecisionSupport)theEObject;
				T result = casePattern_DiffDecisionSupport(pattern_DiffDecisionSupport);
				if (result == null) result = caseDiffDecisionSupport(pattern_DiffDecisionSupport);
				if (result == null) result = caseDecisionSupport(pattern_DiffDecisionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_MODEL: {
				Pattern_DiffDecisionSupport_model pattern_DiffDecisionSupport_model = (Pattern_DiffDecisionSupport_model)theEObject;
				T result = casePattern_DiffDecisionSupport_model(pattern_DiffDecisionSupport_model);
				if (result == null) result = caseDiffDecisionSupport_model(pattern_DiffDecisionSupport_model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_OPTIONS: {
				Pattern_DiffDecisionSupport_options pattern_DiffDecisionSupport_options = (Pattern_DiffDecisionSupport_options)theEObject;
				T result = casePattern_DiffDecisionSupport_options(pattern_DiffDecisionSupport_options);
				if (result == null) result = caseDiffDecisionSupport_options(pattern_DiffDecisionSupport_options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_DECISION_SUPPORT_VENDORS: {
				Pattern_DiffDecisionSupport_vendors pattern_DiffDecisionSupport_vendors = (Pattern_DiffDecisionSupport_vendors)theEObject;
				T result = casePattern_DiffDecisionSupport_vendors(pattern_DiffDecisionSupport_vendors);
				if (result == null) result = caseDiffDecisionSupport_vendors(pattern_DiffDecisionSupport_vendors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_MODEL: {
				Pattern_DiffModel pattern_DiffModel = (Pattern_DiffModel)theEObject;
				T result = casePattern_DiffModel(pattern_DiffModel);
				if (result == null) result = caseDiffModel(pattern_DiffModel);
				if (result == null) result = caseModel(pattern_DiffModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_MODEL_ROOT_FACTOR: {
				Pattern_DiffModel_rootFactor pattern_DiffModel_rootFactor = (Pattern_DiffModel_rootFactor)theEObject;
				T result = casePattern_DiffModel_rootFactor(pattern_DiffModel_rootFactor);
				if (result == null) result = caseDiffModel_rootFactor(pattern_DiffModel_rootFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_FACTOR_SCORES: {
				Pattern_DiffFactor_scores pattern_DiffFactor_scores = (Pattern_DiffFactor_scores)theEObject;
				T result = casePattern_DiffFactor_scores(pattern_DiffFactor_scores);
				if (result == null) result = caseDiffFactor_scores(pattern_DiffFactor_scores);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_LEAF_FACTOR: {
				Pattern_DiffLeafFactor pattern_DiffLeafFactor = (Pattern_DiffLeafFactor)theEObject;
				T result = casePattern_DiffLeafFactor(pattern_DiffLeafFactor);
				if (result == null) result = caseDiffLeafFactor(pattern_DiffLeafFactor);
				if (result == null) result = caseLeafFactor(pattern_DiffLeafFactor);
				if (result == null) result = caseFactor(pattern_DiffLeafFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_COMPOSITE_FACTOR: {
				Pattern_DiffCompositeFactor pattern_DiffCompositeFactor = (Pattern_DiffCompositeFactor)theEObject;
				T result = casePattern_DiffCompositeFactor(pattern_DiffCompositeFactor);
				if (result == null) result = caseDiffCompositeFactor(pattern_DiffCompositeFactor);
				if (result == null) result = caseCompositeFactor(pattern_DiffCompositeFactor);
				if (result == null) result = caseFactor(pattern_DiffCompositeFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS: {
				Pattern_DiffCompositeFactor_subFactors pattern_DiffCompositeFactor_subFactors = (Pattern_DiffCompositeFactor_subFactors)theEObject;
				T result = casePattern_DiffCompositeFactor_subFactors(pattern_DiffCompositeFactor_subFactors);
				if (result == null) result = caseDiffCompositeFactor_subFactors(pattern_DiffCompositeFactor_subFactors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_OPTION: {
				Pattern_DiffOption pattern_DiffOption = (Pattern_DiffOption)theEObject;
				T result = casePattern_DiffOption(pattern_DiffOption);
				if (result == null) result = caseDiffOption(pattern_DiffOption);
				if (result == null) result = caseOption(pattern_DiffOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_OPTION_VENDOR: {
				Pattern_DiffOption_vendor pattern_DiffOption_vendor = (Pattern_DiffOption_vendor)theEObject;
				T result = casePattern_DiffOption_vendor(pattern_DiffOption_vendor);
				if (result == null) result = caseDiffOption_vendor(pattern_DiffOption_vendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_VENDOR: {
				Pattern_DiffVendor pattern_DiffVendor = (Pattern_DiffVendor)theEObject;
				T result = casePattern_DiffVendor(pattern_DiffVendor);
				if (result == null) result = caseDiffVendor(pattern_DiffVendor);
				if (result == null) result = caseVendor(pattern_DiffVendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_SCORE: {
				Pattern_DiffScore pattern_DiffScore = (Pattern_DiffScore)theEObject;
				T result = casePattern_DiffScore(pattern_DiffScore);
				if (result == null) result = caseDiffScore(pattern_DiffScore);
				if (result == null) result = caseScore(pattern_DiffScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.PATTERN_DIFF_SCORE_SCORE_OPTION: {
				Pattern_DiffScore_score_option pattern_DiffScore_score_option = (Pattern_DiffScore_score_option)theEObject;
				T result = casePattern_DiffScore_score_option(pattern_DiffScore_score_option);
				if (result == null) result = caseDiffScore_score_option(pattern_DiffScore_score_option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dssmm2WayRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Decision Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DecisionSupport(Pattern_DecisionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Model(Pattern_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Factor(Pattern_Factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Leaf Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_LeafFactor(Pattern_LeafFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Composite Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_CompositeFactor(Pattern_CompositeFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Option(Pattern_Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Vendor(Pattern_Vendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Score(Pattern_Score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticObject(Pattern_SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticDiff(Pattern_SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticConflict(Pattern_SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDecisionSupport(Pattern_DiffDecisionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDecisionSupport_model(Pattern_DiffDecisionSupport_model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDecisionSupport_options(Pattern_DiffDecisionSupport_options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support vendors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Decision Support vendors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffDecisionSupport_vendors(Pattern_DiffDecisionSupport_vendors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffModel(Pattern_DiffModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Model root Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Model root Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffModel_rootFactor(Pattern_DiffModel_rootFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Factor scores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Factor scores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFactor_scores(Pattern_DiffFactor_scores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Leaf Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffLeafFactor(Pattern_DiffLeafFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Composite Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffCompositeFactor(Pattern_DiffCompositeFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Composite Factor sub Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Composite Factor sub Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffCompositeFactor_subFactors(Pattern_DiffCompositeFactor_subFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffOption(Pattern_DiffOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Option vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Option vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffOption_vendor(Pattern_DiffOption_vendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffVendor(Pattern_DiffVendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffScore(Pattern_DiffScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Score score option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Score score option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffScore_score_option(Pattern_DiffScore_score_option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
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

} //Dssmm2WayRuleMMSwitch
