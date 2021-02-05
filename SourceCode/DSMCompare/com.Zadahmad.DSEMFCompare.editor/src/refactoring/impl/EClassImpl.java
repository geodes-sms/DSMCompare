/**
 */
package refactoring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import refactoring.EAttribute;
import refactoring.EClass;
import refactoring.EOperation;
import refactoring.EReference;
import refactoring.RefactoringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring.impl.EClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEsupertypes <em>Esupertypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassImpl extends MinimalEObjectImpl.Container implements EClass {
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
	 * The cached value of the '{@link #getEattributes() <em>Eattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eattributes;

	/**
	 * The cached value of the '{@link #getEoperations() <em>Eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eoperations;

	/**
	 * The cached value of the '{@link #getEreferences() <em>Ereferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> ereferences;

	/**
	 * The cached value of the '{@link #getEsupertypes() <em>Esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> esupertypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return RefactoringPackage.Literals.ECLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getEattributes() {
		if (eattributes == null) {
			eattributes = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, RefactoringPackage.ECLASS__EATTRIBUTES);
		}
		return eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getEoperations() {
		if (eoperations == null) {
			eoperations = new EObjectContainmentEList<EOperation>(EOperation.class, this, RefactoringPackage.ECLASS__EOPERATIONS);
		}
		return eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getEreferences() {
		if (ereferences == null) {
			ereferences = new EObjectContainmentEList<EReference>(EReference.class, this, RefactoringPackage.ECLASS__EREFERENCES);
		}
		return ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getEsupertypes() {
		if (esupertypes == null) {
			esupertypes = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringPackage.ECLASS__ESUPERTYPES);
		}
		return esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				return ((InternalEList<?>)getEattributes()).basicRemove(otherEnd, msgs);
			case RefactoringPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEoperations()).basicRemove(otherEnd, msgs);
			case RefactoringPackage.ECLASS__EREFERENCES:
				return ((InternalEList<?>)getEreferences()).basicRemove(otherEnd, msgs);
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
			case RefactoringPackage.ECLASS__NAME:
				return getName();
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				return getEattributes();
			case RefactoringPackage.ECLASS__EOPERATIONS:
				return getEoperations();
			case RefactoringPackage.ECLASS__EREFERENCES:
				return getEreferences();
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				return getEsupertypes();
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
			case RefactoringPackage.ECLASS__NAME:
				setName((String)newValue);
				return;
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				getEattributes().clear();
				getEattributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case RefactoringPackage.ECLASS__EOPERATIONS:
				getEoperations().clear();
				getEoperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RefactoringPackage.ECLASS__EREFERENCES:
				getEreferences().clear();
				getEreferences().addAll((Collection<? extends EReference>)newValue);
				return;
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
				getEsupertypes().addAll((Collection<? extends EClass>)newValue);
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
			case RefactoringPackage.ECLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				getEattributes().clear();
				return;
			case RefactoringPackage.ECLASS__EOPERATIONS:
				getEoperations().clear();
				return;
			case RefactoringPackage.ECLASS__EREFERENCES:
				getEreferences().clear();
				return;
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
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
			case RefactoringPackage.ECLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				return eattributes != null && !eattributes.isEmpty();
			case RefactoringPackage.ECLASS__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringPackage.ECLASS__EREFERENCES:
				return ereferences != null && !ereferences.isEmpty();
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
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

} //EClassImpl
