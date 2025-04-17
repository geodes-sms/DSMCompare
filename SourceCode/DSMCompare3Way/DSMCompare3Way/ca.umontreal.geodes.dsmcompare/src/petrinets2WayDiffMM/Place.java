/**
 */
package petrinets2WayDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.Place#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.Place#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getPlace_Tokens()
	 * @model default="0"
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinets2WayDiffMM.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getPlace_Transitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Difftransitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinets2WayDiffMM.DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difftransitions</em>' containment reference list.
	 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage#getPlace_Difftransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffPlace_transitions> getDifftransitions();

} // Place
