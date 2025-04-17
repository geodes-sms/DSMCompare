/**
 */
package petrinetsCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPetriNet <em>Semantic Object Diff Petri Net</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPetriNet_places <em>Semantic Object Diff Petri Net places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPetriNet_transitions <em>Semantic Object Diff Petri Net transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPlace <em>Semantic Object Diff Place</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffPlace_transitions <em>Semantic Object Diff Place transitions</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffTransition <em>Semantic Object Diff Transition</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffTransition_places <em>Semantic Object Diff Transition places</em>}</li>
 *   <li>{@link petrinetsCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_NamedElement <em>Semantic Object Named Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Pattern_SemanticObjectImpl extends MinimalEObjectImpl.Container implements Pattern_SemanticObject {
	/**
	 * The default value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected int iD_Pattern = ID_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

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
	protected EList<Pattern_DiffPetriNet> semanticObject_DiffPetriNet;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPetriNet_places() <em>Semantic Object Diff Petri Net places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPetriNet_places()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_places> semanticObject_DiffPetriNet_places;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPetriNet_transitions() <em>Semantic Object Diff Petri Net transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPetriNet_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPetriNet_transitions> semanticObject_DiffPetriNet_transitions;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPlace() <em>Semantic Object Diff Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPlace> semanticObject_DiffPlace;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffPlace_transitions() <em>Semantic Object Diff Place transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffPlace_transitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPlace_transitions> semanticObject_DiffPlace_transitions;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffTransition() <em>Semantic Object Diff Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffTransition> semanticObject_DiffTransition;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffTransition_places() <em>Semantic Object Diff Transition places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffTransition_places()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffTransition_places> semanticObject_DiffTransition_places;

	/**
	 * The cached value of the '{@link #getSemanticObject_NamedElement() <em>Semantic Object Named Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_NamedElement> semanticObject_NamedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetsCRRuleMMPackage.Literals.PATTERN_SEMANTIC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet> getSemanticObject_DiffPetriNet() {
		if (semanticObject_DiffPetriNet == null) {
			semanticObject_DiffPetriNet = new EObjectResolvingEList<Pattern_DiffPetriNet>(Pattern_DiffPetriNet.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET);
		}
		return semanticObject_DiffPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_places> getSemanticObject_DiffPetriNet_places() {
		if (semanticObject_DiffPetriNet_places == null) {
			semanticObject_DiffPetriNet_places = new EObjectResolvingEList<Pattern_DiffPetriNet_places>(Pattern_DiffPetriNet_places.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES);
		}
		return semanticObject_DiffPetriNet_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPetriNet_transitions> getSemanticObject_DiffPetriNet_transitions() {
		if (semanticObject_DiffPetriNet_transitions == null) {
			semanticObject_DiffPetriNet_transitions = new EObjectResolvingEList<Pattern_DiffPetriNet_transitions>(Pattern_DiffPetriNet_transitions.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS);
		}
		return semanticObject_DiffPetriNet_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPlace> getSemanticObject_DiffPlace() {
		if (semanticObject_DiffPlace == null) {
			semanticObject_DiffPlace = new EObjectResolvingEList<Pattern_DiffPlace>(Pattern_DiffPlace.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE);
		}
		return semanticObject_DiffPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPlace_transitions> getSemanticObject_DiffPlace_transitions() {
		if (semanticObject_DiffPlace_transitions == null) {
			semanticObject_DiffPlace_transitions = new EObjectResolvingEList<Pattern_DiffPlace_transitions>(Pattern_DiffPlace_transitions.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS);
		}
		return semanticObject_DiffPlace_transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffTransition> getSemanticObject_DiffTransition() {
		if (semanticObject_DiffTransition == null) {
			semanticObject_DiffTransition = new EObjectResolvingEList<Pattern_DiffTransition>(Pattern_DiffTransition.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION);
		}
		return semanticObject_DiffTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffTransition_places> getSemanticObject_DiffTransition_places() {
		if (semanticObject_DiffTransition_places == null) {
			semanticObject_DiffTransition_places = new EObjectResolvingEList<Pattern_DiffTransition_places>(Pattern_DiffTransition_places.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES);
		}
		return semanticObject_DiffTransition_places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_NamedElement> getSemanticObject_NamedElement() {
		if (semanticObject_NamedElement == null) {
			semanticObject_NamedElement = new EObjectResolvingEList<Pattern_NamedElement>(Pattern_NamedElement.class, this, PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT);
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
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return getID_Pattern();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isIsForbidden();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return getName();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				return getSemanticObject_DiffPetriNet();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				return getSemanticObject_DiffPetriNet_places();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				return getSemanticObject_DiffPetriNet_transitions();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				return getSemanticObject_DiffPlace();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				return getSemanticObject_DiffPlace_transitions();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				return getSemanticObject_DiffTransition();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				return getSemanticObject_DiffTransition_places();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
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
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				getSemanticObject_DiffPetriNet().clear();
				getSemanticObject_DiffPetriNet().addAll((Collection<? extends Pattern_DiffPetriNet>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				getSemanticObject_DiffPetriNet_places().clear();
				getSemanticObject_DiffPetriNet_places().addAll((Collection<? extends Pattern_DiffPetriNet_places>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				getSemanticObject_DiffPetriNet_transitions().clear();
				getSemanticObject_DiffPetriNet_transitions().addAll((Collection<? extends Pattern_DiffPetriNet_transitions>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				getSemanticObject_DiffPlace().clear();
				getSemanticObject_DiffPlace().addAll((Collection<? extends Pattern_DiffPlace>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				getSemanticObject_DiffPlace_transitions().clear();
				getSemanticObject_DiffPlace_transitions().addAll((Collection<? extends Pattern_DiffPlace_transitions>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				getSemanticObject_DiffTransition().clear();
				getSemanticObject_DiffTransition().addAll((Collection<? extends Pattern_DiffTransition>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				getSemanticObject_DiffTransition_places().clear();
				getSemanticObject_DiffTransition_places().addAll((Collection<? extends Pattern_DiffTransition_places>)newValue);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
				getSemanticObject_NamedElement().clear();
				getSemanticObject_NamedElement().addAll((Collection<? extends Pattern_NamedElement>)newValue);
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
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				getSemanticObject_DiffPetriNet().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				getSemanticObject_DiffPetriNet_places().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				getSemanticObject_DiffPetriNet_transitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				getSemanticObject_DiffPlace().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				getSemanticObject_DiffPlace_transitions().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				getSemanticObject_DiffTransition().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				getSemanticObject_DiffTransition_places().clear();
				return;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
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
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET:
				return semanticObject_DiffPetriNet != null && !semanticObject_DiffPetriNet.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_PLACES:
				return semanticObject_DiffPetriNet_places != null && !semanticObject_DiffPetriNet_places.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PETRI_NET_TRANSITIONS:
				return semanticObject_DiffPetriNet_transitions != null && !semanticObject_DiffPetriNet_transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE:
				return semanticObject_DiffPlace != null && !semanticObject_DiffPlace.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_PLACE_TRANSITIONS:
				return semanticObject_DiffPlace_transitions != null && !semanticObject_DiffPlace_transitions.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION:
				return semanticObject_DiffTransition != null && !semanticObject_DiffTransition.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_TRANSITION_PLACES:
				return semanticObject_DiffTransition_places != null && !semanticObject_DiffTransition_places.isEmpty();
			case PetrinetsCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_NAMED_ELEMENT:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Pattern_SemanticObjectImpl
