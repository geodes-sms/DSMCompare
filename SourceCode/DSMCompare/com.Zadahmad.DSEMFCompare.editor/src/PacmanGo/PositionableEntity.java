/**
 */
package PacmanGo;

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
 *   <li>{@link PacmanGo.PositionableEntity#getOn <em>On</em>}</li>
 *   <li>{@link PacmanGo.PositionableEntity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see PacmanGo.PacmanGoPackage#getPositionableEntity()
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
	 * @see PacmanGo.PacmanGoPackage#getPositionableEntity_On()
	 * @model required="true"
	 * @generated
	 */
	GridNode getOn();

	/**
	 * Sets the value of the '{@link PacmanGo.PositionableEntity#getOn <em>On</em>}' reference.
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
	 * @see PacmanGo.PacmanGoPackage#getPositionableEntity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PacmanGo.PositionableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PositionableEntity
