/**
 */
package petrinets;

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
 *   <li>{@link petrinets.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinets.Place#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see petrinets.PetrinetsPackage#getPlace()
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
	 * @see petrinets.PetrinetsPackage#getPlace_Tokens()
	 * @model default="0"
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petrinets.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinets.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see petrinets.PetrinetsPackage#getPlace_Transitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Place
