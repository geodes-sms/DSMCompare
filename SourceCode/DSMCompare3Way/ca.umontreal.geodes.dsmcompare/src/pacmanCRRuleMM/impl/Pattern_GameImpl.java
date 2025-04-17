/**
 */
package pacmanCRRuleMM.impl;

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

import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffGame_entities;
import pacmanCRRuleMM.Pattern_DiffGame_gridnodes;
import pacmanCRRuleMM.Pattern_Game;
import pacmanCRRuleMM.Pattern_GridNode;
import pacmanCRRuleMM.Pattern_PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getLives <em>Lives</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getScore <em>Score</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GameImpl#getDiffentities <em>Diffentities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_GameImpl extends MinimalEObjectImpl.Container implements Pattern_Game {
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
	protected static final int LIVES_EDEFAULT = 0;

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
	protected EList<Pattern_GridNode> gridnodes;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_PositionableEntity> entities;

	/**
	 * The cached value of the '{@link #getDiffgridnodes() <em>Diffgridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffgridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_gridnodes> diffgridnodes;

	/**
	 * The cached value of the '{@link #getDiffentities() <em>Diffentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffentities()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGame_entities> diffentities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GAME__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GAME__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GAME__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GAME__LIVES, oldLives, lives));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GAME__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_GridNode> getGridnodes() {
		if (gridnodes == null) {
			gridnodes = new EObjectContainmentEList<Pattern_GridNode>(Pattern_GridNode.class, this, PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES);
		}
		return gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_PositionableEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Pattern_PositionableEntity>(Pattern_PositionableEntity.class, this, PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_gridnodes> getDiffgridnodes() {
		if (diffgridnodes == null) {
			diffgridnodes = new EObjectContainmentEList<Pattern_DiffGame_gridnodes>(Pattern_DiffGame_gridnodes.class, this, PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES);
		}
		return diffgridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGame_entities> getDiffentities() {
		if (diffentities == null) {
			diffentities = new EObjectContainmentEList<Pattern_DiffGame_entities>(Pattern_DiffGame_entities.class, this, PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES);
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
			case PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES:
				return ((InternalEList<?>)getGridnodes()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES:
				return ((InternalEList<?>)getDiffgridnodes()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES:
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
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID_PATTERN:
				return getID_Pattern();
			case PacmanCRRuleMMPackage.PATTERN_GAME__IS_FORBIDDEN:
				return isIsForbidden();
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID:
				return getId();
			case PacmanCRRuleMMPackage.PATTERN_GAME__LIVES:
				return getLives();
			case PacmanCRRuleMMPackage.PATTERN_GAME__SCORE:
				return getScore();
			case PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES:
				return getGridnodes();
			case PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES:
				return getEntities();
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES:
				return getDiffgridnodes();
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES:
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
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID:
				setId((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__LIVES:
				setLives((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__SCORE:
				setScore((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES:
				getGridnodes().clear();
				getGridnodes().addAll((Collection<? extends Pattern_GridNode>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Pattern_PositionableEntity>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				getDiffgridnodes().addAll((Collection<? extends Pattern_DiffGame_gridnodes>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES:
				getDiffentities().clear();
				getDiffentities().addAll((Collection<? extends Pattern_DiffGame_entities>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__LIVES:
				setLives(LIVES_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES:
				getGridnodes().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES:
				getEntities().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES:
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
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GAME__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GAME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanCRRuleMMPackage.PATTERN_GAME__LIVES:
				return lives != LIVES_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GAME__SCORE:
				return score != SCORE_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GAME__GRIDNODES:
				return gridnodes != null && !gridnodes.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GAME__ENTITIES:
				return entities != null && !entities.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFGRIDNODES:
				return diffgridnodes != null && !diffgridnodes.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GAME__DIFFENTITIES:
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", id: ");
		result.append(id);
		result.append(", lives: ");
		result.append(lives);
		result.append(", score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //Pattern_GameImpl
