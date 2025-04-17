/**
 */
package petrinets2WayDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinets2WayDiffMM.Petrinets2WayDiffMMPackage
 * @generated
 */
public interface Petrinets2WayDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinets2WayDiffMMFactory eINSTANCE = petrinets2WayDiffMM.impl.Petrinets2WayDiffMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net</em>'.
	 * @generated
	 */
	PetriNet createPetriNet();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Diff</em>'.
	 * @generated
	 */
	SemanticDiff createSemanticDiff();

	/**
	 * Returns a new object of class '<em>Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Conflict</em>'.
	 * @generated
	 */
	SemanticConflict createSemanticConflict();

	/**
	 * Returns a new object of class '<em>Diff Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Petri Net</em>'.
	 * @generated
	 */
	DiffPetriNet createDiffPetriNet();

	/**
	 * Returns a new object of class '<em>Diff Petri Net places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Petri Net places</em>'.
	 * @generated
	 */
	DiffPetriNet_places createDiffPetriNet_places();

	/**
	 * Returns a new object of class '<em>Diff Petri Net transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Petri Net transitions</em>'.
	 * @generated
	 */
	DiffPetriNet_transitions createDiffPetriNet_transitions();

	/**
	 * Returns a new object of class '<em>Diff Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Place</em>'.
	 * @generated
	 */
	DiffPlace createDiffPlace();

	/**
	 * Returns a new object of class '<em>Diff Place transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Place transitions</em>'.
	 * @generated
	 */
	DiffPlace_transitions createDiffPlace_transitions();

	/**
	 * Returns a new object of class '<em>Diff Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Transition</em>'.
	 * @generated
	 */
	DiffTransition createDiffTransition();

	/**
	 * Returns a new object of class '<em>Diff Transition places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Transition places</em>'.
	 * @generated
	 */
	DiffTransition_places createDiffTransition_places();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Petrinets2WayDiffMMPackage getPetrinets2WayDiffMMPackage();

} //Petrinets2WayDiffMMFactory
