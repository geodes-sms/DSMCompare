/**
 */
package refactoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring.Interface#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoring.Interface#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoring.Interface#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoring.Interface#getEsupertypes <em>Esupertypes</em>}</li>
 * </ul>
 *
 * @see refactoring.RefactoringPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring.RefactoringPackage#getInterface_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring.Interface#getName <em>Name</em>}' attribute.
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
	 * @see refactoring.RefactoringPackage#getInterface_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoring.Interface#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see refactoring.RefactoringPackage#getInterface_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoring.Interface#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoring.RefactoringPackage#getInterface_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoring.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoring.RefactoringPackage#getInterface_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getEsupertypes();

} // Interface
