/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.DiffKind;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffGame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_lives_Left <em>New lives Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_lives_Right <em>New lives Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getLivesChangeStatus <em>Lives Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_score_Left <em>New score Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getNew_score_Right <em>New score Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_DiffGameImpl#getScoreChangeStatus <em>Score Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffGameImpl extends Pattern_GameImpl implements Pattern_DiffGame {
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
	 * The default value of the '{@link #getNew_lives_Left() <em>New lives Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LIVES_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lives_Left() <em>New lives Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_lives_Left = NEW_LIVES_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_lives_Right() <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LIVES_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lives_Right() <em>New lives Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lives_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_lives_Right = NEW_LIVES_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLivesChangeStatus() <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus LIVES_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getLivesChangeStatus() <em>Lives Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus livesChangeStatus = LIVES_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_score_Left() <em>New score Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SCORE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_score_Left() <em>New score Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_score_Left = NEW_SCORE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_score_Right() <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SCORE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_score_Right() <em>New score Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_score_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_score_Right = NEW_SCORE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScoreChangeStatus() <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus SCORE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getScoreChangeStatus() <em>Score Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus scoreChangeStatus = SCORE_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_DIFF_GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__CHANGE_STATUS, oldChangeStatus, changeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_lives_Left() {
		return new_lives_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_lives_Left(int newNew_lives_Left) {
		int oldNew_lives_Left = new_lives_Left;
		new_lives_Left = newNew_lives_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_LEFT, oldNew_lives_Left, new_lives_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_lives_Right() {
		return new_lives_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_lives_Right(int newNew_lives_Right) {
		int oldNew_lives_Right = new_lives_Right;
		new_lives_Right = newNew_lives_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_RIGHT, oldNew_lives_Right, new_lives_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getLivesChangeStatus() {
		return livesChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivesChangeStatus(ChangeStatus newLivesChangeStatus) {
		ChangeStatus oldLivesChangeStatus = livesChangeStatus;
		livesChangeStatus = newLivesChangeStatus == null ? LIVES_CHANGE_STATUS_EDEFAULT : newLivesChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS, oldLivesChangeStatus, livesChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_score_Left() {
		return new_score_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_score_Left(int newNew_score_Left) {
		int oldNew_score_Left = new_score_Left;
		new_score_Left = newNew_score_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_LEFT, oldNew_score_Left, new_score_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_score_Right() {
		return new_score_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_score_Right(int newNew_score_Right) {
		int oldNew_score_Right = new_score_Right;
		new_score_Right = newNew_score_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_RIGHT, oldNew_score_Right, new_score_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getScoreChangeStatus() {
		return scoreChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoreChangeStatus(ChangeStatus newScoreChangeStatus) {
		ChangeStatus oldScoreChangeStatus = scoreChangeStatus;
		scoreChangeStatus = newScoreChangeStatus == null ? SCORE_CHANGE_STATUS_EDEFAULT : newScoreChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS, oldScoreChangeStatus, scoreChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__FILTER:
				return isFilter();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__IS_MERGED:
				return isIsMerged();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__CHANGE_STATUS:
				return getChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_LEFT:
				return getNew_id_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_LEFT:
				return getNew_lives_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_RIGHT:
				return getNew_lives_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS:
				return getLivesChangeStatus();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_LEFT:
				return getNew_score_Left();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_RIGHT:
				return getNew_score_Right();
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS:
				return getScoreChangeStatus();
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_LEFT:
				setNew_id_Left((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_RIGHT:
				setNew_id_Right((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_LEFT:
				setNew_lives_Left((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_RIGHT:
				setNew_lives_Right((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS:
				setLivesChangeStatus((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_LEFT:
				setNew_score_Left((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_RIGHT:
				setNew_score_Right((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS:
				setScoreChangeStatus((ChangeStatus)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_LEFT:
				setNew_lives_Left(NEW_LIVES_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_RIGHT:
				setNew_lives_Right(NEW_LIVES_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS:
				setLivesChangeStatus(LIVES_CHANGE_STATUS_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_LEFT:
				setNew_score_Left(NEW_SCORE_LEFT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_RIGHT:
				setNew_score_Right(NEW_SCORE_RIGHT_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS:
				setScoreChangeStatus(SCORE_CHANGE_STATUS_EDEFAULT);
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
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__FILTER:
				return filter != FILTER_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_LEFT:
				return NEW_ID_LEFT_EDEFAULT == null ? new_id_Left != null : !NEW_ID_LEFT_EDEFAULT.equals(new_id_Left);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_ID_RIGHT:
				return NEW_ID_RIGHT_EDEFAULT == null ? new_id_Right != null : !NEW_ID_RIGHT_EDEFAULT.equals(new_id_Right);
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_LEFT:
				return new_lives_Left != NEW_LIVES_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_LIVES_RIGHT:
				return new_lives_Right != NEW_LIVES_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__LIVES_CHANGE_STATUS:
				return livesChangeStatus != LIVES_CHANGE_STATUS_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_LEFT:
				return new_score_Left != NEW_SCORE_LEFT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__NEW_SCORE_RIGHT:
				return new_score_Right != NEW_SCORE_RIGHT_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_DIFF_GAME__SCORE_CHANGE_STATUS:
				return scoreChangeStatus != SCORE_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_lives_Left: ");
		result.append(new_lives_Left);
		result.append(", new_lives_Right: ");
		result.append(new_lives_Right);
		result.append(", livesChangeStatus: ");
		result.append(livesChangeStatus);
		result.append(", new_score_Left: ");
		result.append(new_score_Left);
		result.append(", new_score_Right: ");
		result.append(new_score_Right);
		result.append(", scoreChangeStatus: ");
		result.append(scoreChangeStatus);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffGameImpl
