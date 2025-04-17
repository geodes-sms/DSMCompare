/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffVendor;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Vendor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffVendorImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffVendorImpl#getNew_VendorID <em>New Vendor ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffVendorImpl#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffVendorImpl#getNew_Description <em>New Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffVendorImpl extends VendorImpl implements DiffVendor {
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
	 * The default value of the '{@link #getNew_VendorID() <em>New Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VENDOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_VendorID() <em>New Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID()
	 * @generated
	 * @ordered
	 */
	protected int new_VendorID = NEW_VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected String new_Name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description() <em>New Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description() <em>New Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description()
	 * @generated
	 * @ordered
	 */
	protected String new_Description = NEW_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffVendorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_VENDOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_VENDOR__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_VendorID() {
		return new_VendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_VendorID(int newNew_VendorID) {
		int oldNew_VendorID = new_VendorID;
		new_VendorID = newNew_VendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID, oldNew_VendorID, new_VendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name() {
		return new_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name(String newNew_Name) {
		String oldNew_Name = new_Name;
		new_Name = newNew_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_NAME, oldNew_Name, new_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description() {
		return new_Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description(String newNew_Description) {
		String oldNew_Description = new_Description;
		new_Description = newNew_Description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION, oldNew_Description, new_Description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID:
				return getNew_VendorID();
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_NAME:
				return getNew_Name();
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION:
				return getNew_Description();
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
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID:
				setNew_VendorID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_NAME:
				setNew_Name((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION:
				setNew_Description((String)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID:
				setNew_VendorID(NEW_VENDOR_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION:
				setNew_Description(NEW_DESCRIPTION_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID:
				return new_VendorID != NEW_VENDOR_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
			case Dssmm2WayDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION:
				return NEW_DESCRIPTION_EDEFAULT == null ? new_Description != null : !NEW_DESCRIPTION_EDEFAULT.equals(new_Description);
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
		result.append(", new_VendorID: ");
		result.append(new_VendorID);
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(", new_Description: ");
		result.append(new_Description);
		result.append(')');
		return result.toString();
	}

} //DiffVendorImpl
