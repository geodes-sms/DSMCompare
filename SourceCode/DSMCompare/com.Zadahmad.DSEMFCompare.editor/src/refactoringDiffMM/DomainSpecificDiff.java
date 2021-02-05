/**
 */
package refactoringDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}</li>
 *   <li>{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}</li>
 *   <li>{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}</li>
 *   <li>{@link refactoringDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff()
 * @model
 * @generated
 */
public interface DomainSpecificDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EAttribute</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EAttribute()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getDomainSpecificDiff_EAttribute();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EClass</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EClass()
	 * @model
	 * @generated
	 */
	EList<EClass> getDomainSpecificDiff_EClass();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EOperation</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EOperation()
	 * @model
	 * @generated
	 */
	EList<EOperation> getDomainSpecificDiff_EOperation();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EReference</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EReference()
	 * @model
	 * @generated
	 */
	EList<EReference> getDomainSpecificDiff_EReference();

} // DomainSpecificDiff
