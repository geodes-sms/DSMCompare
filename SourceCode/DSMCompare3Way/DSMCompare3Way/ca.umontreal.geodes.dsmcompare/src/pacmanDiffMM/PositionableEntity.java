/**
 */
package pacmanDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positionable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.PositionableEntity#getOn <em>On</em>}</li>
 *   <li>{@link pacmanDiffMM.PositionableEntity#getId <em>Id</em>}</li>
 *   <li>{@link pacmanDiffMM.PositionableEntity#getDiffon <em>Diffon</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getPositionableEntity()
 * @model abstract="true"
 * @generated
 */
public interface PositionableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see #setOn(GridNode)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getPositionableEntity_On()
	 * @model required="true"
	 * @generated
	 */
	GridNode getOn();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.PositionableEntity#getOn <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(GridNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getPositionableEntity_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.PositionableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Diffon</b></em>' containment reference list.
	 * The list contents are of type {@link pacmanDiffMM.DiffPositionableEntity_on}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffon</em>' containment reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getPositionableEntity_Diffon()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPositionableEntity_on> getDiffon();

} // PositionableEntity
