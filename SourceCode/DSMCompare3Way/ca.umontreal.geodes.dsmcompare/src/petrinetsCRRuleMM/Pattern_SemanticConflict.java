/**
 */
package petrinetsCRRuleMM;

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
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticConflict()
 * @model
 * @generated
 */
public interface Pattern_SemanticConflict extends Pattern_SemanticObject {
	/**
	 * Returns the value of the '<em><b>Conflict kind</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict kind</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #setConflict_kind(ChangeStatus)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticConflict_Conflict_kind()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getConflict_kind();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_kind <em>Conflict kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict kind</em>' attribute.
	 * @see petrinetsCRRuleMM.ChangeStatus
	 * @see #getConflict_kind()
	 * @generated
	 */
	void setConflict_kind(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Conflict Granularity</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.ConflictGranularity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Granularity</em>' attribute.
	 * @see petrinetsCRRuleMM.ConflictGranularity
	 * @see #setConflict_Granularity(ConflictGranularity)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticConflict_Conflict_Granularity()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictGranularity getConflict_Granularity();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticConflict#getConflict_Granularity <em>Conflict Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Granularity</em>' attribute.
	 * @see petrinetsCRRuleMM.ConflictGranularity
	 * @see #getConflict_Granularity()
	 * @generated
	 */
	void setConflict_Granularity(ConflictGranularity value);

	/**
	 * Returns the value of the '<em><b>Semanticdiffs</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_SemanticDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticdiffs</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticConflict_Semanticdiffs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticDiff> getSemanticdiffs();

} // Pattern_SemanticConflict
