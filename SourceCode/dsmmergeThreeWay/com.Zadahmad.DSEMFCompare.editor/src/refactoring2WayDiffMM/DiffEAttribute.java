/**
 */
package refactoring2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.DiffEAttribute#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEAttribute#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEAttribute#getNew_etype <em>New etype</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEAttribute()
 * @model
 * @generated
 */
public interface DiffEAttribute extends EAttribute {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoring2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEAttribute_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEAttribute#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name</em>' attribute.
	 * @see #setNew_name(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEAttribute_New_name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEAttribute#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New etype</em>' attribute.
	 * @see #setNew_etype(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEAttribute_New_etype()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_etype();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEAttribute#getNew_etype <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New etype</em>' attribute.
	 * @see #getNew_etype()
	 * @generated
	 */
	void setNew_etype(String value);

} // DiffEAttribute
