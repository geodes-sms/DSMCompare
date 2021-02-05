/**
 */
package oracleDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.B#getBd <em>Bd</em>}</li>
 *   <li>{@link oracleDiffMM.B#getId <em>Id</em>}</li>
 *   <li>{@link oracleDiffMM.B#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.B#getDiffbd <em>Diffbd</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>Bd</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bd</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getB_Bd()
	 * @model containment="true"
	 * @generated
	 */
	EList<D> getBd();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see oracleDiffMM.OracleDiffMMPackage#getB_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link oracleDiffMM.B#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see oracleDiffMM.OracleDiffMMPackage#getB_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oracleDiffMM.B#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diffbd</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffB_bd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffbd</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getB_Diffbd()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffB_bd> getDiffbd();

} // B
