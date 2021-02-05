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
 *   <li>{@link refactoring.EClass#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoring.EClass#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoring.EClass#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoring.EClass#getEsupertypes <em>Esupertypes</em>}</li>
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
	 * @model
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
	 * Returns the value of the '<em><b>Eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributes</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEClass_Eattributes()
	 * @model containment="true"
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
	 * @model containment="true"
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
	 * @model containment="true"
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
	 * @model
	 * @generated
	 */
	EList<EClass> getEsupertypes();

} // EClass
