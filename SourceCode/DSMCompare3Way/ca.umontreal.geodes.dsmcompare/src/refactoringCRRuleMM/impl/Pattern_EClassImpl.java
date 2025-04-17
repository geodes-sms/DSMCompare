/**
 */
package refactoringCRRuleMM.impl;

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

import refactoringCRRuleMM.Pattern_DiffEClass_eattributes;
import refactoringCRRuleMM.Pattern_DiffEClass_eoperations;
import refactoringCRRuleMM.Pattern_DiffEClass_ereferences;
import refactoringCRRuleMM.Pattern_DiffEClass_esupertypes;
import refactoringCRRuleMM.Pattern_DiffEClass_interfaces;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_classes;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces;
import refactoringCRRuleMM.Pattern_EAttribute;
import refactoringCRRuleMM.Pattern_EClass;
import refactoringCRRuleMM.Pattern_EOperation;
import refactoringCRRuleMM.Pattern_EReference;
import refactoringCRRuleMM.Pattern_Interface;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getEattributes <em>Eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getEreferences <em>Ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getNested_classes <em>Nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getNested_interfaces <em>Nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffeattributes <em>Diffeattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffereferences <em>Differeferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffnested_classes <em>Diffnested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EClassImpl#getDiffnested_interfaces <em>Diffnested interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_EClassImpl extends MinimalEObjectImpl.Container implements Pattern_EClass {
	/**
	 * The default value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected int iD_Pattern = ID_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

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
	protected EList<Pattern_EAttribute> eattributes;

	/**
	 * The cached value of the '{@link #getEoperations() <em>Eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EOperation> eoperations;

	/**
	 * The cached value of the '{@link #getEreferences() <em>Ereferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EReference> ereferences;

	/**
	 * The cached value of the '{@link #getEsupertypes() <em>Esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> esupertypes;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> interfaces;

	/**
	 * The cached value of the '{@link #getNested_classes() <em>Nested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> nested_classes;

	/**
	 * The cached value of the '{@link #getNested_interfaces() <em>Nested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> nested_interfaces;

	/**
	 * The cached value of the '{@link #getDiffeattributes() <em>Diffeattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eattributes> diffeattributes;

	/**
	 * The cached value of the '{@link #getDiffeoperations() <em>Diffeoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eoperations> diffeoperations;

	/**
	 * The cached value of the '{@link #getDiffereferences() <em>Differeferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_ereferences> differeferences;

	/**
	 * The cached value of the '{@link #getDiffesupertypes() <em>Diffesupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffesupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_esupertypes> diffesupertypes;

	/**
	 * The cached value of the '{@link #getDiffinterfaces() <em>Diffinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_interfaces> diffinterfaces;

	/**
	 * The cached value of the '{@link #getDiffnested_classes() <em>Diffnested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffnested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_classes> diffnested_classes;

	/**
	 * The cached value of the '{@link #getDiffnested_interfaces() <em>Diffnested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffnested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_interfaces> diffnested_interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__IMPLEMENTS, oldImplements, implements_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_ECLASS__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EAttribute> getEattributes() {
		if (eattributes == null) {
			eattributes = new EObjectContainmentEList<Pattern_EAttribute>(Pattern_EAttribute.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES);
		}
		return eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EOperation> getEoperations() {
		if (eoperations == null) {
			eoperations = new EObjectContainmentEList<Pattern_EOperation>(Pattern_EOperation.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS);
		}
		return eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EReference> getEreferences() {
		if (ereferences == null) {
			ereferences = new EObjectContainmentEList<Pattern_EReference>(Pattern_EReference.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES);
		}
		return ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getEsupertypes() {
		if (esupertypes == null) {
			esupertypes = new EObjectResolvingEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__ESUPERTYPES);
		}
		return esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getNested_classes() {
		if (nested_classes == null) {
			nested_classes = new EObjectContainmentEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES);
		}
		return nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getNested_interfaces() {
		if (nested_interfaces == null) {
			nested_interfaces = new EObjectContainmentEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES);
		}
		return nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eattributes> getDiffeattributes() {
		if (diffeattributes == null) {
			diffeattributes = new EObjectContainmentEList<Pattern_DiffEClass_eattributes>(Pattern_DiffEClass_eattributes.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES);
		}
		return diffeattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eoperations> getDiffeoperations() {
		if (diffeoperations == null) {
			diffeoperations = new EObjectContainmentEList<Pattern_DiffEClass_eoperations>(Pattern_DiffEClass_eoperations.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS);
		}
		return diffeoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_ereferences> getDiffereferences() {
		if (differeferences == null) {
			differeferences = new EObjectContainmentEList<Pattern_DiffEClass_ereferences>(Pattern_DiffEClass_ereferences.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES);
		}
		return differeferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_esupertypes> getDiffesupertypes() {
		if (diffesupertypes == null) {
			diffesupertypes = new EObjectContainmentEList<Pattern_DiffEClass_esupertypes>(Pattern_DiffEClass_esupertypes.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES);
		}
		return diffesupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_interfaces> getDiffinterfaces() {
		if (diffinterfaces == null) {
			diffinterfaces = new EObjectContainmentEList<Pattern_DiffEClass_interfaces>(Pattern_DiffEClass_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES);
		}
		return diffinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_classes> getDiffnested_classes() {
		if (diffnested_classes == null) {
			diffnested_classes = new EObjectContainmentEList<Pattern_DiffEClass_nested_classes>(Pattern_DiffEClass_nested_classes.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES);
		}
		return diffnested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_interfaces> getDiffnested_interfaces() {
		if (diffnested_interfaces == null) {
			diffnested_interfaces = new EObjectContainmentEList<Pattern_DiffEClass_nested_interfaces>(Pattern_DiffEClass_nested_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES);
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
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES:
				return ((InternalEList<?>)getEattributes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES:
				return ((InternalEList<?>)getEreferences()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES:
				return ((InternalEList<?>)getNested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES:
				return ((InternalEList<?>)getNested_interfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES:
				return ((InternalEList<?>)getDiffeattributes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS:
				return ((InternalEList<?>)getDiffeoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES:
				return ((InternalEList<?>)getDiffereferences()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES:
				return ((InternalEList<?>)getDiffesupertypes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES:
				return ((InternalEList<?>)getDiffinterfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES:
				return ((InternalEList<?>)getDiffnested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES:
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
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EXTENDS:
				return getExtends();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IMPLEMENTS:
				return getImplements();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_ABSTRACT:
				return isIsAbstract();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__PACKAGE_NAME:
				return getPackageName();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES:
				return getEattributes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS:
				return getEoperations();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES:
				return getEreferences();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__INTERFACES:
				return getInterfaces();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES:
				return getNested_classes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES:
				return getNested_interfaces();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES:
				return getDiffeattributes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS:
				return getDiffeoperations();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES:
				return getDiffereferences();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES:
				return getDiffesupertypes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES:
				return getDiffinterfaces();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES:
				return getDiffnested_classes();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES:
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
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES:
				getEattributes().clear();
				getEattributes().addAll((Collection<? extends Pattern_EAttribute>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS:
				getEoperations().clear();
				getEoperations().addAll((Collection<? extends Pattern_EOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES:
				getEreferences().clear();
				getEreferences().addAll((Collection<? extends Pattern_EReference>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
				getEsupertypes().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				getNested_classes().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
				getNested_interfaces().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES:
				getDiffeattributes().clear();
				getDiffeattributes().addAll((Collection<? extends Pattern_DiffEClass_eattributes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				getDiffeoperations().addAll((Collection<? extends Pattern_DiffEClass_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES:
				getDiffereferences().clear();
				getDiffereferences().addAll((Collection<? extends Pattern_DiffEClass_ereferences>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
				getDiffesupertypes().addAll((Collection<? extends Pattern_DiffEClass_esupertypes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES:
				getDiffinterfaces().clear();
				getDiffinterfaces().addAll((Collection<? extends Pattern_DiffEClass_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES:
				getDiffnested_classes().clear();
				getDiffnested_classes().addAll((Collection<? extends Pattern_DiffEClass_nested_classes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES:
				getDiffnested_interfaces().clear();
				getDiffnested_interfaces().addAll((Collection<? extends Pattern_DiffEClass_nested_interfaces>)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES:
				getEattributes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS:
				getEoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES:
				getEreferences().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ESUPERTYPES:
				getEsupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__INTERFACES:
				getInterfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES:
				getNested_classes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES:
				getNested_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES:
				getDiffeattributes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES:
				getDiffereferences().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES:
				getDiffinterfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES:
				getDiffnested_classes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES:
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
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EATTRIBUTES:
				return eattributes != null && !eattributes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__EREFERENCES:
				return ereferences != null && !ereferences.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_CLASSES:
				return nested_classes != null && !nested_classes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__NESTED_INTERFACES:
				return nested_interfaces != null && !nested_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEATTRIBUTES:
				return diffeattributes != null && !diffeattributes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEOPERATIONS:
				return diffeoperations != null && !diffeoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFEREFERENCES:
				return differeferences != null && !differeferences.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFESUPERTYPES:
				return diffesupertypes != null && !diffesupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFINTERFACES:
				return diffinterfaces != null && !diffinterfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_CLASSES:
				return diffnested_classes != null && !diffnested_classes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_ECLASS__DIFFNESTED_INTERFACES:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", name: ");
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

} //Pattern_EClassImpl
