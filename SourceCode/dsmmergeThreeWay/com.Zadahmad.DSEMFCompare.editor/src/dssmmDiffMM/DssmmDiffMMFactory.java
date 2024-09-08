/**
 */
package dssmmDiffMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dssmmDiffMM.DssmmDiffMMPackage
 * @generated
 */
public interface DssmmDiffMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DssmmDiffMMFactory eINSTANCE = dssmmDiffMM.impl.DssmmDiffMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support</em>'.
	 * @generated
	 */
	DecisionSupport createDecisionSupport();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Factor</em>'.
	 * @generated
	 */
	LeafFactor createLeafFactor();

	/**
	 * Returns a new object of class '<em>Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Factor</em>'.
	 * @generated
	 */
	CompositeFactor createCompositeFactor();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vendor</em>'.
	 * @generated
	 */
	Vendor createVendor();

	/**
	 * Returns a new object of class '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score</em>'.
	 * @generated
	 */
	Score createScore();

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
	 * Returns a new object of class '<em>Diff Decision Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Decision Support</em>'.
	 * @generated
	 */
	DiffDecisionSupport createDiffDecisionSupport();

	/**
	 * Returns a new object of class '<em>Diff Decision Support model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Decision Support model</em>'.
	 * @generated
	 */
	DiffDecisionSupport_model createDiffDecisionSupport_model();

	/**
	 * Returns a new object of class '<em>Diff Decision Support options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Decision Support options</em>'.
	 * @generated
	 */
	DiffDecisionSupport_options createDiffDecisionSupport_options();

	/**
	 * Returns a new object of class '<em>Diff Decision Support vendors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Decision Support vendors</em>'.
	 * @generated
	 */
	DiffDecisionSupport_vendors createDiffDecisionSupport_vendors();

	/**
	 * Returns a new object of class '<em>Diff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Model</em>'.
	 * @generated
	 */
	DiffModel createDiffModel();

	/**
	 * Returns a new object of class '<em>Diff Model root Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Model root Factor</em>'.
	 * @generated
	 */
	DiffModel_rootFactor createDiffModel_rootFactor();

	/**
	 * Returns a new object of class '<em>Diff Factor scores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Factor scores</em>'.
	 * @generated
	 */
	DiffFactor_scores createDiffFactor_scores();

	/**
	 * Returns a new object of class '<em>Diff Leaf Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Leaf Factor</em>'.
	 * @generated
	 */
	DiffLeafFactor createDiffLeafFactor();

	/**
	 * Returns a new object of class '<em>Diff Composite Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Composite Factor</em>'.
	 * @generated
	 */
	DiffCompositeFactor createDiffCompositeFactor();

	/**
	 * Returns a new object of class '<em>Diff Composite Factor sub Factors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Composite Factor sub Factors</em>'.
	 * @generated
	 */
	DiffCompositeFactor_subFactors createDiffCompositeFactor_subFactors();

	/**
	 * Returns a new object of class '<em>Diff Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Option</em>'.
	 * @generated
	 */
	DiffOption createDiffOption();

	/**
	 * Returns a new object of class '<em>Diff Option vendor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Option vendor</em>'.
	 * @generated
	 */
	DiffOption_vendor createDiffOption_vendor();

	/**
	 * Returns a new object of class '<em>Diff Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Vendor</em>'.
	 * @generated
	 */
	DiffVendor createDiffVendor();

	/**
	 * Returns a new object of class '<em>Diff Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Score</em>'.
	 * @generated
	 */
	DiffScore createDiffScore();

	/**
	 * Returns a new object of class '<em>Diff Score score option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Score score option</em>'.
	 * @generated
	 */
	DiffScore_score_option createDiffScore_score_option();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DssmmDiffMMPackage getDssmmDiffMMPackage();

} //DssmmDiffMMFactory
