/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEStructuralFeature_eContainingClass;
import ecoreDiffMM.EStructuralFeature;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EStructuralFeatureImpl#getDiffeContainingClass <em>Diffe Containing Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EStructuralFeatureImpl extends ETypedElementImpl implements EStructuralFeature {
	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean unsettable = UNSETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffeContainingClass() <em>Diffe Containing Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeContainingClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEStructuralFeature_eContainingClass> diffeContainingClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEStructuralFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDefaultValue() {
		// TODO: implement this method to return the 'Default Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsettable() {
		return unsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsettable(boolean newUnsettable) {
		boolean oldUnsettable = unsettable;
		unsettable = newUnsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE, oldUnsettable, unsettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS) return null;
		return (ecoreDiffMM.EClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEStructuralFeature_eContainingClass> getDiffeContainingClass() {
		if (diffeContainingClass == null) {
			diffeContainingClass = new EObjectContainmentEList<DiffEStructuralFeature_eContainingClass>(DiffEStructuralFeature_eContainingClass.class, this, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS);
		}
		return diffeContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFeatureID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<?> getContainerClass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return eBasicSetContainer(null, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS:
				return ((InternalEList<?>)getDiffeContainingClass()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES, ecoreDiffMM.EClass.class, msgs);
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
				return isChangeable();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE:
				return isVolatile();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT:
				return isTransient();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
				return getDefaultValue();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
				return isUnsettable();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED:
				return isDerived();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return getEContainingClass();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS:
				return getDiffeContainingClass();
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
				setUnsettable((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS:
				getDiffeContainingClass().clear();
				getDiffeContainingClass().addAll((Collection<? extends DiffEStructuralFeature_eContainingClass>)newValue);
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
				setUnsettable(UNSETTABLE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS:
				getDiffeContainingClass().clear();
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
				return unsettable != UNSETTABLE_EDEFAULT;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
				return getEContainingClass() != null;
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__DIFFE_CONTAINING_CLASS:
				return diffeContainingClass != null && !diffeContainingClass.isEmpty();
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
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE___GET_FEATURE_ID:
				return getFeatureID();
			case EcoreDiffMMPackage.ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS:
				return getContainerClass();
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
		result.append(" (changeable: ");
		result.append(changeable);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", unsettable: ");
		result.append(unsettable);
		result.append(", derived: ");
		result.append(derived);
		result.append(')');
		return result.toString();
	}

} //EStructuralFeatureImpl
