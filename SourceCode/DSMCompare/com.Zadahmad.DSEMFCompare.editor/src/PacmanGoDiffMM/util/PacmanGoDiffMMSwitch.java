/**
 */
package PacmanGoDiffMM.util;

import PacmanGoDiffMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage
 * @generated
 */
public class PacmanGoDiffMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanGoDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoDiffMMSwitch() {
		if (modelPackage == null) {
			modelPackage = PacmanGoDiffMMPackage.eINSTANCE;
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
			case PacmanGoDiffMMPackage.GRID_NODE: {
				GridNode gridNode = (GridNode)theEObject;
				T result = caseGridNode(gridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.FOOD: {
				Food food = (Food)theEObject;
				T result = caseFood(food);
				if (result == null) result = casePositionableEntity(food);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.PACMAN: {
				Pacman pacman = (Pacman)theEObject;
				T result = casePacman(pacman);
				if (result == null) result = casePositionableEntity(pacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.GHOST: {
				Ghost ghost = (Ghost)theEObject;
				T result = caseGhost(ghost);
				if (result == null) result = casePositionableEntity(ghost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.SCOREBOARD: {
				Scoreboard scoreboard = (Scoreboard)theEObject;
				T result = caseScoreboard(scoreboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.POSITIONABLE_ENTITY: {
				PositionableEntity positionableEntity = (PositionableEntity)theEObject;
				T result = casePositionableEntity(positionableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF: {
				DomainSpecificDiff domainSpecificDiff = (DomainSpecificDiff)theEObject;
				T result = caseDomainSpecificDiff(domainSpecificDiff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE: {
				DiffGridNode diffGridNode = (DiffGridNode)theEObject;
				T result = caseDiffGridNode(diffGridNode);
				if (result == null) result = caseGridNode(diffGridNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_UP: {
				DiffGridNode_up diffGridNode_up = (DiffGridNode_up)theEObject;
				T result = caseDiffGridNode_up(diffGridNode_up);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_BOTTOM: {
				DiffGridNode_bottom diffGridNode_bottom = (DiffGridNode_bottom)theEObject;
				T result = caseDiffGridNode_bottom(diffGridNode_bottom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_LEFT: {
				DiffGridNode_left diffGridNode_left = (DiffGridNode_left)theEObject;
				T result = caseDiffGridNode_left(diffGridNode_left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GRID_NODE_RIGHT: {
				DiffGridNode_right diffGridNode_right = (DiffGridNode_right)theEObject;
				T result = caseDiffGridNode_right(diffGridNode_right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_FOOD: {
				DiffFood diffFood = (DiffFood)theEObject;
				T result = caseDiffFood(diffFood);
				if (result == null) result = caseFood(diffFood);
				if (result == null) result = casePositionableEntity(diffFood);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_PACMAN: {
				DiffPacman diffPacman = (DiffPacman)theEObject;
				T result = caseDiffPacman(diffPacman);
				if (result == null) result = casePacman(diffPacman);
				if (result == null) result = casePositionableEntity(diffPacman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GHOST: {
				DiffGhost diffGhost = (DiffGhost)theEObject;
				T result = caseDiffGhost(diffGhost);
				if (result == null) result = caseGhost(diffGhost);
				if (result == null) result = casePositionableEntity(diffGhost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD: {
				DiffScoreboard diffScoreboard = (DiffScoreboard)theEObject;
				T result = caseDiffScoreboard(diffScoreboard);
				if (result == null) result = caseScoreboard(diffScoreboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GAME: {
				DiffGame diffGame = (DiffGame)theEObject;
				T result = caseDiffGame(diffGame);
				if (result == null) result = caseGame(diffGame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GAME_GRIDNODES: {
				DiffGame_gridnodes diffGame_gridnodes = (DiffGame_gridnodes)theEObject;
				T result = caseDiffGame_gridnodes(diffGame_gridnodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GAME_SCOREBOARD: {
				DiffGame_scoreboard diffGame_scoreboard = (DiffGame_scoreboard)theEObject;
				T result = caseDiffGame_scoreboard(diffGame_scoreboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GAME_ENTITIES: {
				DiffGame_entities diffGame_entities = (DiffGame_entities)theEObject;
				T result = caseDiffGame_entities(diffGame_entities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_GAME_DOMAINSPECIFICDIFFS: {
				DiffGame_domainspecificdiffs diffGame_domainspecificdiffs = (DiffGame_domainspecificdiffs)theEObject;
				T result = caseDiffGame_domainspecificdiffs(diffGame_domainspecificdiffs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PacmanGoDiffMMPackage.DIFF_POSITIONABLE_ENTITY_ON: {
				DiffPositionableEntity_on diffPositionableEntity_on = (DiffPositionableEntity_on)theEObject;
				T result = caseDiffPositionableEntity_on(diffPositionableEntity_on);
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
	 * Returns the result of interpreting the object as an instance of '<em>Scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoreboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreboard(Scoreboard object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Diff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificDiff(DomainSpecificDiff object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff Grid Node bottom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Grid Node bottom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGridNode_bottom(DiffGridNode_bottom object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff Scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Scoreboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffScoreboard(DiffScoreboard object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff Game scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Game scoreboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGame_scoreboard(DiffGame_scoreboard object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diff Game domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Game domainspecificdiffs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffGame_domainspecificdiffs(DiffGame_domainspecificdiffs object) {
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

} //PacmanGoDiffMMSwitch
