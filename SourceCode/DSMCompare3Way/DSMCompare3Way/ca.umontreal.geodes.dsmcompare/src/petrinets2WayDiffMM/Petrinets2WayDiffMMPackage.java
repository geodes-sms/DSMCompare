/**
 */
package petrinets2WayDiffMM;

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
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface Petrinets2WayDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinets2WayDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.geodes.UdeM.edu/petrinets2WayDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinets2WayDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinets2WayDiffMMPackage eINSTANCE = petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.NamedElementImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.PetriNetImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 1;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.PlaceImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.TransitionImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.SemanticObjectImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticObject()
	 * @generated
	 */
	int SEMANTIC_OBJECT = 4;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.SemanticDiffImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticDiff()
	 * @generated
	 */
	int SEMANTIC_DIFF = 5;

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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.SemanticConflictImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticConflict()
	 * @generated
	 */
	int SEMANTIC_CONFLICT = 6;

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
	 * The feature id for the '<em><b>Semanticdiffs</b></em>' reference list.
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
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffPetriNetImpl <em>Diff Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffPetriNetImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet()
	 * @generated
	 */
	int DIFF_PETRI_NET = 7;

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
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__DIFF_KIND = PETRI_NET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_ID = PETRI_NET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET__NEW_NAME = PETRI_NET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_FEATURE_COUNT = PETRI_NET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_OPERATION_COUNT = PETRI_NET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffPetriNet_placesImpl <em>Diff Petri Net places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffPetriNet_placesImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet_places()
	 * @generated
	 */
	int DIFF_PETRI_NET_PLACES = 8;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Petri Net places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffPetriNet_transitionsImpl <em>Diff Petri Net transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffPetriNet_transitionsImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet_transitions()
	 * @generated
	 */
	int DIFF_PETRI_NET_TRANSITIONS = 9;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Petri Net transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PETRI_NET_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffPlaceImpl <em>Diff Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffPlaceImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPlace()
	 * @generated
	 */
	int DIFF_PLACE = 10;

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
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__DIFF_KIND = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_ID = PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_NAME = PLACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE__NEW_TOKENS = PLACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Diff Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffPlace_transitionsImpl <em>Diff Place transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffPlace_transitionsImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPlace_transitions()
	 * @generated
	 */
	int DIFF_PLACE_TRANSITIONS = 11;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Place transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLACE_TRANSITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffTransitionImpl <em>Diff Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffTransitionImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffTransition()
	 * @generated
	 */
	int DIFF_TRANSITION = 12;

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
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__DIFF_KIND = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_ID = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION__NEW_NAME = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.impl.DiffTransition_placesImpl <em>Diff Transition places</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.impl.DiffTransition_placesImpl
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffTransition_places()
	 * @generated
	 */
	int DIFF_TRANSITION_PLACES = 13;

	/**
	 * The feature id for the '<em><b>Diff kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__DIFF_KIND = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Transition places</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_TRANSITION_PLACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinets2WayDiffMM.DiffKind <em>Diff Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinets2WayDiffMM.DiffKind
	 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffKind()
	 * @generated
	 */
	int DIFF_KIND = 14;


	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see petrinets2WayDiffMM.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see petrinets2WayDiffMM.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinets2WayDiffMM.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see petrinets2WayDiffMM.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see petrinets2WayDiffMM.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see petrinets2WayDiffMM.PetriNet#getTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.PetriNet#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinets2WayDiffMM.PetriNet#getDiffplaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Diffplaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.PetriNet#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinets2WayDiffMM.PetriNet#getDifftransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petrinets2WayDiffMM.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petrinets2WayDiffMM.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.Place#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see petrinets2WayDiffMM.Place#getTransitions()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.Place#getDifftransitions <em>Difftransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difftransitions</em>'.
	 * @see petrinets2WayDiffMM.Place#getDifftransitions()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Difftransitions();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinets2WayDiffMM.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.Transition#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see petrinets2WayDiffMM.Transition#getPlaces()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinets2WayDiffMM.Transition#getDiffplaces <em>Diffplaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplaces</em>'.
	 * @see petrinets2WayDiffMM.Transition#getDiffplaces()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Diffplaces();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.SemanticObject <em>Semantic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject
	 * @generated
	 */
	EClass getSemanticObject();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.SemanticObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getName()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EAttribute getSemanticObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net places</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_places()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Petri Net transitions</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_transitions()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPetriNet_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPlace()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPlace();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Place transitions</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffPlace_transitions()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffPlace_transitions();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffTransition()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Diff Transition places</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_DiffTransition_places()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_DiffTransition_places();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticObject#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semantic Object Named Element</em>'.
	 * @see petrinets2WayDiffMM.SemanticObject#getSemanticObject_NamedElement()
	 * @see #getSemanticObject()
	 * @generated
	 */
	EReference getSemanticObject_SemanticObject_NamedElement();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.SemanticDiff <em>Semantic Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Diff</em>'.
	 * @see petrinets2WayDiffMM.SemanticDiff
	 * @generated
	 */
	EClass getSemanticDiff();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.SemanticConflict <em>Semantic Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Conflict</em>'.
	 * @see petrinets2WayDiffMM.SemanticConflict
	 * @generated
	 */
	EClass getSemanticConflict();

	/**
	 * Returns the meta object for the reference list '{@link petrinets2WayDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semanticdiffs</em>'.
	 * @see petrinets2WayDiffMM.SemanticConflict#getSemanticdiffs()
	 * @see #getSemanticConflict()
	 * @generated
	 */
	EReference getSemanticConflict_Semanticdiffs();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffPetriNet <em>Diff Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet
	 * @generated
	 */
	EClass getDiffPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPetriNet#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet#getDiff_kind()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPetriNet#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet#getNew_id()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_id();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPetriNet#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet#getNew_name()
	 * @see #getDiffPetriNet()
	 * @generated
	 */
	EAttribute getDiffPetriNet_New_name();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffPetriNet_places <em>Diff Petri Net places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net places</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_places
	 * @generated
	 */
	EClass getDiffPetriNet_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPetriNet_places#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_places#getDiff_kind()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EAttribute getDiffPetriNet_places_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link petrinets2WayDiffMM.DiffPetriNet_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_places#getEType()
	 * @see #getDiffPetriNet_places()
	 * @generated
	 */
	EReference getDiffPetriNet_places_EType();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffPetriNet_transitions <em>Diff Petri Net transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Petri Net transitions</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_transitions
	 * @generated
	 */
	EClass getDiffPetriNet_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPetriNet_transitions#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_transitions#getDiff_kind()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EAttribute getDiffPetriNet_transitions_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link petrinets2WayDiffMM.DiffPetriNet_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinets2WayDiffMM.DiffPetriNet_transitions#getEType()
	 * @see #getDiffPetriNet_transitions()
	 * @generated
	 */
	EReference getDiffPetriNet_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffPlace <em>Diff Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Place</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace
	 * @generated
	 */
	EClass getDiffPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPlace#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace#getDiff_kind()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPlace#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace#getNew_id()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_id();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPlace#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace#getNew_name()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_name();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPlace#getNew_tokens <em>New tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tokens</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace#getNew_tokens()
	 * @see #getDiffPlace()
	 * @generated
	 */
	EAttribute getDiffPlace_New_tokens();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffPlace_transitions <em>Diff Place transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Place transitions</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace_transitions
	 * @generated
	 */
	EClass getDiffPlace_transitions();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffPlace_transitions#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace_transitions#getDiff_kind()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EAttribute getDiffPlace_transitions_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link petrinets2WayDiffMM.DiffPlace_transitions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinets2WayDiffMM.DiffPlace_transitions#getEType()
	 * @see #getDiffPlace_transitions()
	 * @generated
	 */
	EReference getDiffPlace_transitions_EType();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffTransition <em>Diff Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Transition</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition
	 * @generated
	 */
	EClass getDiffTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffTransition#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition#getDiff_kind()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_Diff_kind();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffTransition#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition#getNew_id()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_id();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffTransition#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition#getNew_name()
	 * @see #getDiffTransition()
	 * @generated
	 */
	EAttribute getDiffTransition_New_name();

	/**
	 * Returns the meta object for class '{@link petrinets2WayDiffMM.DiffTransition_places <em>Diff Transition places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Transition places</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition_places
	 * @generated
	 */
	EClass getDiffTransition_places();

	/**
	 * Returns the meta object for the attribute '{@link petrinets2WayDiffMM.DiffTransition_places#getDiff_kind <em>Diff kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff kind</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition_places#getDiff_kind()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EAttribute getDiffTransition_places_Diff_kind();

	/**
	 * Returns the meta object for the reference '{@link petrinets2WayDiffMM.DiffTransition_places#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see petrinets2WayDiffMM.DiffTransition_places#getEType()
	 * @see #getDiffTransition_places()
	 * @generated
	 */
	EReference getDiffTransition_places_EType();

	/**
	 * Returns the meta object for enum '{@link petrinets2WayDiffMM.DiffKind <em>Diff Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Kind</em>'.
	 * @see petrinets2WayDiffMM.DiffKind
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
	Petrinets2WayDiffMMFactory getPetrinets2WayDiffMMFactory();

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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.NamedElementImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.PetriNetImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getPetriNet()
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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.PlaceImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getPlace()
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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.TransitionImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.SemanticObjectImpl <em>Semantic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.SemanticObjectImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticObject()
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
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.SemanticDiffImpl <em>Semantic Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.SemanticDiffImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticDiff()
		 * @generated
		 */
		EClass SEMANTIC_DIFF = eINSTANCE.getSemanticDiff();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.SemanticConflictImpl <em>Semantic Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.SemanticConflictImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getSemanticConflict()
		 * @generated
		 */
		EClass SEMANTIC_CONFLICT = eINSTANCE.getSemanticConflict();

		/**
		 * The meta object literal for the '<em><b>Semanticdiffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONFLICT__SEMANTICDIFFS = eINSTANCE.getSemanticConflict_Semanticdiffs();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffPetriNetImpl <em>Diff Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffPetriNetImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet()
		 * @generated
		 */
		EClass DIFF_PETRI_NET = eINSTANCE.getDiffPetriNet();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__DIFF_KIND = eINSTANCE.getDiffPetriNet_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_ID = eINSTANCE.getDiffPetriNet_New_id();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET__NEW_NAME = eINSTANCE.getDiffPetriNet_New_name();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffPetriNet_placesImpl <em>Diff Petri Net places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffPetriNet_placesImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet_places()
		 * @generated
		 */
		EClass DIFF_PETRI_NET_PLACES = eINSTANCE.getDiffPetriNet_places();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_PLACES__DIFF_KIND = eINSTANCE.getDiffPetriNet_places_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PETRI_NET_PLACES__ETYPE = eINSTANCE.getDiffPetriNet_places_EType();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffPetriNet_transitionsImpl <em>Diff Petri Net transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffPetriNet_transitionsImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPetriNet_transitions()
		 * @generated
		 */
		EClass DIFF_PETRI_NET_TRANSITIONS = eINSTANCE.getDiffPetriNet_transitions();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PETRI_NET_TRANSITIONS__DIFF_KIND = eINSTANCE.getDiffPetriNet_transitions_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PETRI_NET_TRANSITIONS__ETYPE = eINSTANCE.getDiffPetriNet_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffPlaceImpl <em>Diff Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffPlaceImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPlace()
		 * @generated
		 */
		EClass DIFF_PLACE = eINSTANCE.getDiffPlace();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__DIFF_KIND = eINSTANCE.getDiffPlace_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_ID = eINSTANCE.getDiffPlace_New_id();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_NAME = eINSTANCE.getDiffPlace_New_name();

		/**
		 * The meta object literal for the '<em><b>New tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE__NEW_TOKENS = eINSTANCE.getDiffPlace_New_tokens();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffPlace_transitionsImpl <em>Diff Place transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffPlace_transitionsImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffPlace_transitions()
		 * @generated
		 */
		EClass DIFF_PLACE_TRANSITIONS = eINSTANCE.getDiffPlace_transitions();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLACE_TRANSITIONS__DIFF_KIND = eINSTANCE.getDiffPlace_transitions_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PLACE_TRANSITIONS__ETYPE = eINSTANCE.getDiffPlace_transitions_EType();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffTransitionImpl <em>Diff Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffTransitionImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffTransition()
		 * @generated
		 */
		EClass DIFF_TRANSITION = eINSTANCE.getDiffTransition();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__DIFF_KIND = eINSTANCE.getDiffTransition_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_ID = eINSTANCE.getDiffTransition_New_id();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION__NEW_NAME = eINSTANCE.getDiffTransition_New_name();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.impl.DiffTransition_placesImpl <em>Diff Transition places</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.impl.DiffTransition_placesImpl
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffTransition_places()
		 * @generated
		 */
		EClass DIFF_TRANSITION_PLACES = eINSTANCE.getDiffTransition_places();

		/**
		 * The meta object literal for the '<em><b>Diff kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_TRANSITION_PLACES__DIFF_KIND = eINSTANCE.getDiffTransition_places_Diff_kind();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_TRANSITION_PLACES__ETYPE = eINSTANCE.getDiffTransition_places_EType();

		/**
		 * The meta object literal for the '{@link petrinets2WayDiffMM.DiffKind <em>Diff Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinets2WayDiffMM.DiffKind
		 * @see petrinets2WayDiffMM.impl.Petrinets2WayDiffMMPackageImpl#getDiffKind()
		 * @generated
		 */
		EEnum DIFF_KIND = eINSTANCE.getDiffKind();

	}

} //Petrinets2WayDiffMMPackage
