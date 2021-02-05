/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.BooleanOperator;
import arduinoDiffMM.DiffMathOperator_left;
import arduinoDiffMM.DiffMathOperator_right;
import arduinoDiffMM.DiffSensor_status;
import arduinoDiffMM.MathOperator;
import arduinoDiffMM.OperatorKind;
import arduinoDiffMM.Sensor;
import arduinoDiffMM.Status;
import arduinoDiffMM.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getRight <em>Right</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getDiffright <em>Diffright</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SensorImpl#getDiffstatus <em>Diffstatus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ModuleInstructionImpl implements Sensor {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Value left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Value right;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorKind OPERATOR_EDEFAULT = OperatorKind.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected OperatorKind operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffleft() <em>Diffleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffleft()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffMathOperator_left> diffleft;

	/**
	 * The cached value of the '{@link #getDiffright() <em>Diffright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffright()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffMathOperator_right> diffright;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> status;

	/**
	 * The cached value of the '{@link #getDiffstatus() <em>Diffstatus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffstatus()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSensor_status> diffstatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SENSOR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Value)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SENSOR__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Value newLeft) {
		Value oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SENSOR__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Value)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SENSOR__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Value newRight) {
		Value oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SENSOR__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(OperatorKind newOperator) {
		OperatorKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SENSOR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffMathOperator_left> getDiffleft() {
		if (diffleft == null) {
			diffleft = new EObjectContainmentEList<DiffMathOperator_left>(DiffMathOperator_left.class, this, ArduinoDiffMMPackage.SENSOR__DIFFLEFT);
		}
		return diffleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffMathOperator_right> getDiffright() {
		if (diffright == null) {
			diffright = new EObjectContainmentEList<DiffMathOperator_right>(DiffMathOperator_right.class, this, ArduinoDiffMMPackage.SENSOR__DIFFRIGHT);
		}
		return diffright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Status> getStatus() {
		if (status == null) {
			status = new EObjectWithInverseResolvingEList<Status>(Status.class, this, ArduinoDiffMMPackage.SENSOR__STATUS, ArduinoDiffMMPackage.STATUS__SENSOR);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffSensor_status> getDiffstatus() {
		if (diffstatus == null) {
			diffstatus = new EObjectContainmentEList<DiffSensor_status>(DiffSensor_status.class, this, ArduinoDiffMMPackage.SENSOR__DIFFSTATUS);
		}
		return diffstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStatus()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
				return ((InternalEList<?>)getDiffleft()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
				return ((InternalEList<?>)getDiffright()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				return ((InternalEList<?>)getStatus()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
				return ((InternalEList<?>)getDiffstatus()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.SENSOR__VALUE:
				return getValue();
			case ArduinoDiffMMPackage.SENSOR__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case ArduinoDiffMMPackage.SENSOR__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case ArduinoDiffMMPackage.SENSOR__OPERATOR:
				return getOperator();
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
				return getDiffleft();
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
				return getDiffright();
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				return getStatus();
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
				return getDiffstatus();
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
			case ArduinoDiffMMPackage.SENSOR__VALUE:
				setValue((String)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__LEFT:
				setLeft((Value)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__RIGHT:
				setRight((Value)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__OPERATOR:
				setOperator((OperatorKind)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
				getDiffleft().clear();
				getDiffleft().addAll((Collection<? extends DiffMathOperator_left>)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
				getDiffright().clear();
				getDiffright().addAll((Collection<? extends DiffMathOperator_right>)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends Status>)newValue);
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
				getDiffstatus().clear();
				getDiffstatus().addAll((Collection<? extends DiffSensor_status>)newValue);
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
			case ArduinoDiffMMPackage.SENSOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.SENSOR__LEFT:
				setLeft((Value)null);
				return;
			case ArduinoDiffMMPackage.SENSOR__RIGHT:
				setRight((Value)null);
				return;
			case ArduinoDiffMMPackage.SENSOR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
				getDiffleft().clear();
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
				getDiffright().clear();
				return;
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				getStatus().clear();
				return;
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
				getDiffstatus().clear();
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
			case ArduinoDiffMMPackage.SENSOR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ArduinoDiffMMPackage.SENSOR__LEFT:
				return left != null;
			case ArduinoDiffMMPackage.SENSOR__RIGHT:
				return right != null;
			case ArduinoDiffMMPackage.SENSOR__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ArduinoDiffMMPackage.SENSOR__DIFFLEFT:
				return diffleft != null && !diffleft.isEmpty();
			case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT:
				return diffright != null && !diffright.isEmpty();
			case ArduinoDiffMMPackage.SENSOR__STATUS:
				return status != null && !status.isEmpty();
			case ArduinoDiffMMPackage.SENSOR__DIFFSTATUS:
				return diffstatus != null && !diffstatus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Value.class) {
			switch (derivedFeatureID) {
				case ArduinoDiffMMPackage.SENSOR__VALUE: return ArduinoDiffMMPackage.VALUE__VALUE;
				default: return -1;
			}
		}
		if (baseClass == MathOperator.class) {
			switch (derivedFeatureID) {
				case ArduinoDiffMMPackage.SENSOR__LEFT: return ArduinoDiffMMPackage.MATH_OPERATOR__LEFT;
				case ArduinoDiffMMPackage.SENSOR__RIGHT: return ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT;
				case ArduinoDiffMMPackage.SENSOR__OPERATOR: return ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR;
				case ArduinoDiffMMPackage.SENSOR__DIFFLEFT: return ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT;
				case ArduinoDiffMMPackage.SENSOR__DIFFRIGHT: return ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT;
				default: return -1;
			}
		}
		if (baseClass == BooleanOperator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Value.class) {
			switch (baseFeatureID) {
				case ArduinoDiffMMPackage.VALUE__VALUE: return ArduinoDiffMMPackage.SENSOR__VALUE;
				default: return -1;
			}
		}
		if (baseClass == MathOperator.class) {
			switch (baseFeatureID) {
				case ArduinoDiffMMPackage.MATH_OPERATOR__LEFT: return ArduinoDiffMMPackage.SENSOR__LEFT;
				case ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT: return ArduinoDiffMMPackage.SENSOR__RIGHT;
				case ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR: return ArduinoDiffMMPackage.SENSOR__OPERATOR;
				case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT: return ArduinoDiffMMPackage.SENSOR__DIFFLEFT;
				case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT: return ArduinoDiffMMPackage.SENSOR__DIFFRIGHT;
				default: return -1;
			}
		}
		if (baseClass == BooleanOperator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
