/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.DiffOption_vendor;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayDiffMM.Option;
import dssmm2WayDiffMM.Vendor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getOptionID <em>Option ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getNumOtherCosts <em>Num Other Costs</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.OptionImpl#getDiffvendor <em>Diffvendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The default value of the '{@link #getOptionID() <em>Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionID()
	 * @generated
	 * @ordered
	 */
	protected static final int OPTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOptionID() <em>Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionID()
	 * @generated
	 * @ordered
	 */
	protected int optionID = OPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected int sort = SORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOtherCosts() <em>Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOtherCosts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OTHER_COSTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOtherCosts() <em>Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOtherCosts()
	 * @generated
	 * @ordered
	 */
	protected int numOtherCosts = NUM_OTHER_COSTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor vendor;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffvendor() <em>Diffvendor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffvendor()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffOption_vendor> diffvendor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptionID() {
		return optionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionID(int newOptionID) {
		int oldOptionID = optionID;
		optionID = newOptionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__OPTION_ID, oldOptionID, optionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(int newSort) {
		int oldSort = sort;
		sort = newSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__SORT, oldSort, sort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOtherCosts() {
		return numOtherCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOtherCosts(int newNumOtherCosts) {
		int oldNumOtherCosts = numOtherCosts;
		numOtherCosts = newNumOtherCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__NUM_OTHER_COSTS, oldNumOtherCosts, numOtherCosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor getVendor() {
		if (vendor != null && vendor.eIsProxy()) {
			InternalEObject oldVendor = (InternalEObject)vendor;
			vendor = (Vendor)eResolveProxy(oldVendor);
			if (vendor != oldVendor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dssmm2WayDiffMMPackage.OPTION__VENDOR, oldVendor, vendor));
			}
		}
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor basicGetVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(Vendor newVendor) {
		Vendor oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.OPTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffOption_vendor> getDiffvendor() {
		if (diffvendor == null) {
			diffvendor = new EObjectContainmentEList<DiffOption_vendor>(DiffOption_vendor.class, this, Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR);
		}
		return diffvendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR:
				return ((InternalEList<?>)getDiffvendor()).basicRemove(otherEnd, msgs);
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
			case Dssmm2WayDiffMMPackage.OPTION__OPTION_ID:
				return getOptionID();
			case Dssmm2WayDiffMMPackage.OPTION__NAME:
				return getName();
			case Dssmm2WayDiffMMPackage.OPTION__SORT:
				return getSort();
			case Dssmm2WayDiffMMPackage.OPTION__COST:
				return getCost();
			case Dssmm2WayDiffMMPackage.OPTION__NUM_OTHER_COSTS:
				return getNumOtherCosts();
			case Dssmm2WayDiffMMPackage.OPTION__VENDOR:
				if (resolve) return getVendor();
				return basicGetVendor();
			case Dssmm2WayDiffMMPackage.OPTION__DESCRIPTION:
				return getDescription();
			case Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR:
				return getDiffvendor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.OPTION__OPTION_ID:
				setOptionID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__NAME:
				setName((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__SORT:
				setSort((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__COST:
				setCost((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__NUM_OTHER_COSTS:
				setNumOtherCosts((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__VENDOR:
				setVendor((Vendor)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR:
				getDiffvendor().clear();
				getDiffvendor().addAll((Collection<? extends DiffOption_vendor>)newValue);
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
			case Dssmm2WayDiffMMPackage.OPTION__OPTION_ID:
				setOptionID(OPTION_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__SORT:
				setSort(SORT_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__COST:
				setCost(COST_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__NUM_OTHER_COSTS:
				setNumOtherCosts(NUM_OTHER_COSTS_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__VENDOR:
				setVendor((Vendor)null);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR:
				getDiffvendor().clear();
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
			case Dssmm2WayDiffMMPackage.OPTION__OPTION_ID:
				return optionID != OPTION_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.OPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Dssmm2WayDiffMMPackage.OPTION__SORT:
				return sort != SORT_EDEFAULT;
			case Dssmm2WayDiffMMPackage.OPTION__COST:
				return cost != COST_EDEFAULT;
			case Dssmm2WayDiffMMPackage.OPTION__NUM_OTHER_COSTS:
				return numOtherCosts != NUM_OTHER_COSTS_EDEFAULT;
			case Dssmm2WayDiffMMPackage.OPTION__VENDOR:
				return vendor != null;
			case Dssmm2WayDiffMMPackage.OPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Dssmm2WayDiffMMPackage.OPTION__DIFFVENDOR:
				return diffvendor != null && !diffvendor.isEmpty();
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
		result.append(" (OptionID: ");
		result.append(optionID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Sort: ");
		result.append(sort);
		result.append(", Cost: ");
		result.append(cost);
		result.append(", NumOtherCosts: ");
		result.append(numOtherCosts);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
