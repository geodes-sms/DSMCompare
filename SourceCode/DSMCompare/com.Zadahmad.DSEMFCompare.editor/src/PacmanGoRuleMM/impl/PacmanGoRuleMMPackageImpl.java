/**
 */
package PacmanGoRuleMM.impl;

import PacmanGoDiffMM.PacmanGoDiffMMPackage;

import PacmanGoDiffMM.impl.PacmanGoDiffMMPackageImpl;

import PacmanGoRuleMM.PacmanGoRuleMMFactory;
import PacmanGoRuleMM.PacmanGoRuleMMPackage;
import PacmanGoRuleMM.Pattern_DiffFood;
import PacmanGoRuleMM.Pattern_DiffGame;
import PacmanGoRuleMM.Pattern_DiffGame_domainspecificdiffs;
import PacmanGoRuleMM.Pattern_DiffGame_entities;
import PacmanGoRuleMM.Pattern_DiffGame_gridnodes;
import PacmanGoRuleMM.Pattern_DiffGame_scoreboard;
import PacmanGoRuleMM.Pattern_DiffGhost;
import PacmanGoRuleMM.Pattern_DiffGridNode;
import PacmanGoRuleMM.Pattern_DiffGridNode_bottom;
import PacmanGoRuleMM.Pattern_DiffGridNode_left;
import PacmanGoRuleMM.Pattern_DiffGridNode_right;
import PacmanGoRuleMM.Pattern_DiffGridNode_up;
import PacmanGoRuleMM.Pattern_DiffPacman;
import PacmanGoRuleMM.Pattern_DiffPositionableEntity_on;
import PacmanGoRuleMM.Pattern_DiffScoreboard;
import PacmanGoRuleMM.Pattern_DomainSpecificDiff;
import PacmanGoRuleMM.Pattern_Food;
import PacmanGoRuleMM.Pattern_Game;
import PacmanGoRuleMM.Pattern_Ghost;
import PacmanGoRuleMM.Pattern_GridNode;
import PacmanGoRuleMM.Pattern_Pacman;
import PacmanGoRuleMM.Pattern_PositionableEntity;
import PacmanGoRuleMM.Pattern_Scoreboard;
import PacmanGoRuleMM.Rule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanGoRuleMMPackageImpl extends EPackageImpl implements PacmanGoRuleMMPackage {
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
	private EClass pattern_ScoreboardEClass = null;

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
	private EClass pattern_DomainSpecificDiffEClass = null;

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
	private EClass pattern_DiffGridNode_bottomEClass = null;

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
	private EClass pattern_DiffScoreboardEClass = null;

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
	private EClass pattern_DiffGame_scoreboardEClass = null;

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
	private EClass pattern_DiffGame_domainspecificdiffsEClass = null;

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
	 * @see PacmanGoRuleMM.PacmanGoRuleMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanGoRuleMMPackageImpl() {
		super(eNS_URI, PacmanGoRuleMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PacmanGoRuleMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanGoRuleMMPackage init() {
		if (isInited) return (PacmanGoRuleMMPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanGoRuleMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacmanGoRuleMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PacmanGoRuleMMPackageImpl thePacmanGoRuleMMPackage = registeredPacmanGoRuleMMPackage instanceof PacmanGoRuleMMPackageImpl ? (PacmanGoRuleMMPackageImpl)registeredPacmanGoRuleMMPackage : new PacmanGoRuleMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PacmanGoDiffMMPackage.eNS_URI);
		PacmanGoDiffMMPackageImpl thePacmanGoDiffMMPackage = (PacmanGoDiffMMPackageImpl)(registeredPackage instanceof PacmanGoDiffMMPackageImpl ? registeredPackage : PacmanGoDiffMMPackage.eINSTANCE);

		// Create package meta-data objects
		thePacmanGoRuleMMPackage.createPackageContents();
		thePacmanGoDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanGoRuleMMPackage.initializePackageContents();
		thePacmanGoDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanGoRuleMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanGoRuleMMPackage.eNS_URI, thePacmanGoRuleMMPackage);
		return thePacmanGoRuleMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_GridNode() {
		return pattern_GridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_GridNode_ID_Pattern() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_GridNode_Filter() {
		return (EAttribute)pattern_GridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_Food() {
		return pattern_FoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Food_ID_Pattern() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Food_Filter() {
		return (EAttribute)pattern_FoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_Pacman() {
		return pattern_PacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Pacman_ID_Pattern() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Pacman_Filter() {
		return (EAttribute)pattern_PacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_Ghost() {
		return pattern_GhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Ghost_ID_Pattern() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Ghost_Filter() {
		return (EAttribute)pattern_GhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_Scoreboard() {
		return pattern_ScoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Scoreboard_ID_Pattern() {
		return (EAttribute)pattern_ScoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Scoreboard_Filter() {
		return (EAttribute)pattern_ScoreboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_Game() {
		return pattern_GameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Game_ID_Pattern() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Game_Filter() {
		return (EAttribute)pattern_GameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_PositionableEntity() {
		return pattern_PositionableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_PositionableEntity_ID_Pattern() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_PositionableEntity_Filter() {
		return (EAttribute)pattern_PositionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DomainSpecificDiff() {
		return pattern_DomainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_ID_Pattern() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DomainSpecificDiff_Filter() {
		return (EAttribute)pattern_DomainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGridNode() {
		return pattern_DiffGridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_Filter() {
		return (EAttribute)pattern_DiffGridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGridNode_up() {
		return pattern_DiffGridNode_upEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_up_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_up_Filter() {
		return (EAttribute)pattern_DiffGridNode_upEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGridNode_bottom() {
		return pattern_DiffGridNode_bottomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_bottom_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_bottomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_bottom_Filter() {
		return (EAttribute)pattern_DiffGridNode_bottomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGridNode_left() {
		return pattern_DiffGridNode_leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_left_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_left_Filter() {
		return (EAttribute)pattern_DiffGridNode_leftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGridNode_right() {
		return pattern_DiffGridNode_rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_right_ID_Pattern() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGridNode_right_Filter() {
		return (EAttribute)pattern_DiffGridNode_rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffFood() {
		return pattern_DiffFoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffFood_ID_Pattern() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffFood_Filter() {
		return (EAttribute)pattern_DiffFoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffPacman() {
		return pattern_DiffPacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffPacman_ID_Pattern() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffPacman_Filter() {
		return (EAttribute)pattern_DiffPacmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGhost() {
		return pattern_DiffGhostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGhost_ID_Pattern() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGhost_Filter() {
		return (EAttribute)pattern_DiffGhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffScoreboard() {
		return pattern_DiffScoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffScoreboard_ID_Pattern() {
		return (EAttribute)pattern_DiffScoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffScoreboard_Filter() {
		return (EAttribute)pattern_DiffScoreboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGame() {
		return pattern_DiffGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_ID_Pattern() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_Filter() {
		return (EAttribute)pattern_DiffGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGame_gridnodes() {
		return pattern_DiffGame_gridnodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_gridnodes_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_gridnodes_Filter() {
		return (EAttribute)pattern_DiffGame_gridnodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGame_scoreboard() {
		return pattern_DiffGame_scoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_scoreboard_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_scoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_scoreboard_Filter() {
		return (EAttribute)pattern_DiffGame_scoreboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGame_entities() {
		return pattern_DiffGame_entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_entities_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_entities_Filter() {
		return (EAttribute)pattern_DiffGame_entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffGame_domainspecificdiffs() {
		return pattern_DiffGame_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_domainspecificdiffs_ID_Pattern() {
		return (EAttribute)pattern_DiffGame_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffGame_domainspecificdiffs_Filter() {
		return (EAttribute)pattern_DiffGame_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern_DiffPositionableEntity_on() {
		return pattern_DiffPositionableEntity_onEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffPositionableEntity_on_ID_Pattern() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_DiffPositionableEntity_on_Filter() {
		return (EAttribute)pattern_DiffPositionableEntity_onEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Constraints() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Pattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacmanGoRuleMMFactory getPacmanGoRuleMMFactory() {
		return (PacmanGoRuleMMFactory)getEFactoryInstance();
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

		pattern_FoodEClass = createEClass(PATTERN_FOOD);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__ID_PATTERN);
		createEAttribute(pattern_FoodEClass, PATTERN_FOOD__FILTER);

		pattern_PacmanEClass = createEClass(PATTERN_PACMAN);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__ID_PATTERN);
		createEAttribute(pattern_PacmanEClass, PATTERN_PACMAN__FILTER);

		pattern_GhostEClass = createEClass(PATTERN_GHOST);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__ID_PATTERN);
		createEAttribute(pattern_GhostEClass, PATTERN_GHOST__FILTER);

		pattern_ScoreboardEClass = createEClass(PATTERN_SCOREBOARD);
		createEAttribute(pattern_ScoreboardEClass, PATTERN_SCOREBOARD__ID_PATTERN);
		createEAttribute(pattern_ScoreboardEClass, PATTERN_SCOREBOARD__FILTER);

		pattern_GameEClass = createEClass(PATTERN_GAME);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__ID_PATTERN);
		createEAttribute(pattern_GameEClass, PATTERN_GAME__FILTER);

		pattern_PositionableEntityEClass = createEClass(PATTERN_POSITIONABLE_ENTITY);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__ID_PATTERN);
		createEAttribute(pattern_PositionableEntityEClass, PATTERN_POSITIONABLE_ENTITY__FILTER);

		pattern_DomainSpecificDiffEClass = createEClass(PATTERN_DOMAIN_SPECIFIC_DIFF);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN);
		createEAttribute(pattern_DomainSpecificDiffEClass, PATTERN_DOMAIN_SPECIFIC_DIFF__FILTER);

		pattern_DiffGridNodeEClass = createEClass(PATTERN_DIFF_GRID_NODE);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__ID_PATTERN);
		createEAttribute(pattern_DiffGridNodeEClass, PATTERN_DIFF_GRID_NODE__FILTER);

		pattern_DiffGridNode_upEClass = createEClass(PATTERN_DIFF_GRID_NODE_UP);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_upEClass, PATTERN_DIFF_GRID_NODE_UP__FILTER);

		pattern_DiffGridNode_bottomEClass = createEClass(PATTERN_DIFF_GRID_NODE_BOTTOM);
		createEAttribute(pattern_DiffGridNode_bottomEClass, PATTERN_DIFF_GRID_NODE_BOTTOM__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_bottomEClass, PATTERN_DIFF_GRID_NODE_BOTTOM__FILTER);

		pattern_DiffGridNode_leftEClass = createEClass(PATTERN_DIFF_GRID_NODE_LEFT);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_leftEClass, PATTERN_DIFF_GRID_NODE_LEFT__FILTER);

		pattern_DiffGridNode_rightEClass = createEClass(PATTERN_DIFF_GRID_NODE_RIGHT);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__ID_PATTERN);
		createEAttribute(pattern_DiffGridNode_rightEClass, PATTERN_DIFF_GRID_NODE_RIGHT__FILTER);

		pattern_DiffFoodEClass = createEClass(PATTERN_DIFF_FOOD);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__ID_PATTERN);
		createEAttribute(pattern_DiffFoodEClass, PATTERN_DIFF_FOOD__FILTER);

		pattern_DiffPacmanEClass = createEClass(PATTERN_DIFF_PACMAN);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__ID_PATTERN);
		createEAttribute(pattern_DiffPacmanEClass, PATTERN_DIFF_PACMAN__FILTER);

		pattern_DiffGhostEClass = createEClass(PATTERN_DIFF_GHOST);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__ID_PATTERN);
		createEAttribute(pattern_DiffGhostEClass, PATTERN_DIFF_GHOST__FILTER);

		pattern_DiffScoreboardEClass = createEClass(PATTERN_DIFF_SCOREBOARD);
		createEAttribute(pattern_DiffScoreboardEClass, PATTERN_DIFF_SCOREBOARD__ID_PATTERN);
		createEAttribute(pattern_DiffScoreboardEClass, PATTERN_DIFF_SCOREBOARD__FILTER);

		pattern_DiffGameEClass = createEClass(PATTERN_DIFF_GAME);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__ID_PATTERN);
		createEAttribute(pattern_DiffGameEClass, PATTERN_DIFF_GAME__FILTER);

		pattern_DiffGame_gridnodesEClass = createEClass(PATTERN_DIFF_GAME_GRIDNODES);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_gridnodesEClass, PATTERN_DIFF_GAME_GRIDNODES__FILTER);

		pattern_DiffGame_scoreboardEClass = createEClass(PATTERN_DIFF_GAME_SCOREBOARD);
		createEAttribute(pattern_DiffGame_scoreboardEClass, PATTERN_DIFF_GAME_SCOREBOARD__ID_PATTERN);
		createEAttribute(pattern_DiffGame_scoreboardEClass, PATTERN_DIFF_GAME_SCOREBOARD__FILTER);

		pattern_DiffGame_entitiesEClass = createEClass(PATTERN_DIFF_GAME_ENTITIES);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__ID_PATTERN);
		createEAttribute(pattern_DiffGame_entitiesEClass, PATTERN_DIFF_GAME_ENTITIES__FILTER);

		pattern_DiffGame_domainspecificdiffsEClass = createEClass(PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS);
		createEAttribute(pattern_DiffGame_domainspecificdiffsEClass, PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__ID_PATTERN);
		createEAttribute(pattern_DiffGame_domainspecificdiffsEClass, PATTERN_DIFF_GAME_DOMAINSPECIFICDIFFS__FILTER);

		pattern_DiffPositionableEntity_onEClass = createEClass(PATTERN_DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__ID_PATTERN);
		createEAttribute(pattern_DiffPositionableEntity_onEClass, PATTERN_DIFF_POSITIONABLE_ENTITY_ON__FILTER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__CONSTRAINTS);
		createEReference(ruleEClass, RULE__PATTERN);
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
		PacmanGoDiffMMPackage thePacmanGoDiffMMPackage = (PacmanGoDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanGoDiffMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pattern_GridNodeEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getGridNode());
		pattern_FoodEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getFood());
		pattern_PacmanEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getPacman());
		pattern_GhostEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getGhost());
		pattern_ScoreboardEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getScoreboard());
		pattern_GameEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getGame());
		pattern_PositionableEntityEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getPositionableEntity());
		pattern_DomainSpecificDiffEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDomainSpecificDiff());
		pattern_DiffGridNodeEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGridNode());
		pattern_DiffGridNode_upEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGridNode_up());
		pattern_DiffGridNode_bottomEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGridNode_bottom());
		pattern_DiffGridNode_leftEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGridNode_left());
		pattern_DiffGridNode_rightEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGridNode_right());
		pattern_DiffFoodEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffFood());
		pattern_DiffPacmanEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffPacman());
		pattern_DiffGhostEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGhost());
		pattern_DiffScoreboardEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffScoreboard());
		pattern_DiffGameEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGame());
		pattern_DiffGame_gridnodesEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGame_gridnodes());
		pattern_DiffGame_scoreboardEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGame_scoreboard());
		pattern_DiffGame_entitiesEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGame_entities());
		pattern_DiffGame_domainspecificdiffsEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffGame_domainspecificdiffs());
		pattern_DiffPositionableEntity_onEClass.getESuperTypes().add(thePacmanGoDiffMMPackage.getDiffPositionableEntity_on());

		// Initialize classes, features, and operations; add parameters
		initEClass(pattern_GridNodeEClass, Pattern_GridNode.class, "Pattern_GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_GridNode_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_GridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_FoodEClass, Pattern_Food.class, "Pattern_Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Food_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Food_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PacmanEClass, Pattern_Pacman.class, "Pattern_Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Pacman_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Pacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GhostEClass, Pattern_Ghost.class, "Pattern_Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Ghost_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Ghost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_ScoreboardEClass, Pattern_Scoreboard.class, "Pattern_Scoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Scoreboard_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Scoreboard_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_GameEClass, Pattern_Game.class, "Pattern_Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Game_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Game_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_PositionableEntityEClass, Pattern_PositionableEntity.class, "Pattern_PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_PositionableEntity_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PositionableEntity_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DomainSpecificDiffEClass, Pattern_DomainSpecificDiff.class, "Pattern_DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DomainSpecificDiff_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DomainSpecificDiff_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNodeEClass, Pattern_DiffGridNode.class, "Pattern_DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_upEClass, Pattern_DiffGridNode_up.class, "Pattern_DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_up_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_up_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_bottomEClass, Pattern_DiffGridNode_bottom.class, "Pattern_DiffGridNode_bottom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_bottom_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_bottom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_bottom_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_bottom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_leftEClass, Pattern_DiffGridNode_left.class, "Pattern_DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_left_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_left_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGridNode_rightEClass, Pattern_DiffGridNode_right.class, "Pattern_DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGridNode_right_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGridNode_right_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffFoodEClass, Pattern_DiffFood.class, "Pattern_DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffFood_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffFood_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPacmanEClass, Pattern_DiffPacman.class, "Pattern_DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPacman_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPacman_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGhostEClass, Pattern_DiffGhost.class, "Pattern_DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGhost_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGhost_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffScoreboardEClass, Pattern_DiffScoreboard.class, "Pattern_DiffScoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffScoreboard_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffScoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffScoreboard_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffScoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGameEClass, Pattern_DiffGame.class, "Pattern_DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_gridnodesEClass, Pattern_DiffGame_gridnodes.class, "Pattern_DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_gridnodes_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_gridnodes_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_scoreboardEClass, Pattern_DiffGame_scoreboard.class, "Pattern_DiffGame_scoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_scoreboard_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_scoreboard_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_entitiesEClass, Pattern_DiffGame_entities.class, "Pattern_DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_entities_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_entities_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffGame_domainspecificdiffsEClass, Pattern_DiffGame_domainspecificdiffs.class, "Pattern_DiffGame_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffGame_domainspecificdiffs_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffGame_domainspecificdiffs_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pattern_DiffPositionableEntity_onEClass, Pattern_DiffPositionableEntity_on.class, "Pattern_DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_DiffPositionableEntity_on_ID_Pattern(), ecorePackage.getEInt(), "ID_Pattern", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_DiffPositionableEntity_on_Filter(), ecorePackage.getEBoolean(), "filter", null, 1, 1, Pattern_DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pattern(), this.getPattern_Game(), null, "pattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PacmanGoRuleMMPackageImpl
