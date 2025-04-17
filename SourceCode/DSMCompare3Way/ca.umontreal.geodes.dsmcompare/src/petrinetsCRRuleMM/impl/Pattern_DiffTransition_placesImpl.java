/**
 */
package petrinetsCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import petrinetsCRRuleMM.ChangeStatus;
import petrinetsCRRuleMM.DiffKind;
import petrinetsCRRuleMM.Pattern_DiffTransition_places;
import petrinetsCRRuleMM.Pattern_Place;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Transition places</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getDiff_Group <em>Diff Group</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_DiffTransition_placesImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffTransition_placesImpl extends MinimalEObjectImpl.Container implements Pattern_DiffTransition_places {
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
	protected Pattern_Place eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffTransition_placesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsCRRuleMMPackage.Literals.PATTERN_DIFF_TRANSITION_PLACES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP, oldDiff_Group, diff_Group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Place getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (Pattern_Place)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_Place basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(Pattern_Place newEType) {
		Pattern_Place oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN:
				return getID_Pattern();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN:
				return isIsForbidden();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS:
				return getChangeStatus();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__FILTER:
				return isFilter();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED:
				return isIsMerged();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP:
				return getDiff_Group();
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE:
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
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP:
				setDiff_Group((String)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE:
				setEType((Pattern_Place)newValue);
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
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP:
				setDiff_Group(DIFF_GROUP_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE:
				setEType((Pattern_Place)null);
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
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__FILTER:
				return filter != FILTER_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__DIFF_GROUP:
				return DIFF_GROUP_EDEFAULT == null ? diff_Group != null : !DIFF_GROUP_EDEFAULT.equals(diff_Group);
			case PetrinetsCRRuleMMPackage.PATTERN_DIFF_TRANSITION_PLACES__ETYPE:
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

} //Pattern_DiffTransition_placesImpl
