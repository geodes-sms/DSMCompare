/**
 */
package petrinets2WayDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinets2WayDiffMM.DiffPetriNet_places;
import petrinets2WayDiffMM.DiffPetriNet_transitions;
import petrinets2WayDiffMM.PetriNet;
import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;
import petrinets2WayDiffMM.Place;
import petrinets2WayDiffMM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.impl.PetriNetImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.PetriNetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.PetriNetImpl#getDiffplaces <em>Diffplaces</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.PetriNetImpl#getDifftransitions <em>Difftransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetriNetImpl extends NamedElementImpl implements PetriNet {
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getDiffplaces() <em>Diffplaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_places> diffplaces;

	/**
	 * The cached value of the '{@link #getDifftransitions() <em>Difftransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifftransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_transitions> difftransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinets2WayDiffMMPackage.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, Petrinets2WayDiffMMPackage.PETRI_NET__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_places> getDiffplaces() {
		if (diffplaces == null) {
			diffplaces = new EObjectContainmentEList<DiffPetriNet_places>(DiffPetriNet_places.class, this, Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES);
		}
		return diffplaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_transitions> getDifftransitions() {
		if (difftransitions == null) {
			difftransitions = new EObjectContainmentEList<DiffPetriNet_transitions>(DiffPetriNet_transitions.class, this, Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS);
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
			case Petrinets2WayDiffMMPackage.PETRI_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES:
				return ((InternalEList<?>)getDiffplaces()).basicRemove(otherEnd, msgs);
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PETRI_NET__PLACES:
				return getPlaces();
			case Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS:
				return getTransitions();
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES:
				return getDiffplaces();
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PETRI_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES:
				getDiffplaces().clear();
				getDiffplaces().addAll((Collection<? extends DiffPetriNet_places>)newValue);
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS:
				getDifftransitions().clear();
				getDifftransitions().addAll((Collection<? extends DiffPetriNet_transitions>)newValue);
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
			case Petrinets2WayDiffMMPackage.PETRI_NET__PLACES:
				getPlaces().clear();
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES:
				getDiffplaces().clear();
				return;
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS:
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
			case Petrinets2WayDiffMMPackage.PETRI_NET__PLACES:
				return places != null && !places.isEmpty();
			case Petrinets2WayDiffMMPackage.PETRI_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFPLACES:
				return diffplaces != null && !diffplaces.isEmpty();
			case Petrinets2WayDiffMMPackage.PETRI_NET__DIFFTRANSITIONS:
				return difftransitions != null && !difftransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PetriNetImpl
