/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getNew_instanceClassName <em>New instance Class Name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getNew_instanceClass <em>New instance Class</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getNew_defaultValue <em>New default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#getNew_instanceTypeName <em>New instance Type Name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnum#isNew_serializable <em>New serializable</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum()
 * @model
 * @generated
 */
public interface DiffEEnum extends EEnum {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name</em>' attribute.
	 * @see #setNew_name(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New instance Class Name</em>' attribute.
	 * @see #setNew_instanceClassName(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_instanceClassName()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_instanceClassName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getNew_instanceClassName <em>New instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New instance Class Name</em>' attribute.
	 * @see #getNew_instanceClassName()
	 * @generated
	 */
	void setNew_instanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>New instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New instance Class</em>' attribute.
	 * @see #setNew_instanceClass(Class)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_instanceClass()
	 * @model dataType="ecoreDiffMM.EJavaClass"
	 * @generated
	 */
	Class getNew_instanceClass();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getNew_instanceClass <em>New instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New instance Class</em>' attribute.
	 * @see #getNew_instanceClass()
	 * @generated
	 */
	void setNew_instanceClass(Class value);

	/**
	 * Returns the value of the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New default Value</em>' attribute.
	 * @see #setNew_defaultValue(Object)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_defaultValue()
	 * @model dataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	Object getNew_defaultValue();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getNew_defaultValue <em>New default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New default Value</em>' attribute.
	 * @see #getNew_defaultValue()
	 * @generated
	 */
	void setNew_defaultValue(Object value);

	/**
	 * Returns the value of the '<em><b>New instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New instance Type Name</em>' attribute.
	 * @see #setNew_instanceTypeName(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_instanceTypeName()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_instanceTypeName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#getNew_instanceTypeName <em>New instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New instance Type Name</em>' attribute.
	 * @see #getNew_instanceTypeName()
	 * @generated
	 */
	void setNew_instanceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>New serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New serializable</em>' attribute.
	 * @see #setNew_serializable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnum_New_serializable()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_serializable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnum#isNew_serializable <em>New serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New serializable</em>' attribute.
	 * @see #isNew_serializable()
	 * @generated
	 */
	void setNew_serializable(boolean value);

} // DiffEEnum
