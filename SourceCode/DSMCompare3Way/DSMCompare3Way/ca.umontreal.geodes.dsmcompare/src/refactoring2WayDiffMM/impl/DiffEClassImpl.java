/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoring2WayDiffMM.DiffEClass;
import refactoring2WayDiffMM.DiffKind;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#getNew_extends <em>New extends</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#getNew_implements <em>New implements</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#isNew_isAbstract <em>New is Abstract</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEClassImpl#getNew_packageName <em>New package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEClassImpl extends EClassImpl implements DiffEClass {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final DiffKind DIFF_KIND_EDEFAULT = DiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected DiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected String new_name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_extends() <em>New extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_extends() <em>New extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_extends()
	 * @generated
	 * @ordered
	 */
	protected String new_extends = NEW_EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_implements() <em>New implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_implements()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_implements() <em>New implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_implements()
	 * @generated
	 * @ordered
	 */
	protected String new_implements = NEW_IMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_isAbstract() <em>New is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_isAbstract() <em>New is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean new_isAbstract = NEW_IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_packageName() <em>New package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_packageName() <em>New package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_packageName()
	 * @generated
	 * @ordered
	 */
	protected String new_packageName = NEW_PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Refactoring2WayDiffMMPackage.Literals.DIFF_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(DiffKind newDiff_kind) {
		DiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name() {
		return new_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name(String newNew_name) {
		String oldNew_name = new_name;
		new_name = newNew_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_extends() {
		return new_extends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_extends(String newNew_extends) {
		String oldNew_extends = new_extends;
		new_extends = newNew_extends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS, oldNew_extends, new_extends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_implements() {
		return new_implements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_implements(String newNew_implements) {
		String oldNew_implements = new_implements;
		new_implements = newNew_implements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS, oldNew_implements, new_implements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew_isAbstract() {
		return new_isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_isAbstract(boolean newNew_isAbstract) {
		boolean oldNew_isAbstract = new_isAbstract;
		new_isAbstract = newNew_isAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT, oldNew_isAbstract, new_isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_packageName() {
		return new_packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_packageName(String newNew_packageName) {
		String oldNew_packageName = new_packageName;
		new_packageName = newNew_packageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME, oldNew_packageName, new_packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND:
				return getDiff_kind();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME:
				return getNew_name();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS:
				return getNew_extends();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS:
				return getNew_implements();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT:
				return isNew_isAbstract();
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME:
				return getNew_packageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS:
				setNew_extends((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS:
				setNew_implements((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT:
				setNew_isAbstract((Boolean)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME:
				setNew_packageName((String)newValue);
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
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS:
				setNew_extends(NEW_EXTENDS_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS:
				setNew_implements(NEW_IMPLEMENTS_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT:
				setNew_isAbstract(NEW_IS_ABSTRACT_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME:
				setNew_packageName(NEW_PACKAGE_NAME_EDEFAULT);
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
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_EXTENDS:
				return NEW_EXTENDS_EDEFAULT == null ? new_extends != null : !NEW_EXTENDS_EDEFAULT.equals(new_extends);
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IMPLEMENTS:
				return NEW_IMPLEMENTS_EDEFAULT == null ? new_implements != null : !NEW_IMPLEMENTS_EDEFAULT.equals(new_implements);
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_IS_ABSTRACT:
				return new_isAbstract != NEW_IS_ABSTRACT_EDEFAULT;
			case Refactoring2WayDiffMMPackage.DIFF_ECLASS__NEW_PACKAGE_NAME:
				return NEW_PACKAGE_NAME_EDEFAULT == null ? new_packageName != null : !NEW_PACKAGE_NAME_EDEFAULT.equals(new_packageName);
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
		result.append(" (diff_kind: ");
		result.append(diff_kind);
		result.append(", new_name: ");
		result.append(new_name);
		result.append(", new_extends: ");
		result.append(new_extends);
		result.append(", new_implements: ");
		result.append(new_implements);
		result.append(", new_isAbstract: ");
		result.append(new_isAbstract);
		result.append(", new_packageName: ");
		result.append(new_packageName);
		result.append(')');
		return result.toString();
	}

} //DiffEClassImpl
