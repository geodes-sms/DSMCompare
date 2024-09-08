/**
 */
package pacmanDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pacmanDiffMM.AUTHOR;
import pacmanDiffMM.DiffGame_domainspecificdiffs;
import pacmanDiffMM.DiffGame_entities;
import pacmanDiffMM.DiffGame_gridnodes;
import pacmanDiffMM.DiffGame_semanticconflicts;
import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.DiffGridNode_left;
import pacmanDiffMM.DiffGridNode_right;
import pacmanDiffMM.DiffGridNode_up;
import pacmanDiffMM.DiffPositionableEntity_on;
import pacmanDiffMM.DomainSpecificDiff;
import pacmanDiffMM.Game;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.PacmanDiffMMPackage;
import pacmanDiffMM.PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_GridNode <em>Domain Specific Diff Grid Node</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_Game <em>Domain Specific Diff Game</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_PositionableEntity <em>Domain Specific Diff Positionable Entity</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGridNode_up <em>Domain Specific Diff Diff Grid Node up</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGridNode_down <em>Domain Specific Diff Diff Grid Node down</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGridNode_left <em>Domain Specific Diff Diff Grid Node left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGridNode_right <em>Domain Specific Diff Diff Grid Node right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGame_gridnodes <em>Domain Specific Diff Diff Game gridnodes</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGame_entities <em>Domain Specific Diff Diff Game entities</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGame_domainspecificdiffs <em>Domain Specific Diff Diff Game domainspecificdiffs</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffGame_semanticconflicts <em>Domain Specific Diff Diff Game semanticconflicts</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_DiffPositionableEntity_on <em>Domain Specific Diff Diff Positionable Entity on</em>}</li>
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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final AUTHOR AUTHOR_EDEFAULT = AUTHOR.NON;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AUTHOR author = AUTHOR_EDEFAULT;

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
	 * The cached value of the '{@link #getDomainSpecificDiff_Game() <em>Domain Specific Diff Game</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_Game()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> domainSpecificDiff_Game;

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
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGridNode_up() <em>Domain Specific Diff Diff Grid Node up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGridNode_up()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_up> domainSpecificDiff_DiffGridNode_up;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGridNode_down() <em>Domain Specific Diff Diff Grid Node down</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGridNode_down()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_down> domainSpecificDiff_DiffGridNode_down;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGridNode_left() <em>Domain Specific Diff Diff Grid Node left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGridNode_left()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_left> domainSpecificDiff_DiffGridNode_left;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGridNode_right() <em>Domain Specific Diff Diff Grid Node right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGridNode_right()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_right> domainSpecificDiff_DiffGridNode_right;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGame_gridnodes() <em>Domain Specific Diff Diff Game gridnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGame_gridnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_gridnodes> domainSpecificDiff_DiffGame_gridnodes;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGame_entities() <em>Domain Specific Diff Diff Game entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGame_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_entities> domainSpecificDiff_DiffGame_entities;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGame_domainspecificdiffs() <em>Domain Specific Diff Diff Game domainspecificdiffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGame_domainspecificdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_domainspecificdiffs> domainSpecificDiff_DiffGame_domainspecificdiffs;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffGame_semanticconflicts() <em>Domain Specific Diff Diff Game semanticconflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffGame_semanticconflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGame_semanticconflicts> domainSpecificDiff_DiffGame_semanticconflicts;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_DiffPositionableEntity_on() <em>Domain Specific Diff Diff Positionable Entity on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_DiffPositionableEntity_on()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPositionableEntity_on> domainSpecificDiff_DiffPositionableEntity_on;

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
		return PacmanDiffMMPackage.Literals.DOMAIN_SPECIFIC_DIFF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHOR getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(AUTHOR newAuthor) {
		AUTHOR oldAuthor = author;
		author = newAuthor == null ? AUTHOR_EDEFAULT : newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridNode> getDomainSpecificDiff_GridNode() {
		if (domainSpecificDiff_GridNode == null) {
			domainSpecificDiff_GridNode = new EObjectResolvingEList<GridNode>(GridNode.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE);
		}
		return domainSpecificDiff_GridNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getDomainSpecificDiff_Game() {
		if (domainSpecificDiff_Game == null) {
			domainSpecificDiff_Game = new EObjectResolvingEList<Game>(Game.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME);
		}
		return domainSpecificDiff_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionableEntity> getDomainSpecificDiff_PositionableEntity() {
		if (domainSpecificDiff_PositionableEntity == null) {
			domainSpecificDiff_PositionableEntity = new EObjectResolvingEList<PositionableEntity>(PositionableEntity.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY);
		}
		return domainSpecificDiff_PositionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_up> getDomainSpecificDiff_DiffGridNode_up() {
		if (domainSpecificDiff_DiffGridNode_up == null) {
			domainSpecificDiff_DiffGridNode_up = new EObjectResolvingEList<DiffGridNode_up>(DiffGridNode_up.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP);
		}
		return domainSpecificDiff_DiffGridNode_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_down> getDomainSpecificDiff_DiffGridNode_down() {
		if (domainSpecificDiff_DiffGridNode_down == null) {
			domainSpecificDiff_DiffGridNode_down = new EObjectResolvingEList<DiffGridNode_down>(DiffGridNode_down.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN);
		}
		return domainSpecificDiff_DiffGridNode_down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_left> getDomainSpecificDiff_DiffGridNode_left() {
		if (domainSpecificDiff_DiffGridNode_left == null) {
			domainSpecificDiff_DiffGridNode_left = new EObjectResolvingEList<DiffGridNode_left>(DiffGridNode_left.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT);
		}
		return domainSpecificDiff_DiffGridNode_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_right> getDomainSpecificDiff_DiffGridNode_right() {
		if (domainSpecificDiff_DiffGridNode_right == null) {
			domainSpecificDiff_DiffGridNode_right = new EObjectResolvingEList<DiffGridNode_right>(DiffGridNode_right.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT);
		}
		return domainSpecificDiff_DiffGridNode_right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_gridnodes> getDomainSpecificDiff_DiffGame_gridnodes() {
		if (domainSpecificDiff_DiffGame_gridnodes == null) {
			domainSpecificDiff_DiffGame_gridnodes = new EObjectResolvingEList<DiffGame_gridnodes>(DiffGame_gridnodes.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES);
		}
		return domainSpecificDiff_DiffGame_gridnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_entities> getDomainSpecificDiff_DiffGame_entities() {
		if (domainSpecificDiff_DiffGame_entities == null) {
			domainSpecificDiff_DiffGame_entities = new EObjectResolvingEList<DiffGame_entities>(DiffGame_entities.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES);
		}
		return domainSpecificDiff_DiffGame_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_domainspecificdiffs> getDomainSpecificDiff_DiffGame_domainspecificdiffs() {
		if (domainSpecificDiff_DiffGame_domainspecificdiffs == null) {
			domainSpecificDiff_DiffGame_domainspecificdiffs = new EObjectResolvingEList<DiffGame_domainspecificdiffs>(DiffGame_domainspecificdiffs.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS);
		}
		return domainSpecificDiff_DiffGame_domainspecificdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGame_semanticconflicts> getDomainSpecificDiff_DiffGame_semanticconflicts() {
		if (domainSpecificDiff_DiffGame_semanticconflicts == null) {
			domainSpecificDiff_DiffGame_semanticconflicts = new EObjectResolvingEList<DiffGame_semanticconflicts>(DiffGame_semanticconflicts.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS);
		}
		return domainSpecificDiff_DiffGame_semanticconflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPositionableEntity_on> getDomainSpecificDiff_DiffPositionableEntity_on() {
		if (domainSpecificDiff_DiffPositionableEntity_on == null) {
			domainSpecificDiff_DiffPositionableEntity_on = new EObjectResolvingEList<DiffPositionableEntity_on>(DiffPositionableEntity_on.class, this, PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON);
		}
		return domainSpecificDiff_DiffPositionableEntity_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__AUTHOR:
				return getAuthor();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				return getDomainSpecificDiff_GridNode();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME:
				return getDomainSpecificDiff_Game();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				return getDomainSpecificDiff_PositionableEntity();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP:
				return getDomainSpecificDiff_DiffGridNode_up();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN:
				return getDomainSpecificDiff_DiffGridNode_down();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT:
				return getDomainSpecificDiff_DiffGridNode_left();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT:
				return getDomainSpecificDiff_DiffGridNode_right();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES:
				return getDomainSpecificDiff_DiffGame_gridnodes();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES:
				return getDomainSpecificDiff_DiffGame_entities();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS:
				return getDomainSpecificDiff_DiffGame_domainspecificdiffs();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS:
				return getDomainSpecificDiff_DiffGame_semanticconflicts();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON:
				return getDomainSpecificDiff_DiffPositionableEntity_on();
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
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__AUTHOR:
				setAuthor((AUTHOR)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				getDomainSpecificDiff_GridNode().clear();
				getDomainSpecificDiff_GridNode().addAll((Collection<? extends GridNode>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME:
				getDomainSpecificDiff_Game().clear();
				getDomainSpecificDiff_Game().addAll((Collection<? extends Game>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				getDomainSpecificDiff_PositionableEntity().clear();
				getDomainSpecificDiff_PositionableEntity().addAll((Collection<? extends PositionableEntity>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP:
				getDomainSpecificDiff_DiffGridNode_up().clear();
				getDomainSpecificDiff_DiffGridNode_up().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN:
				getDomainSpecificDiff_DiffGridNode_down().clear();
				getDomainSpecificDiff_DiffGridNode_down().addAll((Collection<? extends DiffGridNode_down>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT:
				getDomainSpecificDiff_DiffGridNode_left().clear();
				getDomainSpecificDiff_DiffGridNode_left().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT:
				getDomainSpecificDiff_DiffGridNode_right().clear();
				getDomainSpecificDiff_DiffGridNode_right().addAll((Collection<? extends DiffGridNode_right>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES:
				getDomainSpecificDiff_DiffGame_gridnodes().clear();
				getDomainSpecificDiff_DiffGame_gridnodes().addAll((Collection<? extends DiffGame_gridnodes>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES:
				getDomainSpecificDiff_DiffGame_entities().clear();
				getDomainSpecificDiff_DiffGame_entities().addAll((Collection<? extends DiffGame_entities>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS:
				getDomainSpecificDiff_DiffGame_domainspecificdiffs().clear();
				getDomainSpecificDiff_DiffGame_domainspecificdiffs().addAll((Collection<? extends DiffGame_domainspecificdiffs>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS:
				getDomainSpecificDiff_DiffGame_semanticconflicts().clear();
				getDomainSpecificDiff_DiffGame_semanticconflicts().addAll((Collection<? extends DiffGame_semanticconflicts>)newValue);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON:
				getDomainSpecificDiff_DiffPositionableEntity_on().clear();
				getDomainSpecificDiff_DiffPositionableEntity_on().addAll((Collection<? extends DiffPositionableEntity_on>)newValue);
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
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				getDomainSpecificDiff_GridNode().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME:
				getDomainSpecificDiff_Game().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				getDomainSpecificDiff_PositionableEntity().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP:
				getDomainSpecificDiff_DiffGridNode_up().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN:
				getDomainSpecificDiff_DiffGridNode_down().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT:
				getDomainSpecificDiff_DiffGridNode_left().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT:
				getDomainSpecificDiff_DiffGridNode_right().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES:
				getDomainSpecificDiff_DiffGame_gridnodes().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES:
				getDomainSpecificDiff_DiffGame_entities().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS:
				getDomainSpecificDiff_DiffGame_domainspecificdiffs().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS:
				getDomainSpecificDiff_DiffGame_semanticconflicts().clear();
				return;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON:
				getDomainSpecificDiff_DiffPositionableEntity_on().clear();
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
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__AUTHOR:
				return author != AUTHOR_EDEFAULT;
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GRID_NODE:
				return domainSpecificDiff_GridNode != null && !domainSpecificDiff_GridNode.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_GAME:
				return domainSpecificDiff_Game != null && !domainSpecificDiff_Game.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_POSITIONABLE_ENTITY:
				return domainSpecificDiff_PositionableEntity != null && !domainSpecificDiff_PositionableEntity.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_UP:
				return domainSpecificDiff_DiffGridNode_up != null && !domainSpecificDiff_DiffGridNode_up.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_DOWN:
				return domainSpecificDiff_DiffGridNode_down != null && !domainSpecificDiff_DiffGridNode_down.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_LEFT:
				return domainSpecificDiff_DiffGridNode_left != null && !domainSpecificDiff_DiffGridNode_left.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GRID_NODE_RIGHT:
				return domainSpecificDiff_DiffGridNode_right != null && !domainSpecificDiff_DiffGridNode_right.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_GRIDNODES:
				return domainSpecificDiff_DiffGame_gridnodes != null && !domainSpecificDiff_DiffGame_gridnodes.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_ENTITIES:
				return domainSpecificDiff_DiffGame_entities != null && !domainSpecificDiff_DiffGame_entities.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_DOMAINSPECIFICDIFFS:
				return domainSpecificDiff_DiffGame_domainspecificdiffs != null && !domainSpecificDiff_DiffGame_domainspecificdiffs.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_GAME_SEMANTICCONFLICTS:
				return domainSpecificDiff_DiffGame_semanticconflicts != null && !domainSpecificDiff_DiffGame_semanticconflicts.isEmpty();
			case PacmanDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIFF_POSITIONABLE_ENTITY_ON:
				return domainSpecificDiff_DiffPositionableEntity_on != null && !domainSpecificDiff_DiffPositionableEntity_on.isEmpty();
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
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //DomainSpecificDiffImpl
