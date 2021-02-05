/**
 */
package oracleDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_A <em>Domain Specific Diff A</em>}</li>
 *   <li>{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_B <em>Domain Specific Diff B</em>}</li>
 *   <li>{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_C <em>Domain Specific Diff C</em>}</li>
 *   <li>{@link oracleDiffMM.DomainSpecificDiff#getDomainSpecificDiff_D <em>Domain Specific Diff D</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff()
 * @model
 * @generated
 */
public interface DomainSpecificDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oracleDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff A</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.A}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff A</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_A()
	 * @model
	 * @generated
	 */
	EList<A> getDomainSpecificDiff_A();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff B</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.B}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff B</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_B()
	 * @model
	 * @generated
	 */
	EList<B> getDomainSpecificDiff_B();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff C</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.C}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff C</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_C()
	 * @model
	 * @generated
	 */
	EList<C> getDomainSpecificDiff_C();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff D</b></em>' reference list.
	 * The list contents are of type {@link oracleDiffMM.D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff D</em>' reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_D()
	 * @model
	 * @generated
	 */
	EList<D> getDomainSpecificDiff_D();

} // DomainSpecificDiff
