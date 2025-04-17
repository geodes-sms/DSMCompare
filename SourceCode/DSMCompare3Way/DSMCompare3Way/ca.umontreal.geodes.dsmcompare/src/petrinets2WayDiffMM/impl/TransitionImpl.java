/**
 */
package petrinets2WayDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinets2WayDiffMM.DiffTransition_places;
import petrinets2WayDiffMM.Petrinets2WayDiffMMPackage;
import petrinets2WayDiffMM.Place;
import petrinets2WayDiffMM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayDiffMM.impl.TransitionImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinets2WayDiffMM.impl.TransitionImpl#getDiffplaces <em>Diffplaces</em>}</li>
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
		return Petrinets2WayDiffMMPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectResolvingEList<Place>(Place.class, this, Petrinets2WayDiffMMPackage.TRANSITION__PLACES);
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
			diffplaces = new EObjectContainmentEList<DiffTransition_places>(DiffTransition_places.class, this, Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES);
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
			case Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case Petrinets2WayDiffMMPackage.TRANSITION__PLACES:
				return getPlaces();
			case Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case Petrinets2WayDiffMMPackage.TRANSITION__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case Petrinets2WayDiffMMPackage.TRANSITION__PLACES:
				getPlaces().clear();
				return;
			case Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES:
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
			case Petrinets2WayDiffMMPackage.TRANSITION__PLACES:
				return places != null && !places.isEmpty();
			case Petrinets2WayDiffMMPackage.TRANSITION__DIFFPLACES:
				return diffplaces != null && !diffplaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
