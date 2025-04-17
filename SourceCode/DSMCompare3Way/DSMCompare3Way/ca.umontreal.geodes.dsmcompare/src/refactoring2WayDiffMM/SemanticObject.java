/**
 */
package refactoring2WayDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EClass <em>Semantic Object EClass</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_EReference <em>Semantic Object EReference</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.SemanticObject#getSemanticObject_Interface <em>Semantic Object Interface</em>}</li>
 * </ul>
 *
 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoring2WayDiffMM.SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EAttribute</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EAttribute</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEAttribute> getSemanticObject_DiffEAttribute();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass> getSemanticObject_DiffEClass();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass eattributes</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass eattributes</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_eattributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_eattributes> getSemanticObject_DiffEClass_eattributes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass eoperations</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass eoperations</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_eoperations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_eoperations> getSemanticObject_DiffEClass_eoperations();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass ereferences</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass ereferences</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_ereferences()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_ereferences> getSemanticObject_DiffEClass_ereferences();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass esupertypes</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_esupertypes> getSemanticObject_DiffEClass_esupertypes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass interfaces</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_interfaces> getSemanticObject_DiffEClass_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass nested classes</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass nested classes</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_nested_classes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_nested_classes> getSemanticObject_DiffEClass_nested_classes();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EClass nested interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EClass nested interfaces</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEClass_nested_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEClass_nested_interfaces> getSemanticObject_DiffEClass_nested_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EOperation</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EOperation</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEOperation> getSemanticObject_DiffEOperation();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEPackage> getSemanticObject_DiffEPackage();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage eclassifiers</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_eclassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage eclassifiers</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEPackage_eclassifiers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEPackage_eclassifiers> getSemanticObject_DiffEPackage_eclassifiers();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EPackage interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEPackage_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EPackage interfaces</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEPackage_interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEPackage_interfaces> getSemanticObject_DiffEPackage_interfaces();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff EReference</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffEReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff EReference</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffEReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffEReference> getSemanticObject_DiffEReference();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffInterface()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffInterface> getSemanticObject_DiffInterface();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface eoperations</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface eoperations</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffInterface_eoperations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffInterface_eoperations> getSemanticObject_DiffInterface_eoperations();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Interface esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.DiffInterface_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Interface esupertypes</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_DiffInterface_esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffInterface_esupertypes> getSemanticObject_DiffInterface_esupertypes();

	/**
	 * Returns the value of the '<em><b>Semantic Object EAttribute</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EAttribute</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_EAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EAttribute> getSemanticObject_EAttribute();

	/**
	 * Returns the value of the '<em><b>Semantic Object EClass</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EClass</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_EClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EClass> getSemanticObject_EClass();

	/**
	 * Returns the value of the '<em><b>Semantic Object EOperation</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EOperation</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_EOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EOperation> getSemanticObject_EOperation();

	/**
	 * Returns the value of the '<em><b>Semantic Object EPackage</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EPackage</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_EPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EPackage> getSemanticObject_EPackage();

	/**
	 * Returns the value of the '<em><b>Semantic Object EReference</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object EReference</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_EReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EReference> getSemanticObject_EReference();

	/**
	 * Returns the value of the '<em><b>Semantic Object Interface</b></em>' reference list.
	 * The list contents are of type {@link refactoring2WayDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Interface</em>' reference list.
	 * @see refactoring2WayDiffMM.Refactoring2WayDiffMMPackage#getSemanticObject_SemanticObject_Interface()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getSemanticObject_Interface();

} // SemanticObject
