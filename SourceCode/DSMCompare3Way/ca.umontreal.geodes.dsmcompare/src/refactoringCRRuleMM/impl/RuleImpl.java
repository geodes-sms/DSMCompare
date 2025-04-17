/**
 */
package refactoringCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import refactoringCRRuleMM.Pattern_DiffEAttribute;
import refactoringCRRuleMM.Pattern_DiffEClass;
import refactoringCRRuleMM.Pattern_DiffEClass_eattributes;
import refactoringCRRuleMM.Pattern_DiffEClass_eoperations;
import refactoringCRRuleMM.Pattern_DiffEClass_ereferences;
import refactoringCRRuleMM.Pattern_DiffEClass_esupertypes;
import refactoringCRRuleMM.Pattern_DiffEClass_interfaces;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_classes;
import refactoringCRRuleMM.Pattern_DiffEClass_nested_interfaces;
import refactoringCRRuleMM.Pattern_DiffEOperation;
import refactoringCRRuleMM.Pattern_DiffEPackage;
import refactoringCRRuleMM.Pattern_DiffEPackage_eclassifiers;
import refactoringCRRuleMM.Pattern_DiffEPackage_interfaces;
import refactoringCRRuleMM.Pattern_DiffEPackage_test;
import refactoringCRRuleMM.Pattern_DiffEReference;
import refactoringCRRuleMM.Pattern_DiffInterface;
import refactoringCRRuleMM.Pattern_DiffInterface_eoperations;
import refactoringCRRuleMM.Pattern_DiffInterface_esupertypes;
import refactoringCRRuleMM.Pattern_DifftestAssociations;
import refactoringCRRuleMM.Pattern_DifftestAssociations_multi;
import refactoringCRRuleMM.Pattern_DifftestAssociations_single;
import refactoringCRRuleMM.Pattern_EAttribute;
import refactoringCRRuleMM.Pattern_EClass;
import refactoringCRRuleMM.Pattern_EOperation;
import refactoringCRRuleMM.Pattern_EPackage;
import refactoringCRRuleMM.Pattern_EReference;
import refactoringCRRuleMM.Pattern_Interface;
import refactoringCRRuleMM.Pattern_SemanticObject;
import refactoringCRRuleMM.Pattern_testAssociations;
import refactoringCRRuleMM.RefactoringCRRuleMMPackage;
import refactoringCRRuleMM.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_SemanticObject <em>Rule Pattern Pattern Semantic Object</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEAttribute <em>Rule Pattern Pattern Diff EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass <em>Rule Pattern Pattern Diff EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_eattributes <em>Rule Pattern Pattern Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_eoperations <em>Rule Pattern Pattern Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_ereferences <em>Rule Pattern Pattern Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_esupertypes <em>Rule Pattern Pattern Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_interfaces <em>Rule Pattern Pattern Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_nested_classes <em>Rule Pattern Pattern Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEClass_nested_interfaces <em>Rule Pattern Pattern Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEOperation <em>Rule Pattern Pattern Diff EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEPackage <em>Rule Pattern Pattern Diff EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEPackage_eclassifiers <em>Rule Pattern Pattern Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEPackage_interfaces <em>Rule Pattern Pattern Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEPackage_test <em>Rule Pattern Pattern Diff EPackage test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffEReference <em>Rule Pattern Pattern Diff EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffInterface <em>Rule Pattern Pattern Diff Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffInterface_eoperations <em>Rule Pattern Pattern Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DiffInterface_esupertypes <em>Rule Pattern Pattern Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DifftestAssociations <em>Rule Pattern Pattern Difftest Associations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DifftestAssociations_multi <em>Rule Pattern Pattern Difftest Associations multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_DifftestAssociations_single <em>Rule Pattern Pattern Difftest Associations single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_EAttribute <em>Rule Pattern Pattern EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_EClass <em>Rule Pattern Pattern EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_EOperation <em>Rule Pattern Pattern EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_EPackage <em>Rule Pattern Pattern EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_EReference <em>Rule Pattern Pattern EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_Interface <em>Rule Pattern Pattern Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.RuleImpl#getRulePattern_Pattern_testAssociations <em>Rule Pattern Pattern test Associations</em>}</li>
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
	 * The cached value of the '{@link #getRulePattern_Pattern_SemanticObject() <em>Rule Pattern Pattern Semantic Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_SemanticObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_SemanticObject> rulePattern_Pattern_SemanticObject;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEAttribute() <em>Rule Pattern Pattern Diff EAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEAttribute> rulePattern_Pattern_DiffEAttribute;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass() <em>Rule Pattern Pattern Diff EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass> rulePattern_Pattern_DiffEClass;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_eattributes() <em>Rule Pattern Pattern Diff EClass eattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_eattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eattributes> rulePattern_Pattern_DiffEClass_eattributes;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_eoperations() <em>Rule Pattern Pattern Diff EClass eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eoperations> rulePattern_Pattern_DiffEClass_eoperations;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_ereferences() <em>Rule Pattern Pattern Diff EClass ereferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_ereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_ereferences> rulePattern_Pattern_DiffEClass_ereferences;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_esupertypes() <em>Rule Pattern Pattern Diff EClass esupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_esupertypes> rulePattern_Pattern_DiffEClass_esupertypes;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_interfaces() <em>Rule Pattern Pattern Diff EClass interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_interfaces> rulePattern_Pattern_DiffEClass_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_nested_classes() <em>Rule Pattern Pattern Diff EClass nested classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_nested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_classes> rulePattern_Pattern_DiffEClass_nested_classes;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEClass_nested_interfaces() <em>Rule Pattern Pattern Diff EClass nested interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEClass_nested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_interfaces> rulePattern_Pattern_DiffEClass_nested_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEOperation() <em>Rule Pattern Pattern Diff EOperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEOperation> rulePattern_Pattern_DiffEOperation;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEPackage() <em>Rule Pattern Pattern Diff EPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage> rulePattern_Pattern_DiffEPackage;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEPackage_eclassifiers() <em>Rule Pattern Pattern Diff EPackage eclassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEPackage_eclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_eclassifiers> rulePattern_Pattern_DiffEPackage_eclassifiers;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEPackage_interfaces() <em>Rule Pattern Pattern Diff EPackage interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEPackage_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_interfaces> rulePattern_Pattern_DiffEPackage_interfaces;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEPackage_test() <em>Rule Pattern Pattern Diff EPackage test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEPackage_test()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_test> rulePattern_Pattern_DiffEPackage_test;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffEReference() <em>Rule Pattern Pattern Diff EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEReference> rulePattern_Pattern_DiffEReference;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffInterface() <em>Rule Pattern Pattern Diff Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface> rulePattern_Pattern_DiffInterface;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffInterface_eoperations() <em>Rule Pattern Pattern Diff Interface eoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffInterface_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_eoperations> rulePattern_Pattern_DiffInterface_eoperations;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DiffInterface_esupertypes() <em>Rule Pattern Pattern Diff Interface esupertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DiffInterface_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_esupertypes> rulePattern_Pattern_DiffInterface_esupertypes;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DifftestAssociations() <em>Rule Pattern Pattern Difftest Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DifftestAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations> rulePattern_Pattern_DifftestAssociations;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DifftestAssociations_multi() <em>Rule Pattern Pattern Difftest Associations multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DifftestAssociations_multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_multi> rulePattern_Pattern_DifftestAssociations_multi;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_DifftestAssociations_single() <em>Rule Pattern Pattern Difftest Associations single</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_DifftestAssociations_single()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_single> rulePattern_Pattern_DifftestAssociations_single;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_EAttribute() <em>Rule Pattern Pattern EAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EAttribute> rulePattern_Pattern_EAttribute;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_EClass() <em>Rule Pattern Pattern EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> rulePattern_Pattern_EClass;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_EOperation() <em>Rule Pattern Pattern EOperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EOperation> rulePattern_Pattern_EOperation;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_EPackage() <em>Rule Pattern Pattern EPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_EPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EPackage> rulePattern_Pattern_EPackage;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_EReference() <em>Rule Pattern Pattern EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EReference> rulePattern_Pattern_EReference;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_Interface() <em>Rule Pattern Pattern Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> rulePattern_Pattern_Interface;

	/**
	 * The cached value of the '{@link #getRulePattern_Pattern_testAssociations() <em>Rule Pattern Pattern test Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern_Pattern_testAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_testAssociations> rulePattern_Pattern_testAssociations;

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
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, RefactoringCRRuleMMPackage.RULE__CONSTRAINTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_SemanticObject> getRulePattern_Pattern_SemanticObject() {
		if (rulePattern_Pattern_SemanticObject == null) {
			rulePattern_Pattern_SemanticObject = new EObjectContainmentEList<Pattern_SemanticObject>(Pattern_SemanticObject.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT);
		}
		return rulePattern_Pattern_SemanticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEAttribute> getRulePattern_Pattern_DiffEAttribute() {
		if (rulePattern_Pattern_DiffEAttribute == null) {
			rulePattern_Pattern_DiffEAttribute = new EObjectContainmentEList<Pattern_DiffEAttribute>(Pattern_DiffEAttribute.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE);
		}
		return rulePattern_Pattern_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass> getRulePattern_Pattern_DiffEClass() {
		if (rulePattern_Pattern_DiffEClass == null) {
			rulePattern_Pattern_DiffEClass = new EObjectContainmentEList<Pattern_DiffEClass>(Pattern_DiffEClass.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS);
		}
		return rulePattern_Pattern_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eattributes> getRulePattern_Pattern_DiffEClass_eattributes() {
		if (rulePattern_Pattern_DiffEClass_eattributes == null) {
			rulePattern_Pattern_DiffEClass_eattributes = new EObjectContainmentEList<Pattern_DiffEClass_eattributes>(Pattern_DiffEClass_eattributes.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES);
		}
		return rulePattern_Pattern_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eoperations> getRulePattern_Pattern_DiffEClass_eoperations() {
		if (rulePattern_Pattern_DiffEClass_eoperations == null) {
			rulePattern_Pattern_DiffEClass_eoperations = new EObjectContainmentEList<Pattern_DiffEClass_eoperations>(Pattern_DiffEClass_eoperations.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS);
		}
		return rulePattern_Pattern_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_ereferences> getRulePattern_Pattern_DiffEClass_ereferences() {
		if (rulePattern_Pattern_DiffEClass_ereferences == null) {
			rulePattern_Pattern_DiffEClass_ereferences = new EObjectContainmentEList<Pattern_DiffEClass_ereferences>(Pattern_DiffEClass_ereferences.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES);
		}
		return rulePattern_Pattern_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_esupertypes> getRulePattern_Pattern_DiffEClass_esupertypes() {
		if (rulePattern_Pattern_DiffEClass_esupertypes == null) {
			rulePattern_Pattern_DiffEClass_esupertypes = new EObjectContainmentEList<Pattern_DiffEClass_esupertypes>(Pattern_DiffEClass_esupertypes.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES);
		}
		return rulePattern_Pattern_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_interfaces> getRulePattern_Pattern_DiffEClass_interfaces() {
		if (rulePattern_Pattern_DiffEClass_interfaces == null) {
			rulePattern_Pattern_DiffEClass_interfaces = new EObjectContainmentEList<Pattern_DiffEClass_interfaces>(Pattern_DiffEClass_interfaces.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES);
		}
		return rulePattern_Pattern_DiffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_classes> getRulePattern_Pattern_DiffEClass_nested_classes() {
		if (rulePattern_Pattern_DiffEClass_nested_classes == null) {
			rulePattern_Pattern_DiffEClass_nested_classes = new EObjectContainmentEList<Pattern_DiffEClass_nested_classes>(Pattern_DiffEClass_nested_classes.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES);
		}
		return rulePattern_Pattern_DiffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_interfaces> getRulePattern_Pattern_DiffEClass_nested_interfaces() {
		if (rulePattern_Pattern_DiffEClass_nested_interfaces == null) {
			rulePattern_Pattern_DiffEClass_nested_interfaces = new EObjectContainmentEList<Pattern_DiffEClass_nested_interfaces>(Pattern_DiffEClass_nested_interfaces.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES);
		}
		return rulePattern_Pattern_DiffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEOperation> getRulePattern_Pattern_DiffEOperation() {
		if (rulePattern_Pattern_DiffEOperation == null) {
			rulePattern_Pattern_DiffEOperation = new EObjectContainmentEList<Pattern_DiffEOperation>(Pattern_DiffEOperation.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION);
		}
		return rulePattern_Pattern_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage> getRulePattern_Pattern_DiffEPackage() {
		if (rulePattern_Pattern_DiffEPackage == null) {
			rulePattern_Pattern_DiffEPackage = new EObjectContainmentEList<Pattern_DiffEPackage>(Pattern_DiffEPackage.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE);
		}
		return rulePattern_Pattern_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_eclassifiers> getRulePattern_Pattern_DiffEPackage_eclassifiers() {
		if (rulePattern_Pattern_DiffEPackage_eclassifiers == null) {
			rulePattern_Pattern_DiffEPackage_eclassifiers = new EObjectContainmentEList<Pattern_DiffEPackage_eclassifiers>(Pattern_DiffEPackage_eclassifiers.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS);
		}
		return rulePattern_Pattern_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_interfaces> getRulePattern_Pattern_DiffEPackage_interfaces() {
		if (rulePattern_Pattern_DiffEPackage_interfaces == null) {
			rulePattern_Pattern_DiffEPackage_interfaces = new EObjectContainmentEList<Pattern_DiffEPackage_interfaces>(Pattern_DiffEPackage_interfaces.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES);
		}
		return rulePattern_Pattern_DiffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_test> getRulePattern_Pattern_DiffEPackage_test() {
		if (rulePattern_Pattern_DiffEPackage_test == null) {
			rulePattern_Pattern_DiffEPackage_test = new EObjectContainmentEList<Pattern_DiffEPackage_test>(Pattern_DiffEPackage_test.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST);
		}
		return rulePattern_Pattern_DiffEPackage_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEReference> getRulePattern_Pattern_DiffEReference() {
		if (rulePattern_Pattern_DiffEReference == null) {
			rulePattern_Pattern_DiffEReference = new EObjectContainmentEList<Pattern_DiffEReference>(Pattern_DiffEReference.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE);
		}
		return rulePattern_Pattern_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface> getRulePattern_Pattern_DiffInterface() {
		if (rulePattern_Pattern_DiffInterface == null) {
			rulePattern_Pattern_DiffInterface = new EObjectContainmentEList<Pattern_DiffInterface>(Pattern_DiffInterface.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE);
		}
		return rulePattern_Pattern_DiffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_eoperations> getRulePattern_Pattern_DiffInterface_eoperations() {
		if (rulePattern_Pattern_DiffInterface_eoperations == null) {
			rulePattern_Pattern_DiffInterface_eoperations = new EObjectContainmentEList<Pattern_DiffInterface_eoperations>(Pattern_DiffInterface_eoperations.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS);
		}
		return rulePattern_Pattern_DiffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_esupertypes> getRulePattern_Pattern_DiffInterface_esupertypes() {
		if (rulePattern_Pattern_DiffInterface_esupertypes == null) {
			rulePattern_Pattern_DiffInterface_esupertypes = new EObjectContainmentEList<Pattern_DiffInterface_esupertypes>(Pattern_DiffInterface_esupertypes.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES);
		}
		return rulePattern_Pattern_DiffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations> getRulePattern_Pattern_DifftestAssociations() {
		if (rulePattern_Pattern_DifftestAssociations == null) {
			rulePattern_Pattern_DifftestAssociations = new EObjectContainmentEList<Pattern_DifftestAssociations>(Pattern_DifftestAssociations.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS);
		}
		return rulePattern_Pattern_DifftestAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_multi> getRulePattern_Pattern_DifftestAssociations_multi() {
		if (rulePattern_Pattern_DifftestAssociations_multi == null) {
			rulePattern_Pattern_DifftestAssociations_multi = new EObjectContainmentEList<Pattern_DifftestAssociations_multi>(Pattern_DifftestAssociations_multi.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI);
		}
		return rulePattern_Pattern_DifftestAssociations_multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_single> getRulePattern_Pattern_DifftestAssociations_single() {
		if (rulePattern_Pattern_DifftestAssociations_single == null) {
			rulePattern_Pattern_DifftestAssociations_single = new EObjectContainmentEList<Pattern_DifftestAssociations_single>(Pattern_DifftestAssociations_single.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE);
		}
		return rulePattern_Pattern_DifftestAssociations_single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EAttribute> getRulePattern_Pattern_EAttribute() {
		if (rulePattern_Pattern_EAttribute == null) {
			rulePattern_Pattern_EAttribute = new EObjectContainmentEList<Pattern_EAttribute>(Pattern_EAttribute.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE);
		}
		return rulePattern_Pattern_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getRulePattern_Pattern_EClass() {
		if (rulePattern_Pattern_EClass == null) {
			rulePattern_Pattern_EClass = new EObjectContainmentEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS);
		}
		return rulePattern_Pattern_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EOperation> getRulePattern_Pattern_EOperation() {
		if (rulePattern_Pattern_EOperation == null) {
			rulePattern_Pattern_EOperation = new EObjectContainmentEList<Pattern_EOperation>(Pattern_EOperation.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION);
		}
		return rulePattern_Pattern_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EPackage> getRulePattern_Pattern_EPackage() {
		if (rulePattern_Pattern_EPackage == null) {
			rulePattern_Pattern_EPackage = new EObjectContainmentEList<Pattern_EPackage>(Pattern_EPackage.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE);
		}
		return rulePattern_Pattern_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EReference> getRulePattern_Pattern_EReference() {
		if (rulePattern_Pattern_EReference == null) {
			rulePattern_Pattern_EReference = new EObjectContainmentEList<Pattern_EReference>(Pattern_EReference.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE);
		}
		return rulePattern_Pattern_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getRulePattern_Pattern_Interface() {
		if (rulePattern_Pattern_Interface == null) {
			rulePattern_Pattern_Interface = new EObjectContainmentEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE);
		}
		return rulePattern_Pattern_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_testAssociations> getRulePattern_Pattern_testAssociations() {
		if (rulePattern_Pattern_testAssociations == null) {
			rulePattern_Pattern_testAssociations = new EObjectContainmentEList<Pattern_testAssociations>(Pattern_testAssociations.class, this, RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS);
		}
		return rulePattern_Pattern_testAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return ((InternalEList<?>)getRulePattern_Pattern_SemanticObject()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEAttribute()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_eattributes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_eoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_ereferences()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_esupertypes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_interfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_nested_classes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEClass_nested_interfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEOperation()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEPackage()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEPackage_eclassifiers()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEPackage_interfaces()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEPackage_test()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffEReference()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffInterface()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffInterface_eoperations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return ((InternalEList<?>)getRulePattern_Pattern_DiffInterface_esupertypes()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_DifftestAssociations()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI:
				return ((InternalEList<?>)getRulePattern_Pattern_DifftestAssociations_multi()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE:
				return ((InternalEList<?>)getRulePattern_Pattern_DifftestAssociations_single()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE:
				return ((InternalEList<?>)getRulePattern_Pattern_EAttribute()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS:
				return ((InternalEList<?>)getRulePattern_Pattern_EClass()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION:
				return ((InternalEList<?>)getRulePattern_Pattern_EOperation()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE:
				return ((InternalEList<?>)getRulePattern_Pattern_EPackage()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE:
				return ((InternalEList<?>)getRulePattern_Pattern_EReference()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE:
				return ((InternalEList<?>)getRulePattern_Pattern_Interface()).basicRemove(otherEnd, msgs);
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS:
				return ((InternalEList<?>)getRulePattern_Pattern_testAssociations()).basicRemove(otherEnd, msgs);
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
			case RefactoringCRRuleMMPackage.RULE__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.RULE__CONSTRAINTS:
				return getConstraints();
			case RefactoringCRRuleMMPackage.RULE__PRIORITY:
				return getPriority();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return getRulePattern_Pattern_SemanticObject();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE:
				return getRulePattern_Pattern_DiffEAttribute();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS:
				return getRulePattern_Pattern_DiffEClass();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return getRulePattern_Pattern_DiffEClass_eattributes();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return getRulePattern_Pattern_DiffEClass_eoperations();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES:
				return getRulePattern_Pattern_DiffEClass_ereferences();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return getRulePattern_Pattern_DiffEClass_esupertypes();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES:
				return getRulePattern_Pattern_DiffEClass_interfaces();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return getRulePattern_Pattern_DiffEClass_nested_classes();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return getRulePattern_Pattern_DiffEClass_nested_interfaces();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION:
				return getRulePattern_Pattern_DiffEOperation();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE:
				return getRulePattern_Pattern_DiffEPackage();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return getRulePattern_Pattern_DiffEPackage_eclassifiers();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return getRulePattern_Pattern_DiffEPackage_interfaces();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST:
				return getRulePattern_Pattern_DiffEPackage_test();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE:
				return getRulePattern_Pattern_DiffEReference();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE:
				return getRulePattern_Pattern_DiffInterface();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return getRulePattern_Pattern_DiffInterface_eoperations();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return getRulePattern_Pattern_DiffInterface_esupertypes();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS:
				return getRulePattern_Pattern_DifftestAssociations();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI:
				return getRulePattern_Pattern_DifftestAssociations_multi();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE:
				return getRulePattern_Pattern_DifftestAssociations_single();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE:
				return getRulePattern_Pattern_EAttribute();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS:
				return getRulePattern_Pattern_EClass();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION:
				return getRulePattern_Pattern_EOperation();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE:
				return getRulePattern_Pattern_EPackage();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE:
				return getRulePattern_Pattern_EReference();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE:
				return getRulePattern_Pattern_Interface();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS:
				return getRulePattern_Pattern_testAssociations();
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
			case RefactoringCRRuleMMPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				getRulePattern_Pattern_SemanticObject().addAll((Collection<? extends Pattern_SemanticObject>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE:
				getRulePattern_Pattern_DiffEAttribute().clear();
				getRulePattern_Pattern_DiffEAttribute().addAll((Collection<? extends Pattern_DiffEAttribute>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS:
				getRulePattern_Pattern_DiffEClass().clear();
				getRulePattern_Pattern_DiffEClass().addAll((Collection<? extends Pattern_DiffEClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				getRulePattern_Pattern_DiffEClass_eattributes().clear();
				getRulePattern_Pattern_DiffEClass_eattributes().addAll((Collection<? extends Pattern_DiffEClass_eattributes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS:
				getRulePattern_Pattern_DiffEClass_eoperations().clear();
				getRulePattern_Pattern_DiffEClass_eoperations().addAll((Collection<? extends Pattern_DiffEClass_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES:
				getRulePattern_Pattern_DiffEClass_ereferences().clear();
				getRulePattern_Pattern_DiffEClass_ereferences().addAll((Collection<? extends Pattern_DiffEClass_ereferences>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				getRulePattern_Pattern_DiffEClass_esupertypes().clear();
				getRulePattern_Pattern_DiffEClass_esupertypes().addAll((Collection<? extends Pattern_DiffEClass_esupertypes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES:
				getRulePattern_Pattern_DiffEClass_interfaces().clear();
				getRulePattern_Pattern_DiffEClass_interfaces().addAll((Collection<? extends Pattern_DiffEClass_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				getRulePattern_Pattern_DiffEClass_nested_classes().clear();
				getRulePattern_Pattern_DiffEClass_nested_classes().addAll((Collection<? extends Pattern_DiffEClass_nested_classes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				getRulePattern_Pattern_DiffEClass_nested_interfaces().clear();
				getRulePattern_Pattern_DiffEClass_nested_interfaces().addAll((Collection<? extends Pattern_DiffEClass_nested_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION:
				getRulePattern_Pattern_DiffEOperation().clear();
				getRulePattern_Pattern_DiffEOperation().addAll((Collection<? extends Pattern_DiffEOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE:
				getRulePattern_Pattern_DiffEPackage().clear();
				getRulePattern_Pattern_DiffEPackage().addAll((Collection<? extends Pattern_DiffEPackage>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				getRulePattern_Pattern_DiffEPackage_eclassifiers().clear();
				getRulePattern_Pattern_DiffEPackage_eclassifiers().addAll((Collection<? extends Pattern_DiffEPackage_eclassifiers>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES:
				getRulePattern_Pattern_DiffEPackage_interfaces().clear();
				getRulePattern_Pattern_DiffEPackage_interfaces().addAll((Collection<? extends Pattern_DiffEPackage_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST:
				getRulePattern_Pattern_DiffEPackage_test().clear();
				getRulePattern_Pattern_DiffEPackage_test().addAll((Collection<? extends Pattern_DiffEPackage_test>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE:
				getRulePattern_Pattern_DiffEReference().clear();
				getRulePattern_Pattern_DiffEReference().addAll((Collection<? extends Pattern_DiffEReference>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE:
				getRulePattern_Pattern_DiffInterface().clear();
				getRulePattern_Pattern_DiffInterface().addAll((Collection<? extends Pattern_DiffInterface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				getRulePattern_Pattern_DiffInterface_eoperations().clear();
				getRulePattern_Pattern_DiffInterface_eoperations().addAll((Collection<? extends Pattern_DiffInterface_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				getRulePattern_Pattern_DiffInterface_esupertypes().clear();
				getRulePattern_Pattern_DiffInterface_esupertypes().addAll((Collection<? extends Pattern_DiffInterface_esupertypes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS:
				getRulePattern_Pattern_DifftestAssociations().clear();
				getRulePattern_Pattern_DifftestAssociations().addAll((Collection<? extends Pattern_DifftestAssociations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI:
				getRulePattern_Pattern_DifftestAssociations_multi().clear();
				getRulePattern_Pattern_DifftestAssociations_multi().addAll((Collection<? extends Pattern_DifftestAssociations_multi>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE:
				getRulePattern_Pattern_DifftestAssociations_single().clear();
				getRulePattern_Pattern_DifftestAssociations_single().addAll((Collection<? extends Pattern_DifftestAssociations_single>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE:
				getRulePattern_Pattern_EAttribute().clear();
				getRulePattern_Pattern_EAttribute().addAll((Collection<? extends Pattern_EAttribute>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS:
				getRulePattern_Pattern_EClass().clear();
				getRulePattern_Pattern_EClass().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION:
				getRulePattern_Pattern_EOperation().clear();
				getRulePattern_Pattern_EOperation().addAll((Collection<? extends Pattern_EOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE:
				getRulePattern_Pattern_EPackage().clear();
				getRulePattern_Pattern_EPackage().addAll((Collection<? extends Pattern_EPackage>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE:
				getRulePattern_Pattern_EReference().clear();
				getRulePattern_Pattern_EReference().addAll((Collection<? extends Pattern_EReference>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE:
				getRulePattern_Pattern_Interface().clear();
				getRulePattern_Pattern_Interface().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS:
				getRulePattern_Pattern_testAssociations().clear();
				getRulePattern_Pattern_testAssociations().addAll((Collection<? extends Pattern_testAssociations>)newValue);
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
			case RefactoringCRRuleMMPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.RULE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				getRulePattern_Pattern_SemanticObject().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE:
				getRulePattern_Pattern_DiffEAttribute().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS:
				getRulePattern_Pattern_DiffEClass().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				getRulePattern_Pattern_DiffEClass_eattributes().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS:
				getRulePattern_Pattern_DiffEClass_eoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES:
				getRulePattern_Pattern_DiffEClass_ereferences().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				getRulePattern_Pattern_DiffEClass_esupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES:
				getRulePattern_Pattern_DiffEClass_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				getRulePattern_Pattern_DiffEClass_nested_classes().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				getRulePattern_Pattern_DiffEClass_nested_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION:
				getRulePattern_Pattern_DiffEOperation().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE:
				getRulePattern_Pattern_DiffEPackage().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				getRulePattern_Pattern_DiffEPackage_eclassifiers().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES:
				getRulePattern_Pattern_DiffEPackage_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST:
				getRulePattern_Pattern_DiffEPackage_test().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE:
				getRulePattern_Pattern_DiffEReference().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE:
				getRulePattern_Pattern_DiffInterface().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				getRulePattern_Pattern_DiffInterface_eoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				getRulePattern_Pattern_DiffInterface_esupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS:
				getRulePattern_Pattern_DifftestAssociations().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI:
				getRulePattern_Pattern_DifftestAssociations_multi().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE:
				getRulePattern_Pattern_DifftestAssociations_single().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE:
				getRulePattern_Pattern_EAttribute().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS:
				getRulePattern_Pattern_EClass().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION:
				getRulePattern_Pattern_EOperation().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE:
				getRulePattern_Pattern_EPackage().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE:
				getRulePattern_Pattern_EReference().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE:
				getRulePattern_Pattern_Interface().clear();
				return;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS:
				getRulePattern_Pattern_testAssociations().clear();
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
			case RefactoringCRRuleMMPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.RULE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_SEMANTIC_OBJECT:
				return rulePattern_Pattern_SemanticObject != null && !rulePattern_Pattern_SemanticObject.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EATTRIBUTE:
				return rulePattern_Pattern_DiffEAttribute != null && !rulePattern_Pattern_DiffEAttribute.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS:
				return rulePattern_Pattern_DiffEClass != null && !rulePattern_Pattern_DiffEClass.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EATTRIBUTES:
				return rulePattern_Pattern_DiffEClass_eattributes != null && !rulePattern_Pattern_DiffEClass_eattributes.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EOPERATIONS:
				return rulePattern_Pattern_DiffEClass_eoperations != null && !rulePattern_Pattern_DiffEClass_eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_EREFERENCES:
				return rulePattern_Pattern_DiffEClass_ereferences != null && !rulePattern_Pattern_DiffEClass_ereferences.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_ESUPERTYPES:
				return rulePattern_Pattern_DiffEClass_esupertypes != null && !rulePattern_Pattern_DiffEClass_esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_INTERFACES:
				return rulePattern_Pattern_DiffEClass_interfaces != null && !rulePattern_Pattern_DiffEClass_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_CLASSES:
				return rulePattern_Pattern_DiffEClass_nested_classes != null && !rulePattern_Pattern_DiffEClass_nested_classes.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_ECLASS_NESTED_INTERFACES:
				return rulePattern_Pattern_DiffEClass_nested_interfaces != null && !rulePattern_Pattern_DiffEClass_nested_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EOPERATION:
				return rulePattern_Pattern_DiffEOperation != null && !rulePattern_Pattern_DiffEOperation.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE:
				return rulePattern_Pattern_DiffEPackage != null && !rulePattern_Pattern_DiffEPackage.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_ECLASSIFIERS:
				return rulePattern_Pattern_DiffEPackage_eclassifiers != null && !rulePattern_Pattern_DiffEPackage_eclassifiers.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_INTERFACES:
				return rulePattern_Pattern_DiffEPackage_interfaces != null && !rulePattern_Pattern_DiffEPackage_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EPACKAGE_TEST:
				return rulePattern_Pattern_DiffEPackage_test != null && !rulePattern_Pattern_DiffEPackage_test.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_EREFERENCE:
				return rulePattern_Pattern_DiffEReference != null && !rulePattern_Pattern_DiffEReference.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE:
				return rulePattern_Pattern_DiffInterface != null && !rulePattern_Pattern_DiffInterface.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_EOPERATIONS:
				return rulePattern_Pattern_DiffInterface_eoperations != null && !rulePattern_Pattern_DiffInterface_eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFF_INTERFACE_ESUPERTYPES:
				return rulePattern_Pattern_DiffInterface_esupertypes != null && !rulePattern_Pattern_DiffInterface_esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS:
				return rulePattern_Pattern_DifftestAssociations != null && !rulePattern_Pattern_DifftestAssociations.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_MULTI:
				return rulePattern_Pattern_DifftestAssociations_multi != null && !rulePattern_Pattern_DifftestAssociations_multi.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_DIFFTEST_ASSOCIATIONS_SINGLE:
				return rulePattern_Pattern_DifftestAssociations_single != null && !rulePattern_Pattern_DifftestAssociations_single.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EATTRIBUTE:
				return rulePattern_Pattern_EAttribute != null && !rulePattern_Pattern_EAttribute.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_ECLASS:
				return rulePattern_Pattern_EClass != null && !rulePattern_Pattern_EClass.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EOPERATION:
				return rulePattern_Pattern_EOperation != null && !rulePattern_Pattern_EOperation.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EPACKAGE:
				return rulePattern_Pattern_EPackage != null && !rulePattern_Pattern_EPackage.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_EREFERENCE:
				return rulePattern_Pattern_EReference != null && !rulePattern_Pattern_EReference.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_INTERFACE:
				return rulePattern_Pattern_Interface != null && !rulePattern_Pattern_Interface.isEmpty();
			case RefactoringCRRuleMMPackage.RULE__RULE_PATTERN_PATTERN_TEST_ASSOCIATIONS:
				return rulePattern_Pattern_testAssociations != null && !rulePattern_Pattern_testAssociations.isEmpty();
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
