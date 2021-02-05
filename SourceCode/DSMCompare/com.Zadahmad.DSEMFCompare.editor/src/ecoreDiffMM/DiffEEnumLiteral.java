/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEEnumLiteral#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnumLiteral#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnumLiteral#getNew_value <em>New value</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnumLiteral#getNew_instance <em>New instance</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEEnumLiteral#getNew_literal <em>New literal</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral()
 * @model
 * @generated
 */
public interface DiffEEnumLiteral extends EEnumLiteral {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnumLiteral#getOperation <em>Operation</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New value</em>' attribute.
	 * @see #setNew_value(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral_New_value()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getNew_value();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_value <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New value</em>' attribute.
	 * @see #getNew_value()
	 * @generated
	 */
	void setNew_value(int value);

	/**
	 * Returns the value of the '<em><b>New instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New instance</em>' attribute.
	 * @see #setNew_instance(Enumerator)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral_New_instance()
	 * @model dataType="ecoreDiffMM.EEnumerator" transient="true"
	 * @generated
	 */
	Enumerator getNew_instance();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_instance <em>New instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New instance</em>' attribute.
	 * @see #getNew_instance()
	 * @generated
	 */
	void setNew_instance(Enumerator value);

	/**
	 * Returns the value of the '<em><b>New literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New literal</em>' attribute.
	 * @see #setNew_literal(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEEnumLiteral_New_literal()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_literal();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEEnumLiteral#getNew_literal <em>New literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New literal</em>' attribute.
	 * @see #getNew_literal()
	 * @generated
	 */
	void setNew_literal(String value);

} // DiffEEnumLiteral
