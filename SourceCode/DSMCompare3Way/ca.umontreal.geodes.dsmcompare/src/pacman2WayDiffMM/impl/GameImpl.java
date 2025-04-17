/**
 */
package pacman2WayDiffMM.impl;

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

import pacman2WayDiffMM.DiffGame_entities;
import pacman2WayDiffMM.DiffGame_gridnodes;
import pacman2WayDiffMM.Game;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;
import pacman2WayDiffMM.PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getLives <em>Lives</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getScore <em>Score</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.GameImpl#getDiffentities <em>Diffentities</em>}</li>
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
		return Pacman2WayDiffMMPackage.Literals.GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.GAME__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.GAME__LIVES, oldLives, lives));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.GAME__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridNode> getGridnodes() {
		if (gridnodes == null) {
			gridnodes = new EObjectContainmentEList<GridNode>(GridNode.class, this, Pacman2WayDiffMMPackage.GAME__GRIDNODES);
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
			entities = new EObjectContainmentEList<PositionableEntity>(PositionableEntity.class, this, Pacman2WayDiffMMPackage.GAME__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getDiffgridnodes() {
		if (diffgridnodes == null) {
			diffgridnodes = new EObjectContainmentEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES);
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
			diffentities = new EObjectContainmentEList<DiffGame_entities>(DiffGame_entities.class, this, Pacman2WayDiffMMPackage.GAME__DIFFENTITIES);
		}
		return diffentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pacman2WayDiffMMPackage.GAME__GRIDNODES:
				return ((InternalEList<?>)getGridnodes()).basicRemove(otherEnd, msgs);
			case Pacman2WayDiffMMPackage.GAME__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES:
				return ((InternalEList<?>)getDiffgridnodes()).basicRemove(otherEnd, msgs);
			case Pacman2WayDiffMMPackage.GAME__DIFFENTITIES:
				return ((InternalEList<?>)getDiffentities()).basicRemove(otherEnd, msgs);
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
			case Pacman2WayDiffMMPackage.GAME__ID:
				return getId();
			case Pacman2WayDiffMMPackage.GAME__LIVES:
				return getLives();
			case Pacman2WayDiffMMPackage.GAME__SCORE:
				return getScore();
			case Pacman2WayDiffMMPackage.GAME__GRIDNODES:
				return getGridnodes();
			case Pacman2WayDiffMMPackage.GAME__ENTITIES:
				return getEntities();
			case Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES:
				return getDiffgridnodes();
			case Pacman2WayDiffMMPackage.GAME__DIFFENTITIES:
				return getDiffentities();
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
			case Pacman2WayDiffMMPackage.GAME__ID:
				setId((String)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__LIVES:
				setLives((Integer)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__SCORE:
				setScore((Integer)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				getGridnodes().addAll((Collection<? extends GridNode>)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				getDiffgridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case Pacman2WayDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
				getDiffentities().addAll((Collection<? extends DiffGame_entities>)newValue);
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
			case Pacman2WayDiffMMPackage.GAME__ID:
				setId(ID_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.GAME__LIVES:
				setLives(LIVES_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.GAME__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				return;
			case Pacman2WayDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				return;
			case Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				return;
			case Pacman2WayDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
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
			case Pacman2WayDiffMMPackage.GAME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Pacman2WayDiffMMPackage.GAME__LIVES:
				return lives != LIVES_EDEFAULT;
			case Pacman2WayDiffMMPackage.GAME__SCORE:
				return score != SCORE_EDEFAULT;
			case Pacman2WayDiffMMPackage.GAME__GRIDNODES:
				return gridnodes != null && !gridnodes.isEmpty();
			case Pacman2WayDiffMMPackage.GAME__ENTITIES:
				return entities != null && !entities.isEmpty();
			case Pacman2WayDiffMMPackage.GAME__DIFFGRIDNODES:
				return diffgridnodes != null && !diffgridnodes.isEmpty();
			case Pacman2WayDiffMMPackage.GAME__DIFFENTITIES:
				return diffentities != null && !diffentities.isEmpty();
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
