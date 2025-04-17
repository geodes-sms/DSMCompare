/**
 */
package dssmm2WayRuleMM.impl;

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

import dssmm2WayRuleMM.Dssmm2WayRuleMMPackage;
import dssmm2WayRuleMM.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DecisionSupport <em>Rule Pattern Decision Support</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffCompositeFactor_subFactors <em>Rule Pattern Diff Composite Factor sub Factors</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffDecisionSupport_model <em>Rule Pattern Diff Decision Support model</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffDecisionSupport_options <em>Rule Pattern Diff Decision Support options</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffDecisionSupport_vendors <em>Rule Pattern Diff Decision Support vendors</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffFactor_scores <em>Rule Pattern Diff Factor scores</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffModel_rootFactor <em>Rule Pattern Diff Model root Factor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffOption_vendor <em>Rule Pattern Diff Option vendor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_DiffScore_score_option <em>Rule Pattern Diff Score score option</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_Factor <em>Rule Pattern Factor</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_Model <em>Rule Pattern Model</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_Option <em>Rule Pattern Option</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_Score <em>Rule Pattern Score</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 *   <li>{@link dssmm2WayRuleMM.impl.RuleImpl#getRulePattern_Vendor <em>Rule Pattern Vendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The cached value of the '{@link #getRulePattern_DecisionSupport() <em>Rule Pattern Decision Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DecisionSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupport> rulePattern_DecisionSupport;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffCompositeFactor_subFactors() <em>Rule Pattern Diff Composite Factor sub Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffCompositeFactor_subFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffCompositeFactor_subFactors> rulePattern_DiffCompositeFactor_subFactors;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffDecisionSupport_model() <em>Rule Pattern Diff Decision Support model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffDecisionSupport_model()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_model> rulePattern_DiffDecisionSupport_model;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffDecisionSupport_options() <em>Rule Pattern Diff Decision Support options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffDecisionSupport_options()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_options> rulePattern_DiffDecisionSupport_options;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffDecisionSupport_vendors() <em>Rule Pattern Diff Decision Support vendors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffDecisionSupport_vendors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_vendors> rulePattern_DiffDecisionSupport_vendors;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffFactor_scores() <em>Rule Pattern Diff Factor scores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffFactor_scores()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFactor_scores> rulePattern_DiffFactor_scores;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffModel_rootFactor() <em>Rule Pattern Diff Model root Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffModel_rootFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffModel_rootFactor> rulePattern_DiffModel_rootFactor;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffOption_vendor() <em>Rule Pattern Diff Option vendor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffOption_vendor()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffOption_vendor> rulePattern_DiffOption_vendor;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffScore_score_option() <em>Rule Pattern Diff Score score option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffScore_score_option()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffScore_score_option> rulePattern_DiffScore_score_option;

	/**
	 * The cached value of the '{@link #getRulePattern_Factor() <em>Rule Pattern Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Factor()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> rulePattern_Factor;

	/**
	 * The cached value of the '{@link #getRulePattern_Model() <em>Rule Pattern Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Model()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> rulePattern_Model;

	/**
	 * The cached value of the '{@link #getRulePattern_Option() <em>Rule Pattern Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Option()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> rulePattern_Option;

	/**
	 * The cached value of the '{@link #getRulePattern_Score() <em>Rule Pattern Score</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Score()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> rulePattern_Score;

	/**
	 * The cached value of the '{@link #getRulePattern_SemanticObject() <em>Rule Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticObject> rulePattern_SemanticObject;

	/**
	 * The cached value of the '{@link #getRulePattern_Vendor() <em>Rule Pattern Vendor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Vendor()
	 * @generated
	 * @ordered
	 */
	protected EList<Vendor> rulePattern_Vendor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayRuleMMPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, Dssmm2WayRuleMMPackage.RULE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupport> getRulePattern_DecisionSupport() {
		if (rulePattern_DecisionSupport == null) {
			rulePattern_DecisionSupport = new EObjectContainmentEList<DecisionSupport>(DecisionSupport.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT);
		}
		return rulePattern_DecisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffCompositeFactor_subFactors> getRulePattern_DiffCompositeFactor_subFactors() {
		if (rulePattern_DiffCompositeFactor_subFactors == null) {
			rulePattern_DiffCompositeFactor_subFactors = new EObjectContainmentEList<DiffCompositeFactor_subFactors>(DiffCompositeFactor_subFactors.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		}
		return rulePattern_DiffCompositeFactor_subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_model> getRulePattern_DiffDecisionSupport_model() {
		if (rulePattern_DiffDecisionSupport_model == null) {
			rulePattern_DiffDecisionSupport_model = new EObjectContainmentEList<DiffDecisionSupport_model>(DiffDecisionSupport_model.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL);
		}
		return rulePattern_DiffDecisionSupport_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_options> getRulePattern_DiffDecisionSupport_options() {
		if (rulePattern_DiffDecisionSupport_options == null) {
			rulePattern_DiffDecisionSupport_options = new EObjectContainmentEList<DiffDecisionSupport_options>(DiffDecisionSupport_options.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS);
		}
		return rulePattern_DiffDecisionSupport_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_vendors> getRulePattern_DiffDecisionSupport_vendors() {
		if (rulePattern_DiffDecisionSupport_vendors == null) {
			rulePattern_DiffDecisionSupport_vendors = new EObjectContainmentEList<DiffDecisionSupport_vendors>(DiffDecisionSupport_vendors.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS);
		}
		return rulePattern_DiffDecisionSupport_vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFactor_scores> getRulePattern_DiffFactor_scores() {
		if (rulePattern_DiffFactor_scores == null) {
			rulePattern_DiffFactor_scores = new EObjectContainmentEList<DiffFactor_scores>(DiffFactor_scores.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES);
		}
		return rulePattern_DiffFactor_scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffModel_rootFactor> getRulePattern_DiffModel_rootFactor() {
		if (rulePattern_DiffModel_rootFactor == null) {
			rulePattern_DiffModel_rootFactor = new EObjectContainmentEList<DiffModel_rootFactor>(DiffModel_rootFactor.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR);
		}
		return rulePattern_DiffModel_rootFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffOption_vendor> getRulePattern_DiffOption_vendor() {
		if (rulePattern_DiffOption_vendor == null) {
			rulePattern_DiffOption_vendor = new EObjectContainmentEList<DiffOption_vendor>(DiffOption_vendor.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR);
		}
		return rulePattern_DiffOption_vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffScore_score_option> getRulePattern_DiffScore_score_option() {
		if (rulePattern_DiffScore_score_option == null) {
			rulePattern_DiffScore_score_option = new EObjectContainmentEList<DiffScore_score_option>(DiffScore_score_option.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION);
		}
		return rulePattern_DiffScore_score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getRulePattern_Factor() {
		if (rulePattern_Factor == null) {
			rulePattern_Factor = new EObjectContainmentEList<Factor>(Factor.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR);
		}
		return rulePattern_Factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getRulePattern_Model() {
		if (rulePattern_Model == null) {
			rulePattern_Model = new EObjectContainmentEList<Model>(Model.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL);
		}
		return rulePattern_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getRulePattern_Option() {
		if (rulePattern_Option == null) {
			rulePattern_Option = new EObjectContainmentEList<Option>(Option.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION);
		}
		return rulePattern_Option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Score> getRulePattern_Score() {
		if (rulePattern_Score == null) {
			rulePattern_Score = new EObjectContainmentEList<Score>(Score.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE);
		}
		return rulePattern_Score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticObject> getRulePattern_SemanticObject() {
		if (rulePattern_SemanticObject == null) {
			rulePattern_SemanticObject = new EObjectContainmentEList<SemanticObject>(SemanticObject.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vendor> getRulePattern_Vendor() {
		if (rulePattern_Vendor == null) {
			rulePattern_Vendor = new EObjectContainmentEList<Vendor>(Vendor.class, this, Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR);
		}
		return rulePattern_Vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT:
				return ((InternalEList<?>)getRulePattern_DecisionSupport()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				return ((InternalEList<?>)getRulePattern_DiffCompositeFactor_subFactors()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL:
				return ((InternalEList<?>)getRulePattern_DiffDecisionSupport_model()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS:
				return ((InternalEList<?>)getRulePattern_DiffDecisionSupport_options()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS:
				return ((InternalEList<?>)getRulePattern_DiffDecisionSupport_vendors()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES:
				return ((InternalEList<?>)getRulePattern_DiffFactor_scores()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR:
				return ((InternalEList<?>)getRulePattern_DiffModel_rootFactor()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR:
				return ((InternalEList<?>)getRulePattern_DiffOption_vendor()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION:
				return ((InternalEList<?>)getRulePattern_DiffScore_score_option()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR:
				return ((InternalEList<?>)getRulePattern_Factor()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL:
				return ((InternalEList<?>)getRulePattern_Model()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION:
				return ((InternalEList<?>)getRulePattern_Option()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE:
				return ((InternalEList<?>)getRulePattern_Score()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_SemanticObject()).basicRemove(otherEnd, msgs);
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR:
				return ((InternalEList<?>)getRulePattern_Vendor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayRuleMMPackage.RULE__NAME:
				return getName();
			case Dssmm2WayRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT:
				return getRulePattern_DecisionSupport();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				return getRulePattern_DiffCompositeFactor_subFactors();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL:
				return getRulePattern_DiffDecisionSupport_model();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS:
				return getRulePattern_DiffDecisionSupport_options();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS:
				return getRulePattern_DiffDecisionSupport_vendors();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES:
				return getRulePattern_DiffFactor_scores();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR:
				return getRulePattern_DiffModel_rootFactor();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR:
				return getRulePattern_DiffOption_vendor();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION:
				return getRulePattern_DiffScore_score_option();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR:
				return getRulePattern_Factor();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL:
				return getRulePattern_Model();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION:
				return getRulePattern_Option();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE:
				return getRulePattern_Score();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_SemanticObject();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR:
				return getRulePattern_Vendor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dssmm2WayRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT:
				getRulePattern_DecisionSupport().clear();
				getRulePattern_DecisionSupport().addAll((Collection<? extends DecisionSupport>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				getRulePattern_DiffCompositeFactor_subFactors().clear();
				getRulePattern_DiffCompositeFactor_subFactors().addAll((Collection<? extends DiffCompositeFactor_subFactors>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL:
				getRulePattern_DiffDecisionSupport_model().clear();
				getRulePattern_DiffDecisionSupport_model().addAll((Collection<? extends DiffDecisionSupport_model>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS:
				getRulePattern_DiffDecisionSupport_options().clear();
				getRulePattern_DiffDecisionSupport_options().addAll((Collection<? extends DiffDecisionSupport_options>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS:
				getRulePattern_DiffDecisionSupport_vendors().clear();
				getRulePattern_DiffDecisionSupport_vendors().addAll((Collection<? extends DiffDecisionSupport_vendors>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES:
				getRulePattern_DiffFactor_scores().clear();
				getRulePattern_DiffFactor_scores().addAll((Collection<? extends DiffFactor_scores>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR:
				getRulePattern_DiffModel_rootFactor().clear();
				getRulePattern_DiffModel_rootFactor().addAll((Collection<? extends DiffModel_rootFactor>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR:
				getRulePattern_DiffOption_vendor().clear();
				getRulePattern_DiffOption_vendor().addAll((Collection<? extends DiffOption_vendor>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION:
				getRulePattern_DiffScore_score_option().clear();
				getRulePattern_DiffScore_score_option().addAll((Collection<? extends DiffScore_score_option>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR:
				getRulePattern_Factor().clear();
				getRulePattern_Factor().addAll((Collection<? extends Factor>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL:
				getRulePattern_Model().clear();
				getRulePattern_Model().addAll((Collection<? extends Model>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION:
				getRulePattern_Option().clear();
				getRulePattern_Option().addAll((Collection<? extends Option>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE:
				getRulePattern_Score().clear();
				getRulePattern_Score().addAll((Collection<? extends Score>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				getRulePattern_SemanticObject().addAll((Collection<? extends SemanticObject>)newValue);
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR:
				getRulePattern_Vendor().clear();
				getRulePattern_Vendor().addAll((Collection<? extends Vendor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Dssmm2WayRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Dssmm2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT:
				getRulePattern_DecisionSupport().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				getRulePattern_DiffCompositeFactor_subFactors().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL:
				getRulePattern_DiffDecisionSupport_model().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS:
				getRulePattern_DiffDecisionSupport_options().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS:
				getRulePattern_DiffDecisionSupport_vendors().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES:
				getRulePattern_DiffFactor_scores().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR:
				getRulePattern_DiffModel_rootFactor().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR:
				getRulePattern_DiffOption_vendor().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION:
				getRulePattern_DiffScore_score_option().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR:
				getRulePattern_Factor().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL:
				getRulePattern_Model().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION:
				getRulePattern_Option().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE:
				getRulePattern_Score().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				return;
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR:
				getRulePattern_Vendor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Dssmm2WayRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Dssmm2WayRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DECISION_SUPPORT:
				return rulePattern_DecisionSupport != null && !rulePattern_DecisionSupport.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				return rulePattern_DiffCompositeFactor_subFactors != null && !rulePattern_DiffCompositeFactor_subFactors.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_MODEL:
				return rulePattern_DiffDecisionSupport_model != null && !rulePattern_DiffDecisionSupport_model.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_OPTIONS:
				return rulePattern_DiffDecisionSupport_options != null && !rulePattern_DiffDecisionSupport_options.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_DECISION_SUPPORT_VENDORS:
				return rulePattern_DiffDecisionSupport_vendors != null && !rulePattern_DiffDecisionSupport_vendors.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_FACTOR_SCORES:
				return rulePattern_DiffFactor_scores != null && !rulePattern_DiffFactor_scores.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_MODEL_ROOT_FACTOR:
				return rulePattern_DiffModel_rootFactor != null && !rulePattern_DiffModel_rootFactor.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_OPTION_VENDOR:
				return rulePattern_DiffOption_vendor != null && !rulePattern_DiffOption_vendor.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_SCORE_SCORE_OPTION:
				return rulePattern_DiffScore_score_option != null && !rulePattern_DiffScore_score_option.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_FACTOR:
				return rulePattern_Factor != null && !rulePattern_Factor.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_MODEL:
				return rulePattern_Model != null && !rulePattern_Model.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_OPTION:
				return rulePattern_Option != null && !rulePattern_Option.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SCORE:
				return rulePattern_Score != null && !rulePattern_Score.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_SemanticObject != null && !rulePattern_SemanticObject.isEmpty();
			case Dssmm2WayRuleMMPackage.RULE__RULE_PATTERN_VENDOR:
				return rulePattern_Vendor != null && !rulePattern_Vendor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
