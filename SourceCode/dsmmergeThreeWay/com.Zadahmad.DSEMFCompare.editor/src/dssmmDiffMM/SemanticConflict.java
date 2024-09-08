/**
 */
package dssmmDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticConflict()
 * @model
 * @generated
 */
public interface SemanticConflict extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Semanticdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.SemanticDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticdiffs</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticConflict_Semanticdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticDiff> getSemanticdiffs();

} // SemanticConflict
