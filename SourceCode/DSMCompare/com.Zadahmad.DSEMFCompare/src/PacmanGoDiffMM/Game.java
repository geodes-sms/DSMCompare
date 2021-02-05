/**
 */
package PacmanGoDiffMM;

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
 *   <li>{@link PacmanGoDiffMM.Game#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getScoreboard <em>Scoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getEntities <em>Entities</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getDiffscoreboard <em>Diffscoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getDiffentities <em>Diffentities</em>}</li>
 *   <li>{@link PacmanGoDiffMM.Game#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gridnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridnodes</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Gridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridNode> getGridnodes();

	/**
	 * Returns the value of the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoreboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoreboard</em>' containment reference.
	 * @see #setScoreboard(Scoreboard)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Scoreboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Scoreboard getScoreboard();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.Game#getScoreboard <em>Scoreboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoreboard</em>' containment reference.
	 * @see #getScoreboard()
	 * @generated
	 */
	void setScoreboard(Scoreboard value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionableEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domainspecificdiffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffgridnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffgridnodes</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Diffgridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_gridnodes> getDiffgridnodes();

	/**
	 * Returns the value of the '<em><b>Diffscoreboard</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGame_scoreboard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffscoreboard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffscoreboard</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Diffscoreboard()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffGame_scoreboard> getDiffscoreboard();

	/**
	 * Returns the value of the '<em><b>Diffentities</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffentities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffentities</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Diffentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_entities> getDiffentities();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGame_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffdomainspecificdiffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGame_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_domainspecificdiffs> getDiffdomainspecificdiffs();

} // Game
