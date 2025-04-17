/**
 */
package refactoringDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import refactoringDiffMM.DiffInterface_eoperations;
import refactoringDiffMM.DiffInterface_esupertypes;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.Interface;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.InterfaceImpl#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
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
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getEsupertypes() <em>Esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> esupertypes;

	/**
	 * The cached value of the '{@link #getDiffeoperations() <em>Diffeoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_eoperations> diffeoperations;

	/**
	 * The cached value of the '{@link #getDiffesupertypes() <em>Diffesupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffesupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_esupertypes> diffesupertypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.INTERFACE__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.INTERFACE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getEoperations() {
		if (eoperations == null) {
			eoperations = new EObjectContainmentEList<EOperation>(EOperation.class, this, RefactoringDiffMMPackage.INTERFACE__EOPERATIONS);
		}
		return eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getEsupertypes() {
		if (esupertypes == null) {
			esupertypes = new EObjectResolvingEList<Interface>(Interface.class, this, RefactoringDiffMMPackage.INTERFACE__ESUPERTYPES);
		}
		return esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_eoperations> getDiffeoperations() {
		if (diffeoperations == null) {
			diffeoperations = new EObjectContainmentEList<DiffInterface_eoperations>(DiffInterface_eoperations.class, this, RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS);
		}
		return diffeoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_esupertypes> getDiffesupertypes() {
		if (diffesupertypes == null) {
			diffesupertypes = new EObjectContainmentEList<DiffInterface_esupertypes>(DiffInterface_esupertypes.class, this, RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES);
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
			case RefactoringDiffMMPackage.INTERFACE__EOPERATIONS:
				return ((InternalEList<?>)getEoperations()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS:
				return ((InternalEList<?>)getDiffeoperations()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringDiffMMPackage.INTERFACE__NAME:
				return getName();
			case RefactoringDiffMMPackage.INTERFACE__EXTENDS:
				return getExtends();
			case RefactoringDiffMMPackage.INTERFACE__PACKAGE_NAME:
				return getPackageName();
			case RefactoringDiffMMPackage.INTERFACE__EOPERATIONS:
				return getEoperations();
			case RefactoringDiffMMPackage.INTERFACE__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS:
				return getDiffeoperations();
			case RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringDiffMMPackage.INTERFACE__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__EXTENDS:
				setExtends((String)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__EOPERATIONS:
				getEoperations().clear();
				getEoperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__ESUPERTYPES:
				getEsupertypes().clear();
				getEsupertypes().addAll((Collection<? extends Interface>)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				getDiffeoperations().addAll((Collection<? extends DiffInterface_eoperations>)newValue);
				return;
			case RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
				getDiffesupertypes().addAll((Collection<? extends DiffInterface_esupertypes>)newValue);
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
			case RefactoringDiffMMPackage.INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.INTERFACE__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.INTERFACE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.INTERFACE__EOPERATIONS:
				getEoperations().clear();
				return;
			case RefactoringDiffMMPackage.INTERFACE__ESUPERTYPES:
				getEsupertypes().clear();
				return;
			case RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				return;
			case RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringDiffMMPackage.INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.INTERFACE__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RefactoringDiffMMPackage.INTERFACE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RefactoringDiffMMPackage.INTERFACE__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringDiffMMPackage.INTERFACE__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringDiffMMPackage.INTERFACE__DIFFEOPERATIONS:
				return diffeoperations != null && !diffeoperations.isEmpty();
			case RefactoringDiffMMPackage.INTERFACE__DIFFESUPERTYPES:
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
		result.append(", extends: ");
		result.append(extends_);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
