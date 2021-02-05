/**
 */
package oracle;

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
 *   <li>{@link oracle.ROOT#getB <em>B</em>}</li>
 *   <li>{@link oracle.ROOT#getA <em>A</em>}</li>
 * </ul>
 *
 * @see oracle.OraclePackage#getROOT()
 * @model
 * @generated
 */
public interface ROOT extends EObject {
	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link oracle.B}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see oracle.OraclePackage#getROOT_B()
	 * @model containment="true"
	 * @generated
	 */
	EList<B> getB();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link oracle.A}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see oracle.OraclePackage#getROOT_A()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getA();

} // ROOT
