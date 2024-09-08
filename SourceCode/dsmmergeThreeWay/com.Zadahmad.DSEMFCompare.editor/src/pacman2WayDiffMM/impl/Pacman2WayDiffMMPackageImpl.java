/**
 */
package pacman2WayDiffMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pacman2WayDiffMM.AscDiffKind;
import pacman2WayDiffMM.ClassDiffKind;
import pacman2WayDiffMM.DiffEnergizer;
import pacman2WayDiffMM.DiffFood;
import pacman2WayDiffMM.DiffFruit;
import pacman2WayDiffMM.DiffGame;
import pacman2WayDiffMM.DiffGame_domainspecificdiffs;
import pacman2WayDiffMM.DiffGame_entities;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.DiffGame_semanticconflicts;
import pacman2WayDiffMM.DiffGhost;
import pacman2WayDiffMM.DiffGridNode;
import pacman2WayDiffMM.DiffGridNode_down;
import pacman2WayDiffMM.DiffGridNode_left;
import pacman2WayDiffMM.DiffGridNode_right;
import pacman2WayDiffMM.DiffGridNode_up;
import pacman2WayDiffMM.DiffPacman;
import pacman2WayDiffMM.DiffPositionableEntity_on;
import pacman2WayDiffMM.DomainSpecificDiff;
import pacman2WayDiffMM.Energizer;
import pacman2WayDiffMM.Food;
import pacman2WayDiffMM.Fruit;
import pacman2WayDiffMM.Game;
import pacman2WayDiffMM.Ghost;
import pacman2WayDiffMM.GhostStrategy;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman;
import pacman2WayDiffMM.Pacman2WayDiffMMFactory;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;
import pacman2WayDiffMM.PositionableEntity;
import pacman2WayDiffMM.SemanticConflict;
import pacman2WayDiffMM._ListEInt;
import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacman2WayRuleMM.impl.Pacman2WayRuleMMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pacman2WayDiffMMPackageImpl extends EPackageImpl implements Pacman2WayDiffMMPackage {
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
	private EClass fruitEClass = null;

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
	private EClass domainSpecificDiffEClass = null;

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
	private EClass diffGame_semanticconflictsEClass = null;

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
	private EClass diffFruitEClass = null;

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
	private EClass _ListEIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ghostStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classDiffKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ascDiffKindEEnum = null;

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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pacman2WayDiffMMPackageImpl() {
		super(eNS_URI, Pacman2WayDiffMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Pacman2WayDiffMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pacman2WayDiffMMPackage init() {
		if (isInited) return (Pacman2WayDiffMMPackage)EPackage.Registry.INSTANCE.getEPackage(Pacman2WayDiffMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacman2WayDiffMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Pacman2WayDiffMMPackageImpl thePacman2WayDiffMMPackage = registeredPacman2WayDiffMMPackage instanceof Pacman2WayDiffMMPackageImpl ? (Pacman2WayDiffMMPackageImpl)registeredPacman2WayDiffMMPackage : new Pacman2WayDiffMMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Pacman2WayRuleMMPackage.eNS_URI);
		Pacman2WayRuleMMPackageImpl thePacman2WayRuleMMPackage = (Pacman2WayRuleMMPackageImpl)(registeredPackage instanceof Pacman2WayRuleMMPackageImpl ? registeredPackage : Pacman2WayRuleMMPackage.eINSTANCE);

		// Create package meta-data objects
		thePacman2WayDiffMMPackage.createPackageContents();
		thePacman2WayRuleMMPackage.createPackageContents();

		// Initialize created meta-data
		thePacman2WayDiffMMPackage.initializePackageContents();
		thePacman2WayRuleMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacman2WayDiffMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pacman2WayDiffMMPackage.eNS_URI, thePacman2WayDiffMMPackage);
		return thePacman2WayDiffMMPackage;
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
	public EReference getGame_Domainspecificdiffs() {
		return (EReference)gameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Semanticconflicts() {
		return (EReference)gameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffgridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffentities() {
		return (EReference)gameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffdomainspecificdiffs() {
		return (EReference)gameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Diffsemanticconflicts() {
		return (EReference)gameEClass.getEStructuralFeatures().get(10);
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
	public EClass getFruit() {
		return fruitEClass;
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
	public EReference getDomainSpecificDiff_DomainSpecificDiff_Game() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on() {
		return (EReference)domainSpecificDiffEClass.getEStructuralFeatures().get(12);
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
	public EAttribute getSemanticConflict_Name() {
		return (EAttribute)semanticConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGridNode() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGridNode_up() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGridNode_down() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGridNode_left() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGridNode_right() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffFood() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffPacman() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGhost() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGame() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGame_gridnodes() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGame_entities() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffPositionableEntity_on() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffFruit() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DiffEnergizer() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticConflict_SemanticConflict_DomainSpecificDiff() {
		return (EReference)semanticConflictEClass.getEStructuralFeatures().get(17);
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
	public EAttribute getDiffGridNode_Diff_kind() {
		return (EAttribute)diffGridNodeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDiffGridNode_up_Diff_kind() {
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
	public EClass getDiffGridNode_down() {
		return diffGridNode_downEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGridNode_down_Diff_kind() {
		return (EAttribute)diffGridNode_downEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGridNode_down_EType() {
		return (EReference)diffGridNode_downEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGridNode_left_Diff_kind() {
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
	public EAttribute getDiffGridNode_right_Diff_kind() {
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
	public EAttribute getDiffFood_Diff_kind() {
		return (EAttribute)diffFoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFood_New_value() {
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
	public EAttribute getDiffPacman_Diff_kind() {
		return (EAttribute)diffPacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffPacman_New_initialPosition() {
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
	public EAttribute getDiffGhost_Diff_kind() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGhost_New_strategy() {
		return (EAttribute)diffGhostEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffGame_Diff_kind() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_lives() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_New_score() {
		return (EAttribute)diffGameEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDiffGame_gridnodes_Diff_kind() {
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
	public EClass getDiffGame_entities() {
		return diffGame_entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_entities_Diff_kind() {
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
	public EAttribute getDiffGame_domainspecificdiffs_Diff_kind() {
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
	public EClass getDiffGame_semanticconflicts() {
		return diffGame_semanticconflictsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGame_semanticconflicts_Diff_kind() {
		return (EAttribute)diffGame_semanticconflictsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGame_semanticconflicts_EType() {
		return (EReference)diffGame_semanticconflictsEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffPositionableEntity_on_Diff_kind() {
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
	public EClass getDiffFruit() {
		return diffFruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_Diff_kind() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffFruit_New_value() {
		return (EAttribute)diffFruitEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiffEnergizer_Diff_kind() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEnergizer_New_value() {
		return (EAttribute)diffEnergizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffEnergizer_New_durations() {
		return (EReference)diffEnergizerEClass.getEStructuralFeatures().get(2);
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
	public EEnum getGhostStrategy() {
		return ghostStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassDiffKind() {
		return classDiffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAscDiffKind() {
		return ascDiffKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayDiffMMFactory getPacman2WayDiffMMFactory() {
		return (Pacman2WayDiffMMFactory)getEFactoryInstance();
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
		createEReference(gridNodeEClass, GRID_NODE__DOWN);
		createEReference(gridNodeEClass, GRID_NODE__LEFT);
		createEReference(gridNodeEClass, GRID_NODE__RIGHT);
		createEAttribute(gridNodeEClass, GRID_NODE__ID);
		createEReference(gridNodeEClass, GRID_NODE__DIFFUP);
		createEReference(gridNodeEClass, GRID_NODE__DIFFDOWN);
		createEReference(gridNodeEClass, GRID_NODE__DIFFLEFT);
		createEReference(gridNodeEClass, GRID_NODE__DIFFRIGHT);

		foodEClass = createEClass(FOOD);
		createEAttribute(foodEClass, FOOD__VALUE);

		pacmanEClass = createEClass(PACMAN);
		createEAttribute(pacmanEClass, PACMAN__INITIAL_POSITION);

		ghostEClass = createEClass(GHOST);
		createEAttribute(ghostEClass, GHOST__STRATEGY);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__ID);
		createEAttribute(gameEClass, GAME__LIVES);
		createEAttribute(gameEClass, GAME__SCORE);
		createEReference(gameEClass, GAME__GRIDNODES);
		createEReference(gameEClass, GAME__ENTITIES);
		createEReference(gameEClass, GAME__DOMAINSPECIFICDIFFS);
		createEReference(gameEClass, GAME__SEMANTICCONFLICTS);
		createEReference(gameEClass, GAME__DIFFGRIDNODES);
		createEReference(gameEClass, GAME__DIFFENTITIES);
		createEReference(gameEClass, GAME__DIFFDOMAINSPECIFICDIFFS);
		createEReference(gameEClass, GAME__DIFFSEMANTICCONFLICTS);

		positionableEntityEClass = createEClass(POSITIONABLE_ENTITY);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__ON);
		createEAttribute(positionableEntityEClass, POSITIONABLE_ENTITY__ID);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__DIFFON);

		fruitEClass = createEClass(FRUIT);

		energizerEClass = createEClass(ENERGIZER);
		createEAttribute(energizerEClass, ENERGIZER__DURATIONS);

		domainSpecificDiffEClass = createEClass(DOMAIN_SPECIFIC_DIFF);
		createEAttribute(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__NAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS);
		createEReference(domainSpecificDiffEClass, DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON);

		semanticConflictEClass = createEClass(SEMANTIC_CONFLICT);
		createEAttribute(semanticConflictEClass, SEMANTIC_CONFLICT__NAME);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_UP);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_DOWN);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_LEFT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GRID_NODE_RIGHT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FOOD);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_PACMAN);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GHOST);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_GRIDNODES);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_ENTITIES);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_DOMAINSPECIFICDIFFS);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_GAME_SEMANTICCONFLICTS);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_POSITIONABLE_ENTITY_ON);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_FRUIT);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DIFF_ENERGIZER);
		createEReference(semanticConflictEClass, SEMANTIC_CONFLICT__SEMANTIC_CONFLICT_DOMAIN_SPECIFIC_DIFF);

		diffGridNodeEClass = createEClass(DIFF_GRID_NODE);
		createEAttribute(diffGridNodeEClass, DIFF_GRID_NODE__DIFF_KIND);

		diffGridNode_upEClass = createEClass(DIFF_GRID_NODE_UP);
		createEAttribute(diffGridNode_upEClass, DIFF_GRID_NODE_UP__DIFF_KIND);
		createEReference(diffGridNode_upEClass, DIFF_GRID_NODE_UP__ETYPE);

		diffGridNode_downEClass = createEClass(DIFF_GRID_NODE_DOWN);
		createEAttribute(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__DIFF_KIND);
		createEReference(diffGridNode_downEClass, DIFF_GRID_NODE_DOWN__ETYPE);

		diffGridNode_leftEClass = createEClass(DIFF_GRID_NODE_LEFT);
		createEAttribute(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__DIFF_KIND);
		createEReference(diffGridNode_leftEClass, DIFF_GRID_NODE_LEFT__ETYPE);

		diffGridNode_rightEClass = createEClass(DIFF_GRID_NODE_RIGHT);
		createEAttribute(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__DIFF_KIND);
		createEReference(diffGridNode_rightEClass, DIFF_GRID_NODE_RIGHT__ETYPE);

		diffFoodEClass = createEClass(DIFF_FOOD);
		createEAttribute(diffFoodEClass, DIFF_FOOD__DIFF_KIND);
		createEAttribute(diffFoodEClass, DIFF_FOOD__NEW_VALUE);

		diffPacmanEClass = createEClass(DIFF_PACMAN);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__DIFF_KIND);
		createEAttribute(diffPacmanEClass, DIFF_PACMAN__NEW_INITIAL_POSITION);

		diffGhostEClass = createEClass(DIFF_GHOST);
		createEAttribute(diffGhostEClass, DIFF_GHOST__DIFF_KIND);
		createEAttribute(diffGhostEClass, DIFF_GHOST__NEW_STRATEGY);

		diffGameEClass = createEClass(DIFF_GAME);
		createEAttribute(diffGameEClass, DIFF_GAME__DIFF_KIND);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_LIVES);
		createEAttribute(diffGameEClass, DIFF_GAME__NEW_SCORE);

		diffGame_gridnodesEClass = createEClass(DIFF_GAME_GRIDNODES);
		createEAttribute(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__DIFF_KIND);
		createEReference(diffGame_gridnodesEClass, DIFF_GAME_GRIDNODES__ETYPE);

		diffGame_entitiesEClass = createEClass(DIFF_GAME_ENTITIES);
		createEAttribute(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__DIFF_KIND);
		createEReference(diffGame_entitiesEClass, DIFF_GAME_ENTITIES__ETYPE);

		diffGame_domainspecificdiffsEClass = createEClass(DIFF_GAME_DOMAINSPECIFICDIFFS);
		createEAttribute(diffGame_domainspecificdiffsEClass, DIFF_GAME_DOMAINSPECIFICDIFFS__DIFF_KIND);
		createEReference(diffGame_domainspecificdiffsEClass, DIFF_GAME_DOMAINSPECIFICDIFFS__ETYPE);

		diffGame_semanticconflictsEClass = createEClass(DIFF_GAME_SEMANTICCONFLICTS);
		createEAttribute(diffGame_semanticconflictsEClass, DIFF_GAME_SEMANTICCONFLICTS__DIFF_KIND);
		createEReference(diffGame_semanticconflictsEClass, DIFF_GAME_SEMANTICCONFLICTS__ETYPE);

		diffPositionableEntity_onEClass = createEClass(DIFF_POSITIONABLE_ENTITY_ON);
		createEAttribute(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__DIFF_KIND);
		createEReference(diffPositionableEntity_onEClass, DIFF_POSITIONABLE_ENTITY_ON__ETYPE);

		diffFruitEClass = createEClass(DIFF_FRUIT);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__DIFF_KIND);
		createEAttribute(diffFruitEClass, DIFF_FRUIT__NEW_VALUE);

		diffEnergizerEClass = createEClass(DIFF_ENERGIZER);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__DIFF_KIND);
		createEAttribute(diffEnergizerEClass, DIFF_ENERGIZER__NEW_VALUE);
		createEReference(diffEnergizerEClass, DIFF_ENERGIZER__NEW_DURATIONS);

		_ListEIntEClass = createEClass(_LIST_EINT);
		createEAttribute(_ListEIntEClass, _LIST_EINT__VALUE);

		// Create enums
		ghostStrategyEEnum = createEEnum(GHOST_STRATEGY);
		classDiffKindEEnum = createEEnum(CLASS_DIFF_KIND);
		ascDiffKindEEnum = createEEnum(ASC_DIFF_KIND);
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
		fruitEClass.getESuperTypes().add(this.getFood());
		energizerEClass.getESuperTypes().add(this.getFood());
		diffGridNodeEClass.getESuperTypes().add(this.getGridNode());
		diffFoodEClass.getESuperTypes().add(this.getFood());
		diffPacmanEClass.getESuperTypes().add(this.getPacman());
		diffGhostEClass.getESuperTypes().add(this.getGhost());
		diffGameEClass.getESuperTypes().add(this.getGame());
		diffFruitEClass.getESuperTypes().add(this.getFruit());
		diffEnergizerEClass.getESuperTypes().add(this.getEnergizer());

		// Initialize classes, features, and operations; add parameters
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

		initEClass(foodEClass, Food.class, "Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFood_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pacmanEClass, Pacman.class, "Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPacman_InitialPosition(), ecorePackage.getEString(), "initialPosition", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGhost_Strategy(), this.getGhostStrategy(), "strategy", null, 1, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Id(), ecorePackage.getEString(), "id", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Lives(), ecorePackage.getEInt(), "lives", "1", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Score(), ecorePackage.getEInt(), "score", "0", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Gridnodes(), this.getGridNode(), null, "gridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Entities(), this.getPositionableEntity(), null, "entities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Domainspecificdiffs(), this.getDomainSpecificDiff(), null, "domainspecificdiffs", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Semanticconflicts(), this.getSemanticConflict(), null, "semanticconflicts", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffgridnodes(), this.getDiffGame_gridnodes(), null, "diffgridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffentities(), this.getDiffGame_entities(), null, "diffentities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffdomainspecificdiffs(), this.getDiffGame_domainspecificdiffs(), null, "diffdomainspecificdiffs", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Diffsemanticconflicts(), this.getDiffGame_semanticconflicts(), null, "diffsemanticconflicts", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEntityEClass, PositionableEntity.class, "PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionableEntity_On(), this.getGridNode(), null, "on", null, 1, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionableEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionableEntity_Diffon(), this.getDiffPositionableEntity_on(), null, "diffon", null, 0, -1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fruitEClass, Fruit.class, "Fruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(energizerEClass, Energizer.class, "Energizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergizer_Durations(), ecorePackage.getEInt(), "durations", null, 0, -1, Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificDiffEClass, DomainSpecificDiff.class, "DomainSpecificDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificDiff_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_GridNode(), this.getGridNode(), null, "DomainSpecificDiff_GridNode", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_Game(), this.getGame(), null, "DomainSpecificDiff_Game", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity(), this.getPositionableEntity(), null, "DomainSpecificDiff_PositionableEntity", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up(), this.getDiffGridNode_up(), null, "DomainSpecificDiff_DiffGridNode_up", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down(), this.getDiffGridNode_down(), null, "DomainSpecificDiff_DiffGridNode_down", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left(), this.getDiffGridNode_left(), null, "DomainSpecificDiff_DiffGridNode_left", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right(), this.getDiffGridNode_right(), null, "DomainSpecificDiff_DiffGridNode_right", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes(), this.getDiffGame_gridnodes(), null, "DomainSpecificDiff_DiffGame_gridnodes", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities(), this.getDiffGame_entities(), null, "DomainSpecificDiff_DiffGame_entities", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs(), this.getDiffGame_domainspecificdiffs(), null, "DomainSpecificDiff_DiffGame_domainspecificdiffs", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts(), this.getDiffGame_semanticconflicts(), null, "DomainSpecificDiff_DiffGame_semanticconflicts", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on(), this.getDiffPositionableEntity_on(), null, "DomainSpecificDiff_DiffPositionableEntity_on", null, 0, -1, DomainSpecificDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticConflictEClass, SemanticConflict.class, "SemanticConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticConflict_Name(), ecorePackage.getEString(), "name", null, 1, 1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGridNode(), this.getDiffGridNode(), null, "SemanticConflict_DiffGridNode", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGridNode_up(), this.getDiffGridNode_up(), null, "SemanticConflict_DiffGridNode_up", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGridNode_down(), this.getDiffGridNode_down(), null, "SemanticConflict_DiffGridNode_down", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGridNode_left(), this.getDiffGridNode_left(), null, "SemanticConflict_DiffGridNode_left", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGridNode_right(), this.getDiffGridNode_right(), null, "SemanticConflict_DiffGridNode_right", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffFood(), this.getDiffFood(), null, "SemanticConflict_DiffFood", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffPacman(), this.getDiffPacman(), null, "SemanticConflict_DiffPacman", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGhost(), this.getDiffGhost(), null, "SemanticConflict_DiffGhost", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGame(), this.getDiffGame(), null, "SemanticConflict_DiffGame", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGame_gridnodes(), this.getDiffGame_gridnodes(), null, "SemanticConflict_DiffGame_gridnodes", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGame_entities(), this.getDiffGame_entities(), null, "SemanticConflict_DiffGame_entities", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs(), this.getDiffGame_domainspecificdiffs(), null, "SemanticConflict_DiffGame_domainspecificdiffs", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts(), this.getDiffGame_semanticconflicts(), null, "SemanticConflict_DiffGame_semanticconflicts", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffPositionableEntity_on(), this.getDiffPositionableEntity_on(), null, "SemanticConflict_DiffPositionableEntity_on", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffFruit(), this.getDiffFruit(), null, "SemanticConflict_DiffFruit", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DiffEnergizer(), this.getDiffEnergizer(), null, "SemanticConflict_DiffEnergizer", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticConflict_SemanticConflict_DomainSpecificDiff(), this.getDomainSpecificDiff(), null, "SemanticConflict_DomainSpecificDiff", null, 0, -1, SemanticConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNodeEClass, DiffGridNode.class, "DiffGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffGridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_upEClass, DiffGridNode_up.class, "DiffGridNode_up", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_up_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_up_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_up.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_downEClass, DiffGridNode_down.class, "DiffGridNode_down", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_down_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_down_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_down.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_leftEClass, DiffGridNode_left.class, "DiffGridNode_left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_left_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_left_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGridNode_rightEClass, DiffGridNode_right.class, "DiffGridNode_right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGridNode_right_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGridNode_right_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGridNode_right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFoodEClass, DiffFood.class, "DiffFood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFood_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFood_New_value(), ecorePackage.getEInt(), "new_value", null, 1, 1, DiffFood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPacmanEClass, DiffPacman.class, "DiffPacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPacman_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffPacman_New_initialPosition(), ecorePackage.getEString(), "new_initialPosition", null, 1, 1, DiffPacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGhostEClass, DiffGhost.class, "DiffGhost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGhost_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGhost_New_strategy(), this.getGhostStrategy(), "new_strategy", null, 1, 1, DiffGhost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGameEClass, DiffGame.class, "DiffGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_lives(), ecorePackage.getEInt(), "new_lives", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGame_New_score(), ecorePackage.getEInt(), "new_score", null, 1, 1, DiffGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_gridnodesEClass, DiffGame_gridnodes.class, "DiffGame_gridnodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_gridnodes_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_gridnodes_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffGame_gridnodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_entitiesEClass, DiffGame_entities.class, "DiffGame_entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_entities_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_entities_EType(), this.getPositionableEntity(), null, "eType", null, 1, 1, DiffGame_entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_domainspecificdiffsEClass, DiffGame_domainspecificdiffs.class, "DiffGame_domainspecificdiffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_domainspecificdiffs_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_domainspecificdiffs_EType(), this.getDomainSpecificDiff(), null, "eType", null, 1, 1, DiffGame_domainspecificdiffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGame_semanticconflictsEClass, DiffGame_semanticconflicts.class, "DiffGame_semanticconflicts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffGame_semanticconflicts_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffGame_semanticconflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffGame_semanticconflicts_EType(), this.getSemanticConflict(), null, "eType", null, 1, 1, DiffGame_semanticconflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffPositionableEntity_onEClass, DiffPositionableEntity_on.class, "DiffPositionableEntity_on", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffPositionableEntity_on_Diff_kind(), this.getAscDiffKind(), "diff_kind", "NON", 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffPositionableEntity_on_EType(), this.getGridNode(), null, "eType", null, 1, 1, DiffPositionableEntity_on.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffFruitEClass, DiffFruit.class, "DiffFruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffFruit_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffFruit_New_value(), ecorePackage.getEInt(), "new_value", null, 1, 1, DiffFruit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEnergizerEClass, DiffEnergizer.class, "DiffEnergizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEnergizer_Diff_kind(), this.getClassDiffKind(), "diff_kind", "NON", 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffEnergizer_New_value(), ecorePackage.getEInt(), "new_value", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffEnergizer_New_durations(), this.get_ListEInt(), null, "new_durations", null, 1, 1, DiffEnergizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_ListEIntEClass, _ListEInt.class, "_ListEInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_ListEInt_Value(), ecorePackage.getEInt(), "value", null, 0, -1, _ListEInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ghostStrategyEEnum, GhostStrategy.class, "GhostStrategy");
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.BLINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.PINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.INKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.CLYDE);

		initEEnum(classDiffKindEEnum, ClassDiffKind.class, "ClassDiffKind");
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.ADD);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.DELETE);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.MODIFY);
		addEEnumLiteral(classDiffKindEEnum, ClassDiffKind.NON);

		initEEnum(ascDiffKindEEnum, AscDiffKind.class, "AscDiffKind");
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.ADD);
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.DELETE);
		addEEnumLiteral(ascDiffKindEEnum, AscDiffKind.NON);

		// Create resource
		createResource(eNS_URI);
	}

} //Pacman2WayDiffMMPackageImpl
