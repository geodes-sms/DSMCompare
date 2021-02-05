/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffParameterCall_definition;
import arduinoDiffMM.ParameterCall;
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
 * An implementation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.ParameterCallImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.ParameterCallImpl#getDiffdefinition <em>Diffdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterCallImpl extends InstructionImpl implements ParameterCall {
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
	protected EList<DiffParameterCall_definition> diffdefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.PARAMETER_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffParameterCall_definition> getDiffdefinition() {
		if (diffdefinition == null) {
			diffdefinition = new EObjectContainmentEList<DiffParameterCall_definition>(DiffParameterCall_definition.class, this, ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION);
		}
		return diffdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION:
				return ((InternalEList<?>)getDiffdefinition()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION:
				return getDiffdefinition();
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
			case ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION:
				setDefinition((ParameterDefinition)newValue);
				return;
			case ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION:
				getDiffdefinition().clear();
				getDiffdefinition().addAll((Collection<? extends DiffParameterCall_definition>)newValue);
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
			case ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION:
				setDefinition((ParameterDefinition)null);
				return;
			case ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION:
				getDiffdefinition().clear();
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
			case ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION:
				return definition != null;
			case ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION:
				return diffdefinition != null && !diffdefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterCallImpl
