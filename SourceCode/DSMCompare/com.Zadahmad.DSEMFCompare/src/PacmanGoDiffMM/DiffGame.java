/**
 */
package PacmanGoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffGame#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame()
 * @model
 * @generated
 */
public interface DiffGame extends Game {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link PacmanGoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffGame_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffGame#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

} // DiffGame
