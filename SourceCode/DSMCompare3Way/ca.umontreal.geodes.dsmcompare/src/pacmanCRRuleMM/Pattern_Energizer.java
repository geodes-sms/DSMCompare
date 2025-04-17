/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Energizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_Energizer#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Energizer()
 * @model
 * @generated
 */
public interface Pattern_Energizer extends Pattern_PositionableEntity {
	/**
	 * Returns the value of the '<em><b>Durations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations</em>' attribute list.
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_Energizer_Durations()
	 * @model
	 * @generated
	 */
	EList<Integer> getDurations();

} // Pattern_Energizer
