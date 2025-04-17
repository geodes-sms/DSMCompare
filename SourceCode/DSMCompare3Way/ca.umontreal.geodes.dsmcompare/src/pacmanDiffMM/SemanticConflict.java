/**
 */
package pacmanDiffMM;

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
 *   <li>{@link pacmanDiffMM.SemanticConflict#getConflict_kind <em>Conflict kind</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}</li>
 *   <li>{@link pacmanDiffMM.SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict()
 * @model
 * @generated
 */
public interface SemanticConflict extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Conflict kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict kind</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #setConflict_kind(ChangeStatus)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_Conflict_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getConflict_kind();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.SemanticConflict#getConflict_kind <em>Conflict kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict kind</em>' attribute.
	 * @see pacmanDiffMM.ChangeStatus
	 * @see #getConflict_kind()
	 * @generated
	 */
	void setConflict_kind(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Conflict Granularity</b></em>' attribute.
	 * The default value is <code>"NIL"</code>.
	 * The literals are from the enumeration {@link pacmanDiffMM.ConflictGranularity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Granularity</em>' attribute.
	 * @see pacmanDiffMM.ConflictGranularity
	 * @see #setConflict_Granularity(ConflictGranularity)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_Conflict_Granularity()
	 * @model default="NIL" unique="false" required="true"
	 * @generated
	 */
	ConflictGranularity getConflict_Granularity();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Granularity</em>' attribute.
	 * @see pacmanDiffMM.ConflictGranularity
	 * @see #getConflict_Granularity()
	 * @generated
	 */
	void setConflict_Granularity(ConflictGranularity value);

	/**
	 * Returns the value of the '<em><b>Semanticdiffs</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.SemanticDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticdiffs</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getSemanticConflict_Semanticdiffs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SemanticDiff> getSemanticdiffs();

} // SemanticConflict
