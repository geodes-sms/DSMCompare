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
import org.eclipse.emf.ecore.util.InternalEList;

import refactoringDiffMM.DiffEPackage_domainspecificdiffs;
import refactoringDiffMM.DiffEPackage_eclassifiers;
import refactoringDiffMM.DomainSpecificDiff;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EPackage;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.EPackageImpl#getEclassifiers <em>Eclassifiers</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EPackageImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EPackageImpl#getDiffeclassifiers <em>Diffeclassifiers</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.EPackageImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageImpl extends MinimalEObjectImpl.Container implements EPackage {
	/**
	 * The cached value of the '{@link #getEclassifiers() <em>Eclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eclassifiers;

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
	 * The cached value of the '{@link #getDomainspecificdiffs() <em>Domainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSpecificDiff> domainspecificdiffs;

	/**
	 * The cached value of the '{@link #getDiffeclassifiers() <em>Diffeclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eclassifiers> diffeclassifiers;

	/**
	 * The cached value of the '{@link #getDiffdomainspecificdiffs() <em>Diffdomainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_domainspecificdiffs> diffdomainspecificdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.EPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getEclassifiers() {
		if (eclassifiers == null) {
			eclassifiers = new EObjectContainmentEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS);
		}
		return eclassifiers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.EPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_eclassifiers> getDiffeclassifiers() {
		if (diffeclassifiers == null) {
			diffeclassifiers = new EObjectContainmentEList<DiffEPackage_eclassifiers>(DiffEPackage_eclassifiers.class, this, RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS);
		}
		return diffeclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEPackage_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffEPackage_domainspecificdiffs>(DiffEPackage_domainspecificdiffs.class, this, RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS);
		}
		return diffdomainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<?>)getEclassifiers()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS:
				return ((InternalEList<?>)getDiffeclassifiers()).basicRemove(otherEnd, msgs);
			case RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDiffdomainspecificdiffs()).basicRemove(otherEnd, msgs);
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
			case RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return getEclassifiers();
			case RefactoringDiffMMPackage.EPACKAGE__NAME:
				return getName();
			case RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS:
				return getDiffeclassifiers();
			case RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return getDiffdomainspecificdiffs();
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
			case RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				getEclassifiers().clear();
				getEclassifiers().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.EPACKAGE__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS:
				getDiffeclassifiers().clear();
				getDiffeclassifiers().addAll((Collection<? extends DiffEPackage_eclassifiers>)newValue);
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffEPackage_domainspecificdiffs>)newValue);
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
			case RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				getEclassifiers().clear();
				return;
			case RefactoringDiffMMPackage.EPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS:
				getDiffeclassifiers().clear();
				return;
			case RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
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
			case RefactoringDiffMMPackage.EPACKAGE__ECLASSIFIERS:
				return eclassifiers != null && !eclassifiers.isEmpty();
			case RefactoringDiffMMPackage.EPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.EPACKAGE__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case RefactoringDiffMMPackage.EPACKAGE__DIFFECLASSIFIERS:
				return diffeclassifiers != null && !diffeclassifiers.isEmpty();
			case RefactoringDiffMMPackage.EPACKAGE__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
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

} //EPackageImpl
