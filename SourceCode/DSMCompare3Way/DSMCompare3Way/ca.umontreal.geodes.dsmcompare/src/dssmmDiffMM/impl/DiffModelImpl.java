/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.DiffModel;
import dssmmDiffMM.DssmmDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_ModelID_Left <em>New Model ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_ModelID_Right <em>New Model ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getModelIDChangeStatus <em>Model ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Goal_Left <em>New Goal Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Goal_Right <em>New Goal Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getGoalChangeStatus <em>Goal Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_NumFacts_Left <em>New Num Facts Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNew_NumFacts_Right <em>New Num Facts Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffModelImpl#getNumFactsChangeStatus <em>Num Facts Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffModelImpl extends ModelImpl implements DiffModel {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_LEFT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_RIGHT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_ModelID_Left() <em>New Model ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MODEL_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_ModelID_Left() <em>New Model ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_ModelID_Left = NEW_MODEL_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_ModelID_Right() <em>New Model ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MODEL_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_ModelID_Right() <em>New Model ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_ModelID_Right = NEW_MODEL_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelIDChangeStatus() <em>Model ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus MODEL_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getModelIDChangeStatus() <em>Model ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus modelIDChangeStatus = MODEL_ID_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Left = NEW_NAME_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Right = NEW_NAME_RIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getNew_Goal_Left() <em>New Goal Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_GOAL_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Goal_Left() <em>New Goal Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Goal_Left = NEW_GOAL_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Goal_Right() <em>New Goal Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_GOAL_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Goal_Right() <em>New Goal Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Goal_Right = NEW_GOAL_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalChangeStatus() <em>Goal Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus GOAL_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getGoalChangeStatus() <em>Goal Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus goalChangeStatus = GOAL_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Left = NEW_DESCR_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Right = NEW_DESCR_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DESCR_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus descrChangeStatus = DESCR_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumFacts_Left() <em>New Num Facts Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NUM_FACTS_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_NumFacts_Left() <em>New Num Facts Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_NumFacts_Left = NEW_NUM_FACTS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumFacts_Right() <em>New Num Facts Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NUM_FACTS_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_NumFacts_Right() <em>New Num Facts Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_NumFacts_Right = NEW_NUM_FACTS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumFactsChangeStatus() <em>Num Facts Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFactsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus NUM_FACTS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getNumFactsChangeStatus() <em>Num Facts Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFactsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus numFactsChangeStatus = NUM_FACTS_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmDiffMMPackage.Literals.DIFF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(ClassDiffKind newDiff_kind_Left) {
		ClassDiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(ClassDiffKind newDiff_kind_Right) {
		ClassDiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_ModelID_Left() {
		return new_ModelID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_ModelID_Left(int newNew_ModelID_Left) {
		int oldNew_ModelID_Left = new_ModelID_Left;
		new_ModelID_Left = newNew_ModelID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_LEFT, oldNew_ModelID_Left, new_ModelID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_ModelID_Right() {
		return new_ModelID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_ModelID_Right(int newNew_ModelID_Right) {
		int oldNew_ModelID_Right = new_ModelID_Right;
		new_ModelID_Right = newNew_ModelID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_RIGHT, oldNew_ModelID_Right, new_ModelID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getModelIDChangeStatus() {
		return modelIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIDChangeStatus(ChangeStatus newModelIDChangeStatus) {
		ChangeStatus oldModelIDChangeStatus = modelIDChangeStatus;
		modelIDChangeStatus = newModelIDChangeStatus == null ? MODEL_ID_CHANGE_STATUS_EDEFAULT : newModelIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__MODEL_ID_CHANGE_STATUS, oldModelIDChangeStatus, modelIDChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Left() {
		return new_Name_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Left(String newNew_Name_Left) {
		String oldNew_Name_Left = new_Name_Left;
		new_Name_Left = newNew_Name_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_LEFT, oldNew_Name_Left, new_Name_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Right() {
		return new_Name_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Right(String newNew_Name_Right) {
		String oldNew_Name_Right = new_Name_Right;
		new_Name_Right = newNew_Name_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_RIGHT, oldNew_Name_Right, new_Name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Goal_Left() {
		return new_Goal_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Goal_Left(String newNew_Goal_Left) {
		String oldNew_Goal_Left = new_Goal_Left;
		new_Goal_Left = newNew_Goal_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_LEFT, oldNew_Goal_Left, new_Goal_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Goal_Right() {
		return new_Goal_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Goal_Right(String newNew_Goal_Right) {
		String oldNew_Goal_Right = new_Goal_Right;
		new_Goal_Right = newNew_Goal_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_RIGHT, oldNew_Goal_Right, new_Goal_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getGoalChangeStatus() {
		return goalChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalChangeStatus(ChangeStatus newGoalChangeStatus) {
		ChangeStatus oldGoalChangeStatus = goalChangeStatus;
		goalChangeStatus = newGoalChangeStatus == null ? GOAL_CHANGE_STATUS_EDEFAULT : newGoalChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__GOAL_CHANGE_STATUS, oldGoalChangeStatus, goalChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Left() {
		return new_Descr_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Left(String newNew_Descr_Left) {
		String oldNew_Descr_Left = new_Descr_Left;
		new_Descr_Left = newNew_Descr_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_LEFT, oldNew_Descr_Left, new_Descr_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Right() {
		return new_Descr_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Right(String newNew_Descr_Right) {
		String oldNew_Descr_Right = new_Descr_Right;
		new_Descr_Right = newNew_Descr_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_RIGHT, oldNew_Descr_Right, new_Descr_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDescrChangeStatus() {
		return descrChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescrChangeStatus(ChangeStatus newDescrChangeStatus) {
		ChangeStatus oldDescrChangeStatus = descrChangeStatus;
		descrChangeStatus = newDescrChangeStatus == null ? DESCR_CHANGE_STATUS_EDEFAULT : newDescrChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__DESCR_CHANGE_STATUS, oldDescrChangeStatus, descrChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_NumFacts_Left() {
		return new_NumFacts_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumFacts_Left(String newNew_NumFacts_Left) {
		String oldNew_NumFacts_Left = new_NumFacts_Left;
		new_NumFacts_Left = newNew_NumFacts_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_LEFT, oldNew_NumFacts_Left, new_NumFacts_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_NumFacts_Right() {
		return new_NumFacts_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumFacts_Right(String newNew_NumFacts_Right) {
		String oldNew_NumFacts_Right = new_NumFacts_Right;
		new_NumFacts_Right = newNew_NumFacts_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_RIGHT, oldNew_NumFacts_Right, new_NumFacts_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getNumFactsChangeStatus() {
		return numFactsChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFactsChangeStatus(ChangeStatus newNumFactsChangeStatus) {
		ChangeStatus oldNumFactsChangeStatus = numFactsChangeStatus;
		numFactsChangeStatus = newNumFactsChangeStatus == null ? NUM_FACTS_CHANGE_STATUS_EDEFAULT : newNumFactsChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_MODEL__NUM_FACTS_CHANGE_STATUS, oldNumFactsChangeStatus, numFactsChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_LEFT:
				return getNew_ModelID_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_RIGHT:
				return getNew_ModelID_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__MODEL_ID_CHANGE_STATUS:
				return getModelIDChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_LEFT:
				return getNew_Name_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_RIGHT:
				return getNew_Name_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_LEFT:
				return getNew_Goal_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_RIGHT:
				return getNew_Goal_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__GOAL_CHANGE_STATUS:
				return getGoalChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_LEFT:
				return getNew_Descr_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_RIGHT:
				return getNew_Descr_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__DESCR_CHANGE_STATUS:
				return getDescrChangeStatus();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_LEFT:
				return getNew_NumFacts_Left();
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_RIGHT:
				return getNew_NumFacts_Right();
			case DssmmDiffMMPackage.DIFF_MODEL__NUM_FACTS_CHANGE_STATUS:
				return getNumFactsChangeStatus();
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
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_LEFT:
				setNew_ModelID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_RIGHT:
				setNew_ModelID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__MODEL_ID_CHANGE_STATUS:
				setModelIDChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_LEFT:
				setNew_Name_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_RIGHT:
				setNew_Name_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_LEFT:
				setNew_Goal_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_RIGHT:
				setNew_Goal_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__GOAL_CHANGE_STATUS:
				setGoalChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_LEFT:
				setNew_Descr_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_RIGHT:
				setNew_Descr_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__DESCR_CHANGE_STATUS:
				setDescrChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_LEFT:
				setNew_NumFacts_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_RIGHT:
				setNew_NumFacts_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NUM_FACTS_CHANGE_STATUS:
				setNumFactsChangeStatus((ChangeStatus)newValue);
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
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_LEFT:
				setNew_ModelID_Left(NEW_MODEL_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_RIGHT:
				setNew_ModelID_Right(NEW_MODEL_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__MODEL_ID_CHANGE_STATUS:
				setModelIDChangeStatus(MODEL_ID_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_LEFT:
				setNew_Name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_RIGHT:
				setNew_Name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_LEFT:
				setNew_Goal_Left(NEW_GOAL_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_RIGHT:
				setNew_Goal_Right(NEW_GOAL_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__GOAL_CHANGE_STATUS:
				setGoalChangeStatus(GOAL_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_LEFT:
				setNew_Descr_Left(NEW_DESCR_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_RIGHT:
				setNew_Descr_Right(NEW_DESCR_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__DESCR_CHANGE_STATUS:
				setDescrChangeStatus(DESCR_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_LEFT:
				setNew_NumFacts_Left(NEW_NUM_FACTS_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_RIGHT:
				setNew_NumFacts_Right(NEW_NUM_FACTS_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_MODEL__NUM_FACTS_CHANGE_STATUS:
				setNumFactsChangeStatus(NUM_FACTS_CHANGE_STATUS_EDEFAULT);
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
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_LEFT:
				return new_ModelID_Left != NEW_MODEL_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID_RIGHT:
				return new_ModelID_Right != NEW_MODEL_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__MODEL_ID_CHANGE_STATUS:
				return modelIDChangeStatus != MODEL_ID_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_Name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_Name_Left);
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_Name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_Name_Right);
			case DssmmDiffMMPackage.DIFF_MODEL__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_LEFT:
				return NEW_GOAL_LEFT_EDEFAULT == null ? new_Goal_Left != null : !NEW_GOAL_LEFT_EDEFAULT.equals(new_Goal_Left);
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_GOAL_RIGHT:
				return NEW_GOAL_RIGHT_EDEFAULT == null ? new_Goal_Right != null : !NEW_GOAL_RIGHT_EDEFAULT.equals(new_Goal_Right);
			case DssmmDiffMMPackage.DIFF_MODEL__GOAL_CHANGE_STATUS:
				return goalChangeStatus != GOAL_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_LEFT:
				return NEW_DESCR_LEFT_EDEFAULT == null ? new_Descr_Left != null : !NEW_DESCR_LEFT_EDEFAULT.equals(new_Descr_Left);
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_DESCR_RIGHT:
				return NEW_DESCR_RIGHT_EDEFAULT == null ? new_Descr_Right != null : !NEW_DESCR_RIGHT_EDEFAULT.equals(new_Descr_Right);
			case DssmmDiffMMPackage.DIFF_MODEL__DESCR_CHANGE_STATUS:
				return descrChangeStatus != DESCR_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_LEFT:
				return NEW_NUM_FACTS_LEFT_EDEFAULT == null ? new_NumFacts_Left != null : !NEW_NUM_FACTS_LEFT_EDEFAULT.equals(new_NumFacts_Left);
			case DssmmDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS_RIGHT:
				return NEW_NUM_FACTS_RIGHT_EDEFAULT == null ? new_NumFacts_Right != null : !NEW_NUM_FACTS_RIGHT_EDEFAULT.equals(new_NumFacts_Right);
			case DssmmDiffMMPackage.DIFF_MODEL__NUM_FACTS_CHANGE_STATUS:
				return numFactsChangeStatus != NUM_FACTS_CHANGE_STATUS_EDEFAULT;
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
		result.append(", changeStatus: ");
		result.append(changeStatus);
		result.append(", new_ModelID_Left: ");
		result.append(new_ModelID_Left);
		result.append(", new_ModelID_Right: ");
		result.append(new_ModelID_Right);
		result.append(", ModelIDChangeStatus: ");
		result.append(modelIDChangeStatus);
		result.append(", new_Name_Left: ");
		result.append(new_Name_Left);
		result.append(", new_Name_Right: ");
		result.append(new_Name_Right);
		result.append(", NameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_Goal_Left: ");
		result.append(new_Goal_Left);
		result.append(", new_Goal_Right: ");
		result.append(new_Goal_Right);
		result.append(", GoalChangeStatus: ");
		result.append(goalChangeStatus);
		result.append(", new_Descr_Left: ");
		result.append(new_Descr_Left);
		result.append(", new_Descr_Right: ");
		result.append(new_Descr_Right);
		result.append(", DescrChangeStatus: ");
		result.append(descrChangeStatus);
		result.append(", new_NumFacts_Left: ");
		result.append(new_NumFacts_Left);
		result.append(", new_NumFacts_Right: ");
		result.append(new_NumFacts_Right);
		result.append(", NumFactsChangeStatus: ");
		result.append(numFactsChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffModelImpl
