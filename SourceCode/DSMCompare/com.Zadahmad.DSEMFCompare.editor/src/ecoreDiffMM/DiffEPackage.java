/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DiffEPackage#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEPackage#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEPackage#getNew_nsURI <em>New ns URI</em>}</li>
 *   <li>{@link ecoreDiffMM.DiffEPackage#getNew_nsPrefix <em>New ns Prefix</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage()
 * @model
 * @generated
 */
public interface DiffEPackage extends EPackage {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreDiffMM.ClassOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see ecoreDiffMM.ClassOp
	 * @see #setOperation(ClassOp)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_Operation()
	 * @model required="true"
	 * @generated
	 */
	ClassOp getOperation();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage#getOperation <em>Operation</em>}' attribute.
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
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_New_name()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_name();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage#getNew_name <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name</em>' attribute.
	 * @see #getNew_name()
	 * @generated
	 */
	void setNew_name(String value);

	/**
	 * Returns the value of the '<em><b>New ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New ns URI</em>' attribute.
	 * @see #setNew_nsURI(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_New_nsURI()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_nsURI();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage#getNew_nsURI <em>New ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New ns URI</em>' attribute.
	 * @see #getNew_nsURI()
	 * @generated
	 */
	void setNew_nsURI(String value);

	/**
	 * Returns the value of the '<em><b>New ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New ns Prefix</em>' attribute.
	 * @see #setNew_nsPrefix(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDiffEPackage_New_nsPrefix()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNew_nsPrefix();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DiffEPackage#getNew_nsPrefix <em>New ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New ns Prefix</em>' attribute.
	 * @see #getNew_nsPrefix()
	 * @generated
	 */
	void setNew_nsPrefix(String value);

} // DiffEPackage
