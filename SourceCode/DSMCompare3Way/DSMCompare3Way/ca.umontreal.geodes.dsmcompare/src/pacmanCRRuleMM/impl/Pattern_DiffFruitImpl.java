/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.DiffKind;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffFruit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Fruit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_location_Left <em>New location Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getNew_location_Right <em>New location Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffFruitImpl#getLocationChangeStatus <em>Location Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffFruitImpl extends Pattern_PositionableEntityImpl implements Pattern_DiffFruit {
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
	 * The default value of the '{@link #getNew_location_Left() <em>New location Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_location_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_LOCATION_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_location_Left() <em>New location Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_location_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_location_Left = NEW_LOCATION_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_location_Right() <em>New location Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_location_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_LOCATION_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_location_Right() <em>New location Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_location_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_location_Right = NEW_LOCATION_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationChangeStatus() <em>Location Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus LOCATION_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getLocationChangeStatus() <em>Location Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus locationChangeStatus = LOCATION_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffFruitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_DIFF_FRUIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT, oldNew_value_Left, new_value_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT, oldNew_value_Right, new_value_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS, oldValueChangeStatus, valueChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_location_Left() {
		return new_location_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_location_Left(String newNew_location_Left) {
		String oldNew_location_Left = new_location_Left;
		new_location_Left = newNew_location_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT, oldNew_location_Left, new_location_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_location_Right() {
		return new_location_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_location_Right(String newNew_location_Right) {
		String oldNew_location_Right = new_location_Right;
		new_location_Right = newNew_location_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT, oldNew_location_Right, new_location_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getLocationChangeStatus() {
		return locationChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationChangeStatus(ChangeStatus newLocationChangeStatus) {
		ChangeStatus oldLocationChangeStatus = locationChangeStatus;
		locationChangeStatus = newLocationChangeStatus == null ? LOCATION_CHANGE_STATUS_EDEFAULT : newLocationChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS, oldLocationChangeStatus, locationChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__FILTER:
				return isFilter();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__IS_MERGED:
				return isIsMerged();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT:
				return getNew_value_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT:
				return getNew_value_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS:
				return getValueChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT:
				return getNew_location_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT:
				return getNew_location_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS:
				return getLocationChangeStatus();
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT:
				setNew_value_Left((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT:
				setNew_value_Right((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS:
				setValueChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT:
				setNew_location_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT:
				setNew_location_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS:
				setLocationChangeStatus((ChangeStatus)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT:
				setNew_value_Left(NEW_VALUE_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT:
				setNew_value_Right(NEW_VALUE_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS:
				setValueChangeStatus(VALUE_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT:
				setNew_location_Left(NEW_LOCATION_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT:
				setNew_location_Right(NEW_LOCATION_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS:
				setLocationChangeStatus(LOCATION_CHANGE_STATUS_EDEFAULT);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_LEFT:
				return new_value_Left != NEW_VALUE_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_VALUE_RIGHT:
				return new_value_Right != NEW_VALUE_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__VALUE_CHANGE_STATUS:
				return valueChangeStatus != VALUE_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_LEFT:
				return NEW_LOCATION_LEFT_EDEFAULT == null ? new_location_Left != null : !NEW_LOCATION_LEFT_EDEFAULT.equals(new_location_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__NEW_LOCATION_RIGHT:
				return NEW_LOCATION_RIGHT_EDEFAULT == null ? new_location_Right != null : !NEW_LOCATION_RIGHT_EDEFAULT.equals(new_location_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_FRUIT__LOCATION_CHANGE_STATUS:
				return locationChangeStatus != LOCATION_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_location_Left: ");
		result.append(new_location_Left);
		result.append(", new_location_Right: ");
		result.append(new_location_Right);
		result.append(", locationChangeStatus: ");
		result.append(locationChangeStatus);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffFruitImpl
