/**
 */
package pacman2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacman2WayDiffMM.ClassDiffKind;
import pacman2WayDiffMM.DiffGridNode;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Grid Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGridNodeImpl#getDiff_kind <em>Diff kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGridNodeImpl extends GridNodeImpl implements DiffGridNode {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffGridNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pacman2WayDiffMMPackage.Literals.DIFF_GRID_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(ClassDiffKind newDiff_kind) {
		ClassDiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND:
				return getDiff_kind();
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
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
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
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
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
			case Pacman2WayDiffMMPackage.DIFF_GRID_NODE__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
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

} //DiffGridNodeImpl
