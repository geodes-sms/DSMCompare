/**
 */
package refactoringDiffMM;

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
 *   <li>{@link refactoringDiffMM.EPackage#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoringDiffMM.EPackage#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EPackage#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link refactoringDiffMM.EPackage#getDiffeclassifiers <em>Diffeclassifiers</em>}</li>
 *   <li>{@link refactoringDiffMM.EPackage#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclassifiers</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage_Eclassifiers()
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffeclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeclassifiers</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage_Diffeclassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_eclassifiers> getDiffeclassifiers();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEPackage_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEPackage_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_domainspecificdiffs> getDiffdomainspecificdiffs();

} // EPackage
