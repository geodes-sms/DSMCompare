/**
 */
package dssmm2WayDiffMM;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link dssmm2WayDiffMM.Model#getModelID <em>Model ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getGoal <em>Goal</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getNumFacts <em>Num Facts</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getRootFactor <em>Root Factor</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Model#getDiffrootFactor <em>Diffroot Factor</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel()
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_ModelID()
	 * @model
	 * @generated
	 */
	int getModelID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getModelID <em>Model ID</em>}' attribute.
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getName <em>Name</em>}' attribute.
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getGoal <em>Goal</em>}' attribute.
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getDescr <em>Descr</em>}' attribute.
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_NumFacts()
	 * @model
	 * @generated
	 */
	String getNumFacts();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getNumFacts <em>Num Facts</em>}' attribute.
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
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_RootFactor()
	 * @model containment="true"
	 * @generated
	 */
	Factor getRootFactor();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Model#getRootFactor <em>Root Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Factor</em>' containment reference.
	 * @see #getRootFactor()
	 * @generated
	 */
	void setRootFactor(Factor value);

	/**
	 * Returns the value of the '<em><b>Diffroot Factor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffModel_rootFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffroot Factor</em>' containment reference list.
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getModel_DiffrootFactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffModel_rootFactor> getDiffrootFactor();

} // Model
