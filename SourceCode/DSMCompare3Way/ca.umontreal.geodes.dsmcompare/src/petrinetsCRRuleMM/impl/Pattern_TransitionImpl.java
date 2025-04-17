/**
 */
package petrinetsCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetsCRRuleMM.Pattern_DiffTransition_places;
import petrinetsCRRuleMM.Pattern_Place;
import petrinetsCRRuleMM.Pattern_Transition;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_TransitionImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_TransitionImpl#getDiffplaces <em>Diffplaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_TransitionImpl extends Pattern_NamedElementImpl implements Pattern_Transition {
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Place> places;

	/**
	 * The cached value of the '{@link #getDiffplaces() <em>Diffplaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffTransition_places> diffplaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsCRRuleMMPackage.Literals.PATTERN_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Place> getPlaces() {
		if (places == null) {
			places = new EObjectResolvingEList<Pattern_Place>(Pattern_Place.class, this, PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffTransition_places> getDiffplaces() {
		if (diffplaces == null) {
			diffplaces = new EObjectContainmentEList<Pattern_DiffTransition_places>(Pattern_DiffTransition_places.class, this, PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES);
		}
		return diffplaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES:
				return ((InternalEList<?>)getDiffplaces()).basicRemove(otherEnd, msgs);
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
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__PLACES:
				return getPlaces();
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES:
				return getDiffplaces();
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
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Pattern_Place>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES:
				getDiffplaces().clear();
				getDiffplaces().addAll((Collection<? extends Pattern_DiffTransition_places>)newValue);
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
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__PLACES:
				getPlaces().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES:
				getDiffplaces().clear();
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
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__PLACES:
				return places != null && !places.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_TRANSITION__DIFFPLACES:
				return diffplaces != null && !diffplaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Pattern_TransitionImpl
