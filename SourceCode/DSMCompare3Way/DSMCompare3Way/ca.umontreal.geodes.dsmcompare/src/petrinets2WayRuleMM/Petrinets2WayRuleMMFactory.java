/**
 */
package petrinets2WayRuleMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinets2WayRuleMM.Petrinets2WayRuleMMPackage
 * @generated
 */
public interface Petrinets2WayRuleMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinets2WayRuleMMFactory eINSTANCE = petrinets2WayRuleMM.impl.Petrinets2WayRuleMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Petri Net</em>'.
	 * @generated
	 */
	Pattern_PetriNet createPattern_PetriNet();

	/**
	 * Returns a new object of class '<em>Pattern Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Place</em>'.
	 * @generated
	 */
	Pattern_Place createPattern_Place();

	/**
	 * Returns a new object of class '<em>Pattern Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Transition</em>'.
	 * @generated
	 */
	Pattern_Transition createPattern_Transition();

	/**
	 * Returns a new object of class '<em>Pattern Semantic Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Semantic Diff</em>'.
	 * @generated
	 */
	Pattern_SemanticDiff createPattern_SemanticDiff();

	/**
	 * Returns a new object of class '<em>Pattern Semantic Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Semantic Conflict</em>'.
	 * @generated
	 */
	Pattern_SemanticConflict createPattern_SemanticConflict();

	/**
	 * Returns a new object of class '<em>Pattern Diff Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Petri Net</em>'.
	 * @generated
	 */
	Pattern_DiffPetriNet createPattern_DiffPetriNet();

	/**
	 * Returns a new object of class '<em>Pattern Diff Petri Net places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Petri Net places</em>'.
	 * @generated
	 */
	Pattern_DiffPetriNet_places createPattern_DiffPetriNet_places();

	/**
	 * Returns a new object of class '<em>Pattern Diff Petri Net transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Petri Net transitions</em>'.
	 * @generated
	 */
	Pattern_DiffPetriNet_transitions createPattern_DiffPetriNet_transitions();

	/**
	 * Returns a new object of class '<em>Pattern Diff Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Place</em>'.
	 * @generated
	 */
	Pattern_DiffPlace createPattern_DiffPlace();

	/**
	 * Returns a new object of class '<em>Pattern Diff Place transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Place transitions</em>'.
	 * @generated
	 */
	Pattern_DiffPlace_transitions createPattern_DiffPlace_transitions();

	/**
	 * Returns a new object of class '<em>Pattern Diff Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Transition</em>'.
	 * @generated
	 */
	Pattern_DiffTransition createPattern_DiffTransition();

	/**
	 * Returns a new object of class '<em>Pattern Diff Transition places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diff Transition places</em>'.
	 * @generated
	 */
	Pattern_DiffTransition_places createPattern_DiffTransition_places();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Petrinets2WayRuleMMPackage getPetrinets2WayRuleMMPackage();

} //Petrinets2WayRuleMMFactory
