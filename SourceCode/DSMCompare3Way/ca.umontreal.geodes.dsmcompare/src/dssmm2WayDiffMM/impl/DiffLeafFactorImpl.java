/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.ClassDiffKind;
import dssmm2WayDiffMM.DiffLeafFactor;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Leaf Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_FactorID <em>New Factor ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_Name <em>New Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_Descr <em>New Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_GW <em>New GW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_LW <em>New LW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_Del <em>New Del</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#isNew_HideOnLine <em>New Hide On Line</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_Hierarchy <em>New Hierarchy</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DiffLeafFactorImpl#getNew_MasterFactorID <em>New Master Factor ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffLeafFactorImpl extends LeafFactorImpl implements DiffLeafFactor {
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
	 * The default value of the '{@link #getNew_FactorID() <em>New Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_FACTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_FactorID() <em>New Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID()
	 * @generated
	 * @ordered
	 */
	protected int new_FactorID = NEW_FACTOR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getNew_GW() <em>New GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_GW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_GW() <em>New GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW()
	 * @generated
	 * @ordered
	 */
	protected float new_GW = NEW_GW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_LW() <em>New LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_LW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_LW() <em>New LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW()
	 * @generated
	 * @ordered
	 */
	protected float new_LW = NEW_LW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Del() <em>New Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_DEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Del() <em>New Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del()
	 * @generated
	 * @ordered
	 */
	protected Boolean new_Del = NEW_DEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_HideOnLine() <em>New Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_HIDE_ON_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_HideOnLine() <em>New Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine()
	 * @generated
	 * @ordered
	 */
	protected boolean new_HideOnLine = NEW_HIDE_ON_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Hierarchy() <em>New Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_HIERARCHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Hierarchy() <em>New Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy()
	 * @generated
	 * @ordered
	 */
	protected String new_Hierarchy = NEW_HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MasterFactorID() <em>New Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MASTER_FACTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MasterFactorID() <em>New Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID()
	 * @generated
	 * @ordered
	 */
	protected int new_MasterFactorID = NEW_MASTER_FACTOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffLeafFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DIFF_LEAF_FACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND, oldDiff_kind, diff_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_FactorID() {
		return new_FactorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_FactorID(int newNew_FactorID) {
		int oldNew_FactorID = new_FactorID;
		new_FactorID = newNew_FactorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID, oldNew_FactorID, new_FactorID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME, oldNew_Name, new_Name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR, oldNew_Descr, new_Descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_GW() {
		return new_GW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_GW(float newNew_GW) {
		float oldNew_GW = new_GW;
		new_GW = newNew_GW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW, oldNew_GW, new_GW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_LW() {
		return new_LW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_LW(float newNew_LW) {
		float oldNew_LW = new_LW;
		new_LW = newNew_LW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW, oldNew_LW, new_LW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNew_Del() {
		return new_Del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Del(Boolean newNew_Del) {
		Boolean oldNew_Del = new_Del;
		new_Del = newNew_Del;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL, oldNew_Del, new_Del));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew_HideOnLine() {
		return new_HideOnLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_HideOnLine(boolean newNew_HideOnLine) {
		boolean oldNew_HideOnLine = new_HideOnLine;
		new_HideOnLine = newNew_HideOnLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE, oldNew_HideOnLine, new_HideOnLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Hierarchy() {
		return new_Hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Hierarchy(String newNew_Hierarchy) {
		String oldNew_Hierarchy = new_Hierarchy;
		new_Hierarchy = newNew_Hierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY, oldNew_Hierarchy, new_Hierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MasterFactorID() {
		return new_MasterFactorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MasterFactorID(int newNew_MasterFactorID) {
		int oldNew_MasterFactorID = new_MasterFactorID;
		new_MasterFactorID = newNew_MasterFactorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID, oldNew_MasterFactorID, new_MasterFactorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND:
				return getDiff_kind();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID:
				return getNew_FactorID();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME:
				return getNew_Name();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR:
				return getNew_Descr();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW:
				return getNew_GW();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW:
				return getNew_LW();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL:
				return getNew_Del();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE:
				return isNew_HideOnLine();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY:
				return getNew_Hierarchy();
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID:
				return getNew_MasterFactorID();
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
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND:
				setDiff_kind((ClassDiffKind)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID:
				setNew_FactorID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME:
				setNew_Name((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR:
				setNew_Descr((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW:
				setNew_GW((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW:
				setNew_LW((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL:
				setNew_Del((Boolean)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE:
				setNew_HideOnLine((Boolean)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY:
				setNew_Hierarchy((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID:
				setNew_MasterFactorID((Integer)newValue);
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
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND:
				setDiff_kind(DIFF_KIND_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID:
				setNew_FactorID(NEW_FACTOR_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME:
				setNew_Name(NEW_NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR:
				setNew_Descr(NEW_DESCR_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW:
				setNew_GW(NEW_GW_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW:
				setNew_LW(NEW_LW_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL:
				setNew_Del(NEW_DEL_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE:
				setNew_HideOnLine(NEW_HIDE_ON_LINE_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY:
				setNew_Hierarchy(NEW_HIERARCHY_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID:
				setNew_MasterFactorID(NEW_MASTER_FACTOR_ID_EDEFAULT);
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
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND:
				return diff_kind != DIFF_KIND_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID:
				return new_FactorID != NEW_FACTOR_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_Name != null : !NEW_NAME_EDEFAULT.equals(new_Name);
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR:
				return NEW_DESCR_EDEFAULT == null ? new_Descr != null : !NEW_DESCR_EDEFAULT.equals(new_Descr);
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW:
				return new_GW != NEW_GW_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW:
				return new_LW != NEW_LW_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL:
				return NEW_DEL_EDEFAULT == null ? new_Del != null : !NEW_DEL_EDEFAULT.equals(new_Del);
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE:
				return new_HideOnLine != NEW_HIDE_ON_LINE_EDEFAULT;
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY:
				return NEW_HIERARCHY_EDEFAULT == null ? new_Hierarchy != null : !NEW_HIERARCHY_EDEFAULT.equals(new_Hierarchy);
			case Dssmm2WayDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID:
				return new_MasterFactorID != NEW_MASTER_FACTOR_ID_EDEFAULT;
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
		result.append(", new_FactorID: ");
		result.append(new_FactorID);
		result.append(", new_Name: ");
		result.append(new_Name);
		result.append(", new_Descr: ");
		result.append(new_Descr);
		result.append(", new_GW: ");
		result.append(new_GW);
		result.append(", new_LW: ");
		result.append(new_LW);
		result.append(", new_Del: ");
		result.append(new_Del);
		result.append(", new_HideOnLine: ");
		result.append(new_HideOnLine);
		result.append(", new_Hierarchy: ");
		result.append(new_Hierarchy);
		result.append(", new_MasterFactorID: ");
		result.append(new_MasterFactorID);
		result.append(')');
		return result.toString();
	}

} //DiffLeafFactorImpl
