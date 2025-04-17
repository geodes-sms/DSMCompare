/**
 */
package dssmm2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_OptionID <em>New Option ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_Sort <em>New Sort</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_Cost <em>New Cost</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_NumOtherCosts <em>New Num Other Costs</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffOption#getNew_Description <em>New Description</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption()
 * @model
 * @generated
 */
public interface DiffOption extends Option {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmm2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New Option ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Option ID</em>' attribute.
	 * @see #setNew_OptionID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_OptionID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_OptionID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_OptionID <em>New Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Option ID</em>' attribute.
	 * @see #getNew_OptionID()
	 * @generated
	 */
	void setNew_OptionID(int value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNew_Name(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_Name <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNew_Name()
	 * @generated
	 */
	void setNew_Name(String value);

	/**
	 * Returns the value of the '<em><b>New Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Sort</em>' attribute.
	 * @see #setNew_Sort(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_Sort()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_Sort();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_Sort <em>New Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Sort</em>' attribute.
	 * @see #getNew_Sort()
	 * @generated
	 */
	void setNew_Sort(int value);

	/**
	 * Returns the value of the '<em><b>New Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Cost</em>' attribute.
	 * @see #setNew_Cost(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_Cost()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_Cost();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_Cost <em>New Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Cost</em>' attribute.
	 * @see #getNew_Cost()
	 * @generated
	 */
	void setNew_Cost(float value);

	/**
	 * Returns the value of the '<em><b>New Num Other Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Num Other Costs</em>' attribute.
	 * @see #setNew_NumOtherCosts(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_NumOtherCosts()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_NumOtherCosts();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_NumOtherCosts <em>New Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Num Other Costs</em>' attribute.
	 * @see #getNew_NumOtherCosts()
	 * @generated
	 */
	void setNew_NumOtherCosts(int value);

	/**
	 * Returns the value of the '<em><b>New Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Description</em>' attribute.
	 * @see #setNew_Description(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffOption_New_Description()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Description();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffOption#getNew_Description <em>New Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Description</em>' attribute.
	 * @see #getNew_Description()
	 * @generated
	 */
	void setNew_Description(String value);

} // DiffOption
