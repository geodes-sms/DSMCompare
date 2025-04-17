/**
 */
package refactoring2WayDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoring2WayDiffMM.DiffEOperation;
import refactoring2WayDiffMM.DiffKind;
import refactoring2WayDiffMM.Refactoring2WayDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEOperationImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEOperationImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEOperationImpl#getNew_eparameters <em>New eparameters</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEOperationImpl#getNew_etype <em>New etype</em>}</li>
 *   <li>{@link refactoring2WayDiffMM.impl.DiffEOperationImpl#getNew_methodBody <em>New method Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEOperationImpl extends EOperationImpl implements DiffEOperation {
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
	 * The default value of the '{@link #getNew_eparameters() <em>New eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EPARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_eparameters() <em>New eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_eparameters()
	 * @generated
	 * @ordered
	 */
	protected String new_eparameters = NEW_EPARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_etype() <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_etype() <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype()
	 * @generated
	 * @ordered
	 */
	protected String new_etype = NEW_ETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_methodBody() <em>New method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_METHOD_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_methodBody() <em>New method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_methodBody()
	 * @generated
	 * @ordered
	 */
	protected String new_methodBody = NEW_METHOD_BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Refactoring2WayDiffMMPackage.Literals.DIFF_EOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND, oldDiff_kind, diff_kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_eparameters() {
		return new_eparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_eparameters(String newNew_eparameters) {
		String oldNew_eparameters = new_eparameters;
		new_eparameters = newNew_eparameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS, oldNew_eparameters, new_eparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_etype() {
		return new_etype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_etype(String newNew_etype) {
		String oldNew_etype = new_etype;
		new_etype = newNew_etype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE, oldNew_etype, new_etype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_methodBody() {
		return new_methodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_methodBody(String newNew_methodBody) {
		String oldNew_methodBody = new_methodBody;
		new_methodBody = newNew_methodBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY, oldNew_methodBody, new_methodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND:
				return getDiff_kind();
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME:
				return getNew_name();
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS:
				return getNew_eparameters();
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE:
				return getNew_etype();
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY:
				return getNew_methodBody();
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
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND:
				setDiff_kind((DiffKind)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS:
				setNew_eparameters((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE:
				setNew_etype((String)newValue);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY:
				setNew_methodBody((String)newValue);
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
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS:
				setNew_eparameters(NEW_EPARAMETERS_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE:
				setNew_etype(NEW_ETYPE_EDEFAULT);
				return;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY:
				setNew_methodBody(NEW_METHOD_BODY_EDEFAULT);
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
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_EPARAMETERS:
				return NEW_EPARAMETERS_EDEFAULT == null ? new_eparameters != null : !NEW_EPARAMETERS_EDEFAULT.equals(new_eparameters);
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_ETYPE:
				return NEW_ETYPE_EDEFAULT == null ? new_etype != null : !NEW_ETYPE_EDEFAULT.equals(new_etype);
			case Refactoring2WayDiffMMPackage.DIFF_EOPERATION__NEW_METHOD_BODY:
				return NEW_METHOD_BODY_EDEFAULT == null ? new_methodBody != null : !NEW_METHOD_BODY_EDEFAULT.equals(new_methodBody);
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
		result.append(", new_eparameters: ");
		result.append(new_eparameters);
		result.append(", new_etype: ");
		result.append(new_etype);
		result.append(", new_methodBody: ");
		result.append(new_methodBody);
		result.append(')');
		return result.toString();
	}

} //DiffEOperationImpl
