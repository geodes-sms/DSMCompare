/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getLives <em>Lives</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getScore <em>Score</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getEntities <em>Entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_Game#getDiffentities <em>Diffentities</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game()
 * @model
 * @generated
 */
public interface Pattern_Game extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Game#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Game#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Game#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives</em>' attribute.
	 * @see #setLives(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Lives()
	 * @model
	 * @generated
	 */
	int getLives();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Game#getLives <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives</em>' attribute.
	 * @see #getLives()
	 * @generated
	 */
	void setLives(int value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Score()
	 * @model
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_Game#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

	/**
	 * Returns the value of the '<em><b>Gridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridnodes</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Gridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_GridNode> getGridnodes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_PositionableEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Diffgridnodes</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffgridnodes</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Diffgridnodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGame_gridnodes> getDiffgridnodes();

	/**
	 * Returns the value of the '<em><b>Diffentities</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffentities</em>' containment reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Game_Diffentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffGame_entities> getDiffentities();

} // Pattern_Game
