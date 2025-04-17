/**
 */
package dssmm.impl;

import dssmm.DssmmPackage;
import dssmm.Option;
import dssmm.Score;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm.impl.ScoreImpl#getSScore <em>SScore</em>}</li>
 *   <li>{@link dssmm.impl.ScoreImpl#getDScore <em>DScore</em>}</li>
 *   <li>{@link dssmm.impl.ScoreImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm.impl.ScoreImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link dssmm.impl.ScoreImpl#getScore_option <em>Score option</em>}</li>
 *   <li>{@link dssmm.impl.ScoreImpl#getMethodID <em>Method ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreImpl extends MinimalEObjectImpl.Container implements Score {
	/**
	 * The default value of the '{@link #getSScore() <em>SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSScore()
	 * @generated
	 * @ordered
	 */
	protected static final float SSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSScore() <em>SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSScore()
	 * @generated
	 * @ordered
	 */
	protected float sScore = SSCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDScore() <em>DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDScore()
	 * @generated
	 * @ordered
	 */
	protected static final float DSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDScore() <em>DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDScore()
	 * @generated
	 * @ordered
	 */
	protected float dScore = DSCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected String descr = DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScore_option() <em>Score option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore_option()
	 * @generated
	 * @ordered
	 */
	protected Option score_option;

	/**
	 * The default value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected static final int METHOD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMethodID() <em>Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected int methodID = METHOD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmPackage.Literals.SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSScore() {
		return sScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSScore(float newSScore) {
		float oldSScore = sScore;
		sScore = newSScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__SSCORE, oldSScore, sScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDScore() {
		return dScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDScore(float newDScore) {
		float oldDScore = dScore;
		dScore = newDScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__DSCORE, oldDScore, dScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescr(String newDescr) {
		String oldDescr = descr;
		descr = newDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__DESCR, oldDescr, descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getScore_option() {
		if (score_option != null && score_option.eIsProxy()) {
			InternalEObject oldScore_option = (InternalEObject)score_option;
			score_option = (Option)eResolveProxy(oldScore_option);
			if (score_option != oldScore_option) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DssmmPackage.SCORE__SCORE_OPTION, oldScore_option, score_option));
			}
		}
		return score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetScore_option() {
		return score_option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore_option(Option newScore_option) {
		Option oldScore_option = score_option;
		score_option = newScore_option;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__SCORE_OPTION, oldScore_option, score_option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMethodID() {
		return methodID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(int newMethodID) {
		int oldMethodID = methodID;
		methodID = newMethodID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.SCORE__METHOD_ID, oldMethodID, methodID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmPackage.SCORE__SSCORE:
				return getSScore();
			case DssmmPackage.SCORE__DSCORE:
				return getDScore();
			case DssmmPackage.SCORE__DESCR:
				return getDescr();
			case DssmmPackage.SCORE__COMMENT:
				return getComment();
			case DssmmPackage.SCORE__SCORE_OPTION:
				if (resolve) return getScore_option();
				return basicGetScore_option();
			case DssmmPackage.SCORE__METHOD_ID:
				return getMethodID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DssmmPackage.SCORE__SSCORE:
				setSScore((Float)newValue);
				return;
			case DssmmPackage.SCORE__DSCORE:
				setDScore((Float)newValue);
				return;
			case DssmmPackage.SCORE__DESCR:
				setDescr((String)newValue);
				return;
			case DssmmPackage.SCORE__COMMENT:
				setComment((String)newValue);
				return;
			case DssmmPackage.SCORE__SCORE_OPTION:
				setScore_option((Option)newValue);
				return;
			case DssmmPackage.SCORE__METHOD_ID:
				setMethodID((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DssmmPackage.SCORE__SSCORE:
				setSScore(SSCORE_EDEFAULT);
				return;
			case DssmmPackage.SCORE__DSCORE:
				setDScore(DSCORE_EDEFAULT);
				return;
			case DssmmPackage.SCORE__DESCR:
				setDescr(DESCR_EDEFAULT);
				return;
			case DssmmPackage.SCORE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DssmmPackage.SCORE__SCORE_OPTION:
				setScore_option((Option)null);
				return;
			case DssmmPackage.SCORE__METHOD_ID:
				setMethodID(METHOD_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DssmmPackage.SCORE__SSCORE:
				return sScore != SSCORE_EDEFAULT;
			case DssmmPackage.SCORE__DSCORE:
				return dScore != DSCORE_EDEFAULT;
			case DssmmPackage.SCORE__DESCR:
				return DESCR_EDEFAULT == null ? descr != null : !DESCR_EDEFAULT.equals(descr);
			case DssmmPackage.SCORE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DssmmPackage.SCORE__SCORE_OPTION:
				return score_option != null;
			case DssmmPackage.SCORE__METHOD_ID:
				return methodID != METHOD_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SScore: ");
		result.append(sScore);
		result.append(", DScore: ");
		result.append(dScore);
		result.append(", Descr: ");
		result.append(descr);
		result.append(", Comment: ");
		result.append(comment);
		result.append(", MethodID: ");
		result.append(methodID);
		result.append(')');
		return result.toString();
	}

} //ScoreImpl
