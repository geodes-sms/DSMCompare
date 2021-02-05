/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffMathOperator_left;
import arduinoDiffMM.DiffMathOperator_right;
import arduinoDiffMM.MathOperator;
import arduinoDiffMM.OperatorKind;
import arduinoDiffMM.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.MathOperatorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.MathOperatorImpl#getRight <em>Right</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.MathOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.MathOperatorImpl#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.MathOperatorImpl#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MathOperatorImpl extends ValueImpl implements MathOperator {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.MATH_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Value)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.MATH_OPERATOR__LEFT, oldLeft, left));
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
	@Override
	public void setLeft(Value newLeft) {
		Value oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.MATH_OPERATOR__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Value)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT, oldRight, right));
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
	@Override
	public void setRight(Value newRight) {
		Value oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(OperatorKind newOperator) {
		OperatorKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffMathOperator_left> getDiffleft() {
		if (diffleft == null) {
			diffleft = new EObjectContainmentEList<DiffMathOperator_left>(DiffMathOperator_left.class, this, ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT);
		}
		return diffleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffMathOperator_right> getDiffright() {
		if (diffright == null) {
			diffright = new EObjectContainmentEList<DiffMathOperator_right>(DiffMathOperator_right.class, this, ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT);
		}
		return diffright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT:
				return ((InternalEList<?>)getDiffleft()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT:
				return ((InternalEList<?>)getDiffright()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.MATH_OPERATOR__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR:
				return getOperator();
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT:
				return getDiffleft();
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT:
				return getDiffright();
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
			case ArduinoDiffMMPackage.MATH_OPERATOR__LEFT:
				setLeft((Value)newValue);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT:
				setRight((Value)newValue);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR:
				setOperator((OperatorKind)newValue);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT:
				getDiffleft().clear();
				getDiffleft().addAll((Collection<? extends DiffMathOperator_left>)newValue);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT:
				getDiffright().clear();
				getDiffright().addAll((Collection<? extends DiffMathOperator_right>)newValue);
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
			case ArduinoDiffMMPackage.MATH_OPERATOR__LEFT:
				setLeft((Value)null);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT:
				setRight((Value)null);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT:
				getDiffleft().clear();
				return;
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT:
				getDiffright().clear();
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
			case ArduinoDiffMMPackage.MATH_OPERATOR__LEFT:
				return left != null;
			case ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT:
				return right != null;
			case ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT:
				return diffleft != null && !diffleft.isEmpty();
			case ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT:
				return diffright != null && !diffright.isEmpty();
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //MathOperatorImpl
