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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetsCRRuleMM.Pattern_DiffPlace_transitions;
import petrinetsCRRuleMM.Pattern_Place;
import petrinetsCRRuleMM.Pattern_Transition;
import petrinetsCRRuleMM.PetrinetsCRRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PlaceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PlaceImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_PlaceImpl#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_PlaceImpl extends Pattern_NamedElementImpl implements Pattern_Place {
	/**
	 * The default value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected int tokens = TOKENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Transition> transitions;

	/**
	 * The cached value of the '{@link #getDifftransitions() <em>Difftransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifftransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPlace_transitions> difftransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsCRRuleMMPackage.Literals.PATTERN_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokens(int newTokens) {
		int oldTokens = tokens;
		tokens = newTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_PLACE__TOKENS, oldTokens, tokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectResolvingEList<Pattern_Transition>(Pattern_Transition.class, this, PetrinetsCRRuleMMPackage.PATTERN_PLACE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPlace_transitions> getDifftransitions() {
		if (difftransitions == null) {
			difftransitions = new EObjectContainmentEList<Pattern_DiffPlace_transitions>(Pattern_DiffPlace_transitions.class, this, PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS);
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
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS:
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
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TOKENS:
				return getTokens();
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TRANSITIONS:
				return getTransitions();
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS:
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
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TOKENS:
				setTokens((Integer)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Pattern_Transition>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS:
				getDifftransitions().clear();
				getDifftransitions().addAll((Collection<? extends Pattern_DiffPlace_transitions>)newValue);
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
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TOKENS:
				setTokens(TOKENS_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TRANSITIONS:
				getTransitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS:
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
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TOKENS:
				return tokens != TOKENS_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_PLACE__DIFFTRANSITIONS:
				return difftransitions != null && !difftransitions.isEmpty();
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
		result.append(" (tokens: ");
		result.append(tokens);
		result.append(')');
		return result.toString();
	}

} //Pattern_PlaceImpl
