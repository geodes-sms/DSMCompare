/**
 */
package refactoring2WayRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import refactoring2WayDiffMM.DiffEAttribute;
import refactoring2WayDiffMM.DiffEClass;
import refactoring2WayDiffMM.DiffEClass_eattributes;
import refactoring2WayDiffMM.DiffEClass_eoperations;
import refactoring2WayDiffMM.DiffEClass_ereferences;
import refactoring2WayDiffMM.DiffEClass_esupertypes;
import refactoring2WayDiffMM.DiffEClass_interfaces;
import refactoring2WayDiffMM.DiffEClass_nested_classes;
import refactoring2WayDiffMM.DiffEClass_nested_interfaces;
import refactoring2WayDiffMM.DiffEOperation;
import refactoring2WayDiffMM.DiffEPackage;
import refactoring2WayDiffMM.DiffEPackage_eclassifiers;
import refactoring2WayDiffMM.DiffEPackage_interfaces;
import refactoring2WayDiffMM.DiffEReference;
import refactoring2WayDiffMM.DiffInterface;
import refactoring2WayDiffMM.DiffInterface_eoperations;
import refactoring2WayDiffMM.DiffInterface_esupertypes;
import refactoring2WayDiffMM.EAttribute;
import refactoring2WayDiffMM.EClass;
import refactoring2WayDiffMM.EOperation;
import refactoring2WayDiffMM.EPackage;
import refactoring2WayDiffMM.EReference;
import refactoring2WayDiffMM.Interface;
import refactoring2WayDiffMM.SemanticObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEAttribute <em>Rule Pattern Diff EAttribute</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass <em>Rule Pattern Diff EClass</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eattributes <em>Rule Pattern Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_eoperations <em>Rule Pattern Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_ereferences <em>Rule Pattern Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_esupertypes <em>Rule Pattern Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_interfaces <em>Rule Pattern Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_classes <em>Rule Pattern Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEClass_nested_interfaces <em>Rule Pattern Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEOperation <em>Rule Pattern Diff EOperation</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage <em>Rule Pattern Diff EPackage</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_eclassifiers <em>Rule Pattern Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEPackage_interfaces <em>Rule Pattern Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffEReference <em>Rule Pattern Diff EReference</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface <em>Rule Pattern Diff Interface</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_eoperations <em>Rule Pattern Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_DiffInterface_esupertypes <em>Rule Pattern Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_EAttribute <em>Rule Pattern EAttribute</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_EClass <em>Rule Pattern EClass</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_EOperation <em>Rule Pattern EOperation</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_EPackage <em>Rule Pattern EPackage</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_EReference <em>Rule Pattern EReference</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_Interface <em>Rule Pattern Interface</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.Rule#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 * </ul>
 *
 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule()
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring2WayRuleMM.Rule#getName <em>Name</em>}' attribute.
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_Constraints()
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
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link refactoring2WayRuleMM.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EAttribute</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EAttribute</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEAttribute> getRulePattern_DiffEAttribute();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass> getRulePattern_DiffEClass();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass eattributes</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_eattributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_eattributes> getRulePattern_DiffEClass_eattributes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass eoperations</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_eoperations> getRulePattern_DiffEClass_eoperations();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass ereferences</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_ereferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_ereferences> getRulePattern_DiffEClass_ereferences();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass esupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass esupertypes</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_esupertypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_esupertypes> getRulePattern_DiffEClass_esupertypes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass interfaces</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_interfaces> getRulePattern_DiffEClass_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass nested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass nested classes</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_nested_classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_nested_classes> getRulePattern_DiffEClass_nested_classes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EClass nested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EClass nested interfaces</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEClass_nested_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEClass_nested_interfaces> getRulePattern_DiffEClass_nested_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EOperation</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EOperation</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEOperation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEOperation> getRulePattern_DiffEOperation();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EPackage</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EPackage</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEPackage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEPackage> getRulePattern_DiffEPackage();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EPackage eclassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EPackage eclassifiers</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEPackage_eclassifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEPackage_eclassifiers> getRulePattern_DiffEPackage_eclassifiers();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EPackage interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EPackage interfaces</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEPackage_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEPackage_interfaces> getRulePattern_DiffEPackage_interfaces();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff EReference</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff EReference</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffEReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffEReference> getRulePattern_DiffEReference();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Interface</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Interface</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffInterface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffInterface> getRulePattern_DiffInterface();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Interface eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Interface eoperations</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffInterface_eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffInterface_eoperations> getRulePattern_DiffInterface_eoperations();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Diff Interface esupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Diff Interface esupertypes</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_DiffInterface_esupertypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiffInterface_esupertypes> getRulePattern_DiffInterface_esupertypes();

	/**
	 * Returns the value of the '<em><b>Rule Pattern EAttribute</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern EAttribute</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_EAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EAttribute> getRulePattern_EAttribute();

	/**
	 * Returns the value of the '<em><b>Rule Pattern EClass</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern EClass</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_EClass()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getRulePattern_EClass();

	/**
	 * Returns the value of the '<em><b>Rule Pattern EOperation</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern EOperation</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_EOperation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOperation> getRulePattern_EOperation();

	/**
	 * Returns the value of the '<em><b>Rule Pattern EPackage</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern EPackage</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_EPackage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EPackage> getRulePattern_EPackage();

	/**
	 * Returns the value of the '<em><b>Rule Pattern EReference</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern EReference</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_EReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EReference> getRulePattern_EReference();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Interface</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Interface</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_Interface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getRulePattern_Interface();

	/**
	 * Returns the value of the '<em><b>Rule Pattern Semantic Object</b></em>' containment reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.SemanticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern Semantic Object</em>' containment reference list.
	 * @see refactoring2WayRuleMM.Refactoring2WayRuleMMPackage#getRule_RulePattern_SemanticObject()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SemanticObject> getRulePattern_SemanticObject();

} // Rule
