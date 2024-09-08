/**
 */
package refactoring2WayDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#getNew_extends <em>New extends</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#getNew_implements <em>New implements</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#isNew_isAbstract <em>New is Abstract</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.DiffEClass#getNew_packageName <em>New package Name</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass()
 * @model
 * @generated
 */
public interface DiffEClass extends EClass {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoring2WayDiffMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see refactoring2WayDiffMM.DiffKind
	 * @see #setDiff_kind(DiffKind)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#getDiff_kind <em>Diff kind</em>}' attribute.
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
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_New_name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New extends</em>' attribute.
	 * @see #setNew_extends(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_New_extends()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_extends();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#getNew_extends <em>New extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New extends</em>' attribute.
	 * @see #getNew_extends()
	 * @generated
	 */
	void setNew_extends(String value);

	/**
	 * Returns the value of the '<em><b>New implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New implements</em>' attribute.
	 * @see #setNew_implements(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_New_implements()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_implements();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#getNew_implements <em>New implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New implements</em>' attribute.
	 * @see #getNew_implements()
	 * @generated
	 */
	void setNew_implements(String value);

	/**
	 * Returns the value of the '<em><b>New is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New is Abstract</em>' attribute.
	 * @see #setNew_isAbstract(boolean)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_New_isAbstract()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isNew_isAbstract();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#isNew_isAbstract <em>New is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New is Abstract</em>' attribute.
	 * @see #isNew_isAbstract()
	 * @generated
	 */
	void setNew_isAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>New package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New package Name</em>' attribute.
	 * @see #setNew_packageName(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getDiffEClass_New_packageName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNew_packageName();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.DiffEClass#getNew_packageName <em>New package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New package Name</em>' attribute.
	 * @see #getNew_packageName()
	 * @generated
	 */
	void setNew_packageName(String value);

} // DiffEClass
