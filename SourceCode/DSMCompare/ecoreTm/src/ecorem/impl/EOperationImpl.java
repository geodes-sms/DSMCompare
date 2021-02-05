/**
 */
package ecorem.impl;

import ecorem.EOperation;
import ecorem.ETypedElement;
import ecorem.EcoremPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecorem.impl.EOperationImpl#getEType <em>EType</em>}</li>
 *   <li>{@link ecorem.impl.EOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecorem.impl.EOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationImpl extends ENamedElementImpl implements EOperation {
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
	 * The default value of the '{@link #getEParameters() <em>EParameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String EPARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected String eParameters = EPARAMETERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoremPackage.Literals.EOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoremPackage.EOPERATION__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEParameters() {
		return eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEParameters(String newEParameters) {
		String oldEParameters = eParameters;
		eParameters = newEParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoremPackage.EOPERATION__EPARAMETERS, oldEParameters, eParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecorem.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcoremPackage.EOPERATION__ECONTAINING_CLASS) return null;
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
			case EcoremPackage.EOPERATION__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoremPackage.EOPERATION__ECONTAINING_CLASS, msgs);
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
			case EcoremPackage.EOPERATION__ECONTAINING_CLASS:
				return eBasicSetContainer(null, EcoremPackage.EOPERATION__ECONTAINING_CLASS, msgs);
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
			case EcoremPackage.EOPERATION__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, EcoremPackage.ECLASS__EOPERATIONS, ecorem.EClass.class, msgs);
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
			case EcoremPackage.EOPERATION__ETYPE:
				return getEType();
			case EcoremPackage.EOPERATION__EPARAMETERS:
				return getEParameters();
			case EcoremPackage.EOPERATION__ECONTAINING_CLASS:
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
			case EcoremPackage.EOPERATION__ETYPE:
				setEType((String)newValue);
				return;
			case EcoremPackage.EOPERATION__EPARAMETERS:
				setEParameters((String)newValue);
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
			case EcoremPackage.EOPERATION__ETYPE:
				setEType(ETYPE_EDEFAULT);
				return;
			case EcoremPackage.EOPERATION__EPARAMETERS:
				setEParameters(EPARAMETERS_EDEFAULT);
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
			case EcoremPackage.EOPERATION__ETYPE:
				return ETYPE_EDEFAULT == null ? eType != null : !ETYPE_EDEFAULT.equals(eType);
			case EcoremPackage.EOPERATION__EPARAMETERS:
				return EPARAMETERS_EDEFAULT == null ? eParameters != null : !EPARAMETERS_EDEFAULT.equals(eParameters);
			case EcoremPackage.EOPERATION__ECONTAINING_CLASS:
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
				case EcoremPackage.EOPERATION__ETYPE: return EcoremPackage.ETYPED_ELEMENT__ETYPE;
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
				case EcoremPackage.ETYPED_ELEMENT__ETYPE: return EcoremPackage.EOPERATION__ETYPE;
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
		result.append(", eParameters: ");
		result.append(eParameters);
		result.append(')');
		return result.toString();
	}

} //EOperationImpl
