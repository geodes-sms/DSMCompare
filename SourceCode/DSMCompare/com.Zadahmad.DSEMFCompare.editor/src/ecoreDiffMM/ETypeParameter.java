/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.ETypeParameter#getEBounds <em>EBounds</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypeParameter#getDiffeBounds <em>Diffe Bounds</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypeParameter()
 * @model
 * @generated
 */
public interface ETypeParameter extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EBounds</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBounds</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypeParameter_EBounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<EGenericType> getEBounds();

	/**
	 * Returns the value of the '<em><b>Diffe Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffETypeParameter_eBounds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Bounds</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypeParameter_DiffeBounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffETypeParameter_eBounds> getDiffeBounds();

} // ETypeParameter
