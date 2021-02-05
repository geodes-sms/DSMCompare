/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.BooleanOperator;
import arduinoDiffMM.DiffWhile_condition;
import arduinoDiffMM.While;

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
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.WhileImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.WhileImpl#getDiffcondition <em>Diffcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileImpl extends ControlImpl implements While {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator condition;

	/**
	 * The cached value of the '{@link #getDiffcondition() <em>Diffcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffWhile_condition> diffcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanOperator getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (BooleanOperator)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.WHILE__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(BooleanOperator newCondition) {
		BooleanOperator oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.WHILE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffWhile_condition> getDiffcondition() {
		if (diffcondition == null) {
			diffcondition = new EObjectContainmentEList<DiffWhile_condition>(DiffWhile_condition.class, this, ArduinoDiffMMPackage.WHILE__DIFFCONDITION);
		}
		return diffcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.WHILE__DIFFCONDITION:
				return ((InternalEList<?>)getDiffcondition()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.WHILE__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case ArduinoDiffMMPackage.WHILE__DIFFCONDITION:
				return getDiffcondition();
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
			case ArduinoDiffMMPackage.WHILE__CONDITION:
				setCondition((BooleanOperator)newValue);
				return;
			case ArduinoDiffMMPackage.WHILE__DIFFCONDITION:
				getDiffcondition().clear();
				getDiffcondition().addAll((Collection<? extends DiffWhile_condition>)newValue);
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
			case ArduinoDiffMMPackage.WHILE__CONDITION:
				setCondition((BooleanOperator)null);
				return;
			case ArduinoDiffMMPackage.WHILE__DIFFCONDITION:
				getDiffcondition().clear();
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
			case ArduinoDiffMMPackage.WHILE__CONDITION:
				return condition != null;
			case ArduinoDiffMMPackage.WHILE__DIFFCONDITION:
				return diffcondition != null && !diffcondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
