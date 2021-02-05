/**
 */
package PacmanGo.impl;

import PacmanGo.*;

import org.eclipse.emf.ecore.EClass;
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
public class PacmanGoFactoryImpl extends EFactoryImpl implements PacmanGoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmanGoFactory init() {
		try {
			PacmanGoFactory thePacmanGoFactory = (PacmanGoFactory)EPackage.Registry.INSTANCE.getEFactory(PacmanGoPackage.eNS_URI);
			if (thePacmanGoFactory != null) {
				return thePacmanGoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmanGoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanGoFactoryImpl() {
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
			case PacmanGoPackage.GRID_NODE: return createGridNode();
			case PacmanGoPackage.FOOD: return createFood();
			case PacmanGoPackage.PACMAN: return createPacman();
			case PacmanGoPackage.GHOST: return createGhost();
			case PacmanGoPackage.SCOREBOARD: return createScoreboard();
			case PacmanGoPackage.GAME: return createGame();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Scoreboard createScoreboard() {
		ScoreboardImpl scoreboard = new ScoreboardImpl();
		return scoreboard;
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
	public PacmanGoPackage getPacmanGoPackage() {
		return (PacmanGoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmanGoPackage getPackage() {
		return PacmanGoPackage.eINSTANCE;
	}

} //PacmanGoFactoryImpl
