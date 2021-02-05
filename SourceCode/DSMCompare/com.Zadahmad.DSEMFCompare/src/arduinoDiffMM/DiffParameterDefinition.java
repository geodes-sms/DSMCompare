/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffParameterDefinition#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffParameterDefinition#getNew_type <em>New type</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffParameterDefinition#getNew_name <em>New name</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffParameterDefinition()
 * @model
 * @generated
 */
public interface DiffParameterDefinition extends ParameterDefinition {
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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffParameterDefinition_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffParameterDefinition#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New type</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New type</em>' attribute.
	 * @see arduinoDiffMM.ParameterType
	 * @see #setNew_type(ParameterType)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffParameterDefinition_New_type()
	 * @model
	 * @generated
	 */
	ParameterType getNew_type();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffParameterDefinition#getNew_type <em>New type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New type</em>' attribute.
	 * @see arduinoDiffMM.ParameterType
	 * @see #getNew_type()
	 * @generated
	 */
	void setNew_type(ParameterType value);

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
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffParameterDefinition_New_name()
	 * @model
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffParameterDefinition#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

} // DiffParameterDefinition
