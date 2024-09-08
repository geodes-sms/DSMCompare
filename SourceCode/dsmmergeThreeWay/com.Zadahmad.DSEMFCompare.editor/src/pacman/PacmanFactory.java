/**
 */
package pacman;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pacman.PacmanPackage
 * @generated
 */
public interface PacmanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanFactory eINSTANCE = pacman.impl.PacmanFactoryImpl.init();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PacmanPackage getPacmanPackage();

} //PacmanFactory
