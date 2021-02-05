/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEParameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#isNew_ordered <em>New ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#isNew_unique <em>New unique</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#getNew_lowerBound <em>New lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#getNew_upperBound <em>New upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#isNew_many <em>New many</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEParameter#isNew_required <em>New required</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter()
 * @model
 * @generated
 */
public interface DiffEParameter extends EParameter {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#getOperation <em>Operation</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#getNew_name <em>New name</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_ordered()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_ordered();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#isNew_ordered <em>New ordered</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_unique()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_unique();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#isNew_unique <em>New unique</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_lowerBound()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getNew_lowerBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#getNew_lowerBound <em>New lower Bound</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_upperBound()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getNew_upperBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#getNew_upperBound <em>New upper Bound</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_many()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_many();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#isNew_many <em>New many</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEParameter_New_required()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isNew_required();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEParameter#isNew_required <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New required</em>' attribute.
	 * @see #isNew_required()
	 * @generated
	 */
	void setNew_required(boolean value);

} // DiffEParameter
