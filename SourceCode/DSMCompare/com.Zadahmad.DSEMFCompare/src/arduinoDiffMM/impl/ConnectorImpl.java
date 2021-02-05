/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Connector;
import arduinoDiffMM.DiffConnector_module;
import arduinoDiffMM.DiffConnector_pin;
import arduinoDiffMM.Pin;

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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.ConnectorImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ConnectorImpl#getModule <em>Module</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ConnectorImpl#getDiffpin <em>Diffpin</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ConnectorImpl#getDiffmodule <em>Diffmodule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected Pin pin;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected arduinoDiffMM.Module module;

	/**
	 * The cached value of the '{@link #getDiffpin() <em>Diffpin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffpin()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffConnector_pin> diffpin;

	/**
	 * The cached value of the '{@link #getDiffmodule() <em>Diffmodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffConnector_module> diffmodule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPin() {
		if (pin != null && pin.eIsProxy()) {
			InternalEObject oldPin = (InternalEObject)pin;
			pin = (Pin)eResolveProxy(oldPin);
			if (pin != oldPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.CONNECTOR__PIN, oldPin, pin));
			}
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(Pin newPin) {
		Pin oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.CONNECTOR__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arduinoDiffMM.Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (arduinoDiffMM.Module)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.CONNECTOR__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arduinoDiffMM.Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(arduinoDiffMM.Module newModule) {
		arduinoDiffMM.Module oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.CONNECTOR__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffConnector_pin> getDiffpin() {
		if (diffpin == null) {
			diffpin = new EObjectContainmentEList<DiffConnector_pin>(DiffConnector_pin.class, this, ArduinoDiffMMPackage.CONNECTOR__DIFFPIN);
		}
		return diffpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffConnector_module> getDiffmodule() {
		if (diffmodule == null) {
			diffmodule = new EObjectContainmentEList<DiffConnector_module>(DiffConnector_module.class, this, ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE);
		}
		return diffmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.CONNECTOR__DIFFPIN:
				return ((InternalEList<?>)getDiffpin()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE:
				return ((InternalEList<?>)getDiffmodule()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.CONNECTOR__PIN:
				if (resolve) return getPin();
				return basicGetPin();
			case ArduinoDiffMMPackage.CONNECTOR__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case ArduinoDiffMMPackage.CONNECTOR__DIFFPIN:
				return getDiffpin();
			case ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE:
				return getDiffmodule();
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
			case ArduinoDiffMMPackage.CONNECTOR__PIN:
				setPin((Pin)newValue);
				return;
			case ArduinoDiffMMPackage.CONNECTOR__MODULE:
				setModule((arduinoDiffMM.Module)newValue);
				return;
			case ArduinoDiffMMPackage.CONNECTOR__DIFFPIN:
				getDiffpin().clear();
				getDiffpin().addAll((Collection<? extends DiffConnector_pin>)newValue);
				return;
			case ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE:
				getDiffmodule().clear();
				getDiffmodule().addAll((Collection<? extends DiffConnector_module>)newValue);
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
			case ArduinoDiffMMPackage.CONNECTOR__PIN:
				setPin((Pin)null);
				return;
			case ArduinoDiffMMPackage.CONNECTOR__MODULE:
				setModule((arduinoDiffMM.Module)null);
				return;
			case ArduinoDiffMMPackage.CONNECTOR__DIFFPIN:
				getDiffpin().clear();
				return;
			case ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE:
				getDiffmodule().clear();
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
			case ArduinoDiffMMPackage.CONNECTOR__PIN:
				return pin != null;
			case ArduinoDiffMMPackage.CONNECTOR__MODULE:
				return module != null;
			case ArduinoDiffMMPackage.CONNECTOR__DIFFPIN:
				return diffpin != null && !diffpin.isEmpty();
			case ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE:
				return diffmodule != null && !diffmodule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
