/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEReference_eKeys;
import ecoreDiffMM.DiffEReference_eOpposite;
import ecoreDiffMM.DiffEReference_eReferenceType;
import ecoreDiffMM.EAttribute;
import ecoreDiffMM.EReference;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#isContainer <em>Container</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getEKeys <em>EKeys</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getDiffeOpposite <em>Diffe Opposite</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getDiffeReferenceType <em>Diffe Reference Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EReferenceImpl#getDiffeKeys <em>Diffe Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferenceImpl extends EStructuralFeatureImpl implements EReference {
	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_PROXIES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected boolean resolveProxies = RESOLVE_PROXIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOpposite() <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOpposite()
	 * @generated
	 * @ordered
	 */
	protected EReference eOpposite;

	/**
	 * The cached value of the '{@link #getEKeys() <em>EKeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eKeys;

	/**
	 * The cached value of the '{@link #getDiffeOpposite() <em>Diffe Opposite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEReference_eOpposite> diffeOpposite;

	/**
	 * The cached value of the '{@link #getDiffeReferenceType() <em>Diffe Reference Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeReferenceType()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEReference_eReferenceType> diffeReferenceType;

	/**
	 * The cached value of the '{@link #getDiffeKeys() <em>Diffe Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEReference_eKeys> diffeKeys;

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
		return EcoreDiffMMPackage.eINSTANCE.getEReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EREFERENCE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainer() {
		// TODO: implement this method to return the 'Container' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResolveProxies() {
		return resolveProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolveProxies(boolean newResolveProxies) {
		boolean oldResolveProxies = resolveProxies;
		resolveProxies = newResolveProxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES, oldResolveProxies, resolveProxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEOpposite() {
		if (eOpposite != null && eOpposite.eIsProxy()) {
			InternalEObject oldEOpposite = (InternalEObject)eOpposite;
			eOpposite = (EReference)eResolveProxy(oldEOpposite);
			if (eOpposite != oldEOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreDiffMMPackage.EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
			}
		}
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEOpposite() {
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEOpposite(EReference newEOpposite) {
		EReference oldEOpposite = eOpposite;
		eOpposite = newEOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EClass getEReferenceType() {
		ecoreDiffMM.EClass eReferenceType = basicGetEReferenceType();
		return eReferenceType != null && eReferenceType.eIsProxy() ? (ecoreDiffMM.EClass)eResolveProxy((InternalEObject)eReferenceType) : eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecoreDiffMM.EClass basicGetEReferenceType() {
		// TODO: implement this method to return the 'EReference Type' reference
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
	public EList<EAttribute> getEKeys() {
		if (eKeys == null) {
			eKeys = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, EcoreDiffMMPackage.EREFERENCE__EKEYS);
		}
		return eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEReference_eOpposite> getDiffeOpposite() {
		if (diffeOpposite == null) {
			diffeOpposite = new EObjectContainmentEList<DiffEReference_eOpposite>(DiffEReference_eOpposite.class, this, EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE);
		}
		return diffeOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEReference_eReferenceType> getDiffeReferenceType() {
		if (diffeReferenceType == null) {
			diffeReferenceType = new EObjectContainmentEList<DiffEReference_eReferenceType>(DiffEReference_eReferenceType.class, this, EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE);
		}
		return diffeReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEReference_eKeys> getDiffeKeys() {
		if (diffeKeys == null) {
			diffeKeys = new EObjectContainmentEList<DiffEReference_eKeys>(DiffEReference_eKeys.class, this, EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS);
		}
		return diffeKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE:
				return ((InternalEList<?>)getDiffeOpposite()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE:
				return ((InternalEList<?>)getDiffeReferenceType()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS:
				return ((InternalEList<?>)getDiffeKeys()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EREFERENCE__CONTAINMENT:
				return isContainment();
			case EcoreDiffMMPackage.EREFERENCE__CONTAINER:
				return isContainer();
			case EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES:
				return isResolveProxies();
			case EcoreDiffMMPackage.EREFERENCE__EOPPOSITE:
				if (resolve) return getEOpposite();
				return basicGetEOpposite();
			case EcoreDiffMMPackage.EREFERENCE__EREFERENCE_TYPE:
				if (resolve) return getEReferenceType();
				return basicGetEReferenceType();
			case EcoreDiffMMPackage.EREFERENCE__EKEYS:
				return getEKeys();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE:
				return getDiffeOpposite();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE:
				return getDiffeReferenceType();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS:
				return getDiffeKeys();
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
			case EcoreDiffMMPackage.EREFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__EOPPOSITE:
				setEOpposite((EReference)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__EKEYS:
				getEKeys().clear();
				getEKeys().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE:
				getDiffeOpposite().clear();
				getDiffeOpposite().addAll((Collection<? extends DiffEReference_eOpposite>)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE:
				getDiffeReferenceType().clear();
				getDiffeReferenceType().addAll((Collection<? extends DiffEReference_eReferenceType>)newValue);
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS:
				getDiffeKeys().clear();
				getDiffeKeys().addAll((Collection<? extends DiffEReference_eKeys>)newValue);
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
			case EcoreDiffMMPackage.EREFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES:
				setResolveProxies(RESOLVE_PROXIES_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EREFERENCE__EOPPOSITE:
				setEOpposite((EReference)null);
				return;
			case EcoreDiffMMPackage.EREFERENCE__EKEYS:
				getEKeys().clear();
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE:
				getDiffeOpposite().clear();
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE:
				getDiffeReferenceType().clear();
				return;
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS:
				getDiffeKeys().clear();
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
			case EcoreDiffMMPackage.EREFERENCE__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case EcoreDiffMMPackage.EREFERENCE__CONTAINER:
				return isContainer() != CONTAINER_EDEFAULT;
			case EcoreDiffMMPackage.EREFERENCE__RESOLVE_PROXIES:
				return resolveProxies != RESOLVE_PROXIES_EDEFAULT;
			case EcoreDiffMMPackage.EREFERENCE__EOPPOSITE:
				return eOpposite != null;
			case EcoreDiffMMPackage.EREFERENCE__EREFERENCE_TYPE:
				return basicGetEReferenceType() != null;
			case EcoreDiffMMPackage.EREFERENCE__EKEYS:
				return eKeys != null && !eKeys.isEmpty();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_OPPOSITE:
				return diffeOpposite != null && !diffeOpposite.isEmpty();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_REFERENCE_TYPE:
				return diffeReferenceType != null && !diffeReferenceType.isEmpty();
			case EcoreDiffMMPackage.EREFERENCE__DIFFE_KEYS:
				return diffeKeys != null && !diffeKeys.isEmpty();
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
		result.append(" (containment: ");
		result.append(containment);
		result.append(", resolveProxies: ");
		result.append(resolveProxies);
		result.append(')');
		return result.toString();
	}

} //EReferenceImpl
