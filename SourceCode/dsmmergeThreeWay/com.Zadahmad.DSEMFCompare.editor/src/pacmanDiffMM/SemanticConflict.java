/**
 */
package pacmanDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getName <em>Name</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode <em>Semantic Conflict Diff Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_up <em>Semantic Conflict Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_down <em>Semantic Conflict Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_left <em>Semantic Conflict Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGridNode_right <em>Semantic Conflict Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFood <em>Semantic Conflict Diff Food</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPacman <em>Semantic Conflict Diff Pacman</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGhost <em>Semantic Conflict Diff Ghost</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame <em>Semantic Conflict Diff Game</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_gridnodes <em>Semantic Conflict Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_entities <em>Semantic Conflict Diff Game entities</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_domainspecificdiffs <em>Semantic Conflict Diff Game domainspecificdiffs</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffGame_semanticconflicts <em>Semantic Conflict Diff Game semanticconflicts</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffPositionableEntity_on <em>Semantic Conflict Diff Positionable Entity on</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffFruit <em>Semantic Conflict Diff Fruit</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DiffEnergizer <em>Semantic Conflict Diff Energizer</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticConflict_DomainSpecificDiff <em>Semantic Conflict Domain Specific Diff</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict()
 * @model
 * @generated
 */
public interface SemanticConflict extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.SemanticConflict#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Grid Node</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGridNode()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode> getSemanticConflict_DiffGridNode();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Grid Node up</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Grid Node up</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGridNode_up()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_up> getSemanticConflict_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Grid Node down</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Grid Node down</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGridNode_down()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_down> getSemanticConflict_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Grid Node left</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Grid Node left</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGridNode_left()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_left> getSemanticConflict_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Grid Node right</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Grid Node right</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGridNode_right()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_right> getSemanticConflict_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Food</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffFood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Food</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffFood()
	 * @model
	 * @generated
	 */
	EList<DiffFood> getSemanticConflict_DiffFood();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Pacman</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffPacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Pacman</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffPacman()
	 * @model
	 * @generated
	 */
	EList<DiffPacman> getSemanticConflict_DiffPacman();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Ghost</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGhost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Ghost</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGhost()
	 * @model
	 * @generated
	 */
	EList<DiffGhost> getSemanticConflict_DiffGhost();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Game</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Game</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGame()
	 * @model
	 * @generated
	 */
	EList<DiffGame> getSemanticConflict_DiffGame();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Game gridnodes</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Game gridnodes</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGame_gridnodes()
	 * @model
	 * @generated
	 */
	EList<DiffGame_gridnodes> getSemanticConflict_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Game entities</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Game entities</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGame_entities()
	 * @model
	 * @generated
	 */
	EList<DiffGame_entities> getSemanticConflict_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Game domainspecificdiffs</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Game domainspecificdiffs</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGame_domainspecificdiffs()
	 * @model
	 * @generated
	 */
	EList<DiffGame_domainspecificdiffs> getSemanticConflict_DiffGame_domainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Game semanticconflicts</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffGame_semanticconflicts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Game semanticconflicts</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffGame_semanticconflicts()
	 * @model
	 * @generated
	 */
	EList<DiffGame_semanticconflicts> getSemanticConflict_DiffGame_semanticconflicts();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Positionable Entity on</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Positionable Entity on</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffPositionableEntity_on()
	 * @model
	 * @generated
	 */
	EList<DiffPositionableEntity_on> getSemanticConflict_DiffPositionableEntity_on();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Fruit</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffFruit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Fruit</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffFruit()
	 * @model
	 * @generated
	 */
	EList<DiffFruit> getSemanticConflict_DiffFruit();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Diff Energizer</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffEnergizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Diff Energizer</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DiffEnergizer()
	 * @model
	 * @generated
	 */
	EList<DiffEnergizer> getSemanticConflict_DiffEnergizer();

	/**
	 * Returns the value of the '<em><b>Semantic Conflict Domain Specific Diff</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Conflict Domain Specific Diff</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_SemanticConflict_DomainSpecificDiff()
	 * @model
	 * @generated
	 */
	EList<DomainSpecificDiff> getSemanticConflict_DomainSpecificDiff();

} // SemanticConflict
