/**
 */
package dssmmDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getName <em>Name</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getModel <em>Model</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getOptions <em>Options</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getVendors <em>Vendors</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getDiffmodel <em>Diffmodel</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getDiffoptions <em>Diffoptions</em>}</li>
 *   <li>{@link dssmmDiffMM.DecisionSupport#getDiffvendors <em>Diffvendors</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport()
 * @model
 * @generated
 */
public interface DecisionSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DecisionSupport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Model)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Model()
	 * @model containment="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DecisionSupport#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Vendors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.Vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendors</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Vendors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vendor> getVendors();

	/**
	 * Returns the value of the '<em><b>Diffmodel</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffmodel</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Diffmodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_model> getDiffmodel();

	/**
	 * Returns the value of the '<em><b>Diffoptions</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_options}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffoptions</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Diffoptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_options> getDiffoptions();

	/**
	 * Returns the value of the '<em><b>Diffvendors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffDecisionSupport_vendors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffvendors</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDecisionSupport_Diffvendors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffDecisionSupport_vendors> getDiffvendors();

} // DecisionSupport
