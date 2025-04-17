/**
 */
package refactoring2WayDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.EPackage#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.EPackage#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.EPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.EPackage#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.EPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclassifiers</em>' containment reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage_Eclassifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getEclassifiers();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage_Interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeclassifiers</em>' containment reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage_Diffeclassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_eclassifiers> getDiffeclassifiers();

	/**
	 * Returns the value of the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinterfaces</em>' containment reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getEPackage_Diffinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_interfaces> getDiffinterfaces();

} // EPackage
