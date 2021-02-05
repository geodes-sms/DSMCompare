/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.ClassOp;
import ecoreDiffMM.DiffEParameter;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#isNew_ordered <em>New ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#isNew_unique <em>New unique</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#getNew_lowerBound <em>New lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#getNew_upperBound <em>New upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#isNew_many <em>New many</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEParameterImpl#isNew_required <em>New required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEParameterImpl extends EParameterImpl implements DiffEParameter {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ClassOp OPERATION_EDEFAULT = ClassOp.ADD;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ClassOp operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected String new_name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_ordered() <em>New ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_ordered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_ordered() <em>New ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_ordered()
	 * @generated
	 * @ordered
	 */
	protected boolean new_ordered = NEW_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_unique() <em>New unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_unique() <em>New unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unique()
	 * @generated
	 * @ordered
	 */
	protected boolean new_unique = NEW_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_lowerBound() <em>New lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lowerBound() <em>New lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lowerBound()
	 * @generated
	 * @ordered
	 */
	protected int new_lowerBound = NEW_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_upperBound() <em>New upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_upperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_upperBound() <em>New upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_upperBound()
	 * @generated
	 * @ordered
	 */
	protected int new_upperBound = NEW_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_many() <em>New many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_many()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_many() <em>New many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_many()
	 * @generated
	 * @ordered
	 */
	protected boolean new_many = NEW_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_required() <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_required()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_required() <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_required()
	 * @generated
	 * @ordered
	 */
	protected boolean new_required = NEW_REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDiffEParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(ClassOp newOperation) {
		ClassOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_name() {
		return new_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_name(String newNew_name) {
		String oldNew_name = new_name;
		new_name = newNew_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_ordered() {
		return new_ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_ordered(boolean newNew_ordered) {
		boolean oldNew_ordered = new_ordered;
		new_ordered = newNew_ordered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED, oldNew_ordered, new_ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_unique() {
		return new_unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_unique(boolean newNew_unique) {
		boolean oldNew_unique = new_unique;
		new_unique = newNew_unique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE, oldNew_unique, new_unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_lowerBound() {
		return new_lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_lowerBound(int newNew_lowerBound) {
		int oldNew_lowerBound = new_lowerBound;
		new_lowerBound = newNew_lowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND, oldNew_lowerBound, new_lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_upperBound() {
		return new_upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_upperBound(int newNew_upperBound) {
		int oldNew_upperBound = new_upperBound;
		new_upperBound = newNew_upperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND, oldNew_upperBound, new_upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_many() {
		return new_many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_many(boolean newNew_many) {
		boolean oldNew_many = new_many;
		new_many = newNew_many;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY, oldNew_many, new_many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_required() {
		return new_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_required(boolean newNew_required) {
		boolean oldNew_required = new_required;
		new_required = newNew_required;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED, oldNew_required, new_required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME:
				return getNew_name();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED:
				return isNew_ordered();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE:
				return isNew_unique();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND:
				return getNew_lowerBound();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND:
				return getNew_upperBound();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY:
				return isNew_many();
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED:
				return isNew_required();
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
			case EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED:
				setNew_ordered((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE:
				setNew_unique((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND:
				setNew_lowerBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND:
				setNew_upperBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY:
				setNew_many((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED:
				setNew_required((Boolean)newValue);
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
			case EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED:
				setNew_ordered(NEW_ORDERED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE:
				setNew_unique(NEW_UNIQUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND:
				setNew_lowerBound(NEW_LOWER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND:
				setNew_upperBound(NEW_UPPER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY:
				setNew_many(NEW_MANY_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED:
				setNew_required(NEW_REQUIRED_EDEFAULT);
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
			case EcoreDiffMMPackage.DIFF_EPARAMETER__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_ORDERED:
				return new_ordered != NEW_ORDERED_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UNIQUE:
				return new_unique != NEW_UNIQUE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_LOWER_BOUND:
				return new_lowerBound != NEW_LOWER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_UPPER_BOUND:
				return new_upperBound != NEW_UPPER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_MANY:
				return new_many != NEW_MANY_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPARAMETER__NEW_REQUIRED:
				return new_required != NEW_REQUIRED_EDEFAULT;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(", new_name: ");
		result.append(new_name);
		result.append(", new_ordered: ");
		result.append(new_ordered);
		result.append(", new_unique: ");
		result.append(new_unique);
		result.append(", new_lowerBound: ");
		result.append(new_lowerBound);
		result.append(", new_upperBound: ");
		result.append(new_upperBound);
		result.append(", new_many: ");
		result.append(new_many);
		result.append(", new_required: ");
		result.append(new_required);
		result.append(')');
		return result.toString();
	}

} //DiffEParameterImpl
