/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.DiffKind;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffEnergizer;
import pacmanCRRuleMM.Pattern__ListEInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Energizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_value_Left <em>New value Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_value_Right <em>New value Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getValueChangeStatus <em>Value Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getDurationsChangeStatus <em>Durations Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_durations_Left <em>New durations Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffEnergizerImpl#getNew_durations_Right <em>New durations Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffEnergizerImpl extends Pattern_PositionableEntityImpl implements Pattern_DiffEnergizer {
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
	 * The default value of the '{@link #getDurationsChangeStatus() <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DURATIONS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDurationsChangeStatus() <em>Durations Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus durationsChangeStatus = DURATIONS_CHANGE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNew_durations_Left() <em>New durations Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_durations_Left()
	 * @generated
	 * @ordered
	 */
	protected Pattern__ListEInt new_durations_Left;

	/**
	 * The cached value of the '{@link #getNew_durations_Right() <em>New durations Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_durations_Right()
	 * @generated
	 * @ordered
	 */
	protected Pattern__ListEInt new_durations_Right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffEnergizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_DIFF_ENERGIZER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT, oldNew_value_Left, new_value_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT, oldNew_value_Right, new_value_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS, oldValueChangeStatus, valueChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDurationsChangeStatus() {
		return durationsChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationsChangeStatus(ChangeStatus newDurationsChangeStatus) {
		ChangeStatus oldDurationsChangeStatus = durationsChangeStatus;
		durationsChangeStatus = newDurationsChangeStatus == null ? DURATIONS_CHANGE_STATUS_EDEFAULT : newDurationsChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS, oldDurationsChangeStatus, durationsChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern__ListEInt getNew_durations_Left() {
		return new_durations_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_durations_Left(Pattern__ListEInt newNew_durations_Left, NotificationChain msgs) {
		Pattern__ListEInt oldNew_durations_Left = new_durations_Left;
		new_durations_Left = newNew_durations_Left;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT, oldNew_durations_Left, newNew_durations_Left);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_durations_Left(Pattern__ListEInt newNew_durations_Left) {
		if (newNew_durations_Left != new_durations_Left) {
			NotificationChain msgs = null;
			if (new_durations_Left != null)
				msgs = ((InternalEObject)new_durations_Left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT, null, msgs);
			if (newNew_durations_Left != null)
				msgs = ((InternalEObject)newNew_durations_Left).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT, null, msgs);
			msgs = basicSetNew_durations_Left(newNew_durations_Left, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT, newNew_durations_Left, newNew_durations_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern__ListEInt getNew_durations_Right() {
		return new_durations_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNew_durations_Right(Pattern__ListEInt newNew_durations_Right, NotificationChain msgs) {
		Pattern__ListEInt oldNew_durations_Right = new_durations_Right;
		new_durations_Right = newNew_durations_Right;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, oldNew_durations_Right, newNew_durations_Right);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_durations_Right(Pattern__ListEInt newNew_durations_Right) {
		if (newNew_durations_Right != new_durations_Right) {
			NotificationChain msgs = null;
			if (new_durations_Right != null)
				msgs = ((InternalEObject)new_durations_Right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, null, msgs);
			if (newNew_durations_Right != null)
				msgs = ((InternalEObject)newNew_durations_Right).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, null, msgs);
			msgs = basicSetNew_durations_Right(newNew_durations_Right, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT, newNew_durations_Right, newNew_durations_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return basicSetNew_durations_Left(null, msgs);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return basicSetNew_durations_Right(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__FILTER:
				return isFilter();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__IS_MERGED:
				return isIsMerged();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT:
				return getNew_value_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				return getNew_value_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				return getValueChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				return getDurationsChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return getNew_durations_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return getNew_durations_Right();
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT:
				setNew_value_Left((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				setNew_value_Right((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				setValueChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				setDurationsChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				setNew_durations_Left((Pattern__ListEInt)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				setNew_durations_Right((Pattern__ListEInt)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT:
				setNew_value_Left(NEW_VALUE_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				setNew_value_Right(NEW_VALUE_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				setValueChangeStatus(VALUE_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				setDurationsChangeStatus(DURATIONS_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				setNew_durations_Left((Pattern__ListEInt)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				setNew_durations_Right((Pattern__ListEInt)null);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_LEFT:
				return new_value_Left != NEW_VALUE_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_VALUE_RIGHT:
				return new_value_Right != NEW_VALUE_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__VALUE_CHANGE_STATUS:
				return valueChangeStatus != VALUE_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__DURATIONS_CHANGE_STATUS:
				return durationsChangeStatus != DURATIONS_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_LEFT:
				return new_durations_Left != null;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_ENERGIZER__NEW_DURATIONS_RIGHT:
				return new_durations_Right != null;
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
		result.append(", durationsChangeStatus: ");
		result.append(durationsChangeStatus);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffEnergizerImpl
