/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.While#getCondition <em>Condition</em>}</li>
 *   <li>{@link arduinoDiffMM.While#getDiffcondition <em>Diffcondition</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Control {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(BooleanOperator)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getWhile_Condition()
	 * @model required="true"
	 * @generated
	 */
	BooleanOperator getCondition();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.While#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanOperator value);

	/**
	 * Returns the value of the '<em><b>Diffcondition</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffWhile_condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffcondition</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getWhile_Diffcondition()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffWhile_condition> getDiffcondition();

} // While
