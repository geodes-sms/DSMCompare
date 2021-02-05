/**
 */
package PacmanGo;

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
 *   <li>{@link PacmanGo.Game#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link PacmanGo.Game#getScoreboard <em>Scoreboard</em>}</li>
 *   <li>{@link PacmanGo.Game#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see PacmanGo.PacmanGoPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGo.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridnodes</em>' containment reference list.
	 * @see PacmanGo.PacmanGoPackage#getGame_Gridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridNode> getGridnodes();

	/**
	 * Returns the value of the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoreboard</em>' containment reference.
	 * @see #setScoreboard(Scoreboard)
	 * @see PacmanGo.PacmanGoPackage#getGame_Scoreboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Scoreboard getScoreboard();

	/**
	 * Sets the value of the '{@link PacmanGo.Game#getScoreboard <em>Scoreboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoreboard</em>' containment reference.
	 * @see #getScoreboard()
	 * @generated
	 */
	void setScoreboard(Scoreboard value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGo.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see PacmanGo.PacmanGoPackage#getGame_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionableEntity> getEntities();

} // Game
