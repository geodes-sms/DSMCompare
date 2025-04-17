/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.ConflictGranularity;
import pacmanDiffMM.ConflictResolution;
import pacmanDiffMM.ConflictResolutionStrategy;
import pacmanDiffMM.ConflictResolutionType;
import pacmanDiffMM.DiffEnergizer;
import pacmanDiffMM.DiffFood;
import pacmanDiffMM.DiffFruit;
import pacmanDiffMM.DiffGame;
import pacmanDiffMM.DiffGame_entities;
import pacmanDiffMM.DiffGame_gridnodes;
import pacmanDiffMM.DiffGhost;
import pacmanDiffMM.DiffGridNode;
import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.DiffGridNode_left;
import pacmanDiffMM.DiffGridNode_right;
import pacmanDiffMM.DiffGridNode_up;
import pacmanDiffMM.DiffKind;
import pacmanDiffMM.DiffPacman;
import pacmanDiffMM.DiffPositionableEntity_on;
import pacmanDiffMM.Energizer;
import pacmanDiffMM.Food;
import pacmanDiffMM.Fruit;
import pacmanDiffMM.Game;
import pacmanDiffMM.Ghost;
import pacmanDiffMM.GhostStrategy;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.Pacman;
import pacmanDiffMM.PacmanDiffMMFactory;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.PositionableEntity;
import pacmanDiffMM.SemanticConflict;
import pacmanDiffMM.SemanticDiff;
import pacmanDiffMM.SemanticObject;
import pacmanDiffMM._ListEInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanDiffMMPackageImpl extends EPackageImpl implements PacmanDiffMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEnergizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFoodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffFruitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGame_entitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGame_gridnodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGhostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNode_downEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNode_leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNode_rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNode_upEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffPositionableEntity_onEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fruitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _ListEIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictGranularityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictResolutionStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conflictResolutionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ghostStrategyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pacmanDiffMM.PacmanDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanDiffMMPackageImpl() {
		super(eNS_URI, PacmanDiffMMFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PacmanDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanDiffMMPackage init() {
		if (isInited) return (PacmanDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacmanDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PacmanDiffMMPackageImpl thePacmanDiffMMPackage = registeredPacmanDiffMMPackage instanceof PacmanDiffMMPackageImpl ? (PacmanDiffMMPackageImpl)registeredPacmanDiffMMPackage : new PacmanDiffMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePacmanDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanDiffMMPackage.eNS_URI, thePacmanDiffMMPackage);
		return thePacmanDiffMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictResolution() {
		return conflictResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflictResolution_ResolutionType() {
		return (EAttribute)conflictResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflictResolution_ResolutionStrategy() {
		return (EAttribute)conflictResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictResolution_Semanticconflicts() {
		return (EReference)conflictResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEnergizer() {
		return diffEnergizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_Diff_kind_Left() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_Diff_kind_Right() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_Filter() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_IsMerged() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_ChangeStatus() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_New_id_Left() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_New_id_Right() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_IdChangeStatus() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_New_value_Left() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_New_value_Right() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_ValueChangeStatus() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEnergizer_New_durations_Left() {
		return (EReference)diffEnergizerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEnergizer_New_durations_Right() {
		return (EReference)diffEnergizerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_DurationsChangeStatus() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffFood() {
		return diffFoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_Diff_kind_Left() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_Diff_kind_Right() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_Filter() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_IsMerged() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_ChangeStatus() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_id_Left() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_id_Right() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_IdChangeStatus() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_value_Left() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_value_Right() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_ValueChangeStatus() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffFruit() {
		return diffFruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_Diff_kind_Left() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_Diff_kind_Right() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_Filter() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_IsMerged() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_ChangeStatus() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_id_Left() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_id_Right() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_IdChangeStatus() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_value_Left() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_value_Right() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_ValueChangeStatus() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_location_Left() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_location_Right() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_LocationChangeStatus() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGame() {
		return diffGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_Diff_kind_Left() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_Diff_kind_Right() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_Filter() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_IsMerged() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_ChangeStatus() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_id_Left() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_id_Right() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_IdChangeStatus() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_lives_Left() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_lives_Right() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_LivesChangeStatus() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_score_Left() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_score_Right() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_ScoreChangeStatus() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGame_entities() {
		return diffGame_entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_Diff_kind_Left() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_Diff_kind_Right() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_ChangeStatus() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_Filter() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_IsMerged() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_Diff_Group() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_entities_EType() {
		return (EReference)diffGame_entitiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGame_gridnodes() {
		return diffGame_gridnodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_Diff_kind_Left() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_Diff_kind_Right() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_ChangeStatus() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_Filter() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_IsMerged() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_gridnodes_Diff_Group() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_gridnodes_EType() {
		return (EReference)diffGame_gridnodesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGhost() {
		return diffGhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_Diff_kind_Left() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_Diff_kind_Right() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_Filter() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_IsMerged() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_ChangeStatus() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_id_Left() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_id_Right() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_IdChangeStatus() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_strategy_Left() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_strategy_Right() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_StrategyChangeStatus() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode() {
		return diffGridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_Diff_kind_Left() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_Diff_kind_Right() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_Filter() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_IsMerged() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_ChangeStatus() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_New_id_Left() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_New_id_Right() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_IdChangeStatus() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode_down() {
		return diffGridNode_downEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_Diff_kind_Left() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_Diff_kind_Right() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_ChangeStatus() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_Filter() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_IsMerged() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_Diff_Group() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_down_EType() {
		return (EReference)diffGridNode_downEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode_left() {
		return diffGridNode_leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_Diff_kind_Left() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_Diff_kind_Right() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_ChangeStatus() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_Filter() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_IsMerged() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_left_Diff_Group() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_left_EType() {
		return (EReference)diffGridNode_leftEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode_right() {
		return diffGridNode_rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_Diff_kind_Left() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_Diff_kind_Right() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_ChangeStatus() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_Filter() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_IsMerged() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_right_Diff_Group() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_right_EType() {
		return (EReference)diffGridNode_rightEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode_up() {
		return diffGridNode_upEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_Diff_kind_Left() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_Diff_kind_Right() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_ChangeStatus() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_Filter() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_IsMerged() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_up_Diff_Group() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_up_EType() {
		return (EReference)diffGridNode_upEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPacman() {
		return diffPacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_Diff_kind_Left() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_Diff_kind_Right() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_Filter() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_IsMerged() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_ChangeStatus() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_id_Left() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_id_Right() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_IdChangeStatus() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_initialPosition_Left() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_initialPosition_Right() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_InitialPositionChangeStatus() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffPositionableEntity_on() {
		return diffPositionableEntity_onEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_Diff_kind_Left() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_Diff_kind_Right() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_ChangeStatus() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_Filter() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_IsMerged() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPositionableEntity_on_Diff_Group() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPositionableEntity_on_EType() {
		return (EReference)diffPositionableEntity_onEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergizer() {
		return energizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergizer_Durations() {
		return (EAttribute)energizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFood() {
		return foodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFood_Value() {
		return (EAttribute)foodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFruit() {
		return fruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFruit_Location() {
		return (EAttribute)fruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Id() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Lives() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Score() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Gridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Entities() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffgridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffentities() {
		return (EReference)gameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhost() {
		return ghostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGhost_Strategy() {
		return (EAttribute)ghostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridNode() {
		return gridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Up() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Down() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Left() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Right() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridNode_Id() {
		return (EAttribute)gridNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Diffup() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Diffdown() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Diffleft() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Diffright() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacman() {
		return pacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_InitialPosition() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionableEntity() {
		return positionableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionableEntity_On() {
		return (EReference)positionableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionableEntity_Id() {
		return (EAttribute)positionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionableEntity_Diffon() {
		return (EReference)positionableEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticConflict() {
		return semanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticConflict_Conflict_kind() {
		return (EAttribute)semanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticConflict_Conflict_Granularity() {
		return (EAttribute)semanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_Semanticdiffs() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticDiff() {
		return semanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticDiff_Author() {
		return (EAttribute)semanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticObject() {
		return semanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticObject_Name() {
		return (EAttribute)semanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffEnergizer() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffFood() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffFruit() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGame() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGame_entities() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGame_gridnodes() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGhost() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGridNode() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGridNode_down() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGridNode_left() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGridNode_right() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffGridNode_up() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPacman() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_DiffPositionableEntity_on() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_Game() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_GridNode() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticObject_SemanticObject_PositionableEntity() {
		return (EReference)semanticObjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_ListEInt() {
		return _ListEIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_ListEInt_Value() {
		return (EAttribute)_ListEIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAUTHOR() {
		return authorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeStatus() {
		return changeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictGranularity() {
		return conflictGranularityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictResolutionStrategy() {
		return conflictResolutionStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConflictResolutionType() {
		return conflictResolutionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiffKind() {
		return diffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGhostStrategy() {
		return ghostStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDiffMMFactory getPacmanDiffMMFactory() {
		return (PacmanDiffMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conflictResolutionEClass = createEClass(CONFLICT_RESOLUTION);
		createEAttribute(conflictResolutionEClass, CONFLICT_RESOLUTION__RESOLUTION_TYPE);
		createEAttribute(conflictResolutionEClass, CONFLICT_RESOLUTION__RESOLUTION_STRATEGY);
		createEReference(conflictResolutionEClass, CONFLICT_RESOLUTION__SEMANTICCONFLICTS);

		diffEnergizerEClass = createEClass(DIFF_ENERGIZER);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__DIFF_KIND_LEFT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__DIFF_KIND_RIGHT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__FILTER);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__IS_MERGED);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__CHANGE_STATUS);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__NEW_ID_LEFT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__NEW_ID_RIGHT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__ID_CHANGE_STATUS);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__NEW_VALUE_LEFT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__NEW_VALUE_RIGHT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__VALUE_CHANGE_STATUS);
		createEReference(diffEnergizerEClass, DIFF_ENERGIZER__NEW_DURATIONS_LEFT);
		createEReference(diffEnergizerEClass, DIFF_ENERGIZER__NEW_DURATIONS_RIGHT);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS);

		diffFoodEClass = createEClass(DIFF_FOOD);
		createEAttribute(diffFoodEClass, DIFF_FOOD__DIFF_KIND_LEFT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__DIFF_KIND_RIGHT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__FILTER);
		createEAttribute(diffFoodEClass, DIFF_FOOD__IS_MERGED);
		createEAttribute(diffFoodEClass, DIFF_FOOD__CHANGE_STATUS);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_ID_LEFT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_ID_RIGHT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__ID_CHANGE_STATUS);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_VALUE_LEFT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_VALUE_RIGHT);
		createEAttribute(diffFoodEClass, DIFF_FOOD__VALUE_CHANGE_STATUS);

		diffFruitEClass = createEClass(DIFF_FRUIT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__DIFF_KIND_LEFT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__DIFF_KIND_RIGHT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__FILTER);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__IS_MERGED);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__CHANGE_STATUS);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_ID_LEFT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_ID_RIGHT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__ID_CHANGE_STATUS);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_VALUE_LEFT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_VALUE_RIGHT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__VALUE_CHANGE_STATUS);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_LOCATION_LEFT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_LOCATION_RIGHT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__LOCATION_CHANGE_STATUS);

		diffGameEClass = createEClass(DIFF_GAME);
		createEAttribute(diffGameEClass, DIFF_GAME__DIFF_KIND_LEFT);
		createEAttribute(diffGameEClass, DIFF_GAME__DIFF_KIND_RIGHT);
		createEAttribute(diffGameEClass, DIFF_GAME__FILTER);
		createEAttribute(diffGameEClass, DIFF_GAME__IS_MERGED);
		createEAttribute(diffGameEClass, DIFF_GAME__CHANGE_STATUS);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_ID_LEFT);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_ID_RIGHT);
		createEAttribute(diffGameEClass, DIFF_GAME__ID_CHANGE_STATUS);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_LIVES_LEFT);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_LIVES_RIGHT);
		createEAttribute(diffGameEClass, DIFF_GAME__LIVES_CHANGE_STATUS);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_SCORE_LEFT);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_SCORE_RIGHT);
		createEAttribute(diffGameEClass, DIFF_GAME__SCORE_CHANGE_STATUS);

		diffGame_entitiesEClass = createEClass(DIFF_GAME_ENTITIES);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__DIFF_KIND_LEFT);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__CHANGE_STATUS);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__FILTER);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__IS_MERGED);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__DIFF_GROUP);
		createEReference(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__ETYPE);

		diffGame_gridnodesEClass = createEClass(DIFF_GAME_GRIDNODES);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__CHANGE_STATUS);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__FILTER);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__IS_MERGED);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__DIFF_GROUP);
		createEReference(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__ETYPE);

		diffGhostEClass = createEClass(DIFF_GHOST);
		createEAttribute(diffGhostEClass, DIFF_GHOST__DIFF_KIND_LEFT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__DIFF_KIND_RIGHT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__FILTER);
		createEAttribute(diffGhostEClass, DIFF_GHOST__IS_MERGED);
		createEAttribute(diffGhostEClass, DIFF_GHOST__CHANGE_STATUS);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_ID_LEFT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_ID_RIGHT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__ID_CHANGE_STATUS);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_STRATEGY_LEFT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_STRATEGY_RIGHT);
		createEAttribute(diffGhostEClass, DIFF_GHOST__STRATEGY_CHANGE_STATUS);

		diffGridNodeEClass = createEClass(DIFF_GRID_NODE);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__DIFF_KIND_LEFT);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__DIFF_KIND_RIGHT);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__FILTER);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__IS_MERGED);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__CHANGE_STATUS);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__NEW_ID_LEFT);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__NEW_ID_RIGHT);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__ID_CHANGE_STATUS);

		diffGridNode_downEClass = createEClass(DIFF_GRID_NODE_DOWN);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__CHANGE_STATUS);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__FILTER);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__IS_MERGED);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__DIFF_GROUP);
		createEReference(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__ETYPE);

		diffGridNode_leftEClass = createEClass(DIFF_GRID_NODE_LEFT);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__CHANGE_STATUS);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__FILTER);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__IS_MERGED);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__DIFF_GROUP);
		createEReference(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__ETYPE);

		diffGridNode_rightEClass = createEClass(DIFF_GRID_NODE_RIGHT);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__CHANGE_STATUS);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__FILTER);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__IS_MERGED);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__DIFF_GROUP);
		createEReference(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__ETYPE);

		diffGridNode_upEClass = createEClass(DIFF_GRID_NODE_UP);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__DIFF_KIND_LEFT);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__CHANGE_STATUS);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__FILTER);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__IS_MERGED);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__DIFF_GROUP);
		createEReference(diffGridNode_upEClass, DIFF_GRID_NODE_UP__ETYPE);

		diffPacmanEClass = createEClass(DIFF_PACMAN);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__DIFF_KIND_LEFT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__DIFF_KIND_RIGHT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__FILTER);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__IS_MERGED);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__CHANGE_STATUS);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_ID_LEFT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_ID_RIGHT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__ID_CHANGE_STATUS);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS);

		diffPositionableEntity_onEClass = createEClass(DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__FILTER);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__IS_MERGED);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__DIFF_GROUP);
		createEReference(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__ETYPE);

		energizerEClass = createEClass(ENERGIZER);
		createEAttribute(energizerEClass, ENERGIZER__DURATIONS);

		foodEClass = createEClass(FOOD);
		createEAttribute(foodEClass, FOOD__VALUE);

		fruitEClass = createEClass(FRUIT);
		createEAttribute(fruitEClass, FRUIT__LOCATION);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__ID);
		createEAttribute(gameEClass, GAME__LIVES);
		createEAttribute(gameEClass, GAME__SCORE);
		createEReference(gameEClass, GAME__GRIDNODES);
		createEReference(gameEClass, GAME__ENTITIES);
		createEReference(gameEClass, GAME__DIFFGRIDNODES);
		createEReference(gameEClass, GAME__DIFFENTITIES);

		ghostEClass = createEClass(GHOST);
		createEAttribute(ghostEClass, GHOST__STRATEGY);

		gridNodeEClass = createEClass(GRID_NODE);
		createEReference(gridNodeEClass, GRID_NODE__UP);
		createEReference(gridNodeEClass, GRID_NODE__DOWN);
		createEReference(gridNodeEClass, GRID_NODE__LEFT);
		createEReference(gridNodeEClass, GRID_NODE__RIGHT);
		createEAttribute(gridNodeEClass, GRID_NODE__ID);
		createEReference(gridNodeEClass, GRID_NODE__DIFFUP);
		createEReference(gridNodeEClass, GRID_NODE__DIFFDOWN);
		createEReference(gridNodeEClass, GRID_NODE__DIFFLEFT);
		createEReference(gridNodeEClass, GRID_NODE__DIFFRIGHT);

		pacmanEClass = createEClass(PACMAN);
		createEAttribute(pacmanEClass, PACMAN__INITIAL_POSITION);

		positionableEntityEClass = createEClass(POSITIONABLE_ENTITY);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__ON);
		createEAttribute(positionableEntityEClass, POSITIONABLE_ENTITY__ID);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__DIFFON);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEAttribute(semanticConflictEClass, SEMANTIC_CONFLICT__CONFLICT_KIND);
		createEAttribute(semanticConflictEClass, SEMANTIC_CONFLICT__CONFLICT_GRANULARITY);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTICDIFFS);

		semanticDiffEClass = createEClass(SEMANTIC_DIFF);
		createEAttribute(semanticDiffEClass, SEMANTIC_DIFF__AUTHOR);

		semanticObjectEClass = createEClass(SEMANTIC_OBJECT);
		createEAttribute(semanticObjectEClass, SEMANTIC_OBJECT__NAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE);
		createEReference(semanticObjectEClass, SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY);

		_ListEIntEClass = createEClass(_LIST_EINT);
		createEAttribute(_ListEIntEClass, _LIST_EINT__VALUE);

		// Create enums
		authorEEnum = createEEnum(AUTHOR);
		changeStatusEEnum = createEEnum(CHANGE_STATUS);
		conflictGranularityEEnum = createEEnum(CONFLICT_GRANULARITY);
		conflictResolutionStrategyEEnum = createEEnum(CONFLICT_RESOLUTION_STRATEGY);
		conflictResolutionTypeEEnum = createEEnum(CONFLICT_RESOLUTION_TYPE);
		diffKindEEnum = createEEnum(DIFF_KIND);
		ghostStrategyEEnum = createEEnum(GHOST_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conflictResolutionEClass.getESuperTypes().add(this.getSemanticObject());
		diffEnergizerEClass.getESuperTypes().add(this.getEnergizer());
		diffFoodEClass.getESuperTypes().add(this.getFood());
		diffFruitEClass.getESuperTypes().add(this.getFruit());
		diffGameEClass.getESuperTypes().add(this.getGame());
		diffGhostEClass.getESuperTypes().add(this.getGhost());
		diffGridNodeEClass.getESuperTypes().add(this.getGridNode());
		diffPacmanEClass.getESuperTypes().add(this.getPacman());
		energizerEClass.getESuperTypes().add(this.getFood());
		foodEClass.getESuperTypes().add(this.getPositionableEntity());
		fruitEClass.getESuperTypes().add(this.getFood());
		ghostEClass.getESuperTypes().add(this.getPositionableEntity());
		pacmanEClass.getESuperTypes().add(this.getPositionableEntity());
		semanticConflictEClass.getESuperTypes().add(this.getSemanticObject());
		semanticDiffEClass.getESuperTypes().add(this.getSemanticObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(conflictResolutionEClass, ConflictResolution.class, "ConflictResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConflictResolution_ResolutionType(), this.getConflictResolutionType(), "ResolutionType", null, 1, 1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflictResolution_ResolutionStrategy(), this.getConflictResolutionStrategy(), "ResolutionStrategy", null, 1, 1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictResolution_Semanticconflicts(), this.getSemanticConflict(), null, "semanticconflicts", null, 0, -1, ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diffEnergizerEClass, DiffEnergizer.class, "DiffEnergizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEnergizer_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEnergizer_New_durations_Left(), this.get_ListEInt(), null, "new_durations_Left", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEnergizer_New_durations_Right(), this.get_ListEInt(), null, "new_durations_Right", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_DurationsChangeStatus(), this.getChangeStatus(), "durationsChangeStatus", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFoodEClass, DiffFood.class, "DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFood_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFruitEClass, DiffFruit.class, "DiffFruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFruit_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_location_Left(), ecorePackage.getEString(), "new_location_Left", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_location_Right(), ecorePackage.getEString(), "new_location_Right", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_LocationChangeStatus(), this.getChangeStatus(), "locationChangeStatus", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGameEClass, DiffGame.class, "DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_lives_Left(), ecorePackage.getEInt(), "new_lives_Left", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_lives_Right(), ecorePackage.getEInt(), "new_lives_Right", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_LivesChangeStatus(), this.getChangeStatus(), "livesChangeStatus", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_score_Left(), ecorePackage.getEInt(), "new_score_Left", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_score_Right(), ecorePackage.getEInt(), "new_score_Right", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_ScoreChangeStatus(), this.getChangeStatus(), "scoreChangeStatus", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_entitiesEClass, DiffGame_entities.class, "DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_entities_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_entities_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_entities_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_entities_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_entities_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_entities_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_entities_EType(), this.getPositionableEntity(), null, "eType", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_gridnodesEClass, DiffGame_gridnodes.class, "DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_gridnodes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_gridnodes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_gridnodes_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_gridnodes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_gridnodes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_gridnodes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_gridnodes_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGhostEClass, DiffGhost.class, "DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGhost_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_strategy_Left(), this.getGhostStrategy(), "new_strategy_Left", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_strategy_Right(), this.getGhostStrategy(), "new_strategy_Right", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_StrategyChangeStatus(), this.getChangeStatus(), "strategyChangeStatus", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNodeEClass, DiffGridNode.class, "DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_downEClass, DiffGridNode_down.class, "DiffGridNode_down", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_down_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_down_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_down_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_down_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_down_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_down_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_down_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_leftEClass, DiffGridNode_left.class, "DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_left_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_left_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_left_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_left_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_left_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_left_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_left_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_rightEClass, DiffGridNode_right.class, "DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_right_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_right_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_right_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_right_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_right_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_right_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_right_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_upEClass, DiffGridNode_up.class, "DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_up_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_up_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_up_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_up_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_up_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_up_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_up_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPacmanEClass, DiffPacman.class, "DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPacman_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_initialPosition_Left(), ecorePackage.getEString(), "new_initialPosition_Left", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_initialPosition_Right(), ecorePackage.getEString(), "new_initialPosition_Right", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_InitialPositionChangeStatus(), this.getChangeStatus(), "initialPositionChangeStatus", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPositionableEntity_onEClass, DiffPositionableEntity_on.class, "DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPositionableEntity_on_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", "NON", 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPositionableEntity_on_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", "NON", 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPositionableEntity_on_ChangeStatus(), this.getChangeStatus(), "changeStatus", "NON", 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPositionableEntity_on_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPositionableEntity_on_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPositionableEntity_on_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPositionableEntity_on_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energizerEClass, Energizer.class, "Energizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergizer_Durations(), ecorePackage.getEInt(), "durations", null, 0, -1, Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodEClass, Food.class, "Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFood_Value(), ecorePackage.getEInt(), "value", "1", 0, 1, Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fruitEClass, Fruit.class, "Fruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFruit_Location(), ecorePackage.getEString(), "location", null, 0, 1, Fruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Id(), ecorePackage.getEString(), "id", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Lives(), ecorePackage.getEInt(), "lives", "1", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Score(), ecorePackage.getEInt(), "score", "0", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Gridnodes(), this.getGridNode(), null, "gridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Entities(), this.getPositionableEntity(), null, "entities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffgridnodes(), this.getDiffGame_gridnodes(), null, "diffgridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffentities(), this.getDiffGame_entities(), null, "diffentities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGhost_Strategy(), this.getGhostStrategy(), "strategy", null, 1, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridNodeEClass, GridNode.class, "GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridNode_Up(), this.getGridNode(), null, "up", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Down(), this.getGridNode(), null, "down", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Left(), this.getGridNode(), null, "left", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Right(), this.getGridNode(), null, "right", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffup(), this.getDiffGridNode_up(), null, "diffup", null, 0, -1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffdown(), this.getDiffGridNode_down(), null, "diffdown", null, 0, -1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffleft(), this.getDiffGridNode_left(), null, "diffleft", null, 0, -1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffright(), this.getDiffGridNode_right(), null, "diffright", null, 0, -1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pacmanEClass, Pacman.class, "Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPacman_InitialPosition(), ecorePackage.getEString(), "initialPosition", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEntityEClass, PositionableEntity.class, "PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionableEntity_On(), this.getGridNode(), null, "on", null, 1, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionableEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionableEntity_Diffon(), this.getDiffPositionableEntity_on(), null, "diffon", null, 0, -1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticConflict_Conflict_kind(), this.getChangeStatus(), "conflict_kind", "NON", 1, 1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemanticConflict_Conflict_Granularity(), this.getConflictGranularity(), "conflict_Granularity", "NIL", 1, 1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_Semanticdiffs(), this.getSemanticDiff(), null, "semanticdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(semanticDiffEClass, SemanticDiff.class, "SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticDiff_Author(), this.getAUTHOR(), "author", "NON", 1, 1, SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticObjectEClass, SemanticObject.class, "SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffEnergizer(), this.getDiffEnergizer(), null, "SemanticObject_DiffEnergizer", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffFood(), this.getDiffFood(), null, "SemanticObject_DiffFood", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffFruit(), this.getDiffFruit(), null, "SemanticObject_DiffFruit", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGame(), this.getDiffGame(), null, "SemanticObject_DiffGame", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGame_entities(), this.getDiffGame_entities(), null, "SemanticObject_DiffGame_entities", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGame_gridnodes(), this.getDiffGame_gridnodes(), null, "SemanticObject_DiffGame_gridnodes", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGhost(), this.getDiffGhost(), null, "SemanticObject_DiffGhost", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGridNode(), this.getDiffGridNode(), null, "SemanticObject_DiffGridNode", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGridNode_down(), this.getDiffGridNode_down(), null, "SemanticObject_DiffGridNode_down", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGridNode_left(), this.getDiffGridNode_left(), null, "SemanticObject_DiffGridNode_left", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGridNode_right(), this.getDiffGridNode_right(), null, "SemanticObject_DiffGridNode_right", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffGridNode_up(), this.getDiffGridNode_up(), null, "SemanticObject_DiffGridNode_up", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPacman(), this.getDiffPacman(), null, "SemanticObject_DiffPacman", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_DiffPositionableEntity_on(), this.getDiffPositionableEntity_on(), null, "SemanticObject_DiffPositionableEntity_on", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_Game(), this.getGame(), null, "SemanticObject_Game", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_GridNode(), this.getGridNode(), null, "SemanticObject_GridNode", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticObject_SemanticObject_PositionableEntity(), this.getPositionableEntity(), null, "SemanticObject_PositionableEntity", null, 0, -1, SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(_ListEIntEClass, _ListEInt.class, "_ListEInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_ListEInt_Value(), ecorePackage.getEInt(), "value", null, 0, -1, _ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorEEnum, pacmanDiffMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, pacmanDiffMM.AUTHOR.NON);
		addEEnumLiteral(authorEEnum, pacmanDiffMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, pacmanDiffMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, pacmanDiffMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, pacmanDiffMM.AUTHOR.MIXED);

		initEEnum(changeStatusEEnum, ChangeStatus.class, "ChangeStatus");
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.NON);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.EQUIVALENT);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.CONTRADICTING);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_ADD);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_DELETE);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_MODIFY);
		addEEnumLiteral(changeStatusEEnum, ChangeStatus.MERGE_DELETE_CREATE);

		initEEnum(conflictGranularityEEnum, ConflictGranularity.class, "ConflictGranularity");
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.NIL);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.SEMANTIC_SEMANTIC);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.SEMANTIC_FINE);
		addEEnumLiteral(conflictGranularityEEnum, ConflictGranularity.FINE_FINE);

		initEEnum(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.class, "ConflictResolutionStrategy");
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.NIL);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_LEFT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_RIGHT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.KEEP_SEMANTIC_DIFFERENCE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_NONE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_LEFT_THEN_RIGHT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_RIGHT_THEN_LEFT);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.APPLY_AUSER_DEFINED_RESOLUTION_PATTERN);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.CUSTOM_CHANGE_AT_TIME_OF_MERGE);
		addEEnumLiteral(conflictResolutionStrategyEEnum, ConflictResolutionStrategy.SUGGEST_ARESOLUTION_NEEDING_APPROVAL);

		initEEnum(conflictResolutionTypeEEnum, ConflictResolutionType.class, "ConflictResolutionType");
		addEEnumLiteral(conflictResolutionTypeEEnum, ConflictResolutionType.PENDING);
		addEEnumLiteral(conflictResolutionTypeEEnum, ConflictResolutionType.RESOLVED);

		initEEnum(diffKindEEnum, DiffKind.class, "DiffKind");
		addEEnumLiteral(diffKindEEnum, DiffKind.NON);
		addEEnumLiteral(diffKindEEnum, DiffKind.ADD);
		addEEnumLiteral(diffKindEEnum, DiffKind.DELETE);
		addEEnumLiteral(diffKindEEnum, DiffKind.MODIFY);

		initEEnum(ghostStrategyEEnum, GhostStrategy.class, "GhostStrategy");
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.BLINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.PINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.INKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.CLYDE);

		// Create resource
		createResource(eNS_URI);
	}

} //PacmanDiffMMPackageImpl
