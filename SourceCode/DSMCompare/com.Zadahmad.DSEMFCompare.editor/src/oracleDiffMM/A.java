/**
 */
package oracleDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.A#getAb <em>Ab</em>}</li>
 *   <li>{@link oracleDiffMM.A#getId <em>Id</em>}</li>
 *   <li>{@link oracleDiffMM.A#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.A#getDiffab <em>Diffab</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Ab</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.B}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ab</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getA_Ab()
	 * @model
	 * @generated
	 */
	EList<B> getAb();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see oracleDiffMM.OracleDiffMMPackage#getA_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link oracleDiffMM.A#getId <em>Id</em>}' attribute.
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
	 * @see oracleDiffMM.OracleDiffMMPackage#getA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oracleDiffMM.A#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diffab</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffA_ab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffab</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getA_Diffab()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffA_ab> getDiffab();

} // A
