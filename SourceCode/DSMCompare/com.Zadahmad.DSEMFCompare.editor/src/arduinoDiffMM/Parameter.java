/**
 */
package arduinoDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.Parameter#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.Parameter#getDiffdefinition <em>Diffdefinition</em>}</li>
 * </ul>
 *
 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ParameterDefinition)
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameter_Definition()
	 * @model
	 * @generated
	 */
	ParameterDefinition getDefinition();

	/**
	 * Sets the value of the '{@link arduinoDiffMM.Parameter#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoDiffMM.DiffParameter_to_definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdefinition</em>' containment reference list.
	 * @see arduinoDiffMM.ArduinoDiffMMPackage#getParameter_Diffdefinition()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffParameter_to_definition> getDiffdefinition();

} // Parameter
