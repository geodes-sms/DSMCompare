/**
 */
package refactoring2WayDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.EReference#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.EReference#getEtype <em>Etype</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEReference()
 * @model
 * @generated
 */
public interface EReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEReference_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.EReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype</em>' attribute.
	 * @see #setEtype(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEReference_Etype()
	 * @model
	 * @generated
	 */
	String getEtype();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.EReference#getEtype <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype</em>' attribute.
	 * @see #getEtype()
	 * @generated
	 */
	void setEtype(String value);

} // EReference
