/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Level#getLevel <em>Level</em>}</li>
 *   <li>{@link arduinoDiffMM.Level#getDifflevel <em>Difflevel</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends ModuleInstruction {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Value)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getLevel_Level()
	 * @model required="true"
	 * @generated
	 */
	Value getLevel();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Level#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Value value);

	/**
	 * Returns the value of the '<em><b>Difflevel</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffLevel_level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difflevel</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getLevel_Difflevel()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffLevel_level> getDifflevel();

} // Level
