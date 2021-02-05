/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EFactory#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecoreDiffMM.EFactory#getDiffePackage <em>Diffe Package</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEFactory_EPackage()
	 * @see ecoreDiffMM.EPackage#getEFactoryInstance
	 * @model opposite="eFactoryInstance" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EFactory#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Diffe Package</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEFactory_ePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Package</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEFactory_DiffePackage()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEFactory_ePackage> getDiffePackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject create(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EJavaObject" literalValueDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	Object createFromString(EDataType eDataType, String literalValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EString" instanceValueDataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	String convertToString(EDataType eDataType, Object instanceValue);

} // EFactory
