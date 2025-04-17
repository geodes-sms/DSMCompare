/**
 */
package refactoringCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoringCRRuleMM.ChangeStatus;
import refactoringCRRuleMM.DiffKind;
import refactoringCRRuleMM.Pattern_DiffEReference;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getNew_etype_Left <em>New etype Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getNew_etype_Right <em>New etype Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEReferenceImpl#getEtypeChangeStatus <em>Etype Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffEReferenceImpl extends Pattern_EReferenceImpl implements Pattern_DiffEReference {
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
	 * The default value of the '{@link #isFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMerged() <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMerged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MERGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMerged() <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMerged()
	 * @generated
	 * @ordered
	 */
	protected boolean isMerged = IS_MERGED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_DIFF_EREFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(boolean newFilter) {
		boolean oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMerged() {
		return isMerged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMerged(boolean newIsMerged) {
		boolean oldIsMerged = isMerged;
		isMerged = newIsMerged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT, oldNew_name_Left, new_name_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT, oldNew_name_Right, new_name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT, oldNew_etype_Left, new_etype_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT, oldNew_etype_Right, new_etype_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS, oldEtypeChangeStatus, etypeChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__FILTER:
				return isFilter();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__IS_MERGED:
				return isIsMerged();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__CHANGE_STATUS:
				return getChangeStatus();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT:
				return getNew_name_Left();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT:
				return getNew_name_Right();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT:
				return getNew_etype_Left();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT:
				return getNew_etype_Right();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS:
				return getEtypeChangeStatus();
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__FILTER:
				setFilter((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT:
				setNew_name_Left((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT:
				setNew_name_Right((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT:
				setNew_etype_Left((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT:
				setNew_etype_Right((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS:
				setEtypeChangeStatus((ChangeStatus)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT:
				setNew_name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT:
				setNew_name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT:
				setNew_etype_Left(NEW_ETYPE_LEFT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT:
				setNew_etype_Right(NEW_ETYPE_RIGHT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS:
				setEtypeChangeStatus(ETYPE_CHANGE_STATUS_EDEFAULT);
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__FILTER:
				return filter != FILTER_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_name_Left);
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_name_Right);
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_LEFT:
				return NEW_ETYPE_LEFT_EDEFAULT == null ? new_etype_Left != null : !NEW_ETYPE_LEFT_EDEFAULT.equals(new_etype_Left);
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__NEW_ETYPE_RIGHT:
				return NEW_ETYPE_RIGHT_EDEFAULT == null ? new_etype_Right != null : !NEW_ETYPE_RIGHT_EDEFAULT.equals(new_etype_Right);
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_EREFERENCE__ETYPE_CHANGE_STATUS:
				return etypeChangeStatus != ETYPE_CHANGE_STATUS_EDEFAULT;
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
		result.append(", filter: ");
		result.append(filter);
		result.append(", isMerged: ");
		result.append(isMerged);
		result.append(", changeStatus: ");
		result.append(changeStatus);
		result.append(", new_name_Left: ");
		result.append(new_name_Left);
		result.append(", new_name_Right: ");
		result.append(new_name_Right);
		result.append(", nameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_etype_Left: ");
		result.append(new_etype_Left);
		result.append(", new_etype_Right: ");
		result.append(new_etype_Right);
		result.append(", etypeChangeStatus: ");
		result.append(etypeChangeStatus);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffEReferenceImpl
