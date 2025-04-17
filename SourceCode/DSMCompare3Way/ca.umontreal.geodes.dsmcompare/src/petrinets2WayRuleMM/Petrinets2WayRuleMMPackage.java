/**
 */
package petrinets2WayRuleMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;

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
 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface Petrinets2WayRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinets2WayRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/petrinets2WayRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinets2WayRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinets2WayRuleMMPackage eINSTANCE = petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_NamedElementImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_NamedElement()
	 * @generated
	 */
	int PATTERN_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__ID = Petrinets2WayDiffMMPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__NAME = Petrinets2WayDiffMMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__ID_PATTERN = Petrinets2WayDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__FILTER = Petrinets2WayDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_FEATURE_COUNT = Petrinets2WayDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_OPERATION_COUNT = Petrinets2WayDiffMMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_PetriNetImpl <em>Pattern Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_PetriNetImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_PetriNet()
	 * @generated
	 */
	int PATTERN_PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__ID = Petrinets2WayDiffMMPackage.PETRI_NET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__NAME = Petrinets2WayDiffMMPackage.PETRI_NET__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__PLACES = Petrinets2WayDiffMMPackage.PETRI_NET__PLACES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__TRANSITIONS = Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__DIFFPLACES = Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__DIFFTRANSITIONS = Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__ID_PATTERN = Petrinets2WayDiffMMPackage.PETRI_NET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__FILTER = Petrinets2WayDiffMMPackage.PETRI_NET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.PETRI_NET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET_FEATURE_COUNT = Petrinets2WayDiffMMPackage.PETRI_NET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET_OPERATION_COUNT = Petrinets2WayDiffMMPackage.PETRI_NET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_PlaceImpl <em>Pattern Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_PlaceImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_Place()
	 * @generated
	 */
	int PATTERN_PLACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__ID = Petrinets2WayDiffMMPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__NAME = Petrinets2WayDiffMMPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__TOKENS = Petrinets2WayDiffMMPackage.PLACE__TOKENS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__TRANSITIONS = Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__DIFFTRANSITIONS = Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__ID_PATTERN = Petrinets2WayDiffMMPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__FILTER = Petrinets2WayDiffMMPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.PLACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE_FEATURE_COUNT = Petrinets2WayDiffMMPackage.PLACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE_OPERATION_COUNT = Petrinets2WayDiffMMPackage.PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_TransitionImpl <em>Pattern Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_TransitionImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_Transition()
	 * @generated
	 */
	int PATTERN_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__ID = Petrinets2WayDiffMMPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__NAME = Petrinets2WayDiffMMPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__PLACES = Petrinets2WayDiffMMPackage.TRANSITION__PLACES;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__DIFFPLACES = Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__ID_PATTERN = Petrinets2WayDiffMMPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__FILTER = Petrinets2WayDiffMMPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION_FEATURE_COUNT = Petrinets2WayDiffMMPackage.TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION_OPERATION_COUNT = Petrinets2WayDiffMMPackage.TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_SemanticObjectImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticObject()
	 * @generated
	 */
	int PATTERN_SEMANTIC_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__NAME = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__ID_PATTERN = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__FILTER = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_SemanticDiffImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticDiff()
	 * @generated
	 */
	int PATTERN_SEMANTIC_DIFF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__NAME = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_NAMED_ELEMENT = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__ID_PATTERN = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__FILTER = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_FEATURE_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_OPERATION_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_NAMED_ELEMENT = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__FILTER = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = Petrinets2WayDiffMMPackage.SEMANTIC_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNetImpl <em>Pattern Diff Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNetImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__ID = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NAME = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__PLACES = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__PLACES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__TRANSITIONS = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__DIFFPLACES = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__DIFFTRANSITIONS = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_ID = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__NEW_ID;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_NAME = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__FILTER = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl <em>Pattern Diff Petri Net places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet_places()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES = 8;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__ETYPE = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__FILTER = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_PLACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl <em>Pattern Diff Petri Net transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS = 9;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__ETYPE = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_PETRI_NET_TRANSITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPlaceImpl <em>Pattern Diff Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffPlaceImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPlace()
	 * @generated
	 */
	int PATTERN_DIFF_PLACE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__ID = Petrinets2WayDiffMMPackage.DIFF_PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NAME = Petrinets2WayDiffMMPackage.DIFF_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__TOKENS = Petrinets2WayDiffMMPackage.DIFF_PLACE__TOKENS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__TRANSITIONS = Petrinets2WayDiffMMPackage.DIFF_PLACE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__DIFFTRANSITIONS = Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_ID = Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_NAME = Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_TOKENS = Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__FILTER = Petrinets2WayDiffMMPackage.DIFF_PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_PLACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_PLACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPlace_transitionsImpl <em>Pattern Diff Place transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffPlace_transitionsImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPlace_transitions()
	 * @generated
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__ETYPE = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__FILTER = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_PLACE_TRANSITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffTransitionImpl <em>Pattern Diff Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffTransitionImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffTransition()
	 * @generated
	 */
	int PATTERN_DIFF_TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__ID = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NAME = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__PLACES = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__PLACES;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__DIFFPLACES = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_ID = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__NEW_ID;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_NAME = Petrinets2WayDiffMMPackage.DIFF_TRANSITION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__FILTER = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffTransition_placesImpl <em>Pattern Diff Transition places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.Pattern_DiffTransition_placesImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffTransition_places()
	 * @generated
	 */
	int PATTERN_DIFF_TRANSITION_PLACES = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES__DIFF_KIND;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__ETYPE = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__FILTER = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES_FEATURE_COUNT = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES_OPERATION_COUNT = Petrinets2WayDiffMMPackage.DIFF_TRANSITION_PLACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayRuleMM.impl.RuleImpl
	 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Petri Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_PETRI_NET = 3;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Petri Net places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES = 4;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Petri Net transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Place transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS = 7;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Rule Pattern Diff Transition places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES = 9;

	/**
	 * The feature id for the '<em><b>Rule Pattern Named Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_SEMANTIC_OBJECT = 11;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_NamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Named Element</em>'.
	 * @see petrinets2WayRuleMM.Pattern_NamedElement
	 * @generated
	 */
	EClass getPattern_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_NamedElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_NamedElement#getID_Pattern()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_NamedElement#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_NamedElement#isFilter()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_NamedElement#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_NamedElement#isIsForbidden()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_PetriNet <em>Pattern Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Petri Net</em>'.
	 * @see petrinets2WayRuleMM.Pattern_PetriNet
	 * @generated
	 */
	EClass getPattern_PetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_PetriNet#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_PetriNet#getID_Pattern()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EAttribute getPattern_PetriNet_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_PetriNet#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_PetriNet#isFilter()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EAttribute getPattern_PetriNet_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_PetriNet#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_PetriNet#isIsForbidden()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EAttribute getPattern_PetriNet_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_Place <em>Pattern Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Place</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Place
	 * @generated
	 */
	EClass getPattern_Place();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Place#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Place#getID_Pattern()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EAttribute getPattern_Place_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Place#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Place#isFilter()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EAttribute getPattern_Place_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Place#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Place#isIsForbidden()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EAttribute getPattern_Place_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_Transition <em>Pattern Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Transition</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Transition
	 * @generated
	 */
	EClass getPattern_Transition();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Transition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Transition#getID_Pattern()
	 * @see #getPattern_Transition()
	 * @generated
	 */
	EAttribute getPattern_Transition_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Transition#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Transition#isFilter()
	 * @see #getPattern_Transition()
	 * @generated
	 */
	EAttribute getPattern_Transition_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_Transition#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_Transition#isIsForbidden()
	 * @see #getPattern_Transition()
	 * @generated
	 */
	EAttribute getPattern_Transition_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Object</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	EClass getPattern_SemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticObject#getID_Pattern()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticObject#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticObject#isFilter()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticObject#isIsForbidden()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Diff</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	EClass getPattern_SemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticDiff#getID_Pattern()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticDiff#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticDiff#isFilter()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticDiff#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticDiff#isIsForbidden()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticConflict#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticConflict#getID_Pattern()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticConflict#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticConflict#isFilter()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_SemanticConflict#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_SemanticConflict#isIsForbidden()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet <em>Pattern Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet
	 * @generated
	 */
	EClass getPattern_DiffPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet#getID_Pattern()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet#isFilter()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet#isIsForbidden()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places <em>Pattern Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net places</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_places
	 * @generated
	 */
	EClass getPattern_DiffPetriNet_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_places#getID_Pattern()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isFilter()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isIsForbidden()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions <em>Pattern Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net transitions</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions
	 * @generated
	 */
	EClass getPattern_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#getID_Pattern()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#isFilter()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPetriNet_transitions#isIsForbidden()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffPlace <em>Pattern Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Place</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace
	 * @generated
	 */
	EClass getPattern_DiffPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace#getID_Pattern()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace#isFilter()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace#isIsForbidden()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffPlace_transitions <em>Pattern Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Place transitions</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace_transitions
	 * @generated
	 */
	EClass getPattern_DiffPlace_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace_transitions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace_transitions#getID_Pattern()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace_transitions#isFilter()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffPlace_transitions#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffPlace_transitions#isIsForbidden()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffTransition <em>Pattern Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Transition</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition
	 * @generated
	 */
	EClass getPattern_DiffTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition#getID_Pattern()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition#isFilter()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition#isIsForbidden()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Pattern_DiffTransition_places <em>Pattern Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Transition places</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition_places
	 * @generated
	 */
	EClass getPattern_DiffTransition_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition_places#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition_places#getID_Pattern()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition_places#isFilter()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Pattern_DiffTransition_places#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinets2WayRuleMM.Pattern_DiffTransition_places#isIsForbidden()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_IsForbidden();

	/**
	 * Returns the meta object for class '{@link petrinets2WayRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see petrinets2WayRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinets2WayRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link petrinets2WayRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see petrinets2WayRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayRuleMM.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see petrinets2WayRuleMM.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet <em>Rule Pattern Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Petri Net</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_places <em>Rule Pattern Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Petri Net places</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_places()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffPetriNet_places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_transitions <em>Rule Pattern Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Petri Net transitions</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffPetriNet_transitions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace <em>Rule Pattern Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Place</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace_transitions <em>Rule Pattern Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Place transitions</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffPlace_transitions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffPlace_transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition <em>Rule Pattern Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Transition</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition_places <em>Rule Pattern Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Diff Transition places</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_DiffTransition_places()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_DiffTransition_places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_NamedElement <em>Rule Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Named Element</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_NamedElement()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Semantic Object</em>'.
	 * @see petrinets2WayRuleMM.Rule#getRulePattern_SemanticObject()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_SemanticObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinets2WayRuleMMFactory getPetrinets2WayRuleMMFactory();

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
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_NamedElementImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_NamedElement()
		 * @generated
		 */
		EClass PATTERN_NAMED_ELEMENT = eINSTANCE.getPattern_NamedElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_NamedElement_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__FILTER = eINSTANCE.getPattern_NamedElement_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__IS_FORBIDDEN = eINSTANCE.getPattern_NamedElement_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_PetriNetImpl <em>Pattern Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_PetriNetImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_PetriNet()
		 * @generated
		 */
		EClass PATTERN_PETRI_NET = eINSTANCE.getPattern_PetriNet();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PETRI_NET__ID_PATTERN = eINSTANCE.getPattern_PetriNet_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PETRI_NET__FILTER = eINSTANCE.getPattern_PetriNet_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PETRI_NET__IS_FORBIDDEN = eINSTANCE.getPattern_PetriNet_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_PlaceImpl <em>Pattern Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_PlaceImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_Place()
		 * @generated
		 */
		EClass PATTERN_PLACE = eINSTANCE.getPattern_Place();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PLACE__ID_PATTERN = eINSTANCE.getPattern_Place_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PLACE__FILTER = eINSTANCE.getPattern_Place_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PLACE__IS_FORBIDDEN = eINSTANCE.getPattern_Place_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_TransitionImpl <em>Pattern Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_TransitionImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_Transition()
		 * @generated
		 */
		EClass PATTERN_TRANSITION = eINSTANCE.getPattern_Transition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TRANSITION__ID_PATTERN = eINSTANCE.getPattern_Transition_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TRANSITION__FILTER = eINSTANCE.getPattern_Transition_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TRANSITION__IS_FORBIDDEN = eINSTANCE.getPattern_Transition_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_SemanticObjectImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticObject()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_OBJECT = eINSTANCE.getPattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__ID_PATTERN = eINSTANCE.getPattern_SemanticObject_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__FILTER = eINSTANCE.getPattern_SemanticObject_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticObject_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_SemanticDiffImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticDiff()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_DIFF = eINSTANCE.getPattern_SemanticDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_SemanticDiff_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__FILTER = eINSTANCE.getPattern_SemanticDiff_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticDiff_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = eINSTANCE.getPattern_SemanticConflict_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__FILTER = eINSTANCE.getPattern_SemanticConflict_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticConflict_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNetImpl <em>Pattern Diff Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNetImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet()
		 * @generated
		 */
		EClass PATTERN_DIFF_PETRI_NET = eINSTANCE.getPattern_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__ID_PATTERN = eINSTANCE.getPattern_DiffPetriNet_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__FILTER = eINSTANCE.getPattern_DiffPetriNet_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPetriNet_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl <em>Pattern Diff Petri Net places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet_places()
		 * @generated
		 */
		EClass PATTERN_DIFF_PETRI_NET_PLACES = eINSTANCE.getPattern_DiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN = eINSTANCE.getPattern_DiffPetriNet_places_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__FILTER = eINSTANCE.getPattern_DiffPetriNet_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPetriNet_places_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl <em>Pattern Diff Petri Net transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPetriNet_transitions()
		 * @generated
		 */
		EClass PATTERN_DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getPattern_DiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__ID_PATTERN = eINSTANCE.getPattern_DiffPetriNet_transitions_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER = eINSTANCE.getPattern_DiffPetriNet_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPetriNet_transitions_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPlaceImpl <em>Pattern Diff Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffPlaceImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPlace()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLACE = eINSTANCE.getPattern_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__ID_PATTERN = eINSTANCE.getPattern_DiffPlace_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__FILTER = eINSTANCE.getPattern_DiffPlace_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPlace_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffPlace_transitionsImpl <em>Pattern Diff Place transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffPlace_transitionsImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffPlace_transitions()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLACE_TRANSITIONS = eINSTANCE.getPattern_DiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__ID_PATTERN = eINSTANCE.getPattern_DiffPlace_transitions_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__FILTER = eINSTANCE.getPattern_DiffPlace_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPlace_transitions_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffTransitionImpl <em>Pattern Diff Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffTransitionImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffTransition()
		 * @generated
		 */
		EClass PATTERN_DIFF_TRANSITION = eINSTANCE.getPattern_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__ID_PATTERN = eINSTANCE.getPattern_DiffTransition_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__FILTER = eINSTANCE.getPattern_DiffTransition_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__IS_FORBIDDEN = eINSTANCE.getPattern_DiffTransition_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.Pattern_DiffTransition_placesImpl <em>Pattern Diff Transition places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.Pattern_DiffTransition_placesImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getPattern_DiffTransition_places()
		 * @generated
		 */
		EClass PATTERN_DIFF_TRANSITION_PLACES = eINSTANCE.getPattern_DiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN = eINSTANCE.getPattern_DiffTransition_places_ID_Pattern();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__FILTER = eINSTANCE.getPattern_DiffTransition_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffTransition_places_IsForbidden();

		/**
		 * The meta object literal for the '{@link petrinets2WayRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayRuleMM.impl.RuleImpl
		 * @see petrinets2WayRuleMM.impl.Petrinets2WayRuleMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONSTRAINTS = eINSTANCE.getRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Petri Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_PETRI_NET = eINSTANCE.getRule_RulePattern_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Petri Net places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES = eINSTANCE.getRule_RulePattern_DiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Petri Net transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getRule_RulePattern_DiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_PLACE = eINSTANCE.getRule_RulePattern_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Place transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS = eINSTANCE.getRule_RulePattern_DiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_TRANSITION = eINSTANCE.getRule_RulePattern_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Diff Transition places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES = eINSTANCE.getRule_RulePattern_DiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Named Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_NAMED_ELEMENT = eINSTANCE.getRule_RulePattern_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_SEMANTIC_OBJECT = eINSTANCE.getRule_RulePattern_SemanticObject();

	}

} //Petrinets2WayRuleMMPackage
