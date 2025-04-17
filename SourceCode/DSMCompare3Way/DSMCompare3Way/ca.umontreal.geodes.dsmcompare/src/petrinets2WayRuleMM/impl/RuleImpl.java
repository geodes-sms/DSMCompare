/**
 */
package petrinets2WayRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinets2WayDiffMM.DiffPetriNet;
import petrinets2WayDiffMM.DiffPetriNet_places;
import petrinets2WayDiffMM.DiffPetriNet_transitions;
import petrinets2WayDiffMM.DiffPlace;
import petrinets2WayDiffMM.DiffPlace_transitions;
import petrinets2WayDiffMM.DiffTransition;
import petrinets2WayDiffMM.DiffTransition_places;
import petrinets2WayDiffMM.NamedElement;
import petrinets2WayDiffMM.SemanticObject;

import petrinets2WayRuleMM.Petrinets2WayRuleMMPackage;
import petrinets2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPetriNet <em>Rule Pattern Diff Petri Net</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPetriNet_places <em>Rule Pattern Diff Petri Net places</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPetriNet_transitions <em>Rule Pattern Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPlace <em>Rule Pattern Diff Place</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffPlace_transitions <em>Rule Pattern Diff Place transitions</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffTransition <em>Rule Pattern Diff Transition</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_DiffTransition_places <em>Rule Pattern Diff Transition places</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_NamedElement <em>Rule Pattern Named Element</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.RuleImpl#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPetriNet() <em>Rule Pattern Diff Petri Net</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPetriNet()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet> rulePattern_DiffPetriNet;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPetriNet_places() <em>Rule Pattern Diff Petri Net places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPetriNet_places()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_places> rulePattern_DiffPetriNet_places;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPetriNet_transitions() <em>Rule Pattern Diff Petri Net transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPetriNet_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_transitions> rulePattern_DiffPetriNet_transitions;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPlace() <em>Rule Pattern Diff Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlace> rulePattern_DiffPlace;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffPlace_transitions() <em>Rule Pattern Diff Place transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffPlace_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlace_transitions> rulePattern_DiffPlace_transitions;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffTransition() <em>Rule Pattern Diff Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffTransition> rulePattern_DiffTransition;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffTransition_places() <em>Rule Pattern Diff Transition places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffTransition_places()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffTransition_places> rulePattern_DiffTransition_places;

	/**
	 * The cached value of the '{@link #getRulePattern_NamedElement() <em>Rule Pattern Named Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> rulePattern_NamedElement;

	/**
	 * The cached value of the '{@link #getRulePattern_SemanticObject() <em>Rule Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticObject> rulePattern_SemanticObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinets2WayRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, Petrinets2WayRuleMMPackage.RULE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet> getRulePattern_DiffPetriNet() {
		if (rulePattern_DiffPetriNet == null) {
			rulePattern_DiffPetriNet = new EObjectContainmentEList<DiffPetriNet>(DiffPetriNet.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET);
		}
		return rulePattern_DiffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_places> getRulePattern_DiffPetriNet_places() {
		if (rulePattern_DiffPetriNet_places == null) {
			rulePattern_DiffPetriNet_places = new EObjectContainmentEList<DiffPetriNet_places>(DiffPetriNet_places.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES);
		}
		return rulePattern_DiffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_transitions> getRulePattern_DiffPetriNet_transitions() {
		if (rulePattern_DiffPetriNet_transitions == null) {
			rulePattern_DiffPetriNet_transitions = new EObjectContainmentEList<DiffPetriNet_transitions>(DiffPetriNet_transitions.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		}
		return rulePattern_DiffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPlace> getRulePattern_DiffPlace() {
		if (rulePattern_DiffPlace == null) {
			rulePattern_DiffPlace = new EObjectContainmentEList<DiffPlace>(DiffPlace.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE);
		}
		return rulePattern_DiffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPlace_transitions> getRulePattern_DiffPlace_transitions() {
		if (rulePattern_DiffPlace_transitions == null) {
			rulePattern_DiffPlace_transitions = new EObjectContainmentEList<DiffPlace_transitions>(DiffPlace_transitions.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS);
		}
		return rulePattern_DiffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffTransition> getRulePattern_DiffTransition() {
		if (rulePattern_DiffTransition == null) {
			rulePattern_DiffTransition = new EObjectContainmentEList<DiffTransition>(DiffTransition.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION);
		}
		return rulePattern_DiffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffTransition_places> getRulePattern_DiffTransition_places() {
		if (rulePattern_DiffTransition_places == null) {
			rulePattern_DiffTransition_places = new EObjectContainmentEList<DiffTransition_places>(DiffTransition_places.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES);
		}
		return rulePattern_DiffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getRulePattern_NamedElement() {
		if (rulePattern_NamedElement == null) {
			rulePattern_NamedElement = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT);
		}
		return rulePattern_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticObject> getRulePattern_SemanticObject() {
		if (rulePattern_SemanticObject == null) {
			rulePattern_SemanticObject = new EObjectContainmentEList<SemanticObject>(SemanticObject.class, this, Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET:
				return ((InternalEList<?>)getRulePattern_DiffPetriNet()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES:
				return ((InternalEList<?>)getRulePattern_DiffPetriNet_places()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return ((InternalEList<?>)getRulePattern_DiffPetriNet_transitions()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE:
				return ((InternalEList<?>)getRulePattern_DiffPlace()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS:
				return ((InternalEList<?>)getRulePattern_DiffPlace_transitions()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION:
				return ((InternalEList<?>)getRulePattern_DiffTransition()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES:
				return ((InternalEList<?>)getRulePattern_DiffTransition_places()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT:
				return ((InternalEList<?>)getRulePattern_NamedElement()).basicRemove(otherEnd, msgs);
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_SemanticObject()).basicRemove(otherEnd, msgs);
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
			case Petrinets2WayRuleMMPackage.RULE__NAME:
				return getName();
			case Petrinets2WayRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case Petrinets2WayRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET:
				return getRulePattern_DiffPetriNet();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES:
				return getRulePattern_DiffPetriNet_places();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return getRulePattern_DiffPetriNet_transitions();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE:
				return getRulePattern_DiffPlace();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS:
				return getRulePattern_DiffPlace_transitions();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION:
				return getRulePattern_DiffTransition();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES:
				return getRulePattern_DiffTransition_places();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT:
				return getRulePattern_NamedElement();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_SemanticObject();
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
			case Petrinets2WayRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET:
				getRulePattern_DiffPetriNet().clear();
				getRulePattern_DiffPetriNet().addAll((Collection<? extends DiffPetriNet>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES:
				getRulePattern_DiffPetriNet_places().clear();
				getRulePattern_DiffPetriNet_places().addAll((Collection<? extends DiffPetriNet_places>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				getRulePattern_DiffPetriNet_transitions().clear();
				getRulePattern_DiffPetriNet_transitions().addAll((Collection<? extends DiffPetriNet_transitions>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE:
				getRulePattern_DiffPlace().clear();
				getRulePattern_DiffPlace().addAll((Collection<? extends DiffPlace>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS:
				getRulePattern_DiffPlace_transitions().clear();
				getRulePattern_DiffPlace_transitions().addAll((Collection<? extends DiffPlace_transitions>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION:
				getRulePattern_DiffTransition().clear();
				getRulePattern_DiffTransition().addAll((Collection<? extends DiffTransition>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES:
				getRulePattern_DiffTransition_places().clear();
				getRulePattern_DiffTransition_places().addAll((Collection<? extends DiffTransition_places>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT:
				getRulePattern_NamedElement().clear();
				getRulePattern_NamedElement().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				getRulePattern_SemanticObject().addAll((Collection<? extends SemanticObject>)newValue);
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
			case Petrinets2WayRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Petrinets2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET:
				getRulePattern_DiffPetriNet().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES:
				getRulePattern_DiffPetriNet_places().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				getRulePattern_DiffPetriNet_transitions().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE:
				getRulePattern_DiffPlace().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS:
				getRulePattern_DiffPlace_transitions().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION:
				getRulePattern_DiffTransition().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES:
				getRulePattern_DiffTransition_places().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT:
				getRulePattern_NamedElement().clear();
				return;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
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
			case Petrinets2WayRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Petrinets2WayRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET:
				return rulePattern_DiffPetriNet != null && !rulePattern_DiffPetriNet.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_PLACES:
				return rulePattern_DiffPetriNet_places != null && !rulePattern_DiffPetriNet_places.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return rulePattern_DiffPetriNet_transitions != null && !rulePattern_DiffPetriNet_transitions.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE:
				return rulePattern_DiffPlace != null && !rulePattern_DiffPlace.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_PLACE_TRANSITIONS:
				return rulePattern_DiffPlace_transitions != null && !rulePattern_DiffPlace_transitions.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION:
				return rulePattern_DiffTransition != null && !rulePattern_DiffTransition.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_TRANSITION_PLACES:
				return rulePattern_DiffTransition_places != null && !rulePattern_DiffTransition_places.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_NAMED_ELEMENT:
				return rulePattern_NamedElement != null && !rulePattern_NamedElement.isEmpty();
			case Petrinets2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_SemanticObject != null && !rulePattern_SemanticObject.isEmpty();
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
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
