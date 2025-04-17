/**
 */
package dssmm2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getNew_SScore <em>New SScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getNew_DScore <em>New DScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getNew_Comment <em>New Comment</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore#getNew_MethodID <em>New Method ID</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore()
 * @model
 * @generated
 */
public interface DiffScore extends Score {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmm2WayDiffMM.ClassDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #setDiff_kind(ClassDiffKind)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ClassDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.ClassDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(ClassDiffKind value);

	/**
	 * Returns the value of the '<em><b>New SScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New SScore</em>' attribute.
	 * @see #setNew_SScore(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_New_SScore()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_SScore();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getNew_SScore <em>New SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New SScore</em>' attribute.
	 * @see #getNew_SScore()
	 * @generated
	 */
	void setNew_SScore(float value);

	/**
	 * Returns the value of the '<em><b>New DScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New DScore</em>' attribute.
	 * @see #setNew_DScore(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_New_DScore()
	 * @model unique="false" required="true"
	 * @generated
	 */
	float getNew_DScore();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getNew_DScore <em>New DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New DScore</em>' attribute.
	 * @see #getNew_DScore()
	 * @generated
	 */
	void setNew_DScore(float value);

	/**
	 * Returns the value of the '<em><b>New Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Descr</em>' attribute.
	 * @see #setNew_Descr(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_New_Descr()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Descr();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getNew_Descr <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Descr</em>' attribute.
	 * @see #getNew_Descr()
	 * @generated
	 */
	void setNew_Descr(String value);

	/**
	 * Returns the value of the '<em><b>New Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Comment</em>' attribute.
	 * @see #setNew_Comment(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_New_Comment()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_Comment();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getNew_Comment <em>New Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Comment</em>' attribute.
	 * @see #getNew_Comment()
	 * @generated
	 */
	void setNew_Comment(String value);

	/**
	 * Returns the value of the '<em><b>New Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Method ID</em>' attribute.
	 * @see #setNew_MethodID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_New_MethodID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getNew_MethodID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore#getNew_MethodID <em>New Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Method ID</em>' attribute.
	 * @see #getNew_MethodID()
	 * @generated
	 */
	void setNew_MethodID(int value);

} // DiffScore
