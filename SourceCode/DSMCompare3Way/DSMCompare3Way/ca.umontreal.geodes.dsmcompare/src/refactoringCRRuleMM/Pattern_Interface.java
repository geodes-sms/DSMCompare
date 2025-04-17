/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_Interface#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface()
 * @model
 * @generated
 */
public interface Pattern_Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_Interface#getID_Pattern <em>ID Pattern</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_Interface#isIsForbidden <em>Is Forbidden</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_Interface#getName <em>Name</em>}' attribute.
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
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_Interface#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_Interface#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pattern_EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_Interface> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeoperations</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Diffeoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffInterface_eoperations> getDiffeoperations();

	/**
	 * Returns the value of the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffesupertypes</em>' containment reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_Interface_Diffesupertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern_DiffInterface_esupertypes> getDiffesupertypes();

} // Pattern_Interface
