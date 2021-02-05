/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DomainSpecificDiff;
import ecoreDiffMM.EAnnotation;
import ecoreDiffMM.EAttribute;
import ecoreDiffMM.EClass;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EDataType;
import ecoreDiffMM.EEnum;
import ecoreDiffMM.EEnumLiteral;
import ecoreDiffMM.EFactory;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.EModelElement;
import ecoreDiffMM.ENamedElement;
import ecoreDiffMM.EObject;
import ecoreDiffMM.EOperation;
import ecoreDiffMM.EParameter;
import ecoreDiffMM.EReference;
import ecoreDiffMM.EStructuralFeature;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.ETypedElement;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EAnnotation <em>Domain Specific Diff EAnnotation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EClassifier <em>Domain Specific Diff EClassifier</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EDataType <em>Domain Specific Diff EData Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EEnum <em>Domain Specific Diff EEnum</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EEnumLiteral <em>Domain Specific Diff EEnum Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EFactory <em>Domain Specific Diff EFactory</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EModelElement <em>Domain Specific Diff EModel Element</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ENamedElement <em>Domain Specific Diff ENamed Element</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EObject <em>Domain Specific Diff EObject</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EParameter <em>Domain Specific Diff EParameter</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EStructuralFeature <em>Domain Specific Diff EStructural Feature</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ETypedElement <em>Domain Specific Diff ETyped Element</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_EGenericType <em>Domain Specific Diff EGeneric Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DomainSpecificDiffImpl#getDomainSpecificDiff_ETypeParameter <em>Domain Specific Diff EType Parameter</em>}</li>
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
	 * The cached value of the '{@link #getDomainSpecificDiff_EAttribute() <em>Domain Specific Diff EAttribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> domainSpecificDiff_EAttribute;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EAnnotation() <em>Domain Specific Diff EAnnotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> domainSpecificDiff_EAnnotation;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EClass() <em>Domain Specific Diff EClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EClass()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> domainSpecificDiff_EClass;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EClassifier() <em>Domain Specific Diff EClassifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> domainSpecificDiff_EClassifier;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EDataType() <em>Domain Specific Diff EData Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> domainSpecificDiff_EDataType;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EEnum() <em>Domain Specific Diff EEnum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnum> domainSpecificDiff_EEnum;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EEnumLiteral() <em>Domain Specific Diff EEnum Literal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnumLiteral> domainSpecificDiff_EEnumLiteral;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EFactory() <em>Domain Specific Diff EFactory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EFactory()
	 * @generated
	 * @ordered
	 */
	protected EList<EFactory> domainSpecificDiff_EFactory;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EModelElement() <em>Domain Specific Diff EModel Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EModelElement> domainSpecificDiff_EModelElement;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ENamedElement() <em>Domain Specific Diff ENamed Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ENamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ENamedElement> domainSpecificDiff_ENamedElement;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EObject() <em>Domain Specific Diff EObject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EObject()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> domainSpecificDiff_EObject;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EOperation() <em>Domain Specific Diff EOperation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> domainSpecificDiff_EOperation;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EParameter() <em>Domain Specific Diff EParameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> domainSpecificDiff_EParameter;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EReference() <em>Domain Specific Diff EReference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> domainSpecificDiff_EReference;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EStructuralFeature() <em>Domain Specific Diff EStructural Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> domainSpecificDiff_EStructuralFeature;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ETypedElement() <em>Domain Specific Diff ETyped Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ETypedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypedElement> domainSpecificDiff_ETypedElement;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_EGenericType() <em>Domain Specific Diff EGeneric Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_EGenericType()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> domainSpecificDiff_EGenericType;

	/**
	 * The cached value of the '{@link #getDomainSpecificDiff_ETypeParameter() <em>Domain Specific Diff EType Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecificDiff_ETypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeParameter> domainSpecificDiff_ETypeParameter;

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
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDomainSpecificDiff();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getDomainSpecificDiff_EAttribute() {
		if (domainSpecificDiff_EAttribute == null) {
			domainSpecificDiff_EAttribute = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE);
		}
		return domainSpecificDiff_EAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAnnotation> getDomainSpecificDiff_EAnnotation() {
		if (domainSpecificDiff_EAnnotation == null) {
			domainSpecificDiff_EAnnotation = new EObjectResolvingEList<EAnnotation>(EAnnotation.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION);
		}
		return domainSpecificDiff_EAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getDomainSpecificDiff_EClass() {
		if (domainSpecificDiff_EClass == null) {
			domainSpecificDiff_EClass = new EObjectResolvingEList<EClass>(EClass.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS);
		}
		return domainSpecificDiff_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClassifier> getDomainSpecificDiff_EClassifier() {
		if (domainSpecificDiff_EClassifier == null) {
			domainSpecificDiff_EClassifier = new EObjectResolvingEList<EClassifier>(EClassifier.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER);
		}
		return domainSpecificDiff_EClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EDataType> getDomainSpecificDiff_EDataType() {
		if (domainSpecificDiff_EDataType == null) {
			domainSpecificDiff_EDataType = new EObjectResolvingEList<EDataType>(EDataType.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE);
		}
		return domainSpecificDiff_EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEnum> getDomainSpecificDiff_EEnum() {
		if (domainSpecificDiff_EEnum == null) {
			domainSpecificDiff_EEnum = new EObjectResolvingEList<EEnum>(EEnum.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM);
		}
		return domainSpecificDiff_EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEnumLiteral> getDomainSpecificDiff_EEnumLiteral() {
		if (domainSpecificDiff_EEnumLiteral == null) {
			domainSpecificDiff_EEnumLiteral = new EObjectResolvingEList<EEnumLiteral>(EEnumLiteral.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL);
		}
		return domainSpecificDiff_EEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EFactory> getDomainSpecificDiff_EFactory() {
		if (domainSpecificDiff_EFactory == null) {
			domainSpecificDiff_EFactory = new EObjectResolvingEList<EFactory>(EFactory.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY);
		}
		return domainSpecificDiff_EFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EModelElement> getDomainSpecificDiff_EModelElement() {
		if (domainSpecificDiff_EModelElement == null) {
			domainSpecificDiff_EModelElement = new EObjectResolvingEList<EModelElement>(EModelElement.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT);
		}
		return domainSpecificDiff_EModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ENamedElement> getDomainSpecificDiff_ENamedElement() {
		if (domainSpecificDiff_ENamedElement == null) {
			domainSpecificDiff_ENamedElement = new EObjectResolvingEList<ENamedElement>(ENamedElement.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT);
		}
		return domainSpecificDiff_ENamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDomainSpecificDiff_EObject() {
		if (domainSpecificDiff_EObject == null) {
			domainSpecificDiff_EObject = new EObjectResolvingEList<EObject>(EObject.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT);
		}
		return domainSpecificDiff_EObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getDomainSpecificDiff_EOperation() {
		if (domainSpecificDiff_EOperation == null) {
			domainSpecificDiff_EOperation = new EObjectResolvingEList<EOperation>(EOperation.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION);
		}
		return domainSpecificDiff_EOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getDomainSpecificDiff_EParameter() {
		if (domainSpecificDiff_EParameter == null) {
			domainSpecificDiff_EParameter = new EObjectResolvingEList<EParameter>(EParameter.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER);
		}
		return domainSpecificDiff_EParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getDomainSpecificDiff_EReference() {
		if (domainSpecificDiff_EReference == null) {
			domainSpecificDiff_EReference = new EObjectResolvingEList<EReference>(EReference.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE);
		}
		return domainSpecificDiff_EReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EStructuralFeature> getDomainSpecificDiff_EStructuralFeature() {
		if (domainSpecificDiff_EStructuralFeature == null) {
			domainSpecificDiff_EStructuralFeature = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE);
		}
		return domainSpecificDiff_EStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETypedElement> getDomainSpecificDiff_ETypedElement() {
		if (domainSpecificDiff_ETypedElement == null) {
			domainSpecificDiff_ETypedElement = new EObjectResolvingEList<ETypedElement>(ETypedElement.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT);
		}
		return domainSpecificDiff_ETypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getDomainSpecificDiff_EGenericType() {
		if (domainSpecificDiff_EGenericType == null) {
			domainSpecificDiff_EGenericType = new EObjectResolvingEList<EGenericType>(EGenericType.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE);
		}
		return domainSpecificDiff_EGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETypeParameter> getDomainSpecificDiff_ETypeParameter() {
		if (domainSpecificDiff_ETypeParameter == null) {
			domainSpecificDiff_ETypeParameter = new EObjectResolvingEList<ETypeParameter>(ETypeParameter.class, this, EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER);
		}
		return domainSpecificDiff_ETypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return getName();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				return getDomainSpecificDiff_EAttribute();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION:
				return getDomainSpecificDiff_EAnnotation();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				return getDomainSpecificDiff_EClass();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER:
				return getDomainSpecificDiff_EClassifier();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE:
				return getDomainSpecificDiff_EDataType();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM:
				return getDomainSpecificDiff_EEnum();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL:
				return getDomainSpecificDiff_EEnumLiteral();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY:
				return getDomainSpecificDiff_EFactory();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT:
				return getDomainSpecificDiff_EModelElement();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT:
				return getDomainSpecificDiff_ENamedElement();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT:
				return getDomainSpecificDiff_EObject();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				return getDomainSpecificDiff_EOperation();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER:
				return getDomainSpecificDiff_EParameter();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				return getDomainSpecificDiff_EReference();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE:
				return getDomainSpecificDiff_EStructuralFeature();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT:
				return getDomainSpecificDiff_ETypedElement();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE:
				return getDomainSpecificDiff_EGenericType();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER:
				return getDomainSpecificDiff_ETypeParameter();
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
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName((String)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				getDomainSpecificDiff_EAttribute().clear();
				getDomainSpecificDiff_EAttribute().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION:
				getDomainSpecificDiff_EAnnotation().clear();
				getDomainSpecificDiff_EAnnotation().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				getDomainSpecificDiff_EClass().clear();
				getDomainSpecificDiff_EClass().addAll((Collection<? extends EClass>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER:
				getDomainSpecificDiff_EClassifier().clear();
				getDomainSpecificDiff_EClassifier().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE:
				getDomainSpecificDiff_EDataType().clear();
				getDomainSpecificDiff_EDataType().addAll((Collection<? extends EDataType>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM:
				getDomainSpecificDiff_EEnum().clear();
				getDomainSpecificDiff_EEnum().addAll((Collection<? extends EEnum>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL:
				getDomainSpecificDiff_EEnumLiteral().clear();
				getDomainSpecificDiff_EEnumLiteral().addAll((Collection<? extends EEnumLiteral>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY:
				getDomainSpecificDiff_EFactory().clear();
				getDomainSpecificDiff_EFactory().addAll((Collection<? extends EFactory>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT:
				getDomainSpecificDiff_EModelElement().clear();
				getDomainSpecificDiff_EModelElement().addAll((Collection<? extends EModelElement>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT:
				getDomainSpecificDiff_ENamedElement().clear();
				getDomainSpecificDiff_ENamedElement().addAll((Collection<? extends ENamedElement>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT:
				getDomainSpecificDiff_EObject().clear();
				getDomainSpecificDiff_EObject().addAll((Collection<? extends EObject>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				getDomainSpecificDiff_EOperation().clear();
				getDomainSpecificDiff_EOperation().addAll((Collection<? extends EOperation>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER:
				getDomainSpecificDiff_EParameter().clear();
				getDomainSpecificDiff_EParameter().addAll((Collection<? extends EParameter>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				getDomainSpecificDiff_EReference().clear();
				getDomainSpecificDiff_EReference().addAll((Collection<? extends EReference>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE:
				getDomainSpecificDiff_EStructuralFeature().clear();
				getDomainSpecificDiff_EStructuralFeature().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT:
				getDomainSpecificDiff_ETypedElement().clear();
				getDomainSpecificDiff_ETypedElement().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE:
				getDomainSpecificDiff_EGenericType().clear();
				getDomainSpecificDiff_EGenericType().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER:
				getDomainSpecificDiff_ETypeParameter().clear();
				getDomainSpecificDiff_ETypeParameter().addAll((Collection<? extends ETypeParameter>)newValue);
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
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				getDomainSpecificDiff_EAttribute().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION:
				getDomainSpecificDiff_EAnnotation().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				getDomainSpecificDiff_EClass().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER:
				getDomainSpecificDiff_EClassifier().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE:
				getDomainSpecificDiff_EDataType().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM:
				getDomainSpecificDiff_EEnum().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL:
				getDomainSpecificDiff_EEnumLiteral().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY:
				getDomainSpecificDiff_EFactory().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT:
				getDomainSpecificDiff_EModelElement().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT:
				getDomainSpecificDiff_ENamedElement().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT:
				getDomainSpecificDiff_EObject().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				getDomainSpecificDiff_EOperation().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER:
				getDomainSpecificDiff_EParameter().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				getDomainSpecificDiff_EReference().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE:
				getDomainSpecificDiff_EStructuralFeature().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT:
				getDomainSpecificDiff_ETypedElement().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE:
				getDomainSpecificDiff_EGenericType().clear();
				return;
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER:
				getDomainSpecificDiff_ETypeParameter().clear();
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
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EATTRIBUTE:
				return domainSpecificDiff_EAttribute != null && !domainSpecificDiff_EAttribute.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EANNOTATION:
				return domainSpecificDiff_EAnnotation != null && !domainSpecificDiff_EAnnotation.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASS:
				return domainSpecificDiff_EClass != null && !domainSpecificDiff_EClass.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ECLASSIFIER:
				return domainSpecificDiff_EClassifier != null && !domainSpecificDiff_EClassifier.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EDATA_TYPE:
				return domainSpecificDiff_EDataType != null && !domainSpecificDiff_EDataType.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM:
				return domainSpecificDiff_EEnum != null && !domainSpecificDiff_EEnum.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EENUM_LITERAL:
				return domainSpecificDiff_EEnumLiteral != null && !domainSpecificDiff_EEnumLiteral.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EFACTORY:
				return domainSpecificDiff_EFactory != null && !domainSpecificDiff_EFactory.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EMODEL_ELEMENT:
				return domainSpecificDiff_EModelElement != null && !domainSpecificDiff_EModelElement.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ENAMED_ELEMENT:
				return domainSpecificDiff_ENamedElement != null && !domainSpecificDiff_ENamedElement.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOBJECT:
				return domainSpecificDiff_EObject != null && !domainSpecificDiff_EObject.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EOPERATION:
				return domainSpecificDiff_EOperation != null && !domainSpecificDiff_EOperation.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EPARAMETER:
				return domainSpecificDiff_EParameter != null && !domainSpecificDiff_EParameter.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EREFERENCE:
				return domainSpecificDiff_EReference != null && !domainSpecificDiff_EReference.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ESTRUCTURAL_FEATURE:
				return domainSpecificDiff_EStructuralFeature != null && !domainSpecificDiff_EStructuralFeature.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPED_ELEMENT:
				return domainSpecificDiff_ETypedElement != null && !domainSpecificDiff_ETypedElement.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_EGENERIC_TYPE:
				return domainSpecificDiff_EGenericType != null && !domainSpecificDiff_EGenericType.isEmpty();
			case EcoreDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ETYPE_PARAMETER:
				return domainSpecificDiff_ETypeParameter != null && !domainSpecificDiff_ETypeParameter.isEmpty();
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

} //DomainSpecificDiffImpl
