/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.DiffOption;
import dssmmDiffMM.DssmmDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_OptionID_Left <em>New Option ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_OptionID_Right <em>New Option ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getOptionIDChangeStatus <em>Option ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Sort_Left <em>New Sort Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Sort_Right <em>New Sort Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getSortChangeStatus <em>Sort Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Cost_Left <em>New Cost Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Cost_Right <em>New Cost Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getCostChangeStatus <em>Cost Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_NumOtherCosts_Left <em>New Num Other Costs Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_NumOtherCosts_Right <em>New Num Other Costs Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNumOtherCostsChangeStatus <em>Num Other Costs Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Description_Left <em>New Description Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getNew_Description_Right <em>New Description Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffOptionImpl#getDescriptionChangeStatus <em>Description Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffOptionImpl extends OptionImpl implements DiffOption {
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
	 * The default value of the '{@link #getNew_OptionID_Left() <em>New Option ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_OPTION_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_OptionID_Left() <em>New Option ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_OptionID_Left = NEW_OPTION_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_OptionID_Right() <em>New Option ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_OPTION_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_OptionID_Right() <em>New Option ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_OptionID_Right = NEW_OPTION_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionIDChangeStatus() <em>Option ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus OPTION_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getOptionIDChangeStatus() <em>Option ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus optionIDChangeStatus = OPTION_ID_CHANGE_STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getNew_Sort_Left() <em>New Sort Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SORT_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_Sort_Left() <em>New Sort Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_Sort_Left = NEW_SORT_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Sort_Right() <em>New Sort Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SORT_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_Sort_Right() <em>New Sort Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_Sort_Right = NEW_SORT_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortChangeStatus() <em>Sort Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus SORT_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getSortChangeStatus() <em>Sort Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus sortChangeStatus = SORT_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Cost_Left() <em>New Cost Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost_Left()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_COST_LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_Cost_Left() <em>New Cost Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost_Left()
	 * @generated
	 * @ordered
	 */
	protected float new_Cost_Left = NEW_COST_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Cost_Right() <em>New Cost Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost_Right()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_COST_RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_Cost_Right() <em>New Cost Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost_Right()
	 * @generated
	 * @ordered
	 */
	protected float new_Cost_Right = NEW_COST_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostChangeStatus() <em>Cost Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus COST_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getCostChangeStatus() <em>Cost Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus costChangeStatus = COST_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumOtherCosts_Left() <em>New Num Other Costs Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_NUM_OTHER_COSTS_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_NumOtherCosts_Left() <em>New Num Other Costs Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_NumOtherCosts_Left = NEW_NUM_OTHER_COSTS_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumOtherCosts_Right() <em>New Num Other Costs Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_NUM_OTHER_COSTS_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_NumOtherCosts_Right() <em>New Num Other Costs Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_NumOtherCosts_Right = NEW_NUM_OTHER_COSTS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOtherCostsChangeStatus() <em>Num Other Costs Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOtherCostsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus NUM_OTHER_COSTS_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getNumOtherCostsChangeStatus() <em>Num Other Costs Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOtherCostsChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus numOtherCostsChangeStatus = NUM_OTHER_COSTS_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description_Left() <em>New Description Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description_Left() <em>New Description Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Description_Left = NEW_DESCRIPTION_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description_Right() <em>New Description Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description_Right() <em>New Description Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Description_Right = NEW_DESCRIPTION_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionChangeStatus() <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DESCRIPTION_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDescriptionChangeStatus() <em>Description Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus descriptionChangeStatus = DESCRIPTION_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmDiffMMPackage.Literals.DIFF_OPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_OptionID_Left() {
		return new_OptionID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_OptionID_Left(int newNew_OptionID_Left) {
		int oldNew_OptionID_Left = new_OptionID_Left;
		new_OptionID_Left = newNew_OptionID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_LEFT, oldNew_OptionID_Left, new_OptionID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_OptionID_Right() {
		return new_OptionID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_OptionID_Right(int newNew_OptionID_Right) {
		int oldNew_OptionID_Right = new_OptionID_Right;
		new_OptionID_Right = newNew_OptionID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_RIGHT, oldNew_OptionID_Right, new_OptionID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getOptionIDChangeStatus() {
		return optionIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionIDChangeStatus(ChangeStatus newOptionIDChangeStatus) {
		ChangeStatus oldOptionIDChangeStatus = optionIDChangeStatus;
		optionIDChangeStatus = newOptionIDChangeStatus == null ? OPTION_ID_CHANGE_STATUS_EDEFAULT : newOptionIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__OPTION_ID_CHANGE_STATUS, oldOptionIDChangeStatus, optionIDChangeStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_LEFT, oldNew_Name_Left, new_Name_Left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_RIGHT, oldNew_Name_Right, new_Name_Right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_Sort_Left() {
		return new_Sort_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Sort_Left(int newNew_Sort_Left) {
		int oldNew_Sort_Left = new_Sort_Left;
		new_Sort_Left = newNew_Sort_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_LEFT, oldNew_Sort_Left, new_Sort_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_Sort_Right() {
		return new_Sort_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Sort_Right(int newNew_Sort_Right) {
		int oldNew_Sort_Right = new_Sort_Right;
		new_Sort_Right = newNew_Sort_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_RIGHT, oldNew_Sort_Right, new_Sort_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getSortChangeStatus() {
		return sortChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortChangeStatus(ChangeStatus newSortChangeStatus) {
		ChangeStatus oldSortChangeStatus = sortChangeStatus;
		sortChangeStatus = newSortChangeStatus == null ? SORT_CHANGE_STATUS_EDEFAULT : newSortChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__SORT_CHANGE_STATUS, oldSortChangeStatus, sortChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_Cost_Left() {
		return new_Cost_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Cost_Left(float newNew_Cost_Left) {
		float oldNew_Cost_Left = new_Cost_Left;
		new_Cost_Left = newNew_Cost_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_LEFT, oldNew_Cost_Left, new_Cost_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_Cost_Right() {
		return new_Cost_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Cost_Right(float newNew_Cost_Right) {
		float oldNew_Cost_Right = new_Cost_Right;
		new_Cost_Right = newNew_Cost_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_RIGHT, oldNew_Cost_Right, new_Cost_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getCostChangeStatus() {
		return costChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostChangeStatus(ChangeStatus newCostChangeStatus) {
		ChangeStatus oldCostChangeStatus = costChangeStatus;
		costChangeStatus = newCostChangeStatus == null ? COST_CHANGE_STATUS_EDEFAULT : newCostChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__COST_CHANGE_STATUS, oldCostChangeStatus, costChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_NumOtherCosts_Left() {
		return new_NumOtherCosts_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumOtherCosts_Left(int newNew_NumOtherCosts_Left) {
		int oldNew_NumOtherCosts_Left = new_NumOtherCosts_Left;
		new_NumOtherCosts_Left = newNew_NumOtherCosts_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT, oldNew_NumOtherCosts_Left, new_NumOtherCosts_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_NumOtherCosts_Right() {
		return new_NumOtherCosts_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumOtherCosts_Right(int newNew_NumOtherCosts_Right) {
		int oldNew_NumOtherCosts_Right = new_NumOtherCosts_Right;
		new_NumOtherCosts_Right = newNew_NumOtherCosts_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT, oldNew_NumOtherCosts_Right, new_NumOtherCosts_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getNumOtherCostsChangeStatus() {
		return numOtherCostsChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOtherCostsChangeStatus(ChangeStatus newNumOtherCostsChangeStatus) {
		ChangeStatus oldNumOtherCostsChangeStatus = numOtherCostsChangeStatus;
		numOtherCostsChangeStatus = newNumOtherCostsChangeStatus == null ? NUM_OTHER_COSTS_CHANGE_STATUS_EDEFAULT : newNumOtherCostsChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS, oldNumOtherCostsChangeStatus, numOtherCostsChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description_Left() {
		return new_Description_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description_Left(String newNew_Description_Left) {
		String oldNew_Description_Left = new_Description_Left;
		new_Description_Left = newNew_Description_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_LEFT, oldNew_Description_Left, new_Description_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description_Right() {
		return new_Description_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description_Right(String newNew_Description_Right) {
		String oldNew_Description_Right = new_Description_Right;
		new_Description_Right = newNew_Description_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_RIGHT, oldNew_Description_Right, new_Description_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDescriptionChangeStatus() {
		return descriptionChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionChangeStatus(ChangeStatus newDescriptionChangeStatus) {
		ChangeStatus oldDescriptionChangeStatus = descriptionChangeStatus;
		descriptionChangeStatus = newDescriptionChangeStatus == null ? DESCRIPTION_CHANGE_STATUS_EDEFAULT : newDescriptionChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_OPTION__DESCRIPTION_CHANGE_STATUS, oldDescriptionChangeStatus, descriptionChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_LEFT:
				return getNew_OptionID_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_RIGHT:
				return getNew_OptionID_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__OPTION_ID_CHANGE_STATUS:
				return getOptionIDChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_LEFT:
				return getNew_Name_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_RIGHT:
				return getNew_Name_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_LEFT:
				return getNew_Sort_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_RIGHT:
				return getNew_Sort_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__SORT_CHANGE_STATUS:
				return getSortChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_LEFT:
				return getNew_Cost_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_RIGHT:
				return getNew_Cost_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__COST_CHANGE_STATUS:
				return getCostChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT:
				return getNew_NumOtherCosts_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT:
				return getNew_NumOtherCosts_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS:
				return getNumOtherCostsChangeStatus();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_LEFT:
				return getNew_Description_Left();
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_RIGHT:
				return getNew_Description_Right();
			case DssmmDiffMMPackage.DIFF_OPTION__DESCRIPTION_CHANGE_STATUS:
				return getDescriptionChangeStatus();
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
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_LEFT:
				setNew_OptionID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_RIGHT:
				setNew_OptionID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__OPTION_ID_CHANGE_STATUS:
				setOptionIDChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_LEFT:
				setNew_Name_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_RIGHT:
				setNew_Name_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_LEFT:
				setNew_Sort_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_RIGHT:
				setNew_Sort_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__SORT_CHANGE_STATUS:
				setSortChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_LEFT:
				setNew_Cost_Left((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_RIGHT:
				setNew_Cost_Right((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__COST_CHANGE_STATUS:
				setCostChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT:
				setNew_NumOtherCosts_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT:
				setNew_NumOtherCosts_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS:
				setNumOtherCostsChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_LEFT:
				setNew_Description_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_RIGHT:
				setNew_Description_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__DESCRIPTION_CHANGE_STATUS:
				setDescriptionChangeStatus((ChangeStatus)newValue);
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
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_LEFT:
				setNew_OptionID_Left(NEW_OPTION_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_RIGHT:
				setNew_OptionID_Right(NEW_OPTION_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__OPTION_ID_CHANGE_STATUS:
				setOptionIDChangeStatus(OPTION_ID_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_LEFT:
				setNew_Name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_RIGHT:
				setNew_Name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_LEFT:
				setNew_Sort_Left(NEW_SORT_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_RIGHT:
				setNew_Sort_Right(NEW_SORT_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__SORT_CHANGE_STATUS:
				setSortChangeStatus(SORT_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_LEFT:
				setNew_Cost_Left(NEW_COST_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_RIGHT:
				setNew_Cost_Right(NEW_COST_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__COST_CHANGE_STATUS:
				setCostChangeStatus(COST_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT:
				setNew_NumOtherCosts_Left(NEW_NUM_OTHER_COSTS_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT:
				setNew_NumOtherCosts_Right(NEW_NUM_OTHER_COSTS_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS:
				setNumOtherCostsChangeStatus(NUM_OTHER_COSTS_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_LEFT:
				setNew_Description_Left(NEW_DESCRIPTION_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_RIGHT:
				setNew_Description_Right(NEW_DESCRIPTION_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_OPTION__DESCRIPTION_CHANGE_STATUS:
				setDescriptionChangeStatus(DESCRIPTION_CHANGE_STATUS_EDEFAULT);
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
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_LEFT:
				return new_OptionID_Left != NEW_OPTION_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID_RIGHT:
				return new_OptionID_Right != NEW_OPTION_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__OPTION_ID_CHANGE_STATUS:
				return optionIDChangeStatus != OPTION_ID_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_Name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_Name_Left);
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_Name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_Name_Right);
			case DssmmDiffMMPackage.DIFF_OPTION__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_LEFT:
				return new_Sort_Left != NEW_SORT_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_SORT_RIGHT:
				return new_Sort_Right != NEW_SORT_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__SORT_CHANGE_STATUS:
				return sortChangeStatus != SORT_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_LEFT:
				return new_Cost_Left != NEW_COST_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_COST_RIGHT:
				return new_Cost_Right != NEW_COST_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__COST_CHANGE_STATUS:
				return costChangeStatus != COST_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_LEFT:
				return new_NumOtherCosts_Left != NEW_NUM_OTHER_COSTS_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS_RIGHT:
				return new_NumOtherCosts_Right != NEW_NUM_OTHER_COSTS_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NUM_OTHER_COSTS_CHANGE_STATUS:
				return numOtherCostsChangeStatus != NUM_OTHER_COSTS_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_LEFT:
				return NEW_DESCRIPTION_LEFT_EDEFAULT == null ? new_Description_Left != null : !NEW_DESCRIPTION_LEFT_EDEFAULT.equals(new_Description_Left);
			case DssmmDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION_RIGHT:
				return NEW_DESCRIPTION_RIGHT_EDEFAULT == null ? new_Description_Right != null : !NEW_DESCRIPTION_RIGHT_EDEFAULT.equals(new_Description_Right);
			case DssmmDiffMMPackage.DIFF_OPTION__DESCRIPTION_CHANGE_STATUS:
				return descriptionChangeStatus != DESCRIPTION_CHANGE_STATUS_EDEFAULT;
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
		result.append(", new_OptionID_Left: ");
		result.append(new_OptionID_Left);
		result.append(", new_OptionID_Right: ");
		result.append(new_OptionID_Right);
		result.append(", OptionIDChangeStatus: ");
		result.append(optionIDChangeStatus);
		result.append(", new_Name_Left: ");
		result.append(new_Name_Left);
		result.append(", new_Name_Right: ");
		result.append(new_Name_Right);
		result.append(", NameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_Sort_Left: ");
		result.append(new_Sort_Left);
		result.append(", new_Sort_Right: ");
		result.append(new_Sort_Right);
		result.append(", SortChangeStatus: ");
		result.append(sortChangeStatus);
		result.append(", new_Cost_Left: ");
		result.append(new_Cost_Left);
		result.append(", new_Cost_Right: ");
		result.append(new_Cost_Right);
		result.append(", CostChangeStatus: ");
		result.append(costChangeStatus);
		result.append(", new_NumOtherCosts_Left: ");
		result.append(new_NumOtherCosts_Left);
		result.append(", new_NumOtherCosts_Right: ");
		result.append(new_NumOtherCosts_Right);
		result.append(", NumOtherCostsChangeStatus: ");
		result.append(numOtherCostsChangeStatus);
		result.append(", new_Description_Left: ");
		result.append(new_Description_Left);
		result.append(", new_Description_Right: ");
		result.append(new_Description_Right);
		result.append(", DescriptionChangeStatus: ");
		result.append(descriptionChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffOptionImpl
