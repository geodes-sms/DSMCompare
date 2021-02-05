/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Output Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#getNew_name <em>New name</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#getNew_kind <em>New kind</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#getNew_image <em>New image</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#isNew_level <em>New level</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffOutputModule#getNew_library <em>New library</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule()
 * @model
 * @generated
 */
public interface DiffOutputModule extends OutputModule {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name</em>' attribute.
	 * @see #setNew_name(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_New_name()
	 * @model
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New kind</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ModuleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New kind</em>' attribute.
	 * @see arduinoDiffMM.ModuleKind
	 * @see #setNew_kind(ModuleKind)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_New_kind()
	 * @model
	 * @generated
	 */
	ModuleKind getNew_kind();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#getNew_kind <em>New kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New kind</em>' attribute.
	 * @see arduinoDiffMM.ModuleKind
	 * @see #getNew_kind()
	 * @generated
	 */
	void setNew_kind(ModuleKind value);

	/**
	 * Returns the value of the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New image</em>' attribute.
	 * @see #setNew_image(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_New_image()
	 * @model
	 * @generated
	 */
	String getNew_image();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#getNew_image <em>New image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New image</em>' attribute.
	 * @see #getNew_image()
	 * @generated
	 */
	void setNew_image(String value);

	/**
	 * Returns the value of the '<em><b>New level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New level</em>' attribute.
	 * @see #setNew_level(boolean)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_New_level()
	 * @model
	 * @generated
	 */
	boolean isNew_level();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#isNew_level <em>New level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New level</em>' attribute.
	 * @see #isNew_level()
	 * @generated
	 */
	void setNew_level(boolean value);

	/**
	 * Returns the value of the '<em><b>New library</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New library</em>' attribute.
	 * @see arduinoDiffMM.Library
	 * @see #setNew_library(Library)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffOutputModule_New_library()
	 * @model
	 * @generated
	 */
	Library getNew_library();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffOutputModule#getNew_library <em>New library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New library</em>' attribute.
	 * @see arduinoDiffMM.Library
	 * @see #getNew_library()
	 * @generated
	 */
	void setNew_library(Library value);

} // DiffOutputModule
