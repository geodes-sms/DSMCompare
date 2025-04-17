/**
 */
package dssmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm.Model#getModelID <em>Model ID</em>}</li>
 *   <li>{@link dssmm.Model#getName <em>Name</em>}</li>
 *   <li>{@link dssmm.Model#getGoal <em>Goal</em>}</li>
 *   <li>{@link dssmm.Model#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm.Model#getNumFacts <em>Num Facts</em>}</li>
 *   <li>{@link dssmm.Model#getRootFactor <em>Root Factor</em>}</li>
 * </ul>
 *
 * @see dssmm.DssmmPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model ID</em>' attribute.
	 * @see #setModelID(int)
	 * @see dssmm.DssmmPackage#getModel_ModelID()
	 * @model
	 * @generated
	 */
	int getModelID();

	/**
	 * Sets the value of the '{@link dssmm.Model#getModelID <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model ID</em>' attribute.
	 * @see #getModelID()
	 * @generated
	 */
	void setModelID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dssmm.DssmmPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmm.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see dssmm.DssmmPackage#getModel_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link dssmm.Model#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' attribute.
	 * @see #setDescr(String)
	 * @see dssmm.DssmmPackage#getModel_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmm.Model#getDescr <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' attribute.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(String value);

	/**
	 * Returns the value of the '<em><b>Num Facts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Facts</em>' attribute.
	 * @see #setNumFacts(String)
	 * @see dssmm.DssmmPackage#getModel_NumFacts()
	 * @model
	 * @generated
	 */
	String getNumFacts();

	/**
	 * Sets the value of the '{@link dssmm.Model#getNumFacts <em>Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Facts</em>' attribute.
	 * @see #getNumFacts()
	 * @generated
	 */
	void setNumFacts(String value);

	/**
	 * Returns the value of the '<em><b>Root Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Factor</em>' containment reference.
	 * @see #setRootFactor(Factor)
	 * @see dssmm.DssmmPackage#getModel_RootFactor()
	 * @model containment="true"
	 * @generated
	 */
	Factor getRootFactor();

	/**
	 * Sets the value of the '{@link dssmm.Model#getRootFactor <em>Root Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Factor</em>' containment reference.
	 * @see #getRootFactor()
	 * @generated
	 */
	void setRootFactor(Factor value);

} // Model
