/**
 */
package dssmm2WayDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface Dssmm2WayDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dssmm2WayDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsvcs/dssmm2WayDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dssmm2WayDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dssmm2WayDiffMMPackage eINSTANCE = dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DecisionSupportImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDecisionSupport()
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
	 * The feature id for the '<em><b>Diffmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__DIFFMODEL = 4;

	/**
	 * The feature id for the '<em><b>Diffoptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__DIFFOPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Diffvendors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT__DIFFVENDORS = 6;

	/**
	 * The number of structural features of the '<em>Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SUPPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.ModelImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getModel()
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
	 * The feature id for the '<em><b>Diffroot Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DIFFROOT_FACTOR = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.FactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getFactor()
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
	 * The feature id for the '<em><b>Diffscores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__DIFFSCORES = 10;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.LeafFactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getLeafFactor()
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
	 * The feature id for the '<em><b>Diffscores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FACTOR__DIFFSCORES = FACTOR__DIFFSCORES;

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
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.CompositeFactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getCompositeFactor()
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
	 * The feature id for the '<em><b>Diffscores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__DIFFSCORES = FACTOR__DIFFSCORES;

	/**
	 * The feature id for the '<em><b>Sub Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__SUB_FACTORS = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffsub Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR__DIFFSUB_FACTORS = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.OptionImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getOption()
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
	 * The feature id for the '<em><b>Diffvendor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DIFFVENDOR = 7;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.VendorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getVendor()
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
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.ScoreImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getScore()
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
	 * The feature id for the '<em><b>Diffscore option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__DIFFSCORE_OPTION = 6;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.SemanticObjectImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticObject()
	 * @generated
	 */
	int SEMANTIC_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Object Decision Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT = 1;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Composite Factor sub Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support vendors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Factor scores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Model root Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Option vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR = 8;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Score score option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Semantic Object Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR = 10;

	/**
	 * The feature id for the '<em><b>Semantic Object Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Semantic Object Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION = 12;

	/**
	 * The feature id for the '<em><b>Semantic Object Score</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE = 13;

	/**
	 * The feature id for the '<em><b>Semantic Object Vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR = 14;

	/**
	 * The number of structural features of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.SemanticDiffImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticDiff()
	 * @generated
	 */
	int SEMANTIC_DIFF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Decision Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DECISION_SUPPORT = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Composite Factor sub Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support vendors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Factor scores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Model root Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Option vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Score score option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION;

	/**
	 * The feature id for the '<em><b>Semantic Object Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_FACTOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_MODEL = SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL;

	/**
	 * The feature id for the '<em><b>Semantic Object Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_OPTION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION;

	/**
	 * The feature id for the '<em><b>Semantic Object Score</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_SCORE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE;

	/**
	 * The feature id for the '<em><b>Semantic Object Vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_VENDOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR;

	/**
	 * The number of structural features of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.SemanticConflictImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Decision Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DECISION_SUPPORT = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Composite Factor sub Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Decision Support vendors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Factor scores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Model root Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Option vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Score score option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION;

	/**
	 * The feature id for the '<em><b>Semantic Object Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_FACTOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR;

	/**
	 * The feature id for the '<em><b>Semantic Object Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_MODEL = SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL;

	/**
	 * The feature id for the '<em><b>Semantic Object Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_OPTION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION;

	/**
	 * The feature id for the '<em><b>Semantic Object Score</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_SCORE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE;

	/**
	 * The feature id for the '<em><b>Semantic Object Vendor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_VENDOR = SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTICDIFFS = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupportImpl <em>Diff Decision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffDecisionSupportImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__NAME = DECISION_SUPPORT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__MODEL = DECISION_SUPPORT__MODEL;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__OPTIONS = DECISION_SUPPORT__OPTIONS;

	/**
	 * The feature id for the '<em><b>Vendors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__VENDORS = DECISION_SUPPORT__VENDORS;

	/**
	 * The feature id for the '<em><b>Diffmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFFMODEL = DECISION_SUPPORT__DIFFMODEL;

	/**
	 * The feature id for the '<em><b>Diffoptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFFOPTIONS = DECISION_SUPPORT__DIFFOPTIONS;

	/**
	 * The feature id for the '<em><b>Diffvendors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFFVENDORS = DECISION_SUPPORT__DIFFVENDORS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFF_KIND = DECISION_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__NEW_NAME = DECISION_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_FEATURE_COUNT = DECISION_SUPPORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPERATION_COUNT = DECISION_SUPPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_modelImpl <em>Diff Decision Support model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_modelImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_model()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Decision Support model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Decision Support model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_optionsImpl <em>Diff Decision Support options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_optionsImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_options()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Decision Support options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Decision Support options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_vendorsImpl <em>Diff Decision Support vendors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_vendorsImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_vendors()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_VENDORS = 14;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Decision Support vendors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Decision Support vendors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffModelImpl <em>Diff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffModelImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffModel()
	 * @generated
	 */
	int DIFF_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__MODEL_ID = MODEL__MODEL_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__GOAL = MODEL__GOAL;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DESCR = MODEL__DESCR;

	/**
	 * The feature id for the '<em><b>Num Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NUM_FACTS = MODEL__NUM_FACTS;

	/**
	 * The feature id for the '<em><b>Root Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__ROOT_FACTOR = MODEL__ROOT_FACTOR;

	/**
	 * The feature id for the '<em><b>Diffroot Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFFROOT_FACTOR = MODEL__DIFFROOT_FACTOR;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFF_KIND = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_MODEL_ID = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NAME = MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_GOAL = MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_DESCR = MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Num Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NUM_FACTS = MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffModel_rootFactorImpl <em>Diff Model root Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffModel_rootFactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffModel_rootFactor()
	 * @generated
	 */
	int DIFF_MODEL_ROOT_FACTOR = 16;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Model root Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Model root Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffFactor_scoresImpl <em>Diff Factor scores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffFactor_scoresImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffFactor_scores()
	 * @generated
	 */
	int DIFF_FACTOR_SCORES = 17;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Factor scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Factor scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl <em>Diff Leaf Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffLeafFactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffLeafFactor()
	 * @generated
	 */
	int DIFF_LEAF_FACTOR = 18;

	/**
	 * The feature id for the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__FACTOR_ID = LEAF_FACTOR__FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NAME = LEAF_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DESCR = LEAF_FACTOR__DESCR;

	/**
	 * The feature id for the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__GW = LEAF_FACTOR__GW;

	/**
	 * The feature id for the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__LW = LEAF_FACTOR__LW;

	/**
	 * The feature id for the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DEL = LEAF_FACTOR__DEL;

	/**
	 * The feature id for the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__HIDE_ON_LINE = LEAF_FACTOR__HIDE_ON_LINE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__SCORES = LEAF_FACTOR__SCORES;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__HIERARCHY = LEAF_FACTOR__HIERARCHY;

	/**
	 * The feature id for the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__MASTER_FACTOR_ID = LEAF_FACTOR__MASTER_FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Diffscores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DIFFSCORES = LEAF_FACTOR__DIFFSCORES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DIFF_KIND = LEAF_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_FACTOR_ID = LEAF_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_NAME = LEAF_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DESCR = LEAF_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_GW = LEAF_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_LW = LEAF_FACTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DEL = LEAF_FACTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE = LEAF_FACTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIERARCHY = LEAF_FACTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID = LEAF_FACTOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Diff Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR_FEATURE_COUNT = LEAF_FACTOR_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Diff Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR_OPERATION_COUNT = LEAF_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffCompositeFactorImpl <em>Diff Composite Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffCompositeFactorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffCompositeFactor()
	 * @generated
	 */
	int DIFF_COMPOSITE_FACTOR = 19;

	/**
	 * The feature id for the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__FACTOR_ID = COMPOSITE_FACTOR__FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NAME = COMPOSITE_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DESCR = COMPOSITE_FACTOR__DESCR;

	/**
	 * The feature id for the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__GW = COMPOSITE_FACTOR__GW;

	/**
	 * The feature id for the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__LW = COMPOSITE_FACTOR__LW;

	/**
	 * The feature id for the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DEL = COMPOSITE_FACTOR__DEL;

	/**
	 * The feature id for the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__HIDE_ON_LINE = COMPOSITE_FACTOR__HIDE_ON_LINE;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__SCORES = COMPOSITE_FACTOR__SCORES;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__HIERARCHY = COMPOSITE_FACTOR__HIERARCHY;

	/**
	 * The feature id for the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__MASTER_FACTOR_ID = COMPOSITE_FACTOR__MASTER_FACTOR_ID;

	/**
	 * The feature id for the '<em><b>Diffscores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DIFFSCORES = COMPOSITE_FACTOR__DIFFSCORES;

	/**
	 * The feature id for the '<em><b>Sub Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__SUB_FACTORS = COMPOSITE_FACTOR__SUB_FACTORS;

	/**
	 * The feature id for the '<em><b>Diffsub Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DIFFSUB_FACTORS = COMPOSITE_FACTOR__DIFFSUB_FACTORS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DIFF_KIND = COMPOSITE_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID = COMPOSITE_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_NAME = COMPOSITE_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DESCR = COMPOSITE_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_GW = COMPOSITE_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_LW = COMPOSITE_FACTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DEL = COMPOSITE_FACTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE = COMPOSITE_FACTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY = COMPOSITE_FACTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID = COMPOSITE_FACTOR_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Diff Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_FEATURE_COUNT = COMPOSITE_FACTOR_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Diff Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_OPERATION_COUNT = COMPOSITE_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl <em>Diff Composite Factor sub Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS = 20;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Composite Factor sub Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Composite Factor sub Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffOptionImpl <em>Diff Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffOptionImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffOption()
	 * @generated
	 */
	int DIFF_OPTION = 21;

	/**
	 * The feature id for the '<em><b>Option ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__OPTION_ID = OPTION__OPTION_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NAME = OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__SORT = OPTION__SORT;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__COST = OPTION__COST;

	/**
	 * The feature id for the '<em><b>Num Other Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NUM_OTHER_COSTS = OPTION__NUM_OTHER_COSTS;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__VENDOR = OPTION__VENDOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DESCRIPTION = OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Diffvendor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DIFFVENDOR = OPTION__DIFFVENDOR;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DIFF_KIND = OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Option ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_OPTION_ID = OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NAME = OPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_SORT = OPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_COST = OPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Num Other Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NUM_OTHER_COSTS = OPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_DESCRIPTION = OPTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Diff Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Diff Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffOption_vendorImpl <em>Diff Option vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffOption_vendorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffOption_vendor()
	 * @generated
	 */
	int DIFF_OPTION_VENDOR = 22;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Option vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Option vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffVendorImpl <em>Diff Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffVendorImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffVendor()
	 * @generated
	 */
	int DIFF_VENDOR = 23;

	/**
	 * The feature id for the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__VENDOR_ID = VENDOR__VENDOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NAME = VENDOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__DESCRIPTION = VENDOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__DIFF_KIND = VENDOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_VENDOR_ID = VENDOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_NAME = VENDOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_DESCRIPTION = VENDOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR_FEATURE_COUNT = VENDOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diff Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR_OPERATION_COUNT = VENDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffScoreImpl <em>Diff Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffScoreImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffScore()
	 * @generated
	 */
	int DIFF_SCORE = 24;

	/**
	 * The feature id for the '<em><b>SScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__SSCORE = SCORE__SSCORE;

	/**
	 * The feature id for the '<em><b>DScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DSCORE = SCORE__DSCORE;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DESCR = SCORE__DESCR;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__COMMENT = SCORE__COMMENT;

	/**
	 * The feature id for the '<em><b>Score option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__SCORE_OPTION = SCORE__SCORE_OPTION;

	/**
	 * The feature id for the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__METHOD_ID = SCORE__METHOD_ID;

	/**
	 * The feature id for the '<em><b>Diffscore option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DIFFSCORE_OPTION = SCORE__DIFFSCORE_OPTION;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DIFF_KIND = SCORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New SScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_SSCORE = SCORE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New DScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DSCORE = SCORE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DESCR = SCORE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_COMMENT = SCORE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_METHOD_ID = SCORE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_FEATURE_COUNT = SCORE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_OPERATION_COUNT = SCORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.impl.DiffScore_score_optionImpl <em>Diff Score score option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.impl.DiffScore_score_optionImpl
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffScore_score_option()
	 * @generated
	 */
	int DIFF_SCORE_SCORE_OPTION = 25;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Score score option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Score score option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getClassDiffKind()
	 * @generated
	 */
	int CLASS_DIFF_KIND = 26;

	/**
	 * The meta object id for the '{@link dssmm2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmm2WayDiffMM.AscDiffKind
	 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getAscDiffKind()
	 * @generated
	 */
	int ASC_DIFF_KIND = 27;


	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DecisionSupport <em>Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport
	 * @generated
	 */
	EClass getDecisionSupport();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DecisionSupport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getName()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EAttribute getDecisionSupport_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dssmm2WayDiffMM.DecisionSupport#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getModel()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.DecisionSupport#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getOptions()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.DecisionSupport#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendors</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getVendors()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Vendors();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.DecisionSupport#getDiffmodel <em>Diffmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodel</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getDiffmodel()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.DecisionSupport#getDiffoptions <em>Diffoptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffoptions</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getDiffoptions()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffoptions();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.DecisionSupport#getDiffvendors <em>Diffvendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvendors</em>'.
	 * @see dssmm2WayDiffMM.DecisionSupport#getDiffvendors()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffvendors();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dssmm2WayDiffMM.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Model#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see dssmm2WayDiffMM.Model#getModelID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Model#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see dssmm2WayDiffMM.Model#getGoal()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Goal();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Model#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm2WayDiffMM.Model#getDescr()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Model#getNumFacts <em>Num Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Facts</em>'.
	 * @see dssmm2WayDiffMM.Model#getNumFacts()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumFacts();

	/**
	 * Returns the meta object for the containment reference '{@link dssmm2WayDiffMM.Model#getRootFactor <em>Root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Factor</em>'.
	 * @see dssmm2WayDiffMM.Model#getRootFactor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RootFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.Model#getDiffrootFactor <em>Diffroot Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffroot Factor</em>'.
	 * @see dssmm2WayDiffMM.Model#getDiffrootFactor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DiffrootFactor();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see dssmm2WayDiffMM.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getFactorID <em>Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor ID</em>'.
	 * @see dssmm2WayDiffMM.Factor#getFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_FactorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm2WayDiffMM.Factor#getDescr()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getGW <em>GW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GW</em>'.
	 * @see dssmm2WayDiffMM.Factor#getGW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_GW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getLW <em>LW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LW</em>'.
	 * @see dssmm2WayDiffMM.Factor#getLW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_LW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Del</em>'.
	 * @see dssmm2WayDiffMM.Factor#getDel()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Del();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#isHideOnLine <em>Hide On Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide On Line</em>'.
	 * @see dssmm2WayDiffMM.Factor#isHideOnLine()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_HideOnLine();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.Factor#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scores</em>'.
	 * @see dssmm2WayDiffMM.Factor#getScores()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Scores();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see dssmm2WayDiffMM.Factor#getHierarchy()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Factor#getMasterFactorID <em>Master Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Factor ID</em>'.
	 * @see dssmm2WayDiffMM.Factor#getMasterFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_MasterFactorID();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.Factor#getDiffscores <em>Diffscores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffscores</em>'.
	 * @see dssmm2WayDiffMM.Factor#getDiffscores()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Diffscores();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.LeafFactor <em>Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Factor</em>'.
	 * @see dssmm2WayDiffMM.LeafFactor
	 * @generated
	 */
	EClass getLeafFactor();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.CompositeFactor <em>Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Factor</em>'.
	 * @see dssmm2WayDiffMM.CompositeFactor
	 * @generated
	 */
	EClass getCompositeFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.CompositeFactor#getSubFactors <em>Sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Factors</em>'.
	 * @see dssmm2WayDiffMM.CompositeFactor#getSubFactors()
	 * @see #getCompositeFactor()
	 * @generated
	 */
	EReference getCompositeFactor_SubFactors();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.CompositeFactor#getDiffsubFactors <em>Diffsub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsub Factors</em>'.
	 * @see dssmm2WayDiffMM.CompositeFactor#getDiffsubFactors()
	 * @see #getCompositeFactor()
	 * @generated
	 */
	EReference getCompositeFactor_DiffsubFactors();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see dssmm2WayDiffMM.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getOptionID <em>Option ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option ID</em>'.
	 * @see dssmm2WayDiffMM.Option#getOptionID()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see dssmm2WayDiffMM.Option#getSort()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Sort();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see dssmm2WayDiffMM.Option#getCost()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Cost();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getNumOtherCosts <em>Num Other Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Other Costs</em>'.
	 * @see dssmm2WayDiffMM.Option#getNumOtherCosts()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_NumOtherCosts();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.Option#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see dssmm2WayDiffMM.Option#getVendor()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Option#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmm2WayDiffMM.Option#getDescription()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.Option#getDiffvendor <em>Diffvendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvendor</em>'.
	 * @see dssmm2WayDiffMM.Option#getDiffvendor()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Diffvendor();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see dssmm2WayDiffMM.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Vendor#getVendorID <em>Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor ID</em>'.
	 * @see dssmm2WayDiffMM.Vendor#getVendorID()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_VendorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Vendor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.Vendor#getName()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Vendor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmm2WayDiffMM.Vendor#getDescription()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Description();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see dssmm2WayDiffMM.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Score#getSScore <em>SScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SScore</em>'.
	 * @see dssmm2WayDiffMM.Score#getSScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_SScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Score#getDScore <em>DScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DScore</em>'.
	 * @see dssmm2WayDiffMM.Score#getDScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_DScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Score#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmm2WayDiffMM.Score#getDescr()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Score#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see dssmm2WayDiffMM.Score#getComment()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Comment();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.Score#getScore_option <em>Score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Score option</em>'.
	 * @see dssmm2WayDiffMM.Score#getScore_option()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Score_option();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.Score#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see dssmm2WayDiffMM.Score#getMethodID()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_MethodID();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.Score#getDiffscore_option <em>Diffscore option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffscore option</em>'.
	 * @see dssmm2WayDiffMM.Score#getDiffscore_option()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Diffscore_option();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DecisionSupport <em>Semantic Object Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Decision Support</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DecisionSupport()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DecisionSupport();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffCompositeFactor_subFactors <em>Semantic Object Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Composite Factor sub Factors</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffCompositeFactor_subFactors()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_model <em>Semantic Object Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support model</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_model()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_model();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_options <em>Semantic Object Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support options</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_options()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_options();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_vendors <em>Semantic Object Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support vendors</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_vendors()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_vendors();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffFactor_scores <em>Semantic Object Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Factor scores</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffFactor_scores()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffFactor_scores();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffModel_rootFactor <em>Semantic Object Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Model root Factor</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffModel_rootFactor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffModel_rootFactor();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffOption_vendor <em>Semantic Object Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Option vendor</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffOption_vendor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffOption_vendor();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffScore_score_option <em>Semantic Object Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Score score option</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_DiffScore_score_option()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffScore_score_option();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_Factor <em>Semantic Object Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Factor</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_Factor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Factor();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_Model <em>Semantic Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Model</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_Model()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Model();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_Option <em>Semantic Object Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Option</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_Option()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Option();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_Score <em>Semantic Object Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Score</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_Score()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Score();

	/**
	 * Returns the meta object for the reference list '{@link dssmm2WayDiffMM.SemanticObject#getSemanticObject_Vendor <em>Semantic Object Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Vendor</em>'.
	 * @see dssmm2WayDiffMM.SemanticObject#getSemanticObject_Vendor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Vendor();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see dssmm2WayDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see dssmm2WayDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmm2WayDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticdiffs</em>'.
	 * @see dssmm2WayDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffDecisionSupport <em>Diff Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport
	 * @generated
	 */
	EClass getDiffDecisionSupport();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffDecisionSupport#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport#getDiff_kind()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffDecisionSupport#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport#getNew_Name()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_New_Name();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffDecisionSupport_model <em>Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support model</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_model
	 * @generated
	 */
	EClass getDiffDecisionSupport_model();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffDecisionSupport_model#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_model#getDiff_kind()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_model_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffDecisionSupport_model#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_model#getEType()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EReference getDiffDecisionSupport_model_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffDecisionSupport_options <em>Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support options</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_options
	 * @generated
	 */
	EClass getDiffDecisionSupport_options();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffDecisionSupport_options#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_options#getDiff_kind()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_options_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffDecisionSupport_options#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_options#getEType()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EReference getDiffDecisionSupport_options_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffDecisionSupport_vendors <em>Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support vendors</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_vendors
	 * @generated
	 */
	EClass getDiffDecisionSupport_vendors();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffDecisionSupport_vendors#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_vendors#getDiff_kind()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_vendors_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffDecisionSupport_vendors#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffDecisionSupport_vendors#getEType()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EReference getDiffDecisionSupport_vendors_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model</em>'.
	 * @see dssmm2WayDiffMM.DiffModel
	 * @generated
	 */
	EClass getDiffModel();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getDiff_kind()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getNew_ModelID <em>New Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Model ID</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getNew_ModelID()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_ModelID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getNew_Name()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getNew_Goal <em>New Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Goal</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getNew_Goal()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Goal();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getNew_Descr <em>New Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getNew_Descr()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel#getNew_NumFacts <em>New Num Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Facts</em>'.
	 * @see dssmm2WayDiffMM.DiffModel#getNew_NumFacts()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_NumFacts();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffModel_rootFactor <em>Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model root Factor</em>'.
	 * @see dssmm2WayDiffMM.DiffModel_rootFactor
	 * @generated
	 */
	EClass getDiffModel_rootFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffModel_rootFactor#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffModel_rootFactor#getDiff_kind()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EAttribute getDiffModel_rootFactor_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffModel_rootFactor#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffModel_rootFactor#getEType()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EReference getDiffModel_rootFactor_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffFactor_scores <em>Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Factor scores</em>'.
	 * @see dssmm2WayDiffMM.DiffFactor_scores
	 * @generated
	 */
	EClass getDiffFactor_scores();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffFactor_scores#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffFactor_scores#getDiff_kind()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EAttribute getDiffFactor_scores_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffFactor_scores#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffFactor_scores#getEType()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EReference getDiffFactor_scores_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffLeafFactor <em>Diff Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Leaf Factor</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor
	 * @generated
	 */
	EClass getDiffLeafFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getDiff_kind()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_FactorID <em>New Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_FactorID()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_FactorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_Name()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_Descr <em>New Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_Descr()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_GW <em>New GW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_GW()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_GW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_LW <em>New LW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_LW()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_LW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_Del <em>New Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_Del()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Del();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#isNew_HideOnLine <em>New Hide On Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#isNew_HideOnLine()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_HideOnLine();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_Hierarchy <em>New Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_Hierarchy()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffLeafFactor#getNew_MasterFactorID <em>New Master Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID</em>'.
	 * @see dssmm2WayDiffMM.DiffLeafFactor#getNew_MasterFactorID()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_MasterFactorID();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffCompositeFactor <em>Diff Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Composite Factor</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor
	 * @generated
	 */
	EClass getDiffCompositeFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getDiff_kind()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_FactorID <em>New Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_FactorID()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_FactorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_Name()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Descr <em>New Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_Descr()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_GW <em>New GW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_GW()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_GW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_LW <em>New LW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_LW()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_LW();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Del <em>New Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_Del()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Del();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#isNew_HideOnLine <em>New Hide On Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#isNew_HideOnLine()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_HideOnLine();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Hierarchy <em>New Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_Hierarchy()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_MasterFactorID <em>New Master Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor#getNew_MasterFactorID()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_MasterFactorID();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffCompositeFactor_subFactors <em>Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Composite Factor sub Factors</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor_subFactors
	 * @generated
	 */
	EClass getDiffCompositeFactor_subFactors();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffCompositeFactor_subFactors#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor_subFactors#getDiff_kind()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_subFactors_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffCompositeFactor_subFactors#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffCompositeFactor_subFactors#getEType()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EReference getDiffCompositeFactor_subFactors_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffOption <em>Diff Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Option</em>'.
	 * @see dssmm2WayDiffMM.DiffOption
	 * @generated
	 */
	EClass getDiffOption();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getDiff_kind()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_OptionID <em>New Option ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Option ID</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_OptionID()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_OptionID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_Name()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_Sort <em>New Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Sort</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_Sort()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Sort();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_Cost <em>New Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Cost</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_Cost()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Cost();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_NumOtherCosts <em>New Num Other Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Other Costs</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_NumOtherCosts()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_NumOtherCosts();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption#getNew_Description <em>New Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description</em>'.
	 * @see dssmm2WayDiffMM.DiffOption#getNew_Description()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Description();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffOption_vendor <em>Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Option vendor</em>'.
	 * @see dssmm2WayDiffMM.DiffOption_vendor
	 * @generated
	 */
	EClass getDiffOption_vendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffOption_vendor#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffOption_vendor#getDiff_kind()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EAttribute getDiffOption_vendor_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffOption_vendor#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffOption_vendor#getEType()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EReference getDiffOption_vendor_EType();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffVendor <em>Diff Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Vendor</em>'.
	 * @see dssmm2WayDiffMM.DiffVendor
	 * @generated
	 */
	EClass getDiffVendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffVendor#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffVendor#getDiff_kind()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffVendor#getNew_VendorID <em>New Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Vendor ID</em>'.
	 * @see dssmm2WayDiffMM.DiffVendor#getNew_VendorID()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_VendorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffVendor#getNew_Name <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see dssmm2WayDiffMM.DiffVendor#getNew_Name()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffVendor#getNew_Description <em>New Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description</em>'.
	 * @see dssmm2WayDiffMM.DiffVendor#getNew_Description()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Description();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffScore <em>Diff Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Score</em>'.
	 * @see dssmm2WayDiffMM.DiffScore
	 * @generated
	 */
	EClass getDiffScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getDiff_kind()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getNew_SScore <em>New SScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New SScore</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getNew_SScore()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_SScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getNew_DScore <em>New DScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New DScore</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getNew_DScore()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_DScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getNew_Descr <em>New Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getNew_Descr()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getNew_Comment <em>New Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Comment</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getNew_Comment()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Comment();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore#getNew_MethodID <em>New Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Method ID</em>'.
	 * @see dssmm2WayDiffMM.DiffScore#getNew_MethodID()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_MethodID();

	/**
	 * Returns the meta object for class '{@link dssmm2WayDiffMM.DiffScore_score_option <em>Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Score score option</em>'.
	 * @see dssmm2WayDiffMM.DiffScore_score_option
	 * @generated
	 */
	EClass getDiffScore_score_option();

	/**
	 * Returns the meta object for the attribute '{@link dssmm2WayDiffMM.DiffScore_score_option#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see dssmm2WayDiffMM.DiffScore_score_option#getDiff_kind()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EAttribute getDiffScore_score_option_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link dssmm2WayDiffMM.DiffScore_score_option#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmm2WayDiffMM.DiffScore_score_option#getEType()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EReference getDiffScore_score_option_EType();

	/**
	 * Returns the meta object for enum '{@link dssmm2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Diff Kind</em>'.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @generated
	 */
	EEnum getClassDiffKind();

	/**
	 * Returns the meta object for enum '{@link dssmm2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Diff Kind</em>'.
	 * @see dssmm2WayDiffMM.AscDiffKind
	 * @generated
	 */
	EEnum getAscDiffKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dssmm2WayDiffMMFactory getDssmm2WayDiffMMFactory();

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
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DecisionSupportImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDecisionSupport()
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
		 * The meta object literal for the '<em><b>Diffmodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__DIFFMODEL = eINSTANCE.getDecisionSupport_Diffmodel();

		/**
		 * The meta object literal for the '<em><b>Diffoptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__DIFFOPTIONS = eINSTANCE.getDecisionSupport_Diffoptions();

		/**
		 * The meta object literal for the '<em><b>Diffvendors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SUPPORT__DIFFVENDORS = eINSTANCE.getDecisionSupport_Diffvendors();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.ModelImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getModel()
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
		 * The meta object literal for the '<em><b>Diffroot Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DIFFROOT_FACTOR = eINSTANCE.getModel_DiffrootFactor();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.FactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getFactor()
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
		 * The meta object literal for the '<em><b>Diffscores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__DIFFSCORES = eINSTANCE.getFactor_Diffscores();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.LeafFactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getLeafFactor()
		 * @generated
		 */
		EClass LEAF_FACTOR = eINSTANCE.getLeafFactor();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.CompositeFactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getCompositeFactor()
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
		 * The meta object literal for the '<em><b>Diffsub Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FACTOR__DIFFSUB_FACTORS = eINSTANCE.getCompositeFactor_DiffsubFactors();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.OptionImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getOption()
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
		 * The meta object literal for the '<em><b>Diffvendor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__DIFFVENDOR = eINSTANCE.getOption_Diffvendor();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.VendorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getVendor()
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
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.ScoreImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getScore()
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

		/**
		 * The meta object literal for the '<em><b>Diffscore option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__DIFFSCORE_OPTION = eINSTANCE.getScore_Diffscore_option();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.SemanticObjectImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticObject()
		 * @generated
		 */
		EClass SEMANTIC_OBJECT = eINSTANCE.getSemanticObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_OBJECT__NAME = eINSTANCE.getSemanticObject_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Decision Support</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DECISION_SUPPORT = eINSTANCE.getSemanticObject_SemanticObject_DecisionSupport();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Composite Factor sub Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_COMPOSITE_FACTOR_SUB_FACTORS = eINSTANCE.getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Decision Support model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_MODEL = eINSTANCE.getSemanticObject_SemanticObject_DiffDecisionSupport_model();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Decision Support options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_OPTIONS = eINSTANCE.getSemanticObject_SemanticObject_DiffDecisionSupport_options();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Decision Support vendors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_DECISION_SUPPORT_VENDORS = eINSTANCE.getSemanticObject_SemanticObject_DiffDecisionSupport_vendors();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Factor scores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FACTOR_SCORES = eINSTANCE.getSemanticObject_SemanticObject_DiffFactor_scores();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Model root Factor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_MODEL_ROOT_FACTOR = eINSTANCE.getSemanticObject_SemanticObject_DiffModel_rootFactor();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Option vendor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_OPTION_VENDOR = eINSTANCE.getSemanticObject_SemanticObject_DiffOption_vendor();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Score score option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_SCORE_SCORE_OPTION = eINSTANCE.getSemanticObject_SemanticObject_DiffScore_score_option();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Factor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_FACTOR = eINSTANCE.getSemanticObject_SemanticObject_Factor();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_MODEL = eINSTANCE.getSemanticObject_SemanticObject_Model();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_OPTION = eINSTANCE.getSemanticObject_SemanticObject_Option();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Score</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_SCORE = eINSTANCE.getSemanticObject_SemanticObject_Score();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Vendor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_VENDOR = eINSTANCE.getSemanticObject_SemanticObject_Vendor();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.SemanticDiffImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticDiff()
		 * @generated
		 */
		EClass SEMANTIC_DIFF = eINSTANCE.getSemanticDiff();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.SemanticConflictImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getSemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupportImpl <em>Diff Decision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffDecisionSupportImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT = eINSTANCE.getDiffDecisionSupport();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__DIFF_KIND = eINSTANCE.getDiffDecisionSupport_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__NEW_NAME = eINSTANCE.getDiffDecisionSupport_New_Name();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_modelImpl <em>Diff Decision Support model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_modelImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_model()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_MODEL = eINSTANCE.getDiffDecisionSupport_model();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND = eINSTANCE.getDiffDecisionSupport_model_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_MODEL__ETYPE = eINSTANCE.getDiffDecisionSupport_model_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_optionsImpl <em>Diff Decision Support options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_optionsImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_options()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_OPTIONS = eINSTANCE.getDiffDecisionSupport_options();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND = eINSTANCE.getDiffDecisionSupport_options_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_OPTIONS__ETYPE = eINSTANCE.getDiffDecisionSupport_options_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffDecisionSupport_vendorsImpl <em>Diff Decision Support vendors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffDecisionSupport_vendorsImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffDecisionSupport_vendors()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_VENDORS = eINSTANCE.getDiffDecisionSupport_vendors();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND = eINSTANCE.getDiffDecisionSupport_vendors_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_VENDORS__ETYPE = eINSTANCE.getDiffDecisionSupport_vendors_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffModelImpl <em>Diff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffModelImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffModel()
		 * @generated
		 */
		EClass DIFF_MODEL = eINSTANCE.getDiffModel();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__DIFF_KIND = eINSTANCE.getDiffModel_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Model ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_MODEL_ID = eINSTANCE.getDiffModel_New_ModelID();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NAME = eINSTANCE.getDiffModel_New_Name();

		/**
		 * The meta object literal for the '<em><b>New Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_GOAL = eINSTANCE.getDiffModel_New_Goal();

		/**
		 * The meta object literal for the '<em><b>New Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_DESCR = eINSTANCE.getDiffModel_New_Descr();

		/**
		 * The meta object literal for the '<em><b>New Num Facts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NUM_FACTS = eINSTANCE.getDiffModel_New_NumFacts();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffModel_rootFactorImpl <em>Diff Model root Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffModel_rootFactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffModel_rootFactor()
		 * @generated
		 */
		EClass DIFF_MODEL_ROOT_FACTOR = eINSTANCE.getDiffModel_rootFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL_ROOT_FACTOR__DIFF_KIND = eINSTANCE.getDiffModel_rootFactor_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MODEL_ROOT_FACTOR__ETYPE = eINSTANCE.getDiffModel_rootFactor_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffFactor_scoresImpl <em>Diff Factor scores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffFactor_scoresImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffFactor_scores()
		 * @generated
		 */
		EClass DIFF_FACTOR_SCORES = eINSTANCE.getDiffFactor_scores();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FACTOR_SCORES__DIFF_KIND = eINSTANCE.getDiffFactor_scores_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FACTOR_SCORES__ETYPE = eINSTANCE.getDiffFactor_scores_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl <em>Diff Leaf Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffLeafFactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffLeafFactor()
		 * @generated
		 */
		EClass DIFF_LEAF_FACTOR = eINSTANCE.getDiffLeafFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__DIFF_KIND = eINSTANCE.getDiffLeafFactor_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_FACTOR_ID = eINSTANCE.getDiffLeafFactor_New_FactorID();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_NAME = eINSTANCE.getDiffLeafFactor_New_Name();

		/**
		 * The meta object literal for the '<em><b>New Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DESCR = eINSTANCE.getDiffLeafFactor_New_Descr();

		/**
		 * The meta object literal for the '<em><b>New GW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_GW = eINSTANCE.getDiffLeafFactor_New_GW();

		/**
		 * The meta object literal for the '<em><b>New LW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_LW = eINSTANCE.getDiffLeafFactor_New_LW();

		/**
		 * The meta object literal for the '<em><b>New Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DEL = eINSTANCE.getDiffLeafFactor_New_Del();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE = eINSTANCE.getDiffLeafFactor_New_HideOnLine();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIERARCHY = eINSTANCE.getDiffLeafFactor_New_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID = eINSTANCE.getDiffLeafFactor_New_MasterFactorID();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffCompositeFactorImpl <em>Diff Composite Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffCompositeFactorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffCompositeFactor()
		 * @generated
		 */
		EClass DIFF_COMPOSITE_FACTOR = eINSTANCE.getDiffCompositeFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__DIFF_KIND = eINSTANCE.getDiffCompositeFactor_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID = eINSTANCE.getDiffCompositeFactor_New_FactorID();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_NAME = eINSTANCE.getDiffCompositeFactor_New_Name();

		/**
		 * The meta object literal for the '<em><b>New Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DESCR = eINSTANCE.getDiffCompositeFactor_New_Descr();

		/**
		 * The meta object literal for the '<em><b>New GW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_GW = eINSTANCE.getDiffCompositeFactor_New_GW();

		/**
		 * The meta object literal for the '<em><b>New LW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_LW = eINSTANCE.getDiffCompositeFactor_New_LW();

		/**
		 * The meta object literal for the '<em><b>New Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DEL = eINSTANCE.getDiffCompositeFactor_New_Del();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE = eINSTANCE.getDiffCompositeFactor_New_HideOnLine();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY = eINSTANCE.getDiffCompositeFactor_New_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID = eINSTANCE.getDiffCompositeFactor_New_MasterFactorID();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl <em>Diff Composite Factor sub Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffCompositeFactor_subFactors()
		 * @generated
		 */
		EClass DIFF_COMPOSITE_FACTOR_SUB_FACTORS = eINSTANCE.getDiffCompositeFactor_subFactors();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND = eINSTANCE.getDiffCompositeFactor_subFactors_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE = eINSTANCE.getDiffCompositeFactor_subFactors_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffOptionImpl <em>Diff Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffOptionImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffOption()
		 * @generated
		 */
		EClass DIFF_OPTION = eINSTANCE.getDiffOption();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__DIFF_KIND = eINSTANCE.getDiffOption_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Option ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_OPTION_ID = eINSTANCE.getDiffOption_New_OptionID();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NAME = eINSTANCE.getDiffOption_New_Name();

		/**
		 * The meta object literal for the '<em><b>New Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_SORT = eINSTANCE.getDiffOption_New_Sort();

		/**
		 * The meta object literal for the '<em><b>New Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_COST = eINSTANCE.getDiffOption_New_Cost();

		/**
		 * The meta object literal for the '<em><b>New Num Other Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NUM_OTHER_COSTS = eINSTANCE.getDiffOption_New_NumOtherCosts();

		/**
		 * The meta object literal for the '<em><b>New Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_DESCRIPTION = eINSTANCE.getDiffOption_New_Description();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffOption_vendorImpl <em>Diff Option vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffOption_vendorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffOption_vendor()
		 * @generated
		 */
		EClass DIFF_OPTION_VENDOR = eINSTANCE.getDiffOption_vendor();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION_VENDOR__DIFF_KIND = eINSTANCE.getDiffOption_vendor_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_OPTION_VENDOR__ETYPE = eINSTANCE.getDiffOption_vendor_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffVendorImpl <em>Diff Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffVendorImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffVendor()
		 * @generated
		 */
		EClass DIFF_VENDOR = eINSTANCE.getDiffVendor();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__DIFF_KIND = eINSTANCE.getDiffVendor_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New Vendor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_VENDOR_ID = eINSTANCE.getDiffVendor_New_VendorID();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_NAME = eINSTANCE.getDiffVendor_New_Name();

		/**
		 * The meta object literal for the '<em><b>New Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_DESCRIPTION = eINSTANCE.getDiffVendor_New_Description();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffScoreImpl <em>Diff Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffScoreImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffScore()
		 * @generated
		 */
		EClass DIFF_SCORE = eINSTANCE.getDiffScore();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__DIFF_KIND = eINSTANCE.getDiffScore_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New SScore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_SSCORE = eINSTANCE.getDiffScore_New_SScore();

		/**
		 * The meta object literal for the '<em><b>New DScore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DSCORE = eINSTANCE.getDiffScore_New_DScore();

		/**
		 * The meta object literal for the '<em><b>New Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DESCR = eINSTANCE.getDiffScore_New_Descr();

		/**
		 * The meta object literal for the '<em><b>New Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_COMMENT = eINSTANCE.getDiffScore_New_Comment();

		/**
		 * The meta object literal for the '<em><b>New Method ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_METHOD_ID = eINSTANCE.getDiffScore_New_MethodID();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.impl.DiffScore_score_optionImpl <em>Diff Score score option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.impl.DiffScore_score_optionImpl
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getDiffScore_score_option()
		 * @generated
		 */
		EClass DIFF_SCORE_SCORE_OPTION = eINSTANCE.getDiffScore_score_option();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE_SCORE_OPTION__DIFF_KIND = eINSTANCE.getDiffScore_score_option_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SCORE_SCORE_OPTION__ETYPE = eINSTANCE.getDiffScore_score_option_EType();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.ClassDiffKind
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getClassDiffKind()
		 * @generated
		 */
		EEnum CLASS_DIFF_KIND = eINSTANCE.getClassDiffKind();

		/**
		 * The meta object literal for the '{@link dssmm2WayDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmm2WayDiffMM.AscDiffKind
		 * @see dssmm2WayDiffMM.impl.Dssmm2WayDiffMMPackageImpl#getAscDiffKind()
		 * @generated
		 */
		EEnum ASC_DIFF_KIND = eINSTANCE.getAscDiffKind();

	}

} //Dssmm2WayDiffMMPackage
