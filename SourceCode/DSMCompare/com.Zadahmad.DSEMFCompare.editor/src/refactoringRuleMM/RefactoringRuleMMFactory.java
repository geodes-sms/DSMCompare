/**
 */
package refactoringRuleMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see refactoringRuleMM.RefactoringRuleMMPackage
 * @generated
 */
public interface RefactoringRuleMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringRuleMMFactory eINSTANCE = refactoringRuleMM.impl.RefactoringRuleMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern EAttribute</em>'.
	 * @generated
	 */
	Pattern_EAttribute createPattern_EAttribute();

	/**
	 * Returns a new object of class '<em>Pattern EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern EClass</em>'.
	 * @generated
	 */
	Pattern_EClass createPattern_EClass();

	/**
	 * Returns a new object of class '<em>Pattern EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern EOperation</em>'.
	 * @generated
	 */
	Pattern_EOperation createPattern_EOperation();

	/**
	 * Returns a new object of class '<em>Pattern EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern EPackage</em>'.
	 * @generated
	 */
	Pattern_EPackage createPattern_EPackage();

	/**
	 * Returns a new object of class '<em>Pattern EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern EReference</em>'.
	 * @generated
	 */
	Pattern_EReference createPattern_EReference();

	/**
	 * Returns a new object of class '<em>Pattern Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Domain Specific Diff</em>'.
	 * @generated
	 */
	Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff();

	/**
	 * Returns a new object of class '<em>Pattern Diff EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EAttribute</em>'.
	 * @generated
	 */
	Pattern_DiffEAttribute createPattern_DiffEAttribute();

	/**
	 * Returns a new object of class '<em>Pattern Diff EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EClass</em>'.
	 * @generated
	 */
	Pattern_DiffEClass createPattern_DiffEClass();

	/**
	 * Returns a new object of class '<em>Pattern Diff EClass eattributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EClass eattributes</em>'.
	 * @generated
	 */
	Pattern_DiffEClass_eattributes createPattern_DiffEClass_eattributes();

	/**
	 * Returns a new object of class '<em>Pattern Diff EClass eoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EClass eoperations</em>'.
	 * @generated
	 */
	Pattern_DiffEClass_eoperations createPattern_DiffEClass_eoperations();

	/**
	 * Returns a new object of class '<em>Pattern Diff EClass ereferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EClass ereferences</em>'.
	 * @generated
	 */
	Pattern_DiffEClass_ereferences createPattern_DiffEClass_ereferences();

	/**
	 * Returns a new object of class '<em>Pattern Diff EClass esupertypes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EClass esupertypes</em>'.
	 * @generated
	 */
	Pattern_DiffEClass_esupertypes createPattern_DiffEClass_esupertypes();

	/**
	 * Returns a new object of class '<em>Pattern Diff EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EOperation</em>'.
	 * @generated
	 */
	Pattern_DiffEOperation createPattern_DiffEOperation();

	/**
	 * Returns a new object of class '<em>Pattern Diff EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EPackage</em>'.
	 * @generated
	 */
	Pattern_DiffEPackage createPattern_DiffEPackage();

	/**
	 * Returns a new object of class '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EPackage eclassifiers</em>'.
	 * @generated
	 */
	Pattern_DiffEPackage_eclassifiers createPattern_DiffEPackage_eclassifiers();

	/**
	 * Returns a new object of class '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EPackage domainspecificdiffs</em>'.
	 * @generated
	 */
	Pattern_DiffEPackage_domainspecificdiffs createPattern_DiffEPackage_domainspecificdiffs();

	/**
	 * Returns a new object of class '<em>Pattern Diff EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff EReference</em>'.
	 * @generated
	 */
	Pattern_DiffEReference createPattern_DiffEReference();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefactoringRuleMMPackage getRefactoringRuleMMPackage();

} //RefactoringRuleMMFactory
