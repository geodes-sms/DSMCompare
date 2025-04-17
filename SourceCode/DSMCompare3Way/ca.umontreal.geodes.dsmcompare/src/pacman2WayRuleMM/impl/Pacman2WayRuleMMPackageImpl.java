/**
 */
package pacman2WayRuleMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pacman2WayDiffMM.Pacman2WayDiffMMPackage;

import pacman2WayDiffMM.impl.Pacman2WayDiffMMPackageImpl;

import pacman2WayRuleMM.Pacman2WayRuleMMFactory;
import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacman2WayRuleMM.Pattern_DiffEnergizer;
import pacman2WayRuleMM.Pattern_DiffFood;
import pacman2WayRuleMM.Pattern_DiffFruit;
import pacman2WayRuleMM.Pattern_DiffGame;
import pacman2WayRuleMM.Pattern_DiffGame_entities;
import pacman2WayRuleMM.Pattern_DiffGame_gridnodes;
import pacman2WayRuleMM.Pattern_DiffGhost;
import pacman2WayRuleMM.Pattern_DiffGridNode;
import pacman2WayRuleMM.Pattern_DiffGridNode_down;
import pacman2WayRuleMM.Pattern_DiffGridNode_left;
import pacman2WayRuleMM.Pattern_DiffGridNode_right;
import pacman2WayRuleMM.Pattern_DiffGridNode_up;
import pacman2WayRuleMM.Pattern_DiffPacman;
import pacman2WayRuleMM.Pattern_DiffPositionableEntity_on;
import pacman2WayRuleMM.Pattern_Energizer;
import pacman2WayRuleMM.Pattern_Food;
import pacman2WayRuleMM.Pattern_Fruit;
import pacman2WayRuleMM.Pattern_Game;
import pacman2WayRuleMM.Pattern_Ghost;
import pacman2WayRuleMM.Pattern_GridNode;
import pacman2WayRuleMM.Pattern_Pacman;
import pacman2WayRuleMM.Pattern_PositionableEntity;
import pacman2WayRuleMM.Pattern_SemanticConflict;
import pacman2WayRuleMM.Pattern_SemanticDiff;
import pacman2WayRuleMM.Pattern_SemanticObject;
import pacman2WayRuleMM.Pattern__ListEInt;
import pacman2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pacman2WayRuleMMPackageImpl extends EPackageImpl implements Pacman2WayRuleMMPackage {
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
	private EClass pattern_FoodEClass = null;

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
	private EClass pattern_GhostEClass = null;

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
	private EClass pattern_PositionableEntityEClass = null;

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
	private EClass pattern_EnergizerEClass = null;

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
	private EClass pattern_SemanticDiffEClass = null;

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
	private EClass pattern_DiffGridNodeEClass = null;

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
	private EClass pattern_DiffFoodEClass = null;

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
	private EClass pattern_DiffGhostEClass = null;

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
	private EClass pattern_DiffGame_gridnodesEClass = null;

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
	private EClass pattern_DiffPositionableEntity_onEClass = null;

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
	private EClass pattern_DiffEnergizerEClass = null;

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
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pacman2WayRuleMMPackageImpl() {
		super(eNS_URI, Pacman2WayRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Pacman2WayRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pacman2WayRuleMMPackage init() {
		if (isInited) return (Pacman2WayRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(Pacman2WayRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacman2WayRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Pacman2WayRuleMMPackageImpl thePacman2WayRuleMMPackage = registeredPacman2WayRuleMMPackage instanceof Pacman2WayRuleMMPackageImpl ? (Pacman2WayRuleMMPackageImpl)registeredPacman2WayRuleMMPackage : new Pacman2WayRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Pacman2WayDiffMMPackage.eNS_URI);
		Pacman2WayDiffMMPackageImpl thePacman2WayDiffMMPackage = (Pacman2WayDiffMMPackageImpl)(registeredPackage instanceof Pacman2WayDiffMMPackageImpl ? registeredPackage : Pacman2WayDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		thePacman2WayRuleMMPackage.createPackageContents();
		thePacman2WayDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacman2WayRuleMMPackage.initializePackageContents();
		thePacman2WayDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacman2WayRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pacman2WayRuleMMPackage.eNS_URI, thePacman2WayRuleMMPackage);
		return thePacman2WayRuleMMPackage;
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
	public EAttribute getPattern_GridNode_Filter() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_GridNode_IsForbidden() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Food_ID_Pattern() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Food_Filter() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Food_IsForbidden() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Pacman_ID_Pattern() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Pacman_Filter() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Pacman_IsForbidden() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Ghost_ID_Pattern() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Ghost_Filter() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Ghost_IsForbidden() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Game_Filter() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Game_IsForbidden() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_PositionableEntity_Filter() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PositionableEntity_IsForbidden() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Fruit_ID_Pattern() {
		return (EAttribute)pattern_FruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Fruit_Filter() {
		return (EAttribute)pattern_FruitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Fruit_IsForbidden() {
		return (EAttribute)pattern_FruitEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_Energizer_ID_Pattern() {
		return (EAttribute)pattern_EnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Energizer_Filter() {
		return (EAttribute)pattern_EnergizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Energizer_IsForbidden() {
		return (EAttribute)pattern_EnergizerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticObject_Filter() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticObject_IsForbidden() {
		return (EAttribute)pattern_SemanticObjectEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticDiff_ID_Pattern() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_Filter() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticDiff_IsForbidden() {
		return (EAttribute)pattern_SemanticDiffEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_SemanticConflict_ID_Pattern() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_Filter() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_SemanticConflict_IsForbidden() {
		return (EAttribute)pattern_SemanticConflictEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGridNode_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_Filter() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_IsForbidden() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGridNode_up_Filter() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_up_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGridNode_down_Filter() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_down_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_downEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGridNode_left_Filter() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_left_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGridNode_right_Filter() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGridNode_right_IsForbidden() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffFood_ID_Pattern() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_Filter() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFood_IsForbidden() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPacman_ID_Pattern() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_Filter() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPacman_IsForbidden() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGhost_ID_Pattern() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_Filter() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGhost_IsForbidden() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGame_ID_Pattern() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_Filter() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_IsForbidden() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGame_gridnodes_Filter() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_gridnodes_IsForbidden() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffGame_entities_Filter() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffGame_entities_IsForbidden() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffPositionableEntity_on_Filter() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffPositionableEntity_on_IsForbidden() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffFruit_ID_Pattern() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_Filter() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffFruit_IsForbidden() {
		return (EAttribute)pattern_DiffFruitEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern_DiffEnergizer_ID_Pattern() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_Filter() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_DiffEnergizer_IsForbidden() {
		return (EAttribute)pattern_DiffEnergizerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPattern__ListEInt_Filter() {
		return (EAttribute)pattern__ListEIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern__ListEInt_IsForbidden() {
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
	public EReference getRule_RulePattern_DiffEnergizer() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffFood() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffFruit() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGame() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGame_entities() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGame_gridnodes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGhost() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGridNode() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGridNode_down() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGridNode_left() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGridNode_right() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffGridNode_up() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPacman() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_DiffPositionableEntity_on() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_Game() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_GridNode() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_PositionableEntity() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern_SemanticObject() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern__ListEInt() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayRuleMMFactory getPacman2WayRuleMMFactory() {
		return (Pacman2WayRuleMMFactory)getEFactoryInstance();
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
		pattern_GridNodeEClass = createEClass(PATTERN_GRID_NODE);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__ID_PATTERN);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__FILTER);
		createEAttribute(pattern_GridNodeEClass, PATTERN_GRID_NODE__IS_FORBIDDEN);

		pattern_FoodEClass = createEClass(PATTERN_FOOD);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__ID_PATTERN);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__FILTER);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__IS_FORBIDDEN);

		pattern_PacmanEClass = createEClass(PATTERN_PACMAN);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__ID_PATTERN);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__FILTER);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__IS_FORBIDDEN);

		pattern_GhostEClass = createEClass(PATTERN_GHOST);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__ID_PATTERN);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__FILTER);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__IS_FORBIDDEN);

		pattern_GameEClass = createEClass(PATTERN_GAME);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__ID_PATTERN);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__FILTER);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__IS_FORBIDDEN);

		pattern_PositionableEntityEClass = createEClass(PATTERN_POSITIONABLE_ENTITY);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__ID_PATTERN);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__FILTER);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN);

		pattern_FruitEClass = createEClass(PATTERN_FRUIT);
		createEAttribute(pattern_FruitEClass, PATTERN_FRUIT__ID_PATTERN);
		createEAttribute(pattern_FruitEClass, PATTERN_FRUIT__FILTER);
		createEAttribute(pattern_FruitEClass, PATTERN_FRUIT__IS_FORBIDDEN);

		pattern_EnergizerEClass = createEClass(PATTERN_ENERGIZER);
		createEAttribute(pattern_EnergizerEClass, PATTERN_ENERGIZER__ID_PATTERN);
		createEAttribute(pattern_EnergizerEClass, PATTERN_ENERGIZER__FILTER);
		createEAttribute(pattern_EnergizerEClass, PATTERN_ENERGIZER__IS_FORBIDDEN);

		pattern_SemanticObjectEClass = createEClass(PATTERN_SEMANTIC_OBJECT);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__ID_PATTERN);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__FILTER);
		createEAttribute(pattern_SemanticObjectEClass, PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN);

		pattern_SemanticDiffEClass = createEClass(PATTERN_SEMANTIC_DIFF);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__FILTER);
		createEAttribute(pattern_SemanticDiffEClass, PATTERN_SEMANTIC_DIFF__IS_FORBIDDEN);

		pattern_SemanticConflictEClass = createEClass(PATTERN_SEMANTIC_CONFLICT);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__ID_PATTERN);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__FILTER);
		createEAttribute(pattern_SemanticConflictEClass, PATTERN_SEMANTIC_CONFLICT__IS_FORBIDDEN);

		pattern_DiffGridNodeEClass = createEClass(PATTERN_DIFF_GRID_NODE);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__ID_PATTERN);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__FILTER);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__IS_FORBIDDEN);

		pattern_DiffGridNode_upEClass = createEClass(PATTERN_DIFF_GRID_NODE_UP);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__FILTER);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN);

		pattern_DiffGridNode_downEClass = createEClass(PATTERN_DIFF_GRID_NODE_DOWN);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__FILTER);
		createEAttribute(pattern_DiffGridNode_downEClass, PATTERN_DIFF_GRID_NODE_DOWN__IS_FORBIDDEN);

		pattern_DiffGridNode_leftEClass = createEClass(PATTERN_DIFF_GRID_NODE_LEFT);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__FILTER);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__IS_FORBIDDEN);

		pattern_DiffGridNode_rightEClass = createEClass(PATTERN_DIFF_GRID_NODE_RIGHT);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__FILTER);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__IS_FORBIDDEN);

		pattern_DiffFoodEClass = createEClass(PATTERN_DIFF_FOOD);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__ID_PATTERN);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__FILTER);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__IS_FORBIDDEN);

		pattern_DiffPacmanEClass = createEClass(PATTERN_DIFF_PACMAN);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__ID_PATTERN);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__FILTER);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__IS_FORBIDDEN);

		pattern_DiffGhostEClass = createEClass(PATTERN_DIFF_GHOST);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__ID_PATTERN);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__FILTER);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__IS_FORBIDDEN);

		pattern_DiffGameEClass = createEClass(PATTERN_DIFF_GAME);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__ID_PATTERN);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__FILTER);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__IS_FORBIDDEN);

		pattern_DiffGame_gridnodesEClass = createEClass(PATTERN_DIFF_GAME_GRIDNODES);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__FILTER);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__IS_FORBIDDEN);

		pattern_DiffGame_entitiesEClass = createEClass(PATTERN_DIFF_GAME_ENTITIES);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__FILTER);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__IS_FORBIDDEN);

		pattern_DiffPositionableEntity_onEClass = createEClass(PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__IS_FORBIDDEN);

		pattern_DiffFruitEClass = createEClass(PATTERN_DIFF_FRUIT);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__ID_PATTERN);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__FILTER);
		createEAttribute(pattern_DiffFruitEClass, PATTERN_DIFF_FRUIT__IS_FORBIDDEN);

		pattern_DiffEnergizerEClass = createEClass(PATTERN_DIFF_ENERGIZER);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__ID_PATTERN);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__FILTER);
		createEAttribute(pattern_DiffEnergizerEClass, PATTERN_DIFF_ENERGIZER__IS_FORBIDDEN);

		pattern__ListEIntEClass = createEClass(PATTERN_LIST_EINT);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__ID_PATTERN);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__FILTER);
		createEAttribute(pattern__ListEIntEClass, PATTERN_LIST_EINT__IS_FORBIDDEN);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEAttribute(ruleEClass, RULE__PRIORITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_ENERGIZER);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_FOOD);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_FRUIT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GAME);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GAME_ENTITIES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GAME_GRIDNODES);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GHOST);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GRID_NODE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GRID_NODE_DOWN);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GRID_NODE_LEFT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GRID_NODE_RIGHT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_GRID_NODE_UP);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_PACMAN);
		createEReference(ruleEClass, RULE__RULE_PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		createEReference(ruleEClass, RULE__RULE_PATTERN_GAME);
		createEReference(ruleEClass, RULE__RULE_PATTERN_GRID_NODE);
		createEReference(ruleEClass, RULE__RULE_PATTERN_POSITIONABLE_ENTITY);
		createEReference(ruleEClass, RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		createEReference(ruleEClass, RULE__RULE_PATTERN_LIST_EINT);
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

		// Obtain other dependent packages
		Pacman2WayDiffMMPackage thePacman2WayDiffMMPackage = (Pacman2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Pacman2WayDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_GridNodeEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getGridNode());
		pattern_FoodEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getFood());
		pattern_PacmanEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getPacman());
		pattern_GhostEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getGhost());
		pattern_GameEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getGame());
		pattern_PositionableEntityEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getPositionableEntity());
		pattern_FruitEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getFruit());
		pattern_EnergizerEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getEnergizer());
		pattern_SemanticObjectEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getSemanticObject());
		pattern_SemanticDiffEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getSemanticDiff());
		pattern_SemanticConflictEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getSemanticConflict());
		pattern_DiffGridNodeEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGridNode());
		pattern_DiffGridNode_upEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGridNode_up());
		pattern_DiffGridNode_downEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGridNode_down());
		pattern_DiffGridNode_leftEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGridNode_left());
		pattern_DiffGridNode_rightEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGridNode_right());
		pattern_DiffFoodEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffFood());
		pattern_DiffPacmanEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffPacman());
		pattern_DiffGhostEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGhost());
		pattern_DiffGameEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGame());
		pattern_DiffGame_gridnodesEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGame_gridnodes());
		pattern_DiffGame_entitiesEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffGame_entities());
		pattern_DiffPositionableEntity_onEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffPositionableEntity_on());
		pattern_DiffFruitEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffFruit());
		pattern_DiffEnergizerEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.getDiffEnergizer());
		pattern__ListEIntEClass.getESuperTypes().add(thePacman2WayDiffMMPackage.get_ListEInt());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_GridNodeEClass, Pattern_GridNode.class, "Pattern_GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_GridNode_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_GridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_GridNode_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FoodEClass, Pattern_Food.class, "Pattern_Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Food_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Food_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Food_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PacmanEClass, Pattern_Pacman.class, "Pattern_Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Pacman_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Pacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Pacman_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GhostEClass, Pattern_Ghost.class, "Pattern_Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Ghost_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Ghost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Ghost_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GameEClass, Pattern_Game.class, "Pattern_Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Game_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PositionableEntityEClass, Pattern_PositionableEntity.class, "Pattern_PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_PositionableEntity_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PositionableEntity_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PositionableEntity_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FruitEClass, Pattern_Fruit.class, "Pattern_Fruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Fruit_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Fruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Fruit_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Fruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Fruit_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Fruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_EnergizerEClass, Pattern_Energizer.class, "Pattern_Energizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Energizer_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Energizer_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Energizer_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticObjectEClass, Pattern_SemanticObject.class, "Pattern_SemanticObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticObject_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticObject_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticDiffEClass, Pattern_SemanticDiff.class, "Pattern_SemanticDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticDiff_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_SemanticConflictEClass, Pattern_SemanticConflict.class, "Pattern_SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_SemanticConflict_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_SemanticConflict_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNodeEClass, Pattern_DiffGridNode.class, "Pattern_DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_upEClass, Pattern_DiffGridNode_up.class, "Pattern_DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_up_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_downEClass, Pattern_DiffGridNode_down.class, "Pattern_DiffGridNode_down", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_down_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_down_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_leftEClass, Pattern_DiffGridNode_left.class, "Pattern_DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_left_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_rightEClass, Pattern_DiffGridNode_right.class, "Pattern_DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_right_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFoodEClass, Pattern_DiffFood.class, "Pattern_DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFood_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPacmanEClass, Pattern_DiffPacman.class, "Pattern_DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPacman_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGhostEClass, Pattern_DiffGhost.class, "Pattern_DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGhost_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGameEClass, Pattern_DiffGame.class, "Pattern_DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_gridnodesEClass, Pattern_DiffGame_gridnodes.class, "Pattern_DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_gridnodes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_entitiesEClass, Pattern_DiffGame_entities.class, "Pattern_DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_entities_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPositionableEntity_onEClass, Pattern_DiffPositionableEntity_on.class, "Pattern_DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPositionableEntity_on_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFruitEClass, Pattern_DiffFruit.class, "Pattern_DiffFruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFruit_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFruit_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffEnergizerEClass, Pattern_DiffEnergizer.class, "Pattern_DiffEnergizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffEnergizer_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffEnergizer_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern_DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern__ListEIntEClass, Pattern__ListEInt.class, "Pattern__ListEInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern__ListEInt_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern__ListEInt_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern__ListEInt_IsForbidden(), ecorePackage.getEBoolean(), "isForbidden", "false", 1, 1, Pattern__ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulePattern_DiffEnergizer(), thePacman2WayDiffMMPackage.getDiffEnergizer(), null, "rulePattern_DiffEnergizer", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffFood(), thePacman2WayDiffMMPackage.getDiffFood(), null, "rulePattern_DiffFood", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffFruit(), thePacman2WayDiffMMPackage.getDiffFruit(), null, "rulePattern_DiffFruit", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGame(), thePacman2WayDiffMMPackage.getDiffGame(), null, "rulePattern_DiffGame", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGame_entities(), thePacman2WayDiffMMPackage.getDiffGame_entities(), null, "rulePattern_DiffGame_entities", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGame_gridnodes(), thePacman2WayDiffMMPackage.getDiffGame_gridnodes(), null, "rulePattern_DiffGame_gridnodes", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGhost(), thePacman2WayDiffMMPackage.getDiffGhost(), null, "rulePattern_DiffGhost", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGridNode(), thePacman2WayDiffMMPackage.getDiffGridNode(), null, "rulePattern_DiffGridNode", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGridNode_down(), thePacman2WayDiffMMPackage.getDiffGridNode_down(), null, "rulePattern_DiffGridNode_down", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGridNode_left(), thePacman2WayDiffMMPackage.getDiffGridNode_left(), null, "rulePattern_DiffGridNode_left", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGridNode_right(), thePacman2WayDiffMMPackage.getDiffGridNode_right(), null, "rulePattern_DiffGridNode_right", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffGridNode_up(), thePacman2WayDiffMMPackage.getDiffGridNode_up(), null, "rulePattern_DiffGridNode_up", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPacman(), thePacman2WayDiffMMPackage.getDiffPacman(), null, "rulePattern_DiffPacman", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_DiffPositionableEntity_on(), thePacman2WayDiffMMPackage.getDiffPositionableEntity_on(), null, "rulePattern_DiffPositionableEntity_on", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_Game(), thePacman2WayDiffMMPackage.getGame(), null, "rulePattern_Game", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_GridNode(), thePacman2WayDiffMMPackage.getGridNode(), null, "rulePattern_GridNode", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_PositionableEntity(), thePacman2WayDiffMMPackage.getPositionableEntity(), null, "rulePattern_PositionableEntity", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern_SemanticObject(), thePacman2WayDiffMMPackage.getSemanticObject(), null, "rulePattern_SemanticObject", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_RulePattern__ListEInt(), thePacman2WayDiffMMPackage.get_ListEInt(), null, "rulePattern__ListEInt", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Pacman2WayRuleMMPackageImpl
