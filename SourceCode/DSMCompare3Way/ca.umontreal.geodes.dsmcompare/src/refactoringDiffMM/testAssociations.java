/**
 */
package refactoringDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>test Associations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.testAssociations#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.testAssociations#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoringDiffMM.testAssociations#getMulti <em>Multi</em>}</li>
 *   <li>{@link refactoringDiffMM.testAssociations#getDiffsingle <em>Diffsingle</em>}</li>
 *   <li>{@link refactoringDiffMM.testAssociations#getDiffmulti <em>Diffmulti</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations()
 * @model
 * @generated
 */
public interface testAssociations extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.testAssociations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' reference.
	 * @see #setSingle(EClass)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations_Single()
	 * @model
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.testAssociations#getSingle <em>Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' reference.
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(EClass value);

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' reference list.
	 * The list contents are of type {@link refactoringDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations_Multi()
	 * @model
	 * @generated
	 */
	EList<EClass> getMulti();

	/**
	 * Returns the value of the '<em><b>Diffsingle</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DifftestAssociations_single}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsingle</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations_Diffsingle()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifftestAssociations_single> getDiffsingle();

	/**
	 * Returns the value of the '<em><b>Diffmulti</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.DifftestAssociations_multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmulti</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#gettestAssociations_Diffmulti()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifftestAssociations_multi> getDiffmulti();

} // testAssociations
