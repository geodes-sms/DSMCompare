/**
 */
package dssmm2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getNew_ModelID <em>New Model ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getNew_Goal <em>New Goal</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffModel#getNew_NumFacts <em>New Num Facts</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel()
 * @model
 * @generated
 */
public interface DiffModel extends Model {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmm2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Model ID</em>' attribute.
	 * @see #setNew_ModelID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_New_ModelID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_ModelID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getNew_ModelID <em>New Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Model ID</em>' attribute.
	 * @see #getNew_ModelID()
	 * @generated
	 */
	void setNew_ModelID(int value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNew_Name(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_New_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getNew_Name <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNew_Name()
	 * @generated
	 */
	void setNew_Name(String value);

	/**
	 * Returns the value of the '<em><b>New Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Goal</em>' attribute.
	 * @see #setNew_Goal(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_New_Goal()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Goal();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getNew_Goal <em>New Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Goal</em>' attribute.
	 * @see #getNew_Goal()
	 * @generated
	 */
	void setNew_Goal(String value);

	/**
	 * Returns the value of the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr</em>' attribute.
	 * @see #setNew_Descr(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_New_Descr()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getNew_Descr <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Descr</em>' attribute.
	 * @see #getNew_Descr()
	 * @generated
	 */
	void setNew_Descr(String value);

	/**
	 * Returns the value of the '<em><b>New Num Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Facts</em>' attribute.
	 * @see #setNew_NumFacts(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffModel_New_NumFacts()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_NumFacts();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffModel#getNew_NumFacts <em>New Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Facts</em>' attribute.
	 * @see #getNew_NumFacts()
	 * @generated
	 */
	void setNew_NumFacts(String value);

} // DiffModel
