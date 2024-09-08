/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import refactoring2WayDiffMM.DiffInterface_eoperations;
import refactoring2WayDiffMM.DiffKind;
import refactoring2WayDiffMM.EOperation;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Interface eoperations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffInterface_eoperationsImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffInterface_eoperationsImpl extends MinimalEObjectImpl.Container implements DiffInterface_eoperations {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final DiffKind DIFF_KIND_EDEFAULT = DiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected DiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected EOperation eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffInterface_eoperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Refactoring2WayDiffMMPackage.Literals.DIFF_INTERFACE_EOPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(DiffKind newDiff_kind) {
		DiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (EOperation)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(EOperation newEType) {
		EOperation oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND:
				return getDiff_kind();
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE:
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
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE:
				setEType((EOperation)newValue);
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
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE:
				setEType((EOperation)null);
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
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Refactoring2WayDiffMMPackage.DIFF_INTERFACE_EOPERATIONS__ETYPE:
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

} //DiffInterface_eoperationsImpl
