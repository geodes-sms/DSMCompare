/**
 */
package pacman;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.Game#getId <em>Id</em>}</li>
 *   <li>{@link pacman.Game#getLives <em>Lives</em>}</li>
 *   <li>{@link pacman.Game#getScore <em>Score</em>}</li>
 *   <li>{@link pacman.Game#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacman.Game#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pacman.PacmanPackage#getGame_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacman.Game#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lives</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives</em>' attribute.
	 * @see #setLives(int)
	 * @see pacman.PacmanPackage#getGame_Lives()
	 * @model default="1"
	 * @generated
	 */
	int getLives();

	/**
	 * Sets the value of the '{@link pacman.Game#getLives <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives</em>' attribute.
	 * @see #getLives()
	 * @generated
	 */
	void setLives(int value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see pacman.PacmanPackage#getGame_Score()
	 * @model default="0"
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link pacman.Game#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

	/**
	 * Returns the value of the '<em><b>Gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacman.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridnodes</em>' containment reference list.
	 * @see pacman.PacmanPackage#getGame_Gridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridNode> getGridnodes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacman.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pacman.PacmanPackage#getGame_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionableEntity> getEntities();

} // Game
