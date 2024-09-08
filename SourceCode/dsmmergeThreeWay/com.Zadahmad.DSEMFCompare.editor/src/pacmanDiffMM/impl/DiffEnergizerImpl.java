/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.ClassDiffKind;
import pacmanDiffMM.DiffEnergizer;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM._ListEInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getNew_durations_Left <em>New durations Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getNew_durations_Right <em>New durations Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffEnergizerImpl#getDurationsChangeStatus <em>Durations Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEnergizerImpl extends EnergizerImpl implements DiffEnergizer {
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
	 * The default value of the '{@link #getNew_value_Left() <em>New value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value_Left() <em>New value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_value_Left = NEW_VALUE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_value_Right() <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value_Right() <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_value_Right = NEW_VALUE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueChangeStatus() <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus VALUE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getValueChangeStatus() <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus valueChangeStatus = VALUE_CHANGE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNew_durations_Left() <em>New durations Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_durations_Left()
	 * @generated
	 * @ordered
	 */
	protected _ListEInt new_durations_Left;

	/**
	 * The cached value of the '{@link #getNew_durations_Right() <em>New durations Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_durations_Right()
	 * @generated
	 * @ordered
	 */
	protected _ListEInt new_durations_Right;

	/**
	 * The default value of the '{@link #getDurationsChangeStatus() <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DURATIONS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDurationsChangeStatus() <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus durationsChangeStatus = DURATIONS_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEnergizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.DIFF_ENERGIZER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value_Left() {
		return new_value_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value_Left(int newNew_value_Left) {
		int oldNew_value_Left = new_value_Left;
		new_value_Left = newNew_value_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT, oldNew_value_Left, new_value_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value_Right() {
		return new_value_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value_Right(int newNew_value_Right) {
		int oldNew_value_Right = new_value_Right;
		new_value_Right = newNew_value_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT, oldNew_value_Right, new_value_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getValueChangeStatus() {
		return valueChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueChangeStatus(ChangeStatus newValueChangeStatus) {
		ChangeStatus oldValueChangeStatus = valueChangeStatus;
		valueChangeStatus = newValueChangeStatus == null ? VALUE_CHANGE_STATUS_EDEFAULT : newValueChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS, oldValueChangeStatus, valueChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _ListEInt getNew_durations_Left() {
		return new_durations_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_durations_Left(_ListEInt newNew_durations_Left, NotificationChain msgs) {
		_ListEInt oldNew_durations_Left = new_durations_Left;
		new_durations_Left = newNew_durations_Left;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT, oldNew_durations_Left, newNew_durations_Left);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_durations_Left(_ListEInt newNew_durations_Left) {
		if (newNew_durations_Left != new_durations_Left) {
			NotificationChain msgs = null;
			if (new_durations_Left != null)
				msgs = ((InternalEObject)new_durations_Left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT, null, msgs);
			if (newNew_durations_Left != null)
				msgs = ((InternalEObject)newNew_durations_Left).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT, null, msgs);
			msgs = basicSetNew_durations_Left(newNew_durations_Left, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT, newNew_durations_Left, newNew_durations_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _ListEInt getNew_durations_Right() {
		return new_durations_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_durations_Right(_ListEInt newNew_durations_Right, NotificationChain msgs) {
		_ListEInt oldNew_durations_Right = new_durations_Right;
		new_durations_Right = newNew_durations_Right;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, oldNew_durations_Right, newNew_durations_Right);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_durations_Right(_ListEInt newNew_durations_Right) {
		if (newNew_durations_Right != new_durations_Right) {
			NotificationChain msgs = null;
			if (new_durations_Right != null)
				msgs = ((InternalEObject)new_durations_Right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, null, msgs);
			if (newNew_durations_Right != null)
				msgs = ((InternalEObject)newNew_durations_Right).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, null, msgs);
			msgs = basicSetNew_durations_Right(newNew_durations_Right, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, newNew_durations_Right, newNew_durations_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDurationsChangeStatus() {
		return durationsChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationsChangeStatus(ChangeStatus newDurationsChangeStatus) {
		ChangeStatus oldDurationsChangeStatus = durationsChangeStatus;
		durationsChangeStatus = newDurationsChangeStatus == null ? DURATIONS_CHANGE_STATUS_EDEFAULT : newDurationsChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS, oldDurationsChangeStatus, durationsChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return basicSetNew_durations_Left(null, msgs);
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return basicSetNew_durations_Right(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT:
				return getNew_value_Left();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				return getNew_value_Right();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				return getValueChangeStatus();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return getNew_durations_Left();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return getNew_durations_Right();
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				return getDurationsChangeStatus();
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
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT:
				setNew_value_Left((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				setNew_value_Right((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				setValueChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				setNew_durations_Left((_ListEInt)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				setNew_durations_Right((_ListEInt)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				setDurationsChangeStatus((ChangeStatus)newValue);
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
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT:
				setNew_value_Left(NEW_VALUE_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				setNew_value_Right(NEW_VALUE_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				setValueChangeStatus(VALUE_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				setNew_durations_Left((_ListEInt)null);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				setNew_durations_Right((_ListEInt)null);
				return;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				setDurationsChangeStatus(DURATIONS_CHANGE_STATUS_EDEFAULT);
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
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_LEFT:
				return new_value_Left != NEW_VALUE_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				return new_value_Right != NEW_VALUE_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				return valueChangeStatus != VALUE_CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return new_durations_Left != null;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return new_durations_Right != null;
			case PacmanDiffMMPackage.DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				return durationsChangeStatus != DURATIONS_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_value_Left: ");
		result.append(new_value_Left);
		result.append(", new_value_Right: ");
		result.append(new_value_Right);
		result.append(", valueChangeStatus: ");
		result.append(valueChangeStatus);
		result.append(", durationsChangeStatus: ");
		result.append(durationsChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffEnergizerImpl
