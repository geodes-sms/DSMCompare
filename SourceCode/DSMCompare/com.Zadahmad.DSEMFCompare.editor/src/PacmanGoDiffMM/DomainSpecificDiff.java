/**
 */
package PacmanGoDiffMM;

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
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Food <em>Domain Specific Diff Food</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pacman <em>Domain Specific Diff Pacman</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Ghost <em>Domain Specific Diff Ghost</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Scoreboard <em>Domain Specific Diff Scoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff()
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
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Grid Node</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.GridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Grid Node</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_GridNode()
	 * @model
	 * @generated
	 */
	EList<GridNode> getDomainSpecificDiff_GridNode();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Food</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.Food}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Food</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Food()
	 * @model
	 * @generated
	 */
	EList<Food> getDomainSpecificDiff_Food();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Pacman</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.Pacman}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Pacman</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Pacman()
	 * @model
	 * @generated
	 */
	EList<Pacman> getDomainSpecificDiff_Pacman();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Ghost</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.Ghost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Ghost</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Ghost()
	 * @model
	 * @generated
	 */
	EList<Ghost> getDomainSpecificDiff_Ghost();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Scoreboard</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.Scoreboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Scoreboard</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_Scoreboard()
	 * @model
	 * @generated
	 */
	EList<Scoreboard> getDomainSpecificDiff_Scoreboard();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff Positionable Entity</b></em>' reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.PositionableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff Positionable Entity</em>' reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_PositionableEntity()
	 * @model
	 * @generated
	 */
	EList<PositionableEntity> getDomainSpecificDiff_PositionableEntity();

} // DomainSpecificDiff
