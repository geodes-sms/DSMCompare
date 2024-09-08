/**
 */
package dssmm2WayDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.Score#getSScore <em>SScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getDScore <em>DScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getComment <em>Comment</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getScore_option <em>Score option</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.Score#getDiffscore_option <em>Diffscore option</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore()
 * @model
 * @generated
 */
public interface Score extends EObject {
	/**
	 * Returns the value of the '<em><b>SScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Score 0-100 and is the one used for all calculations
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SScore</em>' attribute.
	 * @see #setSScore(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_SScore()
	 * @model
	 * @generated
	 */
	float getSScore();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getSScore <em>SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SScore</em>' attribute.
	 * @see #getSScore()
	 * @generated
	 */
	void setSScore(float value);

	/**
	 * Returns the value of the '<em><b>DScore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of a verbal or List method this is the verbal method definition index. In the case of numeric methods it is the actual numeric value.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DScore</em>' attribute.
	 * @see #setDScore(float)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_DScore()
	 * @model
	 * @generated
	 */
	float getDScore();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getDScore <em>DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DScore</em>' attribute.
	 * @see #getDScore()
	 * @generated
	 */
	void setDScore(float value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' attribute.
	 * @see #setDescr(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getDescr <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' attribute.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Score option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score option</em>' reference.
	 * @see #setScore_option(Option)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_Score_option()
	 * @model
	 * @generated
	 */
	Option getScore_option();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getScore_option <em>Score option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score option</em>' reference.
	 * @see #getScore_option()
	 * @generated
	 */
	void setScore_option(Option value);

	/**
	 * Returns the value of the '<em><b>Method ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method ID</em>' attribute.
	 * @see #setMethodID(int)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_MethodID()
	 * @model
	 * @generated
	 */
	int getMethodID();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.Score#getMethodID <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID</em>' attribute.
	 * @see #getMethodID()
	 * @generated
	 */
	void setMethodID(int value);

	/**
	 * Returns the value of the '<em><b>Diffscore option</b></em>' containment reference list.
	 * The list contents are of type {@link dssmm2WayDiffMM.DiffScore_score_option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffscore option</em>' containment reference list.
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getScore_Diffscore_option()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffScore_score_option> getDiffscore_option();

} // Score
