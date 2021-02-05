/**
 */
package oracleDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.D#getDd <em>Dd</em>}</li>
 *   <li>{@link oracleDiffMM.D#getId <em>Id</em>}</li>
 *   <li>{@link oracleDiffMM.D#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.D#getDiffdd <em>Diffdd</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getD()
 * @model
 * @generated
 */
public interface D extends EObject {
	/**
	 * Returns the value of the '<em><b>Dd</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dd</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getD_Dd()
	 * @model
	 * @generated
	 */
	EList<D> getDd();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see oracleDiffMM.OracleDiffMMPackage#getD_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link oracleDiffMM.D#getId <em>Id</em>}' attribute.
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
	 * @see oracleDiffMM.OracleDiffMMPackage#getD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oracleDiffMM.D#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diffdd</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffD_dd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdd</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getD_Diffdd()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffD_dd> getDiffdd();

} // D
