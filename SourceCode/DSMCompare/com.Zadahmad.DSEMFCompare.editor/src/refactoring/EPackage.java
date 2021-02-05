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
 *   <li>{@link refactoring.EPackage#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoring.EPackage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclassifiers</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getEPackage_Eclassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClass> getEclassifiers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#getEPackage_Name()
	 * @model
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

} // EPackage
