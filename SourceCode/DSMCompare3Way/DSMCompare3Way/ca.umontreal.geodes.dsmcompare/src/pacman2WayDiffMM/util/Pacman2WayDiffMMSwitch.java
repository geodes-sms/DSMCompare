/**
 */
package pacman2WayDiffMM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pacman2WayDiffMM.*;

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
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage
 * @generated
 */
public class Pacman2WayDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pacman2WayDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pacman2WayDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = Pacman2WayDiffMMPackage.eINSTANCE;
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
			case Pacman2WayDiffMMPackage.GRID_NODE: {
				GridNode gridNode = (GridNode)theEObject;
				T result = caseGridNode(gridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.FOOD: {
				Food food = (Food)theEObject;
				T result = caseFood(food);
				if (result == null) result = casePositionableEntity(food);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.PACMAN: {
				Pacman pacman = (Pacman)theEObject;
				T result = casePacman(pacman);
				if (result == null) result = casePositionableEntity(pacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.GHOST: {
				Ghost ghost = (Ghost)theEObject;
				T result = caseGhost(ghost);
				if (result == null) result = casePositionableEntity(ghost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY: {
				PositionableEntity positionableEntity = (PositionableEntity)theEObject;
				T result = casePositionableEntity(positionableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.FRUIT: {
				Fruit fruit = (Fruit)theEObject;
				T result = caseFruit(fruit);
				if (result == null) result = caseFood(fruit);
				if (result == null) result = casePositionableEntity(fruit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.ENERGIZER: {
				Energizer energizer = (Energizer)theEObject;
				T result = caseEnergizer(energizer);
				if (result == null) result = caseFood(energizer);
				if (result == null) result = casePositionableEntity(energizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.SEMANTIC_OBJECT: {
				SemanticObject semanticObject = (SemanticObject)theEObject;
				T result = caseSemanticObject(semanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.SEMANTIC_DIFF: {
				SemanticDiff semanticDiff = (SemanticDiff)theEObject;
				T result = caseSemanticDiff(semanticDiff);
				if (result == null) result = caseSemanticObject(semanticDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.SEMANTIC_CONFLICT: {
				SemanticConflict semanticConflict = (SemanticConflict)theEObject;
				T result = caseSemanticConflict(semanticConflict);
				if (result == null) result = caseSemanticObject(semanticConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE: {
				DiffGridNode diffGridNode = (DiffGridNode)theEObject;
				T result = caseDiffGridNode(diffGridNode);
				if (result == null) result = caseGridNode(diffGridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE_UP: {
				DiffGridNode_up diffGridNode_up = (DiffGridNode_up)theEObject;
				T result = caseDiffGridNode_up(diffGridNode_up);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE_DOWN: {
				DiffGridNode_down diffGridNode_down = (DiffGridNode_down)theEObject;
				T result = caseDiffGridNode_down(diffGridNode_down);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE_LEFT: {
				DiffGridNode_left diffGridNode_left = (DiffGridNode_left)theEObject;
				T result = caseDiffGridNode_left(diffGridNode_left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE_RIGHT: {
				DiffGridNode_right diffGridNode_right = (DiffGridNode_right)theEObject;
				T result = caseDiffGridNode_right(diffGridNode_right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_FOOD: {
				DiffFood diffFood = (DiffFood)theEObject;
				T result = caseDiffFood(diffFood);
				if (result == null) result = caseFood(diffFood);
				if (result == null) result = casePositionableEntity(diffFood);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_PACMAN: {
				DiffPacman diffPacman = (DiffPacman)theEObject;
				T result = caseDiffPacman(diffPacman);
				if (result == null) result = casePacman(diffPacman);
				if (result == null) result = casePositionableEntity(diffPacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GHOST: {
				DiffGhost diffGhost = (DiffGhost)theEObject;
				T result = caseDiffGhost(diffGhost);
				if (result == null) result = caseGhost(diffGhost);
				if (result == null) result = casePositionableEntity(diffGhost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GAME: {
				DiffGame diffGame = (DiffGame)theEObject;
				T result = caseDiffGame(diffGame);
				if (result == null) result = caseGame(diffGame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES: {
				DiffGame_gridnodes diffGame_gridnodes = (DiffGame_gridnodes)theEObject;
				T result = caseDiffGame_gridnodes(diffGame_gridnodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_GAME_ENTITIES: {
				DiffGame_entities diffGame_entities = (DiffGame_entities)theEObject;
				T result = caseDiffGame_entities(diffGame_entities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON: {
				DiffPositionableEntity_on diffPositionableEntity_on = (DiffPositionableEntity_on)theEObject;
				T result = caseDiffPositionableEntity_on(diffPositionableEntity_on);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_FRUIT: {
				DiffFruit diffFruit = (DiffFruit)theEObject;
				T result = caseDiffFruit(diffFruit);
				if (result == null) result = caseFruit(diffFruit);
				if (result == null) result = caseFood(diffFruit);
				if (result == null) result = casePositionableEntity(diffFruit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER: {
				DiffEnergizer diffEnergizer = (DiffEnergizer)theEObject;
				T result = caseDiffEnergizer(diffEnergizer);
				if (result == null) result = caseEnergizer(diffEnergizer);
				if (result == null) result = caseFood(diffEnergizer);
				if (result == null) result = casePositionableEntity(diffEnergizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pacman2WayDiffMMPackage._LIST_EINT: {
				_ListEInt _ListEInt = (_ListEInt)theEObject;
				T result = case_ListEInt(_ListEInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //Pacman2WayDiffMMSwitch
