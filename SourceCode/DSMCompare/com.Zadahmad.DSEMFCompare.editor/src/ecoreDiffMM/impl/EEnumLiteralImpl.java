/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEEnumLiteral_eEnum;
import ecoreDiffMM.EEnum;
import ecoreDiffMM.EEnumLiteral;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EEnumLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EEnumLiteralImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EEnumLiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EEnumLiteralImpl#getEEnum <em>EEnum</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EEnumLiteralImpl#getDiffeEnum <em>Diffe Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEnumLiteralImpl extends ENamedElementImpl implements EEnumLiteral {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Enumerator instance = INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffeEnum() <em>Diffe Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEEnumLiteral_eEnum> diffeEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEEnumLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EENUM_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerator getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstance(Enumerator newInstance) {
		Enumerator oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EENUM_LITERAL__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEEnum() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.EENUM_LITERAL__EENUM) return null;
		return (EEnum)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEEnumLiteral_eEnum> getDiffeEnum() {
		if (diffeEnum == null) {
			diffeEnum = new EObjectContainmentEList<DiffEEnumLiteral_eEnum>(DiffEEnumLiteral_eEnum.class, this, EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM);
		}
		return diffeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EENUM_LITERAL__EENUM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoreDiffMMPackage.EENUM_LITERAL__EENUM, msgs);
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
			case EcoreDiffMMPackage.EENUM_LITERAL__EENUM:
				return eBasicSetContainer(null, EcoreDiffMMPackage.EENUM_LITERAL__EENUM, msgs);
			case EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM:
				return ((InternalEList<?>)getDiffeEnum()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EENUM_LITERAL__EENUM:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.EENUM__ELITERALS, EEnum.class, msgs);
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
			case EcoreDiffMMPackage.EENUM_LITERAL__VALUE:
				return getValue();
			case EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE:
				return getInstance();
			case EcoreDiffMMPackage.EENUM_LITERAL__LITERAL:
				return getLiteral();
			case EcoreDiffMMPackage.EENUM_LITERAL__EENUM:
				return getEEnum();
			case EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM:
				return getDiffeEnum();
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
			case EcoreDiffMMPackage.EENUM_LITERAL__VALUE:
				setValue((Integer)newValue);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE:
				setInstance((Enumerator)newValue);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__LITERAL:
				setLiteral((String)newValue);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM:
				getDiffeEnum().clear();
				getDiffeEnum().addAll((Collection<? extends DiffEEnumLiteral_eEnum>)newValue);
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
			case EcoreDiffMMPackage.EENUM_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE:
				setInstance(INSTANCE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM:
				getDiffeEnum().clear();
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
			case EcoreDiffMMPackage.EENUM_LITERAL__VALUE:
				return value != VALUE_EDEFAULT;
			case EcoreDiffMMPackage.EENUM_LITERAL__INSTANCE:
				return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
			case EcoreDiffMMPackage.EENUM_LITERAL__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case EcoreDiffMMPackage.EENUM_LITERAL__EENUM:
				return getEEnum() != null;
			case EcoreDiffMMPackage.EENUM_LITERAL__DIFFE_ENUM:
				return diffeEnum != null && !diffeEnum.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", instance: ");
		result.append(instance);
		result.append(", literal: ");
		result.append(literal);
		result.append(')');
		return result.toString();
	}

} //EEnumLiteralImpl
