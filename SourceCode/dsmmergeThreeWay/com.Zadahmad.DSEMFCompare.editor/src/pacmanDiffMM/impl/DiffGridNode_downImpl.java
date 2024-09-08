/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pacmanDiffMM.AscDiffKind;
import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Grid Node down</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffGridNode_downImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGridNode_downImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGridNode_downImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGridNode_downImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGridNode_downImpl extends MinimalEObjectImpl.Container implements DiffGridNode_down {
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
	protected GridNode eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffGridNode_downImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.DIFF_GRID_NODE_DOWN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (GridNode)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(GridNode newEType) {
		GridNode oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE:
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
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT:
				setDiff_kind_Left((AscDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT:
				setDiff_kind_Right((AscDiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE:
				setEType((GridNode)newValue);
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
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE:
				setEType((GridNode)null);
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
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GRID_NODE_DOWN__ETYPE:
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

} //DiffGridNode_downImpl
