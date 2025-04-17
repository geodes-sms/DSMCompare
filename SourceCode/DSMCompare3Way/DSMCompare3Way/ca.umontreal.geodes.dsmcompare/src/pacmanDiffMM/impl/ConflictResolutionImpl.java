/**
 */
package pacmanDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pacmanDiffMM.ConflictResolution;
import pacmanDiffMM.ConflictResolutionStrategy;
import pacmanDiffMM.ConflictResolutionType;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.SemanticConflict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.ConflictResolutionImpl#getResolutionType <em>Resolution Type</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.ConflictResolutionImpl#getResolutionStrategy <em>Resolution Strategy</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.ConflictResolutionImpl#getSemanticconflicts <em>Semanticconflicts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConflictResolutionImpl extends SemanticObjectImpl implements ConflictResolution {
	/**
	 * The default value of the '{@link #getResolutionType() <em>Resolution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConflictResolutionType RESOLUTION_TYPE_EDEFAULT = ConflictResolutionType.PENDING;

	/**
	 * The cached value of the '{@link #getResolutionType() <em>Resolution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionType()
	 * @generated
	 * @ordered
	 */
	protected ConflictResolutionType resolutionType = RESOLUTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionStrategy() <em>Resolution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final ConflictResolutionStrategy RESOLUTION_STRATEGY_EDEFAULT = ConflictResolutionStrategy.NIL;

	/**
	 * The cached value of the '{@link #getResolutionStrategy() <em>Resolution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected ConflictResolutionStrategy resolutionStrategy = RESOLUTION_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticconflicts() <em>Semanticconflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticconflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticConflict> semanticconflicts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.CONFLICT_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionType getResolutionType() {
		return resolutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionType(ConflictResolutionType newResolutionType) {
		ConflictResolutionType oldResolutionType = resolutionType;
		resolutionType = newResolutionType == null ? RESOLUTION_TYPE_EDEFAULT : newResolutionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_TYPE, oldResolutionType, resolutionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictResolutionStrategy getResolutionStrategy() {
		return resolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionStrategy(ConflictResolutionStrategy newResolutionStrategy) {
		ConflictResolutionStrategy oldResolutionStrategy = resolutionStrategy;
		resolutionStrategy = newResolutionStrategy == null ? RESOLUTION_STRATEGY_EDEFAULT : newResolutionStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_STRATEGY, oldResolutionStrategy, resolutionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticConflict> getSemanticconflicts() {
		if (semanticconflicts == null) {
			semanticconflicts = new EObjectResolvingEList<SemanticConflict>(SemanticConflict.class, this, PacmanDiffMMPackage.CONFLICT_RESOLUTION__SEMANTICCONFLICTS);
		}
		return semanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_TYPE:
				return getResolutionType();
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_STRATEGY:
				return getResolutionStrategy();
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__SEMANTICCONFLICTS:
				return getSemanticconflicts();
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
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_TYPE:
				setResolutionType((ConflictResolutionType)newValue);
				return;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_STRATEGY:
				setResolutionStrategy((ConflictResolutionStrategy)newValue);
				return;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__SEMANTICCONFLICTS:
				getSemanticconflicts().clear();
				getSemanticconflicts().addAll((Collection<? extends SemanticConflict>)newValue);
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
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_TYPE:
				setResolutionType(RESOLUTION_TYPE_EDEFAULT);
				return;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_STRATEGY:
				setResolutionStrategy(RESOLUTION_STRATEGY_EDEFAULT);
				return;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__SEMANTICCONFLICTS:
				getSemanticconflicts().clear();
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
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_TYPE:
				return resolutionType != RESOLUTION_TYPE_EDEFAULT;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__RESOLUTION_STRATEGY:
				return resolutionStrategy != RESOLUTION_STRATEGY_EDEFAULT;
			case PacmanDiffMMPackage.CONFLICT_RESOLUTION__SEMANTICCONFLICTS:
				return semanticconflicts != null && !semanticconflicts.isEmpty();
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
		result.append(" (ResolutionType: ");
		result.append(resolutionType);
		result.append(", ResolutionStrategy: ");
		result.append(resolutionStrategy);
		result.append(')');
		return result.toString();
	}

} //ConflictResolutionImpl
