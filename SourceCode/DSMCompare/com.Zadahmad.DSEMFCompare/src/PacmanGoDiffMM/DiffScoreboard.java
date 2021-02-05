/**
 */
package PacmanGoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Scoreboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.DiffScoreboard#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffScoreboard#getNew_value <em>New value</em>}</li>
 *   <li>{@link PacmanGoDiffMM.DiffScoreboard#getNew_id <em>New id</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffScoreboard()
 * @model
 * @generated
 */
public interface DiffScoreboard extends Scoreboard {
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
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffScoreboard_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffScoreboard#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see PacmanGoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(int)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffScoreboard_New_value()
	 * @model
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffScoreboard#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(int)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getDiffScoreboard_New_id()
	 * @model
	 * @generated
	 */
	int getNew_id();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.DiffScoreboard#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(int value);

} // DiffScoreboard
