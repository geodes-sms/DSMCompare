/**
 */
package refactoringDiffMM.impl;

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

import refactoringDiffMM.DiffEClass_eattributes;
import refactoringDiffMM.DiffEClass_eoperations;
import refactoringDiffMM.DiffEClass_ereferences;
import refactoringDiffMM.DiffEClass_esupertypes;
import refactoringDiffMM.EAttribute;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.EReference;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffesupertypes <em>Diffesupertypes</em>}</li>
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
	 * The cached value of the '{@link #getDiffeattributes() <em>Diffeattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eattributes> diffeattributes;

	/**
	 * The cached value of the '{@link #getDiffeoperations() <em>Diffeoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eoperations> diffeoperations;

	/**
	 * The cached value of the '{@link #getDiffereferences() <em>Differeferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_ereferences> differeferences;

	/**
	 * The cached value of the '{@link #getDiffesupertypes() <em>Diffesupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffesupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_esupertypes> diffesupertypes;

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
		return RefactoringDiffMMPackage.Literals.ECLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getEattributes() {
		if (eattributes == null) {
			eattributes = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, RefactoringDiffMMPackage.ECLASS__EATTRIBUTES);
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
			eoperations = new EObjectContainmentEList<EOperation>(EOperation.class, this, RefactoringDiffMMPackage.ECLASS__EOPERATIONS);
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
			ereferences = new EObjectContainmentEList<EReference>(EReference.class, this, RefactoringDiffMMPackage.ECLASS__EREFERENCES);
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
			esupertypes = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.ECLASS__ESUPERTYPES);
		}
		return esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eattributes> getDiffeattributes() {
		if (diffeattributes == null) {
			diffeattributes = new EObjectContainmentEList<DiffEClass_eattributes>(DiffEClass_eattributes.class, this, RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES);
		}
		return diffeattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eoperations> getDiffeoperations() {
		if (diffeoperations == null) {
			diffeoperations = new EObjectContainmentEList<DiffEClass_eoperations>(DiffEClass_eoperations.class, this, RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS);
		}
		return diffeoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_ereferences> getDiffereferences() {
		if (differeferences == null) {
			differeferences = new EObjectContainmentEList<DiffEClass_ereferences>(DiffEClass_ereferences.class, this, RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES);
		}
		return differeferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_esupertypes> getDiffesupertypes() {
		if (diffesupertypes == null) {
			diffesupertypes = new EObjectContainmentEList<DiffEClass_esupertypes>(DiffEClass_esupertypes.class, this, RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES);
		}
		return diffesupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				return ((InternalEList<?>)getEattributes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEoperations()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				return ((InternalEList<?>)getEreferences()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return ((InternalEList<?>)getDiffeattributes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return ((InternalEList<?>)getDiffeoperations()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return ((InternalEList<?>)getDiffereferences()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return ((InternalEList<?>)getDiffesupertypes()).basicRemove(otherEnd, msgs);
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
			case RefactoringDiffMMPackage.ECLASS__NAME:
				return getName();
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				return getEattributes();
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				return getEoperations();
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				return getEreferences();
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return getDiffeattributes();
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return getDiffeoperations();
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return getDiffereferences();
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return getDiffesupertypes();
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
			case RefactoringDiffMMPackage.ECLASS__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				getEattributes().clear();
				getEattributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				getEoperations().clear();
				getEoperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				getEreferences().clear();
				getEreferences().addAll((Collection<? extends EReference>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
				getEsupertypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				getDiffeattributes().clear();
				getDiffeattributes().addAll((Collection<? extends DiffEClass_eattributes>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				getDiffeoperations().addAll((Collection<? extends DiffEClass_eoperations>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				getDiffereferences().clear();
				getDiffereferences().addAll((Collection<? extends DiffEClass_ereferences>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
				getDiffesupertypes().addAll((Collection<? extends DiffEClass_esupertypes>)newValue);
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
			case RefactoringDiffMMPackage.ECLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				getEattributes().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				getEoperations().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				getEreferences().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				getDiffeattributes().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				getDiffereferences().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
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
			case RefactoringDiffMMPackage.ECLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				return eattributes != null && !eattributes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				return ereferences != null && !ereferences.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return diffeattributes != null && !diffeattributes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return diffeoperations != null && !diffeoperations.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return differeferences != null && !differeferences.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return diffesupertypes != null && !diffesupertypes.isEmpty();
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
