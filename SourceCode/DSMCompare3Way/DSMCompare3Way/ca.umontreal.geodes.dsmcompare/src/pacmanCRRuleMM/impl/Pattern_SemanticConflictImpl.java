/**
 */
package pacmanCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pacmanCRRuleMM.ChangeStatus;
import pacmanCRRuleMM.ConflictGranularity;
import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_SemanticConflict;
import pacmanCRRuleMM.Pattern_SemanticDiff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl#getConflict_kind <em>Conflict kind</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl#getConflict_Granularity <em>Conflict Granularity</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_SemanticConflictImpl#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_SemanticConflictImpl extends Pattern_SemanticObjectImpl implements Pattern_SemanticConflict {
	/**
	 * The default value of the '{@link #getConflict_kind() <em>Conflict kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus CONFLICT_KIND_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getConflict_kind() <em>Conflict kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict_kind()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus conflict_kind = CONFLICT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConflict_Granularity() <em>Conflict Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict_Granularity()
	 * @generated
	 * @ordered
	 */
	protected static final ConflictGranularity CONFLICT_GRANULARITY_EDEFAULT = ConflictGranularity.NIL;

	/**
	 * The cached value of the '{@link #getConflict_Granularity() <em>Conflict Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict_Granularity()
	 * @generated
	 * @ordered
	 */
	protected ConflictGranularity conflict_Granularity = CONFLICT_GRANULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticdiffs() <em>Semanticdiffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_SemanticDiff> semanticdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_SemanticConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_SEMANTIC_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getConflict_kind() {
		return conflict_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflict_kind(ChangeStatus newConflict_kind) {
		ChangeStatus oldConflict_kind = conflict_kind;
		conflict_kind = newConflict_kind == null ? CONFLICT_KIND_EDEFAULT : newConflict_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND, oldConflict_kind, conflict_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictGranularity getConflict_Granularity() {
		return conflict_Granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflict_Granularity(ConflictGranularity newConflict_Granularity) {
		ConflictGranularity oldConflict_Granularity = conflict_Granularity;
		conflict_Granularity = newConflict_Granularity == null ? CONFLICT_GRANULARITY_EDEFAULT : newConflict_Granularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY, oldConflict_Granularity, conflict_Granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_SemanticDiff> getSemanticdiffs() {
		if (semanticdiffs == null) {
			semanticdiffs = new EObjectResolvingEList<Pattern_SemanticDiff>(Pattern_SemanticDiff.class, this, PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS);
		}
		return semanticdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND:
				return getConflict_kind();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY:
				return getConflict_Granularity();
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS:
				return getSemanticdiffs();
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND:
				setConflict_kind((ChangeStatus)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY:
				setConflict_Granularity((ConflictGranularity)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS:
				getSemanticdiffs().clear();
				getSemanticdiffs().addAll((Collection<? extends Pattern_SemanticDiff>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND:
				setConflict_kind(CONFLICT_KIND_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY:
				setConflict_Granularity(CONFLICT_GRANULARITY_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS:
				getSemanticdiffs().clear();
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
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_KIND:
				return conflict_kind != CONFLICT_KIND_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__CONFLICT_GRANULARITY:
				return conflict_Granularity != CONFLICT_GRANULARITY_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_SEMANTIC_CONFLICT__SEMANTICDIFFS:
				return semanticdiffs != null && !semanticdiffs.isEmpty();
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
		result.append(" (conflict_kind: ");
		result.append(conflict_kind);
		result.append(", conflict_Granularity: ");
		result.append(conflict_Granularity);
		result.append(')');
		return result.toString();
	}

} //Pattern_SemanticConflictImpl
