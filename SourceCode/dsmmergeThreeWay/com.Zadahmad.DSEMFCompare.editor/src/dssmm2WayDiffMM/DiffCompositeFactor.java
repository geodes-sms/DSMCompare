/**
 */
package dssmm2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Composite Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_FactorID <em>New Factor ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_GW <em>New GW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_LW <em>New LW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Del <em>New Del</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#isNew_HideOnLine <em>New Hide On Line</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Hierarchy <em>New Hierarchy</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_MasterFactorID <em>New Master Factor ID</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor()
 * @model
 * @generated
 */
public interface DiffCompositeFactor extends CompositeFactor {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmm2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Factor ID</em>' attribute.
	 * @see #setNew_FactorID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_FactorID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_FactorID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_FactorID <em>New Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Factor ID</em>' attribute.
	 * @see #getNew_FactorID()
	 * @generated
	 */
	void setNew_FactorID(int value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNew_Name(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Name();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Name <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNew_Name()
	 * @generated
	 */
	void setNew_Name(String value);

	/**
	 * Returns the value of the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr</em>' attribute.
	 * @see #setNew_Descr(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_Descr()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Descr <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Descr</em>' attribute.
	 * @see #getNew_Descr()
	 * @generated
	 */
	void setNew_Descr(String value);

	/**
	 * Returns the value of the '<em><b>New GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New GW</em>' attribute.
	 * @see #setNew_GW(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_GW()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_GW();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_GW <em>New GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New GW</em>' attribute.
	 * @see #getNew_GW()
	 * @generated
	 */
	void setNew_GW(float value);

	/**
	 * Returns the value of the '<em><b>New LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New LW</em>' attribute.
	 * @see #setNew_LW(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_LW()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_LW();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_LW <em>New LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New LW</em>' attribute.
	 * @see #getNew_LW()
	 * @generated
	 */
	void setNew_LW(float value);

	/**
	 * Returns the value of the '<em><b>New Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Del</em>' attribute.
	 * @see #setNew_Del(Boolean)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_Del()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Boolean getNew_Del();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Del <em>New Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Del</em>' attribute.
	 * @see #getNew_Del()
	 * @generated
	 */
	void setNew_Del(Boolean value);

	/**
	 * Returns the value of the '<em><b>New Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hide On Line</em>' attribute.
	 * @see #setNew_HideOnLine(boolean)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_HideOnLine()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_HideOnLine();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#isNew_HideOnLine <em>New Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hide On Line</em>' attribute.
	 * @see #isNew_HideOnLine()
	 * @generated
	 */
	void setNew_HideOnLine(boolean value);

	/**
	 * Returns the value of the '<em><b>New Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Hierarchy</em>' attribute.
	 * @see #setNew_Hierarchy(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_Hierarchy()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Hierarchy();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_Hierarchy <em>New Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Hierarchy</em>' attribute.
	 * @see #getNew_Hierarchy()
	 * @generated
	 */
	void setNew_Hierarchy(String value);

	/**
	 * Returns the value of the '<em><b>New Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Master Factor ID</em>' attribute.
	 * @see #setNew_MasterFactorID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffCompositeFactor_New_MasterFactorID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MasterFactorID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffCompositeFactor#getNew_MasterFactorID <em>New Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Master Factor ID</em>' attribute.
	 * @see #getNew_MasterFactorID()
	 * @generated
	 */
	void setNew_MasterFactorID(int value);

} // DiffCompositeFactor
