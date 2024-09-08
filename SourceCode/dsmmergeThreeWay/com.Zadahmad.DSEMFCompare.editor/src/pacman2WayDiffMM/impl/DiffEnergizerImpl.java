/**
 */
package pacman2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacman2WayDiffMM.ClassDiffKind;
import pacman2WayDiffMM.DiffEnergizer;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;
import pacman2WayDiffMM._ListEInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.DiffEnergizerImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.DiffEnergizerImpl#getNew_value <em>New value</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.DiffEnergizerImpl#getNew_durations <em>New durations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEnergizerImpl extends EnergizerImpl implements DiffEnergizer {
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
	 * The default value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected int new_value = NEW_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNew_durations() <em>New durations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_durations()
	 * @generated
	 * @ordered
	 */
	protected _ListEInt new_durations;

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
		return Pacman2WayDiffMMPackage.Literals.DIFF_ENERGIZER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value(int newNew_value) {
		int oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE, oldNew_value, new_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _ListEInt getNew_durations() {
		return new_durations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_durations(_ListEInt newNew_durations, NotificationChain msgs) {
		_ListEInt oldNew_durations = new_durations;
		new_durations = newNew_durations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS, oldNew_durations, newNew_durations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_durations(_ListEInt newNew_durations) {
		if (newNew_durations != new_durations) {
			NotificationChain msgs = null;
			if (new_durations != null)
				msgs = ((InternalEObject)new_durations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS, null, msgs);
			if (newNew_durations != null)
				msgs = ((InternalEObject)newNew_durations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS, null, msgs);
			msgs = basicSetNew_durations(newNew_durations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS, newNew_durations, newNew_durations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS:
				return basicSetNew_durations(null, msgs);
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
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND:
				return getDiff_kind();
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE:
				return getNew_value();
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS:
				return getNew_durations();
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
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE:
				setNew_value((Integer)newValue);
				return;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS:
				setNew_durations((_ListEInt)newValue);
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
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE:
				setNew_value(NEW_VALUE_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS:
				setNew_durations((_ListEInt)null);
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
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_VALUE:
				return new_value != NEW_VALUE_EDEFAULT;
			case Pacman2WayDiffMMPackage.DIFF_ENERGIZER__NEW_DURATIONS:
				return new_durations != null;
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
		result.append(", new_value: ");
		result.append(new_value);
		result.append(')');
		return result.toString();
	}

} //DiffEnergizerImpl
