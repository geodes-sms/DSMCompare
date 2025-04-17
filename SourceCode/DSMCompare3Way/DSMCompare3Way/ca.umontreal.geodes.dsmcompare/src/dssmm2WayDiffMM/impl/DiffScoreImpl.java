/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffScore;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getNew_SScore <em>New SScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getNew_DScore <em>New DScore</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getNew_Comment <em>New Comment</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffScoreImpl#getNew_MethodID <em>New Method ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffScoreImpl extends ScoreImpl implements DiffScore {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_SScore() <em>New SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_SSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_SScore() <em>New SScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore()
	 * @generated
	 * @ordered
	 */
	protected float new_SScore = NEW_SSCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_DScore() <em>New DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_DSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_DScore() <em>New DScore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore()
	 * @generated
	 * @ordered
	 */
	protected float new_DScore = NEW_DSCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr() <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr() <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr = NEW_DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Comment() <em>New Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Comment() <em>New Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment()
	 * @generated
	 * @ordered
	 */
	protected String new_Comment = NEW_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MethodID() <em>New Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_METHOD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MethodID() <em>New Method ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID()
	 * @generated
	 * @ordered
	 */
	protected int new_MethodID = NEW_METHOD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(ClassDiffKind newDiff_kind) {
		ClassDiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_SScore() {
		return new_SScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_SScore(float newNew_SScore) {
		float oldNew_SScore = new_SScore;
		new_SScore = newNew_SScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_SSCORE, oldNew_SScore, new_SScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_DScore() {
		return new_DScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_DScore(float newNew_DScore) {
		float oldNew_DScore = new_DScore;
		new_DScore = newNew_DScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DSCORE, oldNew_DScore, new_DScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr() {
		return new_Descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr(String newNew_Descr) {
		String oldNew_Descr = new_Descr;
		new_Descr = newNew_Descr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DESCR, oldNew_Descr, new_Descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Comment() {
		return new_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Comment(String newNew_Comment) {
		String oldNew_Comment = new_Comment;
		new_Comment = newNew_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_COMMENT, oldNew_Comment, new_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MethodID() {
		return new_MethodID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MethodID(int newNew_MethodID) {
		int oldNew_MethodID = new_MethodID;
		new_MethodID = newNew_MethodID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID, oldNew_MethodID, new_MethodID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_SSCORE:
				return getNew_SScore();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DSCORE:
				return getNew_DScore();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DESCR:
				return getNew_Descr();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_COMMENT:
				return getNew_Comment();
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID:
				return getNew_MethodID();
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
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_SSCORE:
				setNew_SScore((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DSCORE:
				setNew_DScore((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DESCR:
				setNew_Descr((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_COMMENT:
				setNew_Comment((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID:
				setNew_MethodID((Integer)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_SSCORE:
				setNew_SScore(NEW_SSCORE_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DSCORE:
				setNew_DScore(NEW_DSCORE_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DESCR:
				setNew_Descr(NEW_DESCR_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_COMMENT:
				setNew_Comment(NEW_COMMENT_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID:
				setNew_MethodID(NEW_METHOD_ID_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_SSCORE:
				return new_SScore != NEW_SSCORE_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DSCORE:
				return new_DScore != NEW_DSCORE_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_DESCR:
				return NEW_DESCR_EDEFAULT == null ? new_Descr != null : !NEW_DESCR_EDEFAULT.equals(new_Descr);
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_COMMENT:
				return NEW_COMMENT_EDEFAULT == null ? new_Comment != null : !NEW_COMMENT_EDEFAULT.equals(new_Comment);
			case Dssmm2WayDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID:
				return new_MethodID != NEW_METHOD_ID_EDEFAULT;
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
		result.append(" (diff_kind: ");
		result.append(diff_kind);
		result.append(", new_SScore: ");
		result.append(new_SScore);
		result.append(", new_DScore: ");
		result.append(new_DScore);
		result.append(", new_Descr: ");
		result.append(new_Descr);
		result.append(", new_Comment: ");
		result.append(new_Comment);
		result.append(", new_MethodID: ");
		result.append(new_MethodID);
		result.append(')');
		return result.toString();
	}

} //DiffScoreImpl
