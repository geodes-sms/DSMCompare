/**
 */
package refactoringDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import refactoringDiffMM.DomainSpecificDiff;
import refactoringDiffMM.EAttribute;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.EReference;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}</li>
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
	 * The cached value of the '{@link #getDomainSpecificDiff_EAttribute() <em>Domain Specific Diff EAttribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> domainSpecificDiff_EAttribute;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EClass() <em>Domain Specific Diff EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> domainSpecificDiff_EClass;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EOperation() <em>Domain Specific Diff EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> domainSpecificDiff_EOperation;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EReference() <em>Domain Specific Diff EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> domainSpecificDiff_EReference;

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
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getDomainSpecificDiff_EAttribute() {
		if (domainSpecificDiff_EAttribute == null) {
			domainSpecificDiff_EAttribute = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE);
		}
		return domainSpecificDiff_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getDomainSpecificDiff_EClass() {
		if (domainSpecificDiff_EClass == null) {
			domainSpecificDiff_EClass = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS);
		}
		return domainSpecificDiff_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getDomainSpecificDiff_EOperation() {
		if (domainSpecificDiff_EOperation == null) {
			domainSpecificDiff_EOperation = new EObjectResolvingEList<EOperation>(EOperation.class, this, RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION);
		}
		return domainSpecificDiff_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getDomainSpecificDiff_EReference() {
		if (domainSpecificDiff_EReference == null) {
			domainSpecificDiff_EReference = new EObjectResolvingEList<EReference>(EReference.class, this, RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE);
		}
		return domainSpecificDiff_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				return getDomainSpecificDiff_EAttribute();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				return getDomainSpecificDiff_EClass();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				return getDomainSpecificDiff_EOperation();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				return getDomainSpecificDiff_EReference();
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
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				getDomainSpecificDiff_EAttribute().clear();
				getDomainSpecificDiff_EAttribute().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				getDomainSpecificDiff_EClass().clear();
				getDomainSpecificDiff_EClass().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				getDomainSpecificDiff_EOperation().clear();
				getDomainSpecificDiff_EOperation().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				getDomainSpecificDiff_EReference().clear();
				getDomainSpecificDiff_EReference().addAll((Collection<? extends EReference>)newValue);
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
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				getDomainSpecificDiff_EAttribute().clear();
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				getDomainSpecificDiff_EClass().clear();
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				getDomainSpecificDiff_EOperation().clear();
				return;
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				getDomainSpecificDiff_EReference().clear();
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
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				return domainSpecificDiff_EAttribute != null && !domainSpecificDiff_EAttribute.isEmpty();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				return domainSpecificDiff_EClass != null && !domainSpecificDiff_EClass.isEmpty();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				return domainSpecificDiff_EOperation != null && !domainSpecificDiff_EOperation.isEmpty();
			case RefactoringDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				return domainSpecificDiff_EReference != null && !domainSpecificDiff_EReference.isEmpty();
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
