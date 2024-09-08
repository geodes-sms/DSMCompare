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
import refactoringDiffMM.DiffEClass_interfaces;
import refactoringDiffMM.DiffEClass_nested_classes;
import refactoringDiffMM.DiffEClass_nested_interfaces;
import refactoringDiffMM.EAttribute;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.EReference;
import refactoringDiffMM.Interface;
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
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getNested_interfaces <em>Nested interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffnested_classes <em>Diffnested classes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EClassImpl#getDiffnested_interfaces <em>Diffnested interfaces</em>}</li>
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
	 * The cached value of the '{@link #getDiffinterfaces() <em>Diffinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_interfaces> diffinterfaces;

	/**
	 * The cached value of the '{@link #getDiffnested_classes() <em>Diffnested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffnested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_classes> diffnested_classes;

	/**
	 * The cached value of the '{@link #getDiffnested_interfaces() <em>Diffnested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffnested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_interfaces> diffnested_interfaces;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__IMPLEMENTS, oldImplements, implements_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.ECLASS__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Interface>(Interface.class, this, RefactoringDiffMMPackage.ECLASS__INTERFACES);
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
			nested_classes = new EObjectContainmentEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES);
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
			nested_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES);
		}
		return nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<DiffEClass_interfaces> getDiffinterfaces() {
		if (diffinterfaces == null) {
			diffinterfaces = new EObjectContainmentEList<DiffEClass_interfaces>(DiffEClass_interfaces.class, this, RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES);
		}
		return diffinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_classes> getDiffnested_classes() {
		if (diffnested_classes == null) {
			diffnested_classes = new EObjectContainmentEList<DiffEClass_nested_classes>(DiffEClass_nested_classes.class, this, RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES);
		}
		return diffnested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_interfaces> getDiffnested_interfaces() {
		if (diffnested_interfaces == null) {
			diffnested_interfaces = new EObjectContainmentEList<DiffEClass_nested_interfaces>(DiffEClass_nested_interfaces.class, this, RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES);
		}
		return diffnested_interfaces;
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
			case RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES:
				return ((InternalEList<?>)getNested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES:
				return ((InternalEList<?>)getNested_interfaces()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return ((InternalEList<?>)getDiffeattributes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return ((InternalEList<?>)getDiffeoperations()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return ((InternalEList<?>)getDiffereferences()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return ((InternalEList<?>)getDiffesupertypes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES:
				return ((InternalEList<?>)getDiffinterfaces()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES:
				return ((InternalEList<?>)getDiffnested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES:
				return ((InternalEList<?>)getDiffnested_interfaces()).basicRemove(otherEnd, msgs);
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
			case RefactoringDiffMMPackage.ECLASS__EXTENDS:
				return getExtends();
			case RefactoringDiffMMPackage.ECLASS__IMPLEMENTS:
				return getImplements();
			case RefactoringDiffMMPackage.ECLASS__IS_ABSTRACT:
				return isIsAbstract();
			case RefactoringDiffMMPackage.ECLASS__PACKAGE_NAME:
				return getPackageName();
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				return getEattributes();
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				return getEoperations();
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				return getEreferences();
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringDiffMMPackage.ECLASS__INTERFACES:
				return getInterfaces();
			case RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES:
				return getNested_classes();
			case RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES:
				return getNested_interfaces();
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return getDiffeattributes();
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return getDiffeoperations();
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return getDiffereferences();
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return getDiffesupertypes();
			case RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES:
				return getDiffinterfaces();
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES:
				return getDiffnested_classes();
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES:
				return getDiffnested_interfaces();
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
			case RefactoringDiffMMPackage.ECLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__PACKAGE_NAME:
				setPackageName((String)newValue);
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
			case RefactoringDiffMMPackage.ECLASS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				getNested_classes().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
				getNested_interfaces().addAll((Collection<? extends Interface>)newValue);
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
			case RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES:
				getDiffinterfaces().clear();
				getDiffinterfaces().addAll((Collection<? extends DiffEClass_interfaces>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES:
				getDiffnested_classes().clear();
				getDiffnested_classes().addAll((Collection<? extends DiffEClass_nested_classes>)newValue);
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES:
				getDiffnested_interfaces().clear();
				getDiffnested_interfaces().addAll((Collection<? extends DiffEClass_nested_interfaces>)newValue);
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
			case RefactoringDiffMMPackage.ECLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.ECLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.ECLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.ECLASS__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
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
			case RefactoringDiffMMPackage.ECLASS__INTERFACES:
				getInterfaces().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
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
			case RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES:
				getDiffinterfaces().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES:
				getDiffnested_classes().clear();
				return;
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES:
				getDiffnested_interfaces().clear();
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
			case RefactoringDiffMMPackage.ECLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RefactoringDiffMMPackage.ECLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case RefactoringDiffMMPackage.ECLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case RefactoringDiffMMPackage.ECLASS__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RefactoringDiffMMPackage.ECLASS__EATTRIBUTES:
				return eattributes != null && !eattributes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__EREFERENCES:
				return ereferences != null && !ereferences.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__NESTED_CLASSES:
				return nested_classes != null && !nested_classes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__NESTED_INTERFACES:
				return nested_interfaces != null && !nested_interfaces.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEATTRIBUTES:
				return diffeattributes != null && !diffeattributes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEOPERATIONS:
				return diffeoperations != null && !diffeoperations.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFEREFERENCES:
				return differeferences != null && !differeferences.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFESUPERTYPES:
				return diffesupertypes != null && !diffesupertypes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFINTERFACES:
				return diffinterfaces != null && !diffinterfaces.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_CLASSES:
				return diffnested_classes != null && !diffnested_classes.isEmpty();
			case RefactoringDiffMMPackage.ECLASS__DIFFNESTED_INTERFACES:
				return diffnested_interfaces != null && !diffnested_interfaces.isEmpty();
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
