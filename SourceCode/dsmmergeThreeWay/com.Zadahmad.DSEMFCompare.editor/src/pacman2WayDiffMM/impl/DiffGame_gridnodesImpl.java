/**
 */
package pacman2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pacman2WayDiffMM.AscDiffKind;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Game gridnodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGame_gridnodesImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGame_gridnodesImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGame_gridnodesImpl extends MinimalEObjectImpl.Container implements DiffGame_gridnodes {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final AscDiffKind DIFF_KIND_EDEFAULT = AscDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected AscDiffKind diff_kind = DIFF_KIND_EDEFAULT;

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
	protected DiffGame_gridnodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pacman2WayDiffMMPackage.Literals.DIFF_GAME_GRIDNODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscDiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(AscDiffKind newDiff_kind) {
		AscDiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND, oldDiff_kind, diff_kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE, oldEType, eType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND:
				return getDiff_kind();
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE:
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
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND:
				setDiff_kind((AscDiffKind)newValue);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE:
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
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE:
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
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Pacman2WayDiffMMPackage.DIFF_GAME_GRIDNODES__ETYPE:
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
		result.append(" (diff_kind: ");
		result.append(diff_kind);
		result.append(')');
		return result.toString();
	}

} //DiffGame_gridnodesImpl
