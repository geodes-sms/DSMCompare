/**
 */
package pacman.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pacman.Energizer;
import pacman.Food;
import pacman.Fruit;
import pacman.Game;
import pacman.Ghost;
import pacman.GhostStrategy;
import pacman.GridNode;
import pacman.Pacman;
import pacman.PacmanFactory;
import pacman.PacmanPackage;
import pacman.PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmanPackageImpl extends EPackageImpl implements PacmanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pacmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fruitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ghostStrategyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pacman.PacmanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PacmanPackageImpl() {
		super(eNS_URI, PacmanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PacmanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PacmanPackage init() {
		if (isInited) return (PacmanPackage)EPackage.Registry.INSTANCE.getEPackage(PacmanPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPacmanPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PacmanPackageImpl thePacmanPackage = registeredPacmanPackage instanceof PacmanPackageImpl ? (PacmanPackageImpl)registeredPacmanPackage : new PacmanPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePacmanPackage.createPackageContents();

		// Initialize created meta-data
		thePacmanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePacmanPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PacmanPackage.eNS_URI, thePacmanPackage);
		return thePacmanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridNode() {
		return gridNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Up() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Down() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Left() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridNode_Right() {
		return (EReference)gridNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridNode_Id() {
		return (EAttribute)gridNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFood() {
		return foodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFood_Value() {
		return (EAttribute)foodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacman() {
		return pacmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacman_InitialPosition() {
		return (EAttribute)pacmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGhost() {
		return ghostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGhost_Strategy() {
		return (EAttribute)ghostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Id() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Lives() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Score() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Gridnodes() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Entities() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionableEntity() {
		return positionableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionableEntity_On() {
		return (EReference)positionableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionableEntity_Id() {
		return (EAttribute)positionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFruit() {
		return fruitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergizer() {
		return energizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergizer_Durations() {
		return (EAttribute)energizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGhostStrategy() {
		return ghostStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanFactory getPacmanFactory() {
		return (PacmanFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gridNodeEClass = createEClass(GRID_NODE);
		createEReference(gridNodeEClass, GRID_NODE__UP);
		createEReference(gridNodeEClass, GRID_NODE__DOWN);
		createEReference(gridNodeEClass, GRID_NODE__LEFT);
		createEReference(gridNodeEClass, GRID_NODE__RIGHT);
		createEAttribute(gridNodeEClass, GRID_NODE__ID);

		foodEClass = createEClass(FOOD);
		createEAttribute(foodEClass, FOOD__VALUE);

		pacmanEClass = createEClass(PACMAN);
		createEAttribute(pacmanEClass, PACMAN__INITIAL_POSITION);

		ghostEClass = createEClass(GHOST);
		createEAttribute(ghostEClass, GHOST__STRATEGY);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__ID);
		createEAttribute(gameEClass, GAME__LIVES);
		createEAttribute(gameEClass, GAME__SCORE);
		createEReference(gameEClass, GAME__GRIDNODES);
		createEReference(gameEClass, GAME__ENTITIES);

		positionableEntityEClass = createEClass(POSITIONABLE_ENTITY);
		createEReference(positionableEntityEClass, POSITIONABLE_ENTITY__ON);
		createEAttribute(positionableEntityEClass, POSITIONABLE_ENTITY__ID);

		fruitEClass = createEClass(FRUIT);

		energizerEClass = createEClass(ENERGIZER);
		createEAttribute(energizerEClass, ENERGIZER__DURATIONS);

		// Create enums
		ghostStrategyEEnum = createEEnum(GHOST_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		foodEClass.getESuperTypes().add(this.getPositionableEntity());
		pacmanEClass.getESuperTypes().add(this.getPositionableEntity());
		ghostEClass.getESuperTypes().add(this.getPositionableEntity());
		fruitEClass.getESuperTypes().add(this.getFood());
		energizerEClass.getESuperTypes().add(this.getFood());

		// Initialize classes, features, and operations; add parameters
		initEClass(gridNodeEClass, GridNode.class, "GridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridNode_Up(), this.getGridNode(), null, "up", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Down(), this.getGridNode(), null, "down", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Left(), this.getGridNode(), null, "left", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGridNode_Right(), this.getGridNode(), null, "right", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, GridNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodEClass, Food.class, "Food", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFood_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, Food.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pacmanEClass, Pacman.class, "Pacman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPacman_InitialPosition(), ecorePackage.getEString(), "initialPosition", null, 0, 1, Pacman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ghostEClass, Ghost.class, "Ghost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGhost_Strategy(), this.getGhostStrategy(), "strategy", null, 1, 1, Ghost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Id(), ecorePackage.getEString(), "id", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Lives(), ecorePackage.getEInt(), "lives", "1", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Score(), ecorePackage.getEInt(), "score", "0", 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Gridnodes(), this.getGridNode(), null, "gridnodes", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Entities(), this.getPositionableEntity(), null, "entities", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEntityEClass, PositionableEntity.class, "PositionableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionableEntity_On(), this.getGridNode(), null, "on", null, 1, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionableEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, PositionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fruitEClass, Fruit.class, "Fruit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(energizerEClass, Energizer.class, "Energizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergizer_Durations(), ecorePackage.getEInt(), "durations", null, 0, -1, Energizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ghostStrategyEEnum, GhostStrategy.class, "GhostStrategy");
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.BLINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.PINKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.INKY);
		addEEnumLiteral(ghostStrategyEEnum, GhostStrategy.CLYDE);

		// Create resource
		createResource(eNS_URI);
	}

} //PacmanPackageImpl
