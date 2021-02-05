/**
 */
package PacmanGoDiffMM.util;

import PacmanGoDiffMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage
 * @generated
 */
public class PacmanGoDiffMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanGoDiffMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoDiffMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PacmanGoDiffMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanGoDiffMMSwitch<Adapter> modelSwitch =
		new PacmanGoDiffMMSwitch<Adapter>() {
			@Override
			public Adapter caseGridNode(GridNode object) {
				return createGridNodeAdapter();
			}
			@Override
			public Adapter caseFood(Food object) {
				return createFoodAdapter();
			}
			@Override
			public Adapter casePacman(Pacman object) {
				return createPacmanAdapter();
			}
			@Override
			public Adapter caseGhost(Ghost object) {
				return createGhostAdapter();
			}
			@Override
			public Adapter caseScoreboard(Scoreboard object) {
				return createScoreboardAdapter();
			}
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter casePositionableEntity(PositionableEntity object) {
				return createPositionableEntityAdapter();
			}
			@Override
			public Adapter caseDomainSpecificDiff(DomainSpecificDiff object) {
				return createDomainSpecificDiffAdapter();
			}
			@Override
			public Adapter caseDiffGridNode(DiffGridNode object) {
				return createDiffGridNodeAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_up(DiffGridNode_up object) {
				return createDiffGridNode_upAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_bottom(DiffGridNode_bottom object) {
				return createDiffGridNode_bottomAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_left(DiffGridNode_left object) {
				return createDiffGridNode_leftAdapter();
			}
			@Override
			public Adapter caseDiffGridNode_right(DiffGridNode_right object) {
				return createDiffGridNode_rightAdapter();
			}
			@Override
			public Adapter caseDiffFood(DiffFood object) {
				return createDiffFoodAdapter();
			}
			@Override
			public Adapter caseDiffPacman(DiffPacman object) {
				return createDiffPacmanAdapter();
			}
			@Override
			public Adapter caseDiffGhost(DiffGhost object) {
				return createDiffGhostAdapter();
			}
			@Override
			public Adapter caseDiffScoreboard(DiffScoreboard object) {
				return createDiffScoreboardAdapter();
			}
			@Override
			public Adapter caseDiffGame(DiffGame object) {
				return createDiffGameAdapter();
			}
			@Override
			public Adapter caseDiffGame_gridnodes(DiffGame_gridnodes object) {
				return createDiffGame_gridnodesAdapter();
			}
			@Override
			public Adapter caseDiffGame_scoreboard(DiffGame_scoreboard object) {
				return createDiffGame_scoreboardAdapter();
			}
			@Override
			public Adapter caseDiffGame_entities(DiffGame_entities object) {
				return createDiffGame_entitiesAdapter();
			}
			@Override
			public Adapter caseDiffGame_domainspecificdiffs(DiffGame_domainspecificdiffs object) {
				return createDiffGame_domainspecificdiffsAdapter();
			}
			@Override
			public Adapter caseDiffPositionableEntity_on(DiffPositionableEntity_on object) {
				return createDiffPositionableEntity_onAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.GridNode
	 * @generated
	 */
	public Adapter createGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Food
	 * @generated
	 */
	public Adapter createFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Pacman
	 * @generated
	 */
	public Adapter createPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Ghost
	 * @generated
	 */
	public Adapter createGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Scoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Scoreboard
	 * @generated
	 */
	public Adapter createScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.PositionableEntity
	 * @generated
	 */
	public Adapter createPositionableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DomainSpecificDiff
	 * @generated
	 */
	public Adapter createDomainSpecificDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode <em>Diff Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode
	 * @generated
	 */
	public Adapter createDiffGridNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_up <em>Diff Grid Node up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_up
	 * @generated
	 */
	public Adapter createDiffGridNode_upAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_bottom <em>Diff Grid Node bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_bottom
	 * @generated
	 */
	public Adapter createDiffGridNode_bottomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_left <em>Diff Grid Node left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_left
	 * @generated
	 */
	public Adapter createDiffGridNode_leftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGridNode_right <em>Diff Grid Node right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGridNode_right
	 * @generated
	 */
	public Adapter createDiffGridNode_rightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffFood <em>Diff Food</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffFood
	 * @generated
	 */
	public Adapter createDiffFoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffPacman <em>Diff Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffPacman
	 * @generated
	 */
	public Adapter createDiffPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGhost <em>Diff Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGhost
	 * @generated
	 */
	public Adapter createDiffGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffScoreboard <em>Diff Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffScoreboard
	 * @generated
	 */
	public Adapter createDiffScoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame <em>Diff Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame
	 * @generated
	 */
	public Adapter createDiffGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_gridnodes <em>Diff Game gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_gridnodes
	 * @generated
	 */
	public Adapter createDiffGame_gridnodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_scoreboard <em>Diff Game scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_scoreboard
	 * @generated
	 */
	public Adapter createDiffGame_scoreboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_entities <em>Diff Game entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_entities
	 * @generated
	 */
	public Adapter createDiffGame_entitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffGame_domainspecificdiffs <em>Diff Game domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffGame_domainspecificdiffs
	 * @generated
	 */
	public Adapter createDiffGame_domainspecificdiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PacmanGoDiffMM.DiffPositionableEntity_on <em>Diff Positionable Entity on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PacmanGoDiffMM.DiffPositionableEntity_on
	 * @generated
	 */
	public Adapter createDiffPositionableEntity_onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PacmanGoDiffMMAdapterFactory
