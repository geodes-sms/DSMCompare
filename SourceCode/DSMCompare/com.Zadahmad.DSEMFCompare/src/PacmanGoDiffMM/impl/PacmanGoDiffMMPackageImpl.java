/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.AscOp;
import PacmanGoDiffMM.ClassOp;
import PacmanGoDiffMM.DiffFood;
import PacmanGoDiffMM.DiffGame;
import PacmanGoDiffMM.DiffGame_domainspecificdiffs;
import PacmanGoDiffMM.DiffGame_entities;
import PacmanGoDiffMM.DiffGame_gridnodes;
import PacmanGoDiffMM.DiffGame_scoreboard;
import PacmanGoDiffMM.DiffGhost;
import PacmanGoDiffMM.DiffGridNode;
import PacmanGoDiffMM.DiffGridNode_bottom;
import PacmanGoDiffMM.DiffGridNode_left;
import PacmanGoDiffMM.DiffGridNode_right;
import PacmanGoDiffMM.DiffGridNode_up;
import PacmanGoDiffMM.DiffPacman;
import PacmanGoDiffMM.DiffPositionableEntity_on;
import PacmanGoDiffMM.DiffScoreboard;
import PacmanGoDiffMM.DomainSpecificDiff;
import PacmanGoDiffMM.Food;
import PacmanGoDiffMM.Game;
import PacmanGoDiffMM.Ghost;
import PacmanGoDiffMM.GridNode;
import PacmanGoDiffMM.Pacman;
import PacmanGoDiffMM.PacmanGoDiffMMFactory;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;
import PacmanGoDiffMM.PositionableEntity;
import PacmanGoDiffMM.Scoreboard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanGoDiffMMPackageImpl extends EPackageImpl implements PacmanGoDiffMMPackage {
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
	private EClass foodEClass = null;

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
	private EClass ghostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreboardEClass = null;

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
	private EClass positionableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificDiffEClass = null;

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
	private EClass diffGridNode_upEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGridNode_bottomEClass = null;

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
	private EClass diffFoodEClass = null;

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
	private EClass diffGhostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffScoreboardEClass = null;

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
	private EClass diffGame_gridnodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGame_scoreboardEClass = null;

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
	private EClass diffGame_domainspecificdiffsEClass = null;

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
	private EEnum classOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascOpEEnum = null;

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
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanGoDiffMMPackageImpl() {
		super(eNS_URI, PacmanGoDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PacmanGoDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanGoDiffMMPackage init() {
		if (isInited) return (PacmanGoDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanGoDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		PacmanGoDiffMMPackageImpl thePacmanGoDiffMMPackage = (PacmanGoDiffMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PacmanGoDiffMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PacmanGoDiffMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePacmanGoDiffMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanGoDiffMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanGoDiffMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanGoDiffMMPackage.eNS_URI, thePacmanGoDiffMMPackage);
		return thePacmanGoDiffMMPackage;
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
	public EReference getGridNode_Bottom() {
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
	public EReference getGridNode_Diffbottom() {
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
	public EClass getFood() {
		return foodEClass;
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
	public EClass getGhost() {
		return ghostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScoreboard() {
		return scoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreboard_Value() {
		return (EAttribute)scoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreboard_Id() {
		return (EAttribute)scoreboardEClass.getEStructuralFeatures().get(1);
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
	public EReference getGame_Gridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Scoreboard() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Entities() {
		return (EReference)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Domainspecificdiffs() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffgridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffscoreboard() {
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
	public EReference getGame_Diffdomainspecificdiffs() {
		return (EReference)gameEClass.getEStructuralFeatures().get(7);
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
	public EClass getDomainSpecificDiff() {
		return domainSpecificDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecificDiff_Name() {
		return (EAttribute)domainSpecificDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_GridNode() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Food() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Pacman() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Ghost() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Scoreboard() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getDiffGridNode_Operation() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_New_id() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGridNode_up_Operation() {
		return (EAttribute)diffGridNode_upEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_up_EType() {
		return (EReference)diffGridNode_upEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGridNode_bottom() {
		return diffGridNode_bottomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_bottom_Operation() {
		return (EAttribute)diffGridNode_bottomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_bottom_EType() {
		return (EReference)diffGridNode_bottomEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGridNode_left_Operation() {
		return (EAttribute)diffGridNode_leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_left_EType() {
		return (EReference)diffGridNode_leftEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGridNode_right_Operation() {
		return (EAttribute)diffGridNode_rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_right_EType() {
		return (EReference)diffGridNode_rightEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffFood_Operation() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_id() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffPacman_Operation() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_id() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGhost_Operation() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_id() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffScoreboard() {
		return diffScoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScoreboard_Operation() {
		return (EAttribute)diffScoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScoreboard_New_value() {
		return (EAttribute)diffScoreboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffScoreboard_New_id() {
		return (EAttribute)diffScoreboardEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDiffGame_Operation() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDiffGame_gridnodes_Operation() {
		return (EAttribute)diffGame_gridnodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_gridnodes_EType() {
		return (EReference)diffGame_gridnodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGame_scoreboard() {
		return diffGame_scoreboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_scoreboard_Operation() {
		return (EAttribute)diffGame_scoreboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_scoreboard_EType() {
		return (EReference)diffGame_scoreboardEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGame_entities_Operation() {
		return (EAttribute)diffGame_entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_entities_EType() {
		return (EReference)diffGame_entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGame_domainspecificdiffs() {
		return diffGame_domainspecificdiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_domainspecificdiffs_Operation() {
		return (EAttribute)diffGame_domainspecificdiffsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_domainspecificdiffs_EType() {
		return (EReference)diffGame_domainspecificdiffsEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffPositionableEntity_on_Operation() {
		return (EAttribute)diffPositionableEntity_onEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffPositionableEntity_on_EType() {
		return (EReference)diffPositionableEntity_onEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassOp() {
		return classOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAscOp() {
		return ascOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoDiffMMFactory getPacmanGoDiffMMFactory() {
		return (PacmanGoDiffMMFactory)getEFactoryInstance();
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
		gridNodeEClass = createEClass(GRID_NODE);
		createEReference(gridNodeEClass, GRID_NODE__UP);
		createEReference(gridNodeEClass, GRID_NODE__BOTTOM);
		createEReference(gridNodeEClass, GRID_NODE__LEFT);
		createEReference(gridNodeEClass, GRID_NODE__RIGHT);
		createEAttribute(gridNodeEClass, GRID_NODE__ID);
		createEReference(gridNodeEClass, GRID_NODE__DIFFUP);
		createEReference(gridNodeEClass, GRID_NODE__DIFFBOTTOM);
		createEReference(gridNodeEClass, GRID_NODE__DIFFLEFT);
		createEReference(gridNodeEClass, GRID_NODE__DIFFRIGHT);

		foodEClass = createEClass(FOOD);

		pacmanEClass = createEClass(PACMAN);

		ghostEClass = createEClass(GHOST);

		scoreboardEClass = createEClass(SCOREBOARD);
		createEAttribute(scoreboardEClass, SCOREBOARD__VALUE);
		createEAttribute(scoreboardEClass, SCOREBOARD__ID);

		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__GRIDNODES);
		createEReference(gameEClass, GAME__SCOREBOARD);
		createEReference(gameEClass, GAME__ENTITIES);
		createEReference(gameEClass, GAME__DOMAINSPECIFICDIFFS);
		createEReference(gameEClass, GAME__DIFFGRIDNODES);
		createEReference(gameEClass, GAME__DIFFSCOREBOARD);
		createEReference(gameEClass, GAME__DIFFENTITIES);
		createEReference(gameEClass, GAME__DIFFDOMAINSPECIFICDIFFS);

		positionableEntityEClass = createEClass(POSITIONABLE_ENTITY);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__ON);
		createEAttribute(positionableEntityEClass, POSITIONABLE_ENTITY__ID);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__DIFFON);

		domainSpecificDiffEClass = createEClass(DOMAIN_SPECIFIC_DIFF);
		createEAttribute(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__NAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY);

		diffGridNodeEClass = createEClass(DIFF_GRID_NODE);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__OPERATION);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__NEW_ID);

		diffGridNode_upEClass = createEClass(DIFF_GRID_NODE_UP);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__OPERATION);
		createEReference(diffGridNode_upEClass, DIFF_GRID_NODE_UP__ETYPE);

		diffGridNode_bottomEClass = createEClass(DIFF_GRID_NODE_BOTTOM);
		createEAttribute(diffGridNode_bottomEClass, DIFF_GRID_NODE_BOTTOM__OPERATION);
		createEReference(diffGridNode_bottomEClass, DIFF_GRID_NODE_BOTTOM__ETYPE);

		diffGridNode_leftEClass = createEClass(DIFF_GRID_NODE_LEFT);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__OPERATION);
		createEReference(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__ETYPE);

		diffGridNode_rightEClass = createEClass(DIFF_GRID_NODE_RIGHT);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__OPERATION);
		createEReference(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__ETYPE);

		diffFoodEClass = createEClass(DIFF_FOOD);
		createEAttribute(diffFoodEClass, DIFF_FOOD__OPERATION);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_ID);

		diffPacmanEClass = createEClass(DIFF_PACMAN);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__OPERATION);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_ID);

		diffGhostEClass = createEClass(DIFF_GHOST);
		createEAttribute(diffGhostEClass, DIFF_GHOST__OPERATION);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_ID);

		diffScoreboardEClass = createEClass(DIFF_SCOREBOARD);
		createEAttribute(diffScoreboardEClass, DIFF_SCOREBOARD__OPERATION);
		createEAttribute(diffScoreboardEClass, DIFF_SCOREBOARD__NEW_VALUE);
		createEAttribute(diffScoreboardEClass, DIFF_SCOREBOARD__NEW_ID);

		diffGameEClass = createEClass(DIFF_GAME);
		createEAttribute(diffGameEClass, DIFF_GAME__OPERATION);

		diffGame_gridnodesEClass = createEClass(DIFF_GAME_GRIDNODES);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__OPERATION);
		createEReference(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__ETYPE);

		diffGame_scoreboardEClass = createEClass(DIFF_GAME_SCOREBOARD);
		createEAttribute(diffGame_scoreboardEClass, DIFF_GAME_SCOREBOARD__OPERATION);
		createEReference(diffGame_scoreboardEClass, DIFF_GAME_SCOREBOARD__ETYPE);

		diffGame_entitiesEClass = createEClass(DIFF_GAME_ENTITIES);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__OPERATION);
		createEReference(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__ETYPE);

		diffGame_domainspecificdiffsEClass = createEClass(DIFF_GAME_DOMAINSPECIFICDIFFS);
		createEAttribute(diffGame_domainspecificdiffsEClass, DIFF_GAME_DOMAINSPECIFICDIFFS__OPERATION);
		createEReference(diffGame_domainspecificdiffsEClass, DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE);

		diffPositionableEntity_onEClass = createEClass(DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__OPERATION);
		createEReference(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__ETYPE);

		// Create enums
		classOpEEnum = createEEnum(CLASS_OP);
		ascOpEEnum = createEEnum(ASC_OP);
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
		foodEClass.getESuperTypes().add(this.getPositionableEntity());
		pacmanEClass.getESuperTypes().add(this.getPositionableEntity());
		ghostEClass.getESuperTypes().add(this.getPositionableEntity());
		diffGridNodeEClass.getESuperTypes().add(this.getGridNode());
		diffFoodEClass.getESuperTypes().add(this.getFood());
		diffPacmanEClass.getESuperTypes().add(this.getPacman());
		diffGhostEClass.getESuperTypes().add(this.getGhost());
		diffScoreboardEClass.getESuperTypes().add(this.getScoreboard());
		diffGameEClass.getESuperTypes().add(this.getGame());

		// Initialize classes, features, and operations; add parameters
		initEClass(gridNodeEClass, GridNode.class, "GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridNode_Up(), this.getGridNode(), null, "up", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Bottom(), this.getGridNode(), null, "bottom", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Left(), this.getGridNode(), null, "left", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Right(), this.getGridNode(), null, "right", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffup(), this.getDiffGridNode_up(), null, "diffup", null, 0, 2, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffbottom(), this.getDiffGridNode_bottom(), null, "diffbottom", null, 0, 2, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffleft(), this.getDiffGridNode_left(), null, "diffleft", null, 0, 2, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Diffright(), this.getDiffGridNode_right(), null, "diffright", null, 0, 2, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodEClass, Food.class, "Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pacmanEClass, Pacman.class, "Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scoreboardEClass, Scoreboard.class, "Scoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreboard_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreboard_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Gridnodes(), this.getGridNode(), null, "gridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Scoreboard(), this.getScoreboard(), null, "scoreboard", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Entities(), this.getPositionableEntity(), null, "entities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Domainspecificdiffs(), this.getDomainSpecificDiff(), null, "domainspecificdiffs", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffgridnodes(), this.getDiffGame_gridnodes(), null, "diffgridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffscoreboard(), this.getDiffGame_scoreboard(), null, "diffscoreboard", null, 0, 2, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffentities(), this.getDiffGame_entities(), null, "diffentities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffdomainspecificdiffs(), this.getDiffGame_domainspecificdiffs(), null, "diffdomainspecificdiffs", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEntityEClass, PositionableEntity.class, "PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionableEntity_On(), this.getGridNode(), null, "on", null, 1, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionableEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionableEntity_Diffon(), this.getDiffPositionableEntity_on(), null, "diffon", null, 0, 2, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificDiffEClass, DomainSpecificDiff.class, "DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificDiff_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_GridNode(), this.getGridNode(), null, "DomainSpecificDiff_GridNode", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Food(), this.getFood(), null, "DomainSpecificDiff_Food", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Pacman(), this.getPacman(), null, "DomainSpecificDiff_Pacman", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Ghost(), this.getGhost(), null, "DomainSpecificDiff_Ghost", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Scoreboard(), this.getScoreboard(), null, "DomainSpecificDiff_Scoreboard", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity(), this.getPositionableEntity(), null, "DomainSpecificDiff_PositionableEntity", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNodeEClass, DiffGridNode.class, "DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGridNode_New_id(), ecorePackage.getEString(), "new_id", null, 0, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_upEClass, DiffGridNode_up.class, "DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_up_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_up_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_bottomEClass, DiffGridNode_bottom.class, "DiffGridNode_bottom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_bottom_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGridNode_bottom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_bottom_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_bottom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_leftEClass, DiffGridNode_left.class, "DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_left_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_left_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_rightEClass, DiffGridNode_right.class, "DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_right_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_right_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFoodEClass, DiffFood.class, "DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFood_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_id(), ecorePackage.getEString(), "new_id", null, 0, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPacmanEClass, DiffPacman.class, "DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPacman_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_id(), ecorePackage.getEString(), "new_id", null, 0, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGhostEClass, DiffGhost.class, "DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGhost_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_id(), ecorePackage.getEString(), "new_id", null, 0, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffScoreboardEClass, DiffScoreboard.class, "DiffScoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffScoreboard_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffScoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScoreboard_New_value(), ecorePackage.getEInt(), "new_value", null, 0, 1, DiffScoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffScoreboard_New_id(), ecorePackage.getEInt(), "new_id", null, 0, 1, DiffScoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGameEClass, DiffGame.class, "DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_Operation(), this.getClassOp(), "operation", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_gridnodesEClass, DiffGame_gridnodes.class, "DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_gridnodes_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_gridnodes_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_scoreboardEClass, DiffGame_scoreboard.class, "DiffGame_scoreboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_scoreboard_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGame_scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_scoreboard_EType(), this.getScoreboard(), null, "eType", null, 1, 1, DiffGame_scoreboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_entitiesEClass, DiffGame_entities.class, "DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_entities_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_entities_EType(), this.getPositionableEntity(), null, "eType", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_domainspecificdiffsEClass, DiffGame_domainspecificdiffs.class, "DiffGame_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_domainspecificdiffs_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_domainspecificdiffs_EType(), this.getDomainSpecificDiff(), null, "eType", null, 1, 1, DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPositionableEntity_onEClass, DiffPositionableEntity_on.class, "DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPositionableEntity_on_Operation(), this.getAscOp(), "operation", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPositionableEntity_on_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classOpEEnum, ClassOp.class, "ClassOp");
		addEEnumLiteral(classOpEEnum, ClassOp.ADD);
		addEEnumLiteral(classOpEEnum, ClassOp.DELETE);
		addEEnumLiteral(classOpEEnum, ClassOp.MODIFY);

		initEEnum(ascOpEEnum, AscOp.class, "AscOp");
		addEEnumLiteral(ascOpEEnum, AscOp.ADD);
		addEEnumLiteral(ascOpEEnum, AscOp.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //PacmanGoDiffMMPackageImpl
