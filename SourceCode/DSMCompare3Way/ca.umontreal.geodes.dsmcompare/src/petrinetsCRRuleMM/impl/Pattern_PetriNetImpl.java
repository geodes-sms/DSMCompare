/**
 */
package petrinetsCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetsCRRuleMM.Pattern_DiffPetriNet_places;
import petrinetsCRRuleMM.Pattern_DiffPetriNet_transitions;
import petrinetsCRRuleMM.Pattern_PetriNet;
import petrinetsCRRuleMM.Pattern_Place;
import petrinetsCRRuleMM.Pattern_Transition;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl#getDiffplaces <em>Diffplaces</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PetriNetImpl#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_PetriNetImpl extends Pattern_NamedElementImpl implements Pattern_PetriNet {
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Transition> transitions;

	/**
	 * The cached value of the '{@link #getDiffplaces() <em>Diffplaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_places> diffplaces;

	/**
	 * The cached value of the '{@link #getDifftransitions() <em>Difftransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifftransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_transitions> difftransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsCRRuleMMPackage.Literals.PATTERN_PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Pattern_Place>(Pattern_Place.class, this, PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Pattern_Transition>(Pattern_Transition.class, this, PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_places> getDiffplaces() {
		if (diffplaces == null) {
			diffplaces = new EObjectContainmentEList<Pattern_DiffPetriNet_places>(Pattern_DiffPetriNet_places.class, this, PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES);
		}
		return diffplaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_transitions> getDifftransitions() {
		if (difftransitions == null) {
			difftransitions = new EObjectContainmentEList<Pattern_DiffPetriNet_transitions>(Pattern_DiffPetriNet_transitions.class, this, PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS);
		}
		return difftransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES:
				return ((InternalEList<?>)getDiffplaces()).basicRemove(otherEnd, msgs);
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS:
				return ((InternalEList<?>)getDifftransitions()).basicRemove(otherEnd, msgs);
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
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES:
				return getPlaces();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS:
				return getTransitions();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES:
				return getDiffplaces();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS:
				return getDifftransitions();
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
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Pattern_Place>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Pattern_Transition>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES:
				getDiffplaces().clear();
				getDiffplaces().addAll((Collection<? extends Pattern_DiffPetriNet_places>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS:
				getDifftransitions().clear();
				getDifftransitions().addAll((Collection<? extends Pattern_DiffPetriNet_transitions>)newValue);
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
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES:
				getPlaces().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES:
				getDiffplaces().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS:
				getDifftransitions().clear();
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
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__PLACES:
				return places != null && !places.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFPLACES:
				return diffplaces != null && !diffplaces.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_PETRI_NET__DIFFTRANSITIONS:
				return difftransitions != null && !difftransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Pattern_PetriNetImpl
