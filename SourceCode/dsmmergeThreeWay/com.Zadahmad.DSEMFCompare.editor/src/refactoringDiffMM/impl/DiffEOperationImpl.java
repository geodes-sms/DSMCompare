/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoringDiffMM.ChangeStatus;
import refactoringDiffMM.DiffEOperation;
import refactoringDiffMM.DiffKind;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_eparameters_Left <em>New eparameters Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_eparameters_Right <em>New eparameters Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getEparametersChangeStatus <em>Eparameters Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_etype_Left <em>New etype Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_etype_Right <em>New etype Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getEtypeChangeStatus <em>Etype Change Status</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_methodBody_Left <em>New method Body Left</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getNew_methodBody_Right <em>New method Body Right</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEOperationImpl#getMethodBodyChangeStatus <em>Method Body Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEOperationImpl extends EOperationImpl implements DiffEOperation {
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
	 * The default value of the '{@link #getNew_eparameters_Left() <em>New eparameters Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EPARAMETERS_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_eparameters_Left() <em>New eparameters Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_eparameters_Left = NEW_EPARAMETERS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_eparameters_Right() <em>New eparameters Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EPARAMETERS_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_eparameters_Right() <em>New eparameters Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_eparameters_Right = NEW_EPARAMETERS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEparametersChangeStatus() <em>Eparameters Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparametersChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus EPARAMETERS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getEparametersChangeStatus() <em>Eparameters Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparametersChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus eparametersChangeStatus = EPARAMETERS_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_etype_Left() <em>New etype Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ETYPE_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_etype_Left() <em>New etype Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_etype_Left = NEW_ETYPE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_etype_Right() <em>New etype Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ETYPE_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_etype_Right() <em>New etype Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_etype_Right = NEW_ETYPE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtypeChangeStatus() <em>Etype Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtypeChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus ETYPE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getEtypeChangeStatus() <em>Etype Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtypeChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus etypeChangeStatus = ETYPE_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_methodBody_Left() <em>New method Body Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_METHOD_BODY_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_methodBody_Left() <em>New method Body Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_methodBody_Left = NEW_METHOD_BODY_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_methodBody_Right() <em>New method Body Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_METHOD_BODY_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_methodBody_Right() <em>New method Body Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_methodBody_Right = NEW_METHOD_BODY_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodBodyChangeStatus() <em>Method Body Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBodyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus METHOD_BODY_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getMethodBodyChangeStatus() <em>Method Body Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBodyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus methodBodyChangeStatus = METHOD_BODY_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.DIFF_EOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_LEFT, oldNew_name_Left, new_name_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_RIGHT, oldNew_name_Right, new_name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_eparameters_Left() {
		return new_eparameters_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_eparameters_Left(String newNew_eparameters_Left) {
		String oldNew_eparameters_Left = new_eparameters_Left;
		new_eparameters_Left = newNew_eparameters_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_LEFT, oldNew_eparameters_Left, new_eparameters_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_eparameters_Right() {
		return new_eparameters_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_eparameters_Right(String newNew_eparameters_Right) {
		String oldNew_eparameters_Right = new_eparameters_Right;
		new_eparameters_Right = newNew_eparameters_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT, oldNew_eparameters_Right, new_eparameters_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getEparametersChangeStatus() {
		return eparametersChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEparametersChangeStatus(ChangeStatus newEparametersChangeStatus) {
		ChangeStatus oldEparametersChangeStatus = eparametersChangeStatus;
		eparametersChangeStatus = newEparametersChangeStatus == null ? EPARAMETERS_CHANGE_STATUS_EDEFAULT : newEparametersChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS, oldEparametersChangeStatus, eparametersChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_etype_Left() {
		return new_etype_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_etype_Left(String newNew_etype_Left) {
		String oldNew_etype_Left = new_etype_Left;
		new_etype_Left = newNew_etype_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_LEFT, oldNew_etype_Left, new_etype_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_etype_Right() {
		return new_etype_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_etype_Right(String newNew_etype_Right) {
		String oldNew_etype_Right = new_etype_Right;
		new_etype_Right = newNew_etype_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_RIGHT, oldNew_etype_Right, new_etype_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getEtypeChangeStatus() {
		return etypeChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtypeChangeStatus(ChangeStatus newEtypeChangeStatus) {
		ChangeStatus oldEtypeChangeStatus = etypeChangeStatus;
		etypeChangeStatus = newEtypeChangeStatus == null ? ETYPE_CHANGE_STATUS_EDEFAULT : newEtypeChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE_CHANGE_STATUS, oldEtypeChangeStatus, etypeChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_methodBody_Left() {
		return new_methodBody_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_methodBody_Left(String newNew_methodBody_Left) {
		String oldNew_methodBody_Left = new_methodBody_Left;
		new_methodBody_Left = newNew_methodBody_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_LEFT, oldNew_methodBody_Left, new_methodBody_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_methodBody_Right() {
		return new_methodBody_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_methodBody_Right(String newNew_methodBody_Right) {
		String oldNew_methodBody_Right = new_methodBody_Right;
		new_methodBody_Right = newNew_methodBody_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT, oldNew_methodBody_Right, new_methodBody_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getMethodBodyChangeStatus() {
		return methodBodyChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBodyChangeStatus(ChangeStatus newMethodBodyChangeStatus) {
		ChangeStatus oldMethodBodyChangeStatus = methodBodyChangeStatus;
		methodBodyChangeStatus = newMethodBodyChangeStatus == null ? METHOD_BODY_CHANGE_STATUS_EDEFAULT : newMethodBodyChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS, oldMethodBodyChangeStatus, methodBodyChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__CHANGE_STATUS:
				return getChangeStatus();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_LEFT:
				return getNew_name_Left();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_RIGHT:
				return getNew_name_Right();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_LEFT:
				return getNew_eparameters_Left();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT:
				return getNew_eparameters_Right();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS:
				return getEparametersChangeStatus();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_LEFT:
				return getNew_etype_Left();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_RIGHT:
				return getNew_etype_Right();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE_CHANGE_STATUS:
				return getEtypeChangeStatus();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_LEFT:
				return getNew_methodBody_Left();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT:
				return getNew_methodBody_Right();
			case RefactoringDiffMMPackage.DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS:
				return getMethodBodyChangeStatus();
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
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_LEFT:
				setNew_name_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_RIGHT:
				setNew_name_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_LEFT:
				setNew_eparameters_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT:
				setNew_eparameters_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS:
				setEparametersChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_LEFT:
				setNew_etype_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_RIGHT:
				setNew_etype_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE_CHANGE_STATUS:
				setEtypeChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_LEFT:
				setNew_methodBody_Left((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT:
				setNew_methodBody_Right((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS:
				setMethodBodyChangeStatus((ChangeStatus)newValue);
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
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_LEFT:
				setNew_name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_RIGHT:
				setNew_name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_LEFT:
				setNew_eparameters_Left(NEW_EPARAMETERS_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT:
				setNew_eparameters_Right(NEW_EPARAMETERS_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS:
				setEparametersChangeStatus(EPARAMETERS_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_LEFT:
				setNew_etype_Left(NEW_ETYPE_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_RIGHT:
				setNew_etype_Right(NEW_ETYPE_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE_CHANGE_STATUS:
				setEtypeChangeStatus(ETYPE_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_LEFT:
				setNew_methodBody_Left(NEW_METHOD_BODY_LEFT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT:
				setNew_methodBody_Right(NEW_METHOD_BODY_RIGHT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS:
				setMethodBodyChangeStatus(METHOD_BODY_CHANGE_STATUS_EDEFAULT);
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
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_name_Left);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_name_Right);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_LEFT:
				return NEW_EPARAMETERS_LEFT_EDEFAULT == null ? new_eparameters_Left != null : !NEW_EPARAMETERS_LEFT_EDEFAULT.equals(new_eparameters_Left);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS_RIGHT:
				return NEW_EPARAMETERS_RIGHT_EDEFAULT == null ? new_eparameters_Right != null : !NEW_EPARAMETERS_RIGHT_EDEFAULT.equals(new_eparameters_Right);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__EPARAMETERS_CHANGE_STATUS:
				return eparametersChangeStatus != EPARAMETERS_CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_LEFT:
				return NEW_ETYPE_LEFT_EDEFAULT == null ? new_etype_Left != null : !NEW_ETYPE_LEFT_EDEFAULT.equals(new_etype_Left);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE_RIGHT:
				return NEW_ETYPE_RIGHT_EDEFAULT == null ? new_etype_Right != null : !NEW_ETYPE_RIGHT_EDEFAULT.equals(new_etype_Right);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__ETYPE_CHANGE_STATUS:
				return etypeChangeStatus != ETYPE_CHANGE_STATUS_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_LEFT:
				return NEW_METHOD_BODY_LEFT_EDEFAULT == null ? new_methodBody_Left != null : !NEW_METHOD_BODY_LEFT_EDEFAULT.equals(new_methodBody_Left);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY_RIGHT:
				return NEW_METHOD_BODY_RIGHT_EDEFAULT == null ? new_methodBody_Right != null : !NEW_METHOD_BODY_RIGHT_EDEFAULT.equals(new_methodBody_Right);
			case RefactoringDiffMMPackage.DIFF_EOPERATION__METHOD_BODY_CHANGE_STATUS:
				return methodBodyChangeStatus != METHOD_BODY_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_eparameters_Left: ");
		result.append(new_eparameters_Left);
		result.append(", new_eparameters_Right: ");
		result.append(new_eparameters_Right);
		result.append(", eparametersChangeStatus: ");
		result.append(eparametersChangeStatus);
		result.append(", new_etype_Left: ");
		result.append(new_etype_Left);
		result.append(", new_etype_Right: ");
		result.append(new_etype_Right);
		result.append(", etypeChangeStatus: ");
		result.append(etypeChangeStatus);
		result.append(", new_methodBody_Left: ");
		result.append(new_methodBody_Left);
		result.append(", new_methodBody_Right: ");
		result.append(new_methodBody_Right);
		result.append(", methodBodyChangeStatus: ");
		result.append(methodBodyChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffEOperationImpl
