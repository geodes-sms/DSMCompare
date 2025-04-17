/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.DiffFood;
import pacmanDiffMM.DiffKind;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Food</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffFoodImpl#getValueChangeStatus <em>Value Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffFoodImpl extends FoodImpl implements DiffFood {
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
	 * The default value of the '{@link #getNew_id_Left() <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ID_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_id_Left() <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_id_Left = NEW_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_id_Right() <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ID_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_id_Right() <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_id_Right = NEW_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdChangeStatus() <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getIdChangeStatus() <em>Id Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus idChangeStatus = ID_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_value_Left() <em>New value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value_Left() <em>New value Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_value_Left = NEW_VALUE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_value_Right() <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value_Right() <em>New value Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_value_Right = NEW_VALUE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueChangeStatus() <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus VALUE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getValueChangeStatus() <em>Value Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus valueChangeStatus = VALUE_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffFoodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.DIFF_FOOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_id_Left() {
		return new_id_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id_Left(String newNew_id_Left) {
		String oldNew_id_Left = new_id_Left;
		new_id_Left = newNew_id_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_id_Right() {
		return new_id_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id_Right(String newNew_id_Right) {
		String oldNew_id_Right = new_id_Right;
		new_id_Right = newNew_id_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getIdChangeStatus() {
		return idChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdChangeStatus(ChangeStatus newIdChangeStatus) {
		ChangeStatus oldIdChangeStatus = idChangeStatus;
		idChangeStatus = newIdChangeStatus == null ? ID_CHANGE_STATUS_EDEFAULT : newIdChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value_Left() {
		return new_value_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value_Left(int newNew_value_Left) {
		int oldNew_value_Left = new_value_Left;
		new_value_Left = newNew_value_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_LEFT, oldNew_value_Left, new_value_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value_Right() {
		return new_value_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value_Right(int newNew_value_Right) {
		int oldNew_value_Right = new_value_Right;
		new_value_Right = newNew_value_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_RIGHT, oldNew_value_Right, new_value_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getValueChangeStatus() {
		return valueChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueChangeStatus(ChangeStatus newValueChangeStatus) {
		ChangeStatus oldValueChangeStatus = valueChangeStatus;
		valueChangeStatus = newValueChangeStatus == null ? VALUE_CHANGE_STATUS_EDEFAULT : newValueChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_FOOD__VALUE_CHANGE_STATUS, oldValueChangeStatus, valueChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_FOOD__FILTER:
				return isFilter();
			case PacmanDiffMMPackage.DIFF_FOOD__IS_MERGED:
				return isIsMerged();
			case PacmanDiffMMPackage.DIFF_FOOD__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanDiffMMPackage.DIFF_FOOD__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_LEFT:
				return getNew_value_Left();
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_RIGHT:
				return getNew_value_Right();
			case PacmanDiffMMPackage.DIFF_FOOD__VALUE_CHANGE_STATUS:
				return getValueChangeStatus();
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
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_LEFT:
				setNew_value_Left((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_RIGHT:
				setNew_value_Right((Integer)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__VALUE_CHANGE_STATUS:
				setValueChangeStatus((ChangeStatus)newValue);
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
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_LEFT:
				setNew_value_Left(NEW_VALUE_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_RIGHT:
				setNew_value_Right(NEW_VALUE_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_FOOD__VALUE_CHANGE_STATUS:
				setValueChangeStatus(VALUE_CHANGE_STATUS_EDEFAULT);
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
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanDiffMMPackage.DIFF_FOOD__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_LEFT:
				return new_value_Left != NEW_VALUE_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__NEW_VALUE_RIGHT:
				return new_value_Right != NEW_VALUE_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_FOOD__VALUE_CHANGE_STATUS:
				return valueChangeStatus != VALUE_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_id_Left: ");
		result.append(new_id_Left);
		result.append(", new_id_Right: ");
		result.append(new_id_Right);
		result.append(", idChangeStatus: ");
		result.append(idChangeStatus);
		result.append(", new_value_Left: ");
		result.append(new_value_Left);
		result.append(", new_value_Right: ");
		result.append(new_value_Right);
		result.append(", valueChangeStatus: ");
		result.append(valueChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffFoodImpl
