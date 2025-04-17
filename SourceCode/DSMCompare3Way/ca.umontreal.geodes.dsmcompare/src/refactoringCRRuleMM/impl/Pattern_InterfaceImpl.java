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

import refactoringCRRuleMM.Pattern_DiffInterface_eoperations;
import refactoringCRRuleMM.Pattern_DiffInterface_esupertypes;
import refactoringCRRuleMM.Pattern_EOperation;
import refactoringCRRuleMM.Pattern_Interface;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getEoperations <em>Eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getEsupertypes <em>Esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getDiffeoperations <em>Diffeoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_InterfaceImpl#getDiffesupertypes <em>Diffesupertypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_InterfaceImpl extends MinimalEObjectImpl.Container implements Pattern_Interface {
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
	protected EList<Pattern_EOperation> eoperations;

	/**
	 * The cached value of the '{@link #getEsupertypes() <em>Esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> esupertypes;

	/**
	 * The cached value of the '{@link #getDiffeoperations() <em>Diffeoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_eoperations> diffeoperations;

	/**
	 * The cached value of the '{@link #getDiffesupertypes() <em>Diffesupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffesupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_esupertypes> diffesupertypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EOperation> getEoperations() {
		if (eoperations == null) {
			eoperations = new EObjectContainmentEList<Pattern_EOperation>(Pattern_EOperation.class, this, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS);
		}
		return eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getEsupertypes() {
		if (esupertypes == null) {
			esupertypes = new EObjectResolvingEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ESUPERTYPES);
		}
		return esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_eoperations> getDiffeoperations() {
		if (diffeoperations == null) {
			diffeoperations = new EObjectContainmentEList<Pattern_DiffInterface_eoperations>(Pattern_DiffInterface_eoperations.class, this, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS);
		}
		return diffeoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_esupertypes> getDiffesupertypes() {
		if (diffesupertypes == null) {
			diffesupertypes = new EObjectContainmentEList<Pattern_DiffInterface_esupertypes>(Pattern_DiffInterface_esupertypes.class, this, RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES);
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
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS:
				return ((InternalEList<?>)getEoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS:
				return ((InternalEList<?>)getDiffeoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EXTENDS:
				return getExtends();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__PACKAGE_NAME:
				return getPackageName();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS:
				return getEoperations();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ESUPERTYPES:
				return getEsupertypes();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS:
				return getDiffeoperations();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EXTENDS:
				setExtends((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS:
				getEoperations().clear();
				getEoperations().addAll((Collection<? extends Pattern_EOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ESUPERTYPES:
				getEsupertypes().clear();
				getEsupertypes().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				getDiffeoperations().addAll((Collection<? extends Pattern_DiffInterface_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES:
				getDiffesupertypes().clear();
				getDiffesupertypes().addAll((Collection<? extends Pattern_DiffInterface_esupertypes>)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS:
				getEoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ESUPERTYPES:
				getEsupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS:
				getDiffeoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES:
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
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__EOPERATIONS:
				return eoperations != null && !eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__ESUPERTYPES:
				return esupertypes != null && !esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFEOPERATIONS:
				return diffeoperations != null && !diffeoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_INTERFACE__DIFFESUPERTYPES:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", name: ");
		result.append(name);
		result.append(", extends: ");
		result.append(extends_);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //Pattern_InterfaceImpl
