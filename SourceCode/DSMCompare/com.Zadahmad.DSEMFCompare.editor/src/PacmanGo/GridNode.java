/**
 */
package PacmanGo;

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
 *   <li>{@link PacmanGo.GridNode#getUp <em>Up</em>}</li>
 *   <li>{@link PacmanGo.GridNode#getBottom <em>Bottom</em>}</li>
 *   <li>{@link PacmanGo.GridNode#getLeft <em>Left</em>}</li>
 *   <li>{@link PacmanGo.GridNode#getRight <em>Right</em>}</li>
 *   <li>{@link PacmanGo.GridNode#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see PacmanGo.PacmanGoPackage#getGridNode()
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
	 * @see PacmanGo.PacmanGoPackage#getGridNode_Up()
	 * @model
	 * @generated
	 */
	GridNode getUp();

	/**
	 * Sets the value of the '{@link PacmanGo.GridNode#getUp <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' reference.
	 * @see #getUp()
	 * @generated
	 */
	void setUp(GridNode value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' reference.
	 * @see #setBottom(GridNode)
	 * @see PacmanGo.PacmanGoPackage#getGridNode_Bottom()
	 * @model
	 * @generated
	 */
	GridNode getBottom();

	/**
	 * Sets the value of the '{@link PacmanGo.GridNode#getBottom <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' reference.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(GridNode value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(GridNode)
	 * @see PacmanGo.PacmanGoPackage#getGridNode_Left()
	 * @model
	 * @generated
	 */
	GridNode getLeft();

	/**
	 * Sets the value of the '{@link PacmanGo.GridNode#getLeft <em>Left</em>}' reference.
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
	 * @see PacmanGo.PacmanGoPackage#getGridNode_Right()
	 * @model
	 * @generated
	 */
	GridNode getRight();

	/**
	 * Sets the value of the '{@link PacmanGo.GridNode#getRight <em>Right</em>}' reference.
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
	 * @see PacmanGo.PacmanGoPackage#getGridNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PacmanGo.GridNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GridNode
