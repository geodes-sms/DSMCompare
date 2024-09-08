/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import refactoring2WayDiffMM.DiffEClass_eattributes;
import refactoring2WayDiffMM.DiffKind;
import refactoring2WayDiffMM.EAttribute;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EClass eattributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClass_eattributesImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEClass_eattributesImpl extends MinimalEObjectImpl.Container implements DiffEClass_eattributes {
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
	protected EAttribute eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEClass_eattributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Refactoring2WayDiffMMPackage.Literals.DIFF_ECLASS_EATTRIBUTES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (EAttribute)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(EAttribute newEType) {
		EAttribute oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND:
				return getDiff_kind();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE:
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
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE:
				setEType((EAttribute)newValue);
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
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE:
				setEType((EAttribute)null);
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
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS_EATTRIBUTES__ETYPE:
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

} //DiffEClass_eattributesImpl
