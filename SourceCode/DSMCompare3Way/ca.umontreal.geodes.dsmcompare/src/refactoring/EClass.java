/**
 */
package refactoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring.EClass#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.EClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoring.EClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoring.EClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoring.EClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoring.EClass#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoring.EClass#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoring.EClass#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoring.EClass#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoring.EClass#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoring.EClass#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoring.EClass#getNested_interfaces <em>Nested interfaces</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#getEClass_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring.EClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see refactoring.RefactoringPackage#getEClass_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoring.EClass#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' attribute.
	 * @see #setImplements(String)
	 * @see refactoring.RefactoringPackage#getEClass_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link refactoring.EClass#getImplements <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' attribute.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see refactoring.RefactoringPackage#getEClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link refactoring.EClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see refactoring.RefactoringPackage#getEClass_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoring.EClass#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributes</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Eattributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EAttribute> getEattributes();

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereferences</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Ereferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EReference> getEreferences();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoring.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EClass> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoring.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Nested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested classes</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Nested_classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getNested_classes();

	/**
	 * Returns the value of the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested interfaces</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Nested_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getNested_interfaces();

} // EClass
