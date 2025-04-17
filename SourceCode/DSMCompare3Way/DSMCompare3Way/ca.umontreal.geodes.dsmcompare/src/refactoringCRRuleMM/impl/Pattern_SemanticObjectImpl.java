/**
 */
package refactoringCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEPackage_test <em>Semantic Object Diff EPackage test</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DifftestAssociations <em>Semantic Object Difftest Associations</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DifftestAssociations_multi <em>Semantic Object Difftest Associations multi</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_DifftestAssociations_single <em>Semantic Object Difftest Associations single</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_EClass <em>Semantic Object EClass</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_EReference <em>Semantic Object EReference</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_Interface <em>Semantic Object Interface</em>}</li>
 *   <li>{@link refactoringCRRuleMM.impl.Pattern_SemanticObjectImpl#getSemanticObject_testAssociations <em>Semantic Object test Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Pattern_SemanticObjectImpl extends MinimalEObjectImpl.Container implements Pattern_SemanticObject {
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
	 * The cached value of the '{@link #getSemanticObject_DiffEAttribute() <em>Semantic Object Diff EAttribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEAttribute> semanticObject_DiffEAttribute;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass() <em>Semantic Object Diff EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass> semanticObject_DiffEClass;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_eattributes() <em>Semantic Object Diff EClass eattributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_eattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eattributes> semanticObject_DiffEClass_eattributes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_eoperations() <em>Semantic Object Diff EClass eoperations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_eoperations> semanticObject_DiffEClass_eoperations;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_ereferences() <em>Semantic Object Diff EClass ereferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_ereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_ereferences> semanticObject_DiffEClass_ereferences;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_esupertypes() <em>Semantic Object Diff EClass esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_esupertypes> semanticObject_DiffEClass_esupertypes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_interfaces() <em>Semantic Object Diff EClass interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_interfaces> semanticObject_DiffEClass_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_nested_classes() <em>Semantic Object Diff EClass nested classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_nested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_classes> semanticObject_DiffEClass_nested_classes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_nested_interfaces() <em>Semantic Object Diff EClass nested interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_nested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEClass_nested_interfaces> semanticObject_DiffEClass_nested_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEOperation() <em>Semantic Object Diff EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEOperation> semanticObject_DiffEOperation;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage() <em>Semantic Object Diff EPackage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage> semanticObject_DiffEPackage;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage_eclassifiers() <em>Semantic Object Diff EPackage eclassifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage_eclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_eclassifiers> semanticObject_DiffEPackage_eclassifiers;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage_interfaces() <em>Semantic Object Diff EPackage interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_interfaces> semanticObject_DiffEPackage_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage_test() <em>Semantic Object Diff EPackage test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage_test()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEPackage_test> semanticObject_DiffEPackage_test;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEReference() <em>Semantic Object Diff EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffEReference> semanticObject_DiffEReference;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface() <em>Semantic Object Diff Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface> semanticObject_DiffInterface;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface_eoperations() <em>Semantic Object Diff Interface eoperations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_eoperations> semanticObject_DiffInterface_eoperations;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface_esupertypes() <em>Semantic Object Diff Interface esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffInterface_esupertypes> semanticObject_DiffInterface_esupertypes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DifftestAssociations() <em>Semantic Object Difftest Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DifftestAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations> semanticObject_DifftestAssociations;

	/**
	 * The cached value of the '{@link #getSemanticObject_DifftestAssociations_multi() <em>Semantic Object Difftest Associations multi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DifftestAssociations_multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_multi> semanticObject_DifftestAssociations_multi;

	/**
	 * The cached value of the '{@link #getSemanticObject_DifftestAssociations_single() <em>Semantic Object Difftest Associations single</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DifftestAssociations_single()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DifftestAssociations_single> semanticObject_DifftestAssociations_single;

	/**
	 * The cached value of the '{@link #getSemanticObject_EAttribute() <em>Semantic Object EAttribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EAttribute> semanticObject_EAttribute;

	/**
	 * The cached value of the '{@link #getSemanticObject_EClass() <em>Semantic Object EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EClass> semanticObject_EClass;

	/**
	 * The cached value of the '{@link #getSemanticObject_EOperation() <em>Semantic Object EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EOperation> semanticObject_EOperation;

	/**
	 * The cached value of the '{@link #getSemanticObject_EPackage() <em>Semantic Object EPackage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EPackage> semanticObject_EPackage;

	/**
	 * The cached value of the '{@link #getSemanticObject_EReference() <em>Semantic Object EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_EReference> semanticObject_EReference;

	/**
	 * The cached value of the '{@link #getSemanticObject_Interface() <em>Semantic Object Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_Interface> semanticObject_Interface;

	/**
	 * The cached value of the '{@link #getSemanticObject_testAssociations() <em>Semantic Object test Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_testAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_testAssociations> semanticObject_testAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringCRRuleMMPackage.Literals.PATTERN_SEMANTIC_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEAttribute> getSemanticObject_DiffEAttribute() {
		if (semanticObject_DiffEAttribute == null) {
			semanticObject_DiffEAttribute = new EObjectResolvingEList<Pattern_DiffEAttribute>(Pattern_DiffEAttribute.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE);
		}
		return semanticObject_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass> getSemanticObject_DiffEClass() {
		if (semanticObject_DiffEClass == null) {
			semanticObject_DiffEClass = new EObjectResolvingEList<Pattern_DiffEClass>(Pattern_DiffEClass.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS);
		}
		return semanticObject_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eattributes> getSemanticObject_DiffEClass_eattributes() {
		if (semanticObject_DiffEClass_eattributes == null) {
			semanticObject_DiffEClass_eattributes = new EObjectResolvingEList<Pattern_DiffEClass_eattributes>(Pattern_DiffEClass_eattributes.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES);
		}
		return semanticObject_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_eoperations> getSemanticObject_DiffEClass_eoperations() {
		if (semanticObject_DiffEClass_eoperations == null) {
			semanticObject_DiffEClass_eoperations = new EObjectResolvingEList<Pattern_DiffEClass_eoperations>(Pattern_DiffEClass_eoperations.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS);
		}
		return semanticObject_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_ereferences> getSemanticObject_DiffEClass_ereferences() {
		if (semanticObject_DiffEClass_ereferences == null) {
			semanticObject_DiffEClass_ereferences = new EObjectResolvingEList<Pattern_DiffEClass_ereferences>(Pattern_DiffEClass_ereferences.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES);
		}
		return semanticObject_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_esupertypes> getSemanticObject_DiffEClass_esupertypes() {
		if (semanticObject_DiffEClass_esupertypes == null) {
			semanticObject_DiffEClass_esupertypes = new EObjectResolvingEList<Pattern_DiffEClass_esupertypes>(Pattern_DiffEClass_esupertypes.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES);
		}
		return semanticObject_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_interfaces> getSemanticObject_DiffEClass_interfaces() {
		if (semanticObject_DiffEClass_interfaces == null) {
			semanticObject_DiffEClass_interfaces = new EObjectResolvingEList<Pattern_DiffEClass_interfaces>(Pattern_DiffEClass_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES);
		}
		return semanticObject_DiffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_classes> getSemanticObject_DiffEClass_nested_classes() {
		if (semanticObject_DiffEClass_nested_classes == null) {
			semanticObject_DiffEClass_nested_classes = new EObjectResolvingEList<Pattern_DiffEClass_nested_classes>(Pattern_DiffEClass_nested_classes.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES);
		}
		return semanticObject_DiffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEClass_nested_interfaces> getSemanticObject_DiffEClass_nested_interfaces() {
		if (semanticObject_DiffEClass_nested_interfaces == null) {
			semanticObject_DiffEClass_nested_interfaces = new EObjectResolvingEList<Pattern_DiffEClass_nested_interfaces>(Pattern_DiffEClass_nested_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES);
		}
		return semanticObject_DiffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEOperation> getSemanticObject_DiffEOperation() {
		if (semanticObject_DiffEOperation == null) {
			semanticObject_DiffEOperation = new EObjectResolvingEList<Pattern_DiffEOperation>(Pattern_DiffEOperation.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION);
		}
		return semanticObject_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage> getSemanticObject_DiffEPackage() {
		if (semanticObject_DiffEPackage == null) {
			semanticObject_DiffEPackage = new EObjectResolvingEList<Pattern_DiffEPackage>(Pattern_DiffEPackage.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE);
		}
		return semanticObject_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_eclassifiers> getSemanticObject_DiffEPackage_eclassifiers() {
		if (semanticObject_DiffEPackage_eclassifiers == null) {
			semanticObject_DiffEPackage_eclassifiers = new EObjectResolvingEList<Pattern_DiffEPackage_eclassifiers>(Pattern_DiffEPackage_eclassifiers.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS);
		}
		return semanticObject_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_interfaces> getSemanticObject_DiffEPackage_interfaces() {
		if (semanticObject_DiffEPackage_interfaces == null) {
			semanticObject_DiffEPackage_interfaces = new EObjectResolvingEList<Pattern_DiffEPackage_interfaces>(Pattern_DiffEPackage_interfaces.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES);
		}
		return semanticObject_DiffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEPackage_test> getSemanticObject_DiffEPackage_test() {
		if (semanticObject_DiffEPackage_test == null) {
			semanticObject_DiffEPackage_test = new EObjectResolvingEList<Pattern_DiffEPackage_test>(Pattern_DiffEPackage_test.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST);
		}
		return semanticObject_DiffEPackage_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffEReference> getSemanticObject_DiffEReference() {
		if (semanticObject_DiffEReference == null) {
			semanticObject_DiffEReference = new EObjectResolvingEList<Pattern_DiffEReference>(Pattern_DiffEReference.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE);
		}
		return semanticObject_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface> getSemanticObject_DiffInterface() {
		if (semanticObject_DiffInterface == null) {
			semanticObject_DiffInterface = new EObjectResolvingEList<Pattern_DiffInterface>(Pattern_DiffInterface.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE);
		}
		return semanticObject_DiffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_eoperations> getSemanticObject_DiffInterface_eoperations() {
		if (semanticObject_DiffInterface_eoperations == null) {
			semanticObject_DiffInterface_eoperations = new EObjectResolvingEList<Pattern_DiffInterface_eoperations>(Pattern_DiffInterface_eoperations.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS);
		}
		return semanticObject_DiffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffInterface_esupertypes> getSemanticObject_DiffInterface_esupertypes() {
		if (semanticObject_DiffInterface_esupertypes == null) {
			semanticObject_DiffInterface_esupertypes = new EObjectResolvingEList<Pattern_DiffInterface_esupertypes>(Pattern_DiffInterface_esupertypes.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES);
		}
		return semanticObject_DiffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations> getSemanticObject_DifftestAssociations() {
		if (semanticObject_DifftestAssociations == null) {
			semanticObject_DifftestAssociations = new EObjectResolvingEList<Pattern_DifftestAssociations>(Pattern_DifftestAssociations.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS);
		}
		return semanticObject_DifftestAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_multi> getSemanticObject_DifftestAssociations_multi() {
		if (semanticObject_DifftestAssociations_multi == null) {
			semanticObject_DifftestAssociations_multi = new EObjectResolvingEList<Pattern_DifftestAssociations_multi>(Pattern_DifftestAssociations_multi.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI);
		}
		return semanticObject_DifftestAssociations_multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DifftestAssociations_single> getSemanticObject_DifftestAssociations_single() {
		if (semanticObject_DifftestAssociations_single == null) {
			semanticObject_DifftestAssociations_single = new EObjectResolvingEList<Pattern_DifftestAssociations_single>(Pattern_DifftestAssociations_single.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE);
		}
		return semanticObject_DifftestAssociations_single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EAttribute> getSemanticObject_EAttribute() {
		if (semanticObject_EAttribute == null) {
			semanticObject_EAttribute = new EObjectResolvingEList<Pattern_EAttribute>(Pattern_EAttribute.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE);
		}
		return semanticObject_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EClass> getSemanticObject_EClass() {
		if (semanticObject_EClass == null) {
			semanticObject_EClass = new EObjectResolvingEList<Pattern_EClass>(Pattern_EClass.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS);
		}
		return semanticObject_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EOperation> getSemanticObject_EOperation() {
		if (semanticObject_EOperation == null) {
			semanticObject_EOperation = new EObjectResolvingEList<Pattern_EOperation>(Pattern_EOperation.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION);
		}
		return semanticObject_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EPackage> getSemanticObject_EPackage() {
		if (semanticObject_EPackage == null) {
			semanticObject_EPackage = new EObjectResolvingEList<Pattern_EPackage>(Pattern_EPackage.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE);
		}
		return semanticObject_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_EReference> getSemanticObject_EReference() {
		if (semanticObject_EReference == null) {
			semanticObject_EReference = new EObjectResolvingEList<Pattern_EReference>(Pattern_EReference.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE);
		}
		return semanticObject_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_Interface> getSemanticObject_Interface() {
		if (semanticObject_Interface == null) {
			semanticObject_Interface = new EObjectResolvingEList<Pattern_Interface>(Pattern_Interface.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE);
		}
		return semanticObject_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_testAssociations> getSemanticObject_testAssociations() {
		if (semanticObject_testAssociations == null) {
			semanticObject_testAssociations = new EObjectResolvingEList<Pattern_testAssociations>(Pattern_testAssociations.class, this, RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS);
		}
		return semanticObject_testAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return getID_Pattern();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isIsForbidden();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return getName();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				return getSemanticObject_DiffEAttribute();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				return getSemanticObject_DiffEClass();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				return getSemanticObject_DiffEClass_eattributes();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				return getSemanticObject_DiffEClass_eoperations();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				return getSemanticObject_DiffEClass_ereferences();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				return getSemanticObject_DiffEClass_esupertypes();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				return getSemanticObject_DiffEClass_interfaces();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				return getSemanticObject_DiffEClass_nested_classes();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				return getSemanticObject_DiffEClass_nested_interfaces();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				return getSemanticObject_DiffEOperation();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				return getSemanticObject_DiffEPackage();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				return getSemanticObject_DiffEPackage_eclassifiers();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				return getSemanticObject_DiffEPackage_interfaces();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST:
				return getSemanticObject_DiffEPackage_test();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				return getSemanticObject_DiffEReference();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				return getSemanticObject_DiffInterface();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				return getSemanticObject_DiffInterface_eoperations();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				return getSemanticObject_DiffInterface_esupertypes();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS:
				return getSemanticObject_DifftestAssociations();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI:
				return getSemanticObject_DifftestAssociations_multi();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE:
				return getSemanticObject_DifftestAssociations_single();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				return getSemanticObject_EAttribute();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				return getSemanticObject_EClass();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				return getSemanticObject_EOperation();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				return getSemanticObject_EPackage();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				return getSemanticObject_EReference();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				return getSemanticObject_Interface();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS:
				return getSemanticObject_testAssociations();
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
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				getSemanticObject_DiffEAttribute().clear();
				getSemanticObject_DiffEAttribute().addAll((Collection<? extends Pattern_DiffEAttribute>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				getSemanticObject_DiffEClass().clear();
				getSemanticObject_DiffEClass().addAll((Collection<? extends Pattern_DiffEClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				getSemanticObject_DiffEClass_eattributes().clear();
				getSemanticObject_DiffEClass_eattributes().addAll((Collection<? extends Pattern_DiffEClass_eattributes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				getSemanticObject_DiffEClass_eoperations().clear();
				getSemanticObject_DiffEClass_eoperations().addAll((Collection<? extends Pattern_DiffEClass_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				getSemanticObject_DiffEClass_ereferences().clear();
				getSemanticObject_DiffEClass_ereferences().addAll((Collection<? extends Pattern_DiffEClass_ereferences>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				getSemanticObject_DiffEClass_esupertypes().clear();
				getSemanticObject_DiffEClass_esupertypes().addAll((Collection<? extends Pattern_DiffEClass_esupertypes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				getSemanticObject_DiffEClass_interfaces().clear();
				getSemanticObject_DiffEClass_interfaces().addAll((Collection<? extends Pattern_DiffEClass_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				getSemanticObject_DiffEClass_nested_classes().clear();
				getSemanticObject_DiffEClass_nested_classes().addAll((Collection<? extends Pattern_DiffEClass_nested_classes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				getSemanticObject_DiffEClass_nested_interfaces().clear();
				getSemanticObject_DiffEClass_nested_interfaces().addAll((Collection<? extends Pattern_DiffEClass_nested_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				getSemanticObject_DiffEOperation().clear();
				getSemanticObject_DiffEOperation().addAll((Collection<? extends Pattern_DiffEOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				getSemanticObject_DiffEPackage().clear();
				getSemanticObject_DiffEPackage().addAll((Collection<? extends Pattern_DiffEPackage>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				getSemanticObject_DiffEPackage_eclassifiers().clear();
				getSemanticObject_DiffEPackage_eclassifiers().addAll((Collection<? extends Pattern_DiffEPackage_eclassifiers>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				getSemanticObject_DiffEPackage_interfaces().clear();
				getSemanticObject_DiffEPackage_interfaces().addAll((Collection<? extends Pattern_DiffEPackage_interfaces>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST:
				getSemanticObject_DiffEPackage_test().clear();
				getSemanticObject_DiffEPackage_test().addAll((Collection<? extends Pattern_DiffEPackage_test>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				getSemanticObject_DiffEReference().clear();
				getSemanticObject_DiffEReference().addAll((Collection<? extends Pattern_DiffEReference>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				getSemanticObject_DiffInterface().clear();
				getSemanticObject_DiffInterface().addAll((Collection<? extends Pattern_DiffInterface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				getSemanticObject_DiffInterface_eoperations().clear();
				getSemanticObject_DiffInterface_eoperations().addAll((Collection<? extends Pattern_DiffInterface_eoperations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				getSemanticObject_DiffInterface_esupertypes().clear();
				getSemanticObject_DiffInterface_esupertypes().addAll((Collection<? extends Pattern_DiffInterface_esupertypes>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS:
				getSemanticObject_DifftestAssociations().clear();
				getSemanticObject_DifftestAssociations().addAll((Collection<? extends Pattern_DifftestAssociations>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI:
				getSemanticObject_DifftestAssociations_multi().clear();
				getSemanticObject_DifftestAssociations_multi().addAll((Collection<? extends Pattern_DifftestAssociations_multi>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE:
				getSemanticObject_DifftestAssociations_single().clear();
				getSemanticObject_DifftestAssociations_single().addAll((Collection<? extends Pattern_DifftestAssociations_single>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				getSemanticObject_EAttribute().clear();
				getSemanticObject_EAttribute().addAll((Collection<? extends Pattern_EAttribute>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				getSemanticObject_EClass().clear();
				getSemanticObject_EClass().addAll((Collection<? extends Pattern_EClass>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				getSemanticObject_EOperation().clear();
				getSemanticObject_EOperation().addAll((Collection<? extends Pattern_EOperation>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				getSemanticObject_EPackage().clear();
				getSemanticObject_EPackage().addAll((Collection<? extends Pattern_EPackage>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				getSemanticObject_EReference().clear();
				getSemanticObject_EReference().addAll((Collection<? extends Pattern_EReference>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				getSemanticObject_Interface().clear();
				getSemanticObject_Interface().addAll((Collection<? extends Pattern_Interface>)newValue);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS:
				getSemanticObject_testAssociations().clear();
				getSemanticObject_testAssociations().addAll((Collection<? extends Pattern_testAssociations>)newValue);
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
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				getSemanticObject_DiffEAttribute().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				getSemanticObject_DiffEClass().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				getSemanticObject_DiffEClass_eattributes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				getSemanticObject_DiffEClass_eoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				getSemanticObject_DiffEClass_ereferences().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				getSemanticObject_DiffEClass_esupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				getSemanticObject_DiffEClass_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				getSemanticObject_DiffEClass_nested_classes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				getSemanticObject_DiffEClass_nested_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				getSemanticObject_DiffEOperation().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				getSemanticObject_DiffEPackage().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				getSemanticObject_DiffEPackage_eclassifiers().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				getSemanticObject_DiffEPackage_interfaces().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST:
				getSemanticObject_DiffEPackage_test().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				getSemanticObject_DiffEReference().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				getSemanticObject_DiffInterface().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				getSemanticObject_DiffInterface_eoperations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				getSemanticObject_DiffInterface_esupertypes().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS:
				getSemanticObject_DifftestAssociations().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI:
				getSemanticObject_DifftestAssociations_multi().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE:
				getSemanticObject_DifftestAssociations_single().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				getSemanticObject_EAttribute().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				getSemanticObject_EClass().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				getSemanticObject_EOperation().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				getSemanticObject_EPackage().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				getSemanticObject_EReference().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				getSemanticObject_Interface().clear();
				return;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS:
				getSemanticObject_testAssociations().clear();
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
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				return semanticObject_DiffEAttribute != null && !semanticObject_DiffEAttribute.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				return semanticObject_DiffEClass != null && !semanticObject_DiffEClass.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				return semanticObject_DiffEClass_eattributes != null && !semanticObject_DiffEClass_eattributes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				return semanticObject_DiffEClass_eoperations != null && !semanticObject_DiffEClass_eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				return semanticObject_DiffEClass_ereferences != null && !semanticObject_DiffEClass_ereferences.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				return semanticObject_DiffEClass_esupertypes != null && !semanticObject_DiffEClass_esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				return semanticObject_DiffEClass_interfaces != null && !semanticObject_DiffEClass_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				return semanticObject_DiffEClass_nested_classes != null && !semanticObject_DiffEClass_nested_classes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				return semanticObject_DiffEClass_nested_interfaces != null && !semanticObject_DiffEClass_nested_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				return semanticObject_DiffEOperation != null && !semanticObject_DiffEOperation.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				return semanticObject_DiffEPackage != null && !semanticObject_DiffEPackage.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				return semanticObject_DiffEPackage_eclassifiers != null && !semanticObject_DiffEPackage_eclassifiers.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				return semanticObject_DiffEPackage_interfaces != null && !semanticObject_DiffEPackage_interfaces.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_TEST:
				return semanticObject_DiffEPackage_test != null && !semanticObject_DiffEPackage_test.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				return semanticObject_DiffEReference != null && !semanticObject_DiffEReference.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				return semanticObject_DiffInterface != null && !semanticObject_DiffInterface.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				return semanticObject_DiffInterface_eoperations != null && !semanticObject_DiffInterface_eoperations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				return semanticObject_DiffInterface_esupertypes != null && !semanticObject_DiffInterface_esupertypes.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS:
				return semanticObject_DifftestAssociations != null && !semanticObject_DifftestAssociations.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_MULTI:
				return semanticObject_DifftestAssociations_multi != null && !semanticObject_DifftestAssociations_multi.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFFTEST_ASSOCIATIONS_SINGLE:
				return semanticObject_DifftestAssociations_single != null && !semanticObject_DifftestAssociations_single.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				return semanticObject_EAttribute != null && !semanticObject_EAttribute.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				return semanticObject_EClass != null && !semanticObject_EClass.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				return semanticObject_EOperation != null && !semanticObject_EOperation.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				return semanticObject_EPackage != null && !semanticObject_EPackage.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				return semanticObject_EReference != null && !semanticObject_EReference.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				return semanticObject_Interface != null && !semanticObject_Interface.isEmpty();
			case RefactoringCRRuleMMPackage.PATTERN_SEMANTIC_OBJECT__SEMANTIC_OBJECT_TEST_ASSOCIATIONS:
				return semanticObject_testAssociations != null && !semanticObject_testAssociations.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Pattern_SemanticObjectImpl
