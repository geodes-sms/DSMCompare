/**
 */
package pacmanDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffEnergizer <em>Semantic Object Diff Energizer</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffFood <em>Semantic Object Diff Food</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffFruit <em>Semantic Object Diff Fruit</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGame <em>Semantic Object Diff Game</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGame_entities <em>Semantic Object Diff Game entities</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGame_gridnodes <em>Semantic Object Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGhost <em>Semantic Object Diff Ghost</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGridNode <em>Semantic Object Diff Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGridNode_down <em>Semantic Object Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGridNode_left <em>Semantic Object Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGridNode_right <em>Semantic Object Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffGridNode_up <em>Semantic Object Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffPacman <em>Semantic Object Diff Pacman</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_DiffPositionableEntity_on <em>Semantic Object Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_Game <em>Semantic Object Game</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_GridNode <em>Semantic Object Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticObject#getSemanticObject_PositionableEntity <em>Semantic Object Positionable Entity</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Energizer</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffEnergizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Energizer</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffEnergizer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEnergizer> getSemanticObject_DiffEnergizer();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Food</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffFood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Food</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffFood()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffFood> getSemanticObject_DiffFood();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Fruit</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffFruit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Fruit</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffFruit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffFruit> getSemanticObject_DiffFruit();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGame()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGame> getSemanticObject_DiffGame();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game entities</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game entities</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGame_entities()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGame_entities> getSemanticObject_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Game gridnodes</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Game gridnodes</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGame_gridnodes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGame_gridnodes> getSemanticObject_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Ghost</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGhost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Ghost</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGhost()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGhost> getSemanticObject_DiffGhost();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGridNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGridNode> getSemanticObject_DiffGridNode();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node down</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node down</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGridNode_down()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_down> getSemanticObject_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node left</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node left</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGridNode_left()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_left> getSemanticObject_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node right</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node right</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGridNode_right()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_right> getSemanticObject_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Grid Node up</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Grid Node up</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffGridNode_up()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffGridNode_up> getSemanticObject_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Pacman</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffPacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Pacman</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffPacman()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPacman> getSemanticObject_DiffPacman();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Positionable Entity on</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Positionable Entity on</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_DiffPositionableEntity_on()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPositionableEntity_on> getSemanticObject_DiffPositionableEntity_on();

	/**
	 * Returns the value of the '<em><b>Semantic Object Game</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Game</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_Game()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Game> getSemanticObject_Game();

	/**
	 * Returns the value of the '<em><b>Semantic Object Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Grid Node</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_GridNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<GridNode> getSemanticObject_GridNode();

	/**
	 * Returns the value of the '<em><b>Semantic Object Positionable Entity</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Positionable Entity</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticObject_SemanticObject_PositionableEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PositionableEntity> getSemanticObject_PositionableEntity();

} // SemanticObject
