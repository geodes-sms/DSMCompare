/**
 */
package dssmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm.CompositeFactor#getSubFactors <em>Sub Factors</em>}</li>
 * </ul>
 *
 * @see dssmm.DssmmPackage#getCompositeFactor()
 * @model
 * @generated
 */
public interface CompositeFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Sub Factors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Factors</em>' containment reference list.
	 * @see dssmm.DssmmPackage#getCompositeFactor_SubFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Factor> getSubFactors();

} // CompositeFactor
