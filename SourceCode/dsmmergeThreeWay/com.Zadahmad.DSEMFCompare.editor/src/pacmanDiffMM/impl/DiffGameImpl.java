/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.ClassDiffKind;
import pacmanDiffMM.DiffGame;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getNew_lives_Left <em>New lives Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getNew_lives_Right <em>New lives Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getLivesChangeStatus <em>Lives Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getNew_score_Left <em>New score Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getNew_score_Right <em>New score Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGameImpl#getScoreChangeStatus <em>Score Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGameImpl extends GameImpl implements DiffGame {
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
	 * The default value of the '{@link #getNew_lives_Left() <em>New lives Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LIVES_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lives_Left() <em>New lives Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_lives_Left = NEW_LIVES_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_lives_Right() <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LIVES_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lives_Right() <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_lives_Right = NEW_LIVES_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLivesChangeStatus() <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus LIVES_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getLivesChangeStatus() <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus livesChangeStatus = LIVES_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_score_Left() <em>New score Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SCORE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_score_Left() <em>New score Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_score_Left = NEW_SCORE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_score_Right() <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SCORE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_score_Right() <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_score_Right = NEW_SCORE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScoreChangeStatus() <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus SCORE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getScoreChangeStatus() <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus scoreChangeStatus = SCORE_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.DIFF_GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_lives_Left() {
		return new_lives_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_lives_Left(int newNew_lives_Left) {
		int oldNew_lives_Left = new_lives_Left;
		new_lives_Left = newNew_lives_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_LEFT, oldNew_lives_Left, new_lives_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_lives_Right() {
		return new_lives_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_lives_Right(int newNew_lives_Right) {
		int oldNew_lives_Right = new_lives_Right;
		new_lives_Right = newNew_lives_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_RIGHT, oldNew_lives_Right, new_lives_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getLivesChangeStatus() {
		return livesChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivesChangeStatus(ChangeStatus newLivesChangeStatus) {
		ChangeStatus oldLivesChangeStatus = livesChangeStatus;
		livesChangeStatus = newLivesChangeStatus == null ? LIVES_CHANGE_STATUS_EDEFAULT : newLivesChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__LIVES_CHANGE_STATUS, oldLivesChangeStatus, livesChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_score_Left() {
		return new_score_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_score_Left(int newNew_score_Left) {
		int oldNew_score_Left = new_score_Left;
		new_score_Left = newNew_score_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_LEFT, oldNew_score_Left, new_score_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_score_Right() {
		return new_score_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_score_Right(int newNew_score_Right) {
		int oldNew_score_Right = new_score_Right;
		new_score_Right = newNew_score_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_RIGHT, oldNew_score_Right, new_score_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getScoreChangeStatus() {
		return scoreChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoreChangeStatus(ChangeStatus newScoreChangeStatus) {
		ChangeStatus oldScoreChangeStatus = scoreChangeStatus;
		scoreChangeStatus = newScoreChangeStatus == null ? SCORE_CHANGE_STATUS_EDEFAULT : newScoreChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GAME__SCORE_CHANGE_STATUS, oldScoreChangeStatus, scoreChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_GAME__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_LEFT:
				return getNew_lives_Left();
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_RIGHT:
				return getNew_lives_Right();
			case PacmanDiffMMPackage.DIFF_GAME__LIVES_CHANGE_STATUS:
				return getLivesChangeStatus();
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_LEFT:
				return getNew_score_Left();
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_RIGHT:
				return getNew_score_Right();
			case PacmanDiffMMPackage.DIFF_GAME__SCORE_CHANGE_STATUS:
				return getScoreChangeStatus();
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
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_LEFT:
				setNew_lives_Left((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_RIGHT:
				setNew_lives_Right((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__LIVES_CHANGE_STATUS:
				setLivesChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_LEFT:
				setNew_score_Left((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_RIGHT:
				setNew_score_Right((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__SCORE_CHANGE_STATUS:
				setScoreChangeStatus((ChangeStatus)newValue);
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
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_LEFT:
				setNew_lives_Left(NEW_LIVES_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_RIGHT:
				setNew_lives_Right(NEW_LIVES_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__LIVES_CHANGE_STATUS:
				setLivesChangeStatus(LIVES_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_LEFT:
				setNew_score_Left(NEW_SCORE_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_RIGHT:
				setNew_score_Right(NEW_SCORE_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GAME__SCORE_CHANGE_STATUS:
				setScoreChangeStatus(SCORE_CHANGE_STATUS_EDEFAULT);
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
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_LEFT:
				return new_lives_Left != NEW_LIVES_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_LIVES_RIGHT:
				return new_lives_Right != NEW_LIVES_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__LIVES_CHANGE_STATUS:
				return livesChangeStatus != LIVES_CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_LEFT:
				return new_score_Left != NEW_SCORE_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__NEW_SCORE_RIGHT:
				return new_score_Right != NEW_SCORE_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GAME__SCORE_CHANGE_STATUS:
				return scoreChangeStatus != SCORE_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_lives_Left: ");
		result.append(new_lives_Left);
		result.append(", new_lives_Right: ");
		result.append(new_lives_Right);
		result.append(", livesChangeStatus: ");
		result.append(livesChangeStatus);
		result.append(", new_score_Left: ");
		result.append(new_score_Left);
		result.append(", new_score_Right: ");
		result.append(new_score_Right);
		result.append(", scoreChangeStatus: ");
		result.append(scoreChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffGameImpl
