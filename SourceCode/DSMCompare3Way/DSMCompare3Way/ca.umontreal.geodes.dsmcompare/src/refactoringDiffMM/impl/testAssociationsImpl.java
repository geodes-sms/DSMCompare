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

import refactoringDiffMM.DifftestAssociations_multi;
import refactoringDiffMM.DifftestAssociations_single;
import refactoringDiffMM.EClass;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringDiffMM.testAssociations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>test Associations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.testAssociationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.testAssociationsImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.testAssociationsImpl#getMulti <em>Multi</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.testAssociationsImpl#getDiffsingle <em>Diffsingle</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.testAssociationsImpl#getDiffmulti <em>Diffmulti</em>}</li>
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
	 * The cached value of the '{@link #getDiffsingle() <em>Diffsingle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffsingle()
	 * @generated
	 * @ordered
	 */
	protected EList<DifftestAssociations_single> diffsingle;

	/**
	 * The cached value of the '{@link #getDiffmulti() <em>Diffmulti</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmulti()
	 * @generated
	 * @ordered
	 */
	protected EList<DifftestAssociations_multi> diffmulti;

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
		return RefactoringDiffMMPackage.Literals.TEST_ASSOCIATIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getMulti() {
		if (multi == null) {
			multi = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__MULTI);
		}
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifftestAssociations_single> getDiffsingle() {
		if (diffsingle == null) {
			diffsingle = new EObjectContainmentEList<DifftestAssociations_single>(DifftestAssociations_single.class, this, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE);
		}
		return diffsingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifftestAssociations_multi> getDiffmulti() {
		if (diffmulti == null) {
			diffmulti = new EObjectContainmentEList<DifftestAssociations_multi>(DifftestAssociations_multi.class, this, RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI);
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
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE:
				return ((InternalEList<?>)getDiffsingle()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI:
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
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__NAME:
				return getName();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE:
				if (resolve) return getSingle();
				return basicGetSingle();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__MULTI:
				return getMulti();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE:
				return getDiffsingle();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI:
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
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE:
				setSingle((EClass)newValue);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
				getMulti().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE:
				getDiffsingle().clear();
				getDiffsingle().addAll((Collection<? extends DifftestAssociations_single>)newValue);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI:
				getDiffmulti().clear();
				getDiffmulti().addAll((Collection<? extends DifftestAssociations_multi>)newValue);
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
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE:
				setSingle((EClass)null);
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__MULTI:
				getMulti().clear();
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE:
				getDiffsingle().clear();
				return;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI:
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
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__SINGLE:
				return single != null;
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__MULTI:
				return multi != null && !multi.isEmpty();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFSINGLE:
				return diffsingle != null && !diffsingle.isEmpty();
			case RefactoringDiffMMPackage.TEST_ASSOCIATIONS__DIFFMULTI:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //testAssociationsImpl
