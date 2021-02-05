/**
 */
package refactoringDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.EAttribute#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.EAttribute#getEtype <em>Etype</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Etype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etype</em>' attribute.
	 * @see #setEtype(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getEAttribute_Etype()
	 * @model
	 * @generated
	 */
	String getEtype();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.EAttribute#getEtype <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etype</em>' attribute.
	 * @see #getEtype()
	 * @generated
	 */
	void setEtype(String value);

} // EAttribute
