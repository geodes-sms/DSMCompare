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
import org.eclipse.emf.ecore.util.InternalEList;

import refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers;
import refactoringCRRuleMM.Pattern_DiffEPackage_interfaces;
import refactoringCRRuleMM.Pattern_DiffEPackage_test;
import refactoringCRRuleMM.Pattern_EClass;
import refactoringCRRuleMM.Pattern_EPackage;
import refactoringCRRuleMM.Pattern_Interface;
import refactoringCRRuleMM.Pattern_testAssociations;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getTest <em>Test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getDiffeclassifiers <em>Diffeclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getDiffinterfaces <em>Diffinterfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_EPackageImpl#getDifftest <em>Difftest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_EPackageImpl extends MinimalEObjectImpl.Container implements Pattern_EPackage {
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
	 * The cached value of the '{@link #getEclassifiers() <em>Eclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> eclassifiers;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> interfaces;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_testAssociations> test;

	/**
	 * The cached value of the '{@link #getDiffeclassifiers() <em>Diffeclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_eclassifiers> diffeclassifiers;

	/**
	 * The cached value of the '{@link #getDiffinterfaces() <em>Diffinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_interfaces> diffinterfaces;

	/**
	 * The cached value of the '{@link #getDifftest() <em>Difftest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifftest()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_test> difftest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_EPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_EPACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getEclassifiers() {
		if (eclassifiers == null) {
			eclassifiers = new EObjectContainmentEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS);
		}
		return eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_testAssociations> getTest() {
		if (test == null) {
			test = new EObjectContainmentEList<Pattern_testAssociations>(Pattern_testAssociations.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_eclassifiers> getDiffeclassifiers() {
		if (diffeclassifiers == null) {
			diffeclassifiers = new EObjectContainmentEList<Pattern_DiffEPackage_eclassifiers>(Pattern_DiffEPackage_eclassifiers.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS);
		}
		return diffeclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_interfaces> getDiffinterfaces() {
		if (diffinterfaces == null) {
			diffinterfaces = new EObjectContainmentEList<Pattern_DiffEPackage_interfaces>(Pattern_DiffEPackage_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES);
		}
		return diffinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_test> getDifftest() {
		if (difftest == null) {
			difftest = new EObjectContainmentEList<Pattern_DiffEPackage_test>(Pattern_DiffEPackage_test.class, this, RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST);
		}
		return difftest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<?>)getEclassifiers()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS:
				return ((InternalEList<?>)getDiffeclassifiers()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES:
				return ((InternalEList<?>)getDiffinterfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST:
				return ((InternalEList<?>)getDifftest()).basicRemove(otherEnd, msgs);
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
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS:
				return getEclassifiers();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES:
				return getInterfaces();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST:
				return getTest();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS:
				return getDiffeclassifiers();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES:
				return getDiffinterfaces();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST:
				return getDifftest();
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
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS:
				getEclassifiers().clear();
				getEclassifiers().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends Pattern_testAssociations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS:
				getDiffeclassifiers().clear();
				getDiffeclassifiers().addAll((Collection<? extends Pattern_DiffEPackage_eclassifiers>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES:
				getDiffinterfaces().clear();
				getDiffinterfaces().addAll((Collection<? extends Pattern_DiffEPackage_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST:
				getDifftest().clear();
				getDifftest().addAll((Collection<? extends Pattern_DiffEPackage_test>)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS:
				getEclassifiers().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES:
				getInterfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST:
				getTest().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS:
				getDiffeclassifiers().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES:
				getDiffinterfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST:
				getDifftest().clear();
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
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__ECLASSIFIERS:
				return eclassifiers != null && !eclassifiers.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__TEST:
				return test != null && !test.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFECLASSIFIERS:
				return diffeclassifiers != null && !diffeclassifiers.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFINTERFACES:
				return diffinterfaces != null && !diffinterfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_EPACKAGE__DIFFTEST:
				return difftest != null && !difftest.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Pattern_EPackageImpl
