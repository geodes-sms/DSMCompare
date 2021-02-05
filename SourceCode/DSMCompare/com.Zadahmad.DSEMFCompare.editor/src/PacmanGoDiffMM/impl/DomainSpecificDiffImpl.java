/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.DomainSpecificDiff;
import PacmanGoDiffMM.Food;
import PacmanGoDiffMM.Ghost;
import PacmanGoDiffMM.GridNode;
import PacmanGoDiffMM.Pacman;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;
import PacmanGoDiffMM.PositionableEntity;
import PacmanGoDiffMM.Scoreboard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Food <em>Domain Specific Diff Food</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Pacman <em>Domain Specific Diff Pacman</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Ghost <em>Domain Specific Diff Ghost</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Scoreboard <em>Domain Specific Diff Scoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSpecificDiffImpl extends MinimalEObjectImpl.Container implements DomainSpecificDiff {
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
	 * The cached value of the '{@link #getDomainSpecificDiff_GridNode() <em>Domain Specific Diff Grid Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_GridNode()
	 * @generated
	 * @ordered
	 */
	protected EList<GridNode> domainSpecificDiff_GridNode;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Food() <em>Domain Specific Diff Food</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Food()
	 * @generated
	 * @ordered
	 */
	protected EList<Food> domainSpecificDiff_Food;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Pacman() <em>Domain Specific Diff Pacman</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Pacman()
	 * @generated
	 * @ordered
	 */
	protected EList<Pacman> domainSpecificDiff_Pacman;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Ghost() <em>Domain Specific Diff Ghost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Ghost()
	 * @generated
	 * @ordered
	 */
	protected EList<Ghost> domainSpecificDiff_Ghost;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_Scoreboard() <em>Domain Specific Diff Scoreboard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Scoreboard()
	 * @generated
	 * @ordered
	 */
	protected EList<Scoreboard> domainSpecificDiff_Scoreboard;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_PositionableEntity() <em>Domain Specific Diff Positionable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_PositionableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionableEntity> domainSpecificDiff_PositionableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanGoDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GridNode> getDomainSpecificDiff_GridNode() {
		if (domainSpecificDiff_GridNode == null) {
			domainSpecificDiff_GridNode = new EObjectResolvingEList<GridNode>(GridNode.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE);
		}
		return domainSpecificDiff_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Food> getDomainSpecificDiff_Food() {
		if (domainSpecificDiff_Food == null) {
			domainSpecificDiff_Food = new EObjectResolvingEList<Food>(Food.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD);
		}
		return domainSpecificDiff_Food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pacman> getDomainSpecificDiff_Pacman() {
		if (domainSpecificDiff_Pacman == null) {
			domainSpecificDiff_Pacman = new EObjectResolvingEList<Pacman>(Pacman.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN);
		}
		return domainSpecificDiff_Pacman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ghost> getDomainSpecificDiff_Ghost() {
		if (domainSpecificDiff_Ghost == null) {
			domainSpecificDiff_Ghost = new EObjectResolvingEList<Ghost>(Ghost.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST);
		}
		return domainSpecificDiff_Ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scoreboard> getDomainSpecificDiff_Scoreboard() {
		if (domainSpecificDiff_Scoreboard == null) {
			domainSpecificDiff_Scoreboard = new EObjectResolvingEList<Scoreboard>(Scoreboard.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD);
		}
		return domainSpecificDiff_Scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositionableEntity> getDomainSpecificDiff_PositionableEntity() {
		if (domainSpecificDiff_PositionableEntity == null) {
			domainSpecificDiff_PositionableEntity = new EObjectResolvingEList<PositionableEntity>(PositionableEntity.class, this, PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY);
		}
		return domainSpecificDiff_PositionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				return getDomainSpecificDiff_GridNode();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD:
				return getDomainSpecificDiff_Food();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN:
				return getDomainSpecificDiff_Pacman();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST:
				return getDomainSpecificDiff_Ghost();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD:
				return getDomainSpecificDiff_Scoreboard();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				return getDomainSpecificDiff_PositionableEntity();
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
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				getDomainSpecificDiff_GridNode().clear();
				getDomainSpecificDiff_GridNode().addAll((Collection<? extends GridNode>)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD:
				getDomainSpecificDiff_Food().clear();
				getDomainSpecificDiff_Food().addAll((Collection<? extends Food>)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN:
				getDomainSpecificDiff_Pacman().clear();
				getDomainSpecificDiff_Pacman().addAll((Collection<? extends Pacman>)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST:
				getDomainSpecificDiff_Ghost().clear();
				getDomainSpecificDiff_Ghost().addAll((Collection<? extends Ghost>)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD:
				getDomainSpecificDiff_Scoreboard().clear();
				getDomainSpecificDiff_Scoreboard().addAll((Collection<? extends Scoreboard>)newValue);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				getDomainSpecificDiff_PositionableEntity().clear();
				getDomainSpecificDiff_PositionableEntity().addAll((Collection<? extends PositionableEntity>)newValue);
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
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				getDomainSpecificDiff_GridNode().clear();
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD:
				getDomainSpecificDiff_Food().clear();
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN:
				getDomainSpecificDiff_Pacman().clear();
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST:
				getDomainSpecificDiff_Ghost().clear();
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD:
				getDomainSpecificDiff_Scoreboard().clear();
				return;
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				getDomainSpecificDiff_PositionableEntity().clear();
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
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				return domainSpecificDiff_GridNode != null && !domainSpecificDiff_GridNode.isEmpty();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FOOD:
				return domainSpecificDiff_Food != null && !domainSpecificDiff_Food.isEmpty();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PACMAN:
				return domainSpecificDiff_Pacman != null && !domainSpecificDiff_Pacman.isEmpty();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GHOST:
				return domainSpecificDiff_Ghost != null && !domainSpecificDiff_Ghost.isEmpty();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SCOREBOARD:
				return domainSpecificDiff_Scoreboard != null && !domainSpecificDiff_Scoreboard.isEmpty();
			case PacmanGoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				return domainSpecificDiff_PositionableEntity != null && !domainSpecificDiff_PositionableEntity.isEmpty();
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

} //DomainSpecificDiffImpl
