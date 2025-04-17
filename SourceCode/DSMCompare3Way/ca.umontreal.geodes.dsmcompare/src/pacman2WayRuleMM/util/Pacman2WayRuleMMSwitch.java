/**
 */
package pacman2WayRuleMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pacman2WayDiffMM.DiffEnergizer;
import pacman2WayDiffMM.DiffFood;
import pacman2WayDiffMM.DiffFruit;
import pacman2WayDiffMM.DiffGame;
import pacman2WayDiffMM.DiffGame_entities;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.DiffGhost;
import pacman2WayDiffMM.DiffGridNode;
import pacman2WayDiffMM.DiffGridNode_down;
import pacman2WayDiffMM.DiffGridNode_left;
import pacman2WayDiffMM.DiffGridNode_right;
import pacman2WayDiffMM.DiffGridNode_up;
import pacman2WayDiffMM.DiffPacman;
import pacman2WayDiffMM.DiffPositionableEntity_on;
import pacman2WayDiffMM.Energizer;
import pacman2WayDiffMM.Food;
import pacman2WayDiffMM.Fruit;
import pacman2WayDiffMM.Game;
import pacman2WayDiffMM.Ghost;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman;
import pacman2WayDiffMM.PositionableEntity;
import pacman2WayDiffMM.SemanticConflict;
import pacman2WayDiffMM.SemanticDiff;
import pacman2WayDiffMM.SemanticObject;
import pacman2WayDiffMM._ListEInt;

import pacman2WayRuleMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage
 * @generated
 */
