/**
 */
package dssmmDiffMM;

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
 *   <li>{@link dssmmDiffMM.SemanticObject#getName <em>Name</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DecisionSupport <em>Semantic Object Decision Support</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffCompositeFactor_subFactors <em>Semantic Object Diff Composite Factor sub Factors</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_model <em>Semantic Object Diff Decision Support model</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_options <em>Semantic Object Diff Decision Support options</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffDecisionSupport_vendors <em>Semantic Object Diff Decision Support vendors</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffFactor_scores <em>Semantic Object Diff Factor scores</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffModel_rootFactor <em>Semantic Object Diff Model root Factor</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffOption_vendor <em>Semantic Object Diff Option vendor</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_DiffScore_score_option <em>Semantic Object Diff Score score option</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_Factor <em>Semantic Object Factor</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_Model <em>Semantic Object Model</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_Option <em>Semantic Object Option</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_Score <em>Semantic Object Score</em>}</li>
 *   <li>{@link dssmmDiffMM.SemanticObject#getSemanticObject_Vendor <em>Semantic Object Vendor</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject()
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.SemanticObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Object Decision Support</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DecisionSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Decision Support</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DecisionSupport()
	 * @model
	 * @generated
	 */
	EList<DecisionSupport> getSemanticObject_DecisionSupport();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Composite Factor sub Factors</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffCompositeFactor_subFactors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Composite Factor sub Factors</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffCompositeFactor_subFactors()
	 * @model
	 * @generated
	 */
	EList<DiffCompositeFactor_subFactors> getSemanticObject_DiffCompositeFactor_subFactors();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Decision Support model</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Decision Support model</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffDecisionSupport_model()
	 * @model
	 * @generated
	 */
	EList<DiffDecisionSupport_model> getSemanticObject_DiffDecisionSupport_model();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Decision Support options</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_options}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Decision Support options</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffDecisionSupport_options()
	 * @model
	 * @generated
	 */
	EList<DiffDecisionSupport_options> getSemanticObject_DiffDecisionSupport_options();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Decision Support vendors</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_vendors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Decision Support vendors</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffDecisionSupport_vendors()
	 * @model
	 * @generated
	 */
	EList<DiffDecisionSupport_vendors> getSemanticObject_DiffDecisionSupport_vendors();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Factor scores</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffFactor_scores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Factor scores</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffFactor_scores()
	 * @model
	 * @generated
	 */
	EList<DiffFactor_scores> getSemanticObject_DiffFactor_scores();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Model root Factor</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffModel_rootFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Model root Factor</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffModel_rootFactor()
	 * @model
	 * @generated
	 */
	EList<DiffModel_rootFactor> getSemanticObject_DiffModel_rootFactor();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Option vendor</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffOption_vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Option vendor</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffOption_vendor()
	 * @model
	 * @generated
	 */
	EList<DiffOption_vendor> getSemanticObject_DiffOption_vendor();

	/**
	 * Returns the value of the '<em><b>Semantic Object Diff Score score option</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffScore_score_option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Diff Score score option</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_DiffScore_score_option()
	 * @model
	 * @generated
	 */
	EList<DiffScore_score_option> getSemanticObject_DiffScore_score_option();

	/**
	 * Returns the value of the '<em><b>Semantic Object Factor</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Factor</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_Factor()
	 * @model
	 * @generated
	 */
	EList<Factor> getSemanticObject_Factor();

	/**
	 * Returns the value of the '<em><b>Semantic Object Model</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Model</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_Model()
	 * @model
	 * @generated
	 */
	EList<Model> getSemanticObject_Model();

	/**
	 * Returns the value of the '<em><b>Semantic Object Option</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Option</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_Option()
	 * @model
	 * @generated
	 */
	EList<Option> getSemanticObject_Option();

	/**
	 * Returns the value of the '<em><b>Semantic Object Score</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Score</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_Score()
	 * @model
	 * @generated
	 */
	EList<Score> getSemanticObject_Score();

	/**
	 * Returns the value of the '<em><b>Semantic Object Vendor</b></em>' reference list.
	 * The list contents are of type {@link dssmmDiffMM.Vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Object Vendor</em>' reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getSemanticObject_SemanticObject_Vendor()
	 * @model
	 * @generated
	 */
	EList<Vendor> getSemanticObject_Vendor();

} // SemanticObject
