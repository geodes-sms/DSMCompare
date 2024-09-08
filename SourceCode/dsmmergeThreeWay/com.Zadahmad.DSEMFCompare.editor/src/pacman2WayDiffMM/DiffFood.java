/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Food</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffFood#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffFood#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFood()
 * @model
 * @generated
 */
public interface DiffFood extends Food {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFood_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFood#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(int)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFood_New_value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFood#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

} // DiffFood
