/**
 */
package refactoring2WayRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import refactoring2WayDiffMM.DiffEAttribute;
import refactoring2WayDiffMM.DiffEClass;
import refactoring2WayDiffMM.DiffEClass_eattributes;
import refactoring2WayDiffMM.DiffEClass_eoperations;
import refactoring2WayDiffMM.DiffEClass_ereferences;
import refactoring2WayDiffMM.DiffEClass_esupertypes;
import refactoring2WayDiffMM.DiffEClass_interfaces;
import refactoring2WayDiffMM.DiffEClass_nested_classes;
import refactoring2WayDiffMM.DiffEClass_nested_interfaces;
import refactoring2WayDiffMM.DiffEOperation;
import refactoring2WayDiffMM.DiffEPackage;
import refactoring2WayDiffMM.DiffEPackage_eclassifiers;
import refactoring2WayDiffMM.DiffEPackage_interfaces;
import refactoring2WayDiffMM.DiffEReference;
import refactoring2WayDiffMM.DiffInterface;
import refactoring2WayDiffMM.DiffInterface_eoperations;
import refactoring2WayDiffMM.DiffInterface_esupertypes;
import refactoring2WayDiffMM.EAttribute;
import refactoring2WayDiffMM.EClass;
import refactoring2WayDiffMM.EOperation;
import refactoring2WayDiffMM.EPackage;
import refactoring2WayDiffMM.EReference;
import refactoring2WayDiffMM.Interface;
import refactoring2WayDiffMM.SemanticObject;

