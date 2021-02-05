/**
 */
package oracleDiffMM.impl;

import java.util.Collection;

import oracleDiffMM.A;
import oracleDiffMM.B;
import oracleDiffMM.DiffROOT_a;
import oracleDiffMM.DiffROOT_b;
import oracleDiffMM.DiffROOT_domainspecificdiffs;
import oracleDiffMM.DomainSpecificDiff;
import oracleDiffMM.OracleDiffMMPackage;
import oracleDiffMM.ROOT;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getB <em>B</em>}</li>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getA <em>A</em>}</li>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getDiffb <em>Diffb</em>}</li>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getDiffa <em>Diffa</em>}</li>
 *   <li>{@link oracleDiffMM.impl.ROOTImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROOTImpl extends MinimalEObjectImpl.Container implements ROOT {
	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected EList<B> b;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<A> a;

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
	 * The cached value of the '{@link #getDiffb() <em>Diffb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffb()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffROOT_b> diffb;

	/**
	 * The cached value of the '{@link #getDiffa() <em>Diffa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffa()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffROOT_a> diffa;

	/**
	 * The cached value of the '{@link #getDiffdomainspecificdiffs() <em>Diffdomainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffROOT_domainspecificdiffs> diffdomainspecificdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OracleDiffMMPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<B> getB() {
		if (b == null) {
			b = new EObjectContainmentEList<B>(B.class, this, OracleDiffMMPackage.ROOT__B);
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<A> getA() {
		if (a == null) {
			a = new EObjectContainmentEList<A>(A.class, this, OracleDiffMMPackage.ROOT__A);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffROOT_b> getDiffb() {
		if (diffb == null) {
			diffb = new EObjectContainmentEList<DiffROOT_b>(DiffROOT_b.class, this, OracleDiffMMPackage.ROOT__DIFFB);
		}
		return diffb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffROOT_a> getDiffa() {
		if (diffa == null) {
			diffa = new EObjectContainmentEList<DiffROOT_a>(DiffROOT_a.class, this, OracleDiffMMPackage.ROOT__DIFFA);
		}
		return diffa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffROOT_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffROOT_domainspecificdiffs>(DiffROOT_domainspecificdiffs.class, this, OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS);
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
			case OracleDiffMMPackage.ROOT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.ROOT__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.ROOT__DIFFB:
				return ((InternalEList<?>)getDiffb()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.ROOT__DIFFA:
				return ((InternalEList<?>)getDiffa()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS:
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
			case OracleDiffMMPackage.ROOT__B:
				return getB();
			case OracleDiffMMPackage.ROOT__A:
				return getA();
			case OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case OracleDiffMMPackage.ROOT__DIFFB:
				return getDiffb();
			case OracleDiffMMPackage.ROOT__DIFFA:
				return getDiffa();
			case OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS:
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
			case OracleDiffMMPackage.ROOT__B:
				getB().clear();
				getB().addAll((Collection<? extends B>)newValue);
				return;
			case OracleDiffMMPackage.ROOT__A:
				getA().clear();
				getA().addAll((Collection<? extends A>)newValue);
				return;
			case OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case OracleDiffMMPackage.ROOT__DIFFB:
				getDiffb().clear();
				getDiffb().addAll((Collection<? extends DiffROOT_b>)newValue);
				return;
			case OracleDiffMMPackage.ROOT__DIFFA:
				getDiffa().clear();
				getDiffa().addAll((Collection<? extends DiffROOT_a>)newValue);
				return;
			case OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffROOT_domainspecificdiffs>)newValue);
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
			case OracleDiffMMPackage.ROOT__B:
				getB().clear();
				return;
			case OracleDiffMMPackage.ROOT__A:
				getA().clear();
				return;
			case OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case OracleDiffMMPackage.ROOT__DIFFB:
				getDiffb().clear();
				return;
			case OracleDiffMMPackage.ROOT__DIFFA:
				getDiffa().clear();
				return;
			case OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS:
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
			case OracleDiffMMPackage.ROOT__B:
				return b != null && !b.isEmpty();
			case OracleDiffMMPackage.ROOT__A:
				return a != null && !a.isEmpty();
			case OracleDiffMMPackage.ROOT__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case OracleDiffMMPackage.ROOT__DIFFB:
				return diffb != null && !diffb.isEmpty();
			case OracleDiffMMPackage.ROOT__DIFFA:
				return diffa != null && !diffa.isEmpty();
			case OracleDiffMMPackage.ROOT__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROOTImpl
