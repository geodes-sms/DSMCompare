/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.AscDiffKind;
import dssmm2WayDiffMM.DiffCompositeFactor_subFactors;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayDiffMM.Factor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Composite Factor sub Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffCompositeFactor_subFactorsImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffCompositeFactor_subFactorsImpl extends MinimalEObjectImpl.Container implements DiffCompositeFactor_subFactors {
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
	protected Factor eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffCompositeFactor_subFactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_COMPOSITE_FACTOR_SUB_FACTORS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND, oldDiff_kind, diff_kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE, oldEType, eType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE:
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
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND:
				setDiff_kind((AscDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE:
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
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE:
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
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_COMPOSITE_FACTOR_SUB_FACTORS__ETYPE:
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

} //DiffCompositeFactor_subFactorsImpl
