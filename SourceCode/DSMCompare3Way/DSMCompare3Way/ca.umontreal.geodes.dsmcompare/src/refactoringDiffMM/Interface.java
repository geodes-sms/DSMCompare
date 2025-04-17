/**
 */
package refactoringDiffMM;

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
 *   <li>{@link refactoringDiffMM.Interface#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.Interface#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface()
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.Interface#getName <em>Name</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.Interface#getExtends <em>Extends</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.Interface#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Diffeoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffInterface_eoperations> getDiffeoperations();

	/**
	 * Returns the value of the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffesupertypes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getInterface_Diffesupertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffInterface_esupertypes> getDiffesupertypes();

} // Interface
