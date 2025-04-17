/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.DecisionSupport;
import dssmm2WayDiffMM.DiffDecisionSupport_model;
import dssmm2WayDiffMM.DiffDecisionSupport_options;
import dssmm2WayDiffMM.DiffDecisionSupport_vendors;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayDiffMM.Model;
import dssmm2WayDiffMM.Option;
import dssmm2WayDiffMM.Vendor;

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
 * An implementation of the model object '<em><b>Decision Support</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getName <em>Name</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getModel <em>Model</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getVendors <em>Vendors</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getDiffmodel <em>Diffmodel</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getDiffoptions <em>Diffoptions</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.DecisionSupportImpl#getDiffvendors <em>Diffvendors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportImpl extends MinimalEObjectImpl.Container implements DecisionSupport {
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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The cached value of the '{@link #getVendors() <em>Vendors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendors()
	 * @generated
	 * @ordered
	 */
	protected EList<Vendor> vendors;

	/**
	 * The cached value of the '{@link #getDiffmodel() <em>Diffmodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_model> diffmodel;

	/**
	 * The cached value of the '{@link #getDiffoptions() <em>Diffoptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffoptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_options> diffoptions;

	/**
	 * The cached value of the '{@link #getDiffvendors() <em>Diffvendors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffvendors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffDecisionSupport_vendors> diffvendors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dssmm2WayDiffMMPackage.Literals.DECISION_SUPPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vendor> getVendors() {
		if (vendors == null) {
			vendors = new EObjectContainmentEList<Vendor>(Vendor.class, this, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS);
		}
		return vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_model> getDiffmodel() {
		if (diffmodel == null) {
			diffmodel = new EObjectContainmentEList<DiffDecisionSupport_model>(DiffDecisionSupport_model.class, this, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL);
		}
		return diffmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_options> getDiffoptions() {
		if (diffoptions == null) {
			diffoptions = new EObjectContainmentEList<DiffDecisionSupport_options>(DiffDecisionSupport_options.class, this, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS);
		}
		return diffoptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffDecisionSupport_vendors> getDiffvendors() {
		if (diffvendors == null) {
			diffvendors = new EObjectContainmentEList<DiffDecisionSupport_vendors>(DiffDecisionSupport_vendors.class, this, Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS);
		}
		return diffvendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL:
				return basicSetModel(null, msgs);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS:
				return ((InternalEList<?>)getVendors()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL:
				return ((InternalEList<?>)getDiffmodel()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS:
				return ((InternalEList<?>)getDiffoptions()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS:
				return ((InternalEList<?>)getDiffvendors()).basicRemove(otherEnd, msgs);
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
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__NAME:
				return getName();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL:
				return getModel();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS:
				return getOptions();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS:
				return getVendors();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL:
				return getDiffmodel();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS:
				return getDiffoptions();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS:
				return getDiffvendors();
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
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__NAME:
				setName((String)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL:
				setModel((Model)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS:
				getVendors().clear();
				getVendors().addAll((Collection<? extends Vendor>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL:
				getDiffmodel().clear();
				getDiffmodel().addAll((Collection<? extends DiffDecisionSupport_model>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS:
				getDiffoptions().clear();
				getDiffoptions().addAll((Collection<? extends DiffDecisionSupport_options>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS:
				getDiffvendors().clear();
				getDiffvendors().addAll((Collection<? extends DiffDecisionSupport_vendors>)newValue);
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
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL:
				setModel((Model)null);
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS:
				getOptions().clear();
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS:
				getVendors().clear();
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL:
				getDiffmodel().clear();
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS:
				getDiffoptions().clear();
				return;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS:
				getDiffvendors().clear();
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
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__MODEL:
				return model != null;
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__OPTIONS:
				return options != null && !options.isEmpty();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__VENDORS:
				return vendors != null && !vendors.isEmpty();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFMODEL:
				return diffmodel != null && !diffmodel.isEmpty();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFOPTIONS:
				return diffoptions != null && !diffoptions.isEmpty();
			case Dssmm2WayDiffMMPackage.DECISION_SUPPORT__DIFFVENDORS:
				return diffvendors != null && !diffvendors.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DecisionSupportImpl
