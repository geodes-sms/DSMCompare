/**
 */
package oracleDiffMM.impl;

import oracleDiffMM.ClassOp;
import oracleDiffMM.DiffC;
import oracleDiffMM.OracleDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.impl.DiffCImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DiffCImpl#getNew_id <em>New id</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DiffCImpl#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DiffCImpl#getNew_x <em>New x</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffCImpl extends CImpl implements DiffC {
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
	 * The default value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected int new_id = NEW_ID_EDEFAULT;

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
	 * The default value of the '{@link #getNew_x() <em>New x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_x()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_x() <em>New x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_x()
	 * @generated
	 * @ordered
	 */
	protected int new_x = NEW_X_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OracleDiffMMPackage.Literals.DIFF_C;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.DIFF_C__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_id() {
		return new_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_id(int newNew_id) {
		int oldNew_id = new_id;
		new_id = newNew_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.DIFF_C__NEW_ID, oldNew_id, new_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_Name() {
		return new_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_Name(String newNew_Name) {
		String oldNew_Name = new_Name;
		new_Name = newNew_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.DIFF_C__NEW_NAME, oldNew_Name, new_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_x() {
		return new_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_x(int newNew_x) {
		int oldNew_x = new_x;
		new_x = newNew_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.DIFF_C__NEW_X, oldNew_x, new_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OracleDiffMMPackage.DIFF_C__OPERATION:
				return getOperation();
			case OracleDiffMMPackage.DIFF_C__NEW_ID:
				return getNew_id();
			case OracleDiffMMPackage.DIFF_C__NEW_NAME:
				return getNew_Name();
			case OracleDiffMMPackage.DIFF_C__NEW_X:
				return getNew_x();
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
			case OracleDiffMMPackage.DIFF_C__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_ID:
				setNew_id((Integer)newValue);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_NAME:
				setNew_Name((String)newValue);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_X:
				setNew_x((Integer)newValue);
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
			case OracleDiffMMPackage.DIFF_C__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_ID:
				setNew_id(NEW_ID_EDEFAULT);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
				return;
			case OracleDiffMMPackage.DIFF_C__NEW_X:
				setNew_x(NEW_X_EDEFAULT);
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
			case OracleDiffMMPackage.DIFF_C__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case OracleDiffMMPackage.DIFF_C__NEW_ID:
				return new_id != NEW_ID_EDEFAULT;
			case OracleDiffMMPackage.DIFF_C__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
			case OracleDiffMMPackage.DIFF_C__NEW_X:
				return new_x != NEW_X_EDEFAULT;
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
		result.append(", new_id: ");
		result.append(new_id);
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(", new_x: ");
		result.append(new_x);
		result.append(')');
		return result.toString();
	}

} //DiffCImpl
