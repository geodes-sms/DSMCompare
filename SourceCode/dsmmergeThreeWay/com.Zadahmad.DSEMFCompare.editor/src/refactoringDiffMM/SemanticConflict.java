/**
 */
package refactoringDiffMM;

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
 *   <li>{@link refactoringDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getSemanticConflict()
 * @model
 * @generated
 */
public interface SemanticConflict extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Semanticdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link refactoringDiffMM.SemanticDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticdiffs</em>' containment reference list.
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getSemanticConflict_Semanticdiffs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SemanticDiff> getSemanticdiffs();

} // SemanticConflict
