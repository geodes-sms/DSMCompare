/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.DiffFactor_scores;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayDiffMM.Factor;
import dssmm2WayDiffMM.Score;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getFactorID <em>Factor ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getGW <em>GW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getLW <em>LW</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getDel <em>Del</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#isHideOnLine <em>Hide On Line</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getMasterFactorID <em>Master Factor ID</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.FactorImpl#getDiffscores <em>Diffscores</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FactorImpl extends MinimalEObjectImpl.Container implements Factor {
	/**
	 * The default value of the '{@link #getFactorID() <em>Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorID()
	 * @generated
	 * @ordered
	 */
	protected static final int FACTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFactorID() <em>Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorID()
	 * @generated
	 * @ordered
	 */
	protected int factorID = FACTOR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected String descr = DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGW() <em>GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGW()
	 * @generated
	 * @ordered
	 */
	protected static final float GW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGW() <em>GW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGW()
	 * @generated
	 * @ordered
	 */
	protected float gw = GW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLW() <em>LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLW()
	 * @generated
	 * @ordered
	 */
	protected static final float LW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLW() <em>LW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLW()
	 * @generated
	 * @ordered
	 */
	protected float lw = LW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDel() <em>Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDel() <em>Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDel()
	 * @generated
	 * @ordered
	 */
	protected Boolean del = DEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideOnLine() <em>Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideOnLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_ON_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideOnLine() <em>Hide On Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideOnLine()
	 * @generated
	 * @ordered
	 */
	protected boolean hideOnLine = HIDE_ON_LINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScores() <em>Scores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScores()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> scores;

	/**
	 * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected String hierarchy = HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterFactorID() <em>Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFactorID()
	 * @generated
	 * @ordered
	 */
	protected static final int MASTER_FACTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMasterFactorID() <em>Master Factor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFactorID()
	 * @generated
	 * @ordered
	 */
	protected int masterFactorID = MASTER_FACTOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffscores() <em>Diffscores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffscores()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffFactor_scores> diffscores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFactorID() {
		return factorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactorID(int newFactorID) {
		int oldFactorID = factorID;
		factorID = newFactorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__FACTOR_ID, oldFactorID, factorID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescr(String newDescr) {
		String oldDescr = descr;
		descr = newDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__DESCR, oldDescr, descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGW() {
		return gw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGW(float newGW) {
		float oldGW = gw;
		gw = newGW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__GW, oldGW, gw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLW() {
		return lw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLW(float newLW) {
		float oldLW = lw;
		lw = newLW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__LW, oldLW, lw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDel() {
		return del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDel(Boolean newDel) {
		Boolean oldDel = del;
		del = newDel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__DEL, oldDel, del));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideOnLine() {
		return hideOnLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideOnLine(boolean newHideOnLine) {
		boolean oldHideOnLine = hideOnLine;
		hideOnLine = newHideOnLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__HIDE_ON_LINE, oldHideOnLine, hideOnLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Score> getScores() {
		if (scores == null) {
			scores = new EObjectContainmentEList<Score>(Score.class, this, Dssmm2WayDiffMMPackage.FACTOR__SCORES);
		}
		return scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchy() {
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchy(String newHierarchy) {
		String oldHierarchy = hierarchy;
		hierarchy = newHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__HIERARCHY, oldHierarchy, hierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMasterFactorID() {
		return masterFactorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterFactorID(int newMasterFactorID) {
		int oldMasterFactorID = masterFactorID;
		masterFactorID = newMasterFactorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.FACTOR__MASTER_FACTOR_ID, oldMasterFactorID, masterFactorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffFactor_scores> getDiffscores() {
		if (diffscores == null) {
			diffscores = new EObjectContainmentEList<DiffFactor_scores>(DiffFactor_scores.class, this, Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES);
		}
		return diffscores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.FACTOR__SCORES:
				return ((InternalEList<?>)getScores()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES:
				return ((InternalEList<?>)getDiffscores()).basicRemove(otherEnd, msgs);
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
			case Dssmm2WayDiffMMPackage.FACTOR__FACTOR_ID:
				return getFactorID();
			case Dssmm2WayDiffMMPackage.FACTOR__NAME:
				return getName();
			case Dssmm2WayDiffMMPackage.FACTOR__DESCR:
				return getDescr();
			case Dssmm2WayDiffMMPackage.FACTOR__GW:
				return getGW();
			case Dssmm2WayDiffMMPackage.FACTOR__LW:
				return getLW();
			case Dssmm2WayDiffMMPackage.FACTOR__DEL:
				return getDel();
			case Dssmm2WayDiffMMPackage.FACTOR__HIDE_ON_LINE:
				return isHideOnLine();
			case Dssmm2WayDiffMMPackage.FACTOR__SCORES:
				return getScores();
			case Dssmm2WayDiffMMPackage.FACTOR__HIERARCHY:
				return getHierarchy();
			case Dssmm2WayDiffMMPackage.FACTOR__MASTER_FACTOR_ID:
				return getMasterFactorID();
			case Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES:
				return getDiffscores();
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
			case Dssmm2WayDiffMMPackage.FACTOR__FACTOR_ID:
				setFactorID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__NAME:
				setName((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DESCR:
				setDescr((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__GW:
				setGW((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__LW:
				setLW((Float)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DEL:
				setDel((Boolean)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__HIDE_ON_LINE:
				setHideOnLine((Boolean)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__SCORES:
				getScores().clear();
				getScores().addAll((Collection<? extends Score>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__HIERARCHY:
				setHierarchy((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__MASTER_FACTOR_ID:
				setMasterFactorID((Integer)newValue);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES:
				getDiffscores().clear();
				getDiffscores().addAll((Collection<? extends DiffFactor_scores>)newValue);
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
			case Dssmm2WayDiffMMPackage.FACTOR__FACTOR_ID:
				setFactorID(FACTOR_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DESCR:
				setDescr(DESCR_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__GW:
				setGW(GW_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__LW:
				setLW(LW_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DEL:
				setDel(DEL_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__HIDE_ON_LINE:
				setHideOnLine(HIDE_ON_LINE_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__SCORES:
				getScores().clear();
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__HIERARCHY:
				setHierarchy(HIERARCHY_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__MASTER_FACTOR_ID:
				setMasterFactorID(MASTER_FACTOR_ID_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES:
				getDiffscores().clear();
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
			case Dssmm2WayDiffMMPackage.FACTOR__FACTOR_ID:
				return factorID != FACTOR_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.FACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Dssmm2WayDiffMMPackage.FACTOR__DESCR:
				return DESCR_EDEFAULT == null ? descr != null : !DESCR_EDEFAULT.equals(descr);
			case Dssmm2WayDiffMMPackage.FACTOR__GW:
				return gw != GW_EDEFAULT;
			case Dssmm2WayDiffMMPackage.FACTOR__LW:
				return lw != LW_EDEFAULT;
			case Dssmm2WayDiffMMPackage.FACTOR__DEL:
				return DEL_EDEFAULT == null ? del != null : !DEL_EDEFAULT.equals(del);
			case Dssmm2WayDiffMMPackage.FACTOR__HIDE_ON_LINE:
				return hideOnLine != HIDE_ON_LINE_EDEFAULT;
			case Dssmm2WayDiffMMPackage.FACTOR__SCORES:
				return scores != null && !scores.isEmpty();
			case Dssmm2WayDiffMMPackage.FACTOR__HIERARCHY:
				return HIERARCHY_EDEFAULT == null ? hierarchy != null : !HIERARCHY_EDEFAULT.equals(hierarchy);
			case Dssmm2WayDiffMMPackage.FACTOR__MASTER_FACTOR_ID:
				return masterFactorID != MASTER_FACTOR_ID_EDEFAULT;
			case Dssmm2WayDiffMMPackage.FACTOR__DIFFSCORES:
				return diffscores != null && !diffscores.isEmpty();
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
		result.append(" (FactorID: ");
		result.append(factorID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Descr: ");
		result.append(descr);
		result.append(", GW: ");
		result.append(gw);
		result.append(", LW: ");
		result.append(lw);
		result.append(", Del: ");
		result.append(del);
		result.append(", HideOnLine: ");
		result.append(hideOnLine);
		result.append(", Hierarchy: ");
		result.append(hierarchy);
		result.append(", MasterFactorID: ");
		result.append(masterFactorID);
		result.append(')');
		return result.toString();
	}

} //FactorImpl
