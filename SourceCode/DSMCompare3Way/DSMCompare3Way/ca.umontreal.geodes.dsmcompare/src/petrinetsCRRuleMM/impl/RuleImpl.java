/**
 */
package petrinetsCRRuleMM.impl;

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

import petrinetsCRRuleMM.Pattern_DiffPetriNet;
import petrinetsCRRuleMM.Pattern_DiffPetriNet_places;
import petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions;
import petrinetsCRRuleMM.Pattern_DiffPlace;
import petrinetsCRRuleMM.Pattern_DiffPlace_transitions;
import petrinetsCRRuleMM.Pattern_DiffTransition;
import petrinetsCRRuleMM.Pattern_DiffTransition_places;
import petrinetsCRRuleMM.Pattern_NamedElement;
import petrinetsCRRuleMM.Pattern_SemanticObject;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;
import petrinetsCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPetriNet <em>Rule Pattern Pattern Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPetriNet_places <em>Rule Pattern Pattern Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPetriNet_transitions <em>Rule Pattern Pattern Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPlace <em>Rule Pattern Pattern Diff Place</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffPlace_transitions <em>Rule Pattern Pattern Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffTransition <em>Rule Pattern Pattern Diff Transition</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffTransition_places <em>Rule Pattern Pattern Diff Transition places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_NamedElement <em>Rule Pattern Pattern Named Element</em>}</li>
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
	 * The cached value of the '{@link #getRulePattern_Pattern_SemanticObject() <em>Rule Pattern Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_SemanticObject> rulePattern_Pattern_SemanticObject;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPetriNet() <em>Rule Pattern Pattern Diff Petri Net</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPetriNet()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet> rulePattern_Pattern_DiffPetriNet;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPetriNet_places() <em>Rule Pattern Pattern Diff Petri Net places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPetriNet_places()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_places> rulePattern_Pattern_DiffPetriNet_places;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPetriNet_transitions() <em>Rule Pattern Pattern Diff Petri Net transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPetriNet_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_transitions> rulePattern_Pattern_DiffPetriNet_transitions;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPlace() <em>Rule Pattern Pattern Diff Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPlace> rulePattern_Pattern_DiffPlace;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffPlace_transitions() <em>Rule Pattern Pattern Diff Place transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffPlace_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPlace_transitions> rulePattern_Pattern_DiffPlace_transitions;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffTransition() <em>Rule Pattern Pattern Diff Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffTransition> rulePattern_Pattern_DiffTransition;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffTransition_places() <em>Rule Pattern Pattern Diff Transition places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffTransition_places()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffTransition_places> rulePattern_Pattern_DiffTransition_places;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_NamedElement() <em>Rule Pattern Pattern Named Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_NamedElement> rulePattern_Pattern_NamedElement;

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
		return PetrinetsCRRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, PetrinetsCRRuleMMPackage.RULE__CONSTRAINTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject() {
		if (rulePattern_Pattern_SemanticObject == null) {
			rulePattern_Pattern_SemanticObject = new EObjectContainmentEList<Pattern_SemanticObject>(Pattern_SemanticObject.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_Pattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet> getRulePattern_Pattern_DiffPetriNet() {
		if (rulePattern_Pattern_DiffPetriNet == null) {
			rulePattern_Pattern_DiffPetriNet = new EObjectContainmentEList<Pattern_DiffPetriNet>(Pattern_DiffPetriNet.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET);
		}
		return rulePattern_Pattern_DiffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_places> getRulePattern_Pattern_DiffPetriNet_places() {
		if (rulePattern_Pattern_DiffPetriNet_places == null) {
			rulePattern_Pattern_DiffPetriNet_places = new EObjectContainmentEList<Pattern_DiffPetriNet_places>(Pattern_DiffPetriNet_places.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES);
		}
		return rulePattern_Pattern_DiffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_transitions> getRulePattern_Pattern_DiffPetriNet_transitions() {
		if (rulePattern_Pattern_DiffPetriNet_transitions == null) {
			rulePattern_Pattern_DiffPetriNet_transitions = new EObjectContainmentEList<Pattern_DiffPetriNet_transitions>(Pattern_DiffPetriNet_transitions.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS);
		}
		return rulePattern_Pattern_DiffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPlace> getRulePattern_Pattern_DiffPlace() {
		if (rulePattern_Pattern_DiffPlace == null) {
			rulePattern_Pattern_DiffPlace = new EObjectContainmentEList<Pattern_DiffPlace>(Pattern_DiffPlace.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE);
		}
		return rulePattern_Pattern_DiffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPlace_transitions> getRulePattern_Pattern_DiffPlace_transitions() {
		if (rulePattern_Pattern_DiffPlace_transitions == null) {
			rulePattern_Pattern_DiffPlace_transitions = new EObjectContainmentEList<Pattern_DiffPlace_transitions>(Pattern_DiffPlace_transitions.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS);
		}
		return rulePattern_Pattern_DiffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffTransition> getRulePattern_Pattern_DiffTransition() {
		if (rulePattern_Pattern_DiffTransition == null) {
			rulePattern_Pattern_DiffTransition = new EObjectContainmentEList<Pattern_DiffTransition>(Pattern_DiffTransition.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION);
		}
		return rulePattern_Pattern_DiffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffTransition_places> getRulePattern_Pattern_DiffTransition_places() {
		if (rulePattern_Pattern_DiffTransition_places == null) {
			rulePattern_Pattern_DiffTransition_places = new EObjectContainmentEList<Pattern_DiffTransition_places>(Pattern_DiffTransition_places.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES);
		}
		return rulePattern_Pattern_DiffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_NamedElement> getRulePattern_Pattern_NamedElement() {
		if (rulePattern_Pattern_NamedElement == null) {
			rulePattern_Pattern_NamedElement = new EObjectContainmentEList<Pattern_NamedElement>(Pattern_NamedElement.class, this, PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT);
		}
		return rulePattern_Pattern_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_Pattern_SemanticObject()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPetriNet()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPetriNet_places()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPetriNet_transitions()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPlace()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffPlace_transitions()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffTransition()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffTransition_places()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT:
				return ((InternalEList<?>)getRulePattern_Pattern_NamedElement()).basicRemove(otherEnd, msgs);
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
			case PetrinetsCRRuleMMPackage.RULE__NAME:
				return getName();
			case PetrinetsCRRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case PetrinetsCRRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_Pattern_SemanticObject();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET:
				return getRulePattern_Pattern_DiffPetriNet();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES:
				return getRulePattern_Pattern_DiffPetriNet_places();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return getRulePattern_Pattern_DiffPetriNet_transitions();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE:
				return getRulePattern_Pattern_DiffPlace();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS:
				return getRulePattern_Pattern_DiffPlace_transitions();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION:
				return getRulePattern_Pattern_DiffTransition();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES:
				return getRulePattern_Pattern_DiffTransition_places();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT:
				return getRulePattern_Pattern_NamedElement();
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
			case PetrinetsCRRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				getRulePattern_Pattern_SemanticObject().addAll((Collection<? extends Pattern_SemanticObject>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET:
				getRulePattern_Pattern_DiffPetriNet().clear();
				getRulePattern_Pattern_DiffPetriNet().addAll((Collection<? extends Pattern_DiffPetriNet>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES:
				getRulePattern_Pattern_DiffPetriNet_places().clear();
				getRulePattern_Pattern_DiffPetriNet_places().addAll((Collection<? extends Pattern_DiffPetriNet_places>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				getRulePattern_Pattern_DiffPetriNet_transitions().clear();
				getRulePattern_Pattern_DiffPetriNet_transitions().addAll((Collection<? extends Pattern_DiffPetriNet_transitions>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE:
				getRulePattern_Pattern_DiffPlace().clear();
				getRulePattern_Pattern_DiffPlace().addAll((Collection<? extends Pattern_DiffPlace>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS:
				getRulePattern_Pattern_DiffPlace_transitions().clear();
				getRulePattern_Pattern_DiffPlace_transitions().addAll((Collection<? extends Pattern_DiffPlace_transitions>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION:
				getRulePattern_Pattern_DiffTransition().clear();
				getRulePattern_Pattern_DiffTransition().addAll((Collection<? extends Pattern_DiffTransition>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES:
				getRulePattern_Pattern_DiffTransition_places().clear();
				getRulePattern_Pattern_DiffTransition_places().addAll((Collection<? extends Pattern_DiffTransition_places>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT:
				getRulePattern_Pattern_NamedElement().clear();
				getRulePattern_Pattern_NamedElement().addAll((Collection<? extends Pattern_NamedElement>)newValue);
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
			case PetrinetsCRRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET:
				getRulePattern_Pattern_DiffPetriNet().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES:
				getRulePattern_Pattern_DiffPetriNet_places().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				getRulePattern_Pattern_DiffPetriNet_transitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE:
				getRulePattern_Pattern_DiffPlace().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS:
				getRulePattern_Pattern_DiffPlace_transitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION:
				getRulePattern_Pattern_DiffTransition().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES:
				getRulePattern_Pattern_DiffTransition_places().clear();
				return;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT:
				getRulePattern_Pattern_NamedElement().clear();
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
			case PetrinetsCRRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetsCRRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_Pattern_SemanticObject != null && !rulePattern_Pattern_SemanticObject.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET:
				return rulePattern_Pattern_DiffPetriNet != null && !rulePattern_Pattern_DiffPetriNet.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_PLACES:
				return rulePattern_Pattern_DiffPetriNet_places != null && !rulePattern_Pattern_DiffPetriNet_places.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PETRI_NET_TRANSITIONS:
				return rulePattern_Pattern_DiffPetriNet_transitions != null && !rulePattern_Pattern_DiffPetriNet_transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE:
				return rulePattern_Pattern_DiffPlace != null && !rulePattern_Pattern_DiffPlace.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_PLACE_TRANSITIONS:
				return rulePattern_Pattern_DiffPlace_transitions != null && !rulePattern_Pattern_DiffPlace_transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION:
				return rulePattern_Pattern_DiffTransition != null && !rulePattern_Pattern_DiffTransition.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_TRANSITION_PLACES:
				return rulePattern_Pattern_DiffTransition_places != null && !rulePattern_Pattern_DiffTransition_places.isEmpty();
			case PetrinetsCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_NAMED_ELEMENT:
				return rulePattern_Pattern_NamedElement != null && !rulePattern_Pattern_NamedElement.isEmpty();
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
