/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffSet_value;
import arduinoDiffMM.DiffSet_variable;
import arduinoDiffMM.Set;
import arduinoDiffMM.Value;
import arduinoDiffMM.Variable;

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
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.SetImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SetImpl#getDiffvariable <em>Diffvariable</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SetImpl#getDiffvalue <em>Diffvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetImpl extends InstructionImpl implements Set {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getDiffvariable() <em>Diffvariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSet_variable> diffvariable;

	/**
	 * The cached value of the '{@link #getDiffvalue() <em>Diffvalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSet_value> diffvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SET__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SET__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SET__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SET__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffSet_variable> getDiffvariable() {
		if (diffvariable == null) {
			diffvariable = new EObjectContainmentEList<DiffSet_variable>(DiffSet_variable.class, this, ArduinoDiffMMPackage.SET__DIFFVARIABLE);
		}
		return diffvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffSet_value> getDiffvalue() {
		if (diffvalue == null) {
			diffvalue = new EObjectContainmentEList<DiffSet_value>(DiffSet_value.class, this, ArduinoDiffMMPackage.SET__DIFFVALUE);
		}
		return diffvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.SET__DIFFVARIABLE:
				return ((InternalEList<?>)getDiffvariable()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SET__DIFFVALUE:
				return ((InternalEList<?>)getDiffvalue()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.SET__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ArduinoDiffMMPackage.SET__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ArduinoDiffMMPackage.SET__DIFFVARIABLE:
				return getDiffvariable();
			case ArduinoDiffMMPackage.SET__DIFFVALUE:
				return getDiffvalue();
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
			case ArduinoDiffMMPackage.SET__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ArduinoDiffMMPackage.SET__VALUE:
				setValue((Value)newValue);
				return;
			case ArduinoDiffMMPackage.SET__DIFFVARIABLE:
				getDiffvariable().clear();
				getDiffvariable().addAll((Collection<? extends DiffSet_variable>)newValue);
				return;
			case ArduinoDiffMMPackage.SET__DIFFVALUE:
				getDiffvalue().clear();
				getDiffvalue().addAll((Collection<? extends DiffSet_value>)newValue);
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
			case ArduinoDiffMMPackage.SET__VARIABLE:
				setVariable((Variable)null);
				return;
			case ArduinoDiffMMPackage.SET__VALUE:
				setValue((Value)null);
				return;
			case ArduinoDiffMMPackage.SET__DIFFVARIABLE:
				getDiffvariable().clear();
				return;
			case ArduinoDiffMMPackage.SET__DIFFVALUE:
				getDiffvalue().clear();
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
			case ArduinoDiffMMPackage.SET__VARIABLE:
				return variable != null;
			case ArduinoDiffMMPackage.SET__VALUE:
				return value != null;
			case ArduinoDiffMMPackage.SET__DIFFVARIABLE:
				return diffvariable != null && !diffvariable.isEmpty();
			case ArduinoDiffMMPackage.SET__DIFFVALUE:
				return diffvalue != null && !diffvalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetImpl
