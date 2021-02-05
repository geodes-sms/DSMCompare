/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.DiffGame_domainspecificdiffs;
import PacmanGoDiffMM.DiffGame_entities;
import PacmanGoDiffMM.DiffGame_gridnodes;
import PacmanGoDiffMM.DiffGame_scoreboard;
import PacmanGoDiffMM.DomainSpecificDiff;
import PacmanGoDiffMM.Game;
import PacmanGoDiffMM.GridNode;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;
import PacmanGoDiffMM.PositionableEntity;
import PacmanGoDiffMM.Scoreboard;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getGridnodes <em>Gridnodes</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getScoreboard <em>Scoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getDiffgridnodes <em>Diffgridnodes</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getDiffscoreboard <em>Diffscoreboard</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getDiffentities <em>Diffentities</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GameImpl#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The cached value of the '{@link #getScoreboard() <em>Scoreboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreboard()
	 * @generated
	 * @ordered
	 */
	protected Scoreboard scoreboard;

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
	 * The cached value of the '{@link #getDiffgridnodes() <em>Diffgridnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffgridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> diffgridnodes;

	/**
	 * The cached value of the '{@link #getDiffscoreboard() <em>Diffscoreboard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffscoreboard()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_scoreboard> diffscoreboard;

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
		return PacmanGoDiffMMPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GridNode> getGridnodes() {
		if (gridnodes == null) {
			gridnodes = new EObjectContainmentEList<GridNode>(GridNode.class, this, PacmanGoDiffMMPackage.GAME__GRIDNODES);
		}
		return gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scoreboard getScoreboard() {
		return scoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoreboard(Scoreboard newScoreboard, NotificationChain msgs) {
		Scoreboard oldScoreboard = scoreboard;
		scoreboard = newScoreboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GAME__SCOREBOARD, oldScoreboard, newScoreboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScoreboard(Scoreboard newScoreboard) {
		if (newScoreboard != scoreboard) {
			NotificationChain msgs = null;
			if (scoreboard != null)
				msgs = ((InternalEObject)scoreboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PacmanGoDiffMMPackage.GAME__SCOREBOARD, null, msgs);
			if (newScoreboard != null)
				msgs = ((InternalEObject)newScoreboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PacmanGoDiffMMPackage.GAME__SCOREBOARD, null, msgs);
			msgs = basicSetScoreboard(newScoreboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GAME__SCOREBOARD, newScoreboard, newScoreboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositionableEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<PositionableEntity>(PositionableEntity.class, this, PacmanGoDiffMMPackage.GAME__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainSpecificDiff> getDomainspecificdiffs() {
		if (domainspecificdiffs == null) {
			domainspecificdiffs = new EObjectContainmentEList<DomainSpecificDiff>(DomainSpecificDiff.class, this, PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS);
		}
		return domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGame_gridnodes> getDiffgridnodes() {
		if (diffgridnodes == null) {
			diffgridnodes = new EObjectContainmentEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES);
		}
		return diffgridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGame_scoreboard> getDiffscoreboard() {
		if (diffscoreboard == null) {
			diffscoreboard = new EObjectContainmentEList<DiffGame_scoreboard>(DiffGame_scoreboard.class, this, PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD);
		}
		return diffscoreboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGame_entities> getDiffentities() {
		if (diffentities == null) {
			diffentities = new EObjectContainmentEList<DiffGame_entities>(DiffGame_entities.class, this, PacmanGoDiffMMPackage.GAME__DIFFENTITIES);
		}
		return diffentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGame_domainspecificdiffs> getDiffdomainspecificdiffs() {
		if (diffdomainspecificdiffs == null) {
			diffdomainspecificdiffs = new EObjectContainmentEList<DiffGame_domainspecificdiffs>(DiffGame_domainspecificdiffs.class, this, PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS);
		}
		return diffdomainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
				return ((InternalEList<?>)getGridnodes()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
				return basicSetScoreboard(null, msgs);
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDomainspecificdiffs()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
				return ((InternalEList<?>)getDiffgridnodes()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
				return ((InternalEList<?>)getDiffscoreboard()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
				return ((InternalEList<?>)getDiffentities()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return ((InternalEList<?>)getDiffdomainspecificdiffs()).basicRemove(otherEnd, msgs);
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
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
				return getGridnodes();
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
				return getScoreboard();
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
				return getEntities();
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return getDomainspecificdiffs();
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
				return getDiffgridnodes();
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
				return getDiffscoreboard();
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
				return getDiffentities();
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return getDiffdomainspecificdiffs();
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
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				getGridnodes().addAll((Collection<? extends GridNode>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
				setScoreboard((Scoreboard)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				getDomainspecificdiffs().addAll((Collection<? extends DomainSpecificDiff>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				getDiffgridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
				getDiffscoreboard().clear();
				getDiffscoreboard().addAll((Collection<? extends DiffGame_scoreboard>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
				getDiffentities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
				getDiffdomainspecificdiffs().addAll((Collection<? extends DiffGame_domainspecificdiffs>)newValue);
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
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
				getGridnodes().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
				setScoreboard((Scoreboard)null);
				return;
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
				getEntities().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				getDomainspecificdiffs().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
				getDiffgridnodes().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
				getDiffscoreboard().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
				getDiffentities().clear();
				return;
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				getDiffdomainspecificdiffs().clear();
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
			case PacmanGoDiffMMPackage.GAME__GRIDNODES:
				return gridnodes != null && !gridnodes.isEmpty();
			case PacmanGoDiffMMPackage.GAME__SCOREBOARD:
				return scoreboard != null;
			case PacmanGoDiffMMPackage.GAME__ENTITIES:
				return entities != null && !entities.isEmpty();
			case PacmanGoDiffMMPackage.GAME__DOMAINSPECIFICDIFFS:
				return domainspecificdiffs != null && !domainspecificdiffs.isEmpty();
			case PacmanGoDiffMMPackage.GAME__DIFFGRIDNODES:
				return diffgridnodes != null && !diffgridnodes.isEmpty();
			case PacmanGoDiffMMPackage.GAME__DIFFSCOREBOARD:
				return diffscoreboard != null && !diffscoreboard.isEmpty();
			case PacmanGoDiffMMPackage.GAME__DIFFENTITIES:
				return diffentities != null && !diffentities.isEmpty();
			case PacmanGoDiffMMPackage.GAME__DIFFDOMAINSPECIFICDIFFS:
				return diffdomainspecificdiffs != null && !diffdomainspecificdiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
