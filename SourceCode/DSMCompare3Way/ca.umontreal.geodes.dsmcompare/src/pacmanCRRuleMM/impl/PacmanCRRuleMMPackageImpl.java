/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.ConflictGranularity;
import pacmanCRRuleMM.ConflictResolutionStrategy;
import pacmanCRRuleMM.ConflictResolutionType;
import pacmanCRRuleMM.DiffKind;
import pacmanCRRuleMM.GhostStrategy;
import pacmanCRRuleMM.PacmanCRRuleMMFactory;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_ConflictResolution;
import pacmanCRRuleMM.Pattern_DiffEnergizer;
import pacmanCRRuleMM.Pattern_DiffFood;
import pacmanCRRuleMM.Pattern_DiffFruit;
import pacmanCRRuleMM.Pattern_DiffGame;
import pacmanCRRuleMM.Pattern_DiffGame_entities;
import pacmanCRRuleMM.Pattern_DiffGame_gridnodes;
import pacmanCRRuleMM.Pattern_DiffGhost;
import pacmanCRRuleMM.Pattern_DiffGridNode;
import pacmanCRRuleMM.Pattern_DiffGridNode_down;
import pacmanCRRuleMM.Pattern_DiffGridNode_left;
import pacmanCRRuleMM.Pattern_DiffGridNode_right;
import pacmanCRRuleMM.Pattern_DiffGridNode_up;
import pacmanCRRuleMM.Pattern_DiffPacman;
import pacmanCRRuleMM.Pattern_DiffPositionableEntity_on;
import pacmanCRRuleMM.Pattern_Energizer;
import pacmanCRRuleMM.Pattern_Food;
import pacmanCRRuleMM.Pattern_Fruit;
import pacmanCRRuleMM.Pattern_Game;
import pacmanCRRuleMM.Pattern_Ghost;
import pacmanCRRuleMM.Pattern_GridNode;
import pacmanCRRuleMM.Pattern_Pacman;
import pacmanCRRuleMM.Pattern_PositionableEntity;
import pacmanCRRuleMM.Pattern_SemanticConflict;
import pacmanCRRuleMM.Pattern_SemanticDiff;
import pacmanCRRuleMM.Pattern_SemanticObject;
import pacmanCRRuleMM.Pattern__ListEInt;
import pacmanCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanCRRuleMMPackageImpl extends EPackageImpl implements PacmanCRRuleMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_ConflictResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffEnergizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFoodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffFruitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGame_entitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGame_gridnodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGhostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGridNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGridNode_downEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGridNode_leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGridNode_rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffGridNode_upEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_DiffPositionableEntity_onEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_EnergizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_FoodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_FruitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_GameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_GhostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_GridNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_PositionableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern_SemanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pattern__ListEIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

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
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanCRRuleMMPackageImpl() {
		super(eNS_URI, PacmanCRRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PacmanCRRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanCRRuleMMPackage init() {
		if (isInited) return (PacmanCRRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanCRRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacmanCRRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PacmanCRRuleMMPackageImpl thePacmanCRRuleMMPackage = registeredPacmanCRRuleMMPackage instanceof PacmanCRRuleMMPackageImpl ? (PacmanCRRuleMMPackageImpl)registeredPacmanCRRuleMMPackage : new PacmanCRRuleMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePacmanCRRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanCRRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanCRRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanCRRuleMMPackage.eNS_URI, thePacmanCRRuleMMPackage);
		return thePacmanCRRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_ConflictResolution() {
		return pattern_ConflictResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ConflictResolution_ResolutionType() {
		return (EAttribute)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_ConflictResolution_ResolutionStrategy() {
		return (EAttribute)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_ConflictResolution_Semanticconflicts() {
		return (EReference)pattern_ConflictResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffEnergizer() {
		return pattern_DiffEnergizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_Diff_kind_Left() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_Diff_kind_Right() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_Filter() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_IsMerged() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_ChangeStatus() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_New_id_Left() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_New_id_Right() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_IdChangeStatus() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_New_value_Left() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_New_value_Right() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_ValueChangeStatus() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_DurationsChangeStatus() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEnergizer_New_durations_Left() {
		return (EReference)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffEnergizer_New_durations_Right() {
		return (EReference)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFood() {
		return pattern_DiffFoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_Diff_kind_Left() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_Diff_kind_Right() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_Filter() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_IsMerged() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_ChangeStatus() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_New_id_Left() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_New_id_Right() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_IdChangeStatus() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_New_value_Left() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_New_value_Right() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_ValueChangeStatus() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffFruit() {
		return pattern_DiffFruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_Diff_kind_Left() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_Diff_kind_Right() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_Filter() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_IsMerged() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_ChangeStatus() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_id_Left() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_id_Right() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_IdChangeStatus() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_value_Left() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_value_Right() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_ValueChangeStatus() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_location_Left() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_New_location_Right() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_LocationChangeStatus() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGame() {
		return pattern_DiffGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_Filter() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_IsMerged() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_ChangeStatus() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_id_Left() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_id_Right() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_IdChangeStatus() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_lives_Left() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_lives_Right() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_LivesChangeStatus() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_score_Left() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_New_score_Right() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_ScoreChangeStatus() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGame_entities() {
		return pattern_DiffGame_entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_IsForbidden() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_ChangeStatus() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_Filter() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_IsMerged() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_Diff_Group() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGame_entities_EType() {
		return (EReference)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGame_gridnodes() {
		return pattern_DiffGame_gridnodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_IsForbidden() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_ChangeStatus() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_Filter() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_IsMerged() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_Diff_Group() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGame_gridnodes_EType() {
		return (EReference)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGhost() {
		return pattern_DiffGhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_Filter() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_IsMerged() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_ChangeStatus() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_New_id_Left() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_New_id_Right() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_IdChangeStatus() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_New_strategy_Left() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_New_strategy_Right() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_StrategyChangeStatus() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGridNode() {
		return pattern_DiffGridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_Filter() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_IsMerged() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_ChangeStatus() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_New_id_Left() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_New_id_Right() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_IdChangeStatus() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGridNode_down() {
		return pattern_DiffGridNode_downEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_ChangeStatus() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_Filter() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_IsMerged() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_Diff_Group() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGridNode_down_EType() {
		return (EReference)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGridNode_left() {
		return pattern_DiffGridNode_leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_ChangeStatus() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_Filter() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_IsMerged() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_Diff_Group() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGridNode_left_EType() {
		return (EReference)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGridNode_right() {
		return pattern_DiffGridNode_rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_ChangeStatus() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_Filter() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_IsMerged() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_Diff_Group() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGridNode_right_EType() {
		return (EReference)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffGridNode_up() {
		return pattern_DiffGridNode_upEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_Diff_kind_Left() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_Diff_kind_Right() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_ChangeStatus() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_Filter() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_IsMerged() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_Diff_Group() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffGridNode_up_EType() {
		return (EReference)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPacman() {
		return pattern_DiffPacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_Filter() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_IsMerged() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_ChangeStatus() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_New_id_Left() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_New_id_Right() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_IdChangeStatus() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_New_initialPosition_Left() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_New_initialPosition_Right() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_InitialPositionChangeStatus() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_DiffPositionableEntity_on() {
		return pattern_DiffPositionableEntity_onEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_ID_Pattern() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_IsForbidden() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_Diff_kind_Left() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_Diff_kind_Right() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_ChangeStatus() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_Filter() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_IsMerged() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_Diff_Group() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_DiffPositionableEntity_on_EType() {
		return (EReference)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Energizer() {
		return pattern_EnergizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Energizer_Durations() {
		return (EAttribute)pattern_EnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Food() {
		return pattern_FoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Food_Value() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Fruit() {
		return pattern_FruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Fruit_Location() {
		return (EAttribute)pattern_FruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Game() {
		return pattern_GameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_ID_Pattern() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_IsForbidden() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_Id() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_Lives() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_Score() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Game_Gridnodes() {
		return (EReference)pattern_GameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Game_Entities() {
		return (EReference)pattern_GameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Game_Diffgridnodes() {
		return (EReference)pattern_GameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Game_Diffentities() {
		return (EReference)pattern_GameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Ghost() {
		return pattern_GhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Ghost_Strategy() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_GridNode() {
		return pattern_GridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_GridNode_ID_Pattern() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_GridNode_IsForbidden() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_GridNode_Id() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Up() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Down() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Left() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Right() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Diffup() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Diffdown() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Diffleft() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_GridNode_Diffright() {
		return (EReference)pattern_GridNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_Pacman() {
		return pattern_PacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Pacman_InitialPosition() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_PositionableEntity() {
		return pattern_PositionableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PositionableEntity_ID_Pattern() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PositionableEntity_IsForbidden() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PositionableEntity_Id() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PositionableEntity_On() {
		return (EReference)pattern_PositionableEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_PositionableEntity_Diffon() {
		return (EReference)pattern_PositionableEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticConflict() {
		return pattern_SemanticConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Conflict_kind() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Conflict_Granularity() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticConflict_Semanticdiffs() {
		return (EReference)pattern_SemanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticDiff() {
		return pattern_SemanticDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_Author() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern_SemanticObject() {
		return pattern_SemanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_ID_Pattern() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_IsForbidden() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_Name() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffEnergizer() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffFood() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffFruit() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGame() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGame_entities() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGame_gridnodes() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGhost() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGridNode() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_down() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_left() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_right() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffGridNode_up() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPacman() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_DiffPositionableEntity_on() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_Game() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_GridNode() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_SemanticObject_SemanticObject_PositionableEntity() {
		return (EReference)pattern_SemanticObjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern__ListEInt() {
		return pattern__ListEIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern__ListEInt_ID_Pattern() {
		return (EAttribute)pattern__ListEIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern__ListEInt_IsForbidden() {
		return (EAttribute)pattern__ListEIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern__ListEInt_Value() {
		return (EAttribute)pattern__ListEIntEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Priority() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffEnergizer() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffFood() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffFruit() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGame() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGame_entities() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGame_gridnodes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGhost() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGridNode() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGridNode_down() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGridNode_left() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGridNode_right() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffGridNode_up() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPacman() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_DiffPositionableEntity_on() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_Game() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_GridNode() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Pattern_PositionableEntity() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(20);
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
	public PacmanCRRuleMMFactory getPacmanCRRuleMMFactory() {
		return (PacmanCRRuleMMFactory)getEFactoryInstance();
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
		pattern_ConflictResolutionEClass = createEClass(PATTERN_CONFLICT_RESOLUTION);
		createEAttribute(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__RESOLUTION_TYPE);
		createEAttribute(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__RESOLUTION_STRATEGY);
		createEReference(pattern_ConflictResolutionEClass, PATTERN_CONFLICT_RESOLUTION__SEMANTICCONFLICTS);

		pattern_DiffEnergizerEClass = createEClass(PATTERN_DIFF_ENERGIZER);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__FILTER);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__IS_MERGED);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__CHANGE_STATUS);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS);
		createEReference(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT);
		createEReference(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT);

		pattern_DiffFoodEClass = createEClass(PATTERN_DIFF_FOOD);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__FILTER);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__IS_MERGED);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__CHANGE_STATUS);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__NEW_ID_LEFT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__NEW_VALUE_LEFT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__NEW_VALUE_RIGHT);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__VALUE_CHANGE_STATUS);

		pattern_DiffFruitEClass = createEClass(PATTERN_DIFF_FRUIT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__FILTER);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__IS_MERGED);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__CHANGE_STATUS);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_ID_LEFT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS);

		pattern_DiffGameEClass = createEClass(PATTERN_DIFF_GAME);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__FILTER);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__IS_MERGED);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__CHANGE_STATUS);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_ID_LEFT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_LIVES_LEFT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_LIVES_RIGHT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_SCORE_LEFT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__NEW_SCORE_RIGHT);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS);

		pattern_DiffGame_entitiesEClass = createEClass(PATTERN_DIFF_GAME_ENTITIES);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__CHANGE_STATUS);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__FILTER);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__IS_MERGED);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__DIFF_GROUP);
		createEReference(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__ETYPE);

		pattern_DiffGame_gridnodesEClass = createEClass(PATTERN_DIFF_GAME_GRIDNODES);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__CHANGE_STATUS);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__FILTER);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__IS_MERGED);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__DIFF_GROUP);
		createEReference(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__ETYPE);

		pattern_DiffGhostEClass = createEClass(PATTERN_DIFF_GHOST);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__FILTER);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__IS_MERGED);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__CHANGE_STATUS);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__NEW_ID_LEFT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__NEW_STRATEGY_LEFT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__NEW_STRATEGY_RIGHT);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__STRATEGY_CHANGE_STATUS);

		pattern_DiffGridNodeEClass = createEClass(PATTERN_DIFF_GRID_NODE);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__FILTER);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__IS_MERGED);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__CHANGE_STATUS);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__NEW_ID_LEFT);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__ID_CHANGE_STATUS);

		pattern_DiffGridNode_downEClass = createEClass(PATTERN_DIFF_GRID_NODE_DOWN);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__CHANGE_STATUS);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__FILTER);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__IS_MERGED);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__DIFF_GROUP);
		createEReference(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__ETYPE);

		pattern_DiffGridNode_leftEClass = createEClass(PATTERN_DIFF_GRID_NODE_LEFT);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__CHANGE_STATUS);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__FILTER);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__IS_MERGED);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__DIFF_GROUP);
		createEReference(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__ETYPE);

		pattern_DiffGridNode_rightEClass = createEClass(PATTERN_DIFF_GRID_NODE_RIGHT);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__CHANGE_STATUS);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__FILTER);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__IS_MERGED);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__DIFF_GROUP);
		createEReference(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__ETYPE);

		pattern_DiffGridNode_upEClass = createEClass(PATTERN_DIFF_GRID_NODE_UP);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__CHANGE_STATUS);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__FILTER);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__IS_MERGED);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__DIFF_GROUP);
		createEReference(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__ETYPE);

		pattern_DiffPacmanEClass = createEClass(PATTERN_DIFF_PACMAN);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__FILTER);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__IS_MERGED);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__CHANGE_STATUS);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__NEW_ID_LEFT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__NEW_ID_RIGHT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS);

		pattern_DiffPositionableEntity_onEClass = createEClass(PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_LEFT);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND_RIGHT);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__CHANGE_STATUS);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_MERGED);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__DIFF_GROUP);
		createEReference(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ETYPE);

		pattern_EnergizerEClass = createEClass(PATTERN_ENERGIZER);
		createEAttribute(pattern_EnergizerEClass, PATTERN_ENERGIZER__DURATIONS);

		pattern_FoodEClass = createEClass(PATTERN_FOOD);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__VALUE);

		pattern_FruitEClass = createEClass(PATTERN_FRUIT);
		createEAttribute(pattern_FruitEClass, PATTERN_FRUIT__LOCATION);

		pattern_GameEClass = createEClass(PATTERN_GAME);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__ID_PATTERN);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__IS_FORBIDDEN);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__ID);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__LIVES);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__SCORE);
		createEReference(pattern_GameEClass, PATTERN_GAME__GRIDNODES);
		createEReference(pattern_GameEClass, PATTERN_GAME__ENTITIES);
		createEReference(pattern_GameEClass, PATTERN_GAME__DIFFGRIDNODES);
		createEReference(pattern_GameEClass, PATTERN_GAME__DIFFENTITIES);

		pattern_GhostEClass = createEClass(PATTERN_GHOST);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__STRATEGY);

		pattern_GridNodeEClass = createEClass(PATTERN_GRID_NODE);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__ID_PATTERN);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__IS_FORBIDDEN);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__ID);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__UP);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__DOWN);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__LEFT);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__RIGHT);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__DIFFUP);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__DIFFDOWN);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__DIFFLEFT);
		createEReference(pattern_GridNodeEClass, PATTERN_GRID_NODE__DIFFRIGHT);

		pattern_PacmanEClass = createEClass(PATTERN_PACMAN);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__INITIAL_POSITION);

		pattern_PositionableEntityEClass = createEClass(PATTERN_POSITIONABLE_ENTITY);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__ID_PATTERN);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__ID);
		createEReference(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__ON);
		createEReference(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__DIFFON);

		pattern_SemanticConflictEClass = createEClass(PATTERN_SEMANTIC_CONFLICT);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY);
		createEReference(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS);

		pattern_SemanticDiffEClass = createEClass(PATTERN_SEMANTIC_DIFF);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__AUTHOR);

		pattern_SemanticObjectEClass = createEClass(PATTERN_SEMANTIC_OBJECT);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__ID_PATTERN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__NAME);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ENERGIZER);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FOOD);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_FRUIT);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_ENTITIES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GAME_GRIDNODES);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GHOST);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_DOWN);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_LEFT);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_RIGHT);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_GRID_NODE_UP);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PACMAN);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_POSITIONABLE_ENTITY_ON);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GAME);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_GRID_NODE);
		createEReference(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_POSITIONABLE_ENTITY);

		pattern__ListEIntEClass = createEClass(PATTERN_LIST_EINT);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__ID_PATTERN);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__IS_FORBIDDEN);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__VALUE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEAttribute(ruleEClass, RULE__PRIORITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_ENERGIZER);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_FOOD);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_FRUIT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GAME);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GAME_ENTITIES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GAME_GRIDNODES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GHOST);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_DOWN);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_LEFT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_RIGHT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_GRID_NODE_UP);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_PACMAN);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_GAME);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_GRID_NODE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_PATTERN_POSITIONABLE_ENTITY);

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
		pattern_ConflictResolutionEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_DiffEnergizerEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_DiffFoodEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_DiffFruitEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_DiffGameEClass.getESuperTypes().add(this.getPattern_Game());
		pattern_DiffGhostEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_DiffGridNodeEClass.getESuperTypes().add(this.getPattern_GridNode());
		pattern_DiffPacmanEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_EnergizerEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_FoodEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_FruitEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_GhostEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_PacmanEClass.getESuperTypes().add(this.getPattern_PositionableEntity());
		pattern_SemanticConflictEClass.getESuperTypes().add(this.getPattern_SemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(this.getPattern_SemanticObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_ConflictResolutionEClass, Pattern_ConflictResolution.class, "Pattern_ConflictResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_ConflictResolution_ResolutionType(), this.getConflictResolutionType(), "ResolutionType", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ConflictResolution_ResolutionStrategy(), this.getConflictResolutionStrategy(), "ResolutionStrategy", null, 1, 1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_ConflictResolution_Semanticconflicts(), this.getPattern_SemanticConflict(), null, "semanticconflicts", null, 0, -1, Pattern_ConflictResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_DiffEnergizerEClass, Pattern_DiffEnergizer.class, "Pattern_DiffEnergizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEnergizer_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_DurationsChangeStatus(), this.getChangeStatus(), "durationsChangeStatus", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEnergizer_New_durations_Left(), this.getPattern__ListEInt(), null, "new_durations_Left", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffEnergizer_New_durations_Right(), this.getPattern__ListEInt(), null, "new_durations_Right", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFoodEClass, Pattern_DiffFood.class, "Pattern_DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFood_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFruitEClass, Pattern_DiffFruit.class, "Pattern_DiffFruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFruit_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_value_Left(), ecorePackage.getEInt(), "new_value_Left", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_value_Right(), ecorePackage.getEInt(), "new_value_Right", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_ValueChangeStatus(), this.getChangeStatus(), "valueChangeStatus", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_location_Left(), ecorePackage.getEString(), "new_location_Left", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_New_location_Right(), ecorePackage.getEString(), "new_location_Right", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_LocationChangeStatus(), this.getChangeStatus(), "locationChangeStatus", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGameEClass, Pattern_DiffGame.class, "Pattern_DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_lives_Left(), ecorePackage.getEInt(), "new_lives_Left", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_lives_Right(), ecorePackage.getEInt(), "new_lives_Right", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_LivesChangeStatus(), this.getChangeStatus(), "livesChangeStatus", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_score_Left(), ecorePackage.getEInt(), "new_score_Left", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_New_score_Right(), ecorePackage.getEInt(), "new_score_Right", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_ScoreChangeStatus(), this.getChangeStatus(), "scoreChangeStatus", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_entitiesEClass, Pattern_DiffGame_entities.class, "Pattern_DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_entities_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGame_entities_EType(), this.getPattern_PositionableEntity(), null, "eType", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_gridnodesEClass, Pattern_DiffGame_gridnodes.class, "Pattern_DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_gridnodes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGame_gridnodes_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGhostEClass, Pattern_DiffGhost.class, "Pattern_DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGhost_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_New_strategy_Left(), this.getGhostStrategy(), "new_strategy_Left", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_New_strategy_Right(), this.getGhostStrategy(), "new_strategy_Right", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_StrategyChangeStatus(), this.getChangeStatus(), "strategyChangeStatus", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNodeEClass, Pattern_DiffGridNode.class, "Pattern_DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_downEClass, Pattern_DiffGridNode_down.class, "Pattern_DiffGridNode_down", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_down_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGridNode_down_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_leftEClass, Pattern_DiffGridNode_left.class, "Pattern_DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_left_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGridNode_left_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_rightEClass, Pattern_DiffGridNode_right.class, "Pattern_DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_right_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGridNode_right_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_upEClass, Pattern_DiffGridNode_up.class, "Pattern_DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_up_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffGridNode_up_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPacmanEClass, Pattern_DiffPacman.class, "Pattern_DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPacman_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_New_id_Left(), ecorePackage.getEString(), "new_id_Left", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_New_id_Right(), ecorePackage.getEString(), "new_id_Right", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_IdChangeStatus(), this.getChangeStatus(), "idChangeStatus", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_New_initialPosition_Left(), ecorePackage.getEString(), "new_initialPosition_Left", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_New_initialPosition_Right(), ecorePackage.getEString(), "new_initialPosition_Right", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_InitialPositionChangeStatus(), this.getChangeStatus(), "initialPositionChangeStatus", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPositionableEntity_onEClass, Pattern_DiffPositionableEntity_on.class, "Pattern_DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPositionableEntity_on_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Diff_kind_Left(), this.getDiffKind(), "diff_kind_Left", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Diff_kind_Right(), this.getDiffKind(), "diff_kind_Right", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_ChangeStatus(), this.getChangeStatus(), "changeStatus", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_IsMerged(), ecorePackage.getEBoolean(), "isMerged", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Diff_Group(), ecorePackage.getEString(), "diff_Group", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_DiffPositionableEntity_on_EType(), this.getPattern_GridNode(), null, "eType", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EnergizerEClass, Pattern_Energizer.class, "Pattern_Energizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Energizer_Durations(), ecorePackage.getEInt(), "durations", null, 0, -1, Pattern_Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FoodEClass, Pattern_Food.class, "Pattern_Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Food_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FruitEClass, Pattern_Fruit.class, "Pattern_Fruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Fruit_Location(), ecorePackage.getEString(), "location", null, 0, 1, Pattern_Fruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GameEClass, Pattern_Game.class, "Pattern_Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Game_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_Id(), ecorePackage.getEString(), "id", null, 0, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_Lives(), ecorePackage.getEInt(), "lives", null, 0, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_Score(), ecorePackage.getEInt(), "score", null, 0, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Game_Gridnodes(), this.getPattern_GridNode(), null, "gridnodes", null, 0, -1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Game_Entities(), this.getPattern_PositionableEntity(), null, "entities", null, 0, -1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Game_Diffgridnodes(), this.getPattern_DiffGame_gridnodes(), null, "diffgridnodes", null, 0, -1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Game_Diffentities(), this.getPattern_DiffGame_entities(), null, "diffentities", null, 0, -1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GhostEClass, Pattern_Ghost.class, "Pattern_Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Ghost_Strategy(), this.getGhostStrategy(), "strategy", null, 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GridNodeEClass, Pattern_GridNode.class, "Pattern_GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_GridNode_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_GridNode_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_GridNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Up(), this.getPattern_GridNode(), null, "up", null, 0, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Down(), this.getPattern_GridNode(), null, "down", null, 0, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Left(), this.getPattern_GridNode(), null, "left", null, 0, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Right(), this.getPattern_GridNode(), null, "right", null, 0, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Diffup(), this.getPattern_DiffGridNode_up(), null, "diffup", null, 0, -1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Diffdown(), this.getPattern_DiffGridNode_down(), null, "diffdown", null, 0, -1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Diffleft(), this.getPattern_DiffGridNode_left(), null, "diffleft", null, 0, -1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_GridNode_Diffright(), this.getPattern_DiffGridNode_right(), null, "diffright", null, 0, -1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PacmanEClass, Pattern_Pacman.class, "Pattern_Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Pacman_InitialPosition(), ecorePackage.getEString(), "initialPosition", null, 0, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PositionableEntityEClass, Pattern_PositionableEntity.class, "Pattern_PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_PositionableEntity_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PositionableEntity_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PositionableEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_PositionableEntity_On(), this.getPattern_GridNode(), null, "on", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_PositionableEntity_Diffon(), this.getPattern_DiffPositionableEntity_on(), null, "diffon", null, 0, -1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticConflictEClass, Pattern_SemanticConflict.class, "Pattern_SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticConflict_Conflict_kind(), this.getChangeStatus(), "conflict_kind", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_Conflict_Granularity(), this.getConflictGranularity(), "conflict_Granularity", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_SemanticConflict_Semanticdiffs(), this.getPattern_SemanticDiff(), null, "semanticdiffs", null, 0, -1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern_SemanticDiffEClass, Pattern_SemanticDiff.class, "Pattern_SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticDiff_Author(), this.getAUTHOR(), "author", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticObjectEClass, Pattern_SemanticObject.class, "Pattern_SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffEnergizer(), this.getPattern_DiffEnergizer(), null, "SemanticObject_DiffEnergizer", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffFood(), this.getPattern_DiffFood(), null, "SemanticObject_DiffFood", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffFruit(), this.getPattern_DiffFruit(), null, "SemanticObject_DiffFruit", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGame(), this.getPattern_DiffGame(), null, "SemanticObject_DiffGame", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGame_entities(), this.getPattern_DiffGame_entities(), null, "SemanticObject_DiffGame_entities", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGame_gridnodes(), this.getPattern_DiffGame_gridnodes(), null, "SemanticObject_DiffGame_gridnodes", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGhost(), this.getPattern_DiffGhost(), null, "SemanticObject_DiffGhost", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGridNode(), this.getPattern_DiffGridNode(), null, "SemanticObject_DiffGridNode", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGridNode_down(), this.getPattern_DiffGridNode_down(), null, "SemanticObject_DiffGridNode_down", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGridNode_left(), this.getPattern_DiffGridNode_left(), null, "SemanticObject_DiffGridNode_left", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGridNode_right(), this.getPattern_DiffGridNode_right(), null, "SemanticObject_DiffGridNode_right", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffGridNode_up(), this.getPattern_DiffGridNode_up(), null, "SemanticObject_DiffGridNode_up", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPacman(), this.getPattern_DiffPacman(), null, "SemanticObject_DiffPacman", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_DiffPositionableEntity_on(), this.getPattern_DiffPositionableEntity_on(), null, "SemanticObject_DiffPositionableEntity_on", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_Game(), this.getPattern_Game(), null, "SemanticObject_Game", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_GridNode(), this.getPattern_GridNode(), null, "SemanticObject_GridNode", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_SemanticObject_SemanticObject_PositionableEntity(), this.getPattern_PositionableEntity(), null, "SemanticObject_PositionableEntity", null, 0, -1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pattern__ListEIntEClass, Pattern__ListEInt.class, "Pattern__ListEInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern__ListEInt_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern__ListEInt_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern__ListEInt_Value(), ecorePackage.getEInt(), "value", null, 0, -1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_SemanticObject(), this.getPattern_SemanticObject(), null, "rulePattern_Pattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffEnergizer(), this.getPattern_DiffEnergizer(), null, "rulePattern_Pattern_DiffEnergizer", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffFood(), this.getPattern_DiffFood(), null, "rulePattern_Pattern_DiffFood", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffFruit(), this.getPattern_DiffFruit(), null, "rulePattern_Pattern_DiffFruit", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGame(), this.getPattern_DiffGame(), null, "rulePattern_Pattern_DiffGame", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGame_entities(), this.getPattern_DiffGame_entities(), null, "rulePattern_Pattern_DiffGame_entities", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGame_gridnodes(), this.getPattern_DiffGame_gridnodes(), null, "rulePattern_Pattern_DiffGame_gridnodes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGhost(), this.getPattern_DiffGhost(), null, "rulePattern_Pattern_DiffGhost", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGridNode(), this.getPattern_DiffGridNode(), null, "rulePattern_Pattern_DiffGridNode", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGridNode_down(), this.getPattern_DiffGridNode_down(), null, "rulePattern_Pattern_DiffGridNode_down", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGridNode_left(), this.getPattern_DiffGridNode_left(), null, "rulePattern_Pattern_DiffGridNode_left", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGridNode_right(), this.getPattern_DiffGridNode_right(), null, "rulePattern_Pattern_DiffGridNode_right", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffGridNode_up(), this.getPattern_DiffGridNode_up(), null, "rulePattern_Pattern_DiffGridNode_up", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPacman(), this.getPattern_DiffPacman(), null, "rulePattern_Pattern_DiffPacman", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_DiffPositionableEntity_on(), this.getPattern_DiffPositionableEntity_on(), null, "rulePattern_Pattern_DiffPositionableEntity_on", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_Game(), this.getPattern_Game(), null, "rulePattern_Pattern_Game", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_GridNode(), this.getPattern_GridNode(), null, "rulePattern_Pattern_GridNode", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Pattern_PositionableEntity(), this.getPattern_PositionableEntity(), null, "rulePattern_Pattern_PositionableEntity", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorEEnum, pacmanCRRuleMM.AUTHOR.class, "AUTHOR");
		addEEnumLiteral(authorEEnum, pacmanCRRuleMM.AUTHOR.NON);
		addEEnumLiteral(authorEEnum, pacmanCRRuleMM.AUTHOR.LEFT);
		addEEnumLiteral(authorEEnum, pacmanCRRuleMM.AUTHOR.RIGHT);
		addEEnumLiteral(authorEEnum, pacmanCRRuleMM.AUTHOR.EQUAL);
		addEEnumLiteral(authorEEnum, pacmanCRRuleMM.AUTHOR.MIXED);

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

} //PacmanCRRuleMMPackageImpl
