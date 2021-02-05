/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Connector;
import arduinoDiffMM.DiffHardware_connectors;
import arduinoDiffMM.DiffHardware_modules;
import arduinoDiffMM.DiffHardware_platforms;
import arduinoDiffMM.Hardware;
import arduinoDiffMM.Platform;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getDiffplatforms <em>Diffplatforms</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getDiffmodules <em>Diffmodules</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.HardwareImpl#getDiffconnectors <em>Diffconnectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareImpl extends NamedElementImpl implements Hardware {
	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platforms;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<arduinoDiffMM.Module> modules;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getDiffplatforms() <em>Diffplatforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffHardware_platforms> diffplatforms;

	/**
	 * The cached value of the '{@link #getDiffmodules() <em>Diffmodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffHardware_modules> diffmodules;

	/**
	 * The cached value of the '{@link #getDiffconnectors() <em>Diffconnectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffconnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffHardware_connectors> diffconnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.HARDWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Platform> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectResolvingEList<Platform>(Platform.class, this, ArduinoDiffMMPackage.HARDWARE__PLATFORMS);
		}
		return platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<arduinoDiffMM.Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<arduinoDiffMM.Module>(arduinoDiffMM.Module.class, this, ArduinoDiffMMPackage.HARDWARE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, ArduinoDiffMMPackage.HARDWARE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffHardware_platforms> getDiffplatforms() {
		if (diffplatforms == null) {
			diffplatforms = new EObjectContainmentEList<DiffHardware_platforms>(DiffHardware_platforms.class, this, ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS);
		}
		return diffplatforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffHardware_modules> getDiffmodules() {
		if (diffmodules == null) {
			diffmodules = new EObjectContainmentEList<DiffHardware_modules>(DiffHardware_modules.class, this, ArduinoDiffMMPackage.HARDWARE__DIFFMODULES);
		}
		return diffmodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffHardware_connectors> getDiffconnectors() {
		if (diffconnectors == null) {
			diffconnectors = new EObjectContainmentEList<DiffHardware_connectors>(DiffHardware_connectors.class, this, ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS);
		}
		return diffconnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
				return ((InternalEList<?>)getDiffplatforms()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
				return ((InternalEList<?>)getDiffmodules()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				return ((InternalEList<?>)getDiffconnectors()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.HARDWARE__PLATFORMS:
				return getPlatforms();
			case ArduinoDiffMMPackage.HARDWARE__MODULES:
				return getModules();
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
				return getConnectors();
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
				return getDiffplatforms();
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
				return getDiffmodules();
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				return getDiffconnectors();
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
			case ArduinoDiffMMPackage.HARDWARE__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends Platform>)newValue);
				return;
			case ArduinoDiffMMPackage.HARDWARE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends arduinoDiffMM.Module>)newValue);
				return;
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
				getDiffplatforms().clear();
				getDiffplatforms().addAll((Collection<? extends DiffHardware_platforms>)newValue);
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
				getDiffmodules().clear();
				getDiffmodules().addAll((Collection<? extends DiffHardware_modules>)newValue);
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				getDiffconnectors().clear();
				getDiffconnectors().addAll((Collection<? extends DiffHardware_connectors>)newValue);
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
			case ArduinoDiffMMPackage.HARDWARE__PLATFORMS:
				getPlatforms().clear();
				return;
			case ArduinoDiffMMPackage.HARDWARE__MODULES:
				getModules().clear();
				return;
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
				getConnectors().clear();
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
				getDiffplatforms().clear();
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
				getDiffmodules().clear();
				return;
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				getDiffconnectors().clear();
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
			case ArduinoDiffMMPackage.HARDWARE__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
			case ArduinoDiffMMPackage.HARDWARE__MODULES:
				return modules != null && !modules.isEmpty();
			case ArduinoDiffMMPackage.HARDWARE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS:
				return diffplatforms != null && !diffplatforms.isEmpty();
			case ArduinoDiffMMPackage.HARDWARE__DIFFMODULES:
				return diffmodules != null && !diffmodules.isEmpty();
			case ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS:
				return diffconnectors != null && !diffconnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareImpl
