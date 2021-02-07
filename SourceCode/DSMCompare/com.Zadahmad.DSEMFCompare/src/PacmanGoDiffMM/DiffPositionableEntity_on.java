/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Positionable Entity on</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffPositionableEntity_on#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffPositionableEntity_on#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffPositionableEntity_on()
 * @model
 * @generated
 */
public interface DiffPositionableEntity_on extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PacmanGoDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffPositionableEntity_on_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffPositionableEntity_on#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.AscOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AscOp value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(GridNode)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffPositionableEntity_on_EType()
	 * @model required="true"
	 * @generated
	 */
	GridNode getEType();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffPositionableEntity_on#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(GridNode value);

} // DiffPositionableEntity_on