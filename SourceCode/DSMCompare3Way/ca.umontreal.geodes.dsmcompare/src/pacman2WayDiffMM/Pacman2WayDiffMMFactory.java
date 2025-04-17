/**
 */
package pacman2WayDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage
 * @generated
 */
public interface Pacman2WayDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pacman2WayDiffMMFactory eINSTANCE = pacman2WayDiffMM.impl.Pacman2WayDiffMMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fruit</em>'.
	 * @generated
	 */
	Fruit createFruit();

	/**
	 * Returns a new object of class '<em>Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energizer</em>'.
	 * @generated
	 */
	Energizer createEnergizer();

	/**
	 * Returns a new object of class '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Diff</em>'.
	 * @generated
	 */
	SemanticDiff createSemanticDiff();

	/**
	 * Returns a new object of class '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Conflict</em>'.
	 * @generated
	 */
	SemanticConflict createSemanticConflict();

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
	 * Returns a new object of class '<em>Diff Grid Node down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Grid Node down</em>'.
	 * @generated
	 */
	DiffGridNode_down createDiffGridNode_down();

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
	 * Returns a new object of class '<em>Diff Game entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Game entities</em>'.
	 * @generated
	 */
	DiffGame_entities createDiffGame_entities();

	/**
	 * Returns a new object of class '<em>Diff Positionable Entity on</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Positionable Entity on</em>'.
	 * @generated
	 */
	DiffPositionableEntity_on createDiffPositionableEntity_on();

	/**
	 * Returns a new object of class '<em>Diff Fruit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Fruit</em>'.
	 * @generated
	 */
	DiffFruit createDiffFruit();

	/**
	 * Returns a new object of class '<em>Diff Energizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Energizer</em>'.
	 * @generated
	 */
	DiffEnergizer createDiffEnergizer();

	/**
	 * Returns a new object of class '<em>List EInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List EInt</em>'.
	 * @generated
	 */
	_ListEInt create_ListEInt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Pacman2WayDiffMMPackage getPacman2WayDiffMMPackage();

} //Pacman2WayDiffMMFactory
