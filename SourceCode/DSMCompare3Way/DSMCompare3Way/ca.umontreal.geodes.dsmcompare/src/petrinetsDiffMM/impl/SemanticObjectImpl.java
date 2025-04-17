/**
 */
package petrinetsDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petrinetsDiffMM.DiffPetriNet;
import petrinetsDiffMM.DiffPetriNet_places;
import petrinetsDiffMM.DiffPetriNet_transitions;
import petrinetsDiffMM.DiffPlace;
import petrinetsDiffMM.DiffPlace_transitions;
import petrinetsDiffMM.DiffTransition;
import petrinetsDiffMM.DiffTransition_places;
import petrinetsDiffMM.NamedElement;
import petrinetsDiffMM.PetrinetsDiffMMPackage;
import petrinetsDiffMM.SemanticObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}</li>
 *   <li>{@link petrinetsDiffMM.impl.SemanticObjectImpl#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticObjectImpl extends MinimalEObjectImpl.Container implements SemanticObject {
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
	 * The cached value of the '{@link #getSemanticObject_DiffPetriNet() <em>Semantic Object Diff Petri Net</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPetriNet()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet> semanticObject_DiffPetriNet;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPetriNet_places() <em>Semantic Object Diff Petri Net places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPetriNet_places()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_places> semanticObject_DiffPetriNet_places;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPetriNet_transitions() <em>Semantic Object Diff Petri Net transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPetriNet_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPetriNet_transitions> semanticObject_DiffPetriNet_transitions;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPlace() <em>Semantic Object Diff Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlace> semanticObject_DiffPlace;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPlace_transitions() <em>Semantic Object Diff Place transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPlace_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPlace_transitions> semanticObject_DiffPlace_transitions;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffTransition() <em>Semantic Object Diff Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffTransition> semanticObject_DiffTransition;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffTransition_places() <em>Semantic Object Diff Transition places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffTransition_places()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffTransition_places> semanticObject_DiffTransition_places;

	/**
	 * The cached value of the '{@link #getSemanticObject_NamedElement() <em>Semantic Object Named Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> semanticObject_NamedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsDiffMMPackage.Literals.SEMANTIC_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet> getSemanticObject_DiffPetriNet() {
		if (semanticObject_DiffPetriNet == null) {
			semanticObject_DiffPetriNet = new EObjectResolvingEList<DiffPetriNet>(DiffPetriNet.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET);
		}
		return semanticObject_DiffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_places> getSemanticObject_DiffPetriNet_places() {
		if (semanticObject_DiffPetriNet_places == null) {
			semanticObject_DiffPetriNet_places = new EObjectResolvingEList<DiffPetriNet_places>(DiffPetriNet_places.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES);
		}
		return semanticObject_DiffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPetriNet_transitions> getSemanticObject_DiffPetriNet_transitions() {
		if (semanticObject_DiffPetriNet_transitions == null) {
			semanticObject_DiffPetriNet_transitions = new EObjectResolvingEList<DiffPetriNet_transitions>(DiffPetriNet_transitions.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS);
		}
		return semanticObject_DiffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPlace> getSemanticObject_DiffPlace() {
		if (semanticObject_DiffPlace == null) {
			semanticObject_DiffPlace = new EObjectResolvingEList<DiffPlace>(DiffPlace.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE);
		}
		return semanticObject_DiffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPlace_transitions> getSemanticObject_DiffPlace_transitions() {
		if (semanticObject_DiffPlace_transitions == null) {
			semanticObject_DiffPlace_transitions = new EObjectResolvingEList<DiffPlace_transitions>(DiffPlace_transitions.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS);
		}
		return semanticObject_DiffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffTransition> getSemanticObject_DiffTransition() {
		if (semanticObject_DiffTransition == null) {
			semanticObject_DiffTransition = new EObjectResolvingEList<DiffTransition>(DiffTransition.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION);
		}
		return semanticObject_DiffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffTransition_places> getSemanticObject_DiffTransition_places() {
		if (semanticObject_DiffTransition_places == null) {
			semanticObject_DiffTransition_places = new EObjectResolvingEList<DiffTransition_places>(DiffTransition_places.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES);
		}
		return semanticObject_DiffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getSemanticObject_NamedElement() {
		if (semanticObject_NamedElement == null) {
			semanticObject_NamedElement = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT);
		}
		return semanticObject_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return getName();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				return getSemanticObject_DiffPetriNet();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				return getSemanticObject_DiffPetriNet_places();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				return getSemanticObject_DiffPetriNet_transitions();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				return getSemanticObject_DiffPlace();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				return getSemanticObject_DiffPlace_transitions();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				return getSemanticObject_DiffTransition();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				return getSemanticObject_DiffTransition_places();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
				return getSemanticObject_NamedElement();
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
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				getSemanticObject_DiffPetriNet().clear();
				getSemanticObject_DiffPetriNet().addAll((Collection<? extends DiffPetriNet>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				getSemanticObject_DiffPetriNet_places().clear();
				getSemanticObject_DiffPetriNet_places().addAll((Collection<? extends DiffPetriNet_places>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				getSemanticObject_DiffPetriNet_transitions().clear();
				getSemanticObject_DiffPetriNet_transitions().addAll((Collection<? extends DiffPetriNet_transitions>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				getSemanticObject_DiffPlace().clear();
				getSemanticObject_DiffPlace().addAll((Collection<? extends DiffPlace>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				getSemanticObject_DiffPlace_transitions().clear();
				getSemanticObject_DiffPlace_transitions().addAll((Collection<? extends DiffPlace_transitions>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				getSemanticObject_DiffTransition().clear();
				getSemanticObject_DiffTransition().addAll((Collection<? extends DiffTransition>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				getSemanticObject_DiffTransition_places().clear();
				getSemanticObject_DiffTransition_places().addAll((Collection<? extends DiffTransition_places>)newValue);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
				getSemanticObject_NamedElement().clear();
				getSemanticObject_NamedElement().addAll((Collection<? extends NamedElement>)newValue);
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
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				getSemanticObject_DiffPetriNet().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				getSemanticObject_DiffPetriNet_places().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				getSemanticObject_DiffPetriNet_transitions().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				getSemanticObject_DiffPlace().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				getSemanticObject_DiffPlace_transitions().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				getSemanticObject_DiffTransition().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				getSemanticObject_DiffTransition_places().clear();
				return;
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
				getSemanticObject_NamedElement().clear();
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
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				return semanticObject_DiffPetriNet != null && !semanticObject_DiffPetriNet.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				return semanticObject_DiffPetriNet_places != null && !semanticObject_DiffPetriNet_places.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				return semanticObject_DiffPetriNet_transitions != null && !semanticObject_DiffPetriNet_transitions.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				return semanticObject_DiffPlace != null && !semanticObject_DiffPlace.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				return semanticObject_DiffPlace_transitions != null && !semanticObject_DiffPlace_transitions.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				return semanticObject_DiffTransition != null && !semanticObject_DiffTransition.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				return semanticObject_DiffTransition_places != null && !semanticObject_DiffTransition_places.isEmpty();
			case PetrinetsDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
				return semanticObject_NamedElement != null && !semanticObject_NamedElement.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SemanticObjectImpl