public class Pacman2WayRuleMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pacman2WayRuleMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayRuleMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Pacman2WayRuleMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Pacman2WayRuleMMPackage.PATTERN_GRID_NODE: {
				Pattern_GridNode pattern_GridNode = (Pattern_GridNode)theEObject;
				T result = casePattern_GridNode(pattern_GridNode);
				if (result == null) result = caseGridNode(pattern_GridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_FOOD: {
				Pattern_Food pattern_Food = (Pattern_Food)theEObject;
				T result = casePattern_Food(pattern_Food);
				if (result == null) result = caseFood(pattern_Food);
				if (result == null) result = casePositionableEntity(pattern_Food);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_PACMAN: {
				Pattern_Pacman pattern_Pacman = (Pattern_Pacman)theEObject;
				T result = casePattern_Pacman(pattern_Pacman);
				if (result == null) result = casePacman(pattern_Pacman);
				if (result == null) result = casePositionableEntity(pattern_Pacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_GHOST: {
				Pattern_Ghost pattern_Ghost = (Pattern_Ghost)theEObject;
				T result = casePattern_Ghost(pattern_Ghost);
				if (result == null) result = caseGhost(pattern_Ghost);
				if (result == null) result = casePositionableEntity(pattern_Ghost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_GAME: {
				Pattern_Game pattern_Game = (Pattern_Game)theEObject;
				T result = casePattern_Game(pattern_Game);
				if (result == null) result = caseGame(pattern_Game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_POSITIONABLE_ENTITY: {
				Pattern_PositionableEntity pattern_PositionableEntity = (Pattern_PositionableEntity)theEObject;
				T result = casePattern_PositionableEntity(pattern_PositionableEntity);
				if (result == null) result = casePositionableEntity(pattern_PositionableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_FRUIT: {
				Pattern_Fruit pattern_Fruit = (Pattern_Fruit)theEObject;
				T result = casePattern_Fruit(pattern_Fruit);
				if (result == null) result = caseFruit(pattern_Fruit);
				if (result == null) result = caseFood(pattern_Fruit);
				if (result == null) result = casePositionableEntity(pattern_Fruit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_ENERGIZER: {
				Pattern_Energizer pattern_Energizer = (Pattern_Energizer)theEObject;
				T result = casePattern_Energizer(pattern_Energizer);
				if (result == null) result = caseEnergizer(pattern_Energizer);
				if (result == null) result = caseFood(pattern_Energizer);
				if (result == null) result = casePositionableEntity(pattern_Energizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_SEMANTIC_OBJECT: {
				Pattern_SemanticObject pattern_SemanticObject = (Pattern_SemanticObject)theEObject;
				T result = casePattern_SemanticObject(pattern_SemanticObject);
				if (result == null) result = caseSemanticObject(pattern_SemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_SEMANTIC_DIFF: {
				Pattern_SemanticDiff pattern_SemanticDiff = (Pattern_SemanticDiff)theEObject;
				T result = casePattern_SemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticDiff(pattern_SemanticDiff);
				if (result == null) result = caseSemanticObject(pattern_SemanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_SEMANTIC_CONFLICT: {
				Pattern_SemanticConflict pattern_SemanticConflict = (Pattern_SemanticConflict)theEObject;
				T result = casePattern_SemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticConflict(pattern_SemanticConflict);
				if (result == null) result = caseSemanticObject(pattern_SemanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE: {
				Pattern_DiffGridNode pattern_DiffGridNode = (Pattern_DiffGridNode)theEObject;
				T result = casePattern_DiffGridNode(pattern_DiffGridNode);
				if (result == null) result = caseDiffGridNode(pattern_DiffGridNode);
				if (result == null) result = caseGridNode(pattern_DiffGridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP: {
				Pattern_DiffGridNode_up pattern_DiffGridNode_up = (Pattern_DiffGridNode_up)theEObject;
				T result = casePattern_DiffGridNode_up(pattern_DiffGridNode_up);
				if (result == null) result = caseDiffGridNode_up(pattern_DiffGridNode_up);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_DOWN: {
				Pattern_DiffGridNode_down pattern_DiffGridNode_down = (Pattern_DiffGridNode_down)theEObject;
				T result = casePattern_DiffGridNode_down(pattern_DiffGridNode_down);
				if (result == null) result = caseDiffGridNode_down(pattern_DiffGridNode_down);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_LEFT: {
				Pattern_DiffGridNode_left pattern_DiffGridNode_left = (Pattern_DiffGridNode_left)theEObject;
				T result = casePattern_DiffGridNode_left(pattern_DiffGridNode_left);
				if (result == null) result = caseDiffGridNode_left(pattern_DiffGridNode_left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_RIGHT: {
				Pattern_DiffGridNode_right pattern_DiffGridNode_right = (Pattern_DiffGridNode_right)theEObject;
				T result = casePattern_DiffGridNode_right(pattern_DiffGridNode_right);
				if (result == null) result = caseDiffGridNode_right(pattern_DiffGridNode_right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_FOOD: {
				Pattern_DiffFood pattern_DiffFood = (Pattern_DiffFood)theEObject;
				T result = casePattern_DiffFood(pattern_DiffFood);
				if (result == null) result = caseDiffFood(pattern_DiffFood);
				if (result == null) result = caseFood(pattern_DiffFood);
				if (result == null) result = casePositionableEntity(pattern_DiffFood);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_PACMAN: {
				Pattern_DiffPacman pattern_DiffPacman = (Pattern_DiffPacman)theEObject;
				T result = casePattern_DiffPacman(pattern_DiffPacman);
				if (result == null) result = caseDiffPacman(pattern_DiffPacman);
				if (result == null) result = casePacman(pattern_DiffPacman);
				if (result == null) result = casePositionableEntity(pattern_DiffPacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GHOST: {
				Pattern_DiffGhost pattern_DiffGhost = (Pattern_DiffGhost)theEObject;
				T result = casePattern_DiffGhost(pattern_DiffGhost);
				if (result == null) result = caseDiffGhost(pattern_DiffGhost);
				if (result == null) result = caseGhost(pattern_DiffGhost);
				if (result == null) result = casePositionableEntity(pattern_DiffGhost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME: {
				Pattern_DiffGame pattern_DiffGame = (Pattern_DiffGame)theEObject;
				T result = casePattern_DiffGame(pattern_DiffGame);
				if (result == null) result = caseDiffGame(pattern_DiffGame);
				if (result == null) result = caseGame(pattern_DiffGame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME_GRIDNODES: {
				Pattern_DiffGame_gridnodes pattern_DiffGame_gridnodes = (Pattern_DiffGame_gridnodes)theEObject;
				T result = casePattern_DiffGame_gridnodes(pattern_DiffGame_gridnodes);
				if (result == null) result = caseDiffGame_gridnodes(pattern_DiffGame_gridnodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GAME_ENTITIES: {
				Pattern_DiffGame_entities pattern_DiffGame_entities = (Pattern_DiffGame_entities)theEObject;
				T result = casePattern_DiffGame_entities(pattern_DiffGame_entities);
				if (result == null) result = caseDiffGame_entities(pattern_DiffGame_entities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_POSITIONABLE_ENTITY_ON: {
				Pattern_DiffPositionableEntity_on pattern_DiffPositionableEntity_on = (Pattern_DiffPositionableEntity_on)theEObject;
				T result = casePattern_DiffPositionableEntity_on(pattern_DiffPositionableEntity_on);
				if (result == null) result = caseDiffPositionableEntity_on(pattern_DiffPositionableEntity_on);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_FRUIT: {
				Pattern_DiffFruit pattern_DiffFruit = (Pattern_DiffFruit)theEObject;
				T result = casePattern_DiffFruit(pattern_DiffFruit);
				if (result == null) result = caseDiffFruit(pattern_DiffFruit);
				if (result == null) result = caseFruit(pattern_DiffFruit);
				if (result == null) result = caseFood(pattern_DiffFruit);
				if (result == null) result = casePositionableEntity(pattern_DiffFruit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_ENERGIZER: {
				Pattern_DiffEnergizer pattern_DiffEnergizer = (Pattern_DiffEnergizer)theEObject;
				T result = casePattern_DiffEnergizer(pattern_DiffEnergizer);
				if (result == null) result = caseDiffEnergizer(pattern_DiffEnergizer);
				if (result == null) result = caseEnergizer(pattern_DiffEnergizer);
				if (result == null) result = caseFood(pattern_DiffEnergizer);
				if (result == null) result = casePositionableEntity(pattern_DiffEnergizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.PATTERN_LIST_EINT: {
				Pattern__ListEInt pattern__ListEInt = (Pattern__ListEInt)theEObject;
				T result = casePattern__ListEInt(pattern__ListEInt);
				if (result == null) result = case_ListEInt(pattern__ListEInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayRuleMMPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Grid Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_GridNode(Pattern_GridNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Food</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Food</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Food(Pattern_Food object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Pacman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Pacman(Pattern_Pacman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Ghost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Ghost(Pattern_Ghost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Game(Pattern_Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Positionable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Positionable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_PositionableEntity(Pattern_PositionableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Fruit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Fruit(Pattern_Fruit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Energizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_Energizer(Pattern_Energizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticObject(Pattern_SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticDiff(Pattern_SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_SemanticConflict(Pattern_SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGridNode(Pattern_DiffGridNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGridNode_up(Pattern_DiffGridNode_up object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGridNode_down(Pattern_DiffGridNode_down object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGridNode_left(Pattern_DiffGridNode_left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Grid Node right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGridNode_right(Pattern_DiffGridNode_right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Food</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Food</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFood(Pattern_DiffFood object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Pacman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPacman(Pattern_DiffPacman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Ghost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGhost(Pattern_DiffGhost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGame(Pattern_DiffGame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Game gridnodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Game gridnodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGame_gridnodes(Pattern_DiffGame_gridnodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Game entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Game entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffGame_entities(Pattern_DiffGame_entities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Positionable Entity on</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Positionable Entity on</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffPositionableEntity_on(Pattern_DiffPositionableEntity_on object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Fruit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffFruit(Pattern_DiffFruit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Diff Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Diff Energizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern_DiffEnergizer(Pattern_DiffEnergizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern List EInt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern List EInt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern__ListEInt(Pattern__ListEInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridNode(GridNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positionable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positionable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionableEntity(PositionableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFood(Food object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pacman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacman(Pacman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ghost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGhost(Ghost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fruit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFruit(Fruit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergizer(Energizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticObject(SemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticDiff(SemanticDiff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticConflict(SemanticConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode(DiffGridNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode_up(DiffGridNode_up object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode_down(DiffGridNode_down object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode_left(DiffGridNode_left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode_right(DiffGridNode_right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Food</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Food</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFood(DiffFood object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Pacman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPacman(DiffPacman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Ghost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGhost(DiffGhost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGame(DiffGame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Game gridnodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Game gridnodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGame_gridnodes(DiffGame_gridnodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Game entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Game entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGame_entities(DiffGame_entities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Positionable Entity on</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Positionable Entity on</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffPositionableEntity_on(DiffPositionableEntity_on object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Fruit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffFruit(DiffFruit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Energizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffEnergizer(DiffEnergizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List EInt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List EInt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_ListEInt(_ListEInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Pacman2WayRuleMMSwitch
