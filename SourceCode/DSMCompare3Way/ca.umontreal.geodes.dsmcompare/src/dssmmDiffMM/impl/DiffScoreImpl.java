/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.DiffScore;
import dssmmDiffMM.DssmmDiffMMPackage;

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
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_SScore_Left <em>New SScore Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_SScore_Right <em>New SScore Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getSScoreChangeStatus <em>SScore Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_DScore_Left <em>New DScore Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_DScore_Right <em>New DScore Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getDScoreChangeStatus <em>DScore Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_Comment_Left <em>New Comment Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_Comment_Right <em>New Comment Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getCommentChangeStatus <em>Comment Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_MethodID_Left <em>New Method ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getNew_MethodID_Right <em>New Method ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffScoreImpl#getMethodIDChangeStatus <em>Method ID Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffScoreImpl extends ScoreImpl implements DiffScore {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_LEFT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_RIGHT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeStatus() <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getChangeStatus() <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus changeStatus = CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_SScore_Left() <em>New SScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore_Left()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_SSCORE_LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_SScore_Left() <em>New SScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore_Left()
	 * @generated
	 * @ordered
	 */
	protected float new_SScore_Left = NEW_SSCORE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_SScore_Right() <em>New SScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore_Right()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_SSCORE_RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_SScore_Right() <em>New SScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_SScore_Right()
	 * @generated
	 * @ordered
	 */
	protected float new_SScore_Right = NEW_SSCORE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSScoreChangeStatus() <em>SScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus SSCORE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getSScoreChangeStatus() <em>SScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus sScoreChangeStatus = SSCORE_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_DScore_Left() <em>New DScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore_Left()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_DSCORE_LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_DScore_Left() <em>New DScore Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore_Left()
	 * @generated
	 * @ordered
	 */
	protected float new_DScore_Left = NEW_DSCORE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_DScore_Right() <em>New DScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore_Right()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_DSCORE_RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_DScore_Right() <em>New DScore Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_DScore_Right()
	 * @generated
	 * @ordered
	 */
	protected float new_DScore_Right = NEW_DSCORE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDScoreChangeStatus() <em>DScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DSCORE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDScoreChangeStatus() <em>DScore Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus dScoreChangeStatus = DSCORE_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Left = NEW_DESCR_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Right = NEW_DESCR_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DESCR_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus descrChangeStatus = DESCR_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Comment_Left() <em>New Comment Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COMMENT_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Comment_Left() <em>New Comment Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Comment_Left = NEW_COMMENT_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Comment_Right() <em>New Comment Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_COMMENT_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Comment_Right() <em>New Comment Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Comment_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Comment_Right = NEW_COMMENT_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentChangeStatus() <em>Comment Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus COMMENT_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getCommentChangeStatus() <em>Comment Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus commentChangeStatus = COMMENT_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MethodID_Left() <em>New Method ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_METHOD_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MethodID_Left() <em>New Method ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_MethodID_Left = NEW_METHOD_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MethodID_Right() <em>New Method ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_METHOD_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MethodID_Right() <em>New Method ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MethodID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_MethodID_Right = NEW_METHOD_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodIDChangeStatus() <em>Method ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus METHOD_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getMethodIDChangeStatus() <em>Method ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus methodIDChangeStatus = METHOD_ID_CHANGE_STATUS_EDEFAULT;

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
		return DssmmDiffMMPackage.Literals.DIFF_SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(ClassDiffKind newDiff_kind_Left) {
		ClassDiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(ClassDiffKind newDiff_kind_Right) {
		ClassDiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getChangeStatus() {
		return changeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeStatus(ChangeStatus newChangeStatus) {
		ChangeStatus oldChangeStatus = changeStatus;
		changeStatus = newChangeStatus == null ? CHANGE_STATUS_EDEFAULT : newChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_SScore_Left() {
		return new_SScore_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_SScore_Left(float newNew_SScore_Left) {
		float oldNew_SScore_Left = new_SScore_Left;
		new_SScore_Left = newNew_SScore_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_LEFT, oldNew_SScore_Left, new_SScore_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_SScore_Right() {
		return new_SScore_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_SScore_Right(float newNew_SScore_Right) {
		float oldNew_SScore_Right = new_SScore_Right;
		new_SScore_Right = newNew_SScore_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_RIGHT, oldNew_SScore_Right, new_SScore_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getSScoreChangeStatus() {
		return sScoreChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSScoreChangeStatus(ChangeStatus newSScoreChangeStatus) {
		ChangeStatus oldSScoreChangeStatus = sScoreChangeStatus;
		sScoreChangeStatus = newSScoreChangeStatus == null ? SSCORE_CHANGE_STATUS_EDEFAULT : newSScoreChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__SSCORE_CHANGE_STATUS, oldSScoreChangeStatus, sScoreChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_DScore_Left() {
		return new_DScore_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_DScore_Left(float newNew_DScore_Left) {
		float oldNew_DScore_Left = new_DScore_Left;
		new_DScore_Left = newNew_DScore_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_LEFT, oldNew_DScore_Left, new_DScore_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_DScore_Right() {
		return new_DScore_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_DScore_Right(float newNew_DScore_Right) {
		float oldNew_DScore_Right = new_DScore_Right;
		new_DScore_Right = newNew_DScore_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_RIGHT, oldNew_DScore_Right, new_DScore_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDScoreChangeStatus() {
		return dScoreChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDScoreChangeStatus(ChangeStatus newDScoreChangeStatus) {
		ChangeStatus oldDScoreChangeStatus = dScoreChangeStatus;
		dScoreChangeStatus = newDScoreChangeStatus == null ? DSCORE_CHANGE_STATUS_EDEFAULT : newDScoreChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__DSCORE_CHANGE_STATUS, oldDScoreChangeStatus, dScoreChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Left() {
		return new_Descr_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Left(String newNew_Descr_Left) {
		String oldNew_Descr_Left = new_Descr_Left;
		new_Descr_Left = newNew_Descr_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_LEFT, oldNew_Descr_Left, new_Descr_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Right() {
		return new_Descr_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Right(String newNew_Descr_Right) {
		String oldNew_Descr_Right = new_Descr_Right;
		new_Descr_Right = newNew_Descr_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_RIGHT, oldNew_Descr_Right, new_Descr_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDescrChangeStatus() {
		return descrChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescrChangeStatus(ChangeStatus newDescrChangeStatus) {
		ChangeStatus oldDescrChangeStatus = descrChangeStatus;
		descrChangeStatus = newDescrChangeStatus == null ? DESCR_CHANGE_STATUS_EDEFAULT : newDescrChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__DESCR_CHANGE_STATUS, oldDescrChangeStatus, descrChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Comment_Left() {
		return new_Comment_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Comment_Left(String newNew_Comment_Left) {
		String oldNew_Comment_Left = new_Comment_Left;
		new_Comment_Left = newNew_Comment_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_LEFT, oldNew_Comment_Left, new_Comment_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Comment_Right() {
		return new_Comment_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Comment_Right(String newNew_Comment_Right) {
		String oldNew_Comment_Right = new_Comment_Right;
		new_Comment_Right = newNew_Comment_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_RIGHT, oldNew_Comment_Right, new_Comment_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getCommentChangeStatus() {
		return commentChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentChangeStatus(ChangeStatus newCommentChangeStatus) {
		ChangeStatus oldCommentChangeStatus = commentChangeStatus;
		commentChangeStatus = newCommentChangeStatus == null ? COMMENT_CHANGE_STATUS_EDEFAULT : newCommentChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__COMMENT_CHANGE_STATUS, oldCommentChangeStatus, commentChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MethodID_Left() {
		return new_MethodID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MethodID_Left(int newNew_MethodID_Left) {
		int oldNew_MethodID_Left = new_MethodID_Left;
		new_MethodID_Left = newNew_MethodID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_LEFT, oldNew_MethodID_Left, new_MethodID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MethodID_Right() {
		return new_MethodID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MethodID_Right(int newNew_MethodID_Right) {
		int oldNew_MethodID_Right = new_MethodID_Right;
		new_MethodID_Right = newNew_MethodID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_RIGHT, oldNew_MethodID_Right, new_MethodID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getMethodIDChangeStatus() {
		return methodIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodIDChangeStatus(ChangeStatus newMethodIDChangeStatus) {
		ChangeStatus oldMethodIDChangeStatus = methodIDChangeStatus;
		methodIDChangeStatus = newMethodIDChangeStatus == null ? METHOD_ID_CHANGE_STATUS_EDEFAULT : newMethodIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_SCORE__METHOD_ID_CHANGE_STATUS, oldMethodIDChangeStatus, methodIDChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_LEFT:
				return getNew_SScore_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_RIGHT:
				return getNew_SScore_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__SSCORE_CHANGE_STATUS:
				return getSScoreChangeStatus();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_LEFT:
				return getNew_DScore_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_RIGHT:
				return getNew_DScore_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__DSCORE_CHANGE_STATUS:
				return getDScoreChangeStatus();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_LEFT:
				return getNew_Descr_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_RIGHT:
				return getNew_Descr_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__DESCR_CHANGE_STATUS:
				return getDescrChangeStatus();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_LEFT:
				return getNew_Comment_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_RIGHT:
				return getNew_Comment_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__COMMENT_CHANGE_STATUS:
				return getCommentChangeStatus();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_LEFT:
				return getNew_MethodID_Left();
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_RIGHT:
				return getNew_MethodID_Right();
			case DssmmDiffMMPackage.DIFF_SCORE__METHOD_ID_CHANGE_STATUS:
				return getMethodIDChangeStatus();
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
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_LEFT:
				setNew_SScore_Left((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_RIGHT:
				setNew_SScore_Right((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__SSCORE_CHANGE_STATUS:
				setSScoreChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_LEFT:
				setNew_DScore_Left((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_RIGHT:
				setNew_DScore_Right((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DSCORE_CHANGE_STATUS:
				setDScoreChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_LEFT:
				setNew_Descr_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_RIGHT:
				setNew_Descr_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DESCR_CHANGE_STATUS:
				setDescrChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_LEFT:
				setNew_Comment_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_RIGHT:
				setNew_Comment_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__COMMENT_CHANGE_STATUS:
				setCommentChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_LEFT:
				setNew_MethodID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_RIGHT:
				setNew_MethodID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__METHOD_ID_CHANGE_STATUS:
				setMethodIDChangeStatus((ChangeStatus)newValue);
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
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_LEFT:
				setNew_SScore_Left(NEW_SSCORE_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_RIGHT:
				setNew_SScore_Right(NEW_SSCORE_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__SSCORE_CHANGE_STATUS:
				setSScoreChangeStatus(SSCORE_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_LEFT:
				setNew_DScore_Left(NEW_DSCORE_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_RIGHT:
				setNew_DScore_Right(NEW_DSCORE_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DSCORE_CHANGE_STATUS:
				setDScoreChangeStatus(DSCORE_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_LEFT:
				setNew_Descr_Left(NEW_DESCR_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_RIGHT:
				setNew_Descr_Right(NEW_DESCR_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__DESCR_CHANGE_STATUS:
				setDescrChangeStatus(DESCR_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_LEFT:
				setNew_Comment_Left(NEW_COMMENT_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_RIGHT:
				setNew_Comment_Right(NEW_COMMENT_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__COMMENT_CHANGE_STATUS:
				setCommentChangeStatus(COMMENT_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_LEFT:
				setNew_MethodID_Left(NEW_METHOD_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_RIGHT:
				setNew_MethodID_Right(NEW_METHOD_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_SCORE__METHOD_ID_CHANGE_STATUS:
				setMethodIDChangeStatus(METHOD_ID_CHANGE_STATUS_EDEFAULT);
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
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_LEFT:
				return new_SScore_Left != NEW_SSCORE_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_SSCORE_RIGHT:
				return new_SScore_Right != NEW_SSCORE_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__SSCORE_CHANGE_STATUS:
				return sScoreChangeStatus != SSCORE_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_LEFT:
				return new_DScore_Left != NEW_DSCORE_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DSCORE_RIGHT:
				return new_DScore_Right != NEW_DSCORE_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__DSCORE_CHANGE_STATUS:
				return dScoreChangeStatus != DSCORE_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_LEFT:
				return NEW_DESCR_LEFT_EDEFAULT == null ? new_Descr_Left != null : !NEW_DESCR_LEFT_EDEFAULT.equals(new_Descr_Left);
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_DESCR_RIGHT:
				return NEW_DESCR_RIGHT_EDEFAULT == null ? new_Descr_Right != null : !NEW_DESCR_RIGHT_EDEFAULT.equals(new_Descr_Right);
			case DssmmDiffMMPackage.DIFF_SCORE__DESCR_CHANGE_STATUS:
				return descrChangeStatus != DESCR_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_LEFT:
				return NEW_COMMENT_LEFT_EDEFAULT == null ? new_Comment_Left != null : !NEW_COMMENT_LEFT_EDEFAULT.equals(new_Comment_Left);
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_COMMENT_RIGHT:
				return NEW_COMMENT_RIGHT_EDEFAULT == null ? new_Comment_Right != null : !NEW_COMMENT_RIGHT_EDEFAULT.equals(new_Comment_Right);
			case DssmmDiffMMPackage.DIFF_SCORE__COMMENT_CHANGE_STATUS:
				return commentChangeStatus != COMMENT_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_LEFT:
				return new_MethodID_Left != NEW_METHOD_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__NEW_METHOD_ID_RIGHT:
				return new_MethodID_Right != NEW_METHOD_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_SCORE__METHOD_ID_CHANGE_STATUS:
				return methodIDChangeStatus != METHOD_ID_CHANGE_STATUS_EDEFAULT;
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
		result.append(" (diff_kind_Left: ");
		result.append(diff_kind_Left);
		result.append(", diff_kind_Right: ");
		result.append(diff_kind_Right);
		result.append(", changeStatus: ");
		result.append(changeStatus);
		result.append(", new_SScore_Left: ");
		result.append(new_SScore_Left);
		result.append(", new_SScore_Right: ");
		result.append(new_SScore_Right);
		result.append(", SScoreChangeStatus: ");
		result.append(sScoreChangeStatus);
		result.append(", new_DScore_Left: ");
		result.append(new_DScore_Left);
		result.append(", new_DScore_Right: ");
		result.append(new_DScore_Right);
		result.append(", DScoreChangeStatus: ");
		result.append(dScoreChangeStatus);
		result.append(", new_Descr_Left: ");
		result.append(new_Descr_Left);
		result.append(", new_Descr_Right: ");
		result.append(new_Descr_Right);
		result.append(", DescrChangeStatus: ");
		result.append(descrChangeStatus);
		result.append(", new_Comment_Left: ");
		result.append(new_Comment_Left);
		result.append(", new_Comment_Right: ");
		result.append(new_Comment_Right);
		result.append(", CommentChangeStatus: ");
		result.append(commentChangeStatus);
		result.append(", new_MethodID_Left: ");
		result.append(new_MethodID_Left);
		result.append(", new_MethodID_Right: ");
		result.append(new_MethodID_Right);
		result.append(", MethodIDChangeStatus: ");
		result.append(methodIDChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffScoreImpl
