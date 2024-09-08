/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffDecisionSupport;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Decision Support</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffDecisionSupportImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffDecisionSupportImpl#getNew_Name <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffDecisionSupportImpl extends DecisionSupportImpl implements DiffDecisionSupport {
	/**
	 * The default value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind() <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind = DIFF_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name()
	 * @generated
	 * @ordered
	 */
	protected String new_Name = NEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffDecisionSupportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_DECISION_SUPPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind() {
		return diff_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind(ClassDiffKind newDiff_kind) {
		ClassDiffKind oldDiff_kind = diff_kind;
		diff_kind = newDiff_kind == null ? DIFF_KIND_EDEFAULT : newDiff_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name() {
		return new_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name(String newNew_Name) {
		String oldNew_Name = new_Name;
		new_Name = newNew_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__NEW_NAME, oldNew_Name, new_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__NEW_NAME:
				return getNew_Name();
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
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__NEW_NAME:
				setNew_Name((String)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_DECISION_SUPPORT__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
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
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(')');
		return result.toString();
	}

} //DiffDecisionSupportImpl
