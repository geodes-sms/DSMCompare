/**
 */
package refactoring2WayDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EClass interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass_interfaces#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass_interfaces#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_interfaces()
 * @model
 * @generated
 */
public interface DiffEClass_interfaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoring2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_interfaces_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass_interfaces#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Interface)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_interfaces_EType()
	 * @model required="true"
	 * @generated
	 */
	Interface getEType();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass_interfaces#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Interface value);

} // DiffEClass_interfaces
