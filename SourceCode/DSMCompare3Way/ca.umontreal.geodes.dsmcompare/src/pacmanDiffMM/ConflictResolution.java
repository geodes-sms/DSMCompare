/**
 */
package pacmanDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.ConflictResolution#getResolutionType <em>Resolution Type</em>}</li>
 *   <li>{@link pacmanDiffMM.ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}</li>
 *   <li>{@link pacmanDiffMM.ConflictResolution#getSemanticconflicts <em>Semanticconflicts</em>}</li>
 * </ul>
 *
 * @see pacmanDiffMM.PacmanDiffMMPackage#getConflictResolution()
 * @model
 * @generated
 */
public interface ConflictResolution extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Resolution Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanDiffMM.ConflictResolutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Type</em>' attribute.
	 * @see pacmanDiffMM.ConflictResolutionType
	 * @see #setResolutionType(ConflictResolutionType)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getConflictResolution_ResolutionType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictResolutionType getResolutionType();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.ConflictResolution#getResolutionType <em>Resolution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Type</em>' attribute.
	 * @see pacmanDiffMM.ConflictResolutionType
	 * @see #getResolutionType()
	 * @generated
	 */
	void setResolutionType(ConflictResolutionType value);

	/**
	 * Returns the value of the '<em><b>Resolution Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanDiffMM.ConflictResolutionStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Strategy</em>' attribute.
	 * @see pacmanDiffMM.ConflictResolutionStrategy
	 * @see #setResolutionStrategy(ConflictResolutionStrategy)
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getConflictResolution_ResolutionStrategy()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConflictResolutionStrategy getResolutionStrategy();

	/**
	 * Sets the value of the '{@link pacmanDiffMM.ConflictResolution#getResolutionStrategy <em>Resolution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Strategy</em>' attribute.
	 * @see pacmanDiffMM.ConflictResolutionStrategy
	 * @see #getResolutionStrategy()
	 * @generated
	 */
	void setResolutionStrategy(ConflictResolutionStrategy value);

	/**
	 * Returns the value of the '<em><b>Semanticconflicts</b></em>' reference list.
	 * The list contents are of type {@link pacmanDiffMM.SemanticConflict}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semanticconflicts</em>' reference list.
	 * @see pacmanDiffMM.PacmanDiffMMPackage#getConflictResolution_Semanticconflicts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SemanticConflict> getSemanticconflicts();

} // ConflictResolution
