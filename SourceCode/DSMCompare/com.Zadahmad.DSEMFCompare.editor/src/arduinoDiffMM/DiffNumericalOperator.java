/**
 */
package arduinoDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Numerical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.DiffNumericalOperator#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffNumericalOperator#getNew_value <em>New value</em>}</li>
 *   <li>{@link arduinoDiffMM.DiffNumericalOperator#getNew_operator <em>New operator</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffNumericalOperator()
 * @model
 * @generated
 */
public interface DiffNumericalOperator extends NumericalOperator {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffNumericalOperator_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffNumericalOperator#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see arduinoDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(String)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffNumericalOperator_New_value()
	 * @model
	 * @generated
	 */
	String getNew_value();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffNumericalOperator#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(String value);

	/**
	 * Returns the value of the '<em><b>New operator</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoDiffMM.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New operator</em>' attribute.
	 * @see arduinoDiffMM.OperatorKind
	 * @see #setNew_operator(OperatorKind)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getDiffNumericalOperator_New_operator()
	 * @model
	 * @generated
	 */
	OperatorKind getNew_operator();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.DiffNumericalOperator#getNew_operator <em>New operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New operator</em>' attribute.
	 * @see arduinoDiffMM.OperatorKind
	 * @see #getNew_operator()
	 * @generated
	 */
	void setNew_operator(OperatorKind value);

} // DiffNumericalOperator
