/**
 */
package pacman2WayDiffMM;

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
 *   <li>{@link pacman2WayDiffMM.GridNode#getUp <em>Up</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getDown <em>Down</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getLeft <em>Left</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getRight <em>Right</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getId <em>Id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getDiffdown <em>Diffdown</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link pacman2WayDiffMM.GridNode#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode()
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Up()
	 * @model
	 * @generated
	 */
	GridNode getUp();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.GridNode#getUp <em>Up</em>}' reference.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Down()
	 * @model
	 * @generated
	 */
	GridNode getDown();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.GridNode#getDown <em>Down</em>}' reference.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Left()
	 * @model
	 * @generated
	 */
	GridNode getLeft();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.GridNode#getLeft <em>Left</em>}' reference.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Right()
	 * @model
	 * @generated
	 */
	GridNode getRight();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.GridNode#getRight <em>Right</em>}' reference.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.GridNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Diffup</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_up}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffup</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Diffup()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGridNode_up> getDiffup();

	/**
	 * Returns the value of the '<em><b>Diffdown</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_down}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdown</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Diffdown()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGridNode_down> getDiffdown();

	/**
	 * Returns the value of the '<em><b>Diffleft</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffleft</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Diffleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGridNode_left> getDiffleft();

	/**
	 * Returns the value of the '<em><b>Diffright</b></em>' containment reference list.
	 * The list contents are of type {@link pacman2WayDiffMM.DiffGridNode_right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffright</em>' containment reference list.
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getGridNode_Diffright()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffGridNode_right> getDiffright();

} // GridNode
