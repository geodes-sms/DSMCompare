/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.AscDiffKind;
import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.DiffModel_rootFactor;
import dssmmDiffMM.DssmmDiffMMPackage;
import dssmmDiffMM.Factor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Model root Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModel_rootFactorImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffModel_rootFactorImpl extends MinimalEObjectImpl.Container implements DiffModel_rootFactor {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final AscDiffKind DIFF_KIND_LEFT_EDEFAULT = AscDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected AscDiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final AscDiffKind DIFF_KIND_RIGHT_EDEFAULT = AscDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected AscDiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

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
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected Factor eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffModel_rootFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmDiffMMPackage.Literals.DIFF_MODEL_ROOT_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscDiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(AscDiffKind newDiff_kind_Left) {
		AscDiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscDiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(AscDiffKind newDiff_kind_Right) {
		AscDiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (Factor)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(Factor newEType) {
		Factor oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
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
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT:
				setDiff_kind_Left((AscDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right((AscDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE:
				setEType((Factor)newValue);
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
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE:
				setEType((Factor)null);
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
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL_ROOT_FACTOR__ETYPE:
				return eType != null;
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
		result.append(')');
		return result.toString();
	}

} //DiffModel_rootFactorImpl
