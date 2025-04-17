/**
 */
package dssmm;

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
 *   <li>{@link dssmm.DecisionSupport#getName <em>Name</em>}</li>
 *   <li>{@link dssmm.DecisionSupport#getModel <em>Model</em>}</li>
 *   <li>{@link dssmm.DecisionSupport#getOptions <em>Options</em>}</li>
 *   <li>{@link dssmm.DecisionSupport#getVendors <em>Vendors</em>}</li>
 * </ul>
 *
 * @see dssmm.DssmmPackage#getDecisionSupport()
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
	 * @see dssmm.DssmmPackage#getDecisionSupport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmm.DecisionSupport#getName <em>Name</em>}' attribute.
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
	 * @see dssmm.DssmmPackage#getDecisionSupport_Model()
	 * @model containment="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link dssmm.DecisionSupport#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see dssmm.DssmmPackage#getDecisionSupport_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Vendors</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm.Vendor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendors</em>' containment reference list.
	 * @see dssmm.DssmmPackage#getDecisionSupport_Vendors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vendor> getVendors();

} // DecisionSupport
