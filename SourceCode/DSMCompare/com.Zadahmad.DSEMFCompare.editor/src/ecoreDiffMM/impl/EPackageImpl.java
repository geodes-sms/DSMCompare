/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEPackage_domainspecificdiffs;
import ecoreDiffMM.DiffEPackage_eClassifiers;
import ecoreDiffMM.DiffEPackage_eFactoryInstance;
import ecoreDiffMM.DiffEPackage_eSubpackages;
import ecoreDiffMM.DiffEPackage_eSuperPackage;
import ecoreDiffMM.DomainSpecificDiff;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EFactory;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getESuperPackage <em>ESuper Package</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDiffeFactoryInstance <em>Diffe Factory Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDiffeClassifiers <em>Diffe Classifiers</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDiffeSubpackages <em>Diffe Subpackages</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDiffeSuperPackage <em>Diffe Super Package</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EPackageImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageImpl extends ENamedElementImpl implements EPackage {
	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEFactoryInstance() <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFactoryInstance()
	 * @generated
	 * @ordered
	 */
	protected EFactory eFactoryInstance;

	/**
	 * The cached value of the '{@link #getEClassifiers() <em>EClassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eClassifiers;

	/**
	 * The cached value of the '{@link #getESubpackages() <em>ESubpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> eSubpackages;

	/**
	 * The cached value of the '{@link #getDomainspecificdiffs() <em>Domainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSpecificDiff> domainspecificdiffs;

	/**
	 * The cached value of the '{@link #getDiffeFactoryInstance() <em>Diffe Factory Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeFactoryInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eFactoryInstance> diffeFactoryInstance;

	/**
	 * The cached value of the '{@link #getDiffeClassifiers() <em>Diffe Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eClassifiers> diffeClassifiers;

	/**
	 * The cached value of the '{@link #getDiffeSubpackages() <em>Diffe Subpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeSubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eSubpackages> diffeSubpackages;

	/**
	 * The cached value of the '{@link #getDiffeSuperPackage() <em>Diffe Super Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeSuperPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eSuperPackage> diffeSuperPackage;

	/**
	 * The cached value of the '{@link #getDiffdomainspecificdiffs() <em>Diffdomainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_domainspecificdiffs> diffdomainspecificdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EPACKAGE__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EPACKAGE__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFactory getEFactoryInstance() {
		return eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFactoryInstance(EFactory newEFactoryInstance, NotificationChain msgs) {
		EFactory oldEFactoryInstance = eFactoryInstance;
		eFactoryInstance = newEFactoryInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE, oldEFactoryInstance, newEFactoryInstance);
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
	public void setEFactoryInstance(EFactory newEFactoryInstance) {
		if (newEFactoryInstance != eFactoryInstance) {
			NotificationChain msgs = null;
			if (eFactoryInstance != null)
				msgs = ((InternalEObject)eFactoryInstance).eInverseRemove(this, EcoreDiffMMPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
			if (newEFactoryInstance != null)
				msgs = ((InternalEObject)newEFactoryInstance).eInverseAdd(this, EcoreDiffMMPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
			msgs = basicSetEFactoryInstance(newEFactoryInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE, newEFactoryInstance, newEFactoryInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClassifier> getEClassifiers() {
		if (eClassifiers == null) {
			eClassifiers = new EObjectContainmentWithInverseEList<EClassifier>(EClassifier.class, this, EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS, EcoreDiffMMPackage.ECLASSIFIER__EPACKAGE);
		}
		return eClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EPackage> getESubpackages() {
		if (eSubpackages == null) {
			eSubpackages = new EObjectContainmentWithInverseEList<EPackage>(EPackage.class, this, EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES, EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE);
		}
		return eSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getESuperPackage() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE) return null;
		return (EPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_eFactoryInstance> getDiffeFactoryInstance() {
		if (diffeFactoryInstance == null) {
			diffeFactoryInstance = new EObjectContainmentEList<DiffEPackage_eFactoryInstance>(DiffEPackage_eFactoryInstance.class, this, EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE);
		}
		return diffeFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_eClassifiers> getDiffeClassifiers() {
		if (diffeClassifiers == null) {
			diffeClassifiers = new EObjectContainmentEList<DiffEPackage_eClassifiers>(DiffEPackage_eClassifiers.class, this, EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS);
		}
		return diffeClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_eSubpackages> getDiffeSubpackages() {
		if (diffeSubpackages == null) {
			diffeSubpackages = new EObjectContainmentEList<DiffEPackage_eSubpackages>(DiffEPackage_eSubpackages.class, this, EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES);
		}
		return diffeSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_eSuperPackage> getDiffeSuperPackage() {
		if (diffeSuperPackage == null) {
			diffeSuperPackage = new EObjectContainmentEList<DiffEPackage_eSuperPackage>(DiffEPackage_eSuperPackage.class, this, EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE);
		}
		return diffeSuperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffEPackage_domainspecificdiffs>(DiffEPackage_domainspecificdiffs.class, this, EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS);
		}
		return diffdomainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getEClassifier(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				if (eFactoryInstance != null)
					msgs = ((InternalEObject)eFactoryInstance).eInverseRemove(this, EcoreDiffMMPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
				return basicSetEFactoryInstance((EFactory)otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEClassifiers()).basicAdd(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getESubpackages()).basicAdd(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE, msgs);
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
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				return basicSetEFactoryInstance(null, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<?>)getEClassifiers()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				return ((InternalEList<?>)getESubpackages()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE:
				return eBasicSetContainer(null, EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE:
				return ((InternalEList<?>)getDiffeFactoryInstance()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS:
				return ((InternalEList<?>)getDiffeClassifiers()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES:
				return ((InternalEList<?>)getDiffeSubpackages()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE:
				return ((InternalEList<?>)getDiffeSuperPackage()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDiffdomainspecificdiffs()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES, EPackage.class, msgs);
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
			case EcoreDiffMMPackage.EPACKAGE__NS_URI:
				return getNsURI();
			case EcoreDiffMMPackage.EPACKAGE__NS_PREFIX:
				return getNsPrefix();
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				return getEFactoryInstance();
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return getEClassifiers();
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				return getESubpackages();
			case EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE:
				return getESuperPackage();
			case EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE:
				return getDiffeFactoryInstance();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS:
				return getDiffeClassifiers();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES:
				return getDiffeSubpackages();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE:
				return getDiffeSuperPackage();
			case EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return getDiffdomainspecificdiffs();
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
			case EcoreDiffMMPackage.EPACKAGE__NS_URI:
				setNsURI((String)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				setEFactoryInstance((EFactory)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				getEClassifiers().clear();
				getEClassifiers().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				getESubpackages().clear();
				getESubpackages().addAll((Collection<? extends EPackage>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE:
				getDiffeFactoryInstance().clear();
				getDiffeFactoryInstance().addAll((Collection<? extends DiffEPackage_eFactoryInstance>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS:
				getDiffeClassifiers().clear();
				getDiffeClassifiers().addAll((Collection<? extends DiffEPackage_eClassifiers>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES:
				getDiffeSubpackages().clear();
				getDiffeSubpackages().addAll((Collection<? extends DiffEPackage_eSubpackages>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE:
				getDiffeSuperPackage().clear();
				getDiffeSuperPackage().addAll((Collection<? extends DiffEPackage_eSuperPackage>)newValue);
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffEPackage_domainspecificdiffs>)newValue);
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
			case EcoreDiffMMPackage.EPACKAGE__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EPACKAGE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				setEFactoryInstance((EFactory)null);
				return;
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				getEClassifiers().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				getESubpackages().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE:
				getDiffeFactoryInstance().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS:
				getDiffeClassifiers().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES:
				getDiffeSubpackages().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE:
				getDiffeSuperPackage().clear();
				return;
			case EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
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
			case EcoreDiffMMPackage.EPACKAGE__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
			case EcoreDiffMMPackage.EPACKAGE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case EcoreDiffMMPackage.EPACKAGE__EFACTORY_INSTANCE:
				return eFactoryInstance != null;
			case EcoreDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return eClassifiers != null && !eClassifiers.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__ESUBPACKAGES:
				return eSubpackages != null && !eSubpackages.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__ESUPER_PACKAGE:
				return getESuperPackage() != null;
			case EcoreDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_FACTORY_INSTANCE:
				return diffeFactoryInstance != null && !diffeFactoryInstance.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_CLASSIFIERS:
				return diffeClassifiers != null && !diffeClassifiers.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUBPACKAGES:
				return diffeSubpackages != null && !diffeSubpackages.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__DIFFE_SUPER_PACKAGE:
				return diffeSuperPackage != null && !diffeSuperPackage.isEmpty();
			case EcoreDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
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
			case EcoreDiffMMPackage.EPACKAGE___GET_ECLASSIFIER__STRING:
				return getEClassifier((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (nsURI: ");
		result.append(nsURI);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(')');
		return result.toString();
	}

} //EPackageImpl
