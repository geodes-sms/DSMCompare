/**
 */
package refactoringDiffMM;

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
 *   <li>{@link refactoringDiffMM.EClass#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass()
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Eattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAttribute> getEattributes();

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Eoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereferences</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Ereferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<EReference> getEreferences();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Esupertypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeattributes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffeattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eattributes> getDiffeattributes();

	/**
	 * Returns the value of the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffeoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eoperations> getDiffeoperations();

	/**
	 * Returns the value of the '<em><b>Differeferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differeferences</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Differeferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_ereferences> getDiffereferences();

	/**
	 * Returns the value of the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffesupertypes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffesupertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_esupertypes> getDiffesupertypes();

} // EClass
