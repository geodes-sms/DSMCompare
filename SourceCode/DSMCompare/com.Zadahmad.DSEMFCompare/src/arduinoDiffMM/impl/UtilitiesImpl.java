/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffParameter_to_definition;
import arduinoDiffMM.Parameter;
import arduinoDiffMM.ParameterDefinition;
import arduinoDiffMM.Utilities;

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
 * An implementation of the model object '<em><b>Utilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.UtilitiesImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.UtilitiesImpl#getDiffdefinition <em>Diffdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UtilitiesImpl extends InstructionImpl implements Utilities {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (ParameterDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.UTILITIES__DEFINITION, oldDefinition, definition));
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
	public void setDefinition(ParameterDefinition newDefinition) {
		ParameterDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.UTILITIES__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffParameter_to_definition> getDiffdefinition() {
		if (diffdefinition == null) {
			diffdefinition = new EObjectContainmentEList<DiffParameter_to_definition>(DiffParameter_to_definition.class, this, ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION);
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
			case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION:
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
			case ArduinoDiffMMPackage.UTILITIES__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION:
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
			case ArduinoDiffMMPackage.UTILITIES__DEFINITION:
				setDefinition((ParameterDefinition)newValue);
				return;
			case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION:
				getDiffdefinition().clear();
				getDiffdefinition().addAll((Collection<? extends DiffParameter_to_definition>)newValue);
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
			case ArduinoDiffMMPackage.UTILITIES__DEFINITION:
				setDefinition((ParameterDefinition)null);
				return;
			case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION:
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
			case ArduinoDiffMMPackage.UTILITIES__DEFINITION:
				return definition != null;
			case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION:
				return diffdefinition != null && !diffdefinition.isEmpty();
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
				case ArduinoDiffMMPackage.UTILITIES__DEFINITION: return ArduinoDiffMMPackage.PARAMETER__DEFINITION;
				case ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION: return ArduinoDiffMMPackage.PARAMETER__DIFFDEFINITION;
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
				case ArduinoDiffMMPackage.PARAMETER__DEFINITION: return ArduinoDiffMMPackage.UTILITIES__DEFINITION;
				case ArduinoDiffMMPackage.PARAMETER__DIFFDEFINITION: return ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UtilitiesImpl
