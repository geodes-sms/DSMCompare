/**
 */
package PacmanGoDiffMM;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link PacmanGoDiffMM.GridNode#getUp <em>Up</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getBottom <em>Bottom</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getLeft <em>Left</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getRight <em>Right</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getId <em>Id</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getDiffbottom <em>Diffbottom</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link PacmanGoDiffMM.GridNode#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode()
 * @model
 * @generated
 */
public interface GridNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' reference.
	 * @see #setUp(GridNode)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Up()
	 * @model
	 * @generated
	 */
	GridNode getUp();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.GridNode#getUp <em>Up</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' reference.
	 * @see #setBottom(GridNode)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Bottom()
	 * @model
	 * @generated
	 */
	GridNode getBottom();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.GridNode#getBottom <em>Bottom</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(GridNode)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Left()
	 * @model
	 * @generated
	 */
	GridNode getLeft();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.GridNode#getLeft <em>Left</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(GridNode)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Right()
	 * @model
	 * @generated
	 */
	GridNode getRight();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.GridNode#getRight <em>Right</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link PacmanGoDiffMM.GridNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Diffup</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffup</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Diffup()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffGridNode_up> getDiffup();

	/**
	 * Returns the value of the '<em><b>Diffbottom</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGridNode_bottom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffbottom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffbottom</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Diffbottom()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffGridNode_bottom> getDiffbottom();

	/**
	 * Returns the value of the '<em><b>Diffleft</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffleft</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffleft</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Diffleft()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffGridNode_left> getDiffleft();

	/**
	 * Returns the value of the '<em><b>Diffright</b></em>' containment reference list.
	 * The list contents are of type {@link PacmanGoDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffright</em>' containment reference list.
	 * @see PacmanGoDiffMM.PacmanGoDiffMMPackage#getGridNode_Diffright()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffGridNode_right> getDiffright();

} // GridNode
