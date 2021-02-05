/**
 */
package oracleDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROOT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.ROOT#getB <em>B</em>}</li>
 *   <li>{@link oracleDiffMM.ROOT#getA <em>A</em>}</li>
 *   <li>{@link oracleDiffMM.ROOT#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link oracleDiffMM.ROOT#getDiffb <em>Diffb</em>}</li>
 *   <li>{@link oracleDiffMM.ROOT#getDiffa <em>Diffa</em>}</li>
 *   <li>{@link oracleDiffMM.ROOT#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @see oracleDiffMM.OracleDiffMMPackage#getROOT()
 * @model
 * @generated
 */
public interface ROOT extends EObject {
	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.B}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_B()
	 * @model containment="true"
	 * @generated
	 */
	EList<B> getB();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.A}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_A()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getA();

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffb</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffROOT_b}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffb</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_Diffb()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffROOT_b> getDiffb();

	/**
	 * Returns the value of the '<em><b>Diffa</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffROOT_a}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffa</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_Diffa()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffROOT_a> getDiffa();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link oracleDiffMM.DiffROOT_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see oracleDiffMM.OracleDiffMMPackage#getROOT_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffROOT_domainspecificdiffs> getDiffdomainspecificdiffs();

} // ROOT
