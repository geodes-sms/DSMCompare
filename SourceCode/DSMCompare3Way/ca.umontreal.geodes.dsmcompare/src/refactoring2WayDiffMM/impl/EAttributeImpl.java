/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import refactoring2WayDiffMM.EAttribute;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.impl.EAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.EAttributeImpl#getEtype <em>Etype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeImpl extends MinimalEObjectImpl.Container implements EAttribute {
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
	 * The default value of the '{@link #getEtype() <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtype()
	 * @generated
	 * @ordered
	 */
	protected static final String ETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtype() <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtype()
	 * @generated
	 * @ordered
	 */
	protected String etype = ETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Refactoring2WayDiffMMPackage.Literals.EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtype() {
		return etype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtype(String newEtype) {
		String oldEtype = etype;
		etype = newEtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE, oldEtype, etype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME:
				return getName();
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE:
				return getEtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE:
				setEtype((String)newValue);
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
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE:
				setEtype(ETYPE_EDEFAULT);
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
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Refactoring2WayDiffMMPackage.EATTRIBUTE__ETYPE:
				return ETYPE_EDEFAULT == null ? etype != null : !ETYPE_EDEFAULT.equals(etype);
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
		result.append(", etype: ");
		result.append(etype);
		result.append(')');
		return result.toString();
	}

} //EAttributeImpl
