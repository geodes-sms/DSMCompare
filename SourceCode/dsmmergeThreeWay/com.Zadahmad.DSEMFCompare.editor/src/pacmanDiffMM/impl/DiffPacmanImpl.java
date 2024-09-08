/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.ClassDiffKind;
import pacmanDiffMM.DiffPacman;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Pacman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getNew_initialPosition_Left <em>New initial Position Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getNew_initialPosition_Right <em>New initial Position Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffPacmanImpl#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffPacmanImpl extends PacmanImpl implements DiffPacman {
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
	 * The default value of the '{@link #getNew_initialPosition_Left() <em>New initial Position Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INITIAL_POSITION_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_initialPosition_Left() <em>New initial Position Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_initialPosition_Left = NEW_INITIAL_POSITION_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_initialPosition_Right() <em>New initial Position Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INITIAL_POSITION_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_initialPosition_Right() <em>New initial Position Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_initialPosition_Right = NEW_INITIAL_POSITION_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialPositionChangeStatus() <em>Initial Position Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPositionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus INITIAL_POSITION_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getInitialPositionChangeStatus() <em>Initial Position Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPositionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus initialPositionChangeStatus = INITIAL_POSITION_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffPacmanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.DIFF_PACMAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_initialPosition_Left() {
		return new_initialPosition_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_initialPosition_Left(String newNew_initialPosition_Left) {
		String oldNew_initialPosition_Left = new_initialPosition_Left;
		new_initialPosition_Left = newNew_initialPosition_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT, oldNew_initialPosition_Left, new_initialPosition_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_initialPosition_Right() {
		return new_initialPosition_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_initialPosition_Right(String newNew_initialPosition_Right) {
		String oldNew_initialPosition_Right = new_initialPosition_Right;
		new_initialPosition_Right = newNew_initialPosition_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT, oldNew_initialPosition_Right, new_initialPosition_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getInitialPositionChangeStatus() {
		return initialPositionChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPositionChangeStatus(ChangeStatus newInitialPositionChangeStatus) {
		ChangeStatus oldInitialPositionChangeStatus = initialPositionChangeStatus;
		initialPositionChangeStatus = newInitialPositionChangeStatus == null ? INITIAL_POSITION_CHANGE_STATUS_EDEFAULT : newInitialPositionChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS, oldInitialPositionChangeStatus, initialPositionChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				return getNew_initialPosition_Left();
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				return getNew_initialPosition_Right();
			case PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				return getInitialPositionChangeStatus();
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
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				setNew_initialPosition_Left((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				setNew_initialPosition_Right((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				setInitialPositionChangeStatus((ChangeStatus)newValue);
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
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				setNew_initialPosition_Left(NEW_INITIAL_POSITION_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				setNew_initialPosition_Right(NEW_INITIAL_POSITION_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				setInitialPositionChangeStatus(INITIAL_POSITION_CHANGE_STATUS_EDEFAULT);
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
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_PACMAN__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_PACMAN__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				return NEW_INITIAL_POSITION_LEFT_EDEFAULT == null ? new_initialPosition_Left != null : !NEW_INITIAL_POSITION_LEFT_EDEFAULT.equals(new_initialPosition_Left);
			case PacmanDiffMMPackage.DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				return NEW_INITIAL_POSITION_RIGHT_EDEFAULT == null ? new_initialPosition_Right != null : !NEW_INITIAL_POSITION_RIGHT_EDEFAULT.equals(new_initialPosition_Right);
			case PacmanDiffMMPackage.DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				return initialPositionChangeStatus != INITIAL_POSITION_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_initialPosition_Left: ");
		result.append(new_initialPosition_Left);
		result.append(", new_initialPosition_Right: ");
		result.append(new_initialPosition_Right);
		result.append(", initialPositionChangeStatus: ");
		result.append(initialPositionChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffPacmanImpl
