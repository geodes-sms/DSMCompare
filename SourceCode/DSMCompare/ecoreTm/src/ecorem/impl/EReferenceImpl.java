/**
 */
package ecorem.impl;

import ecorem.EReference;
import ecorem.EcoremPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecorem.impl.EReferenceImpl#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecorem.impl.EReferenceImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferenceImpl extends ENamedElementImpl implements EReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoremPackage.Literals.EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecorem.EClass getEReferenceType() {
		// TODO: implement this method to return the 'EReference Type' container reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEReferenceType(ecorem.EClass newEReferenceType) {
		// TODO: implement this method to set the 'EReference Type' container reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecorem.EClass getEType() {
		ecorem.EClass eType = basicGetEType();
		return eType != null && eType.eIsProxy() ? (ecorem.EClass)eResolveProxy((InternalEObject)eType) : eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecorem.EClass basicGetEType() {
		// TODO: implement this method to return the 'EType' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEType(ecorem.EClass newEType) {
		// TODO: implement this method to set the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEType() {
		// TODO: implement this method to unset the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEType() {
		// TODO: implement this method to return whether the 'EType' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcoremPackage.EREFERENCE__EREFERENCE_TYPE:
				return eInternalContainer().eInverseRemove(this, EcoremPackage.ECLASS__EREFERENCES, ecorem.EClass.class, msgs);
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
			case EcoremPackage.EREFERENCE__EREFERENCE_TYPE:
				return getEReferenceType();
			case EcoremPackage.EREFERENCE__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
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
			case EcoremPackage.EREFERENCE__EREFERENCE_TYPE:
				setEReferenceType((ecorem.EClass)newValue);
				return;
			case EcoremPackage.EREFERENCE__ETYPE:
				setEType((ecorem.EClass)newValue);
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
			case EcoremPackage.EREFERENCE__EREFERENCE_TYPE:
				setEReferenceType((ecorem.EClass)null);
				return;
			case EcoremPackage.EREFERENCE__ETYPE:
				unsetEType();
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
			case EcoremPackage.EREFERENCE__EREFERENCE_TYPE:
				return getEReferenceType() != null;
			case EcoremPackage.EREFERENCE__ETYPE:
				return isSetEType();
		}
		return super.eIsSet(featureID);
	}

} //EReferenceImpl
