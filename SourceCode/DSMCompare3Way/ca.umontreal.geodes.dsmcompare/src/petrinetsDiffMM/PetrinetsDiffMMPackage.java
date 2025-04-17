/**
 */
package petrinetsDiffMM;

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
 * @see petrinetsDiffMM.PetrinetsDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetsDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetsDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/petrinetsDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetsDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetsDiffMMPackage eINSTANCE = petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.SemanticObjectImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticObject()
	 * @generated
	 */
	int SEMANTIC_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = 2;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE = 4;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = 7;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Semantic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.ConflictResolutionImpl <em>Conflict Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.ConflictResolutionImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolution()
	 * @generated
	 */
	int CONFLICT_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PLACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_TRANSITION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTIC_OBJECT_NAMED_ELEMENT = SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Resolution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__RESOLUTION_TYPE = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticconflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION__SEMANTICCONFLICTS = SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conflict Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_RESOLUTION_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.NamedElementImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.PetriNetImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PLACES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__DIFFPLACES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__DIFFTRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffPetriNetImpl <em>Diff Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffPetriNetImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet()
	 * @generated
	 */
	int DIFF_PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__ID = PETRI_NET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NAME = PETRI_NET__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__PLACES = PETRI_NET__PLACES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__TRANSITIONS = PETRI_NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__DIFFPLACES = PETRI_NET__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__DIFFTRANSITIONS = PETRI_NET__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__DIFF_KIND_LEFT = PETRI_NET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__DIFF_KIND_RIGHT = PETRI_NET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__FILTER = PETRI_NET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__IS_MERGED = PETRI_NET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__CHANGE_STATUS = PETRI_NET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_ID_LEFT = PETRI_NET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_ID_RIGHT = PETRI_NET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__ID_CHANGE_STATUS = PETRI_NET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_NAME_LEFT = PETRI_NET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_NAME_RIGHT = PETRI_NET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NAME_CHANGE_STATUS = PETRI_NET_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_FEATURE_COUNT = PETRI_NET_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_OPERATION_COUNT = PETRI_NET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffPetriNet_placesImpl <em>Diff Petri Net places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffPetriNet_placesImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet_places()
	 * @generated
	 */
	int DIFF_PETRI_NET_PLACES = 2;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffPetriNet_transitionsImpl <em>Diff Petri Net transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffPetriNet_transitionsImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet_transitions()
	 * @generated
	 */
	int DIFF_PETRI_NET_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.PlaceImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DIFFTRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffPlaceImpl <em>Diff Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffPlaceImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPlace()
	 * @generated
	 */
	int DIFF_PLACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__ID = PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__TOKENS = PLACE__TOKENS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__TRANSITIONS = PLACE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Difftransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__DIFFTRANSITIONS = PLACE__DIFFTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__DIFF_KIND_LEFT = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__DIFF_KIND_RIGHT = PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__FILTER = PLACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__IS_MERGED = PLACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__CHANGE_STATUS = PLACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_ID_LEFT = PLACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_ID_RIGHT = PLACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__ID_CHANGE_STATUS = PLACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_NAME_LEFT = PLACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_NAME_RIGHT = PLACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NAME_CHANGE_STATUS = PLACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>New tokens Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_TOKENS_LEFT = PLACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New tokens Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_TOKENS_RIGHT = PLACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tokens Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__TOKENS_CHANGE_STATUS = PLACE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffPlace_transitionsImpl <em>Diff Place transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffPlace_transitionsImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPlace_transitions()
	 * @generated
	 */
	int DIFF_PLACE_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.TransitionImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PLACES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DIFFPLACES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffTransitionImpl <em>Diff Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffTransitionImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffTransition()
	 * @generated
	 */
	int DIFF_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__ID = TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__PLACES = TRANSITION__PLACES;

	/**
	 * The feature id for the '<em><b>Diffplaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__DIFFPLACES = TRANSITION__DIFFPLACES;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__DIFF_KIND_LEFT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__DIFF_KIND_RIGHT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__FILTER = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__IS_MERGED = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__CHANGE_STATUS = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New id Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_ID_LEFT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New id Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_ID_RIGHT = TRANSITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__ID_CHANGE_STATUS = TRANSITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New name Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_NAME_LEFT = TRANSITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>New name Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_NAME_RIGHT = TRANSITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NAME_CHANGE_STATUS = TRANSITION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.DiffTransition_placesImpl <em>Diff Transition places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.DiffTransition_placesImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffTransition_places()
	 * @generated
	 */
	int DIFF_TRANSITION_PLACES = 7;

	/**
	 * The feature id for the '<em><b>Diff kind Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT = 0;

	/**
	 * The feature id for the '<em><b>Diff kind Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Change Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__CHANGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__IS_MERGED = 4;

	/**
	 * The feature id for the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__DIFF_GROUP = 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__ETYPE = 6;

	/**
	 * The number of structural features of the '<em>Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.SemanticConflictImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTIC_OBJECT_NAMED_ELEMENT = SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Conflict kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__CONFLICT_KIND = SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT__SEMANTICDIFFS = SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_FEATURE_COUNT = SEMANTIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Semantic Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONFLICT_OPERATION_COUNT = SEMANTIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.impl.SemanticDiffImpl
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticDiff()
	 * @generated
	 */
	int SEMANTIC_DIFF = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__NAME = SEMANTIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION;

	/**
	 * The feature id for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES;

	/**
	 * The feature id for the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DIFF__SEMANTIC_OBJECT_NAMED_ELEMENT = SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT;

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
	 * The meta object id for the '{@link petrinetsDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.AUTHOR
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getAUTHOR()
	 * @generated
	 */
	int AUTHOR = 15;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.ChangeStatus <em>Change Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.ChangeStatus
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getChangeStatus()
	 * @generated
	 */
	int CHANGE_STATUS = 16;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.ConflictGranularity
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictGranularity()
	 * @generated
	 */
	int CONFLICT_GRANULARITY = 17;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.ConflictResolutionStrategy
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolutionStrategy()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_STRATEGY = 18;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.ConflictResolutionType
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolutionType()
	 * @generated
	 */
	int CONFLICT_RESOLUTION_TYPE = 19;

	/**
	 * The meta object id for the '{@link petrinetsDiffMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetsDiffMM.DiffKind
	 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 20;


	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.ConflictResolution <em>Conflict Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Resolution</em>'.
	 * @see petrinetsDiffMM.ConflictResolution
	 * @generated
	 */
	EClass getConflictResolution();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.ConflictResolution#getResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Type</em>'.
	 * @see petrinetsDiffMM.ConflictResolution#getResolutionType()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EAttribute getConflictResolution_ResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Strategy</em>'.
	 * @see petrinetsDiffMM.ConflictResolution#getResolutionStrategy()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EAttribute getConflictResolution_ResolutionStrategy();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticconflicts</em>'.
	 * @see petrinetsDiffMM.ConflictResolution#getSemanticconflicts()
	 * @see #getConflictResolution()
	 * @generated
	 */
	EReference getConflictResolution_Semanticconflicts();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffPetriNet <em>Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet
	 * @generated
	 */
	EClass getDiffPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getDiff_kind_Left()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getDiff_kind_Right()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#isFilter()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#isIsMerged()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getChangeStatus()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getNew_id_Left()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getNew_id_Right()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getIdChangeStatus()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getNew_name_Left()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getNew_name_Right()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet#getNameChangeStatus()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffPetriNet_places <em>Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net places</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places
	 * @generated
	 */
	EClass getDiffPetriNet_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#getDiff_kind_Left()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#getDiff_kind_Right()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#getChangeStatus()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#isFilter()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#isIsMerged()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_places#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#getDiff_Group()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsDiffMM.DiffPetriNet_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_places#getEType()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EReference getDiffPetriNet_places_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffPetriNet_transitions <em>Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net transitions</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions
	 * @generated
	 */
	EClass getDiffPetriNet_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Left()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#getDiff_kind_Right()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#getChangeStatus()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#isFilter()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#isIsMerged()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPetriNet_transitions#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#getDiff_Group()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsDiffMM.DiffPetriNet_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsDiffMM.DiffPetriNet_transitions#getEType()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EReference getDiffPetriNet_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffPlace <em>Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Place</em>'.
	 * @see petrinetsDiffMM.DiffPlace
	 * @generated
	 */
	EClass getDiffPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getDiff_kind_Left()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getDiff_kind_Right()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffPlace#isFilter()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffPlace#isIsMerged()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getChangeStatus()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_id_Left()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_id_Right()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getIdChangeStatus()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_name_Left()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_name_Right()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNameChangeStatus()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_NameChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Left <em>New tokens Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tokens Left</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_tokens_Left()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_tokens_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getNew_tokens_Right <em>New tokens Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tokens Right</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getNew_tokens_Right()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_tokens_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace#getTokensChangeStatus <em>Tokens Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPlace#getTokensChangeStatus()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_TokensChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffPlace_transitions <em>Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Place transitions</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions
	 * @generated
	 */
	EClass getDiffPlace_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#getDiff_kind_Left()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#getDiff_kind_Right()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#getChangeStatus()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#isFilter()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#isIsMerged()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffPlace_transitions#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#getDiff_Group()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsDiffMM.DiffPlace_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsDiffMM.DiffPlace_transitions#getEType()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EReference getDiffPlace_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffTransition <em>Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Transition</em>'.
	 * @see petrinetsDiffMM.DiffTransition
	 * @generated
	 */
	EClass getDiffTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getDiff_kind_Left()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getDiff_kind_Right()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffTransition#isFilter()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffTransition#isIsMerged()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getChangeStatus()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getNew_id_Left <em>New id Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Left</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getNew_id_Left()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_id_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getNew_id_Right <em>New id Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id Right</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getNew_id_Right()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_id_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getIdChangeStatus <em>Id Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Change Status</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getIdChangeStatus()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_IdChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getNew_name_Left <em>New name Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Left</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getNew_name_Left()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_name_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getNew_name_Right <em>New name Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name Right</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getNew_name_Right()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_name_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition#getNameChangeStatus <em>Name Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Change Status</em>'.
	 * @see petrinetsDiffMM.DiffTransition#getNameChangeStatus()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_NameChangeStatus();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.DiffTransition_places <em>Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Transition places</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places
	 * @generated
	 */
	EClass getDiffTransition_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#getDiff_kind_Left <em>Diff kind Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Left</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#getDiff_kind_Left()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_Diff_kind_Left();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#getDiff_kind_Right <em>Diff kind Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind Right</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#getDiff_kind_Right()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_Diff_kind_Right();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#getChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#getChangeStatus()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_ChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#isFilter()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_Filter();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#isIsMerged <em>Is Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Merged</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#isIsMerged()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_IsMerged();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.DiffTransition_places#getDiff_Group <em>Diff Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Group</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#getDiff_Group()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_Diff_Group();

	/**
	 * Returns the meta object for the reference '{@link petrinetsDiffMM.DiffTransition_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinetsDiffMM.DiffTransition_places#getEType()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EReference getDiffTransition_places_EType();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see petrinetsDiffMM.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see petrinetsDiffMM.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetsDiffMM.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see petrinetsDiffMM.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see petrinetsDiffMM.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see petrinetsDiffMM.PetriNet#getTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.PetriNet#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinetsDiffMM.PetriNet#getDiffplaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Diffplaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.PetriNet#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinetsDiffMM.PetriNet#getDifftransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petrinetsDiffMM.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petrinetsDiffMM.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.Place#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see petrinetsDiffMM.Place#getTransitions()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.Place#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinetsDiffMM.Place#getDifftransitions()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see petrinetsDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.SemanticConflict#getConflict_kind <em>Conflict kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict kind</em>'.
	 * @see petrinetsDiffMM.SemanticConflict#getConflict_kind()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Conflict_kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict Granularity</em>'.
	 * @see petrinetsDiffMM.SemanticConflict#getConflict_Granularity()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EAttribute getSemanticConflict_Conflict_Granularity();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see petrinetsDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see petrinetsDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.SemanticDiff#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see petrinetsDiffMM.SemanticDiff#getAuthor()
	 * @see #getSemanticDiff()
	 * @generated
	 */
	EAttribute getSemanticDiff_Author();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see petrinetsDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link petrinetsDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net places</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_places()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net transitions</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_transitions()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPlace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place transitions</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace_transitions()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPlace_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition places</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition_places()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffTransition_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.SemanticObject#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Named Element</em>'.
	 * @see petrinetsDiffMM.SemanticObject#getSemanticObject_NamedElement()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_NamedElement();

	/**
	 * Returns the meta object for class '{@link petrinetsDiffMM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinetsDiffMM.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinetsDiffMM.Transition#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see petrinetsDiffMM.Transition#getPlaces()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetsDiffMM.Transition#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinetsDiffMM.Transition#getDiffplaces()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Diffplaces();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.AUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AUTHOR</em>'.
	 * @see petrinetsDiffMM.AUTHOR
	 * @generated
	 */
	EEnum getAUTHOR();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.ChangeStatus <em>Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Status</em>'.
	 * @see petrinetsDiffMM.ChangeStatus
	 * @generated
	 */
	EEnum getChangeStatus();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.ConflictGranularity <em>Conflict Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Granularity</em>'.
	 * @see petrinetsDiffMM.ConflictGranularity
	 * @generated
	 */
	EEnum getConflictGranularity();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Strategy</em>'.
	 * @see petrinetsDiffMM.ConflictResolutionStrategy
	 * @generated
	 */
	EEnum getConflictResolutionStrategy();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conflict Resolution Type</em>'.
	 * @see petrinetsDiffMM.ConflictResolutionType
	 * @generated
	 */
	EEnum getConflictResolutionType();

	/**
	 * Returns the meta object for enum '{@link petrinetsDiffMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see petrinetsDiffMM.DiffKind
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
	PetrinetsDiffMMFactory getPetrinetsDiffMMFactory();

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
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.ConflictResolutionImpl <em>Conflict Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.ConflictResolutionImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolution()
		 * @generated
		 */
		EClass CONFLICT_RESOLUTION = eINSTANCE.getConflictResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT_RESOLUTION__RESOLUTION_TYPE = eINSTANCE.getConflictResolution_ResolutionType();

		/**
		 * The meta object literal for the '<em><b>Resolution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT_RESOLUTION__RESOLUTION_STRATEGY = eINSTANCE.getConflictResolution_ResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Semanticconflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT_RESOLUTION__SEMANTICCONFLICTS = eINSTANCE.getConflictResolution_Semanticconflicts();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffPetriNetImpl <em>Diff Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffPetriNetImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet()
		 * @generated
		 */
		EClass DIFF_PETRI_NET = eINSTANCE.getDiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__DIFF_KIND_LEFT = eINSTANCE.getDiffPetriNet_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__DIFF_KIND_RIGHT = eINSTANCE.getDiffPetriNet_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__FILTER = eINSTANCE.getDiffPetriNet_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__IS_MERGED = eINSTANCE.getDiffPetriNet_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__CHANGE_STATUS = eINSTANCE.getDiffPetriNet_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_ID_LEFT = eINSTANCE.getDiffPetriNet_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_ID_RIGHT = eINSTANCE.getDiffPetriNet_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__ID_CHANGE_STATUS = eINSTANCE.getDiffPetriNet_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_NAME_LEFT = eINSTANCE.getDiffPetriNet_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_NAME_RIGHT = eINSTANCE.getDiffPetriNet_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NAME_CHANGE_STATUS = eINSTANCE.getDiffPetriNet_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffPetriNet_placesImpl <em>Diff Petri Net places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffPetriNet_placesImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet_places()
		 * @generated
		 */
		EClass DIFF_PETRI_NET_PLACES = eINSTANCE.getDiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__DIFF_KIND_LEFT = eINSTANCE.getDiffPetriNet_places_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__DIFF_KIND_RIGHT = eINSTANCE.getDiffPetriNet_places_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__CHANGE_STATUS = eINSTANCE.getDiffPetriNet_places_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__FILTER = eINSTANCE.getDiffPetriNet_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__IS_MERGED = eINSTANCE.getDiffPetriNet_places_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__DIFF_GROUP = eINSTANCE.getDiffPetriNet_places_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PETRI_NET_PLACES__ETYPE = eINSTANCE.getDiffPetriNet_places_EType();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffPetriNet_transitionsImpl <em>Diff Petri Net transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffPetriNet_transitionsImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPetriNet_transitions()
		 * @generated
		 */
		EClass DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getDiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_LEFT = eINSTANCE.getDiffPetriNet_transitions_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND_RIGHT = eINSTANCE.getDiffPetriNet_transitions_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__CHANGE_STATUS = eINSTANCE.getDiffPetriNet_transitions_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__FILTER = eINSTANCE.getDiffPetriNet_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__IS_MERGED = eINSTANCE.getDiffPetriNet_transitions_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__DIFF_GROUP = eINSTANCE.getDiffPetriNet_transitions_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PETRI_NET_TRANSITIONS__ETYPE = eINSTANCE.getDiffPetriNet_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffPlaceImpl <em>Diff Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffPlaceImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPlace()
		 * @generated
		 */
		EClass DIFF_PLACE = eINSTANCE.getDiffPlace();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__DIFF_KIND_LEFT = eINSTANCE.getDiffPlace_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__DIFF_KIND_RIGHT = eINSTANCE.getDiffPlace_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__FILTER = eINSTANCE.getDiffPlace_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__IS_MERGED = eINSTANCE.getDiffPlace_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__CHANGE_STATUS = eINSTANCE.getDiffPlace_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_ID_LEFT = eINSTANCE.getDiffPlace_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_ID_RIGHT = eINSTANCE.getDiffPlace_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__ID_CHANGE_STATUS = eINSTANCE.getDiffPlace_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_NAME_LEFT = eINSTANCE.getDiffPlace_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_NAME_RIGHT = eINSTANCE.getDiffPlace_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NAME_CHANGE_STATUS = eINSTANCE.getDiffPlace_NameChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New tokens Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_TOKENS_LEFT = eINSTANCE.getDiffPlace_New_tokens_Left();

		/**
		 * The meta object literal for the '<em><b>New tokens Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_TOKENS_RIGHT = eINSTANCE.getDiffPlace_New_tokens_Right();

		/**
		 * The meta object literal for the '<em><b>Tokens Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__TOKENS_CHANGE_STATUS = eINSTANCE.getDiffPlace_TokensChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffPlace_transitionsImpl <em>Diff Place transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffPlace_transitionsImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffPlace_transitions()
		 * @generated
		 */
		EClass DIFF_PLACE_TRANSITIONS = eINSTANCE.getDiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__DIFF_KIND_LEFT = eINSTANCE.getDiffPlace_transitions_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__DIFF_KIND_RIGHT = eINSTANCE.getDiffPlace_transitions_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__CHANGE_STATUS = eINSTANCE.getDiffPlace_transitions_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__FILTER = eINSTANCE.getDiffPlace_transitions_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__IS_MERGED = eINSTANCE.getDiffPlace_transitions_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__DIFF_GROUP = eINSTANCE.getDiffPlace_transitions_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PLACE_TRANSITIONS__ETYPE = eINSTANCE.getDiffPlace_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffTransitionImpl <em>Diff Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffTransitionImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffTransition()
		 * @generated
		 */
		EClass DIFF_TRANSITION = eINSTANCE.getDiffTransition();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__DIFF_KIND_LEFT = eINSTANCE.getDiffTransition_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__DIFF_KIND_RIGHT = eINSTANCE.getDiffTransition_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__FILTER = eINSTANCE.getDiffTransition_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__IS_MERGED = eINSTANCE.getDiffTransition_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__CHANGE_STATUS = eINSTANCE.getDiffTransition_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New id Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_ID_LEFT = eINSTANCE.getDiffTransition_New_id_Left();

		/**
		 * The meta object literal for the '<em><b>New id Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_ID_RIGHT = eINSTANCE.getDiffTransition_New_id_Right();

		/**
		 * The meta object literal for the '<em><b>Id Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__ID_CHANGE_STATUS = eINSTANCE.getDiffTransition_IdChangeStatus();

		/**
		 * The meta object literal for the '<em><b>New name Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_NAME_LEFT = eINSTANCE.getDiffTransition_New_name_Left();

		/**
		 * The meta object literal for the '<em><b>New name Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_NAME_RIGHT = eINSTANCE.getDiffTransition_New_name_Right();

		/**
		 * The meta object literal for the '<em><b>Name Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NAME_CHANGE_STATUS = eINSTANCE.getDiffTransition_NameChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.DiffTransition_placesImpl <em>Diff Transition places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.DiffTransition_placesImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffTransition_places()
		 * @generated
		 */
		EClass DIFF_TRANSITION_PLACES = eINSTANCE.getDiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Diff kind Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT = eINSTANCE.getDiffTransition_places_Diff_kind_Left();

		/**
		 * The meta object literal for the '<em><b>Diff kind Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT = eINSTANCE.getDiffTransition_places_Diff_kind_Right();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__CHANGE_STATUS = eINSTANCE.getDiffTransition_places_ChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__FILTER = eINSTANCE.getDiffTransition_places_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__IS_MERGED = eINSTANCE.getDiffTransition_places_IsMerged();

		/**
		 * The meta object literal for the '<em><b>Diff Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__DIFF_GROUP = eINSTANCE.getDiffTransition_places_Diff_Group();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_TRANSITION_PLACES__ETYPE = eINSTANCE.getDiffTransition_places_EType();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.NamedElementImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.PetriNetImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TRANSITIONS = eINSTANCE.getPetriNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Diffplaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__DIFFPLACES = eINSTANCE.getPetriNet_Diffplaces();

		/**
		 * The meta object literal for the '<em><b>Difftransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__DIFFTRANSITIONS = eINSTANCE.getPetriNet_Difftransitions();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.PlaceImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TRANSITIONS = eINSTANCE.getPlace_Transitions();

		/**
		 * The meta object literal for the '<em><b>Difftransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__DIFFTRANSITIONS = eINSTANCE.getPlace_Difftransitions();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.SemanticConflictImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONFLICT__CONFLICT_KIND = eINSTANCE.getSemanticConflict_Conflict_kind();

		/**
		 * The meta object literal for the '<em><b>Conflict Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONFLICT__CONFLICT_GRANULARITY = eINSTANCE.getSemanticConflict_Conflict_Granularity();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getSemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.SemanticDiffImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticDiff()
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
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.SemanticObjectImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getSemanticObject()
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
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET = eINSTANCE.getSemanticObject_SemanticObject_DiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES = eINSTANCE.getSemanticObject_SemanticObject_DiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getSemanticObject_SemanticObject_DiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE = eINSTANCE.getSemanticObject_SemanticObject_DiffPlace();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS = eINSTANCE.getSemanticObject_SemanticObject_DiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION = eINSTANCE.getSemanticObject_SemanticObject_DiffTransition();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Diff Transition places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES = eINSTANCE.getSemanticObject_SemanticObject_DiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Semantic Object Named Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT = eINSTANCE.getSemanticObject_SemanticObject_NamedElement();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.impl.TransitionImpl
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PLACES = eINSTANCE.getTransition_Places();

		/**
		 * The meta object literal for the '<em><b>Diffplaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DIFFPLACES = eINSTANCE.getTransition_Diffplaces();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.AUTHOR <em>AUTHOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.AUTHOR
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getAUTHOR()
		 * @generated
		 */
		EEnum AUTHOR = eINSTANCE.getAUTHOR();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.ChangeStatus <em>Change Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.ChangeStatus
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getChangeStatus()
		 * @generated
		 */
		EEnum CHANGE_STATUS = eINSTANCE.getChangeStatus();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.ConflictGranularity <em>Conflict Granularity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.ConflictGranularity
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictGranularity()
		 * @generated
		 */
		EEnum CONFLICT_GRANULARITY = eINSTANCE.getConflictGranularity();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.ConflictResolutionStrategy <em>Conflict Resolution Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.ConflictResolutionStrategy
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolutionStrategy()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_STRATEGY = eINSTANCE.getConflictResolutionStrategy();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.ConflictResolutionType <em>Conflict Resolution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.ConflictResolutionType
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getConflictResolutionType()
		 * @generated
		 */
		EEnum CONFLICT_RESOLUTION_TYPE = eINSTANCE.getConflictResolutionType();

		/**
		 * The meta object literal for the '{@link petrinetsDiffMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetsDiffMM.DiffKind
		 * @see petrinetsDiffMM.impl.PetrinetsDiffMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //PetrinetsDiffMMPackage
