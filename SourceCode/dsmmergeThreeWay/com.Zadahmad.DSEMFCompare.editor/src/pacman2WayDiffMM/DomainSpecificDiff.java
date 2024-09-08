/**
 */
package pacman2WayDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Game <em>Domain Specific Diff Game</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_up <em>Domain Specific Diff Diff Grid Node up</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_down <em>Domain Specific Diff Diff Grid Node down</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_left <em>Domain Specific Diff Diff Grid Node left</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGridNode_right <em>Domain Specific Diff Diff Grid Node right</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_gridnodes <em>Domain Specific Diff Diff Game gridnodes</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_entities <em>Domain Specific Diff Diff Game entities</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_domainspecificdiffs <em>Domain Specific Diff Diff Game domainspecificdiffs</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffGame_semanticconflicts <em>Domain Specific Diff Diff Game semanticconflicts</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DiffPositionableEntity_on <em>Domain Specific Diff Diff Positionable Entity on</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff()
 * @model
 * @generated
 */
public interface DomainSpecificDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Grid Node</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_GridNode()
	 * @model
	 * @generated
	 */
	EList<GridNode> getDomainSpecificDiff_GridNode();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Game</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Game</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Game()
	 * @model
	 * @generated
	 */
	EList<Game> getDomainSpecificDiff_Game();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Positionable Entity</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity()
	 * @model
	 * @generated
	 */
	EList<PositionableEntity> getDomainSpecificDiff_PositionableEntity();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Grid Node up</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Grid Node up</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_up()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_up> getDomainSpecificDiff_DiffGridNode_up();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Grid Node down</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Grid Node down</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_down()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_down> getDomainSpecificDiff_DiffGridNode_down();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Grid Node left</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Grid Node left</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_left()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_left> getDomainSpecificDiff_DiffGridNode_left();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Grid Node right</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Grid Node right</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGridNode_right()
	 * @model
	 * @generated
	 */
	EList<DiffGridNode_right> getDomainSpecificDiff_DiffGridNode_right();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Game gridnodes</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_gridnodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Game gridnodes</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGame_gridnodes()
	 * @model
	 * @generated
	 */
	EList<DiffGame_gridnodes> getDomainSpecificDiff_DiffGame_gridnodes();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Game entities</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Game entities</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGame_entities()
	 * @model
	 * @generated
	 */
	EList<DiffGame_entities> getDomainSpecificDiff_DiffGame_entities();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Game domainspecificdiffs</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Game domainspecificdiffs</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGame_domainspecificdiffs()
	 * @model
	 * @generated
	 */
	EList<DiffGame_domainspecificdiffs> getDomainSpecificDiff_DiffGame_domainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Game semanticconflicts</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGame_semanticconflicts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Game semanticconflicts</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffGame_semanticconflicts()
	 * @model
	 * @generated
	 */
	EList<DiffGame_semanticconflicts> getDomainSpecificDiff_DiffGame_semanticconflicts();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Diff Positionable Entity on</b></em>' reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Diff Positionable Entity on</em>' reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_DiffPositionableEntity_on()
	 * @model
	 * @generated
	 */
	EList<DiffPositionableEntity_on> getDomainSpecificDiff_DiffPositionableEntity_on();

} // DomainSpecificDiff
