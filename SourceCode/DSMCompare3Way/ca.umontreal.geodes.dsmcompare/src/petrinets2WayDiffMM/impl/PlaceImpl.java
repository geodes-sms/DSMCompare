/**
 */
package petrinets2WayDiffMM.impl;

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

import petrinets2WayDiffMM.DiffPlace_transitions;
import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;
import petrinets2WayDiffMM.Place;
import petrinets2WayDiffMM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.impl.PlaceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.PlaceImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.PlaceImpl#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends NamedElementImpl implements Place {
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
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getDifftransitions() <em>Difftransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifftransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlace_transitions> difftransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinets2WayDiffMMPackage.Literals.PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayDiffMMPackage.PLACE__TOKENS, oldTokens, tokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectResolvingEList<Transition>(Transition.class, this, Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPlace_transitions> getDifftransitions() {
		if (difftransitions == null) {
			difftransitions = new EObjectContainmentEList<DiffPlace_transitions>(DiffPlace_transitions.class, this, Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS);
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
			case Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PLACE__TOKENS:
				return getTokens();
			case Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS:
				return getTransitions();
			case Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PLACE__TOKENS:
				setTokens((Integer)newValue);
				return;
			case Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS:
				getDifftransitions().clear();
				getDifftransitions().addAll((Collection<? extends DiffPlace_transitions>)newValue);
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
			case Petrinets2WayDiffMMPackage.PLACE__TOKENS:
				setTokens(TOKENS_EDEFAULT);
				return;
			case Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS:
				getTransitions().clear();
				return;
			case Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PLACE__TOKENS:
				return tokens != TOKENS_EDEFAULT;
			case Petrinets2WayDiffMMPackage.PLACE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case Petrinets2WayDiffMMPackage.PLACE__DIFFTRANSITIONS:
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

} //PlaceImpl
