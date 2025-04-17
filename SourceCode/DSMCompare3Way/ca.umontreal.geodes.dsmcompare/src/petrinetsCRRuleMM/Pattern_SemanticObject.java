/**
 */
package petrinetsCRRuleMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticObject#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface Pattern_SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticObject#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPetriNet()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet> getSemanticObject_DiffPetriNet();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net places</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPetriNet_places()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_places> getSemanticObject_DiffPetriNet_places();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net transitions</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPetriNet_transitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPetriNet_transitions> getSemanticObject_DiffPetriNet_transitions();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Place</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPlace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPlace> getSemanticObject_DiffPlace();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Place transitions</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffPlace_transitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffPlace_transitions> getSemanticObject_DiffPlace_transitions();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Transition</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffTransition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffTransition> getSemanticObject_DiffTransition();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Transition places</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_DiffTransition_places()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_DiffTransition_places> getSemanticObject_DiffTransition_places();

	/**
	 * Returns the value of the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * The list contents are of type {@link petrinetsCRRuleMM.Pattern_NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Named Element</em>' reference list.
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticObject_SemanticObject_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pattern_NamedElement> getSemanticObject_NamedElement();

} // Pattern_SemanticObject
