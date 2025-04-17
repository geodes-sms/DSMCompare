/**
 */
package dssmmDiffMM;

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
 * @see dssmmDiffMM.DssmmDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface DssmmDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dssmmDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zadahmad.org/dsvcs/dssmmDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dssmmDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DssmmDiffMMPackage eINSTANCE = dssmmDiffMM.impl.DssmmDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DecisionSupportImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDecisionSupport()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.ModelImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getModel()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.FactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getFactor()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.LeafFactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getLeafFactor()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.CompositeFactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getCompositeFactor()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.OptionImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getOption()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.VendorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getVendor()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.ScoreImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getScore()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.SemanticObjectImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticObject()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.SemanticDiffImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticDiff()
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
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__AUTHOR = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.SemanticConflictImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticConflict()
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
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffDecisionSupportImpl <em>Diff Decision Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffDecisionSupportImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFF_KIND_LEFT = DECISION_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__DIFF_KIND_RIGHT = DECISION_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__CHANGE_STATUS = DECISION_SUPPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__NEW_NAME_LEFT = DECISION_SUPPORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__NEW_NAME_RIGHT = DECISION_SUPPORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT__NAME_CHANGE_STATUS = DECISION_SUPPORT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_FEATURE_COUNT = DECISION_SUPPORT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Decision Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPERATION_COUNT = DECISION_SUPPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_modelImpl <em>Diff Decision Support model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffDecisionSupport_modelImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_model()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Decision Support model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Decision Support model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_optionsImpl <em>Diff Decision Support options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffDecisionSupport_optionsImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_options()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS = 13;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Decision Support options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Decision Support options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_vendorsImpl <em>Diff Decision Support vendors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffDecisionSupport_vendorsImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_vendors()
	 * @generated
	 */
	int DIFF_DECISION_SUPPORT_VENDORS = 14;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Decision Support vendors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Decision Support vendors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DECISION_SUPPORT_VENDORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffModelImpl <em>Diff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffModelImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffModel()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFF_KIND_LEFT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFF_KIND_RIGHT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__CHANGE_STATUS = MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Model ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_MODEL_ID_LEFT = MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Model ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_MODEL_ID_RIGHT = MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__MODEL_ID_CHANGE_STATUS = MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NAME_LEFT = MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NAME_RIGHT = MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NAME_CHANGE_STATUS = MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Goal Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_GOAL_LEFT = MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Goal Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_GOAL_RIGHT = MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Goal Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__GOAL_CHANGE_STATUS = MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_DESCR_LEFT = MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New Descr Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_DESCR_RIGHT = MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Descr Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DESCR_CHANGE_STATUS = MODEL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New Num Facts Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NUM_FACTS_LEFT = MODEL_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New Num Facts Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NEW_NUM_FACTS_RIGHT = MODEL_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Num Facts Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__NUM_FACTS_CHANGE_STATUS = MODEL_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Diff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Diff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl <em>Diff Model root Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffModel_rootFactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffModel_rootFactor()
	 * @generated
	 */
	int DIFF_MODEL_ROOT_FACTOR = 16;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Model root Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Model root Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_ROOT_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffFactor_scoresImpl <em>Diff Factor scores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffFactor_scoresImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffFactor_scores()
	 * @generated
	 */
	int DIFF_FACTOR_SCORES = 17;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Factor scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Factor scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FACTOR_SCORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffLeafFactorImpl <em>Diff Leaf Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffLeafFactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffLeafFactor()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DIFF_KIND_LEFT = LEAF_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT = LEAF_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Factor ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_NAME_LEFT = LEAF_FACTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_NAME_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DESCR_LEFT = LEAF_FACTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Descr Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Descr Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New GW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_GW_LEFT = LEAF_FACTOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New GW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_GW_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>GW Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__GW_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New LW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_LW_LEFT = LEAF_FACTOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New LW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_LW_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>LW Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__LW_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>New Del Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DEL_LEFT = LEAF_FACTOR_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>New Del Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_DEL_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Del Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>New Hide On Line Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT = LEAF_FACTOR_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>New Hide On Line Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Hide On Line Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>New Hierarchy Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT = LEAF_FACTOR_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>New Hierarchy Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Hierarchy Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>New Master Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT = LEAF_FACTOR_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>New Master Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT = LEAF_FACTOR_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Master Factor ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS = LEAF_FACTOR_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Diff Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR_FEATURE_COUNT = LEAF_FACTOR_FEATURE_COUNT + 30;

	/**
	 * The number of operations of the '<em>Diff Leaf Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEAF_FACTOR_OPERATION_COUNT = LEAF_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffCompositeFactorImpl <em>Diff Composite Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffCompositeFactorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffCompositeFactor()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DIFF_KIND_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DIFF_KIND_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Factor ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__FACTOR_ID_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_NAME_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_NAME_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NAME_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DESCR_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Descr Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DESCR_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Descr Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DESCR_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New GW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_GW_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New GW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_GW_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>GW Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__GW_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New LW Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_LW_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New LW Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_LW_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>LW Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__LW_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>New Del Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DEL_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>New Del Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_DEL_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Del Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__DEL_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>New Hide On Line Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>New Hide On Line Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Hide On Line Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__HIDE_ON_LINE_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>New Hierarchy Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>New Hierarchy Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Hierarchy Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__HIERARCHY_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>New Master Factor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_LEFT = COMPOSITE_FACTOR_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>New Master Factor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT = COMPOSITE_FACTOR_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Master Factor ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS = COMPOSITE_FACTOR_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Diff Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_FEATURE_COUNT = COMPOSITE_FACTOR_FEATURE_COUNT + 30;

	/**
	 * The number of operations of the '<em>Diff Composite Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_OPERATION_COUNT = COMPOSITE_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffCompositeFactor_subFactorsImpl <em>Diff Composite Factor sub Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffCompositeFactor_subFactorsImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS = 20;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Composite Factor sub Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Composite Factor sub Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_COMPOSITE_FACTOR_SUB_FACTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffOptionImpl <em>Diff Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffOptionImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffOption()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DIFF_KIND_LEFT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DIFF_KIND_RIGHT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__CHANGE_STATUS = OPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Option ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_OPTION_ID_LEFT = OPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Option ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_OPTION_ID_RIGHT = OPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Option ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__OPTION_ID_CHANGE_STATUS = OPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NAME_LEFT = OPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NAME_RIGHT = OPTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NAME_CHANGE_STATUS = OPTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Sort Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_SORT_LEFT = OPTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Sort Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_SORT_RIGHT = OPTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sort Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__SORT_CHANGE_STATUS = OPTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New Cost Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_COST_LEFT = OPTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New Cost Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_COST_RIGHT = OPTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cost Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__COST_CHANGE_STATUS = OPTION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New Num Other Costs Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT = OPTION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New Num Other Costs Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT = OPTION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Num Other Costs Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS = OPTION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>New Description Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_DESCRIPTION_LEFT = OPTION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>New Description Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__NEW_DESCRIPTION_RIGHT = OPTION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Description Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION__DESCRIPTION_CHANGE_STATUS = OPTION_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Diff Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Diff Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffOption_vendorImpl <em>Diff Option vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffOption_vendorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffOption_vendor()
	 * @generated
	 */
	int DIFF_OPTION_VENDOR = 22;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Option vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Option vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPTION_VENDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffVendorImpl <em>Diff Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffVendorImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffVendor()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__DIFF_KIND_LEFT = VENDOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__DIFF_KIND_RIGHT = VENDOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__CHANGE_STATUS = VENDOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Vendor ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_VENDOR_ID_LEFT = VENDOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Vendor ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_VENDOR_ID_RIGHT = VENDOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vendor ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS = VENDOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_NAME_LEFT = VENDOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_NAME_RIGHT = VENDOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NAME_CHANGE_STATUS = VENDOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Description Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_DESCRIPTION_LEFT = VENDOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Description Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__NEW_DESCRIPTION_RIGHT = VENDOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS = VENDOR_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Diff Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR_FEATURE_COUNT = VENDOR_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Diff Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VENDOR_OPERATION_COUNT = VENDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffScoreImpl <em>Diff Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffScoreImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffScore()
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
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DIFF_KIND_LEFT = SCORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DIFF_KIND_RIGHT = SCORE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__CHANGE_STATUS = SCORE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New SScore Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_SSCORE_LEFT = SCORE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New SScore Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_SSCORE_RIGHT = SCORE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>SScore Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__SSCORE_CHANGE_STATUS = SCORE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New DScore Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DSCORE_LEFT = SCORE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New DScore Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DSCORE_RIGHT = SCORE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>DScore Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DSCORE_CHANGE_STATUS = SCORE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New Descr Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DESCR_LEFT = SCORE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Descr Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_DESCR_RIGHT = SCORE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Descr Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__DESCR_CHANGE_STATUS = SCORE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New Comment Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_COMMENT_LEFT = SCORE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>New Comment Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_COMMENT_RIGHT = SCORE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Comment Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__COMMENT_CHANGE_STATUS = SCORE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>New Method ID Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_METHOD_ID_LEFT = SCORE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>New Method ID Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__NEW_METHOD_ID_RIGHT = SCORE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Method ID Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE__METHOD_ID_CHANGE_STATUS = SCORE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Diff Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_FEATURE_COUNT = SCORE_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Diff Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_OPERATION_COUNT = SCORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.impl.DiffScore_score_optionImpl <em>Diff Score score option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.impl.DiffScore_score_optionImpl
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffScore_score_option()
	 * @generated
	 */
	int DIFF_SCORE_SCORE_OPTION = 25;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION__ETYPE = 3;

	/**
	 * The number of structural features of the '<em>Diff Score score option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Score score option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SCORE_SCORE_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.ClassDiffKind
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getClassDiffKind()
	 * @generated
	 */
	int CLASS_DIFF_KIND = 26;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.AscDiffKind
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getAscDiffKind()
	 * @generated
	 */
	int ASC_DIFF_KIND = 27;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.AUTHOR
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 28;

	/**
	 * The meta object id for the '{@link dssmmDiffMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dssmmDiffMM.ChangeStatus
	 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 29;


	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DecisionSupport <em>Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Support</em>'.
	 * @see dssmmDiffMM.DecisionSupport
	 * @generated
	 */
	EClass getDecisionSupport();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DecisionSupport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getName()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EAttribute getDecisionSupport_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dssmmDiffMM.DecisionSupport#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getModel()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.DecisionSupport#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getOptions()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.DecisionSupport#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendors</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getVendors()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Vendors();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.DecisionSupport#getDiffmodel <em>Diffmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodel</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getDiffmodel()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.DecisionSupport#getDiffoptions <em>Diffoptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffoptions</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getDiffoptions()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffoptions();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.DecisionSupport#getDiffvendors <em>Diffvendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvendors</em>'.
	 * @see dssmmDiffMM.DecisionSupport#getDiffvendors()
	 * @see #getDecisionSupport()
	 * @generated
	 */
	EReference getDecisionSupport_Diffvendors();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see dssmmDiffMM.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Model#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see dssmmDiffMM.Model#getModelID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelID();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Model#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see dssmmDiffMM.Model#getGoal()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Goal();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Model#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmmDiffMM.Model#getDescr()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Model#getNumFacts <em>Num Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Facts</em>'.
	 * @see dssmmDiffMM.Model#getNumFacts()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_NumFacts();

	/**
	 * Returns the meta object for the containment reference '{@link dssmmDiffMM.Model#getRootFactor <em>Root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Factor</em>'.
	 * @see dssmmDiffMM.Model#getRootFactor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RootFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.Model#getDiffrootFactor <em>Diffroot Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffroot Factor</em>'.
	 * @see dssmmDiffMM.Model#getDiffrootFactor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DiffrootFactor();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see dssmmDiffMM.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getFactorID <em>Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor ID</em>'.
	 * @see dssmmDiffMM.Factor#getFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_FactorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmmDiffMM.Factor#getDescr()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getGW <em>GW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GW</em>'.
	 * @see dssmmDiffMM.Factor#getGW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_GW();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getLW <em>LW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LW</em>'.
	 * @see dssmmDiffMM.Factor#getLW()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_LW();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Del</em>'.
	 * @see dssmmDiffMM.Factor#getDel()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Del();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#isHideOnLine <em>Hide On Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide On Line</em>'.
	 * @see dssmmDiffMM.Factor#isHideOnLine()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_HideOnLine();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.Factor#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scores</em>'.
	 * @see dssmmDiffMM.Factor#getScores()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Scores();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see dssmmDiffMM.Factor#getHierarchy()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Factor#getMasterFactorID <em>Master Factor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Factor ID</em>'.
	 * @see dssmmDiffMM.Factor#getMasterFactorID()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_MasterFactorID();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.Factor#getDiffscores <em>Diffscores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffscores</em>'.
	 * @see dssmmDiffMM.Factor#getDiffscores()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Diffscores();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.LeafFactor <em>Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Factor</em>'.
	 * @see dssmmDiffMM.LeafFactor
	 * @generated
	 */
	EClass getLeafFactor();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.CompositeFactor <em>Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Factor</em>'.
	 * @see dssmmDiffMM.CompositeFactor
	 * @generated
	 */
	EClass getCompositeFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.CompositeFactor#getSubFactors <em>Sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Factors</em>'.
	 * @see dssmmDiffMM.CompositeFactor#getSubFactors()
	 * @see #getCompositeFactor()
	 * @generated
	 */
	EReference getCompositeFactor_SubFactors();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.CompositeFactor#getDiffsubFactors <em>Diffsub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsub Factors</em>'.
	 * @see dssmmDiffMM.CompositeFactor#getDiffsubFactors()
	 * @see #getCompositeFactor()
	 * @generated
	 */
	EReference getCompositeFactor_DiffsubFactors();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see dssmmDiffMM.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getOptionID <em>Option ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option ID</em>'.
	 * @see dssmmDiffMM.Option#getOptionID()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionID();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see dssmmDiffMM.Option#getSort()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Sort();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see dssmmDiffMM.Option#getCost()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Cost();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getNumOtherCosts <em>Num Other Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Other Costs</em>'.
	 * @see dssmmDiffMM.Option#getNumOtherCosts()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_NumOtherCosts();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.Option#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see dssmmDiffMM.Option#getVendor()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Option#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmmDiffMM.Option#getDescription()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.Option#getDiffvendor <em>Diffvendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvendor</em>'.
	 * @see dssmmDiffMM.Option#getDiffvendor()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Diffvendor();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see dssmmDiffMM.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Vendor#getVendorID <em>Vendor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor ID</em>'.
	 * @see dssmmDiffMM.Vendor#getVendorID()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_VendorID();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Vendor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.Vendor#getName()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Name();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Vendor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dssmmDiffMM.Vendor#getDescription()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_Description();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see dssmmDiffMM.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Score#getSScore <em>SScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SScore</em>'.
	 * @see dssmmDiffMM.Score#getSScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_SScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Score#getDScore <em>DScore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DScore</em>'.
	 * @see dssmmDiffMM.Score#getDScore()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_DScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Score#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see dssmmDiffMM.Score#getDescr()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Descr();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Score#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see dssmmDiffMM.Score#getComment()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Comment();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.Score#getScore_option <em>Score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Score option</em>'.
	 * @see dssmmDiffMM.Score#getScore_option()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Score_option();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.Score#getMethodID <em>Method ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID</em>'.
	 * @see dssmmDiffMM.Score#getMethodID()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_MethodID();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.Score#getDiffscore_option <em>Diffscore option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffscore option</em>'.
	 * @see dssmmDiffMM.Score#getDiffscore_option()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Diffscore_option();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see dssmmDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dssmmDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DecisionSupport <em>Semantic Object Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Decision Support</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DecisionSupport()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DecisionSupport();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffCompositeFactor_subFactors <em>Semantic Object Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Composite Factor sub Factors</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffCompositeFactor_subFactors()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_model <em>Semantic Object Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support model</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_model()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_model();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_options <em>Semantic Object Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support options</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_options()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_options();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_vendors <em>Semantic Object Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Decision Support vendors</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_vendors()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffDecisionSupport_vendors();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffFactor_scores <em>Semantic Object Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Factor scores</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffFactor_scores()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffFactor_scores();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffModel_rootFactor <em>Semantic Object Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Model root Factor</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffModel_rootFactor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffModel_rootFactor();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffOption_vendor <em>Semantic Object Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Option vendor</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffOption_vendor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffOption_vendor();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffScore_score_option <em>Semantic Object Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Score score option</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_DiffScore_score_option()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffScore_score_option();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_Factor <em>Semantic Object Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Factor</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_Factor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Factor();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_Model <em>Semantic Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Model</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_Model()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Model();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_Option <em>Semantic Object Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Option</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_Option()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Option();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_Score <em>Semantic Object Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Score</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_Score()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Score();

	/**
	 * Returns the meta object for the reference list '{@link dssmmDiffMM.SemanticObject#getSemanticObject_Vendor <em>Semantic Object Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Vendor</em>'.
	 * @see dssmmDiffMM.SemanticObject#getSemanticObject_Vendor()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_Vendor();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see dssmmDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see dssmmDiffMM.SemanticDiff#getAuthor()
	 * @see #getSemanticDiff()
	 * @generated
	 */
	EAttribute getSemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see dssmmDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link dssmmDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semanticdiffs</em>'.
	 * @see dssmmDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffDecisionSupport <em>Diff Decision Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport
	 * @generated
	 */
	EClass getDiffDecisionSupport();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getDiff_kind_Left()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getDiff_kind_Right()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getChangeStatus()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getNew_Name_Left()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getNew_Name_Right()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport#getNameChangeStatus()
	 * @see #getDiffDecisionSupport()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffDecisionSupport_model <em>Diff Decision Support model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support model</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_model
	 * @generated
	 */
	EClass getDiffDecisionSupport_model();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Left()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_model_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Right()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_model_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_model#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_model#getChangeStatus()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_model_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffDecisionSupport_model#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_model#getEType()
	 * @see #getDiffDecisionSupport_model()
	 * @generated
	 */
	EReference getDiffDecisionSupport_model_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffDecisionSupport_options <em>Diff Decision Support options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support options</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_options
	 * @generated
	 */
	EClass getDiffDecisionSupport_options();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_options#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_options#getDiff_kind_Left()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_options_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_options#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_options#getDiff_kind_Right()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_options_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_options#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_options#getChangeStatus()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_options_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffDecisionSupport_options#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_options#getEType()
	 * @see #getDiffDecisionSupport_options()
	 * @generated
	 */
	EReference getDiffDecisionSupport_options_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffDecisionSupport_vendors <em>Diff Decision Support vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Decision Support vendors</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors
	 * @generated
	 */
	EClass getDiffDecisionSupport_vendors();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_vendors#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors#getDiff_kind_Left()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_vendors_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_vendors#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors#getDiff_kind_Right()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_vendors_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffDecisionSupport_vendors#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors#getChangeStatus()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EAttribute getDiffDecisionSupport_vendors_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffDecisionSupport_vendors#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffDecisionSupport_vendors#getEType()
	 * @see #getDiffDecisionSupport_vendors()
	 * @generated
	 */
	EReference getDiffDecisionSupport_vendors_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model</em>'.
	 * @see dssmmDiffMM.DiffModel
	 * @generated
	 */
	EClass getDiffModel();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getDiff_kind_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getDiff_kind_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_ModelID_Left <em>New Model ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Model ID Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_ModelID_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_ModelID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_ModelID_Right <em>New Model ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Model ID Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_ModelID_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_ModelID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getModelIDChangeStatus <em>Model ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getModelIDChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_ModelIDChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Name_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Name_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getNameChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Goal_Left <em>New Goal Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Goal Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Goal_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Goal_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Goal_Right <em>New Goal Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Goal Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Goal_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Goal_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getGoalChangeStatus <em>Goal Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getGoalChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_GoalChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Descr_Left <em>New Descr Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Descr_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Descr_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_Descr_Right <em>New Descr Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_Descr_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_Descr_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getDescrChangeStatus <em>Descr Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getDescrChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_DescrChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Left <em>New Num Facts Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Facts Left</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_NumFacts_Left()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_NumFacts_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNew_NumFacts_Right <em>New Num Facts Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Facts Right</em>'.
	 * @see dssmmDiffMM.DiffModel#getNew_NumFacts_Right()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_New_NumFacts_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel#getNumFactsChangeStatus <em>Num Facts Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Facts Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel#getNumFactsChangeStatus()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_NumFactsChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffModel_rootFactor <em>Diff Model root Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model root Factor</em>'.
	 * @see dssmmDiffMM.DiffModel_rootFactor
	 * @generated
	 */
	EClass getDiffModel_rootFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel_rootFactor#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffModel_rootFactor#getDiff_kind_Left()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EAttribute getDiffModel_rootFactor_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel_rootFactor#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffModel_rootFactor#getDiff_kind_Right()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EAttribute getDiffModel_rootFactor_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffModel_rootFactor#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffModel_rootFactor#getChangeStatus()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EAttribute getDiffModel_rootFactor_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffModel_rootFactor#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffModel_rootFactor#getEType()
	 * @see #getDiffModel_rootFactor()
	 * @generated
	 */
	EReference getDiffModel_rootFactor_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffFactor_scores <em>Diff Factor scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Factor scores</em>'.
	 * @see dssmmDiffMM.DiffFactor_scores
	 * @generated
	 */
	EClass getDiffFactor_scores();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffFactor_scores#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffFactor_scores#getDiff_kind_Left()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EAttribute getDiffFactor_scores_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffFactor_scores#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffFactor_scores#getDiff_kind_Right()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EAttribute getDiffFactor_scores_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffFactor_scores#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffFactor_scores#getChangeStatus()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EAttribute getDiffFactor_scores_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffFactor_scores#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffFactor_scores#getEType()
	 * @see #getDiffFactor_scores()
	 * @generated
	 */
	EReference getDiffFactor_scores_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffLeafFactor <em>Diff Leaf Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Leaf Factor</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor
	 * @generated
	 */
	EClass getDiffLeafFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getDiff_kind_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getDiff_kind_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Left <em>New Factor ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_FactorID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Right <em>New Factor ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_FactorID_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_FactorID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getFactorIDChangeStatus <em>Factor ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getFactorIDChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_FactorIDChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Name_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Name_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNameChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Left <em>New Descr Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Descr_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Descr_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Descr_Right <em>New Descr Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Descr_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Descr_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getDescrChangeStatus <em>Descr Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getDescrChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_DescrChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Left <em>New GW Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_GW_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_GW_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_GW_Right <em>New GW Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_GW_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_GW_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getGWChangeStatus <em>GW Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GW Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getGWChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_GWChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Left <em>New LW Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_LW_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_LW_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_LW_Right <em>New LW Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_LW_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_LW_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getLWChangeStatus <em>LW Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LW Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getLWChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_LWChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Left <em>New Del Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Del_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Del_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Del_Right <em>New Del Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Del_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Del_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getDelChangeStatus <em>Del Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Del Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getDelChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_DelChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Left <em>New Hide On Line Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_HideOnLine_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Right <em>New Hide On Line Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#isNew_HideOnLine_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_HideOnLine_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getHideOnLineChangeStatus <em>Hide On Line Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide On Line Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getHideOnLineChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_HideOnLineChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Left <em>New Hierarchy Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Hierarchy_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Right <em>New Hierarchy Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_Hierarchy_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_Hierarchy_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getHierarchyChangeStatus <em>Hierarchy Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getHierarchyChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_HierarchyChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Left <em>New Master Factor ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID Left</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Left()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_MasterFactorID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Right <em>New Master Factor ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID Right</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getNew_MasterFactorID_Right()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_New_MasterFactorID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffLeafFactor#getMasterFactorIDChangeStatus <em>Master Factor ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Factor ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffLeafFactor#getMasterFactorIDChangeStatus()
	 * @see #getDiffLeafFactor()
	 * @generated
	 */
	EAttribute getDiffLeafFactor_MasterFactorIDChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffCompositeFactor <em>Diff Composite Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Composite Factor</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor
	 * @generated
	 */
	EClass getDiffCompositeFactor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getDiff_kind_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getDiff_kind_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_FactorID_Left <em>New Factor ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_FactorID_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_FactorID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_FactorID_Right <em>New Factor ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Factor ID Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_FactorID_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_FactorID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getFactorIDChangeStatus <em>Factor ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getFactorIDChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_FactorIDChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Name_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Name_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNameChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Descr_Left <em>New Descr Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Descr_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Descr_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Descr_Right <em>New Descr Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Descr_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Descr_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getDescrChangeStatus <em>Descr Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getDescrChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_DescrChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_GW_Left <em>New GW Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_GW_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_GW_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_GW_Right <em>New GW Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New GW Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_GW_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_GW_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getGWChangeStatus <em>GW Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GW Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getGWChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_GWChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_LW_Left <em>New LW Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_LW_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_LW_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_LW_Right <em>New LW Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New LW Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_LW_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_LW_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getLWChangeStatus <em>LW Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LW Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getLWChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_LWChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Del_Left <em>New Del Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Del_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Del_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Del_Right <em>New Del Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Del Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Del_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Del_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getDelChangeStatus <em>Del Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Del Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getDelChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_DelChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#isNew_HideOnLine_Left <em>New Hide On Line Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#isNew_HideOnLine_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_HideOnLine_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#isNew_HideOnLine_Right <em>New Hide On Line Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hide On Line Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#isNew_HideOnLine_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_HideOnLine_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getHideOnLineChangeStatus <em>Hide On Line Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide On Line Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getHideOnLineChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_HideOnLineChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Hierarchy_Left <em>New Hierarchy Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Hierarchy_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Hierarchy_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_Hierarchy_Right <em>New Hierarchy Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Hierarchy Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_Hierarchy_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_Hierarchy_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getHierarchyChangeStatus <em>Hierarchy Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getHierarchyChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_HierarchyChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_MasterFactorID_Left <em>New Master Factor ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_MasterFactorID_Left()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_MasterFactorID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getNew_MasterFactorID_Right <em>New Master Factor ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Master Factor ID Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getNew_MasterFactorID_Right()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_New_MasterFactorID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor#getMasterFactorIDChangeStatus <em>Master Factor ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Factor ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor#getMasterFactorIDChangeStatus()
	 * @see #getDiffCompositeFactor()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_MasterFactorIDChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffCompositeFactor_subFactors <em>Diff Composite Factor sub Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Composite Factor sub Factors</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors
	 * @generated
	 */
	EClass getDiffCompositeFactor_subFactors();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor_subFactors#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors#getDiff_kind_Left()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_subFactors_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor_subFactors#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors#getDiff_kind_Right()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_subFactors_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffCompositeFactor_subFactors#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors#getChangeStatus()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EAttribute getDiffCompositeFactor_subFactors_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffCompositeFactor_subFactors#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffCompositeFactor_subFactors#getEType()
	 * @see #getDiffCompositeFactor_subFactors()
	 * @generated
	 */
	EReference getDiffCompositeFactor_subFactors_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffOption <em>Diff Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Option</em>'.
	 * @see dssmmDiffMM.DiffOption
	 * @generated
	 */
	EClass getDiffOption();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getDiff_kind_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getDiff_kind_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_OptionID_Left <em>New Option ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Option ID Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_OptionID_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_OptionID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_OptionID_Right <em>New Option ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Option ID Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_OptionID_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_OptionID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getOptionIDChangeStatus <em>Option ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getOptionIDChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_OptionIDChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Name_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Name_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getNameChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Sort_Left <em>New Sort Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Sort Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Sort_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Sort_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Sort_Right <em>New Sort Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Sort Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Sort_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Sort_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getSortChangeStatus <em>Sort Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getSortChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_SortChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Cost_Left <em>New Cost Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Cost Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Cost_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Cost_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Cost_Right <em>New Cost Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Cost Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Cost_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Cost_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getCostChangeStatus <em>Cost Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getCostChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_CostChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Left <em>New Num Other Costs Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Other Costs Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_NumOtherCosts_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Right <em>New Num Other Costs Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Num Other Costs Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_NumOtherCosts_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_NumOtherCosts_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNumOtherCostsChangeStatus <em>Num Other Costs Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Other Costs Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getNumOtherCostsChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_NumOtherCostsChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Description_Left <em>New Description Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description Left</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Description_Left()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Description_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getNew_Description_Right <em>New Description Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description Right</em>'.
	 * @see dssmmDiffMM.DiffOption#getNew_Description_Right()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_New_Description_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption#getDescriptionChangeStatus <em>Description Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption#getDescriptionChangeStatus()
	 * @see #getDiffOption()
	 * @generated
	 */
	EAttribute getDiffOption_DescriptionChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffOption_vendor <em>Diff Option vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Option vendor</em>'.
	 * @see dssmmDiffMM.DiffOption_vendor
	 * @generated
	 */
	EClass getDiffOption_vendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption_vendor#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffOption_vendor#getDiff_kind_Left()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EAttribute getDiffOption_vendor_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption_vendor#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffOption_vendor#getDiff_kind_Right()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EAttribute getDiffOption_vendor_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffOption_vendor#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffOption_vendor#getChangeStatus()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EAttribute getDiffOption_vendor_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffOption_vendor#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffOption_vendor#getEType()
	 * @see #getDiffOption_vendor()
	 * @generated
	 */
	EReference getDiffOption_vendor_EType();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffVendor <em>Diff Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Vendor</em>'.
	 * @see dssmmDiffMM.DiffVendor
	 * @generated
	 */
	EClass getDiffVendor();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffVendor#getDiff_kind_Left()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffVendor#getDiff_kind_Right()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffVendor#getChangeStatus()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Left <em>New Vendor ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Vendor ID Left</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_VendorID_Left()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_VendorID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_VendorID_Right <em>New Vendor ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Vendor ID Right</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_VendorID_Right()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_VendorID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getVendorIDChangeStatus <em>Vendor ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffVendor#getVendorIDChangeStatus()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_VendorIDChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_Name_Left <em>New Name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Left</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_Name_Left()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Name_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_Name_Right <em>New Name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name Right</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_Name_Right()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Name_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNameChangeStatus()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_Description_Left <em>New Description Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description Left</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_Description_Left()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Description_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getNew_Description_Right <em>New Description Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Description Right</em>'.
	 * @see dssmmDiffMM.DiffVendor#getNew_Description_Right()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_New_Description_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffVendor#getDescriptionChangeStatus <em>Description Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Change Status</em>'.
	 * @see dssmmDiffMM.DiffVendor#getDescriptionChangeStatus()
	 * @see #getDiffVendor()
	 * @generated
	 */
	EAttribute getDiffVendor_DescriptionChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffScore <em>Diff Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Score</em>'.
	 * @see dssmmDiffMM.DiffScore
	 * @generated
	 */
	EClass getDiffScore();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getDiff_kind_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getDiff_kind_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_SScore_Left <em>New SScore Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New SScore Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_SScore_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_SScore_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_SScore_Right <em>New SScore Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New SScore Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_SScore_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_SScore_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getSScoreChangeStatus <em>SScore Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SScore Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getSScoreChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_SScoreChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_DScore_Left <em>New DScore Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New DScore Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_DScore_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_DScore_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_DScore_Right <em>New DScore Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New DScore Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_DScore_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_DScore_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getDScoreChangeStatus <em>DScore Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DScore Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getDScoreChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_DScoreChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_Descr_Left <em>New Descr Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_Descr_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Descr_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_Descr_Right <em>New Descr Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Descr Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_Descr_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Descr_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getDescrChangeStatus <em>Descr Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getDescrChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_DescrChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_Comment_Left <em>New Comment Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Comment Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_Comment_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Comment_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_Comment_Right <em>New Comment Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Comment Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_Comment_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_Comment_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getCommentChangeStatus <em>Comment Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getCommentChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_CommentChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_MethodID_Left <em>New Method ID Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Method ID Left</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_MethodID_Left()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_MethodID_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getNew_MethodID_Right <em>New Method ID Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Method ID Right</em>'.
	 * @see dssmmDiffMM.DiffScore#getNew_MethodID_Right()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_New_MethodID_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore#getMethodIDChangeStatus <em>Method ID Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method ID Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore#getMethodIDChangeStatus()
	 * @see #getDiffScore()
	 * @generated
	 */
	EAttribute getDiffScore_MethodIDChangeStatus();

	/**
	 * Returns the meta object for class '{@link dssmmDiffMM.DiffScore_score_option <em>Diff Score score option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Score score option</em>'.
	 * @see dssmmDiffMM.DiffScore_score_option
	 * @generated
	 */
	EClass getDiffScore_score_option();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore_score_option#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see dssmmDiffMM.DiffScore_score_option#getDiff_kind_Left()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EAttribute getDiffScore_score_option_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore_score_option#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see dssmmDiffMM.DiffScore_score_option#getDiff_kind_Right()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EAttribute getDiffScore_score_option_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link dssmmDiffMM.DiffScore_score_option#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see dssmmDiffMM.DiffScore_score_option#getChangeStatus()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EAttribute getDiffScore_score_option_ChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link dssmmDiffMM.DiffScore_score_option#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see dssmmDiffMM.DiffScore_score_option#getEType()
	 * @see #getDiffScore_score_option()
	 * @generated
	 */
	EReference getDiffScore_score_option_EType();

	/**
	 * Returns the meta object for enum '{@link dssmmDiffMM.ClassDiffKind <em>Class Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Diff Kind</em>'.
	 * @see dssmmDiffMM.ClassDiffKind
	 * @generated
	 */
	EEnum getClassDiffKind();

	/**
	 * Returns the meta object for enum '{@link dssmmDiffMM.AscDiffKind <em>Asc Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Diff Kind</em>'.
	 * @see dssmmDiffMM.AscDiffKind
	 * @generated
	 */
	EEnum getAscDiffKind();

	/**
	 * Returns the meta object for enum '{@link dssmmDiffMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see dssmmDiffMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link dssmmDiffMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see dssmmDiffMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DssmmDiffMMFactory getDssmmDiffMMFactory();

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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DecisionSupportImpl <em>Decision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DecisionSupportImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDecisionSupport()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.ModelImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getModel()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.FactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getFactor()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.LeafFactorImpl <em>Leaf Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.LeafFactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getLeafFactor()
		 * @generated
		 */
		EClass LEAF_FACTOR = eINSTANCE.getLeafFactor();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.CompositeFactorImpl <em>Composite Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.CompositeFactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getCompositeFactor()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.OptionImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getOption()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.VendorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getVendor()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.ScoreImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getScore()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.SemanticObjectImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticObject()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.SemanticDiffImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticDiff()
		 * @generated
		 */
		EClass SEMANTIC_DIFF = eINSTANCE.getSemanticDiff();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_DIFF__AUTHOR = eINSTANCE.getSemanticDiff_Author();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.SemanticConflictImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getSemanticConflict()
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
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffDecisionSupportImpl <em>Diff Decision Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffDecisionSupportImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT = eINSTANCE.getDiffDecisionSupport();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__DIFF_KIND_LEFT = eINSTANCE.getDiffDecisionSupport_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__DIFF_KIND_RIGHT = eINSTANCE.getDiffDecisionSupport_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__CHANGE_STATUS = eINSTANCE.getDiffDecisionSupport_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__NEW_NAME_LEFT = eINSTANCE.getDiffDecisionSupport_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__NEW_NAME_RIGHT = eINSTANCE.getDiffDecisionSupport_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT__NAME_CHANGE_STATUS = eINSTANCE.getDiffDecisionSupport_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_modelImpl <em>Diff Decision Support model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffDecisionSupport_modelImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_model()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_MODEL = eINSTANCE.getDiffDecisionSupport_model();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_LEFT = eINSTANCE.getDiffDecisionSupport_model_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_MODEL__DIFF_KIND_RIGHT = eINSTANCE.getDiffDecisionSupport_model_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_MODEL__CHANGE_STATUS = eINSTANCE.getDiffDecisionSupport_model_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_MODEL__ETYPE = eINSTANCE.getDiffDecisionSupport_model_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_optionsImpl <em>Diff Decision Support options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffDecisionSupport_optionsImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_options()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_OPTIONS = eINSTANCE.getDiffDecisionSupport_options();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_LEFT = eINSTANCE.getDiffDecisionSupport_options_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_OPTIONS__DIFF_KIND_RIGHT = eINSTANCE.getDiffDecisionSupport_options_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_OPTIONS__CHANGE_STATUS = eINSTANCE.getDiffDecisionSupport_options_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_OPTIONS__ETYPE = eINSTANCE.getDiffDecisionSupport_options_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffDecisionSupport_vendorsImpl <em>Diff Decision Support vendors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffDecisionSupport_vendorsImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffDecisionSupport_vendors()
		 * @generated
		 */
		EClass DIFF_DECISION_SUPPORT_VENDORS = eINSTANCE.getDiffDecisionSupport_vendors();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_LEFT = eINSTANCE.getDiffDecisionSupport_vendors_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_VENDORS__DIFF_KIND_RIGHT = eINSTANCE.getDiffDecisionSupport_vendors_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DECISION_SUPPORT_VENDORS__CHANGE_STATUS = eINSTANCE.getDiffDecisionSupport_vendors_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_DECISION_SUPPORT_VENDORS__ETYPE = eINSTANCE.getDiffDecisionSupport_vendors_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffModelImpl <em>Diff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffModelImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffModel()
		 * @generated
		 */
		EClass DIFF_MODEL = eINSTANCE.getDiffModel();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__DIFF_KIND_LEFT = eINSTANCE.getDiffModel_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__DIFF_KIND_RIGHT = eINSTANCE.getDiffModel_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__CHANGE_STATUS = eINSTANCE.getDiffModel_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Model ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_MODEL_ID_LEFT = eINSTANCE.getDiffModel_New_ModelID_Left();

		/**
		 * The meta object literal for the '<em><b>New Model ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_MODEL_ID_RIGHT = eINSTANCE.getDiffModel_New_ModelID_Right();

		/**
		 * The meta object literal for the '<em><b>Model ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__MODEL_ID_CHANGE_STATUS = eINSTANCE.getDiffModel_ModelIDChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NAME_LEFT = eINSTANCE.getDiffModel_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NAME_RIGHT = eINSTANCE.getDiffModel_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NAME_CHANGE_STATUS = eINSTANCE.getDiffModel_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Goal Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_GOAL_LEFT = eINSTANCE.getDiffModel_New_Goal_Left();

		/**
		 * The meta object literal for the '<em><b>New Goal Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_GOAL_RIGHT = eINSTANCE.getDiffModel_New_Goal_Right();

		/**
		 * The meta object literal for the '<em><b>Goal Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__GOAL_CHANGE_STATUS = eINSTANCE.getDiffModel_GoalChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Descr Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_DESCR_LEFT = eINSTANCE.getDiffModel_New_Descr_Left();

		/**
		 * The meta object literal for the '<em><b>New Descr Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_DESCR_RIGHT = eINSTANCE.getDiffModel_New_Descr_Right();

		/**
		 * The meta object literal for the '<em><b>Descr Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__DESCR_CHANGE_STATUS = eINSTANCE.getDiffModel_DescrChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Num Facts Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NUM_FACTS_LEFT = eINSTANCE.getDiffModel_New_NumFacts_Left();

		/**
		 * The meta object literal for the '<em><b>New Num Facts Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NEW_NUM_FACTS_RIGHT = eINSTANCE.getDiffModel_New_NumFacts_Right();

		/**
		 * The meta object literal for the '<em><b>Num Facts Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__NUM_FACTS_CHANGE_STATUS = eINSTANCE.getDiffModel_NumFactsChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl <em>Diff Model root Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffModel_rootFactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffModel_rootFactor()
		 * @generated
		 */
		EClass DIFF_MODEL_ROOT_FACTOR = eINSTANCE.getDiffModel_rootFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT = eINSTANCE.getDiffModel_rootFactor_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT = eINSTANCE.getDiffModel_rootFactor_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS = eINSTANCE.getDiffModel_rootFactor_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MODEL_ROOT_FACTOR__ETYPE = eINSTANCE.getDiffModel_rootFactor_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffFactor_scoresImpl <em>Diff Factor scores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffFactor_scoresImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffFactor_scores()
		 * @generated
		 */
		EClass DIFF_FACTOR_SCORES = eINSTANCE.getDiffFactor_scores();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FACTOR_SCORES__DIFF_KIND_LEFT = eINSTANCE.getDiffFactor_scores_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FACTOR_SCORES__DIFF_KIND_RIGHT = eINSTANCE.getDiffFactor_scores_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FACTOR_SCORES__CHANGE_STATUS = eINSTANCE.getDiffFactor_scores_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FACTOR_SCORES__ETYPE = eINSTANCE.getDiffFactor_scores_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffLeafFactorImpl <em>Diff Leaf Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffLeafFactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffLeafFactor()
		 * @generated
		 */
		EClass DIFF_LEAF_FACTOR = eINSTANCE.getDiffLeafFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__DIFF_KIND_LEFT = eINSTANCE.getDiffLeafFactor_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT = eINSTANCE.getDiffLeafFactor_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Factor ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT = eINSTANCE.getDiffLeafFactor_New_FactorID_Left();

		/**
		 * The meta object literal for the '<em><b>New Factor ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT = eINSTANCE.getDiffLeafFactor_New_FactorID_Right();

		/**
		 * The meta object literal for the '<em><b>Factor ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_FactorIDChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_NAME_LEFT = eINSTANCE.getDiffLeafFactor_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_NAME_RIGHT = eINSTANCE.getDiffLeafFactor_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Descr Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DESCR_LEFT = eINSTANCE.getDiffLeafFactor_New_Descr_Left();

		/**
		 * The meta object literal for the '<em><b>New Descr Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT = eINSTANCE.getDiffLeafFactor_New_Descr_Right();

		/**
		 * The meta object literal for the '<em><b>Descr Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_DescrChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New GW Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_GW_LEFT = eINSTANCE.getDiffLeafFactor_New_GW_Left();

		/**
		 * The meta object literal for the '<em><b>New GW Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_GW_RIGHT = eINSTANCE.getDiffLeafFactor_New_GW_Right();

		/**
		 * The meta object literal for the '<em><b>GW Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__GW_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_GWChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New LW Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_LW_LEFT = eINSTANCE.getDiffLeafFactor_New_LW_Left();

		/**
		 * The meta object literal for the '<em><b>New LW Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_LW_RIGHT = eINSTANCE.getDiffLeafFactor_New_LW_Right();

		/**
		 * The meta object literal for the '<em><b>LW Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__LW_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_LWChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Del Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DEL_LEFT = eINSTANCE.getDiffLeafFactor_New_Del_Left();

		/**
		 * The meta object literal for the '<em><b>New Del Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_DEL_RIGHT = eINSTANCE.getDiffLeafFactor_New_Del_Right();

		/**
		 * The meta object literal for the '<em><b>Del Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_DelChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT = eINSTANCE.getDiffLeafFactor_New_HideOnLine_Left();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT = eINSTANCE.getDiffLeafFactor_New_HideOnLine_Right();

		/**
		 * The meta object literal for the '<em><b>Hide On Line Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_HideOnLineChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT = eINSTANCE.getDiffLeafFactor_New_Hierarchy_Left();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT = eINSTANCE.getDiffLeafFactor_New_Hierarchy_Right();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_HierarchyChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT = eINSTANCE.getDiffLeafFactor_New_MasterFactorID_Left();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT = eINSTANCE.getDiffLeafFactor_New_MasterFactorID_Right();

		/**
		 * The meta object literal for the '<em><b>Master Factor ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS = eINSTANCE.getDiffLeafFactor_MasterFactorIDChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffCompositeFactorImpl <em>Diff Composite Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffCompositeFactorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffCompositeFactor()
		 * @generated
		 */
		EClass DIFF_COMPOSITE_FACTOR = eINSTANCE.getDiffCompositeFactor();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__DIFF_KIND_LEFT = eINSTANCE.getDiffCompositeFactor_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__DIFF_KIND_RIGHT = eINSTANCE.getDiffCompositeFactor_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Factor ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_LEFT = eINSTANCE.getDiffCompositeFactor_New_FactorID_Left();

		/**
		 * The meta object literal for the '<em><b>New Factor ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_FACTOR_ID_RIGHT = eINSTANCE.getDiffCompositeFactor_New_FactorID_Right();

		/**
		 * The meta object literal for the '<em><b>Factor ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__FACTOR_ID_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_FactorIDChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_NAME_LEFT = eINSTANCE.getDiffCompositeFactor_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_NAME_RIGHT = eINSTANCE.getDiffCompositeFactor_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NAME_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Descr Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DESCR_LEFT = eINSTANCE.getDiffCompositeFactor_New_Descr_Left();

		/**
		 * The meta object literal for the '<em><b>New Descr Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DESCR_RIGHT = eINSTANCE.getDiffCompositeFactor_New_Descr_Right();

		/**
		 * The meta object literal for the '<em><b>Descr Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__DESCR_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_DescrChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New GW Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_GW_LEFT = eINSTANCE.getDiffCompositeFactor_New_GW_Left();

		/**
		 * The meta object literal for the '<em><b>New GW Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_GW_RIGHT = eINSTANCE.getDiffCompositeFactor_New_GW_Right();

		/**
		 * The meta object literal for the '<em><b>GW Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__GW_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_GWChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New LW Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_LW_LEFT = eINSTANCE.getDiffCompositeFactor_New_LW_Left();

		/**
		 * The meta object literal for the '<em><b>New LW Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_LW_RIGHT = eINSTANCE.getDiffCompositeFactor_New_LW_Right();

		/**
		 * The meta object literal for the '<em><b>LW Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__LW_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_LWChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Del Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DEL_LEFT = eINSTANCE.getDiffCompositeFactor_New_Del_Left();

		/**
		 * The meta object literal for the '<em><b>New Del Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_DEL_RIGHT = eINSTANCE.getDiffCompositeFactor_New_Del_Right();

		/**
		 * The meta object literal for the '<em><b>Del Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__DEL_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_DelChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_LEFT = eINSTANCE.getDiffCompositeFactor_New_HideOnLine_Left();

		/**
		 * The meta object literal for the '<em><b>New Hide On Line Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIDE_ON_LINE_RIGHT = eINSTANCE.getDiffCompositeFactor_New_HideOnLine_Right();

		/**
		 * The meta object literal for the '<em><b>Hide On Line Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__HIDE_ON_LINE_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_HideOnLineChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_LEFT = eINSTANCE.getDiffCompositeFactor_New_Hierarchy_Left();

		/**
		 * The meta object literal for the '<em><b>New Hierarchy Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_HIERARCHY_RIGHT = eINSTANCE.getDiffCompositeFactor_New_Hierarchy_Right();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__HIERARCHY_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_HierarchyChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_LEFT = eINSTANCE.getDiffCompositeFactor_New_MasterFactorID_Left();

		/**
		 * The meta object literal for the '<em><b>New Master Factor ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT = eINSTANCE.getDiffCompositeFactor_New_MasterFactorID_Right();

		/**
		 * The meta object literal for the '<em><b>Master Factor ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_MasterFactorIDChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffCompositeFactor_subFactorsImpl <em>Diff Composite Factor sub Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffCompositeFactor_subFactorsImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffCompositeFactor_subFactors()
		 * @generated
		 */
		EClass DIFF_COMPOSITE_FACTOR_SUB_FACTORS = eINSTANCE.getDiffCompositeFactor_subFactors();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_LEFT = eINSTANCE.getDiffCompositeFactor_subFactors_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND_RIGHT = eINSTANCE.getDiffCompositeFactor_subFactors_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_COMPOSITE_FACTOR_SUB_FACTORS__CHANGE_STATUS = eINSTANCE.getDiffCompositeFactor_subFactors_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE = eINSTANCE.getDiffCompositeFactor_subFactors_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffOptionImpl <em>Diff Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffOptionImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffOption()
		 * @generated
		 */
		EClass DIFF_OPTION = eINSTANCE.getDiffOption();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__DIFF_KIND_LEFT = eINSTANCE.getDiffOption_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__DIFF_KIND_RIGHT = eINSTANCE.getDiffOption_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__CHANGE_STATUS = eINSTANCE.getDiffOption_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Option ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_OPTION_ID_LEFT = eINSTANCE.getDiffOption_New_OptionID_Left();

		/**
		 * The meta object literal for the '<em><b>New Option ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_OPTION_ID_RIGHT = eINSTANCE.getDiffOption_New_OptionID_Right();

		/**
		 * The meta object literal for the '<em><b>Option ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__OPTION_ID_CHANGE_STATUS = eINSTANCE.getDiffOption_OptionIDChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NAME_LEFT = eINSTANCE.getDiffOption_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NAME_RIGHT = eINSTANCE.getDiffOption_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NAME_CHANGE_STATUS = eINSTANCE.getDiffOption_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Sort Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_SORT_LEFT = eINSTANCE.getDiffOption_New_Sort_Left();

		/**
		 * The meta object literal for the '<em><b>New Sort Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_SORT_RIGHT = eINSTANCE.getDiffOption_New_Sort_Right();

		/**
		 * The meta object literal for the '<em><b>Sort Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__SORT_CHANGE_STATUS = eINSTANCE.getDiffOption_SortChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Cost Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_COST_LEFT = eINSTANCE.getDiffOption_New_Cost_Left();

		/**
		 * The meta object literal for the '<em><b>New Cost Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_COST_RIGHT = eINSTANCE.getDiffOption_New_Cost_Right();

		/**
		 * The meta object literal for the '<em><b>Cost Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__COST_CHANGE_STATUS = eINSTANCE.getDiffOption_CostChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Num Other Costs Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT = eINSTANCE.getDiffOption_New_NumOtherCosts_Left();

		/**
		 * The meta object literal for the '<em><b>New Num Other Costs Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT = eINSTANCE.getDiffOption_New_NumOtherCosts_Right();

		/**
		 * The meta object literal for the '<em><b>Num Other Costs Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS = eINSTANCE.getDiffOption_NumOtherCostsChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Description Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_DESCRIPTION_LEFT = eINSTANCE.getDiffOption_New_Description_Left();

		/**
		 * The meta object literal for the '<em><b>New Description Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__NEW_DESCRIPTION_RIGHT = eINSTANCE.getDiffOption_New_Description_Right();

		/**
		 * The meta object literal for the '<em><b>Description Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION__DESCRIPTION_CHANGE_STATUS = eINSTANCE.getDiffOption_DescriptionChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffOption_vendorImpl <em>Diff Option vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffOption_vendorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffOption_vendor()
		 * @generated
		 */
		EClass DIFF_OPTION_VENDOR = eINSTANCE.getDiffOption_vendor();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION_VENDOR__DIFF_KIND_LEFT = eINSTANCE.getDiffOption_vendor_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION_VENDOR__DIFF_KIND_RIGHT = eINSTANCE.getDiffOption_vendor_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OPTION_VENDOR__CHANGE_STATUS = eINSTANCE.getDiffOption_vendor_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_OPTION_VENDOR__ETYPE = eINSTANCE.getDiffOption_vendor_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffVendorImpl <em>Diff Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffVendorImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffVendor()
		 * @generated
		 */
		EClass DIFF_VENDOR = eINSTANCE.getDiffVendor();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__DIFF_KIND_LEFT = eINSTANCE.getDiffVendor_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__DIFF_KIND_RIGHT = eINSTANCE.getDiffVendor_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__CHANGE_STATUS = eINSTANCE.getDiffVendor_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Vendor ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_VENDOR_ID_LEFT = eINSTANCE.getDiffVendor_New_VendorID_Left();

		/**
		 * The meta object literal for the '<em><b>New Vendor ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_VENDOR_ID_RIGHT = eINSTANCE.getDiffVendor_New_VendorID_Right();

		/**
		 * The meta object literal for the '<em><b>Vendor ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS = eINSTANCE.getDiffVendor_VendorIDChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_NAME_LEFT = eINSTANCE.getDiffVendor_New_Name_Left();

		/**
		 * The meta object literal for the '<em><b>New Name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_NAME_RIGHT = eINSTANCE.getDiffVendor_New_Name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NAME_CHANGE_STATUS = eINSTANCE.getDiffVendor_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Description Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_DESCRIPTION_LEFT = eINSTANCE.getDiffVendor_New_Description_Left();

		/**
		 * The meta object literal for the '<em><b>New Description Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__NEW_DESCRIPTION_RIGHT = eINSTANCE.getDiffVendor_New_Description_Right();

		/**
		 * The meta object literal for the '<em><b>Description Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS = eINSTANCE.getDiffVendor_DescriptionChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffScoreImpl <em>Diff Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffScoreImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffScore()
		 * @generated
		 */
		EClass DIFF_SCORE = eINSTANCE.getDiffScore();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__DIFF_KIND_LEFT = eINSTANCE.getDiffScore_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__DIFF_KIND_RIGHT = eINSTANCE.getDiffScore_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__CHANGE_STATUS = eINSTANCE.getDiffScore_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New SScore Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_SSCORE_LEFT = eINSTANCE.getDiffScore_New_SScore_Left();

		/**
		 * The meta object literal for the '<em><b>New SScore Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_SSCORE_RIGHT = eINSTANCE.getDiffScore_New_SScore_Right();

		/**
		 * The meta object literal for the '<em><b>SScore Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__SSCORE_CHANGE_STATUS = eINSTANCE.getDiffScore_SScoreChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New DScore Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DSCORE_LEFT = eINSTANCE.getDiffScore_New_DScore_Left();

		/**
		 * The meta object literal for the '<em><b>New DScore Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DSCORE_RIGHT = eINSTANCE.getDiffScore_New_DScore_Right();

		/**
		 * The meta object literal for the '<em><b>DScore Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__DSCORE_CHANGE_STATUS = eINSTANCE.getDiffScore_DScoreChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Descr Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DESCR_LEFT = eINSTANCE.getDiffScore_New_Descr_Left();

		/**
		 * The meta object literal for the '<em><b>New Descr Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_DESCR_RIGHT = eINSTANCE.getDiffScore_New_Descr_Right();

		/**
		 * The meta object literal for the '<em><b>Descr Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__DESCR_CHANGE_STATUS = eINSTANCE.getDiffScore_DescrChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Comment Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_COMMENT_LEFT = eINSTANCE.getDiffScore_New_Comment_Left();

		/**
		 * The meta object literal for the '<em><b>New Comment Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_COMMENT_RIGHT = eINSTANCE.getDiffScore_New_Comment_Right();

		/**
		 * The meta object literal for the '<em><b>Comment Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__COMMENT_CHANGE_STATUS = eINSTANCE.getDiffScore_CommentChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New Method ID Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_METHOD_ID_LEFT = eINSTANCE.getDiffScore_New_MethodID_Left();

		/**
		 * The meta object literal for the '<em><b>New Method ID Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__NEW_METHOD_ID_RIGHT = eINSTANCE.getDiffScore_New_MethodID_Right();

		/**
		 * The meta object literal for the '<em><b>Method ID Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE__METHOD_ID_CHANGE_STATUS = eINSTANCE.getDiffScore_MethodIDChangeStatus();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.impl.DiffScore_score_optionImpl <em>Diff Score score option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.impl.DiffScore_score_optionImpl
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getDiffScore_score_option()
		 * @generated
		 */
		EClass DIFF_SCORE_SCORE_OPTION = eINSTANCE.getDiffScore_score_option();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE_SCORE_OPTION__DIFF_KIND_LEFT = eINSTANCE.getDiffScore_score_option_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE_SCORE_OPTION__DIFF_KIND_RIGHT = eINSTANCE.getDiffScore_score_option_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SCORE_SCORE_OPTION__CHANGE_STATUS = eINSTANCE.getDiffScore_score_option_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SCORE_SCORE_OPTION__ETYPE = eINSTANCE.getDiffScore_score_option_EType();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.ClassDiffKind <em>Class Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.ClassDiffKind
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getClassDiffKind()
		 * @generated
		 */
		EEnum CLASS_DIFF_KIND = eINSTANCE.getClassDiffKind();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.AscDiffKind <em>Asc Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.AscDiffKind
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getAscDiffKind()
		 * @generated
		 */
		EEnum ASC_DIFF_KIND = eINSTANCE.getAscDiffKind();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.AUTHOR
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link dssmmDiffMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dssmmDiffMM.ChangeStatus
		 * @see dssmmDiffMM.impl.DssmmDiffMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

	}

} //DssmmDiffMMPackage
