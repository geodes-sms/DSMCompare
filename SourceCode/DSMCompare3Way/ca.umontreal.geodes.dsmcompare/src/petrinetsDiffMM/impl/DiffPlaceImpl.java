/**
 */
package petrinetsDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinetsDiffMM.ChangeStatus;
import petrinetsDiffMM.DiffKind;
import petrinetsDiffMM.DiffPlace;
import petrinetsDiffMM.PetrinetsDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_id_Left <em>New id Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_id_Right <em>New id Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getIdChangeStatus <em>Id Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_name_Left <em>New name Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_name_Right <em>New name Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_tokens_Left <em>New tokens Left</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getNew_tokens_Right <em>New tokens Right</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.DiffPlaceImpl#getTokensChangeStatus <em>Tokens Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffPlaceImpl extends PlaceImpl implements DiffPlace {
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
	protected static final int NEW_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_id_Left() <em>New id Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_id_Left = NEW_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_id_Right() <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_id_Right() <em>New id Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_id_Right = NEW_ID_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_tokens_Left() <em>New tokens Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_TOKENS_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_tokens_Left() <em>New tokens Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_tokens_Left = NEW_TOKENS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_tokens_Right() <em>New tokens Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_TOKENS_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_tokens_Right() <em>New tokens Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tokens_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_tokens_Right = NEW_TOKENS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokensChangeStatus() <em>Tokens Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus TOKENS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getTokensChangeStatus() <em>Tokens Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus tokensChangeStatus = TOKENS_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsDiffMMPackage.Literals.DIFF_PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__IS_MERGED, oldIsMerged, isMerged));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_id_Left() {
		return new_id_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id_Left(int newNew_id_Left) {
		int oldNew_id_Left = new_id_Left;
		new_id_Left = newNew_id_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_LEFT, oldNew_id_Left, new_id_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_id_Right() {
		return new_id_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id_Right(int newNew_id_Right) {
		int oldNew_id_Right = new_id_Right;
		new_id_Right = newNew_id_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_RIGHT, oldNew_id_Right, new_id_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__ID_CHANGE_STATUS, oldIdChangeStatus, idChangeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_LEFT, oldNew_name_Left, new_name_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_RIGHT, oldNew_name_Right, new_name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_tokens_Left() {
		return new_tokens_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_tokens_Left(int newNew_tokens_Left) {
		int oldNew_tokens_Left = new_tokens_Left;
		new_tokens_Left = newNew_tokens_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_LEFT, oldNew_tokens_Left, new_tokens_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_tokens_Right() {
		return new_tokens_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_tokens_Right(int newNew_tokens_Right) {
		int oldNew_tokens_Right = new_tokens_Right;
		new_tokens_Right = newNew_tokens_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_RIGHT, oldNew_tokens_Right, new_tokens_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getTokensChangeStatus() {
		return tokensChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokensChangeStatus(ChangeStatus newTokensChangeStatus) {
		ChangeStatus oldTokensChangeStatus = tokensChangeStatus;
		tokensChangeStatus = newTokensChangeStatus == null ? TOKENS_CHANGE_STATUS_EDEFAULT : newTokensChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.DIFF_PLACE__TOKENS_CHANGE_STATUS, oldTokensChangeStatus, tokensChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case PetrinetsDiffMMPackage.DIFF_PLACE__FILTER:
				return isFilter();
			case PetrinetsDiffMMPackage.DIFF_PLACE__IS_MERGED:
				return isIsMerged();
			case PetrinetsDiffMMPackage.DIFF_PLACE__CHANGE_STATUS:
				return getChangeStatus();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_LEFT:
				return getNew_id_Left();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_RIGHT:
				return getNew_id_Right();
			case PetrinetsDiffMMPackage.DIFF_PLACE__ID_CHANGE_STATUS:
				return getIdChangeStatus();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_LEFT:
				return getNew_name_Left();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_RIGHT:
				return getNew_name_Right();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_LEFT:
				return getNew_tokens_Left();
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_RIGHT:
				return getNew_tokens_Right();
			case PetrinetsDiffMMPackage.DIFF_PLACE__TOKENS_CHANGE_STATUS:
				return getTokensChangeStatus();
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
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_LEFT:
				setDiff_kind_Left((DiffKind)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_RIGHT:
				setDiff_kind_Right((DiffKind)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__FILTER:
				setFilter((Boolean)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__IS_MERGED:
				setIsMerged((Boolean)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_LEFT:
				setNew_id_Left((Integer)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_RIGHT:
				setNew_id_Right((Integer)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__ID_CHANGE_STATUS:
				setIdChangeStatus((ChangeStatus)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_LEFT:
				setNew_name_Left((String)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_RIGHT:
				setNew_name_Right((String)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_LEFT:
				setNew_tokens_Left((Integer)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_RIGHT:
				setNew_tokens_Right((Integer)newValue);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__TOKENS_CHANGE_STATUS:
				setTokensChangeStatus((ChangeStatus)newValue);
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
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__IS_MERGED:
				setIsMerged(IS_MERGED_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_LEFT:
				setNew_id_Left(NEW_ID_LEFT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_RIGHT:
				setNew_id_Right(NEW_ID_RIGHT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__ID_CHANGE_STATUS:
				setIdChangeStatus(ID_CHANGE_STATUS_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_LEFT:
				setNew_name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_RIGHT:
				setNew_name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_LEFT:
				setNew_tokens_Left(NEW_TOKENS_LEFT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_RIGHT:
				setNew_tokens_Right(NEW_TOKENS_RIGHT_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.DIFF_PLACE__TOKENS_CHANGE_STATUS:
				setTokensChangeStatus(TOKENS_CHANGE_STATUS_EDEFAULT);
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
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__FILTER:
				return filter != FILTER_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__IS_MERGED:
				return isMerged != IS_MERGED_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_LEFT:
				return new_id_Left != NEW_ID_LEFT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_ID_RIGHT:
				return new_id_Right != NEW_ID_RIGHT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__ID_CHANGE_STATUS:
				return idChangeStatus != ID_CHANGE_STATUS_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_name_Left);
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_name_Right);
			case PetrinetsDiffMMPackage.DIFF_PLACE__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_LEFT:
				return new_tokens_Left != NEW_TOKENS_LEFT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__NEW_TOKENS_RIGHT:
				return new_tokens_Right != NEW_TOKENS_RIGHT_EDEFAULT;
			case PetrinetsDiffMMPackage.DIFF_PLACE__TOKENS_CHANGE_STATUS:
				return tokensChangeStatus != TOKENS_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_name_Left: ");
		result.append(new_name_Left);
		result.append(", new_name_Right: ");
		result.append(new_name_Right);
		result.append(", nameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_tokens_Left: ");
		result.append(new_tokens_Left);
		result.append(", new_tokens_Right: ");
		result.append(new_tokens_Right);
		result.append(", tokensChangeStatus: ");
		result.append(tokensChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffPlaceImpl
