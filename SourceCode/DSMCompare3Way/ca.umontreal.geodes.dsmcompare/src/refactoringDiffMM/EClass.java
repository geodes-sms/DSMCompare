/**
 */
package refactoringDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.EClass#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getNested_interfaces <em>Nested interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffnested_classes <em>Diffnested classes</em>}</li>
 *   <li>{@link refactoringDiffMM.EClass#getDiffnested_interfaces <em>Diffnested interfaces</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#getName <em>Name</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#getExtends <em>Extends</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#getImplements <em>Implements</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EClass#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Eattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattributes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Eattributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EAttribute> getEattributes();

	/**
	 * Returns the value of the '<em><b>Eoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Eoperations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOperation> getEoperations();

	/**
	 * Returns the value of the '<em><b>Ereferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereferences</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Ereferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EReference> getEreferences();

	/**
	 * Returns the value of the '<em><b>Esupertypes</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esupertypes</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Esupertypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EClass> getEsupertypes();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Nested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested classes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Nested_classes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getNested_classes();

	/**
	 * Returns the value of the '<em><b>Nested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested interfaces</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Nested_interfaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getNested_interfaces();

	/**
	 * Returns the value of the '<em><b>Diffeattributes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_eattributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeattributes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffeattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eattributes> getDiffeattributes();

	/**
	 * Returns the value of the '<em><b>Diffeoperations</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_eoperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffeoperations</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffeoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eoperations> getDiffeoperations();

	/**
	 * Returns the value of the '<em><b>Differeferences</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_ereferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differeferences</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Differeferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_ereferences> getDiffereferences();

	/**
	 * Returns the value of the '<em><b>Diffesupertypes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_esupertypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffesupertypes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffesupertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_esupertypes> getDiffesupertypes();

	/**
	 * Returns the value of the '<em><b>Diffinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffinterfaces</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_interfaces> getDiffinterfaces();

	/**
	 * Returns the value of the '<em><b>Diffnested classes</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_nested_classes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffnested classes</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffnested_classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_nested_classes> getDiffnested_classes();

	/**
	 * Returns the value of the '<em><b>Diffnested interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DiffEClass_nested_interfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffnested interfaces</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEClass_Diffnested_interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_nested_interfaces> getDiffnested_interfaces();

} // EClass