import refactoring2WayRuleMM.Refactoring2WayRuleMMPackage;
import refactoring2WayRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEAttribute <em>Rule Pattern Diff EAttribute</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass <em>Rule Pattern Diff EClass</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_eattributes <em>Rule Pattern Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_eoperations <em>Rule Pattern Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_ereferences <em>Rule Pattern Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_esupertypes <em>Rule Pattern Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_interfaces <em>Rule Pattern Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_nested_classes <em>Rule Pattern Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEClass_nested_interfaces <em>Rule Pattern Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEOperation <em>Rule Pattern Diff EOperation</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEPackage <em>Rule Pattern Diff EPackage</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEPackage_eclassifiers <em>Rule Pattern Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEPackage_interfaces <em>Rule Pattern Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffEReference <em>Rule Pattern Diff EReference</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffInterface <em>Rule Pattern Diff Interface</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffInterface_eoperations <em>Rule Pattern Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_DiffInterface_esupertypes <em>Rule Pattern Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_EAttribute <em>Rule Pattern EAttribute</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_EClass <em>Rule Pattern EClass</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_EOperation <em>Rule Pattern EOperation</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_EPackage <em>Rule Pattern EPackage</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_EReference <em>Rule Pattern EReference</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_Interface <em>Rule Pattern Interface</em>}</li>
 *   <li>{@link refactoring2WayRuleMM.impl.RuleImpl#getRulePattern_SemanticObject <em>Rule Pattern Semantic Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEAttribute() <em>Rule Pattern Diff EAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAttribute> rulePattern_DiffEAttribute;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass() <em>Rule Pattern Diff EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass> rulePattern_DiffEClass;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_eattributes() <em>Rule Pattern Diff EClass eattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_eattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eattributes> rulePattern_DiffEClass_eattributes;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_eoperations() <em>Rule Pattern Diff EClass eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eoperations> rulePattern_DiffEClass_eoperations;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_ereferences() <em>Rule Pattern Diff EClass ereferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_ereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_ereferences> rulePattern_DiffEClass_ereferences;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_esupertypes() <em>Rule Pattern Diff EClass esupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_esupertypes> rulePattern_DiffEClass_esupertypes;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_interfaces() <em>Rule Pattern Diff EClass interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_interfaces> rulePattern_DiffEClass_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_nested_classes() <em>Rule Pattern Diff EClass nested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_nested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_classes> rulePattern_DiffEClass_nested_classes;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEClass_nested_interfaces() <em>Rule Pattern Diff EClass nested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEClass_nested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_interfaces> rulePattern_DiffEClass_nested_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEOperation() <em>Rule Pattern Diff EOperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation> rulePattern_DiffEOperation;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEPackage() <em>Rule Pattern Diff EPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage> rulePattern_DiffEPackage;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEPackage_eclassifiers() <em>Rule Pattern Diff EPackage eclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEPackage_eclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eclassifiers> rulePattern_DiffEPackage_eclassifiers;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEPackage_interfaces() <em>Rule Pattern Diff EPackage interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEPackage_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_interfaces> rulePattern_DiffEPackage_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffEReference() <em>Rule Pattern Diff EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEReference> rulePattern_DiffEReference;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffInterface() <em>Rule Pattern Diff Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface> rulePattern_DiffInterface;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffInterface_eoperations() <em>Rule Pattern Diff Interface eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffInterface_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_eoperations> rulePattern_DiffInterface_eoperations;

	/**
	 * The cached value of the '{@link #getRulePattern_DiffInterface_esupertypes() <em>Rule Pattern Diff Interface esupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_DiffInterface_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_esupertypes> rulePattern_DiffInterface_esupertypes;

	/**
	 * The cached value of the '{@link #getRulePattern_EAttribute() <em>Rule Pattern EAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> rulePattern_EAttribute;

	/**
	 * The cached value of the '{@link #getRulePattern_EClass() <em>Rule Pattern EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> rulePattern_EClass;

	/**
	 * The cached value of the '{@link #getRulePattern_EOperation() <em>Rule Pattern EOperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> rulePattern_EOperation;

	/**
	 * The cached value of the '{@link #getRulePattern_EPackage() <em>Rule Pattern EPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_EPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> rulePattern_EPackage;

	/**
	 * The cached value of the '{@link #getRulePattern_EReference() <em>Rule Pattern EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> rulePattern_EReference;

	/**
	 * The cached value of the '{@link #getRulePattern_Interface() <em>Rule Pattern Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> rulePattern_Interface;

	/**
	 * The cached value of the '{@link #getRulePattern_SemanticObject() <em>Rule Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticObject> rulePattern_SemanticObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return Refactoring2WayRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, Refactoring2WayRuleMMPackage.RULE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Refactoring2WayRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEAttribute> getRulePattern_DiffEAttribute() {
		if (rulePattern_DiffEAttribute == null) {
			rulePattern_DiffEAttribute = new EObjectContainmentEList<DiffEAttribute>(DiffEAttribute.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE);
		}
		return rulePattern_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass> getRulePattern_DiffEClass() {
		if (rulePattern_DiffEClass == null) {
			rulePattern_DiffEClass = new EObjectContainmentEList<DiffEClass>(DiffEClass.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS);
		}
		return rulePattern_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_eattributes> getRulePattern_DiffEClass_eattributes() {
		if (rulePattern_DiffEClass_eattributes == null) {
			rulePattern_DiffEClass_eattributes = new EObjectContainmentEList<DiffEClass_eattributes>(DiffEClass_eattributes.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES);
		}
		return rulePattern_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_eoperations> getRulePattern_DiffEClass_eoperations() {
		if (rulePattern_DiffEClass_eoperations == null) {
			rulePattern_DiffEClass_eoperations = new EObjectContainmentEList<DiffEClass_eoperations>(DiffEClass_eoperations.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS);
		}
		return rulePattern_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_ereferences> getRulePattern_DiffEClass_ereferences() {
		if (rulePattern_DiffEClass_ereferences == null) {
			rulePattern_DiffEClass_ereferences = new EObjectContainmentEList<DiffEClass_ereferences>(DiffEClass_ereferences.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES);
		}
		return rulePattern_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_esupertypes> getRulePattern_DiffEClass_esupertypes() {
		if (rulePattern_DiffEClass_esupertypes == null) {
			rulePattern_DiffEClass_esupertypes = new EObjectContainmentEList<DiffEClass_esupertypes>(DiffEClass_esupertypes.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES);
		}
		return rulePattern_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_interfaces> getRulePattern_DiffEClass_interfaces() {
		if (rulePattern_DiffEClass_interfaces == null) {
			rulePattern_DiffEClass_interfaces = new EObjectContainmentEList<DiffEClass_interfaces>(DiffEClass_interfaces.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES);
		}
		return rulePattern_DiffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_classes> getRulePattern_DiffEClass_nested_classes() {
		if (rulePattern_DiffEClass_nested_classes == null) {
			rulePattern_DiffEClass_nested_classes = new EObjectContainmentEList<DiffEClass_nested_classes>(DiffEClass_nested_classes.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		}
		return rulePattern_DiffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_interfaces> getRulePattern_DiffEClass_nested_interfaces() {
		if (rulePattern_DiffEClass_nested_interfaces == null) {
			rulePattern_DiffEClass_nested_interfaces = new EObjectContainmentEList<DiffEClass_nested_interfaces>(DiffEClass_nested_interfaces.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		}
		return rulePattern_DiffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEOperation> getRulePattern_DiffEOperation() {
		if (rulePattern_DiffEOperation == null) {
			rulePattern_DiffEOperation = new EObjectContainmentEList<DiffEOperation>(DiffEOperation.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION);
		}
		return rulePattern_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage> getRulePattern_DiffEPackage() {
		if (rulePattern_DiffEPackage == null) {
			rulePattern_DiffEPackage = new EObjectContainmentEList<DiffEPackage>(DiffEPackage.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE);
		}
		return rulePattern_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage_eclassifiers> getRulePattern_DiffEPackage_eclassifiers() {
		if (rulePattern_DiffEPackage_eclassifiers == null) {
			rulePattern_DiffEPackage_eclassifiers = new EObjectContainmentEList<DiffEPackage_eclassifiers>(DiffEPackage_eclassifiers.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		}
		return rulePattern_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage_interfaces> getRulePattern_DiffEPackage_interfaces() {
		if (rulePattern_DiffEPackage_interfaces == null) {
			rulePattern_DiffEPackage_interfaces = new EObjectContainmentEList<DiffEPackage_interfaces>(DiffEPackage_interfaces.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES);
		}
		return rulePattern_DiffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEReference> getRulePattern_DiffEReference() {
		if (rulePattern_DiffEReference == null) {
			rulePattern_DiffEReference = new EObjectContainmentEList<DiffEReference>(DiffEReference.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE);
		}
		return rulePattern_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface> getRulePattern_DiffInterface() {
		if (rulePattern_DiffInterface == null) {
			rulePattern_DiffInterface = new EObjectContainmentEList<DiffInterface>(DiffInterface.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE);
		}
		return rulePattern_DiffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_eoperations> getRulePattern_DiffInterface_eoperations() {
		if (rulePattern_DiffInterface_eoperations == null) {
			rulePattern_DiffInterface_eoperations = new EObjectContainmentEList<DiffInterface_eoperations>(DiffInterface_eoperations.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS);
		}
		return rulePattern_DiffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_esupertypes> getRulePattern_DiffInterface_esupertypes() {
		if (rulePattern_DiffInterface_esupertypes == null) {
			rulePattern_DiffInterface_esupertypes = new EObjectContainmentEList<DiffInterface_esupertypes>(DiffInterface_esupertypes.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		}
		return rulePattern_DiffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getRulePattern_EAttribute() {
		if (rulePattern_EAttribute == null) {
			rulePattern_EAttribute = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE);
		}
		return rulePattern_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getRulePattern_EClass() {
		if (rulePattern_EClass == null) {
			rulePattern_EClass = new EObjectContainmentEList<EClass>(EClass.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS);
		}
		return rulePattern_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getRulePattern_EOperation() {
		if (rulePattern_EOperation == null) {
			rulePattern_EOperation = new EObjectContainmentEList<EOperation>(EOperation.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION);
		}
		return rulePattern_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getRulePattern_EPackage() {
		if (rulePattern_EPackage == null) {
			rulePattern_EPackage = new EObjectContainmentEList<EPackage>(EPackage.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE);
		}
		return rulePattern_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getRulePattern_EReference() {
		if (rulePattern_EReference == null) {
			rulePattern_EReference = new EObjectContainmentEList<EReference>(EReference.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE);
		}
		return rulePattern_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRulePattern_Interface() {
		if (rulePattern_Interface == null) {
			rulePattern_Interface = new EObjectContainmentEList<Interface>(Interface.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE);
		}
		return rulePattern_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticObject> getRulePattern_SemanticObject() {
		if (rulePattern_SemanticObject == null) {
			rulePattern_SemanticObject = new EObjectContainmentEList<SemanticObject>(SemanticObject.class, this, Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE:
				return ((InternalEList<?>)getRulePattern_DiffEAttribute()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS:
				return ((InternalEList<?>)getRulePattern_DiffEClass()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_eattributes()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return ((InternalEList<?>)getRulePattern_DiffEClass_eoperations()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_ereferences()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_esupertypes()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_interfaces()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_nested_classes()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return ((InternalEList<?>)getRulePattern_DiffEClass_nested_interfaces()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION:
				return ((InternalEList<?>)getRulePattern_DiffEOperation()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE:
				return ((InternalEList<?>)getRulePattern_DiffEPackage()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return ((InternalEList<?>)getRulePattern_DiffEPackage_eclassifiers()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return ((InternalEList<?>)getRulePattern_DiffEPackage_interfaces()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE:
				return ((InternalEList<?>)getRulePattern_DiffEReference()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE:
				return ((InternalEList<?>)getRulePattern_DiffInterface()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return ((InternalEList<?>)getRulePattern_DiffInterface_eoperations()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return ((InternalEList<?>)getRulePattern_DiffInterface_esupertypes()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE:
				return ((InternalEList<?>)getRulePattern_EAttribute()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS:
				return ((InternalEList<?>)getRulePattern_EClass()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION:
				return ((InternalEList<?>)getRulePattern_EOperation()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE:
				return ((InternalEList<?>)getRulePattern_EPackage()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE:
				return ((InternalEList<?>)getRulePattern_EReference()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE:
				return ((InternalEList<?>)getRulePattern_Interface()).basicRemove(otherEnd, msgs);
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_SemanticObject()).basicRemove(otherEnd, msgs);
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
			case Refactoring2WayRuleMMPackage.RULE__NAME:
				return getName();
			case Refactoring2WayRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case Refactoring2WayRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE:
				return getRulePattern_DiffEAttribute();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS:
				return getRulePattern_DiffEClass();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return getRulePattern_DiffEClass_eattributes();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return getRulePattern_DiffEClass_eoperations();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES:
				return getRulePattern_DiffEClass_ereferences();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return getRulePattern_DiffEClass_esupertypes();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES:
				return getRulePattern_DiffEClass_interfaces();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return getRulePattern_DiffEClass_nested_classes();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return getRulePattern_DiffEClass_nested_interfaces();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION:
				return getRulePattern_DiffEOperation();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE:
				return getRulePattern_DiffEPackage();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return getRulePattern_DiffEPackage_eclassifiers();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return getRulePattern_DiffEPackage_interfaces();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE:
				return getRulePattern_DiffEReference();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE:
				return getRulePattern_DiffInterface();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return getRulePattern_DiffInterface_eoperations();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return getRulePattern_DiffInterface_esupertypes();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE:
				return getRulePattern_EAttribute();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS:
				return getRulePattern_EClass();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION:
				return getRulePattern_EOperation();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE:
				return getRulePattern_EPackage();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE:
				return getRulePattern_EReference();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE:
				return getRulePattern_Interface();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_SemanticObject();
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
			case Refactoring2WayRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE:
				getRulePattern_DiffEAttribute().clear();
				getRulePattern_DiffEAttribute().addAll((Collection<? extends DiffEAttribute>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS:
				getRulePattern_DiffEClass().clear();
				getRulePattern_DiffEClass().addAll((Collection<? extends DiffEClass>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				getRulePattern_DiffEClass_eattributes().clear();
				getRulePattern_DiffEClass_eattributes().addAll((Collection<? extends DiffEClass_eattributes>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS:
				getRulePattern_DiffEClass_eoperations().clear();
				getRulePattern_DiffEClass_eoperations().addAll((Collection<? extends DiffEClass_eoperations>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES:
				getRulePattern_DiffEClass_ereferences().clear();
				getRulePattern_DiffEClass_ereferences().addAll((Collection<? extends DiffEClass_ereferences>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				getRulePattern_DiffEClass_esupertypes().clear();
				getRulePattern_DiffEClass_esupertypes().addAll((Collection<? extends DiffEClass_esupertypes>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES:
				getRulePattern_DiffEClass_interfaces().clear();
				getRulePattern_DiffEClass_interfaces().addAll((Collection<? extends DiffEClass_interfaces>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				getRulePattern_DiffEClass_nested_classes().clear();
				getRulePattern_DiffEClass_nested_classes().addAll((Collection<? extends DiffEClass_nested_classes>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				getRulePattern_DiffEClass_nested_interfaces().clear();
				getRulePattern_DiffEClass_nested_interfaces().addAll((Collection<? extends DiffEClass_nested_interfaces>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION:
				getRulePattern_DiffEOperation().clear();
				getRulePattern_DiffEOperation().addAll((Collection<? extends DiffEOperation>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE:
				getRulePattern_DiffEPackage().clear();
				getRulePattern_DiffEPackage().addAll((Collection<? extends DiffEPackage>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				getRulePattern_DiffEPackage_eclassifiers().clear();
				getRulePattern_DiffEPackage_eclassifiers().addAll((Collection<? extends DiffEPackage_eclassifiers>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES:
				getRulePattern_DiffEPackage_interfaces().clear();
				getRulePattern_DiffEPackage_interfaces().addAll((Collection<? extends DiffEPackage_interfaces>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE:
				getRulePattern_DiffEReference().clear();
				getRulePattern_DiffEReference().addAll((Collection<? extends DiffEReference>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE:
				getRulePattern_DiffInterface().clear();
				getRulePattern_DiffInterface().addAll((Collection<? extends DiffInterface>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				getRulePattern_DiffInterface_eoperations().clear();
				getRulePattern_DiffInterface_eoperations().addAll((Collection<? extends DiffInterface_eoperations>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				getRulePattern_DiffInterface_esupertypes().clear();
				getRulePattern_DiffInterface_esupertypes().addAll((Collection<? extends DiffInterface_esupertypes>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE:
				getRulePattern_EAttribute().clear();
				getRulePattern_EAttribute().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS:
				getRulePattern_EClass().clear();
				getRulePattern_EClass().addAll((Collection<? extends EClass>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION:
				getRulePattern_EOperation().clear();
				getRulePattern_EOperation().addAll((Collection<? extends EOperation>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE:
				getRulePattern_EPackage().clear();
				getRulePattern_EPackage().addAll((Collection<? extends EPackage>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE:
				getRulePattern_EReference().clear();
				getRulePattern_EReference().addAll((Collection<? extends EReference>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE:
				getRulePattern_Interface().clear();
				getRulePattern_Interface().addAll((Collection<? extends Interface>)newValue);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
				getRulePattern_SemanticObject().addAll((Collection<? extends SemanticObject>)newValue);
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
			case Refactoring2WayRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Refactoring2WayRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE:
				getRulePattern_DiffEAttribute().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS:
				getRulePattern_DiffEClass().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				getRulePattern_DiffEClass_eattributes().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS:
				getRulePattern_DiffEClass_eoperations().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES:
				getRulePattern_DiffEClass_ereferences().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				getRulePattern_DiffEClass_esupertypes().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES:
				getRulePattern_DiffEClass_interfaces().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				getRulePattern_DiffEClass_nested_classes().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				getRulePattern_DiffEClass_nested_interfaces().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION:
				getRulePattern_DiffEOperation().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE:
				getRulePattern_DiffEPackage().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				getRulePattern_DiffEPackage_eclassifiers().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES:
				getRulePattern_DiffEPackage_interfaces().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE:
				getRulePattern_DiffEReference().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE:
				getRulePattern_DiffInterface().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				getRulePattern_DiffInterface_eoperations().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				getRulePattern_DiffInterface_esupertypes().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE:
				getRulePattern_EAttribute().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS:
				getRulePattern_EClass().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION:
				getRulePattern_EOperation().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE:
				getRulePattern_EPackage().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE:
				getRulePattern_EReference().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE:
				getRulePattern_Interface().clear();
				return;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_SemanticObject().clear();
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
			case Refactoring2WayRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Refactoring2WayRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EATTRIBUTE:
				return rulePattern_DiffEAttribute != null && !rulePattern_DiffEAttribute.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS:
				return rulePattern_DiffEClass != null && !rulePattern_DiffEClass.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return rulePattern_DiffEClass_eattributes != null && !rulePattern_DiffEClass_eattributes.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return rulePattern_DiffEClass_eoperations != null && !rulePattern_DiffEClass_eoperations.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_EREFERENCES:
				return rulePattern_DiffEClass_ereferences != null && !rulePattern_DiffEClass_ereferences.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return rulePattern_DiffEClass_esupertypes != null && !rulePattern_DiffEClass_esupertypes.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_INTERFACES:
				return rulePattern_DiffEClass_interfaces != null && !rulePattern_DiffEClass_interfaces.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return rulePattern_DiffEClass_nested_classes != null && !rulePattern_DiffEClass_nested_classes.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return rulePattern_DiffEClass_nested_interfaces != null && !rulePattern_DiffEClass_nested_interfaces.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EOPERATION:
				return rulePattern_DiffEOperation != null && !rulePattern_DiffEOperation.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE:
				return rulePattern_DiffEPackage != null && !rulePattern_DiffEPackage.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return rulePattern_DiffEPackage_eclassifiers != null && !rulePattern_DiffEPackage_eclassifiers.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return rulePattern_DiffEPackage_interfaces != null && !rulePattern_DiffEPackage_interfaces.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_EREFERENCE:
				return rulePattern_DiffEReference != null && !rulePattern_DiffEReference.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE:
				return rulePattern_DiffInterface != null && !rulePattern_DiffInterface.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return rulePattern_DiffInterface_eoperations != null && !rulePattern_DiffInterface_eoperations.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return rulePattern_DiffInterface_esupertypes != null && !rulePattern_DiffInterface_esupertypes.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EATTRIBUTE:
				return rulePattern_EAttribute != null && !rulePattern_EAttribute.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_ECLASS:
				return rulePattern_EClass != null && !rulePattern_EClass.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EOPERATION:
				return rulePattern_EOperation != null && !rulePattern_EOperation.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EPACKAGE:
				return rulePattern_EPackage != null && !rulePattern_EPackage.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_EREFERENCE:
				return rulePattern_EReference != null && !rulePattern_EReference.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_INTERFACE:
				return rulePattern_Interface != null && !rulePattern_Interface.isEmpty();
			case Refactoring2WayRuleMMPackage.RULE__RULE_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_SemanticObject != null && !rulePattern_SemanticObject.isEmpty();
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
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
