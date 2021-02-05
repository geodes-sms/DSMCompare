/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EParameter#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link ecoreDiffMM.EParameter#getDiffeOperation <em>Diffe Operation</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEParameter_EOperation()
	 * @see ecoreDiffMM.EOperation#getEParameters
	 * @model opposite="eParameters" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EOperation getEOperation();

	/**
	 * Returns the value of the '<em><b>Diffe Operation</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEParameter_eOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Operation</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEParameter_DiffeOperation()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEParameter_eOperation> getDiffeOperation();

} // EParameter
