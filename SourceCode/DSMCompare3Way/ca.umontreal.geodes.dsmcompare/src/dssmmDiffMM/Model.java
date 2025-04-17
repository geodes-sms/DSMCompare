/**
 */
package dssmmDiffMM;

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
 *   <li>{@link dssmmDiffMM.Model#getModelID <em>Model ID</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getName <em>Name</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getGoal <em>Goal</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getNumFacts <em>Num Facts</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getRootFactor <em>Root Factor</em>}</li>
 *   <li>{@link dssmmDiffMM.Model#getDiffrootFactor <em>Diffroot Factor</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel()
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_ModelID()
	 * @model
	 * @generated
	 */
	int getModelID();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getModelID <em>Model ID</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getName <em>Name</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getGoal <em>Goal</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getDescr <em>Descr</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_NumFacts()
	 * @model
	 * @generated
	 */
	String getNumFacts();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getNumFacts <em>Num Facts</em>}' attribute.
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
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_RootFactor()
	 * @model containment="true"
	 * @generated
	 */
	Factor getRootFactor();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Model#getRootFactor <em>Root Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Factor</em>' containment reference.
	 * @see #getRootFactor()
	 * @generated
	 */
	void setRootFactor(Factor value);

	/**
	 * Returns the value of the '<em><b>Diffroot Factor</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffModel_rootFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffroot Factor</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getModel_DiffrootFactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffModel_rootFactor> getDiffrootFactor();

} // Model
