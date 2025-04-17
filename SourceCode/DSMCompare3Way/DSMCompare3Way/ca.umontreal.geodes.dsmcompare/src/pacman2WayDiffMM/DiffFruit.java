/**
 */
package pacman2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Fruit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffFruit#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffFruit#getNew_id <em>New id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffFruit#getNew_value <em>New value</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffFruit#getNew_location <em>New location</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFruit()
 * @model
 * @generated
 */
public interface DiffFruit extends Fruit {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFruit_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFruit#getDiff_kind <em>Diff kind</em>}' attribute.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFruit_New_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_id();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFruit#getNew_id <em>New id</em>}' attribute.
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
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFruit_New_value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFruit#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

	/**
	 * Returns the value of the '<em><b>New location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New location</em>' attribute.
	 * @see #setNew_location(String)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffFruit_New_location()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_location();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffFruit#getNew_location <em>New location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New location</em>' attribute.
	 * @see #getNew_location()
	 * @generated
	 */
	void setNew_location(String value);

} // DiffFruit
