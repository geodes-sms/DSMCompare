/**
 */
package refactoring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import refactoring.EClass;
import refactoring.RefactoringPackage;
import refactoring.testAssociations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>test Associations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring.impl.testAssociationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.impl.testAssociationsImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoring.impl.testAssociationsImpl#getMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class testAssociationsImpl extends MinimalEObjectImpl.Container implements testAssociations {
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
	 * The cached value of the '{@link #getSingle() <em>Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected EClass single;

	/**
	 * The cached value of the '{@link #getMulti() <em>Multi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulti()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> multi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testAssociationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return RefactoringPackage.Literals.TEST_ASSOCIATIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.TEST_ASSOCIATIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingle() {
		if (single != null && single.eIsProxy()) {
			InternalEObject oldSingle = (InternalEObject)single;
			single = (EClass)eResolveProxy(oldSingle);
			if (single != oldSingle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringPackage.TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
			}
		}
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetSingle() {
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(EClass newSingle) {
		EClass oldSingle = single;
		single = newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getMulti() {
		if (multi == null) {
			multi = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringPackage.TEST_ASSOCIATIONS__MULTI);
		}
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.TEST_ASSOCIATIONS__NAME:
				return getName();
			case RefactoringPackage.TEST_ASSOCIATIONS__SINGLE:
				if (resolve) return getSingle();
				return basicGetSingle();
			case RefactoringPackage.TEST_ASSOCIATIONS__MULTI:
				return getMulti();
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
			case RefactoringPackage.TEST_ASSOCIATIONS__NAME:
				setName((String)newValue);
				return;
			case RefactoringPackage.TEST_ASSOCIATIONS__SINGLE:
				setSingle((EClass)newValue);
				return;
			case RefactoringPackage.TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
				getMulti().addAll((Collection<? extends EClass>)newValue);
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
			case RefactoringPackage.TEST_ASSOCIATIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringPackage.TEST_ASSOCIATIONS__SINGLE:
				setSingle((EClass)null);
				return;
			case RefactoringPackage.TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
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
			case RefactoringPackage.TEST_ASSOCIATIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringPackage.TEST_ASSOCIATIONS__SINGLE:
				return single != null;
			case RefactoringPackage.TEST_ASSOCIATIONS__MULTI:
				return multi != null && !multi.isEmpty();
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

} //testAssociationsImpl
