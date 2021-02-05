/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffFunctionCall_definition;
import arduinoDiffMM.DiffFunctionCall_parameters;
import arduinoDiffMM.Function;
import arduinoDiffMM.FunctionCall;
import arduinoDiffMM.Parameter;

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
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.FunctionCallImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionCallImpl#getDiffdefinition <em>Diffdefinition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.FunctionCallImpl#getDiffparameters <em>Diffparameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends InstructionImpl implements FunctionCall {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Function definition;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getDiffdefinition() <em>Diffdefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFunctionCall_definition> diffdefinition;

	/**
	 * The cached value of the '{@link #getDiffparameters() <em>Diffparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFunctionCall_parameters> diffparameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Function)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(Function newDefinition) {
		Function oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffFunctionCall_definition> getDiffdefinition() {
		if (diffdefinition == null) {
			diffdefinition = new EObjectContainmentEList<DiffFunctionCall_definition>(DiffFunctionCall_definition.class, this, ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION);
		}
		return diffdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffFunctionCall_parameters> getDiffparameters() {
		if (diffparameters == null) {
			diffparameters = new EObjectContainmentEList<DiffFunctionCall_parameters>(DiffFunctionCall_parameters.class, this, ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS);
		}
		return diffparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION:
				return ((InternalEList<?>)getDiffdefinition()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS:
				return ((InternalEList<?>)getDiffparameters()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS:
				return getParameters();
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION:
				return getDiffdefinition();
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS:
				return getDiffparameters();
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
			case ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION:
				setDefinition((Function)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION:
				getDiffdefinition().clear();
				getDiffdefinition().addAll((Collection<? extends DiffFunctionCall_definition>)newValue);
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS:
				getDiffparameters().clear();
				getDiffparameters().addAll((Collection<? extends DiffFunctionCall_parameters>)newValue);
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
			case ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION:
				setDefinition((Function)null);
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION:
				getDiffdefinition().clear();
				return;
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS:
				getDiffparameters().clear();
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
			case ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION:
				return definition != null;
			case ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION:
				return diffdefinition != null && !diffdefinition.isEmpty();
			case ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS:
				return diffparameters != null && !diffparameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallImpl
