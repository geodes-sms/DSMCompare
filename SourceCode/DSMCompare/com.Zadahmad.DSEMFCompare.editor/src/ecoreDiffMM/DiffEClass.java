/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEClass#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#getNew_instanceClassName <em>New instance Class Name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#getNew_instanceClass <em>New instance Class</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#getNew_defaultValue <em>New default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#getNew_instanceTypeName <em>New instance Type Name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#isNew_abstract <em>New abstract</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEClass#isNew_interface <em>New interface</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass()
 * @model
 * @generated
 */
public interface DiffEClass extends EClass {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getOperation <em>Operation</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getNew_name <em>New name</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_instanceClassName()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_instanceClassName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getNew_instanceClassName <em>New instance Class Name</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_instanceClass()
	 * @model dataType="ecoreDiffMM.EJavaClass"
	 * @generated
	 */
	Class getNew_instanceClass();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getNew_instanceClass <em>New instance Class</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_defaultValue()
	 * @model dataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	Object getNew_defaultValue();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getNew_defaultValue <em>New default Value</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_instanceTypeName()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_instanceTypeName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#getNew_instanceTypeName <em>New instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New instance Type Name</em>' attribute.
	 * @see #getNew_instanceTypeName()
	 * @generated
	 */
	void setNew_instanceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>New abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New abstract</em>' attribute.
	 * @see #setNew_abstract(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_abstract()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_abstract();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#isNew_abstract <em>New abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New abstract</em>' attribute.
	 * @see #isNew_abstract()
	 * @generated
	 */
	void setNew_abstract(boolean value);

	/**
	 * Returns the value of the '<em><b>New interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New interface</em>' attribute.
	 * @see #setNew_interface(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEClass_New_interface()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_interface();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEClass#isNew_interface <em>New interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New interface</em>' attribute.
	 * @see #isNew_interface()
	 * @generated
	 */
	void setNew_interface(boolean value);

} // DiffEClass
