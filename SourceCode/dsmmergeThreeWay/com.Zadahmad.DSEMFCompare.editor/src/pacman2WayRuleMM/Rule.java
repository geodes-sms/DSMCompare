/**
 */
package pacman2WayRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pacman2WayDiffMM.Game;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayRuleMM.Rule#getName <em>Name</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link pacman2WayRuleMM.Rule#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pacman2WayRuleMM.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Game)
	 * @see pacman2WayRuleMM.Pacman2WayRuleMMPackage#getRule_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	Game getPattern();

	/**
	 * Sets the value of the '{@link pacman2WayRuleMM.Rule#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Game value);

} // Rule
