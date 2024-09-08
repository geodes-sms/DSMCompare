/**
 */
package refactoringDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import refactoringDiffMM.DiffEAttribute;
import refactoringDiffMM.DiffEClass;
import refactoringDiffMM.DiffEClass_eattributes;
import refactoringDiffMM.DiffEClass_eoperations;
import refactoringDiffMM.DiffEClass_ereferences;
import refactoringDiffMM.DiffEClass_esupertypes;
import refactoringDiffMM.DiffEClass_interfaces;
import refactoringDiffMM.DiffEClass_nested_classes;
import refactoringDiffMM.DiffEClass_nested_interfaces;
import refactoringDiffMM.DiffEOperation;
import refactoringDiffMM.DiffEPackage;
import refactoringDiffMM.DiffEPackage_eclassifiers;
import refactoringDiffMM.DiffEPackage_interfaces;
import refactoringDiffMM.DiffEReference;
import refactoringDiffMM.DiffInterface;
import refactoringDiffMM.DiffInterface_eoperations;
import refactoringDiffMM.DiffInterface_esupertypes;
import refactoringDiffMM.EAttribute;
import refactoringDiffMM.EClass;
import refactoringDiffMM.EOperation;
import refactoringDiffMM.EPackage;
import refactoringDiffMM.EReference;
import refactoringDiffMM.Interface;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringDiffMM.SemanticObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEAttribute <em>Semantic Object Diff EAttribute</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass <em>Semantic Object Diff EClass</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_eattributes <em>Semantic Object Diff EClass eattributes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_eoperations <em>Semantic Object Diff EClass eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_ereferences <em>Semantic Object Diff EClass ereferences</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_esupertypes <em>Semantic Object Diff EClass esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_interfaces <em>Semantic Object Diff EClass interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_nested_classes <em>Semantic Object Diff EClass nested classes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEClass_nested_interfaces <em>Semantic Object Diff EClass nested interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEOperation <em>Semantic Object Diff EOperation</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEPackage <em>Semantic Object Diff EPackage</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEPackage_eclassifiers <em>Semantic Object Diff EPackage eclassifiers</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEPackage_interfaces <em>Semantic Object Diff EPackage interfaces</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffEReference <em>Semantic Object Diff EReference</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffInterface <em>Semantic Object Diff Interface</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffInterface_eoperations <em>Semantic Object Diff Interface eoperations</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_DiffInterface_esupertypes <em>Semantic Object Diff Interface esupertypes</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_EAttribute <em>Semantic Object EAttribute</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_EClass <em>Semantic Object EClass</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_EOperation <em>Semantic Object EOperation</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_EPackage <em>Semantic Object EPackage</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_EReference <em>Semantic Object EReference</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.SemanticObjectImpl#getSemanticObject_Interface <em>Semantic Object Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemanticObjectImpl extends MinimalEObjectImpl.Container implements SemanticObject {
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
	protected EList<DiffEAttribute> semanticObject_DiffEAttribute;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass() <em>Semantic Object Diff EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass> semanticObject_DiffEClass;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_eattributes() <em>Semantic Object Diff EClass eattributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_eattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eattributes> semanticObject_DiffEClass_eattributes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_eoperations() <em>Semantic Object Diff EClass eoperations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eoperations> semanticObject_DiffEClass_eoperations;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_ereferences() <em>Semantic Object Diff EClass ereferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_ereferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_ereferences> semanticObject_DiffEClass_ereferences;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_esupertypes() <em>Semantic Object Diff EClass esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_esupertypes> semanticObject_DiffEClass_esupertypes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_interfaces() <em>Semantic Object Diff EClass interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_interfaces> semanticObject_DiffEClass_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_nested_classes() <em>Semantic Object Diff EClass nested classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_nested_classes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_classes> semanticObject_DiffEClass_nested_classes;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEClass_nested_interfaces() <em>Semantic Object Diff EClass nested interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEClass_nested_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_nested_interfaces> semanticObject_DiffEClass_nested_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEOperation() <em>Semantic Object Diff EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation> semanticObject_DiffEOperation;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage() <em>Semantic Object Diff EPackage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage> semanticObject_DiffEPackage;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage_eclassifiers() <em>Semantic Object Diff EPackage eclassifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage_eclassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_eclassifiers> semanticObject_DiffEPackage_eclassifiers;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEPackage_interfaces() <em>Semantic Object Diff EPackage interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEPackage_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEPackage_interfaces> semanticObject_DiffEPackage_interfaces;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffEReference() <em>Semantic Object Diff EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEReference> semanticObject_DiffEReference;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface() <em>Semantic Object Diff Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface> semanticObject_DiffInterface;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface_eoperations() <em>Semantic Object Diff Interface eoperations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface_eoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_eoperations> semanticObject_DiffInterface_eoperations;

	/**
	 * The cached value of the '{@link #getSemanticObject_DiffInterface_esupertypes() <em>Semantic Object Diff Interface esupertypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_DiffInterface_esupertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInterface_esupertypes> semanticObject_DiffInterface_esupertypes;

	/**
	 * The cached value of the '{@link #getSemanticObject_EAttribute() <em>Semantic Object EAttribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> semanticObject_EAttribute;

	/**
	 * The cached value of the '{@link #getSemanticObject_EClass() <em>Semantic Object EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> semanticObject_EClass;

	/**
	 * The cached value of the '{@link #getSemanticObject_EOperation() <em>Semantic Object EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> semanticObject_EOperation;

	/**
	 * The cached value of the '{@link #getSemanticObject_EPackage() <em>Semantic Object EPackage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> semanticObject_EPackage;

	/**
	 * The cached value of the '{@link #getSemanticObject_EReference() <em>Semantic Object EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> semanticObject_EReference;

	/**
	 * The cached value of the '{@link #getSemanticObject_Interface() <em>Semantic Object Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticObject_Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> semanticObject_Interface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.SEMANTIC_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEAttribute> getSemanticObject_DiffEAttribute() {
		if (semanticObject_DiffEAttribute == null) {
			semanticObject_DiffEAttribute = new EObjectResolvingEList<DiffEAttribute>(DiffEAttribute.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE);
		}
		return semanticObject_DiffEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass> getSemanticObject_DiffEClass() {
		if (semanticObject_DiffEClass == null) {
			semanticObject_DiffEClass = new EObjectResolvingEList<DiffEClass>(DiffEClass.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS);
		}
		return semanticObject_DiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_eattributes> getSemanticObject_DiffEClass_eattributes() {
		if (semanticObject_DiffEClass_eattributes == null) {
			semanticObject_DiffEClass_eattributes = new EObjectResolvingEList<DiffEClass_eattributes>(DiffEClass_eattributes.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES);
		}
		return semanticObject_DiffEClass_eattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_eoperations> getSemanticObject_DiffEClass_eoperations() {
		if (semanticObject_DiffEClass_eoperations == null) {
			semanticObject_DiffEClass_eoperations = new EObjectResolvingEList<DiffEClass_eoperations>(DiffEClass_eoperations.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS);
		}
		return semanticObject_DiffEClass_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_ereferences> getSemanticObject_DiffEClass_ereferences() {
		if (semanticObject_DiffEClass_ereferences == null) {
			semanticObject_DiffEClass_ereferences = new EObjectResolvingEList<DiffEClass_ereferences>(DiffEClass_ereferences.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES);
		}
		return semanticObject_DiffEClass_ereferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_esupertypes> getSemanticObject_DiffEClass_esupertypes() {
		if (semanticObject_DiffEClass_esupertypes == null) {
			semanticObject_DiffEClass_esupertypes = new EObjectResolvingEList<DiffEClass_esupertypes>(DiffEClass_esupertypes.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES);
		}
		return semanticObject_DiffEClass_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_interfaces> getSemanticObject_DiffEClass_interfaces() {
		if (semanticObject_DiffEClass_interfaces == null) {
			semanticObject_DiffEClass_interfaces = new EObjectResolvingEList<DiffEClass_interfaces>(DiffEClass_interfaces.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES);
		}
		return semanticObject_DiffEClass_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_classes> getSemanticObject_DiffEClass_nested_classes() {
		if (semanticObject_DiffEClass_nested_classes == null) {
			semanticObject_DiffEClass_nested_classes = new EObjectResolvingEList<DiffEClass_nested_classes>(DiffEClass_nested_classes.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES);
		}
		return semanticObject_DiffEClass_nested_classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEClass_nested_interfaces> getSemanticObject_DiffEClass_nested_interfaces() {
		if (semanticObject_DiffEClass_nested_interfaces == null) {
			semanticObject_DiffEClass_nested_interfaces = new EObjectResolvingEList<DiffEClass_nested_interfaces>(DiffEClass_nested_interfaces.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES);
		}
		return semanticObject_DiffEClass_nested_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEOperation> getSemanticObject_DiffEOperation() {
		if (semanticObject_DiffEOperation == null) {
			semanticObject_DiffEOperation = new EObjectResolvingEList<DiffEOperation>(DiffEOperation.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION);
		}
		return semanticObject_DiffEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage> getSemanticObject_DiffEPackage() {
		if (semanticObject_DiffEPackage == null) {
			semanticObject_DiffEPackage = new EObjectResolvingEList<DiffEPackage>(DiffEPackage.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE);
		}
		return semanticObject_DiffEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage_eclassifiers> getSemanticObject_DiffEPackage_eclassifiers() {
		if (semanticObject_DiffEPackage_eclassifiers == null) {
			semanticObject_DiffEPackage_eclassifiers = new EObjectResolvingEList<DiffEPackage_eclassifiers>(DiffEPackage_eclassifiers.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS);
		}
		return semanticObject_DiffEPackage_eclassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEPackage_interfaces> getSemanticObject_DiffEPackage_interfaces() {
		if (semanticObject_DiffEPackage_interfaces == null) {
			semanticObject_DiffEPackage_interfaces = new EObjectResolvingEList<DiffEPackage_interfaces>(DiffEPackage_interfaces.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES);
		}
		return semanticObject_DiffEPackage_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffEReference> getSemanticObject_DiffEReference() {
		if (semanticObject_DiffEReference == null) {
			semanticObject_DiffEReference = new EObjectResolvingEList<DiffEReference>(DiffEReference.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE);
		}
		return semanticObject_DiffEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface> getSemanticObject_DiffInterface() {
		if (semanticObject_DiffInterface == null) {
			semanticObject_DiffInterface = new EObjectResolvingEList<DiffInterface>(DiffInterface.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE);
		}
		return semanticObject_DiffInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_eoperations> getSemanticObject_DiffInterface_eoperations() {
		if (semanticObject_DiffInterface_eoperations == null) {
			semanticObject_DiffInterface_eoperations = new EObjectResolvingEList<DiffInterface_eoperations>(DiffInterface_eoperations.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS);
		}
		return semanticObject_DiffInterface_eoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInterface_esupertypes> getSemanticObject_DiffInterface_esupertypes() {
		if (semanticObject_DiffInterface_esupertypes == null) {
			semanticObject_DiffInterface_esupertypes = new EObjectResolvingEList<DiffInterface_esupertypes>(DiffInterface_esupertypes.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES);
		}
		return semanticObject_DiffInterface_esupertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getSemanticObject_EAttribute() {
		if (semanticObject_EAttribute == null) {
			semanticObject_EAttribute = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE);
		}
		return semanticObject_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getSemanticObject_EClass() {
		if (semanticObject_EClass == null) {
			semanticObject_EClass = new EObjectResolvingEList<EClass>(EClass.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS);
		}
		return semanticObject_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getSemanticObject_EOperation() {
		if (semanticObject_EOperation == null) {
			semanticObject_EOperation = new EObjectResolvingEList<EOperation>(EOperation.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION);
		}
		return semanticObject_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getSemanticObject_EPackage() {
		if (semanticObject_EPackage == null) {
			semanticObject_EPackage = new EObjectResolvingEList<EPackage>(EPackage.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE);
		}
		return semanticObject_EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getSemanticObject_EReference() {
		if (semanticObject_EReference == null) {
			semanticObject_EReference = new EObjectResolvingEList<EReference>(EReference.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE);
		}
		return semanticObject_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getSemanticObject_Interface() {
		if (semanticObject_Interface == null) {
			semanticObject_Interface = new EObjectResolvingEList<Interface>(Interface.class, this, RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE);
		}
		return semanticObject_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return getName();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				return getSemanticObject_DiffEAttribute();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				return getSemanticObject_DiffEClass();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				return getSemanticObject_DiffEClass_eattributes();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				return getSemanticObject_DiffEClass_eoperations();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				return getSemanticObject_DiffEClass_ereferences();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				return getSemanticObject_DiffEClass_esupertypes();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				return getSemanticObject_DiffEClass_interfaces();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				return getSemanticObject_DiffEClass_nested_classes();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				return getSemanticObject_DiffEClass_nested_interfaces();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				return getSemanticObject_DiffEOperation();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				return getSemanticObject_DiffEPackage();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				return getSemanticObject_DiffEPackage_eclassifiers();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				return getSemanticObject_DiffEPackage_interfaces();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				return getSemanticObject_DiffEReference();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				return getSemanticObject_DiffInterface();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				return getSemanticObject_DiffInterface_eoperations();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				return getSemanticObject_DiffInterface_esupertypes();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				return getSemanticObject_EAttribute();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				return getSemanticObject_EClass();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				return getSemanticObject_EOperation();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				return getSemanticObject_EPackage();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				return getSemanticObject_EReference();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				return getSemanticObject_Interface();
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
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName((String)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				getSemanticObject_DiffEAttribute().clear();
				getSemanticObject_DiffEAttribute().addAll((Collection<? extends DiffEAttribute>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				getSemanticObject_DiffEClass().clear();
				getSemanticObject_DiffEClass().addAll((Collection<? extends DiffEClass>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				getSemanticObject_DiffEClass_eattributes().clear();
				getSemanticObject_DiffEClass_eattributes().addAll((Collection<? extends DiffEClass_eattributes>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				getSemanticObject_DiffEClass_eoperations().clear();
				getSemanticObject_DiffEClass_eoperations().addAll((Collection<? extends DiffEClass_eoperations>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				getSemanticObject_DiffEClass_ereferences().clear();
				getSemanticObject_DiffEClass_ereferences().addAll((Collection<? extends DiffEClass_ereferences>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				getSemanticObject_DiffEClass_esupertypes().clear();
				getSemanticObject_DiffEClass_esupertypes().addAll((Collection<? extends DiffEClass_esupertypes>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				getSemanticObject_DiffEClass_interfaces().clear();
				getSemanticObject_DiffEClass_interfaces().addAll((Collection<? extends DiffEClass_interfaces>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				getSemanticObject_DiffEClass_nested_classes().clear();
				getSemanticObject_DiffEClass_nested_classes().addAll((Collection<? extends DiffEClass_nested_classes>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				getSemanticObject_DiffEClass_nested_interfaces().clear();
				getSemanticObject_DiffEClass_nested_interfaces().addAll((Collection<? extends DiffEClass_nested_interfaces>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				getSemanticObject_DiffEOperation().clear();
				getSemanticObject_DiffEOperation().addAll((Collection<? extends DiffEOperation>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				getSemanticObject_DiffEPackage().clear();
				getSemanticObject_DiffEPackage().addAll((Collection<? extends DiffEPackage>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				getSemanticObject_DiffEPackage_eclassifiers().clear();
				getSemanticObject_DiffEPackage_eclassifiers().addAll((Collection<? extends DiffEPackage_eclassifiers>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				getSemanticObject_DiffEPackage_interfaces().clear();
				getSemanticObject_DiffEPackage_interfaces().addAll((Collection<? extends DiffEPackage_interfaces>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				getSemanticObject_DiffEReference().clear();
				getSemanticObject_DiffEReference().addAll((Collection<? extends DiffEReference>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				getSemanticObject_DiffInterface().clear();
				getSemanticObject_DiffInterface().addAll((Collection<? extends DiffInterface>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				getSemanticObject_DiffInterface_eoperations().clear();
				getSemanticObject_DiffInterface_eoperations().addAll((Collection<? extends DiffInterface_eoperations>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				getSemanticObject_DiffInterface_esupertypes().clear();
				getSemanticObject_DiffInterface_esupertypes().addAll((Collection<? extends DiffInterface_esupertypes>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				getSemanticObject_EAttribute().clear();
				getSemanticObject_EAttribute().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				getSemanticObject_EClass().clear();
				getSemanticObject_EClass().addAll((Collection<? extends EClass>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				getSemanticObject_EOperation().clear();
				getSemanticObject_EOperation().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				getSemanticObject_EPackage().clear();
				getSemanticObject_EPackage().addAll((Collection<? extends EPackage>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				getSemanticObject_EReference().clear();
				getSemanticObject_EReference().addAll((Collection<? extends EReference>)newValue);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				getSemanticObject_Interface().clear();
				getSemanticObject_Interface().addAll((Collection<? extends Interface>)newValue);
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
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				getSemanticObject_DiffEAttribute().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				getSemanticObject_DiffEClass().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				getSemanticObject_DiffEClass_eattributes().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				getSemanticObject_DiffEClass_eoperations().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				getSemanticObject_DiffEClass_ereferences().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				getSemanticObject_DiffEClass_esupertypes().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				getSemanticObject_DiffEClass_interfaces().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				getSemanticObject_DiffEClass_nested_classes().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				getSemanticObject_DiffEClass_nested_interfaces().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				getSemanticObject_DiffEOperation().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				getSemanticObject_DiffEPackage().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				getSemanticObject_DiffEPackage_eclassifiers().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				getSemanticObject_DiffEPackage_interfaces().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				getSemanticObject_DiffEReference().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				getSemanticObject_DiffInterface().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				getSemanticObject_DiffInterface_eoperations().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				getSemanticObject_DiffInterface_esupertypes().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				getSemanticObject_EAttribute().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				getSemanticObject_EClass().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				getSemanticObject_EOperation().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				getSemanticObject_EPackage().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				getSemanticObject_EReference().clear();
				return;
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				getSemanticObject_Interface().clear();
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
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EATTRIBUTE:
				return semanticObject_DiffEAttribute != null && !semanticObject_DiffEAttribute.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS:
				return semanticObject_DiffEClass != null && !semanticObject_DiffEClass.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EATTRIBUTES:
				return semanticObject_DiffEClass_eattributes != null && !semanticObject_DiffEClass_eattributes.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EOPERATIONS:
				return semanticObject_DiffEClass_eoperations != null && !semanticObject_DiffEClass_eoperations.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_EREFERENCES:
				return semanticObject_DiffEClass_ereferences != null && !semanticObject_DiffEClass_ereferences.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_ESUPERTYPES:
				return semanticObject_DiffEClass_esupertypes != null && !semanticObject_DiffEClass_esupertypes.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_INTERFACES:
				return semanticObject_DiffEClass_interfaces != null && !semanticObject_DiffEClass_interfaces.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_CLASSES:
				return semanticObject_DiffEClass_nested_classes != null && !semanticObject_DiffEClass_nested_classes.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_ECLASS_NESTED_INTERFACES:
				return semanticObject_DiffEClass_nested_interfaces != null && !semanticObject_DiffEClass_nested_interfaces.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EOPERATION:
				return semanticObject_DiffEOperation != null && !semanticObject_DiffEOperation.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE:
				return semanticObject_DiffEPackage != null && !semanticObject_DiffEPackage.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_ECLASSIFIERS:
				return semanticObject_DiffEPackage_eclassifiers != null && !semanticObject_DiffEPackage_eclassifiers.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EPACKAGE_INTERFACES:
				return semanticObject_DiffEPackage_interfaces != null && !semanticObject_DiffEPackage_interfaces.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_EREFERENCE:
				return semanticObject_DiffEReference != null && !semanticObject_DiffEReference.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE:
				return semanticObject_DiffInterface != null && !semanticObject_DiffInterface.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_EOPERATIONS:
				return semanticObject_DiffInterface_eoperations != null && !semanticObject_DiffInterface_eoperations.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_DIFF_INTERFACE_ESUPERTYPES:
				return semanticObject_DiffInterface_esupertypes != null && !semanticObject_DiffInterface_esupertypes.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EATTRIBUTE:
				return semanticObject_EAttribute != null && !semanticObject_EAttribute.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_ECLASS:
				return semanticObject_EClass != null && !semanticObject_EClass.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EOPERATION:
				return semanticObject_EOperation != null && !semanticObject_EOperation.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EPACKAGE:
				return semanticObject_EPackage != null && !semanticObject_EPackage.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_EREFERENCE:
				return semanticObject_EReference != null && !semanticObject_EReference.isEmpty();
			case RefactoringDiffMMPackage.SEMANTIC_OBJECT__SEMANTIC_OBJECT_INTERFACE:
				return semanticObject_Interface != null && !semanticObject_Interface.isEmpty();
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

} //SemanticObjectImpl
