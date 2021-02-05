/**
 */
package ecoreDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EDataType#isSerializable <em>Serializable</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEDataType()
 * @model
 * @generated
 */
public interface EDataType extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEDataType_Serializable()
	 * @model default="true" dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EDataType#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

} // EDataType
