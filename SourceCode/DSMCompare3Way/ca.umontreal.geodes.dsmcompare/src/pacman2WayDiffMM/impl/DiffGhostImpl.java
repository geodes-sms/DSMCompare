/**
 */
package pacman2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacman2WayDiffMM.DiffGhost;
import pacman2WayDiffMM.DiffKind;
import pacman2WayDiffMM.GhostStrategy;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Ghost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGhostImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGhostImpl#getNew_id <em>New id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.DiffGhostImpl#getNew_strategy <em>New strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGhostImpl extends GhostImpl implements DiffGhost {
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
	 * The default value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected String new_id = NEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_strategy() <em>New strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy()
	 * @generated
	 * @ordered
	 */
	protected static final GhostStrategy NEW_STRATEGY_EDEFAULT = GhostStrategy.BLINKY;

	/**
	 * The cached value of the '{@link #getNew_strategy() <em>New strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy()
	 * @generated
	 * @ordered
	 */
	protected GhostStrategy new_strategy = NEW_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffGhostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pacman2WayDiffMMPackage.Literals.DIFF_GHOST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_id() {
		return new_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id(String newNew_id) {
		String oldNew_id = new_id;
		new_id = newNew_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_ID, oldNew_id, new_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostStrategy getNew_strategy() {
		return new_strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_strategy(GhostStrategy newNew_strategy) {
		GhostStrategy oldNew_strategy = new_strategy;
		new_strategy = newNew_strategy == null ? NEW_STRATEGY_EDEFAULT : newNew_strategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY, oldNew_strategy, new_strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND:
				return getDiff_kind();
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_ID:
				return getNew_id();
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY:
				return getNew_strategy();
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
			case Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_ID:
				setNew_id((String)newValue);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY:
				setNew_strategy((GhostStrategy)newValue);
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
			case Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_ID:
				setNew_id(NEW_ID_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY:
				setNew_strategy(NEW_STRATEGY_EDEFAULT);
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
			case Pacman2WayDiffMMPackage.DIFF_GHOST__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_ID:
				return NEW_ID_EDEFAULT == null ? new_id != null : !NEW_ID_EDEFAULT.equals(new_id);
			case Pacman2WayDiffMMPackage.DIFF_GHOST__NEW_STRATEGY:
				return new_strategy != NEW_STRATEGY_EDEFAULT;
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
		result.append(", new_id: ");
		result.append(new_id);
		result.append(", new_strategy: ");
		result.append(new_strategy);
		result.append(')');
		return result.toString();
	}

} //DiffGhostImpl
