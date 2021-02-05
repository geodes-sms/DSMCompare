/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEFactory_ePackage;
import ecoreDiffMM.EDataType;
import ecoreDiffMM.EFactory;
import ecoreDiffMM.EObject;
import ecoreDiffMM.EPackage;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EFactoryImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EFactoryImpl#getDiffePackage <em>Diffe Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFactoryImpl extends EModelElementImpl implements EFactory {
	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ePackage;

	/**
	 * The cached value of the '{@link #getDiffePackage() <em>Diffe Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEFactory_ePackage> diffePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEFactory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEPackage(EPackage newEPackage, NotificationChain msgs) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EFACTORY__EPACKAGE, oldEPackage, newEPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEPackage(EPackage newEPackage) {
		if (newEPackage != ePackage) {
			NotificationChain msgs = null;
			if (ePackage != null)
				msgs = ((InternalEObject)ePackage).eInverseRemove(this, EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE, EPackage.class, msgs);
			if (newEPackage != null)
				msgs = ((InternalEObject)newEPackage).eInverseAdd(this, EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE, EPackage.class, msgs);
			msgs = basicSetEPackage(newEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EFACTORY__EPACKAGE, newEPackage, newEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEFactory_ePackage> getDiffePackage() {
		if (diffePackage == null) {
			diffePackage = new EObjectContainmentEList<DiffEFactory_ePackage>(DiffEFactory_ePackage.class, this, EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE);
		}
		return diffePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(ecoreDiffMM.EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String literalValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				if (ePackage != null)
					msgs = ((InternalEObject)ePackage).eInverseRemove(this, EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE, EPackage.class, msgs);
				return basicSetEPackage((EPackage)otherEnd, msgs);
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
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				return basicSetEPackage(null, msgs);
			case EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE:
				return ((InternalEList<?>)getDiffePackage()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				return getEPackage();
			case EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE:
				return getDiffePackage();
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
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				setEPackage((EPackage)newValue);
				return;
			case EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE:
				getDiffePackage().clear();
				getDiffePackage().addAll((Collection<? extends DiffEFactory_ePackage>)newValue);
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
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				setEPackage((EPackage)null);
				return;
			case EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE:
				getDiffePackage().clear();
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
			case EcoreDiffMMPackage.EFACTORY__EPACKAGE:
				return ePackage != null;
			case EcoreDiffMMPackage.EFACTORY__DIFFE_PACKAGE:
				return diffePackage != null && !diffePackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcoreDiffMMPackage.EFACTORY___CREATE__ECLASS:
				return create((ecoreDiffMM.EClass)arguments.get(0));
			case EcoreDiffMMPackage.EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING:
				return createFromString((EDataType)arguments.get(0), (String)arguments.get(1));
			case EcoreDiffMMPackage.EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT:
				return convertToString((EDataType)arguments.get(0), arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EFactoryImpl
