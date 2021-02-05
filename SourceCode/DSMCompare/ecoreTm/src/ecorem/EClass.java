/**
 */
package ecorem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecorem.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecorem.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecorem.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecorem.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecorem.EClass#getEReferences <em>EReferences</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ecorem.EcoremPackage#getEClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ecorem.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see ecorem.EcoremPackage#getEClass_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link ecorem.EClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' containment reference list.
	 * The list contents are of type {@link ecorem.EAttribute}.
	 * It is bidirectional and its opposite is '{@link ecorem.EAttribute#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' containment reference list.
	 * @see ecorem.EcoremPackage#getEClass_EAttributes()
	 * @see ecorem.EAttribute#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link ecorem.EOperation}.
	 * It is bidirectional and its opposite is '{@link ecorem.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see ecorem.EcoremPackage#getEClass_EOperations()
	 * @see ecorem.EOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link ecorem.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see #isSetESuperTypes()
	 * @see #unsetESuperTypes()
	 * @see ecorem.EcoremPackage#getEClass_ESuperTypes()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<EClass> getESuperTypes();

	/**
	 * Unsets the value of the '{@link ecorem.EClass#getESuperTypes <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetESuperTypes()
	 * @see #getESuperTypes()
	 * @generated
	 */
	void unsetESuperTypes();

	/**
	 * Returns whether the value of the '{@link ecorem.EClass#getESuperTypes <em>ESuper Types</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ESuper Types</em>' reference list is set.
	 * @see #unsetESuperTypes()
	 * @see #getESuperTypes()
	 * @generated
	 */
	boolean isSetESuperTypes();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' containment reference list.
	 * The list contents are of type {@link ecorem.EReference}.
	 * It is bidirectional and its opposite is '{@link ecorem.EReference#getEReferenceType <em>EReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' containment reference list.
	 * @see ecorem.EcoremPackage#getEClass_EReferences()
	 * @see ecorem.EReference#getEReferenceType
	 * @model opposite="eReferenceType" containment="true" required="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEReferences();

} // EClass
