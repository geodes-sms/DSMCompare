/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEAttribute <em>Rule Pattern Pattern Diff EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass <em>Rule Pattern Pattern Diff EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eattributes <em>Rule Pattern Pattern Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_eoperations <em>Rule Pattern Pattern Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_ereferences <em>Rule Pattern Pattern Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_esupertypes <em>Rule Pattern Pattern Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_interfaces <em>Rule Pattern Pattern Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_classes <em>Rule Pattern Pattern Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEClass_nested_interfaces <em>Rule Pattern Pattern Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEOperation <em>Rule Pattern Pattern Diff EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage <em>Rule Pattern Pattern Diff EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_eclassifiers <em>Rule Pattern Pattern Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_interfaces <em>Rule Pattern Pattern Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEPackage_test <em>Rule Pattern Pattern Diff EPackage test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffEReference <em>Rule Pattern Pattern Diff EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface <em>Rule Pattern Pattern Diff Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_eoperations <em>Rule Pattern Pattern Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DiffInterface_esupertypes <em>Rule Pattern Pattern Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations <em>Rule Pattern Pattern Difftest Associations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_multi <em>Rule Pattern Pattern Difftest Associations multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_DifftestAssociations_single <em>Rule Pattern Pattern Difftest Associations single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EAttribute <em>Rule Pattern Pattern EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EClass <em>Rule Pattern Pattern EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EOperation <em>Rule Pattern Pattern EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EPackage <em>Rule Pattern Pattern EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_EReference <em>Rule Pattern Pattern EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_Interface <em>Rule Pattern Pattern Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Rule#getRulePattern_Pattern_testAssociations <em>Rule Pattern Pattern test Associations</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Semantic Object</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EAttribute</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EAttribute</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEAttribute> getRulePattern_Pattern_DiffEAttribute();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass> getRulePattern_Pattern_DiffEClass();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass eattributes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_eattributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eattributes> getRulePattern_Pattern_DiffEClass_eattributes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass eoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eoperations> getRulePattern_Pattern_DiffEClass_eoperations();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass ereferences</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_ereferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_ereferences> getRulePattern_Pattern_DiffEClass_ereferences();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass esupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass esupertypes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_esupertypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_esupertypes> getRulePattern_Pattern_DiffEClass_esupertypes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_interfaces> getRulePattern_Pattern_DiffEClass_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass nested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass nested classes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_nested_classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_classes> getRulePattern_Pattern_DiffEClass_nested_classes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EClass nested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EClass nested interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEClass_nested_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_interfaces> getRulePattern_Pattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EOperation</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EOperation</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEOperation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEOperation> getRulePattern_Pattern_DiffEOperation();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EPackage</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EPackage</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEPackage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage> getRulePattern_Pattern_DiffEPackage();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EPackage eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EPackage eclassifiers</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEPackage_eclassifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_eclassifiers> getRulePattern_Pattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EPackage interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EPackage interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEPackage_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_interfaces> getRulePattern_Pattern_DiffEPackage_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EPackage test</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EPackage test</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEPackage_test()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_test> getRulePattern_Pattern_DiffEPackage_test();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff EReference</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff EReference</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffEReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEReference> getRulePattern_Pattern_DiffEReference();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Interface</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Interface</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffInterface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface> getRulePattern_Pattern_DiffInterface();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Interface eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Interface eoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffInterface_eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface_eoperations> getRulePattern_Pattern_DiffInterface_eoperations();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Diff Interface esupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Diff Interface esupertypes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DiffInterface_esupertypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface_esupertypes> getRulePattern_Pattern_DiffInterface_esupertypes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Difftest Associations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Difftest Associations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DifftestAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations> getRulePattern_Pattern_DifftestAssociations();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Difftest Associations multi</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Difftest Associations multi</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DifftestAssociations_multi()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_multi> getRulePattern_Pattern_DifftestAssociations_multi();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Difftest Associations single</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_single}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Difftest Associations single</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_DifftestAssociations_single()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_single> getRulePattern_Pattern_DifftestAssociations_single();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern EAttribute</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern EAttribute</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_EAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EAttribute> getRulePattern_Pattern_EAttribute();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern EClass</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern EClass</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_EClass()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EClass> getRulePattern_Pattern_EClass();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern EOperation</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern EOperation</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_EOperation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EOperation> getRulePattern_Pattern_EOperation();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern EPackage</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern EPackage</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_EPackage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EPackage> getRulePattern_Pattern_EPackage();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern EReference</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern EReference</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_EReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EReference> getRulePattern_Pattern_EReference();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern Interface</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern Interface</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_Interface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getRulePattern_Pattern_Interface();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Pattern test Associations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_testAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Pattern test Associations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getRule_RulePattern_Pattern_testAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_testAssociations> getRulePattern_Pattern_testAssociations();

} // Rule
