/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage
 * @generated
 */
public interface PacmanGoDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanGoDiffMMFactory eINSTANCE = PacmanGoDiffMM.impl.PacmanGoDiffMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Node</em>'.
	 * @generated
	 */
	GridNode createGridNode();

	/**
	 * Returns a new object of class '<em>Food</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Food</em>'.
	 * @generated
	 */
	Food createFood();

	/**
	 * Returns a new object of class '<em>Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman</em>'.
	 * @generated
	 */
	Pacman createPacman();

	/**
	 * Returns a new object of class '<em>Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ghost</em>'.
	 * @generated
	 */
	Ghost createGhost();

	/**
	 * Returns a new object of class '<em>Scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scoreboard</em>'.
	 * @generated
	 */
	Scoreboard createScoreboard();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Diff</em>'.
	 * @generated
	 */
	DomainSpecificDiff createDomainSpecificDiff();

	/**
	 * Returns a new object of class '<em>Diff Grid Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node</em>'.
	 * @generated
	 */
	DiffGridNode createDiffGridNode();

	/**
	 * Returns a new object of class '<em>Diff Grid Node up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node up</em>'.
	 * @generated
	 */
	DiffGridNode_up createDiffGridNode_up();

	/**
	 * Returns a new object of class '<em>Diff Grid Node bottom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node bottom</em>'.
	 * @generated
	 */
	DiffGridNode_bottom createDiffGridNode_bottom();

	/**
	 * Returns a new object of class '<em>Diff Grid Node left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node left</em>'.
	 * @generated
	 */
	DiffGridNode_left createDiffGridNode_left();

	/**
	 * Returns a new object of class '<em>Diff Grid Node right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node right</em>'.
	 * @generated
	 */
	DiffGridNode_right createDiffGridNode_right();

	/**
	 * Returns a new object of class '<em>Diff Food</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Food</em>'.
	 * @generated
	 */
	DiffFood createDiffFood();

	/**
	 * Returns a new object of class '<em>Diff Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Pacman</em>'.
	 * @generated
	 */
	DiffPacman createDiffPacman();

	/**
	 * Returns a new object of class '<em>Diff Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Ghost</em>'.
	 * @generated
	 */
	DiffGhost createDiffGhost();

	/**
	 * Returns a new object of class '<em>Diff Scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Scoreboard</em>'.
	 * @generated
	 */
	DiffScoreboard createDiffScoreboard();

	/**
	 * Returns a new object of class '<em>Diff Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game</em>'.
	 * @generated
	 */
	DiffGame createDiffGame();

	/**
	 * Returns a new object of class '<em>Diff Game gridnodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game gridnodes</em>'.
	 * @generated
	 */
	DiffGame_gridnodes createDiffGame_gridnodes();

	/**
	 * Returns a new object of class '<em>Diff Game scoreboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game scoreboard</em>'.
	 * @generated
	 */
	DiffGame_scoreboard createDiffGame_scoreboard();

	/**
	 * Returns a new object of class '<em>Diff Game entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game entities</em>'.
	 * @generated
	 */
	DiffGame_entities createDiffGame_entities();

	/**
	 * Returns a new object of class '<em>Diff Game domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game domainspecificdiffs</em>'.
	 * @generated
	 */
	DiffGame_domainspecificdiffs createDiffGame_domainspecificdiffs();

	/**
	 * Returns a new object of class '<em>Diff Positionable Entity on</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Positionable Entity on</em>'.
	 * @generated
	 */
	DiffPositionableEntity_on createDiffPositionableEntity_on();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PacmanGoDiffMMPackage getPacmanGoDiffMMPackage();

} //PacmanGoDiffMMFactory
