/**
 */
package pacmanDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pacmanDiffMM.DiffGame_domainspecificdiffs;
import pacmanDiffMM.DiffGame_entities;
import pacmanDiffMM.DiffGame_gridnodes;
import pacmanDiffMM.DiffGame_semanticconflicts;
import pacmanDiffMM.DomainSpecificDiff;
import pacmanDiffMM.Game;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.PositionableEntity;
import pacmanDiffMM.SemanticConflict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getLives <em>Lives</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getScore <em>Score</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getSemanticconflicts <em>Semanticconflicts</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getDiffentities <em>Diffentities</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GameImpl#getDiffsemanticconflicts <em>Diffsemanticconflicts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLives() <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLives()
	 * @generated
	 * @ordered
	 */
	protected static final int LIVES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLives() <em>Lives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLives()
	 * @generated
	 * @ordered
	 */
	protected int lives = LIVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected int score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGridnodes() <em>Gridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GridNode> gridnodes;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionableEntity> entities;

	/**
	 * The cached value of the '{@link #getDomainspecificdiffs() <em>Domainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSpecificDiff> domainspecificdiffs;

	/**
	 * The cached value of the '{@link #getSemanticconflicts() <em>Semanticconflicts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticconflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticConflict> semanticconflicts;

	/**
	 * The cached value of the '{@link #getDiffgridnodes() <em>Diffgridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffgridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> diffgridnodes;

	/**
	 * The cached value of the '{@link #getDiffentities() <em>Diffentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffentities()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_entities> diffentities;

	/**
	 * The cached value of the '{@link #getDiffdomainspecificdiffs() <em>Diffdomainspecificdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdomainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_domainspecificdiffs> diffdomainspecificdiffs;

	/**
	 * The cached value of the '{@link #getDiffsemanticconflicts() <em>Diffsemanticconflicts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffsemanticconflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_semanticconflicts> diffsemanticconflicts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GAME__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLives() {
		return lives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLives(int newLives) {
		int oldLives = lives;
		lives = newLives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GAME__LIVES, oldLives, lives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(int newScore) {
		int oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GAME__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridNode> getGridnodes() {
		if (gridnodes == null) {
			gridnodes = new EObjectContainmentEList<GridNode>(GridNode.class, this, PacmanDiffMMPackage.GAME__GRIDNODES);
		}
		return gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionableEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<PositionableEntity>(PositionableEntity.class, this, PacmanDiffMMPackage.GAME__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticConflict> getSemanticconflicts() {
		if (semanticconflicts == null) {
			semanticconflicts = new EObjectContainmentEList<SemanticConflict>(SemanticConflict.class, this, PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS);
		}
		return semanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getDiffgridnodes() {
		if (diffgridnodes == null) {
			diffgridnodes = new EObjectContainmentEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, PacmanDiffMMPackage.GAME__DIFFGRIDNODES);
		}
		return diffgridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_entities> getDiffentities() {
		if (diffentities == null) {
			diffentities = new EObjectContainmentEList<DiffGame_entities>(DiffGame_entities.class, this, PacmanDiffMMPackage.GAME__DIFFENTITIES);
		}
		return diffentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffGame_domainspecificdiffs>(DiffGame_domainspecificdiffs.class, this, PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS);
		}
		return diffdomainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_semanticconflicts> getDiffsemanticconflicts() {
		if (diffsemanticconflicts == null) {
			diffsemanticconflicts = new EObjectContainmentEList<DiffGame_semanticconflicts>(DiffGame_semanticconflicts.class, this, PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS);
		}
		return diffsemanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanDiffMMPackage.GAME__GRIDNODES:
				return ((InternalEList<?>)getGridnodes()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS:
				return ((InternalEList<?>)getSemanticconflicts()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
				return ((InternalEList<?>)getDiffgridnodes()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
				return ((InternalEList<?>)getDiffentities()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDiffdomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS:
				return ((InternalEList<?>)getDiffsemanticconflicts()).basicRemove(otherEnd, msgs);
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
			case PacmanDiffMMPackage.GAME__ID:
				return getId();
			case PacmanDiffMMPackage.GAME__LIVES:
				return getLives();
			case PacmanDiffMMPackage.GAME__SCORE:
				return getScore();
			case PacmanDiffMMPackage.GAME__GRIDNODES:
				return getGridnodes();
			case PacmanDiffMMPackage.GAME__ENTITIES:
				return getEntities();
			case PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS:
				return getSemanticconflicts();
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
				return getDiffgridnodes();
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
				return getDiffentities();
			case PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return getDiffdomainspecificdiffs();
			case PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS:
				return getDiffsemanticconflicts();
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
			case PacmanDiffMMPackage.GAME__ID:
				setId((String)newValue);
				return;
			case PacmanDiffMMPackage.GAME__LIVES:
				setLives((Integer)newValue);
				return;
			case PacmanDiffMMPackage.GAME__SCORE:
				setScore((Integer)newValue);
				return;
			case PacmanDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				getGridnodes().addAll((Collection<? extends GridNode>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS:
				getSemanticconflicts().clear();
				getSemanticconflicts().addAll((Collection<? extends SemanticConflict>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				getDiffgridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
				getDiffentities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffGame_domainspecificdiffs>)newValue);
				return;
			case PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS:
				getDiffsemanticconflicts().clear();
				getDiffsemanticconflicts().addAll((Collection<? extends DiffGame_semanticconflicts>)newValue);
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
			case PacmanDiffMMPackage.GAME__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanDiffMMPackage.GAME__LIVES:
				setLives(LIVES_EDEFAULT);
				return;
			case PacmanDiffMMPackage.GAME__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case PacmanDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				return;
			case PacmanDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				return;
			case PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS:
				getSemanticconflicts().clear();
				return;
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				return;
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
				return;
			case PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				return;
			case PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS:
				getDiffsemanticconflicts().clear();
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
			case PacmanDiffMMPackage.GAME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanDiffMMPackage.GAME__LIVES:
				return lives != LIVES_EDEFAULT;
			case PacmanDiffMMPackage.GAME__SCORE:
				return score != SCORE_EDEFAULT;
			case PacmanDiffMMPackage.GAME__GRIDNODES:
				return gridnodes != null && !gridnodes.isEmpty();
			case PacmanDiffMMPackage.GAME__ENTITIES:
				return entities != null && !entities.isEmpty();
			case PacmanDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case PacmanDiffMMPackage.GAME__SEMANTICCONFLICTS:
				return semanticconflicts != null && !semanticconflicts.isEmpty();
			case PacmanDiffMMPackage.GAME__DIFFGRIDNODES:
				return diffgridnodes != null && !diffgridnodes.isEmpty();
			case PacmanDiffMMPackage.GAME__DIFFENTITIES:
				return diffentities != null && !diffentities.isEmpty();
			case PacmanDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
			case PacmanDiffMMPackage.GAME__DIFFSEMANTICCONFLICTS:
				return diffsemanticconflicts != null && !diffsemanticconflicts.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", lives: ");
		result.append(lives);
		result.append(", score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //GameImpl
