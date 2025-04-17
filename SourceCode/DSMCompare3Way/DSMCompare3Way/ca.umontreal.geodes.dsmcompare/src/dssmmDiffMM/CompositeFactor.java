/**
 */
package dssmmDiffMM;

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
 *   <li>{@link dssmmDiffMM.CompositeFactor#getSubFactors <em>Sub Factors</em>}</li>
 *   <li>{@link dssmmDiffMM.CompositeFactor#getDiffsubFactors <em>Diffsub Factors</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getCompositeFactor()
 * @model
 * @generated
 */
public interface CompositeFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Sub Factors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Factors</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getCompositeFactor_SubFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Factor> getSubFactors();

	/**
	 * Returns the value of the '<em><b>Diffsub Factors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffCompositeFactor_subFactors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffsub Factors</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getCompositeFactor_DiffsubFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffCompositeFactor_subFactors> getDiffsubFactors();

} // CompositeFactor
