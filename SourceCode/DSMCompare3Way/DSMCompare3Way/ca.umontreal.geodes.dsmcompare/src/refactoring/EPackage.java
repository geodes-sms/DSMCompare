/**
 */
package refactoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring.EPackage#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.EPackage#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoring.EPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoring.EPackage#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#getEPackage_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring.EPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclassifiers</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEPackage_Eclassifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getEclassifiers();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEPackage_Interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.testAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEPackage_Test()
	 * @model containment="true"
	 * @generated
	 */
	EList<testAssociations> getTest();

} // EPackage
