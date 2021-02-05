/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.AnalogPin;
import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffPlatform_analogPins;
import arduinoDiffMM.DiffPlatform_digitalPins;
import arduinoDiffMM.DigitalPin;
import arduinoDiffMM.Platform;

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
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.PlatformImpl#getDigitalPins <em>Digital Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.PlatformImpl#getAnalogPins <em>Analog Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.PlatformImpl#getImage <em>Image</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.PlatformImpl#getDiffdigitalPins <em>Diffdigital Pins</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.PlatformImpl#getDiffanalogPins <em>Diffanalog Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends NamedElementImpl implements Platform {
	/**
	 * The cached value of the '{@link #getDigitalPins() <em>Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalPin> digitalPins;

	/**
	 * The cached value of the '{@link #getAnalogPins() <em>Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogPin> analogPins;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffdigitalPins() <em>Diffdigital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlatform_digitalPins> diffdigitalPins;

	/**
	 * The cached value of the '{@link #getDiffanalogPins() <em>Diffanalog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffanalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlatform_analogPins> diffanalogPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DigitalPin> getDigitalPins() {
		if (digitalPins == null) {
			digitalPins = new EObjectContainmentEList<DigitalPin>(DigitalPin.class, this, ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS);
		}
		return digitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalogPin> getAnalogPins() {
		if (analogPins == null) {
			analogPins = new EObjectContainmentEList<AnalogPin>(AnalogPin.class, this, ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS);
		}
		return analogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PLATFORM__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffPlatform_digitalPins> getDiffdigitalPins() {
		if (diffdigitalPins == null) {
			diffdigitalPins = new EObjectContainmentEList<DiffPlatform_digitalPins>(DiffPlatform_digitalPins.class, this, ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS);
		}
		return diffdigitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffPlatform_analogPins> getDiffanalogPins() {
		if (diffanalogPins == null) {
			diffanalogPins = new EObjectContainmentEList<DiffPlatform_analogPins>(DiffPlatform_analogPins.class, this, ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS);
		}
		return diffanalogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS:
				return ((InternalEList<?>)getDigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS:
				return ((InternalEList<?>)getAnalogPins()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS:
				return ((InternalEList<?>)getDiffdigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS:
				return ((InternalEList<?>)getDiffanalogPins()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS:
				return getDigitalPins();
			case ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS:
				return getAnalogPins();
			case ArduinoDiffMMPackage.PLATFORM__IMAGE:
				return getImage();
			case ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS:
				return getDiffdigitalPins();
			case ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS:
				return getDiffanalogPins();
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
			case ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS:
				getDigitalPins().clear();
				getDigitalPins().addAll((Collection<? extends DigitalPin>)newValue);
				return;
			case ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS:
				getAnalogPins().clear();
				getAnalogPins().addAll((Collection<? extends AnalogPin>)newValue);
				return;
			case ArduinoDiffMMPackage.PLATFORM__IMAGE:
				setImage((String)newValue);
				return;
			case ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS:
				getDiffdigitalPins().clear();
				getDiffdigitalPins().addAll((Collection<? extends DiffPlatform_digitalPins>)newValue);
				return;
			case ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS:
				getDiffanalogPins().clear();
				getDiffanalogPins().addAll((Collection<? extends DiffPlatform_analogPins>)newValue);
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
			case ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS:
				getDigitalPins().clear();
				return;
			case ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS:
				getAnalogPins().clear();
				return;
			case ArduinoDiffMMPackage.PLATFORM__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS:
				getDiffdigitalPins().clear();
				return;
			case ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS:
				getDiffanalogPins().clear();
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
			case ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS:
				return digitalPins != null && !digitalPins.isEmpty();
			case ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS:
				return analogPins != null && !analogPins.isEmpty();
			case ArduinoDiffMMPackage.PLATFORM__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS:
				return diffdigitalPins != null && !diffdigitalPins.isEmpty();
			case ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS:
				return diffanalogPins != null && !diffanalogPins.isEmpty();
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
		result.append(" (image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
