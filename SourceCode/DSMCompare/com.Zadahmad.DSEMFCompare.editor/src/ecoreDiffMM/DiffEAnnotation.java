/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEAnnotation#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEAnnotation#getNew_source <em>New source</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAnnotation()
 * @model
 * @generated
 */
public interface DiffEAnnotation extends EAnnotation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAnnotation_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAnnotation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ClassOp value);

	/**
	 * Returns the value of the '<em><b>New source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New source</em>' attribute.
	 * @see #setNew_source(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEAnnotation_New_source()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_source();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEAnnotation#getNew_source <em>New source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New source</em>' attribute.
	 * @see #getNew_source()
	 * @generated
	 */
	void setNew_source(String value);

} // DiffEAnnotation
