/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.ClassOp;
import arduinoDiffMM.DiffStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.DiffStatusImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffStatusImpl#getNew_value <em>New value</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffStatusImpl#isNew_status <em>New status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffStatusImpl extends StatusImpl implements DiffStatus {
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
	 * The default value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected String new_value = NEW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_status() <em>New status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_status()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_status() <em>New status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_status()
	 * @generated
	 * @ordered
	 */
	protected boolean new_status = NEW_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.DIFF_STATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_STATUS__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_value(String newNew_value) {
		String oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE, oldNew_value, new_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_status() {
		return new_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_status(boolean newNew_status) {
		boolean oldNew_status = new_status;
		new_status = newNew_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS, oldNew_status, new_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DIFF_STATUS__OPERATION:
				return getOperation();
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE:
				return getNew_value();
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS:
				return isNew_status();
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
			case ArduinoDiffMMPackage.DIFF_STATUS__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE:
				setNew_value((String)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS:
				setNew_status((Boolean)newValue);
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
			case ArduinoDiffMMPackage.DIFF_STATUS__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE:
				setNew_value(NEW_VALUE_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS:
				setNew_status(NEW_STATUS_EDEFAULT);
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
			case ArduinoDiffMMPackage.DIFF_STATUS__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? new_value != null : !NEW_VALUE_EDEFAULT.equals(new_value);
			case ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS:
				return new_status != NEW_STATUS_EDEFAULT;
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
		result.append(", new_value: ");
		result.append(new_value);
		result.append(", new_status: ");
		result.append(new_status);
		result.append(')');
		return result.toString();
	}

} //DiffStatusImpl
