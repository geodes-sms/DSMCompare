/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EClassifier#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getDiffePackage <em>Diffe Package</em>}</li>
 *   <li>{@link ecoreDiffMM.EClassifier#getDiffeTypeParameters <em>Diffe Type Parameters</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedInstanceTypeName UniqueTypeParameterNames'"
 * @generated
 */
public interface EClassifier extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_InstanceClassName()
	 * @model unsettable="true" dataType="ecoreDiffMM.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EClassifier#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_InstanceClass()
	 * @model dataType="ecoreDiffMM.EJavaClass&lt;?&gt;" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Class<?> getInstanceClass();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_DefaultValue()
	 * @model dataType="ecoreDiffMM.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type Name</em>' attribute.
	 * @see #setInstanceTypeName(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_InstanceTypeName()
	 * @model unsettable="true" dataType="ecoreDiffMM.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getInstanceTypeName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type Name</em>' attribute.
	 * @see #getInstanceTypeName()
	 * @generated
	 */
	void setInstanceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_EPackage()
	 * @see ecoreDiffMM.EPackage#getEClassifiers
	 * @model opposite="eClassifiers" changeable="false"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>Diffe Package</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClassifier_ePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Package</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_DiffePackage()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEClassifier_ePackage> getDiffePackage();

	/**
	 * Returns the value of the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClassifier_eTypeParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Type Parameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClassifier_DiffeTypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClassifier_eTypeParameters> getDiffeTypeParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean" objectDataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	boolean isInstance(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getClassifierID();

} // EClassifier
