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

import refactoringCRRuleMM.Pattern_DifftestAssociations_multi;
import refactoringCRRuleMM.Pattern_DifftestAssociations_single;
import refactoringCRRuleMM.Pattern_EClass;
import refactoringCRRuleMM.Pattern_testAssociations;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern test Associations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getMulti <em>Multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getDiffsingle <em>Diffsingle</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_testAssociationsImpl#getDiffmulti <em>Diffmulti</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_testAssociationsImpl extends MinimalEObjectImpl.Container implements Pattern_testAssociations {
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
	 * The cached value of the '{@link #getSingle() <em>Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected Pattern_EClass single;

	/**
	 * The cached value of the '{@link #getMulti() <em>Multi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulti()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> multi;

	/**
	 * The cached value of the '{@link #getDiffsingle() <em>Diffsingle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffsingle()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_single> diffsingle;

	/**
	 * The cached value of the '{@link #getDiffmulti() <em>Diffmulti</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmulti()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_multi> diffmulti;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_testAssociationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_TEST_ASSOCIATIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EClass getSingle() {
		if (single != null && single.eIsProxy()) {
			InternalEObject oldSingle = (InternalEObject)single;
			single = (Pattern_EClass)eResolveProxy(oldSingle);
			if (single != oldSingle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
			}
		}
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_EClass basicGetSingle() {
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(Pattern_EClass newSingle) {
		Pattern_EClass oldSingle = single;
		single = newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getMulti() {
		if (multi == null) {
			multi = new EObjectResolvingEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__MULTI);
		}
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_single> getDiffsingle() {
		if (diffsingle == null) {
			diffsingle = new EObjectContainmentEList<Pattern_DifftestAssociations_single>(Pattern_DifftestAssociations_single.class, this, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE);
		}
		return diffsingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_multi> getDiffmulti() {
		if (diffmulti == null) {
			diffmulti = new EObjectContainmentEList<Pattern_DifftestAssociations_multi>(Pattern_DifftestAssociations_multi.class, this, RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI);
		}
		return diffmulti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE:
				return ((InternalEList<?>)getDiffsingle()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI:
				return ((InternalEList<?>)getDiffmulti()).basicRemove(otherEnd, msgs);
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
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE:
				if (resolve) return getSingle();
				return basicGetSingle();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__MULTI:
				return getMulti();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE:
				return getDiffsingle();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI:
				return getDiffmulti();
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
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE:
				setSingle((Pattern_EClass)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
				getMulti().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE:
				getDiffsingle().clear();
				getDiffsingle().addAll((Collection<? extends Pattern_DifftestAssociations_single>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI:
				getDiffmulti().clear();
				getDiffmulti().addAll((Collection<? extends Pattern_DifftestAssociations_multi>)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE:
				setSingle((Pattern_EClass)null);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE:
				getDiffsingle().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI:
				getDiffmulti().clear();
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
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__SINGLE:
				return single != null;
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__MULTI:
				return multi != null && !multi.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFSINGLE:
				return diffsingle != null && !diffsingle.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_TEST_ASSOCIATIONS__DIFFMULTI:
				return diffmulti != null && !diffmulti.isEmpty();
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

} //Pattern_testAssociationsImpl
