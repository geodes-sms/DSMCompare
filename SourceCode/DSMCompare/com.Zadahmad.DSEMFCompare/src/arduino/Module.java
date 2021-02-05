/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Module#getKind <em>Kind</em>}</li>
 *   <li>{@link arduino.Module#getImage <em>Image</em>}</li>
 *   <li>{@link arduino.Module#isLevel <em>Level</em>}</li>
 *   <li>{@link arduino.Module#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getModule()
 * @model abstract="true"
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"digital"</code>.
	 * The literals are from the enumeration {@link arduino.ModuleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see arduino.ModuleKind
	 * @see #setKind(ModuleKind)
	 * @see arduino.ArduinoPackage#getModule_Kind()
	 * @model default="digital"
	 * @generated
	 */
	ModuleKind getKind();

	/**
	 * Sets the value of the '{@link arduino.Module#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see arduino.ModuleKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ModuleKind value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see arduino.ArduinoPackage#getModule_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link arduino.Module#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(boolean)
	 * @see arduino.ArduinoPackage#getModule_Level()
	 * @model
	 * @generated
	 */
	boolean isLevel();

	/**
	 * Sets the value of the '{@link arduino.Module#isLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #isLevel()
	 * @generated
	 */
	void setLevel(boolean value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see arduino.Library
	 * @see #setLibrary(Library)
	 * @see arduino.ArduinoPackage#getModule_Library()
	 * @model
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link arduino.Module#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see arduino.Library
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

} // Module
