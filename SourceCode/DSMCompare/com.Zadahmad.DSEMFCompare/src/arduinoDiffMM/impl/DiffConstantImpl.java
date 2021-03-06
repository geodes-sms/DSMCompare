/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.ClassOp;
import arduinoDiffMM.DiffConstant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.DiffConstantImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffConstantImpl#getNew_value <em>New value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffConstantImpl extends ConstantImpl implements DiffConstant {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.DIFF_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ClassOp newOperation) {
		ClassOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value(String newNew_value) {
		String oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE, oldNew_value, new_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION:
				return getOperation();
			case ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE:
				return getNew_value();
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
			case ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE:
				setNew_value((String)newValue);
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
			case ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE:
				setNew_value(NEW_VALUE_EDEFAULT);
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
			case ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? new_value != null : !NEW_VALUE_EDEFAULT.equals(new_value);
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
		result.append(')');
		return result.toString();
	}

} //DiffConstantImpl
