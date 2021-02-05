/**
 */
package oracleRuleMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see oracleRuleMM.OracleRuleMMPackage
 * @generated
 */
public interface OracleRuleMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OracleRuleMMFactory eINSTANCE = oracleRuleMM.impl.OracleRuleMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern A</em>'.
	 * @generated
	 */
	Pattern_A createPattern_A();

	/**
	 * Returns a new object of class '<em>Pattern B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern B</em>'.
	 * @generated
	 */
	Pattern_B createPattern_B();

	/**
	 * Returns a new object of class '<em>Pattern C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern C</em>'.
	 * @generated
	 */
	Pattern_C createPattern_C();

	/**
	 * Returns a new object of class '<em>Pattern D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern D</em>'.
	 * @generated
	 */
	Pattern_D createPattern_D();

	/**
	 * Returns a new object of class '<em>Pattern ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern ROOT</em>'.
	 * @generated
	 */
	Pattern_ROOT createPattern_ROOT();

	/**
	 * Returns a new object of class '<em>Pattern Domain Specific Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Domain Specific Diff</em>'.
	 * @generated
	 */
	Pattern_DomainSpecificDiff createPattern_DomainSpecificDiff();

	/**
	 * Returns a new object of class '<em>Pattern Diff A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff A</em>'.
	 * @generated
	 */
	Pattern_DiffA createPattern_DiffA();

	/**
	 * Returns a new object of class '<em>Pattern Diff Aab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Aab</em>'.
	 * @generated
	 */
	Pattern_DiffA_ab createPattern_DiffA_ab();

	/**
	 * Returns a new object of class '<em>Pattern Diff B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff B</em>'.
	 * @generated
	 */
	Pattern_DiffB createPattern_DiffB();

	/**
	 * Returns a new object of class '<em>Pattern Diff Bbd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Bbd</em>'.
	 * @generated
	 */
	Pattern_DiffB_bd createPattern_DiffB_bd();

	/**
	 * Returns a new object of class '<em>Pattern Diff C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff C</em>'.
	 * @generated
	 */
	Pattern_DiffC createPattern_DiffC();

	/**
	 * Returns a new object of class '<em>Pattern Diff D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff D</em>'.
	 * @generated
	 */
	Pattern_DiffD createPattern_DiffD();

	/**
	 * Returns a new object of class '<em>Pattern Diff Ddd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Ddd</em>'.
	 * @generated
	 */
	Pattern_DiffD_dd createPattern_DiffD_dd();

	/**
	 * Returns a new object of class '<em>Pattern Diff ROOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff ROOT</em>'.
	 * @generated
	 */
	Pattern_DiffROOT createPattern_DiffROOT();

	/**
	 * Returns a new object of class '<em>Pattern Diff ROOT b</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff ROOT b</em>'.
	 * @generated
	 */
	Pattern_DiffROOT_b createPattern_DiffROOT_b();

	/**
	 * Returns a new object of class '<em>Pattern Diff ROOT a</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff ROOT a</em>'.
	 * @generated
	 */
	Pattern_DiffROOT_a createPattern_DiffROOT_a();

	/**
	 * Returns a new object of class '<em>Pattern Diff ROOT domainspecificdiffs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff ROOT domainspecificdiffs</em>'.
	 * @generated
	 */
	Pattern_DiffROOT_domainspecificdiffs createPattern_DiffROOT_domainspecificdiffs();

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
	OracleRuleMMPackage getOracleRuleMMPackage();

} //OracleRuleMMFactory
