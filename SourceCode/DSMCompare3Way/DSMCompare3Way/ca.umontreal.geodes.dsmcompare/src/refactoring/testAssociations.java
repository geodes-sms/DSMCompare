/**
 */
package refactoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>test Associations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring.testAssociations#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.testAssociations#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoring.testAssociations#getMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#gettestAssociations()
 * @model
 * @generated
 */
public interface testAssociations extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#gettestAssociations_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring.testAssociations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' reference.
	 * @see #setSingle(EClass)
	 * @see refactoring.RefactoringPackage#gettestAssociations_Single()
	 * @model
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Sets the value of the '{@link refactoring.testAssociations#getSingle <em>Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' reference.
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(EClass value);

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' reference list.
	 * The list contents are of type {@link refactoring.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' reference list.
	 * @see refactoring.RefactoringPackage#gettestAssociations_Multi()
	 * @model
	 * @generated
	 */
	EList<EClass> getMulti();

} // testAssociations
