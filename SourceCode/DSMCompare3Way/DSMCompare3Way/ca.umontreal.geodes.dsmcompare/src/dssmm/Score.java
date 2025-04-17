/**
 */
package dssmm;

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
 *   <li>{@link dssmm.Score#getSScore <em>SScore</em>}</li>
 *   <li>{@link dssmm.Score#getDScore <em>DScore</em>}</li>
 *   <li>{@link dssmm.Score#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm.Score#getComment <em>Comment</em>}</li>
 *   <li>{@link dssmm.Score#getScore_option <em>Score option</em>}</li>
 *   <li>{@link dssmm.Score#getMethodID <em>Method ID</em>}</li>
 * </ul>
 *
 * @see dssmm.DssmmPackage#getScore()
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
	 * @see dssmm.DssmmPackage#getScore_SScore()
	 * @model
	 * @generated
	 */
	float getSScore();

	/**
	 * Sets the value of the '{@link dssmm.Score#getSScore <em>SScore</em>}' attribute.
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
	 * @see dssmm.DssmmPackage#getScore_DScore()
	 * @model
	 * @generated
	 */
	float getDScore();

	/**
	 * Sets the value of the '{@link dssmm.Score#getDScore <em>DScore</em>}' attribute.
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
	 * @see dssmm.DssmmPackage#getScore_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link dssmm.Score#getDescr <em>Descr</em>}' attribute.
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
	 * @see dssmm.DssmmPackage#getScore_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link dssmm.Score#getComment <em>Comment</em>}' attribute.
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
	 * @see dssmm.DssmmPackage#getScore_Score_option()
	 * @model
	 * @generated
	 */
	Option getScore_option();

	/**
	 * Sets the value of the '{@link dssmm.Score#getScore_option <em>Score option</em>}' reference.
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
	 * @see dssmm.DssmmPackage#getScore_MethodID()
	 * @model
	 * @generated
	 */
	int getMethodID();

	/**
	 * Sets the value of the '{@link dssmm.Score#getMethodID <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method ID</em>' attribute.
	 * @see #getMethodID()
	 * @generated
	 */
	void setMethodID(int value);

} // Score
