/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffProject_domainspecificdiffs;
import arduinoDiffMM.DiffProject_hardware;
import arduinoDiffMM.DiffProject_modules;
import arduinoDiffMM.DiffProject_platform;
import arduinoDiffMM.DiffProject_sketch;
import arduinoDiffMM.DomainSpecificDiff;
import arduinoDiffMM.Hardware;
import arduinoDiffMM.Platform;
import arduinoDiffMM.Project;
import arduinoDiffMM.Sketch;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getSketch <em>Sketch</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDiffhardware <em>Diffhardware</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDiffsketch <em>Diffsketch</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDiffmodules <em>Diffmodules</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDiffplatform <em>Diffplatform</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ProjectImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected Hardware hardware;

	/**
	 * The cached value of the '{@link #getSketch() <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSketch()
	 * @generated
	 * @ordered
	 */
	protected Sketch sketch;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<arduinoDiffMM.Module> modules;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platform;

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
	 * The cached value of the '{@link #getDiffhardware() <em>Diffhardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffhardware()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffProject_hardware> diffhardware;

	/**
	 * The cached value of the '{@link #getDiffsketch() <em>Diffsketch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffsketch()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffProject_sketch> diffsketch;

	/**
	 * The cached value of the '{@link #getDiffmodules() <em>Diffmodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffProject_modules> diffmodules;

	/**
	 * The cached value of the '{@link #getDiffplatform() <em>Diffplatform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplatform()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffProject_platform> diffplatform;

	/**
	 * The cached value of the '{@link #getDiffdomainspecificdiffs() <em>Diffdomainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffProject_domainspecificdiffs> diffdomainspecificdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardware(Hardware newHardware, NotificationChain msgs) {
		Hardware oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PROJECT__HARDWARE, oldHardware, newHardware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(Hardware newHardware) {
		if (newHardware != hardware) {
			NotificationChain msgs = null;
			if (hardware != null)
				msgs = ((InternalEObject)hardware).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoDiffMMPackage.PROJECT__HARDWARE, null, msgs);
			if (newHardware != null)
				msgs = ((InternalEObject)newHardware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoDiffMMPackage.PROJECT__HARDWARE, null, msgs);
			msgs = basicSetHardware(newHardware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PROJECT__HARDWARE, newHardware, newHardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch getSketch() {
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSketch(Sketch newSketch, NotificationChain msgs) {
		Sketch oldSketch = sketch;
		sketch = newSketch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PROJECT__SKETCH, oldSketch, newSketch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSketch(Sketch newSketch) {
		if (newSketch != sketch) {
			NotificationChain msgs = null;
			if (sketch != null)
				msgs = ((InternalEObject)sketch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoDiffMMPackage.PROJECT__SKETCH, null, msgs);
			if (newSketch != null)
				msgs = ((InternalEObject)newSketch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoDiffMMPackage.PROJECT__SKETCH, null, msgs);
			msgs = basicSetSketch(newSketch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PROJECT__SKETCH, newSketch, newSketch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<arduinoDiffMM.Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<arduinoDiffMM.Module>(arduinoDiffMM.Module.class, this, ArduinoDiffMMPackage.PROJECT__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Platform> getPlatform() {
		if (platform == null) {
			platform = new EObjectContainmentEList<Platform>(Platform.class, this, ArduinoDiffMMPackage.PROJECT__PLATFORM);
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffProject_hardware> getDiffhardware() {
		if (diffhardware == null) {
			diffhardware = new EObjectContainmentEList<DiffProject_hardware>(DiffProject_hardware.class, this, ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE);
		}
		return diffhardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffProject_sketch> getDiffsketch() {
		if (diffsketch == null) {
			diffsketch = new EObjectContainmentEList<DiffProject_sketch>(DiffProject_sketch.class, this, ArduinoDiffMMPackage.PROJECT__DIFFSKETCH);
		}
		return diffsketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffProject_modules> getDiffmodules() {
		if (diffmodules == null) {
			diffmodules = new EObjectContainmentEList<DiffProject_modules>(DiffProject_modules.class, this, ArduinoDiffMMPackage.PROJECT__DIFFMODULES);
		}
		return diffmodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffProject_platform> getDiffplatform() {
		if (diffplatform == null) {
			diffplatform = new EObjectContainmentEList<DiffProject_platform>(DiffProject_platform.class, this, ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM);
		}
		return diffplatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffProject_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffProject_domainspecificdiffs>(DiffProject_domainspecificdiffs.class, this, ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS);
		}
		return diffdomainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
				return basicSetHardware(null, msgs);
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
				return basicSetSketch(null, msgs);
			case ArduinoDiffMMPackage.PROJECT__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
				return ((InternalEList<?>)getPlatform()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
				return ((InternalEList<?>)getDiffhardware()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
				return ((InternalEList<?>)getDiffsketch()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
				return ((InternalEList<?>)getDiffmodules()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
				return ((InternalEList<?>)getDiffplatform()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
				return getHardware();
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
				return getSketch();
			case ArduinoDiffMMPackage.PROJECT__MODULES:
				return getModules();
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
				return getPlatform();
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
				return getDiffhardware();
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
				return getDiffsketch();
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
				return getDiffmodules();
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
				return getDiffplatform();
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
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
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
				setHardware((Hardware)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
				setSketch((Sketch)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends arduinoDiffMM.Module>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
				getPlatform().clear();
				getPlatform().addAll((Collection<? extends Platform>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
				getDiffhardware().clear();
				getDiffhardware().addAll((Collection<? extends DiffProject_hardware>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
				getDiffsketch().clear();
				getDiffsketch().addAll((Collection<? extends DiffProject_sketch>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
				getDiffmodules().clear();
				getDiffmodules().addAll((Collection<? extends DiffProject_modules>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
				getDiffplatform().clear();
				getDiffplatform().addAll((Collection<? extends DiffProject_platform>)newValue);
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffProject_domainspecificdiffs>)newValue);
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
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
				setHardware((Hardware)null);
				return;
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
				setSketch((Sketch)null);
				return;
			case ArduinoDiffMMPackage.PROJECT__MODULES:
				getModules().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
				getPlatform().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
				getDiffhardware().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
				getDiffsketch().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
				getDiffmodules().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
				getDiffplatform().clear();
				return;
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
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
			case ArduinoDiffMMPackage.PROJECT__HARDWARE:
				return hardware != null;
			case ArduinoDiffMMPackage.PROJECT__SKETCH:
				return sketch != null;
			case ArduinoDiffMMPackage.PROJECT__MODULES:
				return modules != null && !modules.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__PLATFORM:
				return platform != null && !platform.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE:
				return diffhardware != null && !diffhardware.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DIFFSKETCH:
				return diffsketch != null && !diffsketch.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DIFFMODULES:
				return diffmodules != null && !diffmodules.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM:
				return diffplatform != null && !diffplatform.isEmpty();
			case ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
