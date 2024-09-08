/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoringDiffMM.ChangeStatus;
import refactoringDiffMM.DiffInterface;
import refactoringDiffMM.DiffKind;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_extends_Left <em>New extends Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_extends_Right <em>New extends Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getExtendsChangeStatus <em>Extends Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_packageName_Left <em>New package Name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getNew_packageName_Right <em>New package Name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffInterfaceImpl#getPackageNameChangeStatus <em>Package Name Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffInterfaceImpl extends InterfaceImpl implements DiffInterface {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final DiffKind DIFF_KIND_LEFT_EDEFAULT = DiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected DiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final DiffKind DIFF_KIND_RIGHT_EDEFAULT = DiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected DiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_name_Left() <em>New name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name_Left() <em>New name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_name_Left = NEW_NAME_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name_Right() <em>New name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name_Right() <em>New name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_name_Right = NEW_NAME_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_extends_Left() <em>New extends Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EXTENDS_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_extends_Left() <em>New extends Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_extends_Left = NEW_EXTENDS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_extends_Right() <em>New extends Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EXTENDS_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_extends_Right() <em>New extends Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_extends_Right = NEW_EXTENDS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendsChangeStatus() <em>Extends Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus EXTENDS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getExtendsChangeStatus() <em>Extends Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus extendsChangeStatus = EXTENDS_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_packageName_Left() <em>New package Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PACKAGE_NAME_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_packageName_Left() <em>New package Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_packageName_Left = NEW_PACKAGE_NAME_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_packageName_Right() <em>New package Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PACKAGE_NAME_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_packageName_Right() <em>New package Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_packageName_Right = NEW_PACKAGE_NAME_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageNameChangeStatus() <em>Package Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus PACKAGE_NAME_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getPackageNameChangeStatus() <em>Package Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus packageNameChangeStatus = PACKAGE_NAME_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.DIFF_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(DiffKind newDiff_kind_Left) {
		DiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(DiffKind newDiff_kind_Right) {
		DiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name_Left() {
		return new_name_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name_Left(String newNew_name_Left) {
		String oldNew_name_Left = new_name_Left;
		new_name_Left = newNew_name_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT, oldNew_name_Left, new_name_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name_Right() {
		return new_name_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name_Right(String newNew_name_Right) {
		String oldNew_name_Right = new_name_Right;
		new_name_Right = newNew_name_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT, oldNew_name_Right, new_name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_extends_Left() {
		return new_extends_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_extends_Left(String newNew_extends_Left) {
		String oldNew_extends_Left = new_extends_Left;
		new_extends_Left = newNew_extends_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT, oldNew_extends_Left, new_extends_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_extends_Right() {
		return new_extends_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_extends_Right(String newNew_extends_Right) {
		String oldNew_extends_Right = new_extends_Right;
		new_extends_Right = newNew_extends_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT, oldNew_extends_Right, new_extends_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getExtendsChangeStatus() {
		return extendsChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendsChangeStatus(ChangeStatus newExtendsChangeStatus) {
		ChangeStatus oldExtendsChangeStatus = extendsChangeStatus;
		extendsChangeStatus = newExtendsChangeStatus == null ? EXTENDS_CHANGE_STATUS_EDEFAULT : newExtendsChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS, oldExtendsChangeStatus, extendsChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_packageName_Left() {
		return new_packageName_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_packageName_Left(String newNew_packageName_Left) {
		String oldNew_packageName_Left = new_packageName_Left;
		new_packageName_Left = newNew_packageName_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT, oldNew_packageName_Left, new_packageName_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_packageName_Right() {
		return new_packageName_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_packageName_Right(String newNew_packageName_Right) {
		String oldNew_packageName_Right = new_packageName_Right;
		new_packageName_Right = newNew_packageName_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT, oldNew_packageName_Right, new_packageName_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getPackageNameChangeStatus() {
		return packageNameChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageNameChangeStatus(ChangeStatus newPackageNameChangeStatus) {
		ChangeStatus oldPackageNameChangeStatus = packageNameChangeStatus;
		packageNameChangeStatus = newPackageNameChangeStatus == null ? PACKAGE_NAME_CHANGE_STATUS_EDEFAULT : newPackageNameChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS, oldPackageNameChangeStatus, packageNameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS:
				return getChangeStatus();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT:
				return getNew_name_Left();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT:
				return getNew_name_Right();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT:
				return getNew_extends_Left();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT:
				return getNew_extends_Right();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS:
				return getExtendsChangeStatus();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT:
				return getNew_packageName_Left();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT:
				return getNew_packageName_Right();
			case RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS:
				return getPackageNameChangeStatus();
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
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT:
				setNew_name_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT:
				setNew_name_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT:
				setNew_extends_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT:
				setNew_extends_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS:
				setExtendsChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT:
				setNew_packageName_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT:
				setNew_packageName_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS:
				setPackageNameChangeStatus((ChangeStatus)newValue);
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
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT:
				setNew_name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT:
				setNew_name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT:
				setNew_extends_Left(NEW_EXTENDS_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT:
				setNew_extends_Right(NEW_EXTENDS_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS:
				setExtendsChangeStatus(EXTENDS_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT:
				setNew_packageName_Left(NEW_PACKAGE_NAME_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT:
				setNew_packageName_Right(NEW_PACKAGE_NAME_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS:
				setPackageNameChangeStatus(PACKAGE_NAME_CHANGE_STATUS_EDEFAULT);
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
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_name_Left);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_name_Right);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_LEFT:
				return NEW_EXTENDS_LEFT_EDEFAULT == null ? new_extends_Left != null : !NEW_EXTENDS_LEFT_EDEFAULT.equals(new_extends_Left);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_EXTENDS_RIGHT:
				return NEW_EXTENDS_RIGHT_EDEFAULT == null ? new_extends_Right != null : !NEW_EXTENDS_RIGHT_EDEFAULT.equals(new_extends_Right);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__EXTENDS_CHANGE_STATUS:
				return extendsChangeStatus != EXTENDS_CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_LEFT:
				return NEW_PACKAGE_NAME_LEFT_EDEFAULT == null ? new_packageName_Left != null : !NEW_PACKAGE_NAME_LEFT_EDEFAULT.equals(new_packageName_Left);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__NEW_PACKAGE_NAME_RIGHT:
				return NEW_PACKAGE_NAME_RIGHT_EDEFAULT == null ? new_packageName_Right != null : !NEW_PACKAGE_NAME_RIGHT_EDEFAULT.equals(new_packageName_Right);
			case RefactoringDiffMMPackage.DIFF_INTERFACE__PACKAGE_NAME_CHANGE_STATUS:
				return packageNameChangeStatus != PACKAGE_NAME_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_name_Left: ");
		result.append(new_name_Left);
		result.append(", new_name_Right: ");
		result.append(new_name_Right);
		result.append(", nameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_extends_Left: ");
		result.append(new_extends_Left);
		result.append(", new_extends_Right: ");
		result.append(new_extends_Right);
		result.append(", extendsChangeStatus: ");
		result.append(extendsChangeStatus);
		result.append(", new_packageName_Left: ");
		result.append(new_packageName_Left);
		result.append(", new_packageName_Right: ");
		result.append(new_packageName_Right);
		result.append(", packageNameChangeStatus: ");
		result.append(packageNameChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffInterfaceImpl
