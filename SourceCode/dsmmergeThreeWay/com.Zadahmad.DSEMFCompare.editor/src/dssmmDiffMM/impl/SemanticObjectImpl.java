/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.DecisionSupport;
import dssmmDiffMM.DiffCompositeFactor_subFactors;
import dssmmDiffMM.DiffDecisionSupport_model;
import dssmmDiffMM.DiffDecisionSupport_options;
import dssmmDiffMM.DiffDecisionSupport_vendors;
import dssmmDiffMM.DiffFactor_scores;
import dssmmDiffMM.DiffModel_rootFactor;
import dssmmDiffMM.DiffOption_vendor;
import dssmmDiffMM.DiffScore_score_option;
import dssmmDiffMM.DssmmDiffMMPackage;
import dssmmDiffMM.Factor;
import dssmmDiffMM.Model;
import dssmmDiffMM.Option;
import dssmmDiffMM.Score;
import dssmmDiffMM.SemanticObject;
import dssmmDiffMM.Vendor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DecisionSupport <em>Semantic Object Decision Support</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffCompositeFactor_subFactors <em>Semantic Object Diff Composite Factor sub Factors</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffDecisionSupport_model <em>Semantic Object Diff Decision Support model</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffDecisionSupport_options <em>Semantic Object Diff Decision Support options</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffDecisionSupport_vendors <em>Semantic Object Diff Decision Support vendors</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffFactor_scores <em>Semantic Object Diff Factor scores</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffModel_rootFactor <em>Semantic Object Diff Model root Factor</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffOption_vendor <em>Semantic Object Diff Option vendor</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffScore_score_option <em>Semantic Object Diff Score score option</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_Factor <em>Semantic Object Factor</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_Model <em>Semantic Object Model</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_Option <em>Semantic Object Option</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_Score <em>Semantic Object Score</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.SemanticObjectImpl#getSemanticObject_Vendor <em>Semantic Object Vendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticObjectImpl extends MinimalEObjectImpl.Container implements SemanticObject {
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
	 * The cached value of the '{@link #getSemanticObject_DecisionSupport() <em>Semantic Object Decision Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DecisionSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupport> semanticObject_DecisionSupport;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffCompositeFactor_subFactors() <em>Semantic Object Diff Composite Factor sub Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffCompositeFactor_subFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffCompositeFactor_subFactors> semanticObject_DiffCompositeFactor_subFactors;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffDecisionSupport_model() <em>Semantic Object Diff Decision Support model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffDecisionSupport_model()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_model> semanticObject_DiffDecisionSupport_model;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffDecisionSupport_options() <em>Semantic Object Diff Decision Support options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffDecisionSupport_options()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_options> semanticObject_DiffDecisionSupport_options;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffDecisionSupport_vendors() <em>Semantic Object Diff Decision Support vendors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffDecisionSupport_vendors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_vendors> semanticObject_DiffDecisionSupport_vendors;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffFactor_scores() <em>Semantic Object Diff Factor scores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffFactor_scores()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFactor_scores> semanticObject_DiffFactor_scores;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffModel_rootFactor() <em>Semantic Object Diff Model root Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffModel_rootFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffModel_rootFactor> semanticObject_DiffModel_rootFactor;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffOption_vendor() <em>Semantic Object Diff Option vendor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffOption_vendor()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffOption_vendor> semanticObject_DiffOption_vendor;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffScore_score_option() <em>Semantic Object Diff Score score option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffScore_score_option()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffScore_score_option> semanticObject_DiffScore_score_option;

	/**
	 * The cached value of the '{@link #getSemanticObject_Factor() <em>Semantic Object Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Factor()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> semanticObject_Factor;

	/**
	 * The cached value of the '{@link #getSemanticObject_Model() <em>Semantic Object Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Model()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> semanticObject_Model;

	/**
	 * The cached value of the '{@link #getSemanticObject_Option() <em>Semantic Object Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Option()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> semanticObject_Option;

	/**
	 * The cached value of the '{@link #getSemanticObject_Score() <em>Semantic Object Score</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Score()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> semanticObject_Score;

	/**
	 * The cached value of the '{@link #getSemanticObject_Vendor() <em>Semantic Object Vendor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Vendor()
	 * @generated
	 * @ordered
	 */
	protected EList<Vendor> semanticObject_Vendor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmDiffMMPackage.Literals.SEMANTIC_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupport> getSemanticObject_DecisionSupport() {
		if (semanticObject_DecisionSupport == null) {
			semanticObject_DecisionSupport = new EObjectResolvingEList<DecisionSupport>(DecisionSupport.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT);
		}
		return semanticObject_DecisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffCompositeFactor_subFactors> getSemanticObject_DiffCompositeFactor_subFactors() {
		if (semanticObject_DiffCompositeFactor_subFactors == null) {
			semanticObject_DiffCompositeFactor_subFactors = new EObjectResolvingEList<DiffCompositeFactor_subFactors>(DiffCompositeFactor_subFactors.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS);
		}
		return semanticObject_DiffCompositeFactor_subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_model> getSemanticObject_DiffDecisionSupport_model() {
		if (semanticObject_DiffDecisionSupport_model == null) {
			semanticObject_DiffDecisionSupport_model = new EObjectResolvingEList<DiffDecisionSupport_model>(DiffDecisionSupport_model.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL);
		}
		return semanticObject_DiffDecisionSupport_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_options> getSemanticObject_DiffDecisionSupport_options() {
		if (semanticObject_DiffDecisionSupport_options == null) {
			semanticObject_DiffDecisionSupport_options = new EObjectResolvingEList<DiffDecisionSupport_options>(DiffDecisionSupport_options.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS);
		}
		return semanticObject_DiffDecisionSupport_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_vendors> getSemanticObject_DiffDecisionSupport_vendors() {
		if (semanticObject_DiffDecisionSupport_vendors == null) {
			semanticObject_DiffDecisionSupport_vendors = new EObjectResolvingEList<DiffDecisionSupport_vendors>(DiffDecisionSupport_vendors.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS);
		}
		return semanticObject_DiffDecisionSupport_vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFactor_scores> getSemanticObject_DiffFactor_scores() {
		if (semanticObject_DiffFactor_scores == null) {
			semanticObject_DiffFactor_scores = new EObjectResolvingEList<DiffFactor_scores>(DiffFactor_scores.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES);
		}
		return semanticObject_DiffFactor_scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffModel_rootFactor> getSemanticObject_DiffModel_rootFactor() {
		if (semanticObject_DiffModel_rootFactor == null) {
			semanticObject_DiffModel_rootFactor = new EObjectResolvingEList<DiffModel_rootFactor>(DiffModel_rootFactor.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR);
		}
		return semanticObject_DiffModel_rootFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffOption_vendor> getSemanticObject_DiffOption_vendor() {
		if (semanticObject_DiffOption_vendor == null) {
			semanticObject_DiffOption_vendor = new EObjectResolvingEList<DiffOption_vendor>(DiffOption_vendor.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR);
		}
		return semanticObject_DiffOption_vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffScore_score_option> getSemanticObject_DiffScore_score_option() {
		if (semanticObject_DiffScore_score_option == null) {
			semanticObject_DiffScore_score_option = new EObjectResolvingEList<DiffScore_score_option>(DiffScore_score_option.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION);
		}
		return semanticObject_DiffScore_score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getSemanticObject_Factor() {
		if (semanticObject_Factor == null) {
			semanticObject_Factor = new EObjectResolvingEList<Factor>(Factor.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR);
		}
		return semanticObject_Factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getSemanticObject_Model() {
		if (semanticObject_Model == null) {
			semanticObject_Model = new EObjectResolvingEList<Model>(Model.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL);
		}
		return semanticObject_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getSemanticObject_Option() {
		if (semanticObject_Option == null) {
			semanticObject_Option = new EObjectResolvingEList<Option>(Option.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION);
		}
		return semanticObject_Option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Score> getSemanticObject_Score() {
		if (semanticObject_Score == null) {
			semanticObject_Score = new EObjectResolvingEList<Score>(Score.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE);
		}
		return semanticObject_Score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vendor> getSemanticObject_Vendor() {
		if (semanticObject_Vendor == null) {
			semanticObject_Vendor = new EObjectResolvingEList<Vendor>(Vendor.class, this, DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR);
		}
		return semanticObject_Vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return getName();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT:
				return getSemanticObject_DecisionSupport();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				return getSemanticObject_DiffCompositeFactor_subFactors();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL:
				return getSemanticObject_DiffDecisionSupport_model();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS:
				return getSemanticObject_DiffDecisionSupport_options();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS:
				return getSemanticObject_DiffDecisionSupport_vendors();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES:
				return getSemanticObject_DiffFactor_scores();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR:
				return getSemanticObject_DiffModel_rootFactor();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR:
				return getSemanticObject_DiffOption_vendor();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION:
				return getSemanticObject_DiffScore_score_option();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR:
				return getSemanticObject_Factor();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL:
				return getSemanticObject_Model();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION:
				return getSemanticObject_Option();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE:
				return getSemanticObject_Score();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR:
				return getSemanticObject_Vendor();
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
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT:
				getSemanticObject_DecisionSupport().clear();
				getSemanticObject_DecisionSupport().addAll((Collection<? extends DecisionSupport>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				getSemanticObject_DiffCompositeFactor_subFactors().clear();
				getSemanticObject_DiffCompositeFactor_subFactors().addAll((Collection<? extends DiffCompositeFactor_subFactors>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL:
				getSemanticObject_DiffDecisionSupport_model().clear();
				getSemanticObject_DiffDecisionSupport_model().addAll((Collection<? extends DiffDecisionSupport_model>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS:
				getSemanticObject_DiffDecisionSupport_options().clear();
				getSemanticObject_DiffDecisionSupport_options().addAll((Collection<? extends DiffDecisionSupport_options>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS:
				getSemanticObject_DiffDecisionSupport_vendors().clear();
				getSemanticObject_DiffDecisionSupport_vendors().addAll((Collection<? extends DiffDecisionSupport_vendors>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES:
				getSemanticObject_DiffFactor_scores().clear();
				getSemanticObject_DiffFactor_scores().addAll((Collection<? extends DiffFactor_scores>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR:
				getSemanticObject_DiffModel_rootFactor().clear();
				getSemanticObject_DiffModel_rootFactor().addAll((Collection<? extends DiffModel_rootFactor>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR:
				getSemanticObject_DiffOption_vendor().clear();
				getSemanticObject_DiffOption_vendor().addAll((Collection<? extends DiffOption_vendor>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION:
				getSemanticObject_DiffScore_score_option().clear();
				getSemanticObject_DiffScore_score_option().addAll((Collection<? extends DiffScore_score_option>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR:
				getSemanticObject_Factor().clear();
				getSemanticObject_Factor().addAll((Collection<? extends Factor>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL:
				getSemanticObject_Model().clear();
				getSemanticObject_Model().addAll((Collection<? extends Model>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION:
				getSemanticObject_Option().clear();
				getSemanticObject_Option().addAll((Collection<? extends Option>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE:
				getSemanticObject_Score().clear();
				getSemanticObject_Score().addAll((Collection<? extends Score>)newValue);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR:
				getSemanticObject_Vendor().clear();
				getSemanticObject_Vendor().addAll((Collection<? extends Vendor>)newValue);
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
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT:
				getSemanticObject_DecisionSupport().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				getSemanticObject_DiffCompositeFactor_subFactors().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL:
				getSemanticObject_DiffDecisionSupport_model().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS:
				getSemanticObject_DiffDecisionSupport_options().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS:
				getSemanticObject_DiffDecisionSupport_vendors().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES:
				getSemanticObject_DiffFactor_scores().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR:
				getSemanticObject_DiffModel_rootFactor().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR:
				getSemanticObject_DiffOption_vendor().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION:
				getSemanticObject_DiffScore_score_option().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR:
				getSemanticObject_Factor().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL:
				getSemanticObject_Model().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION:
				getSemanticObject_Option().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE:
				getSemanticObject_Score().clear();
				return;
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR:
				getSemanticObject_Vendor().clear();
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
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT:
				return semanticObject_DecisionSupport != null && !semanticObject_DecisionSupport.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS:
				return semanticObject_DiffCompositeFactor_subFactors != null && !semanticObject_DiffCompositeFactor_subFactors.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL:
				return semanticObject_DiffDecisionSupport_model != null && !semanticObject_DiffDecisionSupport_model.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS:
				return semanticObject_DiffDecisionSupport_options != null && !semanticObject_DiffDecisionSupport_options.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS:
				return semanticObject_DiffDecisionSupport_vendors != null && !semanticObject_DiffDecisionSupport_vendors.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES:
				return semanticObject_DiffFactor_scores != null && !semanticObject_DiffFactor_scores.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR:
				return semanticObject_DiffModel_rootFactor != null && !semanticObject_DiffModel_rootFactor.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR:
				return semanticObject_DiffOption_vendor != null && !semanticObject_DiffOption_vendor.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION:
				return semanticObject_DiffScore_score_option != null && !semanticObject_DiffScore_score_option.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR:
				return semanticObject_Factor != null && !semanticObject_Factor.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL:
				return semanticObject_Model != null && !semanticObject_Model.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION:
				return semanticObject_Option != null && !semanticObject_Option.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE:
				return semanticObject_Score != null && !semanticObject_Score.isEmpty();
			case DssmmDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR:
				return semanticObject_Vendor != null && !semanticObject_Vendor.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SemanticObjectImpl
