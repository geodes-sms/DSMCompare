/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getNested_interfaces <em>Nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffnested_classes <em>Diffnested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_EClass#getDiffnested_interfaces <em>Diffnested interfaces</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass()
 * @model
 * @generated
 */
public interface Pattern_EClass extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#isIsForbidden <em>Is Forbidden</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#getName <em>Name</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' attribute.
	 * @see #setImplements(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#getImplements <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' attribute.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_EClass#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Eattributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EAttribute> getEattributes();

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereferences</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Ereferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EReference> getEreferences();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_EClass> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Nested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested classes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Nested_classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EClass> getNested_classes();

	/**
	 * Returns the value of the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Nested_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getNested_interfaces();

	/**
	 * Returns the value of the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeattributes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffeattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eattributes> getDiffeattributes();

	/**
	 * Returns the value of the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffeoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_eoperations> getDiffeoperations();

	/**
	 * Returns the value of the '<em><b>Differeferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differeferences</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Differeferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_ereferences> getDiffereferences();

	/**
	 * Returns the value of the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffesupertypes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffesupertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_esupertypes> getDiffesupertypes();

	/**
	 * Returns the value of the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinterfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_interfaces> getDiffinterfaces();

	/**
	 * Returns the value of the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffnested classes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffnested_classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_classes> getDiffnested_classes();

	/**
	 * Returns the value of the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffnested interfaces</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_EClass_Diffnested_interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffEClass_nested_interfaces> getDiffnested_interfaces();

} // Pattern_EClass
