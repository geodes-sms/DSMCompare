/**
 */
package petrinets2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinets2WayDiffMM.DiffKind;
import petrinets2WayDiffMM.DiffPlace;
import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.impl.DiffPlaceImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.DiffPlaceImpl#getNew_id <em>New id</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.DiffPlaceImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.DiffPlaceImpl#getNew_tokens <em>New tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffPlaceImpl extends PlaceImpl implements DiffPlace {
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
	protected static final int NEW_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected int new_id = NEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected String new_name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_tokens() <em>New tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_TOKENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_tokens() <em>New tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens()
	 * @generated
	 * @ordered
	 */
	protected int new_tokens = NEW_TOKENS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinets2WayDiffMMPackage.Literals.DIFF_PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_id() {
		return new_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id(int newNew_id) {
		int oldNew_id = new_id;
		new_id = newNew_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID, oldNew_id, new_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name() {
		return new_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name(String newNew_name) {
		String oldNew_name = new_name;
		new_name = newNew_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_tokens() {
		return new_tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_tokens(int newNew_tokens) {
		int oldNew_tokens = new_tokens;
		new_tokens = newNew_tokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS, oldNew_tokens, new_tokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND:
				return getDiff_kind();
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID:
				return getNew_id();
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME:
				return getNew_name();
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS:
				return getNew_tokens();
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
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID:
				setNew_id((Integer)newValue);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS:
				setNew_tokens((Integer)newValue);
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
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID:
				setNew_id(NEW_ID_EDEFAULT);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS:
				setNew_tokens(NEW_TOKENS_EDEFAULT);
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
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_ID:
				return new_id != NEW_ID_EDEFAULT;
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case Petrinets2WayDiffMMPackage.DIFF_PLACE__NEW_TOKENS:
				return new_tokens != NEW_TOKENS_EDEFAULT;
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
		result.append(", new_name: ");
		result.append(new_name);
		result.append(", new_tokens: ");
		result.append(new_tokens);
		result.append(')');
		return result.toString();
	}

} //DiffPlaceImpl
