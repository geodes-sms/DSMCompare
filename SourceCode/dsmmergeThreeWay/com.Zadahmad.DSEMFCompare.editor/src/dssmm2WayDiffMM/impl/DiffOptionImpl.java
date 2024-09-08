/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffOption;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

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
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_OptionID <em>New Option ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_Sort <em>New Sort</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_Cost <em>New Cost</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_NumOtherCosts <em>New Num Other Costs</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffOptionImpl#getNew_Description <em>New Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffOptionImpl extends OptionImpl implements DiffOption {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_OptionID() <em>New Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_OPTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_OptionID() <em>New Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_OptionID()
	 * @generated
	 * @ordered
	 */
	protected int new_OptionID = NEW_OPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected String new_Name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Sort() <em>New Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_SORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_Sort() <em>New Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Sort()
	 * @generated
	 * @ordered
	 */
	protected int new_Sort = NEW_SORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Cost() <em>New Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_Cost() <em>New Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Cost()
	 * @generated
	 * @ordered
	 */
	protected float new_Cost = NEW_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumOtherCosts() <em>New Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_NUM_OTHER_COSTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_NumOtherCosts() <em>New Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumOtherCosts()
	 * @generated
	 * @ordered
	 */
	protected int new_NumOtherCosts = NEW_NUM_OTHER_COSTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Description() <em>New Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Description() <em>New Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Description()
	 * @generated
	 * @ordered
	 */
	protected String new_Description = NEW_DESCRIPTION_EDEFAULT;

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
		return Dssmm2WayDiffMMPackage.Literals.DIFF_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(ClassDiffKind newDiff_kind) {
		ClassDiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_OptionID() {
		return new_OptionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_OptionID(int newNew_OptionID) {
		int oldNew_OptionID = new_OptionID;
		new_OptionID = newNew_OptionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID, oldNew_OptionID, new_OptionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name() {
		return new_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name(String newNew_Name) {
		String oldNew_Name = new_Name;
		new_Name = newNew_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NAME, oldNew_Name, new_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_Sort() {
		return new_Sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Sort(int newNew_Sort) {
		int oldNew_Sort = new_Sort;
		new_Sort = newNew_Sort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_SORT, oldNew_Sort, new_Sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_Cost() {
		return new_Cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Cost(float newNew_Cost) {
		float oldNew_Cost = new_Cost;
		new_Cost = newNew_Cost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_COST, oldNew_Cost, new_Cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_NumOtherCosts() {
		return new_NumOtherCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumOtherCosts(int newNew_NumOtherCosts) {
		int oldNew_NumOtherCosts = new_NumOtherCosts;
		new_NumOtherCosts = newNew_NumOtherCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS, oldNew_NumOtherCosts, new_NumOtherCosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Description() {
		return new_Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Description(String newNew_Description) {
		String oldNew_Description = new_Description;
		new_Description = newNew_Description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION, oldNew_Description, new_Description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID:
				return getNew_OptionID();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NAME:
				return getNew_Name();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_SORT:
				return getNew_Sort();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_COST:
				return getNew_Cost();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS:
				return getNew_NumOtherCosts();
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION:
				return getNew_Description();
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
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID:
				setNew_OptionID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NAME:
				setNew_Name((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_SORT:
				setNew_Sort((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_COST:
				setNew_Cost((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS:
				setNew_NumOtherCosts((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION:
				setNew_Description((String)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID:
				setNew_OptionID(NEW_OPTION_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_SORT:
				setNew_Sort(NEW_SORT_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_COST:
				setNew_Cost(NEW_COST_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS:
				setNew_NumOtherCosts(NEW_NUM_OTHER_COSTS_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION:
				setNew_Description(NEW_DESCRIPTION_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_OPTION_ID:
				return new_OptionID != NEW_OPTION_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_SORT:
				return new_Sort != NEW_SORT_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_COST:
				return new_Cost != NEW_COST_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_NUM_OTHER_COSTS:
				return new_NumOtherCosts != NEW_NUM_OTHER_COSTS_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_OPTION__NEW_DESCRIPTION:
				return NEW_DESCRIPTION_EDEFAULT == null ? new_Description != null : !NEW_DESCRIPTION_EDEFAULT.equals(new_Description);
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
		result.append(" (diff_kind: ");
		result.append(diff_kind);
		result.append(", new_OptionID: ");
		result.append(new_OptionID);
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(", new_Sort: ");
		result.append(new_Sort);
		result.append(", new_Cost: ");
		result.append(new_Cost);
		result.append(", new_NumOtherCosts: ");
		result.append(new_NumOtherCosts);
		result.append(", new_Description: ");
		result.append(new_Description);
		result.append(')');
		return result.toString();
	}

} //DiffOptionImpl
