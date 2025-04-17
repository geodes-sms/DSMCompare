/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pacmanCRRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanCRRuleMMFactoryImpl extends EFactoryImpl implements PacmanCRRuleMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanCRRuleMMFactory init() {
		try {
			PacmanCRRuleMMFactory thePacmanCRRuleMMFactory = (PacmanCRRuleMMFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanCRRuleMMPackage.eNS_URI);
			if (thePacmanCRRuleMMFactory != null) {
				return thePacmanCRRuleMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanCRRuleMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanCRRuleMMFactoryImpl() {
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
			case PacmanCRRuleMMPackage.PATTERN_CONFLICT_RESOLUTION: return createPattern_ConflictResolution();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER: return createPattern_DiffEnergizer();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FOOD: return createPattern_DiffFood();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT: return createPattern_DiffFruit();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME: return createPattern_DiffGame();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME_ENTITIES: return createPattern_DiffGame_entities();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME_GRIDNODES: return createPattern_DiffGame_gridnodes();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GHOST: return createPattern_DiffGhost();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GRID_NODE: return createPattern_DiffGridNode();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GRID_NODE_DOWN: return createPattern_DiffGridNode_down();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GRID_NODE_LEFT: return createPattern_DiffGridNode_left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GRID_NODE_RIGHT: return createPattern_DiffGridNode_right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP: return createPattern_DiffGridNode_up();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN: return createPattern_DiffPacman();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_POSITIONABLE_ENTITY_ON: return createPattern_DiffPositionableEntity_on();
			case PacmanCRRuleMMPackage.PATTERN_ENERGIZER: return createPattern_Energizer();
			case PacmanCRRuleMMPackage.PATTERN_FOOD: return createPattern_Food();
			case PacmanCRRuleMMPackage.PATTERN_FRUIT: return createPattern_Fruit();
			case PacmanCRRuleMMPackage.PATTERN_GAME: return createPattern_Game();
			case PacmanCRRuleMMPackage.PATTERN_GHOST: return createPattern_Ghost();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE: return createPattern_GridNode();
			case PacmanCRRuleMMPackage.PATTERN_PACMAN: return createPattern_Pacman();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: return createPattern_SemanticConflict();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_DIFF: return createPattern_SemanticDiff();
			case PacmanCRRuleMMPackage.PATTERN_LIST_EINT: return createPattern__ListEInt();
			case PacmanCRRuleMMPackage.RULE: return createRule();
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
			case PacmanCRRuleMMPackage.AUTHOR:
				return createAUTHORFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.CHANGE_STATUS:
				return createChangeStatusFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.CONFLICT_GRANULARITY:
				return createConflictGranularityFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return createConflictResolutionStrategyFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.CONFLICT_RESOLUTION_TYPE:
				return createConflictResolutionTypeFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.DIFF_KIND:
				return createDiffKindFromString(eDataType, initialValue);
			case PacmanCRRuleMMPackage.GHOST_STRATEGY:
				return createGhostStrategyFromString(eDataType, initialValue);
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
			case PacmanCRRuleMMPackage.AUTHOR:
				return convertAUTHORToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.CHANGE_STATUS:
				return convertChangeStatusToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.CONFLICT_GRANULARITY:
				return convertConflictGranularityToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.CONFLICT_RESOLUTION_STRATEGY:
				return convertConflictResolutionStrategyToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.CONFLICT_RESOLUTION_TYPE:
				return convertConflictResolutionTypeToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.DIFF_KIND:
				return convertDiffKindToString(eDataType, instanceValue);
			case PacmanCRRuleMMPackage.GHOST_STRATEGY:
				return convertGhostStrategyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_ConflictResolution createPattern_ConflictResolution() {
		Pattern_ConflictResolutionImpl pattern_ConflictResolution = new Pattern_ConflictResolutionImpl();
		return pattern_ConflictResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffEnergizer createPattern_DiffEnergizer() {
		Pattern_DiffEnergizerImpl pattern_DiffEnergizer = new Pattern_DiffEnergizerImpl();
		return pattern_DiffEnergizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffFood createPattern_DiffFood() {
		Pattern_DiffFoodImpl pattern_DiffFood = new Pattern_DiffFoodImpl();
		return pattern_DiffFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffFruit createPattern_DiffFruit() {
		Pattern_DiffFruitImpl pattern_DiffFruit = new Pattern_DiffFruitImpl();
		return pattern_DiffFruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame createPattern_DiffGame() {
		Pattern_DiffGameImpl pattern_DiffGame = new Pattern_DiffGameImpl();
		return pattern_DiffGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame_entities createPattern_DiffGame_entities() {
		Pattern_DiffGame_entitiesImpl pattern_DiffGame_entities = new Pattern_DiffGame_entitiesImpl();
		return pattern_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGame_gridnodes createPattern_DiffGame_gridnodes() {
		Pattern_DiffGame_gridnodesImpl pattern_DiffGame_gridnodes = new Pattern_DiffGame_gridnodesImpl();
		return pattern_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGhost createPattern_DiffGhost() {
		Pattern_DiffGhostImpl pattern_DiffGhost = new Pattern_DiffGhostImpl();
		return pattern_DiffGhost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode createPattern_DiffGridNode() {
		Pattern_DiffGridNodeImpl pattern_DiffGridNode = new Pattern_DiffGridNodeImpl();
		return pattern_DiffGridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_down createPattern_DiffGridNode_down() {
		Pattern_DiffGridNode_downImpl pattern_DiffGridNode_down = new Pattern_DiffGridNode_downImpl();
		return pattern_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_left createPattern_DiffGridNode_left() {
		Pattern_DiffGridNode_leftImpl pattern_DiffGridNode_left = new Pattern_DiffGridNode_leftImpl();
		return pattern_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_right createPattern_DiffGridNode_right() {
		Pattern_DiffGridNode_rightImpl pattern_DiffGridNode_right = new Pattern_DiffGridNode_rightImpl();
		return pattern_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffGridNode_up createPattern_DiffGridNode_up() {
		Pattern_DiffGridNode_upImpl pattern_DiffGridNode_up = new Pattern_DiffGridNode_upImpl();
		return pattern_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPacman createPattern_DiffPacman() {
		Pattern_DiffPacmanImpl pattern_DiffPacman = new Pattern_DiffPacmanImpl();
		return pattern_DiffPacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_DiffPositionableEntity_on createPattern_DiffPositionableEntity_on() {
		Pattern_DiffPositionableEntity_onImpl pattern_DiffPositionableEntity_on = new Pattern_DiffPositionableEntity_onImpl();
		return pattern_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Energizer createPattern_Energizer() {
		Pattern_EnergizerImpl pattern_Energizer = new Pattern_EnergizerImpl();
		return pattern_Energizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Food createPattern_Food() {
		Pattern_FoodImpl pattern_Food = new Pattern_FoodImpl();
		return pattern_Food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Fruit createPattern_Fruit() {
		Pattern_FruitImpl pattern_Fruit = new Pattern_FruitImpl();
		return pattern_Fruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Game createPattern_Game() {
		Pattern_GameImpl pattern_Game = new Pattern_GameImpl();
		return pattern_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Ghost createPattern_Ghost() {
		Pattern_GhostImpl pattern_Ghost = new Pattern_GhostImpl();
		return pattern_Ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode createPattern_GridNode() {
		Pattern_GridNodeImpl pattern_GridNode = new Pattern_GridNodeImpl();
		return pattern_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Pacman createPattern_Pacman() {
		Pattern_PacmanImpl pattern_Pacman = new Pattern_PacmanImpl();
		return pattern_Pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticConflict createPattern_SemanticConflict() {
		Pattern_SemanticConflictImpl pattern_SemanticConflict = new Pattern_SemanticConflictImpl();
		return pattern_SemanticConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_SemanticDiff createPattern_SemanticDiff() {
		Pattern_SemanticDiffImpl pattern_SemanticDiff = new Pattern_SemanticDiffImpl();
		return pattern_SemanticDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern__ListEInt createPattern__ListEInt() {
		Pattern__ListEIntImpl pattern__ListEInt = new Pattern__ListEIntImpl();
		return pattern__ListEInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
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
	public ConflictGranularity createConflictGranularityFromString(EDataType eDataType, String initialValue) {
		ConflictGranularity result = ConflictGranularity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictGranularityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionStrategy createConflictResolutionStrategyFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionStrategy result = ConflictResolutionStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionType createConflictResolutionTypeFromString(EDataType eDataType, String initialValue) {
		ConflictResolutionType result = ConflictResolutionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConflictResolutionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind createDiffKindFromString(EDataType eDataType, String initialValue) {
		DiffKind result = DiffKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public PacmanCRRuleMMPackage getPacmanCRRuleMMPackage() {
		return (PacmanCRRuleMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanCRRuleMMPackage getPackage() {
		return PacmanCRRuleMMPackage.eINSTANCE;
	}

} //PacmanCRRuleMMFactoryImpl
