/**
 */
package dssmmDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.Factor#getFactorID <em>Factor ID</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getName <em>Name</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getGW <em>GW</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getLW <em>LW</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getDel <em>Del</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#isHideOnLine <em>Hide On Line</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getScores <em>Scores</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getMasterFactorID <em>Master Factor ID</em>}</li>
 *   <li>{@link dssmmDiffMM.Factor#getDiffscores <em>Diffscores</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor()
 * @model abstract="true"
 * @generated
 */
public interface Factor extends EObject {
	/**
	 * Returns the value of the '<em><b>Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor ID</em>' attribute.
	 * @see #setFactorID(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_FactorID()
	 * @model
	 * @generated
	 */
	int getFactorID();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getFactorID <em>Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor ID</em>' attribute.
	 * @see #getFactorID()
	 * @generated
	 */
	void setFactorID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' attribute.
	 * @see #setDescr(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getDescr <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' attribute.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(String value);

	/**
	 * Returns the value of the '<em><b>GW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GW</em>' attribute.
	 * @see #setGW(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_GW()
	 * @model
	 * @generated
	 */
	float getGW();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getGW <em>GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GW</em>' attribute.
	 * @see #getGW()
	 * @generated
	 */
	void setGW(float value);

	/**
	 * Returns the value of the '<em><b>LW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LW</em>' attribute.
	 * @see #setLW(float)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_LW()
	 * @model
	 * @generated
	 */
	float getLW();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getLW <em>LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LW</em>' attribute.
	 * @see #getLW()
	 * @generated
	 */
	void setLW(float value);

	/**
	 * Returns the value of the '<em><b>Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' attribute.
	 * @see #setDel(Boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Del()
	 * @model
	 * @generated
	 */
	Boolean getDel();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getDel <em>Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Del</em>' attribute.
	 * @see #getDel()
	 * @generated
	 */
	void setDel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hide On Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide On Line</em>' attribute.
	 * @see #setHideOnLine(boolean)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_HideOnLine()
	 * @model
	 * @generated
	 */
	boolean isHideOnLine();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#isHideOnLine <em>Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide On Line</em>' attribute.
	 * @see #isHideOnLine()
	 * @generated
	 */
	void setHideOnLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Scores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Score> getScores();

	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' attribute.
	 * @see #setHierarchy(String)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Hierarchy()
	 * @model
	 * @generated
	 */
	String getHierarchy();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getHierarchy <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' attribute.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(String value);

	/**
	 * Returns the value of the '<em><b>Master Factor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Factor ID</em>' attribute.
	 * @see #setMasterFactorID(int)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_MasterFactorID()
	 * @model
	 * @generated
	 */
	int getMasterFactorID();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.Factor#getMasterFactorID <em>Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Factor ID</em>' attribute.
	 * @see #getMasterFactorID()
	 * @generated
	 */
	void setMasterFactorID(int value);

	/**
	 * Returns the value of the '<em><b>Diffscores</b></em>' containment reference list.
	 * The list contents are of type {@link dssmmDiffMM.DiffFactor_scores}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffscores</em>' containment reference list.
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getFactor_Diffscores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffFactor_scores> getDiffscores();

} // Factor
