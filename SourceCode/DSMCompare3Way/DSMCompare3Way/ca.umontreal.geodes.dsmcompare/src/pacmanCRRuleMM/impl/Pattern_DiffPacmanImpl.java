/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.DiffKind;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffPacman;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Pacman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getNew_initialPosition_Left <em>New initial Position Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getNew_initialPosition_Right <em>New initial Position Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffPacmanImpl#getInitialPositionChangeStatus <em>Initial Position Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffPacmanImpl extends Pattern_PositionableEntityImpl implements Pattern_DiffPacman {
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
	 * The default value of the '{@link #getNew_initialPosition_Left() <em>New initial Position Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INITIAL_POSITION_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_initialPosition_Left() <em>New initial Position Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_initialPosition_Left = NEW_INITIAL_POSITION_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_initialPosition_Right() <em>New initial Position Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INITIAL_POSITION_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_initialPosition_Right() <em>New initial Position Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_initialPosition_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_initialPosition_Right = NEW_INITIAL_POSITION_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialPositionChangeStatus() <em>Initial Position Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPositionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus INITIAL_POSITION_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getInitialPositionChangeStatus() <em>Initial Position Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPositionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus initialPositionChangeStatus = INITIAL_POSITION_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffPacmanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_DIFF_PACMAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_initialPosition_Left() {
		return new_initialPosition_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_initialPosition_Left(String newNew_initialPosition_Left) {
		String oldNew_initialPosition_Left = new_initialPosition_Left;
		new_initialPosition_Left = newNew_initialPosition_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT, oldNew_initialPosition_Left, new_initialPosition_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_initialPosition_Right() {
		return new_initialPosition_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_initialPosition_Right(String newNew_initialPosition_Right) {
		String oldNew_initialPosition_Right = new_initialPosition_Right;
		new_initialPosition_Right = newNew_initialPosition_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT, oldNew_initialPosition_Right, new_initialPosition_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getInitialPositionChangeStatus() {
		return initialPositionChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPositionChangeStatus(ChangeStatus newInitialPositionChangeStatus) {
		ChangeStatus oldInitialPositionChangeStatus = initialPositionChangeStatus;
		initialPositionChangeStatus = newInitialPositionChangeStatus == null ? INITIAL_POSITION_CHANGE_STATUS_EDEFAULT : newInitialPositionChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS, oldInitialPositionChangeStatus, initialPositionChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__FILTER:
				return isFilter();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__IS_MERGED:
				return isIsMerged();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				return getNew_initialPosition_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				return getNew_initialPosition_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				return getInitialPositionChangeStatus();
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				setNew_initialPosition_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				setNew_initialPosition_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				setInitialPositionChangeStatus((ChangeStatus)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				setNew_initialPosition_Left(NEW_INITIAL_POSITION_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				setNew_initialPosition_Right(NEW_INITIAL_POSITION_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				setInitialPositionChangeStatus(INITIAL_POSITION_CHANGE_STATUS_EDEFAULT);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_LEFT:
				return NEW_INITIAL_POSITION_LEFT_EDEFAULT == null ? new_initialPosition_Left != null : !NEW_INITIAL_POSITION_LEFT_EDEFAULT.equals(new_initialPosition_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__NEW_INITIAL_POSITION_RIGHT:
				return NEW_INITIAL_POSITION_RIGHT_EDEFAULT == null ? new_initialPosition_Right != null : !NEW_INITIAL_POSITION_RIGHT_EDEFAULT.equals(new_initialPosition_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_PACMAN__INITIAL_POSITION_CHANGE_STATUS:
				return initialPositionChangeStatus != INITIAL_POSITION_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_initialPosition_Left: ");
		result.append(new_initialPosition_Left);
		result.append(", new_initialPosition_Right: ");
		result.append(new_initialPosition_Right);
		result.append(", initialPositionChangeStatus: ");
		result.append(initialPositionChangeStatus);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffPacmanImpl
