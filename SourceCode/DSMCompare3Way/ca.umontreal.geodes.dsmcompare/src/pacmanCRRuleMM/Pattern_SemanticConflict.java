/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticConflict()
 * @model
 * @generated
 */
public interface Pattern_SemanticConflict extends Pattern_SemanticObject {
	/**
	 * Returns the value of the '<em><b>Conflict kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict kind</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setConflict_kind(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticConflict_Conflict_kind()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getConflict_kind();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict kind</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getConflict_kind()
	 * @generated
	 */
	void setConflict_kind(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Conflict Granularity</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ConflictGranularity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Granularity</em>' attribute.
	 * @see pacmanCRRuleMM.ConflictGranularity
	 * @see #setConflict_Granularity(ConflictGranularity)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticConflict_Conflict_Granularity()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictGranularity getConflict_Granularity();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Granularity</em>' attribute.
	 * @see pacmanCRRuleMM.ConflictGranularity
	 * @see #getConflict_Granularity()
	 * @generated
	 */
	void setConflict_Granularity(ConflictGranularity value);

	/**
	 * Returns the value of the '<em><b>Semanticdiffs</b></em>' reference list.
	 * The list contents are of type {@link pacmanCRRuleMM.Pattern_SemanticDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticdiffs</em>' reference list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_SemanticConflict_Semanticdiffs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticDiff> getSemanticdiffs();

} // Pattern_SemanticConflict
