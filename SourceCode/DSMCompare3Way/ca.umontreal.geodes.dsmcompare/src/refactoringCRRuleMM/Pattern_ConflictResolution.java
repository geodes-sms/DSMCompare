/**
 */
package refactoringCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Conflict Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionType <em>Resolution Type</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}</li>
 *   <li>{@link refactoringCRRuleMM.Pattern_ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}</li>
 * </ul>
 *
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_ConflictResolution()
 * @model
 * @generated
 */
public interface Pattern_ConflictResolution extends Pattern_SemanticObject {
	/**
	 * Returns the value of the '<em><b>Resolution Type</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ConflictResolutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Type</em>' attribute.
	 * @see refactoringCRRuleMM.ConflictResolutionType
	 * @see #setResolutionType(ConflictResolutionType)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_ConflictResolution_ResolutionType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictResolutionType getResolutionType();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionType <em>Resolution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Type</em>' attribute.
	 * @see refactoringCRRuleMM.ConflictResolutionType
	 * @see #getResolutionType()
	 * @generated
	 */
	void setResolutionType(ConflictResolutionType value);

	/**
	 * Returns the value of the '<em><b>Resolution Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link refactoringCRRuleMM.ConflictResolutionStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Strategy</em>' attribute.
	 * @see refactoringCRRuleMM.ConflictResolutionStrategy
	 * @see #setResolutionStrategy(ConflictResolutionStrategy)
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_ConflictResolution_ResolutionStrategy()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictResolutionStrategy getResolutionStrategy();

	/**
	 * Sets the value of the '{@link refactoringCRRuleMM.Pattern_ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Strategy</em>' attribute.
	 * @see refactoringCRRuleMM.ConflictResolutionStrategy
	 * @see #getResolutionStrategy()
	 * @generated
	 */
	void setResolutionStrategy(ConflictResolutionStrategy value);

	/**
	 * Returns the value of the '<em><b>Semanticconflicts</b></em>' reference list.
	 * The list contents are of type {@link refactoringCRRuleMM.Pattern_SemanticConflict}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticconflicts</em>' reference list.
	 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getPattern_ConflictResolution_Semanticconflicts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_SemanticConflict> getSemanticconflicts();

} // Pattern_ConflictResolution
