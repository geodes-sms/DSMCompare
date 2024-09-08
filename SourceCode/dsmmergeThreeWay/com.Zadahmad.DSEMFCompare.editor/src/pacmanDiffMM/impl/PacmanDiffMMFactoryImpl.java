/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pacmanDiffMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanDiffMMFactoryImpl extends EFactoryImpl implements PacmanDiffMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanDiffMMFactory init() {
		try {
			PacmanDiffMMFactory thePacmanDiffMMFactory = (PacmanDiffMMFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanDiffMMPackage.eNS_URI);
			if (thePacmanDiffMMFactory != null) {
				return thePacmanDiffMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanDiffMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDiffMMFactoryImpl() {
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
			case PacmanDiffMMPackage.GRID_NODE: return createGridNode();
			case PacmanDiffMMPackage.FOOD: return createFood();
			case PacmanDiffMMPackage.PACMAN: return createPacman();
			case PacmanDiffMMPackage.GHOST: return createGhost();
			case PacmanDiffMMPackage.GAME: return createGame();
			case PacmanDiffMMPackage.FRUIT: return createFruit();
			case PacmanDiffMMPackage.ENERGIZER: return createEnergizer();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF: return createDomainSpecificDiff();
			case PacmanDiffMMPackage.SEMANTIC_CONFLICT: return createSemanticConflict();
			case PacmanDiffMMPackage.DIFF_GRID_NODE: return createDiffGridNode();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_UP: return createDiffGridNode_up();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN: return createDiffGridNode_down();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_LEFT: return createDiffGridNode_left();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_RIGHT: return createDiffGridNode_right();
			case PacmanDiffMMPackage.DIFF_FOOD: return createDiffFood();
			case PacmanDiffMMPackage.DIFF_PACMAN: return createDiffPacman();
			case PacmanDiffMMPackage.DIFF_GHOST: return createDiffGhost();
			case PacmanDiffMMPackage.DIFF_GAME: return createDiffGame();
			case PacmanDiffMMPackage.DIFF_GAME_GRIDNODES: return createDiffGame_gridnodes();
			case PacmanDiffMMPackage.DIFF_GAME_ENTITIES: return createDiffGame_entities();
			case PacmanDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS: return createDiffGame_domainspecificdiffs();
			case PacmanDiffMMPackage.DIFF_GAME_SEMANTICCONFLICTS: return createDiffGame_semanticconflicts();
			case PacmanDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON: return createDiffPositionableEntity_on();
			case PacmanDiffMMPackage.DIFF_FRUIT: return createDiffFruit();
			case PacmanDiffMMPackage.DIFF_ENERGIZER: return createDiffEnergizer();
			case PacmanDiffMMPackage._LIST_EINT: return create_ListEInt();
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
			case PacmanDiffMMPackage.GHOST_STRATEGY:
				return createGhostStrategyFromString(eDataType, initialValue);
			case PacmanDiffMMPackage.CLASS_DIFF_KIND:
				return createClassDiffKindFromString(eDataType, initialValue);
			case PacmanDiffMMPackage.ASC_DIFF_KIND:
				return createAscDiffKindFromString(eDataType, initialValue);
			case PacmanDiffMMPackage.AUTHOR:
				return createAUTHORFromString(eDataType, initialValue);
			case PacmanDiffMMPackage.CHANGE_STATUS:
				return createChangeStatusFromString(eDataType, initialValue);
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
			case PacmanDiffMMPackage.GHOST_STRATEGY:
				return convertGhostStrategyToString(eDataType, instanceValue);
			case PacmanDiffMMPackage.CLASS_DIFF_KIND:
				return convertClassDiffKindToString(eDataType, instanceValue);
			case PacmanDiffMMPackage.ASC_DIFF_KIND:
				return convertAscDiffKindToString(eDataType, instanceValue);
			case PacmanDiffMMPackage.AUTHOR:
				return convertAUTHORToString(eDataType, instanceValue);
			case PacmanDiffMMPackage.CHANGE_STATUS:
				return convertChangeStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode createGridNode() {
		GridNodeImpl gridNode = new GridNodeImpl();
		return gridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Food createFood() {
		FoodImpl food = new FoodImpl();
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman createPacman() {
		PacmanImpl pacman = new PacmanImpl();
		return pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ghost createGhost() {
		GhostImpl ghost = new GhostImpl();
		return ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fruit createFruit() {
		FruitImpl fruit = new FruitImpl();
		return fruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energizer createEnergizer() {
		EnergizerImpl energizer = new EnergizerImpl();
		return energizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificDiff createDomainSpecificDiff() {
		DomainSpecificDiffImpl domainSpecificDiff = new DomainSpecificDiffImpl();
		return domainSpecificDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticConflict createSemanticConflict() {
		SemanticConflictImpl semanticConflict = new SemanticConflictImpl();
		return semanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNode createDiffGridNode() {
		DiffGridNodeImpl diffGridNode = new DiffGridNodeImpl();
		return diffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNode_up createDiffGridNode_up() {
		DiffGridNode_upImpl diffGridNode_up = new DiffGridNode_upImpl();
		return diffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNode_down createDiffGridNode_down() {
		DiffGridNode_downImpl diffGridNode_down = new DiffGridNode_downImpl();
		return diffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNode_left createDiffGridNode_left() {
		DiffGridNode_leftImpl diffGridNode_left = new DiffGridNode_leftImpl();
		return diffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGridNode_right createDiffGridNode_right() {
		DiffGridNode_rightImpl diffGridNode_right = new DiffGridNode_rightImpl();
		return diffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFood createDiffFood() {
		DiffFoodImpl diffFood = new DiffFoodImpl();
		return diffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPacman createDiffPacman() {
		DiffPacmanImpl diffPacman = new DiffPacmanImpl();
		return diffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGhost createDiffGhost() {
		DiffGhostImpl diffGhost = new DiffGhostImpl();
		return diffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGame createDiffGame() {
		DiffGameImpl diffGame = new DiffGameImpl();
		return diffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGame_gridnodes createDiffGame_gridnodes() {
		DiffGame_gridnodesImpl diffGame_gridnodes = new DiffGame_gridnodesImpl();
		return diffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGame_entities createDiffGame_entities() {
		DiffGame_entitiesImpl diffGame_entities = new DiffGame_entitiesImpl();
		return diffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGame_domainspecificdiffs createDiffGame_domainspecificdiffs() {
		DiffGame_domainspecificdiffsImpl diffGame_domainspecificdiffs = new DiffGame_domainspecificdiffsImpl();
		return diffGame_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGame_semanticconflicts createDiffGame_semanticconflicts() {
		DiffGame_semanticconflictsImpl diffGame_semanticconflicts = new DiffGame_semanticconflictsImpl();
		return diffGame_semanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPositionableEntity_on createDiffPositionableEntity_on() {
		DiffPositionableEntity_onImpl diffPositionableEntity_on = new DiffPositionableEntity_onImpl();
		return diffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFruit createDiffFruit() {
		DiffFruitImpl diffFruit = new DiffFruitImpl();
		return diffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEnergizer createDiffEnergizer() {
		DiffEnergizerImpl diffEnergizer = new DiffEnergizerImpl();
		return diffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _ListEInt create_ListEInt() {
		_ListEIntImpl _ListEInt = new _ListEIntImpl();
		return _ListEInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostStrategy createGhostStrategyFromString(EDataType eDataType, String initialValue) {
		GhostStrategy result = GhostStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGhostStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind createClassDiffKindFromString(EDataType eDataType, String initialValue) {
		ClassDiffKind result = ClassDiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscDiffKind createAscDiffKindFromString(EDataType eDataType, String initialValue) {
		AscDiffKind result = AscDiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAscDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHOR createAUTHORFromString(EDataType eDataType, String initialValue) {
		AUTHOR result = AUTHOR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAUTHORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus createChangeStatusFromString(EDataType eDataType, String initialValue) {
		ChangeStatus result = ChangeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDiffMMPackage getPacmanDiffMMPackage() {
		return (PacmanDiffMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanDiffMMPackage getPackage() {
		return PacmanDiffMMPackage.eINSTANCE;
	}

} //PacmanDiffMMFactoryImpl
