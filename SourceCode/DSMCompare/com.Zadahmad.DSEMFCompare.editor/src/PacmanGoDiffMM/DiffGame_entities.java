/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffGame_entities#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffGame_entities#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_entities()
 * @model
 * @generated
 */
public interface DiffGame_entities extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PacmanGoDiffMM.AscOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.AscOp
	 * @see #setOperation(AscOp)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_entities_Operation()
	 * @model required="true"
	 * @generated
	 */
	AscOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffGame_entities#getOperation <em>Operation</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(PositionableEntity)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_entities_EType()
	 * @model required="true"
	 * @generated
	 */
	PositionableEntity getEType();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffGame_entities#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(PositionableEntity value);

} // DiffGame_entities
