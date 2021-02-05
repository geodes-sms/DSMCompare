/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_ordered <em>New ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_unique <em>New unique</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getNew_lowerBound <em>New lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getNew_upperBound <em>New upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_many <em>New many</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_required <em>New required</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_changeable <em>New changeable</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_volatile <em>New volatile</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_transient <em>New transient</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValueLiteral <em>New default Value Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValue <em>New default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_unsettable <em>New unsettable</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_derived <em>New derived</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAttribute#isNew_iD <em>New iD</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute()
 * @model
 * @generated
 */
public interface DiffEAttribute extends EAttribute {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getOperation <em>Operation</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New ordered</em>' attribute.
	 * @see #setNew_ordered(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_ordered()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_ordered();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_ordered <em>New ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New ordered</em>' attribute.
	 * @see #isNew_ordered()
	 * @generated
	 */
	void setNew_ordered(boolean value);

	/**
	 * Returns the value of the '<em><b>New unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New unique</em>' attribute.
	 * @see #setNew_unique(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_unique()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_unique();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_unique <em>New unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New unique</em>' attribute.
	 * @see #isNew_unique()
	 * @generated
	 */
	void setNew_unique(boolean value);

	/**
	 * Returns the value of the '<em><b>New lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New lower Bound</em>' attribute.
	 * @see #setNew_lowerBound(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_lowerBound()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getNew_lowerBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getNew_lowerBound <em>New lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New lower Bound</em>' attribute.
	 * @see #getNew_lowerBound()
	 * @generated
	 */
	void setNew_lowerBound(int value);

	/**
	 * Returns the value of the '<em><b>New upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New upper Bound</em>' attribute.
	 * @see #setNew_upperBound(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_upperBound()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getNew_upperBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getNew_upperBound <em>New upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New upper Bound</em>' attribute.
	 * @see #getNew_upperBound()
	 * @generated
	 */
	void setNew_upperBound(int value);

	/**
	 * Returns the value of the '<em><b>New many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New many</em>' attribute.
	 * @see #setNew_many(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_many()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_many();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_many <em>New many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New many</em>' attribute.
	 * @see #isNew_many()
	 * @generated
	 */
	void setNew_many(boolean value);

	/**
	 * Returns the value of the '<em><b>New required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New required</em>' attribute.
	 * @see #setNew_required(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_required()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_required();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_required <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New required</em>' attribute.
	 * @see #isNew_required()
	 * @generated
	 */
	void setNew_required(boolean value);

	/**
	 * Returns the value of the '<em><b>New changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New changeable</em>' attribute.
	 * @see #setNew_changeable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_changeable()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_changeable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_changeable <em>New changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New changeable</em>' attribute.
	 * @see #isNew_changeable()
	 * @generated
	 */
	void setNew_changeable(boolean value);

	/**
	 * Returns the value of the '<em><b>New volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New volatile</em>' attribute.
	 * @see #setNew_volatile(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_volatile()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_volatile();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_volatile <em>New volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New volatile</em>' attribute.
	 * @see #isNew_volatile()
	 * @generated
	 */
	void setNew_volatile(boolean value);

	/**
	 * Returns the value of the '<em><b>New transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New transient</em>' attribute.
	 * @see #setNew_transient(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_transient()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_transient();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_transient <em>New transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New transient</em>' attribute.
	 * @see #isNew_transient()
	 * @generated
	 */
	void setNew_transient(boolean value);

	/**
	 * Returns the value of the '<em><b>New default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New default Value Literal</em>' attribute.
	 * @see #setNew_defaultValueLiteral(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_defaultValueLiteral()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_defaultValueLiteral();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValueLiteral <em>New default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New default Value Literal</em>' attribute.
	 * @see #getNew_defaultValueLiteral()
	 * @generated
	 */
	void setNew_defaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>New default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New default Value</em>' attribute.
	 * @see #setNew_defaultValue(Object)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_defaultValue()
	 * @model dataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	Object getNew_defaultValue();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#getNew_defaultValue <em>New default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New default Value</em>' attribute.
	 * @see #getNew_defaultValue()
	 * @generated
	 */
	void setNew_defaultValue(Object value);

	/**
	 * Returns the value of the '<em><b>New unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New unsettable</em>' attribute.
	 * @see #setNew_unsettable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_unsettable()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_unsettable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_unsettable <em>New unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New unsettable</em>' attribute.
	 * @see #isNew_unsettable()
	 * @generated
	 */
	void setNew_unsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>New derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New derived</em>' attribute.
	 * @see #setNew_derived(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_derived()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_derived();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_derived <em>New derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New derived</em>' attribute.
	 * @see #isNew_derived()
	 * @generated
	 */
	void setNew_derived(boolean value);

	/**
	 * Returns the value of the '<em><b>New iD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New iD</em>' attribute.
	 * @see #setNew_iD(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAttribute_New_iD()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_iD();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAttribute#isNew_iD <em>New iD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New iD</em>' attribute.
	 * @see #isNew_iD()
	 * @generated
	 */
	void setNew_iD(boolean value);

} // DiffEAttribute
