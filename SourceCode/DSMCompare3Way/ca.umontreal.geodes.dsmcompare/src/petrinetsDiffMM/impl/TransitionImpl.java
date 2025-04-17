/**
 */
package petrinetsDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetsDiffMM.DiffTransition_places;
import petrinetsDiffMM.PetrinetsDiffMMPackage;
import petrinetsDiffMM.Place;
import petrinetsDiffMM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.impl.TransitionImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.TransitionImpl#getDiffplaces <em>Diffplaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getDiffplaces() <em>Diffplaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffTransition_places> diffplaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsDiffMMPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectResolvingEList<Place>(Place.class, this, PetrinetsDiffMMPackage.TRANSITION__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffTransition_places> getDiffplaces() {
		if (diffplaces == null) {
			diffplaces = new EObjectContainmentEList<DiffTransition_places>(DiffTransition_places.class, this, PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES);
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
			case PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case PetrinetsDiffMMPackage.TRANSITION__PLACES:
				return getPlaces();
			case PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case PetrinetsDiffMMPackage.TRANSITION__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES:
				getDiffplaces().clear();
				getDiffplaces().addAll((Collection<? extends DiffTransition_places>)newValue);
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
			case PetrinetsDiffMMPackage.TRANSITION__PLACES:
				getPlaces().clear();
				return;
			case PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case PetrinetsDiffMMPackage.TRANSITION__PLACES:
				return places != null && !places.isEmpty();
			case PetrinetsDiffMMPackage.TRANSITION__DIFFPLACES:
				return diffplaces != null && !diffplaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
