/**
 */
package dssmm2WayRuleMM;

import dssmm2WayDiffMM.DecisionSupport;
import dssmm2WayDiffMM.DiffCompositeFactor_subFactors;
import dssmm2WayDiffMM.DiffDecisionSupport_model;
import dssmm2WayDiffMM.DiffDecisionSupport_options;
import dssmm2WayDiffMM.DiffDecisionSupport_vendors;
import dssmm2WayDiffMM.DiffFactor_scores;
import dssmm2WayDiffMM.DiffModel_rootFactor;
import dssmm2WayDiffMM.DiffOption_vendor;
import dssmm2WayDiffMM.DiffScore_score_option;
import dssmm2WayDiffMM.Factor;
import dssmm2WayDiffMM.Model;
import dssmm2WayDiffMM.Option;
import dssmm2WayDiffMM.Score;
import dssmm2WayDiffMM.SemanticObject;
import dssmm2WayDiffMM.Vendor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DecisionSupport <em>Rule Pattern Decision Support</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffCompositeFactor_subFactors <em>Rule Pattern Diff Composite Factor sub Factors</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffDecisionSupport_model <em>Rule Pattern Diff Decision Support model</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffDecisionSupport_options <em>Rule Pattern Diff Decision Support options</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffDecisionSupport_vendors <em>Rule Pattern Diff Decision Support vendors</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffFactor_scores <em>Rule Pattern Diff Factor scores</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffModel_rootFactor <em>Rule Pattern Diff Model root Factor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffOption_vendor <em>Rule Pattern Diff Option vendor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_DiffScore_score_option <em>Rule Pattern Diff Score score option</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_Factor <em>Rule Pattern Factor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_Model <em>Rule Pattern Model</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_Option <em>Rule Pattern Option</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_Score <em>Rule Pattern Score</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.Rule#getRulePattern_Vendor <em>Rule Pattern Vendor</em>}</li>
 * </ul>
 *
 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmm2WayRuleMM.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Decision Support</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DecisionSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Decision Support</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DecisionSupport()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionSupport> getRulePattern_DecisionSupport();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Composite Factor sub Factors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffCompositeFactor_subFactors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Composite Factor sub Factors</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffCompositeFactor_subFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffCompositeFactor_subFactors> getRulePattern_DiffCompositeFactor_subFactors();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Decision Support model</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffDecisionSupport_model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Decision Support model</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffDecisionSupport_model()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_model> getRulePattern_DiffDecisionSupport_model();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Decision Support options</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffDecisionSupport_options}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Decision Support options</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffDecisionSupport_options()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_options> getRulePattern_DiffDecisionSupport_options();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Decision Support vendors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffDecisionSupport_vendors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Decision Support vendors</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffDecisionSupport_vendors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_vendors> getRulePattern_DiffDecisionSupport_vendors();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Factor scores</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffFactor_scores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Factor scores</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffFactor_scores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffFactor_scores> getRulePattern_DiffFactor_scores();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Model root Factor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffModel_rootFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Model root Factor</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffModel_rootFactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffModel_rootFactor> getRulePattern_DiffModel_rootFactor();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Option vendor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffOption_vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Option vendor</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffOption_vendor()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffOption_vendor> getRulePattern_DiffOption_vendor();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Score score option</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffScore_score_option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Score score option</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_DiffScore_score_option()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffScore_score_option> getRulePattern_DiffScore_score_option();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Factor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Factor</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_Factor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Factor> getRulePattern_Factor();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Model</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Model</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getRulePattern_Model();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Option</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Option</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getRulePattern_Option();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Score</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Score</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_Score()
	 * @model containment="true"
	 * @generated
	 */
	EList<Score> getRulePattern_Score();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Semantic Object</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_SemanticObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticObject> getRulePattern_SemanticObject();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Vendor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.Vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Vendor</em>' containment reference list.
	 * @see dssmm2WayRuleMM.Dssmm2WayRuleMMPackage#getRule_RulePattern_Vendor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vendor> getRulePattern_Vendor();

} // Rule
