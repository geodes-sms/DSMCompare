/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffModuleInstruction_module;
import arduinoDiffMM.DiffParameter_to_definition;
import arduinoDiffMM.ModuleInstruction;
import arduinoDiffMM.Parameter;
import arduinoDiffMM.ParameterDefinition;

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
 * An implementation of the model object '<em><b>Module Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.ModuleInstructionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ModuleInstructionImpl#getDiffdefinition <em>Diffdefinition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ModuleInstructionImpl#getModule <em>Module</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ModuleInstructionImpl#getDiffmodule <em>Diffmodule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModuleInstructionImpl extends InstructionImpl implements ModuleInstruction {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition definition;

	/**
	 * The cached value of the '{@link #getDiffdefinition() <em>Diffdefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffParameter_to_definition> diffdefinition;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected arduinoDiffMM.Module module;

	/**
	 * The cached value of the '{@link #getDiffmodule() <em>Diffmodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffModuleInstruction_module> diffmodule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.MODULE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (ParameterDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(ParameterDefinition newDefinition) {
		ParameterDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffParameter_to_definition> getDiffdefinition() {
		if (diffdefinition == null) {
			diffdefinition = new EObjectContainmentEList<DiffParameter_to_definition>(DiffParameter_to_definition.class, this, ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION);
		}
		return diffdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public arduinoDiffMM.Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (arduinoDiffMM.Module)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arduinoDiffMM.Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(arduinoDiffMM.Module newModule) {
		arduinoDiffMM.Module oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffModuleInstruction_module> getDiffmodule() {
		if (diffmodule == null) {
			diffmodule = new EObjectContainmentEList<DiffModuleInstruction_module>(DiffModuleInstruction_module.class, this, ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE);
		}
		return diffmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION:
				return ((InternalEList<?>)getDiffdefinition()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE:
				return ((InternalEList<?>)getDiffmodule()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION:
				return getDiffdefinition();
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE:
				return getDiffmodule();
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
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION:
				setDefinition((ParameterDefinition)newValue);
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION:
				getDiffdefinition().clear();
				getDiffdefinition().addAll((Collection<? extends DiffParameter_to_definition>)newValue);
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE:
				setModule((arduinoDiffMM.Module)newValue);
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE:
				getDiffmodule().clear();
				getDiffmodule().addAll((Collection<? extends DiffModuleInstruction_module>)newValue);
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
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION:
				setDefinition((ParameterDefinition)null);
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION:
				getDiffdefinition().clear();
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE:
				setModule((arduinoDiffMM.Module)null);
				return;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE:
				getDiffmodule().clear();
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
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION:
				return definition != null;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION:
				return diffdefinition != null && !diffdefinition.isEmpty();
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE:
				return module != null;
			case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE:
				return diffmodule != null && !diffmodule.isEmpty();
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
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION: return ArduinoDiffMMPackage.PARAMETER__DEFINITION;
				case ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION: return ArduinoDiffMMPackage.PARAMETER__DIFFDEFINITION;
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
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case ArduinoDiffMMPackage.PARAMETER__DEFINITION: return ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION;
				case ArduinoDiffMMPackage.PARAMETER__DIFFDEFINITION: return ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModuleInstructionImpl
