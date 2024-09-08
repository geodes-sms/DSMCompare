/**
 */
package pacman2WayDiffMM;

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
 *   <li>{@link pacman2WayDiffMM.Game#getId <em>Id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getLives <em>Lives</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getScore <em>Score</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getEntities <em>Entities</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getSemanticconflicts <em>Semanticconflicts</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getDiffentities <em>Diffentities</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 *   <li>{@link pacman2WayDiffMM.Game#getDiffsemanticconflicts <em>Diffsemanticconflicts</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame()
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.Game#getId <em>Id</em>}' attribute.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Lives()
	 * @model default="1"
	 * @generated
	 */
	int getLives();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.Game#getLives <em>Lives</em>}' attribute.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Score()
	 * @model default="0"
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.Game#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

	/**
	 * Returns the value of the '<em><b>Gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridnodes</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Gridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridNode> getGridnodes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionableEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Semanticconflicts</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.SemanticConflict}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticconflicts</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Semanticconflicts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticConflict> getSemanticconflicts();

	/**
	 * Returns the value of the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffgridnodes</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Diffgridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_gridnodes> getDiffgridnodes();

	/**
	 * Returns the value of the '<em><b>Diffentities</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffentities</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Diffentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_entities> getDiffentities();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_domainspecificdiffs> getDiffdomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffsemanticconflicts</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_semanticconflicts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsemanticconflicts</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGame_Diffsemanticconflicts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGame_semanticconflicts> getDiffsemanticconflicts();

} // Game
