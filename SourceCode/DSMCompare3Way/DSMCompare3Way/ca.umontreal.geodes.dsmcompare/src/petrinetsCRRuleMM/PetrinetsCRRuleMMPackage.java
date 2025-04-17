/**
 */
package petrinetsCRRuleMM;

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
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetsCRRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetsCRRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/petrinetsCRRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetsCRRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetsCRRuleMMPackage eINSTANCE = petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticObject()
	 * @generated
	 */
	int PATTERN_SEMANTIC_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = 9;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Pattern Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_ConflictResolutionImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_ConflictResolution()
	 * @generated
	 */
	int PATTERN_CONFLICT_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PLACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_TRANSITION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTIC_OBJECT_NAMED_ELEMENT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONFLICT_RESOLUTION_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_NamedElementImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_NamedElement()
	 * @generated
	 */
	int PATTERN_NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNetImpl <em>Pattern Diff Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNetImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__DIFF_KIND_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__DIFF_KIND_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__FILTER = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__IS_MERGED = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_ID_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_ID_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__ID_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_NAME_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NEW_NAME_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET__NAME_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_placesImpl <em>Pattern Diff Petri Net places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_placesImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet_places()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES = 2;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl <em>Pattern Diff Petri Net transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PETRI_NET_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPlaceImpl <em>Pattern Diff Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffPlaceImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPlace()
	 * @generated
	 */
	int PATTERN_DIFF_PLACE = 4;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__DIFF_KIND_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__DIFF_KIND_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__FILTER = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__IS_MERGED = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_ID_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_ID_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__ID_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_NAME_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_NAME_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NAME_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New tokens Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_TOKENS_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New tokens Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__NEW_TOKENS_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tokens Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE__TOKENS_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Pattern Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Pattern Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPlace_transitionsImpl <em>Pattern Diff Place transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffPlace_transitionsImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPlace_transitions()
	 * @generated
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLACE_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffTransitionImpl <em>Pattern Diff Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffTransitionImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffTransition()
	 * @generated
	 */
	int PATTERN_DIFF_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__DIFF_KIND_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__DIFF_KIND_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__FILTER = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__IS_MERGED = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_ID_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_ID_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__ID_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_NAME_LEFT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NEW_NAME_RIGHT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION__NAME_CHANGE_STATUS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Pattern Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Pattern Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl <em>Pattern Diff Transition places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffTransition_places()
	 * @generated
	 */
	int PATTERN_DIFF_TRANSITION_PLACES = 7;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED = 6;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES__ETYPE = 8;

	/**
	 * The number of structural features of the '<em>Pattern Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pattern Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_TRANSITION_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl <em>Pattern Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_PetriNetImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_PetriNet()
	 * @generated
	 */
	int PATTERN_PETRI_NET = 9;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__PLACES = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__TRANSITIONS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__DIFFPLACES = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET__DIFFTRANSITIONS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pattern Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PETRI_NET_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_PlaceImpl <em>Pattern Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_PlaceImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_Place()
	 * @generated
	 */
	int PATTERN_PLACE = 10;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__TOKENS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__TRANSITIONS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE__DIFFTRANSITIONS = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLACE_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_SemanticConflictImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticConflict()
	 * @generated
	 */
	int PATTERN_SEMANTIC_CONFLICT = 11;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTIC_OBJECT_NAMED_ELEMENT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Conflict kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_CONFLICT_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_SemanticDiffImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticDiff()
	 * @generated
	 */
	int PATTERN_SEMANTIC_DIFF = 12;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__ID_PATTERN = PATTERN_SEMANTIC_OBJECT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN = PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__NAME = PATTERN_SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__SEMANTIC_OBJECT_NAMED_ELEMENT = PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF__AUTHOR = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_FEATURE_COUNT = PATTERN_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Semantic Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SEMANTIC_DIFF_OPERATION_COUNT = PATTERN_SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.Pattern_TransitionImpl <em>Pattern Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.Pattern_TransitionImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_Transition()
	 * @generated
	 */
	int PATTERN_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__ID_PATTERN = PATTERN_NAMED_ELEMENT__ID_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Forbidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__IS_FORBIDDEN = PATTERN_NAMED_ELEMENT__IS_FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__ID = PATTERN_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__NAME = PATTERN_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__PLACES = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION__DIFFPLACES = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION_FEATURE_COUNT = PATTERN_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pattern Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TRANSITION_OPERATION_COUNT = PATTERN_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.impl.RuleImpl
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 15;

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
	 * The feature id for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Petri Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET = 4;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Petri Net places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES = 5;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Petri Net transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS = 6;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PLACE = 7;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Place transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS = 8;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Diff Transition places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES = 10;

	/**
	 * The feature id for the '<em><b>Rule Pattern Pattern Named Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT = 11;

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
	 * The meta object id for the '{@link petrinetsCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.AUTHOR
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 16;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 17;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.ConflictGranularity
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictGranularity()
	 * @generated
	 */
	int CONFLICT_GRANULARITY = 18;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.ConflictResolutionStrategy
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictResolutionStrategy()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_STRATEGY = 19;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.ConflictResolutionType
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictResolutionType()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_TYPE = 20;

	/**
	 * The meta object id for the '{@link petrinetsCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsCRRuleMM.DiffKind
	 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 21;


	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_ConflictResolution <em>Pattern Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Conflict Resolution</em>'.
	 * @see petrinetsCRRuleMM.Pattern_ConflictResolution
	 * @generated
	 */
	EClass getPattern_ConflictResolution();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_ConflictResolution#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see petrinetsCRRuleMM.Pattern_ConflictResolution#getResolutionType()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Strategy</em>'.
	 * @see petrinetsCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EAttribute getPattern_ConflictResolution_ResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticconflicts</em>'.
	 * @see petrinetsCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts()
	 * @see #getPattern_ConflictResolution()
	 * @generated
	 */
	EReference getPattern_ConflictResolution_Semanticconflicts();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet <em>Pattern Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet
	 * @generated
	 */
	EClass getPattern_DiffPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Left()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getDiff_kind_Right()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#isFilter()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#isIsMerged()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getChangeStatus()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Left()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_id_Right()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getIdChangeStatus()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Left()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getNew_name_Right()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet#getNameChangeStatus()
	 * @see #getPattern_DiffPetriNet()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places <em>Pattern Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places
	 * @generated
	 */
	EClass getPattern_DiffPetriNet_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getID_Pattern()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isIsForbidden()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_kind_Left()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_kind_Right()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getChangeStatus()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isFilter()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#isIsMerged()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getDiff_Group()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_places_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_places#getEType()
	 * @see #getPattern_DiffPetriNet_places()
	 * @generated
	 */
	EReference getPattern_DiffPetriNet_places_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions <em>Pattern Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Petri Net transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions
	 * @generated
	 */
	EClass getPattern_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getID_Pattern()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isIsForbidden()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_kind_Left()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_kind_Right()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getChangeStatus()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isFilter()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#isIsMerged()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getDiff_Group()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPetriNet_transitions_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions#getEType()
	 * @see #getPattern_DiffPetriNet_transitions()
	 * @generated
	 */
	EReference getPattern_DiffPetriNet_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffPlace <em>Pattern Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Place</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace
	 * @generated
	 */
	EClass getPattern_DiffPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getDiff_kind_Left()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getDiff_kind_Right()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#isFilter()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#isIsMerged()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getChangeStatus()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_id_Left()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_id_Right()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getIdChangeStatus()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_name_Left()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_name_Right()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNameChangeStatus()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_tokens_Left <em>New tokens Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tokens Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_tokens_Left()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_tokens_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getNew_tokens_Right <em>New tokens Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tokens Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getNew_tokens_Right()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_New_tokens_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace#getTokensChangeStatus <em>Tokens Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace#getTokensChangeStatus()
	 * @see #getPattern_DiffPlace()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_TokensChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions <em>Pattern Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Place transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions
	 * @generated
	 */
	EClass getPattern_DiffPlace_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getID_Pattern()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isIsForbidden()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_kind_Left()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_kind_Right()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getChangeStatus()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isFilter()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#isIsMerged()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getDiff_Group()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EAttribute getPattern_DiffPlace_transitions_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffPlace_transitions#getEType()
	 * @see #getPattern_DiffPlace_transitions()
	 * @generated
	 */
	EReference getPattern_DiffPlace_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffTransition <em>Pattern Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Transition</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition
	 * @generated
	 */
	EClass getPattern_DiffTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getDiff_kind_Left()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getDiff_kind_Right()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#isFilter()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#isIsMerged()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getChangeStatus()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getNew_id_Left()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getNew_id_Right()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getIdChangeStatus()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getNew_name_Left()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getNew_name_Right()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition#getNameChangeStatus()
	 * @see #getPattern_DiffTransition()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places <em>Pattern Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Transition places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places
	 * @generated
	 */
	EClass getPattern_DiffTransition_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getID_Pattern()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#isIsForbidden()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_kind_Left()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_kind_Right()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getChangeStatus()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#isFilter()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#isIsMerged()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getDiff_Group()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EAttribute getPattern_DiffTransition_places_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsCRRuleMM.Pattern_DiffTransition_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsCRRuleMM.Pattern_DiffTransition_places#getEType()
	 * @see #getPattern_DiffTransition_places()
	 * @generated
	 */
	EReference getPattern_DiffTransition_places_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_NamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Named Element</em>'.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement
	 * @generated
	 */
	EClass getPattern_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_NamedElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement#getID_Pattern()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_NamedElement#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement#isIsForbidden()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement#getId()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetsCRRuleMM.Pattern_NamedElement#getName()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_Name();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_PetriNet <em>Pattern Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Petri Net</em>'.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet
	 * @generated
	 */
	EClass getPattern_PetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet#getPlaces()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EReference getPattern_PetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet#getTransitions()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EReference getPattern_PetriNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_PetriNet#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet#getDiffplaces()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EReference getPattern_PetriNet_Diffplaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_PetriNet#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_PetriNet#getDifftransitions()
	 * @see #getPattern_PetriNet()
	 * @generated
	 */
	EReference getPattern_PetriNet_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_Place <em>Pattern Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Place</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Place
	 * @generated
	 */
	EClass getPattern_Place();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Place#getTokens()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EAttribute getPattern_Place_Tokens();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_Place#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Place#getTransitions()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EReference getPattern_Place_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_Place#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Place#getDifftransitions()
	 * @see #getPattern_Place()
	 * @generated
	 */
	EReference getPattern_Place_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_SemanticConflict <em>Pattern Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Conflict</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticConflict
	 * @generated
	 */
	EClass getPattern_SemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict kind</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_kind()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict Granularity</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EAttribute getPattern_SemanticConflict_Conflict_Granularity();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs()
	 * @see #getPattern_SemanticConflict()
	 * @generated
	 */
	EReference getPattern_SemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_SemanticDiff <em>Pattern Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Diff</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticDiff
	 * @generated
	 */
	EClass getPattern_SemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticDiff#getAuthor()
	 * @see #getPattern_SemanticDiff()
	 * @generated
	 */
	EAttribute getPattern_SemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_SemanticObject <em>Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Semantic Object</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject
	 * @generated
	 */
	EClass getPattern_SemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getID_Pattern()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_ID_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbidden</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#isIsForbidden()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_IsForbidden();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getName()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EAttribute getPattern_SemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_places()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_transitions()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPlace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place transitions</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace_transitions()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffPlace_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition_places()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_DiffTransition_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Named Element</em>'.
	 * @see petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_NamedElement()
	 * @see #getPattern_SemanticObject()
	 * @generated
	 */
	EReference getPattern_SemanticObject_SemanticObject_NamedElement();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Pattern_Transition <em>Pattern Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Transition</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Transition
	 * @generated
	 */
	EClass getPattern_Transition();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsCRRuleMM.Pattern_Transition#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Transition#getPlaces()
	 * @see #getPattern_Transition()
	 * @generated
	 */
	EReference getPattern_Transition_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Pattern_Transition#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinetsCRRuleMM.Pattern_Transition#getDiffplaces()
	 * @see #getPattern_Transition()
	 * @generated
	 */
	EReference getPattern_Transition_Diffplaces();

	/**
	 * Returns the meta object for class '{@link petrinetsCRRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see petrinetsCRRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetsCRRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link petrinetsCRRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see petrinetsCRRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsCRRuleMM.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see petrinetsCRRuleMM.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Semantic Object</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_SemanticObject();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet <em>Rule Pattern Pattern Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Petri Net</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_places <em>Rule Pattern Pattern Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Petri Net places</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_places()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPetriNet_places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_transitions <em>Rule Pattern Pattern Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Petri Net transitions</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPetriNet_transitions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace <em>Rule Pattern Pattern Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Place</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace_transitions <em>Rule Pattern Pattern Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Place transitions</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffPlace_transitions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffPlace_transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition <em>Rule Pattern Pattern Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Transition</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition_places <em>Rule Pattern Pattern Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Diff Transition places</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_DiffTransition_places()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_DiffTransition_places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsCRRuleMM.Rule#getRulePattern_Pattern_NamedElement <em>Rule Pattern Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Pattern Pattern Named Element</em>'.
	 * @see petrinetsCRRuleMM.Rule#getRulePattern_Pattern_NamedElement()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern_Pattern_NamedElement();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see petrinetsCRRuleMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Granularity</em>'.
	 * @see petrinetsCRRuleMM.ConflictGranularity
	 * @generated
	 */
	EEnum getConflictGranularity();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Strategy</em>'.
	 * @see petrinetsCRRuleMM.ConflictResolutionStrategy
	 * @generated
	 */
	EEnum getConflictResolutionStrategy();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Type</em>'.
	 * @see petrinetsCRRuleMM.ConflictResolutionType
	 * @generated
	 */
	EEnum getConflictResolutionType();

	/**
	 * Returns the meta object for enum '{@link petrinetsCRRuleMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see petrinetsCRRuleMM.DiffKind
	 * @generated
	 */
	EEnum getDiffKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetsCRRuleMMFactory getPetrinetsCRRuleMMFactory();

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
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_ConflictResolutionImpl <em>Pattern Conflict Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_ConflictResolutionImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_ConflictResolution()
		 * @generated
		 */
		EClass PATTERN_CONFLICT_RESOLUTION = eINSTANCE.getPattern_ConflictResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE = eINSTANCE.getPattern_ConflictResolution_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Resolution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = eINSTANCE.getPattern_ConflictResolution_ResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS = eINSTANCE.getPattern_ConflictResolution_Semanticconflicts();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNetImpl <em>Pattern Diff Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNetImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet()
		 * @generated
		 */
		EClass PATTERN_DIFF_PETRI_NET = eINSTANCE.getPattern_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPetriNet_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPetriNet_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__FILTER = eINSTANCE.getPattern_DiffPetriNet_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__IS_MERGED = eINSTANCE.getPattern_DiffPetriNet_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__CHANGE_STATUS = eINSTANCE.getPattern_DiffPetriNet_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__NEW_ID_LEFT = eINSTANCE.getPattern_DiffPetriNet_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffPetriNet_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffPetriNet_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffPetriNet_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffPetriNet_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffPetriNet_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_placesImpl <em>Pattern Diff Petri Net places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_placesImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet_places()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPetriNet_places_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPetriNet_places_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPetriNet_places_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__CHANGE_STATUS = eINSTANCE.getPattern_DiffPetriNet_places_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__FILTER = eINSTANCE.getPattern_DiffPetriNet_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__IS_MERGED = eINSTANCE.getPattern_DiffPetriNet_places_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_PLACES__DIFF_GROUP = eINSTANCE.getPattern_DiffPetriNet_places_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_PETRI_NET_PLACES__ETYPE = eINSTANCE.getPattern_DiffPetriNet_places_EType();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl <em>Pattern Diff Petri Net transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffPetriNet_transitionsImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPetriNet_transitions()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPetriNet_transitions_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPetriNet_transitions_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPetriNet_transitions_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS = eINSTANCE.getPattern_DiffPetriNet_transitions_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__FILTER = eINSTANCE.getPattern_DiffPetriNet_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__IS_MERGED = eINSTANCE.getPattern_DiffPetriNet_transitions_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP = eINSTANCE.getPattern_DiffPetriNet_transitions_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_PETRI_NET_TRANSITIONS__ETYPE = eINSTANCE.getPattern_DiffPetriNet_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPlaceImpl <em>Pattern Diff Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffPlaceImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPlace()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLACE = eINSTANCE.getPattern_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPlace_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPlace_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__FILTER = eINSTANCE.getPattern_DiffPlace_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__IS_MERGED = eINSTANCE.getPattern_DiffPlace_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__CHANGE_STATUS = eINSTANCE.getPattern_DiffPlace_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_ID_LEFT = eINSTANCE.getPattern_DiffPlace_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffPlace_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffPlace_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffPlace_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffPlace_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffPlace_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New tokens Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_TOKENS_LEFT = eINSTANCE.getPattern_DiffPlace_New_tokens_Left();

		/**
		 * The meta object literal for the '<em><b>New tokens Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__NEW_TOKENS_RIGHT = eINSTANCE.getPattern_DiffPlace_New_tokens_Right();

		/**
		 * The meta object literal for the '<em><b>Tokens Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE__TOKENS_CHANGE_STATUS = eINSTANCE.getPattern_DiffPlace_TokensChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffPlace_transitionsImpl <em>Pattern Diff Place transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffPlace_transitionsImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffPlace_transitions()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__IS_FORBIDDEN = eINSTANCE.getPattern_DiffPlace_transitions_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffPlace_transitions_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffPlace_transitions_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__CHANGE_STATUS = eINSTANCE.getPattern_DiffPlace_transitions_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__FILTER = eINSTANCE.getPattern_DiffPlace_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__IS_MERGED = eINSTANCE.getPattern_DiffPlace_transitions_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLACE_TRANSITIONS__DIFF_GROUP = eINSTANCE.getPattern_DiffPlace_transitions_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_PLACE_TRANSITIONS__ETYPE = eINSTANCE.getPattern_DiffPlace_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffTransitionImpl <em>Pattern Diff Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffTransitionImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffTransition()
		 * @generated
		 */
		EClass PATTERN_DIFF_TRANSITION = eINSTANCE.getPattern_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffTransition_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffTransition_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__FILTER = eINSTANCE.getPattern_DiffTransition_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__IS_MERGED = eINSTANCE.getPattern_DiffTransition_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__CHANGE_STATUS = eINSTANCE.getPattern_DiffTransition_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__NEW_ID_LEFT = eINSTANCE.getPattern_DiffTransition_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__NEW_ID_RIGHT = eINSTANCE.getPattern_DiffTransition_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__ID_CHANGE_STATUS = eINSTANCE.getPattern_DiffTransition_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__NEW_NAME_LEFT = eINSTANCE.getPattern_DiffTransition_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__NEW_NAME_RIGHT = eINSTANCE.getPattern_DiffTransition_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION__NAME_CHANGE_STATUS = eINSTANCE.getPattern_DiffTransition_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl <em>Pattern Diff Transition places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_DiffTransition_places()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN = eINSTANCE.getPattern_DiffTransition_places_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT = eINSTANCE.getPattern_DiffTransition_places_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT = eINSTANCE.getPattern_DiffTransition_places_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS = eINSTANCE.getPattern_DiffTransition_places_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__FILTER = eINSTANCE.getPattern_DiffTransition_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED = eINSTANCE.getPattern_DiffTransition_places_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP = eINSTANCE.getPattern_DiffTransition_places_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIFF_TRANSITION_PLACES__ETYPE = eINSTANCE.getPattern_DiffTransition_places_EType();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_NamedElementImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_NamedElement()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__IS_FORBIDDEN = eINSTANCE.getPattern_NamedElement_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__ID = eINSTANCE.getPattern_NamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__NAME = eINSTANCE.getPattern_NamedElement_Name();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl <em>Pattern Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_PetriNetImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_PetriNet()
		 * @generated
		 */
		EClass PATTERN_PETRI_NET = eINSTANCE.getPattern_PetriNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PETRI_NET__PLACES = eINSTANCE.getPattern_PetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PETRI_NET__TRANSITIONS = eINSTANCE.getPattern_PetriNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Diffplaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PETRI_NET__DIFFPLACES = eINSTANCE.getPattern_PetriNet_Diffplaces();

		/**
		 * The meta object literal for the '<em><b>Difftransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PETRI_NET__DIFFTRANSITIONS = eINSTANCE.getPattern_PetriNet_Difftransitions();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_PlaceImpl <em>Pattern Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_PlaceImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_Place()
		 * @generated
		 */
		EClass PATTERN_PLACE = eINSTANCE.getPattern_Place();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PLACE__TOKENS = eINSTANCE.getPattern_Place_Tokens();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PLACE__TRANSITIONS = eINSTANCE.getPattern_Place_Transitions();

		/**
		 * The meta object literal for the '<em><b>Difftransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PLACE__DIFFTRANSITIONS = eINSTANCE.getPattern_Place_Difftransitions();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticConflictImpl <em>Pattern Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_SemanticConflictImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticConflict()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_CONFLICT = eINSTANCE.getPattern_SemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND = eINSTANCE.getPattern_SemanticConflict_Conflict_kind();

		/**
		 * The meta object literal for the '<em><b>Conflict Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = eINSTANCE.getPattern_SemanticConflict_Conflict_Granularity();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getPattern_SemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticDiffImpl <em>Pattern Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_SemanticDiffImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticDiff()
		 * @generated
		 */
		EClass PATTERN_SEMANTIC_DIFF = eINSTANCE.getPattern_SemanticDiff();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_DIFF__AUTHOR = eINSTANCE.getPattern_SemanticDiff_Author();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl <em>Pattern Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_SemanticObject()
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
		 * The meta object literal for the '<em><b>Is Forbidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN = eINSTANCE.getPattern_SemanticObject_IsForbidden();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SEMANTIC_OBJECT__NAME = eINSTANCE.getPattern_SemanticObject_Name();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = eINSTANCE.getPattern_SemanticObject_SemanticObject_DiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Named Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT = eINSTANCE.getPattern_SemanticObject_SemanticObject_NamedElement();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.Pattern_TransitionImpl <em>Pattern Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.Pattern_TransitionImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getPattern_Transition()
		 * @generated
		 */
		EClass PATTERN_TRANSITION = eINSTANCE.getPattern_Transition();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TRANSITION__PLACES = eINSTANCE.getPattern_Transition_Places();

		/**
		 * The meta object literal for the '<em><b>Diffplaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TRANSITION__DIFFPLACES = eINSTANCE.getPattern_Transition_Diffplaces();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.impl.RuleImpl
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getRule()
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
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT = eINSTANCE.getRule_RulePattern_Pattern_SemanticObject();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Petri Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET = eINSTANCE.getRule_RulePattern_Pattern_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Petri Net places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES = eINSTANCE.getRule_RulePattern_Pattern_DiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Petri Net transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getRule_RulePattern_Pattern_DiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PLACE = eINSTANCE.getRule_RulePattern_Pattern_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Place transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS = eINSTANCE.getRule_RulePattern_Pattern_DiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION = eINSTANCE.getRule_RulePattern_Pattern_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Diff Transition places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES = eINSTANCE.getRule_RulePattern_Pattern_DiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern Pattern Named Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT = eINSTANCE.getRule_RulePattern_Pattern_NamedElement();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.AUTHOR
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.ChangeStatus
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.ConflictGranularity
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictGranularity()
		 * @generated
		 */
		EEnum CONFLICT_GRANULARITY = eINSTANCE.getConflictGranularity();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.ConflictResolutionStrategy
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictResolutionStrategy()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_STRATEGY = eINSTANCE.getConflictResolutionStrategy();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.ConflictResolutionType
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getConflictResolutionType()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_TYPE = eINSTANCE.getConflictResolutionType();

		/**
		 * The meta object literal for the '{@link petrinetsCRRuleMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsCRRuleMM.DiffKind
		 * @see petrinetsCRRuleMM.impl.PetrinetsCRRuleMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //PetrinetsCRRuleMMPackage
