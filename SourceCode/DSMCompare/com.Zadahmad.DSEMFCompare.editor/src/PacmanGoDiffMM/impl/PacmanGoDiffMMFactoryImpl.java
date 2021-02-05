/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanGoDiffMMFactoryImpl extends EFactoryImpl implements PacmanGoDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanGoDiffMMFactory init() {
		try {
			PacmanGoDiffMMFactory thePacmanGoDiffMMFactory = (PacmanGoDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanGoDiffMMPackage.eNS_URI);
			if (thePacmanGoDiffMMFactory != null) {
				return thePacmanGoDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanGoDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoDiffMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PacmanGoDiffMMPackage.GRID_NODE: return createGridNode();
			case PacmanGoDiffMMPackage.FOOD: return createFood();
			case PacmanGoDiffMMPackage.PACMAN: return createPacman();
			case PacmanGoDiffMMPackage.GHOST: return createGhost();
			case PacmanGoDiffMMPackage.SCOREBOARD: return createScoreboard();
			case PacmanGoDiffMMPackage.GAME: return createGame();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE: return createDiffGridNode();
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP: return createDiffGridNode_up();
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM: return createDiffGridNode_bottom();
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT: return createDiffGridNode_left();
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT: return createDiffGridNode_right();
			case PacmanGoDiffMMPackage.DIFF_FOOD: return createDiffFood();
			case PacmanGoDiffMMPackage.DIFF_PACMAN: return createDiffPacman();
			case PacmanGoDiffMMPackage.DIFF_GHOST: return createDiffGhost();
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD: return createDiffScoreboard();
			case PacmanGoDiffMMPackage.DIFF_GAME: return createDiffGame();
			case PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES: return createDiffGame_gridnodes();
			case PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD: return createDiffGame_scoreboard();
			case PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES: return createDiffGame_entities();
			case PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS: return createDiffGame_domainspecificdiffs();
			case PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON: return createDiffPositionableEntity_on();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PacmanGoDiffMMPackage.CLASS_OP:
				return createClassOpFromString(eDataType, initialValue);
			case PacmanGoDiffMMPackage.ASC_OP:
				return createAscOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PacmanGoDiffMMPackage.CLASS_OP:
				return convertClassOpToString(eDataType, instanceValue);
			case PacmanGoDiffMMPackage.ASC_OP:
				return convertAscOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridNode createGridNode() {
		GridNodeImpl gridNode = new GridNodeImpl();
		return gridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Food createFood() {
		FoodImpl food = new FoodImpl();
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pacman createPacman() {
		PacmanImpl pacman = new PacmanImpl();
		return pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ghost createGhost() {
		GhostImpl ghost = new GhostImpl();
		return ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scoreboard createScoreboard() {
		ScoreboardImpl scoreboard = new ScoreboardImpl();
		return scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGridNode createDiffGridNode() {
		DiffGridNodeImpl diffGridNode = new DiffGridNodeImpl();
		return diffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGridNode_up createDiffGridNode_up() {
		DiffGridNode_upImpl diffGridNode_up = new DiffGridNode_upImpl();
		return diffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGridNode_bottom createDiffGridNode_bottom() {
		DiffGridNode_bottomImpl diffGridNode_bottom = new DiffGridNode_bottomImpl();
		return diffGridNode_bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGridNode_left createDiffGridNode_left() {
		DiffGridNode_leftImpl diffGridNode_left = new DiffGridNode_leftImpl();
		return diffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGridNode_right createDiffGridNode_right() {
		DiffGridNode_rightImpl diffGridNode_right = new DiffGridNode_rightImpl();
		return diffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffFood createDiffFood() {
		DiffFoodImpl diffFood = new DiffFoodImpl();
		return diffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffPacman createDiffPacman() {
		DiffPacmanImpl diffPacman = new DiffPacmanImpl();
		return diffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGhost createDiffGhost() {
		DiffGhostImpl diffGhost = new DiffGhostImpl();
		return diffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffScoreboard createDiffScoreboard() {
		DiffScoreboardImpl diffScoreboard = new DiffScoreboardImpl();
		return diffScoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGame createDiffGame() {
		DiffGameImpl diffGame = new DiffGameImpl();
		return diffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGame_gridnodes createDiffGame_gridnodes() {
		DiffGame_gridnodesImpl diffGame_gridnodes = new DiffGame_gridnodesImpl();
		return diffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGame_scoreboard createDiffGame_scoreboard() {
		DiffGame_scoreboardImpl diffGame_scoreboard = new DiffGame_scoreboardImpl();
		return diffGame_scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGame_entities createDiffGame_entities() {
		DiffGame_entitiesImpl diffGame_entities = new DiffGame_entitiesImpl();
		return diffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffGame_domainspecificdiffs createDiffGame_domainspecificdiffs() {
		DiffGame_domainspecificdiffsImpl diffGame_domainspecificdiffs = new DiffGame_domainspecificdiffsImpl();
		return diffGame_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffPositionableEntity_on createDiffPositionableEntity_on() {
		DiffPositionableEntity_onImpl diffPositionableEntity_on = new DiffPositionableEntity_onImpl();
		return diffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp createClassOpFromString(EDataType eDataType, String initialValue) {
		ClassOp result = ClassOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscOp createAscOpFromString(EDataType eDataType, String initialValue) {
		AscOp result = AscOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacmanGoDiffMMPackage getPacmanGoDiffMMPackage() {
		return (PacmanGoDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanGoDiffMMPackage getPackage() {
		return PacmanGoDiffMMPackage.eINSTANCE;
	}

} //PacmanGoDiffMMFactoryImpl
