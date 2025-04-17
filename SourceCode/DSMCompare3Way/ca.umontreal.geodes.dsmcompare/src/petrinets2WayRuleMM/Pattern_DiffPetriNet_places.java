/**
 */
package petrinets2WayRuleMM;

import petrinets2WayDiffMM.DiffPetriNet_places;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Petri Net places</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isIsForbidden <em>Is Forbidden</em>}</li>
 * </ul>
 *
 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getPattern_DiffPetriNet_places()
 * @model
 * @generated
 */
public interface Pattern_DiffPetriNet_places extends DiffPetriNet_places {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getPattern_DiffPetriNet_places_ID_Pattern()
	 * @model required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getPattern_DiffPetriNet_places_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage#getPattern_DiffPetriNet_places_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link petrinets2WayRuleMM.Pattern_DiffPetriNet_places#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

} // Pattern_DiffPetriNet_places
