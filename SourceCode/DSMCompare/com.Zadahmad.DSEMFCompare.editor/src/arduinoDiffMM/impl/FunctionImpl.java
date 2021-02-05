/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffFunction_instructions;
import arduinoDiffMM.DiffFunction_paramDefs;
import arduinoDiffMM.Function;
import arduinoDiffMM.Instruction;
import arduinoDiffMM.ParameterDefinition;

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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionImpl#getParamDefs <em>Param Defs</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionImpl#getDiffparamDefs <em>Diffparam Defs</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionImpl#getDiffinstructions <em>Diffinstructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamDefs() <em>Param Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinition> paramDefs;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getDiffparamDefs() <em>Diffparam Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffparamDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFunction_paramDefs> diffparamDefs;

	/**
	 * The cached value of the '{@link #getDiffinstructions() <em>Diffinstructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFunction_instructions> diffinstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterDefinition> getParamDefs() {
		if (paramDefs == null) {
			paramDefs = new EObjectContainmentEList<ParameterDefinition>(ParameterDefinition.class, this, ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS);
		}
		return paramDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffFunction_paramDefs> getDiffparamDefs() {
		if (diffparamDefs == null) {
			diffparamDefs = new EObjectContainmentEList<DiffFunction_paramDefs>(DiffFunction_paramDefs.class, this, ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS);
		}
		return diffparamDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffFunction_instructions> getDiffinstructions() {
		if (diffinstructions == null) {
			diffinstructions = new EObjectContainmentEList<DiffFunction_instructions>(DiffFunction_instructions.class, this, ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS);
		}
		return diffinstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
				return ((InternalEList<?>)getParamDefs()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
				return ((InternalEList<?>)getDiffparamDefs()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
				return ((InternalEList<?>)getDiffinstructions()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.FUNCTION__NAME:
				return getName();
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
				return getParamDefs();
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
				return getInstructions();
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
				return getDiffparamDefs();
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
				return getDiffinstructions();
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
			case ArduinoDiffMMPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
				getParamDefs().clear();
				getParamDefs().addAll((Collection<? extends ParameterDefinition>)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
				getDiffparamDefs().clear();
				getDiffparamDefs().addAll((Collection<? extends DiffFunction_paramDefs>)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
				getDiffinstructions().clear();
				getDiffinstructions().addAll((Collection<? extends DiffFunction_instructions>)newValue);
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
			case ArduinoDiffMMPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
				getParamDefs().clear();
				return;
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
				getDiffparamDefs().clear();
				return;
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
				getDiffinstructions().clear();
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
			case ArduinoDiffMMPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS:
				return paramDefs != null && !paramDefs.isEmpty();
			case ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS:
				return diffparamDefs != null && !diffparamDefs.isEmpty();
			case ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS:
				return diffinstructions != null && !diffinstructions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
