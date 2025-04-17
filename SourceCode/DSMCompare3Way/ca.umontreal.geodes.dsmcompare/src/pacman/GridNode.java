/**
 */
package pacman;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman.GridNode#getUp <em>Up</em>}</li>
 *   <li>{@link pacman.GridNode#getDown <em>Down</em>}</li>
 *   <li>{@link pacman.GridNode#getLeft <em>Left</em>}</li>
 *   <li>{@link pacman.GridNode#getRight <em>Right</em>}</li>
 *   <li>{@link pacman.GridNode#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see pacman.PacmanPackage#getGridNode()
 * @model
 * @generated
 */
public interface GridNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' reference.
	 * @see #setUp(GridNode)
	 * @see pacman.PacmanPackage#getGridNode_Up()
	 * @model
	 * @generated
	 */
	GridNode getUp();

	/**
	 * Sets the value of the '{@link pacman.GridNode#getUp <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' reference.
	 * @see #getUp()
	 * @generated
	 */
	void setUp(GridNode value);

	/**
	 * Returns the value of the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' reference.
	 * @see #setDown(GridNode)
	 * @see pacman.PacmanPackage#getGridNode_Down()
	 * @model
	 * @generated
	 */
	GridNode getDown();

	/**
	 * Sets the value of the '{@link pacman.GridNode#getDown <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down</em>' reference.
	 * @see #getDown()
	 * @generated
	 */
	void setDown(GridNode value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(GridNode)
	 * @see pacman.PacmanPackage#getGridNode_Left()
	 * @model
	 * @generated
	 */
	GridNode getLeft();

	/**
	 * Sets the value of the '{@link pacman.GridNode#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(GridNode value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(GridNode)
	 * @see pacman.PacmanPackage#getGridNode_Right()
	 * @model
	 * @generated
	 */
	GridNode getRight();

	/**
	 * Sets the value of the '{@link pacman.GridNode#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(GridNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pacman.PacmanPackage#getGridNode_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacman.GridNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GridNode
