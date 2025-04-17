/**
 */
package pacmanDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanDiffMM.ChangeStatus;
import pacmanDiffMM.DiffGhost;
import pacmanDiffMM.DiffKind;
import pacmanDiffMM.GhostStrategy;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Ghost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getNew_strategy_Left <em>New strategy Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getNew_strategy_Right <em>New strategy Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DiffGhostImpl#getStrategyChangeStatus <em>Strategy Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffGhostImpl extends GhostImpl implements DiffGhost {
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
	 * The default value of the '{@link #getNew_strategy_Left() <em>New strategy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy_Left()
	 * @generated
	 * @ordered
	 */
	protected static final GhostStrategy NEW_STRATEGY_LEFT_EDEFAULT = GhostStrategy.BLINKY;

	/**
	 * The cached value of the '{@link #getNew_strategy_Left() <em>New strategy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy_Left()
	 * @generated
	 * @ordered
	 */
	protected GhostStrategy new_strategy_Left = NEW_STRATEGY_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_strategy_Right() <em>New strategy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy_Right()
	 * @generated
	 * @ordered
	 */
	protected static final GhostStrategy NEW_STRATEGY_RIGHT_EDEFAULT = GhostStrategy.BLINKY;

	/**
	 * The cached value of the '{@link #getNew_strategy_Right() <em>New strategy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_strategy_Right()
	 * @generated
	 * @ordered
	 */
	protected GhostStrategy new_strategy_Right = NEW_STRATEGY_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyChangeStatus() <em>Strategy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus STRATEGY_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getStrategyChangeStatus() <em>Strategy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus strategyChangeStatus = STRATEGY_CHANGE_STATUS_EDEFAULT;

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
		return PacmanDiffMMPackage.Literals.DIFF_GHOST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostStrategy getNew_strategy_Left() {
		return new_strategy_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_strategy_Left(GhostStrategy newNew_strategy_Left) {
		GhostStrategy oldNew_strategy_Left = new_strategy_Left;
		new_strategy_Left = newNew_strategy_Left == null ? NEW_STRATEGY_LEFT_EDEFAULT : newNew_strategy_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_LEFT, oldNew_strategy_Left, new_strategy_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GhostStrategy getNew_strategy_Right() {
		return new_strategy_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_strategy_Right(GhostStrategy newNew_strategy_Right) {
		GhostStrategy oldNew_strategy_Right = new_strategy_Right;
		new_strategy_Right = newNew_strategy_Right == null ? NEW_STRATEGY_RIGHT_EDEFAULT : newNew_strategy_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_RIGHT, oldNew_strategy_Right, new_strategy_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getStrategyChangeStatus() {
		return strategyChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyChangeStatus(ChangeStatus newStrategyChangeStatus) {
		ChangeStatus oldStrategyChangeStatus = strategyChangeStatus;
		strategyChangeStatus = newStrategyChangeStatus == null ? STRATEGY_CHANGE_STATUS_EDEFAULT : newStrategyChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DIFF_GHOST__STRATEGY_CHANGE_STATUS, oldStrategyChangeStatus, strategyChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanDiffMMPackage.DIFF_GHOST__FILTER:
				return isFilter();
			case PacmanDiffMMPackage.DIFF_GHOST__IS_MERGED:
				return isIsMerged();
			case PacmanDiffMMPackage.DIFF_GHOST__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanDiffMMPackage.DIFF_GHOST__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_LEFT:
				return getNew_strategy_Left();
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_RIGHT:
				return getNew_strategy_Right();
			case PacmanDiffMMPackage.DIFF_GHOST__STRATEGY_CHANGE_STATUS:
				return getStrategyChangeStatus();
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
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_LEFT:
				setNew_strategy_Left((GhostStrategy)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_RIGHT:
				setNew_strategy_Right((GhostStrategy)newValue);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__STRATEGY_CHANGE_STATUS:
				setStrategyChangeStatus((ChangeStatus)newValue);
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
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_LEFT:
				setNew_strategy_Left(NEW_STRATEGY_LEFT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_RIGHT:
				setNew_strategy_Right(NEW_STRATEGY_RIGHT_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DIFF_GHOST__STRATEGY_CHANGE_STATUS:
				setStrategyChangeStatus(STRATEGY_CHANGE_STATUS_EDEFAULT);
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
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanDiffMMPackage.DIFF_GHOST__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_LEFT:
				return new_strategy_Left != NEW_STRATEGY_LEFT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__NEW_STRATEGY_RIGHT:
				return new_strategy_Right != NEW_STRATEGY_RIGHT_EDEFAULT;
			case PacmanDiffMMPackage.DIFF_GHOST__STRATEGY_CHANGE_STATUS:
				return strategyChangeStatus != STRATEGY_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_strategy_Left: ");
		result.append(new_strategy_Left);
		result.append(", new_strategy_Right: ");
		result.append(new_strategy_Right);
		result.append(", strategyChangeStatus: ");
		result.append(strategyChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffGhostImpl
