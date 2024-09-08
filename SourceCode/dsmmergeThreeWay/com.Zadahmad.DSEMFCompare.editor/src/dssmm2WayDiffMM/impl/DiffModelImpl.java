/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffModel;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getNew_ModelID <em>New Model ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getNew_Goal <em>New Goal</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffModelImpl#getNew_NumFacts <em>New Num Facts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffModelImpl extends ModelImpl implements DiffModel {
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
	 * The default value of the '{@link #getNew_ModelID() <em>New Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MODEL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_ModelID() <em>New Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_ModelID()
	 * @generated
	 * @ordered
	 */
	protected int new_ModelID = NEW_MODEL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getNew_Goal() <em>New Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Goal() <em>New Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Goal()
	 * @generated
	 * @ordered
	 */
	protected String new_Goal = NEW_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr() <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr() <em>New Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr = NEW_DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_NumFacts() <em>New Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NUM_FACTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_NumFacts() <em>New Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_NumFacts()
	 * @generated
	 * @ordered
	 */
	protected String new_NumFacts = NEW_NUM_FACTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_ModelID() {
		return new_ModelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_ModelID(int newNew_ModelID) {
		int oldNew_ModelID = new_ModelID;
		new_ModelID = newNew_ModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID, oldNew_ModelID, new_ModelID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NAME, oldNew_Name, new_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Goal() {
		return new_Goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Goal(String newNew_Goal) {
		String oldNew_Goal = new_Goal;
		new_Goal = newNew_Goal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_GOAL, oldNew_Goal, new_Goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr() {
		return new_Descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr(String newNew_Descr) {
		String oldNew_Descr = new_Descr;
		new_Descr = newNew_Descr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_DESCR, oldNew_Descr, new_Descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_NumFacts() {
		return new_NumFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_NumFacts(String newNew_NumFacts) {
		String oldNew_NumFacts = new_NumFacts;
		new_NumFacts = newNew_NumFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS, oldNew_NumFacts, new_NumFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID:
				return getNew_ModelID();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NAME:
				return getNew_Name();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_GOAL:
				return getNew_Goal();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_DESCR:
				return getNew_Descr();
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS:
				return getNew_NumFacts();
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
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID:
				setNew_ModelID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NAME:
				setNew_Name((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_GOAL:
				setNew_Goal((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_DESCR:
				setNew_Descr((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS:
				setNew_NumFacts((String)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID:
				setNew_ModelID(NEW_MODEL_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_GOAL:
				setNew_Goal(NEW_GOAL_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_DESCR:
				setNew_Descr(NEW_DESCR_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS:
				setNew_NumFacts(NEW_NUM_FACTS_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_MODEL_ID:
				return new_ModelID != NEW_MODEL_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_GOAL:
				return NEW_GOAL_EDEFAULT == null ? new_Goal != null : !NEW_GOAL_EDEFAULT.equals(new_Goal);
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_DESCR:
				return NEW_DESCR_EDEFAULT == null ? new_Descr != null : !NEW_DESCR_EDEFAULT.equals(new_Descr);
			case Dssmm2WayDiffMMPackage.DIFF_MODEL__NEW_NUM_FACTS:
				return NEW_NUM_FACTS_EDEFAULT == null ? new_NumFacts != null : !NEW_NUM_FACTS_EDEFAULT.equals(new_NumFacts);
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
		result.append(", new_ModelID: ");
		result.append(new_ModelID);
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(", new_Goal: ");
		result.append(new_Goal);
		result.append(", new_Descr: ");
		result.append(new_Descr);
		result.append(", new_NumFacts: ");
		result.append(new_NumFacts);
		result.append(')');
		return result.toString();
	}

} //DiffModelImpl
