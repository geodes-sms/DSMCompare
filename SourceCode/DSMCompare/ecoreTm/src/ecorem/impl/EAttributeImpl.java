/**
 */
package ecorem.impl;

import ecorem.EAttribute;
import ecorem.ETypedElement;
import ecorem.EcoremPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecorem.impl.EAttributeImpl#getEType <em>EType</em>}</li>
 *   <li>{@link ecorem.impl.EAttributeImpl#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeImpl extends ENamedElementImpl implements EAttribute {
	/**
	 * The default value of the '{@link #getEType() <em>EType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected static final String ETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected String eType = ETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoremPackage.Literals.EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEType(String newEType) {
		String oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoremPackage.EATTRIBUTE__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecorem.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS) return null;
		return (ecorem.EClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS, msgs);
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
			case EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS:
				return eBasicSetContainer(null, EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, EcoremPackage.ECLASS__EATTRIBUTES, ecorem.EClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoremPackage.EATTRIBUTE__ETYPE:
				return getEType();
			case EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS:
				return getEContainingClass();
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
			case EcoremPackage.EATTRIBUTE__ETYPE:
				setEType((String)newValue);
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
			case EcoremPackage.EATTRIBUTE__ETYPE:
				setEType(ETYPE_EDEFAULT);
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
			case EcoremPackage.EATTRIBUTE__ETYPE:
				return ETYPE_EDEFAULT == null ? eType != null : !ETYPE_EDEFAULT.equals(eType);
			case EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS:
				return getEContainingClass() != null;
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
		if (baseClass == ETypedElement.class) {
			switch (derivedFeatureID) {
				case EcoremPackage.EATTRIBUTE__ETYPE: return EcoremPackage.ETYPED_ELEMENT__ETYPE;
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
		if (baseClass == ETypedElement.class) {
			switch (baseFeatureID) {
				case EcoremPackage.ETYPED_ELEMENT__ETYPE: return EcoremPackage.EATTRIBUTE__ETYPE;
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
		result.append(" (eType: ");
		result.append(eType);
		result.append(')');
		return result.toString();
	}

} //EAttributeImpl
