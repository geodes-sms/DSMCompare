/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEAttribute_eAttributeType;
import ecoreDiffMM.EAttribute;
import ecoreDiffMM.EDataType;
import ecoreDiffMM.EcoreDiffMMPackage;

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
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EAttributeImpl#isID <em>ID</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAttributeImpl#getEAttributeType <em>EAttribute Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAttributeImpl#getDiffeAttributeType <em>Diffe Attribute Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeImpl extends EStructuralFeatureImpl implements EAttribute {
	/**
	 * The default value of the '{@link #isID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isID()
	 * @generated
	 * @ordered
	 */
	protected boolean iD = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffeAttributeType() <em>Diffe Attribute Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAttributeType()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAttribute_eAttributeType> diffeAttributeType;

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
		return EcoreDiffMMPackage.eINSTANCE.getEAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(boolean newID) {
		boolean oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EATTRIBUTE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEAttributeType() {
		EDataType eAttributeType = basicGetEAttributeType();
		return eAttributeType != null && eAttributeType.eIsProxy() ? (EDataType)eResolveProxy((InternalEObject)eAttributeType) : eAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetEAttributeType() {
		// TODO: implement this method to return the 'EAttribute Type' reference
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
	public EList<DiffEAttribute_eAttributeType> getDiffeAttributeType() {
		if (diffeAttributeType == null) {
			diffeAttributeType = new EObjectContainmentEList<DiffEAttribute_eAttributeType>(DiffEAttribute_eAttributeType.class, this, EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE);
		}
		return diffeAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE:
				return ((InternalEList<?>)getDiffeAttributeType()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EATTRIBUTE__ID:
				return isID();
			case EcoreDiffMMPackage.EATTRIBUTE__EATTRIBUTE_TYPE:
				if (resolve) return getEAttributeType();
				return basicGetEAttributeType();
			case EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE:
				return getDiffeAttributeType();
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
			case EcoreDiffMMPackage.EATTRIBUTE__ID:
				setID((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE:
				getDiffeAttributeType().clear();
				getDiffeAttributeType().addAll((Collection<? extends DiffEAttribute_eAttributeType>)newValue);
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
			case EcoreDiffMMPackage.EATTRIBUTE__ID:
				setID(ID_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE:
				getDiffeAttributeType().clear();
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
			case EcoreDiffMMPackage.EATTRIBUTE__ID:
				return iD != ID_EDEFAULT;
			case EcoreDiffMMPackage.EATTRIBUTE__EATTRIBUTE_TYPE:
				return basicGetEAttributeType() != null;
			case EcoreDiffMMPackage.EATTRIBUTE__DIFFE_ATTRIBUTE_TYPE:
				return diffeAttributeType != null && !diffeAttributeType.isEmpty();
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //EAttributeImpl
