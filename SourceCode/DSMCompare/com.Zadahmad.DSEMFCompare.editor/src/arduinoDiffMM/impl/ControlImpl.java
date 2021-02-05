/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.Control;
import arduinoDiffMM.DiffControl_instructions;
import arduinoDiffMM.Instruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.ControlImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ControlImpl#getDiffinstructions <em>Diffinstructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlImpl extends InstructionImpl implements Control {
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
	 * The cached value of the '{@link #getDiffinstructions() <em>Diffinstructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffControl_instructions> diffinstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffControl_instructions> getDiffinstructions() {
		if (diffinstructions == null) {
			diffinstructions = new EObjectContainmentEList<DiffControl_instructions>(DiffControl_instructions.class, this, ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS);
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
			case ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS:
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
			case ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS:
				return getInstructions();
			case ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS:
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
			case ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS:
				getDiffinstructions().clear();
				getDiffinstructions().addAll((Collection<? extends DiffControl_instructions>)newValue);
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
			case ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS:
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
			case ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS:
				return diffinstructions != null && !diffinstructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
