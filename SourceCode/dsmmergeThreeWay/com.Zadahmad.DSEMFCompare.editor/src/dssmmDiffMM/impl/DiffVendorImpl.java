/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.DiffVendor;
import dssmmDiffMM.DssmmDiffMMPackage;

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
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_VendorID_Left <em>New Vendor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_VendorID_Right <em>New Vendor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getVendorIDChangeStatus <em>Vendor ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_Description_Left <em>New Description Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getNew_Description_Right <em>New Description Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffVendorImpl#getDescriptionChangeStatus <em>Description Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffVendorImpl extends VendorImpl implements DiffVendor {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_LEFT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_RIGHT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_VendorID_Left() <em>New Vendor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VENDOR_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_VendorID_Left() <em>New Vendor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_VendorID_Left = NEW_VENDOR_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_VendorID_Right() <em>New Vendor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VENDOR_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_VendorID_Right() <em>New Vendor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_VendorID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_VendorID_Right = NEW_VENDOR_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorIDChangeStatus() <em>Vendor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus VENDOR_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getVendorIDChangeStatus() <em>Vendor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus vendorIDChangeStatus = VENDOR_ID_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Left = NEW_NAME_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Right = NEW_NAME_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameChangeStatus() <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus NAME_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getNameChangeStatus() <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus nameChangeStatus = NAME_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description_Left() <em>New Description Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description_Left() <em>New Description Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Description_Left = NEW_DESCRIPTION_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description_Right() <em>New Description Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description_Right() <em>New Description Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Description_Right = NEW_DESCRIPTION_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionChangeStatus() <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DESCRIPTION_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDescriptionChangeStatus() <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus descriptionChangeStatus = DESCRIPTION_CHANGE_STATUS_EDEFAULT;

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
		return DssmmDiffMMPackage.Literals.DIFF_VENDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(ClassDiffKind newDiff_kind_Left) {
		ClassDiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(ClassDiffKind newDiff_kind_Right) {
		ClassDiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_VendorID_Left() {
		return new_VendorID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_VendorID_Left(int newNew_VendorID_Left) {
		int oldNew_VendorID_Left = new_VendorID_Left;
		new_VendorID_Left = newNew_VendorID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_LEFT, oldNew_VendorID_Left, new_VendorID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_VendorID_Right() {
		return new_VendorID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_VendorID_Right(int newNew_VendorID_Right) {
		int oldNew_VendorID_Right = new_VendorID_Right;
		new_VendorID_Right = newNew_VendorID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_RIGHT, oldNew_VendorID_Right, new_VendorID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getVendorIDChangeStatus() {
		return vendorIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorIDChangeStatus(ChangeStatus newVendorIDChangeStatus) {
		ChangeStatus oldVendorIDChangeStatus = vendorIDChangeStatus;
		vendorIDChangeStatus = newVendorIDChangeStatus == null ? VENDOR_ID_CHANGE_STATUS_EDEFAULT : newVendorIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS, oldVendorIDChangeStatus, vendorIDChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Left() {
		return new_Name_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Left(String newNew_Name_Left) {
		String oldNew_Name_Left = new_Name_Left;
		new_Name_Left = newNew_Name_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_LEFT, oldNew_Name_Left, new_Name_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Right() {
		return new_Name_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Right(String newNew_Name_Right) {
		String oldNew_Name_Right = new_Name_Right;
		new_Name_Right = newNew_Name_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_RIGHT, oldNew_Name_Right, new_Name_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getNameChangeStatus() {
		return nameChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameChangeStatus(ChangeStatus newNameChangeStatus) {
		ChangeStatus oldNameChangeStatus = nameChangeStatus;
		nameChangeStatus = newNameChangeStatus == null ? NAME_CHANGE_STATUS_EDEFAULT : newNameChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description_Left() {
		return new_Description_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description_Left(String newNew_Description_Left) {
		String oldNew_Description_Left = new_Description_Left;
		new_Description_Left = newNew_Description_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_LEFT, oldNew_Description_Left, new_Description_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description_Right() {
		return new_Description_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description_Right(String newNew_Description_Right) {
		String oldNew_Description_Right = new_Description_Right;
		new_Description_Right = newNew_Description_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_RIGHT, oldNew_Description_Right, new_Description_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDescriptionChangeStatus() {
		return descriptionChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionChangeStatus(ChangeStatus newDescriptionChangeStatus) {
		ChangeStatus oldDescriptionChangeStatus = descriptionChangeStatus;
		descriptionChangeStatus = newDescriptionChangeStatus == null ? DESCRIPTION_CHANGE_STATUS_EDEFAULT : newDescriptionChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS, oldDescriptionChangeStatus, descriptionChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_VENDOR__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_LEFT:
				return getNew_VendorID_Left();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_RIGHT:
				return getNew_VendorID_Right();
			case DssmmDiffMMPackage.DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS:
				return getVendorIDChangeStatus();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_LEFT:
				return getNew_Name_Left();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_RIGHT:
				return getNew_Name_Right();
			case DssmmDiffMMPackage.DIFF_VENDOR__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_LEFT:
				return getNew_Description_Left();
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_RIGHT:
				return getNew_Description_Right();
			case DssmmDiffMMPackage.DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS:
				return getDescriptionChangeStatus();
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
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_LEFT:
				setNew_VendorID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_RIGHT:
				setNew_VendorID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS:
				setVendorIDChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_LEFT:
				setNew_Name_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_RIGHT:
				setNew_Name_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_LEFT:
				setNew_Description_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_RIGHT:
				setNew_Description_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS:
				setDescriptionChangeStatus((ChangeStatus)newValue);
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
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_LEFT:
				setNew_VendorID_Left(NEW_VENDOR_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_RIGHT:
				setNew_VendorID_Right(NEW_VENDOR_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS:
				setVendorIDChangeStatus(VENDOR_ID_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_LEFT:
				setNew_Name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_RIGHT:
				setNew_Name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_LEFT:
				setNew_Description_Left(NEW_DESCRIPTION_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_RIGHT:
				setNew_Description_Right(NEW_DESCRIPTION_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS:
				setDescriptionChangeStatus(DESCRIPTION_CHANGE_STATUS_EDEFAULT);
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
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_LEFT:
				return new_VendorID_Left != NEW_VENDOR_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_VENDOR_ID_RIGHT:
				return new_VendorID_Right != NEW_VENDOR_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__VENDOR_ID_CHANGE_STATUS:
				return vendorIDChangeStatus != VENDOR_ID_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_Name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_Name_Left);
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_Name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_Name_Right);
			case DssmmDiffMMPackage.DIFF_VENDOR__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_LEFT:
				return NEW_DESCRIPTION_LEFT_EDEFAULT == null ? new_Description_Left != null : !NEW_DESCRIPTION_LEFT_EDEFAULT.equals(new_Description_Left);
			case DssmmDiffMMPackage.DIFF_VENDOR__NEW_DESCRIPTION_RIGHT:
				return NEW_DESCRIPTION_RIGHT_EDEFAULT == null ? new_Description_Right != null : !NEW_DESCRIPTION_RIGHT_EDEFAULT.equals(new_Description_Right);
			case DssmmDiffMMPackage.DIFF_VENDOR__DESCRIPTION_CHANGE_STATUS:
				return descriptionChangeStatus != DESCRIPTION_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_VendorID_Left: ");
		result.append(new_VendorID_Left);
		result.append(", new_VendorID_Right: ");
		result.append(new_VendorID_Right);
		result.append(", VendorIDChangeStatus: ");
		result.append(vendorIDChangeStatus);
		result.append(", new_Name_Left: ");
		result.append(new_Name_Left);
		result.append(", new_Name_Right: ");
		result.append(new_Name_Right);
		result.append(", NameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_Description_Left: ");
		result.append(new_Description_Left);
		result.append(", new_Description_Right: ");
		result.append(new_Description_Right);
		result.append(", DescriptionChangeStatus: ");
		result.append(descriptionChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffVendorImpl
