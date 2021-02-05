/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see refactoringDiffMM.RefactoringDiffMMPackage
 * @generated
 */
public interface RefactoringDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringDiffMMFactory eINSTANCE = refactoringDiffMM.impl.RefactoringDiffMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
	EAttribute createEAttribute();

	/**
	 * Returns a new object of class '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass</em>'.
	 * @generated
	 */
	EClass createEClass();

	/**
	 * Returns a new object of class '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOperation</em>'.
	 * @generated
	 */
	EOperation createEOperation();

	/**
	 * Returns a new object of class '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPackage</em>'.
	 * @generated
	 */
	EPackage createEPackage();

	/**
	 * Returns a new object of class '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference</em>'.
	 * @generated
	 */
	EReference createEReference();

	/**
	 * Returns a new object of class '<em>Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Diff</em>'.
	 * @generated
	 */
	DomainSpecificDiff createDomainSpecificDiff();

	/**
	 * Returns a new object of class '<em>Diff EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EAttribute</em>'.
	 * @generated
	 */
	DiffEAttribute createDiffEAttribute();

	/**
	 * Returns a new object of class '<em>Diff EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EClass</em>'.
	 * @generated
	 */
	DiffEClass createDiffEClass();

	/**
	 * Returns a new object of class '<em>Diff EClass eattributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EClass eattributes</em>'.
	 * @generated
	 */
	DiffEClass_eattributes createDiffEClass_eattributes();

	/**
	 * Returns a new object of class '<em>Diff EClass eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EClass eoperations</em>'.
	 * @generated
	 */
	DiffEClass_eoperations createDiffEClass_eoperations();

	/**
	 * Returns a new object of class '<em>Diff EClass ereferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EClass ereferences</em>'.
	 * @generated
	 */
	DiffEClass_ereferences createDiffEClass_ereferences();

	/**
	 * Returns a new object of class '<em>Diff EClass esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EClass esupertypes</em>'.
	 * @generated
	 */
	DiffEClass_esupertypes createDiffEClass_esupertypes();

	/**
	 * Returns a new object of class '<em>Diff EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EOperation</em>'.
	 * @generated
	 */
	DiffEOperation createDiffEOperation();

	/**
	 * Returns a new object of class '<em>Diff EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EPackage</em>'.
	 * @generated
	 */
	DiffEPackage createDiffEPackage();

	/**
	 * Returns a new object of class '<em>Diff EPackage eclassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EPackage eclassifiers</em>'.
	 * @generated
	 */
	DiffEPackage_eclassifiers createDiffEPackage_eclassifiers();

	/**
	 * Returns a new object of class '<em>Diff EPackage domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EPackage domainspecificdiffs</em>'.
	 * @generated
	 */
	DiffEPackage_domainspecificdiffs createDiffEPackage_domainspecificdiffs();

	/**
	 * Returns a new object of class '<em>Diff EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff EReference</em>'.
	 * @generated
	 */
	DiffEReference createDiffEReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefactoringDiffMMPackage getRefactoringDiffMMPackage();

} //RefactoringDiffMMFactory
