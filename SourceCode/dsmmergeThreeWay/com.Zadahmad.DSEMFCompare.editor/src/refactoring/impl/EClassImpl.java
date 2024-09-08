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
import refactoring.Interface;
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
 *   <li>{@link refactoring.impl.EClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoring.impl.EClassImpl#getNested_interfaces <em>Nested interfaces</em>}</li>
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
	 * The default value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected String implements_ = IMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getNested_classes() <em>Nested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> nested_classes;

	/**
	 * The cached value of the '{@link #getNested_interfaces() <em>Nested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> nested_interfaces;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(String newImplements) {
		String oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.ECLASS__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Interface>(Interface.class, this, RefactoringPackage.ECLASS__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getNested_classes() {
		if (nested_classes == null) {
			nested_classes = new EObjectContainmentEList<EClass>(EClass.class, this, RefactoringPackage.ECLASS__NESTED_CLASSES);
		}
		return nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getNested_interfaces() {
		if (nested_interfaces == null) {
			nested_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, RefactoringPackage.ECLASS__NESTED_INTERFACES);
		}
		return nested_interfaces;
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
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
				return ((InternalEList<?>)getNested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
				return ((InternalEList<?>)getNested_interfaces()).basicRemove(otherEnd, msgs);
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
			case RefactoringPackage.ECLASS__EXTENDS:
				return getExtends();
			case RefactoringPackage.ECLASS__IMPLEMENTS:
				return getImplements();
			case RefactoringPackage.ECLASS__IS_ABSTRACT:
				return isIsAbstract();
			case RefactoringPackage.ECLASS__PACKAGE_NAME:
				return getPackageName();
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				return getEattributes();
			case RefactoringPackage.ECLASS__EOPERATIONS:
				return getEoperations();
			case RefactoringPackage.ECLASS__EREFERENCES:
				return getEreferences();
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringPackage.ECLASS__INTERFACES:
				return getInterfaces();
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
				return getNested_classes();
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
				return getNested_interfaces();
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
			case RefactoringPackage.ECLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case RefactoringPackage.ECLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case RefactoringPackage.ECLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case RefactoringPackage.ECLASS__PACKAGE_NAME:
				setPackageName((String)newValue);
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
			case RefactoringPackage.ECLASS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				getNested_classes().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
				getNested_interfaces().addAll((Collection<? extends Interface>)newValue);
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
			case RefactoringPackage.ECLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RefactoringPackage.ECLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case RefactoringPackage.ECLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case RefactoringPackage.ECLASS__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
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
			case RefactoringPackage.ECLASS__INTERFACES:
				getInterfaces().clear();
				return;
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				return;
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
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
			case RefactoringPackage.ECLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RefactoringPackage.ECLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case RefactoringPackage.ECLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case RefactoringPackage.ECLASS__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RefactoringPackage.ECLASS__EATTRIBUTES:
				return eattributes != null && !eattributes.isEmpty();
			case RefactoringPackage.ECLASS__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringPackage.ECLASS__EREFERENCES:
				return ereferences != null && !ereferences.isEmpty();
			case RefactoringPackage.ECLASS__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringPackage.ECLASS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case RefactoringPackage.ECLASS__NESTED_CLASSES:
				return nested_classes != null && !nested_classes.isEmpty();
			case RefactoringPackage.ECLASS__NESTED_INTERFACES:
				return nested_interfaces != null && !nested_interfaces.isEmpty();
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
		result.append(", implements: ");
		result.append(implements_);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //EClassImpl
