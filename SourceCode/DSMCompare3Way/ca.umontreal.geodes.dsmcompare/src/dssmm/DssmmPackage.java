/**
 */
package dssmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dssmm.DssmmFactory
 * @model kind="package"
 * @generated
 */
public interface DssmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dssmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsvcs/dssmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dssmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DssmmPackage eINSTANCE = dssmm.impl.DssmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link dssmm.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.DecisionSupportImpl
	 * @see dssmm.impl.DssmmPackageImpl#getDecisionSupport()
	 * @generated
	 */
	int DECISION_SUPPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Vendors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__VENDORS = 3;

	/**
	 * The number of structural features of the '<em>Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.ModelImpl
	 * @see dssmm.impl.DssmmPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GOAL = 2;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCR = 3;

	/**
	 * The feature id for the '<em><b>Num Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NUM_FACTS = 4;

	/**
	 * The feature id for the '<em><b>Root Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT_FACTOR = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.FactorImpl
	 * @see dssmm.impl.DssmmPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__FACTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__DESCR = 2;

	/**
	 * The feature id for the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__GW = 3;

	/**
	 * The feature id for the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__LW = 4;

	/**
	 * The feature id for the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__DEL = 5;

	/**
	 * The feature id for the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__HIDE_ON_LINE = 6;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__SCORES = 7;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__HIERARCHY = 8;

	/**
	 * The feature id for the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__MASTER_FACTOR_ID = 9;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.LeafFactorImpl
	 * @see dssmm.impl.DssmmPackageImpl#getLeafFactor()
	 * @generated
	 */
	int LEAF_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__FACTOR_ID = FACTOR__FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__NAME = FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__DESCR = FACTOR__DESCR;

	/**
	 * The feature id for the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__GW = FACTOR__GW;

	/**
	 * The feature id for the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__LW = FACTOR__LW;

	/**
	 * The feature id for the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__DEL = FACTOR__DEL;

	/**
	 * The feature id for the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__HIDE_ON_LINE = FACTOR__HIDE_ON_LINE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__SCORES = FACTOR__SCORES;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__HIERARCHY = FACTOR__HIERARCHY;

	/**
	 * The feature id for the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__MASTER_FACTOR_ID = FACTOR__MASTER_FACTOR_ID;

	/**
	 * The number of structural features of the '<em>Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.CompositeFactorImpl
	 * @see dssmm.impl.DssmmPackageImpl#getCompositeFactor()
	 * @generated
	 */
	int COMPOSITE_FACTOR = 4;

	/**
	 * The feature id for the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__FACTOR_ID = FACTOR__FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__NAME = FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__DESCR = FACTOR__DESCR;

	/**
	 * The feature id for the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__GW = FACTOR__GW;

	/**
	 * The feature id for the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__LW = FACTOR__LW;

	/**
	 * The feature id for the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__DEL = FACTOR__DEL;

	/**
	 * The feature id for the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__HIDE_ON_LINE = FACTOR__HIDE_ON_LINE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__SCORES = FACTOR__SCORES;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__HIERARCHY = FACTOR__HIERARCHY;

	/**
	 * The feature id for the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__MASTER_FACTOR_ID = FACTOR__MASTER_FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Sub Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__SUB_FACTORS = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.OptionImpl
	 * @see dssmm.impl.DssmmPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 5;

	/**
	 * The feature id for the '<em><b>Option ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SORT = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__COST = 3;

	/**
	 * The feature id for the '<em><b>Num Other Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NUM_OTHER_COSTS = 4;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VENDOR = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.VendorImpl
	 * @see dssmm.impl.DssmmPackageImpl#getVendor()
	 * @generated
	 */
	int VENDOR = 6;

	/**
	 * The feature id for the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__VENDOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm.impl.ScoreImpl
	 * @see dssmm.impl.DssmmPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 7;

	/**
	 * The feature id for the '<em><b>SScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__SSCORE = 0;

	/**
	 * The feature id for the '<em><b>DScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__DSCORE = 1;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__DESCR = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Score option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__SCORE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__METHOD_ID = 5;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dssmm.DecisionSupport <em>Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support</em>'.
	 * @see dssmm.DecisionSupport
	 * @generated
	 */
	EClass getDecisionSupport();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.DecisionSupport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm.DecisionSupport#getName()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EAttribute getDecisionSupport_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dssmm.DecisionSupport#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see dssmm.DecisionSupport#getModel()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm.DecisionSupport#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see dssmm.DecisionSupport#getOptions()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm.DecisionSupport#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendors</em>'.
	 * @see dssmm.DecisionSupport#getVendors()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Vendors();

	/**
	 * Returns the meta object for class '{@link dssmm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dssmm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Model#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see dssmm.Model#getModelID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Model#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see dssmm.Model#getGoal()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Goal();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Model#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm.Model#getDescr()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Model#getNumFacts <em>Num Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Facts</em>'.
	 * @see dssmm.Model#getNumFacts()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumFacts();

	/**
	 * Returns the meta object for the containment reference '{@link dssmm.Model#getRootFactor <em>Root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Factor</em>'.
	 * @see dssmm.Model#getRootFactor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RootFactor();

	/**
	 * Returns the meta object for class '{@link dssmm.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see dssmm.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getFactorID <em>Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor ID</em>'.
	 * @see dssmm.Factor#getFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_FactorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm.Factor#getDescr()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getGW <em>GW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GW</em>'.
	 * @see dssmm.Factor#getGW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_GW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getLW <em>LW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LW</em>'.
	 * @see dssmm.Factor#getLW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_LW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Del</em>'.
	 * @see dssmm.Factor#getDel()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Del();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#isHideOnLine <em>Hide On Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide On Line</em>'.
	 * @see dssmm.Factor#isHideOnLine()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_HideOnLine();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm.Factor#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scores</em>'.
	 * @see dssmm.Factor#getScores()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Scores();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see dssmm.Factor#getHierarchy()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Factor#getMasterFactorID <em>Master Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Factor ID</em>'.
	 * @see dssmm.Factor#getMasterFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_MasterFactorID();

	/**
	 * Returns the meta object for class '{@link dssmm.LeafFactor <em>Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Factor</em>'.
	 * @see dssmm.LeafFactor
	 * @generated
	 */
	EClass getLeafFactor();

	/**
	 * Returns the meta object for class '{@link dssmm.CompositeFactor <em>Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Factor</em>'.
	 * @see dssmm.CompositeFactor
	 * @generated
	 */
	EClass getCompositeFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm.CompositeFactor#getSubFactors <em>Sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Factors</em>'.
	 * @see dssmm.CompositeFactor#getSubFactors()
	 * @see #getCompositeFactor()
	 * @generated
	 */
	EReference getCompositeFactor_SubFactors();

	/**
	 * Returns the meta object for class '{@link dssmm.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see dssmm.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getOptionID <em>Option ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option ID</em>'.
	 * @see dssmm.Option#getOptionID()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see dssmm.Option#getSort()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Sort();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see dssmm.Option#getCost()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Cost();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getNumOtherCosts <em>Num Other Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Other Costs</em>'.
	 * @see dssmm.Option#getNumOtherCosts()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_NumOtherCosts();

	/**
	 * Returns the meta object for the reference '{@link dssmm.Option#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see dssmm.Option#getVendor()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Option#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmm.Option#getDescription()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Description();

	/**
	 * Returns the meta object for class '{@link dssmm.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see dssmm.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Vendor#getVendorID <em>Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor ID</em>'.
	 * @see dssmm.Vendor#getVendorID()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_VendorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Vendor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm.Vendor#getName()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Vendor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmm.Vendor#getDescription()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Description();

	/**
	 * Returns the meta object for class '{@link dssmm.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see dssmm.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Score#getSScore <em>SScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SScore</em>'.
	 * @see dssmm.Score#getSScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_SScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Score#getDScore <em>DScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DScore</em>'.
	 * @see dssmm.Score#getDScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_DScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Score#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm.Score#getDescr()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Score#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see dssmm.Score#getComment()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Comment();

	/**
	 * Returns the meta object for the reference '{@link dssmm.Score#getScore_option <em>Score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Score option</em>'.
	 * @see dssmm.Score#getScore_option()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Score_option();

	/**
	 * Returns the meta object for the attribute '{@link dssmm.Score#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see dssmm.Score#getMethodID()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_MethodID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DssmmFactory getDssmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dssmm.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.DecisionSupportImpl
		 * @see dssmm.impl.DssmmPackageImpl#getDecisionSupport()
		 * @generated
		 */
		EClass DECISION_SUPPORT = eINSTANCE.getDecisionSupport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_SUPPORT__NAME = eINSTANCE.getDecisionSupport_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__MODEL = eINSTANCE.getDecisionSupport_Model();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__OPTIONS = eINSTANCE.getDecisionSupport_Options();

		/**
		 * The meta object literal for the '<em><b>Vendors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__VENDORS = eINSTANCE.getDecisionSupport_Vendors();

		/**
		 * The meta object literal for the '{@link dssmm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.ModelImpl
		 * @see dssmm.impl.DssmmPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Model ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_ID = eINSTANCE.getModel_ModelID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__GOAL = eINSTANCE.getModel_Goal();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCR = eINSTANCE.getModel_Descr();

		/**
		 * The meta object literal for the '<em><b>Num Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NUM_FACTS = eINSTANCE.getModel_NumFacts();

		/**
		 * The meta object literal for the '<em><b>Root Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT_FACTOR = eINSTANCE.getModel_RootFactor();

		/**
		 * The meta object literal for the '{@link dssmm.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.FactorImpl
		 * @see dssmm.impl.DssmmPackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em><b>Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__FACTOR_ID = eINSTANCE.getFactor_FactorID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__NAME = eINSTANCE.getFactor_Name();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__DESCR = eINSTANCE.getFactor_Descr();

		/**
		 * The meta object literal for the '<em><b>GW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__GW = eINSTANCE.getFactor_GW();

		/**
		 * The meta object literal for the '<em><b>LW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__LW = eINSTANCE.getFactor_LW();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__DEL = eINSTANCE.getFactor_Del();

		/**
		 * The meta object literal for the '<em><b>Hide On Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__HIDE_ON_LINE = eINSTANCE.getFactor_HideOnLine();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__SCORES = eINSTANCE.getFactor_Scores();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__HIERARCHY = eINSTANCE.getFactor_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Master Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__MASTER_FACTOR_ID = eINSTANCE.getFactor_MasterFactorID();

		/**
		 * The meta object literal for the '{@link dssmm.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.LeafFactorImpl
		 * @see dssmm.impl.DssmmPackageImpl#getLeafFactor()
		 * @generated
		 */
		EClass LEAF_FACTOR = eINSTANCE.getLeafFactor();

		/**
		 * The meta object literal for the '{@link dssmm.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.CompositeFactorImpl
		 * @see dssmm.impl.DssmmPackageImpl#getCompositeFactor()
		 * @generated
		 */
		EClass COMPOSITE_FACTOR = eINSTANCE.getCompositeFactor();

		/**
		 * The meta object literal for the '<em><b>Sub Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FACTOR__SUB_FACTORS = eINSTANCE.getCompositeFactor_SubFactors();

		/**
		 * The meta object literal for the '{@link dssmm.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.OptionImpl
		 * @see dssmm.impl.DssmmPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Option ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_ID = eINSTANCE.getOption_OptionID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SORT = eINSTANCE.getOption_Sort();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__COST = eINSTANCE.getOption_Cost();

		/**
		 * The meta object literal for the '<em><b>Num Other Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NUM_OTHER_COSTS = eINSTANCE.getOption_NumOtherCosts();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__VENDOR = eINSTANCE.getOption_Vendor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__DESCRIPTION = eINSTANCE.getOption_Description();

		/**
		 * The meta object literal for the '{@link dssmm.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.VendorImpl
		 * @see dssmm.impl.DssmmPackageImpl#getVendor()
		 * @generated
		 */
		EClass VENDOR = eINSTANCE.getVendor();

		/**
		 * The meta object literal for the '<em><b>Vendor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__VENDOR_ID = eINSTANCE.getVendor_VendorID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__NAME = eINSTANCE.getVendor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__DESCRIPTION = eINSTANCE.getVendor_Description();

		/**
		 * The meta object literal for the '{@link dssmm.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm.impl.ScoreImpl
		 * @see dssmm.impl.DssmmPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>SScore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__SSCORE = eINSTANCE.getScore_SScore();

		/**
		 * The meta object literal for the '<em><b>DScore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__DSCORE = eINSTANCE.getScore_DScore();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__DESCR = eINSTANCE.getScore_Descr();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__COMMENT = eINSTANCE.getScore_Comment();

		/**
		 * The meta object literal for the '<em><b>Score option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__SCORE_OPTION = eINSTANCE.getScore_Score_option();

		/**
		 * The meta object literal for the '<em><b>Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__METHOD_ID = eINSTANCE.getScore_MethodID();

	}

} //DssmmPackage
