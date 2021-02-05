/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEClass_eAllAttributes;
import ecoreDiffMM.DiffEClass_eAllContainments;
import ecoreDiffMM.DiffEClass_eAllGenericSuperTypes;
import ecoreDiffMM.DiffEClass_eAllOperations;
import ecoreDiffMM.DiffEClass_eAllReferences;
import ecoreDiffMM.DiffEClass_eAllStructuralFeatures;
import ecoreDiffMM.DiffEClass_eAllSuperTypes;
import ecoreDiffMM.DiffEClass_eAttributes;
import ecoreDiffMM.DiffEClass_eGenericSuperTypes;
import ecoreDiffMM.DiffEClass_eIDAttribute;
import ecoreDiffMM.DiffEClass_eOperations;
import ecoreDiffMM.DiffEClass_eReferences;
import ecoreDiffMM.DiffEClass_eStructuralFeatures;
import ecoreDiffMM.DiffEClass_eSuperTypes;
import ecoreDiffMM.EAttribute;
import ecoreDiffMM.EClass;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.EOperation;
import ecoreDiffMM.EReference;
import ecoreDiffMM.EStructuralFeature;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeSuperTypes <em>Diffe Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeOperations <em>Diffe Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllAttributes <em>Diffe All Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllReferences <em>Diffe All References</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeReferences <em>Diffe References</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAttributes <em>Diffe Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllContainments <em>Diffe All Containments</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllOperations <em>Diffe All Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllStructuralFeatures <em>Diffe All Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllSuperTypes <em>Diffe All Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeIDAttribute <em>Diffe ID Attribute</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeStructuralFeatures <em>Diffe Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeGenericSuperTypes <em>Diffe Generic Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EClassImpl#getDiffeAllGenericSuperTypes <em>Diffe All Generic Super Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eSuperTypes;

	/**
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eOperations;

	/**
	 * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> eStructuralFeatures;

	/**
	 * The cached value of the '{@link #getEGenericSuperTypes() <em>EGeneric Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericSuperTypes;

	/**
	 * The cached value of the '{@link #getDiffeSuperTypes() <em>Diffe Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eSuperTypes> diffeSuperTypes;

	/**
	 * The cached value of the '{@link #getDiffeOperations() <em>Diffe Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eOperations> diffeOperations;

	/**
	 * The cached value of the '{@link #getDiffeAllAttributes() <em>Diffe All Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllAttributes> diffeAllAttributes;

	/**
	 * The cached value of the '{@link #getDiffeAllReferences() <em>Diffe All References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllReferences> diffeAllReferences;

	/**
	 * The cached value of the '{@link #getDiffeReferences() <em>Diffe References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eReferences> diffeReferences;

	/**
	 * The cached value of the '{@link #getDiffeAttributes() <em>Diffe Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAttributes> diffeAttributes;

	/**
	 * The cached value of the '{@link #getDiffeAllContainments() <em>Diffe All Containments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllContainments> diffeAllContainments;

	/**
	 * The cached value of the '{@link #getDiffeAllOperations() <em>Diffe All Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllOperations> diffeAllOperations;

	/**
	 * The cached value of the '{@link #getDiffeAllStructuralFeatures() <em>Diffe All Structural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllStructuralFeatures> diffeAllStructuralFeatures;

	/**
	 * The cached value of the '{@link #getDiffeAllSuperTypes() <em>Diffe All Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllSuperTypes> diffeAllSuperTypes;

	/**
	 * The cached value of the '{@link #getDiffeIDAttribute() <em>Diffe ID Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeIDAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eIDAttribute> diffeIDAttribute;

	/**
	 * The cached value of the '{@link #getDiffeStructuralFeatures() <em>Diffe Structural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eStructuralFeatures> diffeStructuralFeatures;

	/**
	 * The cached value of the '{@link #getDiffeGenericSuperTypes() <em>Diffe Generic Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eGenericSuperTypes> diffeGenericSuperTypes;

	/**
	 * The cached value of the '{@link #getDiffeAllGenericSuperTypes() <em>Diffe All Generic Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeAllGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEClass_eAllGenericSuperTypes> diffeAllGenericSuperTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ECLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ECLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getESuperTypes() {
		if (eSuperTypes == null) {
			eSuperTypes = new EObjectResolvingEList.Unsettable<EClass>(EClass.class, this, EcoreDiffMMPackage.ECLASS__ESUPER_TYPES);
		}
		return eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetESuperTypes() {
		if (eSuperTypes != null) ((InternalEList.Unsettable<?>)eSuperTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetESuperTypes() {
		return eSuperTypes != null && ((InternalEList.Unsettable<?>)eSuperTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentWithInverseEList<EOperation>(EOperation.class, this, EcoreDiffMMPackage.ECLASS__EOPERATIONS, EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getEAllAttributes() {
		// TODO: implement this method to return the 'EAll Attributes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getEAllReferences() {
		// TODO: implement this method to return the 'EAll References' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getEReferences() {
		// TODO: implement this method to return the 'EReferences' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getEAttributes() {
		// TODO: implement this method to return the 'EAttributes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getEAllContainments() {
		// TODO: implement this method to return the 'EAll Containments' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getEAllOperations() {
		// TODO: implement this method to return the 'EAll Operations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EStructuralFeature> getEAllStructuralFeatures() {
		// TODO: implement this method to return the 'EAll Structural Features' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getEAllSuperTypes() {
		// TODO: implement this method to return the 'EAll Super Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEIDAttribute() {
		// TODO: implement this method to return the 'EID Attribute' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EStructuralFeature> getEStructuralFeatures() {
		if (eStructuralFeatures == null) {
			eStructuralFeatures = new EObjectContainmentWithInverseEList<EStructuralFeature>(EStructuralFeature.class, this, EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES, EcoreDiffMMPackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		}
		return eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getEGenericSuperTypes() {
		if (eGenericSuperTypes == null) {
			eGenericSuperTypes = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this, EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES);
		}
		return eGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericSuperTypes() {
		if (eGenericSuperTypes != null) ((InternalEList.Unsettable<?>)eGenericSuperTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericSuperTypes() {
		return eGenericSuperTypes != null && ((InternalEList.Unsettable<?>)eGenericSuperTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getEAllGenericSuperTypes() {
		// TODO: implement this method to return the 'EAll Generic Super Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eSuperTypes> getDiffeSuperTypes() {
		if (diffeSuperTypes == null) {
			diffeSuperTypes = new EObjectContainmentEList<DiffEClass_eSuperTypes>(DiffEClass_eSuperTypes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES);
		}
		return diffeSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eOperations> getDiffeOperations() {
		if (diffeOperations == null) {
			diffeOperations = new EObjectContainmentEList<DiffEClass_eOperations>(DiffEClass_eOperations.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS);
		}
		return diffeOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllAttributes> getDiffeAllAttributes() {
		if (diffeAllAttributes == null) {
			diffeAllAttributes = new EObjectContainmentEList<DiffEClass_eAllAttributes>(DiffEClass_eAllAttributes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES);
		}
		return diffeAllAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllReferences> getDiffeAllReferences() {
		if (diffeAllReferences == null) {
			diffeAllReferences = new EObjectContainmentEList<DiffEClass_eAllReferences>(DiffEClass_eAllReferences.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES);
		}
		return diffeAllReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eReferences> getDiffeReferences() {
		if (diffeReferences == null) {
			diffeReferences = new EObjectContainmentEList<DiffEClass_eReferences>(DiffEClass_eReferences.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES);
		}
		return diffeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAttributes> getDiffeAttributes() {
		if (diffeAttributes == null) {
			diffeAttributes = new EObjectContainmentEList<DiffEClass_eAttributes>(DiffEClass_eAttributes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES);
		}
		return diffeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllContainments> getDiffeAllContainments() {
		if (diffeAllContainments == null) {
			diffeAllContainments = new EObjectContainmentEList<DiffEClass_eAllContainments>(DiffEClass_eAllContainments.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS);
		}
		return diffeAllContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllOperations> getDiffeAllOperations() {
		if (diffeAllOperations == null) {
			diffeAllOperations = new EObjectContainmentEList<DiffEClass_eAllOperations>(DiffEClass_eAllOperations.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS);
		}
		return diffeAllOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllStructuralFeatures> getDiffeAllStructuralFeatures() {
		if (diffeAllStructuralFeatures == null) {
			diffeAllStructuralFeatures = new EObjectContainmentEList<DiffEClass_eAllStructuralFeatures>(DiffEClass_eAllStructuralFeatures.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES);
		}
		return diffeAllStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllSuperTypes> getDiffeAllSuperTypes() {
		if (diffeAllSuperTypes == null) {
			diffeAllSuperTypes = new EObjectContainmentEList<DiffEClass_eAllSuperTypes>(DiffEClass_eAllSuperTypes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES);
		}
		return diffeAllSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eIDAttribute> getDiffeIDAttribute() {
		if (diffeIDAttribute == null) {
			diffeIDAttribute = new EObjectContainmentEList<DiffEClass_eIDAttribute>(DiffEClass_eIDAttribute.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE);
		}
		return diffeIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eStructuralFeatures> getDiffeStructuralFeatures() {
		if (diffeStructuralFeatures == null) {
			diffeStructuralFeatures = new EObjectContainmentEList<DiffEClass_eStructuralFeatures>(DiffEClass_eStructuralFeatures.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES);
		}
		return diffeStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eGenericSuperTypes> getDiffeGenericSuperTypes() {
		if (diffeGenericSuperTypes == null) {
			diffeGenericSuperTypes = new EObjectContainmentEList<DiffEClass_eGenericSuperTypes>(DiffEClass_eGenericSuperTypes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES);
		}
		return diffeGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEClass_eAllGenericSuperTypes> getDiffeAllGenericSuperTypes() {
		if (diffeAllGenericSuperTypes == null) {
			diffeAllGenericSuperTypes = new EObjectContainmentEList<DiffEClass_eAllGenericSuperTypes>(DiffEClass_eAllGenericSuperTypes.class, this, EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES);
		}
		return diffeAllGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuperTypeOf(EClass someClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFeatureCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getEStructuralFeature(int featureID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFeatureID(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getEStructuralFeature(String featureName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOperationCount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEOperation(int operationID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOperationID(EOperation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOverride(EOperation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getFeatureType(EStructuralFeature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEOperations()).basicAdd(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEStructuralFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return ((InternalEList<?>)getEStructuralFeatures()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return ((InternalEList<?>)getEGenericSuperTypes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES:
				return ((InternalEList<?>)getDiffeSuperTypes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS:
				return ((InternalEList<?>)getDiffeOperations()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES:
				return ((InternalEList<?>)getDiffeAllAttributes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES:
				return ((InternalEList<?>)getDiffeAllReferences()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES:
				return ((InternalEList<?>)getDiffeReferences()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES:
				return ((InternalEList<?>)getDiffeAttributes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS:
				return ((InternalEList<?>)getDiffeAllContainments()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS:
				return ((InternalEList<?>)getDiffeAllOperations()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES:
				return ((InternalEList<?>)getDiffeAllStructuralFeatures()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES:
				return ((InternalEList<?>)getDiffeAllSuperTypes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE:
				return ((InternalEList<?>)getDiffeIDAttribute()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES:
				return ((InternalEList<?>)getDiffeStructuralFeatures()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES:
				return ((InternalEList<?>)getDiffeGenericSuperTypes()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES:
				return ((InternalEList<?>)getDiffeAllGenericSuperTypes()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.ECLASS__ABSTRACT:
				return isAbstract();
			case EcoreDiffMMPackage.ECLASS__INTERFACE:
				return isInterface();
			case EcoreDiffMMPackage.ECLASS__ESUPER_TYPES:
				return getESuperTypes();
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				return getEOperations();
			case EcoreDiffMMPackage.ECLASS__EALL_ATTRIBUTES:
				return getEAllAttributes();
			case EcoreDiffMMPackage.ECLASS__EALL_REFERENCES:
				return getEAllReferences();
			case EcoreDiffMMPackage.ECLASS__EREFERENCES:
				return getEReferences();
			case EcoreDiffMMPackage.ECLASS__EATTRIBUTES:
				return getEAttributes();
			case EcoreDiffMMPackage.ECLASS__EALL_CONTAINMENTS:
				return getEAllContainments();
			case EcoreDiffMMPackage.ECLASS__EALL_OPERATIONS:
				return getEAllOperations();
			case EcoreDiffMMPackage.ECLASS__EALL_STRUCTURAL_FEATURES:
				return getEAllStructuralFeatures();
			case EcoreDiffMMPackage.ECLASS__EALL_SUPER_TYPES:
				return getEAllSuperTypes();
			case EcoreDiffMMPackage.ECLASS__EID_ATTRIBUTE:
				return getEIDAttribute();
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return getEStructuralFeatures();
			case EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return getEGenericSuperTypes();
			case EcoreDiffMMPackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
				return getEAllGenericSuperTypes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES:
				return getDiffeSuperTypes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS:
				return getDiffeOperations();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES:
				return getDiffeAllAttributes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES:
				return getDiffeAllReferences();
			case EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES:
				return getDiffeReferences();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES:
				return getDiffeAttributes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS:
				return getDiffeAllContainments();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS:
				return getDiffeAllOperations();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES:
				return getDiffeAllStructuralFeatures();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES:
				return getDiffeAllSuperTypes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE:
				return getDiffeIDAttribute();
			case EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES:
				return getDiffeStructuralFeatures();
			case EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES:
				return getDiffeGenericSuperTypes();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES:
				return getDiffeAllGenericSuperTypes();
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
			case EcoreDiffMMPackage.ECLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				getEStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES:
				getEGenericSuperTypes().clear();
				getEGenericSuperTypes().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES:
				getDiffeSuperTypes().clear();
				getDiffeSuperTypes().addAll((Collection<? extends DiffEClass_eSuperTypes>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS:
				getDiffeOperations().clear();
				getDiffeOperations().addAll((Collection<? extends DiffEClass_eOperations>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES:
				getDiffeAllAttributes().clear();
				getDiffeAllAttributes().addAll((Collection<? extends DiffEClass_eAllAttributes>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES:
				getDiffeAllReferences().clear();
				getDiffeAllReferences().addAll((Collection<? extends DiffEClass_eAllReferences>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES:
				getDiffeReferences().clear();
				getDiffeReferences().addAll((Collection<? extends DiffEClass_eReferences>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES:
				getDiffeAttributes().clear();
				getDiffeAttributes().addAll((Collection<? extends DiffEClass_eAttributes>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS:
				getDiffeAllContainments().clear();
				getDiffeAllContainments().addAll((Collection<? extends DiffEClass_eAllContainments>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS:
				getDiffeAllOperations().clear();
				getDiffeAllOperations().addAll((Collection<? extends DiffEClass_eAllOperations>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES:
				getDiffeAllStructuralFeatures().clear();
				getDiffeAllStructuralFeatures().addAll((Collection<? extends DiffEClass_eAllStructuralFeatures>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES:
				getDiffeAllSuperTypes().clear();
				getDiffeAllSuperTypes().addAll((Collection<? extends DiffEClass_eAllSuperTypes>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE:
				getDiffeIDAttribute().clear();
				getDiffeIDAttribute().addAll((Collection<? extends DiffEClass_eIDAttribute>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES:
				getDiffeStructuralFeatures().clear();
				getDiffeStructuralFeatures().addAll((Collection<? extends DiffEClass_eStructuralFeatures>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES:
				getDiffeGenericSuperTypes().clear();
				getDiffeGenericSuperTypes().addAll((Collection<? extends DiffEClass_eGenericSuperTypes>)newValue);
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES:
				getDiffeAllGenericSuperTypes().clear();
				getDiffeAllGenericSuperTypes().addAll((Collection<? extends DiffEClass_eAllGenericSuperTypes>)newValue);
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
			case EcoreDiffMMPackage.ECLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ECLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ECLASS__ESUPER_TYPES:
				unsetESuperTypes();
				return;
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES:
				unsetEGenericSuperTypes();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES:
				getDiffeSuperTypes().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS:
				getDiffeOperations().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES:
				getDiffeAllAttributes().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES:
				getDiffeAllReferences().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES:
				getDiffeReferences().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES:
				getDiffeAttributes().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS:
				getDiffeAllContainments().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS:
				getDiffeAllOperations().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES:
				getDiffeAllStructuralFeatures().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES:
				getDiffeAllSuperTypes().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE:
				getDiffeIDAttribute().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES:
				getDiffeStructuralFeatures().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES:
				getDiffeGenericSuperTypes().clear();
				return;
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES:
				getDiffeAllGenericSuperTypes().clear();
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
			case EcoreDiffMMPackage.ECLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case EcoreDiffMMPackage.ECLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case EcoreDiffMMPackage.ECLASS__ESUPER_TYPES:
				return isSetESuperTypes();
			case EcoreDiffMMPackage.ECLASS__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_ATTRIBUTES:
				return !getEAllAttributes().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_REFERENCES:
				return !getEAllReferences().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EREFERENCES:
				return !getEReferences().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EATTRIBUTES:
				return !getEAttributes().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_CONTAINMENTS:
				return !getEAllContainments().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_OPERATIONS:
				return !getEAllOperations().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_STRUCTURAL_FEATURES:
				return !getEAllStructuralFeatures().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EALL_SUPER_TYPES:
				return !getEAllSuperTypes().isEmpty();
			case EcoreDiffMMPackage.ECLASS__EID_ATTRIBUTE:
				return getEIDAttribute() != null;
			case EcoreDiffMMPackage.ECLASS__ESTRUCTURAL_FEATURES:
				return eStructuralFeatures != null && !eStructuralFeatures.isEmpty();
			case EcoreDiffMMPackage.ECLASS__EGENERIC_SUPER_TYPES:
				return isSetEGenericSuperTypes();
			case EcoreDiffMMPackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
				return !getEAllGenericSuperTypes().isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_SUPER_TYPES:
				return diffeSuperTypes != null && !diffeSuperTypes.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_OPERATIONS:
				return diffeOperations != null && !diffeOperations.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_ATTRIBUTES:
				return diffeAllAttributes != null && !diffeAllAttributes.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_REFERENCES:
				return diffeAllReferences != null && !diffeAllReferences.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_REFERENCES:
				return diffeReferences != null && !diffeReferences.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ATTRIBUTES:
				return diffeAttributes != null && !diffeAttributes.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_CONTAINMENTS:
				return diffeAllContainments != null && !diffeAllContainments.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_OPERATIONS:
				return diffeAllOperations != null && !diffeAllOperations.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_STRUCTURAL_FEATURES:
				return diffeAllStructuralFeatures != null && !diffeAllStructuralFeatures.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_SUPER_TYPES:
				return diffeAllSuperTypes != null && !diffeAllSuperTypes.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ID_ATTRIBUTE:
				return diffeIDAttribute != null && !diffeIDAttribute.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_STRUCTURAL_FEATURES:
				return diffeStructuralFeatures != null && !diffeStructuralFeatures.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_GENERIC_SUPER_TYPES:
				return diffeGenericSuperTypes != null && !diffeGenericSuperTypes.isEmpty();
			case EcoreDiffMMPackage.ECLASS__DIFFE_ALL_GENERIC_SUPER_TYPES:
				return diffeAllGenericSuperTypes != null && !diffeAllGenericSuperTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcoreDiffMMPackage.ECLASS___IS_SUPER_TYPE_OF__ECLASS:
				return isSuperTypeOf((EClass)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_FEATURE_COUNT:
				return getFeatureCount();
			case EcoreDiffMMPackage.ECLASS___GET_ESTRUCTURAL_FEATURE__INT:
				return getEStructuralFeature((Integer)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE:
				return getFeatureID((EStructuralFeature)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_ESTRUCTURAL_FEATURE__STRING:
				return getEStructuralFeature((String)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_OPERATION_COUNT:
				return getOperationCount();
			case EcoreDiffMMPackage.ECLASS___GET_EOPERATION__INT:
				return getEOperation((Integer)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_OPERATION_ID__EOPERATION:
				return getOperationID((EOperation)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_OVERRIDE__EOPERATION:
				return getOverride((EOperation)arguments.get(0));
			case EcoreDiffMMPackage.ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE:
				return getFeatureType((EStructuralFeature)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //EClassImpl
