/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEPackage_test <em>Semantic Object Diff EPackage test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations <em>Semantic Object Difftest Associations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_multi <em>Semantic Object Difftest Associations multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_DifftestAssociations_single <em>Semantic Object Difftest Associations single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EClass <em>Semantic Object EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_EReference <em>Semantic Object EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_Interface <em>Semantic Object Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_SemanticObject#getSemanticObject_testAssociations <em>Semantic Object test Associations</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface Pattern_SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EAttribute</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEAttribute> getSemanticObject_DiffEAttribute();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass> getSemanticObject_DiffEClass();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass eattributes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_eattributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eattributes> getSemanticObject_DiffEClass_eattributes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass eoperations</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_eoperations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eoperations> getSemanticObject_DiffEClass_eoperations();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass ereferences</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_ereferences()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_ereferences> getSemanticObject_DiffEClass_ereferences();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass esupertypes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_esupertypes> getSemanticObject_DiffEClass_esupertypes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass interfaces</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_interfaces> getSemanticObject_DiffEClass_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass nested classes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_nested_classes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_classes> getSemanticObject_DiffEClass_nested_classes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass nested interfaces</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEClass_nested_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_interfaces> getSemanticObject_DiffEClass_nested_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EOperation</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEOperation> getSemanticObject_DiffEOperation();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage> getSemanticObject_DiffEPackage();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage eclassifiers</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEPackage_eclassifiers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_eclassifiers> getSemanticObject_DiffEPackage_eclassifiers();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage interfaces</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEPackage_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_interfaces> getSemanticObject_DiffEPackage_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage test</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEPackage_test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage test</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEPackage_test()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEPackage_test> getSemanticObject_DiffEPackage_test();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EReference</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffEReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffEReference> getSemanticObject_DiffEReference();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffInterface()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface> getSemanticObject_DiffInterface();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface eoperations</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffInterface_eoperations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface_eoperations> getSemanticObject_DiffInterface_eoperations();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface esupertypes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffInterface_esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffInterface_esupertypes> getSemanticObject_DiffInterface_esupertypes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Difftest Associations</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Difftest Associations</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DifftestAssociations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations> getSemanticObject_DifftestAssociations();

	/**
	 * Returns the value of the '<em><b>Semantic Object Difftest Associations multi</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Difftest Associations multi</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DifftestAssociations_multi()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_multi> getSemanticObject_DifftestAssociations_multi();

	/**
	 * Returns the value of the '<em><b>Semantic Object Difftest Associations single</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DifftestAssociations_single}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Difftest Associations single</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DifftestAssociations_single()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DifftestAssociations_single> getSemanticObject_DifftestAssociations_single();

	/**
	 * Returns the value of the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EAttribute</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_EAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EAttribute> getSemanticObject_EAttribute();

	/**
	 * Returns the value of the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EClass</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_EClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EClass> getSemanticObject_EClass();

	/**
	 * Returns the value of the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EOperation</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_EOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EOperation> getSemanticObject_EOperation();

	/**
	 * Returns the value of the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EPackage</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_EPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EPackage> getSemanticObject_EPackage();

	/**
	 * Returns the value of the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EReference</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_EReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EReference> getSemanticObject_EReference();

	/**
	 * Returns the value of the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Interface</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_Interface()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getSemanticObject_Interface();

	/**
	 * Returns the value of the '<em><b>Semantic Object test Associations</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_testAssociations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object test Associations</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_testAssociations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_testAssociations> getSemanticObject_testAssociations();

} // Pattern_SemanticObject
