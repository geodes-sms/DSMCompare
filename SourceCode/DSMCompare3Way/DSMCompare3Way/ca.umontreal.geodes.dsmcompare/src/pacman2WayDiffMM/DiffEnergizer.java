/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffEnergizer#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffEnergizer#getNew_id <em>New id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffEnergizer#getNew_value <em>New value</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffEnergizer#getNew_durations <em>New durations</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffEnergizer()
 * @model
 * @generated
 */
public interface DiffEnergizer extends Energizer {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffEnergizer_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffEnergizer#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.DiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(DiffKind value);

	/**
	 * Returns the value of the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New id</em>' attribute.
	 * @see #setNew_id(String)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffEnergizer_New_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffEnergizer#getNew_id <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New id</em>' attribute.
	 * @see #getNew_id()
	 * @generated
	 */
	void setNew_id(String value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(int)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffEnergizer_New_value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffEnergizer#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

	/**
	 * Returns the value of the '<em><b>New durations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New durations</em>' containment reference.
	 * @see #setNew_durations(_ListEInt)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffEnergizer_New_durations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	_ListEInt getNew_durations();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffEnergizer#getNew_durations <em>New durations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New durations</em>' containment reference.
	 * @see #getNew_durations()
	 * @generated
	 */
	void setNew_durations(_ListEInt value);

} // DiffEnergizer
