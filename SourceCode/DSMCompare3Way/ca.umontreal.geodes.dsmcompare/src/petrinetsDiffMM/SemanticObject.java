/**
 */
package petrinetsDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}</li>
 *   <li>{@link petrinetsDiffMM.SemanticObject#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject()
 * @model abstract="true"
 * @generated
 */
public interface SemanticObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPetriNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffPetriNet()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet> getSemanticObject_DiffPetriNet();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPetriNet_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net places</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffPetriNet_places()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet_places> getSemanticObject_DiffPetriNet_places();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Petri Net transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPetriNet_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Petri Net transitions</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffPetriNet_transitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPetriNet_transitions> getSemanticObject_DiffPetriNet_transitions();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Place</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Place</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffPlace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPlace> getSemanticObject_DiffPlace();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Place transitions</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffPlace_transitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Place transitions</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffPlace_transitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffPlace_transitions> getSemanticObject_DiffPlace_transitions();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Transition</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Transition</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffTransition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffTransition> getSemanticObject_DiffTransition();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Transition places</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.DiffTransition_places}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Transition places</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_DiffTransition_places()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DiffTransition_places> getSemanticObject_DiffTransition_places();

	/**
	 * Returns the value of the '<em><b>Semantic Object Named Element</b></em>' reference list.
	 * The list contents are of type {@link petrinetsDiffMM.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Named Element</em>' reference list.
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticObject_SemanticObject_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getSemanticObject_NamedElement();

} // SemanticObject
