/**
 */
package oracleDiffMM.impl;

import java.util.Collection;

import oracleDiffMM.A;
import oracleDiffMM.B;
import oracleDiffMM.C;
import oracleDiffMM.D;
import oracleDiffMM.DomainSpecificDiff;
import oracleDiffMM.OracleDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_A <em>Domain Specific Diff A</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_B <em>Domain Specific Diff B</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_C <em>Domain Specific Diff C</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_D <em>Domain Specific Diff D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSpecificDiffImpl extends MinimalEObjectImpl.Container implements DomainSpecificDiff {
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
	 * The cached value of the '{@link #getDomainSpecificDiff_A() <em>Domain Specific Diff A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_A()
	 * @generated
	 * @ordered
	 */
	protected EList<A> domainSpecificDiff_A;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_B() <em>Domain Specific Diff B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_B()
	 * @generated
	 * @ordered
	 */
	protected EList<B> domainSpecificDiff_B;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_C() <em>Domain Specific Diff C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_C()
	 * @generated
	 * @ordered
	 */
	protected EList<C> domainSpecificDiff_C;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_D() <em>Domain Specific Diff D</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_D()
	 * @generated
	 * @ordered
	 */
	protected EList<D> domainSpecificDiff_D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OracleDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<A> getDomainSpecificDiff_A() {
		if (domainSpecificDiff_A == null) {
			domainSpecificDiff_A = new EObjectResolvingEList<A>(A.class, this, OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A);
		}
		return domainSpecificDiff_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<B> getDomainSpecificDiff_B() {
		if (domainSpecificDiff_B == null) {
			domainSpecificDiff_B = new EObjectResolvingEList<B>(B.class, this, OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B);
		}
		return domainSpecificDiff_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C> getDomainSpecificDiff_C() {
		if (domainSpecificDiff_C == null) {
			domainSpecificDiff_C = new EObjectResolvingEList<C>(C.class, this, OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C);
		}
		return domainSpecificDiff_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<D> getDomainSpecificDiff_D() {
		if (domainSpecificDiff_D == null) {
			domainSpecificDiff_D = new EObjectResolvingEList<D>(D.class, this, OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D);
		}
		return domainSpecificDiff_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A:
				return getDomainSpecificDiff_A();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B:
				return getDomainSpecificDiff_B();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C:
				return getDomainSpecificDiff_C();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D:
				return getDomainSpecificDiff_D();
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
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A:
				getDomainSpecificDiff_A().clear();
				getDomainSpecificDiff_A().addAll((Collection<? extends A>)newValue);
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B:
				getDomainSpecificDiff_B().clear();
				getDomainSpecificDiff_B().addAll((Collection<? extends B>)newValue);
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C:
				getDomainSpecificDiff_C().clear();
				getDomainSpecificDiff_C().addAll((Collection<? extends C>)newValue);
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D:
				getDomainSpecificDiff_D().clear();
				getDomainSpecificDiff_D().addAll((Collection<? extends D>)newValue);
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
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A:
				getDomainSpecificDiff_A().clear();
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B:
				getDomainSpecificDiff_B().clear();
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C:
				getDomainSpecificDiff_C().clear();
				return;
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D:
				getDomainSpecificDiff_D().clear();
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
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_A:
				return domainSpecificDiff_A != null && !domainSpecificDiff_A.isEmpty();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_B:
				return domainSpecificDiff_B != null && !domainSpecificDiff_B.isEmpty();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_C:
				return domainSpecificDiff_C != null && !domainSpecificDiff_C.isEmpty();
			case OracleDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_D:
				return domainSpecificDiff_D != null && !domainSpecificDiff_D.isEmpty();
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

} //DomainSpecificDiffImpl
