/**
 */
package dssmm.impl;

import dssmm.DssmmPackage;
import dssmm.Factor;
import dssmm.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm.impl.ModelImpl#getModelID <em>Model ID</em>}</li>
 *   <li>{@link dssmm.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmm.impl.ModelImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link dssmm.impl.ModelImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link dssmm.impl.ModelImpl#getNumFacts <em>Num Facts</em>}</li>
 *   <li>{@link dssmm.impl.ModelImpl#getRootFactor <em>Root Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected static final int MODEL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected int modelID = MODEL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

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
	 * The default value of the '{@link #getNumFacts() <em>Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFacts()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_FACTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumFacts() <em>Num Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFacts()
	 * @generated
	 * @ordered
	 */
	protected String numFacts = NUM_FACTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootFactor() <em>Root Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFactor()
	 * @generated
	 * @ordered
	 */
	protected Factor rootFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModelID() {
		return modelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelID(int newModelID) {
		int oldModelID = modelID;
		modelID = newModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__MODEL_ID, oldModelID, modelID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__GOAL, oldGoal, goal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__DESCR, oldDescr, descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumFacts() {
		return numFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFacts(String newNumFacts) {
		String oldNumFacts = numFacts;
		numFacts = newNumFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__NUM_FACTS, oldNumFacts, numFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getRootFactor() {
		return rootFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFactor(Factor newRootFactor, NotificationChain msgs) {
		Factor oldRootFactor = rootFactor;
		rootFactor = newRootFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__ROOT_FACTOR, oldRootFactor, newRootFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFactor(Factor newRootFactor) {
		if (newRootFactor != rootFactor) {
			NotificationChain msgs = null;
			if (rootFactor != null)
				msgs = ((InternalEObject)rootFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DssmmPackage.MODEL__ROOT_FACTOR, null, msgs);
			if (newRootFactor != null)
				msgs = ((InternalEObject)newRootFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DssmmPackage.MODEL__ROOT_FACTOR, null, msgs);
			msgs = basicSetRootFactor(newRootFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmPackage.MODEL__ROOT_FACTOR, newRootFactor, newRootFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DssmmPackage.MODEL__ROOT_FACTOR:
				return basicSetRootFactor(null, msgs);
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
			case DssmmPackage.MODEL__MODEL_ID:
				return getModelID();
			case DssmmPackage.MODEL__NAME:
				return getName();
			case DssmmPackage.MODEL__GOAL:
				return getGoal();
			case DssmmPackage.MODEL__DESCR:
				return getDescr();
			case DssmmPackage.MODEL__NUM_FACTS:
				return getNumFacts();
			case DssmmPackage.MODEL__ROOT_FACTOR:
				return getRootFactor();
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
			case DssmmPackage.MODEL__MODEL_ID:
				setModelID((Integer)newValue);
				return;
			case DssmmPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case DssmmPackage.MODEL__GOAL:
				setGoal((String)newValue);
				return;
			case DssmmPackage.MODEL__DESCR:
				setDescr((String)newValue);
				return;
			case DssmmPackage.MODEL__NUM_FACTS:
				setNumFacts((String)newValue);
				return;
			case DssmmPackage.MODEL__ROOT_FACTOR:
				setRootFactor((Factor)newValue);
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
			case DssmmPackage.MODEL__MODEL_ID:
				setModelID(MODEL_ID_EDEFAULT);
				return;
			case DssmmPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DssmmPackage.MODEL__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case DssmmPackage.MODEL__DESCR:
				setDescr(DESCR_EDEFAULT);
				return;
			case DssmmPackage.MODEL__NUM_FACTS:
				setNumFacts(NUM_FACTS_EDEFAULT);
				return;
			case DssmmPackage.MODEL__ROOT_FACTOR:
				setRootFactor((Factor)null);
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
			case DssmmPackage.MODEL__MODEL_ID:
				return modelID != MODEL_ID_EDEFAULT;
			case DssmmPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DssmmPackage.MODEL__GOAL:
				return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
			case DssmmPackage.MODEL__DESCR:
				return DESCR_EDEFAULT == null ? descr != null : !DESCR_EDEFAULT.equals(descr);
			case DssmmPackage.MODEL__NUM_FACTS:
				return NUM_FACTS_EDEFAULT == null ? numFacts != null : !NUM_FACTS_EDEFAULT.equals(numFacts);
			case DssmmPackage.MODEL__ROOT_FACTOR:
				return rootFactor != null;
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
		result.append(" (ModelID: ");
		result.append(modelID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Goal: ");
		result.append(goal);
		result.append(", Descr: ");
		result.append(descr);
		result.append(", NumFacts: ");
		result.append(numFacts);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
