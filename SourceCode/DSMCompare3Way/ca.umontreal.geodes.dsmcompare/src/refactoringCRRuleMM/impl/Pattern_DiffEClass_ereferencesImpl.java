/**
 */
package refactoringCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import refactoringCRRuleMM.ChangeStatus;
import refactoringCRRuleMM.DiffKind;
import refactoringCRRuleMM.Pattern_DiffEClass_ereferences;
import refactoringCRRuleMM.Pattern_EReference;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff EClass ereferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getDiff_Group <em>Diff Group</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_DiffEClass_ereferencesImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffEClass_ereferencesImpl extends MinimalEObjectImpl.Container implements Pattern_DiffEClass_ereferences {
	/**
	 * The default value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected int iD_Pattern = ID_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

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
	 * The default value of the '{@link #getDiff_Group() <em>Diff Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_Group()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFF_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiff_Group() <em>Diff Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_Group()
	 * @generated
	 * @ordered
	 */
	protected String diff_Group = DIFF_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected Pattern_EReference eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffEClass_ereferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_DIFF_ECLASS_EREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED, oldIsMerged, isMerged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiff_Group() {
		return diff_Group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_Group(String newDiff_Group) {
		String oldDiff_Group = diff_Group;
		diff_Group = newDiff_Group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP, oldDiff_Group, diff_Group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EReference getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (Pattern_EReference)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EReference basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(Pattern_EReference newEType) {
		Pattern_EReference oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS:
				return getChangeStatus();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__FILTER:
				return isFilter();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED:
				return isIsMerged();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP:
				return getDiff_Group();
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE:
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__FILTER:
				setFilter((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP:
				setDiff_Group((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE:
				setEType((Pattern_EReference)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP:
				setDiff_Group(DIFF_GROUP_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE:
				setEType((Pattern_EReference)null);
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
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__FILTER:
				return filter != FILTER_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__DIFF_GROUP:
				return DIFF_GROUP_EDEFAULT == null ? diff_Group != null : !DIFF_GROUP_EDEFAULT.equals(diff_Group);
			case RefactoringCRRuleMMPackage.PATTERN_DIFF_ECLASS_EREFERENCES__ETYPE:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", diff_kind_Left: ");
		result.append(diff_kind_Left);
		result.append(", diff_kind_Right: ");
		result.append(diff_kind_Right);
		result.append(", changeStatus: ");
		result.append(changeStatus);
		result.append(", filter: ");
		result.append(filter);
		result.append(", isMerged: ");
		result.append(isMerged);
		result.append(", diff_Group: ");
		result.append(diff_Group);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffEClass_ereferencesImpl
